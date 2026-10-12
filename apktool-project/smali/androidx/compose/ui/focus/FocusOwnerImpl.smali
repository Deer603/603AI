.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "FocusOwnerImpl.kt"

# interfaces
.implements Landroidx/compose/ui/focus/FocusOwner;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 11 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 12 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 13 ObjectList.kt\nandroidx/collection/ObjectList\n+ 14 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,534:1\n451#1:638\n452#1:659\n454#1:705\n440#1:780\n441#1:856\n442#1:863\n443#1,2:910\n445#1:958\n446#1:965\n451#1:967\n452#1:988\n454#1:1034\n440#1:1036\n441#1:1112\n442#1:1119\n443#1,2:1166\n445#1:1214\n446#1:1221\n451#1:1223\n452#1:1244\n454#1:1290\n440#1:1292\n441#1:1368\n442#1:1375\n443#1,2:1422\n445#1:1470\n446#1:1477\n68#2,5:535\n73#2,8:543\n52#2,4:551\n56#2,4:558\n1#3:540\n1#3:555\n1#3:1754\n641#4,2:541\n641#4,2:556\n119#5:562\n131#5:637\n131#5:706\n131#5:779\n143#5:966\n143#5:1035\n135#5:1222\n135#5:1291\n119#5:1727\n131#5:1728\n119#5:1749\n247#6,5:563\n90#6:568\n91#6,8:574\n437#6,6:582\n447#6,2:589\n449#6,8:594\n457#6,9:605\n466#6,8:617\n100#6,7:625\n251#6:639\n90#6:640\n91#6,8:646\n437#6,5:654\n442#6:660\n447#6,2:662\n449#6,8:667\n457#6,9:678\n466#6,8:690\n100#6,7:698\n277#6:707\n247#6,5:708\n90#6:713\n91#6,8:719\n437#6,5:727\n278#6:732\n442#6:733\n447#6,2:735\n449#6,8:740\n457#6,9:751\n466#6,8:763\n100#6,7:771\n280#6:778\n268#6,2:781\n247#6,5:783\n90#6:788\n91#6,8:794\n437#6,5:802\n270#6,3:807\n442#6:810\n447#6,2:812\n449#6,8:817\n457#6,9:828\n466#6,8:840\n100#6,7:848\n273#6:855\n437#6,12:864\n449#6,8:879\n457#6,9:890\n466#6,8:902\n437#6,12:912\n449#6,8:927\n457#6,9:938\n466#6,8:950\n251#6:968\n90#6:969\n91#6,8:975\n437#6,5:983\n442#6:989\n447#6,2:991\n449#6,8:996\n457#6,9:1007\n466#6,8:1019\n100#6,7:1027\n268#6,2:1037\n247#6,5:1039\n90#6:1044\n91#6,8:1050\n437#6,5:1058\n270#6,3:1063\n442#6:1066\n447#6,2:1068\n449#6,8:1073\n457#6,9:1084\n466#6,8:1096\n100#6,7:1104\n273#6:1111\n437#6,12:1120\n449#6,8:1135\n457#6,9:1146\n466#6,8:1158\n437#6,12:1168\n449#6,8:1183\n457#6,9:1194\n466#6,8:1206\n251#6:1224\n90#6:1225\n91#6,8:1231\n437#6,5:1239\n442#6:1245\n447#6,2:1247\n449#6,8:1252\n457#6,9:1263\n466#6,8:1275\n100#6,7:1283\n268#6,2:1293\n247#6,5:1295\n90#6:1300\n91#6,8:1306\n437#6,5:1314\n270#6,3:1319\n442#6:1322\n447#6,2:1324\n449#6,8:1329\n457#6,9:1340\n466#6,8:1352\n100#6,7:1360\n273#6:1367\n437#6,12:1376\n449#6,8:1391\n457#6,9:1402\n466#6,8:1414\n437#6,12:1424\n449#6,8:1439\n457#6,9:1450\n466#6,8:1462\n268#6,2:1478\n247#6,5:1480\n90#6:1485\n91#6,8:1491\n437#6,5:1499\n270#6,3:1504\n442#6:1507\n447#6,2:1509\n449#6,8:1514\n457#6,9:1525\n466#6,8:1537\n100#6,7:1545\n273#6:1552\n437#6,6:1559\n447#6,2:1566\n449#6,8:1571\n457#6,9:1582\n466#6,8:1594\n437#6,6:1602\n447#6,2:1609\n449#6,8:1614\n457#6,9:1625\n466#6,8:1637\n251#6:1651\n90#6:1652\n91#6,8:1658\n437#6,6:1666\n447#6,2:1673\n449#6,8:1678\n457#6,9:1689\n466#6,8:1701\n100#6,7:1709\n202#6,8:1730\n210#6,6:1743\n217#6,3:1751\n56#7,5:569\n56#7,5:641\n56#7,5:714\n56#7,5:789\n56#7,5:970\n56#7,5:1045\n56#7,5:1226\n56#7,5:1301\n56#7,5:1486\n56#7,5:1653\n102#7,5:1722\n56#7,5:1738\n246#8:588\n246#8:661\n246#8:734\n246#8:811\n246#8:990\n246#8:1067\n246#8:1246\n246#8:1323\n246#8:1508\n246#8:1565\n246#8:1608\n246#8:1672\n246#8:1750\n240#9,3:591\n243#9,3:614\n240#9,3:664\n243#9,3:687\n240#9,3:737\n243#9,3:760\n240#9,3:814\n243#9,3:837\n240#9,3:876\n243#9,3:899\n240#9,3:924\n243#9,3:947\n240#9,3:993\n243#9,3:1016\n240#9,3:1070\n243#9,3:1093\n240#9,3:1132\n243#9,3:1155\n240#9,3:1180\n243#9,3:1203\n240#9,3:1249\n243#9,3:1272\n240#9,3:1326\n243#9,3:1349\n240#9,3:1388\n243#9,3:1411\n240#9,3:1436\n243#9,3:1459\n240#9,3:1511\n243#9,3:1534\n240#9,3:1568\n243#9,3:1591\n240#9,3:1611\n243#9,3:1634\n240#9,3:1675\n243#9,3:1698\n1101#10:602\n1083#10,2:603\n1101#10:675\n1083#10,2:676\n1101#10:748\n1083#10,2:749\n1101#10:825\n1083#10,2:826\n1101#10:887\n1083#10,2:888\n1101#10:935\n1083#10,2:936\n1101#10:1004\n1083#10,2:1005\n1101#10:1081\n1083#10,2:1082\n1101#10:1143\n1083#10,2:1144\n1101#10:1191\n1083#10,2:1192\n1101#10:1260\n1083#10,2:1261\n1101#10:1337\n1083#10,2:1338\n1101#10:1399\n1083#10,2:1400\n1101#10:1447\n1083#10,2:1448\n1101#10:1522\n1083#10,2:1523\n1101#10:1579\n1083#10,2:1580\n1101#10:1622\n1083#10,2:1623\n1101#10:1686\n1083#10,2:1687\n26#11,5:632\n52#12,6:857\n34#12,6:959\n52#12,6:1113\n34#12,6:1215\n52#12,6:1369\n34#12,6:1471\n52#12,6:1553\n34#12,6:1645\n287#13,6:1716\n55#14:1729\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n342#1:638\n342#1:659\n342#1:705\n345#1:780\n345#1:856\n345#1:863\n345#1:910,2\n345#1:958\n345#1:965\n368#1:967\n368#1:988\n368#1:1034\n370#1:1036\n370#1:1112\n370#1:1119\n370#1:1166,2\n370#1:1214\n370#1:1221\n391#1:1223\n391#1:1244\n391#1:1290\n393#1:1292\n393#1:1368\n393#1:1375\n393#1:1422,2\n393#1:1470\n393#1:1477\n161#1:535,5\n161#1:543,8\n200#1:551,4\n200#1:558,4\n161#1:540\n200#1:555\n161#1:541,2\n200#1:556,2\n239#1:562\n342#1:637\n343#1:706\n346#1:779\n368#1:966\n371#1:1035\n391#1:1222\n394#1:1291\n491#1:1727\n491#1:1728\n492#1:1749\n239#1:563,5\n239#1:568\n239#1:574,8\n239#1:582,6\n239#1:589,2\n239#1:594,8\n239#1:605,9\n239#1:617,8\n239#1:625,7\n342#1:639\n342#1:640\n342#1:646,8\n342#1:654,5\n342#1:660\n342#1:662,2\n342#1:667,8\n342#1:678,9\n342#1:690,8\n342#1:698,7\n343#1:707\n343#1:708,5\n343#1:713\n343#1:719,8\n343#1:727,5\n343#1:732\n343#1:733\n343#1:735,2\n343#1:740,8\n343#1:751,9\n343#1:763,8\n343#1:771,7\n343#1:778\n345#1:781,2\n345#1:783,5\n345#1:788\n345#1:794,8\n345#1:802,5\n345#1:807,3\n345#1:810\n345#1:812,2\n345#1:817,8\n345#1:828,9\n345#1:840,8\n345#1:848,7\n345#1:855\n345#1:864,12\n345#1:879,8\n345#1:890,9\n345#1:902,8\n345#1:912,12\n345#1:927,8\n345#1:938,9\n345#1:950,8\n368#1:968\n368#1:969\n368#1:975,8\n368#1:983,5\n368#1:989\n368#1:991,2\n368#1:996,8\n368#1:1007,9\n368#1:1019,8\n368#1:1027,7\n370#1:1037,2\n370#1:1039,5\n370#1:1044\n370#1:1050,8\n370#1:1058,5\n370#1:1063,3\n370#1:1066\n370#1:1068,2\n370#1:1073,8\n370#1:1084,9\n370#1:1096,8\n370#1:1104,7\n370#1:1111\n370#1:1120,12\n370#1:1135,8\n370#1:1146,9\n370#1:1158,8\n370#1:1168,12\n370#1:1183,8\n370#1:1194,9\n370#1:1206,8\n391#1:1224\n391#1:1225\n391#1:1231,8\n391#1:1239,5\n391#1:1245\n391#1:1247,2\n391#1:1252,8\n391#1:1263,9\n391#1:1275,8\n391#1:1283,7\n393#1:1293,2\n393#1:1295,5\n393#1:1300\n393#1:1306,8\n393#1:1314,5\n393#1:1319,3\n393#1:1322\n393#1:1324,2\n393#1:1329,8\n393#1:1340,9\n393#1:1352,8\n393#1:1360,7\n393#1:1367\n393#1:1376,12\n393#1:1391,8\n393#1:1402,9\n393#1:1414,8\n393#1:1424,12\n393#1:1439,8\n393#1:1450,9\n393#1:1462,8\n440#1:1478,2\n440#1:1480,5\n440#1:1485\n440#1:1491,8\n440#1:1499,5\n440#1:1504,3\n440#1:1507\n440#1:1509,2\n440#1:1514,8\n440#1:1525,9\n440#1:1537,8\n440#1:1545,7\n440#1:1552\n442#1:1559,6\n442#1:1566,2\n442#1:1571,8\n442#1:1582,9\n442#1:1594,8\n444#1:1602,6\n444#1:1609,2\n444#1:1614,8\n444#1:1625,9\n444#1:1637,8\n451#1:1651\n451#1:1652\n451#1:1658,8\n451#1:1666,6\n451#1:1673,2\n451#1:1678,8\n451#1:1689,9\n451#1:1701,8\n451#1:1709,7\n491#1:1730,8\n491#1:1743,6\n491#1:1751,3\n239#1:569,5\n342#1:641,5\n343#1:714,5\n345#1:789,5\n368#1:970,5\n370#1:1045,5\n391#1:1226,5\n393#1:1301,5\n440#1:1486,5\n451#1:1653,5\n483#1:1722,5\n491#1:1738,5\n239#1:588\n342#1:661\n343#1:734\n345#1:811\n368#1:990\n370#1:1067\n391#1:1246\n393#1:1323\n440#1:1508\n442#1:1565\n444#1:1608\n451#1:1672\n492#1:1750\n239#1:591,3\n239#1:614,3\n342#1:664,3\n342#1:687,3\n343#1:737,3\n343#1:760,3\n345#1:814,3\n345#1:837,3\n345#1:876,3\n345#1:899,3\n345#1:924,3\n345#1:947,3\n368#1:993,3\n368#1:1016,3\n370#1:1070,3\n370#1:1093,3\n370#1:1132,3\n370#1:1155,3\n370#1:1180,3\n370#1:1203,3\n391#1:1249,3\n391#1:1272,3\n393#1:1326,3\n393#1:1349,3\n393#1:1388,3\n393#1:1411,3\n393#1:1436,3\n393#1:1459,3\n440#1:1511,3\n440#1:1534,3\n442#1:1568,3\n442#1:1591,3\n444#1:1611,3\n444#1:1634,3\n451#1:1675,3\n451#1:1698,3\n239#1:602\n239#1:603,2\n342#1:675\n342#1:676,2\n343#1:748\n343#1:749,2\n345#1:825\n345#1:826,2\n345#1:887\n345#1:888,2\n345#1:935\n345#1:936,2\n368#1:1004\n368#1:1005,2\n370#1:1081\n370#1:1082,2\n370#1:1143\n370#1:1144,2\n370#1:1191\n370#1:1192,2\n391#1:1260\n391#1:1261,2\n393#1:1337\n393#1:1338,2\n393#1:1399\n393#1:1400,2\n393#1:1447\n393#1:1448,2\n440#1:1522\n440#1:1523,2\n442#1:1579\n442#1:1580,2\n444#1:1622\n444#1:1623,2\n451#1:1686\n451#1:1687,2\n331#1:632,5\n345#1:857,6\n345#1:959,6\n370#1:1113,6\n370#1:1215,6\n393#1:1369,6\n393#1:1471,6\n441#1:1553,6\n445#1:1645,6\n477#1:1716,6\n491#1:1729\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u00aa\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0004\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\u0002\u0010\u0014J\u0010\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000eH\u0016J\u001a\u00108\u001a\u00020\u000e2\u0008\u0008\u0002\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0002J2\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010>J\u001a\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010CJ(\u0010D\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020A2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008F\u0010GJ\u001e\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020J2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u0016H\u0002J:\u0010L\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0010M\u001a\u0004\u0018\u00010\u000c2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008O\u0010PJ\n\u0010Q\u001a\u0004\u0018\u00010\u000cH\u0016J\u0008\u0010R\u001a\u00020\u0005H\u0002J\u001a\u0010S\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008T\u0010UJ\u0008\u0010V\u001a\u00020\u0005H\u0016J$\u0010W\u001a\u00020\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008XJ\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\\H\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0016H\u0016J\u0008\u0010]\u001a\u00020\u0005H\u0016J$\u0010^\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008_\u0010`J\u001a\u0010a\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008b\u0010CJ\u000e\u0010c\u001a\u0004\u0018\u00010d*\u00020eH\u0002J3\u0010f\u001a\u0004\u0018\u0001Hg\"\n\u0008\u0000\u0010g\u0018\u0001*\u00020h*\u00020e2\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u0002Hg0jH\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008k\u0010lJg\u0010m\u001a\u00020\u0005\"\n\u0008\u0000\u0010g\u0018\u0001*\u00020e*\u00020e2\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u0002Hg0j2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u0002Hg\u0012\u0004\u0012\u00020\u00050\u00032\u000c\u0010o\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u0002Hg\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008q\u0010rR(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R$\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020*0)X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010\u0019\"\u0004\u00083\u0010\u001bR\u0014\u00104\u001a\u0002058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006s"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusOwnerImpl;",
        "Landroidx/compose/ui/focus/FocusOwner;",
        "onRequestApplyChangesListener",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "",
        "onRequestFocusForOwner",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "Lkotlin/ParameterName;",
        "name",
        "focusDirection",
        "Landroidx/compose/ui/geometry/Rect;",
        "previouslyFocusedRect",
        "",
        "onMoveFocusInterop",
        "onClearFocusForOwner",
        "onFocusRectInterop",
        "onLayoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "value",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "activeFocusTargetNode",
        "getActiveFocusTargetNode",
        "()Landroidx/compose/ui/focus/FocusTargetNode;",
        "setActiveFocusTargetNode",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)V",
        "focusInvalidationManager",
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "focusTransactionManager",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "getFocusTransactionManager",
        "()Landroidx/compose/ui/focus/FocusTransactionManager;",
        "isFocusCaptured",
        "()Z",
        "setFocusCaptured",
        "(Z)V",
        "keysCurrentlyDown",
        "Landroidx/collection/MutableLongSet;",
        "listeners",
        "Landroidx/collection/MutableObjectList;",
        "Landroidx/compose/ui/focus/FocusListener;",
        "getListeners",
        "()Landroidx/collection/MutableObjectList;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "rootFocusNode",
        "getRootFocusNode$ui_release",
        "setRootFocusNode$ui_release",
        "rootState",
        "Landroidx/compose/ui/focus/FocusState;",
        "getRootState",
        "()Landroidx/compose/ui/focus/FocusState;",
        "clearFocus",
        "force",
        "forced",
        "refreshFocusEvents",
        "clearOwnerFocus",
        "clearFocus-I7lrPNg",
        "(ZZZI)Z",
        "dispatchInterceptedSoftKeyboardEvent",
        "keyEvent",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "dispatchInterceptedSoftKeyboardEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "dispatchKeyEvent",
        "onFocusedItem",
        "dispatchKeyEvent-YhN2O0w",
        "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z",
        "dispatchRotaryEvent",
        "event",
        "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
        "findFocusTargetNode",
        "focusSearch",
        "focusedRect",
        "onFound",
        "focusSearch-ULY8qGw",
        "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;",
        "getFocusRect",
        "invalidateOwnerFocusState",
        "moveFocus",
        "moveFocus-3ESFkO8",
        "(I)Z",
        "releaseFocus",
        "requestFocusForOwner",
        "requestFocusForOwner-7o62pno",
        "scheduleInvalidation",
        "node",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "scheduleInvalidationForOwner",
        "takeFocus",
        "takeFocus-aToIllA",
        "(ILandroidx/compose/ui/geometry/Rect;)Z",
        "validateKeyEvent",
        "validateKeyEvent-ZmokQxo",
        "lastLocalKeyInputNode",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "nearestAncestorIncludingSelf",
        "T",
        "",
        "type",
        "Landroidx/compose/ui/node/NodeKind;",
        "nearestAncestorIncludingSelf-64DMado",
        "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;",
        "traverseAncestorsIncludingSelf",
        "onPreVisit",
        "onVisit",
        "onPostVisit",
        "traverseAncestorsIncludingSelf-QFhIj7k",
        "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V",
        "ui_release"
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
.field private activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

.field private final focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

.field private final focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

.field private isFocusCaptured:Z

.field private keysCurrentlyDown:Landroidx/collection/MutableLongSet;

.field private final listeners:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/ui/focus/FocusListener;",
            ">;"
        }
    .end annotation
.end field

.field private final modifier:Landroidx/compose/ui/Modifier;

.field private final onClearFocusForOwner:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onFocusRectInterop:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private final onLayoutDirection:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            ">;"
        }
    .end annotation
.end field

