package dev.scottpierce.airbnb.logo

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import dev.scottpierce.airbnb.logo.svg.svgCommandsToPath
import kotlin.math.min

private const val LOGO_VECTOR_WIDTH = 1991.3f
private const val LOGO_VECTOR_HEIGHT = 2143.2f
private const val LOGO_TOTAL_DISTANCE = 10837.511f // Calculated by the distance algorithm
private const val STROKE_WIDTH = 140f

@Composable
fun AirbnbLogo(
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
        modifier = modifier
            .fillMaxSize()
            .aspectRatio(LOGO_VECTOR_WIDTH / LOGO_VECTOR_HEIGHT)
    ) {
        drawSvg(Color(0xFFE0565B), drawPercent)
    }
}

fun DrawScope.drawSvg(color: Color, drawPercent: Float) {
    val xScale = size.width / LOGO_VECTOR_WIDTH
    val yScale = size.height / LOGO_VECTOR_HEIGHT

    val scaledStrokeWidth = min(xScale, yScale) * STROKE_WIDTH

    val path = svgCommandsToPath(
        xScale = xScale,
        yScale = yScale,
        nodes = AIRBNB_LOGO_NODES,
        distanceToDraw = drawPercent * LOGO_TOTAL_DISTANCE,
        drawPercent = drawPercent,
    )
    drawPath(path, color, style = Stroke(width = scaledStrokeWidth))
}

