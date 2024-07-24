package dev.scottpierce.airbnb.logo.util

import androidx.compose.ui.geometry.Offset
import dev.scottpierce.airbnb.logo.VectorNode
import kotlin.math.pow
import kotlin.math.sqrt

internal object LineUtil {
    /**
     * Calculates the distance between two nodes.
     */
    fun calculateDistance(node1: VectorNode, node2: VectorNode): Float {
        // We could calculate the distance of a cubic Bezier curve, and a quadratic Bezier curve, a
        // simple magnitude calculation on the start and end points should be sufficient.
        return sqrt((node2.p.x - node1.p.x).pow(2) + (node2.p.y - node1.p.y).pow(2))
    }

    /**
     * Takes 2 points, a and b, and then extends the line in the direction of b by a % of the line,
     * then returns the new point b.
     *
     * @param a the start position for the line
     * @param b the end position for the line
     * @return the new point b for the extended line
     */
    fun extendLine(a: Offset, b: Offset, extensionFactor: Float): Offset {
        // Calculate the direction vector
        val directionX = b.x - a.x
        val directionY = b.y - a.y

        // Calculate the length of the original line
        val length = sqrt(directionX * directionX + directionY * directionY)

        // Normalize the direction vector
        val unitX = directionX / length
        val unitY = directionY / length

        // Scale the direction vector by the extension factor
        val scaledX = unitX * length * extensionFactor
        val scaledY = unitY * length * extensionFactor

        // Calculate the new end point
        val newEndPoint = Offset(b.x + scaledX, b.y + scaledY)

        return newEndPoint
    }
}
