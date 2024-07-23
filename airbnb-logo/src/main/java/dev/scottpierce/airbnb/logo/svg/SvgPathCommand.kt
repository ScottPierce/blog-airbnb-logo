package dev.scottpierce.airbnb.logo.svg

import dev.scottpierce.airbnb.logo.Point

/**
 * Represents a command in an SVG path.
 */
sealed interface SvgPathCommand {
    /**
     * The end point of each SVG command
     */
    val p: Point

    /**
     * Represents a "Line To" command in an SVG path.
     * Draws a line from the current point to the given point.
     *
     * @property p The target point.
     */
    data class LineTo(override val p: Point) : SvgPathCommand

    /**
     * Represents a "Curve To" command in an SVG path.
     * Draws a cubic Bézier curve from the current point to the given point using two control points.
     *
     * @property p1 The first control point.
     * @property p2 The second control point.
     * @property p The target point.
     */
    data class CurveTo(
        val p1: Point,
        val p2: Point,
        override val p: Point,
    ) : SvgPathCommand

    /**
     * Represents a "Smooth Curve To" command in an SVG path.
     * Draws a cubic Bézier curve from the current point to the given point using one control point.
     *
     * @property p2 The control point.
     * @property p The target point.
     */
    data class SmoothCurveTo(val p2: Point, override val p: Point) : SvgPathCommand
}