private val AIRBNB_LOGO_NODES: List<VectorNode> = listOf(
    VectorNode(
        p2 = PairPoint(x1 = 1386f, y1 = 1984.4f, x2 = 1330.2f, y2 = 2106.6f),
        p = PairPoint(x1 = 1330.3f, y1 = 1952.3f, x2 = 1259.4f, y2 = 2065.8f),
        p1 = PairPoint(x1 = 1253.1f, y1 = 1909.3f, x2 = 1173.6f, y2 = 2016.5f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1175.8f, y1 = 1842.9f, x2 = 1087.8f, y2 = 1945.7f),
        p = PairPoint(x1 = 1085.7f, y1 = 1744.2f, x2 = 993.4f, y2 = 1842.7f),
        p1 = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 905.5f, y2 = 1746.3f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 905.5f, y2 = 1746.3f),
        p = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 905.5f, y2 = 1746.3f),
        p1 = PairPoint(x1 = 879.8f, y1 = 1488.8f, x2 = 766f, y2 = 1572.6f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 804.7f, y1 = 1351.5f, x2 = 678.1f, y2 = 1411.7f),
        p = PairPoint(x1 = 778.9f, y1 = 1235.7f, x2 = 645.9f, y2 = 1270.1f),
        p1 = PairPoint(x1 = 768.2f, y1 = 1186.3f, x2 = 628.8f, y2 = 1205.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 766f, y1 = 1143.4f, x2 = 626.6f, y2 = 1143.5f),
        p = PairPoint(x1 = 772.5f, y1 = 1104.8f, x2 = 635.2f, y2 = 1087.7f),
        p1 = PairPoint(x1 = 776.8f, y1 = 1070.5f, x2 = 643.8f, y2 = 1034.1f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 789.7f, y1 = 1040.4f, x2 = 663.1f, y2 = 984.7f),
        p = PairPoint(x1 = 806.8f, y1 = 1014.7f, x2 = 693.1f, y2 = 941.8f),
        p1 = PairPoint(x1 = 847.6f, y1 = 956.8f, x2 = 759.6f, y2 = 847.4f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 916.2f, y1 = 920.3f, x2 = 871.2f, y2 = 789.5f),
        p = PairPoint(x1 = 995.6f, y1 = 920.3f, x2 = 995.6f, y2 = 789.5f),
        p1 = PairPoint(x1 = 1075f, y1 = 920.3f, x2 = 1120f, y2 = 789.5f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1145.8f, y1 = 954.7f, x2 = 1231.6f, y2 = 845.3f),
        p = PairPoint(x1 = 1184.4f, y1 = 1014.7f, x2 = 1298.1f, y2 = 941.8f),
        p1 = PairPoint(x1 = 1201.6f, y1 = 1040.5f, x2 = 1328.1f, y2 = 984.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1214.4f, y1 = 1070.5f, x2 = 1347.4f, y2 = 1034.1f),
        p = PairPoint(x1 = 1218.7f, y1 = 1104.8f, x2 = 1356f, y2 = 1087.7f),
        p1 = PairPoint(x1 = 1225.1f, y1 = 1143.4f, x2 = 1362.5f, y2 = 1143.5f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1223f, y1 = 1188.5f, x2 = 1360.3f, y2 = 1203.6f),
        p = PairPoint(x1 = 1212.3f, y1 = 1235.7f, x2 = 1345.3f, y2 = 1270.1f),
        p1 = PairPoint(x1 = 1186.6f, y1 = 1349.4f, x2 = 1313.1f, y2 = 1411.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1111.5f, y1 = 1486.7f, x2 = 1227.3f, y2 = 1570.4f),
        p = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 1085.7f, y2 = 1744.2f),
        p1 = PairPoint(x1 = 905.5f, y1 = 1746.3f, x2 = 993.4f, y2 = 1842.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 905.5f, y1 = 1746.3f, x2 = 993.4f, y2 = 1842.7f),
        p = PairPoint(x1 = 905.5f, y1 = 1746.3f, x2 = 993.4f, y2 = 1842.7f),
        p1 = PairPoint(x1 = 817.5f, y1 = 1845f, x2 = 899f, y2 = 1945.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 738.2f, y1 = 1911.5f, x2 = 815.4f, y2 = 2016.5f),
        p = PairPoint(x1 = 660.9f, y1 = 1954.4f, x2 = 727.4f, y2 = 2065.8f),
        p1 = PairPoint(x1 = 605.1f, y1 = 1986.6f, x2 = 656.6f, y2 = 2106.6f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 551.5f, y1 = 2003.8f, x2 = 583.7f, y2 = 2130.1f),
        p = PairPoint(x1 = 497.9f, y1 = 2010.2f, x2 = 512.9f, y2 = 2138.7f),
        p1 = PairPoint(x1 = 442.6f, y1 = 2016.4f, x2 = 432.06f, y2 = 2149.04f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 386.7f, y1 = 2009f, x2 = 356.15f, y2 = 2139.51f),
        p = PairPoint(x1 = 334.9f, y1 = 1988.8f, x2 = 283.3f, y2 = 2108.7f),
        p1 = PairPoint(x1 = 229.8f, y1 = 1945.9f, x2 = 135.3f, y2 = 2048.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 154.7f, y1 = 1849.3f, x2 = 28f, y2 = 1913.5f),
        p = PairPoint(x1 = 139.7f, y1 = 1737.8f, x2 = 4.4f, y2 = 1752.6f),
        p1 = PairPoint(x1 = 133.3f, y1 = 1684.2f, x2 = -6.3f, y2 = 1675.4f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 137.6f, y1 = 1630.6f, x2 = 2.3f, y2 = 1600.3f),
        p = PairPoint(x1 = 159f, y1 = 1570.5f, x2 = 30.2f, y2 = 1520.9f),
        p1 = PairPoint(x1 = 165.4f, y1 = 1549f, x2 = 40.2f, y2 = 1494.9f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 176.2f, y1 = 1527.6f, x2 = 50.9f, y2 = 1469.1f),
        p = PairPoint(x1 = 186.9f, y1 = 1501.9f, x2 = 62.4f, y2 = 1443.7f),
        p1 = PairPoint(x1 = 201.9f, y1 = 1467.6f, x2 = 79.6f, y2 = 1405.1f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 219.1f, y1 = 1431.1f, x2 = 96.8f, y2 = 1368.6f),
        p = PairPoint(x1 = 236.2f, y1 = 1394.6f, x2 = 111.8f, y2 = 1334.3f),
        p1 = PairPoint(x1 = 238.4f, y1 = 1390.3f, x2 = 113.9f, y2 = 1330f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 238.4f, y1 = 1390.3f, x2 = 113.9f, y2 = 1330f),
        p = PairPoint(x1 = 238.4f, y1 = 1390.3f, x2 = 113.9f, y2 = 1330f),
        p1 = PairPoint(x1 = 386.4f, y1 = 1070.6f, x2 = 261.9f, y2 = 1008.2f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 545.2f, y1 = 744.5f, x2 = 422.8f, y2 = 682.1f),
        p = PairPoint(x1 = 710.4f, y1 = 427f, x2 = 588f, y2 = 360.3f),
        p1 = PairPoint(x1 = 716.8f, y1 = 414.1f, x2 = 594.4f, y2 = 347.5f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 716.8f, y1 = 414.1f, x2 = 594.4f, y2 = 347.5f),
        p = PairPoint(x1 = 716.8f, y1 = 414.1f, x2 = 594.4f, y2 = 347.5f),
        p1 = PairPoint(x1 = 734f, y1 = 382f, x2 = 611.6f, y2 = 315.3f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 751.1f, y1 = 347.6f, x2 = 628.7f, y2 = 281f),
        p = PairPoint(x1 = 768.3f, y1 = 315.4f, x2 = 645.9f, y2 = 246.7f),
        p1 = PairPoint(x1 = 785.5f, y1 = 281.1f, x2 = 667.3f, y2 = 208.1f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 804.8f, y1 = 248.9f, x2 = 690.9f, y2 = 167.3f),
        p = PairPoint(x1 = 828.4f, y1 = 221f, x2 = 723.1f, y2 = 128.7f),
        p1 = PairPoint(x1 = 873.5f, y1 = 169.5f, x2 = 794f, y2 = 47.2f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 933.5f, y1 = 141.6f, x2 = 890.5f, y2 = 0f),
        p = PairPoint(x1 = 1000f, y1 = 141.6f, x2 = 997.8f, y2 = 0f),
        p1 = PairPoint(x1 = 1066.5f, y1 = 141.6f, x2 = 1102.9f, y2 = 0f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1126.6f, y1 = 169.5f, x2 = 1201.6f, y2 = 47.2f),
        p = PairPoint(x1 = 1171.6f, y1 = 221f, x2 = 1270.3f, y2 = 133.1f),
        p1 = PairPoint(x1 = 1195.2f, y1 = 248.9f, x2 = 1304.6f, y2 = 171.7f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1214.5f, y1 = 281.1f, x2 = 1326f, y2 = 212.5f),
        p = PairPoint(x1 = 1231.7f, y1 = 315.4f, x2 = 1347.5f, y2 = 251.1f),
        p1 = PairPoint(x1 = 1248.9f, y1 = 347.6f, x2 = 1364.7f, y2 = 285.4f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1266f, y1 = 381.9f, x2 = 1381.8f, y2 = 319.7f),
        p = PairPoint(x1 = 1283.2f, y1 = 414f, x2 = 1399f, y2 = 351.9f),
        p1 = PairPoint(x1 = 1289.7f, y1 = 426.9f, x2 = 1405.4f, y2 = 364.8f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1289.7f, y1 = 426.9f, x2 = 1405.4f, y2 = 364.8f),
        p = PairPoint(x1 = 1289.7f, y1 = 426.9f, x2 = 1405.4f, y2 = 364.8f),
        p1 = PairPoint(x1 = 1452.7f, y1 = 746.5f, x2 = 1572.7f, y2 = 686.6f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1611.5f, y1 = 1072.6f, x2 = 1731.5f, y2 = 1012.7f),
        p = PairPoint(x1 = 1759.5f, y1 = 1394.4f, x2 = 1881.6f, y2 = 1336.6f),
        p1 = PairPoint(x1 = 1776.7f, y1 = 1428.7f, x2 = 1896.7f, y2 = 1370.9f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1791.7f, y1 = 1467.4f, x2 = 1913.8f, y2 = 1407.4f),
        p = PairPoint(x1 = 1808.8f, y1 = 1501.7f, x2 = 1931f, y2 = 1446f),
        p1 = PairPoint(x1 = 1819.5f, y1 = 1527.5f, x2 = 1941.7f, y2 = 1469.6f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1830.3f, y1 = 1548.9f, x2 = 1952.5f, y2 = 1497.5f),
        p = PairPoint(x1 = 1836.7f, y1 = 1570.3f, x2 = 1963.2f, y2 = 1523.2f),
        p1 = PairPoint(x1 = 1853.8f, y1 = 1626.2f, x2 = 1991f, y2 = 1602.6f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1860.2f, y1 = 1679.8f, x2 = 2001.6f, y2 = 1677.6f),
        p = PairPoint(x1 = 1851.6f, y1 = 1735.6f, x2 = 1984.4f, y2 = 1752.6f),
        p1 = PairPoint(x1 = 1836.6f, y1 = 1847.2f, x2 = 1960.8f, y2 = 1911.3f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1761.5f, y1 = 1943.7f, x2 = 1853.7f, y2 = 2048.6f),
        p = PairPoint(x1 = 1656.4f, y1 = 1986.6f, x2 = 1703.5f, y2 = 2108.7f),
        p1 = PairPoint(x1 = 1614.9f, y1 = 2008f, x2 = 1618.31f, y2 = 2146.14f),
    ),
    VectorNode(
        p2 = PairPoint(x1 = 1549.1f, y1 = 2014.5f, x2 = 1533.51f, y2 = 2146.33f),
        p = PairPoint(x1 = 1493.3f, y1 = 2008f, x2 = 1473.9f, y2 = 2138.7f),
        p1 = PairPoint(x1 = 1439.7f, y1 = 2001.6f, x2 = 1403.1f, y2 = 2130.1f),
    )
)
