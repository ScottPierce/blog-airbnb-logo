package dev.scottpierce.airbnb.logo

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

