package dev.scottpierce.airbnb.logo

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

private const val LOGO_VECTOR_WIDTH: Float = 1991.3f
private const val LOGO_VECTOR_HEIGHT: Float = 2143.2f
private const val STROKE_WIDTH: Float = 140f

object AirbnbLogo {
    val COLOR_RAUSCH = Color(0xFFFF5A5F)
    val COLOR_BABU = Color(0xFF00A699)
    val COLOR_ARCHES = Color(0xFFFC642D)
    val COLOR_HOF = Color(0xFF484848)
    val COLOR_FOGGY = Color(0xFF767676)
}

@Composable
fun MultiColorAirbnbLogo(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
    ) {
        AirbnbLogo(
            modifier = Modifier.fillMaxSize(),
        )
        AirbnbLogo(
            modifier = Modifier.fillMaxSize(),
            color = AirbnbLogo.COLOR_BABU,
            delayMillis = 500,
        )
        AirbnbLogo(
            modifier = Modifier.fillMaxSize(),
            color = AirbnbLogo.COLOR_FOGGY,
            delayMillis = 800,
        )
        AirbnbLogo(
            modifier = Modifier.fillMaxSize(),
            delayMillis = 1200,
        )
    }
}

@Composable
fun AirbnbLogo(
    modifier: Modifier = Modifier,
    color: Color = AirbnbLogo.COLOR_RAUSCH,
    delayMillis: Int = 0,
) {
    var targetDrawPercent: Float by remember { mutableFloatStateOf(0f) }

    val drawPercent: Float by animateFloatAsState(
        targetValue = targetDrawPercent,
        animationSpec = tween(1500, easing = LinearEasing, delayMillis = delayMillis),
        label = "Draw Percent",
    )

    LaunchedEffect(Unit) {
        // Trigger the animation to 1f
        targetDrawPercent = 1f
    }

    Canvas(
        modifier = modifier
            .fillMaxSize()
            .aspectRatio(LOGO_VECTOR_WIDTH / LOGO_VECTOR_HEIGHT)
    ) {
        drawSvg(color, drawPercent)
    }
}

fun DrawScope.drawSvg(color: Color, drawPercent: Float) {
    val xScale = size.width / LOGO_VECTOR_WIDTH
    val yScale = size.height / LOGO_VECTOR_HEIGHT

    val scaledStrokeWidth = min(xScale, yScale) * STROKE_WIDTH
    val pathStyle = Stroke(width = scaledStrokeWidth)

    val path = svgCommandsToPath(
        xScale = xScale,
        yScale = yScale,
        side = DrawSide.LEFT,
        distanceToDraw = drawPercent * DrawSide.LEFT.distance
    )
    drawPath(path = path, color = color, style = pathStyle)

    path.rewind()

    svgCommandsToPath(
        xScale = xScale,
        yScale = yScale,
        side = DrawSide.RIGHT,
        distanceToDraw = drawPercent * DrawSide.RIGHT.distance,
        path = path,
    )
    drawPath(path = path, color = color, style = pathStyle)
}

private fun svgCommandsToPath(
    xScale: Float,
    yScale: Float,
    side: DrawSide,
    distanceToDraw: Float,
    path: Path = Path()
): Path {
    var lastNode: VectorNode = side.nodes.first()
    var distanceDrawn = 0f

    // Start at the location right before the first command
    path.moveTo(lastNode.p.x * xScale, lastNode.p.y * yScale)

    for (i in 1 ..< side.nodes.size) {
        val node: VectorNode = side.nodes[i]

        val commandDistance = calculateDistance(lastNode, node)
        val commandDrawPercent: Float = if (commandDistance < (distanceToDraw - distanceDrawn)) {
            1f
        } else {
            if (distanceDrawn >= distanceToDraw) {
                // This can happen when the drawPercent is 0
                break
            }
            ((distanceToDraw - distanceDrawn) / commandDistance).coerceAtMost(1f)
        }

        // Reversed when drawing the right side
        val c1: Point = if (side == DrawSide.LEFT) lastNode.p1 else lastNode.p2
        val c2: Point = if (side == DrawSide.LEFT) node.p2 else node.p1
        val end: Point = node.p

        if (commandDrawPercent == 1f) {
            path.cubicTo(
                c1.x * xScale, c1.y * yScale,
                c2.x * xScale, c2.y * yScale,
                end.x * xScale, end.y * yScale,
            )
        } else {
            path.partialCubicBezier(
                Offset(lastNode.p.x * xScale, lastNode.p.y * yScale),
                Offset(c1.x * xScale, c1.y * yScale),
                Offset(c2.x * xScale, c2.y * yScale),
                Offset(end.x * xScale, end.y * yScale),
                commandDrawPercent,
            )
        }

        lastNode = node

        distanceDrawn += commandDistance
        if (distanceDrawn >= side.distance) {
            break
        }
    }

    println("Distance Drawn $distanceDrawn")

    return path
}

private fun calculateDistance(node1: VectorNode, node2: VectorNode): Float {
    // We could calculate the distance of a cubic Bezier curve, and a quadratic Bezier curve, a
    // simple magnitude calculation on the start and end points should be sufficient.
    return sqrt((node2.p.x - node1.p.x).pow(2) + (node2.p.y - node1.p.y).pow(2))
}

@Suppress("LocalVariableName")
private fun Path.partialCubicBezier(
    start: Offset,
    c1: Offset,
    c2: Offset,
    end: Offset,
    drawPercent: Float
) {
    // Calculate intermediate points using De Casteljau's algorithm
    val partialControl1 = linearInterpolation(start, c1, drawPercent)
    val p1_1 = linearInterpolation(c1, c2, drawPercent)
    val p2_1 = linearInterpolation(c2, end, drawPercent)

    val partialControl2 = linearInterpolation(partialControl1, p1_1, drawPercent)
    val p1_2 = linearInterpolation(p1_1, p2_1, drawPercent)

    val partialEnd = linearInterpolation(partialControl2, p1_2, drawPercent)

    // Draw the cubic Bézier curve segment
    cubicTo(
        partialControl1.x, partialControl1.y,
        partialControl2.x, partialControl2.y,
        partialEnd.x, partialEnd.y,
    )
}

private fun linearInterpolation(a: Offset, b: Offset, t: Float): Offset {
    return Offset(
        x = (1 - t) * a.x + t * b.x,
        y = (1 - t) * a.y + t * b.y
    )
}
