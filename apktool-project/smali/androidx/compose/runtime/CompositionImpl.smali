.class public final Landroidx/compose/runtime/CompositionImpl;
.super Ljava/lang/Object;
.source "Composition.kt"

# interfaces
.implements Landroidx/compose/runtime/ControlledComposition;
.implements Landroidx/compose/runtime/ReusableComposition;
.implements Landroidx/compose/runtime/RecomposeScopeOwner;
.implements Landroidx/compose/runtime/CompositionServices;
.implements Landroidx/compose/runtime/PausableComposition;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 18 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1354:1\n1110#1,2:1407\n1294#1,3:1409\n1100#1,6:1414\n1298#1,4:1421\n1112#1,4:1425\n1100#1,6:1431\n1110#1,2:1934\n1294#1,3:1936\n1100#1,6:1939\n1298#1,4:1946\n1112#1,4:1950\n1110#1,2:1969\n1294#1,3:1971\n1298#1,4:1975\n1112#1,4:1979\n1110#1,2:2075\n1294#1,3:2077\n1298#1,4:2081\n1112#1,4:2085\n1110#1,2:2091\n1294#1,3:2093\n1298#1,4:2097\n1112#1,4:2101\n1110#1,2:2107\n1294#1,3:2109\n1298#1,4:2113\n1112#1,4:2117\n1294#1,3:2121\n1298#1,4:2125\n27#2:1355\n33#2,2:1357\n33#2,2:1394\n33#2,2:1396\n33#2,2:1412\n33#2,2:1429\n33#2,2:1437\n33#2,2:1452\n33#2,2:1454\n33#2,2:1895\n33#2,2:1932\n33#2,2:2073\n33#2,2:2089\n33#2,2:2105\n33#2,2:2129\n33#2,2:2133\n33#2,2:2135\n33#2,2:2137\n33#2,2:2202\n1#3:1356\n1#3:1420\n1#3:1448\n1#3:1945\n1#3:1974\n1#3:1987\n1#3:1998\n1#3:2080\n1#3:2096\n1#3:2112\n1#3:2124\n1#3:2189\n1#3:2211\n48#4,5:1359\n48#4,5:1364\n48#4,5:1369\n48#4,5:1374\n48#4,5:1379\n48#4,5:1384\n48#4,5:1389\n48#4,5:1439\n48#4,5:2196\n90#5,2:1398\n33#5,6:1400\n92#5:1406\n105#5,2:1954\n33#5,6:1956\n107#5:1962\n33#5,4:2192\n38#5:2201\n174#6,4:1444\n179#6,3:1449\n174#6,4:1983\n179#6,3:1988\n174#6,4:1994\n179#6,3:1999\n174#6,4:2207\n179#6,3:2212\n41#7,3:1456\n46#7:1484\n48#7:1487\n41#7,3:1523\n46#7:1585\n48#7:1613\n231#8,3:1459\n200#8,7:1462\n211#8,3:1470\n214#8,9:1474\n234#8:1483\n231#8,3:1494\n200#8,7:1497\n211#8,3:1505\n214#8,9:1509\n234#8:1518\n231#8,3:1526\n200#8,7:1529\n211#8,3:1537\n214#8,2:1541\n231#8,3:1549\n200#8,7:1552\n211#8,3:1560\n214#8,9:1564\n234#8:1573\n217#8,6:1578\n234#8:1584\n231#8,3:1587\n200#8,7:1590\n211#8,3:1598\n214#8,9:1602\n234#8:1611\n200#8,7:1636\n211#8,3:1644\n214#8,2:1648\n217#8,6:1654\n200#8,7:1700\n211#8,3:1708\n214#8,2:1712\n217#8,6:1718\n200#8,16:1764\n217#8,6:1784\n200#8,7:1810\n211#8,3:1818\n214#8,2:1822\n217#8,6:1828\n231#8,3:1866\n200#8,7:1869\n211#8,3:1877\n214#8,9:1881\n234#8:1890\n231#8,3:1903\n200#8,7:1906\n211#8,3:1914\n214#8,9:1918\n234#8:1927\n200#8,16:2028\n217#8,6:2048\n231#8,3:2146\n200#8,7:2149\n211#8,3:2157\n214#8,9:2161\n234#8:2170\n1399#9:1469\n1270#9:1473\n1399#9:1504\n1270#9:1508\n1399#9:1536\n1270#9:1540\n1399#9:1559\n1270#9:1563\n1399#9:1597\n1270#9:1601\n1399#9:1622\n1270#9:1626\n1399#9:1643\n1270#9:1647\n1399#9:1686\n1270#9:1690\n1399#9:1707\n1270#9:1711\n1399#9:1750\n1270#9:1754\n1399#9:1817\n1270#9:1821\n1399#9:1845\n1270#9:1849\n1399#9:1876\n1270#9:1880\n1399#9:1913\n1270#9:1917\n1399#9:2014\n1270#9:2018\n1399#9:2156\n1270#9:2160\n1855#10,2:1485\n1855#10:1586\n1856#10:1612\n67#11,6:1488\n75#11,4:1519\n67#11,6:1543\n75#11,4:1574\n123#11:1614\n124#11,4:1630\n128#11,6:1661\n135#11:1677\n123#11:1678\n124#11,4:1694\n128#11,6:1725\n135#11:1741\n123#11:1742\n124#11,4:1758\n128#11,6:1791\n135#11:1807\n67#11,6:1860\n75#11,4:1891\n67#11,6:1897\n75#11,4:1928\n123#11:2006\n124#11,4:2022\n128#11,6:2055\n135#11:2071\n81#11:2139\n67#11,6:2140\n75#11,8:2171\n842#12:1615\n844#12:1629\n845#12,3:1667\n848#12:1676\n842#12:1679\n844#12:1693\n845#12,3:1731\n848#12:1740\n842#12:1743\n844#12:1757\n845#12,3:1797\n848#12:1806\n842#12:2007\n844#12:2021\n845#12,3:2061\n848#12:2070\n329#13,6:1616\n339#13,3:1623\n342#13,2:1627\n345#13,6:1670\n329#13,6:1680\n339#13,3:1687\n342#13,2:1691\n345#13,6:1734\n329#13,6:1744\n339#13,3:1751\n342#13,2:1755\n345#13,6:1800\n329#13,6:2008\n339#13,3:2015\n342#13,2:2019\n345#13,6:2064\n809#14,2:1634\n812#14,4:1650\n816#14:1660\n809#14,2:1698\n812#14,4:1714\n816#14:1724\n809#14,2:1762\n812#14,4:1780\n816#14:1790\n809#14,2:1808\n812#14,4:1824\n816#14:1834\n809#14,2:2026\n812#14,4:2044\n816#14:2054\n54#15:1835\n54#15:1852\n403#16,3:1836\n367#16,6:1839\n377#16,3:1846\n380#16,2:1850\n383#16,6:1853\n406#16:1859\n4665#17:1963\n4643#17,5:1964\n45#18,3:1991\n49#18:2002\n45#18,3:2003\n49#18:2072\n45#18,3:2204\n49#18:2215\n13309#19,2:2131\n11383#19,9:2179\n13309#19:2188\n13310#19:2190\n11392#19:2191\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n780#1:1407,2\n780#1:1409,3\n783#1:1414,6\n780#1:1421,4\n780#1:1425,4\n802#1:1431,6\n994#1:1934,2\n994#1:1936,3\n995#1:1939,6\n994#1:1946,4\n994#1:1950,4\n1015#1:1969,2\n1015#1:1971,3\n1015#1:1975,4\n1015#1:1979,4\n1066#1:2075,2\n1066#1:2077,3\n1066#1:2081,4\n1066#1:2085,4\n1075#1:2091,2\n1075#1:2093,3\n1075#1:2097,4\n1075#1:2101,4\n1085#1:2107,2\n1085#1:2109,3\n1085#1:2113,4\n1085#1:2117,4\n1111#1:2121,3\n1111#1:2125,4\n452#1:1355\n610#1:1357,2\n682#1:1394,2\n699#1:1396,2\n781#1:1412,2\n800#1:1429,2\n809#1:1437,2\n854#1:1452,2\n877#1:1454,2\n983#1:1895,2\n992#1:1932,2\n1065#1:2073,2\n1074#1:2089,2\n1084#1:2105,2\n1128#1:2129,2\n1132#1:2133,2\n1175#1:2135,2\n1203#1:2137,2\n1320#1:2202,2\n780#1:1420\n840#1:1448\n994#1:1945\n1015#1:1974\n1021#1:1987\n1035#1:1998\n1066#1:2080\n1075#1:2096\n1085#1:2112\n1111#1:2124\n1281#1:2189\n1327#1:2211\n613#1:1359,5\n620#1:1364,5\n631#1:1369,5\n632#1:1374,5\n651#1:1379,5\n652#1:1384,5\n675#1:1389,5\n810#1:1439,5\n1284#1:2196,5\n706#1:1398,2\n706#1:1400,6\n706#1:1406\n1014#1:1954,2\n1014#1:1956,6\n1014#1:1962\n1282#1:2192,4\n1282#1:2201\n840#1:1444,4\n840#1:1449,3\n1021#1:1983,4\n1021#1:1988,3\n1035#1:1994,4\n1035#1:1999,3\n1327#1:2207,4\n1327#1:2212,3\n885#1:1456,3\n885#1:1484\n885#1:1487\n909#1:1523,3\n909#1:1585\n909#1:1613\n885#1:1459,3\n885#1:1462,7\n885#1:1470,3\n885#1:1474,9\n885#1:1483\n894#1:1494,3\n894#1:1497,7\n894#1:1505,3\n894#1:1509,9\n894#1:1518\n909#1:1526,3\n909#1:1529,7\n909#1:1537,3\n909#1:1541,2\n914#1:1549,3\n914#1:1552,7\n914#1:1560,3\n914#1:1564,9\n914#1:1573\n909#1:1578,6\n909#1:1584\n914#1:1587,3\n914#1:1590,7\n914#1:1598,3\n914#1:1602,9\n914#1:1611\n923#1:1636,7\n923#1:1644,3\n923#1:1648,2\n923#1:1654,6\n929#1:1700,7\n929#1:1708,3\n929#1:1712,2\n929#1:1718,6\n936#1:1764,16\n936#1:1784,6\n938#1:1810,7\n938#1:1818,3\n938#1:1822,2\n938#1:1828,6\n974#1:1866,3\n974#1:1869,7\n974#1:1877,3\n974#1:1881,9\n974#1:1890\n988#1:1903,3\n988#1:1906,7\n988#1:1914,3\n988#1:1918,9\n988#1:1927\n1050#1:2028,16\n1050#1:2048,6\n1239#1:2146,3\n1239#1:2149,7\n1239#1:2157,3\n1239#1:2161,9\n1239#1:2170\n885#1:1469\n885#1:1473\n894#1:1504\n894#1:1508\n909#1:1536\n909#1:1540\n914#1:1559\n914#1:1563\n914#1:1597\n914#1:1601\n923#1:1622\n923#1:1626\n923#1:1643\n923#1:1647\n929#1:1686\n929#1:1690\n929#1:1707\n929#1:1711\n936#1:1750\n936#1:1754\n938#1:1817\n938#1:1821\n959#1:1845\n959#1:1849\n974#1:1876\n974#1:1880\n988#1:1913\n988#1:1917\n1050#1:2014\n1050#1:2018\n1239#1:2156\n1239#1:2160\n885#1:1485,2\n909#1:1586\n909#1:1612\n894#1:1488,6\n894#1:1519,4\n914#1:1543,6\n914#1:1574,4\n923#1:1614\n923#1:1630,4\n923#1:1661,6\n923#1:1677\n929#1:1678\n929#1:1694,4\n929#1:1725,6\n929#1:1741\n936#1:1742\n936#1:1758,4\n936#1:1791,6\n936#1:1807\n974#1:1860,6\n974#1:1891,4\n988#1:1897,6\n988#1:1928,4\n1050#1:2006\n1050#1:2022,4\n1050#1:2055,6\n1050#1:2071\n1239#1:2139\n1239#1:2140,6\n1239#1:2171,8\n923#1:1615\n923#1:1629\n923#1:1667,3\n923#1:1676\n929#1:1679\n929#1:1693\n929#1:1731,3\n929#1:1740\n936#1:1743\n936#1:1757\n936#1:1797,3\n936#1:1806\n1050#1:2007\n1050#1:2021\n1050#1:2061,3\n1050#1:2070\n923#1:1616,6\n923#1:1623,3\n923#1:1627,2\n923#1:1670,6\n929#1:1680,6\n929#1:1687,3\n929#1:1691,2\n929#1:1734,6\n936#1:1744,6\n936#1:1751,3\n936#1:1755,2\n936#1:1800,6\n1050#1:2008,6\n1050#1:2015,3\n1050#1:2019,2\n1050#1:2064,6\n923#1:1634,2\n923#1:1650,4\n923#1:1660\n929#1:1698,2\n929#1:1714,4\n929#1:1724\n936#1:1762,2\n936#1:1780,4\n936#1:1790\n938#1:1808,2\n938#1:1824,4\n938#1:1834\n1050#1:2026,2\n1050#1:2044,4\n1050#1:2054\n950#1:1835\n961#1:1852\n959#1:1836,3\n959#1:1839,6\n959#1:1846,3\n959#1:1850,2\n959#1:1853,6\n959#1:1859\n1014#1:1963\n1014#1:1964,5\n1029#1:1991,3\n1029#1:2002\n1048#1:2003,3\n1048#1:2072\n1323#1:2204,3\n1323#1:2215\n1128#1:2131,2\n1281#1:2179,9\n1281#1:2188\n1281#1:2190\n1281#1:2191\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0008\u0010`\u001a\u00020\u001bH\u0016J\u0018\u0010a\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-2\u0006\u0010c\u001a\u00020\u0014H\u0002J\u001e\u0010a\u001a\u00020\u001b2\u000c\u0010d\u001a\u0008\u0012\u0004\u0012\u00020-0,2\u0006\u0010c\u001a\u00020\u0014H\u0002J\u0008\u0010e\u001a\u00020\u001bH\u0016J\u0010\u0010f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0008\u0010g\u001a\u00020\u001bH\u0016J\u0008\u0010h\u001a\u00020\u001bH\u0016J\u0008\u0010i\u001a\u00020\u001bH\u0002J \u0010j\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cH\u0016\u00a2\u0006\u0002\u0010 J \u0010l\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cH\u0002\u00a2\u0006\u0002\u0010 J\r\u0010m\u001a\u00020<H\u0000\u00a2\u0006\u0002\u0008nJ\u0008\u0010o\u001a\u00020\u001bH\u0016J3\u0010p\u001a\u0002Hq\"\u0004\u0008\u0000\u0010q2\u0008\u0010r\u001a\u0004\u0018\u00010\u00012\u0006\u0010s\u001a\u00020<2\u000c\u0010t\u001a\u0008\u0012\u0004\u0012\u0002Hq0\u001aH\u0016\u00a2\u0006\u0002\u0010uJ\u0008\u0010v\u001a\u00020\u001bH\u0016J\u0010\u0010w\u001a\u00020\u001b2\u0006\u0010x\u001a\u00020yH\u0016J\u0008\u0010z\u001a\u00020\u001bH\u0002J\u0008\u0010{\u001a\u00020\u001bH\u0002J\u0008\u0010|\u001a\u00020\u001bH\u0002J\u0014\u0010}\u001a\u0004\u0018\u00010Z2\u0008\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J&\u0010~\u001a\u0004\u0018\u0001H\u007f\"\u0004\u0008\u0000\u0010\u007f2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u0002H\u007f0\u0081\u0001H\u0016\u00a2\u0006\u0003\u0010\u0082\u0001J$\u0010\u0083\u0001\u001a\u0002H\u007f\"\u0004\u0008\u0000\u0010\u007f2\u000c\u0010t\u001a\u0008\u0012\u0004\u0012\u0002H\u007f0\u001aH\u0082\u0008\u00a2\u0006\u0003\u0010\u0084\u0001JH\u0010\u0085\u0001\u001a\u0002H\u007f\"\u0004\u0008\u0000\u0010\u007f20\u0010t\u001a,\u0012!\u0012\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-01\u00a2\u0006\u000e\u0008\u0087\u0001\u0012\t\u0008\u0088\u0001\u0012\u0004\u0008\u0008(\u0017\u0012\u0004\u0012\u0002H\u007f0\u0086\u0001H\u0082\u0008\u00a2\u0006\u0003\u0010\u0089\u0001J)\u0010\u008a\u0001\u001a\u00020\u001b2\u001e\u0010\u008b\u0001\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008c\u00010%H\u0016J\u001e\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020&2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010-H\u0016J\t\u0010\u0092\u0001\u001a\u00020\u001bH\u0016J(\u0010\u0093\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020&2\u0008\u0010\u0094\u0001\u001a\u00030\u0095\u00012\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010\u0096\u0001\u001a\u00020\u001b2\u0007\u0010\u0080\u0001\u001a\u00020<J\u0011\u0010\u0097\u0001\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-H\u0002J\u001a\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0008\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0000\u00a2\u0006\u0003\u0008\u009c\u0001J\u000c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0002J\u0017\u0010\u009d\u0001\u001a\u00020\u00142\u000c\u0010d\u001a\u0008\u0012\u0004\u0012\u00020-0,H\u0016J\u000f\u0010\u009e\u0001\u001a\u00020\u001bH\u0000\u00a2\u0006\u0003\u0008\u009f\u0001J\u0017\u0010\u00a0\u0001\u001a\u00020\u001b2\u000c\u0010t\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\t\u0010\u00a1\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010\u00a2\u0001\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020&H\u0016J\u0017\u0010\u00a3\u0001\u001a\u00020\u001b2\u000c\u0010d\u001a\u0008\u0012\u0004\u0012\u00020-0,H\u0016J\u0011\u0010\u00a4\u0001\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-H\u0016J\u0011\u0010\u00a5\u0001\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-H\u0016J\u001b\u0010\u00a6\u0001\u001a\u00020\u001b2\n\u0010x\u001a\u0006\u0012\u0002\u0008\u000302H\u0000\u00a2\u0006\u0003\u0008\u00a7\u0001J!\u0010\u00a8\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020-2\u0007\u0010\u0090\u0001\u001a\u00020&H\u0000\u00a2\u0006\u0003\u0008\u00a9\u0001J!\u0010\u00aa\u0001\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cH\u0016\u00a2\u0006\u0002\u0010 J!\u0010\u00ab\u0001\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cH\u0016\u00a2\u0006\u0002\u0010 J#\u0010\u00ac\u0001\u001a\u00030\u00ad\u00012\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cH\u0016\u00a2\u0006\u0003\u0010\u00ae\u0001J#\u0010\u00af\u0001\u001a\u00030\u00ad\u00012\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cH\u0016\u00a2\u0006\u0003\u0010\u00ae\u0001J$\u0010\u00b0\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-01H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001J$\u0010\u00b3\u0001\u001a\u0002H\u007f\"\u0004\u0008\u0000\u0010\u007f2\u000c\u0010t\u001a\u0008\u0012\u0004\u0012\u0002H\u007f0\u001aH\u0082\u0008\u00a2\u0006\u0003\u0010\u0084\u0001J\u001d\u0010\u00b4\u0001\u001a\u00020\u00142\u0007\u0010\u0090\u0001\u001a\u00020&2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010-H\u0002J\u000f\u0010\u00b5\u0001\u001a\u00020\u001bH\u0000\u00a2\u0006\u0003\u0008\u00b6\u0001J\u0011\u0010\u00b7\u0001\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020\\H\u0002J\t\u0010\u00b8\u0001\u001a\u00020\u001bH\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0011\u0010\u0012R\u0012\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0002\u0008\u001cX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%8AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010)\u001a\u0008\u0012\u0004\u0012\u00020&0*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020-0,8AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R&\u00100\u001a\u0012\u0012\u0004\u0012\u00020-\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030201X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u00103R\u000e\u00104\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010\u0016R\u0014\u00107\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u0010\u0016R\u0014\u00109\u001a\u0008\u0012\u0004\u0012\u00020&0*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-01X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u00103R\u0014\u0010>\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010\u0016R\u0014\u0010?\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010\u0016R\u0011\u0010@\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010\u0016R\u000e\u0010A\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020&01X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u00103R\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020&01X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u00103R\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020-0,8AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010/R\u0014\u0010G\u001a\u00020HX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010JR\u0013\u0010\u0006\u001a\u00020\u00078\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010LR \u0010M\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008N\u0010\u0012\u001a\u0004\u0008O\u0010\u0016\"\u0004\u0008P\u0010QR\"\u0010R\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010-0Sj\n\u0012\u0006\u0012\u0004\u0018\u00010-`TX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010XR\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010[\u001a\u00020\\X\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008]\u0010\u0012\u001a\u0004\u0008^\u0010_\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00b9\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/CompositionImpl;",
        "Landroidx/compose/runtime/ControlledComposition;",
        "Landroidx/compose/runtime/ReusableComposition;",
        "Landroidx/compose/runtime/RecomposeScopeOwner;",
        "Landroidx/compose/runtime/CompositionServices;",
        "Landroidx/compose/runtime/PausableComposition;",
        "parent",
        "Landroidx/compose/runtime/CompositionContext;",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "recomposeContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V",
        "_recomposeContext",
        "abandonSet",
        "",
        "Landroidx/compose/runtime/RememberObserver;",
        "getAbandonSet$annotations",
        "()V",
        "areChildrenComposing",
        "",
        "getAreChildrenComposing",
        "()Z",
        "changes",
        "Landroidx/compose/runtime/changelist/ChangeList;",
        "composable",
        "Lkotlin/Function0;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "getComposable",
        "()Lkotlin/jvm/functions/Function2;",
        "setComposable",
        "(Lkotlin/jvm/functions/Function2;)V",
        "Lkotlin/jvm/functions/Function2;",
        "composer",
        "Landroidx/compose/runtime/ComposerImpl;",
        "conditionalScopes",
        "",
        "Landroidx/compose/runtime/RecomposeScopeImpl;",
        "getConditionalScopes$runtime_release",
        "()Ljava/util/List;",
        "conditionallyInvalidatedScopes",
        "Landroidx/collection/MutableScatterSet;",
        "derivedStateDependencies",
        "",
        "",
        "getDerivedStateDependencies$runtime_release",
        "()Ljava/util/Set;",
        "derivedStates",
        "Landroidx/compose/runtime/collection/ScopeMap;",
        "Landroidx/compose/runtime/DerivedState;",
        "Landroidx/collection/MutableScatterMap;",
        "disposed",
        "hasInvalidations",
        "getHasInvalidations",
        "hasPendingChanges",
        "getHasPendingChanges",
        "invalidatedScopes",
        "invalidationDelegate",
        "invalidationDelegateGroup",
        "",
        "invalidations",
        "isComposing",
        "isDisposed",
        "isRoot",
        "lateChanges",
        "lock",
        "observations",
        "observationsProcessed",
        "observedObjects",
        "getObservedObjects$runtime_release",
        "observerHolder",
        "Landroidx/compose/runtime/CompositionObserverHolder;",
        "getObserverHolder$runtime_release",
        "()Landroidx/compose/runtime/CompositionObserverHolder;",
        "getParent",
        "()Landroidx/compose/runtime/CompositionContext;",
        "pendingInvalidScopes",
        "getPendingInvalidScopes$runtime_release$annotations",
        "getPendingInvalidScopes$runtime_release",
        "setPendingInvalidScopes$runtime_release",
        "(Z)V",
        "pendingModifications",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Landroidx/compose/runtime/internal/AtomicReference;",
        "pendingPausedComposition",
        "Landroidx/compose/runtime/PausedCompositionImpl;",
        "getRecomposeContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "shouldPause",
        "Landroidx/compose/runtime/ShouldPauseCallback;",
        "slotTable",
        "Landroidx/compose/runtime/SlotTable;",
        "getSlotTable$runtime_release$annotations",
        "getSlotTable$runtime_release",
        "()Landroidx/compose/runtime/SlotTable;",
        "abandonChanges",
        "addPendingInvalidationsLocked",
        "value",
        "forgetConditionalScopes",
        "values",
        "applyChanges",
        "applyChangesInLocked",
        "applyLateChanges",
        "changesApplied",
        "cleanUpDerivedStateObservations",
        "composeContent",
        "content",
        "composeInitial",
        "composerStacksSizes",
        "composerStacksSizes$runtime_release",
        "deactivate",
        "delegateInvalidations",
        "R",
        "to",
        "groupIndex",
        "block",
        "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "dispose",
        "disposeUnusedMovableContent",
        "state",
        "Landroidx/compose/runtime/MovableContentState;",
        "drainPendingModificationsForCompositionLocked",
        "drainPendingModificationsLocked",
        "drainPendingModificationsOutOfBandLocked",
        "getAndSetShouldPauseCallback",
        "getCompositionService",
        "T",
        "key",
        "Landroidx/compose/runtime/CompositionServiceKey;",
        "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;",
        "guardChanges",
        "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "guardInvalidationsLocked",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "insertMovableContent",
        "references",
        "Lkotlin/Pair;",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "invalidate",
        "Landroidx/compose/runtime/InvalidationResult;",
        "scope",
        "instance",
        "invalidateAll",
        "invalidateChecked",
        "anchor",
        "Landroidx/compose/runtime/Anchor;",
        "invalidateGroupsWithKey",
        "invalidateScopeOfLocked",
        "observe",
        "Landroidx/compose/runtime/tooling/CompositionObserverHandle;",
        "observer",
        "Landroidx/compose/runtime/tooling/CompositionObserver;",
        "observe$runtime_release",
        "observesAnyOf",
        "pausedCompositionFinished",
        "pausedCompositionFinished$runtime_release",
        "prepareCompose",
        "recompose",
        "recomposeScopeReleased",
        "recordModificationsOf",
        "recordReadOf",
        "recordWriteOf",
        "removeDerivedStateObservation",
        "removeDerivedStateObservation$runtime_release",
        "removeObservation",
        "removeObservation$runtime_release",
        "setContent",
        "setContentWithReuse",
        "setPausableContent",
        "Landroidx/compose/runtime/PausedComposition;",
        "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;",
        "setPausableContentWithReuse",
        "takeInvalidations",
        "takeInvalidations-afanTW4",
        "()Landroidx/collection/MutableScatterMap;",
        "trackAbandonedValues",
        "tryImminentInvalidation",
        "updateMovingInvalidations",
        "updateMovingInvalidations$runtime_release",
        "validateRecomposeScopeAnchors",
        "verifyConsistent",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final _recomposeContext:Lkotlin/coroutines/CoroutineContext;

.field private final abandonSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/RememberObserver;",
            ">;"
        }
    .end annotation
.end field

.field private final applier:Landroidx/compose/runtime/Applier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/Applier<",
            "*>;"
        }
    .end annotation
.end field

.field private final changes:Landroidx/compose/runtime/changelist/ChangeList;

.field private composable:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final composer:Landroidx/compose/runtime/ComposerImpl;

.field private final conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final derivedStates:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private disposed:Z

.field private final invalidatedScopes:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            ">;"
        }
    .end annotation
.end field

.field private invalidationDelegate:Landroidx/compose/runtime/CompositionImpl;

.field private invalidationDelegateGroup:I

.field private invalidations:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final isRoot:Z

.field private final lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

.field private final lock:Ljava/lang/Object;

.field private final observations:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final observationsProcessed:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final observerHolder:Landroidx/compose/runtime/CompositionObserverHolder;

.field private final parent:Landroidx/compose/runtime/CompositionContext;

.field private pendingInvalidScopes:Z

.field private final pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

.field private shouldPause:Landroidx/compose/runtime/ShouldPauseCallback;

