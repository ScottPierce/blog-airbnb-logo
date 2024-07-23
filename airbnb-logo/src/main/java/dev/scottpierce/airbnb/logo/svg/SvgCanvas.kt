package dev.scottpierce.airbnb.logo.svg

import dev.scottpierce.airbnb.logo.Point
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import dev.scottpierce.airbnb.logo.VectorNode
import dev.scottpierce.airbnb.logo.VectorNodeImage
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

internal fun svgCommandsToPath(
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

    for (i in 1 ..< (nodes.size + 1)) {
        val node: VectorNode = if (i == nodes.size) {
            // Finish the logo by ending with the first node
            nodes[0]
        } else {
            nodes[i]
        }

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
            path.partialCubicBezier(
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