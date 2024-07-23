package dev.scottpierce.airbnb.logo

import androidx.compose.ui.graphics.Color
import dev.scottpierce.airbnb.logo.svg.SvgPathCommand

object AirbnbLogo {
    val IMAGE = VectorNodeImage(
        width = 2500f,
        height = 780f,
        strokeWidth = 140f,
        strokeColor = Color(0xFFE0565B),
        nodes = AIRBNB_NODES,
        totalDistance = 10837.511f, // Calculated by the distance algorithm
    )
}

private val AIRBNB_NODES: List<VectorNode> = listOf(
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

private val AIRBNB_DRAW_COMMANDS: List<SvgPathCommand> = listOf(
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1836.6f, y1 = 1847.2f, x2 = 1960.8f, y2 = 1911.3f),
        p2 = PairPoint(x1 = 1761.5f, y1 = 1943.7f, x2 = 1853.7f, y2 = 2048.6f),
        p = PairPoint(x1 = 1656.4f, y1 = 1986.6f, x2 = 1703.5f, y2 = 2108.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1614.9f, y1 = 2008f, x2 = 1618.31f, y2 = 2146.14f),
        p2 = PairPoint(x1 = 1549.1f, y1 = 2014.5f, x2 = 1533.51f, y2 = 2146.33f),
        p = PairPoint(x1 = 1493.3f, y1 = 2008f, x2 = 1473.9f, y2 = 2138.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1439.7f, y1 = 2001.6f, x2 = 1403.1f, y2 = 2130.1f),
        p2 = PairPoint(x1 = 1386f, y1 = 1984.4f, x2 = 1330.2f, y2 = 2106.6f),
        p = PairPoint(x1 = 1330.3f, y1 = 1952.3f, x2 = 1259.4f, y2 = 2065.8f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1253.1f, y1 = 1909.3f, x2 = 1173.6f, y2 = 2016.5f),
        p2 = PairPoint(x1 = 1175.8f, y1 = 1842.9f, x2 = 1087.8f, y2 = 1945.7f),
        p = PairPoint(x1 = 1085.7f, y1 = 1744.2f, x2 = 993.4f, y2 = 1842.7f),
    ),
    // Intersection - Rough Draft
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 905.5f, y2 = 1746.3f),
        p2 = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 905.5f, y2 = 1746.3f),
        p = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 905.5f, y2 = 1746.3f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 879.8f, y1 = 1488.8f, x2 = 766f, y2 = 1572.6f),
        p2 = PairPoint(x1 = 804.7f, y1 = 1351.5f, x2 = 678.1f, y2 = 1411.7f),
        p = PairPoint(x1 = 778.9f, y1 = 1235.7f, x2 = 645.9f, y2 = 1270.1f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 768.2f, y1 = 1186.3f, x2 = 628.8f, y2 = 1205.7f),
        p2 = PairPoint(x1 = 766f, y1 = 1143.4f, x2 = 626.6f, y2 = 1143.5f),
        p = PairPoint(x1 = 772.5f, y1 = 1104.8f, x2 = 635.2f, y2 = 1087.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 776.8f, y1 = 1070.5f, x2 = 643.8f, y2 = 1034.1f),
        p2 = PairPoint(x1 = 789.7f, y1 = 1040.4f, x2 = 663.1f, y2 = 984.7f),
        p = PairPoint(x1 = 806.8f, y1 = 1014.7f, x2 = 693.1f, y2 = 941.8f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 847.6f, y1 = 956.8f, x2 = 759.6f, y2 = 847.4f),
        p2 = PairPoint(x1 = 916.2f, y1 = 920.3f, x2 = 871.2f, y2 = 789.5f),
        p = PairPoint(x1 = 995.6f, y1 = 920.3f, x2 = 995.6f, y2 = 789.5f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1075f, y1 = 920.3f, x2 = 1120f, y2 = 789.5f),
        p2 = PairPoint(x1 = 1145.8f, y1 = 954.7f, x2 = 1231.6f, y2 = 845.3f),
        p = PairPoint(x1 = 1184.4f, y1 = 1014.7f, x2 = 1298.1f, y2 = 941.8f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1201.6f, y1 = 1040.5f, x2 = 1328.1f, y2 = 984.7f),
        p2 = PairPoint(x1 = 1214.4f, y1 = 1070.5f, x2 = 1347.4f, y2 = 1034.1f),
        p = PairPoint(x1 = 1218.7f, y1 = 1104.8f, x2 = 1356f, y2 = 1087.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1225.1f, y1 = 1143.4f, x2 = 1362.5f, y2 = 1143.5f),
        p2 = PairPoint(x1 = 1223f, y1 = 1188.5f, x2 = 1360.3f, y2 = 1203.6f),
        p = PairPoint(x1 = 1212.3f, y1 = 1235.7f, x2 = 1345.3f, y2 = 1270.1f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1186.6f, y1 = 1349.4f, x2 = 1313.1f, y2 = 1411.7f),
        p2 = PairPoint(x1 = 1111.5f, y1 = 1486.7f, x2 = 1227.3f, y2 = 1570.4f),
        p = PairPoint(x1 = 995.6f, y1 = 1634.7f, x2 = 1085.7f, y2 = 1744.2f),
    ),
    // Intersection - Rough Draft
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 905.5f, y1 = 1746.3f, x2 = 993.4f, y2 = 1842.7f),
        p2 = PairPoint(x1 = 905.5f, y1 = 1746.3f, x2 = 993.4f, y2 = 1842.7f),
        p = PairPoint(x1 = 905.5f, y1 = 1746.3f, x2 = 993.4f, y2 = 1842.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 817.5f, y1 = 1845f, x2 = 899f, y2 = 1945.7f),
        p2 = PairPoint(x1 = 738.2f, y1 = 1911.5f, x2 = 815.4f, y2 = 2016.5f),
        p = PairPoint(x1 = 660.9f, y1 = 1954.4f, x2 = 727.4f, y2 = 2065.8f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 605.1f, y1 = 1986.6f, x2 = 656.6f, y2 = 2106.6f),
        p2 = PairPoint(x1 = 551.5f, y1 = 2003.8f, x2 = 583.7f, y2 = 2130.1f),
        p = PairPoint(x1 = 497.9f, y1 = 2010.2f, x2 = 512.9f, y2 = 2138.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 442.6f, y1 = 2016.4f, x2 = 432.06f, y2 = 2149.04f),
        p2 = PairPoint(x1 = 386.7f, y1 = 2009f, x2 = 356.15f, y2 = 2139.51f),
        p = PairPoint(x1 = 334.9f, y1 = 1988.8f, x2 = 283.3f, y2 = 2108.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 229.8f, y1 = 1945.9f, x2 = 135.3f, y2 = 2048.7f),
        p2 = PairPoint(x1 = 154.7f, y1 = 1849.3f, x2 = 28f, y2 = 1913.5f),
        p = PairPoint(x1 = 139.7f, y1 = 1737.8f, x2 = 4.4f, y2 = 1752.6f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 133.3f, y1 = 1684.2f, x2 = -6.3f, y2 = 1675.4f),
        p2 = PairPoint(x1 = 137.6f, y1 = 1630.6f, x2 = 2.3f, y2 = 1600.3f),
        p = PairPoint(x1 = 159f, y1 = 1570.5f, x2 = 30.2f, y2 = 1520.9f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 165.4f, y1 = 1549f, x2 = 40.2f, y2 = 1494.9f),
        p2 = PairPoint(x1 = 176.2f, y1 = 1527.6f, x2 = 50.9f, y2 = 1469.1f),
        p = PairPoint(x1 = 186.9f, y1 = 1501.9f, x2 = 62.4f, y2 = 1443.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 201.9f, y1 = 1467.6f, x2 = 79.6f, y2 = 1405.1f),
        p2 = PairPoint(x1 = 219.1f, y1 = 1431.1f, x2 = 96.8f, y2 = 1368.6f),
        p = PairPoint(x1 = 236.2f, y1 = 1394.6f, x2 = 111.8f, y2 = 1334.3f),
    ),
    SvgPathCommand.LineTo(
        PairPoint(x1 = 238.4f, y1 = 1390.3f, x2 = 113.9f, y2 = 1330f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 386.4f, y1 = 1070.6f, x2 = 261.9f, y2 = 1008.2f),
        p2 = PairPoint(x1 = 545.2f, y1 = 744.5f, x2 = 422.8f, y2 = 682.1f),
        p = PairPoint(x1 = 710.4f, y1 = 427f, x2 = 588f, y2 = 360.3f),
    ),
    // Straight Line (Line To)
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 716.8f, y1 = 414.1f, x2 = 594.4f, y2 = 347.5f),
        p2 = PairPoint(x1 = 716.8f, y1 = 414.1f, x2 = 594.4f, y2 = 347.5f),
        p = PairPoint(x1 = 716.8f, y1 = 414.1f, x2 = 594.4f, y2 = 347.5f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 734f, y1 = 382f, x2 = 611.6f, y2 = 315.3f),
        p2 = PairPoint(x1 = 751.1f, y1 = 347.6f, x2 = 628.7f, y2 = 281f),
        p = PairPoint(x1 = 768.3f, y1 = 315.4f, x2 = 645.9f, y2 = 246.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 785.5f, y1 = 281.1f, x2 = 667.3f, y2 = 208.1f),
        p2 = PairPoint(x1 = 804.8f, y1 = 248.9f, x2 = 690.9f, y2 = 167.3f),
        p = PairPoint(x1 = 828.4f, y1 = 221f, x2 = 723.1f, y2 = 128.7f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 873.5f, y1 = 169.5f, x2 = 794f, y2 = 47.2f),
        p2 = PairPoint(x1 = 933.5f, y1 = 141.6f, x2 = 890.5f, y2 = 0f),
        p = PairPoint(x1 = 1000f, y1 = 141.6f, x2 = 997.8f, y2 = 0f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1066.5f, y1 = 141.6f, x2 = 1102.9f, y2 = 0f),
        p2 = PairPoint(x1 = 1126.6f, y1 = 169.5f, x2 = 1201.6f, y2 = 47.2f),
        p = PairPoint(x1 = 1171.6f, y1 = 221f, x2 = 1270.3f, y2 = 133.1f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1195.2f, y1 = 248.9f, x2 = 1304.6f, y2 = 171.7f),
        p2 = PairPoint(x1 = 1214.5f, y1 = 281.1f, x2 = 1326f, y2 = 212.5f),
        p = PairPoint(x1 = 1231.7f, y1 = 315.4f, x2 = 1347.5f, y2 = 251.1f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1248.9f, y1 = 347.6f, x2 = 1364.7f, y2 = 285.4f),
        p2 = PairPoint(x1 = 1266f, y1 = 381.9f, x2 = 1381.8f, y2 = 319.7f),
        p = PairPoint(x1 = 1283.2f, y1 = 414f, x2 = 1399f, y2 = 351.9f),
    ),
    // Straight Line (Line To)
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1289.7f, y1 = 426.9f, x2 = 1405.4f, y2 = 364.8f),
        p2 = PairPoint(x1 = 1289.7f, y1 = 426.9f, x2 = 1405.4f, y2 = 364.8f),
        p = PairPoint(x1 = 1289.7f, y1 = 426.9f, x2 = 1405.4f, y2 = 364.8f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1452.7f, y1 = 746.5f, x2 = 1572.7f, y2 = 686.6f),
        p2 = PairPoint(x1 = 1611.5f, y1 = 1072.6f, x2 = 1731.5f, y2 = 1012.7f),
        // Ignore this point to fix flaw in the SVG
        // p = PairPoint(x1 = 1759.5f, y1 = 1392.3f, x2 = 1879.5f, y2 = 1334.5f),
        p = PairPoint(x1 = 1759.5f, y1 = 1394.4f, x2 = 1881.6f, y2 = 1336.6f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1776.7f, y1 = 1428.7f, x2 = 1896.7f, y2 = 1370.9f),
        p2 = PairPoint(x1 = 1791.7f, y1 = 1467.4f, x2 = 1913.8f, y2 = 1407.4f),
        p = PairPoint(x1 = 1808.8f, y1 = 1501.7f, x2 = 1931f, y2 = 1446f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1819.5f, y1 = 1527.5f, x2 = 1941.7f, y2 = 1469.6f),
        p2 = PairPoint(x1 = 1830.3f, y1 = 1548.9f, x2 = 1952.5f, y2 = 1497.5f),
        p = PairPoint(x1 = 1836.7f, y1 = 1570.3f, x2 = 1963.2f, y2 = 1523.2f),
    ),
    SvgPathCommand.CurveTo(
        p1 = PairPoint(x1 = 1853.8f, y1 = 1626.2f, x2 = 1991f, y2 = 1602.6f),
        p2 = PairPoint(x1 = 1860.2f, y1 = 1679.8f, x2 = 2001.6f, y2 = 1677.6f),
        p = PairPoint(x1 = 1851.6f, y1 = 1735.6f, x2 = 1984.4f, y2 = 1752.6f),
    ),
)