.field private final slotTable:Landroidx/compose/runtime/SlotTable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/CompositionImpl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V
    .locals 12
    .param p1, "parent"    # Landroidx/compose/runtime/CompositionContext;
    .param p2, "applier"    # Landroidx/compose/runtime/Applier;
    .param p3, "recomposeContext"    # Lkotlin/coroutines/CoroutineContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionContext;",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    .line 426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 432
    iput-object p1, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    .line 435
    iput-object p2, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    .line 449
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    .line 452
    nop

    .line 1355
    const/4 v0, 0x0

    .local v0, "ref$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "$i$f$makeSynchronizedObject":I
    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 452
    .end local v0    # "ref$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$makeSynchronizedObject":I
    iput-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .line 462
    new-instance v0, Landroidx/collection/MutableScatterSet;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Landroidx/collection/MutableScatterSet;->asMutableSet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    .line 467
    new-instance v0, Landroidx/compose/runtime/SlotTable;

    invoke-direct {v0}, Landroidx/compose/runtime/SlotTable;-><init>()V

    move-object v4, v0

    .local v4, "it":Landroidx/compose/runtime/SlotTable;
    const/4 v5, 0x0

    .line 468
    .local v5, "$i$a$-also-CompositionImpl$slotTable$1":I
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    invoke-virtual {v6}, Landroidx/compose/runtime/CompositionContext;->getCollectingCallByInformation$runtime_release()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v4}, Landroidx/compose/runtime/SlotTable;->collectCalledByInformation()V

    .line 469
    :cond_0
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    invoke-virtual {v6}, Landroidx/compose/runtime/CompositionContext;->getCollectingSourceInformation$runtime_release()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v4}, Landroidx/compose/runtime/SlotTable;->collectSourceInformation()V

    .line 470
    :cond_1
    nop

    .line 467
    .end local v4    # "it":Landroidx/compose/runtime/SlotTable;
    .end local v5    # "$i$a$-also-CompositionImpl$slotTable$1":I
    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    .line 476
    invoke-static {v1, v3, v1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    .line 486
    new-instance v0, Landroidx/collection/MutableScatterSet;

    invoke-direct {v0, v2, v3, v1}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->invalidatedScopes:Landroidx/collection/MutableScatterSet;

    .line 494
    new-instance v0, Landroidx/collection/MutableScatterSet;

    invoke-direct {v0, v2, v3, v1}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    .line 497
    invoke-static {v1, v3, v1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    .line 514
    new-instance v0, Landroidx/compose/runtime/changelist/ChangeList;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/ChangeList;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->changes:Landroidx/compose/runtime/changelist/ChangeList;

    .line 524
    new-instance v0, Landroidx/compose/runtime/changelist/ChangeList;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/ChangeList;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    .line 533
    invoke-static {v1, v3, v1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observationsProcessed:Landroidx/collection/MutableScatterMap;

    .line 542
    invoke-static {v1, v3, v1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 565
    new-instance v0, Landroidx/compose/runtime/CompositionObserverHolder;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3, v1}, Landroidx/compose/runtime/CompositionObserverHolder;-><init>(Landroidx/compose/runtime/tooling/CompositionObserver;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observerHolder:Landroidx/compose/runtime/CompositionObserverHolder;

    .line 578
    nop

    .line 569
    new-instance v4, Landroidx/compose/runtime/ComposerImpl;

    .line 570
    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    .line 571
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    .line 572
    iget-object v7, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    .line 573
    iget-object v8, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    .line 574
    iget-object v9, p0, Landroidx/compose/runtime/CompositionImpl;->changes:Landroidx/compose/runtime/changelist/ChangeList;

    .line 575
    iget-object v10, p0, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    .line 576
    move-object v11, p0

    check-cast v11, Landroidx/compose/runtime/ControlledComposition;

    .line 569
    invoke-direct/range {v4 .. v11}, Landroidx/compose/runtime/ComposerImpl;-><init>(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V

    .line 578
    nop

    .line 1356
    move-object v0, v4

    .local v0, "it":Landroidx/compose/runtime/ComposerImpl;
    const/4 v1, 0x0

    .line 578
    .local v1, "$i$a$-also-CompositionImpl$composer$1":I
    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    move-object v3, v0

    check-cast v3, Landroidx/compose/runtime/Composer;

    invoke-virtual {v2, v3}, Landroidx/compose/runtime/CompositionContext;->registerComposer$runtime_release(Landroidx/compose/runtime/Composer;)V

    .end local v0    # "it":Landroidx/compose/runtime/ComposerImpl;
    .end local v1    # "$i$a$-also-CompositionImpl$composer$1":I
    iput-object v4, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    .line 581
    iput-object p3, p0, Landroidx/compose/runtime/CompositionImpl;->_recomposeContext:Lkotlin/coroutines/CoroutineContext;

    .line 588
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    instance-of v0, v0, Landroidx/compose/runtime/Recomposer;

    iput-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->isRoot:Z

    .line 601
    sget-object v0, Landroidx/compose/runtime/ComposableSingletons$CompositionKt;->INSTANCE:Landroidx/compose/runtime/ComposableSingletons$CompositionKt;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposableSingletons$CompositionKt;->getLambda-1$runtime_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composable:Lkotlin/jvm/functions/Function2;

    .line 427
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 427
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 436
    const/4 p3, 0x0

    .line 427
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/runtime/CompositionImpl;-><init>(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V

    .line 437
    return-void
.end method

.method public static final synthetic access$getLock$p(Landroidx/compose/runtime/CompositionImpl;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/CompositionImpl;

    .line 426
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic access$getObservations$p(Landroidx/compose/runtime/CompositionImpl;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/CompositionImpl;

    .line 426
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method

.method private final addPendingInvalidationsLocked(Ljava/lang/Object;Z)V
    .locals 25
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "forgetConditionalScopes"    # Z

    .line 894
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v3, 0x0

    .line 1488
    .local v3, "$i$f$forEachScopeOf-impl":I
    invoke-virtual {v2, v1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1489
    .local v4, "value$iv":Ljava/lang/Object;
    if-eqz v4, :cond_d

    .line 1492
    instance-of v5, v4, Landroidx/collection/MutableScatterSet;

    if-eqz v5, :cond_a

    .line 1493
    move-object v5, v4

    check-cast v5, Landroidx/collection/MutableScatterSet;

    check-cast v5, Landroidx/collection/ScatterSet;

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 1494
    .local v6, "$i$f$forEach":I
    nop

    .line 1495
    iget-object v7, v5, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1496
    .local v7, "elements$iv$iv":[Ljava/lang/Object;
    move-object v8, v5

    .local v8, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v9, 0x0

    .line 1497
    .local v9, "$i$f$forEachIndex":I
    nop

    .line 1498
    iget-object v10, v8, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1499
    .local v10, "m$iv$iv$iv":[J
    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    .line 1501
    .local v11, "lastIndex$iv$iv$iv":I
    const/4 v12, 0x0

    .local v12, "i$iv$iv$iv":I
    if-gt v12, v11, :cond_7

    .line 1502
    :goto_0
    aget-wide v13, v10, v12

    .line 1503
    .local v13, "slot$iv$iv$iv":J
    move-wide v15, v13

    .local v15, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1504
    .local v17, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-wide v2, v15

    move-object v15, v4

    move-object/from16 v16, v5

    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v2, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v15, "value$iv":Ljava/lang/Object;
    .local v16, "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v18, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v19, "$i$f$forEachScopeOf-impl":I
    not-long v4, v2

    const/16 v20, 0x7

    shl-long v4, v4, v20

    and-long/2addr v4, v2

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v4, v20

    .line 1503
    .end local v2    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v17    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v20

    if-eqz v2, :cond_6

    .line 1505
    sub-int v2, v12, v11

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 1506
    .local v2, "bitCount$iv$iv$iv":I
    const/4 v4, 0x0

    .local v4, "j$iv$iv$iv":I
    :goto_1
    if-ge v4, v2, :cond_5

    .line 1507
    const-wide/16 v20, 0xff

    and-long v20, v13, v20

    .local v20, "value$iv$iv$iv$iv":J
    const/4 v5, 0x0

    .line 1508
    .local v5, "$i$f$isFull":I
    const-wide/16 v22, 0x80

    cmp-long v17, v20, v22

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1507
    .end local v5    # "$i$f$isFull":I
    .end local v20    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v17, :cond_4

    .line 1509
    shl-int/lit8 v5, v12, 0x3

    add-int/2addr v5, v4

    .line 1510
    .local v5, "index$iv$iv$iv":I
    move/from16 v17, v5

    .local v17, "index$iv$iv":I
    const/16 v20, 0x0

    .line 1496
    .local v20, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    aget-object v21, v7, v17

    move/from16 v22, v3

    move-object/from16 v3, v21

    check-cast v3, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v3, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/16 v21, 0x0

    .line 895
    .local v21, "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$1":I
    nop

    .line 896
    move/from16 v23, v4

    .end local v4    # "j$iv$iv$iv":I
    .local v23, "j$iv$iv$iv":I
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->observationsProcessed:Landroidx/collection/MutableScatterMap;

    invoke-static {v4, v1, v3}, Landroidx/compose/runtime/collection/ScopeMap;->remove-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 897
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v4

    move/from16 v24, v5

    .end local v5    # "index$iv$iv$iv":I
    .local v24, "index$iv$iv$iv":I
    sget-object v5, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    if-eq v4, v5, :cond_3

    .line 899
    invoke-virtual {v3}, Landroidx/compose/runtime/RecomposeScopeImpl;->isConditional()Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez p2, :cond_1

    .line 900
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v4, v3}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 902
    :cond_1
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->invalidatedScopes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v4, v3}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 896
    .end local v24    # "index$iv$iv$iv":I
    .restart local v5    # "index$iv$iv$iv":I
    :cond_2
    move/from16 v24, v5

    .line 905
    .end local v5    # "index$iv$iv$iv":I
    .restart local v24    # "index$iv$iv$iv":I
    :cond_3
    :goto_3
    nop

    .line 1496
    .end local v3    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v21    # "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$1":I
    nop

    .line 1510
    .end local v17    # "index$iv$iv":I
    .end local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_4

    .line 1507
    .end local v23    # "j$iv$iv$iv":I
    .end local v24    # "index$iv$iv$iv":I
    .restart local v4    # "j$iv$iv$iv":I
    :cond_4
    move/from16 v22, v3

    move/from16 v23, v4

    .line 1512
    .end local v4    # "j$iv$iv$iv":I
    .restart local v23    # "j$iv$iv$iv":I
    :goto_4
    shr-long v13, v13, v22

    .line 1506
    add-int/lit8 v4, v23, 0x1

    move/from16 v3, v22

    .end local v23    # "j$iv$iv$iv":I
    .restart local v4    # "j$iv$iv$iv":I
    goto :goto_1

    :cond_5
    move/from16 v22, v3

    move/from16 v23, v4

    .line 1514
    .end local v4    # "j$iv$iv$iv":I
    if-ne v2, v3, :cond_9

    .line 1501
    .end local v2    # "bitCount$iv$iv$iv":I
    .end local v13    # "slot$iv$iv$iv":J
    :cond_6
    if-eq v12, v11, :cond_8

    add-int/lit8 v12, v12, 0x1

    move-object v4, v15

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move/from16 v3, v19

    goto/16 :goto_0

    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$forEachScopeOf-impl":I
    .local v4, "value$iv":Ljava/lang/Object;
    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_7
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object v15, v4

    move-object/from16 v16, v5

    .line 1517
    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "i$iv$iv$iv":I
    .restart local v15    # "value$iv":Ljava/lang/Object;
    .restart local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "$i$f$forEachScopeOf-impl":I
    :cond_8
    nop

    .line 1518
    .end local v8    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "$i$f$forEachIndex":I
    .end local v10    # "m$iv$iv$iv":[J
    .end local v11    # "lastIndex$iv$iv$iv":I
    :cond_9
    nop

    .end local v6    # "$i$f$forEach":I
    .end local v7    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    goto :goto_6

    .line 1519
    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    .restart local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "$i$f$forEachScopeOf-impl":I
    .restart local v4    # "value$iv":Ljava/lang/Object;
    :cond_a
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object v15, v4

    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .restart local v15    # "value$iv":Ljava/lang/Object;
    .restart local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "$i$f$forEachScopeOf-impl":I
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v2, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v3, 0x0

    .line 895
    .local v3, "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$1":I
    nop

    .line 896
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->observationsProcessed:Landroidx/collection/MutableScatterMap;

    invoke-static {v4, v1, v2}, Landroidx/compose/runtime/collection/ScopeMap;->remove-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    .line 897
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v4

    sget-object v5, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    if-eq v4, v5, :cond_c

    .line 899
    invoke-virtual {v2}, Landroidx/compose/runtime/RecomposeScopeImpl;->isConditional()Z

    move-result v4

    if-eqz v4, :cond_b

    if-nez p2, :cond_b

    .line 900
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v4, v2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 902
    :cond_b
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->invalidatedScopes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v4, v2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 905
    :cond_c
    :goto_5
    nop

    .line 1519
    .end local v2    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v3    # "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$1":I
    goto :goto_6

    .line 1489
    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$forEachScopeOf-impl":I
    .restart local v4    # "value$iv":Ljava/lang/Object;
    :cond_d
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object v15, v4

    .line 1522
    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .restart local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "$i$f$forEachScopeOf-impl":I
    :goto_6
    nop

    .line 906
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    return-void
.end method

.method private final addPendingInvalidationsLocked(Ljava/util/Set;Z)V
    .locals 51
    .param p1, "values"    # Ljava/util/Set;
    .param p2, "forgetConditionalScopes"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    .line 909
    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    .local v2, "$this$fastForEach$iv":Ljava/util/Set;
    const/4 v3, 0x0

    .line 1523
    .local v3, "$i$f$fastForEach":I
    nop

    .line 1524
    instance-of v4, v2, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    if-eqz v4, :cond_11

    .line 1525
    move-object v4, v2

    check-cast v4, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    invoke-virtual {v4}, Landroidx/compose/runtime/collection/ScatterSetWrapper;->getSet$runtime_release()Landroidx/collection/ScatterSet;

    move-result-object v4

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v16, 0x0

    .line 1526
    .local v16, "$i$f$forEach":I
    nop

    .line 1527
    const-wide/16 v17, 0x80

    iget-object v6, v4, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1528
    .local v6, "elements$iv$iv":[Ljava/lang/Object;
    move-object v7, v4

    .local v7, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v19, 0x0

    .line 1529
    .local v19, "$i$f$forEachIndex":I
    nop

    .line 1530
    const-wide/16 v20, 0xff

    iget-object v8, v7, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1531
    .local v8, "m$iv$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 1533
    .local v9, "lastIndex$iv$iv$iv":I
    const/16 v22, 0x7

    const/4 v10, 0x0

    .local v10, "i$iv$iv$iv":I
    if-gt v10, v9, :cond_e

    .line 1534
    :goto_0
    aget-wide v23, v8, v10

    .line 1535
    .local v23, "slot$iv$iv$iv":J
    move-wide/from16 v25, v23

    .local v25, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v27, 0x0

    .line 1536
    .local v27, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v11, v25

    const/16 v13, 0x8

    const-wide v28, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .end local v25    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    not-long v14, v11

    shl-long v14, v14, v22

    and-long/2addr v14, v11

    and-long v11, v14, v28

    .line 1535
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v27    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v28

    if-eqz v11, :cond_d

    .line 1537
    sub-int v11, v10, v9

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v14, v11, 0x8

    .line 1538
    .local v14, "bitCount$iv$iv$iv":I
    const/4 v11, 0x0

    .local v11, "j$iv$iv$iv":I
    :goto_1
    if-ge v11, v14, :cond_c

    .line 1539
    and-long v26, v23, v20

    .local v26, "value$iv$iv$iv$iv":J
    const/4 v12, 0x0

    .line 1540
    .local v12, "$i$f$isFull":I
    cmp-long v15, v26, v17

    if-gez v15, :cond_0

    const/4 v12, 0x1

    goto :goto_2

    :cond_0
    const/4 v12, 0x0

    .line 1539
    .end local v12    # "$i$f$isFull":I
    .end local v26    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v12, :cond_b

    .line 1541
    shl-int/lit8 v12, v10, 0x3

    add-int/2addr v12, v11

    .line 1542
    .local v12, "index$iv$iv$iv":I
    move v15, v12

    .local v15, "index$iv$iv":I
    const/16 v26, 0x0

    .line 1528
    .local v26, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    move/from16 v27, v13

    aget-object v13, v6, v15

    .local v13, "value":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 910
    .local v30, "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    instance-of v5, v13, Landroidx/compose/runtime/RecomposeScopeImpl;

    if-eqz v5, :cond_1

    .line 911
    move-object v5, v13

    check-cast v5, Landroidx/compose/runtime/RecomposeScopeImpl;

    move-object/from16 v32, v2

    const/4 v2, 0x0

    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .local v32, "$this$fastForEach$iv":Ljava/util/Set;
    invoke-virtual {v5, v2}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move/from16 v33, v3

    move-object/from16 v47, v4

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    goto/16 :goto_8

    .line 913
    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    :cond_1
    move-object/from16 v32, v2

    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    invoke-direct {v0, v13, v1}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/lang/Object;Z)V

    .line 914
    iget-object v2, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v5, 0x0

    .line 1543
    .local v5, "$i$f$forEachScopeOf-impl":I
    move/from16 v33, v3

    .end local v3    # "$i$f$fastForEach":I
    .local v33, "$i$f$fastForEach":I
    invoke-virtual {v2, v13}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1544
    .local v3, "value$iv":Ljava/lang/Object;
    if-eqz v3, :cond_a

    .line 1547
    move-object/from16 v34, v2

    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v34, "arg0$iv":Landroidx/collection/MutableScatterMap;
    instance-of v2, v3, Landroidx/collection/MutableScatterSet;

    if-eqz v2, :cond_9

    .line 1548
    move-object v2, v3

    check-cast v2, Landroidx/collection/MutableScatterSet;

    check-cast v2, Landroidx/collection/ScatterSet;

    .local v2, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v35, 0x0

    .line 1549
    .local v35, "$i$f$forEach":I
    nop

    .line 1550
    move-object/from16 v36, v3

    .end local v3    # "value$iv":Ljava/lang/Object;
    .local v36, "value$iv":Ljava/lang/Object;
    iget-object v3, v2, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1551
    .local v3, "elements$iv$iv":[Ljava/lang/Object;
    move-object/from16 v37, v2

    .local v37, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v38, 0x0

    .line 1552
    .local v38, "$i$f$forEachIndex":I
    nop

    .line 1553
    move-object/from16 v39, v2

    move-object/from16 v37, v3

    .end local v3    # "elements$iv$iv":[Ljava/lang/Object;
    .local v2, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v37, "elements$iv$iv":[Ljava/lang/Object;
    .local v39, "this_$iv$iv":Landroidx/collection/ScatterSet;
    iget-object v3, v2, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1554
    .local v3, "m$iv$iv$iv":[J
    move-object/from16 v40, v2

    .end local v2    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v40, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    array-length v2, v3

    add-int/lit8 v2, v2, -0x2

    .line 1556
    .local v2, "lastIndex$iv$iv$iv":I
    move-object/from16 v41, v3

    .end local v3    # "m$iv$iv$iv":[J
    .local v41, "m$iv$iv$iv":[J
    const/4 v3, 0x0

    .local v3, "i$iv$iv$iv":I
    if-gt v3, v2, :cond_6

    .line 1557
    :goto_3
    aget-wide v42, v41, v3

    .line 1558
    .local v42, "slot$iv$iv$iv":J
    move-wide/from16 v44, v42

    .local v44, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v46, 0x0

    .line 1559
    .local v46, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v47, v4

    move/from16 v48, v5

    move-wide/from16 v4, v44

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v44, "elements$iv$iv":[Ljava/lang/Object;
    .local v45, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v47, "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v48, "$i$f$forEachScopeOf-impl":I
    not-long v6, v4

    shl-long v6, v6, v22

    and-long/2addr v6, v4

    and-long v4, v6, v28

    .line 1558
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v46    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v4, v4, v28

    if-eqz v4, :cond_5

    .line 1560
    sub-int v4, v3, v2

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    .line 1561
    .local v4, "bitCount$iv$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv$iv":I
    :goto_4
    if-ge v5, v4, :cond_4

    .line 1562
    and-long v6, v42, v20

    .local v6, "value$iv$iv$iv$iv":J
    const/16 v46, 0x0

    .line 1563
    .local v46, "$i$f$isFull":I
    cmp-long v49, v6, v17

    if-gez v49, :cond_2

    const/4 v6, 0x1

    goto :goto_5

    :cond_2
    const/4 v6, 0x0

    .line 1562
    .end local v6    # "value$iv$iv$iv$iv":J
    .end local v46    # "$i$f$isFull":I
    :goto_5
    if-eqz v6, :cond_3

    .line 1564
    shl-int/lit8 v6, v3, 0x3

    add-int/2addr v6, v5

    .line 1565
    .local v6, "index$iv$iv$iv":I
    move v7, v6

    .local v7, "index$iv$iv":I
    const/16 v46, 0x0

    .line 1551
    .local v46, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    aget-object v49, v37, v7

    move/from16 v50, v5

    .end local v5    # "j$iv$iv$iv":I
    .local v50, "j$iv$iv$iv":I
    move-object/from16 v5, v49

    check-cast v5, Landroidx/compose/runtime/DerivedState;

    .local v5, "it":Landroidx/compose/runtime/DerivedState;
    const/16 v49, 0x0

    .line 915
    .local v49, "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    invoke-direct {v0, v5, v1}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/lang/Object;Z)V

    .line 916
    nop

    .line 1551
    .end local v5    # "it":Landroidx/compose/runtime/DerivedState;
    .end local v49    # "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    nop

    .line 1565
    .end local v7    # "index$iv$iv":I
    .end local v46    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_6

    .line 1562
    .end local v6    # "index$iv$iv$iv":I
    .end local v50    # "j$iv$iv$iv":I
    .local v5, "j$iv$iv$iv":I
    :cond_3
    move/from16 v50, v5

    .line 1567
    .end local v5    # "j$iv$iv$iv":I
    .restart local v50    # "j$iv$iv$iv":I
    :goto_6
    shr-long v42, v42, v27

    .line 1561
    add-int/lit8 v5, v50, 0x1

    .end local v50    # "j$iv$iv$iv":I
    .restart local v5    # "j$iv$iv$iv":I
    goto :goto_4

    :cond_4
    move/from16 v50, v5

    .line 1569
    .end local v5    # "j$iv$iv$iv":I
    move/from16 v5, v27

    if-ne v4, v5, :cond_8

    .line 1556
    .end local v4    # "bitCount$iv$iv$iv":I
    .end local v42    # "slot$iv$iv$iv":J
    :cond_5
    if-eq v3, v2, :cond_7

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v6, v44

    move-object/from16 v7, v45

    move-object/from16 v4, v47

    move/from16 v5, v48

    const/16 v27, 0x8

    goto :goto_3

    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v48    # "$i$f$forEachScopeOf-impl":I
    .local v4, "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v5, "$i$f$forEachScopeOf-impl":I
    .local v6, "elements$iv$iv":[Ljava/lang/Object;
    .local v7, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_6
    move-object/from16 v47, v4

    move/from16 v48, v5

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .line 1572
    .end local v3    # "i$iv$iv$iv":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v48    # "$i$f$forEachScopeOf-impl":I
    :cond_7
    nop

    .line 1573
    .end local v2    # "lastIndex$iv$iv$iv":I
    .end local v38    # "$i$f$forEachIndex":I
    .end local v40    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v41    # "m$iv$iv$iv":[J
    :cond_8
    nop

    .end local v35    # "$i$f$forEach":I
    .end local v37    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v39    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    goto :goto_7

    .line 1574
    .end local v36    # "value$iv":Ljava/lang/Object;
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v48    # "$i$f$forEachScopeOf-impl":I
    .local v3, "value$iv":Ljava/lang/Object;
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v5    # "$i$f$forEachScopeOf-impl":I
    .restart local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_9
    move-object/from16 v36, v3

    move-object/from16 v47, v4

    move/from16 v48, v5

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v36    # "value$iv":Ljava/lang/Object;
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v48    # "$i$f$forEachScopeOf-impl":I
    move-object/from16 v2, v36

    check-cast v2, Landroidx/compose/runtime/DerivedState;

    .local v2, "it":Landroidx/compose/runtime/DerivedState;
    const/4 v3, 0x0

    .line 915
    .local v3, "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    invoke-direct {v0, v2, v1}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/lang/Object;Z)V

    .line 916
    nop

    .line 1574
    .end local v2    # "it":Landroidx/compose/runtime/DerivedState;
    .end local v3    # "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    goto :goto_7

    .line 1544
    .end local v34    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v36    # "value$iv":Ljava/lang/Object;
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v48    # "$i$f$forEachScopeOf-impl":I
    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "value$iv":Ljava/lang/Object;
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v5    # "$i$f$forEachScopeOf-impl":I
    .restart local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_a
    move-object/from16 v34, v2

    move-object/from16 v36, v3

    move-object/from16 v47, v4

    move/from16 v48, v5

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .line 1577
    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v34    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v48    # "$i$f$forEachScopeOf-impl":I
    :goto_7
    nop

    .line 918
    .end local v34    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v48    # "$i$f$forEachScopeOf-impl":I
    :goto_8
    nop

    .line 1528
    .end local v13    # "value":Ljava/lang/Object;
    .end local v30    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    nop

    .line 1542
    .end local v15    # "index$iv$iv":I
    .end local v26    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_9

    .line 1539
    .end local v12    # "index$iv$iv$iv":I
    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v33    # "$i$f$fastForEach":I
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v2, "$this$fastForEach$iv":Ljava/util/Set;
    .local v3, "$i$f$fastForEach":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_b
    move-object/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v47, v4

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .line 1578
    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v3    # "$i$f$fastForEach":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v33    # "$i$f$fastForEach":I
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :goto_9
    const/16 v13, 0x8

    shr-long v23, v23, v13

    .line 1538
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v32

    move/from16 v3, v33

    move-object/from16 v6, v44

    move-object/from16 v7, v45

    move-object/from16 v4, v47

    goto/16 :goto_1

    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v33    # "$i$f$fastForEach":I
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v3    # "$i$f$fastForEach":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_c
    move-object/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v47, v4

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .line 1580
    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v3    # "$i$f$fastForEach":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v11    # "j$iv$iv$iv":I
    .restart local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v33    # "$i$f$fastForEach":I
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    if-ne v14, v13, :cond_10

    goto :goto_a

    .line 1535
    .end local v14    # "bitCount$iv$iv$iv":I
    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v33    # "$i$f$fastForEach":I
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v3    # "$i$f$fastForEach":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_d
    move-object/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v47, v4

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    .line 1533
    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v3    # "$i$f$fastForEach":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v23    # "slot$iv$iv$iv":J
    .restart local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v33    # "$i$f$fastForEach":I
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :goto_a
    if-eq v10, v9, :cond_f

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v32

    move/from16 v3, v33

    move-object/from16 v6, v44

    move-object/from16 v7, v45

    move-object/from16 v4, v47

    goto/16 :goto_0

    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v33    # "$i$f$fastForEach":I
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v3    # "$i$f$fastForEach":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_e
    move-object/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v47, v4

    move-object/from16 v44, v6

    move-object/from16 v45, v7

    const-wide v28, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1583
    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v3    # "$i$f$fastForEach":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v10    # "i$iv$iv$iv":I
    .restart local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v33    # "$i$f$fastForEach":I
    .restart local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_f
    nop

    .line 1584
    .end local v8    # "m$iv$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv$iv":I
    .end local v19    # "$i$f$forEachIndex":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    :cond_10
    nop

    .end local v16    # "$i$f$forEach":I
    .end local v44    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v47    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    goto/16 :goto_11

    .line 1585
    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v33    # "$i$f$fastForEach":I
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v3    # "$i$f$fastForEach":I
    :cond_11
    move-object/from16 v32, v2

    move/from16 v33, v3

    const-wide/16 v17, 0x80

    const-wide/16 v20, 0xff

    const/16 v22, 0x7

    const-wide v28, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .end local v2    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v3    # "$i$f$fastForEach":I
    .restart local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v33    # "$i$f$fastForEach":I
    move-object/from16 v2, v32

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1586
    .local v3, "$i$f$forEach":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv$iv":Ljava/lang/Object;
    move-object v6, v5

    .local v6, "value":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 910
    .local v7, "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    instance-of v8, v6, Landroidx/compose/runtime/RecomposeScopeImpl;

    if-eqz v8, :cond_12

    .line 911
    move-object v8, v6

    check-cast v8, Landroidx/compose/runtime/RecomposeScopeImpl;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-object/from16 v16, v2

    move/from16 v23, v3

    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v36, v6

    move/from16 v37, v7

    goto/16 :goto_10

    .line 913
    :cond_12
    const/4 v9, 0x0

    invoke-direct {v0, v6, v1}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/lang/Object;Z)V

    .line 914
    iget-object v8, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    .local v8, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v10, 0x0

    .line 1543
    .local v10, "$i$f$forEachScopeOf-impl":I
    invoke-virtual {v8, v6}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .line 1544
    .local v11, "value$iv":Ljava/lang/Object;
    if-eqz v11, :cond_1b

    .line 1547
    instance-of v12, v11, Landroidx/collection/MutableScatterSet;

    if-eqz v12, :cond_1a

    .line 1548
    move-object v12, v11

    check-cast v12, Landroidx/collection/MutableScatterSet;

    check-cast v12, Landroidx/collection/ScatterSet;

    .local v12, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v14, 0x0

    .line 1587
    .local v14, "$i$f$forEach":I
    nop

    .line 1588
    iget-object v15, v12, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1589
    .local v15, "elements$iv$iv":[Ljava/lang/Object;
    move-object/from16 v16, v12

    .local v16, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v19, 0x0

    .line 1590
    .restart local v19    # "$i$f$forEachIndex":I
    nop

    .line 1591
    move-object/from16 v9, v16

    .end local v16    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v9, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    iget-object v13, v9, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1592
    .local v13, "m$iv$iv$iv":[J
    move-object/from16 v16, v2

    .end local v2    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .local v16, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    array-length v2, v13

    add-int/lit8 v2, v2, -0x2

    .line 1594
    .local v2, "lastIndex$iv$iv$iv":I
    move/from16 v23, v3

    .end local v3    # "$i$f$forEach":I
    .local v23, "$i$f$forEach":I
    const/4 v3, 0x0

    .local v3, "i$iv$iv$iv":I
    if-gt v3, v2, :cond_17

    .line 1595
    :goto_c
    aget-wide v34, v13, v3

    .line 1596
    .local v34, "slot$iv$iv$iv":J
    move-wide/from16 v36, v34

    .local v36, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v24, 0x0

    .line 1597
    .local v24, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-wide/from16 v4, v36

    move-object/from16 v36, v6

    move/from16 v37, v7

    .end local v5    # "element$iv$iv":Ljava/lang/Object;
    .end local v6    # "value":Ljava/lang/Object;
    .end local v7    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v30, "element$iv$iv":Ljava/lang/Object;
    .local v36, "value":Ljava/lang/Object;
    .local v37, "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    not-long v6, v4

    shl-long v6, v6, v22

    and-long/2addr v6, v4

    and-long v4, v6, v28

    .line 1596
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v24    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v4, v4, v28

    if-eqz v4, :cond_16

    .line 1598
    sub-int v4, v3, v2

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    .line 1599
    .local v4, "bitCount$iv$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv$iv":I
    :goto_d
    if-ge v6, v4, :cond_15

    .line 1600
    and-long v38, v34, v20

    .local v38, "value$iv$iv$iv$iv":J
    const/4 v7, 0x0

    .line 1601
    .local v7, "$i$f$isFull":I
    cmp-long v24, v38, v17

    if-gez v24, :cond_13

    const/4 v7, 0x1

    goto :goto_e

    :cond_13
    const/4 v7, 0x0

    .line 1600
    .end local v7    # "$i$f$isFull":I
    .end local v38    # "value$iv$iv$iv$iv":J
    :goto_e
    if-eqz v7, :cond_14

    .line 1602
    shl-int/lit8 v7, v3, 0x3

    add-int/2addr v7, v6

    .line 1603
    .local v7, "index$iv$iv$iv":I
    move/from16 v24, v7

    .local v24, "index$iv$iv":I
    const/16 v27, 0x0

    .line 1589
    .local v27, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    aget-object v38, v15, v24

    move-object/from16 v5, v38

    check-cast v5, Landroidx/compose/runtime/DerivedState;

    .local v5, "it":Landroidx/compose/runtime/DerivedState;
    const/16 v38, 0x0

    .line 915
    .local v38, "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    invoke-direct {v0, v5, v1}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/lang/Object;Z)V

    .line 916
    nop

    .line 1589
    .end local v5    # "it":Landroidx/compose/runtime/DerivedState;
    .end local v38    # "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    nop

    .line 1603
    .end local v24    # "index$iv$iv":I
    .end local v27    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    nop

    .line 1605
    .end local v7    # "index$iv$iv$iv":I
    :cond_14
    const/16 v5, 0x8

    shr-long v34, v34, v5

    .line 1599
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_15
    const/16 v5, 0x8

    .line 1607
    .end local v6    # "j$iv$iv$iv":I
    if-ne v4, v5, :cond_19

    .line 1594
    .end local v4    # "bitCount$iv$iv$iv":I
    .end local v34    # "slot$iv$iv$iv":J
    :cond_16
    if-eq v3, v2, :cond_18

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v4, v26

    move-object/from16 v5, v30

    move-object/from16 v6, v36

    move/from16 v7, v37

    goto :goto_c

    .end local v30    # "element$iv$iv":Ljava/lang/Object;
    .end local v36    # "value":Ljava/lang/Object;
    .end local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .local v5, "element$iv$iv":Ljava/lang/Object;
    .local v6, "value":Ljava/lang/Object;
    .local v7, "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    :cond_17
    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v36, v6

    move/from16 v37, v7

    .line 1610
    .end local v3    # "i$iv$iv$iv":I
    .end local v5    # "element$iv$iv":Ljava/lang/Object;
    .end local v6    # "value":Ljava/lang/Object;
    .end local v7    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .restart local v30    # "element$iv$iv":Ljava/lang/Object;
    .restart local v36    # "value":Ljava/lang/Object;
    .restart local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    :cond_18
    nop

    .line 1611
    .end local v2    # "lastIndex$iv$iv$iv":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "m$iv$iv$iv":[J
    .end local v19    # "$i$f$forEachIndex":I
    :cond_19
    nop

    .end local v12    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v14    # "$i$f$forEach":I
    .end local v15    # "elements$iv$iv":[Ljava/lang/Object;
    goto :goto_f

    .line 1574
    .end local v16    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$forEach":I
    .end local v30    # "element$iv$iv":Ljava/lang/Object;
    .end local v36    # "value":Ljava/lang/Object;
    .end local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .local v2, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .local v3, "$i$f$forEach":I
    .restart local v5    # "element$iv$iv":Ljava/lang/Object;
    .restart local v6    # "value":Ljava/lang/Object;
    .restart local v7    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    :cond_1a
    move-object/from16 v16, v2

    move/from16 v23, v3

    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v36, v6

    move/from16 v37, v7

    .end local v2    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    .end local v5    # "element$iv$iv":Ljava/lang/Object;
    .end local v6    # "value":Ljava/lang/Object;
    .end local v7    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .restart local v16    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .restart local v23    # "$i$f$forEach":I
    .restart local v30    # "element$iv$iv":Ljava/lang/Object;
    .restart local v36    # "value":Ljava/lang/Object;
    .restart local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    move-object v2, v11

    check-cast v2, Landroidx/compose/runtime/DerivedState;

    .local v2, "it":Landroidx/compose/runtime/DerivedState;
    const/4 v3, 0x0

    .line 915
    .local v3, "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    invoke-direct {v0, v2, v1}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/lang/Object;Z)V

    .line 916
    nop

    .line 1574
    .end local v2    # "it":Landroidx/compose/runtime/DerivedState;
    .end local v3    # "$i$a$-forEachScopeOf-impl-CompositionImpl$addPendingInvalidationsLocked$2$1":I
    goto :goto_f

    .line 1544
    .end local v16    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$forEach":I
    .end local v30    # "element$iv$iv":Ljava/lang/Object;
    .end local v36    # "value":Ljava/lang/Object;
    .end local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .local v2, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .local v3, "$i$f$forEach":I
    .restart local v5    # "element$iv$iv":Ljava/lang/Object;
    .restart local v6    # "value":Ljava/lang/Object;
    .restart local v7    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    :cond_1b
    move-object/from16 v16, v2

    move/from16 v23, v3

    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v36, v6

    move/from16 v37, v7

    .line 1577
    .end local v2    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    .end local v5    # "element$iv$iv":Ljava/lang/Object;
    .end local v6    # "value":Ljava/lang/Object;
    .end local v7    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    .end local v11    # "value$iv":Ljava/lang/Object;
    .restart local v16    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .restart local v23    # "$i$f$forEach":I
    .restart local v30    # "element$iv$iv":Ljava/lang/Object;
    .restart local v36    # "value":Ljava/lang/Object;
    .restart local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    :goto_f
    nop

    .line 918
    .end local v8    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$f$forEachScopeOf-impl":I
    :goto_10
    nop

    .line 1586
    .end local v36    # "value":Ljava/lang/Object;
    .end local v37    # "$i$a$-fastForEach-CompositionImpl$addPendingInvalidationsLocked$2":I
    move-object/from16 v2, v16

    move/from16 v3, v23

    move-object/from16 v4, v26

    .end local v30    # "element$iv$iv":Ljava/lang/Object;
    goto/16 :goto_b

    .line 1612
    .end local v16    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$forEach":I
    .restart local v2    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$forEach":I
    :cond_1c
    move-object/from16 v16, v2

    move/from16 v23, v3

    .line 1613
    .end local v2    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    :goto_11
    nop

    .line 920
    .end local v32    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v33    # "$i$f$fastForEach":I
    iget-object v2, v0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    .line 921
    .local v2, "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    iget-object v3, v0, Landroidx/compose/runtime/CompositionImpl;->invalidatedScopes:Landroidx/collection/MutableScatterSet;

    .line 922
    .local v3, "invalidatedScopes":Landroidx/collection/MutableScatterSet;
    const-string/jumbo v4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    const-string/jumbo v6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    if-eqz v1, :cond_32

    invoke-virtual {v2}, Landroidx/collection/MutableScatterSet;->isNotEmpty()Z

    move-result v7

    if-eqz v7, :cond_32

    .line 923
    iget-object v7, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    .local v7, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v8, 0x0

    .line 1614
    .local v8, "$i$f$removeScopeIf-impl":I
    move-object v9, v7

    .local v9, "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    const/4 v10, 0x0

    .line 1615
    .local v10, "$i$f$removeIf":I
    move-object v11, v9

    check-cast v11, Landroidx/collection/ScatterMap;

    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v12, 0x0

    .line 1616
    .local v12, "$i$f$forEachIndexed":I
    iget-object v14, v11, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1617
    .local v14, "m$iv$iv$iv":[J
    array-length v13, v14

    add-int/lit8 v15, v13, -0x2

    .line 1619
    .local v15, "lastIndex$iv$iv$iv":I
    const/4 v13, 0x0

    .local v13, "i$iv$iv$iv":I
    if-gt v13, v15, :cond_2f

    .line 1620
    :goto_12
    aget-wide v23, v14, v13

    .line 1621
    .local v23, "slot$iv$iv$iv":J
    move-wide/from16 v26, v23

    .local v26, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1622
    .local v16, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v19, v6

    move-wide/from16 v5, v26

    move-object/from16 v26, v7

    move/from16 v27, v8

    .end local v7    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .local v5, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v26, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v27, "$i$f$removeScopeIf-impl":I
    not-long v7, v5

    shl-long v7, v7, v22

    and-long/2addr v7, v5

    and-long v5, v7, v28

    .line 1621
    .end local v5    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v5, v5, v28

    if-eqz v5, :cond_2e

    .line 1623
    sub-int v5, v13, v15

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v39, 0x8

    rsub-int/lit8 v5, v5, 0x8

    .line 1624
    move v6, v13

    .end local v13    # "i$iv$iv$iv":I
    .local v5, "bitCount$iv$iv$iv":I
    .local v6, "i$iv$iv$iv":I
    const/4 v7, 0x0

    .local v7, "j$iv$iv$iv":I
    :goto_13
    if-ge v7, v5, :cond_2d

    .line 1625
    and-long v30, v23, v20

    .local v30, "value$iv$iv$iv$iv":J
    const/4 v8, 0x0

    .line 1626
    .local v8, "$i$f$isFull":I
    cmp-long v16, v30, v17

    if-gez v16, :cond_1d

    const/4 v8, 0x1

    goto :goto_14

    :cond_1d
    const/4 v8, 0x0

    .line 1625
    .end local v8    # "$i$f$isFull":I
    .end local v30    # "value$iv$iv$iv$iv":J
    :goto_14
    if-eqz v8, :cond_2c

    .line 1627
    shl-int/lit8 v8, v6, 0x3

    add-int/2addr v8, v7

    .line 1628
    .local v8, "index$iv$iv$iv":I
    move/from16 v16, v8

    .local v16, "index$iv$iv":I
    const/16 v30, 0x0

    .line 1629
    .local v30, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    iget-object v13, v9, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v13, v13, v16

    iget-object v13, v9, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v13, v13, v16

    .local v13, "value$iv":Ljava/lang/Object;
    const/16 v31, 0x0

    .line 1630
    .local v31, "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    nop

    .line 1631
    instance-of v1, v13, Landroidx/collection/MutableScatterSet;

    if-eqz v1, :cond_28

    .line 1632
    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v13

    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 1633
    .local v1, "set$iv":Landroidx/collection/MutableScatterSet;
    move-object/from16 v32, v1

    .local v32, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    const/16 v33, 0x0

    .line 1634
    .local v33, "$i$f$removeIf":I
    move-object/from16 v34, v1

    move/from16 v32, v7

    .end local v7    # "j$iv$iv$iv":I
    .local v1, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .local v32, "j$iv$iv$iv":I
    .local v34, "set$iv":Landroidx/collection/MutableScatterSet;
    iget-object v7, v1, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 1635
    .local v7, "elements$iv$iv":[Ljava/lang/Object;
    move-object/from16 v35, v7

    .end local v7    # "elements$iv$iv":[Ljava/lang/Object;
    .local v35, "elements$iv$iv":[Ljava/lang/Object;
    move-object v7, v1

    check-cast v7, Landroidx/collection/ScatterSet;

    .local v7, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v36, 0x0

    .line 1636
    .local v36, "$i$f$forEachIndex":I
    nop

    .line 1637
    move/from16 v37, v8

    .end local v8    # "index$iv$iv$iv":I
    .local v37, "index$iv$iv$iv":I
    iget-object v8, v7, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1638
    .local v8, "m$iv$iv$iv":[J
    move-object/from16 v38, v7

    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v38, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    array-length v7, v8

    add-int/lit8 v7, v7, -0x2

    .line 1640
    .local v7, "lastIndex$iv$iv$iv":I
    move-object/from16 v40, v8

    .end local v8    # "m$iv$iv$iv":[J
    .local v40, "m$iv$iv$iv":[J
    const/4 v8, 0x0

    .local v8, "i$iv$iv$iv":I
    if-gt v8, v7, :cond_25

    .line 1641
    :goto_15
    aget-wide v41, v40, v8

    .line 1642
    .local v41, "slot$iv$iv$iv":J
    move-wide/from16 v43, v41

    .local v43, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v45, 0x0

    .line 1643
    .local v45, "$i$f$maskEmptyOrDeleted":I
    move/from16 v46, v10

    move-object/from16 v47, v11

    move-wide/from16 v10, v43

    move/from16 v43, v12

    move-object/from16 v44, v13

    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "value$iv":Ljava/lang/Object;
    .local v10, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v43, "$i$f$forEachIndexed":I
    .local v44, "value$iv":Ljava/lang/Object;
    .local v46, "$i$f$removeIf":I
    .local v47, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    not-long v12, v10

    shl-long v12, v12, v22

    and-long/2addr v12, v10

    and-long v10, v12, v28

    .line 1642
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v45    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v28

    if-eqz v10, :cond_24

    .line 1644
    sub-int v10, v8, v7

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 1645
    move-object/from16 v11, v44

    .end local v44    # "value$iv":Ljava/lang/Object;
    .local v10, "bitCount$iv$iv$iv":I
    .local v11, "value$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .local v12, "j$iv$iv$iv":I
    :goto_16
    if-ge v12, v10, :cond_23

    .line 1646
    and-long v44, v41, v20

    .local v44, "value$iv$iv$iv$iv":J
    const/16 v39, 0x0

    .line 1647
    .local v39, "$i$f$isFull":I
    cmp-long v48, v44, v17

    if-gez v48, :cond_1e

    const/16 v39, 0x1

    goto :goto_17

    :cond_1e
    const/16 v39, 0x0

    .line 1646
    .end local v39    # "$i$f$isFull":I
    .end local v44    # "value$iv$iv$iv$iv":J
    :goto_17
    if-eqz v39, :cond_22

    .line 1648
    shl-int/lit8 v39, v8, 0x3

    add-int v39, v39, v12

    .line 1649
    .local v39, "index$iv$iv$iv":I
    move/from16 v44, v39

    .local v44, "index$iv$iv":I
    const/16 v45, 0x0

    .line 1650
    .local v45, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    aget-object v48, v35, v44

    move-object/from16 v13, v48

    check-cast v13, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v13, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/16 v48, 0x0

    .line 924
    .local v48, "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$3":I
    invoke-virtual {v2, v13}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v50

    if-nez v50, :cond_20

    invoke-virtual {v3, v13}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v50

    if-eqz v50, :cond_1f

    goto :goto_18

    :cond_1f
    const/4 v13, 0x0

    goto :goto_19

    :cond_20
    :goto_18
    const/4 v13, 0x1

    .line 1650
    .end local v13    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v48    # "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$3":I
    :goto_19
    if-eqz v13, :cond_21

    .line 1651
    move/from16 v13, v44

    .end local v44    # "index$iv$iv":I
    .local v13, "index$iv$iv":I
    invoke-virtual {v1, v13}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    goto :goto_1a

    .line 1650
    .end local v13    # "index$iv$iv":I
    .restart local v44    # "index$iv$iv":I
    :cond_21
    move/from16 v13, v44

    .line 1653
    .end local v44    # "index$iv$iv":I
    .restart local v13    # "index$iv$iv":I
    :goto_1a
    nop

    .line 1649
    .end local v13    # "index$iv$iv":I
    .end local v45    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    nop

    .line 1654
    .end local v39    # "index$iv$iv$iv":I
    :cond_22
    const/16 v13, 0x8

    shr-long v41, v41, v13

    .line 1645
    add-int/lit8 v12, v12, 0x1

    goto :goto_16

    :cond_23
    const/16 v13, 0x8

    .line 1656
    .end local v12    # "j$iv$iv$iv":I
    if-ne v10, v13, :cond_27

    goto :goto_1b

    .line 1642
    .end local v10    # "bitCount$iv$iv$iv":I
    .end local v11    # "value$iv":Ljava/lang/Object;
    .local v44, "value$iv":Ljava/lang/Object;
    :cond_24
    move-object/from16 v11, v44

    .line 1640
    .end local v41    # "slot$iv$iv$iv":J
    .end local v44    # "value$iv":Ljava/lang/Object;
    .restart local v11    # "value$iv":Ljava/lang/Object;
    :goto_1b
    if-eq v8, v7, :cond_26

    add-int/lit8 v8, v8, 0x1

    move-object v13, v11

    move/from16 v12, v43

    move/from16 v10, v46

    move-object/from16 v11, v47

    goto :goto_15

    .end local v43    # "$i$f$forEachIndexed":I
    .end local v46    # "$i$f$removeIf":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v10, "$i$f$removeIf":I
    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v12, "$i$f$forEachIndexed":I
    .local v13, "value$iv":Ljava/lang/Object;
    :cond_25
    move/from16 v46, v10

    move-object/from16 v47, v11

    move/from16 v43, v12

    move-object v11, v13

    .line 1659
    .end local v8    # "i$iv$iv$iv":I
    .end local v10    # "$i$f$removeIf":I
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "value$iv":Ljava/lang/Object;
    .local v11, "value$iv":Ljava/lang/Object;
    .restart local v43    # "$i$f$forEachIndexed":I
    .restart local v46    # "$i$f$removeIf":I
    .restart local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_26
    nop

    .line 1660
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v36    # "$i$f$forEachIndex":I
    .end local v38    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v40    # "m$iv$iv$iv":[J
    :cond_27
    nop

    .line 1661
    .end local v1    # "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .end local v33    # "$i$f$removeIf":I
    .end local v35    # "elements$iv$iv":[Ljava/lang/Object;
    invoke-virtual/range {v34 .. v34}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v1

    move v7, v1

    move-object/from16 v1, v19

    .end local v34    # "set$iv":Landroidx/collection/MutableScatterSet;
    goto :goto_1d

    .line 1664
    .end local v32    # "j$iv$iv$iv":I
    .end local v37    # "index$iv$iv$iv":I
    .end local v43    # "$i$f$forEachIndexed":I
    .end local v46    # "$i$f$removeIf":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v7, "j$iv$iv$iv":I
    .local v8, "index$iv$iv$iv":I
    .restart local v10    # "$i$f$removeIf":I
    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    .restart local v13    # "value$iv":Ljava/lang/Object;
    :cond_28
    move/from16 v32, v7

    move/from16 v37, v8

    move/from16 v46, v10

    move-object/from16 v47, v11

    move/from16 v43, v12

    move-object v11, v13

    .end local v7    # "j$iv$iv$iv":I
    .end local v8    # "index$iv$iv$iv":I
    .end local v10    # "$i$f$removeIf":I
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "value$iv":Ljava/lang/Object;
    .local v11, "value$iv":Ljava/lang/Object;
    .restart local v32    # "j$iv$iv$iv":I
    .restart local v37    # "index$iv$iv$iv":I
    .restart local v43    # "$i$f$forEachIndexed":I
    .restart local v46    # "$i$f$removeIf":I
    .restart local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    move-object/from16 v1, v19

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v11

    check-cast v7, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v7, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v8, 0x0

    .line 924
    .local v8, "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$3":I
    invoke-virtual {v2, v7}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2a

    invoke-virtual {v3, v7}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_29

    goto :goto_1c

    :cond_29
    const/4 v7, 0x0

    goto :goto_1d

    :cond_2a
    :goto_1c
    const/4 v7, 0x1

    .line 1664
    .end local v7    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v8    # "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$3":I
    :goto_1d
    nop

    .line 1666
    nop

    .line 1629
    .end local v11    # "value$iv":Ljava/lang/Object;
    .end local v31    # "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    if-eqz v7, :cond_2b

    .line 1667
    move/from16 v8, v16

    .end local v16    # "index$iv$iv":I
    .local v8, "index$iv$iv":I
    invoke-virtual {v9, v8}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    goto :goto_1e

    .line 1629
    .end local v8    # "index$iv$iv":I
    .restart local v16    # "index$iv$iv":I
    :cond_2b
    move/from16 v8, v16

    .line 1669
    .end local v16    # "index$iv$iv":I
    .restart local v8    # "index$iv$iv":I
    :goto_1e
    nop

    .line 1628
    .end local v8    # "index$iv$iv":I
    .end local v30    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    goto :goto_1f

    .line 1625
    .end local v32    # "j$iv$iv$iv":I
    .end local v37    # "index$iv$iv$iv":I
    .end local v43    # "$i$f$forEachIndexed":I
    .end local v46    # "$i$f$removeIf":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v7, "j$iv$iv$iv":I
    .restart local v10    # "$i$f$removeIf":I
    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    :cond_2c
    move/from16 v32, v7

    move/from16 v46, v10

    move-object/from16 v47, v11

    move/from16 v43, v12

    move-object/from16 v1, v19

    .line 1670
    .end local v7    # "j$iv$iv$iv":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .restart local v32    # "j$iv$iv$iv":I
    .restart local v43    # "$i$f$forEachIndexed":I
    .restart local v46    # "$i$f$removeIf":I
    .restart local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :goto_1f
    const/16 v13, 0x8

    shr-long v23, v23, v13

    .line 1624
    add-int/lit8 v7, v32, 0x1

    move-object/from16 v19, v1

    move/from16 v12, v43

    move/from16 v10, v46

    move-object/from16 v11, v47

    move/from16 v1, p2

    .end local v32    # "j$iv$iv$iv":I
    .restart local v7    # "j$iv$iv$iv":I
    goto/16 :goto_13

    .end local v43    # "$i$f$forEachIndexed":I
    .end local v46    # "$i$f$removeIf":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    :cond_2d
    move/from16 v32, v7

    move/from16 v46, v10

    move-object/from16 v47, v11

    move/from16 v43, v12

    move-object/from16 v1, v19

    const/16 v13, 0x8

    .line 1672
    .end local v7    # "j$iv$iv$iv":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .restart local v43    # "$i$f$forEachIndexed":I
    .restart local v46    # "$i$f$removeIf":I
    .restart local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    if-ne v5, v13, :cond_31

    goto :goto_20

    .line 1621
    .end local v5    # "bitCount$iv$iv$iv":I
    .end local v6    # "i$iv$iv$iv":I
    .end local v43    # "$i$f$forEachIndexed":I
    .end local v46    # "$i$f$removeIf":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    .local v13, "i$iv$iv$iv":I
    :cond_2e
    move/from16 v46, v10

    move-object/from16 v47, v11

    move/from16 v43, v12

    move v6, v13

    move-object/from16 v1, v19

    .line 1619
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "i$iv$iv$iv":I
    .end local v23    # "slot$iv$iv$iv":J
    .restart local v6    # "i$iv$iv$iv":I
    .restart local v43    # "$i$f$forEachIndexed":I
    .restart local v46    # "$i$f$removeIf":I
    .restart local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :goto_20
    if-eq v6, v15, :cond_30

    add-int/lit8 v5, v6, 0x1

    move-object v6, v1

    move v13, v5

    move-object/from16 v7, v26

    move/from16 v8, v27

    move/from16 v12, v43

    move/from16 v10, v46

    move-object/from16 v11, v47

    move/from16 v1, p2

    .end local v6    # "i$iv$iv$iv":I
    .local v5, "i$iv$iv$iv":I
    goto/16 :goto_12

    .end local v5    # "i$iv$iv$iv":I
    .end local v26    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v27    # "$i$f$removeScopeIf-impl":I
    .end local v43    # "$i$f$forEachIndexed":I
    .end local v46    # "$i$f$removeIf":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v7, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v8, "$i$f$removeScopeIf-impl":I
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    .restart local v13    # "i$iv$iv$iv":I
    :cond_2f
    move-object/from16 v26, v7

    move/from16 v27, v8

    move/from16 v46, v10

    move-object/from16 v47, v11

    move/from16 v43, v12

    .line 1675
    .end local v7    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "i$iv$iv$iv":I
    .restart local v26    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v27    # "$i$f$removeScopeIf-impl":I
    .restart local v43    # "$i$f$forEachIndexed":I
    .restart local v46    # "$i$f$removeIf":I
    .restart local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_30
    nop

    .line 1676
    .end local v14    # "m$iv$iv$iv":[J
    .end local v15    # "lastIndex$iv$iv$iv":I
    .end local v43    # "$i$f$forEachIndexed":I
    .end local v47    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_31
    nop

    .line 1677
    .end local v9    # "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    .end local v46    # "$i$f$removeIf":I
    nop

    .line 926
    .end local v26    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v27    # "$i$f$removeScopeIf-impl":I
    invoke-virtual {v2}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 927
    invoke-direct {v0}, Landroidx/compose/runtime/CompositionImpl;->cleanUpDerivedStateObservations()V

    move-object/from16 v31, v2

    goto/16 :goto_2d

    .line 922
    :cond_32
    move-object v1, v6

    .line 928
    invoke-virtual {v3}, Landroidx/collection/MutableScatterSet;->isNotEmpty()Z

    move-result v5

    if-eqz v5, :cond_44

    .line 929
    iget-object v5, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    .local v5, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v6, 0x0

    .line 1678
    .local v6, "$i$f$removeScopeIf-impl":I
    move-object v7, v5

    .local v7, "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    const/4 v8, 0x0

    .line 1679
    .local v8, "$i$f$removeIf":I
    move-object v9, v7

    check-cast v9, Landroidx/collection/ScatterMap;

    .local v9, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v10, 0x0

    .line 1680
    .local v10, "$i$f$forEachIndexed":I
    iget-object v11, v9, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1681
    .local v11, "m$iv$iv$iv":[J
    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    .line 1683
    .local v12, "lastIndex$iv$iv$iv":I
    const/4 v14, 0x0

    .local v14, "i$iv$iv$iv":I
    if-gt v14, v12, :cond_41

    .line 1684
    :goto_21
    aget-wide v15, v11, v14

    .line 1685
    .local v15, "slot$iv$iv$iv":J
    move-wide/from16 v23, v15

    .local v23, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v19, 0x0

    .line 1686
    .local v19, "$i$f$maskEmptyOrDeleted":I
    move/from16 v26, v14

    move-wide/from16 v13, v23

    move-object/from16 v23, v5

    move/from16 v24, v6

    .end local v5    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v6    # "$i$f$removeScopeIf-impl":I
    .end local v14    # "i$iv$iv$iv":I
    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v23, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v24, "$i$f$removeScopeIf-impl":I
    .local v26, "i$iv$iv$iv":I
    not-long v5, v13

    shl-long v5, v5, v22

    and-long/2addr v5, v13

    and-long v5, v5, v28

    .line 1685
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v19    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v5, v5, v28

    if-eqz v5, :cond_40

    .line 1687
    sub-int v14, v26, v12

    not-int v5, v14

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v14, v5, 0x8

    .line 1688
    .local v14, "bitCount$iv$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv$iv":I
    :goto_22
    if-ge v5, v14, :cond_3f

    .line 1689
    and-long v30, v15, v20

    .local v30, "value$iv$iv$iv$iv":J
    const/4 v6, 0x0

    .line 1690
    .local v6, "$i$f$isFull":I
    cmp-long v19, v30, v17

    if-gez v19, :cond_33

    const/4 v6, 0x1

    goto :goto_23

    :cond_33
    const/4 v6, 0x0

    .line 1689
    .end local v6    # "$i$f$isFull":I
    .end local v30    # "value$iv$iv$iv$iv":J
    :goto_23
    if-eqz v6, :cond_3e

    .line 1691
    shl-int/lit8 v6, v26, 0x3

    add-int/2addr v6, v5

    .line 1692
    .local v6, "index$iv$iv$iv":I
    move/from16 v19, v6

    .local v19, "index$iv$iv":I
    const/16 v27, 0x0

    .line 1693
    .local v27, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    iget-object v13, v7, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v13, v13, v19

    iget-object v13, v7, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v13, v13, v19

    .local v13, "value$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 1694
    .local v30, "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    nop

    .line 1695
    instance-of v0, v13, Landroidx/collection/MutableScatterSet;

    if-eqz v0, :cond_3c

    .line 1696
    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v13

    check-cast v0, Landroidx/collection/MutableScatterSet;

    .line 1697
    .local v0, "set$iv":Landroidx/collection/MutableScatterSet;
    move-object/from16 v31, v0

    .local v31, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    const/16 v32, 0x0

    .line 1698
    .local v32, "$i$f$removeIf":I
    move-object/from16 v33, v0

    move-object/from16 v31, v2

    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .local v0, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .local v31, "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .local v33, "set$iv":Landroidx/collection/MutableScatterSet;
    iget-object v2, v0, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 1699
    .local v2, "elements$iv$iv":[Ljava/lang/Object;
    move-object/from16 v34, v2

    .end local v2    # "elements$iv$iv":[Ljava/lang/Object;
    .local v34, "elements$iv$iv":[Ljava/lang/Object;
    move-object v2, v0

    check-cast v2, Landroidx/collection/ScatterSet;

    .local v2, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v35, 0x0

    .line 1700
    .local v35, "$i$f$forEachIndex":I
    nop

    .line 1701
    move-object/from16 v36, v4

    iget-object v4, v2, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1702
    .local v4, "m$iv$iv$iv":[J
    move-object/from16 v37, v2

    .end local v2    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v37, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    array-length v2, v4

    add-int/lit8 v2, v2, -0x2

    .line 1704
    .local v2, "lastIndex$iv$iv$iv":I
    move-object/from16 v38, v4

    .end local v4    # "m$iv$iv$iv":[J
    .local v38, "m$iv$iv$iv":[J
    const/4 v4, 0x0

    .local v4, "i$iv$iv$iv":I
    if-gt v4, v2, :cond_39

    .line 1705
    :goto_24
    aget-wide v40, v38, v4

    .line 1706
    .local v40, "slot$iv$iv$iv":J
    move-wide/from16 v42, v40

    .local v42, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v44, 0x0

    .line 1707
    .local v44, "$i$f$maskEmptyOrDeleted":I
    move/from16 v45, v5

    move/from16 v46, v6

    move-wide/from16 v5, v42

    move/from16 v42, v8

    move-object/from16 v43, v9

    .end local v6    # "index$iv$iv$iv":I
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v5, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v42, "$i$f$removeIf":I
    .local v43, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v45, "j$iv$iv$iv":I
    .local v46, "index$iv$iv$iv":I
    not-long v8, v5

    shl-long v8, v8, v22

    and-long/2addr v8, v5

    and-long v5, v8, v28

    .line 1706
    .end local v5    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v44    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v5, v5, v28

    if-eqz v5, :cond_38

    .line 1708
    sub-int v5, v4, v2

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v39, 0x8

    rsub-int/lit8 v5, v5, 0x8

    .line 1709
    move-object v6, v13

    .end local v13    # "value$iv":Ljava/lang/Object;
    .local v5, "bitCount$iv$iv$iv":I
    .local v6, "value$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .local v8, "j$iv$iv$iv":I
    :goto_25
    if-ge v8, v5, :cond_37

    .line 1710
    and-long v47, v40, v20

    .local v47, "value$iv$iv$iv$iv":J
    const/4 v9, 0x0

    .line 1711
    .local v9, "$i$f$isFull":I
    cmp-long v39, v47, v17

    if-gez v39, :cond_34

    const/4 v9, 0x1

    goto :goto_26

    :cond_34
    const/4 v9, 0x0

    .line 1710
    .end local v9    # "$i$f$isFull":I
    .end local v47    # "value$iv$iv$iv$iv":J
    :goto_26
    if-eqz v9, :cond_36

    .line 1712
    shl-int/lit8 v9, v4, 0x3

    add-int/2addr v9, v8

    .line 1713
    .local v9, "index$iv$iv$iv":I
    move/from16 v39, v9

    .local v39, "index$iv$iv":I
    const/16 v44, 0x0

    .line 1714
    .local v44, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    aget-object v47, v34, v39

    move-object/from16 v13, v47

    check-cast v13, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v13, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/16 v47, 0x0

    .line 929
    .local v47, "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$4":I
    invoke-virtual {v3, v13}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    .line 1714
    .end local v13    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v47    # "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$4":I
    if-eqz v13, :cond_35

    .line 1715
    move/from16 v13, v39

    .end local v39    # "index$iv$iv":I
    .local v13, "index$iv$iv":I
    invoke-virtual {v0, v13}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    goto :goto_27

    .line 1714
    .end local v13    # "index$iv$iv":I
    .restart local v39    # "index$iv$iv":I
    :cond_35
    move/from16 v13, v39

    .line 1717
    .end local v39    # "index$iv$iv":I
    .restart local v13    # "index$iv$iv":I
    :goto_27
    nop

    .line 1713
    .end local v13    # "index$iv$iv":I
    .end local v44    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    nop

    .line 1718
    .end local v9    # "index$iv$iv$iv":I
    :cond_36
    const/16 v13, 0x8

    shr-long v40, v40, v13

    .line 1709
    add-int/lit8 v8, v8, 0x1

    goto :goto_25

    :cond_37
    const/16 v13, 0x8

    .line 1720
    .end local v8    # "j$iv$iv$iv":I
    if-ne v5, v13, :cond_3b

    goto :goto_28

    .line 1706
    .end local v5    # "bitCount$iv$iv$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .local v13, "value$iv":Ljava/lang/Object;
    :cond_38
    move-object v6, v13

    .line 1704
    .end local v13    # "value$iv":Ljava/lang/Object;
    .end local v40    # "slot$iv$iv$iv":J
    .restart local v6    # "value$iv":Ljava/lang/Object;
    :goto_28
    if-eq v4, v2, :cond_3a

    add-int/lit8 v4, v4, 0x1

    move-object v13, v6

    move/from16 v8, v42

    move-object/from16 v9, v43

    move/from16 v5, v45

    move/from16 v6, v46

    goto :goto_24

    .end local v42    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v45    # "j$iv$iv$iv":I
    .end local v46    # "index$iv$iv$iv":I
    .local v5, "j$iv$iv$iv":I
    .local v6, "index$iv$iv$iv":I
    .local v8, "$i$f$removeIf":I
    .local v9, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v13    # "value$iv":Ljava/lang/Object;
    :cond_39
    move/from16 v45, v5

    move/from16 v46, v6

    move/from16 v42, v8

    move-object/from16 v43, v9

    move-object v6, v13

    .line 1723
    .end local v4    # "i$iv$iv$iv":I
    .end local v5    # "j$iv$iv$iv":I
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v13    # "value$iv":Ljava/lang/Object;
    .local v6, "value$iv":Ljava/lang/Object;
    .restart local v42    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v45    # "j$iv$iv$iv":I
    .restart local v46    # "index$iv$iv$iv":I
    :cond_3a
    nop

    .line 1724
    .end local v2    # "lastIndex$iv$iv$iv":I
    .end local v35    # "$i$f$forEachIndex":I
    .end local v37    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v38    # "m$iv$iv$iv":[J
    :cond_3b
    nop

    .line 1725
    .end local v0    # "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .end local v32    # "$i$f$removeIf":I
    .end local v34    # "elements$iv$iv":[Ljava/lang/Object;
    invoke-virtual/range {v33 .. v33}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v0

    .end local v33    # "set$iv":Landroidx/collection/MutableScatterSet;
    goto :goto_29

    .line 1728
    .end local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v42    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v45    # "j$iv$iv$iv":I
    .end local v46    # "index$iv$iv$iv":I
    .local v2, "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v5    # "j$iv$iv$iv":I
    .local v6, "index$iv$iv$iv":I
    .restart local v8    # "$i$f$removeIf":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v13    # "value$iv":Ljava/lang/Object;
    :cond_3c
    move-object/from16 v31, v2

    move-object/from16 v36, v4

    move/from16 v45, v5

    move/from16 v46, v6

    move/from16 v42, v8

    move-object/from16 v43, v9

    move-object v6, v13

    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v5    # "j$iv$iv$iv":I
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v13    # "value$iv":Ljava/lang/Object;
    .local v6, "value$iv":Ljava/lang/Object;
    .restart local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v42    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v45    # "j$iv$iv$iv":I
    .restart local v46    # "index$iv$iv$iv":I
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v6

    check-cast v0, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v0, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v2, 0x0

    .line 929
    .local v2, "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$4":I
    invoke-virtual {v3, v0}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    move v0, v4

    .line 1728
    .end local v0    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v2    # "$i$a$-removeScopeIf-impl-CompositionImpl$addPendingInvalidationsLocked$4":I
    :goto_29
    nop

    .line 1730
    nop

    .line 1693
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v30    # "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    if-eqz v0, :cond_3d

    .line 1731
    move/from16 v6, v19

    .end local v19    # "index$iv$iv":I
    .local v6, "index$iv$iv":I
    invoke-virtual {v7, v6}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    goto :goto_2a

    .line 1693
    .end local v6    # "index$iv$iv":I
    .restart local v19    # "index$iv$iv":I
    :cond_3d
    move/from16 v6, v19

    .line 1733
    .end local v19    # "index$iv$iv":I
    .restart local v6    # "index$iv$iv":I
    :goto_2a
    nop

    .line 1692
    .end local v6    # "index$iv$iv":I
    .end local v27    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    goto :goto_2b

    .line 1689
    .end local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v42    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v45    # "j$iv$iv$iv":I
    .end local v46    # "index$iv$iv$iv":I
    .local v2, "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v5    # "j$iv$iv$iv":I
    .restart local v8    # "$i$f$removeIf":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_3e
    move-object/from16 v31, v2

    move-object/from16 v36, v4

    move/from16 v45, v5

    move/from16 v42, v8

    move-object/from16 v43, v9

    .line 1734
    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v5    # "j$iv$iv$iv":I
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v42    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v45    # "j$iv$iv$iv":I
    :goto_2b
    const/16 v13, 0x8

    shr-long/2addr v15, v13

    .line 1688
    add-int/lit8 v5, v45, 0x1

    move-object/from16 v0, p0

    move-object/from16 v2, v31

    move-object/from16 v4, v36

    move/from16 v8, v42

    move-object/from16 v9, v43

    .end local v45    # "j$iv$iv$iv":I
    .restart local v5    # "j$iv$iv$iv":I
    goto/16 :goto_22

    .end local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v42    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v8    # "$i$f$removeIf":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_3f
    move-object/from16 v31, v2

    move-object/from16 v36, v4

    move/from16 v45, v5

    move/from16 v42, v8

    move-object/from16 v43, v9

    const/16 v13, 0x8

    .line 1736
    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v5    # "j$iv$iv$iv":I
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v42    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    if-ne v14, v13, :cond_43

    goto :goto_2c

    .line 1685
    .end local v14    # "bitCount$iv$iv$iv":I
    .end local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v42    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v8    # "$i$f$removeIf":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_40
    move-object/from16 v31, v2

    move-object/from16 v36, v4

    move/from16 v42, v8

    move-object/from16 v43, v9

    const/16 v13, 0x8

    .line 1683
    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v15    # "slot$iv$iv$iv":J
    .restart local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v42    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :goto_2c
    move/from16 v14, v26

    .end local v26    # "i$iv$iv$iv":I
    .local v14, "i$iv$iv$iv":I
    if-eq v14, v12, :cond_42

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move-object/from16 v5, v23

    move/from16 v6, v24

    move-object/from16 v2, v31

    move-object/from16 v4, v36

    move/from16 v8, v42

    move-object/from16 v9, v43

    goto/16 :goto_21

    .end local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v24    # "$i$f$removeScopeIf-impl":I
    .end local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v42    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .local v5, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v6, "$i$f$removeScopeIf-impl":I
    .restart local v8    # "$i$f$removeIf":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_41
    move-object/from16 v31, v2

    move-object/from16 v23, v5

    move/from16 v24, v6

    move/from16 v42, v8

    move-object/from16 v43, v9

    .line 1739
    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .end local v5    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v6    # "$i$f$removeScopeIf-impl":I
    .end local v8    # "$i$f$removeIf":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v14    # "i$iv$iv$iv":I
    .restart local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v24    # "$i$f$removeScopeIf-impl":I
    .restart local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v42    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_42
    nop

    .line 1740
    .end local v10    # "$i$f$forEachIndexed":I
    .end local v11    # "m$iv$iv$iv":[J
    .end local v12    # "lastIndex$iv$iv$iv":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_43
    nop

    .line 1741
    .end local v7    # "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    .end local v42    # "$i$f$removeIf":I
    nop

    .line 930
    .end local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v24    # "$i$f$removeScopeIf-impl":I
    invoke-direct/range {p0 .. p0}, Landroidx/compose/runtime/CompositionImpl;->cleanUpDerivedStateObservations()V

    .line 931
    invoke-virtual {v3}, Landroidx/collection/MutableScatterSet;->clear()V

    goto :goto_2d

    .line 928
    .end local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    :cond_44
    move-object/from16 v31, v2

    .line 933
    .end local v2    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    .restart local v31    # "conditionallyInvalidatedScopes":Landroidx/collection/MutableScatterSet;
    :goto_2d
    return-void
.end method

.method private final applyChangesInLocked(Landroidx/compose/runtime/changelist/ChangeList;)V
    .locals 52
    .param p1, "changes"    # Landroidx/compose/runtime/changelist/ChangeList;

    .line 1026
    move-object/from16 v1, p0

    new-instance v0, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v0, v2}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    move-object v2, v0

    .line 1027
    .local v2, "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    nop

    .line 1028
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/changelist/ChangeList;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    if-eqz v0, :cond_1

    .line 1058
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/ChangeList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v0, :cond_0

    .line 1059
    invoke-virtual {v2}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    .line 1028
    :cond_0
    return-void

    .line 1029
    :cond_1
    :try_start_1
    const-string v0, "Compose:applyChanges"

    move-object v3, v0

    .local v3, "sectionName$iv":Ljava/lang/String;
    const/4 v4, 0x0

    .line 1991
    .local v4, "$i$f$trace":I
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v3}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    move-object v5, v0

    .line 1992
    .local v5, "token$iv":Ljava/lang/Object;
    nop

    .line 1993
    const/4 v6, 0x0

    .line 1030
    .local v6, "$i$a$-trace-CompositionImpl$applyChangesInLocked$1":I
    :try_start_2
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    if-eqz v0, :cond_2

    :try_start_3
    invoke-virtual {v0}, Landroidx/compose/runtime/PausedCompositionImpl;->getPausableApplier$runtime_release()Landroidx/compose/runtime/RecordingApplier;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Landroidx/compose/runtime/Applier;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 2002
    .end local v6    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$1":I
    :catchall_0
    move-exception v0

    move-object/from16 v16, v2

    goto/16 :goto_e

    .line 1030
    .restart local v6    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$1":I
    :cond_2
    :try_start_4
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    :goto_0
    move-object v7, v0

    .line 1031
    .local v7, "applier":Landroidx/compose/runtime/Applier;
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    if-eqz v0, :cond_3

    :try_start_5
    invoke-virtual {v0}, Landroidx/compose/runtime/PausedCompositionImpl;->getRememberManager$runtime_release()Landroidx/compose/runtime/internal/RememberEventDispatcher;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v0, :cond_4

    :cond_3
    move-object v0, v2

    :cond_4
    move-object v8, v0

    .line 1032
    .local v8, "rememberManager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :try_start_6
    invoke-interface {v7}, Landroidx/compose/runtime/Applier;->onBeginChanges()V

    .line 1035
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    move-object v9, v0

    .local v9, "this_$iv":Landroidx/compose/runtime/SlotTable;
    const/4 v10, 0x0

    .line 1994
    .local v10, "$i$f$write":I
    invoke-virtual {v9}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    move-object v11, v0

    .local v11, "writer$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v12, 0x0

    .line 1995
    .local v12, "$i$a$-let-SlotTable$write$1$iv":I
    const/4 v13, 0x0

    .line 1996
    .local v13, "normalClose$iv":Z
    nop

    .line 1997
    move-object v0, v11

    .local v0, "slots":Landroidx/compose/runtime/SlotWriter;
    const/4 v14, 0x0

    .line 1036
    .local v14, "$i$a$-write-CompositionImpl$applyChangesInLocked$1$1":I
    :try_start_7
    move-object v15, v8

    check-cast v15, Landroidx/compose/runtime/RememberManager;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object/from16 v16, v2

    move-object/from16 v2, p1

    .end local v2    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .local v16, "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :try_start_8
    invoke-virtual {v2, v7, v0, v15}, Landroidx/compose/runtime/changelist/ChangeList;->executeAndFlushAllPendingChanges(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    .line 1037
    nop

    .end local v0    # "slots":Landroidx/compose/runtime/SlotWriter;
    .end local v14    # "$i$a$-write-CompositionImpl$applyChangesInLocked$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1997
    nop

    .line 1998
    .local v0, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1997
    .local v14, "$i$a$-also-SlotTable$write$1$1$iv":I
    const/4 v0, 0x1

    .line 1999
    .end local v13    # "normalClose$iv":Z
    .end local v14    # "$i$a$-also-SlotTable$write$1$1$iv":I
    .local v0, "normalClose$iv":Z
    :try_start_9
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .line 2000
    nop

    .line 1994
    .end local v0    # "normalClose$iv":Z
    .end local v11    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v12    # "$i$a$-let-SlotTable$write$1$iv":I
    nop

    .line 2001
    nop

    .line 1038
    .end local v9    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v10    # "$i$f$write":I
    invoke-interface {v7}, Landroidx/compose/runtime/Applier;->onEndChanges()V

    .line 1039
    nop

    .end local v6    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$1":I
    .end local v7    # "applier":Landroidx/compose/runtime/Applier;
    .end local v8    # "rememberManager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1993
    nop

    .line 2002
    :try_start_a
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v5}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 1993
    nop

    .line 1044
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    .end local v5    # "token$iv":Ljava/lang/Object;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchRememberObservers()V

    .line 1045
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchSideEffects()V

    .line 1047
    iget-boolean v0, v1, Landroidx/compose/runtime/CompositionImpl;->pendingInvalidScopes:Z

    if-eqz v0, :cond_17

    .line 1048
    const-string v0, "Compose:unobserve"

    move-object v3, v0

    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    const/4 v4, 0x0

    .line 2003
    .restart local v4    # "$i$f$trace":I
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v3}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    move-object v5, v0

    .line 2004
    .restart local v5    # "token$iv":Ljava/lang/Object;
    nop

    .line 2005
    const/4 v0, 0x0

    .line 1049
    .local v0, "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    const/4 v6, 0x0

    :try_start_b
    iput-boolean v6, v1, Landroidx/compose/runtime/CompositionImpl;->pendingInvalidScopes:Z

    .line 1050
    iget-object v7, v1, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    .local v7, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v8, 0x0

    .line 2006
    .local v8, "$i$f$removeScopeIf-impl":I
    move-object v9, v7

    .local v9, "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    const/4 v10, 0x0

    .line 2007
    .local v10, "$i$f$removeIf":I
    move-object v11, v9

    check-cast v11, Landroidx/collection/ScatterMap;

    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v12, 0x0

    .line 2008
    .local v12, "$i$f$forEachIndexed":I
    iget-object v13, v11, Landroidx/collection/ScatterMap;->metadata:[J

    .line 2009
    .local v13, "m$iv$iv$iv":[J
    array-length v14, v13

    add-int/lit8 v14, v14, -0x2

    .line 2011
    .local v14, "lastIndex$iv$iv$iv":I
    const/4 v15, 0x0

    .local v15, "i$iv$iv$iv":I
    if-gt v15, v14, :cond_14

    .line 2012
    :goto_1
    aget-wide v17, v13, v15
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 2013
    .local v17, "slot$iv$iv$iv":J
    move-wide/from16 v19, v17

    .local v19, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v21, 0x0

    .line 2014
    .local v21, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v22, v7

    move-wide/from16 v6, v19

    move-object/from16 v19, v3

    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v7    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v6, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v19, "sectionName$iv":Ljava/lang/String;
    .local v22, "arg0$iv":Landroidx/collection/MutableScatterMap;
    not-long v2, v6

    const/16 v20, 0x7

    shl-long v2, v2, v20

    and-long/2addr v2, v6

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v23

    .line 2013
    .end local v6    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v21    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v23

    if-eqz v2, :cond_13

    .line 2015
    sub-int v2, v15, v14

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 2016
    .local v2, "bitCount$iv$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv$iv":I
    :goto_2
    if-ge v6, v2, :cond_12

    .line 2017
    const-wide/16 v25, 0xff

    and-long v27, v17, v25

    .local v27, "value$iv$iv$iv$iv":J
    const/4 v7, 0x0

    .line 2018
    .local v7, "$i$f$isFull":I
    const-wide/16 v29, 0x80

    cmp-long v21, v27, v29

    const/16 v31, 0x1

    if-gez v21, :cond_5

    move/from16 v7, v31

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    .line 2017
    .end local v7    # "$i$f$isFull":I
    .end local v27    # "value$iv$iv$iv$iv":J
    :goto_3
    if-eqz v7, :cond_11

    .line 2019
    shl-int/lit8 v7, v15, 0x3

    add-int/2addr v7, v6

    .line 2020
    .local v7, "index$iv$iv$iv":I
    move/from16 v21, v7

    .local v21, "index$iv$iv":I
    const/16 v27, 0x0

    .line 2021
    .local v27, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    move/from16 v28, v3

    :try_start_c
    iget-object v3, v9, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v3, v3, v21

    iget-object v3, v9, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v3, v3, v21

    .local v3, "value$iv":Ljava/lang/Object;
    const/16 v32, 0x0

    .line 2022
    .local v32, "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    nop

    .line 2023
    move/from16 v33, v0

    .end local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .local v33, "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    instance-of v0, v3, Landroidx/collection/MutableScatterSet;

    if-eqz v0, :cond_e

    .line 2024
    const-string/jumbo v0, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v3

    check-cast v0, Landroidx/collection/MutableScatterSet;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 2025
    .local v0, "set$iv":Landroidx/collection/MutableScatterSet;
    move-object/from16 v34, v0

    .local v34, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    const/16 v35, 0x0

    .line 2026
    .local v35, "$i$f$removeIf":I
    move-object/from16 v36, v0

    move/from16 v34, v4

    .end local v4    # "$i$f$trace":I
    .local v0, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .local v34, "$i$f$trace":I
    .local v36, "set$iv":Landroidx/collection/MutableScatterSet;
    :try_start_d
    iget-object v4, v0, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 2027
    .local v4, "elements$iv$iv":[Ljava/lang/Object;
    move-object/from16 v37, v0

    check-cast v37, Landroidx/collection/ScatterSet;

    move-object/from16 v38, v37

    .local v38, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v37, 0x0

    .line 2028
    .local v37, "$i$f$forEachIndex":I
    nop

    .line 2029
    move-object/from16 v39, v4

    move-object/from16 v4, v38

    move/from16 v38, v6

    .end local v6    # "j$iv$iv$iv":I
    .local v4, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v38, "j$iv$iv$iv":I
    .local v39, "elements$iv$iv":[Ljava/lang/Object;
    iget-object v6, v4, Landroidx/collection/ScatterSet;->metadata:[J

    .line 2030
    .local v6, "m$iv$iv$iv":[J
    move-object/from16 v40, v4

    .end local v4    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v40, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    array-length v4, v6

    add-int/lit8 v4, v4, -0x2

    .line 2032
    .local v4, "lastIndex$iv$iv$iv":I
    move-object/from16 v41, v6

    .end local v6    # "m$iv$iv$iv":[J
    .local v41, "m$iv$iv$iv":[J
    const/4 v6, 0x0

    .local v6, "i$iv$iv$iv":I
    if-gt v6, v4, :cond_b

    .line 2033
    :goto_4
    aget-wide v42, v41, v6

    .line 2034
    .local v42, "slot$iv$iv$iv":J
    move-wide/from16 v44, v42

    .local v44, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v46, 0x0

    .line 2014
    .local v46, "$i$f$maskEmptyOrDeleted":I
    move/from16 v48, v7

    move/from16 v47, v8

    move-wide/from16 v7, v44

    move/from16 v44, v10

    move-object/from16 v45, v11

    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v7, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v44, "$i$f$removeIf":I
    .local v45, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v47, "$i$f$removeScopeIf-impl":I
    .local v48, "index$iv$iv$iv":I
    not-long v10, v7

    shl-long v10, v10, v20

    and-long/2addr v10, v7

    and-long v7, v10, v23

    .line 2034
    .end local v7    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v46    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v7, v7, v23

    if-eqz v7, :cond_a

    .line 2039
    sub-int v7, v6, v4

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    rsub-int/lit8 v7, v7, 0x8

    .line 2040
    .local v7, "bitCount$iv$iv$iv":I
    const/4 v8, 0x0

    .local v8, "j$iv$iv$iv":I
    :goto_5
    if-ge v8, v7, :cond_9

    .line 2041
    and-long v10, v42, v25

    .local v10, "value$iv$iv$iv$iv":J
    const/16 v46, 0x0

    .line 2018
    .local v46, "$i$f$isFull":I
    cmp-long v49, v10, v29

    if-gez v49, :cond_6

    move/from16 v10, v31

    goto :goto_6

    :cond_6
    const/4 v10, 0x0

    .line 2041
    .end local v10    # "value$iv$iv$iv$iv":J
    .end local v46    # "$i$f$isFull":I
    :goto_6
    if-eqz v10, :cond_8

    .line 2042
    shl-int/lit8 v10, v6, 0x3

    add-int/2addr v10, v8

    .line 2043
    .local v10, "index$iv$iv$iv":I
    move v11, v10

    .local v11, "index$iv$iv":I
    const/16 v46, 0x0

    .line 2044
    .local v46, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    aget-object v49, v39, v11

    check-cast v49, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v49, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/16 v50, 0x0

    .line 1050
    .local v50, "$i$a$-removeScopeIf-impl-CompositionImpl$applyChangesInLocked$2$1":I
    invoke-virtual/range {v49 .. v49}, Landroidx/compose/runtime/RecomposeScopeImpl;->getValid()Z

    move-result v51

    .line 2044
    .end local v49    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v50    # "$i$a$-removeScopeIf-impl-CompositionImpl$applyChangesInLocked$2$1":I
    if-nez v51, :cond_7

    .line 2045
    invoke-virtual {v0, v11}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 2047
    :cond_7
    nop

    .line 2043
    .end local v11    # "index$iv$iv":I
    .end local v46    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    nop

    .line 2048
    .end local v10    # "index$iv$iv$iv":I
    :cond_8
    shr-long v42, v42, v28

    .line 2040
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 2050
    .end local v8    # "j$iv$iv$iv":I
    :cond_9
    move/from16 v8, v28

    if-ne v7, v8, :cond_d

    .line 2032
    .end local v7    # "bitCount$iv$iv$iv":I
    .end local v42    # "slot$iv$iv$iv":J
    :cond_a
    if-eq v6, v4, :cond_c

    add-int/lit8 v6, v6, 0x1

    move/from16 v10, v44

    move-object/from16 v11, v45

    move/from16 v8, v47

    move/from16 v7, v48

    const/16 v28, 0x8

    goto :goto_4

    .end local v44    # "$i$f$removeIf":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    .end local v48    # "index$iv$iv$iv":I
    .local v7, "index$iv$iv$iv":I
    .local v8, "$i$f$removeScopeIf-impl":I
    .local v10, "$i$f$removeIf":I
    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_b
    move/from16 v48, v7

    move/from16 v47, v8

    move/from16 v44, v10

    move-object/from16 v45, v11

    .line 2053
    .end local v6    # "i$iv$iv$iv":I
    .end local v7    # "index$iv$iv$iv":I
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$removeIf":I
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v47    # "$i$f$removeScopeIf-impl":I
    .restart local v48    # "index$iv$iv$iv":I
    :cond_c
    nop

    .line 2054
    .end local v4    # "lastIndex$iv$iv$iv":I
    .end local v37    # "$i$f$forEachIndex":I
    .end local v40    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v41    # "m$iv$iv$iv":[J
    :cond_d
    nop

    .line 2055
    .end local v0    # "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .end local v35    # "$i$f$removeIf":I
    .end local v39    # "elements$iv$iv":[Ljava/lang/Object;
    invoke-virtual/range {v36 .. v36}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v31

    .end local v36    # "set$iv":Landroidx/collection/MutableScatterSet;
    goto :goto_7

    .line 2058
    .end local v34    # "$i$f$trace":I
    .end local v38    # "j$iv$iv$iv":I
    .end local v44    # "$i$f$removeIf":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    .end local v48    # "index$iv$iv$iv":I
    .local v4, "$i$f$trace":I
    .local v6, "j$iv$iv$iv":I
    .restart local v7    # "index$iv$iv$iv":I
    .restart local v8    # "$i$f$removeScopeIf-impl":I
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_e
    move/from16 v34, v4

    move/from16 v38, v6

    move/from16 v48, v7

    move/from16 v47, v8

    move/from16 v44, v10

    move-object/from16 v45, v11

    .end local v4    # "$i$f$trace":I
    .end local v6    # "j$iv$iv$iv":I
    .end local v7    # "index$iv$iv$iv":I
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v34    # "$i$f$trace":I
    .restart local v38    # "j$iv$iv$iv":I
    .restart local v44    # "$i$f$removeIf":I
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v47    # "$i$f$removeScopeIf-impl":I
    .restart local v48    # "index$iv$iv$iv":I
    const-string/jumbo v0, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v3

    check-cast v0, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v0, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v4, 0x0

    .line 1050
    .local v4, "$i$a$-removeScopeIf-impl-CompositionImpl$applyChangesInLocked$2$1":I
    invoke-virtual {v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->getValid()Z

    move-result v6

    if-nez v6, :cond_f

    goto :goto_7

    :cond_f
    const/16 v31, 0x0

    .line 2058
    .end local v0    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v4    # "$i$a$-removeScopeIf-impl-CompositionImpl$applyChangesInLocked$2$1":I
    :goto_7
    nop

    .line 2060
    nop

    .line 2021
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v32    # "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    if-eqz v31, :cond_10

    .line 2061
    move/from16 v7, v21

    .end local v21    # "index$iv$iv":I
    .local v7, "index$iv$iv":I
    invoke-virtual {v9, v7}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    goto :goto_8

    .line 2021
    .end local v7    # "index$iv$iv":I
    .restart local v21    # "index$iv$iv":I
    :cond_10
    move/from16 v7, v21

    .line 2063
    .end local v21    # "index$iv$iv":I
    .restart local v7    # "index$iv$iv":I
    :goto_8
    nop

    .line 2020
    .end local v7    # "index$iv$iv":I
    .end local v27    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    goto :goto_9

    .line 2072
    .end local v2    # "bitCount$iv$iv$iv":I
    .end local v9    # "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "m$iv$iv$iv":[J
    .end local v14    # "lastIndex$iv$iv$iv":I
    .end local v15    # "i$iv$iv$iv":I
    .end local v17    # "slot$iv$iv$iv":J
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v34    # "$i$f$trace":I
    .end local v38    # "j$iv$iv$iv":I
    .end local v44    # "$i$f$removeIf":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    .end local v48    # "index$iv$iv$iv":I
    .local v4, "$i$f$trace":I
    :catchall_1
    move-exception v0

    move/from16 v34, v4

    .end local v4    # "$i$f$trace":I
    .restart local v34    # "$i$f$trace":I
    goto/16 :goto_b

    .line 2017
    .end local v34    # "$i$f$trace":I
    .local v0, "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v2    # "bitCount$iv$iv$iv":I
    .restart local v4    # "$i$f$trace":I
    .restart local v6    # "j$iv$iv$iv":I
    .restart local v8    # "$i$f$removeScopeIf-impl":I
    .restart local v9    # "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v12    # "$i$f$forEachIndexed":I
    .restart local v13    # "m$iv$iv$iv":[J
    .restart local v14    # "lastIndex$iv$iv$iv":I
    .restart local v15    # "i$iv$iv$iv":I
    .restart local v17    # "slot$iv$iv$iv":J
    .restart local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    :cond_11
    move/from16 v33, v0

    move/from16 v34, v4

    move/from16 v38, v6

    move/from16 v47, v8

    move/from16 v44, v10

    move-object/from16 v45, v11

    .line 2064
    .end local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v4    # "$i$f$trace":I
    .end local v6    # "j$iv$iv$iv":I
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v34    # "$i$f$trace":I
    .restart local v38    # "j$iv$iv$iv":I
    .restart local v44    # "$i$f$removeIf":I
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v47    # "$i$f$removeScopeIf-impl":I
    :goto_9
    const/16 v8, 0x8

    shr-long v17, v17, v8

    .line 2016
    add-int/lit8 v6, v38, 0x1

    move v3, v8

    move/from16 v0, v33

    move/from16 v4, v34

    move/from16 v10, v44

    move-object/from16 v11, v45

    move/from16 v8, v47

    .end local v38    # "j$iv$iv$iv":I
    .restart local v6    # "j$iv$iv$iv":I
    goto/16 :goto_2

    .end local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v34    # "$i$f$trace":I
    .end local v44    # "$i$f$removeIf":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    .restart local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v4    # "$i$f$trace":I
    .restart local v8    # "$i$f$removeScopeIf-impl":I
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_12
    move/from16 v33, v0

    move/from16 v34, v4

    move/from16 v38, v6

    move/from16 v47, v8

    move/from16 v44, v10

    move-object/from16 v45, v11

    move v8, v3

    .line 2066
    .end local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v4    # "$i$f$trace":I
    .end local v6    # "j$iv$iv$iv":I
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v34    # "$i$f$trace":I
    .restart local v44    # "$i$f$removeIf":I
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v47    # "$i$f$removeScopeIf-impl":I
    if-ne v2, v8, :cond_16

    goto :goto_a

    .line 2013
    .end local v2    # "bitCount$iv$iv$iv":I
    .end local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v34    # "$i$f$trace":I
    .end local v44    # "$i$f$removeIf":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    .restart local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v4    # "$i$f$trace":I
    .restart local v8    # "$i$f$removeScopeIf-impl":I
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_13
    move/from16 v33, v0

    move/from16 v34, v4

    move/from16 v47, v8

    move/from16 v44, v10

    move-object/from16 v45, v11

    .line 2011
    .end local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v4    # "$i$f$trace":I
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v17    # "slot$iv$iv$iv":J
    .restart local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v34    # "$i$f$trace":I
    .restart local v44    # "$i$f$removeIf":I
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v47    # "$i$f$removeScopeIf-impl":I
    :goto_a
    if-eq v15, v14, :cond_15

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, v19

    move-object/from16 v7, v22

    move/from16 v0, v33

    move/from16 v4, v34

    move/from16 v10, v44

    move-object/from16 v11, v45

    move/from16 v8, v47

    const/4 v6, 0x0

    goto/16 :goto_1

    .end local v19    # "sectionName$iv":Ljava/lang/String;
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v34    # "$i$f$trace":I
    .end local v44    # "$i$f$removeIf":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    .restart local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .local v3, "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    .local v7, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v8    # "$i$f$removeScopeIf-impl":I
    .restart local v10    # "$i$f$removeIf":I
    .restart local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_14
    move/from16 v33, v0

    move-object/from16 v19, v3

    move/from16 v34, v4

    move-object/from16 v22, v7

    move/from16 v47, v8

    move/from16 v44, v10

    move-object/from16 v45, v11

    .line 2069
    .end local v0    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    .end local v7    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v8    # "$i$f$removeScopeIf-impl":I
    .end local v10    # "$i$f$removeIf":I
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v15    # "i$iv$iv$iv":I
    .restart local v19    # "sectionName$iv":Ljava/lang/String;
    .restart local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    .restart local v34    # "$i$f$trace":I
    .restart local v44    # "$i$f$removeIf":I
    .restart local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v47    # "$i$f$removeScopeIf-impl":I
    :cond_15
    nop

    .line 2070
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "m$iv$iv$iv":[J
    .end local v14    # "lastIndex$iv$iv$iv":I
    .end local v45    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    :cond_16
    nop

    .line 2071
    .end local v9    # "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    .end local v44    # "$i$f$removeIf":I
    nop

    .line 1051
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v47    # "$i$f$removeScopeIf-impl":I
    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->cleanUpDerivedStateObservations()V

    .line 1052
    nop

    .end local v33    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 2005
    nop

    .line 2072
    :try_start_e
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v5}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 2005
    goto :goto_c

    .line 2072
    :catchall_2
    move-exception v0

    goto :goto_b

    .end local v19    # "sectionName$iv":Ljava/lang/String;
    .end local v34    # "$i$f$trace":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    :catchall_3
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v34, v4

    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    .restart local v19    # "sectionName$iv":Ljava/lang/String;
    .restart local v34    # "$i$f$trace":I
    :goto_b
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v2, v5}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .end local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .end local p1    # "changes":Landroidx/compose/runtime/changelist/ChangeList;
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1058
    .end local v5    # "token$iv":Ljava/lang/Object;
    .end local v19    # "sectionName$iv":Ljava/lang/String;
    .end local v34    # "$i$f$trace":I
    .restart local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local p1    # "changes":Landroidx/compose/runtime/changelist/ChangeList;
    :cond_17
    :goto_c
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/ChangeList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v0, :cond_18

    .line 1059
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    .line 1061
    :cond_18
    nop

    .line 1062
    return-void

    .line 1999
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    .restart local v5    # "token$iv":Ljava/lang/Object;
    .local v6, "$i$a$-trace-CompositionImpl$applyChangesInLocked$1":I
    .local v7, "applier":Landroidx/compose/runtime/Applier;
    .local v8, "rememberManager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .local v9, "this_$iv":Landroidx/compose/runtime/SlotTable;
    .local v10, "$i$f$write":I
    .local v11, "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .local v12, "$i$a$-let-SlotTable$write$1$iv":I
    .local v13, "normalClose$iv":Z
    :catchall_4
    move-exception v0

    goto :goto_d

    .end local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .local v2, "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :catchall_5
    move-exception v0

    move-object/from16 v16, v2

    .end local v2    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :goto_d
    :try_start_f
    invoke-virtual {v11, v13}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    .end local v5    # "token$iv":Ljava/lang/Object;
    .end local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .end local p1    # "changes":Landroidx/compose/runtime/changelist/ChangeList;
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 2002
    .end local v6    # "$i$a$-trace-CompositionImpl$applyChangesInLocked$1":I
    .end local v7    # "applier":Landroidx/compose/runtime/Applier;
    .end local v8    # "rememberManager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .end local v9    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v10    # "$i$f$write":I
    .end local v11    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v12    # "$i$a$-let-SlotTable$write$1$iv":I
    .end local v13    # "normalClose$iv":Z
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    .restart local v5    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local p1    # "changes":Landroidx/compose/runtime/changelist/ChangeList;
    :catchall_6
    move-exception v0

    goto :goto_e

    .end local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local v2    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :catchall_7
    move-exception v0

    move-object/from16 v16, v2

    .end local v2    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :goto_e
    :try_start_10
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v2, v5}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .end local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .end local p1    # "changes":Landroidx/compose/runtime/changelist/ChangeList;
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1058
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    .end local v5    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local p1    # "changes":Landroidx/compose/runtime/changelist/ChangeList;
    :catchall_8
    move-exception v0

    goto :goto_f

    .end local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local v2    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :catchall_9
    move-exception v0

    move-object/from16 v16, v2

    .end local v2    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    .restart local v16    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :goto_f
    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v2}, Landroidx/compose/runtime/changelist/ChangeList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v2, :cond_19

    .line 1059
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_19
    throw v0
.end method

.method private final cleanUpDerivedStateObservations()V
    .locals 48

    .line 936
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    .local v1, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v2, 0x0

    .line 1742
    .local v2, "$i$f$removeScopeIf-impl":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    const/4 v4, 0x0

    .line 1743
    .local v4, "$i$f$removeIf":I
    move-object v5, v3

    check-cast v5, Landroidx/collection/ScatterMap;

    .local v5, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 1744
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1745
    .local v7, "m$iv$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1747
    .local v8, "lastIndex$iv$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv$iv":I
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide/16 v18, 0x80

    const/16 v10, 0x8

    if-gt v9, v8, :cond_f

    .line 1748
    :goto_0
    aget-wide v20, v7, v9

    .line 1749
    .local v20, "slot$iv$iv$iv":J
    move-wide/from16 v22, v20

    .local v22, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v24, 0x0

    .line 1750
    .local v24, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v11, v22

    const/16 v22, 0x7

    const-wide/16 v25, 0xff

    .end local v22    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    not-long v13, v11

    shl-long v13, v13, v22

    and-long/2addr v13, v11

    and-long v11, v13, v16

    .line 1749
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v24    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_e

    .line 1751
    sub-int v11, v9, v8

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    .line 1752
    .local v11, "bitCount$iv$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv$iv":I
    :goto_1
    if-ge v12, v11, :cond_d

    .line 1753
    and-long v13, v20, v25

    .local v13, "value$iv$iv$iv$iv":J
    const/16 v24, 0x0

    .line 1754
    .local v24, "$i$f$isFull":I
    cmp-long v27, v13, v18

    if-gez v27, :cond_0

    const/4 v13, 0x1

    goto :goto_2

    :cond_0
    const/4 v13, 0x0

    .line 1753
    .end local v13    # "value$iv$iv$iv$iv":J
    .end local v24    # "$i$f$isFull":I
    :goto_2
    if-eqz v13, :cond_c

    .line 1755
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1756
    .local v13, "index$iv$iv$iv":I
    move v14, v13

    .local v14, "index$iv$iv":I
    const/16 v24, 0x0

    .line 1757
    .local v24, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    iget-object v15, v3, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v15, v15, v14

    iget-object v15, v3, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v15, v15, v14

    .local v15, "value$iv":Ljava/lang/Object;
    const/16 v28, 0x0

    .line 1758
    .local v28, "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    nop

    .line 1759
    move/from16 v29, v10

    instance-of v10, v15, Landroidx/collection/MutableScatterSet;

    if-eqz v10, :cond_9

    .line 1760
    const-string/jumbo v10, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v15

    check-cast v10, Landroidx/collection/MutableScatterSet;

    .line 1761
    .local v10, "set$iv":Landroidx/collection/MutableScatterSet;
    move-object/from16 v30, v10

    .local v30, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    const/16 v31, 0x0

    .line 1762
    .local v31, "$i$f$removeIf":I
    move-object/from16 v32, v1

    move-object/from16 v1, v30

    move/from16 v30, v2

    .end local v2    # "$i$f$removeScopeIf-impl":I
    .local v1, "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .local v30, "$i$f$removeScopeIf-impl":I
    .local v32, "arg0$iv":Landroidx/collection/MutableScatterMap;
    iget-object v2, v1, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 1763
    .local v2, "elements$iv$iv":[Ljava/lang/Object;
    move-object/from16 v33, v2

    .end local v2    # "elements$iv$iv":[Ljava/lang/Object;
    .local v33, "elements$iv$iv":[Ljava/lang/Object;
    move-object v2, v1

    check-cast v2, Landroidx/collection/ScatterSet;

    .local v2, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v34, 0x0

    .line 1764
    .local v34, "$i$f$forEachIndex":I
    nop

    .line 1765
    move/from16 v35, v4

    .end local v4    # "$i$f$removeIf":I
    .local v35, "$i$f$removeIf":I
    iget-object v4, v2, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1766
    .local v4, "m$iv$iv$iv":[J
    move-object/from16 v36, v2

    .end local v2    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v36, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    array-length v2, v4

    add-int/lit8 v2, v2, -0x2

    .line 1768
    .local v2, "lastIndex$iv$iv$iv":I
    move-object/from16 v37, v4

    .end local v4    # "m$iv$iv$iv":[J
    .local v37, "m$iv$iv$iv":[J
    const/4 v4, 0x0

    .local v4, "i$iv$iv$iv":I
    if-gt v4, v2, :cond_6

    .line 1769
    :goto_3
    aget-wide v38, v37, v4

    .line 1770
    .local v38, "slot$iv$iv$iv":J
    move-wide/from16 v40, v38

    .local v40, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v42, 0x0

    .line 1750
    .local v42, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v43, v5

    move/from16 v44, v6

    move-wide/from16 v5, v40

    move/from16 v40, v12

    move/from16 v41, v13

    .end local v6    # "$i$f$forEachIndexed":I
    .end local v12    # "j$iv$iv$iv":I
    .end local v13    # "index$iv$iv$iv":I
    .local v5, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v40, "j$iv$iv$iv":I
    .local v41, "index$iv$iv$iv":I
    .local v43, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v44, "$i$f$forEachIndexed":I
    not-long v12, v5

    shl-long v12, v12, v22

    and-long/2addr v12, v5

    and-long v5, v12, v16

    .line 1770
    .end local v5    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v42    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v5, v5, v16

    if-eqz v5, :cond_5

    .line 1775
    sub-int v5, v4, v2

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    rsub-int/lit8 v5, v5, 0x8

    .line 1776
    .local v5, "bitCount$iv$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv$iv":I
    :goto_4
    if-ge v6, v5, :cond_4

    .line 1777
    and-long v12, v38, v25

    .local v12, "value$iv$iv$iv$iv":J
    const/16 v42, 0x0

    .line 1754
    .local v42, "$i$f$isFull":I
    cmp-long v45, v12, v18

    if-gez v45, :cond_1

    const/4 v12, 0x1

    goto :goto_5

    :cond_1
    const/4 v12, 0x0

    .line 1777
    .end local v12    # "value$iv$iv$iv$iv":J
    .end local v42    # "$i$f$isFull":I
    :goto_5
    if-eqz v12, :cond_3

    .line 1778
    shl-int/lit8 v12, v4, 0x3

    add-int/2addr v12, v6

    .line 1779
    .local v12, "index$iv$iv$iv":I
    move v13, v12

    .local v13, "index$iv$iv":I
    const/16 v42, 0x0

    .line 1780
    .local v42, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    aget-object v45, v33, v13

    move/from16 v46, v6

    .end local v6    # "j$iv$iv$iv":I
    .local v46, "j$iv$iv$iv":I
    move-object/from16 v6, v45

    check-cast v6, Landroidx/compose/runtime/DerivedState;

    .local v6, "derivedState":Landroidx/compose/runtime/DerivedState;
    const/16 v45, 0x0

    .line 936
    .local v45, "$i$a$-removeScopeIf-impl-CompositionImpl$cleanUpDerivedStateObservations$1":I
    move-object/from16 v47, v7

    .end local v7    # "m$iv$iv$iv":[J
    .local v47, "m$iv$iv$iv":[J
    invoke-static {v0}, Landroidx/compose/runtime/CompositionImpl;->access$getObservations$p(Landroidx/compose/runtime/CompositionImpl;)Landroidx/collection/MutableScatterMap;

    move-result-object v7

    invoke-static {v7, v6}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v7

    .line 1780
    .end local v6    # "derivedState":Landroidx/compose/runtime/DerivedState;
    .end local v45    # "$i$a$-removeScopeIf-impl-CompositionImpl$cleanUpDerivedStateObservations$1":I
    if-nez v7, :cond_2

    .line 1781
    invoke-virtual {v1, v13}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 1783
    :cond_2
    nop

    .line 1779
    .end local v13    # "index$iv$iv":I
    .end local v42    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv$iv":I
    goto :goto_6

    .line 1777
    .end local v12    # "index$iv$iv$iv":I
    .end local v46    # "j$iv$iv$iv":I
    .end local v47    # "m$iv$iv$iv":[J
    .local v6, "j$iv$iv$iv":I
    .restart local v7    # "m$iv$iv$iv":[J
    :cond_3
    move/from16 v46, v6

    move-object/from16 v47, v7

    .line 1784
    .end local v6    # "j$iv$iv$iv":I
    .end local v7    # "m$iv$iv$iv":[J
    .restart local v46    # "j$iv$iv$iv":I
    .restart local v47    # "m$iv$iv$iv":[J
    :goto_6
    shr-long v38, v38, v29

    .line 1776
    add-int/lit8 v6, v46, 0x1

    move-object/from16 v7, v47

    .end local v46    # "j$iv$iv$iv":I
    .restart local v6    # "j$iv$iv$iv":I
    goto :goto_4

    .end local v47    # "m$iv$iv$iv":[J
    .restart local v7    # "m$iv$iv$iv":[J
    :cond_4
    move/from16 v46, v6

    move-object/from16 v47, v7

    .line 1786
    .end local v6    # "j$iv$iv$iv":I
    .end local v7    # "m$iv$iv$iv":[J
    .restart local v47    # "m$iv$iv$iv":[J
    move/from16 v6, v29

    if-ne v5, v6, :cond_8

    goto :goto_7

    .line 1770
    .end local v5    # "bitCount$iv$iv$iv":I
    .end local v47    # "m$iv$iv$iv":[J
    .restart local v7    # "m$iv$iv$iv":[J
    :cond_5
    move-object/from16 v47, v7

    .line 1768
    .end local v7    # "m$iv$iv$iv":[J
    .end local v38    # "slot$iv$iv$iv":J
    .restart local v47    # "m$iv$iv$iv":[J
    :goto_7
    if-eq v4, v2, :cond_7

    add-int/lit8 v4, v4, 0x1

    move/from16 v12, v40

    move/from16 v13, v41

    move-object/from16 v5, v43

    move/from16 v6, v44

    move-object/from16 v7, v47

    const/16 v29, 0x8

    goto :goto_3

    .end local v40    # "j$iv$iv$iv":I
    .end local v41    # "index$iv$iv$iv":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    .local v5, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .local v6, "$i$f$forEachIndexed":I
    .restart local v7    # "m$iv$iv$iv":[J
    .local v12, "j$iv$iv$iv":I
    .local v13, "index$iv$iv$iv":I
    :cond_6
    move-object/from16 v43, v5

    move/from16 v44, v6

    move-object/from16 v47, v7

    move/from16 v40, v12

    move/from16 v41, v13

    .line 1789
    .end local v4    # "i$iv$iv$iv":I
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v12    # "j$iv$iv$iv":I
    .end local v13    # "index$iv$iv$iv":I
    .restart local v40    # "j$iv$iv$iv":I
    .restart local v41    # "index$iv$iv$iv":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$forEachIndexed":I
    .restart local v47    # "m$iv$iv$iv":[J
    :cond_7
    nop

    .line 1790
    .end local v2    # "lastIndex$iv$iv$iv":I
    .end local v34    # "$i$f$forEachIndex":I
    .end local v36    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v37    # "m$iv$iv$iv":[J
    :cond_8
    nop

    .line 1791
    .end local v1    # "this_$iv$iv":Landroidx/collection/MutableScatterSet;
    .end local v31    # "$i$f$removeIf":I
    .end local v33    # "elements$iv$iv":[Ljava/lang/Object;
    invoke-virtual {v10}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v1

    .end local v10    # "set$iv":Landroidx/collection/MutableScatterSet;
    goto :goto_8

    .line 1794
    .end local v30    # "$i$f$removeScopeIf-impl":I
    .end local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v35    # "$i$f$removeIf":I
    .end local v40    # "j$iv$iv$iv":I
    .end local v41    # "index$iv$iv$iv":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    .local v1, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v2, "$i$f$removeScopeIf-impl":I
    .local v4, "$i$f$removeIf":I
    .restart local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v6    # "$i$f$forEachIndexed":I
    .restart local v7    # "m$iv$iv$iv":[J
    .restart local v12    # "j$iv$iv$iv":I
    .restart local v13    # "index$iv$iv$iv":I
    :cond_9
    move-object/from16 v32, v1

    move/from16 v30, v2

    move/from16 v35, v4

    move-object/from16 v43, v5

    move/from16 v44, v6

    move-object/from16 v47, v7

    move/from16 v40, v12

    move/from16 v41, v13

    .end local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$f$removeScopeIf-impl":I
    .end local v4    # "$i$f$removeIf":I
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v12    # "j$iv$iv$iv":I
    .end local v13    # "index$iv$iv$iv":I
    .restart local v30    # "$i$f$removeScopeIf-impl":I
    .restart local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v35    # "$i$f$removeIf":I
    .restart local v40    # "j$iv$iv$iv":I
    .restart local v41    # "index$iv$iv$iv":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$forEachIndexed":I
    .restart local v47    # "m$iv$iv$iv":[J
    const-string/jumbo v1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v15

    check-cast v1, Landroidx/compose/runtime/DerivedState;

    .local v1, "derivedState":Landroidx/compose/runtime/DerivedState;
    const/4 v2, 0x0

    .line 936
    .local v2, "$i$a$-removeScopeIf-impl-CompositionImpl$cleanUpDerivedStateObservations$1":I
    invoke-static {v0}, Landroidx/compose/runtime/CompositionImpl;->access$getObservations$p(Landroidx/compose/runtime/CompositionImpl;)Landroidx/collection/MutableScatterMap;

    move-result-object v4

    invoke-static {v4, v1}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    const/4 v1, 0x1

    goto :goto_8

    :cond_a
    const/4 v1, 0x0

    .line 1794
    .end local v1    # "derivedState":Landroidx/compose/runtime/DerivedState;
    .end local v2    # "$i$a$-removeScopeIf-impl-CompositionImpl$cleanUpDerivedStateObservations$1":I
    :goto_8
    nop

    .line 1796
    nop

    .line 1757
    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v28    # "$i$a$-removeIf-ScopeMap$removeScopeIf$1$iv":I
    if-eqz v1, :cond_b

    .line 1797
    invoke-virtual {v3, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1799
    :cond_b
    nop

    .line 1756
    .end local v14    # "index$iv$iv":I
    .end local v24    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv$iv":I
    goto :goto_9

    .line 1753
    .end local v30    # "$i$f$removeScopeIf-impl":I
    .end local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v35    # "$i$f$removeIf":I
    .end local v40    # "j$iv$iv$iv":I
    .end local v41    # "index$iv$iv$iv":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    .local v1, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v2, "$i$f$removeScopeIf-impl":I
    .restart local v4    # "$i$f$removeIf":I
    .restart local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v6    # "$i$f$forEachIndexed":I
    .restart local v7    # "m$iv$iv$iv":[J
    .restart local v12    # "j$iv$iv$iv":I
    :cond_c
    move-object/from16 v32, v1

    move/from16 v30, v2

    move/from16 v35, v4

    move-object/from16 v43, v5

    move/from16 v44, v6

    move-object/from16 v47, v7

    move/from16 v40, v12

    .line 1800
    .end local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$f$removeScopeIf-impl":I
    .end local v4    # "$i$f$removeIf":I
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v12    # "j$iv$iv$iv":I
    .restart local v30    # "$i$f$removeScopeIf-impl":I
    .restart local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v35    # "$i$f$removeIf":I
    .restart local v40    # "j$iv$iv$iv":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$forEachIndexed":I
    .restart local v47    # "m$iv$iv$iv":[J
    :goto_9
    const/16 v6, 0x8

    shr-long v20, v20, v6

    .line 1752
    add-int/lit8 v12, v40, 0x1

    move v10, v6

    move/from16 v2, v30

    move-object/from16 v1, v32

    move/from16 v4, v35

    move-object/from16 v5, v43

    move/from16 v6, v44

    move-object/from16 v7, v47

    .end local v40    # "j$iv$iv$iv":I
    .restart local v12    # "j$iv$iv$iv":I
    goto/16 :goto_1

    .end local v30    # "$i$f$removeScopeIf-impl":I
    .end local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v35    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    .restart local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v2    # "$i$f$removeScopeIf-impl":I
    .restart local v4    # "$i$f$removeIf":I
    .restart local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v6    # "$i$f$forEachIndexed":I
    .restart local v7    # "m$iv$iv$iv":[J
    :cond_d
    move-object/from16 v32, v1

    move/from16 v30, v2

    move/from16 v35, v4

    move-object/from16 v43, v5

    move/from16 v44, v6

    move-object/from16 v47, v7

    move v6, v10

    move/from16 v40, v12

    .line 1802
    .end local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$f$removeScopeIf-impl":I
    .end local v4    # "$i$f$removeIf":I
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v12    # "j$iv$iv$iv":I
    .restart local v30    # "$i$f$removeScopeIf-impl":I
    .restart local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v35    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$forEachIndexed":I
    .restart local v47    # "m$iv$iv$iv":[J
    if-ne v11, v6, :cond_11

    goto :goto_a

    .line 1749
    .end local v11    # "bitCount$iv$iv$iv":I
    .end local v30    # "$i$f$removeScopeIf-impl":I
    .end local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v35    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    .restart local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v2    # "$i$f$removeScopeIf-impl":I
    .restart local v4    # "$i$f$removeIf":I
    .restart local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v6    # "$i$f$forEachIndexed":I
    .restart local v7    # "m$iv$iv$iv":[J
    :cond_e
    move-object/from16 v32, v1

    move/from16 v30, v2

    move/from16 v35, v4

    move-object/from16 v43, v5

    move/from16 v44, v6

    move-object/from16 v47, v7

    .line 1747
    .end local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$f$removeScopeIf-impl":I
    .end local v4    # "$i$f$removeIf":I
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v20    # "slot$iv$iv$iv":J
    .restart local v30    # "$i$f$removeScopeIf-impl":I
    .restart local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v35    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$forEachIndexed":I
    .restart local v47    # "m$iv$iv$iv":[J
    :goto_a
    if-eq v9, v8, :cond_10

    add-int/lit8 v9, v9, 0x1

    move/from16 v2, v30

    move-object/from16 v1, v32

    move/from16 v4, v35

    move-object/from16 v5, v43

    move/from16 v6, v44

    move-object/from16 v7, v47

    const/16 v10, 0x8

    goto/16 :goto_0

    .end local v30    # "$i$f$removeScopeIf-impl":I
    .end local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v35    # "$i$f$removeIf":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    .restart local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v2    # "$i$f$removeScopeIf-impl":I
    .restart local v4    # "$i$f$removeIf":I
    .restart local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v6    # "$i$f$forEachIndexed":I
    .restart local v7    # "m$iv$iv$iv":[J
    :cond_f
    move-object/from16 v32, v1

    move/from16 v30, v2

    move/from16 v35, v4

    move-object/from16 v43, v5

    move/from16 v44, v6

    move-object/from16 v47, v7

    const/16 v22, 0x7

    const-wide/16 v25, 0xff

    .line 1805
    .end local v1    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$f$removeScopeIf-impl":I
    .end local v4    # "$i$f$removeIf":I
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v9    # "i$iv$iv$iv":I
    .restart local v30    # "$i$f$removeScopeIf-impl":I
    .restart local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v35    # "$i$f$removeIf":I
    .restart local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v44    # "$i$f$forEachIndexed":I
    .restart local v47    # "m$iv$iv$iv":[J
    :cond_10
    nop

    .line 1806
    .end local v8    # "lastIndex$iv$iv$iv":I
    .end local v43    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v44    # "$i$f$forEachIndexed":I
    .end local v47    # "m$iv$iv$iv":[J
    :cond_11
    nop

    .line 1807
    .end local v3    # "this_$iv$iv":Landroidx/collection/MutableScatterMap;
    .end local v35    # "$i$f$removeIf":I
    nop

    .line 937
    .end local v30    # "$i$f$removeScopeIf-impl":I
    .end local v32    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    iget-object v1, v0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->isNotEmpty()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 938
    iget-object v1, v0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    .local v1, "this_$iv":Landroidx/collection/MutableScatterSet;
    const/4 v2, 0x0

    .line 1808
    .local v2, "$i$f$removeIf":I
    iget-object v3, v1, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 1809
    .local v3, "elements$iv":[Ljava/lang/Object;
    move-object v4, v1

    check-cast v4, Landroidx/collection/ScatterSet;

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v5, 0x0

    .line 1810
    .local v5, "$i$f$forEachIndex":I
    nop

    .line 1811
    iget-object v6, v4, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1812
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 1814
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_17

    .line 1815
    :goto_b
    aget-wide v9, v6, v8

    .line 1816
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 1817
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    shl-long v14, v14, v22

    and-long/2addr v14, v11

    and-long v11, v14, v16

    .line 1816
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_16

    .line 1818
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v29, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1819
    .local v11, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_c
    if-ge v12, v11, :cond_15

    .line 1820
    and-long v13, v9, v25

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 1821
    .local v15, "$i$f$isFull":I
    cmp-long v20, v13, v18

    if-gez v20, :cond_12

    const/4 v13, 0x1

    goto :goto_d

    :cond_12
    const/4 v13, 0x0

    .line 1820
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_d
    if-eqz v13, :cond_14

    .line 1822
    shl-int/lit8 v13, v8, 0x3

    add-int/2addr v13, v12

    .line 1823
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/4 v15, 0x0

    .line 1824
    .local v15, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv":I
    aget-object v20, v3, v14

    check-cast v20, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v20, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/16 v21, 0x0

    .line 938
    .local v21, "$i$a$-removeIf-CompositionImpl$cleanUpDerivedStateObservations$2":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/RecomposeScopeImpl;->isConditional()Z

    move-result v24

    .line 1824
    .end local v20    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v21    # "$i$a$-removeIf-CompositionImpl$cleanUpDerivedStateObservations$2":I
    if-nez v24, :cond_13

    .line 1825
    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 1827
    :cond_13
    nop

    .line 1823
    .end local v14    # "index$iv":I
    .end local v15    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv":I
    nop

    .line 1828
    .end local v13    # "index$iv$iv":I
    :cond_14
    const/16 v13, 0x8

    shr-long/2addr v9, v13

    .line 1819
    add-int/lit8 v12, v12, 0x1

    goto :goto_c

    :cond_15
    const/16 v13, 0x8

    .line 1830
    .end local v12    # "j$iv$iv":I
    if-ne v11, v13, :cond_18

    goto :goto_e

    .line 1816
    .end local v11    # "bitCount$iv$iv":I
    :cond_16
    const/16 v13, 0x8

    .line 1814
    .end local v9    # "slot$iv$iv":J
    :goto_e
    if-eq v8, v7, :cond_17

    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    .line 1833
    .end local v8    # "i$iv$iv":I
    :cond_17
    nop

    .line 1834
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachIndex":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_18
    nop

    .line 940
    .end local v1    # "this_$iv":Landroidx/collection/MutableScatterSet;
    .end local v2    # "$i$f$removeIf":I
    .end local v3    # "elements$iv":[Ljava/lang/Object;
    :cond_19
    return-void
.end method

.method private final composeInitial(Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .param p1, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 675
    iget-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->disposed:Z

    xor-int/lit8 v0, v0, 0x1

    .local v0, "value$iv":Z
    const/4 v1, 0x0

    .line 1389
    .local v1, "$i$f$checkPrecondition":I
    nop

    .line 1390
    if-nez v0, :cond_0

    .line 1391
    const/4 v2, 0x0

    .line 675
    .local v2, "$i$a$-checkPrecondition-CompositionImpl$composeInitial$1":I
    nop

    .line 1391
    .end local v2    # "$i$a$-checkPrecondition-CompositionImpl$composeInitial$1":I
    const-string v2, "The composition is disposed"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1393
    :cond_0
    nop

    .line 676
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$checkPrecondition":I
    iput-object p1, p0, Landroidx/compose/runtime/CompositionImpl;->composable:Lkotlin/jvm/functions/Function2;

    .line 677
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/ControlledComposition;

    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->composable:Lkotlin/jvm/functions/Function2;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/runtime/CompositionContext;->composeInitial$runtime_release(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V

    .line 678
    return-void
.end method

.method private final drainPendingModificationsForCompositionLocked()V
    .locals 6

    .line 718
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Landroidx/compose/runtime/CompositionKt;->access$getPendingApplyNoModifications$p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 719
    .local v0, "toRecord":Ljava/lang/Object;
    if-eqz v0, :cond_3

    .line 722
    invoke-static {}, Landroidx/compose/runtime/CompositionKt;->access$getPendingApplyNoModifications$p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 725
    instance-of v1, v0, Ljava/util/Set;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 726
    move-object v1, v0

    check-cast v1, Ljava/util/Set;

    invoke-direct {p0, v1, v2}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/util/Set;Z)V

    goto :goto_1

    .line 728
    :cond_0
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 729
    move-object v1, v0

    check-cast v1, [Ljava/util/Set;

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v1, v4

    .line 730
    .local v5, "changed":Ljava/util/Set;
    invoke-direct {p0, v5, v2}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/util/Set;Z)V

    .line 729
    .end local v5    # "changed":Ljava/util/Set;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 732
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "corrupt pendingModifications drain: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    .line 723
    :cond_2
    const-string/jumbo v1, "pending composition has not been applied"

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    .line 734
    .end local v0    # "toRecord":Ljava/lang/Object;
    :cond_3
    :goto_1
    return-void
.end method

.method private final drainPendingModificationsLocked()V
    .locals 6

    .line 738
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 739
    .local v0, "toRecord":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/runtime/CompositionKt;->access$getPendingApplyNoModifications$p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 742
    instance-of v1, v0, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 743
    move-object v1, v0

    check-cast v1, Ljava/util/Set;

    invoke-direct {p0, v1, v2}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/util/Set;Z)V

    goto :goto_1

    .line 745
    :cond_0
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 746
    move-object v1, v0

    check-cast v1, [Ljava/util/Set;

    array-length v3, v1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v1, v4

    .line 747
    .local v5, "changed":Ljava/util/Set;
    invoke-direct {p0, v5, v2}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/util/Set;Z)V

    .line 746
    .end local v5    # "changed":Ljava/util/Set;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 749
    :cond_1
    if-nez v0, :cond_2

    .line 751
    nop

    .line 750
    const-string v1, "calling recordModificationsOf and applyChanges concurrently is not supported"

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    .line 753
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "corrupt pendingModifications drain: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    .line 755
    .end local v0    # "toRecord":Ljava/lang/Object;
    :cond_3
    :goto_1
    return-void
.end method

.method private final drainPendingModificationsOutOfBandLocked()V
    .locals 6

    .line 761
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 763
    .local v0, "toRecord":Ljava/lang/Object;
    nop

    .line 762
    invoke-static {}, Landroidx/compose/runtime/CompositionKt;->access$getPendingApplyNoModifications$p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    .line 763
    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    if-nez v2, :cond_4

    .line 766
    instance-of v1, v0, Ljava/util/Set;

    if-eqz v1, :cond_2

    .line 767
    move-object v1, v0

    check-cast v1, Ljava/util/Set;

    invoke-direct {p0, v1, v3}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/util/Set;Z)V

    goto :goto_2

    .line 769
    :cond_2
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_3

    .line 770
    move-object v1, v0

    check-cast v1, [Ljava/util/Set;

    array-length v2, v1

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    .line 771
    .local v5, "changed":Ljava/util/Set;
    invoke-direct {p0, v5, v3}, Landroidx/compose/runtime/CompositionImpl;->addPendingInvalidationsLocked(Ljava/util/Set;Z)V

    .line 770
    .end local v5    # "changed":Ljava/util/Set;
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 773
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "corrupt pendingModifications drain: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    .line 775
    .end local v0    # "toRecord":Ljava/lang/Object;
    :cond_4
    :goto_2
    return-void
.end method

.method private static synthetic getAbandonSet$annotations()V
    .locals 0

    return-void
.end method

.method private final getAreChildrenComposing()Z
    .locals 1

    .line 595
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposerImpl;->getAreChildrenComposing$runtime_release()Z

    move-result v0

    return v0
.end method

.method public static synthetic getPendingInvalidScopes$runtime_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getSlotTable$runtime_release$annotations()V
    .locals 0

    return-void
.end method

.method private final guardChanges(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 7
    .param p1, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1110
    .local v0, "$i$f$guardChanges":I
    nop

    .line 1111
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v2, 0x0

    .line 2121
    .local v2, "$i$f$trackAbandonedValues":I
    const/4 v3, 0x0

    .line 2122
    .local v3, "success$iv":Z
    nop

    .line 2123
    :try_start_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v4

    .line 2124
    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 2123
    .local v6, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv":I
    const/4 v3, 0x1

    .line 2125
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv":I
    nop

    .line 2128
    nop

    .line 2122
    nop

    .line 1115
    .end local v1    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v2    # "$i$f$trackAbandonedValues":I
    .end local v3    # "success$iv":Z
    return-object v4

    .line 2125
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v2    # "$i$f$trackAbandonedValues":I
    .restart local v3    # "success$iv":Z
    :catchall_0
    move-exception v4

    if-nez v3, :cond_0

    :try_start_1
    iget-object v5, v1, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    .line 2126
    new-instance v5, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v6, v1, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v5, v6}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v5}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    goto :goto_0

    .line 1112
    .end local v1    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v2    # "$i$f$trackAbandonedValues":I
    .end local v3    # "success$iv":Z
    :catch_0
    move-exception v1

    goto :goto_1

    .line 2126
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v2    # "$i$f$trackAbandonedValues":I
    .restart local v3    # "success$iv":Z
    :cond_0
    :goto_0
    nop

    .end local v0    # "$i$f$guardChanges":I
    .end local p1    # "block":Lkotlin/jvm/functions/Function0;
    throw v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1113
    .end local v2    # "$i$f$trackAbandonedValues":I
    .end local v3    # "success$iv":Z
    .restart local v0    # "$i$f$guardChanges":I
    .local v1, "e":Ljava/lang/Exception;
    .restart local p1    # "block":Lkotlin/jvm/functions/Function0;
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 1114
    throw v1
.end method

.method private final guardInvalidationsLocked(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/collection/ScopeMap<",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            "Ljava/lang/Object;",
            ">;+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1100
    .local v0, "$i$f$guardInvalidationsLocked":I
    invoke-direct {p0}, Landroidx/compose/runtime/CompositionImpl;->takeInvalidations-afanTW4()Landroidx/collection/MutableScatterMap;

    move-result-object v1

    .line 1101
    .local v1, "invalidations":Landroidx/collection/MutableScatterMap;
    nop

    .line 1102
    :try_start_0
    invoke-static {v1}, Landroidx/compose/runtime/collection/ScopeMap;->box-impl(Landroidx/collection/MutableScatterMap;)Landroidx/compose/runtime/collection/ScopeMap;

    move-result-object v2

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1101
    return-object v2

    .line 1103
    :catch_0
    move-exception v2

    .line 1104
    .local v2, "e":Ljava/lang/Exception;
    iput-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 1105
    throw v2
.end method

.method private final invalidateChecked(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;
    .locals 35
    .param p1, "scope"    # Landroidx/compose/runtime/RecomposeScopeImpl;
    .param p2, "anchor"    # Landroidx/compose/runtime/Anchor;
    .param p3, "instance"    # Ljava/lang/Object;

    .line 1203
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    iget-object v5, v1, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v5, "lock$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 2137
    .local v6, "$i$f$synchronized":I
    nop

    .line 2138
    monitor-enter v5

    const/4 v0, 0x0

    .line 1205
    .local v0, "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    :try_start_0
    iget-object v7, v1, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegate:Landroidx/compose/runtime/CompositionImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    .local v7, "changeDelegate":Landroidx/compose/runtime/CompositionImpl;
    const/4 v9, 0x0

    .line 1216
    .local v9, "$i$a$-let-CompositionImpl$invalidateChecked$delegate$1$delegate$1":I
    :try_start_1
    iget-object v10, v1, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    iget v11, v1, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegateGroup:I

    invoke-virtual {v10, v11, v3}, Landroidx/compose/runtime/SlotTable;->groupContainsAnchor(ILandroidx/compose/runtime/Anchor;)Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v10, :cond_0

    .line 1217
    move-object v8, v7

    goto :goto_0

    .line 1218
    :cond_0
    goto :goto_0

    .line 2138
    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v7    # "changeDelegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v9    # "$i$a$-let-CompositionImpl$invalidateChecked$delegate$1$delegate$1":I
    :catchall_0
    move-exception v0

    move/from16 v19, v6

    goto/16 :goto_b

    .line 1205
    .restart local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    :cond_1
    :goto_0
    nop

    .line 1204
    nop

    .line 1220
    .local v8, "delegate":Landroidx/compose/runtime/CompositionImpl;
    if-nez v8, :cond_12

    .line 1221
    :try_start_2
    invoke-direct {v1, v2, v4}, Landroidx/compose/runtime/CompositionImpl;->tryImminentInvalidation(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v7, :cond_2

    .line 1223
    :try_start_3
    sget-object v7, Landroidx/compose/runtime/InvalidationResult;->IMMINENT:Landroidx/compose/runtime/InvalidationResult;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v5    # "lock$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$synchronized":I
    .end local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    monitor-exit v5

    return-object v7

    .line 1228
    .restart local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .restart local v5    # "lock$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$synchronized":I
    .restart local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    :cond_2
    :try_start_4
    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->observer()Landroidx/compose/runtime/tooling/CompositionObserver;

    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1229
    .local v7, "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    if-nez v4, :cond_3

    .line 1232
    :try_start_5
    iget-object v9, v1, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    sget-object v10, Landroidx/compose/runtime/ScopeInvalidated;->INSTANCE:Landroidx/compose/runtime/ScopeInvalidated;

    invoke-static {v9, v2, v10}, Landroidx/compose/runtime/collection/ScopeMap;->set-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    move/from16 v17, v0

    move/from16 v19, v6

    move-object/from16 v26, v8

    goto/16 :goto_9

    .line 1233
    :cond_3
    if-nez v7, :cond_4

    instance-of v9, v4, Landroidx/compose/runtime/DerivedState;

    if-nez v9, :cond_4

    .line 1237
    iget-object v9, v1, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    sget-object v10, Landroidx/compose/runtime/ScopeInvalidated;->INSTANCE:Landroidx/compose/runtime/ScopeInvalidated;

    invoke-static {v9, v2, v10}, Landroidx/compose/runtime/collection/ScopeMap;->set-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move/from16 v17, v0

    move/from16 v19, v6

    move-object/from16 v26, v8

    goto/16 :goto_9

    .line 1239
    :cond_4
    :try_start_6
    iget-object v9, v1, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .local v9, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v10, 0x0

    .line 2139
    .local v10, "$i$f$anyScopeOf-impl":I
    const/4 v11, 0x0

    .line 2140
    .local v11, "$i$f$forEachScopeOf-impl":I
    invoke-virtual {v9, v2}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 2141
    .local v12, "value$iv$iv":Ljava/lang/Object;
    if-eqz v12, :cond_11

    .line 2144
    instance-of v14, v12, Landroidx/collection/MutableScatterSet;

    if-eqz v14, :cond_e

    .line 2145
    move-object v14, v12

    check-cast v14, Landroidx/collection/MutableScatterSet;

    check-cast v14, Landroidx/collection/ScatterSet;

    .local v14, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v16, 0x0

    .line 2146
    .local v16, "$i$f$forEach":I
    nop

    .line 2147
    iget-object v13, v14, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 2148
    .local v13, "elements$iv$iv$iv":[Ljava/lang/Object;
    move-object/from16 v17, v14

    .local v17, "this_$iv$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v18, 0x0

    .line 2149
    .local v18, "$i$f$forEachIndex":I
    nop

    .line 2150
    move-object/from16 v15, v17

    move/from16 v17, v0

    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .local v15, "this_$iv$iv$iv$iv":Landroidx/collection/ScatterSet;
    .local v17, "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    iget-object v0, v15, Landroidx/collection/ScatterSet;->metadata:[J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 2151
    .local v0, "m$iv$iv$iv$iv":[J
    move/from16 v19, v6

    .end local v6    # "$i$f$synchronized":I
    .local v19, "$i$f$synchronized":I
    :try_start_7
    array-length v6, v0

    add-int/lit8 v6, v6, -0x2

    .line 2153
    .local v6, "lastIndex$iv$iv$iv$iv":I
    move-object/from16 v20, v0

    .end local v0    # "m$iv$iv$iv$iv":[J
    .local v20, "m$iv$iv$iv$iv":[J
    const/4 v0, 0x0

    .local v0, "i$iv$iv$iv$iv":I
    if-gt v0, v6, :cond_b

    .line 2154
    :goto_1
    aget-wide v21, v20, v0

    .line 2155
    .local v21, "slot$iv$iv$iv$iv":J
    move-wide/from16 v23, v21

    .local v23, "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    const/16 v25, 0x0

    .line 2156
    .local v25, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v27, v7

    move-object/from16 v26, v8

    move-wide/from16 v7, v23

    move-object/from16 v23, v9

    move/from16 v24, v10

    .end local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v9    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$f$anyScopeOf-impl":I
    .local v7, "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    .local v23, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v24, "$i$f$anyScopeOf-impl":I
    .local v26, "delegate":Landroidx/compose/runtime/CompositionImpl;
    .local v27, "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    not-long v9, v7

    const/16 v28, 0x7

    shl-long v9, v9, v28

    and-long/2addr v9, v7

    const-wide v28, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v9, v28

    .line 2155
    .end local v7    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    .end local v25    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v7, v7, v28

    if-eqz v7, :cond_a

    .line 2157
    sub-int v7, v0, v6

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    .line 2158
    .local v7, "bitCount$iv$iv$iv$iv":I
    const/4 v9, 0x0

    .local v9, "j$iv$iv$iv$iv":I
    :goto_2
    if-ge v9, v7, :cond_9

    .line 2159
    const-wide/16 v28, 0xff

    and-long v28, v21, v28

    .local v28, "value$iv$iv$iv$iv$iv":J
    const/4 v10, 0x0

    .line 2160
    .local v10, "$i$f$isFull":I
    const-wide/16 v30, 0x80

    cmp-long v25, v28, v30

    if-gez v25, :cond_5

    const/4 v10, 0x1

    goto :goto_3

    :cond_5
    const/4 v10, 0x0

    .line 2159
    .end local v10    # "$i$f$isFull":I
    .end local v28    # "value$iv$iv$iv$iv$iv":J
    :goto_3
    if-eqz v10, :cond_8

    .line 2161
    shl-int/lit8 v10, v0, 0x3

    add-int/2addr v10, v9

    .line 2162
    .local v10, "index$iv$iv$iv$iv":I
    move/from16 v25, v10

    .local v25, "index$iv$iv$iv":I
    const/16 v28, 0x0

    .line 2148
    .local v28, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv$iv":I
    aget-object v29, v13, v25

    .local v29, "it$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 2139
    .local v30, "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1$iv":I
    move-object/from16 v31, v29

    .local v31, "it":Ljava/lang/Object;
    const/16 v32, 0x0

    .line 1239
    .local v32, "$i$a$-anyScopeOf-impl-CompositionImpl$invalidateChecked$delegate$1$1":I
    move/from16 v33, v8

    sget-object v8, Landroidx/compose/runtime/ScopeInvalidated;->INSTANCE:Landroidx/compose/runtime/ScopeInvalidated;

    move/from16 v34, v9

    move-object/from16 v9, v31

    .end local v31    # "it":Ljava/lang/Object;
    .local v9, "it":Ljava/lang/Object;
    .local v34, "j$iv$iv$iv$iv":I
    if-ne v9, v8, :cond_6

    const/4 v8, 0x1

    goto :goto_4

    :cond_6
    const/4 v8, 0x0

    .line 2139
    .end local v9    # "it":Ljava/lang/Object;
    .end local v32    # "$i$a$-anyScopeOf-impl-CompositionImpl$invalidateChecked$delegate$1$1":I
    :goto_4
    if-eqz v8, :cond_7

    const/4 v13, 0x1

    goto/16 :goto_8

    .line 2148
    .end local v29    # "it$iv":Ljava/lang/Object;
    .end local v30    # "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1$iv":I
    :cond_7
    nop

    .line 2162
    .end local v25    # "index$iv$iv$iv":I
    .end local v28    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv$iv":I
    goto :goto_5

    .line 2159
    .end local v10    # "index$iv$iv$iv$iv":I
    .end local v34    # "j$iv$iv$iv$iv":I
    .local v9, "j$iv$iv$iv$iv":I
    :cond_8
    move/from16 v33, v8

    move/from16 v34, v9

    .line 2164
    .end local v9    # "j$iv$iv$iv$iv":I
    .restart local v34    # "j$iv$iv$iv$iv":I
    :goto_5
    shr-long v21, v21, v33

    .line 2158
    add-int/lit8 v9, v34, 0x1

    move/from16 v8, v33

    .end local v34    # "j$iv$iv$iv$iv":I
    .restart local v9    # "j$iv$iv$iv$iv":I
    goto :goto_2

    :cond_9
    move/from16 v33, v8

    move/from16 v34, v9

    .line 2166
    .end local v9    # "j$iv$iv$iv$iv":I
    if-ne v7, v8, :cond_d

    .line 2153
    .end local v7    # "bitCount$iv$iv$iv$iv":I
    .end local v21    # "slot$iv$iv$iv$iv":J
    :cond_a
    if-eq v0, v6, :cond_c

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v9, v23

    move/from16 v10, v24

    move-object/from16 v8, v26

    move-object/from16 v7, v27

    goto :goto_1

    .end local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v24    # "$i$f$anyScopeOf-impl":I
    .end local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .local v7, "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .restart local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .local v9, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v10, "$i$f$anyScopeOf-impl":I
    :cond_b
    move-object/from16 v27, v7

    move-object/from16 v26, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    .line 2169
    .end local v0    # "i$iv$iv$iv$iv":I
    .end local v7    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .end local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v9    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$f$anyScopeOf-impl":I
    .restart local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v24    # "$i$f$anyScopeOf-impl":I
    .restart local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    :cond_c
    nop

    .line 2170
    .end local v6    # "lastIndex$iv$iv$iv$iv":I
    .end local v15    # "this_$iv$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v18    # "$i$f$forEachIndex":I
    .end local v20    # "m$iv$iv$iv$iv":[J
    :cond_d
    nop

    .end local v13    # "elements$iv$iv$iv":[Ljava/lang/Object;
    .end local v14    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v16    # "$i$f$forEach":I
    goto :goto_7

    .line 2171
    .end local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v19    # "$i$f$synchronized":I
    .end local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v24    # "$i$f$anyScopeOf-impl":I
    .end local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .local v0, "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .local v6, "$i$f$synchronized":I
    .restart local v7    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .restart local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v9    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v10    # "$i$f$anyScopeOf-impl":I
    :cond_e
    move/from16 v17, v0

    move/from16 v19, v6

    move-object/from16 v27, v7

    move-object/from16 v26, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v6    # "$i$f$synchronized":I
    .end local v7    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .end local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v9    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$f$anyScopeOf-impl":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .restart local v19    # "$i$f$synchronized":I
    .restart local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v24    # "$i$f$anyScopeOf-impl":I
    .restart local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    move-object v0, v12

    .local v0, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 2139
    .local v6, "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1$iv":I
    move-object v7, v0

    .local v7, "it":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1239
    .local v8, "$i$a$-anyScopeOf-impl-CompositionImpl$invalidateChecked$delegate$1$1":I
    sget-object v9, Landroidx/compose/runtime/ScopeInvalidated;->INSTANCE:Landroidx/compose/runtime/ScopeInvalidated;

    if-ne v7, v9, :cond_f

    const/4 v7, 0x1

    goto :goto_6

    :cond_f
    const/4 v7, 0x0

    .line 2139
    .end local v7    # "it":Ljava/lang/Object;
    .end local v8    # "$i$a$-anyScopeOf-impl-CompositionImpl$invalidateChecked$delegate$1$1":I
    :goto_6
    if-eqz v7, :cond_10

    const/4 v13, 0x1

    goto :goto_8

    .line 2171
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1$iv":I
    :cond_10
    goto :goto_7

    .line 2141
    .end local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v19    # "$i$f$synchronized":I
    .end local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v24    # "$i$f$anyScopeOf-impl":I
    .end local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .local v0, "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .local v6, "$i$f$synchronized":I
    .local v7, "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .local v8, "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v9    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v10    # "$i$f$anyScopeOf-impl":I
    :cond_11
    move/from16 v17, v0

    move/from16 v19, v6

    move-object/from16 v27, v7

    move-object/from16 v26, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    .line 2174
    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v6    # "$i$f$synchronized":I
    .end local v7    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .end local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v9    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$f$anyScopeOf-impl":I
    .end local v12    # "value$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .restart local v19    # "$i$f$synchronized":I
    .restart local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v24    # "$i$f$anyScopeOf-impl":I
    .restart local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    :goto_7
    nop

    .line 2178
    .end local v11    # "$i$f$forEachScopeOf-impl":I
    const/4 v13, 0x0

    .line 1239
    .end local v23    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v24    # "$i$f$anyScopeOf-impl":I
    :goto_8
    if-nez v13, :cond_13

    .line 1240
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, v2, v4}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_9

    .line 2138
    .end local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .end local v27    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    :catchall_1
    move-exception v0

    goto :goto_b

    .line 1220
    .end local v19    # "$i$f$synchronized":I
    .restart local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .restart local v6    # "$i$f$synchronized":I
    .restart local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    :cond_12
    move/from16 v17, v0

    move/from16 v19, v6

    move-object/from16 v26, v8

    .line 1244
    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v6    # "$i$f$synchronized":I
    .end local v8    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .restart local v19    # "$i$f$synchronized":I
    .restart local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    :cond_13
    :goto_9
    nop

    .line 2138
    .end local v17    # "$i$a$-synchronized-CompositionImpl$invalidateChecked$delegate$1":I
    .end local v26    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    monitor-exit v5

    .line 1203
    .end local v5    # "lock$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$synchronized":I
    nop

    .line 1202
    move-object/from16 v0, v26

    .line 1248
    .local v0, "delegate":Landroidx/compose/runtime/CompositionImpl;
    if-eqz v0, :cond_14

    .line 1249
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/runtime/CompositionImpl;->invalidateChecked(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v5

    return-object v5

    .line 1251
    :cond_14
    iget-object v5, v1, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    move-object v6, v1

    check-cast v6, Landroidx/compose/runtime/ControlledComposition;

    invoke-virtual {v5, v6}, Landroidx/compose/runtime/CompositionContext;->invalidate$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V

    .line 1252
    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionImpl;->isComposing()Z

    move-result v5

    if-eqz v5, :cond_15

    sget-object v5, Landroidx/compose/runtime/InvalidationResult;->DEFERRED:Landroidx/compose/runtime/InvalidationResult;

    goto :goto_a

    :cond_15
    sget-object v5, Landroidx/compose/runtime/InvalidationResult;->SCHEDULED:Landroidx/compose/runtime/InvalidationResult;

    :goto_a
    return-object v5

    .line 2138
    .end local v0    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v5    # "lock$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move/from16 v19, v6

    .end local v6    # "$i$f$synchronized":I
    .restart local v19    # "$i$f$synchronized":I
    :goto_b
    monitor-exit v5

    throw v0
.end method

.method private final invalidateScopeOfLocked(Ljava/lang/Object;)V
    .locals 25
    .param p1, "value"    # Ljava/lang/Object;

    .line 974
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v3, 0x0

    .line 1860
    .local v3, "$i$f$forEachScopeOf-impl":I
    invoke-virtual {v2, v1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1861
    .local v4, "value$iv":Ljava/lang/Object;
    if-eqz v4, :cond_a

    .line 1864
    instance-of v5, v4, Landroidx/collection/MutableScatterSet;

    if-eqz v5, :cond_8

    .line 1865
    move-object v5, v4

    check-cast v5, Landroidx/collection/MutableScatterSet;

    check-cast v5, Landroidx/collection/ScatterSet;

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 1866
    .local v6, "$i$f$forEach":I
    nop

    .line 1867
    iget-object v7, v5, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1868
    .local v7, "elements$iv$iv":[Ljava/lang/Object;
    move-object v8, v5

    .local v8, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v9, 0x0

    .line 1869
    .local v9, "$i$f$forEachIndex":I
    nop

    .line 1870
    iget-object v10, v8, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1871
    .local v10, "m$iv$iv$iv":[J
    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    .line 1873
    .local v11, "lastIndex$iv$iv$iv":I
    const/4 v12, 0x0

    .local v12, "i$iv$iv$iv":I
    if-gt v12, v11, :cond_5

    .line 1874
    :goto_0
    aget-wide v13, v10, v12

    .line 1875
    .local v13, "slot$iv$iv$iv":J
    move-wide v15, v13

    .local v15, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1876
    .local v17, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-wide v2, v15

    move-object v15, v4

    move-object/from16 v16, v5

    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v2, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v15, "value$iv":Ljava/lang/Object;
    .local v16, "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v18, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v19, "$i$f$forEachScopeOf-impl":I
    not-long v4, v2

    const/16 v20, 0x7

    shl-long v4, v4, v20

    and-long/2addr v4, v2

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v4, v20

    .line 1875
    .end local v2    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v17    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v20

    if-eqz v2, :cond_4

    .line 1877
    sub-int v2, v12, v11

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 1878
    .local v2, "bitCount$iv$iv$iv":I
    const/4 v4, 0x0

    .local v4, "j$iv$iv$iv":I
    :goto_1
    if-ge v4, v2, :cond_3

    .line 1879
    const-wide/16 v20, 0xff

    and-long v20, v13, v20

    .local v20, "value$iv$iv$iv$iv":J
    const/4 v5, 0x0

    .line 1880
    .local v5, "$i$f$isFull":I
    const-wide/16 v22, 0x80

    cmp-long v17, v20, v22

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1879
    .end local v5    # "$i$f$isFull":I
    .end local v20    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v17, :cond_2

    .line 1881
    shl-int/lit8 v5, v12, 0x3

    add-int/2addr v5, v4

    .line 1882
    .local v5, "index$iv$iv$iv":I
    move/from16 v17, v5

    .local v17, "index$iv$iv":I
    const/16 v20, 0x0

    .line 1868
    .local v20, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    aget-object v21, v7, v17

    move/from16 v22, v3

    move-object/from16 v3, v21

    check-cast v3, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v3, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/16 v21, 0x0

    .line 975
    .local v21, "$i$a$-forEachScopeOf-impl-CompositionImpl$invalidateScopeOfLocked$1":I
    move/from16 v23, v4

    .end local v4    # "j$iv$iv$iv":I
    .local v23, "j$iv$iv$iv":I
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v4

    move/from16 v24, v5

    .end local v5    # "index$iv$iv$iv":I
    .local v24, "index$iv$iv$iv":I
    sget-object v5, Landroidx/compose/runtime/InvalidationResult;->IMMINENT:Landroidx/compose/runtime/InvalidationResult;

    if-ne v4, v5, :cond_1

    .line 977
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->observationsProcessed:Landroidx/collection/MutableScatterMap;

    invoke-static {v4, v1, v3}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 979
    :cond_1
    nop

    .line 1868
    .end local v3    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v21    # "$i$a$-forEachScopeOf-impl-CompositionImpl$invalidateScopeOfLocked$1":I
    nop

    .line 1882
    .end local v17    # "index$iv$iv":I
    .end local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_3

    .line 1879
    .end local v23    # "j$iv$iv$iv":I
    .end local v24    # "index$iv$iv$iv":I
    .restart local v4    # "j$iv$iv$iv":I
    :cond_2
    move/from16 v22, v3

    move/from16 v23, v4

    .line 1884
    .end local v4    # "j$iv$iv$iv":I
    .restart local v23    # "j$iv$iv$iv":I
    :goto_3
    shr-long v13, v13, v22

    .line 1878
    add-int/lit8 v4, v23, 0x1

    move/from16 v3, v22

    .end local v23    # "j$iv$iv$iv":I
    .restart local v4    # "j$iv$iv$iv":I
    goto :goto_1

    :cond_3
    move/from16 v22, v3

    move/from16 v23, v4

    .line 1886
    .end local v4    # "j$iv$iv$iv":I
    if-ne v2, v3, :cond_7

    .line 1873
    .end local v2    # "bitCount$iv$iv$iv":I
    .end local v13    # "slot$iv$iv$iv":J
    :cond_4
    if-eq v12, v11, :cond_6

    add-int/lit8 v12, v12, 0x1

    move-object v4, v15

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move/from16 v3, v19

    goto :goto_0

    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$forEachScopeOf-impl":I
    .local v4, "value$iv":Ljava/lang/Object;
    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_5
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object v15, v4

    move-object/from16 v16, v5

    .line 1889
    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "i$iv$iv$iv":I
    .restart local v15    # "value$iv":Ljava/lang/Object;
    .restart local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "$i$f$forEachScopeOf-impl":I
    :cond_6
    nop

    .line 1890
    .end local v8    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "$i$f$forEachIndex":I
    .end local v10    # "m$iv$iv$iv":[J
    .end local v11    # "lastIndex$iv$iv$iv":I
    :cond_7
    nop

    .end local v6    # "$i$f$forEach":I
    .end local v7    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    goto :goto_4

    .line 1891
    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    .restart local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "$i$f$forEachScopeOf-impl":I
    .restart local v4    # "value$iv":Ljava/lang/Object;
    :cond_8
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object v15, v4

    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .restart local v15    # "value$iv":Ljava/lang/Object;
    .restart local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "$i$f$forEachScopeOf-impl":I
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v2, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v3, 0x0

    .line 975
    .local v3, "$i$a$-forEachScopeOf-impl-CompositionImpl$invalidateScopeOfLocked$1":I
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v4

    sget-object v5, Landroidx/compose/runtime/InvalidationResult;->IMMINENT:Landroidx/compose/runtime/InvalidationResult;

    if-ne v4, v5, :cond_9

    .line 977
    iget-object v4, v0, Landroidx/compose/runtime/CompositionImpl;->observationsProcessed:Landroidx/collection/MutableScatterMap;

    invoke-static {v4, v1, v2}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 979
    :cond_9
    nop

    .line 1891
    .end local v2    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v3    # "$i$a$-forEachScopeOf-impl-CompositionImpl$invalidateScopeOfLocked$1":I
    goto :goto_4

    .line 1861
    .end local v15    # "value$iv":Ljava/lang/Object;
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$forEachScopeOf-impl":I
    .restart local v4    # "value$iv":Ljava/lang/Object;
    :cond_a
    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object v15, v4

    .line 1894
    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachScopeOf-impl":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    .restart local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "$i$f$forEachScopeOf-impl":I
    :goto_4
    nop

    .line 980
    .end local v18    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$forEachScopeOf-impl":I
    return-void
.end method

.method private final observer()Landroidx/compose/runtime/tooling/CompositionObserver;
    .locals 4

    .line 1305
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observerHolder:Landroidx/compose/runtime/CompositionObserverHolder;

    .line 1307
    .local v0, "holder":Landroidx/compose/runtime/CompositionObserverHolder;
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionObserverHolder;->getRoot()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1308
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionObserverHolder;->getObserver()Landroidx/compose/runtime/tooling/CompositionObserver;

    move-result-object v1

    goto :goto_1

    .line 1310
    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionContext;->getObserverHolder$runtime_release()Landroidx/compose/runtime/CompositionObserverHolder;

    move-result-object v1

    .line 1311
    .local v1, "parentHolder":Landroidx/compose/runtime/CompositionObserverHolder;
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionObserverHolder;->getObserver()Landroidx/compose/runtime/tooling/CompositionObserver;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 1312
    .local v2, "parentObserver":Landroidx/compose/runtime/tooling/CompositionObserver;
    :goto_0
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionObserverHolder;->getObserver()Landroidx/compose/runtime/tooling/CompositionObserver;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1313
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/CompositionObserverHolder;->setObserver(Landroidx/compose/runtime/tooling/CompositionObserver;)V

    .line 1315
    :cond_2
    move-object v1, v2

    .line 1307
    .end local v1    # "parentHolder":Landroidx/compose/runtime/CompositionObserverHolder;
    .end local v2    # "parentObserver":Landroidx/compose/runtime/tooling/CompositionObserver;
    :goto_1
    return-object v1
.end method

.method private final takeInvalidations-afanTW4()Landroidx/collection/MutableScatterMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1271
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 1272
    .local v0, "invalidations":Landroidx/collection/MutableScatterMap;
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 1273
    return-object v0
.end method

.method private final trackAbandonedValues(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 5
    .param p1, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1294
    .local v0, "$i$f$trackAbandonedValues":I
    const/4 v1, 0x0

    .line 1295
    .local v1, "success":Z
    nop

    .line 1296
    :try_start_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v2

    .line 1356
    .local v3, "it":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 1296
    .local v4, "$i$a$-also-CompositionImpl$trackAbandonedValues$1":I
    const/4 v1, 0x1

    .line 1298
    .end local v3    # "it":Ljava/lang/Object;
    .end local v4    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1":I
    nop

    .line 1301
    nop

    .line 1295
    return-object v2

    .line 1298
    :catchall_0
    move-exception v2

    if-nez v1, :cond_0

    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1299
    new-instance v3, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v4, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v3, v4}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v3}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_0
    throw v2
.end method

.method private final tryImminentInvalidation(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "scope"    # Landroidx/compose/runtime/RecomposeScopeImpl;
    .param p2, "instance"    # Ljava/lang/Object;

    .line 1195
    invoke-virtual {p0}, Landroidx/compose/runtime/CompositionImpl;->isComposing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/runtime/ComposerImpl;->tryImminentInvalidation$runtime_release(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final validateRecomposeScopeAnchors(Landroidx/compose/runtime/SlotTable;)V
    .locals 16
    .param p1, "slotTable"    # Landroidx/compose/runtime/SlotTable;

    .line 1281
    move-object/from16 v0, p1

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v1

    .local v1, "$this$mapNotNull$iv":[Ljava/lang/Object;
    const/4 v2, 0x0

    .line 2179
    .local v2, "$i$f$mapNotNull":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapNotNullTo$iv$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 2187
    .local v5, "$i$f$mapNotNullTo":I
    move-object v6, v4

    .local v6, "$this$forEach$iv$iv$iv":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 2188
    .local v7, "$i$f$forEach":I
    array-length v8, v6

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    aget-object v10, v6, v9

    .local v10, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "element$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 2187
    .local v12, "$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv":I
    move-object v13, v11

    .local v13, "it":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1281
    .local v14, "$i$a$-mapNotNull-CompositionImpl$validateRecomposeScopeAnchors$scopes$1":I
    instance-of v15, v13, Landroidx/compose/runtime/RecomposeScopeImpl;

    if-eqz v15, :cond_0

    move-object v15, v13

    check-cast v15, Landroidx/compose/runtime/RecomposeScopeImpl;

    goto :goto_1

    :cond_0
    const/4 v15, 0x0

    .line 2187
    .end local v13    # "it":Ljava/lang/Object;
    .end local v14    # "$i$a$-mapNotNull-CompositionImpl$validateRecomposeScopeAnchors$scopes$1":I
    :goto_1
    if-eqz v15, :cond_1

    .line 2189
    .local v15, "it$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 2187
    .local v13, "$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v3, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 2188
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv":I
    .end local v13    # "$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv":I
    .end local v15    # "it$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v10    # "element$iv$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 2190
    :cond_2
    nop

    .line 2191
    .end local v6    # "$this$forEach$iv$iv$iv":[Ljava/lang/Object;
    .end local v7    # "$i$f$forEach":I
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapNotNullTo$iv$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$mapNotNullTo":I
    check-cast v3, Ljava/util/List;

    .line 2179
    nop

    .line 1281
    .end local v1    # "$this$mapNotNull$iv":[Ljava/lang/Object;
    .end local v2    # "$i$f$mapNotNull":I
    nop

    .line 1282
    .local v3, "scopes":Ljava/util/List;
    move-object v1, v3

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 2192
    .local v2, "$i$f$fastForEach":I
    nop

    .line 2193
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_5

    .line 2194
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 2195
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v7, "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v8, 0x0

    .line 1283
    .local v8, "$i$a$-fastForEach-CompositionImpl$validateRecomposeScopeAnchors$1":I
    invoke-virtual {v7}, Landroidx/compose/runtime/RecomposeScopeImpl;->getAnchor()Landroidx/compose/runtime/Anchor;

    move-result-object v9

    if-eqz v9, :cond_4

    .local v9, "anchor":Landroidx/compose/runtime/Anchor;
    const/4 v10, 0x0

    .line 1284
    .local v10, "$i$a$-let-CompositionImpl$validateRecomposeScopeAnchors$1$1":I
    invoke-virtual {v9, v0}, Landroidx/compose/runtime/Anchor;->toIndexFor(Landroidx/compose/runtime/SlotTable;)I

    move-result v11

    invoke-virtual {v0, v11}, Landroidx/compose/runtime/SlotTable;->slotsOf$runtime_release(I)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    .local v11, "value$iv":Z
    const/4 v12, 0x0

    .line 2196
    .local v12, "$i$f$checkPrecondition":I
    nop

    .line 2197
    if-nez v11, :cond_3

    .line 2198
    const/4 v13, 0x0

    .line 1285
    .local v13, "$i$a$-checkPrecondition-CompositionImpl$validateRecomposeScopeAnchors$1$1$1":I
    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14, v7}, Lkotlin/collections/ArraysKt;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v14

    .line 1286
    .local v14, "dataIndex":I
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Misaligned anchor "

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v15, " in scope "

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v15, " encountered, scope found at "

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1287
    nop

    .line 1286
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1287
    nop

    .line 2198
    .end local v13    # "$i$a$-checkPrecondition-CompositionImpl$validateRecomposeScopeAnchors$1$1$1":I
    .end local v14    # "dataIndex":I
    invoke-static {v0}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 2200
    :cond_3
    nop

    .line 1289
    .end local v11    # "value$iv":Z
    .end local v12    # "$i$f$checkPrecondition":I
    nop

    .line 1283
    .end local v9    # "anchor":Landroidx/compose/runtime/Anchor;
    .end local v10    # "$i$a$-let-CompositionImpl$validateRecomposeScopeAnchors$1$1":I
    nop

    .line 1290
    :cond_4
    nop

    .line 2195
    .end local v7    # "scope":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v8    # "$i$a$-fastForEach-CompositionImpl$validateRecomposeScopeAnchors$1":I
    nop

    .line 2193
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p1

    goto :goto_2

    .line 2201
    .end local v4    # "index$iv":I
    :cond_5
    nop

    .line 1291
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    return-void
.end method


# virtual methods
.method public abandonChanges()V
    .locals 2

    .line 1118
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1119
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->changes:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/ChangeList;->clear()V

    .line 1120
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/ChangeList;->clear()V

    .line 1122
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1123
    new-instance v0, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v0, v1}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    .line 1125
    :cond_0
    return-void
.end method

.method public applyChanges()V
    .locals 11

    .line 1065
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 2073
    .local v1, "$i$f$synchronized":I
    nop

    .line 2074
    monitor-enter v0

    const/4 v2, 0x0

    .line 1066
    .local v2, "$i$a$-synchronized-CompositionImpl$applyChanges$1":I
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v4, 0x0

    .line 2075
    .local v4, "$i$f$guardChanges":I
    nop

    .line 2076
    move-object v5, v3

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v6, 0x0

    .line 2077
    .local v6, "$i$f$trackAbandonedValues":I
    const/4 v7, 0x0

    .line 2078
    .local v7, "success$iv$iv":Z
    nop

    .line 2079
    const/4 v8, 0x0

    .line 1067
    .local v8, "$i$a$-guardChanges-CompositionImpl$applyChanges$1$1":I
    :try_start_0
    iget-object v9, p0, Landroidx/compose/runtime/CompositionImpl;->changes:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-direct {p0, v9}, Landroidx/compose/runtime/CompositionImpl;->applyChangesInLocked(Landroidx/compose/runtime/changelist/ChangeList;)V

    .line 1068
    invoke-direct {p0}, Landroidx/compose/runtime/CompositionImpl;->drainPendingModificationsLocked()V

    .line 1069
    nop

    .end local v8    # "$i$a$-guardChanges-CompositionImpl$applyChanges$1$1":I
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2079
    nop

    .line 2080
    .local v8, "it$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 2079
    .local v9, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    const/4 v7, 0x1

    .line 2081
    .end local v8    # "it$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    nop

    .line 2084
    nop

    .line 2078
    nop

    .line 2088
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "$i$f$trackAbandonedValues":I
    .end local v7    # "success$iv$iv":Z
    nop

    .line 1070
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$applyChanges$1":I
    :try_start_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2074
    monitor-exit v0

    .line 1071
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 2081
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$applyChanges$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardChanges":I
    .restart local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v6    # "$i$f$trackAbandonedValues":I
    .restart local v7    # "success$iv$iv":Z
    :catchall_0
    move-exception v8

    if-nez v7, :cond_0

    :try_start_2
    iget-object v9, v5, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_0

    .line 2082
    new-instance v9, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v10, v5, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v9, v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v9}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_0
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local v2    # "$i$a$-synchronized-CompositionImpl$applyChanges$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    throw v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2074
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "$i$f$trackAbandonedValues":I
    .end local v7    # "success$iv$iv":Z
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_1
    move-exception v2

    goto :goto_0

    .line 2085
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$applyChanges$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardChanges":I
    :catch_0
    move-exception v5

    .line 2086
    .local v5, "e$iv":Ljava/lang/Exception;
    :try_start_3
    invoke-virtual {v3}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 2087
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2074
    .end local v2    # "$i$a$-synchronized-CompositionImpl$applyChanges$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    .end local v5    # "e$iv":Ljava/lang/Exception;
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :goto_0
    monitor-exit v0

    throw v2
.end method

.method public applyLateChanges()V
    .locals 11

    .line 1074
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 2089
    .local v1, "$i$f$synchronized":I
    nop

    .line 2090
    monitor-enter v0

    const/4 v2, 0x0

    .line 1075
    .local v2, "$i$a$-synchronized-CompositionImpl$applyLateChanges$1":I
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v4, 0x0

    .line 2091
    .local v4, "$i$f$guardChanges":I
    nop

    .line 2092
    move-object v5, v3

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v6, 0x0

    .line 2093
    .local v6, "$i$f$trackAbandonedValues":I
    const/4 v7, 0x0

    .line 2094
    .local v7, "success$iv$iv":Z
    nop

    .line 2095
    const/4 v8, 0x0

    .line 1076
    .local v8, "$i$a$-guardChanges-CompositionImpl$applyLateChanges$1$1":I
    :try_start_0
    iget-object v9, p0, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v9}, Landroidx/compose/runtime/changelist/ChangeList;->isNotEmpty()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 1077
    iget-object v9, p0, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-direct {p0, v9}, Landroidx/compose/runtime/CompositionImpl;->applyChangesInLocked(Landroidx/compose/runtime/changelist/ChangeList;)V

    .line 1079
    :cond_0
    nop

    .end local v8    # "$i$a$-guardChanges-CompositionImpl$applyLateChanges$1$1":I
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2095
    nop

    .line 2096
    .local v8, "it$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 2095
    .local v9, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    const/4 v7, 0x1

    .line 2097
    .end local v8    # "it$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    nop

    .line 2100
    nop

    .line 2094
    nop

    .line 2104
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "$i$f$trackAbandonedValues":I
    .end local v7    # "success$iv$iv":Z
    nop

    .line 1080
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$applyLateChanges$1":I
    :try_start_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2090
    monitor-exit v0

    .line 1081
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 2097
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$applyLateChanges$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardChanges":I
    .restart local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v6    # "$i$f$trackAbandonedValues":I
    .restart local v7    # "success$iv$iv":Z
    :catchall_0
    move-exception v8

    if-nez v7, :cond_1

    :try_start_2
    iget-object v9, v5, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    .line 2098
    new-instance v9, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v10, v5, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v9, v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v9}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_1
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local v2    # "$i$a$-synchronized-CompositionImpl$applyLateChanges$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    throw v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2090
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "$i$f$trackAbandonedValues":I
    .end local v7    # "success$iv$iv":Z
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_1
    move-exception v2

    goto :goto_0

    .line 2101
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$applyLateChanges$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardChanges":I
    :catch_0
    move-exception v5

    .line 2102
    .local v5, "e$iv":Ljava/lang/Exception;
    :try_start_3
    invoke-virtual {v3}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 2103
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2090
    .end local v2    # "$i$a$-synchronized-CompositionImpl$applyLateChanges$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    .end local v5    # "e$iv":Ljava/lang/Exception;
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :goto_0
    monitor-exit v0

    throw v2
.end method

.method public changesApplied()V
    .locals 11

    .line 1084
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 2105
    .local v1, "$i$f$synchronized":I
    nop

    .line 2106
    monitor-enter v0

    const/4 v2, 0x0

    .line 1085
    .local v2, "$i$a$-synchronized-CompositionImpl$changesApplied$1":I
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v4, 0x0

    .line 2107
    .local v4, "$i$f$guardChanges":I
    nop

    .line 2108
    move-object v5, v3

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v6, 0x0

    .line 2109
    .local v6, "$i$f$trackAbandonedValues":I
    const/4 v7, 0x0

    .line 2110
    .local v7, "success$iv$iv":Z
    nop

    .line 2111
    const/4 v8, 0x0

    .line 1086
    .local v8, "$i$a$-guardChanges-CompositionImpl$changesApplied$1$1":I
    :try_start_0
    iget-object v9, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v9}, Landroidx/compose/runtime/ComposerImpl;->changesApplied$runtime_release()V

    .line 1090
    iget-object v9, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_0

    .line 1091
    new-instance v9, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v10, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v9, v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v9}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    .line 1093
    :cond_0
    nop

    .end local v8    # "$i$a$-guardChanges-CompositionImpl$changesApplied$1$1":I
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2111
    nop

    .line 2112
    .local v8, "it$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 2111
    .local v9, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    const/4 v7, 0x1

    .line 2113
    .end local v8    # "it$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    nop

    .line 2116
    nop

    .line 2110
    nop

    .line 2120
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "$i$f$trackAbandonedValues":I
    .end local v7    # "success$iv$iv":Z
    nop

    .line 1094
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$changesApplied$1":I
    :try_start_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2106
    monitor-exit v0

    .line 1095
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 2113
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$changesApplied$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardChanges":I
    .restart local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v6    # "$i$f$trackAbandonedValues":I
    .restart local v7    # "success$iv$iv":Z
    :catchall_0
    move-exception v8

    if-nez v7, :cond_1

    :try_start_2
    iget-object v9, v5, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    .line 2114
    new-instance v9, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v10, v5, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v9, v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v9}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_1
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    .end local v2    # "$i$a$-synchronized-CompositionImpl$changesApplied$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    throw v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2106
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "$i$f$trackAbandonedValues":I
    .end local v7    # "success$iv$iv":Z
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_1
    move-exception v2

    goto :goto_0

    .line 2117
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$changesApplied$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardChanges":I
    :catch_0
    move-exception v5

    .line 2118
    .local v5, "e$iv":Ljava/lang/Exception;
    :try_start_3
    invoke-virtual {v3}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 2119
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2106
    .end local v2    # "$i$a$-synchronized-CompositionImpl$changesApplied$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardChanges":I
    .end local v5    # "e$iv":Ljava/lang/Exception;
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :goto_0
    monitor-exit v0

    throw v2
.end method

.method public composeContent(Lkotlin/jvm/functions/Function2;)V
    .locals 19
    .param p1, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 780
    move-object/from16 v1, p0

    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v3, 0x0

    .line 1407
    .local v3, "$i$f$guardChanges":I
    nop

    .line 1408
    move-object v4, v2

    .local v4, "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v5, 0x0

    .line 1409
    .local v5, "$i$f$trackAbandonedValues":I
    const/4 v6, 0x0

    .line 1410
    .local v6, "success$iv$iv":Z
    nop

    .line 1411
    const/4 v7, 0x0

    .line 781
    .local v7, "$i$a$-guardChanges-CompositionImpl$composeContent$1":I
    :try_start_0
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    move-object v8, v0

    .local v8, "lock$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1412
    .local v9, "$i$f$synchronized":I
    nop

    .line 1413
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    const/4 v10, 0x0

    .line 782
    .local v10, "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    :try_start_1
    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->drainPendingModificationsForCompositionLocked()V

    .line 783
    move-object/from16 v11, p0

    .local v11, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v12, 0x0

    .line 1414
    .local v12, "$i$f$guardInvalidationsLocked":I
    invoke-direct {v11}, Landroidx/compose/runtime/CompositionImpl;->takeInvalidations-afanTW4()Landroidx/collection/MutableScatterMap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object v13, v0

    .line 1415
    .local v13, "invalidations$iv":Landroidx/collection/MutableScatterMap;
    nop

    .line 1416
    move-object v0, v13

    .local v0, "invalidations":Landroidx/collection/MutableScatterMap;
    const/4 v14, 0x0

    .line 784
    .local v14, "$i$a$-guardInvalidationsLocked-CompositionImpl$composeContent$1$1$1":I
    :try_start_2
    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->observer()Landroidx/compose/runtime/tooling/CompositionObserver;

    move-result-object v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 785
    .local v15, "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    if-eqz v15, :cond_0

    .line 787
    nop

    .line 788
    move-object/from16 v16, v2

    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .local v16, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :try_start_3
    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/Composition;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 789
    move/from16 v17, v3

    .end local v3    # "$i$f$guardChanges":I
    .local v17, "$i$f$guardChanges":I
    :try_start_4
    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->asMap-impl(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;

    move-result-object v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move/from16 v18, v5

    .end local v5    # "$i$f$trackAbandonedValues":I
    .local v18, "$i$f$trackAbandonedValues":I
    :try_start_5
    const-string/jumbo v5, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 787
    invoke-interface {v15, v2, v3}, Landroidx/compose/runtime/tooling/CompositionObserver;->onBeginComposition(Landroidx/compose/runtime/Composition;Ljava/util/Map;)V

    goto :goto_0

    .line 1413
    .end local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .end local v14    # "$i$a$-guardInvalidationsLocked-CompositionImpl$composeContent$1$1$1":I
    .end local v15    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    :catchall_0
    move-exception v0

    move/from16 v18, v5

    move-object/from16 v5, p1

    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    goto/16 :goto_3

    .line 1417
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    .restart local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catch_0
    move-exception v0

    move/from16 v18, v5

    move-object/from16 v5, p1

    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    goto :goto_2

    .line 1413
    .end local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v3    # "$i$f$guardChanges":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    :catchall_1
    move-exception v0

    move/from16 v17, v3

    move/from16 v18, v5

    move-object/from16 v5, p1

    .end local v3    # "$i$f$guardChanges":I
    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    goto :goto_3

    .line 1417
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v3    # "$i$f$guardChanges":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    .restart local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catch_1
    move-exception v0

    move/from16 v17, v3

    move/from16 v18, v5

    move-object/from16 v5, p1

    .end local v3    # "$i$f$guardChanges":I
    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    goto :goto_2

    .line 785
    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$guardChanges":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    .restart local v14    # "$i$a$-guardInvalidationsLocked-CompositionImpl$composeContent$1$1$1":I
    .restart local v15    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    :cond_0
    move-object/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v5

    .line 792
    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v3    # "$i$f$guardChanges":I
    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    :goto_0
    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    iget-object v3, v1, Landroidx/compose/runtime/CompositionImpl;->shouldPause:Landroidx/compose/runtime/ShouldPauseCallback;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-object/from16 v5, p1

    :try_start_6
    invoke-virtual {v2, v0, v5, v3}, Landroidx/compose/runtime/ComposerImpl;->composeContent--ZbOJvo$runtime_release(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V

    .line 793
    if-eqz v15, :cond_1

    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/Composition;

    invoke-interface {v15, v2}, Landroidx/compose/runtime/tooling/CompositionObserver;->onEndComposition(Landroidx/compose/runtime/Composition;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 1416
    .end local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .end local v14    # "$i$a$-guardInvalidationsLocked-CompositionImpl$composeContent$1$1$1":I
    .end local v15    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    :goto_1
    nop

    .line 1415
    nop

    .line 794
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    nop

    .line 1413
    .end local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    :try_start_7
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 795
    .end local v8    # "lock$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    nop

    .line 1411
    .end local v7    # "$i$a$-guardChanges-CompositionImpl$composeContent$1":I
    nop

    .line 1420
    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 1411
    .local v0, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    const/4 v0, 0x1

    .line 1421
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v6    # "success$iv$iv":Z
    .local v0, "success$iv$iv":Z
    nop

    .line 1424
    nop

    .line 1410
    nop

    .line 1428
    .end local v0    # "success$iv$iv":Z
    .end local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v18    # "$i$f$trackAbandonedValues":I
    nop

    .line 797
    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    return-void

    .line 1417
    .restart local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v6    # "success$iv$iv":Z
    .restart local v7    # "$i$a$-guardChanges-CompositionImpl$composeContent$1":I
    .restart local v8    # "lock$iv":Ljava/lang/Object;
    .restart local v9    # "$i$f$synchronized":I
    .restart local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    :catch_2
    move-exception v0

    goto :goto_2

    .line 1413
    .end local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catchall_2
    move-exception v0

    move-object/from16 v5, p1

    goto :goto_3

    .line 1417
    .restart local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catch_3
    move-exception v0

    move-object/from16 v5, p1

    goto :goto_2

    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .local v2, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$guardChanges":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    :catch_4
    move-exception v0

    move-object/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v5

    move-object/from16 v5, p1

    .line 1418
    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v3    # "$i$f$guardChanges":I
    .end local v5    # "$i$f$trackAbandonedValues":I
    .local v0, "e$iv":Ljava/lang/Exception;
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    :goto_2
    :try_start_8
    iput-object v13, v11, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 1419
    nop

    .end local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "success$iv$iv":Z
    .end local v7    # "$i$a$-guardChanges-CompositionImpl$composeContent$1":I
    .end local v8    # "lock$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .end local p1    # "content":Lkotlin/jvm/functions/Function2;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1413
    .end local v0    # "e$iv":Ljava/lang/Exception;
    .end local v10    # "$i$a$-synchronized-CompositionImpl$composeContent$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .restart local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v6    # "success$iv$iv":Z
    .restart local v7    # "$i$a$-guardChanges-CompositionImpl$composeContent$1":I
    .restart local v8    # "lock$iv":Ljava/lang/Object;
    .restart local v9    # "$i$f$synchronized":I
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    .restart local p1    # "content":Lkotlin/jvm/functions/Function2;
    :catchall_3
    move-exception v0

    goto :goto_3

    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$guardChanges":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    :catchall_4
    move-exception v0

    move-object/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v5

    move-object/from16 v5, p1

    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v3    # "$i$f$guardChanges":I
    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    :goto_3
    :try_start_9
    monitor-exit v8

    .end local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "success$iv$iv":Z
    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .end local p1    # "content":Lkotlin/jvm/functions/Function2;
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 1421
    .end local v7    # "$i$a$-guardChanges-CompositionImpl$composeContent$1":I
    .end local v8    # "lock$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    .restart local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v6    # "success$iv$iv":Z
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    .restart local p1    # "content":Lkotlin/jvm/functions/Function2;
    :catchall_5
    move-exception v0

    goto :goto_4

    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$guardChanges":I
    .restart local v5    # "$i$f$trackAbandonedValues":I
    :catchall_6
    move-exception v0

    move-object/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v5

    move-object/from16 v5, p1

    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v3    # "$i$f$guardChanges":I
    .end local v5    # "$i$f$trackAbandonedValues":I
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local v18    # "$i$f$trackAbandonedValues":I
    :goto_4
    if-nez v6, :cond_2

    :try_start_a
    iget-object v2, v4, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 1422
    new-instance v2, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v3, v4, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v2, v3}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v2}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_2
    nop

    .end local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v17    # "$i$f$guardChanges":I
    .end local p1    # "content":Lkotlin/jvm/functions/Function2;
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 1425
    .end local v4    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v6    # "success$iv$iv":Z
    .end local v18    # "$i$f$trackAbandonedValues":I
    .restart local v16    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$f$guardChanges":I
    .restart local p1    # "content":Lkotlin/jvm/functions/Function2;
    :catch_5
    move-exception v0

    .line 1426
    .restart local v0    # "e$iv":Ljava/lang/Exception;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 1427
    throw v0
.end method

.method public final composerStacksSizes$runtime_release()I
    .locals 1

    .line 1344
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposerImpl;->stacksSize$runtime_release()I

    move-result v0

    return v0
.end method

.method public deactivate()V
    .locals 18

    .line 1320
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 2202
    .local v3, "$i$f$synchronized":I
    nop

    .line 2203
    monitor-enter v2

    const/4 v4, 0x0

    .line 1321
    .local v4, "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    :try_start_0
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroupsSize()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    .line 1322
    .local v5, "nonEmptySlotTable":Z
    if-nez v5, :cond_2

    :try_start_1
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v17, v3

    goto :goto_3

    .line 2203
    .end local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .end local v5    # "nonEmptySlotTable":Z
    :catchall_0
    move-exception v0

    move/from16 v17, v3

    goto/16 :goto_5

    .line 1323
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .restart local v5    # "nonEmptySlotTable":Z
    :cond_2
    :goto_1
    :try_start_2
    const-string v0, "Compose:deactivate"

    move-object v6, v0

    .local v6, "sectionName$iv":Ljava/lang/String;
    const/4 v7, 0x0

    .line 2204
    .local v7, "$i$f$trace":I
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v6}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-object v8, v0

    .line 2205
    .local v8, "token$iv":Ljava/lang/Object;
    nop

    .line 2206
    const/4 v9, 0x0

    .line 1324
    .local v9, "$i$a$-trace-CompositionImpl$deactivate$1$1":I
    :try_start_3
    new-instance v0, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v10, v1, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v0, v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    move-object v10, v0

    .line 1325
    .local v10, "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    if-eqz v5, :cond_3

    .line 1326
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    invoke-interface {v0}, Landroidx/compose/runtime/Applier;->onBeginChanges()V

    .line 1327
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    move-object v11, v0

    .local v11, "this_$iv":Landroidx/compose/runtime/SlotTable;
    const/4 v12, 0x0

    .line 2207
    .local v12, "$i$f$write":I
    invoke-virtual {v11}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move-object v13, v0

    .local v13, "writer$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v14, 0x0

    .line 2208
    .local v14, "$i$a$-let-SlotTable$write$1$iv":I
    const/4 v15, 0x0

    .line 2209
    .local v15, "normalClose$iv":Z
    nop

    .line 2210
    move-object v0, v13

    .local v0, "writer":Landroidx/compose/runtime/SlotWriter;
    const/16 v16, 0x0

    .line 1327
    .local v16, "$i$a$-write-CompositionImpl$deactivate$1$1$1":I
    move/from16 v17, v3

    .end local v3    # "$i$f$synchronized":I
    .local v17, "$i$f$synchronized":I
    :try_start_4
    move-object v3, v10

    check-cast v3, Landroidx/compose/runtime/RememberManager;

    invoke-static {v0, v3}, Landroidx/compose/runtime/ComposerKt;->deactivateCurrentGroup(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    .end local v0    # "writer":Landroidx/compose/runtime/SlotWriter;
    .end local v16    # "$i$a$-write-CompositionImpl$deactivate$1$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 2210
    nop

    .line 2211
    .local v0, "it$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 2210
    .local v3, "$i$a$-also-SlotTable$write$1$1$iv":I
    const/4 v0, 0x1

    .line 2212
    .end local v3    # "$i$a$-also-SlotTable$write$1$1$iv":I
    .end local v15    # "normalClose$iv":Z
    .local v0, "normalClose$iv":Z
    :try_start_5
    invoke-virtual {v13, v0}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .line 2213
    nop

    .line 2207
    .end local v0    # "normalClose$iv":Z
    .end local v13    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v14    # "$i$a$-let-SlotTable$write$1$iv":I
    nop

    .line 2214
    nop

    .line 1328
    .end local v11    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v12    # "$i$f$write":I
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    invoke-interface {v0}, Landroidx/compose/runtime/Applier;->onEndChanges()V

    .line 1329
    invoke-virtual {v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchRememberObservers()V

    goto :goto_2

    .line 2212
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .restart local v12    # "$i$f$write":I
    .restart local v13    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .restart local v14    # "$i$a$-let-SlotTable$write$1$iv":I
    .restart local v15    # "normalClose$iv":Z
    :catchall_1
    move-exception v0

    invoke-virtual {v13, v15}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .end local v5    # "nonEmptySlotTable":Z
    .end local v6    # "sectionName$iv":Ljava/lang/String;
    .end local v7    # "$i$f$trace":I
    .end local v8    # "token$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    throw v0

    .line 1325
    .end local v11    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v12    # "$i$f$write":I
    .end local v13    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v14    # "$i$a$-let-SlotTable$write$1$iv":I
    .end local v15    # "normalClose$iv":Z
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .local v3, "$i$f$synchronized":I
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .restart local v5    # "nonEmptySlotTable":Z
    .restart local v6    # "sectionName$iv":Ljava/lang/String;
    .restart local v7    # "$i$f$trace":I
    .restart local v8    # "token$iv":Ljava/lang/Object;
    :cond_3
    move/from16 v17, v3

    .line 1331
    .end local v3    # "$i$f$synchronized":I
    .restart local v17    # "$i$f$synchronized":I
    :goto_2
    invoke-virtual {v10}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    .line 1332
    nop

    .end local v9    # "$i$a$-trace-CompositionImpl$deactivate$1$1":I
    .end local v10    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 2206
    nop

    .line 2215
    :try_start_6
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v8}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 2206
    nop

    .line 1334
    .end local v6    # "sectionName$iv":Ljava/lang/String;
    .end local v7    # "$i$f$trace":I
    .end local v8    # "token$iv":Ljava/lang/Object;
    :goto_3
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 1335
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 1336
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 1337
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->changes:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/ChangeList;->clear()V

    .line 1338
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->lateChanges:Landroidx/compose/runtime/changelist/ChangeList;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/ChangeList;->clear()V

    .line 1339
    iget-object v0, v1, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposerImpl;->deactivate$runtime_release()V

    .line 1340
    nop

    .end local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .end local v5    # "nonEmptySlotTable":Z
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 2203
    monitor-exit v2

    .line 1341
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    return-void

    .line 2203
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    goto :goto_5

    .line 2215
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .restart local v5    # "nonEmptySlotTable":Z
    .restart local v6    # "sectionName$iv":Ljava/lang/String;
    .restart local v7    # "$i$f$trace":I
    .restart local v8    # "token$iv":Ljava/lang/Object;
    :catchall_3
    move-exception v0

    goto :goto_4

    .end local v17    # "$i$f$synchronized":I
    .restart local v3    # "$i$f$synchronized":I
    :catchall_4
    move-exception v0

    move/from16 v17, v3

    .end local v3    # "$i$f$synchronized":I
    .restart local v17    # "$i$f$synchronized":I
    :goto_4
    :try_start_7
    sget-object v3, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v3, v8}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 2203
    .end local v4    # "$i$a$-synchronized-CompositionImpl$deactivate$1":I
    .end local v5    # "nonEmptySlotTable":Z
    .end local v6    # "sectionName$iv":Ljava/lang/String;
    .end local v7    # "$i$f$trace":I
    .end local v8    # "token$iv":Ljava/lang/Object;
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v3    # "$i$f$synchronized":I
    :catchall_5
    move-exception v0

    move/from16 v17, v3

    .end local v3    # "$i$f$synchronized":I
    .restart local v17    # "$i$f$synchronized":I
    :goto_5
    monitor-exit v2

    throw v0
.end method

.method public delegateInvalidations(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 3
    .param p1, "to"    # Landroidx/compose/runtime/ControlledComposition;
    .param p2, "groupIndex"    # I
    .param p3, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "I",
            "Lkotlin/jvm/functions/Function0<",
            "+TR;>;)TR;"
        }
    .end annotation

    .line 1146
    if-eqz p1, :cond_0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-ltz p2, :cond_0

    .line 1147
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/CompositionImpl;

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegate:Landroidx/compose/runtime/CompositionImpl;

    .line 1148
    iput p2, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegateGroup:I

    .line 1149
    nop

    .line 1150
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1152
    iput-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegate:Landroidx/compose/runtime/CompositionImpl;

    .line 1153
    iput v0, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegateGroup:I

    .line 1154
    nop

    .line 1153
    goto :goto_0

    .line 1152
    :catchall_0
    move-exception v2

    iput-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegate:Landroidx/compose/runtime/CompositionImpl;

    .line 1153
    iput v0, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegateGroup:I

    throw v2

    .line 1155
    :cond_0
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    .line 1146
    :goto_0
    return-object v2
.end method

.method public dispose()V
    .locals 14

    .line 809
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1437
    .local v1, "$i$f$synchronized":I
    nop

    .line 1438
    monitor-enter v0

    const/4 v2, 0x0

    .line 810
    .local v2, "$i$a$-synchronized-CompositionImpl$dispose$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v3}, Landroidx/compose/runtime/ComposerImpl;->isComposing$runtime_release()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    .local v3, "value$iv":Z
    const/4 v5, 0x0

    .line 1439
    .local v5, "$i$f$checkPrecondition":I
    nop

    .line 1440
    if-nez v3, :cond_0

    .line 1441
    const/4 v6, 0x0

    .line 811
    .local v6, "$i$a$-checkPrecondition-CompositionImpl$dispose$1$1":I
    const-string v7, "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."

    .line 812
    nop

    .line 1441
    .end local v6    # "$i$a$-checkPrecondition-CompositionImpl$dispose$1$1":I
    invoke-static {v7}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1443
    :cond_0
    nop

    .line 814
    .end local v3    # "value$iv":Z
    .end local v5    # "$i$f$checkPrecondition":I
    iget-boolean v3, p0, Landroidx/compose/runtime/CompositionImpl;->disposed:Z

    if-nez v3, :cond_6

    .line 815
    iput-boolean v4, p0, Landroidx/compose/runtime/CompositionImpl;->disposed:Z

    .line 816
    sget-object v3, Landroidx/compose/runtime/ComposableSingletons$CompositionKt;->INSTANCE:Landroidx/compose/runtime/ComposableSingletons$CompositionKt;

    invoke-virtual {v3}, Landroidx/compose/runtime/ComposableSingletons$CompositionKt;->getLambda-2$runtime_release()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->composable:Lkotlin/jvm/functions/Function2;

    .line 825
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v3}, Landroidx/compose/runtime/ComposerImpl;->getDeferredChanges$runtime_release()Landroidx/compose/runtime/changelist/ChangeList;

    move-result-object v3

    .line 826
    .local v3, "deferredChanges":Landroidx/compose/runtime/changelist/ChangeList;
    if-eqz v3, :cond_1

    .line 827
    invoke-direct {p0, v3}, Landroidx/compose/runtime/CompositionImpl;->applyChangesInLocked(Landroidx/compose/runtime/changelist/ChangeList;)V

    .line 835
    :cond_1
    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v5}, Landroidx/compose/runtime/SlotTable;->getGroupsSize()I

    move-result v5

    if-lez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 836
    .local v4, "nonEmptySlotTable":Z
    :goto_0
    if-nez v4, :cond_3

    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    .line 837
    :cond_3
    new-instance v5, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v5, v6}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    .line 838
    .local v5, "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    if-eqz v4, :cond_4

    .line 839
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    invoke-interface {v6}, Landroidx/compose/runtime/Applier;->onBeginChanges()V

    .line 840
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    .local v6, "this_$iv":Landroidx/compose/runtime/SlotTable;
    const/4 v7, 0x0

    .line 1444
    .local v7, "$i$f$write":I
    invoke-virtual {v6}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .local v8, "writer$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v9, 0x0

    .line 1445
    .local v9, "$i$a$-let-SlotTable$write$1$iv":I
    const/4 v10, 0x0

    .line 1446
    .local v10, "normalClose$iv":Z
    nop

    .line 1447
    move-object v11, v8

    .local v11, "writer":Landroidx/compose/runtime/SlotWriter;
    const/4 v12, 0x0

    .line 840
    .local v12, "$i$a$-write-CompositionImpl$dispose$1$2":I
    :try_start_1
    move-object v13, v5

    check-cast v13, Landroidx/compose/runtime/RememberManager;

    invoke-static {v11, v13}, Landroidx/compose/runtime/ComposerKt;->removeCurrentGroup(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    .end local v11    # "writer":Landroidx/compose/runtime/SlotWriter;
    .end local v12    # "$i$a$-write-CompositionImpl$dispose$1$2":I
    sget-object v11, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1447
    nop

    .line 1448
    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1447
    .local v12, "$i$a$-also-SlotTable$write$1$1$iv":I
    const/4 v10, 0x1

    .line 1449
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-also-SlotTable$write$1$1$iv":I
    :try_start_2
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .line 1450
    nop

    .line 1444
    .end local v8    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v9    # "$i$a$-let-SlotTable$write$1$iv":I
    .end local v10    # "normalClose$iv":Z
    nop

    .line 1451
    nop

    .line 841
    .end local v6    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v7    # "$i$f$write":I
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    invoke-interface {v6}, Landroidx/compose/runtime/Applier;->clear()V

    .line 842
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    invoke-interface {v6}, Landroidx/compose/runtime/Applier;->onEndChanges()V

    .line 843
    invoke-virtual {v5}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchRememberObservers()V

    goto :goto_1

    .line 1449
    .restart local v6    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .restart local v7    # "$i$f$write":I
    .restart local v8    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .restart local v9    # "$i$a$-let-SlotTable$write$1$iv":I
    .restart local v10    # "normalClose$iv":Z
    :catchall_0
    move-exception v11

    invoke-virtual {v8, v10}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    throw v11

    .line 845
    .end local v6    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v7    # "$i$f$write":I
    .end local v8    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v9    # "$i$a$-let-SlotTable$write$1$iv":I
    .end local v10    # "normalClose$iv":Z
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :cond_4
    :goto_1
    invoke-virtual {v5}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    .line 847
    .end local v5    # "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    :cond_5
    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v5}, Landroidx/compose/runtime/ComposerImpl;->dispose$runtime_release()V

    .line 849
    .end local v3    # "deferredChanges":Landroidx/compose/runtime/changelist/ChangeList;
    .end local v4    # "nonEmptySlotTable":Z
    :cond_6
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$dispose$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1438
    monitor-exit v0

    .line 850
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/ControlledComposition;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/CompositionContext;->unregisterComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V

    .line 851
    return-void

    .line 1438
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_1
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public disposeUnusedMovableContent(Landroidx/compose/runtime/MovableContentState;)V
    .locals 10
    .param p1, "state"    # Landroidx/compose/runtime/MovableContentState;

    .line 1019
    new-instance v0, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v0, v1}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    .line 1020
    .local v0, "manager":Landroidx/compose/runtime/internal/RememberEventDispatcher;
    invoke-virtual {p1}, Landroidx/compose/runtime/MovableContentState;->getSlotTable$runtime_release()Landroidx/compose/runtime/SlotTable;

    move-result-object v1

    .line 1021
    .local v1, "slotTable":Landroidx/compose/runtime/SlotTable;
    move-object v2, v1

    .local v2, "this_$iv":Landroidx/compose/runtime/SlotTable;
    const/4 v3, 0x0

    .line 1983
    .local v3, "$i$f$write":I
    invoke-virtual {v2}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    move-result-object v4

    .local v4, "writer$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v5, 0x0

    .line 1984
    .local v5, "$i$a$-let-SlotTable$write$1$iv":I
    const/4 v6, 0x0

    .line 1985
    .local v6, "normalClose$iv":Z
    nop

    .line 1986
    move-object v7, v4

    .local v7, "writer":Landroidx/compose/runtime/SlotWriter;
    const/4 v8, 0x0

    .line 1021
    .local v8, "$i$a$-write-CompositionImpl$disposeUnusedMovableContent$1":I
    :try_start_0
    move-object v9, v0

    check-cast v9, Landroidx/compose/runtime/RememberManager;

    invoke-static {v7, v9}, Landroidx/compose/runtime/ComposerKt;->removeCurrentGroup(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    .end local v7    # "writer":Landroidx/compose/runtime/SlotWriter;
    .end local v8    # "$i$a$-write-CompositionImpl$disposeUnusedMovableContent$1":I
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1986
    nop

    .line 1987
    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1986
    .local v8, "$i$a$-also-SlotTable$write$1$1$iv":I
    const/4 v6, 0x1

    .line 1988
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-also-SlotTable$write$1$1$iv":I
    invoke-virtual {v4, v6}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .line 1989
    nop

    .line 1983
    .end local v4    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v5    # "$i$a$-let-SlotTable$write$1$iv":I
    .end local v6    # "normalClose$iv":Z
    nop

    .line 1990
    nop

    .line 1022
    .end local v2    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v3    # "$i$f$write":I
    invoke-virtual {v0}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchRememberObservers()V

    .line 1023
    return-void

    .line 1988
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .restart local v3    # "$i$f$write":I
    .restart local v4    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .restart local v5    # "$i$a$-let-SlotTable$write$1$iv":I
    .restart local v6    # "normalClose$iv":Z
    :catchall_0
    move-exception v7

    invoke-virtual {v4, v6}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    throw v7
.end method

.method public getAndSetShouldPauseCallback(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;
    .locals 1
    .param p1, "shouldPause"    # Landroidx/compose/runtime/ShouldPauseCallback;

    .line 1161
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->shouldPause:Landroidx/compose/runtime/ShouldPauseCallback;

    .line 1162
    .local v0, "previous":Landroidx/compose/runtime/ShouldPauseCallback;
    iput-object p1, p0, Landroidx/compose/runtime/CompositionImpl;->shouldPause:Landroidx/compose/runtime/ShouldPauseCallback;

    .line 1163
    return-object v0
.end method

.method public final getComposable()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 601
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composable:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public getCompositionService(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;
    .locals 1
    .param p1, "key"    # Landroidx/compose/runtime/CompositionServiceKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/CompositionServiceKey<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1192
    invoke-static {}, Landroidx/compose/runtime/CompositionKt;->getCompositionImplServiceKey()Landroidx/compose/runtime/CompositionServiceKey;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getConditionalScopes$runtime_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            ">;"
        }
    .end annotation

    .line 507
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->conditionallyInvalidatedScopes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterSet;->asSet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getDerivedStateDependencies$runtime_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 501
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getHasInvalidations()Z
    .locals 4

    .line 854
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1452
    .local v1, "$i$f$synchronized":I
    nop

    .line 1453
    monitor-enter v0

    const/4 v2, 0x0

    .line 854
    .local v2, "$i$a$-synchronized-CompositionImpl$hasInvalidations$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    invoke-static {v3}, Landroidx/compose/runtime/collection/ScopeMap;->getSize-impl(Landroidx/collection/MutableScatterMap;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1453
    .end local v2    # "$i$a$-synchronized-CompositionImpl$hasInvalidations$1":I
    :goto_0
    monitor-exit v0

    .line 854
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v3

    .line 1453
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public getHasPendingChanges()Z
    .locals 4

    .line 610
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1357
    .local v1, "$i$f$synchronized":I
    nop

    .line 1358
    monitor-enter v0

    const/4 v2, 0x0

    .line 610
    .local v2, "$i$a$-synchronized-CompositionImpl$hasPendingChanges$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v3}, Landroidx/compose/runtime/ComposerImpl;->getHasPendingChanges$runtime_release()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1358
    .end local v2    # "$i$a$-synchronized-CompositionImpl$hasPendingChanges$1":I
    monitor-exit v0

    .line 610
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v3

    .line 1358
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final getObservedObjects$runtime_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 480
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->asMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getObserverHolder$runtime_release()Landroidx/compose/runtime/CompositionObserverHolder;
    .locals 1

    .line 565
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observerHolder:Landroidx/compose/runtime/CompositionObserverHolder;

    return-object v0
.end method

.method public final getParent()Landroidx/compose/runtime/CompositionContext;
    .locals 1

    .line 432
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    return-object v0
.end method

.method public final getPendingInvalidScopes$runtime_release()Z
    .locals 1

    .line 551
    iget-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingInvalidScopes:Z

    return v0
.end method

.method public final getRecomposeContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 585
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->_recomposeContext:Lkotlin/coroutines/CoroutineContext;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionContext;->getRecomposeCoroutineContext$runtime_release()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getSlotTable$runtime_release()Landroidx/compose/runtime/SlotTable;
    .locals 1

    .line 466
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    return-object v0
.end method

.method public insertMovableContent(Ljava/util/List;)V
    .locals 12
    .param p1, "references"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;>;)V"
        }
    .end annotation

    .line 1014
    move-object v0, p1

    .local v0, "$this$fastAll$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1954
    .local v1, "$i$f$fastAll":I
    nop

    .line 1955
    move-object v2, v0

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1956
    .local v3, "$i$f$fastForEach":I
    nop

    .line 1957
    const/4 v4, 0x0

    .local v4, "index$iv$iv":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_1

    .line 1958
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 1959
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1955
    .local v8, "$i$a$-fastForEach-ListUtilsKt$fastAll$2$iv":I
    move-object v9, v7

    check-cast v9, Lkotlin/Pair;

    .local v9, "it":Lkotlin/Pair;
    const/4 v10, 0x0

    .line 1014
    .local v10, "$i$a$-fastAll-CompositionImpl$insertMovableContent$1":I
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/MovableContentStateReference;

    invoke-virtual {v11}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    move-result-object v11

    invoke-static {v11, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 1955
    .end local v9    # "it":Lkotlin/Pair;
    .end local v10    # "$i$a$-fastAll-CompositionImpl$insertMovableContent$1":I
    if-nez v9, :cond_0

    const/4 v5, 0x0

    goto :goto_1

    .line 1959
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-fastForEach-ListUtilsKt$fastAll$2$iv":I
    :cond_0
    nop

    .line 1957
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1961
    .end local v4    # "index$iv$iv":I
    :cond_1
    nop

    .line 1962
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    const/4 v5, 0x1

    .line 1014
    .end local v0    # "$this$fastAll$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastAll":I
    :goto_1
    nop

    .local v5, "value$iv":Z
    const/4 v0, 0x0

    .line 1963
    .local v0, "$i$f$runtimeCheck":I
    const/4 v1, 0x0

    .line 1964
    .local v1, "$i$f$runtimeCheck":I
    nop

    .line 1965
    if-nez v5, :cond_2

    .line 1966
    const/4 v2, 0x0

    .line 1963
    .local v2, "$i$a$-runtimeCheck-ComposerKt$runtimeCheck$2$iv":I
    nop

    .line 1966
    .end local v2    # "$i$a$-runtimeCheck-ComposerKt$runtimeCheck$2$iv":I
    const-string v2, "Check failed"

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 1968
    :cond_2
    nop

    .line 1963
    .end local v1    # "$i$f$runtimeCheck":I
    nop

    .line 1015
    .end local v0    # "$i$f$runtimeCheck":I
    .end local v5    # "value$iv":Z
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v1, 0x0

    .line 1969
    .local v1, "$i$f$guardChanges":I
    nop

    .line 1970
    move-object v2, v0

    .local v2, "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v3, 0x0

    .line 1971
    .local v3, "$i$f$trackAbandonedValues":I
    const/4 v4, 0x0

    .line 1972
    .local v4, "success$iv$iv":Z
    nop

    .line 1973
    const/4 v5, 0x0

    .line 1015
    .local v5, "$i$a$-guardChanges-CompositionImpl$insertMovableContent$2":I
    :try_start_0
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v6, p1}, Landroidx/compose/runtime/ComposerImpl;->insertMovableContentReferences(Ljava/util/List;)V

    .end local v5    # "$i$a$-guardChanges-CompositionImpl$insertMovableContent$2":I
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1973
    nop

    .line 1974
    .local v5, "it$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1973
    .local v6, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    const/4 v4, 0x1

    .line 1975
    .end local v5    # "it$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    nop

    .line 1978
    nop

    .line 1972
    nop

    .line 1982
    .end local v2    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v3    # "$i$f$trackAbandonedValues":I
    .end local v4    # "success$iv$iv":Z
    nop

    .line 1016
    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v1    # "$i$f$guardChanges":I
    return-void

    .line 1975
    .restart local v0    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v1    # "$i$f$guardChanges":I
    .restart local v2    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$trackAbandonedValues":I
    .restart local v4    # "success$iv$iv":Z
    :catchall_0
    move-exception v5

    if-nez v4, :cond_3

    :try_start_1
    iget-object v6, v2, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    .line 1976
    new-instance v6, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v7, v2, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v6, v7}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v6}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_3
    nop

    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v1    # "$i$f$guardChanges":I
    .end local p1    # "references":Ljava/util/List;
    throw v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1979
    .end local v2    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v3    # "$i$f$trackAbandonedValues":I
    .end local v4    # "success$iv$iv":Z
    .restart local v0    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v1    # "$i$f$guardChanges":I
    .restart local p1    # "references":Ljava/util/List;
    :catch_0
    move-exception v2

    .line 1980
    .local v2, "e$iv":Ljava/lang/Exception;
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 1981
    throw v2
.end method

.method public invalidate(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;
    .locals 6
    .param p1, "scope"    # Landroidx/compose/runtime/RecomposeScopeImpl;
    .param p2, "instance"    # Ljava/lang/Object;

    .line 1167
    invoke-virtual {p1}, Landroidx/compose/runtime/RecomposeScopeImpl;->getDefaultsInScope()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1168
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->setDefaultsInvalid(Z)V

    .line 1170
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/runtime/RecomposeScopeImpl;->getAnchor()Landroidx/compose/runtime/Anchor;

    move-result-object v0

    .line 1171
    .local v0, "anchor":Landroidx/compose/runtime/Anchor;
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroidx/compose/runtime/Anchor;->getValid()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 1173
    :cond_1
    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/SlotTable;->ownsAnchor(Landroidx/compose/runtime/Anchor;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1175
    iget-object v2, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 2135
    .local v3, "$i$f$synchronized":I
    nop

    .line 2136
    monitor-enter v2

    const/4 v4, 0x0

    .line 1175
    .local v4, "$i$a$-synchronized-CompositionImpl$invalidate$delegate$1":I
    :try_start_0
    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->invalidationDelegate:Landroidx/compose/runtime/CompositionImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2136
    .end local v4    # "$i$a$-synchronized-CompositionImpl$invalidate$delegate$1":I
    monitor-exit v2

    .line 1175
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    nop

    .line 1176
    .local v5, "delegate":Landroidx/compose/runtime/CompositionImpl;
    const/4 v2, 0x0

    if-eqz v5, :cond_2

    invoke-direct {v5, p1, p2}, Landroidx/compose/runtime/CompositionImpl;->tryImminentInvalidation(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z

    move-result v3

    if-ne v3, v1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    if-eqz v1, :cond_3

    .line 1177
    sget-object v1, Landroidx/compose/runtime/InvalidationResult;->IMMINENT:Landroidx/compose/runtime/InvalidationResult;

    return-object v1

    .line 1179
    :cond_3
    sget-object v1, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    return-object v1

    .line 2136
    .end local v5    # "delegate":Landroidx/compose/runtime/CompositionImpl;
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v3    # "$i$f$synchronized":I
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1

    .line 1181
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/runtime/RecomposeScopeImpl;->getCanRecompose()Z

    move-result v1

    if-nez v1, :cond_5

    .line 1182
    sget-object v1, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    return-object v1

    .line 1183
    :cond_5
    invoke-direct {p0, p1, v0, p2}, Landroidx/compose/runtime/CompositionImpl;->invalidateChecked(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v1

    return-object v1

    .line 1172
    :cond_6
    :goto_1
    sget-object v1, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    return-object v1
.end method

.method public invalidateAll()V
    .locals 11

    .line 1128
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 2129
    .local v1, "$i$f$synchronized":I
    nop

    .line 2130
    monitor-enter v0

    const/4 v2, 0x0

    .line 1128
    .local v2, "$i$a$-synchronized-CompositionImpl$invalidateAll$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v3}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v3

    .local v3, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 2131
    .local v4, "$i$f$forEach":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v3, v6

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1128
    .local v9, "$i$a$-forEach-CompositionImpl$invalidateAll$1$1":I
    instance-of v10, v8, Landroidx/compose/runtime/RecomposeScopeImpl;

    if-eqz v10, :cond_0

    move-object v10, v8

    check-cast v10, Landroidx/compose/runtime/RecomposeScopeImpl;

    goto :goto_1

    :cond_0
    const/4 v10, 0x0

    :goto_1
    if-eqz v10, :cond_1

    invoke-virtual {v10}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidate()V

    .line 2131
    .end local v8    # "it":Ljava/lang/Object;
    .end local v9    # "$i$a$-forEach-CompositionImpl$invalidateAll$1$1":I
    :cond_1
    nop

    .end local v7    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 2132
    :cond_2
    nop

    .line 1128
    .end local v3    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$forEach":I
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$invalidateAll$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2130
    monitor-exit v0

    .line 1129
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 2130
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public final invalidateGroupsWithKey(I)V
    .locals 16
    .param p1, "key"    # I

    .line 699
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1396
    .local v3, "$i$f$synchronized":I
    nop

    .line 1397
    monitor-enter v2

    const/4 v0, 0x0

    .line 699
    .local v0, "$i$a$-synchronized-CompositionImpl$invalidateGroupsWithKey$scopesToInvalidate$1":I
    :try_start_0
    iget-object v4, v1, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move/from16 v5, p1

    :try_start_1
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/SlotTable;->invalidateGroupsWithKey$runtime_release(I)Ljava/util/List;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1397
    .end local v0    # "$i$a$-synchronized-CompositionImpl$invalidateGroupsWithKey$scopesToInvalidate$1":I
    monitor-exit v2

    .line 699
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    nop

    .line 705
    .local v4, "scopesToInvalidate":Ljava/util/List;
    if-eqz v4, :cond_4

    .line 706
    move-object v2, v4

    .local v2, "$this$fastAny$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1398
    .local v3, "$i$f$fastAny":I
    nop

    .line 1399
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1400
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1401
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_2

    .line 1402
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1403
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1399
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/runtime/RecomposeScopeImpl;

    .local v14, "it":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v15, 0x0

    .line 707
    .local v15, "$i$a$-fastAny-CompositionImpl$invalidateGroupsWithKey$forceComposition$1":I
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->invalidateForResult(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;

    move-result-object v0

    sget-object v10, Landroidx/compose/runtime/InvalidationResult;->IGNORED:Landroidx/compose/runtime/InvalidationResult;

    if-ne v0, v10, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 1399
    .end local v14    # "it":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v15    # "$i$a$-fastAny-CompositionImpl$invalidateGroupsWithKey$forceComposition$1":I
    :goto_1
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_2

    .line 1403
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_1
    nop

    .line 1401
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1405
    .end local v8    # "index$iv$iv":I
    :cond_2
    nop

    .line 1406
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    const/4 v0, 0x0

    .line 706
    .end local v2    # "$this$fastAny$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastAny":I
    :goto_2
    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v0, 0x1

    .line 704
    :goto_4
    nop

    .line 709
    .local v0, "forceComposition":Z
    if-eqz v0, :cond_5

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v2}, Landroidx/compose/runtime/ComposerImpl;->forceRecomposeScopes$runtime_release()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 710
    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/ControlledComposition;

    invoke-virtual {v2, v3}, Landroidx/compose/runtime/CompositionContext;->invalidate$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V

    .line 712
    :cond_5
    return-void

    .line 1397
    .end local v0    # "forceComposition":Z
    .end local v4    # "scopesToInvalidate":Ljava/util/List;
    .local v2, "lock$iv":Ljava/lang/Object;
    .local v3, "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    move/from16 v5, p1

    :goto_5
    monitor-exit v2

    throw v0
.end method

.method public isComposing()Z
    .locals 1

    .line 604
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposerImpl;->isComposing$runtime_release()Z

    move-result v0

    return v0
.end method

.method public isDisposed()Z
    .locals 1

    .line 607
    iget-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->disposed:Z

    return v0
.end method

.method public final isRoot()Z
    .locals 1

    .line 588
    iget-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->isRoot:Z

    return v0
.end method

.method public final observe$runtime_release(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;
    .locals 5
    .param p1, "observer"    # Landroidx/compose/runtime/tooling/CompositionObserver;

    .line 682
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1394
    .local v1, "$i$f$synchronized":I
    nop

    .line 1395
    monitor-enter v0

    const/4 v2, 0x0

    .line 683
    .local v2, "$i$a$-synchronized-CompositionImpl$observe$1":I
    :try_start_0
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->observerHolder:Landroidx/compose/runtime/CompositionObserverHolder;

    invoke-virtual {v3, p1}, Landroidx/compose/runtime/CompositionObserverHolder;->setObserver(Landroidx/compose/runtime/tooling/CompositionObserver;)V

    .line 684
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->observerHolder:Landroidx/compose/runtime/CompositionObserverHolder;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroidx/compose/runtime/CompositionObserverHolder;->setRoot(Z)V

    .line 685
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$observe$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1395
    monitor-exit v0

    .line 686
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    new-instance v0, Landroidx/compose/runtime/CompositionImpl$observe$2;

    invoke-direct {v0, p0, p1}, Landroidx/compose/runtime/CompositionImpl$observe$2;-><init>(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/tooling/CompositionObserver;)V

    check-cast v0, Landroidx/compose/runtime/tooling/CompositionObserverHandle;

    return-object v0

    .line 1395
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public observesAnyOf(Ljava/util/Set;)Z
    .locals 24
    .param p1, "values"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 885
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .local v1, "$this$fastForEach$iv":Ljava/util/Set;
    const/4 v2, 0x0

    .line 1456
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1457
    instance-of v3, v1, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    if-eqz v3, :cond_9

    .line 1458
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    invoke-virtual {v3}, Landroidx/compose/runtime/collection/ScatterSetWrapper;->getSet$runtime_release()Landroidx/collection/ScatterSet;

    move-result-object v3

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 1459
    .local v6, "$i$f$forEach":I
    nop

    .line 1460
    iget-object v7, v3, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1461
    .local v7, "elements$iv$iv":[Ljava/lang/Object;
    move-object v8, v3

    .local v8, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v9, 0x0

    .line 1462
    .local v9, "$i$f$forEachIndex":I
    nop

    .line 1463
    iget-object v10, v8, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1464
    .local v10, "m$iv$iv$iv":[J
    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    .line 1466
    .local v11, "lastIndex$iv$iv$iv":I
    const/4 v12, 0x0

    .local v12, "i$iv$iv$iv":I
    if-gt v12, v11, :cond_6

    .line 1467
    :goto_0
    aget-wide v13, v10, v12

    .line 1468
    .local v13, "slot$iv$iv$iv":J
    move-wide v15, v13

    .local v15, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1469
    .local v17, "$i$f$maskEmptyOrDeleted":I
    move-wide v4, v15

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v15, v1

    move/from16 v16, v2

    .end local v1    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v2    # "$i$f$fastForEach":I
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v15, "$this$fastForEach$iv":Ljava/util/Set;
    .local v16, "$i$f$fastForEach":I
    not-long v1, v4

    const/16 v20, 0x7

    shl-long v1, v1, v20

    and-long/2addr v1, v4

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v1, v1, v20

    .line 1468
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v17    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v20

    if-eqz v1, :cond_5

    .line 1470
    sub-int v1, v12, v11

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v2, 0x8

    rsub-int/lit8 v1, v1, 0x8

    .line 1471
    .local v1, "bitCount$iv$iv$iv":I
    const/4 v4, 0x0

    .local v4, "j$iv$iv$iv":I
    :goto_1
    if-ge v4, v1, :cond_4

    .line 1472
    const-wide/16 v20, 0xff

    and-long v20, v13, v20

    .local v20, "value$iv$iv$iv$iv":J
    const/4 v5, 0x0

    .line 1473
    .local v5, "$i$f$isFull":I
    const-wide/16 v22, 0x80

    cmp-long v17, v20, v22

    if-gez v17, :cond_0

    move/from16 v5, v19

    goto :goto_2

    :cond_0
    move/from16 v5, v18

    .line 1472
    .end local v5    # "$i$f$isFull":I
    .end local v20    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v5, :cond_3

    .line 1474
    shl-int/lit8 v5, v12, 0x3

    add-int/2addr v5, v4

    .line 1475
    .local v5, "index$iv$iv$iv":I
    move/from16 v17, v5

    .local v17, "index$iv$iv":I
    const/16 v20, 0x0

    .line 1461
    .local v20, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    move/from16 v21, v2

    aget-object v2, v7, v17

    .local v2, "value":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 886
    .local v22, "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    move-object/from16 v23, v3

    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v23, "this_$iv$iv":Landroidx/collection/ScatterSet;
    iget-object v3, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-static {v3, v2}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-static {v3, v2}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    .line 887
    :cond_1
    nop

    .line 1461
    .end local v2    # "value":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    nop

    .line 1475
    .end local v17    # "index$iv$iv":I
    .end local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_4

    .line 886
    .restart local v2    # "value":Ljava/lang/Object;
    .restart local v17    # "index$iv$iv":I
    .restart local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    .restart local v22    # "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    :cond_2
    :goto_3
    return v19

    .line 1472
    .end local v2    # "value":Ljava/lang/Object;
    .end local v5    # "index$iv$iv$iv":I
    .end local v17    # "index$iv$iv":I
    .end local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    .end local v22    # "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    .end local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_3
    move/from16 v21, v2

    move-object/from16 v23, v3

    .line 1477
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :goto_4
    shr-long v13, v13, v21

    .line 1471
    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v21

    move-object/from16 v3, v23

    goto :goto_1

    .end local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move/from16 v21, v2

    move-object/from16 v23, v3

    .line 1479
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v4    # "j$iv$iv$iv":I
    .restart local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    if-ne v1, v2, :cond_8

    goto :goto_5

    .line 1468
    .end local v1    # "bitCount$iv$iv$iv":I
    .end local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_5
    move-object/from16 v23, v3

    .line 1466
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "slot$iv$iv$iv":J
    .restart local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :goto_5
    if-eq v12, v11, :cond_7

    add-int/lit8 v12, v12, 0x1

    move-object v1, v15

    move/from16 v2, v16

    move-object/from16 v3, v23

    goto :goto_0

    .end local v15    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v16    # "$i$f$fastForEach":I
    .end local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v1, "$this$fastForEach$iv":Ljava/util/Set;
    .local v2, "$i$f$fastForEach":I
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_6
    move-object v15, v1

    move/from16 v16, v2

    move-object/from16 v23, v3

    const/16 v18, 0x0

    .line 1482
    .end local v1    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "i$iv$iv$iv":I
    .restart local v15    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v16    # "$i$f$fastForEach":I
    .restart local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_7
    nop

    .line 1483
    .end local v8    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "$i$f$forEachIndex":I
    .end local v10    # "m$iv$iv$iv":[J
    .end local v11    # "lastIndex$iv$iv$iv":I
    :cond_8
    nop

    .end local v6    # "$i$f$forEach":I
    .end local v7    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v23    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    goto :goto_8

    .line 1484
    .end local v15    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v16    # "$i$f$fastForEach":I
    .restart local v1    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v2    # "$i$f$fastForEach":I
    :cond_9
    move-object v15, v1

    move/from16 v16, v2

    const/16 v18, 0x0

    const/16 v19, 0x1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v2    # "$i$f$fastForEach":I
    .restart local v15    # "$this$fastForEach$iv":Ljava/util/Set;
    .restart local v16    # "$i$f$fastForEach":I
    move-object v1, v15

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 1485
    .local v2, "$i$f$forEach":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv$iv":Ljava/lang/Object;
    move-object v5, v4

    .local v5, "value":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 886
    .local v6, "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    iget-object v7, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-static {v7, v5}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    iget-object v7, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-static {v7, v5}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_7

    .line 887
    :cond_a
    nop

    .line 1485
    .end local v5    # "value":Ljava/lang/Object;
    .end local v6    # "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    nop

    .end local v4    # "element$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 886
    .restart local v4    # "element$iv$iv":Ljava/lang/Object;
    .restart local v5    # "value":Ljava/lang/Object;
    .restart local v6    # "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    :cond_b
    :goto_7
    return v19

    .line 1486
    .end local v4    # "element$iv$iv":Ljava/lang/Object;
    .end local v5    # "value":Ljava/lang/Object;
    .end local v6    # "$i$a$-fastForEach-CompositionImpl$observesAnyOf$1":I
    :cond_c
    nop

    .line 1487
    .end local v1    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    :goto_8
    nop

    .line 888
    .end local v15    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v16    # "$i$f$fastForEach":I
    return v18
.end method

.method public final pausedCompositionFinished$runtime_release()V
    .locals 1

    .line 671
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    .line 672
    return-void
.end method

.method public prepareCompose(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 891
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/ComposerImpl;->prepareCompose$runtime_release(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public recompose()Z
    .locals 20

    .line 992
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1932
    .local v3, "$i$f$synchronized":I
    nop

    .line 1933
    monitor-enter v2

    const/4 v4, 0x0

    .line 993
    .local v4, "$i$a$-synchronized-CompositionImpl$recompose$1":I
    :try_start_0
    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->drainPendingModificationsForCompositionLocked()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 994
    move-object/from16 v5, p0

    .local v5, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v6, 0x0

    .line 1934
    .local v6, "$i$f$guardChanges":I
    nop

    .line 1935
    move-object v7, v5

    .local v7, "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v8, 0x0

    .line 1936
    .local v8, "$i$f$trackAbandonedValues":I
    const/4 v9, 0x0

    .line 1937
    .local v9, "success$iv$iv":Z
    nop

    .line 1938
    const/4 v10, 0x0

    .line 995
    .local v10, "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    move-object/from16 v11, p0

    .local v11, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v12, 0x0

    .line 1939
    .local v12, "$i$f$guardInvalidationsLocked":I
    :try_start_1
    invoke-direct {v11}, Landroidx/compose/runtime/CompositionImpl;->takeInvalidations-afanTW4()Landroidx/collection/MutableScatterMap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object v13, v0

    .line 1940
    .local v13, "invalidations$iv":Landroidx/collection/MutableScatterMap;
    nop

    .line 1941
    move-object v0, v13

    .local v0, "invalidations":Landroidx/collection/MutableScatterMap;
    const/4 v14, 0x0

    .line 996
    .local v14, "$i$a$-guardInvalidationsLocked-CompositionImpl$recompose$1$1$1":I
    :try_start_2
    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->observer()Landroidx/compose/runtime/tooling/CompositionObserver;

    move-result-object v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 998
    .local v15, "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    if-eqz v15, :cond_0

    .line 999
    move/from16 v16, v3

    .end local v3    # "$i$f$synchronized":I
    .local v16, "$i$f$synchronized":I
    :try_start_3
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/Composition;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1000
    move/from16 v17, v4

    .end local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .local v17, "$i$a$-synchronized-CompositionImpl$recompose$1":I
    :try_start_4
    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->asMap-impl(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v18, v5

    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .local v18, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :try_start_5
    const-string/jumbo v5, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 998
    invoke-interface {v15, v3, v4}, Landroidx/compose/runtime/tooling/CompositionObserver;->onBeginComposition(Landroidx/compose/runtime/Composition;Ljava/util/Map;)V

    goto :goto_0

    .line 1946
    .end local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .end local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .end local v14    # "$i$a$-guardInvalidationsLocked-CompositionImpl$recompose$1$1$1":I
    .end local v15    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catchall_0
    move-exception v0

    move-object/from16 v18, v5

    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    goto :goto_3

    .line 1942
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catch_0
    move-exception v0

    move-object/from16 v18, v5

    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    goto :goto_2

    .line 1946
    .end local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catchall_1
    move-exception v0

    move/from16 v17, v4

    move-object/from16 v18, v5

    .end local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    goto :goto_3

    .line 1942
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catch_1
    move-exception v0

    move/from16 v17, v4

    move-object/from16 v18, v5

    .end local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    goto :goto_2

    .line 998
    .end local v16    # "$i$f$synchronized":I
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "$i$f$synchronized":I
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v14    # "$i$a$-guardInvalidationsLocked-CompositionImpl$recompose$1$1$1":I
    .restart local v15    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    :cond_0
    move/from16 v16, v3

    move/from16 v17, v4

    move-object/from16 v18, v5

    .line 1002
    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v16    # "$i$f$synchronized":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :goto_0
    iget-object v3, v1, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    iget-object v4, v1, Landroidx/compose/runtime/CompositionImpl;->shouldPause:Landroidx/compose/runtime/ShouldPauseCallback;

    invoke-virtual {v3, v0, v4}, Landroidx/compose/runtime/ComposerImpl;->recompose-aFTiNEg$runtime_release(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z

    move-result v3

    move v4, v3

    .local v4, "shouldDrain":Z
    const/4 v5, 0x0

    .line 1004
    .local v5, "$i$a$-also-CompositionImpl$recompose$1$1$1$1":I
    if-nez v4, :cond_1

    invoke-direct {v1}, Landroidx/compose/runtime/CompositionImpl;->drainPendingModificationsLocked()V

    .line 1005
    :cond_1
    if-eqz v15, :cond_2

    move-object/from16 v19, v0

    .end local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .local v19, "invalidations":Landroidx/collection/MutableScatterMap;
    move-object v0, v1

    check-cast v0, Landroidx/compose/runtime/Composition;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/tooling/CompositionObserver;->onEndComposition(Landroidx/compose/runtime/Composition;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    .end local v19    # "invalidations":Landroidx/collection/MutableScatterMap;
    .restart local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    :cond_2
    move-object/from16 v19, v0

    .line 1006
    .end local v0    # "invalidations":Landroidx/collection/MutableScatterMap;
    .restart local v19    # "invalidations":Landroidx/collection/MutableScatterMap;
    :goto_1
    nop

    .line 1002
    .end local v4    # "shouldDrain":Z
    .end local v5    # "$i$a$-also-CompositionImpl$recompose$1$1$1$1":I
    nop

    .line 1006
    nop

    .line 1941
    .end local v14    # "$i$a$-guardInvalidationsLocked-CompositionImpl$recompose$1$1$1":I
    .end local v15    # "observer":Landroidx/compose/runtime/tooling/CompositionObserver;
    .end local v19    # "invalidations":Landroidx/collection/MutableScatterMap;
    nop

    .line 1940
    nop

    .line 1007
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    nop

    .line 1938
    .end local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    move v0, v3

    .line 1945
    .local v0, "it$iv$iv":Z
    const/4 v4, 0x0

    .line 1938
    .local v4, "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    const/4 v0, 0x1

    .line 1946
    .end local v4    # "$i$a$-also-CompositionImpl$trackAbandonedValues$1$iv$iv":I
    .end local v9    # "success$iv$iv":Z
    .local v0, "success$iv$iv":Z
    nop

    .line 1949
    nop

    .line 1937
    nop

    .line 1953
    .end local v0    # "success$iv$iv":Z
    .end local v7    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v8    # "$i$f$trackAbandonedValues":I
    nop

    .line 1008
    .end local v6    # "$i$f$guardChanges":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    nop

    .line 1933
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    monitor-exit v2

    .line 1009
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    return v3

    .line 1942
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$guardChanges":I
    .restart local v7    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v8    # "$i$f$trackAbandonedValues":I
    .restart local v9    # "success$iv$iv":Z
    .restart local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    .restart local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v12    # "$i$f$guardInvalidationsLocked":I
    .restart local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .restart local v16    # "$i$f$synchronized":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catch_2
    move-exception v0

    goto :goto_2

    .end local v16    # "$i$f$synchronized":I
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$synchronized":I
    .local v4, "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .local v5, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catch_3
    move-exception v0

    move/from16 v16, v3

    move/from16 v17, v4

    move-object/from16 v18, v5

    .line 1943
    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .local v0, "e$iv":Ljava/lang/Exception;
    .restart local v16    # "$i$f$synchronized":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :goto_2
    :try_start_6
    iput-object v13, v11, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 1944
    nop

    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$guardChanges":I
    .end local v7    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v8    # "$i$f$trackAbandonedValues":I
    .end local v9    # "success$iv$iv":Z
    .end local v16    # "$i$f$synchronized":I
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1946
    .end local v0    # "e$iv":Ljava/lang/Exception;
    .end local v10    # "$i$a$-guardChanges-CompositionImpl$recompose$1$1":I
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v12    # "$i$f$guardInvalidationsLocked":I
    .end local v13    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$guardChanges":I
    .restart local v7    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v8    # "$i$f$trackAbandonedValues":I
    .restart local v9    # "success$iv$iv":Z
    .restart local v16    # "$i$f$synchronized":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catchall_2
    move-exception v0

    goto :goto_3

    .end local v16    # "$i$f$synchronized":I
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v3    # "$i$f$synchronized":I
    .restart local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catchall_3
    move-exception v0

    move/from16 v16, v3

    move/from16 v17, v4

    move-object/from16 v18, v5

    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v16    # "$i$f$synchronized":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :goto_3
    if-nez v9, :cond_3

    :try_start_7
    iget-object v3, v7, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 1947
    new-instance v3, Landroidx/compose/runtime/internal/RememberEventDispatcher;

    iget-object v4, v7, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    invoke-direct {v3, v4}, Landroidx/compose/runtime/internal/RememberEventDispatcher;-><init>(Ljava/util/Set;)V

    invoke-virtual {v3}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchAbandons()V

    :cond_3
    nop

    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$guardChanges":I
    .end local v16    # "$i$f$synchronized":I
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1933
    .end local v7    # "this_$iv$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v8    # "$i$f$trackAbandonedValues":I
    .end local v9    # "success$iv$iv":Z
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$synchronized":I
    :catchall_4
    move-exception v0

    goto :goto_4

    .line 1950
    .restart local v6    # "$i$f$guardChanges":I
    .restart local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    :catch_4
    move-exception v0

    .line 1951
    .restart local v0    # "e$iv":Ljava/lang/Exception;
    :try_start_8
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/CompositionImpl;->abandonChanges()V

    .line 1952
    nop

    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1933
    .end local v0    # "e$iv":Ljava/lang/Exception;
    .end local v6    # "$i$f$guardChanges":I
    .end local v17    # "$i$a$-synchronized-CompositionImpl$recompose$1":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v3    # "$i$f$synchronized":I
    :catchall_5
    move-exception v0

    move/from16 v16, v3

    .end local v3    # "$i$f$synchronized":I
    .restart local v16    # "$i$f$synchronized":I
    :goto_4
    monitor-exit v2

    throw v0
.end method

.method public recomposeScopeReleased(Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 1
    .param p1, "scope"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 1187
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingInvalidScopes:Z

    .line 1188
    return-void
.end method

.method public recordModificationsOf(Ljava/util/Set;)V
    .locals 5
    .param p1, "values"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 865
    nop

    :cond_0
    nop

    .line 866
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    .line 868
    .local v0, "old":Ljava/lang/Object;
    nop

    .line 870
    nop

    .line 869
    const/4 v1, 0x1

    if-nez v0, :cond_1

    move v2, v1

    goto :goto_0

    .line 870
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/CompositionKt;->access$getPendingApplyNoModifications$p()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_2

    move-object v2, p1

    goto :goto_1

    .line 871
    :cond_2
    instance-of v2, v0, Ljava/util/Set;

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/util/Set;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    aput-object p1, v2, v1

    goto :goto_1

    .line 872
    :cond_3
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_5

    const-string/jumbo v1, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, [Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/collections/ArraysKt;->plus([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 868
    :goto_1
    nop

    .line 867
    nop

    .line 875
    .local v2, "new":Ljava/lang/Object;
    iget-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Landroidx/compose/animation/core/MutatorMutex$$ExternalSyntheticBackportWithForwarding0;->m(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 876
    if-nez v0, :cond_4

    .line 877
    iget-object v1, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v1, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1454
    .local v3, "$i$f$synchronized":I
    nop

    .line 1455
    monitor-enter v1

    const/4 v4, 0x0

    .line 877
    .local v4, "$i$a$-synchronized-CompositionImpl$recordModificationsOf$1":I
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/runtime/CompositionImpl;->drainPendingModificationsLocked()V

    .end local v4    # "$i$a$-synchronized-CompositionImpl$recordModificationsOf$1":I
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1455
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 879
    .end local v1    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    :cond_4
    :goto_2
    nop

    .line 882
    .end local v0    # "old":Ljava/lang/Object;
    .end local v2    # "new":Ljava/lang/Object;
    return-void

    .line 872
    .restart local v0    # "old":Ljava/lang/Object;
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 873
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "corrupt pendingModifications: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->pendingModifications:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public recordReadOf(Ljava/lang/Object;)V
    .locals 29
    .param p1, "value"    # Ljava/lang/Object;

    .line 944
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0}, Landroidx/compose/runtime/CompositionImpl;->getAreChildrenComposing()Z

    move-result v2

    if-nez v2, :cond_b

    .line 945
    iget-object v2, v0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v2}, Landroidx/compose/runtime/ComposerImpl;->getCurrentRecomposeScope$runtime_release()Landroidx/compose/runtime/RecomposeScopeImpl;

    move-result-object v2

    if-eqz v2, :cond_b

    .local v2, "it":Landroidx/compose/runtime/RecomposeScopeImpl;
    const/4 v3, 0x0

    .line 946
    .local v3, "$i$a$-let-CompositionImpl$recordReadOf$1":I
    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroidx/compose/runtime/RecomposeScopeImpl;->setUsed(Z)V

    .line 947
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->recordRead(Ljava/lang/Object;)Z

    move-result v5

    .line 948
    .local v5, "alreadyRead":Z
    if-nez v5, :cond_a

    .line 949
    instance-of v6, v1, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v6, :cond_0

    .line 950
    move-object v6, v1

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v7, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .local v7, "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    const/4 v8, 0x0

    .line 1835
    .local v8, "$i$f$getComposition-6f8NoZ8":I
    invoke-static {v4}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v7

    .line 950
    .end local v7    # "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    .end local v8    # "$i$f$getComposition-6f8NoZ8":I
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->recordReadIn-h_f27i8$runtime_release(I)V

    .line 953
    :cond_0
    iget-object v6, v0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 956
    instance-of v6, v1, Landroidx/compose/runtime/DerivedState;

    if-eqz v6, :cond_9

    .line 957
    move-object v6, v1

    check-cast v6, Landroidx/compose/runtime/DerivedState;

    invoke-interface {v6}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    move-result-object v6

    .line 958
    .local v6, "record":Landroidx/compose/runtime/DerivedState$Record;
    iget-object v7, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-static {v7, v1}, Landroidx/compose/runtime/collection/ScopeMap;->removeScope-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V

    .line 959
    invoke-interface {v6}, Landroidx/compose/runtime/DerivedState$Record;->getDependencies()Landroidx/collection/ObjectIntMap;

    move-result-object v7

    .local v7, "this_$iv":Landroidx/collection/ObjectIntMap;
    const/4 v8, 0x0

    .line 1836
    .local v8, "$i$f$forEachKey":I
    iget-object v9, v7, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 1838
    .local v9, "k$iv":[Ljava/lang/Object;
    move-object v10, v7

    .local v10, "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    const/4 v11, 0x0

    .line 1839
    .local v11, "$i$f$forEachIndexed":I
    iget-object v12, v10, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 1840
    .local v12, "m$iv$iv":[J
    array-length v13, v12

    add-int/lit8 v13, v13, -0x2

    .line 1842
    .local v13, "lastIndex$iv$iv":I
    const/4 v14, 0x0

    .local v14, "i$iv$iv":I
    if-gt v14, v13, :cond_6

    .line 1843
    :goto_0
    aget-wide v15, v12, v14

    .line 1844
    .local v15, "slot$iv$iv":J
    move-wide/from16 v17, v15

    .local v17, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v19, 0x0

    .line 1845
    .local v19, "$i$f$maskEmptyOrDeleted":I
    move/from16 v20, v4

    move/from16 v21, v5

    move-wide/from16 v4, v17

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    .end local v5    # "alreadyRead":Z
    .end local v6    # "record":Landroidx/compose/runtime/DerivedState$Record;
    .end local v7    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v17, "record":Landroidx/compose/runtime/DerivedState$Record;
    .local v18, "this_$iv":Landroidx/collection/ObjectIntMap;
    .local v21, "alreadyRead":Z
    not-long v6, v4

    const/16 v22, 0x7

    shl-long v6, v6, v22

    and-long/2addr v6, v4

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v6, v22

    .line 1844
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v19    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v4, v4, v22

    if-eqz v4, :cond_5

    .line 1846
    sub-int v4, v14, v13

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    .line 1847
    .local v4, "bitCount$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv":I
    :goto_1
    if-ge v6, v4, :cond_4

    .line 1848
    const-wide/16 v22, 0xff

    and-long v22, v15, v22

    .local v22, "value$iv$iv$iv":J
    const/4 v7, 0x0

    .line 1849
    .local v7, "$i$f$isFull":I
    const-wide/16 v24, 0x80

    cmp-long v19, v22, v24

    if-gez v19, :cond_1

    move/from16 v19, v20

    goto :goto_2

    :cond_1
    const/16 v19, 0x0

    .line 1848
    .end local v7    # "$i$f$isFull":I
    .end local v22    # "value$iv$iv$iv":J
    :goto_2
    if-eqz v19, :cond_3

    .line 1850
    shl-int/lit8 v7, v14, 0x3

    add-int/2addr v7, v6

    .line 1851
    .local v7, "index$iv$iv":I
    move/from16 v19, v7

    .local v19, "index$iv":I
    const/16 v22, 0x0

    .line 1838
    .local v22, "$i$a$-forEachIndexed-ObjectIntMap$forEachKey$1$iv":I
    aget-object v23, v9, v19

    move/from16 v24, v5

    move-object/from16 v5, v23

    check-cast v5, Landroidx/compose/runtime/snapshots/StateObject;

    .local v5, "dependency":Landroidx/compose/runtime/snapshots/StateObject;
    const/16 v23, 0x0

    .line 960
    .local v23, "$i$a$-forEachKey-CompositionImpl$recordReadOf$1$1":I
    move/from16 v25, v3

    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .local v25, "$i$a$-let-CompositionImpl$recordReadOf$1":I
    instance-of v3, v5, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v3, :cond_2

    .line 961
    move-object v3, v5

    check-cast v3, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v26, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .local v26, "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    const/16 v27, 0x0

    .line 1852
    .local v27, "$i$f$getComposition-6f8NoZ8":I
    move/from16 v28, v6

    .end local v6    # "j$iv$iv":I
    .local v28, "j$iv$iv":I
    invoke-static/range {v20 .. v20}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v6

    .line 961
    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    .end local v27    # "$i$f$getComposition-6f8NoZ8":I
    invoke-virtual {v3, v6}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->recordReadIn-h_f27i8$runtime_release(I)V

    goto :goto_3

    .line 960
    .end local v28    # "j$iv$iv":I
    .restart local v6    # "j$iv$iv":I
    :cond_2
    move/from16 v28, v6

    .line 963
    .end local v6    # "j$iv$iv":I
    .restart local v28    # "j$iv$iv":I
    :goto_3
    iget-object v3, v0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-static {v3, v5, v1}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 964
    nop

    .line 1838
    .end local v5    # "dependency":Landroidx/compose/runtime/snapshots/StateObject;
    .end local v23    # "$i$a$-forEachKey-CompositionImpl$recordReadOf$1$1":I
    nop

    .line 1851
    .end local v19    # "index$iv":I
    .end local v22    # "$i$a$-forEachIndexed-ObjectIntMap$forEachKey$1$iv":I
    goto :goto_4

    .line 1848
    .end local v7    # "index$iv$iv":I
    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v28    # "j$iv$iv":I
    .restart local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v6    # "j$iv$iv":I
    :cond_3
    move/from16 v25, v3

    move/from16 v24, v5

    move/from16 v28, v6

    .line 1853
    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v6    # "j$iv$iv":I
    .restart local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v28    # "j$iv$iv":I
    :goto_4
    shr-long v15, v15, v24

    .line 1847
    add-int/lit8 v6, v28, 0x1

    move/from16 v5, v24

    move/from16 v3, v25

    .end local v28    # "j$iv$iv":I
    .restart local v6    # "j$iv$iv":I
    goto :goto_1

    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    :cond_4
    move/from16 v25, v3

    move/from16 v24, v5

    move/from16 v28, v6

    .line 1855
    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v6    # "j$iv$iv":I
    .restart local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    move/from16 v3, v24

    if-ne v4, v3, :cond_8

    goto :goto_5

    .line 1844
    .end local v4    # "bitCount$iv$iv":I
    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    :cond_5
    move/from16 v25, v3

    .line 1842
    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v15    # "slot$iv$iv":J
    .restart local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    :goto_5
    if-eq v14, v13, :cond_7

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    move/from16 v4, v20

    move/from16 v5, v21

    move/from16 v3, v25

    goto/16 :goto_0

    .end local v17    # "record":Landroidx/compose/runtime/DerivedState$Record;
    .end local v18    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v21    # "alreadyRead":Z
    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .local v5, "alreadyRead":Z
    .local v6, "record":Landroidx/compose/runtime/DerivedState$Record;
    .local v7, "this_$iv":Landroidx/collection/ObjectIntMap;
    :cond_6
    move/from16 v25, v3

    move/from16 v21, v5

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    .line 1858
    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v5    # "alreadyRead":Z
    .end local v6    # "record":Landroidx/compose/runtime/DerivedState$Record;
    .end local v7    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .end local v14    # "i$iv$iv":I
    .restart local v17    # "record":Landroidx/compose/runtime/DerivedState$Record;
    .restart local v18    # "this_$iv":Landroidx/collection/ObjectIntMap;
    .restart local v21    # "alreadyRead":Z
    .restart local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    :cond_7
    nop

    .line 1859
    .end local v10    # "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    .end local v11    # "$i$f$forEachIndexed":I
    .end local v12    # "m$iv$iv":[J
    .end local v13    # "lastIndex$iv$iv":I
    :cond_8
    nop

    .line 965
    .end local v8    # "$i$f$forEachKey":I
    .end local v9    # "k$iv":[Ljava/lang/Object;
    .end local v18    # "this_$iv":Landroidx/collection/ObjectIntMap;
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/DerivedState;

    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroidx/compose/runtime/RecomposeScopeImpl;->recordDerivedStateValue(Landroidx/compose/runtime/DerivedState;Ljava/lang/Object;)V

    goto :goto_6

    .line 956
    .end local v17    # "record":Landroidx/compose/runtime/DerivedState$Record;
    .end local v21    # "alreadyRead":Z
    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v5    # "alreadyRead":Z
    :cond_9
    move/from16 v25, v3

    move/from16 v21, v5

    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v5    # "alreadyRead":Z
    .restart local v21    # "alreadyRead":Z
    .restart local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    goto :goto_6

    .line 948
    .end local v21    # "alreadyRead":Z
    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .restart local v5    # "alreadyRead":Z
    :cond_a
    move/from16 v25, v3

    move/from16 v21, v5

    .line 968
    .end local v3    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    .end local v5    # "alreadyRead":Z
    .restart local v21    # "alreadyRead":Z
    .restart local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    :goto_6
    nop

    .line 945
    .end local v2    # "it":Landroidx/compose/runtime/RecomposeScopeImpl;
    .end local v21    # "alreadyRead":Z
    .end local v25    # "$i$a$-let-CompositionImpl$recordReadOf$1":I
    nop

    .line 970
    :cond_b
    return-void
.end method

.method public recordWriteOf(Ljava/lang/Object;)V
    .locals 26
    .param p1, "value"    # Ljava/lang/Object;

    .line 983
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1895
    .local v3, "$i$f$synchronized":I
    nop

    .line 1896
    monitor-enter v2

    const/4 v0, 0x0

    .line 984
    .local v0, "$i$a$-synchronized-CompositionImpl$recordWriteOf$1":I
    :try_start_0
    invoke-direct/range {p0 .. p1}, Landroidx/compose/runtime/CompositionImpl;->invalidateScopeOfLocked(Ljava/lang/Object;)V

    .line 988
    iget-object v4, v1, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    .local v4, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v5, 0x0

    .line 1897
    .local v5, "$i$f$forEachScopeOf-impl":I
    move-object/from16 v6, p1

    invoke-virtual {v4, v6}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 1898
    .local v7, "value$iv":Ljava/lang/Object;
    if-eqz v7, :cond_8

    .line 1901
    instance-of v8, v7, Landroidx/collection/MutableScatterSet;

    if-eqz v8, :cond_7

    .line 1902
    move-object v8, v7

    check-cast v8, Landroidx/collection/MutableScatterSet;

    check-cast v8, Landroidx/collection/ScatterSet;

    .local v8, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v9, 0x0

    .line 1903
    .local v9, "$i$f$forEach":I
    nop

    .line 1904
    iget-object v10, v8, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1905
    .local v10, "elements$iv$iv":[Ljava/lang/Object;
    move-object v11, v8

    .local v11, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v12, 0x0

    .line 1906
    .local v12, "$i$f$forEachIndex":I
    nop

    .line 1907
    iget-object v13, v11, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1908
    .local v13, "m$iv$iv$iv":[J
    array-length v14, v13

    add-int/lit8 v14, v14, -0x2

    .line 1910
    .local v14, "lastIndex$iv$iv$iv":I
    const/4 v15, 0x0

    .local v15, "i$iv$iv$iv":I
    if-gt v15, v14, :cond_4

    .line 1911
    :goto_0
    aget-wide v16, v13, v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1912
    .local v16, "slot$iv$iv$iv":J
    move-wide/from16 v18, v16

    .local v18, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v20, 0x0

    .line 1913
    .local v20, "$i$f$maskEmptyOrDeleted":I
    move/from16 v21, v3

    move-object/from16 v22, v4

    move-wide/from16 v3, v18

    move/from16 v18, v5

    .end local v4    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .local v3, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v18, "$i$f$forEachScopeOf-impl":I
    .local v21, "$i$f$synchronized":I
    .local v22, "arg0$iv":Landroidx/collection/MutableScatterMap;
    not-long v5, v3

    const/16 v19, 0x7

    shl-long v5, v5, v19

    and-long/2addr v5, v3

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v5, v23

    .line 1912
    .end local v3    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v20    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v23

    if-eqz v3, :cond_3

    .line 1914
    sub-int v3, v15, v14

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 1915
    .local v3, "bitCount$iv$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv$iv":I
    :goto_1
    if-ge v5, v3, :cond_2

    .line 1916
    const-wide/16 v19, 0xff

    and-long v19, v16, v19

    .local v19, "value$iv$iv$iv$iv":J
    const/4 v6, 0x0

    .line 1917
    .local v6, "$i$f$isFull":I
    const-wide/16 v23, 0x80

    cmp-long v23, v19, v23

    if-gez v23, :cond_0

    const/16 v23, 0x1

    goto :goto_2

    :cond_0
    const/16 v23, 0x0

    .line 1916
    .end local v6    # "$i$f$isFull":I
    .end local v19    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v23, :cond_1

    .line 1918
    shl-int/lit8 v6, v15, 0x3

    add-int/2addr v6, v5

    .line 1919
    .local v6, "index$iv$iv$iv":I
    move/from16 v19, v6

    .local v19, "index$iv$iv":I
    const/16 v20, 0x0

    .line 1905
    .local v20, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    :try_start_1
    aget-object v23, v10, v19

    check-cast v23, Landroidx/compose/runtime/DerivedState;

    move-object/from16 v24, v23

    .local v24, "it":Landroidx/compose/runtime/DerivedState;
    const/16 v23, 0x0

    .line 988
    .local v23, "$i$a$-forEachScopeOf-impl-CompositionImpl$recordWriteOf$1$1":I
    move/from16 v25, v4

    move-object/from16 v4, v24

    .end local v24    # "it":Landroidx/compose/runtime/DerivedState;
    .local v4, "it":Landroidx/compose/runtime/DerivedState;
    invoke-direct {v1, v4}, Landroidx/compose/runtime/CompositionImpl;->invalidateScopeOfLocked(Ljava/lang/Object;)V

    .line 1905
    .end local v4    # "it":Landroidx/compose/runtime/DerivedState;
    .end local v23    # "$i$a$-forEachScopeOf-impl-CompositionImpl$recordWriteOf$1$1":I
    nop

    .line 1919
    .end local v19    # "index$iv$iv":I
    .end local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_3

    .line 1916
    .end local v6    # "index$iv$iv$iv":I
    :cond_1
    move/from16 v25, v4

    .line 1921
    :goto_3
    shr-long v16, v16, v25

    .line 1915
    add-int/lit8 v5, v5, 0x1

    move/from16 v4, v25

    goto :goto_1

    :cond_2
    move/from16 v25, v4

    .line 1923
    .end local v5    # "j$iv$iv$iv":I
    if-ne v3, v4, :cond_6

    .line 1910
    .end local v3    # "bitCount$iv$iv$iv":I
    .end local v16    # "slot$iv$iv$iv":J
    :cond_3
    if-eq v15, v14, :cond_5

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v6, p1

    move/from16 v5, v18

    move/from16 v3, v21

    move-object/from16 v4, v22

    goto :goto_0

    .end local v18    # "$i$f$forEachScopeOf-impl":I
    .end local v21    # "$i$f$synchronized":I
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$synchronized":I
    .local v4, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v5, "$i$f$forEachScopeOf-impl":I
    :cond_4
    move/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v5

    .line 1926
    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .end local v15    # "i$iv$iv$iv":I
    .restart local v18    # "$i$f$forEachScopeOf-impl":I
    .restart local v21    # "$i$f$synchronized":I
    .restart local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    :cond_5
    nop

    .line 1927
    .end local v11    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "$i$f$forEachIndex":I
    .end local v13    # "m$iv$iv$iv":[J
    .end local v14    # "lastIndex$iv$iv$iv":I
    :cond_6
    nop

    .end local v8    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "$i$f$forEach":I
    .end local v10    # "elements$iv$iv":[Ljava/lang/Object;
    goto :goto_4

    .line 1928
    .end local v18    # "$i$f$forEachScopeOf-impl":I
    .end local v21    # "$i$f$synchronized":I
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "$i$f$synchronized":I
    .restart local v4    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v5    # "$i$f$forEachScopeOf-impl":I
    :cond_7
    move/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v5

    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .restart local v18    # "$i$f$forEachScopeOf-impl":I
    .restart local v21    # "$i$f$synchronized":I
    .restart local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    move-object v3, v7

    check-cast v3, Landroidx/compose/runtime/DerivedState;

    .local v3, "it":Landroidx/compose/runtime/DerivedState;
    const/4 v4, 0x0

    .line 988
    .local v4, "$i$a$-forEachScopeOf-impl-CompositionImpl$recordWriteOf$1$1":I
    invoke-direct {v1, v3}, Landroidx/compose/runtime/CompositionImpl;->invalidateScopeOfLocked(Ljava/lang/Object;)V

    .line 1928
    .end local v3    # "it":Landroidx/compose/runtime/DerivedState;
    .end local v4    # "$i$a$-forEachScopeOf-impl-CompositionImpl$recordWriteOf$1$1":I
    goto :goto_4

    .line 1898
    .end local v18    # "$i$f$forEachScopeOf-impl":I
    .end local v21    # "$i$f$synchronized":I
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$synchronized":I
    .local v4, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v5    # "$i$f$forEachScopeOf-impl":I
    :cond_8
    move/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v5

    .line 1931
    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v5    # "$i$f$forEachScopeOf-impl":I
    .end local v7    # "value$iv":Ljava/lang/Object;
    .restart local v18    # "$i$f$forEachScopeOf-impl":I
    .restart local v21    # "$i$f$synchronized":I
    .restart local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    :goto_4
    nop

    .line 989
    .end local v18    # "$i$f$forEachScopeOf-impl":I
    .end local v22    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    nop

    .end local v0    # "$i$a$-synchronized-CompositionImpl$recordWriteOf$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1896
    monitor-exit v2

    .line 989
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v21    # "$i$f$synchronized":I
    return-void

    .line 1896
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v21    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_5

    .end local v21    # "$i$f$synchronized":I
    .restart local v3    # "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move/from16 v21, v3

    .end local v3    # "$i$f$synchronized":I
    .restart local v21    # "$i$f$synchronized":I
    :goto_5
    monitor-exit v2

    throw v0
.end method

.method public final removeDerivedStateObservation$runtime_release(Landroidx/compose/runtime/DerivedState;)V
    .locals 1
    .param p1, "state"    # Landroidx/compose/runtime/DerivedState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;)V"
        }
    .end annotation

    .line 1261
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1262
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->derivedStates:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1}, Landroidx/compose/runtime/collection/ScopeMap;->removeScope-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V

    .line 1264
    :cond_0
    return-void
.end method

.method public final removeObservation$runtime_release(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 1
    .param p1, "instance"    # Ljava/lang/Object;
    .param p2, "scope"    # Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 1256
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->observations:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1, p2}, Landroidx/compose/runtime/collection/ScopeMap;->remove-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1257
    return-void
.end method

.method public final setComposable(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 601
    iput-object p1, p0, Landroidx/compose/runtime/CompositionImpl;->composable:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public setContent(Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .param p1, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 613
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 1359
    .local v1, "$i$f$checkPrecondition":I
    nop

    .line 1360
    if-nez v0, :cond_1

    .line 1361
    const/4 v2, 0x0

    .line 614
    .local v2, "$i$a$-checkPrecondition-CompositionImpl$setContent$1":I
    nop

    .line 1361
    .end local v2    # "$i$a$-checkPrecondition-CompositionImpl$setContent$1":I
    const-string v2, "A pausable composition is in progress"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1363
    :cond_1
    nop

    .line 616
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$checkPrecondition":I
    invoke-direct {p0, p1}, Landroidx/compose/runtime/CompositionImpl;->composeInitial(Lkotlin/jvm/functions/Function2;)V

    .line 617
    return-void
.end method

.method public setContentWithReuse(Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .param p1, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 620
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 1364
    .local v1, "$i$f$checkPrecondition":I
    nop

    .line 1365
    if-nez v0, :cond_1

    .line 1366
    const/4 v2, 0x0

    .line 621
    .local v2, "$i$a$-checkPrecondition-CompositionImpl$setContentWithReuse$1":I
    nop

    .line 1366
    .end local v2    # "$i$a$-checkPrecondition-CompositionImpl$setContentWithReuse$1":I
    const-string v2, "A pausable composition is in progress"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1368
    :cond_1
    nop

    .line 623
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$checkPrecondition":I
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposerImpl;->startReuseFromRoot()V

    .line 625
    invoke-direct {p0, p1}, Landroidx/compose/runtime/CompositionImpl;->composeInitial(Lkotlin/jvm/functions/Function2;)V

    .line 627
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v0}, Landroidx/compose/runtime/ComposerImpl;->endReuseFromRoot()V

    .line 628
    return-void
.end method

.method public setPausableContent(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;
    .locals 12
    .param p1, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/runtime/PausedComposition;"
        }
    .end annotation

    .line 631
    iget-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->disposed:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .local v0, "value$iv":Z
    const/4 v2, 0x0

    .line 1369
    .local v2, "$i$f$checkPrecondition":I
    nop

    .line 1370
    if-nez v0, :cond_0

    .line 1371
    const/4 v3, 0x0

    .line 631
    .local v3, "$i$a$-checkPrecondition-CompositionImpl$setPausableContent$1":I
    nop

    .line 1371
    .end local v3    # "$i$a$-checkPrecondition-CompositionImpl$setPausableContent$1":I
    const-string v3, "The composition is disposed"

    invoke-static {v3}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1373
    :cond_0
    nop

    .line 632
    .end local v0    # "value$iv":Z
    .end local v2    # "$i$f$checkPrecondition":I
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .local v1, "value$iv":Z
    :goto_0
    const/4 v0, 0x0

    .line 1374
    .local v0, "$i$f$checkPrecondition":I
    nop

    .line 1375
    if-nez v1, :cond_2

    .line 1376
    const/4 v2, 0x0

    .line 633
    .local v2, "$i$a$-checkPrecondition-CompositionImpl$setPausableContent$2":I
    nop

    .line 1376
    .end local v2    # "$i$a$-checkPrecondition-CompositionImpl$setPausableContent$2":I
    const-string v2, "A pausable composition is in progress"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1378
    :cond_2
    nop

    .line 638
    .end local v0    # "$i$f$checkPrecondition":I
    .end local v1    # "value$iv":Z
    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    .line 639
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    .line 642
    iget-object v7, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    .line 643
    iget-object v10, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    .line 644
    iget-object v11, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .line 636
    new-instance v3, Landroidx/compose/runtime/PausedCompositionImpl;

    .line 637
    nop

    .line 638
    nop

    .line 639
    nop

    .line 642
    nop

    .line 640
    nop

    .line 641
    nop

    .line 643
    nop

    .line 644
    nop

    .line 636
    const/4 v9, 0x0

    move-object v4, p0

    move-object v8, p1

    .end local p1    # "content":Lkotlin/jvm/functions/Function2;
    .local v8, "content":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {v3 .. v11}, Landroidx/compose/runtime/PausedCompositionImpl;-><init>(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/ComposerImpl;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Applier;Ljava/lang/Object;)V

    .line 635
    nop

    .line 646
    .local v3, "pausedComposition":Landroidx/compose/runtime/PausedCompositionImpl;
    iput-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    .line 647
    move-object p1, v3

    check-cast p1, Landroidx/compose/runtime/PausedComposition;

    return-object p1
.end method

.method public setPausableContentWithReuse(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;
    .locals 12
    .param p1, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/runtime/PausedComposition;"
        }
    .end annotation

    .line 651
    iget-boolean v0, p0, Landroidx/compose/runtime/CompositionImpl;->disposed:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .local v0, "value$iv":Z
    const/4 v2, 0x0

    .line 1379
    .local v2, "$i$f$checkPrecondition":I
    nop

    .line 1380
    if-nez v0, :cond_0

    .line 1381
    const/4 v3, 0x0

    .line 651
    .local v3, "$i$a$-checkPrecondition-CompositionImpl$setPausableContentWithReuse$1":I
    nop

    .line 1381
    .end local v3    # "$i$a$-checkPrecondition-CompositionImpl$setPausableContentWithReuse$1":I
    const-string v3, "The composition is disposed"

    invoke-static {v3}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1383
    :cond_0
    nop

    .line 652
    .end local v0    # "value$iv":Z
    .end local v2    # "$i$f$checkPrecondition":I
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .local v1, "value$iv":Z
    :goto_0
    const/4 v0, 0x0

    .line 1384
    .local v0, "$i$f$checkPrecondition":I
    nop

    .line 1385
    if-nez v1, :cond_2

    .line 1386
    const/4 v2, 0x0

    .line 653
    .local v2, "$i$a$-checkPrecondition-CompositionImpl$setPausableContentWithReuse$2":I
    nop

    .line 1386
    .end local v2    # "$i$a$-checkPrecondition-CompositionImpl$setPausableContentWithReuse$2":I
    const-string v2, "A pausable composition is in progress"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1388
    :cond_2
    nop

    .line 658
    .end local v0    # "$i$f$checkPrecondition":I
    .end local v1    # "value$iv":Z
    iget-object v5, p0, Landroidx/compose/runtime/CompositionImpl;->parent:Landroidx/compose/runtime/CompositionContext;

    .line 659
    iget-object v6, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    .line 662
    iget-object v7, p0, Landroidx/compose/runtime/CompositionImpl;->abandonSet:Ljava/util/Set;

    .line 663
    iget-object v10, p0, Landroidx/compose/runtime/CompositionImpl;->applier:Landroidx/compose/runtime/Applier;

    .line 664
    iget-object v11, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .line 656
    new-instance v3, Landroidx/compose/runtime/PausedCompositionImpl;

    .line 657
    nop

    .line 658
    nop

    .line 659
    nop

    .line 662
    nop

    .line 660
    nop

    .line 661
    nop

    .line 663
    nop

    .line 664
    nop

    .line 656
    const/4 v9, 0x1

    move-object v4, p0

    move-object v8, p1

    .end local p1    # "content":Lkotlin/jvm/functions/Function2;
    .local v8, "content":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {v3 .. v11}, Landroidx/compose/runtime/PausedCompositionImpl;-><init>(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/ComposerImpl;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Applier;Ljava/lang/Object;)V

    .line 655
    nop

    .line 666
    .local v3, "pausedComposition":Landroidx/compose/runtime/PausedCompositionImpl;
    iput-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->pendingPausedComposition:Landroidx/compose/runtime/PausedCompositionImpl;

    .line 667
    move-object p1, v3

    check-cast p1, Landroidx/compose/runtime/PausedComposition;

    return-object p1
.end method

.method public final setPendingInvalidScopes$runtime_release(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 551
    iput-boolean p1, p0, Landroidx/compose/runtime/CompositionImpl;->pendingInvalidScopes:Z

    return-void
.end method

.method public final updateMovingInvalidations$runtime_release()V
    .locals 9

    .line 800
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1429
    .local v1, "$i$f$synchronized":I
    nop

    .line 1430
    monitor-enter v0

    const/4 v2, 0x0

    .line 801
    .local v2, "$i$a$-synchronized-CompositionImpl$updateMovingInvalidations$1":I
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/runtime/CompositionImpl;->drainPendingModificationsOutOfBandLocked()V

    .line 802
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    const/4 v4, 0x0

    .line 1431
    .local v4, "$i$f$guardInvalidationsLocked":I
    invoke-direct {v3}, Landroidx/compose/runtime/CompositionImpl;->takeInvalidations-afanTW4()Landroidx/collection/MutableScatterMap;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1432
    .local v5, "invalidations$iv":Landroidx/collection/MutableScatterMap;
    nop

    .line 1433
    move-object v6, v5

    .local v6, "invalidations":Landroidx/collection/MutableScatterMap;
    const/4 v7, 0x0

    .line 803
    .local v7, "$i$a$-guardInvalidationsLocked-CompositionImpl$updateMovingInvalidations$1$1":I
    :try_start_1
    iget-object v8, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v8, v6}, Landroidx/compose/runtime/ComposerImpl;->updateComposerInvalidations-RY85e9Y(Landroidx/collection/MutableScatterMap;)V

    .line 804
    nop

    .end local v6    # "invalidations":Landroidx/collection/MutableScatterMap;
    .end local v7    # "$i$a$-guardInvalidationsLocked-CompositionImpl$updateMovingInvalidations$1$1":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1433
    nop

    .line 1432
    nop

    .line 805
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardInvalidationsLocked":I
    .end local v5    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$updateMovingInvalidations$1":I
    :try_start_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1430
    monitor-exit v0

    .line 806
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 1434
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    .restart local v2    # "$i$a$-synchronized-CompositionImpl$updateMovingInvalidations$1":I
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .restart local v4    # "$i$f$guardInvalidationsLocked":I
    .restart local v5    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    :catch_0
    move-exception v6

    .line 1435
    .local v6, "e$iv":Ljava/lang/Exception;
    :try_start_3
    iput-object v5, v3, Landroidx/compose/runtime/CompositionImpl;->invalidations:Landroidx/collection/MutableScatterMap;

    .line 1436
    nop

    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1430
    .end local v2    # "$i$a$-synchronized-CompositionImpl$updateMovingInvalidations$1":I
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionImpl;
    .end local v4    # "$i$f$guardInvalidationsLocked":I
    .end local v5    # "invalidations$iv":Landroidx/collection/MutableScatterMap;
    .end local v6    # "e$iv":Ljava/lang/Exception;
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method public verifyConsistent()V
    .locals 4

    .line 1132
    iget-object v0, p0, Landroidx/compose/runtime/CompositionImpl;->lock:Ljava/lang/Object;

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 2133
    .local v1, "$i$f$synchronized":I
    nop

    .line 2134
    monitor-enter v0

    const/4 v2, 0x0

    .line 1133
    .local v2, "$i$a$-synchronized-CompositionImpl$verifyConsistent$1":I
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/CompositionImpl;->isComposing()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1134
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->composer:Landroidx/compose/runtime/ComposerImpl;

    invoke-virtual {v3}, Landroidx/compose/runtime/ComposerImpl;->verifyConsistent$runtime_release()V

    .line 1135
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v3}, Landroidx/compose/runtime/SlotTable;->verifyWellFormed()V

    .line 1136
    iget-object v3, p0, Landroidx/compose/runtime/CompositionImpl;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-direct {p0, v3}, Landroidx/compose/runtime/CompositionImpl;->validateRecomposeScopeAnchors(Landroidx/compose/runtime/SlotTable;)V

    .line 1138
    :cond_0
    nop

    .end local v2    # "$i$a$-synchronized-CompositionImpl$verifyConsistent$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2134
    monitor-exit v0

    .line 1139
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return-void

    .line 2134
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method
