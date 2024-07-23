package dev.scottpierce.airbnb.logo.svg

import dev.scottpierce.airbnb.logo.Point
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import dev.scottpierce.airbnb.logo.VectorNode
import dev.scottpierce.airbnb.logo.VectorNodeImage
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

@Composable
fun SvgCanvas(
    svg: VectorNodeImage,
    modifier: Modifier = Modifier,
) {
    var targetDrawPercent: Float by remember { mutableFloatStateOf(0f) }

    val drawPercent: Float by animateFloatAsState(
        targetValue = targetDrawPercent,
        animationSpec = tween(2000),
        label = "Draw Percent",
    )

    LaunchedEffect(Unit) {
        targetDrawPercent = 1f
    }

    Canvas(
        modifier = modifier.aspectRatio(svg.width / svg.height)
    ) {
        drawSvg(svg, drawPercent)
    }
}

private fun DrawScope.drawSvg(svg: VectorNodeImage, drawPercent: Float) {
    val xScale = size.width / svg.width
    val yScale = size.height / svg.height

    val scaledStrokeWidth = min(xScale, yScale) * svg.strokeWidth

    val path = svgCommandsToPath(
        xScale = xScale,
        yScale = yScale,
        nodes = svg.nodes,
        distanceToDraw = drawPercent * svg.totalDistance,
        drawPercent = drawPercent,
    )
    drawPath(path, svg.strokeColor, style = Stroke(width = scaledStrokeWidth))
}

private fun svgCommandsToPath(
    xScale: Float,
    yScale: Float,
    nodes: List<VectorNode>,
    distanceToDraw: Float,
    drawPercent: Float,
): Path {
    val path = Path()
    var lastNode: VectorNode = nodes.first()
    var distanceDrawn = 0f

    // Start at the location right before the first command
    path.moveTo(lastNode.p.x * xScale, lastNode.p.y * yScale)

    for (i in 1 ..< nodes.size) {
        val node = nodes[i]

//        val commandDistance = calculateDistance(lastNode, node)
        val commandDistance = 0f
        val commandDrawPercent: Float = if (commandDistance < (distanceToDraw - distanceDrawn)) {
            1f
        } else {
//            if (distanceDrawn >= distanceToDraw) {
//                // This can happen when the drawPercent is 0
//                break
//            }
//            ((distanceToDraw - distanceDrawn) / commandDistance).coerceAtMost(1f)
            1f
        }

        val c1: Point = lastNode.p1
        val c2: Point = node.p2
        val end: Point = node.p

        if (commandDrawPercent == 1f) {
            path.cubicTo(
                c1.x * xScale, c1.y * yScale,
                c2.x * xScale, c2.y * yScale,
                end.x * xScale, end.y * yScale,
            )
        } else {
            path.cubicBezierSegment(
                Offset(lastNode.p.x * xScale, lastNode.p.y * yScale),
                Offset(c1.x * xScale, c2.y * yScale),
                Offset(c2.x * xScale, c2.y * yScale),
                Offset(end.x * xScale, end.y * yScale),
                commandDrawPercent,
            )
        }

        lastNode = node

        distanceDrawn += commandDistance
        if (distanceDrawn >= distanceToDraw) {
            break
        }
    }

    if (drawPercent >= 1f) {
        // Close the loop to make sure we don't end up with any missing pieces
        path.close()
    }

    println("Total path distance: $distanceDrawn")
    return path
}

private fun calculateDistance(node1: VectorNode, node2: VectorNode): Float {
    // We could calculate the distance of a cubic Bezier curve, and a quadratic Bezier curve, a
    // simple magnitude calculation on the start and end points should be sufficient.
    return sqrt((node2.p.x - node1.p.x).pow(2) + (node2.p.y - node1.p.x).pow(2))
}

private fun Path.cubicBezierSegment(
    start: Offset,
    c1: Offset,
    c2: Offset,
    end: Offset,
    drawPercent: Float
) {
    // Calculate intermediate points using De Casteljau's algorithm
    val calculatedControl1 = linearInterpolation(start, c1, drawPercent)
    val P1_1 = linearInterpolation(c1, c2, drawPercent)
    val P2_1 = linearInterpolation(c2, end, drawPercent)

    val calculatedControl2 = linearInterpolation(calculatedControl1, P1_1, drawPercent)
    val P1_2 = linearInterpolation(P1_1, P2_1, drawPercent)

    val calculatedEnd = linearInterpolation(calculatedControl2, P1_2, drawPercent)

    // Draw the cubic Bézier curve segment
    cubicTo(
        calculatedControl1.x, calculatedControl1.y,
        calculatedControl2.x, calculatedControl2.y,
        calculatedEnd.x, calculatedEnd.y,
    )
}

private fun linearInterpolation(a: Offset, b: Offset, t: Float): Offset {
    return Offset(
        x = (1 - t) * a.x + t * b.x,
        y = (1 - t) * a.y + t * b.y
    )
}