.field private final onMoveFocusInterop:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final onRequestFocusForOwner:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "Landroidx/compose/ui/geometry/Rect;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 6
    .param p1, "onRequestApplyChangesListener"    # Lkotlin/jvm/functions/Function1;
    .param p2, "onRequestFocusForOwner"    # Lkotlin/jvm/functions/Function2;
    .param p3, "onMoveFocusInterop"    # Lkotlin/jvm/functions/Function1;
    .param p4, "onClearFocusForOwner"    # Lkotlin/jvm/functions/Function0;
    .param p5, "onFocusRectInterop"    # Lkotlin/jvm/functions/Function0;
    .param p6, "onLayoutDirection"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "-",
            "Landroidx/compose/ui/geometry/Rect;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            ">;)V"
        }
    .end annotation

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onRequestFocusForOwner:Lkotlin/jvm/functions/Function2;

    .line 71
    iput-object p3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lkotlin/jvm/functions/Function1;

    .line 72
    iput-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lkotlin/jvm/functions/Function0;

    .line 73
    iput-object p5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onFocusRectInterop:Lkotlin/jvm/functions/Function0;

    .line 74
    iput-object p6, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lkotlin/jvm/functions/Function0;

    .line 78
    new-instance v0, Landroidx/compose/ui/focus/FocusTargetNode;

    sget-object v1, Landroidx/compose/ui/focus/Focusability;->Companion:Landroidx/compose/ui/focus/Focusability$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/Focusability$Companion;->getNever-LCbbffg()I

    move-result v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 81
    new-instance v0, Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 82
    nop

    .line 83
    new-instance v1, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$1;

    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 84
    new-instance v2, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$2;

    invoke-direct {v2, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$2;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 85
    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$3;

    invoke-direct {v3, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$3;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 81
    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/compose/ui/focus/FocusInvalidationManager;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 88
    new-instance v0, Landroidx/compose/ui/focus/FocusTransactionManager;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 96
    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    check-cast v0, Landroidx/compose/ui/Modifier;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    .line 469
    new-instance v0, Landroidx/collection/MutableObjectList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/collection/MutableObjectList;-><init>(I)V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->listeners:Landroidx/collection/MutableObjectList;

    .line 67
    return-void
.end method

.method public static final synthetic access$invalidateOwnerFocusState(Landroidx/compose/ui/focus/FocusOwnerImpl;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusOwnerImpl;

    .line 67
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->invalidateOwnerFocusState()V

    return-void
.end method

.method private final clearFocus(ZZ)Z
    .locals 32
    .param p1, "forced"    # Z
    .param p2, "refreshFocusEvents"    # Z

    .line 228
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 229
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 230
    return v2

    .line 232
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    .line 233
    .local v0, "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v3, 0x0

    move-object/from16 v4, p0

    invoke-virtual {v4, v3}, Landroidx/compose/ui/focus/FocusOwnerImpl;->setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 234
    if-eqz p2, :cond_16

    if-eqz v0, :cond_16

    .line 235
    nop

    .line 236
    invoke-virtual {v4}, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured()Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v5, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_0

    :cond_2
    sget-object v5, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    :goto_0
    check-cast v5, Landroidx/compose/ui/focus/FocusState;

    .line 237
    sget-object v6, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    check-cast v6, Landroidx/compose/ui/focus/FocusState;

    .line 235
    invoke-virtual {v0, v5, v6}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 239
    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v6, 0x0

    .line 562
    .local v6, "$i$f$getFocusTarget-OLwlOKw":I
    const/16 v7, 0x400

    invoke-static {v7}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v6

    .line 239
    .end local v6    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .line 563
    .local v5, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v6, "type$iv":I
    nop

    .line 565
    const/4 v7, 0x0

    .line 563
    .local v7, "includeSelf$iv":Z
    const/4 v8, 0x0

    .line 567
    .local v8, "$i$f$visitAncestors-Y-YKmho":I
    move v9, v6

    .local v9, "mask$iv$iv":I
    move-object v10, v5

    .local v10, "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v11, 0x0

    .line 568
    .local v11, "$i$f$visitAncestors":I
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v12

    .local v12, "value$iv$iv$iv":Z
    const/4 v13, 0x0

    .line 569
    .local v13, "$i$f$checkPrecondition":I
    nop

    .line 570
    if-nez v12, :cond_3

    .line 571
    const/4 v14, 0x0

    .line 568
    .local v14, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv":I
    nop

    .line 571
    .end local v14    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv":I
    const-string/jumbo v14, "visitAncestors called on an unattached node"

    invoke-static {v14}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 573
    :cond_3
    nop

    .line 574
    .end local v12    # "value$iv$iv$iv":Z
    .end local v13    # "$i$f$checkPrecondition":I
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 575
    .local v12, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 576
    .local v13, "layout$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_1
    if-eqz v13, :cond_15

    .line 577
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v14

    .line 578
    .local v14, "head$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v15

    and-int/2addr v15, v9

    if-eqz v15, :cond_13

    .line 579
    :goto_2
    if-eqz v12, :cond_12

    .line 580
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v15

    and-int/2addr v15, v9

    if-eqz v15, :cond_11

    .line 581
    move-object v15, v12

    .local v15, "it$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 567
    .local v16, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv":I
    move-object/from16 v17, v15

    .local v17, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v18, 0x0

    .line 582
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v19, 0x0

    .line 583
    .local v19, "stack$iv$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .local v20, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v17

    move-object/from16 v3, v20

    .line 584
    .end local v20    # "node$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv":Ljava/lang/Object;
    :goto_3
    if-eqz v3, :cond_10

    .line 585
    instance-of v2, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v2, :cond_4

    .line 586
    move-object v2, v3

    check-cast v2, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v2, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v21, 0x0

    .line 240
    .local v21, "$i$a$-visitAncestors-Y-YKmho$default-FocusOwnerImpl$clearFocus$1":I
    sget-object v22, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    move-object/from16 v1, v22

    check-cast v1, Landroidx/compose/ui/focus/FocusState;

    sget-object v22, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    move-object/from16 v24, v0

    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v24, "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    move-object/from16 v0, v22

    check-cast v0, Landroidx/compose/ui/focus/FocusState;

    invoke-virtual {v2, v1, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 241
    nop

    .line 586
    .end local v2    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v21    # "$i$a$-visitAncestors-Y-YKmho$default-FocusOwnerImpl$clearFocus$1":I
    move-object/from16 v31, v3

    const/4 v3, 0x0

    goto/16 :goto_a

    .line 587
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_4
    move-object/from16 v24, v0

    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    move-object v0, v3

    .local v0, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v1, 0x0

    .line 588
    .local v1, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v2

    and-int/2addr v2, v6

    if-eqz v2, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    .line 587
    .end local v0    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_4
    if-eqz v0, :cond_e

    instance-of v0, v3, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v0, :cond_e

    .line 589
    const/4 v0, 0x0

    .line 590
    .local v0, "count$iv$iv":I
    move-object v1, v3

    check-cast v1, Landroidx/compose/ui/node/DelegatingNode;

    .local v1, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v2, 0x0

    .line 591
    .local v2, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    .line 592
    .local v21, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_5
    if-eqz v21, :cond_d

    .line 593
    move-object/from16 v22, v21

    .local v22, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 594
    .local v25, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v26, v22

    .local v26, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 588
    .local v27, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v28

    and-int v28, v28, v6

    if-eqz v28, :cond_6

    const/16 v26, 0x1

    goto :goto_6

    :cond_6
    const/16 v26, 0x0

    .line 594
    .end local v26    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_6
    if-eqz v26, :cond_c

    .line 595
    add-int/lit8 v0, v0, 0x1

    .line 596
    move-object/from16 v26, v1

    const/4 v1, 0x1

    .end local v1    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v26, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    if-ne v0, v1, :cond_7

    .line 597
    move-object/from16 v3, v22

    move/from16 v30, v2

    move-object/from16 v31, v3

    move-object/from16 v2, v22

    const/4 v3, 0x0

    goto :goto_9

    .line 601
    :cond_7
    if-nez v19, :cond_8

    const/4 v1, 0x0

    .line 602
    .local v1, "$i$f$mutableVectorOf":I
    nop

    .line 603
    move/from16 v27, v0

    .end local v0    # "count$iv$iv":I
    .local v27, "count$iv$iv":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v28, 0x0

    .line 604
    .local v28, "$i$f$MutableVector":I
    move/from16 v29, v1

    .end local v1    # "$i$f$mutableVectorOf":I
    .local v29, "$i$f$mutableVectorOf":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v30, v2

    .end local v2    # "$i$f$forEachImmediateDelegate$ui_release":I
    .local v30, "$i$f$forEachImmediateDelegate$ui_release":I
    new-array v2, v0, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v31, v3

    const/4 v3, 0x0

    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .local v31, "node$iv$iv":Ljava/lang/Object;
    invoke-direct {v1, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 602
    .end local v0    # "capacity$iv$iv$iv$iv":I
    .end local v28    # "$i$f$MutableVector":I
    goto :goto_7

    .line 601
    .end local v27    # "count$iv$iv":I
    .end local v29    # "$i$f$mutableVectorOf":I
    .end local v30    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v31    # "node$iv$iv":Ljava/lang/Object;
    .local v0, "count$iv$iv":I
    .restart local v2    # "$i$f$forEachImmediateDelegate$ui_release":I
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    :cond_8
    move/from16 v27, v0

    move/from16 v30, v2

    move-object/from16 v31, v3

    const/4 v3, 0x0

    .end local v0    # "count$iv$iv":I
    .end local v2    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .restart local v27    # "count$iv$iv":I
    .restart local v30    # "$i$f$forEachImmediateDelegate$ui_release":I
    .restart local v31    # "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v1, v19

    :goto_7
    nop

    .line 605
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v31

    .line 606
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_a

    .line 607
    if-eqz v1, :cond_9

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 608
    :cond_9
    const/4 v2, 0x0

    move-object/from16 v31, v2

    .line 610
    :cond_a
    if-eqz v1, :cond_b

    move-object/from16 v2, v22

    .end local v22    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v2, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .end local v2    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v22    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_b
    move-object/from16 v2, v22

    .line 613
    .end local v0    # "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_8
    move-object/from16 v19, v1

    move/from16 v0, v27

    goto :goto_9

    .line 594
    .end local v26    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "count$iv$iv":I
    .end local v30    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v31    # "node$iv$iv":Ljava/lang/Object;
    .local v0, "count$iv$iv":I
    .local v1, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v2, "$i$f$forEachImmediateDelegate$ui_release":I
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v22    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_c
    move-object/from16 v26, v1

    move/from16 v30, v2

    move-object/from16 v31, v3

    move-object/from16 v2, v22

    const/4 v3, 0x0

    .line 613
    .end local v1    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .end local v22    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v2, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v30    # "$i$f$forEachImmediateDelegate$ui_release":I
    .restart local v31    # "node$iv$iv":Ljava/lang/Object;
    :goto_9
    nop

    .line 593
    .end local v2    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 614
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    move-object/from16 v1, v26

    move/from16 v2, v30

    move-object/from16 v3, v31

    goto :goto_5

    .line 616
    .end local v26    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v30    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v31    # "node$iv$iv":Ljava/lang/Object;
    .restart local v1    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v2, "$i$f$forEachImmediateDelegate$ui_release":I
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    :cond_d
    move-object/from16 v26, v1

    move/from16 v30, v2

    move-object/from16 v31, v3

    const/4 v3, 0x0

    .line 617
    .end local v1    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v2    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .end local v21    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "node$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    .line 619
    move v2, v3

    move-object/from16 v0, v24

    move-object/from16 v3, v31

    const/4 v1, 0x1

    goto/16 :goto_3

    .line 587
    .end local v0    # "count$iv$iv":I
    .end local v31    # "node$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    :cond_e
    move-object/from16 v31, v3

    const/4 v3, 0x0

    .line 622
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .restart local v31    # "node$iv$iv":Ljava/lang/Object;
    :cond_f
    :goto_a
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move v2, v3

    const/4 v1, 0x1

    move-object v3, v0

    move-object/from16 v0, v24

    .end local v31    # "node$iv$iv":Ljava/lang/Object;
    .local v0, "node$iv$iv":Ljava/lang/Object;
    goto/16 :goto_3

    .line 624
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v0, "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    :cond_10
    move-object/from16 v24, v0

    move-object/from16 v31, v3

    move v3, v2

    .line 567
    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    nop

    .line 581
    .end local v15    # "it$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv":I
    goto :goto_b

    .line 580
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_11
    move-object/from16 v24, v0

    move v3, v2

    .line 625
    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_b
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move v2, v3

    move-object/from16 v0, v24

    const/4 v1, 0x1

    const/4 v3, 0x0

    goto/16 :goto_2

    .line 579
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_12
    move-object/from16 v24, v0

    move v3, v2

    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    goto :goto_c

    .line 578
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_13
    move-object/from16 v24, v0

    move v3, v2

    .line 628
    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_c
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 629
    if-eqz v13, :cond_14

    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_d

    :cond_14
    const/4 v0, 0x0

    :goto_d
    move-object v12, v0

    move v2, v3

    move-object/from16 v0, v24

    const/4 v1, 0x1

    const/4 v3, 0x0

    .end local v14    # "head$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_1

    .line 631
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_15
    move-object/from16 v24, v0

    .line 567
    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v9    # "mask$iv$iv":I
    .end local v10    # "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v11    # "$i$f$visitAncestors":I
    .end local v12    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "layout$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    goto :goto_e

    .line 234
    .end local v5    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v6    # "type$iv":I
    .end local v7    # "includeSelf$iv":Z
    .end local v8    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_16
    move-object/from16 v24, v0

    .line 243
    .end local v0    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v24    # "previousActiveFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_e
    const/16 v23, 0x1

    return v23
.end method

.method static synthetic clearFocus$default(Landroidx/compose/ui/focus/FocusOwnerImpl;ZZILjava/lang/Object;)Z
    .locals 0

    .line 227
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)Z

    move-result p0

    return p0
.end method

.method private final findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 463
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    return-object v0
.end method

.method private final invalidateOwnerFocusState()V
    .locals 2

    .line 426
    nop

    .line 427
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 428
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    if-ne v0, v1, :cond_2

    .line 430
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 432
    :cond_2
    return-void
.end method

.method private final lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;
    .locals 16
    .param p1, "$this$lastLocalKeyInputNode"    # Landroidx/compose/ui/node/DelegatableNode;

    .line 490
    const/4 v0, 0x0

    .line 491
    .local v0, "focusedKeyInputNode":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1727
    .local v1, "$i$f$getFocusTarget-OLwlOKw":I
    const/16 v2, 0x400

    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    .line 491
    .end local v1    # "$i$f$getFocusTarget-OLwlOKw":I
    const/4 v3, 0x0

    .line 1728
    .local v3, "$i$f$getKeyInput-OLwlOKw":I
    const/16 v4, 0x2000

    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v3

    .line 491
    .end local v3    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v1, "arg0$iv":I
    .local v3, "other$iv":I
    const/4 v4, 0x0

    .line 1729
    .local v4, "$i$f$or-H91voCI":I
    or-int/2addr v1, v3

    .line 491
    .end local v1    # "arg0$iv":I
    .end local v3    # "other$iv":I
    .end local v4    # "$i$f$or-H91voCI":I
    nop

    .local v1, "mask$iv":I
    move-object/from16 v3, p1

    .local v3, "$this$visitLocalDescendants$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v4, 0x0

    .line 1730
    .local v4, "$i$f$visitLocalDescendants":I
    const/4 v5, 0x0

    .local v5, "includeSelf$iv$iv":Z
    move-object v6, v3

    .local v6, "$this$visitLocalDescendants$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v7, 0x0

    .line 1737
    .local v7, "$i$f$visitLocalDescendants":I
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v8

    .local v8, "value$iv$iv$iv":Z
    const/4 v9, 0x0

    .line 1738
    .local v9, "$i$f$checkPrecondition":I
    nop

    .line 1739
    if-nez v8, :cond_0

    .line 1740
    const/4 v10, 0x0

    .line 1737
    .local v10, "$i$a$-checkPrecondition-DelegatableNodeKt$visitLocalDescendants$1$iv$iv":I
    nop

    .line 1740
    .end local v10    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitLocalDescendants$1$iv$iv":I
    const-string/jumbo v10, "visitLocalDescendants called on an unattached node"

    invoke-static {v10}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1742
    :cond_0
    nop

    .line 1743
    .end local v8    # "value$iv$iv$iv":Z
    .end local v9    # "$i$f$checkPrecondition":I
    invoke-interface {v6}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    .line 1744
    .local v8, "self$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_5

    .line 1745
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    .line 1746
    .local v9, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_0
    if-eqz v9, :cond_4

    .line 1747
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_3

    .line 1748
    move-object v10, v9

    .local v10, "modifierNode":Landroidx/compose/ui/Modifier$Node;
    const/4 v11, 0x0

    .line 492
    .local v11, "$i$a$-visitLocalDescendants-FocusOwnerImpl$lastLocalKeyInputNode$1":I
    const/4 v12, 0x0

    .line 1749
    .local v12, "$i$f$getFocusTarget-OLwlOKw":I
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v12

    .line 492
    .end local v12    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .local v12, "kind$iv":I
    move-object v13, v10

    .local v13, "this_$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1750
    .local v14, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v15

    and-int/2addr v15, v12

    if-eqz v15, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    .line 492
    .end local v12    # "kind$iv":I
    .end local v13    # "this_$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1
    if-eqz v15, :cond_2

    return-object v0

    .line 494
    :cond_2
    move-object v0, v10

    .line 495
    nop

    .line 1748
    .end local v10    # "modifierNode":Landroidx/compose/ui/Modifier$Node;
    .end local v11    # "$i$a$-visitLocalDescendants-FocusOwnerImpl$lastLocalKeyInputNode$1":I
    nop

    .line 1751
    :cond_3
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    goto :goto_0

    .line 1753
    :cond_4
    nop

    .line 1730
    .end local v5    # "includeSelf$iv$iv":Z
    .end local v6    # "$this$visitLocalDescendants$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v7    # "$i$f$visitLocalDescendants":I
    .end local v8    # "self$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_5
    nop

    .line 496
    .end local v1    # "mask$iv":I
    .end local v3    # "$this$visitLocalDescendants$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$visitLocalDescendants":I
    return-object v0
.end method

.method private final synthetic nearestAncestorIncludingSelf-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;
    .locals 29
    .param p1, "$this$nearestAncestorIncludingSelf_u2d64DMado"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p2, "type"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 451
    .local v0, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v1, 0x1

    .local v1, "includeSelf$iv":Z
    move-object/from16 v2, p1

    .local v2, "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v3, 0x0

    .line 1651
    .local v3, "$i$f$visitAncestors-Y-YKmho":I
    move/from16 v4, p2

    .local v4, "mask$iv$iv":I
    move-object v5, v2

    .local v5, "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v6, 0x0

    .line 1652
    .local v6, "$i$f$visitAncestors":I
    invoke-interface {v5}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v7

    .local v7, "value$iv$iv$iv":Z
    const/4 v8, 0x0

    .line 1653
    .local v8, "$i$f$checkPrecondition":I
    nop

    .line 1654
    if-nez v7, :cond_0

    .line 1655
    const/4 v9, 0x0

    .line 1652
    .local v9, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv":I
    nop

    .line 1655
    .end local v9    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv":I
    const-string/jumbo v9, "visitAncestors called on an unattached node"

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    invoke-static {v9}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1657
    :cond_0
    nop

    .line 1658
    .end local v7    # "value$iv$iv$iv":Z
    .end local v8    # "$i$f$checkPrecondition":I
    invoke-interface {v5}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    .line 1659
    .local v7, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v8

    .line 1660
    .local v8, "layout$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v8, :cond_12

    .line 1661
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 1662
    .local v10, "head$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v4

    if-eqz v11, :cond_10

    .line 1663
    :goto_1
    if-eqz v7, :cond_f

    .line 1664
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v4

    if-eqz v11, :cond_e

    .line 1665
    move-object v11, v7

    check-cast v11, Landroidx/compose/ui/Modifier$Node;

    .local v11, "it$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 1651
    .local v12, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv":I
    move-object v13, v11

    .local v13, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1666
    .local v14, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v15, 0x0

    .line 1667
    .local v15, "stack$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .local v16, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v13

    move-object/from16 v9, v16

    const/16 v16, 0x0

    .line 1668
    .end local v16    # "node$iv$iv":Ljava/lang/Object;
    .local v9, "node$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v9, :cond_d

    .line 1669
    move/from16 v17, v0

    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .local v17, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v0, 0x3

    move/from16 v18, v1

    .end local v1    # "includeSelf$iv":Z
    .local v18, "includeSelf$iv":Z
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v0, v9, Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 1670
    move-object v0, v9

    .local v0, "it":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 452
    .local v1, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1":I
    return-object v0

    .line 1671
    .end local v0    # "it":Ljava/lang/Object;
    .end local v1    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1":I
    :cond_1
    move-object v0, v9

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .local v0, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v1, 0x0

    .line 1672
    .local v1, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v19

    and-int v19, v19, p2

    move-object/from16 v20, v0

    .end local v0    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v20, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v19, :cond_2

    const/4 v1, 0x1

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    .line 1671
    .end local v1    # "$i$f$isKind-H91voCI$ui_release":I
    .end local v20    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_3
    if-eqz v1, :cond_b

    instance-of v1, v9, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_b

    .line 1673
    const/4 v1, 0x0

    .line 1674
    .local v1, "count$iv$iv":I
    move-object/from16 v19, v9

    check-cast v19, Landroidx/compose/ui/node/DelegatingNode;

    .local v19, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v20, 0x0

    .line 1675
    .local v20, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    .line 1676
    .local v21, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v21, :cond_a

    .line 1677
    move-object/from16 v0, v21

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .local v0, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 1678
    .local v22, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v23, v0

    .local v23, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v24, 0x0

    .line 1672
    .local v24, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v25

    and-int v25, v25, p2

    if-eqz v25, :cond_3

    const/16 v23, 0x1

    goto :goto_5

    :cond_3
    const/16 v23, 0x0

    .line 1678
    .end local v23    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v23, :cond_9

    .line 1679
    add-int/lit8 v1, v1, 0x1

    .line 1680
    move-object/from16 v23, v2

    const/4 v2, 0x1

    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v23, "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    if-ne v1, v2, :cond_4

    .line 1681
    move-object v9, v0

    move/from16 v27, v3

    move/from16 v28, v4

    const/4 v4, 0x0

    goto :goto_7

    .line 1685
    :cond_4
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    .line 1686
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 1687
    move/from16 v24, v1

    .end local v1    # "count$iv$iv":I
    .local v24, "count$iv$iv":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v25, 0x0

    .line 1688
    .local v25, "$i$f$MutableVector":I
    move/from16 v26, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v26, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v27, v3

    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .local v27, "$i$f$visitAncestors-Y-YKmho":I
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v28, v4

    const/4 v4, 0x0

    .end local v4    # "mask$iv$iv":I
    .local v28, "mask$iv$iv":I
    invoke-direct {v2, v3, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1686
    .end local v1    # "capacity$iv$iv$iv$iv":I
    .end local v25    # "$i$f$MutableVector":I
    nop

    .end local v26    # "$i$f$mutableVectorOf":I
    move-object v1, v2

    check-cast v1, Landroidx/compose/runtime/collection/MutableVector;

    goto :goto_6

    .line 1685
    .end local v24    # "count$iv$iv":I
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .local v1, "count$iv$iv":I
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_5
    move/from16 v24, v1

    move/from16 v27, v3

    move/from16 v28, v4

    const/4 v4, 0x0

    .end local v1    # "count$iv$iv":I
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v24    # "count$iv$iv":I
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_6
    move-object v15, v2

    .line 1689
    move-object v1, v9

    check-cast v1, Landroidx/compose/ui/Modifier$Node;

    .line 1690
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_7

    .line 1691
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1692
    :cond_6
    const/4 v2, 0x0

    move-object v9, v2

    .line 1694
    :cond_7
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_8

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1697
    .end local v1    # "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move/from16 v1, v24

    goto :goto_7

    .line 1678
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v24    # "count$iv$iv":I
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .local v1, "count$iv$iv":I
    .local v2, "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_9
    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/4 v4, 0x0

    .line 1697
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_7
    nop

    .line 1677
    .end local v0    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1698
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto :goto_4

    .line 1700
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_a
    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    .line 1701
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .end local v19    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v20    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v21    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    const/4 v2, 0x1

    if-ne v1, v2, :cond_c

    .line 1703
    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto/16 :goto_2

    .line 1671
    .end local v1    # "count$iv$iv":I
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_b
    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    .line 1706
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :cond_c
    move-object v0, v15

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto/16 :goto_2

    .line 1708
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .local v0, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .local v1, "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_d
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    .line 1651
    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .end local v9    # "node$iv$iv":Ljava/lang/Object;
    .end local v13    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v15    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    nop

    .line 1665
    .end local v11    # "it$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv":I
    goto :goto_8

    .line 1664
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_e
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/16 v16, 0x0

    .line 1709
    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_8
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto/16 :goto_1

    .line 1663
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_f
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/16 v16, 0x0

    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    goto :goto_9

    .line 1662
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_10
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/16 v16, 0x0

    .line 1712
    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_9
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v8

    .line 1713
    if-eqz v8, :cond_11

    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    goto :goto_a

    :cond_11
    move-object/from16 v9, v16

    :goto_a
    move-object v7, v9

    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    .end local v10    # "head$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1715
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_12
    const/16 v16, 0x0

    .line 1651
    .end local v4    # "mask$iv$iv":I
    .end local v5    # "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v6    # "$i$f$visitAncestors":I
    .end local v7    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "layout$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    nop

    .line 454
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    return-object v16
.end method

.method private final synthetic traverseAncestorsIncludingSelf-QFhIj7k(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 35
    .param p1, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p2, "type"    # I
    .param p3, "onPreVisit"    # Lkotlin/jvm/functions/Function1;
    .param p4, "onVisit"    # Lkotlin/jvm/functions/Function0;
    .param p5, "onPostVisit"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/DelegatableNode;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p5

    const/4 v2, 0x0

    .line 440
    .local v2, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object/from16 v3, p1

    .local v3, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v4, 0x0

    .line 1478
    .local v4, "$i$f$ancestors-64DMado":I
    const/4 v5, 0x0

    .line 1479
    .local v5, "result$iv":Ljava/lang/Object;
    move-object v6, v3

    .line 1480
    .local v6, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1482
    const/4 v7, 0x0

    .line 1480
    .local v7, "includeSelf$iv$iv":Z
    const/4 v8, 0x0

    .line 1484
    .local v8, "$i$f$visitAncestors-Y-YKmho":I
    move/from16 v9, p2

    .local v9, "mask$iv$iv$iv":I
    move-object v10, v6

    .local v10, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v11, 0x0

    .line 1485
    .local v11, "$i$f$visitAncestors":I
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v12

    .local v12, "value$iv$iv$iv$iv":Z
    const/4 v13, 0x0

    .line 1486
    .local v13, "$i$f$checkPrecondition":I
    nop

    .line 1487
    if-nez v12, :cond_0

    .line 1488
    const/4 v14, 0x0

    .line 1485
    .local v14, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .line 1488
    .end local v14    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    const-string/jumbo v14, "visitAncestors called on an unattached node"

    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    invoke-static {v14}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1490
    :cond_0
    nop

    .line 1491
    .end local v12    # "value$iv$iv$iv$iv":Z
    .end local v13    # "$i$f$checkPrecondition":I
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1492
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 1493
    .local v13, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    const-string v14, "T"

    if-eqz v13, :cond_13

    .line 1494
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v16

    .line 1495
    .local v16, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v9

    if-eqz v17, :cond_11

    .line 1496
    :goto_1
    if-eqz v12, :cond_10

    .line 1497
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v9

    if-eqz v17, :cond_f

    .line 1498
    move-object/from16 v17, v12

    check-cast v17, Landroidx/compose/ui/Modifier$Node;

    .local v17, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v18, 0x0

    .line 1484
    .local v18, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v19, v17

    .local v19, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 1499
    .local v20, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v21, 0x0

    .line 1500
    .local v21, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .local v22, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    move-object/from16 v15, v22

    .line 1501
    .end local v22    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v15, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v15, :cond_e

    .line 1502
    move/from16 v23, v2

    const/4 v2, 0x3

    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v23, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v2, v15, Ljava/lang/Object;

    if-eqz v2, :cond_2

    .line 1503
    move-object v2, v15

    .local v2, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 1504
    .local v24, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv":I
    if-nez v5, :cond_1

    new-instance v25, Ljava/util/ArrayList;

    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v5, v25

    check-cast v5, Ljava/util/List;

    .line 1505
    :cond_1
    move-object/from16 v25, v3

    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v25, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object v3, v5

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1506
    nop

    .line 1503
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv":I
    move/from16 v29, v4

    goto/16 :goto_8

    .line 1507
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_2
    move-object/from16 v25, v3

    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object v2, v15

    check-cast v2, Landroidx/compose/ui/Modifier$Node;

    .local v2, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v3, 0x0

    .line 1508
    .local v3, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v24

    and-int v24, v24, p2

    if-eqz v24, :cond_3

    const/4 v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    .line 1507
    .end local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_3
    if-eqz v2, :cond_d

    instance-of v2, v15, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v2, :cond_d

    .line 1509
    const/4 v2, 0x0

    .line 1510
    .local v2, "count$iv$iv$iv":I
    move-object v3, v15

    check-cast v3, Landroidx/compose/ui/node/DelegatingNode;

    .local v3, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v24, 0x0

    .line 1511
    .local v24, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v3}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v26

    .line 1512
    .local v26, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v26, :cond_b

    .line 1513
    move-object/from16 v27, v3

    .end local v3    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v27, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    move-object/from16 v3, v26

    check-cast v3, Landroidx/compose/ui/Modifier$Node;

    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v28, 0x0

    .line 1514
    .local v28, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v29, v3

    .local v29, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1508
    .local v30, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, p2

    if-eqz v31, :cond_4

    const/16 v29, 0x1

    goto :goto_5

    :cond_4
    const/16 v29, 0x0

    .line 1514
    .end local v29    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v29, :cond_a

    .line 1515
    add-int/lit8 v2, v2, 0x1

    .line 1516
    move/from16 v29, v4

    const/4 v4, 0x1

    .end local v4    # "$i$f$ancestors-64DMado":I
    .local v29, "$i$f$ancestors-64DMado":I
    if-ne v2, v4, :cond_5

    .line 1517
    move-object v15, v3

    move-object/from16 v33, v5

    goto :goto_7

    .line 1521
    :cond_5
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v4, :cond_6

    const/4 v4, 0x0

    .line 1522
    .local v4, "$i$f$mutableVectorOf":I
    nop

    .line 1523
    move/from16 v30, v2

    .end local v2    # "count$iv$iv$iv":I
    .local v30, "count$iv$iv$iv":I
    const/16 v2, 0x10

    .local v2, "capacity$iv$iv$iv$iv$iv":I
    const/16 v31, 0x0

    .line 1524
    .local v31, "$i$f$MutableVector":I
    move/from16 v32, v4

    .end local v4    # "$i$f$mutableVectorOf":I
    .local v32, "$i$f$mutableVectorOf":I
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v33, v5

    .end local v5    # "result$iv":Ljava/lang/Object;
    .local v33, "result$iv":Ljava/lang/Object;
    new-array v5, v2, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v34, v2

    const/4 v2, 0x0

    .end local v2    # "capacity$iv$iv$iv$iv$iv":I
    .local v34, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v4, v5, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1522
    .end local v31    # "$i$f$MutableVector":I
    .end local v34    # "capacity$iv$iv$iv$iv$iv":I
    nop

    .end local v32    # "$i$f$mutableVectorOf":I
    move-object v2, v4

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    goto :goto_6

    .line 1521
    .end local v30    # "count$iv$iv$iv":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv$iv":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_6
    move/from16 v30, v2

    move-object/from16 v33, v5

    .end local v2    # "count$iv$iv$iv":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .restart local v30    # "count$iv$iv$iv":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    :goto_6
    move-object/from16 v21, v4

    .line 1525
    move-object v2, v15

    check-cast v2, Landroidx/compose/ui/Modifier$Node;

    .line 1526
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_8

    .line 1527
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v4, :cond_7

    invoke-virtual {v4, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1528
    :cond_7
    const/4 v4, 0x0

    move-object v15, v4

    .line 1530
    :cond_8
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v4, :cond_9

    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1533
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_9
    move/from16 v2, v30

    goto :goto_7

    .line 1514
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v30    # "count$iv$iv$iv":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv$iv":I
    .local v4, "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_a
    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1533
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    :goto_7
    nop

    .line 1513
    .end local v3    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 1534
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v26

    move-object/from16 v3, v27

    move/from16 v4, v29

    move-object/from16 v5, v33

    goto :goto_4

    .line 1536
    .end local v27    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .local v3, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_b
    move-object/from16 v27, v3

    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1537
    .end local v3    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .end local v24    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v26    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    const/4 v4, 0x1

    if-ne v2, v4, :cond_c

    .line 1539
    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    move-object/from16 v5, v33

    goto/16 :goto_2

    .line 1537
    :cond_c
    move-object/from16 v5, v33

    goto :goto_8

    .line 1507
    .end local v2    # "count$iv$iv$iv":I
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_d
    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1542
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    move-object/from16 v5, v33

    .end local v33    # "result$iv":Ljava/lang/Object;
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :goto_8
    move-object/from16 v2, v21

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    goto/16 :goto_2

    .line 1544
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .local v2, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v3, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_e
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1484
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .end local v15    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v19    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v21    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    nop

    .line 1498
    .end local v17    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_9

    .line 1497
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_f
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .line 1545
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    :goto_9
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    goto/16 :goto_1

    .line 1496
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_10
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    goto :goto_a

    .line 1495
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_11
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .line 1548
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    :goto_a
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 1549
    if-eqz v13, :cond_12

    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    goto :goto_b

    :cond_12
    const/4 v2, 0x0

    :goto_b
    move-object v12, v2

    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    .end local v16    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1551
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_13
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .line 1484
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v9    # "mask$iv$iv$iv":I
    .end local v10    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v11    # "$i$f$visitAncestors":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    nop

    .line 1552
    .end local v6    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v7    # "includeSelf$iv$iv":Z
    .end local v8    # "$i$f$visitAncestors-Y-YKmho":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 440
    .end local v5    # "result$iv":Ljava/lang/Object;
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    nop

    .line 441
    .local v2, "ancestors":Ljava/util/List;
    if-eqz v2, :cond_16

    move-object v3, v2

    .local v3, "$this$fastForEachReversed$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1553
    .local v4, "$i$f$fastForEachReversed":I
    nop

    .line 1554
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_15

    :cond_14
    move v6, v5

    .local v6, "index$iv":I
    add-int/lit8 v5, v5, -0x1

    .line 1555
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 1556
    .local v7, "item$iv":Ljava/lang/Object;
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1554
    .end local v7    # "item$iv":Ljava/lang/Object;
    if-gez v5, :cond_14

    .line 1558
    .end local v6    # "index$iv":I
    :cond_15
    nop

    .line 442
    .end local v3    # "$this$fastForEachReversed$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEachReversed":I
    :cond_16
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    .local v3, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v4, 0x0

    .line 1559
    .local v4, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v5, 0x0

    .line 1560
    .local v5, "stack$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .local v6, "node$iv":Ljava/lang/Object;
    move-object v6, v3

    .line 1561
    :goto_c
    if-eqz v6, :cond_23

    .line 1562
    const/4 v7, 0x3

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v7, v6, Ljava/lang/Object;

    if-eqz v7, :cond_17

    .line 1563
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    goto/16 :goto_12

    .line 1564
    :cond_17
    move-object v7, v6

    check-cast v7, Landroidx/compose/ui/Modifier$Node;

    .local v7, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v8, 0x0

    .line 1565
    .local v8, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v9

    and-int v9, v9, p2

    if-eqz v9, :cond_18

    const/4 v7, 0x1

    goto :goto_d

    :cond_18
    const/4 v7, 0x0

    .line 1564
    .end local v7    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_d
    if-eqz v7, :cond_21

    instance-of v7, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v7, :cond_21

    .line 1566
    const/4 v7, 0x0

    .line 1567
    .local v7, "count$iv":I
    move-object v8, v6

    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .local v8, "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v9, 0x0

    .line 1568
    .local v9, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 1569
    .local v10, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_e
    if-eqz v10, :cond_20

    .line 1570
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/Modifier$Node;

    .local v11, "next$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 1571
    .local v12, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    move-object v13, v11

    .local v13, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v15, 0x0

    .line 1565
    .local v15, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v16

    and-int v16, v16, p2

    if-eqz v16, :cond_19

    const/4 v13, 0x1

    goto :goto_f

    :cond_19
    const/4 v13, 0x0

    .line 1571
    .end local v13    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_f
    if-eqz v13, :cond_1e

    .line 1572
    add-int/lit8 v7, v7, 0x1

    .line 1573
    const/4 v13, 0x1

    if-ne v7, v13, :cond_1a

    .line 1574
    move-object v6, v11

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    goto :goto_11

    .line 1578
    :cond_1a
    move-object v13, v5

    check-cast v13, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v13, :cond_1b

    const/4 v13, 0x0

    .line 1579
    .local v13, "$i$f$mutableVectorOf":I
    nop

    .line 1580
    const/16 v15, 0x10

    .local v15, "capacity$iv$iv$iv":I
    const/16 v16, 0x0

    .line 1581
    .local v16, "$i$f$MutableVector":I
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v17, v2

    .end local v2    # "ancestors":Ljava/util/List;
    .local v17, "ancestors":Ljava/util/List;
    new-array v2, v15, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v18, v3

    const/4 v3, 0x0

    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .local v18, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-direct {v0, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1579
    .end local v15    # "capacity$iv$iv$iv":I
    .end local v16    # "$i$f$MutableVector":I
    nop

    .end local v13    # "$i$f$mutableVectorOf":I
    move-object v2, v0

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object v13, v0

    goto :goto_10

    .line 1578
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1b
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_10
    move-object v5, v13

    .line 1582
    move-object v0, v6

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .line 1583
    .local v0, "theNode$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_1d

    .line 1584
    move-object v2, v5

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_1c

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1585
    :cond_1c
    const/4 v2, 0x0

    move-object v6, v2

    .line 1587
    :cond_1d
    move-object v2, v5

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_1f

    invoke-virtual {v2, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 1571
    .end local v0    # "theNode$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1e
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 1590
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    :goto_11
    nop

    .line 1570
    .end local v11    # "next$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    nop

    .line 1591
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    move-object/from16 v0, p3

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto :goto_e

    .line 1593
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_20
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 1594
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v9    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v10    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v13, 0x1

    if-ne v7, v13, :cond_22

    .line 1596
    move-object/from16 v0, p3

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto/16 :goto_c

    .line 1564
    .end local v7    # "count$iv":I
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_21
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 1599
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_22
    :goto_12
    move-object v0, v5

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, p3

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto/16 :goto_c

    .line 1601
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_23
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 443
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v4    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v5    # "stack$iv":Ljava/lang/Object;
    .end local v6    # "node$iv":Ljava/lang/Object;
    .restart local v17    # "ancestors":Ljava/util/List;
    invoke-interface/range {p4 .. p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 444
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1602
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1603
    .local v3, "stack$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "node$iv":Ljava/lang/Object;
    move-object v4, v0

    .line 1604
    :goto_13
    if-eqz v4, :cond_30

    .line 1605
    const/4 v7, 0x3

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v5, v4, Ljava/lang/Object;

    if-eqz v5, :cond_24

    .line 1606
    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    const/4 v13, 0x1

    goto/16 :goto_19

    .line 1607
    :cond_24
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/Modifier$Node;

    .local v5, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v6, 0x0

    .line 1608
    .local v6, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v8

    and-int v8, v8, p2

    if-eqz v8, :cond_25

    const/4 v5, 0x1

    goto :goto_14

    :cond_25
    const/4 v5, 0x0

    .line 1607
    .end local v5    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v6    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_14
    if-eqz v5, :cond_2e

    instance-of v5, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v5, :cond_2e

    .line 1609
    const/4 v5, 0x0

    .line 1610
    .local v5, "count$iv":I
    move-object v6, v4

    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .local v6, "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v8, 0x0

    .line 1611
    .local v8, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    .line 1612
    .local v9, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_15
    if-eqz v9, :cond_2d

    .line 1613
    move-object v10, v9

    check-cast v10, Landroidx/compose/ui/Modifier$Node;

    .local v10, "next$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v11, 0x0

    .line 1614
    .local v11, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    move-object v12, v10

    .local v12, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v13, 0x0

    .line 1608
    .local v13, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v15

    and-int v15, v15, p2

    if-eqz v15, :cond_26

    const/4 v12, 0x1

    goto :goto_16

    :cond_26
    const/4 v12, 0x0

    .line 1614
    .end local v12    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_16
    if-eqz v12, :cond_2b

    .line 1615
    add-int/lit8 v5, v5, 0x1

    .line 1616
    const/4 v13, 0x1

    if-ne v5, v13, :cond_27

    .line 1617
    move-object v4, v10

    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    goto :goto_18

    .line 1621
    :cond_27
    move-object v12, v3

    check-cast v12, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v12, :cond_28

    const/4 v12, 0x0

    .line 1622
    .local v12, "$i$f$mutableVectorOf":I
    nop

    .line 1623
    const/16 v13, 0x10

    .local v13, "capacity$iv$iv$iv":I
    const/4 v15, 0x0

    .line 1624
    .local v15, "$i$f$MutableVector":I
    new-instance v7, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    new-array v0, v13, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v18, v2

    const/4 v2, 0x0

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    invoke-direct {v7, v0, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1622
    .end local v13    # "capacity$iv$iv$iv":I
    .end local v15    # "$i$f$MutableVector":I
    nop

    .end local v12    # "$i$f$mutableVectorOf":I
    move-object v0, v7

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object v12, v7

    goto :goto_17

    .line 1621
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_28
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_17
    move-object v3, v12

    .line 1625
    move-object v0, v4

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .line 1626
    .local v0, "theNode$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_2a

    .line 1627
    move-object v7, v3

    check-cast v7, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v7, :cond_29

    invoke-virtual {v7, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1628
    :cond_29
    const/4 v4, 0x0

    .line 1630
    :cond_2a
    move-object v7, v3

    check-cast v7, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v7, :cond_2c

    invoke-virtual {v7, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 1614
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2b
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    .line 1633
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2c
    :goto_18
    nop

    .line 1613
    .end local v10    # "next$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v11    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    nop

    .line 1634
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    move-object/from16 v0, v16

    move/from16 v2, v18

    const/4 v7, 0x3

    goto :goto_15

    .line 1636
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2d
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    .line 1637
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v6    # "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v8    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v9    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v13, 0x1

    if-ne v5, v13, :cond_2f

    .line 1639
    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_13

    .line 1607
    .end local v5    # "count$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2e
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    const/4 v13, 0x1

    .line 1642
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2f
    :goto_19
    move-object v0, v3

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_13

    .line 1644
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_30
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 445
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv":Ljava/lang/Object;
    .end local v4    # "node$iv":Ljava/lang/Object;
    if-eqz v17, :cond_32

    move-object/from16 v0, v17

    .local v0, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1645
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1646
    const/4 v3, 0x0

    .local v3, "index$iv":I
    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_1a
    if-ge v3, v4, :cond_31

    .line 1647
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 1648
    .local v5, "item$iv":Ljava/lang/Object;
    invoke-interface {v1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1646
    .end local v5    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    .line 1650
    .end local v3    # "index$iv":I
    :cond_31
    nop

    .line 446
    .end local v0    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :cond_32
    return-void
.end method

.method private final validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 6
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;

    .line 501
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    move-result-wide v0

    .line 502
    .local v0, "keyCode":J
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v2

    .line 503
    sget-object v3, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 506
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    if-nez v2, :cond_0

    .line 507
    new-instance v2, Landroidx/collection/MutableLongSet;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Landroidx/collection/MutableLongSet;-><init>(I)V

    move-object v3, v2

    .line 1754
    .local v3, "it":Landroidx/collection/MutableLongSet;
    const/4 v5, 0x0

    .line 507
    .local v5, "$i$a$-also-FocusOwnerImpl$validateKeyEvent$keysCurrentlyDown$1":I
    iput-object v3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 506
    .end local v3    # "it":Landroidx/collection/MutableLongSet;
    .end local v5    # "$i$a$-also-FocusOwnerImpl$validateKeyEvent$keysCurrentlyDown$1":I
    :cond_0
    nop

    .line 505
    nop

    .line 508
    .local v2, "keysCurrentlyDown":Landroidx/collection/MutableLongSet;
    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    .end local v2    # "keysCurrentlyDown":Landroidx/collection/MutableLongSet;
    goto :goto_1

    .line 510
    :cond_1
    sget-object v3, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyUp-CS__XNY()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 511
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongSet;->contains(J)Z

    move-result v2

    if-ne v2, v4, :cond_2

    move v2, v4

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_0
    if-nez v2, :cond_3

    .line 513
    return v3

    .line 515
    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongSet;->remove(J)Z

    .line 519
    :cond_4
    :goto_1
    return v4
.end method


# virtual methods
.method public clearFocus(Z)V
    .locals 2
    .param p1, "force"    # Z

    .line 177
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus-I7lrPNg(ZZZI)Z

    .line 178
    return-void
.end method

.method public clearFocus-I7lrPNg(ZZZI)Z
    .locals 8
    .param p1, "force"    # Z
    .param p2, "refreshFocusEvents"    # Z
    .param p3, "clearOwnerFocus"    # Z
    .param p4, "focusDirection"    # I

    .line 187
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 188
    if-nez p1, :cond_0

    .line 190
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0, p4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Landroidx/compose/ui/focus/CustomDestinationResult;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    .line 194
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)Z

    move-result v1

    goto :goto_2

    .line 193
    :pswitch_1
    goto :goto_2

    .line 197
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)Z

    move-result v1

    goto :goto_2

    .line 200
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    .local v0, "this_$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    sget-object v2, Landroidx/compose/ui/focus/FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1;->INSTANCE:Landroidx/compose/ui/focus/FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1;

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .local v2, "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    const/4 v3, 0x0

    .line 551
    .local v3, "$i$f$withNewTransaction":I
    nop

    .line 552
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 553
    :cond_2
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 554
    if-eqz v2, :cond_3

    move-object v4, v2

    .line 555
    .local v4, "it$iv":Lkotlin/jvm/functions/Function0;
    const/4 v5, 0x0

    .line 554
    .local v5, "$i$a$-let-FocusTransactionManager$withNewTransaction$1$iv":I
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v6

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v7, 0x0

    .line 556
    .local v7, "$i$f$plusAssign":I
    invoke-virtual {v6, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 557
    nop

    .line 554
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v7    # "$i$f$plusAssign":I
    nop

    .line 558
    .end local v4    # "it$iv":Lkotlin/jvm/functions/Function0;
    .end local v5    # "$i$a$-let-FocusTransactionManager$withNewTransaction$1$iv":I
    :cond_3
    const/4 v4, 0x0

    .line 205
    .local v4, "$i$a$-withNewTransaction-FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$2":I
    if-nez p1, :cond_4

    .line 208
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v5, p4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    move-result-object v5

    sget-object v6, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Landroidx/compose/ui/focus/CustomDestinationResult;->ordinal()I

    move-result v5

    aget v5, v6, v5

    packed-switch v5, :pswitch_data_1

    goto :goto_0

    .line 211
    :pswitch_2
    goto :goto_1

    .line 217
    :cond_4
    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v1, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 558
    .end local v4    # "$i$a$-withNewTransaction-FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$2":I
    :goto_1
    nop

    .line 560
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 561
    nop

    .line 187
    .end local v0    # "this_$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .end local v2    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v3    # "$i$f$withNewTransaction":I
    :goto_2
    nop

    .line 186
    nop

    .line 221
    .local v1, "clearedFocusSuccessfully":Z
    if-eqz v1, :cond_5

    if-eqz p3, :cond_5

    .line 222
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 224
    :cond_5
    return v1

    .line 560
    .end local v1    # "clearedFocusSuccessfully":Z
    .restart local v0    # "this_$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .restart local v2    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .restart local v3    # "$i$f$withNewTransaction":I
    :catchall_0
    move-exception v1

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public dispatchInterceptedSoftKeyboardEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 39
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;

    .line 356
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 359
    nop

    .line 358
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 362
    return v3

    .line 368
    :cond_0
    nop

    .line 366
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 367
    invoke-static {v2}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v2

    .line 368
    const-string/jumbo v4, "visitAncestors called on an unattached node"

    const/high16 v5, 0x20000

    const/4 v7, 0x1

    if-eqz v2, :cond_14

    .line 367
    check-cast v2, Landroidx/compose/ui/node/DelegatableNode;

    .line 368
    const/4 v8, 0x0

    .line 966
    .local v8, "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v8

    .line 368
    .end local v8    # "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    nop

    .local v8, "type$iv":I
    move-object/from16 v9, p0

    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v9, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v10, 0x0

    .line 967
    .local v10, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v11, 0x1

    .local v11, "includeSelf$iv$iv":Z
    move-object v12, v2

    .local v12, "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v13, 0x0

    .line 968
    .local v13, "$i$f$visitAncestors-Y-YKmho":I
    move v14, v8

    .local v14, "mask$iv$iv$iv":I
    move-object v15, v12

    .local v15, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 969
    .local v16, "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    .local v17, "value$iv$iv$iv$iv":Z
    const/16 v18, 0x0

    .line 970
    .local v18, "$i$f$checkPrecondition":I
    nop

    .line 971
    if-nez v17, :cond_1

    .line 972
    const/16 v19, 0x0

    .line 969
    .local v19, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .line 972
    .end local v19    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 974
    :cond_1
    nop

    .line 975
    .end local v17    # "value$iv$iv$iv$iv":Z
    .end local v18    # "$i$f$checkPrecondition":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    .line 976
    .local v17, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 977
    .local v18, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v18, :cond_13

    .line 978
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    .line 979
    .local v19, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_11

    .line 980
    :goto_1
    if-eqz v17, :cond_10

    .line 981
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_f

    .line 982
    move-object/from16 v20, v17

    .local v20, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 968
    .local v21, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 983
    .local v23, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v24, 0x0

    .line 984
    .local v24, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .local v25, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v25, v22

    move-object/from16 v38, v25

    move/from16 v25, v5

    move-object/from16 v5, v38

    .line 985
    .end local v25    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v5, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v5, :cond_e

    .line 986
    instance-of v6, v5, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v6, :cond_2

    .line 987
    move-object v6, v5

    .local v6, "it$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 988
    .local v26, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    goto/16 :goto_c

    .line 989
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    :cond_2
    move-object v6, v5

    .local v6, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 990
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v8

    if-eqz v27, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    move v6, v3

    .line 989
    .end local v6    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_3
    if-eqz v6, :cond_c

    instance-of v6, v5, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_c

    .line 991
    const/4 v6, 0x0

    .line 992
    .local v6, "count$iv$iv$iv":I
    move-object/from16 v26, v5

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 993
    .local v27, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 994
    .local v28, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v28, :cond_b

    .line 995
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 996
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v32, 0x0

    .line 990
    .local v32, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v33

    and-int v33, v33, v8

    if-eqz v33, :cond_4

    move/from16 v31, v7

    goto :goto_5

    :cond_4
    move/from16 v31, v3

    .line 996
    .end local v31    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v32    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v31, :cond_a

    .line 997
    add-int/lit8 v6, v6, 0x1

    .line 998
    if-ne v6, v7, :cond_5

    .line 999
    move-object/from16 v5, v29

    move-object/from16 v34, v2

    move-object/from16 v7, v29

    goto :goto_8

    .line 1003
    :cond_5
    if-nez v24, :cond_6

    const/16 v31, 0x0

    .line 1004
    .local v31, "$i$f$mutableVectorOf":I
    nop

    .line 1005
    const/16 v7, 0x10

    .local v7, "capacity$iv$iv$iv$iv$iv":I
    const/16 v33, 0x0

    .line 1006
    .local v33, "$i$f$MutableVector":I
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v34, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    new-array v2, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v0, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1004
    .end local v7    # "capacity$iv$iv$iv$iv$iv":I
    .end local v33    # "$i$f$MutableVector":I
    goto :goto_6

    .line 1003
    .end local v31    # "$i$f$mutableVectorOf":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_6
    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v0, v24

    :goto_6
    nop

    .line 1007
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v0, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v2, v5

    .line 1008
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_8

    .line 1009
    if-eqz v0, :cond_7

    invoke-virtual {v0, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1010
    :cond_7
    const/4 v5, 0x0

    .line 1012
    :cond_8
    if-eqz v0, :cond_9

    move-object/from16 v7, v29

    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v7, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_9
    move-object/from16 v7, v29

    .line 1015
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_7
    move-object/from16 v24, v0

    goto :goto_8

    .line 996
    .end local v0    # "stack$iv$iv$iv":Ljava/lang/Object;
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_a
    move-object/from16 v34, v2

    move-object/from16 v7, v29

    .line 1015
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_8
    nop

    .line 995
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 1016
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto :goto_4

    .line 1018
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_b
    move-object/from16 v34, v2

    .line 1019
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v0, 0x1

    if-ne v6, v0, :cond_d

    .line 1021
    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 989
    .end local v6    # "count$iv$iv$iv":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_c
    move-object/from16 v34, v2

    .line 1024
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_d
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 1026
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_e
    move-object/from16 v34, v2

    .line 968
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v5    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 982
    .end local v20    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_9

    .line 981
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_f
    move-object/from16 v34, v2

    move/from16 v25, v5

    .line 1027
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_9
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v5, v25

    move-object/from16 v2, v34

    goto/16 :goto_1

    .line 980
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_10
    move-object/from16 v34, v2

    move/from16 v25, v5

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    goto :goto_a

    .line 979
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_11
    move-object/from16 v34, v2

    move/from16 v25, v5

    .line 1030
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_a
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 1031
    if-eqz v18, :cond_12

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_b

    :cond_12
    const/4 v0, 0x0

    :goto_b
    move-object/from16 v17, v0

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v5, v25

    move-object/from16 v2, v34

    .end local v19    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1033
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_13
    move-object/from16 v34, v2

    move/from16 v25, v5

    .line 968
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "mask$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1034
    .end local v11    # "includeSelf$iv$iv":Z
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v6, 0x0

    .end local v8    # "type$iv":I
    .end local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_c
    check-cast v6, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    goto :goto_d

    .line 368
    :cond_14
    move/from16 v25, v5

    const/4 v6, 0x0

    .line 365
    :goto_d
    nop

    .line 370
    .local v6, "focusedSoftKeyboardInterceptionNode":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    if-eqz v6, :cond_4c

    move-object v0, v6

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    .line 371
    const/4 v2, 0x0

    .line 1035
    .local v2, "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v2

    .line 370
    .end local v2    # "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    nop

    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v5, p0

    .local v2, "type$iv":I
    .local v5, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v7, 0x0

    .line 1036
    .local v7, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object v8, v0

    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v9, 0x0

    .line 1037
    .local v9, "$i$f$ancestors-64DMado":I
    const/4 v10, 0x0

    .line 1038
    .local v10, "result$iv$iv":Ljava/lang/Object;
    move-object v11, v8

    .line 1039
    .local v11, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1041
    const/4 v12, 0x0

    .line 1039
    .local v12, "includeSelf$iv$iv$iv":Z
    const/4 v13, 0x0

    .line 1043
    .restart local v13    # "$i$f$visitAncestors-Y-YKmho":I
    move v14, v2

    .local v14, "mask$iv$iv$iv$iv":I
    move-object v15, v11

    .local v15, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 1044
    .restart local v16    # "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    .local v17, "value$iv$iv$iv$iv$iv":Z
    const/16 v18, 0x0

    .line 1045
    .local v18, "$i$f$checkPrecondition":I
    nop

    .line 1046
    if-nez v17, :cond_15

    .line 1047
    const/16 v19, 0x0

    .line 1044
    .local v19, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    nop

    .line 1047
    .end local v19    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1049
    :cond_15
    nop

    .line 1050
    .end local v17    # "value$iv$iv$iv$iv$iv":Z
    .end local v18    # "$i$f$checkPrecondition":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    .line 1051
    .local v4, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 1052
    .local v17, "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_e
    if-eqz v17, :cond_28

    .line 1053
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    .line 1054
    .local v18, "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_26

    .line 1055
    :goto_f
    if-eqz v4, :cond_25

    .line 1056
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_24

    .line 1057
    move-object/from16 v19, v4

    .local v19, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 1043
    .local v20, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    move-object/from16 v21, v19

    .local v21, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 1058
    .local v22, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v23, 0x0

    .line 1059
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .local v24, "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v21

    move-object/from16 v3, v24

    .line 1060
    .end local v24    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_10
    if-eqz v3, :cond_23

    .line 1061
    move-object/from16 v25, v0

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v25, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    instance-of v0, v3, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v0, :cond_17

    .line 1062
    move-object v0, v3

    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 1063
    .local v26, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    if-nez v10, :cond_16

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v10, v27

    check-cast v10, Ljava/util/List;

    .line 1064
    :cond_16
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1065
    nop

    .line 1062
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    move/from16 v31, v2

    goto/16 :goto_18

    .line 1066
    :cond_17
    move-object v0, v3

    .local v0, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 1067
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v2

    if-eqz v27, :cond_18

    const/4 v0, 0x1

    goto :goto_11

    :cond_18
    const/4 v0, 0x0

    .line 1066
    .end local v0    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_11
    if-eqz v0, :cond_22

    instance-of v0, v3, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v0, :cond_22

    .line 1068
    const/4 v0, 0x0

    .line 1069
    .local v0, "count$iv$iv$iv$iv":I
    move-object/from16 v26, v3

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 1070
    .restart local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 1071
    .local v28, "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_12
    if-eqz v28, :cond_20

    .line 1072
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1073
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v33, 0x0

    .line 1067
    .local v33, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v2

    if-eqz v34, :cond_19

    const/16 v31, 0x1

    goto :goto_13

    :cond_19
    const/16 v31, 0x0

    .line 1073
    .end local v31    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_13
    if-eqz v31, :cond_1f

    .line 1074
    add-int/lit8 v0, v0, 0x1

    .line 1075
    move/from16 v31, v2

    const/4 v2, 0x1

    .end local v2    # "type$iv":I
    .local v31, "type$iv":I
    if-ne v0, v2, :cond_1a

    .line 1076
    move-object/from16 v3, v29

    move-object/from16 v36, v3

    goto :goto_17

    .line 1080
    :cond_1a
    if-nez v23, :cond_1b

    const/4 v2, 0x0

    .line 1081
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 1082
    move/from16 v33, v0

    .end local v0    # "count$iv$iv$iv$iv":I
    .local v33, "count$iv$iv$iv$iv":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 1083
    .local v34, "$i$f$MutableVector":I
    move/from16 v35, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v35, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v36, v3

    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v36, "node$iv$iv$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v37, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv$iv":I
    .local v37, "capacity$iv$iv$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1081
    .end local v34    # "$i$f$MutableVector":I
    .end local v37    # "capacity$iv$iv$iv$iv$iv$iv":I
    goto :goto_14

    .line 1080
    .end local v33    # "count$iv$iv$iv$iv":I
    .end local v35    # "$i$f$mutableVectorOf":I
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v0, "count$iv$iv$iv$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_1b
    move/from16 v33, v0

    move-object/from16 v36, v3

    .end local v0    # "count$iv$iv$iv$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "count$iv$iv$iv$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v23

    :goto_14
    nop

    .line 1084
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v36

    .line 1085
    .local v0, "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_1d

    .line 1086
    if-eqz v2, :cond_1c

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1087
    :cond_1c
    const/4 v3, 0x0

    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    goto :goto_15

    .line 1085
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_1d
    move-object/from16 v3, v36

    .line 1089
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_15
    if-eqz v2, :cond_1e

    move-object/from16 v23, v3

    move-object/from16 v3, v29

    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v23, "node$iv$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .end local v23    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1e
    move-object/from16 v23, v3

    move-object/from16 v3, v29

    .line 1092
    .end local v0    # "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_16
    move-object/from16 v36, v23

    move/from16 v0, v33

    move-object/from16 v23, v2

    goto :goto_17

    .line 1073
    .end local v31    # "type$iv":I
    .end local v33    # "count$iv$iv$iv$iv":I
    .local v0, "count$iv$iv$iv$iv":I
    .local v2, "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    move/from16 v31, v2

    move-object/from16 v36, v3

    move-object/from16 v3, v29

    .line 1092
    .end local v2    # "type$iv":I
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_17
    nop

    .line 1072
    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    nop

    .line 1093
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto :goto_12

    .line 1095
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_20
    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 1096
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v26    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v0, v2, :cond_21

    .line 1098
    move-object/from16 v0, v25

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto/16 :goto_10

    .line 1096
    :cond_21
    move-object/from16 v3, v36

    goto :goto_18

    .line 1066
    .end local v0    # "count$iv$iv$iv$iv":I
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_22
    move/from16 v31, v2

    .line 1101
    .end local v2    # "type$iv":I
    .restart local v31    # "type$iv":I
    :goto_18
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move-object/from16 v0, v25

    move/from16 v2, v31

    goto/16 :goto_10

    .line 1103
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_23
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 1043
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v21    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    nop

    .line 1057
    .end local v19    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    goto :goto_19

    .line 1056
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_24
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 1104
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    :goto_19
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, v25

    move/from16 v2, v31

    const/4 v3, 0x0

    goto/16 :goto_f

    .line 1055
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_25
    move-object/from16 v25, v0

    move/from16 v31, v2

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    goto :goto_1a

    .line 1054
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_26
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 1107
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    :goto_1a
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 1108
    if-eqz v17, :cond_27

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_1b

    :cond_27
    const/4 v0, 0x0

    :goto_1b
    move-object v4, v0

    move-object/from16 v0, v25

    move/from16 v2, v31

    const/4 v3, 0x0

    .end local v18    # "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_e

    .line 1110
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_28
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 1043
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v4    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "mask$iv$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    nop

    .line 1111
    .end local v11    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "includeSelf$iv$iv$iv":Z
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    nop

    .line 1036
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    nop

    .line 1112
    .local v10, "ancestors$iv":Ljava/util/List;
    if-eqz v10, :cond_2c

    move-object v0, v10

    .local v0, "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1113
    .local v2, "$i$f$fastForEachReversed":I
    nop

    .line 1114
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_2b

    :cond_29
    move v4, v3

    .local v4, "index$iv$iv":I
    add-int/lit8 v3, v3, -0x1

    .line 1115
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1116
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v11, 0x0

    .line 372
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$1":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v12

    if-eqz v12, :cond_2a

    const/16 v32, 0x1

    return v32

    .line 1116
    .end local v9    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$1":I
    :cond_2a
    nop

    .line 1114
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    if-gez v3, :cond_29

    .line 1118
    .end local v4    # "index$iv$iv":I
    :cond_2b
    nop

    .line 1119
    .end local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEachReversed":I
    :cond_2c
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1120
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1121
    .local v3, "stack$iv$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "node$iv$iv":Ljava/lang/Object;
    move-object v4, v0

    .line 1122
    :goto_1c
    if-eqz v4, :cond_3a

    .line 1123
    instance-of v8, v4, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v8, :cond_2e

    .line 1124
    move-object v8, v4

    check-cast v8, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v9, 0x0

    .line 372
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$1":I
    invoke-interface {v8, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v11

    if-eqz v11, :cond_2d

    const/16 v32, 0x1

    return v32

    .line 1124
    .end local v8    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$1":I
    :cond_2d
    move-object/from16 v16, v0

    move/from16 v18, v2

    goto/16 :goto_22

    .line 1125
    :cond_2e
    move-object v8, v4

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 1067
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_2f

    const/4 v8, 0x1

    goto :goto_1d

    :cond_2f
    const/4 v8, 0x0

    .line 1125
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1d
    if-eqz v8, :cond_39

    instance-of v8, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_39

    .line 1130
    const/4 v8, 0x0

    .line 1131
    .local v8, "count$iv$iv":I
    move-object v9, v4

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 1132
    .local v11, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1133
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_1e
    if-eqz v12, :cond_37

    .line 1134
    move-object v13, v12

    .local v13, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1135
    .local v14, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 1067
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_30

    const/4 v15, 0x1

    goto :goto_1f

    :cond_30
    const/4 v15, 0x0

    .line 1135
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1f
    if-eqz v15, :cond_35

    .line 1136
    add-int/lit8 v8, v8, 0x1

    .line 1137
    const/4 v15, 0x1

    if-ne v8, v15, :cond_31

    .line 1138
    move-object v4, v13

    move-object/from16 v16, v0

    move/from16 v18, v2

    goto :goto_21

    .line 1142
    :cond_31
    if-nez v3, :cond_32

    const/4 v15, 0x0

    .line 1143
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 1144
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 1145
    .local v17, "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .local v19, "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .local v20, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1143
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_20

    .line 1142
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_32
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_20
    move-object v3, v2

    .line 1146
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v4

    .line 1147
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_34

    .line 1148
    if-eqz v3, :cond_33

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1149
    :cond_33
    const/4 v2, 0x0

    move-object v4, v2

    .line 1151
    :cond_34
    if-eqz v3, :cond_36

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_21

    .line 1135
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_35
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1154
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_36
    :goto_21
    nop

    .line 1134
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1155
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto :goto_1e

    .line 1157
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_37
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1158
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_38

    .line 1160
    move-object/from16 v0, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_1c

    .line 1158
    :cond_38
    move-object/from16 v3, v19

    goto :goto_22

    .line 1125
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_39
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1163
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_22
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_1c

    .line 1165
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_3a
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1166
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v4    # "node$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 373
    .local v0, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$2":I
    nop

    .line 1166
    .end local v0    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$2":I
    nop

    .line 1167
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1168
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1169
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .restart local v4    # "node$iv$iv":Ljava/lang/Object;
    move-object v4, v0

    .line 1170
    :goto_23
    if-eqz v4, :cond_48

    .line 1171
    instance-of v8, v4, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v8, :cond_3c

    .line 1172
    move-object v8, v4

    check-cast v8, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v9, 0x0

    .line 374
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$3":I
    invoke-interface {v8, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v11

    if-eqz v11, :cond_3b

    const/16 v32, 0x1

    return v32

    .line 1172
    .end local v8    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$3":I
    :cond_3b
    move-object/from16 v16, v0

    move/from16 v18, v2

    goto/16 :goto_29

    .line 1173
    :cond_3c
    move-object v8, v4

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 1067
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_3d

    const/4 v8, 0x1

    goto :goto_24

    :cond_3d
    const/4 v8, 0x0

    .line 1173
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_24
    if-eqz v8, :cond_47

    instance-of v8, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_47

    .line 1178
    const/4 v8, 0x0

    .line 1179
    .local v8, "count$iv$iv":I
    move-object v9, v4

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 1180
    .restart local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1181
    .restart local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_25
    if-eqz v12, :cond_45

    .line 1182
    move-object v13, v12

    .restart local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1183
    .restart local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 1067
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_3e

    const/4 v15, 0x1

    goto :goto_26

    :cond_3e
    const/4 v15, 0x0

    .line 1183
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_26
    if-eqz v15, :cond_43

    .line 1184
    add-int/lit8 v8, v8, 0x1

    .line 1185
    const/4 v15, 0x1

    if-ne v8, v15, :cond_3f

    .line 1186
    move-object v4, v13

    move-object/from16 v16, v0

    move/from16 v18, v2

    goto :goto_28

    .line 1190
    :cond_3f
    if-nez v3, :cond_40

    const/4 v15, 0x0

    .line 1191
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 1192
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 1193
    .restart local v17    # "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .restart local v20    # "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1191
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_27

    .line 1190
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_40
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_27
    move-object v3, v2

    .line 1194
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v4

    .line 1195
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_42

    .line 1196
    if-eqz v3, :cond_41

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1197
    :cond_41
    const/4 v2, 0x0

    move-object v4, v2

    .line 1199
    :cond_42
    if-eqz v3, :cond_44

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_28

    .line 1183
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_43
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1202
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_44
    :goto_28
    nop

    .line 1182
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1203
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto :goto_25

    .line 1205
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_45
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1206
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_46

    .line 1208
    move-object/from16 v0, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_23

    .line 1206
    :cond_46
    move-object/from16 v3, v19

    goto :goto_29

    .line 1173
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_47
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1211
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_29
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_23

    .line 1213
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_48
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1214
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v4    # "node$iv$iv":Ljava/lang/Object;
    if-eqz v10, :cond_4b

    move-object v0, v10

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1215
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1216
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_2a
    if-ge v3, v4, :cond_4a

    .line 1217
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1218
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v11, 0x0

    .line 374
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$3":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v12

    if-eqz v12, :cond_49

    const/16 v32, 0x1

    return v32

    :cond_49
    const/16 v32, 0x1

    .line 1218
    .end local v9    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$3":I
    nop

    .line 1216
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_2a

    .line 1220
    .end local v3    # "index$iv$iv":I
    :cond_4a
    nop

    .line 1221
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :cond_4b
    nop

    .line 376
    .end local v5    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    :cond_4c
    const/16 v24, 0x0

    return v24
.end method

.method public dispatchKeyEvent-YhN2O0w(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z
    .locals 43
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;
    .param p2, "onFocusedItem"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 331
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "FocusOwnerImpl:dispatchKeyEvent"

    .local v3, "sectionName$iv":Ljava/lang/String;
    const/4 v4, 0x0

    .line 632
    .local v4, "$i$f$trace":I
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 633
    nop

    .line 634
    const/4 v0, 0x0

    .line 332
    .local v0, "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    :try_start_0
    iget-object v5, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v5}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    .line 334
    :try_start_1
    const-string v5, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v7, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 335
    nop

    .line 636
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v6

    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    :catchall_0
    move-exception v0

    move-object/from16 v40, v3

    move/from16 v20, v4

    goto/16 :goto_3f

    .line 337
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    :cond_0
    :try_start_2
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v5

    if-nez v5, :cond_1

    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    goto :goto_0

    .line 339
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    :cond_1
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 341
    .local v5, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const-string/jumbo v7, "visitAncestors called on an unattached node"

    const/16 v8, 0x2000

    const/4 v10, 0x1

    if-eqz v5, :cond_3

    :try_start_3
    move-object v11, v5

    check-cast v11, Landroidx/compose/ui/node/DelegatableNode;

    invoke-direct {v1, v11}, Landroidx/compose/ui/focus/FocusOwnerImpl;->lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v39, v0

    move-object/from16 v40, v3

    move/from16 v29, v8

    goto/16 :goto_1f

    .line 342
    :cond_3
    :goto_1
    if-eqz v5, :cond_17

    :try_start_4
    move-object v11, v5

    check-cast v11, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v12, 0x0

    .line 637
    .local v12, "$i$f$getKeyInput-OLwlOKw":I
    invoke-static {v8}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v13

    .line 342
    .end local v12    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v11, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v13, "type$iv":I
    move-object/from16 v12, p0

    .local v12, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v14, 0x0

    .line 638
    .local v14, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v15, 0x1

    .local v15, "includeSelf$iv$iv":Z
    move-object/from16 v16, v11

    .local v16, "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v17, 0x0

    .line 639
    .local v17, "$i$f$visitAncestors-Y-YKmho":I
    move/from16 v18, v13

    .local v18, "mask$iv$iv$iv":I
    move-object/from16 v19, v16

    .local v19, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v20, 0x0

    .line 640
    .local v20, "$i$f$visitAncestors":I
    invoke-interface/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v21
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .local v21, "value$iv$iv$iv$iv":Z
    const/16 v22, 0x0

    .line 641
    .local v22, "$i$f$checkPrecondition":I
    nop

    .line 642
    if-nez v21, :cond_4

    .line 643
    const/16 v23, 0x0

    .line 640
    .local v23, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .line 643
    .end local v23    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    :try_start_5
    invoke-static {v7}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 645
    :cond_4
    nop

    .line 646
    .end local v21    # "value$iv$iv$iv$iv":Z
    .end local v22    # "$i$f$checkPrecondition":I
    :try_start_6
    invoke-interface/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    .line 647
    .local v21, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v22

    .line 648
    .local v22, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_2
    if-eqz v22, :cond_16

    .line 649
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    .line 650
    .local v23, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v24

    and-int v24, v24, v18

    if-eqz v24, :cond_14

    .line 651
    :goto_3
    if-eqz v21, :cond_13

    .line 652
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v24

    and-int v24, v24, v18

    if-eqz v24, :cond_12

    .line 653
    move-object/from16 v24, v21

    .local v24, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 639
    .local v25, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v26, v24

    .local v26, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 654
    .local v27, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v28, 0x0

    .line 655
    .local v28, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v29, 0x0

    .local v29, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v29, v26

    move-object/from16 v42, v29

    move/from16 v29, v8

    move-object/from16 v8, v42

    .line 656
    .end local v29    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v8, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_4
    if-eqz v8, :cond_11

    .line 657
    instance-of v9, v8, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v9, :cond_5

    .line 658
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 659
    .local v30, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    move/from16 v39, v0

    move-object/from16 v40, v3

    goto/16 :goto_e

    .line 660
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v30    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    :cond_5
    move-object v9, v8

    .local v9, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 661
    .local v30, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, v13

    if-eqz v31, :cond_6

    move v9, v10

    goto :goto_5

    :cond_6
    move v9, v6

    .line 660
    .end local v9    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v9, :cond_f

    instance-of v9, v8, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v9, :cond_f

    .line 662
    const/4 v9, 0x0

    .line 663
    .local v9, "count$iv$iv$iv":I
    move-object/from16 v30, v8

    check-cast v30, Landroidx/compose/ui/node/DelegatingNode;

    .local v30, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v31, 0x0

    .line 664
    .local v31, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v32

    .line 665
    .local v32, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_6
    if-eqz v32, :cond_e

    .line 666
    move-object/from16 v33, v32

    .local v33, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v34, 0x0

    .line 667
    .local v34, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v35, v33

    .local v35, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v36, 0x0

    .line 661
    .local v36, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v37

    and-int v37, v37, v13

    if-eqz v37, :cond_7

    move/from16 v35, v10

    goto :goto_7

    :cond_7
    move/from16 v35, v6

    .line 667
    .end local v35    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v36    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_7
    if-eqz v35, :cond_d

    .line 668
    add-int/lit8 v9, v9, 0x1

    .line 669
    if-ne v9, v10, :cond_8

    .line 670
    move-object/from16 v8, v33

    move/from16 v39, v0

    move-object/from16 v40, v3

    move-object/from16 v3, v33

    goto :goto_a

    .line 674
    :cond_8
    if-nez v28, :cond_9

    const/16 v35, 0x0

    .line 675
    .local v35, "$i$f$mutableVectorOf":I
    nop

    .line 676
    const/16 v10, 0x10

    .local v10, "capacity$iv$iv$iv$iv$iv":I
    const/16 v37, 0x0

    .line 677
    .local v37, "$i$f$MutableVector":I
    new-instance v6, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v39, v0

    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .local v39, "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    new-array v0, v10, [Landroidx/compose/ui/Modifier$Node;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v40, v3

    const/4 v3, 0x0

    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .local v40, "sectionName$iv":Ljava/lang/String;
    :try_start_7
    invoke-direct {v6, v0, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 675
    .end local v10    # "capacity$iv$iv$iv$iv$iv":I
    .end local v37    # "$i$f$MutableVector":I
    goto :goto_8

    .line 674
    .end local v35    # "$i$f$mutableVectorOf":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_9
    move/from16 v39, v0

    move-object/from16 v40, v3

    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    move-object/from16 v6, v28

    :goto_8
    nop

    .line 678
    .end local v28    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v6, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v0, v8

    .line 679
    .local v0, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_b

    .line 680
    if-eqz v6, :cond_a

    invoke-virtual {v6, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 681
    :cond_a
    const/4 v3, 0x0

    move-object v8, v3

    .line 683
    :cond_b
    if-eqz v6, :cond_c

    move-object/from16 v3, v33

    .end local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v6, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_9

    .end local v3    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_c
    move-object/from16 v3, v33

    .end local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_9
    move-object/from16 v28, v6

    goto :goto_a

    .line 667
    .end local v6    # "stack$iv$iv$iv":Ljava/lang/Object;
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .local v0, "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .local v3, "sectionName$iv":Ljava/lang/String;
    .restart local v28    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_d
    move/from16 v39, v0

    move-object/from16 v40, v3

    move-object/from16 v3, v33

    .line 686
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :goto_a
    nop

    .line 666
    .end local v3    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 687
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object/from16 v32, v0

    move/from16 v0, v39

    move-object/from16 v3, v40

    const/4 v6, 0x0

    const/4 v10, 0x1

    goto :goto_6

    .line 689
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .local v3, "sectionName$iv":Ljava/lang/String;
    :cond_e
    move/from16 v39, v0

    move-object/from16 v40, v3

    .line 690
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v30    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v31    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v32    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    const/4 v0, 0x1

    if-ne v9, v0, :cond_10

    .line 692
    move/from16 v0, v39

    move-object/from16 v3, v40

    const/4 v6, 0x0

    const/4 v10, 0x1

    goto/16 :goto_4

    .line 660
    .end local v9    # "count$iv$iv$iv":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_f
    move/from16 v39, v0

    move-object/from16 v40, v3

    .line 695
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_10
    invoke-static/range {v28 .. v28}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object v8, v0

    move/from16 v0, v39

    move-object/from16 v3, v40

    const/4 v6, 0x0

    const/4 v10, 0x1

    goto/16 :goto_4

    .line 697
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_11
    move/from16 v39, v0

    move-object/from16 v40, v3

    .line 639
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v8    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v26    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v28    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    nop

    .line 653
    .end local v24    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_b

    .line 652
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_12
    move/from16 v39, v0

    move-object/from16 v40, v3

    move/from16 v29, v8

    .line 698
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :goto_b
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object/from16 v21, v0

    move/from16 v8, v29

    move/from16 v0, v39

    move-object/from16 v3, v40

    const/4 v6, 0x0

    const/4 v10, 0x1

    goto/16 :goto_3

    .line 651
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_13
    move/from16 v39, v0

    move-object/from16 v40, v3

    move/from16 v29, v8

    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    goto :goto_c

    .line 650
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_14
    move/from16 v39, v0

    move-object/from16 v40, v3

    move/from16 v29, v8

    .line 701
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :goto_c
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    move-object/from16 v22, v0

    .line 702
    if-eqz v22, :cond_15

    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_d

    :cond_15
    const/4 v0, 0x0

    :goto_d
    move-object/from16 v21, v0

    move/from16 v8, v29

    move/from16 v0, v39

    move-object/from16 v3, v40

    const/4 v6, 0x0

    const/4 v10, 0x1

    .end local v23    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_2

    .line 704
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :cond_16
    move/from16 v39, v0

    move-object/from16 v40, v3

    move/from16 v29, v8

    .line 639
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v18    # "mask$iv$iv$iv":I
    .end local v19    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v20    # "$i$f$visitAncestors":I
    .end local v21    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    nop

    .line 705
    .end local v15    # "includeSelf$iv$iv":Z
    .end local v16    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v17    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v9, 0x0

    .line 342
    .end local v11    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v13    # "type$iv":I
    .end local v14    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    :goto_e
    check-cast v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v9, :cond_18

    invoke-interface {v9}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto/16 :goto_1f

    .line 636
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    :catchall_1
    move-exception v0

    move-object/from16 v40, v3

    move/from16 v20, v4

    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_3f

    .line 342
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .restart local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_17
    move/from16 v39, v0

    move-object/from16 v40, v3

    move/from16 v29, v8

    .line 341
    .end local v0    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_18
    nop

    .line 343
    :try_start_8
    iget-object v0, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v3, 0x0

    .line 706
    .local v3, "$i$f$getKeyInput-OLwlOKw":I
    invoke-static/range {v29 .. v29}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v6

    .line 343
    .end local v3    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v0, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v6, "type$iv":I
    const/4 v3, 0x0

    .line 707
    .local v3, "$i$f$nearestAncestor-64DMado":I
    move-object v8, v0

    .line 708
    .local v8, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 710
    const/4 v9, 0x0

    .line 708
    .local v9, "includeSelf$iv$iv":Z
    const/4 v10, 0x0

    .line 712
    .local v10, "$i$f$visitAncestors-Y-YKmho":I
    move v11, v6

    .local v11, "mask$iv$iv$iv":I
    move-object v12, v8

    .local v12, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v13, 0x0

    .line 713
    .local v13, "$i$f$visitAncestors":I
    invoke-interface {v12}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .local v14, "value$iv$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 714
    .local v15, "$i$f$checkPrecondition":I
    nop

    .line 715
    if-nez v14, :cond_19

    .line 716
    const/16 v16, 0x0

    .line 713
    .local v16, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .line 716
    .end local v16    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    :try_start_9
    invoke-static {v7}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_f

    .line 636
    .end local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v6    # "type$iv":I
    .end local v8    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "includeSelf$iv$iv":Z
    .end local v10    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v11    # "mask$iv$iv$iv":I
    .end local v12    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors":I
    .end local v14    # "value$iv$iv$iv$iv":Z
    .end local v15    # "$i$f$checkPrecondition":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    :catchall_2
    move-exception v0

    move/from16 v20, v4

    goto/16 :goto_3f

    .line 718
    .restart local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v6    # "type$iv":I
    .restart local v8    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v9    # "includeSelf$iv$iv":Z
    .restart local v10    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v11    # "mask$iv$iv$iv":I
    .restart local v12    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v13    # "$i$f$visitAncestors":I
    .restart local v14    # "value$iv$iv$iv$iv":Z
    .restart local v15    # "$i$f$checkPrecondition":I
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    :cond_19
    :goto_f
    nop

    .line 719
    .end local v14    # "value$iv$iv$iv$iv":Z
    .end local v15    # "$i$f$checkPrecondition":I
    :try_start_a
    invoke-interface {v12}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v14

    .line 720
    .local v14, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v15
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 721
    .local v15, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_10
    if-eqz v15, :cond_2b

    .line 722
    :try_start_b
    invoke-virtual {v15}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v16

    .line 723
    .local v16, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v11

    if-eqz v17, :cond_29

    .line 724
    :goto_11
    if-eqz v14, :cond_28

    .line 725
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v11

    if-eqz v17, :cond_27

    .line 726
    move-object/from16 v17, v14

    .local v17, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v18, 0x0

    .line 712
    .local v18, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v19, v17

    .local v19, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 727
    .local v20, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v21, 0x0

    .line 728
    .local v21, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .local v22, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    move-object/from16 v42, v22

    move-object/from16 v22, v0

    move-object/from16 v0, v42

    .line 729
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v22, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_12
    if-eqz v0, :cond_26

    .line 730
    instance-of v1, v0, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v1, :cond_1a

    .line 731
    move-object v1, v0

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 732
    .local v23, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$nearestAncestor$2$iv":I
    goto/16 :goto_1e

    .line 733
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$nearestAncestor$2$iv":I
    :cond_1a
    move-object v1, v0

    .local v1, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 734
    .local v23, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v24

    and-int v24, v24, v6

    if-eqz v24, :cond_1b

    const/4 v1, 0x1

    goto :goto_13

    :cond_1b
    const/4 v1, 0x0

    .line 733
    .end local v1    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_13
    if-eqz v1, :cond_25

    instance-of v1, v0, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_25

    .line 735
    const/4 v1, 0x0

    .line 736
    .local v1, "count$iv$iv$iv":I
    move-object/from16 v23, v0

    check-cast v23, Landroidx/compose/ui/node/DelegatingNode;

    .local v23, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v24, 0x0

    .line 737
    .local v24, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v25

    .line 738
    .local v25, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_14
    if-eqz v25, :cond_23

    .line 739
    move-object/from16 v26, v25

    .local v26, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 740
    .local v27, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v28, v26

    .local v28, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 734
    .local v30, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, v6

    if-eqz v31, :cond_1c

    const/16 v28, 0x1

    goto :goto_15

    :cond_1c
    const/16 v28, 0x0

    .line 740
    .end local v28    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_15
    if-eqz v28, :cond_22

    .line 741
    add-int/lit8 v1, v1, 0x1

    .line 742
    move-object/from16 v28, v0

    const/4 v0, 0x1

    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v28, "node$iv$iv$iv":Ljava/lang/Object;
    if-ne v1, v0, :cond_1d

    .line 743
    move-object/from16 v0, v26

    move/from16 v33, v3

    move-object v3, v0

    .end local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_19

    .line 747
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_1d
    if-nez v21, :cond_1e

    const/4 v0, 0x0

    .line 748
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 749
    move/from16 v30, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v30, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv":I
    const/16 v31, 0x0

    .line 750
    .local v31, "$i$f$MutableVector":I
    move/from16 v32, v1

    .end local v1    # "count$iv$iv$iv":I
    .local v32, "count$iv$iv$iv":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v33, v3

    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .local v33, "$i$f$nearestAncestor-64DMado":I
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v34, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv":I
    .local v34, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v1, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 748
    .end local v31    # "$i$f$MutableVector":I
    .end local v34    # "capacity$iv$iv$iv$iv$iv":I
    goto :goto_16

    .line 747
    .end local v30    # "$i$f$mutableVectorOf":I
    .end local v32    # "count$iv$iv$iv":I
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .restart local v1    # "count$iv$iv$iv":I
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_1e
    move/from16 v32, v1

    move/from16 v33, v3

    .end local v1    # "count$iv$iv$iv":I
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .restart local v32    # "count$iv$iv$iv":I
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    move-object/from16 v1, v21

    :goto_16
    nop

    .line 751
    .end local v21    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v28

    .line 752
    .local v0, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_20

    .line 753
    if-eqz v1, :cond_1f

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 754
    :cond_1f
    const/4 v3, 0x0

    .end local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_17

    .line 752
    .end local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_20
    move-object/from16 v3, v28

    .line 756
    .end local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    :goto_17
    if-eqz v1, :cond_21

    move-object/from16 v21, v0

    move-object/from16 v0, v26

    .end local v26    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v21, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v26

    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_18

    .end local v21    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_21
    move-object/from16 v21, v0

    move-object/from16 v0, v26

    .end local v26    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v21    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_18
    move-object/from16 v21, v1

    move/from16 v1, v32

    goto :goto_19

    .line 740
    .end local v32    # "count$iv$iv$iv":I
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v1, "count$iv$iv$iv":I
    .local v3, "$i$f$nearestAncestor-64DMado":I
    .local v21, "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_22
    move-object/from16 v28, v0

    move/from16 v33, v3

    move-object/from16 v0, v26

    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .end local v26    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    move-object/from16 v3, v28

    .line 759
    .end local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_19
    nop

    .line 739
    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 760
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object/from16 v25, v0

    move-object v0, v3

    move/from16 v3, v33

    goto/16 :goto_14

    .line 762
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v3, "$i$f$nearestAncestor-64DMado":I
    :cond_23
    move-object/from16 v28, v0

    move/from16 v33, v3

    .line 763
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .end local v23    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v24    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v25    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    const/4 v0, 0x1

    if-ne v1, v0, :cond_24

    .line 765
    move-object/from16 v1, p0

    move-object/from16 v0, v28

    move/from16 v3, v33

    goto/16 :goto_12

    .line 763
    :cond_24
    move-object/from16 v0, v28

    goto :goto_1a

    .line 733
    .end local v1    # "count$iv$iv$iv":I
    .end local v28    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .restart local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_25
    move/from16 v33, v3

    .line 768
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    :goto_1a
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    move-object v0, v1

    move-object/from16 v1, p0

    move/from16 v3, v33

    goto/16 :goto_12

    .line 770
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_26
    move/from16 v33, v3

    .line 712
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .end local v19    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v21    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    nop

    .line 726
    .end local v17    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_1b

    .line 725
    .end local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .local v0, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_27
    move-object/from16 v22, v0

    move/from16 v33, v3

    .line 771
    .end local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .restart local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    :goto_1b
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object v14, v0

    move-object/from16 v1, p0

    move-object/from16 v0, v22

    move/from16 v3, v33

    goto/16 :goto_11

    .line 724
    .end local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .restart local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_28
    move-object/from16 v22, v0

    move/from16 v33, v3

    .end local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .restart local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    goto :goto_1c

    .line 723
    .end local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .restart local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_29
    move-object/from16 v22, v0

    move/from16 v33, v3

    .line 774
    .end local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .restart local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    :goto_1c
    invoke-virtual {v15}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    move-object v15, v0

    .line 775
    if-eqz v15, :cond_2a

    invoke-virtual {v15}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_1d

    :cond_2a
    const/4 v0, 0x0

    :goto_1d
    move-object v14, v0

    move-object/from16 v1, p0

    move-object/from16 v0, v22

    move/from16 v3, v33

    .end local v16    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_10

    .line 777
    .end local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    .restart local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$nearestAncestor-64DMado":I
    :cond_2b
    move-object/from16 v22, v0

    move/from16 v33, v3

    .line 712
    .end local v0    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$nearestAncestor-64DMado":I
    .end local v11    # "mask$iv$iv$iv":I
    .end local v12    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors":I
    .end local v14    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v33    # "$i$f$nearestAncestor-64DMado":I
    nop

    .line 778
    .end local v8    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "includeSelf$iv$iv":Z
    .end local v10    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v1, 0x0

    .line 343
    .end local v6    # "type$iv":I
    .end local v22    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v33    # "$i$f$nearestAncestor-64DMado":I
    :goto_1e
    :try_start_c
    check-cast v1, Landroidx/compose/ui/input/key/KeyInputModifierNode;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    if-eqz v1, :cond_2c

    :try_start_d
    invoke-interface {v1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto :goto_1f

    :cond_2c
    const/4 v11, 0x0

    .line 341
    :goto_1f
    nop

    .line 340
    nop

    .line 345
    .local v11, "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    if-eqz v11, :cond_65

    :try_start_e
    move-object v0, v11

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    .line 346
    const/4 v1, 0x0

    .line 779
    .local v1, "$i$f$getKeyInput-OLwlOKw":I
    invoke-static/range {v29 .. v29}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v3

    .line 345
    .end local v1    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v3, "type$iv":I
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v6, 0x0

    .line 780
    .local v6, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object v8, v0

    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v9, 0x0

    .line 781
    .local v9, "$i$f$ancestors-64DMado":I
    const/4 v10, 0x0

    .line 782
    .local v10, "result$iv$iv":Ljava/lang/Object;
    move-object v12, v8

    .line 783
    .local v12, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 785
    const/4 v13, 0x0

    .line 783
    .local v13, "includeSelf$iv$iv$iv":Z
    const/4 v14, 0x0

    .line 787
    .local v14, "$i$f$visitAncestors-Y-YKmho":I
    move v15, v3

    .local v15, "mask$iv$iv$iv$iv":I
    move-object/from16 v16, v12

    .local v16, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v17, 0x0

    .line 788
    .local v17, "$i$f$visitAncestors":I
    invoke-interface/range {v16 .. v16}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v18
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .local v18, "value$iv$iv$iv$iv$iv":Z
    const/16 v19, 0x0

    .line 789
    .local v19, "$i$f$checkPrecondition":I
    nop

    .line 790
    if-nez v18, :cond_2d

    .line 791
    const/16 v20, 0x0

    .line 788
    .local v20, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    nop

    .line 791
    .end local v20    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    :try_start_f
    invoke-static {v7}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 793
    :cond_2d
    nop

    .line 794
    .end local v18    # "value$iv$iv$iv$iv$iv":Z
    .end local v19    # "$i$f$checkPrecondition":I
    :try_start_10
    invoke-interface/range {v16 .. v16}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    .line 795
    .local v7, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 796
    .local v18, "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_20
    if-eqz v18, :cond_40

    .line 797
    :try_start_11
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    .line 798
    .local v19, "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v15

    if-eqz v20, :cond_3e

    .line 799
    :goto_21
    if-eqz v7, :cond_3d

    .line 800
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v15

    if-eqz v20, :cond_3c

    .line 801
    move-object/from16 v20, v7

    .local v20, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 787
    .local v21, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 802
    .local v23, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v24, 0x0

    .line 803
    .local v24, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .local v25, "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v25, v22

    move-object/from16 v42, v25

    move-object/from16 v25, v0

    move-object/from16 v0, v42

    .line 804
    .local v0, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v25, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_22
    if-eqz v0, :cond_3b

    .line 805
    move-object/from16 v26, v1

    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .local v26, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    instance-of v1, v0, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v1, :cond_2f

    .line 806
    move-object v1, v0

    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .line 807
    .local v27, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    if-nez v10, :cond_2e

    new-instance v28, Ljava/util/ArrayList;

    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    check-cast v28, Ljava/util/List;

    move-object/from16 v10, v28

    .line 808
    :cond_2e
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 809
    nop

    .line 806
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v27    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    move/from16 v37, v3

    goto/16 :goto_29

    .line 810
    :cond_2f
    move-object v1, v0

    .local v1, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 811
    .local v27, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v28

    and-int v28, v28, v3

    if-eqz v28, :cond_30

    const/4 v1, 0x1

    goto :goto_23

    :cond_30
    const/4 v1, 0x0

    .line 810
    .end local v1    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_23
    if-eqz v1, :cond_3a

    instance-of v1, v0, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_3a

    .line 812
    const/4 v1, 0x0

    .line 813
    .local v1, "count$iv$iv$iv$iv":I
    move-object/from16 v27, v0

    check-cast v27, Landroidx/compose/ui/node/DelegatingNode;

    .local v27, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v28, 0x0

    .line 814
    .local v28, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v29

    .line 815
    .local v29, "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_24
    if-eqz v29, :cond_38

    .line 816
    move-object/from16 v30, v29

    .local v30, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v31, 0x0

    .line 817
    .local v31, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    move-object/from16 v32, v30

    .local v32, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v33, 0x0

    .line 811
    .local v33, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v3

    if-eqz v34, :cond_31

    const/16 v32, 0x1

    goto :goto_25

    :cond_31
    const/16 v32, 0x0

    .line 817
    .end local v32    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_25
    if-eqz v32, :cond_37

    .line 818
    add-int/lit8 v1, v1, 0x1

    .line 819
    move-object/from16 v32, v0

    const/4 v0, 0x1

    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v32, "node$iv$iv$iv$iv":Ljava/lang/Object;
    if-ne v1, v0, :cond_32

    .line 820
    move-object/from16 v0, v30

    move/from16 v37, v3

    move-object/from16 v3, v30

    .end local v32    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    goto :goto_28

    .line 824
    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v32    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_32
    if-nez v24, :cond_33

    const/4 v0, 0x0

    .line 825
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 826
    move/from16 v33, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v33, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 827
    .local v34, "$i$f$MutableVector":I
    move/from16 v35, v1

    .end local v1    # "count$iv$iv$iv$iv":I
    .local v35, "count$iv$iv$iv$iv":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v37, v3

    .end local v3    # "type$iv":I
    .local v37, "type$iv":I
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v41, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv$iv":I
    .local v41, "capacity$iv$iv$iv$iv$iv$iv":I
    invoke-direct {v1, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 825
    .end local v34    # "$i$f$MutableVector":I
    .end local v41    # "capacity$iv$iv$iv$iv$iv$iv":I
    goto :goto_26

    .line 824
    .end local v33    # "$i$f$mutableVectorOf":I
    .end local v35    # "count$iv$iv$iv$iv":I
    .end local v37    # "type$iv":I
    .restart local v1    # "count$iv$iv$iv$iv":I
    .restart local v3    # "type$iv":I
    :cond_33
    move/from16 v35, v1

    move/from16 v37, v3

    .end local v1    # "count$iv$iv$iv$iv":I
    .end local v3    # "type$iv":I
    .restart local v35    # "count$iv$iv$iv$iv":I
    .restart local v37    # "type$iv":I
    move-object/from16 v1, v24

    :goto_26
    nop

    .line 828
    .end local v24    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v32

    .line 829
    .local v0, "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_35

    .line 830
    if-eqz v1, :cond_34

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 831
    :cond_34
    const/4 v3, 0x0

    move-object/from16 v32, v3

    .line 833
    :cond_35
    if-eqz v1, :cond_36

    move-object/from16 v3, v30

    .end local v30    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_27

    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v30    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_36
    move-object/from16 v3, v30

    .end local v30    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_27
    move-object/from16 v24, v1

    move-object/from16 v0, v32

    move/from16 v1, v35

    goto :goto_28

    .line 817
    .end local v32    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v35    # "count$iv$iv$iv$iv":I
    .end local v37    # "type$iv":I
    .local v0, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v1, "count$iv$iv$iv$iv":I
    .local v3, "type$iv":I
    .restart local v24    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_37
    move-object/from16 v32, v0

    move/from16 v37, v3

    move-object/from16 v3, v30

    .line 836
    .end local v30    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v37    # "type$iv":I
    :goto_28
    nop

    .line 816
    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v31    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    nop

    .line 837
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move-object/from16 v29, v3

    move/from16 v3, v37

    goto :goto_24

    .line 839
    .end local v37    # "type$iv":I
    .local v3, "type$iv":I
    :cond_38
    move-object/from16 v32, v0

    move/from16 v37, v3

    .line 840
    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v3    # "type$iv":I
    .end local v27    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v28    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v29    # "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v32    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v37    # "type$iv":I
    const/4 v0, 0x1

    if-ne v1, v0, :cond_39

    .line 842
    move-object/from16 v1, v26

    move-object/from16 v0, v32

    move/from16 v3, v37

    goto/16 :goto_22

    .line 840
    :cond_39
    move-object/from16 v0, v32

    goto :goto_29

    .line 810
    .end local v1    # "count$iv$iv$iv$iv":I
    .end local v32    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v37    # "type$iv":I
    .restart local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "type$iv":I
    :cond_3a
    move/from16 v37, v3

    .line 845
    .end local v3    # "type$iv":I
    .restart local v37    # "type$iv":I
    :goto_29
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    move-object v0, v1

    move-object/from16 v1, v26

    move/from16 v3, v37

    goto/16 :goto_22

    .line 847
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .local v1, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v3    # "type$iv":I
    :cond_3b
    move-object/from16 v26, v1

    move/from16 v37, v3

    .line 787
    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v3    # "type$iv":I
    .end local v22    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v24    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    nop

    .line 801
    .end local v20    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    goto :goto_2a

    .line 800
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v3    # "type$iv":I
    :cond_3c
    move-object/from16 v25, v0

    move-object/from16 v26, v1

    move/from16 v37, v3

    .line 848
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v3    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    :goto_2a
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object v7, v0

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    move/from16 v3, v37

    goto/16 :goto_21

    .line 799
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v3    # "type$iv":I
    :cond_3d
    move-object/from16 v25, v0

    move-object/from16 v26, v1

    move/from16 v37, v3

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v3    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    goto :goto_2b

    .line 798
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v3    # "type$iv":I
    :cond_3e
    move-object/from16 v25, v0

    move-object/from16 v26, v1

    move/from16 v37, v3

    .line 851
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v3    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    :goto_2b
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    move-object/from16 v18, v0

    .line 852
    if-eqz v18, :cond_3f

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_2c

    :cond_3f
    const/4 v0, 0x0

    :goto_2c
    move-object v7, v0

    move-object/from16 v0, v25

    move-object/from16 v1, v26

    move/from16 v3, v37

    .end local v19    # "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_20

    .line 854
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v3    # "type$iv":I
    :cond_40
    move-object/from16 v25, v0

    move-object/from16 v26, v1

    move/from16 v37, v3

    .line 787
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v3    # "type$iv":I
    .end local v7    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "mask$iv$iv$iv$iv":I
    .end local v16    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v17    # "$i$f$visitAncestors":I
    .end local v18    # "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    nop

    .line 855
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "includeSelf$iv$iv$iv":Z
    .end local v14    # "$i$f$visitAncestors-Y-YKmho":I
    nop

    .line 780
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    nop

    .line 856
    .local v10, "ancestors$iv":Ljava/util/List;
    if-eqz v10, :cond_44

    move-object v0, v10

    .local v0, "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 857
    .local v1, "$i$f$fastForEachReversed":I
    nop

    .line 858
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_43

    :cond_41
    move v7, v3

    .local v7, "index$iv$iv":I
    add-int/lit8 v3, v3, -0x1

    .line 859
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 860
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v12, 0x0

    .line 347
    .local v12, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$1":I
    invoke-interface {v9, v2}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v13
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    if-eqz v13, :cond_42

    .line 636
    .end local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEachReversed":I
    .end local v4    # "$i$f$trace":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v7    # "index$iv$iv":I
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    .end local v9    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$1":I
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    :goto_2d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/16 v36, 0x1

    return v36

    .line 860
    .restart local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .restart local v1    # "$i$f$fastForEachReversed":I
    .restart local v4    # "$i$f$trace":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v7    # "index$iv$iv":I
    .restart local v8    # "item$iv$iv":Ljava/lang/Object;
    .restart local v10    # "ancestors$iv":Ljava/util/List;
    .restart local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_42
    nop

    .line 858
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    if-gez v3, :cond_41

    .line 862
    .end local v7    # "index$iv$iv":I
    :cond_43
    nop

    .end local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEachReversed":I
    :try_start_12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 863
    :cond_44
    :try_start_13
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v1, 0x0

    .line 864
    .local v1, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 865
    .local v3, "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v7, "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    iput-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 866
    :goto_2e
    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz v8, :cond_52

    .line 867
    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v8, v8, Landroidx/compose/ui/input/key/KeyInputModifierNode;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-eqz v8, :cond_46

    .line 868
    :try_start_14
    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v9, 0x0

    .line 347
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$1":I
    invoke-interface {v8, v2}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v12
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    if-eqz v12, :cond_45

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v4    # "$i$f$trace":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v7    # "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v8    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$1":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    goto :goto_2d

    .line 868
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v4    # "$i$f$trace":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v7    # "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v10    # "ancestors$iv":Ljava/util/List;
    .restart local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_45
    move-object/from16 v16, v0

    move/from16 v19, v1

    move/from16 v20, v4

    goto/16 :goto_34

    .line 869
    :cond_46
    :try_start_15
    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/Modifier$Node;

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 811
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v12

    and-int v12, v12, v37

    if-eqz v12, :cond_47

    const/4 v8, 0x1

    goto :goto_2f

    :cond_47
    const/4 v8, 0x0

    .line 869
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_2f
    if-eqz v8, :cond_50

    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v8, v8, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_50

    .line 874
    const/4 v8, 0x0

    .line 875
    .local v8, "count$iv$iv":I
    iget-object v9, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v12, 0x0

    .line 876
    .local v12, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v13

    .line 877
    .local v13, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_30
    if-eqz v13, :cond_4f

    .line 878
    move-object v14, v13

    .local v14, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v15, 0x0

    .line 879
    .local v15, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v16, v14

    .local v16, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v17, 0x0

    .line 811
    .local v17, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v18
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    and-int v18, v18, v37

    if-eqz v18, :cond_48

    const/16 v16, 0x1

    goto :goto_31

    :cond_48
    const/16 v16, 0x0

    .line 879
    .end local v16    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v17    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_31
    if-eqz v16, :cond_4d

    .line 880
    add-int/lit8 v8, v8, 0x1

    .line 881
    move-object/from16 v16, v0

    const/4 v0, 0x1

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-ne v8, v0, :cond_49

    .line 882
    :try_start_16
    iput-object v14, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    move/from16 v19, v1

    move/from16 v20, v4

    goto :goto_33

    .line 886
    :cond_49
    :try_start_17
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v0, :cond_4a

    const/4 v0, 0x0

    .line 887
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 888
    move/from16 v17, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v17, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v18, 0x0

    .line 889
    .local v18, "$i$f$MutableVector":I
    move/from16 v19, v1

    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v19, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    move/from16 v20, v4

    .end local v4    # "$i$f$trace":I
    .local v20, "$i$f$trace":I
    :try_start_18
    new-array v4, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v21, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .local v21, "capacity$iv$iv$iv$iv":I
    invoke-direct {v1, v4, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 887
    .end local v18    # "$i$f$MutableVector":I
    .end local v21    # "capacity$iv$iv$iv$iv":I
    move-object v0, v1

    goto :goto_32

    .line 886
    .end local v17    # "$i$f$mutableVectorOf":I
    .end local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v20    # "$i$f$trace":I
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v4    # "$i$f$trace":I
    :cond_4a
    move/from16 v19, v1

    move/from16 v20, v4

    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v4    # "$i$f$trace":I
    .restart local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v20    # "$i$f$trace":I
    :goto_32
    iput-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 890
    iget-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .line 891
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_4c

    .line 892
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v1, :cond_4b

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 893
    :cond_4b
    const/4 v1, 0x0

    iput-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 895
    :cond_4c
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v1, :cond_4e

    invoke-virtual {v1, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_33

    .line 879
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v20    # "$i$f$trace":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v4    # "$i$f$trace":I
    :cond_4d
    move-object/from16 v16, v0

    move/from16 v19, v1

    move/from16 v20, v4

    .line 898
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v4    # "$i$f$trace":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v20    # "$i$f$trace":I
    :cond_4e
    :goto_33
    nop

    .line 878
    .end local v14    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 899
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object v13, v0

    move-object/from16 v0, v16

    move/from16 v1, v19

    move/from16 v4, v20

    goto/16 :goto_30

    .line 901
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v20    # "$i$f$trace":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v4    # "$i$f$trace":I
    :cond_4f
    move-object/from16 v16, v0

    move/from16 v19, v1

    move/from16 v20, v4

    .line 902
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v4    # "$i$f$trace":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v12    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v13    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v20    # "$i$f$trace":I
    const/4 v0, 0x1

    if-ne v8, v0, :cond_51

    .line 904
    move-object/from16 v0, v16

    move/from16 v1, v19

    move/from16 v4, v20

    goto/16 :goto_2e

    .line 869
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v20    # "$i$f$trace":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v4    # "$i$f$trace":I
    :cond_50
    move-object/from16 v16, v0

    move/from16 v19, v1

    move/from16 v20, v4

    .line 907
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v4    # "$i$f$trace":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v20    # "$i$f$trace":I
    :cond_51
    :goto_34
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    iput-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v0, v16

    move/from16 v1, v19

    move/from16 v4, v20

    goto/16 :goto_2e

    .line 909
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v20    # "$i$f$trace":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v4    # "$i$f$trace":I
    :cond_52
    move-object/from16 v16, v0

    move/from16 v19, v1

    move/from16 v20, v4

    .line 910
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v4    # "$i$f$trace":I
    .end local v7    # "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v20    # "$i$f$trace":I
    const/4 v0, 0x0

    .line 348
    .local v0, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$2":I
    invoke-interface/range {p2 .. p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_53

    .end local v0    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$2":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$f$trace":I
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_2d

    .line 910
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v10    # "ancestors$iv":Ljava/util/List;
    .restart local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .restart local v20    # "$i$f$trace":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_53
    nop

    .line 911
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v1, 0x0

    .line 912
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 913
    .restart local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v4, "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    iput-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 914
    :goto_35
    iget-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz v7, :cond_61

    .line 915
    iget-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v7, v7, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v7, :cond_55

    .line 916
    iget-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v7, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v8, 0x0

    .line 349
    .local v8, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$3":I
    invoke-interface {v7, v2}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v9

    if-eqz v9, :cond_54

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v4    # "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v7    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v8    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$3":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$f$trace":I
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_2d

    .line 916
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v4    # "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v10    # "ancestors$iv":Ljava/util/List;
    .restart local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .restart local v20    # "$i$f$trace":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_54
    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    const/4 v1, 0x0

    goto/16 :goto_3c

    .line 917
    :cond_55
    iget-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/Modifier$Node;

    .local v7, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v8, 0x0

    .line 811
    .local v8, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v9

    and-int v9, v9, v37

    if-eqz v9, :cond_56

    const/4 v7, 0x1

    goto :goto_36

    :cond_56
    const/4 v7, 0x0

    .line 917
    .end local v7    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_36
    if-eqz v7, :cond_5f

    iget-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v7, v7, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v7, :cond_5f

    .line 922
    const/4 v7, 0x0

    .line 923
    .local v7, "count$iv$iv":I
    iget-object v8, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v9, 0x0

    .line 924
    .local v9, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 925
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_37
    if-eqz v12, :cond_5e

    .line 926
    move-object v13, v12

    .local v13, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 927
    .local v14, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 811
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v37

    if-eqz v17, :cond_57

    const/4 v15, 0x1

    goto :goto_38

    :cond_57
    const/4 v15, 0x0

    .line 927
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_38
    if-eqz v15, :cond_5c

    .line 928
    add-int/lit8 v7, v7, 0x1

    .line 929
    const/4 v15, 0x1

    if-ne v7, v15, :cond_58

    .line 930
    iput-object v13, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    const/4 v1, 0x0

    goto :goto_3b

    .line 934
    :cond_58
    iget-object v15, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v15, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v15, :cond_59

    const/4 v15, 0x0

    .line 935
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 936
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 937
    .local v17, "$i$f$MutableVector":I
    move/from16 v18, v1

    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v5

    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v19, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    new-array v5, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v21, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .restart local v21    # "capacity$iv$iv$iv$iv":I
    invoke-direct {v1, v5, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 935
    .end local v17    # "$i$f$MutableVector":I
    .end local v21    # "capacity$iv$iv$iv$iv":I
    move-object v15, v1

    goto :goto_39

    .line 934
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_59
    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_39
    iput-object v15, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 938
    iget-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .line 939
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_5b

    .line 940
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v1, :cond_5a

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 941
    :cond_5a
    const/4 v1, 0x0

    iput-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_3a

    .line 939
    :cond_5b
    const/4 v1, 0x0

    .line 943
    :goto_3a
    iget-object v5, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v5, :cond_5d

    invoke-virtual {v5, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_3b

    .line 927
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_5c
    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    const/4 v1, 0x0

    .line 946
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_5d
    :goto_3b
    nop

    .line 926
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 947
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move-object v12, v0

    move-object/from16 v0, v16

    move/from16 v1, v18

    move-object/from16 v5, v19

    goto/16 :goto_37

    .line 949
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_5e
    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    const/4 v1, 0x0

    .line 950
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v9    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v0, 0x1

    if-ne v7, v0, :cond_60

    .line 952
    move-object/from16 v0, v16

    move/from16 v1, v18

    move-object/from16 v5, v19

    goto/16 :goto_35

    .line 917
    .end local v7    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_5f
    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    const/4 v1, 0x0

    .line 955
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_60
    :goto_3c
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    iput-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v0, v16

    move/from16 v1, v18

    move-object/from16 v5, v19

    goto/16 :goto_35

    .line 957
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_61
    move-object/from16 v16, v0

    move/from16 v18, v1

    move-object/from16 v19, v5

    .line 958
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v1    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v4    # "node$iv$iv":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    if-eqz v10, :cond_64

    move-object v0, v10

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 959
    .local v1, "$i$f$fastForEach":I
    nop

    .line 960
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_3d
    if-ge v3, v4, :cond_63

    .line 961
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 962
    .local v5, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v5

    check-cast v7, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v7, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v8, 0x0

    .line 349
    .local v8, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$3":I
    invoke-interface {v7, v2}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v9

    if-eqz v9, :cond_62

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEach":I
    .end local v3    # "index$iv$iv":I
    .end local v5    # "item$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v7    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v8    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$3":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v20    # "$i$f$trace":I
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_2d

    .restart local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v1    # "$i$f$fastForEach":I
    .restart local v3    # "index$iv$iv":I
    .restart local v5    # "item$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v7    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .restart local v8    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$3":I
    .restart local v10    # "ancestors$iv":Ljava/util/List;
    .restart local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v20    # "$i$f$trace":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "type$iv":I
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :cond_62
    const/16 v36, 0x1

    .line 962
    .end local v7    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v8    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$1$3":I
    nop

    .line 960
    .end local v5    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_3d

    .line 964
    .end local v3    # "index$iv$iv":I
    :cond_63
    nop

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEach":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 965
    :cond_64
    nop

    .end local v6    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v37    # "type$iv":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    goto :goto_3e

    .line 636
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    :catchall_3
    move-exception v0

    goto :goto_3f

    .line 345
    .end local v20    # "$i$f$trace":I
    .local v4, "$i$f$trace":I
    .local v5, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .restart local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    :cond_65
    move/from16 v20, v4

    move-object/from16 v19, v5

    .line 351
    .end local v4    # "$i$f$trace":I
    .end local v5    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v20    # "$i$f$trace":I
    :goto_3e
    nop

    .line 636
    .end local v11    # "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v20    # "$i$f$trace":I
    .end local v39    # "$i$a$-trace-FocusOwnerImpl$dispatchKeyEvent$1":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/16 v38, 0x0

    return v38

    .restart local v4    # "$i$f$trace":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :catchall_4
    move-exception v0

    move/from16 v20, v4

    .end local v4    # "$i$f$trace":I
    .restart local v20    # "$i$f$trace":I
    goto :goto_3f

    .end local v20    # "$i$f$trace":I
    .end local v40    # "sectionName$iv":Ljava/lang/String;
    .local v3, "sectionName$iv":Ljava/lang/String;
    .restart local v4    # "$i$f$trace":I
    :catchall_5
    move-exception v0

    move-object/from16 v40, v3

    move/from16 v20, v4

    .end local v3    # "sectionName$iv":Ljava/lang/String;
    .end local v4    # "$i$f$trace":I
    .restart local v20    # "$i$f$trace":I
    .restart local v40    # "sectionName$iv":Ljava/lang/String;
    :goto_3f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z
    .locals 39
    .param p1, "event"    # Landroidx/compose/ui/input/rotary/RotaryScrollEvent;
    .param p2, "onFocusedItem"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 384
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 386
    const-string v2, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 387
    return v3

    .line 391
    :cond_0
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v2

    const-string/jumbo v4, "visitAncestors called on an unattached node"

    const/16 v5, 0x4000

    const/4 v7, 0x1

    if-eqz v2, :cond_14

    check-cast v2, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v8, 0x0

    .line 1222
    .local v8, "$i$f$getRotaryInput-OLwlOKw":I
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v8

    .line 391
    .end local v8    # "$i$f$getRotaryInput-OLwlOKw":I
    nop

    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v8, "type$iv":I
    move-object/from16 v9, p0

    .local v9, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v10, 0x0

    .line 1223
    .local v10, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v11, 0x1

    .local v11, "includeSelf$iv$iv":Z
    move-object v12, v2

    .local v12, "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v13, 0x0

    .line 1224
    .local v13, "$i$f$visitAncestors-Y-YKmho":I
    move v14, v8

    .local v14, "mask$iv$iv$iv":I
    move-object v15, v12

    .local v15, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 1225
    .local v16, "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    .local v17, "value$iv$iv$iv$iv":Z
    const/16 v18, 0x0

    .line 1226
    .local v18, "$i$f$checkPrecondition":I
    nop

    .line 1227
    if-nez v17, :cond_1

    .line 1228
    const/16 v19, 0x0

    .line 1225
    .local v19, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .line 1228
    .end local v19    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1230
    :cond_1
    nop

    .line 1231
    .end local v17    # "value$iv$iv$iv$iv":Z
    .end local v18    # "$i$f$checkPrecondition":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    .line 1232
    .local v17, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 1233
    .local v18, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v18, :cond_13

    .line 1234
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    .line 1235
    .local v19, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_11

    .line 1236
    :goto_1
    if-eqz v17, :cond_10

    .line 1237
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_f

    .line 1238
    move-object/from16 v20, v17

    .local v20, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 1224
    .local v21, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 1239
    .local v23, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v24, 0x0

    .line 1240
    .local v24, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .local v25, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v25, v22

    move-object/from16 v38, v25

    move/from16 v25, v5

    move-object/from16 v5, v38

    .line 1241
    .end local v25    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v5, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v5, :cond_e

    .line 1242
    instance-of v6, v5, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v6, :cond_2

    .line 1243
    move-object v6, v5

    .local v6, "it$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 1244
    .local v26, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    goto/16 :goto_c

    .line 1245
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    :cond_2
    move-object v6, v5

    .local v6, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 1246
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v8

    if-eqz v27, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    move v6, v3

    .line 1245
    .end local v6    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_3
    if-eqz v6, :cond_c

    instance-of v6, v5, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_c

    .line 1247
    const/4 v6, 0x0

    .line 1248
    .local v6, "count$iv$iv$iv":I
    move-object/from16 v26, v5

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 1249
    .local v27, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 1250
    .local v28, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v28, :cond_b

    .line 1251
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1252
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v32, 0x0

    .line 1246
    .local v32, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v33

    and-int v33, v33, v8

    if-eqz v33, :cond_4

    move/from16 v31, v7

    goto :goto_5

    :cond_4
    move/from16 v31, v3

    .line 1252
    .end local v31    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v32    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v31, :cond_a

    .line 1253
    add-int/lit8 v6, v6, 0x1

    .line 1254
    if-ne v6, v7, :cond_5

    .line 1255
    move-object/from16 v5, v29

    move-object/from16 v34, v2

    move-object/from16 v7, v29

    goto :goto_8

    .line 1259
    :cond_5
    if-nez v24, :cond_6

    const/16 v31, 0x0

    .line 1260
    .local v31, "$i$f$mutableVectorOf":I
    nop

    .line 1261
    const/16 v7, 0x10

    .local v7, "capacity$iv$iv$iv$iv$iv":I
    const/16 v33, 0x0

    .line 1262
    .local v33, "$i$f$MutableVector":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v34, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    new-array v2, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v1, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1260
    .end local v7    # "capacity$iv$iv$iv$iv$iv":I
    .end local v33    # "$i$f$MutableVector":I
    goto :goto_6

    .line 1259
    .end local v31    # "$i$f$mutableVectorOf":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_6
    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v1, v24

    :goto_6
    nop

    .line 1263
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v2, v5

    .line 1264
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_8

    .line 1265
    if-eqz v1, :cond_7

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1266
    :cond_7
    const/4 v5, 0x0

    .line 1268
    :cond_8
    if-eqz v1, :cond_9

    move-object/from16 v7, v29

    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v7, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_9
    move-object/from16 v7, v29

    .line 1271
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_7
    move-object/from16 v24, v1

    goto :goto_8

    .line 1252
    .end local v1    # "stack$iv$iv$iv":Ljava/lang/Object;
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_a
    move-object/from16 v34, v2

    move-object/from16 v7, v29

    .line 1271
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_8
    nop

    .line 1251
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 1272
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move-object/from16 v1, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto :goto_4

    .line 1274
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_b
    move-object/from16 v34, v2

    .line 1275
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v1, 0x1

    if-ne v6, v1, :cond_d

    .line 1277
    move-object/from16 v1, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 1245
    .end local v6    # "count$iv$iv$iv":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_c
    move-object/from16 v34, v2

    .line 1280
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_d
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 1282
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_e
    move-object/from16 v34, v2

    .line 1224
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v5    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1238
    .end local v20    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_9

    .line 1237
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_f
    move-object/from16 v34, v2

    move/from16 v25, v5

    .line 1283
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_9
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move/from16 v5, v25

    move-object/from16 v2, v34

    goto/16 :goto_1

    .line 1236
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_10
    move-object/from16 v34, v2

    move/from16 v25, v5

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    goto :goto_a

    .line 1235
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_11
    move-object/from16 v34, v2

    move/from16 v25, v5

    .line 1286
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_a
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 1287
    if-eqz v18, :cond_12

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    goto :goto_b

    :cond_12
    const/4 v1, 0x0

    :goto_b
    move-object/from16 v17, v1

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move/from16 v5, v25

    move-object/from16 v2, v34

    .end local v19    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1289
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_13
    move-object/from16 v34, v2

    move/from16 v25, v5

    .line 1224
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "mask$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1290
    .end local v11    # "includeSelf$iv$iv":Z
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v6, 0x0

    .end local v8    # "type$iv":I
    .end local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_c
    check-cast v6, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    goto :goto_d

    .line 391
    :cond_14
    move/from16 v25, v5

    const/4 v6, 0x0

    .line 390
    :goto_d
    nop

    .line 393
    .local v6, "focusedRotaryInputNode":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    if-eqz v6, :cond_4d

    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/node/DelegatableNode;

    .line 394
    const/4 v2, 0x0

    .line 1291
    .local v2, "$i$f$getRotaryInput-OLwlOKw":I
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v2

    .line 393
    .end local v2    # "$i$f$getRotaryInput-OLwlOKw":I
    nop

    .local v2, "type$iv":I
    move-object/from16 v5, p0

    .local v1, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v5, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v7, 0x0

    .line 1292
    .local v7, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object v8, v1

    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v9, 0x0

    .line 1293
    .local v9, "$i$f$ancestors-64DMado":I
    const/4 v10, 0x0

    .line 1294
    .local v10, "result$iv$iv":Ljava/lang/Object;
    move-object v11, v8

    .line 1295
    .local v11, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1297
    const/4 v12, 0x0

    .line 1295
    .local v12, "includeSelf$iv$iv$iv":Z
    const/4 v13, 0x0

    .line 1299
    .restart local v13    # "$i$f$visitAncestors-Y-YKmho":I
    move v14, v2

    .local v14, "mask$iv$iv$iv$iv":I
    move-object v15, v11

    .local v15, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 1300
    .restart local v16    # "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    .local v17, "value$iv$iv$iv$iv$iv":Z
    const/16 v18, 0x0

    .line 1301
    .local v18, "$i$f$checkPrecondition":I
    nop

    .line 1302
    if-nez v17, :cond_15

    .line 1303
    const/16 v19, 0x0

    .line 1300
    .local v19, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    nop

    .line 1303
    .end local v19    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1305
    :cond_15
    nop

    .line 1306
    .end local v17    # "value$iv$iv$iv$iv$iv":Z
    .end local v18    # "$i$f$checkPrecondition":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    .line 1307
    .local v4, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 1308
    .local v17, "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_e
    if-eqz v17, :cond_28

    .line 1309
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    .line 1310
    .local v18, "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_26

    .line 1311
    :goto_f
    if-eqz v4, :cond_25

    .line 1312
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_24

    .line 1313
    move-object/from16 v19, v4

    .local v19, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 1299
    .local v20, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    move-object/from16 v21, v19

    .local v21, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 1314
    .local v22, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v23, 0x0

    .line 1315
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .local v24, "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v21

    move-object/from16 v3, v24

    .line 1316
    .end local v24    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_10
    if-eqz v3, :cond_23

    .line 1317
    move-object/from16 v25, v1

    .end local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v25, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    instance-of v1, v3, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v1, :cond_17

    .line 1318
    move-object v1, v3

    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 1319
    .local v26, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    if-nez v10, :cond_16

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v10, v27

    check-cast v10, Ljava/util/List;

    .line 1320
    :cond_16
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1321
    nop

    .line 1318
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    move/from16 v31, v2

    goto/16 :goto_18

    .line 1322
    :cond_17
    move-object v1, v3

    .local v1, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 1323
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v2

    if-eqz v27, :cond_18

    const/4 v1, 0x1

    goto :goto_11

    :cond_18
    const/4 v1, 0x0

    .line 1322
    .end local v1    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_11
    if-eqz v1, :cond_22

    instance-of v1, v3, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_22

    .line 1324
    const/4 v1, 0x0

    .line 1325
    .local v1, "count$iv$iv$iv$iv":I
    move-object/from16 v26, v3

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 1326
    .restart local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 1327
    .local v28, "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_12
    if-eqz v28, :cond_20

    .line 1328
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1329
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v33, 0x0

    .line 1323
    .local v33, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v2

    if-eqz v34, :cond_19

    const/16 v31, 0x1

    goto :goto_13

    :cond_19
    const/16 v31, 0x0

    .line 1329
    .end local v31    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_13
    if-eqz v31, :cond_1f

    .line 1330
    add-int/lit8 v1, v1, 0x1

    .line 1331
    move/from16 v31, v2

    const/4 v2, 0x1

    .end local v2    # "type$iv":I
    .local v31, "type$iv":I
    if-ne v1, v2, :cond_1a

    .line 1332
    move-object/from16 v3, v29

    move-object/from16 v36, v3

    goto :goto_17

    .line 1336
    :cond_1a
    if-nez v23, :cond_1b

    const/4 v2, 0x0

    .line 1337
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 1338
    move/from16 v33, v1

    .end local v1    # "count$iv$iv$iv$iv":I
    .local v33, "count$iv$iv$iv$iv":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 1339
    .local v34, "$i$f$MutableVector":I
    move/from16 v35, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v35, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v36, v3

    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v36, "node$iv$iv$iv$iv":Ljava/lang/Object;
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v37, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv$iv$iv":I
    .local v37, "capacity$iv$iv$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1337
    .end local v34    # "$i$f$MutableVector":I
    .end local v37    # "capacity$iv$iv$iv$iv$iv$iv":I
    goto :goto_14

    .line 1336
    .end local v33    # "count$iv$iv$iv$iv":I
    .end local v35    # "$i$f$mutableVectorOf":I
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v1, "count$iv$iv$iv$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_1b
    move/from16 v33, v1

    move-object/from16 v36, v3

    .end local v1    # "count$iv$iv$iv$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "count$iv$iv$iv$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v23

    :goto_14
    nop

    .line 1340
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v1, v36

    .line 1341
    .local v1, "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_1d

    .line 1342
    if-eqz v2, :cond_1c

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1343
    :cond_1c
    const/4 v3, 0x0

    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    goto :goto_15

    .line 1341
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_1d
    move-object/from16 v3, v36

    .line 1345
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_15
    if-eqz v2, :cond_1e

    move-object/from16 v23, v3

    move-object/from16 v3, v29

    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v23, "node$iv$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .end local v23    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1e
    move-object/from16 v23, v3

    move-object/from16 v3, v29

    .line 1348
    .end local v1    # "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_16
    move-object/from16 v36, v23

    move/from16 v1, v33

    move-object/from16 v23, v2

    goto :goto_17

    .line 1329
    .end local v31    # "type$iv":I
    .end local v33    # "count$iv$iv$iv$iv":I
    .local v1, "count$iv$iv$iv$iv":I
    .local v2, "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    move/from16 v31, v2

    move-object/from16 v36, v3

    move-object/from16 v3, v29

    .line 1348
    .end local v2    # "type$iv":I
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_17
    nop

    .line 1328
    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    nop

    .line 1349
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto :goto_12

    .line 1351
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_20
    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 1352
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v26    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v1, v2, :cond_21

    .line 1354
    move-object/from16 v1, v25

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto/16 :goto_10

    .line 1352
    :cond_21
    move-object/from16 v3, v36

    goto :goto_18

    .line 1322
    .end local v1    # "count$iv$iv$iv$iv":I
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_22
    move/from16 v31, v2

    .line 1357
    .end local v2    # "type$iv":I
    .restart local v31    # "type$iv":I
    :goto_18
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move-object/from16 v1, v25

    move/from16 v2, v31

    goto/16 :goto_10

    .line 1359
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .local v1, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_23
    move-object/from16 v25, v1

    move/from16 v31, v2

    .line 1299
    .end local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v21    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    nop

    .line 1313
    .end local v19    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    goto :goto_19

    .line 1312
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_24
    move-object/from16 v25, v1

    move/from16 v31, v2

    .line 1360
    .end local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    :goto_19
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v1, v25

    move/from16 v2, v31

    const/4 v3, 0x0

    goto/16 :goto_f

    .line 1311
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_25
    move-object/from16 v25, v1

    move/from16 v31, v2

    .end local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    goto :goto_1a

    .line 1310
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_26
    move-object/from16 v25, v1

    move/from16 v31, v2

    .line 1363
    .end local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    :goto_1a
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 1364
    if-eqz v17, :cond_27

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v1

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    goto :goto_1b

    :cond_27
    const/4 v1, 0x0

    :goto_1b
    move-object v4, v1

    move-object/from16 v1, v25

    move/from16 v2, v31

    const/4 v3, 0x0

    .end local v18    # "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_e

    .line 1366
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_28
    move-object/from16 v25, v1

    move/from16 v31, v2

    .line 1299
    .end local v1    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v4    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "mask$iv$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    nop

    .line 1367
    .end local v11    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "includeSelf$iv$iv$iv":Z
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    nop

    .line 1292
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    nop

    .line 1368
    .local v10, "ancestors$iv":Ljava/util/List;
    if-eqz v10, :cond_2c

    move-object v1, v10

    .local v1, "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1369
    .local v2, "$i$f$fastForEachReversed":I
    nop

    .line 1370
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_2b

    :cond_29
    move v4, v3

    .local v4, "index$iv$iv":I
    add-int/lit8 v3, v3, -0x1

    .line 1371
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1372
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v11, 0x0

    .line 395
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$1":I
    invoke-interface {v9, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v12

    if-eqz v12, :cond_2a

    const/16 v32, 0x1

    return v32

    .line 1372
    .end local v9    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$1":I
    :cond_2a
    nop

    .line 1370
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    if-gez v3, :cond_29

    .line 1374
    .end local v4    # "index$iv$iv":I
    :cond_2b
    nop

    .line 1375
    .end local v1    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEachReversed":I
    :cond_2c
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .local v1, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1376
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1377
    .local v3, "stack$iv$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "node$iv$iv":Ljava/lang/Object;
    move-object v4, v1

    .line 1378
    :goto_1c
    if-eqz v4, :cond_3a

    .line 1379
    instance-of v8, v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v8, :cond_2e

    .line 1380
    move-object v8, v4

    check-cast v8, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v9, 0x0

    .line 395
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$1":I
    invoke-interface {v8, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v11

    if-eqz v11, :cond_2d

    const/16 v32, 0x1

    return v32

    .line 1380
    .end local v8    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$1":I
    :cond_2d
    move-object/from16 v16, v1

    move/from16 v18, v2

    goto/16 :goto_22

    .line 1381
    :cond_2e
    move-object v8, v4

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 1323
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_2f

    const/4 v8, 0x1

    goto :goto_1d

    :cond_2f
    const/4 v8, 0x0

    .line 1381
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1d
    if-eqz v8, :cond_39

    instance-of v8, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_39

    .line 1386
    const/4 v8, 0x0

    .line 1387
    .local v8, "count$iv$iv":I
    move-object v9, v4

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 1388
    .local v11, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1389
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_1e
    if-eqz v12, :cond_37

    .line 1390
    move-object v13, v12

    .local v13, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1391
    .local v14, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 1323
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_30

    const/4 v15, 0x1

    goto :goto_1f

    :cond_30
    const/4 v15, 0x0

    .line 1391
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1f
    if-eqz v15, :cond_35

    .line 1392
    add-int/lit8 v8, v8, 0x1

    .line 1393
    const/4 v15, 0x1

    if-ne v8, v15, :cond_31

    .line 1394
    move-object v4, v13

    move-object/from16 v16, v1

    move/from16 v18, v2

    goto :goto_21

    .line 1398
    :cond_31
    if-nez v3, :cond_32

    const/4 v15, 0x0

    .line 1399
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 1400
    move-object/from16 v16, v1

    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 1401
    .local v17, "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .local v19, "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .local v20, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1399
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_20

    .line 1398
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v1, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_32
    move-object/from16 v16, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_20
    move-object v3, v2

    .line 1402
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v1, v4

    .line 1403
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_34

    .line 1404
    if-eqz v3, :cond_33

    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1405
    :cond_33
    const/4 v2, 0x0

    move-object v4, v2

    .line 1407
    :cond_34
    if-eqz v3, :cond_36

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_21

    .line 1391
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v1, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_35
    move-object/from16 v16, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1410
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_36
    :goto_21
    nop

    .line 1390
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1411
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v1, v16

    move/from16 v2, v18

    goto :goto_1e

    .line 1413
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_37
    move-object/from16 v16, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1414
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_38

    .line 1416
    move-object/from16 v1, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_1c

    .line 1414
    :cond_38
    move-object/from16 v3, v19

    goto :goto_22

    .line 1381
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_39
    move-object/from16 v16, v1

    move/from16 v18, v2

    .line 1419
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_22
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v1, v16

    move/from16 v2, v18

    goto/16 :goto_1c

    .line 1421
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_3a
    move-object/from16 v16, v1

    move/from16 v18, v2

    .line 1422
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v4    # "node$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 396
    .local v1, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$2":I
    invoke-interface/range {p2 .. p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3b

    const/16 v32, 0x1

    return v32

    .line 1422
    .end local v1    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$2":I
    :cond_3b
    nop

    .line 1423
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .local v1, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1424
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1425
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .restart local v4    # "node$iv$iv":Ljava/lang/Object;
    move-object v4, v1

    .line 1426
    :goto_23
    if-eqz v4, :cond_49

    .line 1427
    instance-of v8, v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v8, :cond_3d

    .line 1428
    move-object v8, v4

    check-cast v8, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v9, 0x0

    .line 397
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$3":I
    invoke-interface {v8, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v11

    if-eqz v11, :cond_3c

    const/16 v32, 0x1

    return v32

    .line 1428
    .end local v8    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$3":I
    :cond_3c
    move-object/from16 v16, v1

    move/from16 v18, v2

    goto/16 :goto_29

    .line 1429
    :cond_3d
    move-object v8, v4

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 1323
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_3e

    const/4 v8, 0x1

    goto :goto_24

    :cond_3e
    const/4 v8, 0x0

    .line 1429
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_24
    if-eqz v8, :cond_48

    instance-of v8, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_48

    .line 1434
    const/4 v8, 0x0

    .line 1435
    .local v8, "count$iv$iv":I
    move-object v9, v4

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 1436
    .restart local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1437
    .restart local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_25
    if-eqz v12, :cond_46

    .line 1438
    move-object v13, v12

    .restart local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1439
    .restart local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 1323
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_3f

    const/4 v15, 0x1

    goto :goto_26

    :cond_3f
    const/4 v15, 0x0

    .line 1439
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_26
    if-eqz v15, :cond_44

    .line 1440
    add-int/lit8 v8, v8, 0x1

    .line 1441
    const/4 v15, 0x1

    if-ne v8, v15, :cond_40

    .line 1442
    move-object v4, v13

    move-object/from16 v16, v1

    move/from16 v18, v2

    goto :goto_28

    .line 1446
    :cond_40
    if-nez v3, :cond_41

    const/4 v15, 0x0

    .line 1447
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 1448
    move-object/from16 v16, v1

    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 1449
    .restart local v17    # "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .restart local v20    # "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1447
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_27

    .line 1446
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v1, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_41
    move-object/from16 v16, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_27
    move-object v3, v2

    .line 1450
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v1, v4

    .line 1451
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_43

    .line 1452
    if-eqz v3, :cond_42

    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1453
    :cond_42
    const/4 v2, 0x0

    move-object v4, v2

    .line 1455
    :cond_43
    if-eqz v3, :cond_45

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_28

    .line 1439
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v1, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_44
    move-object/from16 v16, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1458
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_45
    :goto_28
    nop

    .line 1438
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1459
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v1, v16

    move/from16 v2, v18

    goto :goto_25

    .line 1461
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_46
    move-object/from16 v16, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1462
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_47

    .line 1464
    move-object/from16 v1, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_23

    .line 1462
    :cond_47
    move-object/from16 v3, v19

    goto :goto_29

    .line 1429
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_48
    move-object/from16 v16, v1

    move/from16 v18, v2

    .line 1467
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_29
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v1, v16

    move/from16 v2, v18

    goto/16 :goto_23

    .line 1469
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_49
    move-object/from16 v16, v1

    move/from16 v18, v2

    .line 1470
    .end local v1    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v4    # "node$iv$iv":Ljava/lang/Object;
    if-eqz v10, :cond_4c

    move-object v1, v10

    .local v1, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1471
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1472
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_2a
    if-ge v3, v4, :cond_4b

    .line 1473
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1474
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v11, 0x0

    .line 397
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$3":I
    invoke-interface {v9, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v12

    if-eqz v12, :cond_4a

    const/16 v32, 0x1

    return v32

    :cond_4a
    const/16 v32, 0x1

    .line 1474
    .end local v9    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$3":I
    nop

    .line 1472
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_2a

    .line 1476
    .end local v3    # "index$iv$iv":I
    :cond_4b
    nop

    .line 1477
    .end local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :cond_4c
    nop

    .line 400
    .end local v5    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    :cond_4d
    const/16 v24, 0x0

    return v24
.end method

.method public focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 6
    .param p1, "focusDirection"    # I
    .param p2, "focusedRect"    # Landroidx/compose/ui/geometry/Rect;
    .param p3, "onFound"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 308
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v2, v0

    .local v2, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v3, 0x0

    .line 310
    .local v3, "$i$a$-also-FocusOwnerImpl$focusSearch$source$1":I
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lkotlin/jvm/functions/Function0;

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {v2, p1, v4}, Landroidx/compose/ui/focus/FocusTraversalKt;->customFocusSearch--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v4

    .line 311
    .local v4, "customDest":Landroidx/compose/ui/focus/FocusRequester;
    sget-object v5, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v1

    .line 312
    :cond_0
    sget-object v5, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    :cond_1
    return-object v1

    .line 313
    :cond_2
    sget-object v1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 316
    invoke-virtual {v4, p3}, Landroidx/compose/ui/focus/FocusRequester;->findFocusTargetNode$ui_release(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 318
    .end local v4    # "customDest":Landroidx/compose/ui/focus/FocusRequester;
    :cond_3
    nop

    .line 308
    .end local v2    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v3    # "$i$a$-also-FocusOwnerImpl$focusSearch$source$1":I
    goto :goto_0

    :cond_4
    move-object v0, v1

    .line 307
    :goto_0
    nop

    .line 320
    .local v0, "source":Landroidx/compose/ui/focus/FocusTargetNode;
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/unit/LayoutDirection;

    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$focusSearch$1;

    invoke-direct {v3, v0, p0, p3}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusSearch$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;Lkotlin/jvm/functions/Function1;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p1, v2, p2, v3}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusSearch-0X8WOeE(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 471
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-object v0
.end method

.method public getFocusRect()Landroidx/compose/ui/geometry/Rect;
    .locals 1

    .line 459
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusRect(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;
    .locals 1

    .line 88
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    return-object v0
.end method

.method public getListeners()Landroidx/collection/MutableObjectList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/ui/focus/FocusListener;",
            ">;"
        }
    .end annotation

    .line 469
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->listeners:Landroidx/collection/MutableObjectList;

    return-object v0
.end method

.method public getModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 95
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final getRootFocusNode$ui_release()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 78
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-object v0
.end method

.method public getRootState()Landroidx/compose/ui/focus/FocusState;
    .locals 1

    .line 467
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/FocusState;

    return-object v0
.end method

.method public isFocusCaptured()Z
    .locals 1

    .line 481
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured:Z

    return v0
.end method

.method public moveFocus-3ESFkO8(I)Z
    .locals 9
    .param p1, "focusDirection"    # I

    .line 254
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    const/4 v1, 0x1

    .line 267
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 254
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    move-result-object v3

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    return v1

    .line 257
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v0, "requestFocusSuccess":Lkotlin/jvm/internal/Ref$ObjectRef;
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 258
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    move-result v4

    .line 259
    .local v4, "generationBefore":I
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v5

    .line 261
    .local v5, "activeNodeBefore":Landroidx/compose/ui/focus/FocusTargetNode;
    iget-object v6, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onFocusRectInterop:Lkotlin/jvm/functions/Function0;

    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/geometry/Rect;

    new-instance v7, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$focusSearchSuccess$1;

    invoke-direct {v7, v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$focusSearchSuccess$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;I)V

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1, v6, v7}, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v6

    .line 260
    nop

    .line 265
    .local v6, "focusSearchSuccess":Ljava/lang/Boolean;
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    move-result v7

    .line 266
    .local v7, "generationAfter":I
    nop

    .line 267
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 268
    if-ne v4, v7, :cond_1

    .line 269
    sget-boolean v8, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v8, :cond_2

    .line 270
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v8

    if-eq v5, v8, :cond_2

    .line 273
    :cond_1
    return v1

    .line 278
    :cond_2
    if-eqz v6, :cond_8

    iget-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v8, :cond_3

    goto :goto_2

    .line 281
    :cond_3
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return v1

    .line 284
    :cond_4
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusOwnerImplKt;->is1dFocusSearch-3ESFkO8(I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 286
    nop

    .line 287
    nop

    .line 288
    nop

    .line 289
    nop

    .line 290
    nop

    .line 286
    invoke-virtual {p0, v3, v1, v3, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus-I7lrPNg(ZZZI)Z

    move-result v2

    .line 285
    nop

    .line 292
    .local v2, "clearFocus":Z
    if-eqz v2, :cond_5

    const/4 v8, 0x0

    invoke-virtual {p0, p1, v8}, Landroidx/compose/ui/focus/FocusOwnerImpl;->takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_0

    :cond_5
    move v1, v3

    :goto_0
    return v1

    .line 299
    .end local v2    # "clearFocus":Z
    :cond_6
    sget-boolean v2, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    if-nez v2, :cond_7

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    move-result-object v8

    invoke-interface {v2, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    move v1, v3

    :goto_1
    return v1

    .line 278
    :cond_8
    :goto_2
    return v3
.end method

.method public releaseFocus()V
    .locals 6

    .line 158
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    goto :goto_1

    .line 161
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    .line 535
    .local v0, "$this$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    nop

    .line 536
    const/4 v2, 0x0

    .line 535
    .local v2, "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    const/4 v3, 0x0

    .line 539
    .local v3, "$i$f$withExistingTransaction":I
    nop

    .line 543
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    .line 162
    .local v4, "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v5, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 543
    .end local v4    # "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    goto :goto_0

    .line 545
    :cond_1
    nop

    .line 546
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 547
    const/4 v4, 0x0

    .line 162
    .restart local v4    # "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v5, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 547
    .end local v4    # "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    nop

    .line 549
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 550
    nop

    .line 543
    :goto_0
    nop

    .line 165
    .end local v0    # "$this$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .end local v2    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v3    # "$i$f$withExistingTransaction":I
    :goto_1
    return-void

    .line 549
    .restart local v0    # "$this$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .restart local v2    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .restart local v3    # "$i$f$withExistingTransaction":I
    :catchall_0
    move-exception v1

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw v1
.end method

.method public requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z
    .locals 1
    .param p1, "focusDirection"    # Landroidx/compose/ui/focus/FocusDirection;
    .param p2, "previouslyFocusedRect"    # Landroidx/compose/ui/geometry/Rect;

    .line 123
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onRequestFocusForOwner:Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 408
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    .line 409
    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 412
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V

    .line 413
    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 404
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 405
    return-void
.end method

.method public scheduleInvalidationForOwner()V
    .locals 1

    .line 416
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationForOwner()V

    .line 417
    return-void
.end method

.method public setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 10
    .param p1, "value"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 473
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 474
    .local v0, "previousValue":Landroidx/compose/ui/focus/FocusTargetNode;
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 475
    if-eqz p1, :cond_0

    if-eq v0, p1, :cond_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->setFocusCaptured(Z)V

    .line 476
    :cond_1
    sget-boolean v1, Landroidx/compose/ui/ComposeUiFlags;->isSemanticAutofillEnabled:Z

    if-eqz v1, :cond_3

    .line 477
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getListeners()Landroidx/collection/MutableObjectList;

    move-result-object v1

    check-cast v1, Landroidx/collection/ObjectList;

    .local v1, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v2, 0x0

    .line 1716
    .local v2, "$i$f$forEach":I
    nop

    .line 1717
    iget-object v3, v1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 1718
    .local v3, "content$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "i$iv":I
    iget v5, v1, Landroidx/collection/ObjectList;->_size:I

    :goto_0
    if-ge v4, v5, :cond_2

    .line 1719
    aget-object v6, v3, v4

    check-cast v6, Landroidx/compose/ui/focus/FocusListener;

    .local v6, "it":Landroidx/compose/ui/focus/FocusListener;
    const/4 v7, 0x0

    .line 477
    .local v7, "$i$a$-forEach-FocusOwnerImpl$activeFocusTargetNode$1":I
    move-object v8, v0

    check-cast v8, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-object v9, p1

    check-cast v9, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    invoke-interface {v6, v8, v9}, Landroidx/compose/ui/focus/FocusListener;->onFocusChanged(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    .line 1719
    .end local v6    # "it":Landroidx/compose/ui/focus/FocusListener;
    .end local v7    # "$i$a$-forEach-FocusOwnerImpl$activeFocusTargetNode$1":I
    nop

    .line 1718
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1721
    .end local v4    # "i$iv":I
    :cond_2
    nop

    .line 479
    .end local v1    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "content$iv":[Ljava/lang/Object;
    :cond_3
    return-void
.end method

.method public setFocusCaptured(Z)V
    .locals 3
    .param p1, "value"    # Z

    .line 483
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .local v0, "value$iv":Z
    :goto_1
    const/4 v1, 0x0

    .line 1722
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 1723
    if-nez v0, :cond_2

    .line 1724
    const/4 v2, 0x0

    .line 484
    .local v2, "$i$a$-requirePrecondition-FocusOwnerImpl$isFocusCaptured$1":I
    nop

    .line 1724
    .end local v2    # "$i$a$-requirePrecondition-FocusOwnerImpl$isFocusCaptured$1":I
    const-string v2, "Cannot capture focus when the active focus target node is unset"

    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1726
    :cond_2
    nop

    .line 486
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured:Z

    .line 487
    return-void
.end method

.method public final setRootFocusNode$ui_release(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 78
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-void
.end method

.method public takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z
    .locals 1
    .param p1, "focusDirection"    # I
    .param p2, "previouslyFocusedRect"    # Landroidx/compose/ui/geometry/Rect;

    .line 146
    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$takeFocus$1;

    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$takeFocus$1;-><init>(I)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    .line 148
    :cond_0
    const/4 v0, 0x0

    .line 146
    :goto_0
    return v0
.end method
