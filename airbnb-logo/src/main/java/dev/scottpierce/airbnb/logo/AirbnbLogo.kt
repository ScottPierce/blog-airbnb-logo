package dev.scottpierce.airbnb.logo

import androidx.compose.animation.core.EaseOut
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
import androidx.compose.ui.geometry.isSpecified
import androidx.compose.ui.geometry.isUnspecified
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.graphicsLayer
import dev.scottpierce.airbnb.logo.util.LineUtil.calculateDistance
import dev.scottpierce.airbnb.logo.util.LineUtil.extendLine
import kotlinx.coroutines.delay
import kotlin.math.min

private const val LOGO_VECTOR_WIDTH: Float = 1991.3f
private const val LOGO_VECTOR_HEIGHT: Float = 2150f
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
            color = Color(0xFF6FC8EE),
            delayMillis = 500,
        )
        AirbnbLogo(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFF4D45A),
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
        animationSpec = tween(1200, easing = EaseOut, delayMillis = delayMillis),
        label = "Draw Percent",
    )

    LaunchedEffect(Unit) {
        delay(300)
        // Trigger the animation to 1f
        targetDrawPercent = 1f
    }

    Canvas(
        modifier = modifier
            .fillMaxSize()
            .aspectRatio(LOGO_VECTOR_WIDTH / LOGO_VECTOR_HEIGHT)
            .graphicsLayer {
                compositingStrategy = CompositingStrategy.Offscreen
            }
    ) {
        drawAirbnbLogo(color, drawPercent)
    }
}

private fun DrawScope.drawAirbnbLogo(color: Color, drawPercent: Float) {
    val xScale = size.width / LOGO_VECTOR_WIDTH
    val yScale = size.height / LOGO_VECTOR_HEIGHT

    val scaledStrokeWidth = min(xScale, yScale) * STROKE_WIDTH

    drawIntoCanvas { canvas ->
        drawVectorNodes(
            canvas = canvas,
            xScale = xScale,
            yScale = yScale,
            side = DrawSide.LEFT,
            distanceToDraw = drawPercent * DrawSide.LEFT.distance,
            color = color,
            strokeWidth = scaledStrokeWidth
        )

        drawVectorNodes(
            canvas = canvas,
            xScale = xScale,
            yScale = yScale,
            side = DrawSide.RIGHT,
            distanceToDraw = drawPercent * DrawSide.RIGHT.distance,
            color = color,
            strokeWidth = scaledStrokeWidth,
        )
    }
}

private const val FADE_DISTANCE = 100f

