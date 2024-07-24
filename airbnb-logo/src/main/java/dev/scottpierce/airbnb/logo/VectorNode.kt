package dev.scottpierce.airbnb.logo

internal data class VectorNode(
    /** The first control point for the node */
    val cp1: Point,
    /** The second control point for the node */
    val cp2: Point,
    /** The end point we are drawing to for the node */
    val p: Point,
    /**
     * If true this is a point that will be drawn on again.
     */
    val isIntersection: Boolean = false,
)

interface Point {
    val x: Float
    val y: Float
}

fun Point(x: Float, y: Float) : Point = SinglePoint(x = x, y = y)

data class SinglePoint(
    override val x: Float,
    override val y: Float
) : Point

/** A point that takes 2 separate points and outputs their average */
data class PairPoint(
    val x1: Float,
    val y1: Float,
    val x2: Float,
    val y2: Float,
) : Point {
    override val x: Float = (x1 + x2) / 2f
    override val y: Float = (y1 + y2) / 2f
}