//private val NEW_AIRBNB_LOGO_PATH_COMMANDS = listOf(
//    SvgPathCommand.MoveTo(1851.6f, 1735.6f, false),
//    SvgPathCommand.CurveTo(1836.6f, 1847.2f, 1761.5f, 1943.7f, 1656.4f, 1986.6f, false),
//    SvgPathCommand.CurveTo(1604.9f, 2008.0f, 1549.1f, 2014.5f, 1493.3f, 2008.0f, false),
//    SvgPathCommand.CurveTo(1439.7001f, 2001.6f, 1386.0f, 1984.4f, 1330.3f, 1952.3f, false),
//    SvgPathCommand.CurveTo(1253.1001f, 1909.3f, 1175.8f, 1842.9f, 1085.7001f, 1744.2001f, false),
//    SvgPathCommand.CurveTo(1227.3f, 1570.4f, 1313.1001f, 1411.7001f, 1345.3f, 1270.1001f, false),
//    SvgPathCommand.CurveTo(1360.3f, 1203.6001f, 1362.5f, 1143.5001f, 1356.0f, 1087.7001f, false),
//    SvgPathCommand.CurveTo(1347.4f, 1034.1001f, 1328.1f, 984.7001f, 1298.1f, 941.80005f, false),
//    SvgPathCommand.CurveTo(1231.6f, 845.30005f, 1120.0f, 789.50006f, 995.6f, 789.50006f, false),
//    SvgPathCommand.CurveTo(871.19995f, 789.50006f, 759.6f, 847.4001f, 693.1f, 941.80005f, false),
//    SvgPathCommand.CurveTo(663.1f, 984.7001f, 643.8f, 1034.1001f, 635.19995f, 1087.7001f, false),
//    SvgPathCommand.CurveTo(626.6f, 1143.5001f, 628.7999f, 1205.7001f, 645.89996f, 1270.1001f, false),
//    SvgPathCommand.CurveTo(678.1f, 1411.7001f, 765.99994f, 1572.6001f, 905.5f, 1746.3f, false),
//    SvgPathCommand.CurveTo(817.5f, 1845.0f, 738.2f, 1911.5f, 660.9f, 1954.4f, false),
//    SvgPathCommand.CurveTo(605.10004f, 1986.6f, 551.5f, 2003.8f, 497.90002f, 2010.2001f, false),
//    SvgPathCommand.CurveTo(442.60004f, 2016.4f, 386.7f, 2009.0001f, 334.90002f, 1988.8f, false),
//    SvgPathCommand.CurveTo(229.80002f, 1945.9f, 154.70003f, 1849.3f, 139.70003f, 1737.8f, false),
//    SvgPathCommand.CurveTo(133.30003f, 1684.2001f, 137.60002f, 1630.6001f, 159.00003f, 1570.5f, false),
//    SvgPathCommand.CurveTo(165.40002f, 1549.0f, 176.20003f, 1527.6f, 186.90002f, 1501.9f, false),
//    SvgPathCommand.CurveTo(201.90002f, 1467.6f, 219.10002f, 1431.1f, 236.20003f, 1394.6f, false),
//    SvgPathCommand.LineTo(238.40002f, 1390.2999f, false),
//    SvgPathCommand.CurveTo(386.40002f, 1070.5999f, 545.2f, 744.49994f, 710.4f, 426.99994f, false),
//    SvgPathCommand.LineTo(716.80005f, 414.09995f, false),
//    SvgPathCommand.CurveTo(734.00006f, 381.99994f, 751.10004f, 347.59995f, 768.30005f, 315.39996f, false),
//    SvgPathCommand.CurveTo(785.50006f, 281.09998f, 804.80005f, 248.89996f, 828.4f, 220.99997f, false),
//    SvgPathCommand.CurveTo(873.5f, 169.49997f, 933.5f, 141.59998f, 1000.0f, 141.59998f, false),
//    SvgPathCommand.CurveTo(1066.5f, 141.59998f, 1126.6f, 169.49997f, 1171.6f, 220.99997f, false),
//    SvgPathCommand.CurveTo(1195.2f, 248.89996f, 1214.5f, 281.09998f, 1231.7f, 315.39996f, false),
//    SvgPathCommand.CurveTo(1248.8999f, 347.59998f, 1266.0f, 381.89996f, 1283.2f, 413.99997f, false),
//    SvgPathCommand.LineTo(1289.7f, 426.89996f, false),
//    SvgPathCommand.CurveTo(1452.7f, 746.5f, 1611.5f, 1072.6f, 1759.5f, 1392.3f, false),
//    SvgPathCommand.VerticalLineTo(1394.4f, false),
//    SvgPathCommand.CurveTo(1776.7f, 1428.7001f, 1791.7f, 1467.4f, 1808.8f, 1501.7001f, false),
//    SvgPathCommand.CurveTo(1819.5f, 1527.5001f, 1830.3f, 1548.9f, 1836.7001f, 1570.3f, false),
//    SvgPathCommand.CurveTo(1853.8f, 1626.2001f, 1860.2001f, 1679.8f, 1851.6001f, 1735.6001f, false),
//    SvgPathCommand.ClosePath,
//
//    SvgPathCommand.MoveTo(995.6f, 1634.7f, false),
//    SvgPathCommand.CurveTo(879.8f, 1488.7999f, 804.69995f, 1351.5f, 778.89996f, 1235.7f, false),
//    SvgPathCommand.CurveTo(768.19995f, 1186.2999f, 765.99994f, 1143.3999f, 772.49994f, 1104.7999f, false),
//    SvgPathCommand.CurveTo(776.7999f, 1070.4999f, 789.69995f, 1040.3999f, 806.7999f, 1014.69995f, false),
//    SvgPathCommand.CurveTo(847.5999f, 956.7999f, 916.19995f, 920.2999f, 995.5999f, 920.2999f, false),
//    SvgPathCommand.CurveTo(1074.9999f, 920.2999f, 1145.7999f, 954.69995f, 1184.3999f, 1014.69995f, false),
//    SvgPathCommand.CurveTo(1201.5999f, 1040.5f, 1214.3999f, 1070.5f, 1218.7f, 1104.7999f, false),
//    SvgPathCommand.CurveTo(1225.1f, 1143.3999f, 1223.0f, 1188.4999f, 1212.2999f, 1235.7f, false),
//    SvgPathCommand.CurveTo(1186.6f, 1349.3999f, 1111.4999f, 1486.7f, 995.5999f, 1634.7f, false),
//    SvgPathCommand.ClosePath,
//
//    SvgPathCommand.MoveTo(1963.2f, 1523.2f, false),
//    SvgPathCommand.CurveTo(1952.5f, 1497.5f, 1941.7f, 1469.6f, 1931.0f, 1446.0f, false),
//    SvgPathCommand.CurveTo(1913.8f, 1407.4f, 1896.7f, 1370.9f, 1881.6f, 1336.6f, false),
//    SvgPathCommand.LineTo(1879.5f, 1334.5f, false),
//    SvgPathCommand.CurveTo(1731.5f, 1012.7f, 1572.7f, 686.6f, 1405.4f, 364.8f, false),
//    SvgPathCommand.LineTo(1399.0f, 351.9f, false),
//    SvgPathCommand.CurveTo(1381.8f, 319.69998f, 1364.7f, 285.4f, 1347.5f, 251.09999f, false),
//    SvgPathCommand.CurveTo(1326.0f, 212.5f, 1304.6f, 171.69998f, 1270.3f, 133.09999f, false),
//    SvgPathCommand.CurveTo(1201.6001f, 47.19999f, 1102.9f, -1.5258789E-5f, 997.80005f, -1.5258789E-5f, false),
//    SvgPathCommand.CurveTo(890.50006f, -1.5258789E-5f, 794.00006f, 47.199986f, 723.10004f, 128.69998f, false),
//    SvgPathCommand.CurveTo(690.9f, 167.29999f, 667.30005f, 208.09998f, 645.9f, 246.69998f, false),
//    SvgPathCommand.CurveTo(628.7f, 280.99997f, 611.60004f, 315.3f, 594.4f, 347.5f, false),
//    SvgPathCommand.LineTo(588.0f, 360.3f, false),
//    SvgPathCommand.CurveTo(422.8f, 682.1f, 261.9f, 1008.2f, 113.899994f, 1330.0f, false),
//    SvgPathCommand.LineTo(111.799995f, 1334.3f, false),
//    SvgPathCommand.CurveTo(96.799995f, 1368.6001f, 79.59999f, 1405.1001f, 62.399994f, 1443.7001f, false),
//    SvgPathCommand.CurveTo(50.899994f, 1469.1001f, 40.199993f, 1494.9f, 30.199993f, 1520.9f, false),
//    SvgPathCommand.CurveTo(2.2999935f, 1600.3f, -6.300007f, 1675.4f, 4.399994f, 1752.6f, false),
//    SvgPathCommand.CurveTo(27.999994f, 1913.5f, 135.29999f, 2048.7f, 283.3f, 2108.7f, false),
//    SvgPathCommand.CurveTo(339.09998f, 2132.3f, 397.0f, 2143.0f, 457.09998f, 2143.0f, false),
//    SvgPathCommand.CurveTo(474.3f, 2143.0f, 495.69998f, 2140.9f, 512.89996f, 2138.7f, false),
//    SvgPathCommand.CurveTo(583.69995f, 2130.0999f, 656.6f, 2106.5999f, 727.39996f, 2065.8f, false),
//    SvgPathCommand.CurveTo(815.39996f, 2016.5f, 899.0f, 1945.7001f, 993.39996f, 1842.7001f, false),
//    SvgPathCommand.CurveTo(1087.7999f, 1945.7001f, 1173.6f, 2016.5001f, 1259.3999f, 2065.8f, false),
//    SvgPathCommand.CurveTo(1330.2f, 2106.6f, 1403.0999f, 2130.1f, 1473.8999f, 2138.7f, false),
//    SvgPathCommand.CurveTo(1491.0999f, 2140.9f, 1512.4999f, 2143.0f, 1529.7f, 2143.0f, false),
//    SvgPathCommand.CurveTo(1589.7999f, 2143.0f, 1649.7999f, 2132.3f, 1703.5f, 2108.7f, false),
//    SvgPathCommand.CurveTo(1853.7f, 2048.5999f, 1958.8f, 1911.2999f, 1982.4f, 1752.6f, false),
//    SvgPathCommand.CurveTo(1999.6f, 1677.6f, 1991.0f, 1602.6f, 1963.2001f, 1523.2f, false),
//    SvgPathCommand.ClosePath,
//)
//
//
//
//
//
//
//
//
//
//
//private val AIRBNB_LOGO_PATH_COMMANDS = listOf(
//    // Trace of the inside
//    SvgPathCommand.MoveTo(1851.6f, 1735.6f, false),
//    SvgPathCommand.CurveTo(1836.6f, 1847.2f, 1761.5f, 1943.7f, 1656.4f, 1986.6f, false),
//    SvgPathCommand.CurveTo(1604.9f, 2008.0f, 1549.1f, 2014.5f, 1493.3f, 2008.0f, false),
//    SvgPathCommand.CurveTo(1439.7001f, 2001.6f, 1386.0f, 1984.4f, 1330.3f, 1952.3f, false),
//    SvgPathCommand.CurveTo(1253.1001f, 1909.3f, 1175.8f, 1842.9f, 1085.7001f, 1744.2001f, false),
//    SvgPathCommand.CurveTo(1227.3f, 1570.4f, 1313.1001f, 1411.7001f, 1345.3f, 1270.1001f, false),
//    SvgPathCommand.CurveTo(1360.3f, 1203.6001f, 1362.5f, 1143.5001f, 1356.0f, 1087.7001f, false),
//    SvgPathCommand.CurveTo(1347.4f, 1034.1001f, 1328.1f, 984.7001f, 1298.1f, 941.80005f, false),
//    SvgPathCommand.CurveTo(1231.6f, 845.30005f, 1120.0f, 789.50006f, 995.6f, 789.50006f, false),
//    SvgPathCommand.CurveTo(871.19995f, 789.50006f, 759.6f, 847.4001f, 693.1f, 941.80005f, false),
//    SvgPathCommand.CurveTo(663.1f, 984.7001f, 643.8f, 1034.1001f, 635.19995f, 1087.7001f, false),
//    SvgPathCommand.CurveTo(626.6f, 1143.5001f, 628.7999f, 1205.7001f, 645.89996f, 1270.1001f, false),
//    SvgPathCommand.CurveTo(678.1f, 1411.7001f, 765.99994f, 1572.6001f, 905.5f, 1746.3f, false),
//    SvgPathCommand.CurveTo(817.5f, 1845.0f, 738.2f, 1911.5f, 660.9f, 1954.4f, false),
//    SvgPathCommand.CurveTo(605.10004f, 1986.6f, 551.5f, 2003.8f, 497.90002f, 2010.2001f, false),
//    SvgPathCommand.CurveTo(442.60004f, 2016.4f, 386.7f, 2009.0001f, 334.90002f, 1988.8f, false),
//    SvgPathCommand.CurveTo(229.80002f, 1945.9f, 154.70003f, 1849.3f, 139.70003f, 1737.8f, false),
//    SvgPathCommand.CurveTo(133.30003f, 1684.2001f, 137.60002f, 1630.6001f, 159.00003f, 1570.5f, false),
//    SvgPathCommand.CurveTo(165.40002f, 1549.0f, 176.20003f, 1527.6f, 186.90002f, 1501.9f, false),
//    SvgPathCommand.CurveTo(201.90002f, 1467.6f, 219.10002f, 1431.1f, 236.20003f, 1394.6f, false),
//    SvgPathCommand.LineTo(238.40002f, 1390.2999f, false),
//    SvgPathCommand.CurveTo(386.40002f, 1070.5999f, 545.2f, 744.49994f, 710.4f, 426.99994f, false),
//    SvgPathCommand.LineTo(716.80005f, 414.09995f, false),
//    SvgPathCommand.CurveTo(734.00006f, 381.99994f, 751.10004f, 347.59995f, 768.30005f, 315.39996f, false),
//    SvgPathCommand.CurveTo(785.50006f, 281.09998f, 804.80005f, 248.89996f, 828.4f, 220.99997f, false),
//    SvgPathCommand.CurveTo(873.5f, 169.49997f, 933.5f, 141.59998f, 1000.0f, 141.59998f, false),
//    SvgPathCommand.CurveTo(1066.5f, 141.59998f, 1126.6f, 169.49997f, 1171.6f, 220.99997f, false),
//    SvgPathCommand.CurveTo(1195.2f, 248.89996f, 1214.5f, 281.09998f, 1231.7f, 315.39996f, false),
//    SvgPathCommand.CurveTo(1248.8999f, 347.59998f, 1266.0f, 381.89996f, 1283.2f, 413.99997f, false),
//    SvgPathCommand.LineTo(1289.7f, 426.89996f, false),
//    SvgPathCommand.CurveTo(1452.7f, 746.5f, 1611.5f, 1072.6f, 1759.5f, 1392.3f, false),
//    SvgPathCommand.VerticalLineTo(1394.4f, false),
//    SvgPathCommand.CurveTo(1776.7f, 1428.7001f, 1791.7f, 1467.4f, 1808.8f, 1501.7001f, false),
//    SvgPathCommand.CurveTo(1819.5f, 1527.5001f, 1830.3f, 1548.9f, 1836.7001f, 1570.3f, false),
//    SvgPathCommand.CurveTo(1853.8f, 1626.2001f, 1860.2001f, 1679.8f, 1851.6001f, 1735.6001f, false),
//    SvgPathCommand.ClosePath,
//
//    //Trace of the internal loop
//    SvgPathCommand.MoveTo(995.6f, 1634.7f, false),
//    SvgPathCommand.CurveTo(879.8f, 1488.7999f, 804.69995f, 1351.5f, 778.89996f, 1235.7f, false),
//    SvgPathCommand.CurveTo(768.19995f, 1186.2999f, 765.99994f, 1143.3999f, 772.49994f, 1104.7999f, false),
//    SvgPathCommand.CurveTo(776.7999f, 1070.4999f, 789.69995f, 1040.3999f, 806.7999f, 1014.69995f, false),
//    SvgPathCommand.CurveTo(847.5999f, 956.7999f, 916.19995f, 920.2999f, 995.5999f, 920.2999f, false),
//    SvgPathCommand.CurveTo(1074.9999f, 920.2999f, 1145.7999f, 954.69995f, 1184.3999f, 1014.69995f, false),
//    SvgPathCommand.CurveTo(1201.5999f, 1040.5f, 1214.3999f, 1070.5f, 1218.7f, 1104.7999f, false),
//    SvgPathCommand.CurveTo(1225.1f, 1143.3999f, 1223.0f, 1188.4999f, 1212.2999f, 1235.7f, false),
//    SvgPathCommand.CurveTo(1186.6f, 1349.3999f, 1111.4999f, 1486.7f, 995.5999f, 1634.7f, false),
//    SvgPathCommand.ClosePath,
//
//    // Trace of the outside
//    SvgPathCommand.MoveTo(1963.2f, 1523.2f, false),
//    SvgPathCommand.CurveTo(1952.5f, 1497.5f, 1941.7f, 1469.6f, 1931.0f, 1446.0f, false),
//    SvgPathCommand.CurveTo(1913.8f, 1407.4f, 1896.7f, 1370.9f, 1881.6f, 1336.6f, false),
//    SvgPathCommand.LineTo(1879.5f, 1334.5f, false),
//    SvgPathCommand.CurveTo(1731.5f, 1012.7f, 1572.7f, 686.6f, 1405.4f, 364.8f, false),
//    SvgPathCommand.LineTo(1399.0f, 351.9f, false),
//    SvgPathCommand.CurveTo(1381.8f, 319.69998f, 1364.7f, 285.4f, 1347.5f, 251.09999f, false),
//    SvgPathCommand.CurveTo(1326.0f, 212.5f, 1304.6f, 171.69998f, 1270.3f, 133.09999f, false),
//    SvgPathCommand.CurveTo(1201.6001f, 47.19999f, 1102.9f, -1.5258789E-5f, 997.80005f, -1.5258789E-5f, false),
//    SvgPathCommand.CurveTo(890.50006f, -1.5258789E-5f, 794.00006f, 47.199986f, 723.10004f, 128.69998f, false),
//    SvgPathCommand.CurveTo(690.9f, 167.29999f, 667.30005f, 208.09998f, 645.9f, 246.69998f, false),
//    SvgPathCommand.CurveTo(628.7f, 280.99997f, 611.60004f, 315.3f, 594.4f, 347.5f, false),
//    SvgPathCommand.LineTo(588.0f, 360.3f, false),
//    SvgPathCommand.CurveTo(422.8f, 682.1f, 261.9f, 1008.2f, 113.899994f, 1330.0f, false),
//    SvgPathCommand.LineTo(111.799995f, 1334.3f, false),
//    SvgPathCommand.CurveTo(96.799995f, 1368.6001f, 79.59999f, 1405.1001f, 62.399994f, 1443.7001f, false),
//    SvgPathCommand.CurveTo(50.899994f, 1469.1001f, 40.199993f, 1494.9f, 30.199993f, 1520.9f, false),
//    SvgPathCommand.CurveTo(2.2999935f, 1600.3f, -6.300007f, 1675.4f, 4.399994f, 1752.6f, false),
//    SvgPathCommand.CurveTo(27.999994f, 1913.5f, 135.29999f, 2048.7f, 283.3f, 2108.7f, false),
//    SvgPathCommand.CurveTo(339.09998f, 2132.3f, 397.0f, 2143.0f, 457.09998f, 2143.0f, false),
//    SvgPathCommand.CurveTo(474.3f, 2143.0f, 495.69998f, 2140.9f, 512.89996f, 2138.7f, false),
//    SvgPathCommand.CurveTo(583.69995f, 2130.0999f, 656.6f, 2106.5999f, 727.39996f, 2065.8f, false),
//    SvgPathCommand.CurveTo(815.39996f, 2016.5f, 899.0f, 1945.7001f, 993.39996f, 1842.7001f, false),
//    SvgPathCommand.CurveTo(1087.7999f, 1945.7001f, 1173.6f, 2016.5001f, 1259.3999f, 2065.8f, false),
//    SvgPathCommand.CurveTo(1330.2f, 2106.6f, 1403.0999f, 2130.1f, 1473.8999f, 2138.7f, false),
//    SvgPathCommand.CurveTo(1491.0999f, 2140.9f, 1512.4999f, 2143.0f, 1529.7f, 2143.0f, false),
//    SvgPathCommand.CurveTo(1589.7999f, 2143.0f, 1649.7999f, 2132.3f, 1703.5f, 2108.7f, false),
//    SvgPathCommand.CurveTo(1853.7f, 2048.5999f, 1958.8f, 1911.2999f, 1982.4f, 1752.6f, false),
//    SvgPathCommand.CurveTo(1999.6f, 1677.6f, 1991.0f, 1602.6f, 1963.2001f, 1523.2f, false),
//    SvgPathCommand.ClosePath
//)
//
//
//val REVERSED_AIRBNB_LOGO_PATH_COMMANDS = listOf(
//    SvgPathCommand.MoveTo(1963.2f, 1523.2f, false),
//    SvgPathCommand.LineTo(1963.2f, 1523.2f, false),
//    SvgPathCommand.CurveTo(1991.0f, 1602.6f, 1999.6f, 1677.6f, 1982.4f, 1752.6f, false),
//    SvgPathCommand.CurveTo(1958.8f, 1911.3f, 1853.7f, 2048.6f, 1703.5f, 2108.7f, false),
//    SvgPathCommand.CurveTo(1649.8f, 2132.3f, 1589.8f, 2143.0f, 1529.7f, 2143.0f, false),
//    SvgPathCommand.CurveTo(1512.5f, 2143.0f, 1491.1f, 2140.9f, 1473.9f, 2138.7f, false),
//    SvgPathCommand.CurveTo(1403.1f, 2130.1f, 1330.2f, 2106.6f, 1259.4f, 2065.8f, false),
//    SvgPathCommand.CurveTo(1173.6f, 2016.5f, 1087.8f, 1945.7f, 993.4f, 1842.7f, false),
//    SvgPathCommand.CurveTo(899.0f, 1945.7f, 815.4f, 2016.5f, 727.4f, 2065.8f, false),
//    SvgPathCommand.CurveTo(656.6f, 2106.6f, 583.7f, 2130.1f, 512.9f, 2138.7f, false),
//    SvgPathCommand.CurveTo(495.7f, 2140.9f, 474.3f, 2143.0f, 457.1f, 2143.0f, false),
//    SvgPathCommand.CurveTo(397.0f, 2143.0f, 339.1f, 2132.3f, 283.3f, 2108.7f, false),
//    SvgPathCommand.CurveTo(135.3f, 2048.7f, 28.0f, 1913.5f, 4.4f, 1752.6f, false),
//    SvgPathCommand.CurveTo(-6.3f, 1675.4f, 2.3f, 1600.3f, 30.2f, 1520.9f, false),
//    SvgPathCommand.CurveTo(40.2f, 1494.9f, 50.9f, 1469.1f, 62.4f, 1443.7f, false),
//    SvgPathCommand.CurveTo(79.6f, 1405.1f, 96.8f, 1368.6f, 111.8f, 1334.3f, false),
//    SvgPathCommand.LineTo(113.9f, 1330.0f, false),
//    SvgPathCommand.CurveTo(261.9f, 1008.2f, 422.8f, 682.1f, 588.0f, 360.3f, false),
//    SvgPathCommand.LineTo(594.4f, 347.5f, false),
//    SvgPathCommand.CurveTo(611.6f, 315.3f, 628.7f, 281.0f, 645.9f, 246.7f, false),
//    SvgPathCommand.CurveTo(667.3f, 208.1f, 690.9f, 167.3f, 723.1f, 128.7f, false),
//    SvgPathCommand.CurveTo(794.0f, 47.2f, 890.5f, 0.0f, 997.8f, 0.0f, false),
//    SvgPathCommand.CurveTo(1102.9f, 0.0f, 1201.6f, 47.2f, 1270.3f, 133.1f, false),
//    SvgPathCommand.CurveTo(1304.6f, 171.7f, 1326.0f, 212.5f, 1347.5f, 251.1f, false),
//    SvgPathCommand.CurveTo(1364.7f, 285.4f, 1381.8f, 319.7f, 1399.0f, 351.9f, false),
//    SvgPathCommand.LineTo(1405.4f, 364.8f, false),
//    SvgPathCommand.CurveTo(1572.7f, 686.6f, 1731.5f, 1012.7f, 1879.5f, 1334.5f, false),
//    SvgPathCommand.LineTo(1881.6f, 1336.6f, false),
//    SvgPathCommand.CurveTo(1896.7f, 1370.9f, 1913.8f, 1407.4f, 1931.0f, 1446.0f, false),
//    SvgPathCommand.CurveTo(1941.7f, 1469.6f, 1952.5f, 1497.5f, 1963.2f, 1523.2f, false),
//    SvgPathCommand.ClosePath,
//
//    SvgPathCommand.MoveTo(995.6f, 1634.7f, false),
//    SvgPathCommand.LineTo(995.6f, 1634.7f, false),
//    SvgPathCommand.CurveTo(1111.5f, 1486.7f, 1186.6f, 1349.4f, 1212.3f, 1235.7f, false),
//    SvgPathCommand.CurveTo(1223.0f, 1188.5f, 1225.1f, 1143.4f, 1218.7f, 1104.8f, false),
//    SvgPathCommand.CurveTo(1214.4f, 1070.5f, 1201.6f, 1040.5f, 1184.4f, 1014.7f, false),
//    SvgPathCommand.CurveTo(1145.8f, 954.7f, 1075.0f, 920.3f, 995.6f, 920.3f, false),
//    SvgPathCommand.CurveTo(916.2f, 920.3f, 847.6f, 956.8f, 806.8f, 1014.7f, false),
//    SvgPathCommand.CurveTo(789.7f, 1040.4f, 776.8f, 1070.5f, 772.5f, 1104.8f, false),
//    SvgPathCommand.CurveTo(766.0f, 1143.4f, 768.2f, 1186.3f, 778.9f, 1235.7f, false),
//    SvgPathCommand.CurveTo(804.7f, 1351.5f, 879.8f, 1488.8f, 995.6f, 1634.7f, false),
//    SvgPathCommand.ClosePath,
//
//    SvgPathCommand.MoveTo(1851.6f, 1735.6f, false),
//    SvgPathCommand.LineTo(1851.6f, 1735.6f, false),
//    SvgPathCommand.CurveTo(1860.2f, 1679.8f, 1853.8f, 1626.2f, 1836.7f, 1570.3f, false),
//    SvgPathCommand.CurveTo(1830.3f, 1548.9f, 1819.5f, 1527.5f, 1808.8f, 1501.7f, false),
//    SvgPathCommand.CurveTo(1791.7f, 1467.4f, 1776.7f, 1428.7f, 1759.5f, 1394.4f, false),
//    SvgPathCommand.LineTo(1759.5f, 1392.3f, false),
//    SvgPathCommand.CurveTo(1611.5f, 1072.6f, 1452.7f, 746.5f, 1289.7f, 426.9f, false),
//    SvgPathCommand.LineTo(1283.2f, 414.0f, false),
//    SvgPathCommand.CurveTo(1266.0f, 381.9f, 1248.9f, 347.6f, 1231.7f, 315.4f, false),
//    SvgPathCommand.CurveTo(1214.5f, 281.1f, 1195.2f, 248.9f, 1171.6f, 221.0f, false),
//    SvgPathCommand.CurveTo(1126.6f, 169.5f, 1066.5f, 141.6f, 1000.0f, 141.6f, false),
//    SvgPathCommand.CurveTo(933.5f, 141.6f, 873.5f, 169.5f, 828.4f, 221.0f, false),
//    SvgPathCommand.CurveTo(804.8f, 248.9f, 785.5f, 281.1f, 768.3f, 315.4f, false),
//    SvgPathCommand.CurveTo(751.1f, 347.6f, 734.0f, 382.0f, 716.8f, 414.1f, false),
//    SvgPathCommand.LineTo(710.4f, 427.0f, false),
//    SvgPathCommand.CurveTo(545.2f, 744.5f, 386.4f, 1070.6f, 238.4f, 1390.3f, false),
//    SvgPathCommand.LineTo(236.2f, 1394.6f, false),
//    SvgPathCommand.CurveTo(219.1f, 1431.1f, 201.9f, 1467.6f, 186.9f, 1501.9f, false),
//    SvgPathCommand.CurveTo(176.2f, 1527.6f, 165.4f, 1549.0f, 159.0f, 1570.5f, false),
//    SvgPathCommand.CurveTo(137.6f, 1630.6f, 133.3f, 1684.2f, 139.7f, 1737.8f, false),
//    SvgPathCommand.CurveTo(154.7f, 1849.3f, 229.8f, 1945.9f, 334.9f, 1988.8f, false),
//    SvgPathCommand.CurveTo(386.7f, 2009.0f, 442.6f, 2016.4f, 497.9f, 2010.2f, false),
//    SvgPathCommand.CurveTo(551.5f, 2003.8f, 605.1f, 1986.6f, 660.9f, 1954.4f, false),
//    SvgPathCommand.CurveTo(738.2f, 1911.5f, 817.5f, 1845.0f, 905.5f, 1746.3f, false),
//    SvgPathCommand.CurveTo(766.0f, 1572.6f, 678.1f, 1411.7f, 645.9f, 1270.1f, false),
//    SvgPathCommand.CurveTo(628.8f, 1205.7f, 626.6f, 1143.5f, 635.2f, 1087.7f, false),
//    SvgPathCommand.CurveTo(643.8f, 1034.1f, 663.1f, 984.7f, 693.1f, 941.8f, false),
//    SvgPathCommand.CurveTo(759.6f, 847.4f, 871.2f, 789.5f, 995.6f, 789.5f, false),
//    SvgPathCommand.CurveTo(1120.0f, 789.5f, 1231.6f, 845.3f, 1298.1f, 941.8f, false),
//    SvgPathCommand.CurveTo(1328.1f, 984.7f, 1347.4f, 1034.1f, 1356.0f, 1087.7f, false),
//    SvgPathCommand.CurveTo(1362.5f, 1143.5f, 1360.3f, 1203.6f, 1345.3f, 1270.1f, false),
//    SvgPathCommand.CurveTo(1313.1f, 1411.7f, 1227.3f, 1570.4f, 1085.7f, 1744.2f, false),
//    SvgPathCommand.CurveTo(1175.8f, 1842.9f, 1253.1f, 1909.3f, 1330.3f, 1952.3f, false),
//    SvgPathCommand.CurveTo(1386.0f, 1984.4f, 1439.7f, 2001.6f, 1493.3f, 2008.0f, false),
//    SvgPathCommand.CurveTo(1549.1f, 2014.5f, 1604.9f, 2008.0f, 1656.4f, 1986.6f, false),
//    SvgPathCommand.CurveTo(1761.5f, 1943.7f, 1836.6f, 1847.2f, 1851.6f, 1735.6f, false),
//    SvgPathCommand.ClosePath,
//)
//
//
//fun List<SvgPathCommand>.toKotlinCode(): String {
//    return "listOf(\n" +
//            joinToString(separator = ",\n    ") { command ->
//                when (command) {
//                    is SvgPathCommand.MoveTo -> "SvgPathCommand.MoveTo(${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    is SvgPathCommand.LineTo -> "SvgPathCommand.LineTo(${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    is SvgPathCommand.HorizontalLineTo -> "SvgPathCommand.HorizontalLineTo(${command.x}f, ${command.relative})"
//                    is SvgPathCommand.VerticalLineTo -> "SvgPathCommand.VerticalLineTo(${command.y}f, ${command.relative})"
//                    is SvgPathCommand.CurveTo -> "SvgPathCommand.CurveTo(${command.p1.x}f, ${command.p1.y}f, ${command.p2.x}f, ${command.p2.y}f, ${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    is SvgPathCommand.SmoothCurveTo -> "SvgPathCommand.SmoothCurveTo(${command.p2.x}f, ${command.p2.y}f, ${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    is SvgPathCommand.QuadraticCurveTo -> "SvgPathCommand.QuadraticCurveTo(${command.p1.x}f, ${command.p1.y}f, ${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    is SvgPathCommand.SmoothQuadraticCurveTo -> "SvgPathCommand.SmoothQuadraticCurveTo(${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    is SvgPathCommand.ArcTo -> "SvgPathCommand.ArcTo(${command.rx}f, ${command.ry}f, ${command.xAxisRotation}f, ${command.largeArcFlag}, ${command.sweepFlag}, ${command.p.x}f, ${command.p.y}f, ${command.relative})"
//                    SvgPathCommand.ClosePath -> "SvgPathCommand.ClosePath"
//                }
//            } +
//            "\n)"
//}
