package dev.scottpierce.airbnb.logo

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class VectorNodeImage(
    val width: Float,
    val height: Float,
    val strokeWidth: Float,
    val strokeColor: Color,
    val nodes: List<VectorNode>,
    val totalDistance: Float,
)