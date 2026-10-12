.class public final Landroidx/collection/SieveCache;
.super Ljava/lang/Object;
.source "SieveCache.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1148:1\n684#1,2:1161\n633#1:1163\n635#1,2:1165\n638#1,6:1168\n251#1,2:1174\n251#1,2:1176\n251#1,2:1178\n251#1,2:1181\n251#1,2:1201\n548#1,4:1210\n1025#1,6:1214\n1035#1,3:1221\n1038#1,2:1225\n251#1,2:1227\n1041#1,6:1229\n552#1:1235\n251#1,2:1236\n1025#1,6:1238\n1035#1,3:1245\n1038#1,9:1249\n1025#1,6:1289\n1035#1,3:1296\n1038#1,9:1300\n1025#1,6:1309\n1035#1,3:1316\n1038#1,9:1320\n1025#1,6:1329\n1035#1,3:1336\n1038#1,9:1340\n548#1,4:1349\n1025#1,6:1353\n1035#1,3:1360\n1038#1,9:1364\n552#1:1373\n548#1,4:1374\n1025#1,6:1378\n1035#1,3:1385\n1038#1,9:1389\n552#1:1398\n548#1,4:1399\n1025#1,6:1403\n1035#1,3:1410\n1038#1,9:1414\n552#1:1423\n1025#1,6:1424\n1035#1,3:1431\n1038#1,9:1435\n660#1,3:1462\n663#1:1466\n665#1,2:1468\n668#1,5:1471\n674#1,8:1477\n548#1,4:1638\n1025#1,6:1642\n1035#1,3:1649\n1038#1,9:1653\n552#1:1662\n548#1,4:1663\n1025#1,6:1667\n1035#1,3:1674\n1038#1,9:1678\n552#1:1687\n59#2,5:1149\n1#3:1154\n1254#4,6:1155\n1399#4:1194\n1270#4:1198\n1399#4:1220\n1270#4:1224\n1399#4:1244\n1270#4:1248\n1399#4:1268\n1270#4:1272\n1399#4:1295\n1270#4:1299\n1399#4:1315\n1270#4:1319\n1399#4:1335\n1270#4:1339\n1399#4:1359\n1270#4:1363\n1399#4:1384\n1270#4:1388\n1399#4:1409\n1270#4:1413\n1399#4:1430\n1270#4:1434\n1230#4:1450\n1254#4,6:1451\n1242#4:1457\n1241#4,4:1458\n1165#4,3:1489\n1179#4:1492\n1175#4:1493\n1372#4,3:1494\n1386#4,3:1497\n1312#4:1500\n1303#4:1501\n1297#4:1502\n1309#4:1503\n1393#4:1504\n1165#4,3:1505\n1175#4:1508\n1179#4:1509\n1372#4,3:1510\n1386#4,3:1513\n1312#4:1516\n1303#4:1517\n1297#4:1518\n1309#4:1519\n1393#4:1520\n1265#4:1521\n1220#4:1522\n1262#4:1523\n1220#4:1524\n1230#4:1525\n1254#4,6:1526\n1242#4:1532\n1241#4,4:1533\n1372#4,3:1537\n1399#4:1540\n1297#4:1541\n1144#4,14:1542\n1220#4:1556\n1165#4,3:1557\n1175#4:1560\n1179#4:1561\n1254#4,6:1562\n1220#4:1569\n1179#4:1570\n1254#4,6:1571\n1254#4,6:1577\n1179#4:1588\n1254#4,6:1589\n1268#4:1600\n1220#4:1601\n1165#4,3:1602\n1175#4:1605\n1179#4:1606\n1230#4:1607\n1254#4,6:1608\n1242#4:1614\n1241#4,4:1615\n1399#4:1636\n1270#4:1637\n1399#4:1648\n1270#4:1652\n1399#4:1673\n1270#4:1677\n1111#5:1164\n1114#5:1167\n1130#5:1444\n1123#5:1445\n1119#5:1446\n1123#5:1447\n1111#5:1448\n1114#5:1449\n1123#5:1465\n1127#5:1467\n1117#5:1470\n1114#5:1476\n1123#5:1485\n1127#5:1486\n1117#5:1487\n1114#5:1488\n1132#5:1568\n1144#5:1583\n1138#5:1584\n1141#5:1585\n1132#5:1586\n1132#5:1587\n1144#5:1595\n1138#5:1596\n1135#5:1597\n1132#5:1598\n1132#5:1599\n1123#5:1619\n1127#5:1620\n1096#5,2:1621\n1147#5:1623\n1098#5,2:1624\n1147#5:1626\n1147#5:1627\n1147#5:1628\n1147#5:1629\n1123#5:1630\n1127#5:1631\n1103#5,4:1632\n215#6:1180\n216#6:1183\n357#7,4:1184\n329#7,6:1188\n339#7,3:1195\n342#7,2:1199\n345#7,6:1203\n361#7:1209\n231#8,3:1258\n200#8,7:1261\n211#8,3:1269\n214#8,9:1273\n234#8:1282\n287#9,6:1283\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n229#1:1161,2\n288#1:1163\n288#1:1165,2\n288#1:1168,6\n300#1:1174,2\n311#1:1176,2\n322#1:1178,2\n332#1:1181,2\n341#1:1201,2\n350#1:1210,4\n350#1:1214,6\n350#1:1221,3\n350#1:1225,2\n350#1:1227,2\n350#1:1229,6\n350#1:1235\n358#1:1236,2\n447#1:1238,6\n447#1:1245,3\n447#1:1249,9\n551#1:1289,6\n551#1:1296,3\n551#1:1300,9\n563#1:1309,6\n563#1:1316,3\n563#1:1320,9\n575#1:1329,6\n575#1:1336,3\n575#1:1340,9\n580#1:1349,4\n580#1:1353,6\n580#1:1360,3\n580#1:1364,9\n580#1:1373\n586#1:1374,4\n586#1:1378,6\n586#1:1385,3\n586#1:1389,9\n586#1:1398\n596#1:1399,4\n596#1:1403,6\n596#1:1410,3\n596#1:1414,9\n596#1:1423\n609#1:1424,6\n609#1:1431,3\n609#1:1435,9\n654#1:1462,3\n654#1:1466\n654#1:1468,2\n654#1:1471,5\n654#1:1477,8\n1055#1:1638,4\n1055#1:1642,6\n1055#1:1649,3\n1055#1:1653,9\n1055#1:1662\n1081#1:1663,4\n1081#1:1667,6\n1081#1:1674,3\n1081#1:1678,9\n1081#1:1687\n131#1:1149,5\n211#1:1155,6\n341#1:1194\n341#1:1198\n350#1:1220\n350#1:1224\n447#1:1244\n447#1:1248\n486#1:1268\n486#1:1272\n551#1:1295\n551#1:1299\n563#1:1315\n563#1:1319\n575#1:1335\n575#1:1339\n580#1:1359\n580#1:1363\n586#1:1384\n586#1:1388\n596#1:1409\n596#1:1413\n609#1:1430\n609#1:1434\n648#1:1450\n648#1:1451,6\n648#1:1457\n648#1:1458,4\n688#1:1489,3\n689#1:1492\n692#1:1493\n696#1:1494,3\n697#1:1497,3\n698#1:1500\n699#1:1501\n699#1:1502\n703#1:1503\n706#1:1504\n718#1:1505,3\n719#1:1508\n720#1:1509\n727#1:1510,3\n728#1:1513,3\n729#1:1516\n730#1:1517\n730#1:1518\n734#1:1519\n737#1:1520\n746#1:1521\n746#1:1522\n752#1:1523\n752#1:1524\n753#1:1525\n753#1:1526,6\n753#1:1532\n753#1:1533,4\n764#1:1537,3\n765#1:1540\n767#1:1541\n841#1:1542,14\n847#1:1556\n861#1:1557,3\n862#1:1560\n873#1:1561\n874#1:1562,6\n888#1:1569\n891#1:1570\n892#1:1571,6\n893#1:1577,6\n915#1:1588\n916#1:1589,6\n980#1:1600\n980#1:1601\n982#1:1602,3\n983#1:1605\n985#1:1606\n985#1:1607\n985#1:1608,6\n985#1:1614\n985#1:1615,4\n1030#1:1636\n1037#1:1637\n1055#1:1648\n1055#1:1652\n1081#1:1673\n1081#1:1677\n288#1:1164\n288#1:1167\n619#1:1444\n621#1:1445\n622#1:1446\n626#1:1447\n633#1:1448\n636#1:1449\n654#1:1465\n654#1:1467\n654#1:1470\n654#1:1476\n662#1:1485\n663#1:1486\n666#1:1487\n672#1:1488\n878#1:1568\n905#1:1583\n907#1:1584\n908#1:1585\n910#1:1586\n912#1:1587\n931#1:1595\n933#1:1596\n934#1:1597\n936#1:1598\n940#1:1599\n1001#1:1619\n1002#1:1620\n1003#1:1621,2\n1003#1:1623\n1003#1:1624,2\n1003#1:1626\n1005#1:1627\n1006#1:1628\n1007#1:1629\n1014#1:1630\n1015#1:1631\n1016#1:1632,4\n332#1:1180\n332#1:1183\n341#1:1184,4\n341#1:1188,6\n341#1:1195,3\n341#1:1199,2\n341#1:1203,6\n341#1:1209\n486#1:1258,3\n486#1:1261,7\n486#1:1269,3\n486#1:1273,9\n486#1:1282\n491#1:1283,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u0016\n\u0002\u0008\u001d\n\u0002\u0010\u0015\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u00e0\u0001\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0005\u00128\u0008\u0002\u0010\u0007\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00050\u0008\u0012%\u0008\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e\u0012d\u0008\u0002\u0010\u000f\u001a^\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0011\u0012\u0015\u0012\u0013\u0018\u00018\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0012\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0014\u0012\u0004\u0012\u00020\u00150\u0010\u00a2\u0006\u0002\u0010\u0016J\r\u00103\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\u00084J&\u00105\u001a\u00020\u00132\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0008H\u0086\u0008\u00f8\u0001\u0000J\u0006\u00107\u001a\u00020\u0013J&\u00107\u001a\u00020\u00132\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0008H\u0086\u0008\u00f8\u0001\u0000J\u0016\u00108\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u00109J\u0013\u0010;\u001a\u00020\u00132\u0006\u0010\u000c\u001a\u00028\u0001\u00a2\u0006\u0002\u00109J\u0006\u0010\u001e\u001a\u00020\u0005J&\u0010\u001e\u001a\u00020\u00052\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0008H\u0086\u0008\u00f8\u0001\u0000J\r\u0010<\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\u0008=J\u0013\u0010>\u001a\u00020\u00132\u0008\u0010?\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010@\u001a\u00020\u0015J\u0008\u0010A\u001a\u00020\u0005H\u0002J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0015\u0010D\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010EJ\u0015\u0010F\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010EJ\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020+H\u0002JD\u0010J\u001a\u00020\u001526\u0010K\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00150\u0008H\u0086\u0008\u00f8\u0001\u0000J/\u0010L\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(M\u0012\u0004\u0012\u00020\u00150\u000eH\u0081\u0008\u00f8\u0001\u0000J/\u0010N\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u00150\u000eH\u0086\u0008\u00f8\u0001\u0000J/\u0010O\u001a\u00020\u00152!\u0010K\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00150\u000eH\u0086\u0008\u00f8\u0001\u0000J\u0018\u0010P\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010QJ\u0008\u0010R\u001a\u00020\u0005H\u0016J\u0008\u0010S\u001a\u00020\u0015H\u0002J\u0010\u0010T\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010U\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010V\u001a\u00020\u0013J\u0006\u0010W\u001a\u00020\u0013J\u0011\u0010X\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\u0008J\u0016\u0010Y\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\n\u00a2\u0006\u0002\u0010ZJ\u0017\u0010Y\u001a\u00020\u00152\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000[H\u0086\nJ\u0017\u0010Y\u001a\u00020\u00152\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000\\H\u0086\nJ\u001e\u0010Y\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000&H\u0086\n\u00a2\u0006\u0002\u0010]J\u0017\u0010Y\u001a\u00020\u00152\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000^H\u0086\nJ\u0017\u0010Y\u001a\u00020\u00152\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000_H\u0086\nJ\u0011\u0010`\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\u0008J\u0006\u0010a\u001a\u00020\u0013J\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010dH\u0086\nJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\nJ*\u0010b\u001a\u00020\u00152\u001a\u0010e\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0&H\u0086\n\u00a2\u0006\u0002\u0010gJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010fH\u0086\nJ#\u0010b\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0^H\u0086\nJ\u001d\u0010b\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iH\u0086\nJ#\u0010b\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0_H\u0086\nJ\u001d\u0010j\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00028\u0001\u00a2\u0006\u0002\u0010kJ\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010dJ\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000J\'\u0010l\u001a\u00020\u00152\u001a\u0010e\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0&\u00a2\u0006\u0002\u0010gJ \u0010l\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0^J\u001a\u0010l\u001a\u00020\u00152\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iJ \u0010l\u001a\u00020\u00152\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f0_J\u0015\u0010m\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010QJ\u001b\u0010m\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00028\u0001\u00a2\u0006\u0002\u0010nJ \u0010o\u001a\u00020\u00152\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0008J\u0011\u0010p\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0005H\u0082\u0008J\u0017\u0010q\u001a\u0004\u0018\u00018\u00012\u0006\u0010M\u001a\u00020\u0005H\u0002\u00a2\u0006\u0002\u0010rJ\u0010\u0010s\u001a\u00020\u00152\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005J\u0015\u0010t\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008vJ\u001e\u0010w\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00028\u0001H\u0086\n\u00a2\u0006\u0002\u0010xJ\u0008\u0010y\u001a\u00020zH\u0016J\u000e\u0010{\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00058FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\u001dR+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0000@\u0000X\u0081\u000e\u00a2\u0006\n\n\u0002\u0010(\u0012\u0004\u0008\'\u0010 R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\u001dR\u0018\u0010*\u001a\u00020+8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008,\u0010 R\u000e\u0010-\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000Rj\u0010\u000f\u001a^\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0011\u0012\u0015\u0012\u0013\u0018\u00018\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0012\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0014\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u001dR>\u0010\u0007\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\u00050\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0000@\u0000X\u0081\u000e\u00a2\u0006\n\n\u0002\u0010(\u0012\u0004\u00082\u0010 \u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006|"
    }
    d2 = {
        "Landroidx/collection/SieveCache;",
        "K",
        "",
        "V",
        "maxSize",
        "",
        "initialCapacity",
        "sizeOf",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "key",
        "value",
        "createValueFromKey",
        "Lkotlin/Function1;",
        "onEntryRemoved",
        "Lkotlin/Function4;",
        "oldValue",
        "newValue",
        "",
        "evicted",
        "",
        "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V",
        "_capacity",
        "_count",
        "_maxSize",
        "_size",
        "capacity",
        "getCapacity",
        "()I",
        "count",
        "getCount$annotations",
        "()V",
        "getCount",
        "growthLimit",
        "hand",
        "head",
        "keys",
        "",
        "getKeys$annotations",
        "[Ljava/lang/Object;",
        "getMaxSize",
        "metadata",
        "",
        "getMetadata$annotations",
        "nodes",
        "size",
        "getSize",
        "tail",
        "values",
        "getValues$annotations",
        "adjustStorage",
        "adjustStorage$collection",
        "all",
        "predicate",
        "any",
        "contains",
        "(Ljava/lang/Object;)Z",
        "containsKey",
        "containsValue",
        "dropDeletes",
        "dropDeletes$collection",
        "equals",
        "other",
        "evictAll",
        "findEvictionCandidate",
        "findFirstAvailableSlot",
        "hash1",
        "findInsertIndex",
        "(Ljava/lang/Object;)I",
        "findKeyIndex",
        "fixupNodes",
        "mapping",
        "",
        "forEach",
        "block",
        "forEachIndexed",
        "index",
        "forEachKey",
        "forEachValue",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "hashCode",
        "initializeGrowth",
        "initializeMetadata",
        "initializeStorage",
        "isEmpty",
        "isNotEmpty",
        "markNodeVisited",
        "minusAssign",
        "(Ljava/lang/Object;)V",
        "Landroidx/collection/ObjectList;",
        "Landroidx/collection/ScatterSet;",
        "([Ljava/lang/Object;)V",
        "",
        "Lkotlin/sequences/Sequence;",
        "moveNodeToHead",
        "none",
        "plusAssign",
        "from",
        "Landroidx/collection/ScatterMap;",
        "pairs",
        "Lkotlin/Pair;",
        "([Lkotlin/Pair;)V",
        "pair",
        "",
        "put",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "putAll",
        "remove",
        "(Ljava/lang/Object;Ljava/lang/Object;)Z",
        "removeIf",
        "removeNode",
        "removeValueAt",
        "(I)Ljava/lang/Object;",
        "resize",
        "resizeStorage",
        "newCapacity",
        "resizeStorage$collection",
        "set",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "toString",
        "",
        "trimToSize",
        "collection"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private _capacity:I

.field private _count:I

.field private _maxSize:I

.field private _size:I

.field private final createValueFromKey:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private growthLimit:I

.field private hand:I

.field private head:I

.field public keys:[Ljava/lang/Object;

.field public metadata:[J

.field private nodes:[J

.field private final onEntryRemoved:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "TK;TV;TV;",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final sizeOf:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TK;TV;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private tail:I

.field public values:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
    .locals 3
    .param p1, "maxSize"    # I
    .param p2, "initialCapacity"    # I
    .param p3, "sizeOf"    # Lkotlin/jvm/functions/Function2;
    .param p4, "createValueFromKey"    # Lkotlin/jvm/functions/Function1;
    .param p5, "onEntryRemoved"    # Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TK;+TV;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-TK;-TV;-TV;-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "sizeOf"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createValueFromKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onEntryRemoved"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p3, p0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    .line 109
    iput-object p4, p0, Landroidx/collection/SieveCache;->createValueFromKey:Lkotlin/jvm/functions/Function1;

    .line 110
    iput-object p5, p0, Landroidx/collection/SieveCache;->onEntryRemoved:Lkotlin/jvm/functions/Function4;

    .line 114
    sget-object v0, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    iput-object v0, p0, Landroidx/collection/SieveCache;->metadata:[J

    .line 115
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 116
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 117
    invoke-static {}, Landroidx/collection/SieveCacheKt;->getEmptyNodes()[J

    move-result-object v0

    iput-object v0, p0, Landroidx/collection/SieveCache;->nodes:[J

    .line 126
    const v0, 0x7fffffff

    iput v0, p0, Landroidx/collection/SieveCache;->head:I

    .line 127
    iput v0, p0, Landroidx/collection/SieveCache;->tail:I

    .line 128
    iput v0, p0, Landroidx/collection/SieveCache;->hand:I

    .line 130
    nop

    .line 131
    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 1149
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 1150
    if-nez v0, :cond_1

    .line 1151
    const/4 v2, 0x0

    .line 131
    .local v2, "$i$a$-requirePrecondition-SieveCache$4":I
    nop

    .line 1151
    .end local v2    # "$i$a$-requirePrecondition-SieveCache$4":I
    const-string/jumbo v2, "maxSize must be > 0"

    invoke-static {v2}, Landroidx/collection/internal/RuntimeHelpersKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1153
    :cond_1
    nop

    .line 132
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    iput p1, p0, Landroidx/collection/SieveCache;->_maxSize:I

    .line 133
    invoke-static {p2}, Landroidx/collection/ScatterMapKt;->unloadedCapacity(I)I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/collection/SieveCache;->initializeStorage(I)V

    .line 134
    nop

    .line 105
    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    .line 105
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 107
    const/4 p2, 0x6

    move v2, p2

    goto :goto_0

    .line 105
    :cond_0
    move v2, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 108
    sget-object p2, Landroidx/collection/SieveCache$1;->INSTANCE:Landroidx/collection/SieveCache$1;

    move-object p3, p2

    check-cast p3, Lkotlin/jvm/functions/Function2;

    move-object v3, p3

    goto :goto_1

    .line 105
    :cond_1
    move-object v3, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 109
    sget-object p2, Landroidx/collection/SieveCache$2;->INSTANCE:Landroidx/collection/SieveCache$2;

    move-object p4, p2

    check-cast p4, Lkotlin/jvm/functions/Function1;

    move-object v4, p4

    goto :goto_2

    .line 105
    :cond_2
    move-object v4, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 111
    sget-object p2, Landroidx/collection/SieveCache$3;->INSTANCE:Landroidx/collection/SieveCache$3;

    move-object p5, p2

    check-cast p5, Lkotlin/jvm/functions/Function4;

    move-object v5, p5

    goto :goto_3

    .line 105
    :cond_3
    move-object v5, p5

    :goto_3
    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/collection/SieveCache;-><init>(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    .line 113
    return-void
.end method

.method private final findEvictionCandidate()I
    .locals 13

    .line 616
    iget-object v0, p0, Landroidx/collection/SieveCache;->nodes:[J

    .line 618
    .local v0, "nodes":[J
    iget v1, p0, Landroidx/collection/SieveCache;->hand:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_0

    iget v1, p0, Landroidx/collection/SieveCache;->hand:I

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/collection/SieveCache;->tail:I

    .line 619
    .local v1, "candidate":I
    :goto_0
    const-wide/32 v3, 0x7fffffff

    const/16 v5, 0x1f

    if-eq v1, v2, :cond_2

    aget-wide v6, v0, v1

    .local v6, "$this$visited$iv":J
    const/4 v8, 0x0

    .line 1444
    .local v8, "$i$f$getVisited":I
    const/16 v9, 0x3e

    shr-long v9, v6, v9

    const-wide/16 v11, 0x1

    and-long/2addr v9, v11

    long-to-int v6, v9

    .line 619
    .end local v6    # "$this$visited$iv":J
    .end local v8    # "$i$f$getVisited":I
    if-eqz v6, :cond_2

    .line 620
    aget-wide v6, v0, v1

    .line 621
    .local v6, "node":J
    move-wide v8, v6

    .local v8, "$this$previousNode$iv":J
    const/4 v10, 0x0

    .line 1445
    .local v10, "$i$f$getPreviousNode":I
    shr-long v11, v8, v5

    and-long/2addr v3, v11

    long-to-int v3, v3

    .line 621
    .end local v8    # "$this$previousNode$iv":J
    .end local v10    # "$i$f$getPreviousNode":I
    nop

    .line 622
    .local v3, "previousIndex":I
    const/4 v4, 0x0

    .line 1446
    .local v4, "$i$f$clearVisitedBit":I
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    and-long v4, v6, v8

    .end local v4    # "$i$f$clearVisitedBit":I
    aput-wide v4, v0, v1

    .line 623
    if-eq v3, v2, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    iget v4, p0, Landroidx/collection/SieveCache;->tail:I

    :goto_1
    move v1, v4

    .end local v3    # "previousIndex":I
    .end local v6    # "node":J
    goto :goto_0

    .line 626
    :cond_2
    aget-wide v6, v0, v1

    .local v6, "$this$previousNode$iv":J
    const/4 v8, 0x0

    .line 1447
    .local v8, "$i$f$getPreviousNode":I
    shr-long v9, v6, v5

    and-long/2addr v3, v9

    long-to-int v3, v3

    .line 626
    .end local v6    # "$this$previousNode$iv":J
    .end local v8    # "$i$f$getPreviousNode":I
    nop

    .line 627
    .restart local v3    # "previousIndex":I
    if-eq v3, v2, :cond_3

    move v2, v3

    :cond_3
    iput v2, p0, Landroidx/collection/SieveCache;->hand:I

    .line 629
    return v1
.end method

.method private final findFirstAvailableSlot(I)I
    .locals 14
    .param p1, "hash1"    # I

    .line 759
    iget v0, p0, Landroidx/collection/SieveCache;->_capacity:I

    .line 760
    .local v0, "probeMask":I
    and-int v1, p1, v0

    .line 761
    .local v1, "probeOffset":I
    const/4 v2, 0x0

    .line 763
    .local v2, "probeIndex":I
    :goto_0
    nop

    .line 764
    iget-object v3, p0, Landroidx/collection/SieveCache;->metadata:[J

    .local v3, "metadata$iv":[J
    const/4 v4, 0x0

    .line 1537
    .local v4, "$i$f$group":I
    shr-int/lit8 v5, v1, 0x3

    .line 1538
    .local v5, "i$iv":I
    and-int/lit8 v6, v1, 0x7

    shl-int/lit8 v6, v6, 0x3

    .line 1539
    .local v6, "b$iv":I
    aget-wide v7, v3, v5

    ushr-long/2addr v7, v6

    add-int/lit8 v9, v5, 0x1

    aget-wide v9, v3, v9

    rsub-int/lit8 v11, v6, 0x40

    shl-long/2addr v9, v11

    int-to-long v11, v6

    neg-long v11, v11

    const/16 v13, 0x3f

    shr-long/2addr v11, v13

    and-long/2addr v9, v11

    or-long v3, v7, v9

    .line 764
    .end local v3    # "metadata$iv":[J
    .end local v4    # "$i$f$group":I
    .end local v5    # "i$iv":I
    .end local v6    # "b$iv":I
    nop

    .line 765
    .local v3, "g":J
    move-wide v5, v3

    .local v5, "$this$maskEmptyOrDeleted$iv":J
    const/4 v7, 0x0

    .line 1540
    .local v7, "$i$f$maskEmptyOrDeleted":I
    not-long v8, v5

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v5

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v5, v8, v10

    .line 765
    .end local v5    # "$this$maskEmptyOrDeleted$iv":J
    .end local v7    # "$i$f$maskEmptyOrDeleted":I
    nop

    .line 766
    .local v5, "m":J
    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-eqz v7, :cond_0

    .line 767
    move-wide v7, v5

    .local v7, "$this$lowestBitSet$iv":J
    const/4 v9, 0x0

    .line 1541
    .local v9, "$i$f$lowestBitSet":I
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v10

    shr-int/lit8 v7, v10, 0x3

    .line 767
    .end local v7    # "$this$lowestBitSet$iv":J
    .end local v9    # "$i$f$lowestBitSet":I
    add-int/2addr v7, v1

    and-int/2addr v7, v0

    return v7

    .line 769
    :cond_0
    add-int/lit8 v2, v2, 0x8

    .line 770
    add-int v7, v1, v2

    and-int v1, v7, v0

    .end local v3    # "g":J
    .end local v5    # "m":J
    goto :goto_0
.end method

.method private final findInsertIndex(Ljava/lang/Object;)I
    .locals 24
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 718
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 1505
    .local v2, "$i$f$hash":I
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const v5, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v4, v5

    .line 1507
    .local v4, "hash$iv":I
    shl-int/lit8 v5, v4, 0x10

    xor-int v2, v4, v5

    .line 718
    .end local v2    # "$i$f$hash":I
    .end local v4    # "hash$iv":I
    nop

    .line 719
    .local v2, "hash":I
    const/4 v4, 0x0

    .line 1508
    .local v4, "$i$f$h1":I
    ushr-int/lit8 v4, v2, 0x7

    .line 719
    .end local v4    # "$i$f$h1":I
    nop

    .line 720
    .local v4, "hash1":I
    const/4 v5, 0x0

    .line 1509
    .local v5, "$i$f$h2":I
    and-int/lit8 v5, v2, 0x7f

    .line 720
    .end local v5    # "$i$f$h2":I
    nop

    .line 722
    .local v5, "hash2":I
    iget v6, v0, Landroidx/collection/SieveCache;->_capacity:I

    .line 723
    .local v6, "probeMask":I
    and-int v7, v4, v6

    .line 724
    .local v7, "probeOffset":I
    const/4 v8, 0x0

    .line 726
    .local v8, "probeIndex":I
    :goto_1
    nop

    .line 727
    iget-object v9, v0, Landroidx/collection/SieveCache;->metadata:[J

    .local v9, "metadata$iv":[J
    const/4 v10, 0x0

    .line 1510
    .local v10, "$i$f$group":I
    shr-int/lit8 v11, v7, 0x3

    .line 1511
    .local v11, "i$iv":I
    and-int/lit8 v12, v7, 0x7

    shl-int/lit8 v12, v12, 0x3

    .line 1512
    .local v12, "b$iv":I
    aget-wide v13, v9, v11

    ushr-long/2addr v13, v12

    add-int/lit8 v15, v11, 0x1

    aget-wide v15, v9, v15

    rsub-int/lit8 v17, v12, 0x40

    shl-long v15, v15, v17

    move/from16 v18, v4

    .end local v4    # "hash1":I
    .local v18, "hash1":I
    int-to-long v3, v12

    neg-long v3, v3

    const/16 v19, 0x3f

    shr-long v3, v3, v19

    and-long/2addr v3, v15

    or-long/2addr v3, v13

    .line 727
    .end local v9    # "metadata$iv":[J
    .end local v10    # "$i$f$group":I
    .end local v11    # "i$iv":I
    .end local v12    # "b$iv":I
    nop

    .line 728
    .local v3, "g":J
    move-wide v9, v3

    .local v9, "$this$match$iv":J
    const/4 v11, 0x0

    .line 1513
    .local v11, "$i$f$match":I
    int-to-long v12, v5

    const-wide v14, 0x101010101010101L

    mul-long/2addr v12, v14

    xor-long/2addr v12, v9

    .line 1515
    .local v12, "x$iv":J
    sub-long v14, v12, v14

    move/from16 v16, v2

    move-wide/from16 v19, v3

    .end local v2    # "hash":I
    .end local v3    # "g":J
    .local v16, "hash":I
    .local v19, "g":J
    not-long v2, v12

    and-long/2addr v2, v14

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v2, v14

    .line 728
    .end local v9    # "$this$match$iv":J
    .end local v11    # "$i$f$match":I
    .end local v12    # "x$iv":J
    nop

    .line 729
    .local v2, "m":J
    :goto_2
    move-wide v9, v2

    .local v9, "$this$hasNext$iv":J
    const/4 v4, 0x0

    .line 1516
    .local v4, "$i$f$hasNext":I
    const-wide/16 v11, 0x0

    cmp-long v13, v9, v11

    const/16 v21, 0x1

    if-eqz v13, :cond_1

    move/from16 v4, v21

    goto :goto_3

    :cond_1
    const/4 v4, 0x0

    .end local v4    # "$i$f$hasNext":I
    .end local v9    # "$this$hasNext$iv":J
    :goto_3
    if-eqz v4, :cond_3

    .line 730
    move-wide v9, v2

    .local v9, "$this$get$iv":J
    const/4 v4, 0x0

    .line 1517
    .local v4, "$i$f$get":I
    move-wide v11, v9

    .local v11, "$this$lowestBitSet$iv$iv":J
    const/4 v13, 0x0

    .line 1518
    .local v13, "$i$f$lowestBitSet":I
    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v21

    shr-int/lit8 v11, v21, 0x3

    .line 1517
    .end local v11    # "$this$lowestBitSet$iv$iv":J
    .end local v13    # "$i$f$lowestBitSet":I
    nop

    .line 730
    .end local v4    # "$i$f$get":I
    .end local v9    # "$this$get$iv":J
    add-int/2addr v11, v7

    and-int v4, v11, v6

    .line 731
    .local v4, "index":I
    iget-object v9, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    aget-object v9, v9, v4

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 732
    return v4

    .line 734
    :cond_2
    move-wide v9, v2

    .local v9, "$this$next$iv":J
    const/4 v11, 0x0

    .line 1519
    .local v11, "$i$f$next":I
    const-wide/16 v12, 0x1

    sub-long v12, v9, v12

    and-long/2addr v9, v12

    .line 734
    .end local v9    # "$this$next$iv":J
    .end local v11    # "$i$f$next":I
    move-wide v2, v9

    .end local v4    # "index":I
    goto :goto_2

    .line 737
    :cond_3
    move-wide/from16 v9, v19

    .local v9, "$this$maskEmpty$iv":J
    const/4 v4, 0x0

    .line 1520
    .local v4, "$i$f$maskEmpty":I
    move-wide/from16 v22, v11

    not-long v11, v9

    const/4 v13, 0x6

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    and-long v9, v11, v14

    .line 737
    .end local v4    # "$i$f$maskEmpty":I
    .end local v9    # "$this$maskEmpty$iv":J
    cmp-long v4, v9, v22

    if-eqz v4, :cond_7

    .line 738
    nop

    .line 745
    .end local v2    # "m":J
    .end local v19    # "g":J
    move/from16 v4, v18

    .end local v18    # "hash1":I
    .local v4, "hash1":I
    invoke-direct {v0, v4}, Landroidx/collection/SieveCache;->findFirstAvailableSlot(I)I

    move-result v2

    .line 746
    .local v2, "index":I
    iget v3, v0, Landroidx/collection/SieveCache;->growthLimit:I

    const-wide/16 v9, 0xff

    if-nez v3, :cond_5

    iget-object v3, v0, Landroidx/collection/SieveCache;->metadata:[J

    .local v3, "metadata$iv":[J
    const/4 v11, 0x0

    .line 1521
    .local v11, "$i$f$isDeleted":I
    const/4 v12, 0x0

    .line 1522
    .local v12, "$i$f$readRawMetadata":I
    shr-int/lit8 v13, v2, 0x3

    aget-wide v13, v3, v13

    and-int/lit8 v15, v2, 0x7

    shl-int/lit8 v15, v15, 0x3

    shr-long/2addr v13, v15

    and-long v12, v13, v9

    .line 1521
    .end local v12    # "$i$f$readRawMetadata":I
    const-wide/16 v14, 0xfe

    cmp-long v12, v12, v14

    if-nez v12, :cond_4

    move/from16 v3, v21

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    .line 746
    .end local v3    # "metadata$iv":[J
    .end local v11    # "$i$f$isDeleted":I
    :goto_4
    if-nez v3, :cond_5

    .line 747
    invoke-virtual {v0}, Landroidx/collection/SieveCache;->adjustStorage$collection()V

    .line 748
    invoke-direct {v0, v4}, Landroidx/collection/SieveCache;->findFirstAvailableSlot(I)I

    move-result v2

    .line 751
    :cond_5
    iget v3, v0, Landroidx/collection/SieveCache;->_count:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Landroidx/collection/SieveCache;->_count:I

    .line 752
    iget v3, v0, Landroidx/collection/SieveCache;->growthLimit:I

    iget-object v11, v0, Landroidx/collection/SieveCache;->metadata:[J

    .local v11, "metadata$iv":[J
    const/4 v12, 0x0

    .line 1523
    .local v12, "$i$f$isEmpty":I
    const/4 v13, 0x0

    .line 1524
    .local v13, "$i$f$readRawMetadata":I
    shr-int/lit8 v14, v2, 0x3

    aget-wide v14, v11, v14

    and-int/lit8 v18, v2, 0x7

    shl-int/lit8 v18, v18, 0x3

    shr-long v14, v14, v18

    and-long v13, v14, v9

    .line 1523
    .end local v13    # "$i$f$readRawMetadata":I
    const-wide/16 v18, 0x80

    cmp-long v13, v13, v18

    if-nez v13, :cond_6

    move/from16 v17, v21

    goto :goto_5

    :cond_6
    const/16 v17, 0x0

    .line 752
    .end local v11    # "metadata$iv":[J
    .end local v12    # "$i$f$isEmpty":I
    :goto_5
    sub-int v3, v3, v17

    iput v3, v0, Landroidx/collection/SieveCache;->growthLimit:I

    .line 753
    iget-object v3, v0, Landroidx/collection/SieveCache;->metadata:[J

    .local v3, "data$iv":[J
    iget v11, v0, Landroidx/collection/SieveCache;->_capacity:I

    .local v11, "capacity$iv":I
    int-to-long v12, v5

    .local v12, "value$iv":J
    const/4 v14, 0x0

    .line 1525
    .local v14, "$i$f$writeMetadata":I
    const/4 v15, 0x0

    .line 1526
    .local v15, "$i$f$writeRawMetadata":I
    shr-int/lit8 v17, v2, 0x3

    .line 1527
    .local v17, "i$iv$iv":I
    and-int/lit8 v18, v2, 0x7

    shl-int/lit8 v18, v18, 0x3

    .line 1530
    .local v18, "b$iv$iv":I
    aget-wide v19, v3, v17

    shl-long v9, v9, v18

    not-long v9, v9

    and-long v9, v19, v9

    shl-long v19, v12, v18

    or-long v9, v9, v19

    aput-wide v9, v3, v17

    .line 1531
    nop

    .line 1532
    .end local v15    # "$i$f$writeRawMetadata":I
    .end local v17    # "i$iv$iv":I
    .end local v18    # "b$iv$iv":I
    add-int/lit8 v9, v2, -0x7

    and-int/2addr v9, v11

    and-int/lit8 v10, v11, 0x7

    add-int/2addr v9, v10

    .line 1533
    nop

    .line 1535
    .local v9, "cloneIndex$iv":I
    shr-int/lit8 v10, v9, 0x3

    shr-int/lit8 v15, v2, 0x3

    aget-wide v17, v3, v15

    aput-wide v17, v3, v10

    .line 1536
    nop

    .line 755
    .end local v3    # "data$iv":[J
    .end local v9    # "cloneIndex$iv":I
    .end local v11    # "capacity$iv":I
    .end local v12    # "value$iv":J
    .end local v14    # "$i$f$writeMetadata":I
    not-int v3, v2

    return v3

    .line 741
    .end local v4    # "hash1":I
    .local v2, "m":J
    .local v18, "hash1":I
    .restart local v19    # "g":J
    :cond_7
    move/from16 v4, v18

    .end local v18    # "hash1":I
    .restart local v4    # "hash1":I
    add-int/lit8 v8, v8, 0x8

    .line 742
    add-int v9, v7, v8

    and-int v7, v9, v6

    move/from16 v2, v16

    .end local v2    # "m":J
    .end local v19    # "g":J
    goto/16 :goto_1
.end method

.method private final findKeyIndex(Ljava/lang/Object;)I
    .locals 22
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 688
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 1489
    .local v2, "$i$f$hash":I
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const v5, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v4, v5

    .line 1491
    .local v4, "hash$iv":I
    shl-int/lit8 v5, v4, 0x10

    xor-int v2, v4, v5

    .line 688
    .end local v2    # "$i$f$hash":I
    .end local v4    # "hash$iv":I
    nop

    .line 689
    .local v2, "hash":I
    const/4 v4, 0x0

    .line 1492
    .local v4, "$i$f$h2":I
    and-int/lit8 v4, v2, 0x7f

    .line 689
    .end local v4    # "$i$f$h2":I
    nop

    .line 691
    .local v4, "hash2":I
    iget v5, v0, Landroidx/collection/SieveCache;->_capacity:I

    .line 692
    .local v5, "probeMask":I
    const/4 v6, 0x0

    .line 1493
    .local v6, "$i$f$h1":I
    ushr-int/lit8 v6, v2, 0x7

    .line 692
    .end local v6    # "$i$f$h1":I
    and-int/2addr v6, v5

    .line 693
    .local v6, "probeOffset":I
    const/4 v7, 0x0

    .line 695
    .local v7, "probeIndex":I
    :goto_1
    nop

    .line 696
    iget-object v8, v0, Landroidx/collection/SieveCache;->metadata:[J

    .local v8, "metadata$iv":[J
    const/4 v9, 0x0

    .line 1494
    .local v9, "$i$f$group":I
    shr-int/lit8 v10, v6, 0x3

    .line 1495
    .local v10, "i$iv":I
    and-int/lit8 v11, v6, 0x7

    shl-int/lit8 v11, v11, 0x3

    .line 1496
    .local v11, "b$iv":I
    aget-wide v12, v8, v10

    ushr-long/2addr v12, v11

    add-int/lit8 v14, v10, 0x1

    aget-wide v14, v8, v14

    rsub-int/lit8 v16, v11, 0x40

    shl-long v14, v14, v16

    move/from16 v17, v4

    .end local v4    # "hash2":I
    .local v17, "hash2":I
    int-to-long v3, v11

    neg-long v3, v3

    const/16 v18, 0x3f

    shr-long v3, v3, v18

    and-long/2addr v3, v14

    or-long/2addr v3, v12

    .line 696
    .end local v8    # "metadata$iv":[J
    .end local v9    # "$i$f$group":I
    .end local v10    # "i$iv":I
    .end local v11    # "b$iv":I
    nop

    .line 697
    .local v3, "g":J
    move-wide v8, v3

    .local v8, "$this$match$iv":J
    const/4 v10, 0x0

    .line 1497
    .local v10, "$i$f$match":I
    move/from16 v11, v17

    .end local v17    # "hash2":I
    .local v11, "hash2":I
    int-to-long v12, v11

    const-wide v14, 0x101010101010101L

    mul-long/2addr v12, v14

    xor-long/2addr v12, v8

    .line 1499
    .local v12, "x$iv":J
    sub-long v14, v12, v14

    move/from16 v17, v2

    move-wide/from16 v18, v3

    .end local v2    # "hash":I
    .end local v3    # "g":J
    .local v17, "hash":I
    .local v18, "g":J
    not-long v2, v12

    and-long/2addr v2, v14

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v2, v14

    .line 697
    .end local v8    # "$this$match$iv":J
    .end local v10    # "$i$f$match":I
    .end local v12    # "x$iv":J
    nop

    .line 698
    .local v2, "m":J
    :goto_2
    move-wide v8, v2

    .local v8, "$this$hasNext$iv":J
    const/4 v4, 0x0

    .line 1500
    .local v4, "$i$f$hasNext":I
    const-wide/16 v12, 0x0

    cmp-long v10, v8, v12

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_3

    :cond_1
    const/4 v10, 0x0

    .end local v4    # "$i$f$hasNext":I
    .end local v8    # "$this$hasNext$iv":J
    :goto_3
    if-eqz v10, :cond_3

    .line 699
    move-wide v8, v2

    .local v8, "$this$get$iv":J
    const/4 v4, 0x0

    .line 1501
    .local v4, "$i$f$get":I
    move-wide v12, v8

    .local v12, "$this$lowestBitSet$iv$iv":J
    const/4 v10, 0x0

    .line 1502
    .local v10, "$i$f$lowestBitSet":I
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v20

    shr-int/lit8 v10, v20, 0x3

    .line 1501
    .end local v10    # "$i$f$lowestBitSet":I
    .end local v12    # "$this$lowestBitSet$iv$iv":J
    nop

    .line 699
    .end local v4    # "$i$f$get":I
    .end local v8    # "$this$get$iv":J
    add-int/2addr v10, v6

    and-int v4, v10, v5

    .line 700
    .local v4, "index":I
    iget-object v8, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    aget-object v8, v8, v4

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 701
    return v4

    .line 703
    :cond_2
    move-wide v8, v2

    .local v8, "$this$next$iv":J
    const/4 v10, 0x0

    .line 1503
    .local v10, "$i$f$next":I
    const-wide/16 v12, 0x1

    sub-long v12, v8, v12

    and-long/2addr v8, v12

    .line 703
    .end local v8    # "$this$next$iv":J
    .end local v10    # "$i$f$next":I
    move-wide v2, v8

    .end local v4    # "index":I
    goto :goto_2

    .line 706
    :cond_3
    move-wide/from16 v8, v18

    .local v8, "$this$maskEmpty$iv":J
    const/4 v4, 0x0

    .line 1504
    .local v4, "$i$f$maskEmpty":I
    move-wide/from16 v20, v12

    not-long v12, v8

    const/4 v10, 0x6

    shl-long/2addr v12, v10

    and-long/2addr v12, v8

    and-long v8, v12, v14

    .line 706
    .end local v4    # "$i$f$maskEmpty":I
    .end local v8    # "$this$maskEmpty$iv":J
    cmp-long v4, v8, v20

    if-eqz v4, :cond_4

    .line 707
    nop

    .line 714
    .end local v2    # "m":J
    .end local v18    # "g":J
    const/4 v2, -0x1

    return v2

    .line 710
    .restart local v2    # "m":J
    .restart local v18    # "g":J
    :cond_4
    add-int/lit8 v7, v7, 0x8

    .line 711
    add-int v4, v6, v7

    and-int v6, v4, v5

    move v4, v11

    move/from16 v2, v17

    .end local v2    # "m":J
    .end local v18    # "g":J
    goto/16 :goto_1
.end method

.method private final fixupNodes([I)V
    .locals 14
    .param p1, "mapping"    # [I

    .line 1011
    iget-object v0, p0, Landroidx/collection/SieveCache;->nodes:[J

    .line 1012
    .local v0, "nodes":[J
    const/4 v1, 0x0

    .local v1, "i":I
    array-length v2, v0

    :goto_0
    const v3, 0x7fffffff

    if-ge v1, v2, :cond_2

    .line 1013
    aget-wide v4, v0, v1

    .line 1014
    .local v4, "node":J
    move-wide v6, v4

    .local v6, "$this$previousNode$iv":J
    const/4 v8, 0x0

    .line 1630
    .local v8, "$i$f$getPreviousNode":I
    const/16 v9, 0x1f

    shr-long v10, v6, v9

    const-wide/32 v12, 0x7fffffff

    and-long/2addr v10, v12

    long-to-int v6, v10

    .line 1014
    .end local v6    # "$this$previousNode$iv":J
    .end local v8    # "$i$f$getPreviousNode":I
    nop

    .line 1015
    .local v6, "previous":I
    move-wide v7, v4

    .local v7, "$this$nextNode$iv":J
    const/4 v10, 0x0

    .line 1631
    .local v10, "$i$f$getNextNode":I
    and-long v11, v7, v12

    long-to-int v7, v11

    .line 1015
    .end local v7    # "$this$nextNode$iv":J
    .end local v10    # "$i$f$getNextNode":I
    nop

    .line 1016
    .local v7, "next":I
    const/4 v8, 0x0

    .line 1632
    .local v8, "$i$f$createLinks":I
    const-wide/high16 v10, -0x4000000000000000L    # -2.0

    and-long/2addr v10, v4

    .line 1633
    if-ne v6, v3, :cond_0

    move v12, v3

    goto :goto_1

    :cond_0
    aget v12, p1, v6

    :goto_1
    int-to-long v12, v12

    .line 1632
    or-long/2addr v10, v12

    .line 1634
    nop

    .line 1632
    shl-long v9, v10, v9

    .line 1635
    if-ne v7, v3, :cond_1

    goto :goto_2

    :cond_1
    aget v3, p1, v7

    :goto_2
    int-to-long v11, v3

    .line 1632
    or-long v8, v9, v11

    .end local v8    # "$i$f$createLinks":I
    aput-wide v8, v0, v1

    .line 1012
    .end local v4    # "node":J
    .end local v6    # "previous":I
    .end local v7    # "next":I
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1018
    .end local v1    # "i":I
    :cond_2
    iget v1, p0, Landroidx/collection/SieveCache;->head:I

    if-eq v1, v3, :cond_3

    iget v1, p0, Landroidx/collection/SieveCache;->head:I

    aget v1, p1, v1

    iput v1, p0, Landroidx/collection/SieveCache;->head:I

    .line 1019
    :cond_3
    iget v1, p0, Landroidx/collection/SieveCache;->tail:I

    if-eq v1, v3, :cond_4

    iget v1, p0, Landroidx/collection/SieveCache;->tail:I

    aget v1, p1, v1

    iput v1, p0, Landroidx/collection/SieveCache;->tail:I

    .line 1020
    :cond_4
    iget v1, p0, Landroidx/collection/SieveCache;->hand:I

    if-eq v1, v3, :cond_5

    iget v1, p0, Landroidx/collection/SieveCache;->hand:I

    aget v1, p1, v1

    iput v1, p0, Landroidx/collection/SieveCache;->hand:I

    .line 1021
    :cond_5
    return-void
.end method

.method private final fixupNodes([J)V
    .locals 20
    .param p1, "mapping"    # [J

    .line 998
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/collection/SieveCache;->nodes:[J

    .line 999
    .local v1, "nodes":[J
    const/4 v2, 0x0

    .local v2, "i":I
    array-length v3, v1

    :goto_0
    const v6, 0x7fffffff

    if-ge v2, v3, :cond_2

    .line 1000
    aget-wide v7, v1, v2

    .line 1001
    .local v7, "node":J
    move-wide v9, v7

    .local v9, "$this$previousNode$iv":J
    const/4 v11, 0x0

    .line 1619
    .local v11, "$i$f$getPreviousNode":I
    const/16 v12, 0x1f

    shr-long v13, v9, v12

    const-wide/32 v15, 0x7fffffff

    and-long/2addr v13, v15

    long-to-int v9, v13

    .line 1001
    .end local v9    # "$this$previousNode$iv":J
    .end local v11    # "$i$f$getPreviousNode":I
    nop

    .line 1002
    .local v9, "previous":I
    move-wide v10, v7

    .local v10, "$this$nextNode$iv":J
    const/4 v13, 0x0

    .line 1620
    .local v13, "$i$f$getNextNode":I
    and-long v14, v10, v15

    long-to-int v10, v14

    .line 1002
    .end local v10    # "$this$nextNode$iv":J
    .end local v13    # "$i$f$getNextNode":I
    nop

    .line 1003
    .local v10, "next":I
    const/4 v11, 0x0

    .line 1621
    .local v11, "$i$f$createLinks":I
    const-wide/high16 v13, -0x4000000000000000L    # -2.0

    and-long/2addr v13, v7

    .line 1622
    if-ne v9, v6, :cond_0

    move v4, v6

    const-wide v18, 0xffffffffL

    goto :goto_1

    :cond_0
    aget-wide v15, p1, v9

    .local v15, "$this$dst$iv$iv":J
    const/16 v17, 0x0

    .line 1623
    .local v17, "$i$f$getDst":I
    const-wide v18, 0xffffffffL

    and-long v4, v15, v18

    long-to-int v4, v4

    .line 1622
    .end local v15    # "$this$dst$iv$iv":J
    .end local v17    # "$i$f$getDst":I
    :goto_1
    int-to-long v4, v4

    .line 1621
    or-long/2addr v4, v13

    .line 1624
    nop

    .line 1621
    shl-long/2addr v4, v12

    .line 1625
    if-ne v10, v6, :cond_1

    goto :goto_2

    :cond_1
    aget-wide v12, p1, v10

    .local v12, "$this$dst$iv$iv":J
    const/4 v6, 0x0

    .line 1626
    .local v6, "$i$f$getDst":I
    and-long v14, v12, v18

    long-to-int v14, v14

    move v6, v14

    .line 1625
    .end local v6    # "$i$f$getDst":I
    .end local v12    # "$this$dst$iv$iv":J
    :goto_2
    int-to-long v12, v6

    .line 1621
    or-long/2addr v4, v12

    .end local v11    # "$i$f$createLinks":I
    aput-wide v4, v1, v2

    .line 999
    .end local v7    # "node":J
    .end local v9    # "previous":I
    .end local v10    # "next":I
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const-wide v18, 0xffffffffL

    .line 1005
    .end local v2    # "i":I
    iget v2, v0, Landroidx/collection/SieveCache;->head:I

    if-eq v2, v6, :cond_3

    iget v2, v0, Landroidx/collection/SieveCache;->head:I

    aget-wide v2, p1, v2

    .local v2, "$this$dst$iv":J
    const/4 v4, 0x0

    .line 1627
    .local v4, "$i$f$getDst":I
    and-long v7, v2, v18

    long-to-int v2, v7

    .line 1005
    .end local v2    # "$this$dst$iv":J
    .end local v4    # "$i$f$getDst":I
    iput v2, v0, Landroidx/collection/SieveCache;->head:I

    .line 1006
    :cond_3
    iget v2, v0, Landroidx/collection/SieveCache;->tail:I

    if-eq v2, v6, :cond_4

    iget v2, v0, Landroidx/collection/SieveCache;->tail:I

    aget-wide v2, p1, v2

    .restart local v2    # "$this$dst$iv":J
    const/4 v4, 0x0

    .line 1628
    .restart local v4    # "$i$f$getDst":I
    and-long v7, v2, v18

    long-to-int v2, v7

    .line 1006
    .end local v2    # "$this$dst$iv":J
    .end local v4    # "$i$f$getDst":I
    iput v2, v0, Landroidx/collection/SieveCache;->tail:I

    .line 1007
    :cond_4
    iget v2, v0, Landroidx/collection/SieveCache;->hand:I

    if-eq v2, v6, :cond_5

    iget v2, v0, Landroidx/collection/SieveCache;->hand:I

    aget-wide v2, p1, v2

    .restart local v2    # "$this$dst$iv":J
    const/4 v4, 0x0

    .line 1629
    .restart local v4    # "$i$f$getDst":I
    and-long v5, v2, v18

    long-to-int v2, v5

    .line 1007
    .end local v2    # "$this$dst$iv":J
    .end local v4    # "$i$f$getDst":I
    iput v2, v0, Landroidx/collection/SieveCache;->hand:I

    .line 1008
    :cond_5
    return-void
.end method

.method public static synthetic getCount$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getKeys$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getValues$annotations()V
    .locals 0

    return-void
.end method

.method private final initializeGrowth()V
    .locals 2

    .line 218
    iget v0, p0, Landroidx/collection/SieveCache;->_capacity:I

    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->loadedCapacity(I)I

    move-result v0

    invoke-virtual {p0}, Landroidx/collection/SieveCache;->getCount()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/collection/SieveCache;->growthLimit:I

    .line 219
    return-void
.end method

.method private final initializeMetadata(I)V
    .locals 14
    .param p1, "capacity"    # I

    .line 203
    nop

    .line 204
    if-nez p1, :cond_0

    .line 205
    sget-object v0, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    goto :goto_0

    .line 208
    :cond_0
    add-int/lit8 v0, p1, 0x1

    add-int/lit8 v0, v0, 0x7

    add-int/lit8 v0, v0, 0x7

    and-int/lit8 v0, v0, -0x8

    shr-int/lit8 v0, v0, 0x3

    .line 209
    .local v0, "size":I
    new-array v1, v0, [J

    move-object v2, v1

    .local v2, "$this$initializeMetadata_u24lambda_u242":[J
    const/4 v9, 0x0

    .line 210
    .local v9, "$i$a$-apply-SieveCache$initializeMetadata$1":I
    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide v3, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lkotlin/collections/ArraysKt;->fill$default([JJIIILjava/lang/Object;)V

    .line 211
    const-wide/16 v3, 0xff

    .local v3, "value$iv":J
    const/4 v5, 0x0

    .line 1155
    .local v5, "$i$f$writeRawMetadata":I
    shr-int/lit8 v6, p1, 0x3

    .line 1156
    .local v6, "i$iv":I
    and-int/lit8 v7, p1, 0x7

    shl-int/lit8 v7, v7, 0x3

    .line 1159
    .local v7, "b$iv":I
    aget-wide v10, v2, v6

    const-wide/16 v12, 0xff

    shl-long/2addr v12, v7

    not-long v12, v12

    and-long/2addr v10, v12

    shl-long v12, v3, v7

    or-long/2addr v10, v12

    aput-wide v10, v2, v6

    .line 1160
    nop

    .line 212
    .end local v3    # "value$iv":J
    .end local v5    # "$i$f$writeRawMetadata":I
    .end local v6    # "i$iv":I
    .end local v7    # "b$iv":I
    nop

    .line 209
    .end local v2    # "$this$initializeMetadata_u24lambda_u242":[J
    .end local v9    # "$i$a$-apply-SieveCache$initializeMetadata$1":I
    move-object v0, v1

    .line 203
    .end local v0    # "size":I
    :goto_0
    iput-object v0, p0, Landroidx/collection/SieveCache;->metadata:[J

    .line 214
    invoke-direct {p0}, Landroidx/collection/SieveCache;->initializeGrowth()V

    .line 215
    return-void
.end method

.method private final initializeStorage(I)V
    .locals 10
    .param p1, "initialCapacity"    # I

    .line 187
    if-lez p1, :cond_0

    .line 190
    const/4 v0, 0x7

    invoke-static {p1}, Landroidx/collection/ScatterMapKt;->normalizeCapacity(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    .line 192
    :cond_0
    const/4 v0, 0x0

    .line 187
    :goto_0
    nop

    .line 186
    nop

    .line 194
    .local v0, "newCapacity":I
    iput v0, p0, Landroidx/collection/SieveCache;->_capacity:I

    .line 195
    invoke-direct {p0, v0}, Landroidx/collection/SieveCache;->initializeMetadata(I)V

    .line 196
    if-nez v0, :cond_1

    sget-object v1, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-array v1, v0, [Ljava/lang/Object;

    :goto_1
    iput-object v1, p0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 197
    if-nez v0, :cond_2

    sget-object v1, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    goto :goto_2

    :cond_2
    new-array v1, v0, [Ljava/lang/Object;

    :goto_2
    iput-object v1, p0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 198
    nop

    .line 199
    if-nez v0, :cond_3

    invoke-static {}, Landroidx/collection/SieveCacheKt;->getEmptyNodes()[J

    move-result-object v1

    goto :goto_3

    :cond_3
    new-array v1, v0, [J

    .line 1154
    move-object v2, v1

    .local v2, "$this$initializeStorage_u24lambda_u241":[J
    const/4 v9, 0x0

    .line 199
    .local v9, "$i$a$-apply-SieveCache$initializeStorage$1":I
    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lkotlin/collections/ArraysKt;->fill$default([JJIIILjava/lang/Object;)V

    .line 198
    .end local v2    # "$this$initializeStorage_u24lambda_u241":[J
    .end local v9    # "$i$a$-apply-SieveCache$initializeStorage$1":I
    :goto_3
    iput-object v1, p0, Landroidx/collection/SieveCache;->nodes:[J

    .line 200
    return-void
.end method

.method private final markNodeVisited(I)V
    .locals 7
    .param p1, "index"    # I

    const/4 v0, 0x0

    .line 684
    .local v0, "$i$f$markNodeVisited":I
    iget-object v1, p0, Landroidx/collection/SieveCache;->nodes:[J

    iget-object v2, p0, Landroidx/collection/SieveCache;->nodes:[J

    aget-wide v3, v2, p1

    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    and-long v2, v3, v5

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    or-long/2addr v2, v4

    aput-wide v2, v1, p1

    .line 685
    return-void
.end method

.method private final moveNodeToHead(I)V
    .locals 14
    .param p1, "index"    # I

    const/4 v0, 0x0

    .line 633
    .local v0, "$i$f$moveNodeToHead":I
    iget-object v1, p0, Landroidx/collection/SieveCache;->nodes:[J

    iget v2, p0, Landroidx/collection/SieveCache;->head:I

    .local v2, "next$iv":I
    const/4 v3, 0x0

    .line 1448
    .local v3, "$i$f$createLinkToNext":I
    int-to-long v4, v2

    const-wide/32 v6, 0x7fffffff

    and-long/2addr v4, v6

    const-wide v8, 0x3fffffff80000000L    # 1.9999995231628418

    or-long v2, v4, v8

    .end local v2    # "next$iv":I
    .end local v3    # "$i$f$createLinkToNext":I
    aput-wide v2, v1, p1

    .line 635
    iget v1, p0, Landroidx/collection/SieveCache;->head:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_0

    .line 636
    iget-object v1, p0, Landroidx/collection/SieveCache;->nodes:[J

    iget v3, p0, Landroidx/collection/SieveCache;->head:I

    iget-object v4, p0, Landroidx/collection/SieveCache;->nodes:[J

    iget v5, p0, Landroidx/collection/SieveCache;->head:I

    aget-wide v8, v4, v5

    .local v8, "node$iv":J
    const/4 v4, 0x0

    .line 1449
    .local v4, "$i$f$setLinkToPrevious":I
    const-wide v10, -0x3fffffff80000001L    # -2.000000953674316

    and-long/2addr v10, v8

    int-to-long v12, p1

    and-long v5, v12, v6

    const/16 v7, 0x1f

    shl-long/2addr v5, v7

    or-long v4, v10, v5

    .end local v4    # "$i$f$setLinkToPrevious":I
    .end local v8    # "node$iv":J
    aput-wide v4, v1, v3

    .line 638
    :cond_0
    iput p1, p0, Landroidx/collection/SieveCache;->head:I

    .line 640
    iget v1, p0, Landroidx/collection/SieveCache;->tail:I

    if-ne v1, v2, :cond_1

    .line 641
    iput p1, p0, Landroidx/collection/SieveCache;->tail:I

    .line 643
    :cond_1
    return-void
.end method

.method private final removeNode(I)V
    .locals 20
    .param p1, "index"    # I

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    .line 660
    .local v2, "$i$f$removeNode":I
    iget-object v3, v0, Landroidx/collection/SieveCache;->nodes:[J

    .line 661
    .local v3, "nodes":[J
    aget-wide v4, v3, v1

    .line 662
    .local v4, "node":J
    move-wide v6, v4

    .local v6, "$this$previousNode$iv":J
    const/4 v8, 0x0

    .line 1485
    .local v8, "$i$f$getPreviousNode":I
    const/16 v9, 0x1f

    shr-long v10, v6, v9

    const-wide/32 v12, 0x7fffffff

    and-long/2addr v10, v12

    long-to-int v6, v10

    .line 662
    .end local v6    # "$this$previousNode$iv":J
    .end local v8    # "$i$f$getPreviousNode":I
    nop

    .line 663
    .local v6, "previousIndex":I
    move-wide v7, v4

    .local v7, "$this$nextNode$iv":J
    const/4 v10, 0x0

    .line 1486
    .local v10, "$i$f$getNextNode":I
    and-long v14, v7, v12

    long-to-int v7, v14

    .line 663
    .end local v7    # "$this$nextNode$iv":J
    .end local v10    # "$i$f$getNextNode":I
    nop

    .line 665
    .local v7, "nextIndex":I
    const v8, 0x7fffffff

    if-eq v6, v8, :cond_0

    .line 666
    aget-wide v10, v3, v6

    .local v10, "node$iv":J
    const/4 v14, 0x0

    .line 1487
    .local v14, "$i$f$setLinkToNext":I
    const-wide/32 v15, -0x80000000

    and-long/2addr v15, v10

    move/from16 v17, v9

    move-wide/from16 v18, v10

    .end local v10    # "node$iv":J
    .local v18, "node$iv":J
    int-to-long v9, v7

    and-long/2addr v9, v12

    or-long/2addr v9, v15

    .end local v14    # "$i$f$setLinkToNext":I
    .end local v18    # "node$iv":J
    aput-wide v9, v3, v6

    goto :goto_0

    .line 668
    :cond_0
    move/from16 v17, v9

    iput v7, v0, Landroidx/collection/SieveCache;->head:I

    .line 671
    :goto_0
    if-eq v7, v8, :cond_1

    .line 672
    aget-wide v8, v3, v7

    .local v8, "node$iv":J
    const/4 v10, 0x0

    .line 1488
    .local v10, "$i$f$setLinkToPrevious":I
    const-wide v14, -0x3fffffff80000001L    # -2.000000953674316

    and-long/2addr v14, v8

    move-wide/from16 v18, v12

    int-to-long v12, v6

    and-long v11, v12, v18

    shl-long v11, v11, v17

    or-long v8, v14, v11

    .end local v8    # "node$iv":J
    .end local v10    # "$i$f$setLinkToPrevious":I
    aput-wide v8, v3, v7

    goto :goto_1

    .line 674
    :cond_1
    iput v6, v0, Landroidx/collection/SieveCache;->tail:I

    .line 677
    :goto_1
    iget v8, v0, Landroidx/collection/SieveCache;->hand:I

    if-ne v8, v1, :cond_2

    .line 678
    iput v6, v0, Landroidx/collection/SieveCache;->hand:I

    .line 680
    :cond_2
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    aput-wide v8, v3, v1

    .line 681
    return-void
.end method

.method private final removeValueAt(I)Ljava/lang/Object;
    .locals 21
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 646
    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v2, v0, Landroidx/collection/SieveCache;->_count:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Landroidx/collection/SieveCache;->_count:I

    .line 648
    iget-object v2, v0, Landroidx/collection/SieveCache;->metadata:[J

    .local v2, "data$iv":[J
    iget v3, v0, Landroidx/collection/SieveCache;->_capacity:I

    .local v3, "capacity$iv":I
    const-wide/16 v4, 0xfe

    .local v4, "value$iv":J
    const/4 v6, 0x0

    .line 1450
    .local v6, "$i$f$writeMetadata":I
    const/4 v7, 0x0

    .line 1451
    .local v7, "$i$f$writeRawMetadata":I
    shr-int/lit8 v8, v1, 0x3

    .line 1452
    .local v8, "i$iv$iv":I
    and-int/lit8 v9, v1, 0x7

    shl-int/lit8 v9, v9, 0x3

    .line 1455
    .local v9, "b$iv$iv":I
    aget-wide v10, v2, v8

    const-wide/16 v12, 0xff

    shl-long/2addr v12, v9

    not-long v12, v12

    and-long/2addr v10, v12

    shl-long v12, v4, v9

    or-long/2addr v10, v12

    aput-wide v10, v2, v8

    .line 1456
    nop

    .line 1457
    .end local v7    # "$i$f$writeRawMetadata":I
    .end local v8    # "i$iv$iv":I
    .end local v9    # "b$iv$iv":I
    add-int/lit8 v7, v1, -0x7

    and-int/2addr v7, v3

    and-int/lit8 v8, v3, 0x7

    add-int/2addr v7, v8

    .line 1458
    nop

    .line 1460
    .local v7, "cloneIndex$iv":I
    shr-int/lit8 v8, v7, 0x3

    shr-int/lit8 v9, v1, 0x3

    aget-wide v9, v2, v9

    aput-wide v9, v2, v8

    .line 1461
    nop

    .line 650
    .end local v2    # "data$iv":[J
    .end local v3    # "capacity$iv":I
    .end local v4    # "value$iv":J
    .end local v6    # "$i$f$writeMetadata":I
    .end local v7    # "cloneIndex$iv":I
    iget-object v2, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    .line 651
    iget-object v2, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aget-object v2, v2, v1

    .line 652
    .local v2, "previousValue":Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aput-object v3, v4, v1

    .line 654
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v4, 0x0

    .line 1462
    .local v4, "$i$f$removeNode":I
    iget-object v5, v3, Landroidx/collection/SieveCache;->nodes:[J

    .line 1463
    .local v5, "nodes$iv":[J
    aget-wide v6, v5, v1

    .line 1464
    .local v6, "node$iv":J
    move-wide v8, v6

    .local v8, "$this$previousNode$iv$iv":J
    const/4 v10, 0x0

    .line 1465
    .local v10, "$i$f$getPreviousNode":I
    const/16 v11, 0x1f

    shr-long v12, v8, v11

    const-wide/32 v14, 0x7fffffff

    and-long/2addr v12, v14

    long-to-int v8, v12

    .line 1464
    .end local v8    # "$this$previousNode$iv$iv":J
    .end local v10    # "$i$f$getPreviousNode":I
    nop

    .line 1466
    .local v8, "previousIndex$iv":I
    move-wide v9, v6

    .local v9, "$this$nextNode$iv$iv":J
    const/4 v12, 0x0

    .line 1467
    .local v12, "$i$f$getNextNode":I
    move v13, v11

    move/from16 v16, v12

    .end local v12    # "$i$f$getNextNode":I
    .local v16, "$i$f$getNextNode":I
    and-long v11, v9, v14

    long-to-int v9, v11

    .line 1466
    .end local v9    # "$this$nextNode$iv$iv":J
    .end local v16    # "$i$f$getNextNode":I
    nop

    .line 1468
    .local v9, "nextIndex$iv":I
    const v10, 0x7fffffff

    if-eq v8, v10, :cond_0

    .line 1469
    aget-wide v11, v5, v8

    .local v11, "node$iv$iv":J
    const/16 v16, 0x0

    .line 1470
    .local v16, "$i$f$setLinkToNext":I
    const-wide/32 v17, -0x80000000

    and-long v17, v11, v17

    move-wide/from16 v19, v14

    move v15, v13

    int-to-long v13, v9

    and-long v13, v13, v19

    or-long v11, v17, v13

    .end local v11    # "node$iv$iv":J
    .end local v16    # "$i$f$setLinkToNext":I
    aput-wide v11, v5, v8

    goto :goto_0

    .line 1471
    :cond_0
    move-wide/from16 v19, v14

    move v15, v13

    iput v9, v3, Landroidx/collection/SieveCache;->head:I

    .line 1474
    :goto_0
    if-eq v9, v10, :cond_1

    .line 1475
    aget-wide v10, v5, v9

    .local v10, "node$iv$iv":J
    const/4 v12, 0x0

    .line 1476
    .local v12, "$i$f$setLinkToPrevious":I
    const-wide v13, -0x3fffffff80000001L    # -2.000000953674316

    and-long/2addr v13, v10

    move/from16 v16, v4

    move-object/from16 v17, v5

    .end local v4    # "$i$f$removeNode":I
    .end local v5    # "nodes$iv":[J
    .local v16, "$i$f$removeNode":I
    .local v17, "nodes$iv":[J
    int-to-long v4, v8

    and-long v4, v4, v19

    shl-long/2addr v4, v15

    or-long/2addr v4, v13

    .end local v10    # "node$iv$iv":J
    .end local v12    # "$i$f$setLinkToPrevious":I
    aput-wide v4, v17, v9

    goto :goto_1

    .line 1477
    .end local v16    # "$i$f$removeNode":I
    .end local v17    # "nodes$iv":[J
    .restart local v4    # "$i$f$removeNode":I
    .restart local v5    # "nodes$iv":[J
    :cond_1
    move/from16 v16, v4

    move-object/from16 v17, v5

    .end local v4    # "$i$f$removeNode":I
    .end local v5    # "nodes$iv":[J
    .restart local v16    # "$i$f$removeNode":I
    .restart local v17    # "nodes$iv":[J
    iput v8, v3, Landroidx/collection/SieveCache;->tail:I

    .line 1480
    :goto_1
    iget v4, v3, Landroidx/collection/SieveCache;->hand:I

    if-ne v4, v1, :cond_2

    .line 1481
    iput v8, v3, Landroidx/collection/SieveCache;->hand:I

    .line 1483
    :cond_2
    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    aput-wide v4, v17, v1

    .line 1484
    nop

    .line 656
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v6    # "node$iv":J
    .end local v8    # "previousIndex$iv":I
    .end local v9    # "nextIndex$iv":I
    .end local v16    # "$i$f$removeNode":I
    .end local v17    # "nodes$iv":[J
    return-object v2
.end method


# virtual methods
.method public final adjustStorage$collection()V
    .locals 6

    .line 776
    iget v0, p0, Landroidx/collection/SieveCache;->_capacity:I

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/collection/SieveCache;->getCount()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    const-wide/16 v2, 0x20

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    iget v2, p0, Landroidx/collection/SieveCache;->_capacity:I

    int-to-long v2, v2

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v2

    const-wide/16 v4, 0x19

    mul-long/2addr v2, v4

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gtz v0, :cond_0

    .line 777
    invoke-virtual {p0}, Landroidx/collection/SieveCache;->dropDeletes$collection()V

    goto :goto_0

    .line 779
    :cond_0
    iget v0, p0, Landroidx/collection/SieveCache;->_capacity:I

    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->nextCapacity(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/collection/SieveCache;->resizeStorage$collection(I)V

    .line 781
    :goto_0
    return-void
.end method

.method public final all(Lkotlin/jvm/functions/Function2;)Z
    .locals 25
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string/jumbo v1, "predicate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 580
    .local v1, "$i$f$all":I
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v3, 0x0

    .line 1349
    .local v3, "$i$f$forEach":I
    iget-object v4, v2, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 1350
    .local v4, "k$iv":[Ljava/lang/Object;
    iget-object v5, v2, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 1352
    .local v5, "v$iv":[Ljava/lang/Object;
    move-object v6, v2

    .local v6, "this_$iv$iv":Landroidx/collection/SieveCache;
    const/4 v7, 0x0

    .line 1353
    .local v7, "$i$f$forEachIndexed":I
    iget-object v8, v6, Landroidx/collection/SieveCache;->metadata:[J

    .line 1354
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 1356
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_5

    .line 1357
    :goto_0
    aget-wide v12, v8, v10

    .line 1358
    .local v12, "slot$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1359
    .local v16, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v18, v12

    const/16 v17, 0x1

    .end local v12    # "slot$iv$iv":J
    .local v18, "slot$iv$iv":J
    not-long v11, v14

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v14

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v11, v20

    .line 1358
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v20

    if-eqz v11, :cond_4

    .line 1360
    sub-int v11, v10, v9

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1361
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_3

    .line 1362
    const-wide/16 v14, 0xff

    and-long v14, v18, v14

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1363
    .local v16, "$i$f$isFull":I
    const-wide/16 v20, 0x80

    cmp-long v20, v14, v20

    const/16 v21, 0x0

    if-gez v20, :cond_0

    move/from16 v14, v17

    goto :goto_2

    :cond_0
    move/from16 v14, v21

    .line 1362
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v14, :cond_2

    .line 1364
    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    .line 1365
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 1352
    .local v16, "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    move/from16 v20, v12

    aget-object v12, v4, v15

    move/from16 v22, v1

    .end local v1    # "$i$f$all":I
    .local v22, "$i$f$all":I
    const-string/jumbo v1, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v1, v5, v15

    move-object/from16 v23, v2

    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .local v23, "this_$iv":Landroidx/collection/SieveCache;
    const-string/jumbo v2, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .local v1, "value":Ljava/lang/Object;
    .local v12, "key":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 580
    .local v2, "$i$a$-forEach-SieveCache$all$1":I
    invoke-interface {v0, v12, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/Boolean;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    if-nez v24, :cond_1

    return v21

    .line 1352
    .end local v1    # "value":Ljava/lang/Object;
    .end local v2    # "$i$a$-forEach-SieveCache$all$1":I
    .end local v12    # "key":Ljava/lang/Object;
    :cond_1
    nop

    .line 1365
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    goto :goto_3

    .line 1362
    .end local v14    # "index$iv$iv":I
    .end local v22    # "$i$f$all":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .local v1, "$i$f$all":I
    .local v2, "this_$iv":Landroidx/collection/SieveCache;
    :cond_2
    move/from16 v22, v1

    move-object/from16 v23, v2

    move/from16 v20, v12

    .line 1367
    .end local v1    # "$i$f$all":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v22    # "$i$f$all":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_3
    shr-long v18, v18, v20

    .line 1361
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v20

    move/from16 v1, v22

    move-object/from16 v2, v23

    goto :goto_1

    .end local v22    # "$i$f$all":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v1    # "$i$f$all":I
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_3
    move/from16 v22, v1

    move-object/from16 v23, v2

    move/from16 v20, v12

    .line 1369
    .end local v1    # "$i$f$all":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v13    # "j$iv$iv":I
    .restart local v22    # "$i$f$all":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    move/from16 v1, v20

    if-ne v11, v1, :cond_7

    goto :goto_4

    .line 1358
    .end local v11    # "bitCount$iv$iv":I
    .end local v22    # "$i$f$all":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v1    # "$i$f$all":I
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_4
    move/from16 v22, v1

    move-object/from16 v23, v2

    .line 1356
    .end local v1    # "$i$f$all":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v18    # "slot$iv$iv":J
    .restart local v22    # "$i$f$all":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_4
    if-eq v10, v9, :cond_6

    add-int/lit8 v10, v10, 0x1

    move/from16 v1, v22

    move-object/from16 v2, v23

    goto/16 :goto_0

    .end local v22    # "$i$f$all":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v1    # "$i$f$all":I
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_5
    move/from16 v22, v1

    move-object/from16 v23, v2

    const/16 v17, 0x1

    .line 1372
    .end local v1    # "$i$f$all":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v10    # "i$iv$iv":I
    .restart local v22    # "$i$f$all":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_6
    nop

    .line 1373
    .end local v6    # "this_$iv$iv":Landroidx/collection/SieveCache;
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 581
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "k$iv":[Ljava/lang/Object;
    .end local v5    # "v$iv":[Ljava/lang/Object;
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    return v17
.end method

.method public final any()Z
    .locals 1

    .line 174
    iget v0, p0, Landroidx/collection/SieveCache;->_count:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final any(Lkotlin/jvm/functions/Function2;)Z
    .locals 25
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string/jumbo v1, "predicate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 586
    .local v1, "$i$f$any":I
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v3, 0x0

    .line 1374
    .local v3, "$i$f$forEach":I
    iget-object v4, v2, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 1375
    .local v4, "k$iv":[Ljava/lang/Object;
    iget-object v5, v2, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 1377
    .local v5, "v$iv":[Ljava/lang/Object;
    move-object v6, v2

    .local v6, "this_$iv$iv":Landroidx/collection/SieveCache;
    const/4 v7, 0x0

    .line 1378
    .local v7, "$i$f$forEachIndexed":I
    iget-object v8, v6, Landroidx/collection/SieveCache;->metadata:[J

    .line 1379
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 1381
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_5

    .line 1382
    :goto_0
    aget-wide v12, v8, v10

    .line 1383
    .local v12, "slot$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1384
    .local v16, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v18, v12

    const/16 v17, 0x0

    .end local v12    # "slot$iv$iv":J
    .local v18, "slot$iv$iv":J
    not-long v11, v14

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v14

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v11, v20

    .line 1383
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v20

    if-eqz v11, :cond_4

    .line 1385
    sub-int v11, v10, v9

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1386
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_3

    .line 1387
    const-wide/16 v14, 0xff

    and-long v14, v18, v14

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1388
    .local v16, "$i$f$isFull":I
    const-wide/16 v20, 0x80

    cmp-long v20, v14, v20

    const/16 v21, 0x1

    if-gez v20, :cond_0

    move/from16 v14, v21

    goto :goto_2

    :cond_0
    move/from16 v14, v17

    .line 1387
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v14, :cond_2

    .line 1389
    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    .line 1390
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 1377
    .local v16, "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    move/from16 v20, v12

    aget-object v12, v4, v15

    move/from16 v22, v1

    .end local v1    # "$i$f$any":I
    .local v22, "$i$f$any":I
    const-string/jumbo v1, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v1, v5, v15

    move-object/from16 v23, v2

    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .local v23, "this_$iv":Landroidx/collection/SieveCache;
    const-string/jumbo v2, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .local v1, "value":Ljava/lang/Object;
    .local v12, "key":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 586
    .local v2, "$i$a$-forEach-SieveCache$any$1":I
    invoke-interface {v0, v12, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/Boolean;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    if-eqz v24, :cond_1

    return v21

    .line 1377
    .end local v1    # "value":Ljava/lang/Object;
    .end local v2    # "$i$a$-forEach-SieveCache$any$1":I
    .end local v12    # "key":Ljava/lang/Object;
    :cond_1
    nop

    .line 1390
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    goto :goto_3

    .line 1387
    .end local v14    # "index$iv$iv":I
    .end local v22    # "$i$f$any":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .local v1, "$i$f$any":I
    .local v2, "this_$iv":Landroidx/collection/SieveCache;
    :cond_2
    move/from16 v22, v1

    move-object/from16 v23, v2

    move/from16 v20, v12

    .line 1392
    .end local v1    # "$i$f$any":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v22    # "$i$f$any":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_3
    shr-long v18, v18, v20

    .line 1386
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v20

    move/from16 v1, v22

    move-object/from16 v2, v23

    goto :goto_1

    .end local v22    # "$i$f$any":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v1    # "$i$f$any":I
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_3
    move/from16 v22, v1

    move-object/from16 v23, v2

    move/from16 v20, v12

    .line 1394
    .end local v1    # "$i$f$any":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v13    # "j$iv$iv":I
    .restart local v22    # "$i$f$any":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    move/from16 v1, v20

    if-ne v11, v1, :cond_7

    goto :goto_4

    .line 1383
    .end local v11    # "bitCount$iv$iv":I
    .end local v22    # "$i$f$any":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v1    # "$i$f$any":I
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_4
    move/from16 v22, v1

    move-object/from16 v23, v2

    .line 1381
    .end local v1    # "$i$f$any":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v18    # "slot$iv$iv":J
    .restart local v22    # "$i$f$any":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_4
    if-eq v10, v9, :cond_6

    add-int/lit8 v10, v10, 0x1

    move/from16 v1, v22

    move-object/from16 v2, v23

    goto/16 :goto_0

    .end local v22    # "$i$f$any":I
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v1    # "$i$f$any":I
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_5
    move/from16 v22, v1

    move-object/from16 v23, v2

    const/16 v17, 0x0

    .line 1397
    .end local v1    # "$i$f$any":I
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v10    # "i$iv$iv":I
    .restart local v22    # "$i$f$any":I
    .restart local v23    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_6
    nop

    .line 1398
    .end local v6    # "this_$iv$iv":Landroidx/collection/SieveCache;
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 587
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "k$iv":[Ljava/lang/Object;
    .end local v5    # "v$iv":[Ljava/lang/Object;
    .end local v23    # "this_$iv":Landroidx/collection/SieveCache;
    return v17
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    invoke-direct {p0, p1}, Landroidx/collection/SieveCache;->findKeyIndex(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 604
    invoke-direct {p0, p1}, Landroidx/collection/SieveCache;->findKeyIndex(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 20
    .param p1, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string/jumbo v1, "value"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 608
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 609
    .local v2, "v":[Ljava/lang/Object;
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v4, 0x0

    .line 1424
    .local v4, "$i$f$forEachIndexed":I
    iget-object v5, v3, Landroidx/collection/SieveCache;->metadata:[J

    .line 1425
    .local v5, "m$iv":[J
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    .line 1427
    .local v6, "lastIndex$iv":I
    const/4 v7, 0x0

    .local v7, "i$iv":I
    if-gt v7, v6, :cond_5

    .line 1428
    :goto_0
    aget-wide v9, v5, v7

    .line 1429
    .local v9, "slot$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v13, 0x0

    .line 1430
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 1429
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_4

    .line 1431
    sub-int v11, v7, v6

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1432
    .local v11, "bitCount$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv":I
    :goto_1
    if-ge v13, v11, :cond_3

    .line 1433
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv":J
    const/16 v16, 0x0

    .line 1434
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    const/16 v18, 0x1

    if-gez v17, :cond_0

    move/from16 v14, v18

    goto :goto_2

    :cond_0
    const/4 v14, 0x0

    .line 1433
    .end local v14    # "value$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v14, :cond_2

    .line 1435
    shl-int/lit8 v14, v7, 0x3

    add-int/2addr v14, v13

    .line 1436
    .local v14, "index$iv":I
    move v15, v14

    .local v15, "index":I
    const/16 v16, 0x0

    .line 610
    .local v16, "$i$a$-forEachIndexed-SieveCache$containsValue$1":I
    const/16 v17, 0x0

    aget-object v8, v2, v15

    move/from16 v19, v12

    const-string/jumbo v12, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    return v18

    .line 611
    :cond_1
    nop

    .line 1436
    .end local v15    # "index":I
    .end local v16    # "$i$a$-forEachIndexed-SieveCache$containsValue$1":I
    goto :goto_3

    .line 1433
    .end local v14    # "index$iv":I
    :cond_2
    move/from16 v19, v12

    const/16 v17, 0x0

    .line 1438
    :goto_3
    shr-long v9, v9, v19

    .line 1432
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v19

    goto :goto_1

    :cond_3
    move/from16 v19, v12

    const/16 v17, 0x0

    .line 1440
    .end local v13    # "j$iv":I
    move/from16 v8, v19

    if-ne v11, v8, :cond_7

    goto :goto_4

    .line 1429
    .end local v11    # "bitCount$iv":I
    :cond_4
    const/16 v17, 0x0

    .line 1427
    .end local v9    # "slot$iv":J
    :goto_4
    if-eq v7, v6, :cond_6

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    const/16 v17, 0x0

    .line 1443
    .end local v7    # "i$iv":I
    :cond_6
    nop

    .line 612
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "m$iv":[J
    .end local v6    # "lastIndex$iv":I
    :cond_7
    return v17
.end method

.method public final count()I
    .locals 1

    .line 591
    invoke-virtual {p0}, Landroidx/collection/SieveCache;->getSize()I

    move-result v0

    return v0
.end method

.method public final count(Lkotlin/jvm/functions/Function2;)I
    .locals 24
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;",
            "Ljava/lang/Boolean;",
            ">;)I"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string/jumbo v1, "predicate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 595
    .local v1, "$i$f$count":I
    const/4 v2, 0x0

    .line 596
    .local v2, "count":I
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v4, 0x0

    .line 1399
    .local v4, "$i$f$forEach":I
    iget-object v5, v3, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 1400
    .local v5, "k$iv":[Ljava/lang/Object;
    iget-object v6, v3, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 1402
    .local v6, "v$iv":[Ljava/lang/Object;
    move-object v7, v3

    .local v7, "this_$iv$iv":Landroidx/collection/SieveCache;
    const/4 v8, 0x0

    .line 1403
    .local v8, "$i$f$forEachIndexed":I
    iget-object v9, v7, Landroidx/collection/SieveCache;->metadata:[J

    .line 1404
    .local v9, "m$iv$iv":[J
    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    .line 1406
    .local v10, "lastIndex$iv$iv":I
    const/4 v11, 0x0

    .local v11, "i$iv$iv":I
    if-gt v11, v10, :cond_5

    .line 1407
    :goto_0
    aget-wide v12, v9, v11

    .line 1408
    .local v12, "slot$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1409
    .local v16, "$i$f$maskEmptyOrDeleted":I
    move/from16 v17, v1

    move/from16 v18, v2

    .end local v1    # "$i$f$count":I
    .end local v2    # "count":I
    .local v17, "$i$f$count":I
    .local v18, "count":I
    not-long v1, v14

    const/16 v19, 0x7

    shl-long v1, v1, v19

    and-long/2addr v1, v14

    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v1, v1, v19

    .line 1408
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v19

    if-eqz v1, :cond_4

    .line 1410
    sub-int v1, v11, v10

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v2, 0x8

    rsub-int/lit8 v1, v1, 0x8

    .line 1411
    .local v1, "bitCount$iv$iv":I
    const/4 v14, 0x0

    .local v14, "j$iv$iv":I
    :goto_1
    if-ge v14, v1, :cond_3

    .line 1412
    const-wide/16 v15, 0xff

    and-long/2addr v15, v12

    .local v15, "value$iv$iv$iv":J
    const/16 v19, 0x0

    .line 1413
    .local v19, "$i$f$isFull":I
    const-wide/16 v20, 0x80

    cmp-long v20, v15, v20

    if-gez v20, :cond_0

    const/16 v20, 0x1

    goto :goto_2

    :cond_0
    const/16 v20, 0x0

    .line 1412
    .end local v15    # "value$iv$iv$iv":J
    .end local v19    # "$i$f$isFull":I
    :goto_2
    if-eqz v20, :cond_2

    .line 1414
    shl-int/lit8 v15, v11, 0x3

    add-int/2addr v15, v14

    .line 1415
    .local v15, "index$iv$iv":I
    move/from16 v16, v15

    .local v16, "index$iv":I
    const/16 v19, 0x0

    .line 1402
    .local v19, "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    move/from16 v20, v2

    aget-object v2, v5, v16

    move-object/from16 v21, v3

    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .local v21, "this_$iv":Landroidx/collection/SieveCache;
    const-string/jumbo v3, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v3, v6, v16

    move-object/from16 v22, v2

    const-string/jumbo v2, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .local v3, "value":Ljava/lang/Object;
    .local v22, "key":Ljava/lang/Object;
    move-object/from16 v2, v22

    .end local v22    # "key":Ljava/lang/Object;
    .local v2, "key":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 596
    .local v22, "$i$a$-forEach-SieveCache$count$1":I
    invoke-interface {v0, v2, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ljava/lang/Boolean;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    if-eqz v23, :cond_1

    add-int/lit8 v18, v18, 0x1

    .line 1402
    .end local v2    # "key":Ljava/lang/Object;
    .end local v3    # "value":Ljava/lang/Object;
    .end local v22    # "$i$a$-forEach-SieveCache$count$1":I
    :cond_1
    nop

    .line 1415
    .end local v16    # "index$iv":I
    .end local v19    # "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    goto :goto_3

    .line 1412
    .end local v15    # "index$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/SieveCache;
    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    :cond_2
    move/from16 v20, v2

    move-object/from16 v21, v3

    .line 1417
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v21    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_3
    shr-long v12, v12, v20

    .line 1411
    add-int/lit8 v14, v14, 0x1

    move/from16 v2, v20

    move-object/from16 v3, v21

    goto :goto_1

    .end local v21    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v3    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_3
    move/from16 v20, v2

    move-object/from16 v21, v3

    .line 1419
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v14    # "j$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/SieveCache;
    if-ne v1, v2, :cond_7

    move/from16 v2, v18

    goto :goto_4

    .line 1408
    .end local v1    # "bitCount$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v3    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_4
    move-object/from16 v21, v3

    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v21    # "this_$iv":Landroidx/collection/SieveCache;
    move/from16 v2, v18

    .line 1406
    .end local v12    # "slot$iv$iv":J
    .end local v18    # "count":I
    .local v2, "count":I
    :goto_4
    if-eq v11, v10, :cond_6

    add-int/lit8 v11, v11, 0x1

    move/from16 v1, v17

    move-object/from16 v3, v21

    goto/16 :goto_0

    .end local v17    # "$i$f$count":I
    .end local v21    # "this_$iv":Landroidx/collection/SieveCache;
    .local v1, "$i$f$count":I
    .restart local v3    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_5
    move/from16 v17, v1

    move-object/from16 v21, v3

    .line 1422
    .end local v1    # "$i$f$count":I
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v11    # "i$iv$iv":I
    .restart local v17    # "$i$f$count":I
    .restart local v21    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_6
    move/from16 v18, v2

    .line 1423
    .end local v2    # "count":I
    .end local v7    # "this_$iv$iv":Landroidx/collection/SieveCache;
    .end local v8    # "$i$f$forEachIndexed":I
    .end local v9    # "m$iv$iv":[J
    .end local v10    # "lastIndex$iv$iv":I
    .restart local v18    # "count":I
    :cond_7
    nop

    .line 597
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv":[Ljava/lang/Object;
    .end local v6    # "v$iv":[Ljava/lang/Object;
    .end local v21    # "this_$iv":Landroidx/collection/SieveCache;
    return v18
.end method

.method public final dropDeletes$collection()V
    .locals 39

    .line 785
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/collection/SieveCache;->metadata:[J

    .line 788
    .local v1, "metadata":[J
    if-nez v1, :cond_0

    return-void

    .line 790
    :cond_0
    iget v2, v0, Landroidx/collection/SieveCache;->_capacity:I

    .line 791
    .local v2, "capacity":I
    iget-object v3, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 792
    .local v3, "keys":[Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 793
    .local v4, "values":[Ljava/lang/Object;
    iget-object v5, v0, Landroidx/collection/SieveCache;->nodes:[J

    .line 837
    .local v5, "nodes":[J
    new-array v6, v2, [J

    .line 838
    .local v6, "indexMapping":[J
    const-wide v7, 0x7fffffff7fffffffL

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9, v2}, Lkotlin/collections/ArraysKt;->fill([JJII)V

    .line 841
    const/4 v10, 0x0

    .line 1542
    .local v10, "$i$f$convertMetadataForCleanup":I
    add-int/lit8 v11, v2, 0x7

    shr-int/lit8 v11, v11, 0x3

    .line 1543
    .local v11, "end$iv":I
    const/4 v12, 0x0

    .local v12, "i$iv":I
    :goto_0
    if-ge v12, v11, :cond_1

    .line 1545
    aget-wide v13, v1, v12

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    .line 1546
    .local v13, "maskedGroup$iv":J
    move-wide v15, v7

    not-long v7, v13

    const/16 v17, 0x7

    ushr-long v17, v13, v17

    add-long v7, v7, v17

    const-wide v17, -0x101010101010102L

    and-long v7, v7, v17

    aput-wide v7, v1, v12

    .line 1543
    .end local v13    # "maskedGroup$iv":J
    add-int/lit8 v12, v12, 0x1

    move-wide v7, v15

    goto :goto_0

    :cond_1
    move-wide v15, v7

    .line 1549
    .end local v12    # "i$iv":I
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([J)I

    move-result v7

    .line 1551
    .local v7, "lastIndex$iv":I
    add-int/lit8 v8, v7, -0x1

    .line 1552
    add-int/lit8 v12, v7, -0x1

    aget-wide v12, v1, v12

    const-wide v17, 0xffffffffffffffL

    and-long v12, v12, v17

    const-wide/high16 v17, -0x100000000000000L

    or-long v12, v12, v17

    aput-wide v12, v1, v8

    .line 1554
    aget-wide v12, v1, v9

    aput-wide v12, v1, v7

    .line 1555
    nop

    .line 843
    .end local v7    # "lastIndex$iv":I
    .end local v10    # "$i$f$convertMetadataForCleanup":I
    .end local v11    # "end$iv":I
    const/4 v7, 0x0

    .line 846
    .local v7, "index":I
    :goto_1
    if-eq v7, v2, :cond_a

    .line 847
    const/4 v8, 0x0

    .line 1556
    .local v8, "$i$f$readRawMetadata":I
    shr-int/lit8 v10, v7, 0x3

    aget-wide v10, v1, v10

    and-int/lit8 v12, v7, 0x7

    shl-int/lit8 v12, v12, 0x3

    shr-long/2addr v10, v12

    const-wide/16 v12, 0xff

    and-long/2addr v10, v12

    .line 847
    .end local v8    # "$i$f$readRawMetadata":I
    nop

    .line 849
    .local v10, "m":J
    const-wide/16 v17, 0x80

    cmp-long v8, v10, v17

    if-nez v8, :cond_2

    .line 850
    add-int/lit8 v7, v7, 0x1

    .line 851
    goto :goto_1

    .line 856
    :cond_2
    const-wide/16 v19, 0xfe

    cmp-long v8, v10, v19

    if-eqz v8, :cond_3

    .line 857
    add-int/lit8 v7, v7, 0x1

    .line 858
    goto :goto_1

    .line 861
    :cond_3
    aget-object v8, v3, v7

    .local v8, "k$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1557
    .local v14, "$i$f$hash":I
    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v19

    goto :goto_2

    :cond_4
    move/from16 v19, v9

    :goto_2
    const v20, -0x3361d2af    # -8.293031E7f

    mul-int v19, v19, v20

    .line 1559
    .local v19, "hash$iv":I
    shl-int/lit8 v20, v19, 0x10

    xor-int v8, v19, v20

    .line 861
    .end local v8    # "k$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$hash":I
    .end local v19    # "hash$iv":I
    nop

    .line 862
    .local v8, "hash":I
    const/4 v14, 0x0

    .line 1560
    .local v14, "$i$f$h1":I
    ushr-int/lit8 v14, v8, 0x7

    .line 862
    .end local v14    # "$i$f$h1":I
    nop

    .line 863
    .local v14, "hash1":I
    move/from16 v19, v9

    invoke-direct {v0, v14}, Landroidx/collection/SieveCache;->findFirstAvailableSlot(I)I

    move-result v9

    .line 868
    .local v9, "targetIndex":I
    and-int v20, v14, v2

    .line 869
    .local v20, "probeOffset":I
    sub-int v21, v9, v20

    and-int v21, v21, v2

    move-wide/from16 v22, v12

    div-int/lit8 v12, v21, 0x8

    .line 870
    .local v12, "newProbeIndex":I
    sub-int v13, v7, v20

    and-int/2addr v13, v2

    div-int/lit8 v13, v13, 0x8

    .line 872
    .local v13, "oldProbeIndex":I
    const/16 v21, 0x20

    if-ne v12, v13, :cond_6

    .line 873
    const/16 v17, 0x0

    .line 1561
    .local v17, "$i$f$h2":I
    and-int/lit8 v17, v8, 0x7f

    .line 873
    .end local v17    # "$i$f$h2":I
    move/from16 v18, v17

    .line 874
    .local v18, "hash2":I
    move-object/from16 v26, v3

    move-wide/from16 v24, v15

    move/from16 v15, v18

    move/from16 v16, v2

    .end local v2    # "capacity":I
    .end local v3    # "keys":[Ljava/lang/Object;
    .end local v18    # "hash2":I
    .local v15, "hash2":I
    .local v16, "capacity":I
    .local v26, "keys":[Ljava/lang/Object;
    int-to-long v2, v15

    .local v2, "value$iv":J
    const/16 v17, 0x0

    .line 1562
    .local v17, "$i$f$writeRawMetadata":I
    shr-int/lit8 v18, v7, 0x3

    .line 1563
    .local v18, "i$iv":I
    and-int/lit8 v27, v7, 0x7

    shl-int/lit8 v27, v27, 0x3

    .line 1566
    .local v27, "b$iv":I
    aget-wide v28, v1, v18

    move-wide/from16 v30, v2

    .end local v2    # "value$iv":J
    .local v30, "value$iv":J
    shl-long v2, v22, v27

    not-long v2, v2

    and-long v2, v28, v2

    shl-long v22, v30, v27

    or-long v2, v2, v22

    aput-wide v2, v1, v18

    .line 1567
    nop

    .line 877
    .end local v17    # "$i$f$writeRawMetadata":I
    .end local v18    # "i$iv":I
    .end local v27    # "b$iv":I
    .end local v30    # "value$iv":J
    aget-wide v2, v6, v7

    cmp-long v2, v2, v24

    if-nez v2, :cond_5

    .line 878
    const/4 v2, 0x0

    .line 1568
    .local v2, "$i$f$createMapping":I
    move/from16 v17, v2

    .end local v2    # "$i$f$createMapping":I
    .local v17, "$i$f$createMapping":I
    int-to-long v2, v7

    shl-long v2, v2, v21

    move-wide/from16 v21, v2

    int-to-long v2, v7

    or-long v2, v21, v2

    .end local v17    # "$i$f$createMapping":I
    aput-wide v2, v6, v7

    .line 882
    :cond_5
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget-wide v17, v1, v19

    aput-wide v17, v1, v2

    .line 884
    add-int/lit8 v7, v7, 0x1

    .line 885
    move/from16 v2, v16

    move/from16 v9, v19

    move-wide/from16 v15, v24

    move-object/from16 v3, v26

    goto/16 :goto_1

    .line 888
    .end local v15    # "hash2":I
    .end local v16    # "capacity":I
    .end local v26    # "keys":[Ljava/lang/Object;
    .local v2, "capacity":I
    .restart local v3    # "keys":[Ljava/lang/Object;
    :cond_6
    move-object/from16 v26, v3

    move-wide/from16 v24, v15

    move/from16 v16, v2

    .end local v2    # "capacity":I
    .end local v3    # "keys":[Ljava/lang/Object;
    .restart local v16    # "capacity":I
    .restart local v26    # "keys":[Ljava/lang/Object;
    const/4 v2, 0x0

    .line 1569
    .local v2, "$i$f$readRawMetadata":I
    shr-int/lit8 v3, v9, 0x3

    aget-wide v27, v1, v3

    and-int/lit8 v3, v9, 0x7

    shl-int/lit8 v3, v3, 0x3

    shr-long v27, v27, v3

    and-long v2, v27, v22

    .line 888
    .end local v2    # "$i$f$readRawMetadata":I
    nop

    .line 889
    .end local v10    # "m":J
    .local v2, "m":J
    cmp-long v10, v2, v17

    const-wide v17, -0x100000000L

    const-wide v27, 0xffffffffL

    if-nez v10, :cond_8

    .line 891
    const/4 v10, 0x0

    .line 1570
    .local v10, "$i$f$h2":I
    and-int/lit8 v10, v8, 0x7f

    .line 891
    .end local v10    # "$i$f$h2":I
    nop

    .line 892
    .local v10, "hash2":I
    move v15, v12

    .end local v12    # "newProbeIndex":I
    .local v15, "newProbeIndex":I
    int-to-long v11, v10

    .local v11, "value$iv":J
    const/16 v30, 0x0

    .line 1571
    .local v30, "$i$f$writeRawMetadata":I
    shr-int/lit8 v31, v9, 0x3

    .line 1572
    .local v31, "i$iv":I
    and-int/lit8 v32, v9, 0x7

    shl-int/lit8 v32, v32, 0x3

    .line 1575
    .local v32, "b$iv":I
    aget-wide v33, v1, v31

    move-wide/from16 v35, v2

    .end local v2    # "m":J
    .local v35, "m":J
    shl-long v2, v22, v32

    not-long v2, v2

    and-long v2, v33, v2

    shl-long v33, v11, v32

    or-long v2, v2, v33

    aput-wide v2, v1, v31

    .line 1576
    nop

    .line 893
    .end local v11    # "value$iv":J
    .end local v30    # "$i$f$writeRawMetadata":I
    .end local v31    # "i$iv":I
    .end local v32    # "b$iv":I
    const-wide/16 v2, 0x80

    .local v2, "value$iv":J
    const/4 v11, 0x0

    .line 1577
    .local v11, "$i$f$writeRawMetadata":I
    shr-int/lit8 v12, v7, 0x3

    .line 1578
    .local v12, "i$iv":I
    and-int/lit8 v30, v7, 0x7

    shl-int/lit8 v30, v30, 0x3

    .line 1581
    .local v30, "b$iv":I
    aget-wide v31, v1, v12

    move-wide/from16 v33, v2

    .end local v2    # "value$iv":J
    .local v33, "value$iv":J
    shl-long v2, v22, v30

    not-long v2, v2

    and-long v2, v31, v2

    shl-long v22, v33, v30

    or-long v2, v2, v22

    aput-wide v2, v1, v12

    .line 1582
    nop

    .line 895
    .end local v11    # "$i$f$writeRawMetadata":I
    .end local v12    # "i$iv":I
    .end local v30    # "b$iv":I
    .end local v33    # "value$iv":J
    aget-object v2, v26, v7

    aput-object v2, v26, v9

    .line 896
    const/4 v2, 0x0

    aput-object v2, v26, v7

    .line 898
    aget-object v3, v4, v7

    aput-object v3, v4, v9

    .line 899
    aput-object v2, v4, v7

    .line 901
    aget-wide v2, v5, v7

    aput-wide v2, v5, v9

    .line 902
    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    aput-wide v2, v5, v7

    .line 904
    aget-wide v2, v6, v7

    .line 905
    .local v2, "mapping":J
    move-wide v11, v2

    .local v11, "$this$src$iv":J
    const/16 v22, 0x0

    .line 1583
    .local v22, "$i$f$getSrc":I
    shr-long v30, v11, v21

    move-wide/from16 v32, v2

    .end local v2    # "mapping":J
    .local v32, "mapping":J
    and-long v2, v30, v27

    long-to-int v2, v2

    .line 905
    .end local v11    # "$this$src$iv":J
    .end local v22    # "$i$f$getSrc":I
    nop

    .line 906
    .local v2, "src":I
    const v3, 0x7fffffff

    if-eq v2, v3, :cond_7

    .line 907
    aget-wide v11, v6, v2

    .local v11, "mapping$iv":J
    const/4 v3, 0x0

    .line 1584
    .local v3, "$i$f$createDstMapping":I
    and-long v22, v11, v17

    move/from16 v29, v2

    move/from16 v30, v3

    .end local v2    # "src":I
    .end local v3    # "$i$f$createDstMapping":I
    .local v29, "src":I
    .local v30, "$i$f$createDstMapping":I
    int-to-long v2, v9

    or-long v2, v22, v2

    .end local v11    # "mapping$iv":J
    .end local v30    # "$i$f$createDstMapping":I
    aput-wide v2, v6, v29

    .line 908
    aget-wide v2, v6, v7

    .local v2, "mapping$iv":J
    const/4 v11, 0x0

    .line 1585
    .local v11, "$i$f$eraseSrcMapping":I
    and-long v22, v2, v27

    or-long v2, v22, v17

    .end local v2    # "mapping$iv":J
    .end local v11    # "$i$f$eraseSrcMapping":I
    aput-wide v2, v6, v7

    goto :goto_3

    .line 910
    .end local v29    # "src":I
    .local v2, "src":I
    :cond_7
    move/from16 v29, v2

    .end local v2    # "src":I
    .restart local v29    # "src":I
    const v2, 0x7fffffff

    .local v2, "src$iv":I
    const/4 v3, 0x0

    .line 1586
    .local v3, "$i$f$createMapping":I
    int-to-long v11, v2

    shl-long v11, v11, v21

    move/from16 v17, v2

    move/from16 v18, v3

    .end local v2    # "src$iv":I
    .end local v3    # "$i$f$createMapping":I
    .local v17, "src$iv":I
    .local v18, "$i$f$createMapping":I
    int-to-long v2, v9

    or-long/2addr v2, v11

    .end local v17    # "src$iv":I
    .end local v18    # "$i$f$createMapping":I
    aput-wide v2, v6, v7

    .line 912
    :goto_3
    const v2, 0x7fffffff

    .local v2, "dst$iv":I
    const/4 v3, 0x0

    .line 1587
    .restart local v3    # "$i$f$createMapping":I
    int-to-long v11, v7

    shl-long v11, v11, v21

    move/from16 v17, v3

    move-object/from16 v30, v4

    .end local v3    # "$i$f$createMapping":I
    .end local v4    # "values":[Ljava/lang/Object;
    .local v17, "$i$f$createMapping":I
    .local v30, "values":[Ljava/lang/Object;
    int-to-long v3, v2

    or-long v2, v11, v3

    .end local v2    # "dst$iv":I
    .end local v17    # "$i$f$createMapping":I
    aput-wide v2, v6, v9

    .end local v10    # "hash2":I
    .end local v29    # "src":I
    .end local v32    # "mapping":J
    goto/16 :goto_5

    .line 915
    .end local v15    # "newProbeIndex":I
    .end local v30    # "values":[Ljava/lang/Object;
    .end local v35    # "m":J
    .local v2, "m":J
    .restart local v4    # "values":[Ljava/lang/Object;
    .local v12, "newProbeIndex":I
    :cond_8
    move-wide/from16 v35, v2

    move-object/from16 v30, v4

    move v15, v12

    .end local v2    # "m":J
    .end local v4    # "values":[Ljava/lang/Object;
    .end local v12    # "newProbeIndex":I
    .restart local v15    # "newProbeIndex":I
    .restart local v30    # "values":[Ljava/lang/Object;
    .restart local v35    # "m":J
    const/4 v2, 0x0

    .line 1588
    .local v2, "$i$f$h2":I
    and-int/lit8 v2, v8, 0x7f

    .line 915
    .end local v2    # "$i$f$h2":I
    nop

    .line 916
    .local v2, "hash2":I
    int-to-long v3, v2

    .local v3, "value$iv":J
    const/4 v10, 0x0

    .line 1589
    .local v10, "$i$f$writeRawMetadata":I
    shr-int/lit8 v11, v9, 0x3

    .line 1590
    .local v11, "i$iv":I
    and-int/lit8 v12, v9, 0x7

    shl-int/lit8 v12, v12, 0x3

    .line 1593
    .local v12, "b$iv":I
    aget-wide v31, v1, v11

    move/from16 v33, v2

    move-wide/from16 v37, v3

    .end local v2    # "hash2":I
    .end local v3    # "value$iv":J
    .local v33, "hash2":I
    .local v37, "value$iv":J
    shl-long v2, v22, v12

    not-long v2, v2

    and-long v2, v31, v2

    shl-long v22, v37, v12

    or-long v2, v2, v22

    aput-wide v2, v1, v11

    .line 1594
    nop

    .line 918
    .end local v10    # "$i$f$writeRawMetadata":I
    .end local v11    # "i$iv":I
    .end local v12    # "b$iv":I
    .end local v37    # "value$iv":J
    aget-object v2, v26, v9

    .line 919
    .local v2, "oldKey":Ljava/lang/Object;
    aget-object v3, v26, v7

    aput-object v3, v26, v9

    .line 920
    aput-object v2, v26, v7

    .line 922
    aget-object v3, v30, v9

    .line 923
    .local v3, "oldValue":Ljava/lang/Object;
    aget-object v4, v30, v7

    aput-object v4, v30, v9

    .line 924
    aput-object v3, v30, v7

    .line 926
    aget-wide v10, v5, v9

    .line 927
    .local v10, "oldNode":J
    aget-wide v22, v5, v7

    aput-wide v22, v5, v9

    .line 928
    aput-wide v10, v5, v7

    .line 930
    aget-wide v22, v6, v7

    .line 931
    .local v22, "mapping":J
    move-wide/from16 v31, v22

    .local v31, "$this$src$iv":J
    const/4 v4, 0x0

    .line 1595
    .local v4, "$i$f$getSrc":I
    shr-long v37, v31, v21

    move-object v12, v2

    move-object/from16 v34, v3

    .end local v2    # "oldKey":Ljava/lang/Object;
    .end local v3    # "oldValue":Ljava/lang/Object;
    .local v12, "oldKey":Ljava/lang/Object;
    .local v34, "oldValue":Ljava/lang/Object;
    and-long v2, v37, v27

    long-to-int v2, v2

    .line 931
    .end local v4    # "$i$f$getSrc":I
    .end local v31    # "$this$src$iv":J
    nop

    .line 932
    .local v2, "src":I
    const v3, 0x7fffffff

    if-eq v2, v3, :cond_9

    .line 933
    aget-wide v3, v6, v2

    .local v3, "mapping$iv":J
    const/16 v29, 0x0

    .line 1596
    .local v29, "$i$f$createDstMapping":I
    and-long v17, v3, v17

    move/from16 v31, v2

    move-wide/from16 v37, v3

    .end local v2    # "src":I
    .end local v3    # "mapping$iv":J
    .local v31, "src":I
    .local v37, "mapping$iv":J
    int-to-long v2, v9

    or-long v2, v17, v2

    .end local v29    # "$i$f$createDstMapping":I
    .end local v37    # "mapping$iv":J
    aput-wide v2, v6, v31

    .line 934
    aget-wide v2, v6, v7

    .local v2, "mapping$iv":J
    const/4 v4, 0x0

    .line 1597
    .local v4, "$i$f$createSrcMapping":I
    move-wide/from16 v17, v2

    .end local v2    # "mapping$iv":J
    .local v17, "mapping$iv":J
    int-to-long v2, v9

    shl-long v2, v2, v21

    and-long v27, v17, v27

    or-long v2, v2, v27

    .end local v4    # "$i$f$createSrcMapping":I
    .end local v17    # "mapping$iv":J
    aput-wide v2, v6, v7

    move/from16 v2, v31

    goto :goto_4

    .line 936
    .end local v31    # "src":I
    .local v2, "src":I
    :cond_9
    move/from16 v31, v2

    .end local v2    # "src":I
    .restart local v31    # "src":I
    const/4 v2, 0x0

    .line 1598
    .local v2, "$i$f$createMapping":I
    int-to-long v3, v9

    shl-long v3, v3, v21

    move/from16 v17, v2

    move-wide/from16 v27, v3

    .end local v2    # "$i$f$createMapping":I
    .local v17, "$i$f$createMapping":I
    int-to-long v2, v9

    or-long v2, v27, v2

    .end local v17    # "$i$f$createMapping":I
    aput-wide v2, v6, v7

    .line 937
    move v2, v7

    .line 940
    .end local v31    # "src":I
    .local v2, "src":I
    :goto_4
    const/4 v3, 0x0

    .line 1599
    .local v3, "$i$f$createMapping":I
    move/from16 v17, v3

    .end local v3    # "$i$f$createMapping":I
    .restart local v17    # "$i$f$createMapping":I
    int-to-long v3, v2

    shl-long v3, v3, v21

    move/from16 v18, v2

    move-wide/from16 v27, v3

    .end local v2    # "src":I
    .local v18, "src":I
    int-to-long v2, v7

    or-long v2, v27, v2

    .end local v17    # "$i$f$createMapping":I
    aput-wide v2, v6, v9

    .line 944
    add-int/lit8 v7, v7, -0x1

    .line 948
    .end local v10    # "oldNode":J
    .end local v12    # "oldKey":Ljava/lang/Object;
    .end local v18    # "src":I
    .end local v22    # "mapping":J
    .end local v33    # "hash2":I
    .end local v34    # "oldValue":Ljava/lang/Object;
    :goto_5
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget-wide v3, v1, v19

    aput-wide v3, v1, v2

    .line 950
    nop

    .end local v8    # "hash":I
    .end local v9    # "targetIndex":I
    .end local v13    # "oldProbeIndex":I
    .end local v14    # "hash1":I
    .end local v15    # "newProbeIndex":I
    .end local v20    # "probeOffset":I
    .end local v35    # "m":J
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, v16

    move/from16 v9, v19

    move-wide/from16 v15, v24

    move-object/from16 v3, v26

    move-object/from16 v4, v30

    goto/16 :goto_1

    .line 953
    .end local v16    # "capacity":I
    .end local v26    # "keys":[Ljava/lang/Object;
    .end local v30    # "values":[Ljava/lang/Object;
    .local v2, "capacity":I
    .local v3, "keys":[Ljava/lang/Object;
    .local v4, "values":[Ljava/lang/Object;
    :cond_a
    invoke-direct {v0}, Landroidx/collection/SieveCache;->initializeGrowth()V

    .line 955
    invoke-direct {v0, v6}, Landroidx/collection/SieveCache;->fixupNodes([J)V

    .line 956
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 25
    .param p1, "other"    # Ljava/lang/Object;

    .line 1068
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    if-ne v1, v0, :cond_0

    .line 1069
    return v2

    .line 1072
    :cond_0
    instance-of v3, v1, Landroidx/collection/SieveCache;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    .line 1073
    return v4

    .line 1075
    :cond_1
    move-object v3, v1

    check-cast v3, Landroidx/collection/SieveCache;

    invoke-virtual {v3}, Landroidx/collection/SieveCache;->getSize()I

    move-result v3

    invoke-virtual {v0}, Landroidx/collection/SieveCache;->getSize()I

    move-result v5

    if-ne v3, v5, :cond_b

    move-object v3, v1

    check-cast v3, Landroidx/collection/SieveCache;

    iget v3, v3, Landroidx/collection/SieveCache;->_count:I

    iget v5, v0, Landroidx/collection/SieveCache;->_count:I

    if-eq v3, v5, :cond_2

    move/from16 v19, v4

    goto/16 :goto_5

    .line 1079
    :cond_2
    move-object v3, v1

    check-cast v3, Landroidx/collection/SieveCache;

    .line 1081
    .local v3, "o":Landroidx/collection/SieveCache;
    move-object/from16 v5, p0

    .local v5, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v6, 0x0

    .line 1663
    .local v6, "$i$f$forEach":I
    iget-object v7, v5, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 1664
    .local v7, "k$iv":[Ljava/lang/Object;
    iget-object v8, v5, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 1666
    .local v8, "v$iv":[Ljava/lang/Object;
    move-object v9, v5

    .local v9, "this_$iv$iv":Landroidx/collection/SieveCache;
    const/4 v10, 0x0

    .line 1667
    .local v10, "$i$f$forEachIndexed":I
    iget-object v11, v9, Landroidx/collection/SieveCache;->metadata:[J

    .line 1668
    .local v11, "m$iv$iv":[J
    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    .line 1670
    .local v12, "lastIndex$iv$iv":I
    const/4 v13, 0x0

    .local v13, "i$iv$iv":I
    if-gt v13, v12, :cond_8

    .line 1671
    :goto_0
    aget-wide v14, v11, v13

    .line 1672
    .local v14, "slot$iv$iv":J
    move-wide/from16 v16, v14

    .local v16, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v18, 0x0

    .line 1673
    .local v18, "$i$f$maskEmptyOrDeleted":I
    move/from16 v19, v4

    move-object/from16 v20, v5

    move-wide/from16 v4, v16

    move/from16 v16, v2

    move-object/from16 v17, v3

    .end local v3    # "o":Landroidx/collection/SieveCache;
    .end local v5    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v16    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v17, "o":Landroidx/collection/SieveCache;
    .local v20, "this_$iv":Landroidx/collection/SieveCache;
    not-long v2, v4

    const/16 v21, 0x7

    shl-long v2, v2, v21

    and-long/2addr v2, v4

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v21

    .line 1672
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v18    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v21

    if-eqz v2, :cond_7

    .line 1674
    sub-int v2, v13, v12

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 1675
    .local v2, "bitCount$iv$iv":I
    const/4 v4, 0x0

    .local v4, "j$iv$iv":I
    :goto_1
    if-ge v4, v2, :cond_6

    .line 1676
    const-wide/16 v21, 0xff

    and-long v21, v14, v21

    .local v21, "value$iv$iv$iv":J
    const/4 v5, 0x0

    .line 1677
    .local v5, "$i$f$isFull":I
    const-wide/16 v23, 0x80

    cmp-long v18, v21, v23

    if-gez v18, :cond_3

    move/from16 v5, v16

    goto :goto_2

    :cond_3
    move/from16 v5, v19

    .line 1676
    .end local v5    # "$i$f$isFull":I
    .end local v21    # "value$iv$iv$iv":J
    :goto_2
    if-eqz v5, :cond_5

    .line 1678
    shl-int/lit8 v5, v13, 0x3

    add-int/2addr v5, v4

    .line 1679
    .local v5, "index$iv$iv":I
    move/from16 v18, v5

    .local v18, "index$iv":I
    const/16 v21, 0x0

    .line 1666
    .local v21, "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    move/from16 v22, v3

    aget-object v3, v7, v18

    const-string/jumbo v0, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v0, v8, v18

    const-string/jumbo v1, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .local v0, "value":Ljava/lang/Object;
    .local v3, "key":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1082
    .local v1, "$i$a$-forEach-SieveCache$equals$1":I
    move/from16 v23, v1

    move-object/from16 v1, v17

    move/from16 v17, v4

    .end local v4    # "j$iv$iv":I
    .local v1, "o":Landroidx/collection/SieveCache;
    .local v17, "j$iv$iv":I
    .local v23, "$i$a$-forEach-SieveCache$equals$1":I
    invoke-virtual {v1, v3}, Landroidx/collection/SieveCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 1083
    return v19

    .line 1085
    :cond_4
    nop

    .line 1666
    .end local v0    # "value":Ljava/lang/Object;
    .end local v3    # "key":Ljava/lang/Object;
    .end local v23    # "$i$a$-forEach-SieveCache$equals$1":I
    nop

    .line 1679
    .end local v18    # "index$iv":I
    .end local v21    # "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    goto :goto_3

    .line 1676
    .end local v1    # "o":Landroidx/collection/SieveCache;
    .end local v5    # "index$iv$iv":I
    .restart local v4    # "j$iv$iv":I
    .local v17, "o":Landroidx/collection/SieveCache;
    :cond_5
    move/from16 v22, v3

    move-object/from16 v1, v17

    move/from16 v17, v4

    .line 1681
    .end local v4    # "j$iv$iv":I
    .restart local v1    # "o":Landroidx/collection/SieveCache;
    .local v17, "j$iv$iv":I
    :goto_3
    shr-long v14, v14, v22

    .line 1675
    add-int/lit8 v4, v17, 0x1

    move-object/from16 v0, p0

    move-object/from16 v17, v1

    move/from16 v3, v22

    move-object/from16 v1, p1

    .end local v17    # "j$iv$iv":I
    .restart local v4    # "j$iv$iv":I
    goto :goto_1

    .end local v1    # "o":Landroidx/collection/SieveCache;
    .local v17, "o":Landroidx/collection/SieveCache;
    :cond_6
    move/from16 v22, v3

    move-object/from16 v1, v17

    move/from16 v17, v4

    .line 1683
    .end local v4    # "j$iv$iv":I
    .end local v17    # "o":Landroidx/collection/SieveCache;
    .restart local v1    # "o":Landroidx/collection/SieveCache;
    move/from16 v0, v22

    if-ne v2, v0, :cond_a

    goto :goto_4

    .line 1672
    .end local v1    # "o":Landroidx/collection/SieveCache;
    .end local v2    # "bitCount$iv$iv":I
    .restart local v17    # "o":Landroidx/collection/SieveCache;
    :cond_7
    move-object/from16 v1, v17

    .line 1670
    .end local v14    # "slot$iv$iv":J
    .end local v17    # "o":Landroidx/collection/SieveCache;
    .restart local v1    # "o":Landroidx/collection/SieveCache;
    :goto_4
    if-eq v13, v12, :cond_9

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move-object v3, v1

    move/from16 v2, v16

    move/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v1, p1

    goto/16 :goto_0

    .end local v1    # "o":Landroidx/collection/SieveCache;
    .end local v20    # "this_$iv":Landroidx/collection/SieveCache;
    .local v3, "o":Landroidx/collection/SieveCache;
    .local v5, "this_$iv":Landroidx/collection/SieveCache;
    :cond_8
    move/from16 v16, v2

    move-object v1, v3

    move-object/from16 v20, v5

    .line 1686
    .end local v3    # "o":Landroidx/collection/SieveCache;
    .end local v5    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v13    # "i$iv$iv":I
    .restart local v1    # "o":Landroidx/collection/SieveCache;
    .restart local v20    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_9
    nop

    .line 1687
    .end local v9    # "this_$iv$iv":Landroidx/collection/SieveCache;
    .end local v10    # "$i$f$forEachIndexed":I
    .end local v11    # "m$iv$iv":[J
    .end local v12    # "lastIndex$iv$iv":I
    :cond_a
    nop

    .line 1087
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "k$iv":[Ljava/lang/Object;
    .end local v8    # "v$iv":[Ljava/lang/Object;
    .end local v20    # "this_$iv":Landroidx/collection/SieveCache;
    return v16

    .line 1075
    .end local v1    # "o":Landroidx/collection/SieveCache;
    :cond_b
    move/from16 v19, v4

    .line 1076
    :goto_5
    return v19
.end method

.method public final evictAll()V
    .locals 1

    .line 499
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/collection/SieveCache;->trimToSize(I)V

    .line 500
    return-void
.end method

.method public final forEach(Lkotlin/jvm/functions/Function2;)V
    .locals 20
    .param p1, "block"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 548
    .local v2, "$i$f$forEach":I
    iget-object v3, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 549
    .local v3, "k":[Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 551
    .local v4, "v":[Ljava/lang/Object;
    move-object/from16 v5, p0

    .local v5, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v6, 0x0

    .line 1289
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/SieveCache;->metadata:[J

    .line 1290
    .local v7, "m$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1292
    .local v8, "lastIndex$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv":I
    if-gt v9, v8, :cond_4

    .line 1293
    :goto_0
    aget-wide v10, v7, v9

    .line 1294
    .local v10, "slot$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v14, 0x0

    .line 1295
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move v15, v2

    move-object/from16 v16, v3

    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k":[Ljava/lang/Object;
    .local v15, "$i$f$forEach":I
    .local v16, "k":[Ljava/lang/Object;
    not-long v2, v12

    const/16 v17, 0x7

    shl-long v2, v2, v17

    and-long/2addr v2, v12

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v17

    .line 1294
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v17

    if-eqz v2, :cond_3

    .line 1296
    sub-int v2, v9, v8

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 1297
    .local v2, "bitCount$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv":I
    :goto_1
    if-ge v12, v2, :cond_2

    .line 1298
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv":J
    const/16 v17, 0x0

    .line 1299
    .local v17, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v13, v18

    if-gez v18, :cond_0

    const/16 v18, 0x1

    goto :goto_2

    :cond_0
    const/16 v18, 0x0

    .line 1298
    .end local v13    # "value$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v18, :cond_1

    .line 1300
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1301
    .local v13, "index$iv":I
    move v14, v13

    .local v14, "index":I
    const/16 v17, 0x0

    .line 551
    .local v17, "$i$a$-forEachIndexed-SieveCache$forEach$1":I
    move/from16 v18, v3

    aget-object v3, v16, v14

    const-string/jumbo v0, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v0, v4, v14

    move-object/from16 v19, v4

    .end local v4    # "v":[Ljava/lang/Object;
    .local v19, "v":[Ljava/lang/Object;
    const-string/jumbo v4, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1301
    .end local v14    # "index":I
    .end local v17    # "$i$a$-forEachIndexed-SieveCache$forEach$1":I
    goto :goto_3

    .line 1298
    .end local v13    # "index$iv":I
    .end local v19    # "v":[Ljava/lang/Object;
    .restart local v4    # "v":[Ljava/lang/Object;
    :cond_1
    move/from16 v18, v3

    move-object/from16 v19, v4

    .line 1303
    .end local v4    # "v":[Ljava/lang/Object;
    .restart local v19    # "v":[Ljava/lang/Object;
    :goto_3
    shr-long v10, v10, v18

    .line 1297
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    move/from16 v3, v18

    move-object/from16 v4, v19

    goto :goto_1

    .end local v19    # "v":[Ljava/lang/Object;
    .restart local v4    # "v":[Ljava/lang/Object;
    :cond_2
    move/from16 v18, v3

    move-object/from16 v19, v4

    .line 1305
    .end local v4    # "v":[Ljava/lang/Object;
    .end local v12    # "j$iv":I
    .restart local v19    # "v":[Ljava/lang/Object;
    move/from16 v0, v18

    if-ne v2, v0, :cond_6

    goto :goto_4

    .line 1294
    .end local v2    # "bitCount$iv":I
    .end local v19    # "v":[Ljava/lang/Object;
    .restart local v4    # "v":[Ljava/lang/Object;
    :cond_3
    move-object/from16 v19, v4

    .line 1292
    .end local v4    # "v":[Ljava/lang/Object;
    .end local v10    # "slot$iv":J
    .restart local v19    # "v":[Ljava/lang/Object;
    :goto_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move v2, v15

    move-object/from16 v3, v16

    move-object/from16 v4, v19

    goto :goto_0

    .end local v15    # "$i$f$forEach":I
    .end local v16    # "k":[Ljava/lang/Object;
    .end local v19    # "v":[Ljava/lang/Object;
    .local v2, "$i$f$forEach":I
    .restart local v3    # "k":[Ljava/lang/Object;
    .restart local v4    # "v":[Ljava/lang/Object;
    :cond_4
    move v15, v2

    move-object/from16 v16, v3

    move-object/from16 v19, v4

    .line 1308
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k":[Ljava/lang/Object;
    .end local v4    # "v":[Ljava/lang/Object;
    .end local v9    # "i$iv":I
    .restart local v15    # "$i$f$forEach":I
    .restart local v16    # "k":[Ljava/lang/Object;
    .restart local v19    # "v":[Ljava/lang/Object;
    :cond_5
    nop

    .line 552
    .end local v5    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv":[J
    .end local v8    # "lastIndex$iv":I
    :cond_6
    return-void
.end method

.method public final forEachIndexed(Lkotlin/jvm/functions/Function1;)V
    .locals 14
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1025
    .local v0, "$i$f$forEachIndexed":I
    iget-object v1, p0, Landroidx/collection/SieveCache;->metadata:[J

    .line 1026
    .local v1, "m":[J
    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    .line 1028
    .local v2, "lastIndex":I
    const/4 v3, 0x0

    .local v3, "i":I
    if-gt v3, v2, :cond_4

    .line 1029
    :goto_0
    aget-wide v4, v1, v3

    .line 1030
    .local v4, "slot":J
    move-wide v6, v4

    .local v6, "$this$maskEmptyOrDeleted$iv":J
    const/4 v8, 0x0

    .line 1636
    .local v8, "$i$f$maskEmptyOrDeleted":I
    not-long v9, v6

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v6

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v6, v9, v11

    .line 1030
    .end local v6    # "$this$maskEmptyOrDeleted$iv":J
    .end local v8    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v6, v6, v11

    if-eqz v6, :cond_3

    .line 1035
    sub-int v6, v3, v2

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    .line 1036
    .local v6, "bitCount":I
    const/4 v8, 0x0

    .local v8, "j":I
    :goto_1
    if-ge v8, v6, :cond_2

    .line 1037
    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    .local v9, "value$iv":J
    const/4 v11, 0x0

    .line 1637
    .local v11, "$i$f$isFull":I
    const-wide/16 v12, 0x80

    cmp-long v12, v9, v12

    if-gez v12, :cond_0

    const/4 v12, 0x1

    goto :goto_2

    :cond_0
    const/4 v12, 0x0

    .line 1037
    .end local v9    # "value$iv":J
    .end local v11    # "$i$f$isFull":I
    :goto_2
    if-eqz v12, :cond_1

    .line 1038
    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    .line 1039
    .local v9, "index":I
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {p1, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    .end local v9    # "index":I
    :cond_1
    shr-long/2addr v4, v7

    .line 1036
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 1043
    .end local v8    # "j":I
    :cond_2
    if-eq v6, v7, :cond_3

    return-void

    .line 1028
    .end local v4    # "slot":J
    .end local v6    # "bitCount":I
    :cond_3
    if-eq v3, v2, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1046
    .end local v3    # "i":I
    :cond_4
    return-void
.end method

.method public final forEachKey(Lkotlin/jvm/functions/Function1;)V
    .locals 19
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TK;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 561
    .local v1, "$i$f$forEachKey":I
    move-object/from16 v2, p0

    iget-object v3, v2, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 563
    .local v3, "k":[Ljava/lang/Object;
    move-object/from16 v4, p0

    .local v4, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v5, 0x0

    .line 1309
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/SieveCache;->metadata:[J

    .line 1310
    .local v6, "m$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 1312
    .local v7, "lastIndex$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv":I
    if-gt v8, v7, :cond_4

    .line 1313
    :goto_0
    aget-wide v9, v6, v8

    .line 1314
    .local v9, "slot$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v13, 0x0

    .line 1315
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 1314
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_3

    .line 1316
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1317
    .local v11, "bitCount$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv":I
    :goto_1
    if-ge v13, v11, :cond_2

    .line 1318
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv":J
    const/16 v16, 0x0

    .line 1319
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1318
    .end local v14    # "value$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_1

    .line 1320
    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    .line 1321
    .local v14, "index$iv":I
    move v15, v14

    .local v15, "index":I
    const/16 v16, 0x0

    .line 563
    .local v16, "$i$a$-forEachIndexed-SieveCache$forEachKey$1":I
    move/from16 v17, v12

    aget-object v12, v3, v15

    move/from16 v18, v1

    .end local v1    # "$i$f$forEachKey":I
    .local v18, "$i$f$forEachKey":I
    const-string/jumbo v1, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1321
    .end local v15    # "index":I
    .end local v16    # "$i$a$-forEachIndexed-SieveCache$forEachKey$1":I
    goto :goto_3

    .line 1318
    .end local v14    # "index$iv":I
    .end local v18    # "$i$f$forEachKey":I
    .restart local v1    # "$i$f$forEachKey":I
    :cond_1
    move/from16 v18, v1

    move/from16 v17, v12

    .line 1323
    .end local v1    # "$i$f$forEachKey":I
    .restart local v18    # "$i$f$forEachKey":I
    :goto_3
    shr-long v9, v9, v17

    .line 1317
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v17

    move/from16 v1, v18

    goto :goto_1

    .end local v18    # "$i$f$forEachKey":I
    .restart local v1    # "$i$f$forEachKey":I
    :cond_2
    move/from16 v18, v1

    move/from16 v17, v12

    .line 1325
    .end local v1    # "$i$f$forEachKey":I
    .end local v13    # "j$iv":I
    .restart local v18    # "$i$f$forEachKey":I
    move/from16 v1, v17

    if-ne v11, v1, :cond_6

    goto :goto_4

    .line 1314
    .end local v11    # "bitCount$iv":I
    .end local v18    # "$i$f$forEachKey":I
    .restart local v1    # "$i$f$forEachKey":I
    :cond_3
    move/from16 v18, v1

    .line 1312
    .end local v1    # "$i$f$forEachKey":I
    .end local v9    # "slot$iv":J
    .restart local v18    # "$i$f$forEachKey":I
    :goto_4
    if-eq v8, v7, :cond_5

    add-int/lit8 v8, v8, 0x1

    move/from16 v1, v18

    goto :goto_0

    .end local v18    # "$i$f$forEachKey":I
    .restart local v1    # "$i$f$forEachKey":I
    :cond_4
    move/from16 v18, v1

    .line 1328
    .end local v1    # "$i$f$forEachKey":I
    .end local v8    # "i$iv":I
    .restart local v18    # "$i$f$forEachKey":I
    :cond_5
    nop

    .line 564
    .end local v4    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv":[J
    .end local v7    # "lastIndex$iv":I
    :cond_6
    return-void
.end method

.method public final forEachValue(Lkotlin/jvm/functions/Function1;)V
    .locals 19
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TV;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 573
    .local v1, "$i$f$forEachValue":I
    move-object/from16 v2, p0

    iget-object v3, v2, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 575
    .local v3, "v":[Ljava/lang/Object;
    move-object/from16 v4, p0

    .local v4, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v5, 0x0

    .line 1329
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/SieveCache;->metadata:[J

    .line 1330
    .local v6, "m$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 1332
    .local v7, "lastIndex$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv":I
    if-gt v8, v7, :cond_4

    .line 1333
    :goto_0
    aget-wide v9, v6, v8

    .line 1334
    .local v9, "slot$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v13, 0x0

    .line 1335
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 1334
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_3

    .line 1336
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1337
    .local v11, "bitCount$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv":I
    :goto_1
    if-ge v13, v11, :cond_2

    .line 1338
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv":J
    const/16 v16, 0x0

    .line 1339
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1338
    .end local v14    # "value$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_1

    .line 1340
    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    .line 1341
    .local v14, "index$iv":I
    move v15, v14

    .local v15, "index":I
    const/16 v16, 0x0

    .line 575
    .local v16, "$i$a$-forEachIndexed-SieveCache$forEachValue$1":I
    move/from16 v17, v12

    aget-object v12, v3, v15

    move/from16 v18, v1

    .end local v1    # "$i$f$forEachValue":I
    .local v18, "$i$f$forEachValue":I
    const-string/jumbo v1, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1341
    .end local v15    # "index":I
    .end local v16    # "$i$a$-forEachIndexed-SieveCache$forEachValue$1":I
    goto :goto_3

    .line 1338
    .end local v14    # "index$iv":I
    .end local v18    # "$i$f$forEachValue":I
    .restart local v1    # "$i$f$forEachValue":I
    :cond_1
    move/from16 v18, v1

    move/from16 v17, v12

    .line 1343
    .end local v1    # "$i$f$forEachValue":I
    .restart local v18    # "$i$f$forEachValue":I
    :goto_3
    shr-long v9, v9, v17

    .line 1337
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v17

    move/from16 v1, v18

    goto :goto_1

    .end local v18    # "$i$f$forEachValue":I
    .restart local v1    # "$i$f$forEachValue":I
    :cond_2
    move/from16 v18, v1

    move/from16 v17, v12

    .line 1345
    .end local v1    # "$i$f$forEachValue":I
    .end local v13    # "j$iv":I
    .restart local v18    # "$i$f$forEachValue":I
    move/from16 v1, v17

    if-ne v11, v1, :cond_6

    goto :goto_4

    .line 1334
    .end local v11    # "bitCount$iv":I
    .end local v18    # "$i$f$forEachValue":I
    .restart local v1    # "$i$f$forEachValue":I
    :cond_3
    move/from16 v18, v1

    .line 1332
    .end local v1    # "$i$f$forEachValue":I
    .end local v9    # "slot$iv":J
    .restart local v18    # "$i$f$forEachValue":I
    :goto_4
    if-eq v8, v7, :cond_5

    add-int/lit8 v8, v8, 0x1

    move/from16 v1, v18

    goto :goto_0

    .end local v18    # "$i$f$forEachValue":I
    .restart local v1    # "$i$f$forEachValue":I
    :cond_4
    move/from16 v18, v1

    .line 1348
    .end local v1    # "$i$f$forEachValue":I
    .end local v8    # "i$iv":I
    .restart local v18    # "$i$f$forEachValue":I
    :cond_5
    nop

    .line 576
    .end local v4    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv":[J
    .end local v7    # "lastIndex$iv":I
    :cond_6
    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-direct {p0, p1}, Landroidx/collection/SieveCache;->findKeyIndex(Ljava/lang/Object;)I

    move-result v0

    .line 228
    .local v0, "index":I
    if-ltz v0, :cond_0

    .line 229
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v2, 0x0

    .line 1161
    .local v2, "$i$f$markNodeVisited":I
    iget-object v3, v1, Landroidx/collection/SieveCache;->nodes:[J

    iget-object v4, v1, Landroidx/collection/SieveCache;->nodes:[J

    aget-wide v5, v4, v0

    const-wide v7, 0x3fffffffffffffffL    # 1.9999999999999998

    and-long v4, v5, v7

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    or-long/2addr v4, v6

    aput-wide v4, v3, v0

    .line 1162
    nop

    .line 230
    .end local v1    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v2    # "$i$f$markNodeVisited":I
    iget-object v1, p0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aget-object v1, v1, v0

    return-object v1

    .line 233
    :cond_0
    iget-object v1, p0, Landroidx/collection/SieveCache;->createValueFromKey:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    return-object v1

    .line 234
    .local v1, "createdValue":Ljava/lang/Object;
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    return-object v1
.end method

.method public final getCapacity()I
    .locals 1

    .line 171
    iget v0, p0, Landroidx/collection/SieveCache;->_capacity:I

    return v0
.end method

.method public final getCount()I
    .locals 1

    .line 162
    iget v0, p0, Landroidx/collection/SieveCache;->_count:I

    return v0
.end method

.method public final getMaxSize()I
    .locals 1

    .line 153
    iget v0, p0, Landroidx/collection/SieveCache;->_maxSize:I

    return v0
.end method

.method public final getSize()I
    .locals 1

    .line 143
    iget v0, p0, Landroidx/collection/SieveCache;->_size:I

    return v0
.end method

.method public hashCode()I
    .locals 23

    .line 1053
    const/4 v0, 0x0

    .line 1055
    .local v0, "hash":I
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v2, 0x0

    .line 1638
    .local v2, "$i$f$forEach":I
    iget-object v3, v1, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 1639
    .local v3, "k$iv":[Ljava/lang/Object;
    iget-object v4, v1, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 1641
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v1

    .local v5, "this_$iv$iv":Landroidx/collection/SieveCache;
    const/4 v6, 0x0

    .line 1642
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/SieveCache;->metadata:[J

    .line 1643
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1645
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_4

    .line 1646
    :goto_0
    aget-wide v10, v7, v9

    .line 1647
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 1648
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move/from16 v16, v0

    move-object v15, v1

    .end local v0    # "hash":I
    .end local v1    # "this_$iv":Landroidx/collection/SieveCache;
    .local v15, "this_$iv":Landroidx/collection/SieveCache;
    .local v16, "hash":I
    not-long v0, v12

    const/16 v17, 0x7

    shl-long v0, v0, v17

    and-long/2addr v0, v12

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v17

    .line 1647
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v17

    if-eqz v0, :cond_3

    .line 1649
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1650
    .local v0, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v0, :cond_2

    .line 1651
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1652
    .local v17, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v13, v18

    if-gez v18, :cond_0

    const/16 v18, 0x1

    goto :goto_2

    :cond_0
    const/16 v18, 0x0

    .line 1651
    .end local v13    # "value$iv$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v18, :cond_1

    .line 1653
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1654
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v17, 0x0

    .line 1641
    .local v17, "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    move/from16 v18, v1

    aget-object v1, v3, v14

    move/from16 v19, v2

    .end local v2    # "$i$f$forEach":I
    .local v19, "$i$f$forEach":I
    const-string/jumbo v2, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v2, v4, v14

    move-object/from16 v20, v1

    const-string/jumbo v1, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .local v2, "value":Ljava/lang/Object;
    .local v20, "key":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1055
    .local v1, "$i$a$-forEach-SieveCache$hashCode$1":I
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->hashCode()I

    move-result v21

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v22

    xor-int v21, v21, v22

    add-int v16, v16, v21

    .line 1641
    .end local v1    # "$i$a$-forEach-SieveCache$hashCode$1":I
    .end local v2    # "value":Ljava/lang/Object;
    .end local v20    # "key":Ljava/lang/Object;
    nop

    .line 1654
    .end local v14    # "index$iv":I
    .end local v17    # "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    goto :goto_3

    .line 1651
    .end local v13    # "index$iv$iv":I
    .end local v19    # "$i$f$forEach":I
    .local v2, "$i$f$forEach":I
    :cond_1
    move/from16 v18, v1

    move/from16 v19, v2

    .line 1656
    .end local v2    # "$i$f$forEach":I
    .restart local v19    # "$i$f$forEach":I
    :goto_3
    shr-long v10, v10, v18

    .line 1650
    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v18

    move/from16 v2, v19

    goto :goto_1

    .end local v19    # "$i$f$forEach":I
    .restart local v2    # "$i$f$forEach":I
    :cond_2
    move/from16 v18, v1

    move/from16 v19, v2

    .line 1658
    .end local v2    # "$i$f$forEach":I
    .end local v12    # "j$iv$iv":I
    .restart local v19    # "$i$f$forEach":I
    if-ne v0, v1, :cond_6

    move/from16 v0, v16

    goto :goto_4

    .line 1647
    .end local v0    # "bitCount$iv$iv":I
    .end local v19    # "$i$f$forEach":I
    .restart local v2    # "$i$f$forEach":I
    :cond_3
    move/from16 v19, v2

    .end local v2    # "$i$f$forEach":I
    .restart local v19    # "$i$f$forEach":I
    move/from16 v0, v16

    .line 1645
    .end local v10    # "slot$iv$iv":J
    .end local v16    # "hash":I
    .local v0, "hash":I
    :goto_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    move-object v1, v15

    move/from16 v2, v19

    goto/16 :goto_0

    .end local v15    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v19    # "$i$f$forEach":I
    .local v1, "this_$iv":Landroidx/collection/SieveCache;
    .restart local v2    # "$i$f$forEach":I
    :cond_4
    move-object v15, v1

    move/from16 v19, v2

    .line 1661
    .end local v1    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v2    # "$i$f$forEach":I
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v19    # "$i$f$forEach":I
    :cond_5
    move/from16 v16, v0

    .line 1662
    .end local v0    # "hash":I
    .end local v5    # "this_$iv$iv":Landroidx/collection/SieveCache;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    .restart local v16    # "hash":I
    :cond_6
    nop

    .line 1057
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v15    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v19    # "$i$f$forEach":I
    return v16
.end method

.method public final isEmpty()Z
    .locals 1

    .line 180
    iget v0, p0, Landroidx/collection/SieveCache;->_count:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isNotEmpty()Z
    .locals 1

    .line 183
    iget v0, p0, Landroidx/collection/SieveCache;->_count:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final minusAssign(Landroidx/collection/ObjectList;)V
    .locals 8
    .param p1, "keys"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TK;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 491
    .local v0, "$i$f$minusAssign":I
    move-object v1, p1

    .local v1, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v2, 0x0

    .line 1283
    .local v2, "$i$f$forEach":I
    nop

    .line 1284
    iget-object v3, v1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 1285
    .local v3, "content$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "i$iv":I
    iget v5, v1, Landroidx/collection/ObjectList;->_size:I

    :goto_0
    if-ge v4, v5, :cond_0

    .line 1286
    aget-object v6, v3, v4

    .local v6, "key":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 491
    .local v7, "$i$a$-forEach-SieveCache$minusAssign$2":I
    invoke-virtual {p0, v6}, Landroidx/collection/SieveCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1286
    .end local v6    # "key":Ljava/lang/Object;
    .end local v7    # "$i$a$-forEach-SieveCache$minusAssign$2":I
    nop

    .line 1285
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1288
    .end local v4    # "i$iv":I
    :cond_0
    nop

    .line 492
    .end local v1    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "content$iv":[Ljava/lang/Object;
    return-void
.end method

.method public final minusAssign(Landroidx/collection/ScatterSet;)V
    .locals 20
    .param p1, "keys"    # Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TK;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "keys"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 486
    .local v0, "$i$f$minusAssign":I
    move-object/from16 v2, p1

    .local v2, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v3, 0x0

    .line 1258
    .local v3, "$i$f$forEach":I
    nop

    .line 1259
    iget-object v4, v2, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1260
    .local v4, "elements$iv":[Ljava/lang/Object;
    move-object v5, v2

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 1261
    .local v6, "$i$f$forEachIndex":I
    nop

    .line 1262
    iget-object v7, v5, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1263
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1265
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_4

    .line 1266
    :goto_0
    aget-wide v10, v7, v9

    .line 1267
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 1268
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move v15, v0

    .end local v0    # "$i$f$minusAssign":I
    .local v15, "$i$f$minusAssign":I
    not-long v0, v12

    const/16 v16, 0x7

    shl-long v0, v0, v16

    and-long/2addr v0, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v16

    .line 1267
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v16

    if-eqz v0, :cond_3

    .line 1269
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1270
    .local v0, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v0, :cond_2

    .line 1271
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1272
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v13, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1271
    .end local v13    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_1

    .line 1273
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1274
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v16, 0x0

    .line 1260
    .local v16, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    move/from16 v17, v1

    aget-object v1, v4, v14

    .local v1, "key":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 486
    .local v18, "$i$a$-forEach-SieveCache$minusAssign$1":I
    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v19, "this_$iv":Landroidx/collection/ScatterSet;
    invoke-virtual {v2, v1}, Landroidx/collection/SieveCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1260
    .end local v1    # "key":Ljava/lang/Object;
    .end local v18    # "$i$a$-forEach-SieveCache$minusAssign$1":I
    nop

    .line 1274
    .end local v14    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_3

    .line 1271
    .end local v13    # "index$iv$iv":I
    .end local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_1
    move/from16 v17, v1

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .line 1276
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_3
    shr-long v10, v10, v17

    .line 1270
    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v17

    move-object/from16 v2, v19

    goto :goto_1

    .end local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_2
    move/from16 v17, v1

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .line 1278
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "j$iv$iv":I
    .restart local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    if-ne v0, v1, :cond_6

    goto :goto_4

    .line 1267
    .end local v0    # "bitCount$iv$iv":I
    .end local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_3
    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .line 1265
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v10    # "slot$iv$iv":J
    .restart local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move v0, v15

    move-object/from16 v2, v19

    goto :goto_0

    .end local v15    # "$i$f$minusAssign":I
    .end local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v0, "$i$f$minusAssign":I
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move v15, v0

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .line 1281
    .end local v0    # "$i$f$minusAssign":I
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "$i$f$minusAssign":I
    .restart local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_5
    nop

    .line 1282
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "$i$f$forEachIndex":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 487
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "elements$iv":[Ljava/lang/Object;
    .end local v19    # "this_$iv":Landroidx/collection/ScatterSet;
    return-void
.end method

.method public final minusAssign(Ljava/lang/Iterable;)V
    .locals 3
    .param p1, "keys"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TK;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 472
    .local v0, "$i$f$minusAssign":I
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 473
    .local v2, "key":Ljava/lang/Object;
    invoke-virtual {p0, v2}, Landroidx/collection/SieveCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 475
    .end local v2    # "key":Ljava/lang/Object;
    :cond_0
    return-void
.end method

.method public final minusAssign(Ljava/lang/Object;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 460
    .local v0, "$i$f$minusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    return-void
.end method

.method public final minusAssign(Lkotlin/sequences/Sequence;)V
    .locals 3
    .param p1, "keys"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+TK;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 479
    .local v0, "$i$f$minusAssign":I
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 480
    .local v2, "key":Ljava/lang/Object;
    invoke-virtual {p0, v2}, Landroidx/collection/SieveCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 482
    .end local v2    # "key":Ljava/lang/Object;
    :cond_0
    return-void
.end method

.method public final minusAssign([Ljava/lang/Object;)V
    .locals 4
    .param p1, "keys"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TK;)V"
        }
    .end annotation

    const-string/jumbo v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 465
    .local v0, "$i$f$minusAssign":I
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 466
    .local v3, "key":Ljava/lang/Object;
    invoke-virtual {p0, v3}, Landroidx/collection/SieveCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .end local v3    # "key":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 468
    :cond_0
    return-void
.end method

.method public final none()Z
    .locals 1

    .line 177
    iget v0, p0, Landroidx/collection/SieveCache;->_count:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final plusAssign(Landroidx/collection/ScatterMap;)V
    .locals 1
    .param p1, "from"    # Landroidx/collection/ScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 396
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->putAll(Landroidx/collection/ScatterMap;)V

    return-void
.end method

.method public final plusAssign(Landroidx/collection/SieveCache;)V
    .locals 1
    .param p1, "from"    # Landroidx/collection/SieveCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/SieveCache<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 403
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->putAll(Landroidx/collection/SieveCache;)V

    return-void
.end method

.method public final plusAssign(Ljava/lang/Iterable;)V
    .locals 1
    .param p1, "pairs"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lkotlin/Pair<",
            "+TK;+TV;>;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 375
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->putAll(Ljava/lang/Iterable;)V

    return-void
.end method

.method public final plusAssign(Ljava/util/Map;)V
    .locals 1
    .param p1, "from"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;+TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 389
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final plusAssign(Lkotlin/Pair;)V
    .locals 5
    .param p1, "pair"    # Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 358
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    .local v1, "key$iv":Ljava/lang/Object;
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v4, 0x0

    .line 1236
    .local v4, "$i$f$set":I
    invoke-virtual {v3, v1, v2}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1237
    nop

    .line 359
    .end local v1    # "key$iv":Ljava/lang/Object;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v4    # "$i$f$set":I
    return-void
.end method

.method public final plusAssign(Lkotlin/sequences/Sequence;)V
    .locals 1
    .param p1, "pairs"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+",
            "Lkotlin/Pair<",
            "+TK;+TV;>;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 382
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->putAll(Lkotlin/sequences/Sequence;)V

    return-void
.end method

.method public final plusAssign([Lkotlin/Pair;)V
    .locals 1
    .param p1, "pairs"    # [Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/Pair<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 368
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->putAll([Lkotlin/Pair;)V

    return-void
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string/jumbo v3, "key"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "value"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    invoke-direct/range {p0 .. p1}, Landroidx/collection/SieveCache;->findInsertIndex(Ljava/lang/Object;)I

    move-result v3

    .line 1154
    .local v3, "index":I
    const/4 v4, 0x0

    .line 269
    .local v4, "$i$a$-let-SieveCache$put$index$1":I
    if-gez v3, :cond_0

    not-int v5, v3

    move v3, v5

    .line 270
    .end local v4    # "$i$a$-let-SieveCache$put$index$1":I
    :cond_0
    iget-object v4, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aget-object v4, v4, v3

    .line 272
    .local v4, "previousValue":Ljava/lang/Object;
    iget-object v5, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aput-object v2, v5, v3

    .line 273
    iget-object v5, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    aput-object v1, v5, v3

    .line 275
    iget v5, v0, Landroidx/collection/SieveCache;->_size:I

    iget-object v6, v0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    add-int/2addr v5, v6

    iput v5, v0, Landroidx/collection/SieveCache;->_size:I

    .line 277
    if-eqz v4, :cond_1

    .line 278
    iget v5, v0, Landroidx/collection/SieveCache;->_size:I

    iget-object v6, v0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v1, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    sub-int/2addr v5, v6

    iput v5, v0, Landroidx/collection/SieveCache;->_size:I

    .line 279
    iget-object v5, v0, Landroidx/collection/SieveCache;->onEntryRemoved:Lkotlin/jvm/functions/Function4;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v5, v1, v4, v2, v6}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    iget v5, v0, Landroidx/collection/SieveCache;->_maxSize:I

    invoke-virtual {v0, v5}, Landroidx/collection/SieveCache;->trimToSize(I)V

    .line 281
    return-object v4

    .line 286
    :cond_1
    iget v5, v0, Landroidx/collection/SieveCache;->_maxSize:I

    invoke-virtual {v0, v5}, Landroidx/collection/SieveCache;->trimToSize(I)V

    .line 288
    move-object/from16 v5, p0

    .local v5, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v6, 0x0

    .line 1163
    .local v6, "$i$f$moveNodeToHead":I
    iget-object v7, v5, Landroidx/collection/SieveCache;->nodes:[J

    iget v8, v5, Landroidx/collection/SieveCache;->head:I

    .local v8, "next$iv$iv":I
    const/4 v9, 0x0

    .line 1164
    .local v9, "$i$f$createLinkToNext":I
    int-to-long v10, v8

    const-wide/32 v12, 0x7fffffff

    and-long/2addr v10, v12

    const-wide v14, 0x3fffffff80000000L    # 1.9999995231628418

    or-long v8, v10, v14

    .end local v8    # "next$iv$iv":I
    .end local v9    # "$i$f$createLinkToNext":I
    aput-wide v8, v7, v3

    .line 1165
    iget v7, v5, Landroidx/collection/SieveCache;->head:I

    const v8, 0x7fffffff

    if-eq v7, v8, :cond_2

    .line 1166
    iget-object v7, v5, Landroidx/collection/SieveCache;->nodes:[J

    iget v9, v5, Landroidx/collection/SieveCache;->head:I

    iget-object v10, v5, Landroidx/collection/SieveCache;->nodes:[J

    iget v11, v5, Landroidx/collection/SieveCache;->head:I

    aget-wide v14, v10, v11

    .local v14, "node$iv$iv":J
    const/4 v10, 0x0

    .line 1167
    .local v10, "$i$f$setLinkToPrevious":I
    const-wide v16, -0x3fffffff80000001L    # -2.000000953674316

    and-long v16, v14, v16

    move-wide/from16 v18, v12

    int-to-long v12, v3

    and-long v11, v12, v18

    const/16 v13, 0x1f

    shl-long/2addr v11, v13

    or-long v10, v16, v11

    .end local v10    # "$i$f$setLinkToPrevious":I
    .end local v14    # "node$iv$iv":J
    aput-wide v10, v7, v9

    .line 1168
    :cond_2
    iput v3, v5, Landroidx/collection/SieveCache;->head:I

    .line 1170
    iget v7, v5, Landroidx/collection/SieveCache;->tail:I

    if-ne v7, v8, :cond_3

    .line 1171
    iput v3, v5, Landroidx/collection/SieveCache;->tail:I

    .line 1173
    :cond_3
    nop

    .line 290
    .end local v5    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v6    # "$i$f$moveNodeToHead":I
    return-object v4
.end method

.method public final putAll(Landroidx/collection/ScatterMap;)V
    .locals 23
    .param p1, "from"    # Landroidx/collection/ScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    move-object/from16 v0, p1

    .local v0, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 1184
    .local v2, "$i$f$forEach":I
    iget-object v3, v0, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 1185
    .local v3, "k$iv":[Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1187
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v0

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 1188
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1189
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1191
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_4

    .line 1192
    :goto_0
    aget-wide v10, v7, v9

    .line 1193
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 1194
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move-object v15, v0

    .end local v0    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v15, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v0, v12

    const/16 v16, 0x7

    shl-long v0, v0, v16

    and-long/2addr v0, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v16

    .line 1193
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v16

    if-eqz v0, :cond_3

    .line 1195
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1196
    .local v0, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v0, :cond_2

    .line 1197
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1198
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v13, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1197
    .end local v13    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_1

    .line 1199
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1200
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v16, 0x0

    .line 1187
    .local v16, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    move/from16 v17, v1

    aget-object v1, v3, v14

    move/from16 v18, v2

    .end local v2    # "$i$f$forEach":I
    .local v1, "key":Ljava/lang/Object;
    .local v18, "$i$f$forEach":I
    aget-object v2, v4, v14

    .local v2, "value":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 341
    .local v19, "$i$a$-forEach-SieveCache$putAll$2":I
    move-object/from16 v20, p0

    .local v20, "this_$iv":Landroidx/collection/SieveCache;
    const/16 v21, 0x0

    .line 1201
    .local v21, "$i$f$set":I
    move-object/from16 v22, v3

    move-object/from16 v3, v20

    .end local v20    # "this_$iv":Landroidx/collection/SieveCache;
    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    .local v22, "k$iv":[Ljava/lang/Object;
    invoke-virtual {v3, v1, v2}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    nop

    .line 341
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v21    # "$i$f$set":I
    nop

    .line 1187
    .end local v1    # "key":Ljava/lang/Object;
    .end local v2    # "value":Ljava/lang/Object;
    .end local v19    # "$i$a$-forEach-SieveCache$putAll$2":I
    nop

    .line 1200
    .end local v14    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    goto :goto_3

    .line 1197
    .end local v13    # "index$iv$iv":I
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .local v2, "$i$f$forEach":I
    .local v3, "k$iv":[Ljava/lang/Object;
    :cond_1
    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1203
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    :goto_3
    shr-long v10, v10, v17

    .line 1196
    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v17

    move/from16 v2, v18

    move-object/from16 v3, v22

    goto :goto_1

    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    :cond_2
    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1205
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v12    # "j$iv$iv":I
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    if-ne v0, v1, :cond_6

    goto :goto_4

    .line 1193
    .end local v0    # "bitCount$iv$iv":I
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    :cond_3
    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1191
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v10    # "slot$iv$iv":J
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    :goto_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object v0, v15

    move/from16 v2, v18

    move-object/from16 v3, v22

    goto :goto_0

    .end local v15    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .local v0, "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    :cond_4
    move-object v15, v0

    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1208
    .end local v0    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    :cond_5
    nop

    .line 1209
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 342
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v15    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    return-void
.end method

.method public final putAll(Landroidx/collection/SieveCache;)V
    .locals 23
    .param p1, "from"    # Landroidx/collection/SieveCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/SieveCache<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    move-object/from16 v0, p1

    .local v0, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v2, 0x0

    .line 1210
    .local v2, "$i$f$forEach":I
    iget-object v3, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 1211
    .local v3, "k$iv":[Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 1213
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v0

    .local v5, "this_$iv$iv":Landroidx/collection/SieveCache;
    const/4 v6, 0x0

    .line 1214
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/SieveCache;->metadata:[J

    .line 1215
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1217
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_4

    .line 1218
    :goto_0
    aget-wide v10, v7, v9

    .line 1219
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 1220
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move-object v15, v0

    .end local v0    # "this_$iv":Landroidx/collection/SieveCache;
    .local v15, "this_$iv":Landroidx/collection/SieveCache;
    not-long v0, v12

    const/16 v16, 0x7

    shl-long v0, v0, v16

    and-long/2addr v0, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v16

    .line 1219
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v16

    if-eqz v0, :cond_3

    .line 1221
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1222
    .local v0, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v0, :cond_2

    .line 1223
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1224
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v13, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1223
    .end local v13    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_1

    .line 1225
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1226
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v16, 0x0

    .line 1213
    .local v16, "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    move/from16 v17, v1

    aget-object v1, v3, v14

    move/from16 v18, v2

    .end local v2    # "$i$f$forEach":I
    .local v18, "$i$f$forEach":I
    const-string/jumbo v2, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v2, v4, v14

    move-object/from16 v19, v1

    const-string/jumbo v1, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, v19

    .local v1, "key":Ljava/lang/Object;
    .local v2, "value":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 350
    .local v19, "$i$a$-forEach-SieveCache$putAll$3":I
    move-object/from16 v20, p0

    .local v20, "this_$iv":Landroidx/collection/SieveCache;
    const/16 v21, 0x0

    .line 1227
    .local v21, "$i$f$set":I
    move-object/from16 v22, v3

    move-object/from16 v3, v20

    .end local v20    # "this_$iv":Landroidx/collection/SieveCache;
    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    .local v22, "k$iv":[Ljava/lang/Object;
    invoke-virtual {v3, v1, v2}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    nop

    .line 350
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v21    # "$i$f$set":I
    nop

    .line 1213
    .end local v1    # "key":Ljava/lang/Object;
    .end local v2    # "value":Ljava/lang/Object;
    .end local v19    # "$i$a$-forEach-SieveCache$putAll$3":I
    nop

    .line 1226
    .end local v14    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-SieveCache$forEach$1$iv":I
    goto :goto_3

    .line 1223
    .end local v13    # "index$iv$iv":I
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .local v2, "$i$f$forEach":I
    .local v3, "k$iv":[Ljava/lang/Object;
    :cond_1
    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1229
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    :goto_3
    shr-long v10, v10, v17

    .line 1222
    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v17

    move/from16 v2, v18

    move-object/from16 v3, v22

    goto :goto_1

    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    :cond_2
    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1231
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v12    # "j$iv$iv":I
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    if-ne v0, v1, :cond_6

    goto :goto_4

    .line 1219
    .end local v0    # "bitCount$iv$iv":I
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    :cond_3
    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1217
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v10    # "slot$iv$iv":J
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    :goto_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object v0, v15

    move/from16 v2, v18

    move-object/from16 v3, v22

    goto/16 :goto_0

    .end local v15    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    .local v0, "this_$iv":Landroidx/collection/SieveCache;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    :cond_4
    move-object v15, v0

    move/from16 v18, v2

    move-object/from16 v22, v3

    .line 1234
    .end local v0    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v18    # "$i$f$forEach":I
    .restart local v22    # "k$iv":[Ljava/lang/Object;
    :cond_5
    nop

    .line 1235
    .end local v5    # "this_$iv$iv":Landroidx/collection/SieveCache;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 351
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v15    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v18    # "$i$f$forEach":I
    .end local v22    # "k$iv":[Ljava/lang/Object;
    return-void
.end method

.method public final putAll(Ljava/lang/Iterable;)V
    .locals 5
    .param p1, "pairs"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lkotlin/Pair<",
            "+TK;+TV;>;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    .local v2, "key":Ljava/lang/Object;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    .line 311
    .local v1, "value":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v4, 0x0

    .line 1176
    .local v4, "$i$f$set":I
    invoke-virtual {v3, v2, v1}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1177
    nop

    .end local v1    # "value":Ljava/lang/Object;
    .end local v2    # "key":Ljava/lang/Object;
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v4    # "$i$f$set":I
    goto :goto_0

    .line 313
    :cond_0
    return-void
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 9
    .param p1, "from"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;+TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    move-object v0, p1

    .local v0, "$this$forEach$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 1180
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .local v3, "element$iv":Ljava/util/Map$Entry;
    const/4 v4, 0x0

    .line 332
    .local v4, "$i$a$-forEach-SieveCache$putAll$1":I
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    .local v5, "key":Ljava/lang/Object;
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "value":Ljava/lang/Object;
    move-object v7, p0

    .local v7, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v8, 0x0

    .line 1181
    .local v8, "$i$f$set":I
    invoke-virtual {v7, v5, v6}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1182
    nop

    .line 332
    .end local v7    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v8    # "$i$f$set":I
    nop

    .line 1180
    .end local v4    # "$i$a$-forEach-SieveCache$putAll$1":I
    .end local v5    # "key":Ljava/lang/Object;
    .end local v6    # "value":Ljava/lang/Object;
    nop

    .end local v3    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_0

    .line 1183
    :cond_0
    nop

    .line 333
    .end local v0    # "$this$forEach$iv":Ljava/util/Map;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method

.method public final putAll(Lkotlin/sequences/Sequence;)V
    .locals 5
    .param p1, "pairs"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+",
            "Lkotlin/Pair<",
            "+TK;+TV;>;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    .local v2, "key":Ljava/lang/Object;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    .line 322
    .local v1, "value":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v4, 0x0

    .line 1178
    .local v4, "$i$f$set":I
    invoke-virtual {v3, v2, v1}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1179
    nop

    .end local v1    # "value":Ljava/lang/Object;
    .end local v2    # "key":Ljava/lang/Object;
    .end local v3    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v4    # "$i$f$set":I
    goto :goto_0

    .line 324
    :cond_0
    return-void
.end method

.method public final putAll([Lkotlin/Pair;)V
    .locals 6
    .param p1, "pairs"    # [Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/Pair<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    .local v3, "key":Ljava/lang/Object;
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    .line 300
    .local v2, "value":Ljava/lang/Object;
    move-object v4, p0

    .local v4, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v5, 0x0

    .line 1174
    .local v5, "$i$f$set":I
    invoke-virtual {v4, v3, v2}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1175
    nop

    .line 299
    .end local v2    # "value":Ljava/lang/Object;
    .end local v3    # "key":Ljava/lang/Object;
    .end local v4    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v5    # "$i$f$set":I
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 302
    :cond_0
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    invoke-direct {p0, p1}, Landroidx/collection/SieveCache;->findKeyIndex(Ljava/lang/Object;)I

    move-result v0

    .line 414
    .local v0, "index":I
    const/4 v1, 0x0

    if-ltz v0, :cond_1

    .line 416
    invoke-direct {p0, v0}, Landroidx/collection/SieveCache;->removeValueAt(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    return-object v1

    .line 417
    .local v2, "previousValue":Ljava/lang/Object;
    :cond_0
    iget v3, p0, Landroidx/collection/SieveCache;->_size:I

    iget-object v4, p0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, p0, Landroidx/collection/SieveCache;->_size:I

    .line 418
    iget-object v3, p0, Landroidx/collection/SieveCache;->onEntryRemoved:Lkotlin/jvm/functions/Function4;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v3, p1, v2, v1, v4}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    return-object v2

    .line 422
    .end local v2    # "previousValue":Ljava/lang/Object;
    :cond_1
    return-object v1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 5
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 433
    invoke-direct {p0, p1}, Landroidx/collection/SieveCache;->findKeyIndex(Ljava/lang/Object;)I

    move-result v0

    .line 434
    .local v0, "index":I
    const/4 v1, 0x0

    if-ltz v0, :cond_1

    .line 435
    iget-object v2, p0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 436
    invoke-direct {p0, v0}, Landroidx/collection/SieveCache;->removeValueAt(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    return v1

    .line 437
    .local v2, "previousValue":Ljava/lang/Object;
    :cond_0
    iget v3, p0, Landroidx/collection/SieveCache;->_size:I

    iget-object v4, p0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, p1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, p0, Landroidx/collection/SieveCache;->_size:I

    .line 438
    iget-object v3, p0, Landroidx/collection/SieveCache;->onEntryRemoved:Lkotlin/jvm/functions/Function4;

    const/4 v4, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v3, p1, v2, v4, v1}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    const/4 v1, 0x1

    return v1

    .line 442
    .end local v2    # "previousValue":Ljava/lang/Object;
    :cond_1
    return v1
.end method

.method public final removeIf(Lkotlin/jvm/functions/Function2;)V
    .locals 19
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-TV;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "predicate"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/collection/SieveCache;
    const/4 v3, 0x0

    .line 1238
    .local v3, "$i$f$forEachIndexed":I
    iget-object v4, v2, Landroidx/collection/SieveCache;->metadata:[J

    .line 1239
    .local v4, "m$iv":[J
    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    .line 1241
    .local v5, "lastIndex$iv":I
    const/4 v6, 0x0

    .local v6, "i$iv":I
    if-gt v6, v5, :cond_6

    .line 1242
    :goto_0
    aget-wide v7, v4, v6

    .line 1243
    .local v7, "slot$iv":J
    move-wide v9, v7

    .local v9, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v11, 0x0

    .line 1244
    .local v11, "$i$f$maskEmptyOrDeleted":I
    not-long v12, v9

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v9

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v12, v14

    .line 1243
    .end local v9    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v11    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v9, v9, v14

    if-eqz v9, :cond_5

    .line 1245
    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    .line 1246
    .local v9, "bitCount$iv":I
    const/4 v11, 0x0

    .local v11, "j$iv":I
    :goto_1
    if-ge v11, v9, :cond_4

    .line 1247
    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    .local v12, "value$iv$iv":J
    const/4 v14, 0x0

    .line 1248
    .local v14, "$i$f$isFull":I
    const-wide/16 v15, 0x80

    cmp-long v15, v12, v15

    const/16 v16, 0x0

    if-gez v15, :cond_0

    const/4 v15, 0x1

    goto :goto_2

    :cond_0
    move/from16 v15, v16

    .line 1247
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$isFull":I
    :goto_2
    if-eqz v15, :cond_3

    .line 1249
    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    .line 1250
    .local v12, "index$iv":I
    move v13, v12

    .local v13, "index":I
    const/4 v14, 0x0

    .line 448
    .local v14, "$i$a$-forEachIndexed-SieveCache$removeIf$1":I
    iget-object v15, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    aget-object v15, v15, v13

    .line 450
    .local v15, "key":Ljava/lang/Object;
    move/from16 v17, v10

    const-string/jumbo v10, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    aget-object v10, v10, v13

    move-object/from16 v18, v2

    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .local v18, "this_$iv":Landroidx/collection/SieveCache;
    const-string/jumbo v2, "null cannot be cast to non-null type V of androidx.collection.SieveCache"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v15, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 451
    invoke-direct {v0, v13}, Landroidx/collection/SieveCache;->removeValueAt(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    .line 452
    .local v2, "previousValue":Ljava/lang/Object;
    :cond_1
    iget v10, v0, Landroidx/collection/SieveCache;->_size:I

    iget-object v1, v0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    invoke-interface {v1, v15, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int/2addr v10, v1

    iput v10, v0, Landroidx/collection/SieveCache;->_size:I

    .line 453
    iget-object v1, v0, Landroidx/collection/SieveCache;->onEntryRemoved:Lkotlin/jvm/functions/Function4;

    const/4 v10, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v15, v2, v10, v0}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .end local v2    # "previousValue":Ljava/lang/Object;
    :cond_2
    nop

    .line 1250
    .end local v13    # "index":I
    .end local v14    # "$i$a$-forEachIndexed-SieveCache$removeIf$1":I
    .end local v15    # "key":Ljava/lang/Object;
    goto :goto_3

    .line 1247
    .end local v12    # "index$iv":I
    .end local v18    # "this_$iv":Landroidx/collection/SieveCache;
    .local v2, "this_$iv":Landroidx/collection/SieveCache;
    :cond_3
    move-object/from16 v18, v2

    move/from16 v17, v10

    .line 1252
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v18    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_3
    shr-long v7, v7, v17

    .line 1246
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v10, v17

    move-object/from16 v2, v18

    goto :goto_1

    .end local v18    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_4
    move-object/from16 v18, v2

    move/from16 v17, v10

    .line 1254
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v11    # "j$iv":I
    .restart local v18    # "this_$iv":Landroidx/collection/SieveCache;
    move/from16 v0, v17

    if-ne v9, v0, :cond_8

    goto :goto_4

    .line 1243
    .end local v9    # "bitCount$iv":I
    .end local v18    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_5
    move-object/from16 v18, v2

    .line 1241
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v7    # "slot$iv":J
    .restart local v18    # "this_$iv":Landroidx/collection/SieveCache;
    :goto_4
    if-eq v6, v5, :cond_7

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    goto/16 :goto_0

    .end local v18    # "this_$iv":Landroidx/collection/SieveCache;
    .restart local v2    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_6
    move-object/from16 v18, v2

    .line 1257
    .end local v2    # "this_$iv":Landroidx/collection/SieveCache;
    .end local v6    # "i$iv":I
    .restart local v18    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_7
    nop

    .line 456
    .end local v3    # "$i$f$forEachIndexed":I
    .end local v4    # "m$iv":[J
    .end local v5    # "lastIndex$iv":I
    .end local v18    # "this_$iv":Landroidx/collection/SieveCache;
    :cond_8
    return-void
.end method

.method public final resize(I)V
    .locals 0
    .param p1, "maxSize"    # I

    .line 510
    iput p1, p0, Landroidx/collection/SieveCache;->_maxSize:I

    .line 511
    invoke-virtual {p0, p1}, Landroidx/collection/SieveCache;->trimToSize(I)V

    .line 512
    return-void
.end method

.method public final resizeStorage$collection(I)V
    .locals 28
    .param p1, "newCapacity"    # I

    .line 960
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/collection/SieveCache;->metadata:[J

    .line 961
    .local v1, "previousMetadata":[J
    iget-object v2, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 962
    .local v2, "previousKeys":[Ljava/lang/Object;
    iget-object v3, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 963
    .local v3, "previousValues":[Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/SieveCache;->nodes:[J

    .line 964
    .local v4, "previousNodes":[J
    iget v5, v0, Landroidx/collection/SieveCache;->_capacity:I

    .line 969
    .local v5, "previousCapacity":I
    new-array v6, v5, [I

    .line 971
    .local v6, "indexMapping":[I
    invoke-direct/range {p0 .. p1}, Landroidx/collection/SieveCache;->initializeStorage(I)V

    .line 973
    iget-object v7, v0, Landroidx/collection/SieveCache;->metadata:[J

    .line 974
    .local v7, "newMetadata":[J
    iget-object v8, v0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    .line 975
    .local v8, "newKeys":[Ljava/lang/Object;
    iget-object v9, v0, Landroidx/collection/SieveCache;->values:[Ljava/lang/Object;

    .line 976
    .local v9, "newValues":[Ljava/lang/Object;
    iget-object v10, v0, Landroidx/collection/SieveCache;->nodes:[J

    .line 977
    .local v10, "newNodes":[J
    iget v11, v0, Landroidx/collection/SieveCache;->_capacity:I

    .line 979
    .local v11, "capacity":I
    const/4 v12, 0x0

    .local v12, "i":I
    :goto_0
    if-ge v12, v5, :cond_3

    .line 980
    const/4 v13, 0x0

    .line 1600
    .local v13, "$i$f$isFull":I
    const/4 v14, 0x0

    .line 1601
    .local v14, "$i$f$readRawMetadata":I
    shr-int/lit8 v15, v12, 0x3

    aget-wide v15, v1, v15

    and-int/lit8 v17, v12, 0x7

    shl-int/lit8 v17, v17, 0x3

    shr-long v15, v15, v17

    const-wide/16 v17, 0xff

    and-long v14, v15, v17

    .line 1600
    .end local v14    # "$i$f$readRawMetadata":I
    const-wide/16 v19, 0x80

    cmp-long v14, v14, v19

    const/4 v15, 0x0

    if-gez v14, :cond_0

    const/4 v14, 0x1

    goto :goto_1

    :cond_0
    move v14, v15

    .line 980
    .end local v13    # "$i$f$isFull":I
    :goto_1
    if-eqz v14, :cond_2

    .line 981
    aget-object v13, v2, v12

    .line 982
    .local v13, "previousKey":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1602
    .local v14, "$i$f$hash":I
    if-eqz v13, :cond_1

    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v15

    :cond_1
    const v16, -0x3361d2af    # -8.293031E7f

    mul-int v15, v15, v16

    .line 1604
    .local v15, "hash$iv":I
    shl-int/lit8 v16, v15, 0x10

    xor-int v14, v15, v16

    .line 982
    .end local v14    # "$i$f$hash":I
    .end local v15    # "hash$iv":I
    nop

    .line 983
    .local v14, "hash":I
    const/4 v15, 0x0

    .line 1605
    .local v15, "$i$f$h1":I
    ushr-int/lit8 v15, v14, 0x7

    .line 983
    .end local v15    # "$i$f$h1":I
    invoke-direct {v0, v15}, Landroidx/collection/SieveCache;->findFirstAvailableSlot(I)I

    move-result v15

    .line 985
    .local v15, "index":I
    const/16 v16, 0x0

    .line 1606
    .local v16, "$i$f$h2":I
    move-object/from16 v19, v1

    .end local v1    # "previousMetadata":[J
    .local v19, "previousMetadata":[J
    and-int/lit8 v1, v14, 0x7f

    .line 985
    .end local v16    # "$i$f$h2":I
    move-object/from16 v16, v2

    .end local v2    # "previousKeys":[Ljava/lang/Object;
    .local v16, "previousKeys":[Ljava/lang/Object;
    int-to-long v1, v1

    .local v1, "value$iv":J
    const/16 v20, 0x0

    .line 1607
    .local v20, "$i$f$writeMetadata":I
    const/16 v21, 0x0

    .line 1608
    .local v21, "$i$f$writeRawMetadata":I
    shr-int/lit8 v22, v15, 0x3

    .line 1609
    .local v22, "i$iv$iv":I
    and-int/lit8 v23, v15, 0x7

    shl-int/lit8 v23, v23, 0x3

    .line 1612
    .local v23, "b$iv$iv":I
    aget-wide v24, v7, v22

    move-wide/from16 v26, v1

    .end local v1    # "value$iv":J
    .local v26, "value$iv":J
    shl-long v1, v17, v23

    not-long v1, v1

    and-long v1, v24, v1

    shl-long v17, v26, v23

    or-long v1, v1, v17

    aput-wide v1, v7, v22

    .line 1613
    nop

    .line 1614
    .end local v21    # "$i$f$writeRawMetadata":I
    .end local v22    # "i$iv$iv":I
    .end local v23    # "b$iv$iv":I
    add-int/lit8 v1, v15, -0x7

    and-int/2addr v1, v11

    and-int/lit8 v2, v11, 0x7

    add-int/2addr v1, v2

    .line 1615
    nop

    .line 1617
    .local v1, "cloneIndex$iv":I
    shr-int/lit8 v2, v1, 0x3

    shr-int/lit8 v17, v15, 0x3

    aget-wide v17, v7, v17

    aput-wide v17, v7, v2

    .line 1618
    nop

    .line 986
    .end local v1    # "cloneIndex$iv":I
    .end local v20    # "$i$f$writeMetadata":I
    .end local v26    # "value$iv":J
    aput-object v13, v8, v15

    .line 987
    aget-object v1, v3, v12

    aput-object v1, v9, v15

    .line 988
    aget-wide v1, v4, v12

    aput-wide v1, v10, v15

    .line 990
    aput v15, v6, v12

    goto :goto_2

    .line 980
    .end local v13    # "previousKey":Ljava/lang/Object;
    .end local v14    # "hash":I
    .end local v15    # "index":I
    .end local v16    # "previousKeys":[Ljava/lang/Object;
    .end local v19    # "previousMetadata":[J
    .local v1, "previousMetadata":[J
    .restart local v2    # "previousKeys":[Ljava/lang/Object;
    :cond_2
    move-object/from16 v19, v1

    move-object/from16 v16, v2

    .line 979
    .end local v1    # "previousMetadata":[J
    .end local v2    # "previousKeys":[Ljava/lang/Object;
    .restart local v16    # "previousKeys":[Ljava/lang/Object;
    .restart local v19    # "previousMetadata":[J
    :goto_2
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v16

    move-object/from16 v1, v19

    goto/16 :goto_0

    .line 994
    .end local v12    # "i":I
    .end local v16    # "previousKeys":[Ljava/lang/Object;
    .end local v19    # "previousMetadata":[J
    .restart local v1    # "previousMetadata":[J
    .restart local v2    # "previousKeys":[Ljava/lang/Object;
    :cond_3
    invoke-direct {v0, v6}, Landroidx/collection/SieveCache;->fixupNodes([I)V

    .line 995
    return-void
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 251
    .local v0, "$i$f$set":I
    invoke-virtual {p0, p1, p2}, Landroidx/collection/SieveCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1091
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SieveCache[maxSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/collection/SieveCache;->_maxSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/collection/SieveCache;->_size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", capacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/collection/SieveCache;->_capacity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/collection/SieveCache;->_count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final trimToSize(I)V
    .locals 6
    .param p1, "maxSize"    # I

    .line 522
    nop

    :goto_0
    nop

    .line 523
    iget v0, p0, Landroidx/collection/SieveCache;->_size:I

    if-le v0, p1, :cond_3

    invoke-virtual {p0}, Landroidx/collection/SieveCache;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 527
    :cond_0
    invoke-direct {p0}, Landroidx/collection/SieveCache;->findEvictionCandidate()I

    move-result v0

    .line 528
    .local v0, "candidate":I
    const v1, 0x7fffffff

    if-ne v0, v1, :cond_1

    return-void

    .line 530
    :cond_1
    iget-object v1, p0, Landroidx/collection/SieveCache;->keys:[Ljava/lang/Object;

    aget-object v1, v1, v0

    const-string/jumbo v2, "null cannot be cast to non-null type K of androidx.collection.SieveCache"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .local v1, "key":Ljava/lang/Object;
    invoke-direct {p0, v0}, Landroidx/collection/SieveCache;->removeValueAt(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 535
    .local v2, "value":Ljava/lang/Object;
    :cond_2
    iget v3, p0, Landroidx/collection/SieveCache;->_size:I

    iget-object v4, p0, Landroidx/collection/SieveCache;->sizeOf:Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, p0, Landroidx/collection/SieveCache;->_size:I

    .line 536
    iget-object v3, p0, Landroidx/collection/SieveCache;->onEntryRemoved:Lkotlin/jvm/functions/Function4;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v3, v1, v2, v5, v4}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 524
    .end local v0    # "candidate":I
    .end local v1    # "key":Ljava/lang/Object;
    .end local v2    # "value":Ljava/lang/Object;
    :cond_3
    :goto_1
    return-void
.end method