private fun drawVectorNodes(
    canvas: Canvas,
    xScale: Float,
    yScale: Float,
    side: DrawSide,
    distanceToDraw: Float,
    color: Color,
    strokeWidth: Float,
) {
    val path = Path()

    // The last node we were drawing
    var lastNode: VectorNode = side.nodes.first()
    // The last position that we've drawn to. Tracks points that are in-between nodes.
    var lastDrawnPosition: Offset = Offset.Unspecified
    // The total distance we've drawn.
    var distanceDrawn = 0f
    // We fade the end of the stroke. Find that point and set it here.
    var fadeStartPosition: Offset = Offset.Unspecified
    // Tracks whether the intersection has been drawn yet or not
    var isIntersectionDrawn = false

    // Start at the location right before the first command
    path.moveTo(lastNode.p.x * xScale, lastNode.p.y * yScale)

    // Reset the paint
    val paint = Paint().apply {
        isAntiAlias = true
        style = PaintingStyle.Stroke
        this.strokeWidth = strokeWidth
        this.color = color
    }

    for (i in 1 ..< side.nodes.size) {
        val node: VectorNode = side.nodes[i]

        val nodeDistance = calculateDistance(lastNode, node)
        // Percent of line to the node to draw
        val nodeDrawPercent: Float = if (nodeDistance < (distanceToDraw - distanceDrawn)) {
            1f
        } else {
            if (distanceDrawn >= distanceToDraw) {
                // This can happen when the drawPercent is 0
                break
            }
            ((distanceToDraw - distanceDrawn) / nodeDistance).coerceAtMost(1f)
        }

        // The percent of this node that the fade gradient starts in the path. Should be null
        // except at the very end of the Path.
        var fadeDrawPercent: Float? = null
        val distanceLeftToDraw = side.distance - distanceDrawn - (nodeDistance * nodeDrawPercent)
        val fadeDistance = FADE_DISTANCE.coerceAtMost(distanceLeftToDraw)
        if (nodeDistance >= (distanceToDraw - fadeDistance - distanceDrawn)) {
            fadeDrawPercent = ((distanceToDraw - fadeDistance - distanceDrawn) / nodeDistance)
        }

        // Different control points are needed if you are drawing left or right.
        // The 2 control points in-between the two points being drawn are what is needed.
        val c1: Point = if (side == DrawSide.LEFT) lastNode.cp1 else lastNode.cp2
        val c2: Point = if (side == DrawSide.LEFT) node.cp2 else node.cp1
        val end: Point = node.p

        lastDrawnPosition = if (nodeDrawPercent == 1f) {
            val endX = end.x * xScale
            val endY = end.y * yScale
            path.cubicTo(
                c1.x * xScale, c1.y * yScale,
                c2.x * xScale, c2.y * yScale,
                endX, endY,
            )
            Offset(endX, endY)
        } else {
            path.partialCubicBezier(
                Offset(lastNode.p.x * xScale, lastNode.p.y * yScale),
                Offset(c1.x * xScale, c1.y * yScale),
                Offset(c2.x * xScale, c2.y * yScale),
                Offset(end.x * xScale, end.y * yScale),
                nodeDrawPercent,
            )
        }

        if (fadeDrawPercent != null && fadeStartPosition.isUnspecified) {
            // Calculate the fade start position, since we're drawing the impacted node currently.
            fadeStartPosition = path.partialCubicBezier(
                Offset(lastNode.p.x * xScale, lastNode.p.y * yScale),
                Offset(c1.x * xScale, c1.y * yScale),
                Offset(c2.x * xScale, c2.y * yScale),
                Offset(end.x * xScale, end.y * yScale),
                fadeDrawPercent,
                draw = false
            )
        }

        if (lastNode != node) {
            if (lastNode.isIntersection) {
                isIntersectionDrawn = true
            }
        }

        lastNode = node
        distanceDrawn += nodeDistance
        if (distanceDrawn >= side.distance) {
            break
        }
    }

    canvas.drawPath(path = path, paint)

    //println("Draw Distance for ${side.name} was $distanceDrawn")

    // Draw the fade at the end of the stroke
    if (
        fadeStartPosition.isSpecified &&
        lastDrawnPosition.isSpecified &&
        // Don't draw the fade if there is no fade to draw
        fadeStartPosition.x != lastDrawnPosition.x &&
        fadeStartPosition.y != lastDrawnPosition.y
    ) {
        // Extend the line a little bit since in curves, the edges of the line can extend beyond the
        // end point.
        val extendedFadeEndPosition = extendLine(
            a = fadeStartPosition,
            b = lastDrawnPosition,
            extensionFactor = 0.1f
        )

        path.rewind()
        path.moveTo(extendedFadeEndPosition.x, extendedFadeEndPosition.y)
        path.lineTo(fadeStartPosition.x, fadeStartPosition.y)

        if (isIntersectionDrawn) {
            // If the intersection has been drawn, we now clip this region to fix visual artifacting
            // with the blend mode on the gradient fade.
            // If this were a library, there are more elegant solutions, but this is fast and easy.
            canvas.clipPath(
                Path().apply {
                    moveTo(995.6f * xScale, (1634.7f - 20) * yScale)
                    lineTo((905.5f - 20) * xScale, 1746.3f * yScale)
                    lineTo(993.4f * xScale, (1842.7f + 20) * yScale)
                    lineTo((1085.7f + 20) * xScale, 1744.2f * yScale)
                    close()
                },
                ClipOp.Difference,
            )
        }

        // Now that we've drawn the line, lets fade the tip a little so the edge isn't so hard
        paint.strokeWidth *= 1.1f
        paint.blendMode = BlendMode.DstIn
        paint.shader = LinearGradientShader(
            colors = listOf(Color.Transparent, color),
            from = Offset(lastDrawnPosition.x, lastDrawnPosition.y),
            to = Offset(fadeStartPosition.x, fadeStartPosition.y),
            tileMode = TileMode.Clamp
        )
        canvas.drawPath(
            path = path,
            paint = paint,
        )
    }
}

/**
 * Draws a partial curve to by calculating percent into a curve with De Casteljau's algorithm.

 * @param start the start position of the curve
 * @param c1 the first control point
 * @param c2 the second control point
 * @param end the end position of the curve
 * @param drawPercent what percent of the curve to draw till in this calculation
 * @return the end position of the calculated curve
 */
@Suppress("LocalVariableName")
private fun Path.partialCubicBezier(
    start: Offset,
    c1: Offset,
    c2: Offset,
    end: Offset,
    drawPercent: Float,
    draw: Boolean = true,
): Offset {
    // Calculate intermediate points using De Casteljau's algorithm
    val partialControl1 = linearInterpolation(start, c1, drawPercent)
    val p1_1 = linearInterpolation(c1, c2, drawPercent)
    val p2_1 = linearInterpolation(c2, end, drawPercent)

    val partialControl2 = linearInterpolation(partialControl1, p1_1, drawPercent)
    val p1_2 = linearInterpolation(p1_1, p2_1, drawPercent)

    val partialEnd = linearInterpolation(partialControl2, p1_2, drawPercent)

    if (draw) {
        // Draw the cubic Bézier curve segment
        cubicTo(
            partialControl1.x, partialControl1.y,
            partialControl2.x, partialControl2.y,
            partialEnd.x, partialEnd.y,
        )
    }

    return Offset(partialEnd.x, partialEnd.y)
}

private fun linearInterpolation(a: Offset, b: Offset, t: Float): Offset {
    return Offset(
        x = (1 - t) * a.x + t * b.x,
        y = (1 - t) * a.y + t * b.y
    )
}
