.class public final Landroidx/compose/foundation/layout/FlowLayoutKt;
.super Ljava/lang/Object;
.source "FlowLayout.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1594:1\n1107#1,115:1734\n1247#2,6:1595\n1247#2,6:1601\n1247#2,6:1612\n1247#2,6:1649\n1247#2,6:1655\n1247#2,6:1666\n1247#2,6:1703\n1247#2,6:1709\n1247#2,6:1715\n1247#2,6:1721\n165#3,5:1607\n79#3,6:1618\n86#3,3:1633\n89#3,2:1642\n93#3:1647\n171#3:1648\n165#3,5:1661\n79#3,6:1672\n86#3,3:1687\n89#3,2:1696\n93#3:1701\n171#3:1702\n347#4,9:1624\n356#4,3:1644\n347#4,9:1678\n356#4,3:1698\n4206#5,6:1636\n4206#5,6:1690\n70#6,6:1727\n1#7:1733\n1101#8:1849\n1083#8,2:1850\n213#9:1852\n210#9:1853\n219#9:1854\n216#9:1867\n213#9:1868\n216#9,4:1871\n216#9,4:1885\n210#9,4:1899\n905#10:1855\n905#10:1856\n105#11:1857\n105#11:1858\n101#11,10:1875\n101#11,10:1889\n101#11,10:1903\n70#12:1859\n65#12:1860\n65#12:1861\n65#12:1862\n251#12,4:1863\n256#12:1869\n516#13:1870\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1079#1:1734,115\n100#1:1595,6\n111#1:1601,6\n118#1:1612,6\n214#1:1649,6\n225#1:1655,6\n231#1:1666,6\n451#1:1703,6\n486#1:1709,6\n516#1:1715,6\n548#1:1721,6\n118#1:1607,5\n118#1:1618,6\n118#1:1633,3\n118#1:1642,2\n118#1:1647\n118#1:1648\n231#1:1661,5\n231#1:1672,6\n231#1:1687,3\n231#1:1696,2\n231#1:1701\n231#1:1702\n118#1:1624,9\n118#1:1644,3\n231#1:1678,9\n231#1:1698,3\n118#1:1636,6\n231#1:1690,6\n957#1:1727,6\n1239#1:1849\n1239#1:1850,2\n1240#1:1852\n1241#1:1853\n1242#1:1854\n1444#1:1867\n1445#1:1868\n1564#1:1871,4\n1572#1:1885,4\n1578#1:1899,4\n1287#1:1855\n1288#1:1856\n1350#1:1857\n1360#1:1858\n1564#1:1875,10\n1572#1:1889,10\n1578#1:1903,10\n1421#1:1859\n1423#1:1860\n1434#1:1861\n1435#1:1862\n1439#1:1863,4\n1439#1:1869\n1471#1:1870\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e4\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010\u0018\u001aq\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010!\u001aq\u0010\u001c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0019\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\u0010\'\u001a=\u0010(\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001\u00a2\u0006\u0002\u0010,\u001a\u0096\u0001\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103\u00a2\u0006\u0002\u0008\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103\u00a2\u0006\u0002\u0008\u00172\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\u0008\u00a2\u0006\u0002\u00108\u001a[\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u000201002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0002\u00a2\u0006\u0002\u0010<\u001aT\u0010=\u001a\u00020\u00112\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103\u00a2\u0006\u0002\u0008\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0082\u0008\u001a\u0091\u0001\u0010?\u001a\u00020\u00112\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103\u00a2\u0006\u0002\u0008\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103\u00a2\u0006\u0002\u0008\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\u0008\u001a%\u0010@\u001a\u00020%2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\u0010A\u001a=\u0010B\u001a\u00020)2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001\u00a2\u0006\u0002\u0010C\u001a\\\u0010D\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020P2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008Q\u0010R\u001a\u001c\u0010S\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00102\u001a\u00020\u0011H\u0000\u001a\u001c\u0010V\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u00020\u0011H\u0000\u001a<\u0010W\u001a\u00020.*\u00020K2\u0006\u0010G\u001a\u00020H2\u0006\u0010O\u001a\u00020X2\u0014\u0010Y\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\u00070\u0014H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008[\u0010\\\u001aT\u0010]\u001a\u00020E*\u00020F2\u0006\u0010O\u001a\u00020P2\u0006\u0010^\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\u000c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020E0a2\u0006\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020:H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008d\u0010e\u001a\u001e\u0010f\u001a\u0004\u0018\u00010K*\u0008\u0012\u0004\u0012\u00020K0J2\u0008\u0010g\u001a\u0004\u0018\u00010hH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006i"
    }
    d2 = {
        "CROSS_AXIS_ALIGNMENT_START",
        "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "getCROSS_AXIS_ALIGNMENT_START",
        "()Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "CROSS_AXIS_ALIGNMENT_TOP",
        "getCROSS_AXIS_ALIGNMENT_TOP",
        "FlowColumn",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "itemHorizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "maxItemsInEachColumn",
        "",
        "maxLines",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/FlowColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "overflow",
        "Landroidx/compose/foundation/layout/FlowColumnOverflow;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "FlowRow",
        "itemVerticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "maxItemsInEachRow",
        "Landroidx/compose/foundation/layout/FlowRowScope;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/foundation/layout/FlowRowOverflow;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "columnMeasurementHelper",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "maxItemsInMainAxis",
        "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;",
        "columnMeasurementMultiContentHelper",
        "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;",
        "overflowState",
        "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
        "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;",
        "intrinsicCrossAxisSize",
        "Landroidx/collection/IntIntPair;",
        "children",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "mainAxisSize",
        "Lkotlin/Function3;",
        "crossAxisSize",
        "mainAxisAvailable",
        "mainAxisSpacing",
        "crossAxisSpacing",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J",
        "mainAxisSizes",
        "",
        "crossAxisSizes",
        "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J",
        "maxIntrinsicMainAxisSize",
        "crossAxisAvailable",
        "minIntrinsicMainAxisSize",
        "rowMeasurementHelper",
        "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;",
        "rowMeasurementMultiContentHelper",
        "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;",
        "breakDownItems",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurePolicy",
        "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
        "measurablesIterator",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "mainAxisSpacingDp",
        "Landroidx/compose/ui/unit/Dp;",
        "crossAxisSpacingDp",
        "constraints",
        "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;",
        "breakDownItems-di9J0FM",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;",
        "crossAxisMin",
        "isHorizontal",
        "",
        "mainAxisMin",
        "measureAndCache",
        "Landroidx/compose/ui/unit/Constraints;",
        "storePlaceable",
        "Landroidx/compose/ui/layout/Placeable;",
        "measureAndCache-rqJ1uqs",
        "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J",
        "placeHelper",
        "mainAxisTotalSize",
        "crossAxisTotalSize",
        "items",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "measureHelper",
        "outPosition",
        "placeHelper-BmaY500",
        "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;",
        "safeNext",
        "info",
        "Landroidx/compose/foundation/layout/FlowLineInfo;",
        "foundation-layout_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

.field private static final CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1513
    sget-object v0, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->vertical$foundation_layout_release(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 1514
    sget-object v0, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->horizontal$foundation_layout_release(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    return-void
.end method

.method public static final FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p2, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p3, "itemHorizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p4, "maxItemsInEachColumn"    # I
    .param p5, "maxLines"    # I
    .param p6, "overflow"    # Landroidx/compose/foundation/layout/FlowColumnOverflow;
    .param p7, "content"    # Lkotlin/jvm/functions/Function3;
    .param p8, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p9, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "II",
            "Landroidx/compose/foundation/layout/FlowColumnOverflow;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/FlowColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "The overflow parameter has been deprecated"
    .end annotation

    .line 213
    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0x529a966e

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(FlowColumn)P(5,7,1,2,3,4,6)213@9419L53,215@9505L233,224@9792L294,230@10091L75:FlowLayout.kt#2w3rfo"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p9

    .local v2, "$dirty":I
    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_5

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v9, 0x180

    if-nez v12, :cond_8

    move-object/from16 v12, p2

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x100

    goto :goto_4

    :cond_7
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v2, v13

    goto :goto_5

    :cond_8
    move-object/from16 v12, p2

    :goto_5
    and-int/lit8 v13, v10, 0x8

    if-eqz v13, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v9, 0xc00

    if-nez v14, :cond_b

    move-object/from16 v14, p3

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    const/16 v15, 0x800

    goto :goto_6

    :cond_a
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v2, v15

    goto :goto_7

    :cond_b
    move-object/from16 v14, p3

    :goto_7
    and-int/lit8 v15, v10, 0x10

    if-eqz v15, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_e

    move/from16 v11, p4

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v2, v2, v16

    goto :goto_9

    :cond_e
    move/from16 v11, p4

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v18, 0x30000

    if-eqz v16, :cond_f

    or-int v2, v2, v18

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v18, v9, v18

    if-nez v18, :cond_11

    move/from16 v0, p5

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v2, v2, v18

    goto :goto_b

    :cond_11
    move/from16 v0, p5

    :goto_b
    and-int/lit8 v18, v10, 0x40

    const/high16 v20, 0x180000

    if-eqz v18, :cond_12

    or-int v2, v2, v20

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v20, v9, v20

    if-nez v20, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v21, 0x80000

    :goto_c
    or-int v2, v2, v21

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v21, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v21

    goto :goto_f

    :cond_15
    and-int v0, v9, v21

    if-nez v0, :cond_17

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v2, v0

    :cond_17
    :goto_f
    move v0, v2

    .end local v2    # "$dirty":I
    .local v0, "$dirty":I
    const v2, 0x492493

    and-int/2addr v2, v0

    move/from16 v21, v3

    const v3, 0x492492

    if-eq v2, v3, :cond_18

    const/4 v2, 0x1

    goto :goto_10

    :cond_18
    const/4 v2, 0x0

    :goto_10
    and-int/lit8 v3, v0, 0x1

    invoke-interface {v1, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_33

    if-eqz v21, :cond_19

    .line 205
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_11

    .line 213
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_19
    move-object/from16 v2, p0

    .line 205
    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_11
    if-eqz v5, :cond_1a

    .line 206
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v3

    move-object v11, v3

    .end local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v3, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    goto :goto_12

    .line 205
    .end local v3    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_1a
    move-object v11, v6

    .line 206
    .end local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v11, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_12
    if-eqz v7, :cond_1b

    .line 207
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v3

    move-object v12, v3

    .end local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v12, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_1b
    if-eqz v13, :cond_1c

    .line 208
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v3

    move-object v13, v3

    .end local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v3, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    goto :goto_13

    .line 207
    .end local v3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .restart local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    :cond_1c
    move-object v13, v14

    .line 208
    .end local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v13, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    :goto_13
    if-eqz v15, :cond_1d

    .line 209
    const v3, 0x7fffffff

    move v14, v3

    .end local p4    # "maxItemsInEachColumn":I
    .local v3, "maxItemsInEachColumn":I
    goto :goto_14

    .line 208
    .end local v3    # "maxItemsInEachColumn":I
    .restart local p4    # "maxItemsInEachColumn":I
    :cond_1d
    move/from16 v14, p4

    .line 209
    .end local p4    # "maxItemsInEachColumn":I
    .local v14, "maxItemsInEachColumn":I
    :goto_14
    if-eqz v16, :cond_1e

    .line 210
    const v3, 0x7fffffff

    move v15, v3

    .end local p5    # "maxLines":I
    .local v3, "maxLines":I
    goto :goto_15

    .line 209
    .end local v3    # "maxLines":I
    .restart local p5    # "maxLines":I
    :cond_1e
    move/from16 v15, p5

    .line 210
    .end local p5    # "maxLines":I
    .local v15, "maxLines":I
    :goto_15
    if-eqz v18, :cond_1f

    .line 211
    sget-object v3, Landroidx/compose/foundation/layout/FlowColumnOverflow;->Companion:Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowColumnOverflow;

    move-result-object v3

    .end local p6    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    .local v3, "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    goto :goto_16

    .line 210
    .end local v3    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    .restart local p6    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    :cond_1f
    move-object/from16 v3, p6

    .line 211
    .end local p6    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    .restart local v3    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    :goto_16
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_20

    .line 213
    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:212)"

    const v7, -0x529a966e

    invoke-static {v7, v0, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    nop

    .line 214
    const v5, -0x5a55051d

    const-string v6, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v1, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v5, 0x380000

    and-int/2addr v5, v0

    const/high16 v6, 0x100000

    if-ne v5, v6, :cond_21

    const/4 v5, 0x1

    goto :goto_17

    :cond_21
    const/4 v5, 0x0

    .local v5, "invalid$iv":Z
    :goto_17
    move-object v6, v1

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1649
    .local v7, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1650
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_23

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v23, v0

    .end local v0    # "$dirty":I
    .local v23, "$dirty":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_22

    goto :goto_18

    .line 1654
    :cond_22
    goto :goto_19

    .line 1650
    .end local v23    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_23
    move/from16 v23, v0

    .line 1651
    .end local v0    # "$dirty":I
    .restart local v23    # "$dirty":I
    :goto_18
    const/4 v0, 0x0

    .line 214
    .local v0, "$i$a$-cache-FlowLayoutKt$FlowColumn$overflowState$1":I
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/FlowColumnOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v0

    .line 1651
    .end local v0    # "$i$a$-cache-FlowLayoutKt$FlowColumn$overflowState$1":I
    nop

    .line 1652
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1653
    move-object v4, v0

    .line 1649
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_19
    nop

    .line 214
    .end local v5    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    move-object/from16 v16, v4

    check-cast v16, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .local v16, "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 217
    nop

    .line 218
    nop

    .line 219
    nop

    .line 220
    nop

    .line 221
    nop

    .line 222
    shr-int/lit8 v0, v23, 0x3

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v4, v23, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v0, v4

    shr-int/lit8 v4, v23, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v0, v4

    shr-int/lit8 v4, v23, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v0, v4

    shr-int/lit8 v4, v23, 0x3

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int v18, v0, v4

    .line 216
    move-object/from16 v17, v1

    const/16 v0, 0x100

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v17, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v18}, Landroidx/compose/foundation/layout/FlowLayoutKt;->columnMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    move-result-object v1

    .line 215
    move-object v6, v11

    move-object/from16 v4, v16

    move-object/from16 v11, v17

    .line 225
    .end local v16    # "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .end local v17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .local v4, "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .local v6, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v11, "$composer":Landroidx/compose/runtime/Composer;
    const v5, -0x5a54d58c

    const-string v7, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v11, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v5, 0x380000

    and-int v5, v23, v5

    const/high16 v7, 0x100000

    if-ne v5, v7, :cond_24

    const/4 v5, 0x1

    goto :goto_1a

    :cond_24
    const/4 v5, 0x0

    :goto_1a
    const/high16 v7, 0x1c00000

    and-int v7, v23, v7

    const/high16 v0, 0x800000

    if-ne v7, v0, :cond_25

    const/4 v0, 0x1

    goto :goto_1b

    :cond_25
    const/4 v0, 0x0

    :goto_1b
    or-int/2addr v0, v5

    const/high16 v5, 0x70000

    and-int v5, v23, v5

    const/high16 v7, 0x20000

    if-ne v5, v7, :cond_26

    const/4 v5, 0x1

    goto :goto_1c

    :cond_26
    const/4 v5, 0x0

    :goto_1c
    or-int/2addr v0, v5

    .local v0, "invalid$iv":Z
    move-object v5, v11

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1655
    .restart local v7    # "$i$f$cache":I
    move/from16 p0, v0

    .end local v0    # "invalid$iv":Z
    .local p0, "invalid$iv":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1656
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p0, :cond_28

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v18, v2

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v18, "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_27

    goto :goto_1d

    .line 1660
    :cond_27
    move-object/from16 p3, v6

    move/from16 p4, v7

    const/4 v7, 0x1

    goto :goto_1e

    .line 1656
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_28
    move-object/from16 v18, v2

    .line 1657
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v18    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1d
    const/4 v2, 0x0

    .line 226
    .local v2, "$i$a$-cache-FlowLayoutKt$FlowColumn$list$1":I
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p1, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local p1, "it$iv":Ljava/lang/Object;
    move-object/from16 v0, v17

    check-cast v0, Ljava/util/List;

    .line 227
    .local v0, "mutableList":Ljava/util/List;
    move/from16 p2, v2

    .end local v2    # "$i$a$-cache-FlowLayoutKt$FlowColumn$list$1":I
    .local p2, "$i$a$-cache-FlowLayoutKt$FlowColumn$list$1":I
    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$list$1$1;

    invoke-direct {v2, v8}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$list$1$1;-><init>(Lkotlin/jvm/functions/Function3;)V

    move-object/from16 p3, v6

    .end local v6    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local p3, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    const v6, -0x2d87451e

    move/from16 p4, v7

    const/4 v7, 0x1

    .end local v7    # "$i$f$cache":I
    .local p4, "$i$f$cache":I
    invoke-static {v6, v7, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    invoke-virtual {v3, v4, v0}, Landroidx/compose/foundation/layout/FlowColumnOverflow;->addOverflowComposables$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V

    .line 229
    nop

    .line 1657
    .end local v0    # "mutableList":Ljava/util/List;
    .end local p2    # "$i$a$-cache-FlowLayoutKt$FlowColumn$list$1":I
    nop

    .line 1658
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1659
    nop

    .line 1655
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p1    # "it$iv":Ljava/lang/Object;
    :goto_1e
    nop

    .line 225
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p0    # "invalid$iv":Z
    .end local p4    # "$i$f$cache":I
    check-cast v0, Ljava/util/List;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 224
    nop

    .line 231
    .local v0, "list":Ljava/util/List;
    shl-int/lit8 v2, v23, 0x3

    and-int/lit8 v2, v2, 0x70

    .local v2, "$changed$iv":I
    move-object/from16 v5, v18

    .local v5, "modifier$iv":Landroidx/compose/ui/Modifier;
    const/4 v6, 0x0

    .line 1661
    .local v6, "$i$f$Layout":I
    const v7, 0x5365e06c

    move-object/from16 p0, v0

    .end local v0    # "list":Ljava/util/List;
    .local p0, "list":Ljava/util/List;
    const-string v0, "CC(Layout)P(!1,2)168@6883L62,165@6769L182:Layout.kt#80mrfh"

    invoke-static {v11, v7, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1663
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutKt;->combineAsVirtualLayouts(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 1664
    nop

    .line 1665
    const v7, -0x1154b8ad

    move-object/from16 p1, v0

    const-string v0, "CC(remember):Layout.kt#9igjgp"

    invoke-static {v11, v7, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v0, v2, 0x380

    xor-int/lit16 v0, v0, 0x180

    const/16 v7, 0x100

    if-le v0, v7, :cond_29

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    :cond_29
    and-int/lit16 v0, v2, 0x180

    const/16 v7, 0x100

    if-ne v0, v7, :cond_2b

    :cond_2a
    const/16 v21, 0x1

    goto :goto_1f

    :cond_2b
    const/16 v21, 0x0

    .local v21, "invalid$iv$iv":Z
    :goto_1f
    move-object v0, v11

    .local v0, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1666
    .restart local v7    # "$i$f$cache":I
    move-object/from16 p2, v1

    .end local v1    # "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .local p2, "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1667
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    if-nez v21, :cond_2d

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p4, v2

    .end local v2    # "$changed$iv":I
    .local p4, "$changed$iv":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2c

    goto :goto_20

    .line 1671
    :cond_2c
    goto :goto_21

    .line 1667
    .end local p4    # "$changed$iv":I
    .restart local v2    # "$changed$iv":I
    :cond_2d
    move/from16 p4, v2

    .line 1668
    .end local v2    # "$changed$iv":I
    .restart local p4    # "$changed$iv":I
    :goto_20
    const/4 v2, 0x0

    .line 1665
    .local v2, "$i$a$-cache-LayoutKt$Layout$3$iv":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/layout/MultiContentMeasurePolicyKt;->createMeasurePolicy(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    .line 1668
    .end local v2    # "$i$a$-cache-LayoutKt$Layout$3$iv":I
    nop

    .line 1669
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1670
    move-object v1, v2

    .line 1666
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_21
    nop

    .line 1665
    .end local v0    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local v21    # "invalid$iv$iv":Z
    check-cast v1, Landroidx/compose/ui/layout/MeasurePolicy;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v0, p4, 0x70

    .line 1662
    nop

    .local v1, "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    move-object v2, v5

    .local v2, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    move-object/from16 v7, p1

    .local v0, "$changed$iv$iv":I
    .local v7, "content$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v16, 0x0

    .line 1672
    .local v16, "$i$f$Layout":I
    move/from16 p1, v0

    .end local v0    # "$changed$iv$iv":I
    .local p1, "$changed$iv$iv":I
    const v0, -0x4ee9b9da

    move-object/from16 p5, v3

    .end local v3    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    .local p5, "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    const-string v3, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh"

    invoke-static {v11, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1673
    const/4 v0, 0x0

    invoke-static {v11, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 1674
    .local v0, "compositeKeyHash$iv$iv":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v3

    .line 1675
    .local v3, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 p6, v0

    .end local v0    # "compositeKeyHash$iv$iv":I
    .local p6, "compositeKeyHash$iv$iv":I
    invoke-static {v11, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 1677
    .local v0, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v17

    move-object/from16 p8, v2

    .end local v2    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .local p8, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    shl-int/lit8 v2, p1, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    .line 1676
    move-object/from16 v19, v17

    .local v2, "$changed$iv$iv$iv":I
    .local v19, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    const/16 v17, 0x0

    .line 1678
    .local v17, "$i$f$ReusableComposeNode":I
    move/from16 v20, v2

    .end local v2    # "$changed$iv$iv$iv":I
    .local v20, "$changed$iv$iv$iv":I
    const v2, -0x2942ffcf

    move-object/from16 v21, v4

    .end local v4    # "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .local v21, "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    const-string v4, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp"

    invoke-static {v11, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1679
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v2

    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    if-nez v2, :cond_2e

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1680
    :cond_2e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1681
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 1682
    move-object/from16 v2, v19

    .end local v19    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v2, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_22

    .line 1684
    .end local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v19    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    :cond_2f
    move-object/from16 v2, v19

    .end local v19    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1686
    :goto_22
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .local v4, "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 1687
    .local v19, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    sget-object v22, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v24, v2

    .end local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v24, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v4, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1688
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v4, v3, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1689
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .local v2, "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v22, 0x0

    .line 1690
    .local v22, "$i$f$set-impl":I
    move-object/from16 v25, v4

    .local v25, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    .line 1691
    .local v26, "$i$a$-with-Updater$set$1$iv$iv$iv":I
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v27

    if-nez v27, :cond_31

    move-object/from16 v27, v1

    .end local v1    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v27, "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v28, v3

    .end local v3    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .local v28, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_23

    :cond_30
    move-object/from16 v3, v25

    goto :goto_24

    .end local v27    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v28    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v1    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v3    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    :cond_31
    move-object/from16 v27, v1

    move-object/from16 v28, v3

    .line 1692
    .end local v1    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v3    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v27    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v28    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    :goto_23
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v3, v25

    .end local v25    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1693
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1695
    :goto_24
    nop

    .line 1690
    .end local v3    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v26    # "$i$a$-with-Updater$set$1$iv$iv$iv":I
    nop

    .line 1695
    nop

    .line 1696
    .end local v2    # "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v22    # "$i$f$set-impl":I
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v4, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1697
    nop

    .line 1686
    .end local v4    # "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    nop

    .line 1698
    shr-int/lit8 v1, v20, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v11, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1699
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1678
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1700
    nop

    .line 1672
    .end local v17    # "$i$f$ReusableComposeNode":I
    .end local v20    # "$changed$iv$iv$iv":I
    .end local v24    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1701
    nop

    .line 1661
    .end local v0    # "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    .end local v7    # "content$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v16    # "$i$f$Layout":I
    .end local v27    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v28    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local p1    # "$changed$iv$iv":I
    .end local p6    # "compositeKeyHash$iv$iv":I
    .end local p8    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1702
    nop

    .end local v5    # "modifier$iv":Landroidx/compose/ui/Modifier;
    .end local v6    # "$i$f$Layout":I
    .end local p4    # "$changed$iv":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 232
    .end local v21    # "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .end local p0    # "list":Ljava/util/List;
    .end local p2    # "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    :cond_32
    move-object/from16 v2, p3

    move-object/from16 v7, p5

    move-object v4, v13

    move v5, v14

    move v6, v15

    move-object/from16 v1, v18

    move-object v3, v12

    goto :goto_25

    .end local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v12    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v13    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v14    # "maxItemsInEachColumn":I
    .end local v15    # "maxLines":I
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v23    # "$dirty":I
    .local v0, "$dirty":I
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    .local p0, "modifier":Landroidx/compose/ui/Modifier;
    .local p1, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local p2, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local p3, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local p4, "maxItemsInEachColumn":I
    .local p5, "maxLines":I
    .local p6, "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    :cond_33
    move/from16 v23, v0

    move-object v11, v1

    .end local v0    # "$dirty":I
    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v23    # "$dirty":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v1, p0

    move/from16 v5, p4

    move-object/from16 v7, p6

    move-object v2, v6

    move-object v4, v14

    move/from16 v6, p5

    move-object v3, v12

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local p4    # "maxItemsInEachColumn":I
    .end local p5    # "maxLines":I
    .end local p6    # "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v3, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v4, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v5, "maxItemsInEachColumn":I
    .local v6, "maxLines":I
    .local v7, "overflow":Landroidx/compose/foundation/layout/FlowColumnOverflow;
    :goto_25
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_34

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$1;

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_34
    return-void
.end method

.method public static final FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p2, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p3, "itemHorizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p4, "maxItemsInEachColumn"    # I
    .param p5, "maxLines"    # I
    .param p6, "content"    # Lkotlin/jvm/functions/Function3;
    .param p7, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p8, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "II",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/FlowColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 271
    move/from16 v8, p8

    const v0, -0xc6772f2

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p7    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(FlowColumn)P(5,6,1,2,3,4)270@11890L226:FlowLayout.kt#2w3rfo"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p8

    .local v2, "$dirty":I
    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_5

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit8 v7, p9, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_8

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, p9, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v2, v12

    goto :goto_7

    :cond_b
    move-object/from16 v11, p3

    :goto_7
    and-int/lit8 v12, p9, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_e

    move/from16 v13, p4

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v2, v14

    goto :goto_9

    :cond_e
    move/from16 v13, p4

    :goto_9
    and-int/lit8 v14, p9, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v8

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v2, v2, v16

    goto :goto_b

    :cond_11
    move/from16 v15, p5

    :goto_b
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v17

    if-nez v16, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v2, v2, v18

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const v18, 0x92493

    and-int v0, v2, v18

    move/from16 p7, v3

    const v3, 0x92492

    if-eq v0, v3, :cond_15

    const/4 v0, 0x1

    goto :goto_e

    :cond_15
    const/4 v0, 0x0

    :goto_e
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1e

    if-eqz p7, :cond_16

    .line 263
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v9, v0

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_f

    .line 271
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_16
    move-object v9, v4

    .line 263
    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v9, "modifier":Landroidx/compose/ui/Modifier;
    :goto_f
    if-eqz v5, :cond_17

    .line 264
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    move/from16 v20, v10

    move-object v10, v0

    move/from16 v0, v20

    .end local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v0, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    goto :goto_10

    .line 263
    .end local v0    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_17
    move v0, v10

    move-object v10, v6

    .line 264
    .end local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v10, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_10
    if-eqz v7, :cond_18

    .line 265
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v3

    move-object v11, v3

    .end local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v3, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    goto :goto_11

    .line 264
    .end local v3    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_18
    move-object/from16 v11, p2

    .line 265
    .end local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v11, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_11
    if-eqz v0, :cond_19

    .line 266
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v0

    move/from16 v20, v12

    move-object v12, v0

    move/from16 v0, v20

    .end local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v0, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    goto :goto_12

    .line 265
    .end local v0    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .restart local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    :cond_19
    move v0, v12

    move-object/from16 v12, p3

    .line 266
    .end local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v12, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    :goto_12
    if-eqz v0, :cond_1a

    .line 267
    const v0, 0x7fffffff

    move v13, v0

    .end local p4    # "maxItemsInEachColumn":I
    .local v13, "maxItemsInEachColumn":I
    :cond_1a
    if-eqz v14, :cond_1b

    .line 268
    const v0, 0x7fffffff

    move v14, v0

    .end local p5    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_13

    .line 267
    .end local v0    # "maxLines":I
    .restart local p5    # "maxLines":I
    :cond_1b
    move v14, v15

    .line 268
    .end local p5    # "maxLines":I
    .local v14, "maxLines":I
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 271
    const/4 v0, -0x1

    const-string v3, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:270)"

    const v4, -0xc6772f2

    invoke-static {v4, v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 272
    :cond_1c
    nop

    .line 273
    nop

    .line 274
    nop

    .line 275
    nop

    .line 276
    nop

    .line 277
    nop

    .line 278
    sget-object v0, Landroidx/compose/foundation/layout/FlowColumnOverflow;->Companion:Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowColumnOverflow;

    move-result-object v15

    .line 279
    and-int/lit8 v0, v2, 0xe

    or-int v0, v0, v17

    and-int/lit8 v3, v2, 0x70

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    shl-int/lit8 v3, v2, 0x3

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int v18, v0, v3

    .line 271
    const/16 v19, 0x0

    move-object/from16 v16, p6

    move-object/from16 v17, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v17, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 280
    :cond_1d
    move v0, v2

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v6, v14

    move v5, v13

    goto :goto_14

    .end local v9    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v10    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v11    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v12    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v13    # "maxItemsInEachColumn":I
    .end local v14    # "maxLines":I
    .end local v17    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .restart local p4    # "maxItemsInEachColumn":I
    .restart local p5    # "maxLines":I
    :cond_1e
    move-object/from16 v17, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v17    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move v0, v2

    move-object v1, v4

    move-object v2, v6

    move v6, v15

    move-object/from16 v4, p3

    move v5, v13

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p1    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p2    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p3    # "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local p4    # "maxItemsInEachColumn":I
    .end local p5    # "maxLines":I
    .local v0, "$dirty":I
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local v3    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v4, "itemHorizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v5, "maxItemsInEachColumn":I
    .local v6, "maxLines":I
    :goto_14
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1f

    move v7, v0

    .end local v0    # "$dirty":I
    .local v7, "$dirty":I
    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$2;

    move/from16 v9, p9

    move v11, v7

    move-object/from16 v7, p6

    .end local v7    # "$dirty":I
    .local v11, "$dirty":I
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_15

    .end local v11    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_1f
    move v11, v0

    .end local v0    # "$dirty":I
    .restart local v11    # "$dirty":I
    :goto_15
    return-void
.end method

.method public static final FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p2, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p3, "itemVerticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p4, "maxItemsInEachRow"    # I
    .param p5, "maxLines"    # I
    .param p6, "overflow"    # Landroidx/compose/foundation/layout/FlowRowOverflow;
    .param p7, "content"    # Lkotlin/jvm/functions/Function3;
    .param p8, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p9, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "II",
            "Landroidx/compose/foundation/layout/FlowRowOverflow;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/FlowRowScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "The overflow parameter has been deprecated"
    .end annotation

    .line 99
    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0xd0882ce

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(FlowRow)P(5,1,7,2,3,4,6)99@4467L53,101@4553L225,110@4832L291,117@5129L75:FlowLayout.kt#2w3rfo"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p9

    .local v2, "$dirty":I
    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_5

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v9, 0x180

    if-nez v12, :cond_8

    move-object/from16 v12, p2

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x100

    goto :goto_4

    :cond_7
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v2, v13

    goto :goto_5

    :cond_8
    move-object/from16 v12, p2

    :goto_5
    and-int/lit8 v13, v10, 0x8

    if-eqz v13, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v9, 0xc00

    if-nez v14, :cond_b

    move-object/from16 v14, p3

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    const/16 v15, 0x800

    goto :goto_6

    :cond_a
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v2, v15

    goto :goto_7

    :cond_b
    move-object/from16 v14, p3

    :goto_7
    and-int/lit8 v15, v10, 0x10

    if-eqz v15, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_e

    move/from16 v11, p4

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v2, v2, v16

    goto :goto_9

    :cond_e
    move/from16 v11, p4

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v18, 0x30000

    if-eqz v16, :cond_f

    or-int v2, v2, v18

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v18, v9, v18

    if-nez v18, :cond_11

    move/from16 v0, p5

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v2, v2, v18

    goto :goto_b

    :cond_11
    move/from16 v0, p5

    :goto_b
    and-int/lit8 v18, v10, 0x40

    const/high16 v20, 0x180000

    if-eqz v18, :cond_12

    or-int v2, v2, v20

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v20, v9, v20

    if-nez v20, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v21, 0x80000

    :goto_c
    or-int v2, v2, v21

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v21, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v21

    goto :goto_f

    :cond_15
    and-int v0, v9, v21

    if-nez v0, :cond_17

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v2, v0

    :cond_17
    :goto_f
    move v0, v2

    .end local v2    # "$dirty":I
    .local v0, "$dirty":I
    const v2, 0x492493

    and-int/2addr v2, v0

    move/from16 v21, v3

    const v3, 0x492492

    if-eq v2, v3, :cond_18

    const/4 v2, 0x1

    goto :goto_10

    :cond_18
    const/4 v2, 0x0

    :goto_10
    and-int/lit8 v3, v0, 0x1

    invoke-interface {v1, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_33

    if-eqz v21, :cond_19

    .line 91
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_11

    .line 99
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_19
    move-object/from16 v2, p0

    .line 91
    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_11
    if-eqz v5, :cond_1a

    .line 92
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v3

    move-object v11, v3

    .end local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v3, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    goto :goto_12

    .line 91
    .end local v3    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_1a
    move-object v11, v6

    .line 92
    .end local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v11, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_12
    if-eqz v7, :cond_1b

    .line 93
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v3

    move-object v12, v3

    .end local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v12, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_1b
    if-eqz v13, :cond_1c

    .line 94
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v3

    move-object v13, v3

    .end local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v3, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    goto :goto_13

    .line 93
    .end local v3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .restart local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    :cond_1c
    move-object v13, v14

    .line 94
    .end local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v13, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    :goto_13
    if-eqz v15, :cond_1d

    .line 95
    const v3, 0x7fffffff

    move v14, v3

    .end local p4    # "maxItemsInEachRow":I
    .local v3, "maxItemsInEachRow":I
    goto :goto_14

    .line 94
    .end local v3    # "maxItemsInEachRow":I
    .restart local p4    # "maxItemsInEachRow":I
    :cond_1d
    move/from16 v14, p4

    .line 95
    .end local p4    # "maxItemsInEachRow":I
    .local v14, "maxItemsInEachRow":I
    :goto_14
    if-eqz v16, :cond_1e

    .line 96
    const v3, 0x7fffffff

    move v15, v3

    .end local p5    # "maxLines":I
    .local v3, "maxLines":I
    goto :goto_15

    .line 95
    .end local v3    # "maxLines":I
    .restart local p5    # "maxLines":I
    :cond_1e
    move/from16 v15, p5

    .line 96
    .end local p5    # "maxLines":I
    .local v15, "maxLines":I
    :goto_15
    if-eqz v18, :cond_1f

    .line 97
    sget-object v3, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowRowOverflow;

    move-result-object v3

    .end local p6    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    .local v3, "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    goto :goto_16

    .line 96
    .end local v3    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    .restart local p6    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    :cond_1f
    move-object/from16 v3, p6

    .line 97
    .end local p6    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    .restart local v3    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    :goto_16
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_20

    .line 99
    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:98)"

    const v7, -0xd0882ce

    invoke-static {v7, v0, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    nop

    .line 100
    const v5, 0x1b1e4177

    const-string v6, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v1, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v5, 0x380000

    and-int/2addr v5, v0

    const/high16 v6, 0x100000

    if-ne v5, v6, :cond_21

    const/4 v5, 0x1

    goto :goto_17

    :cond_21
    const/4 v5, 0x0

    .local v5, "invalid$iv":Z
    :goto_17
    move-object v6, v1

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1595
    .local v7, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1596
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_23

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v23, v0

    .end local v0    # "$dirty":I
    .local v23, "$dirty":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_22

    goto :goto_18

    .line 1600
    :cond_22
    goto :goto_19

    .line 1596
    .end local v23    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_23
    move/from16 v23, v0

    .line 1597
    .end local v0    # "$dirty":I
    .restart local v23    # "$dirty":I
    :goto_18
    const/4 v0, 0x0

    .line 100
    .local v0, "$i$a$-cache-FlowLayoutKt$FlowRow$overflowState$1":I
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/FlowRowOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v0

    .line 1597
    .end local v0    # "$i$a$-cache-FlowLayoutKt$FlowRow$overflowState$1":I
    nop

    .line 1598
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1599
    move-object v4, v0

    .line 1595
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_19
    nop

    .line 100
    .end local v5    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    move-object/from16 v16, v4

    check-cast v16, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .local v16, "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 103
    nop

    .line 104
    nop

    .line 105
    nop

    .line 106
    nop

    .line 107
    nop

    .line 108
    shr-int/lit8 v0, v23, 0x3

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v4, v23, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v0, v4

    shr-int/lit8 v4, v23, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v0, v4

    shr-int/lit8 v4, v23, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v0, v4

    shr-int/lit8 v4, v23, 0x3

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int v18, v0, v4

    .line 102
    move-object/from16 v17, v1

    const/16 v0, 0x100

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v17, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v18}, Landroidx/compose/foundation/layout/FlowLayoutKt;->rowMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    move-result-object v1

    .line 101
    move-object v6, v11

    move-object/from16 v4, v16

    move-object/from16 v11, v17

    .line 111
    .end local v16    # "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .end local v17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .local v4, "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .local v6, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v11, "$composer":Landroidx/compose/runtime/Composer;
    const v5, 0x1b1e7005

    const-string v7, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v11, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v5, 0x380000

    and-int v5, v23, v5

    const/high16 v7, 0x100000

    if-ne v5, v7, :cond_24

    const/4 v5, 0x1

    goto :goto_1a

    :cond_24
    const/4 v5, 0x0

    :goto_1a
    const/high16 v7, 0x1c00000

    and-int v7, v23, v7

    const/high16 v0, 0x800000

    if-ne v7, v0, :cond_25

    const/4 v0, 0x1

    goto :goto_1b

    :cond_25
    const/4 v0, 0x0

    :goto_1b
    or-int/2addr v0, v5

    const/high16 v5, 0x70000

    and-int v5, v23, v5

    const/high16 v7, 0x20000

    if-ne v5, v7, :cond_26

    const/4 v5, 0x1

    goto :goto_1c

    :cond_26
    const/4 v5, 0x0

    :goto_1c
    or-int/2addr v0, v5

    .local v0, "invalid$iv":Z
    move-object v5, v11

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1601
    .restart local v7    # "$i$f$cache":I
    move/from16 p0, v0

    .end local v0    # "invalid$iv":Z
    .local p0, "invalid$iv":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1602
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p0, :cond_28

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v18, v2

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v18, "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_27

    goto :goto_1d

    .line 1606
    :cond_27
    move-object/from16 p3, v6

    move/from16 p4, v7

    const/4 v7, 0x1

    goto :goto_1e

    .line 1602
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_28
    move-object/from16 v18, v2

    .line 1603
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v18    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1d
    const/4 v2, 0x0

    .line 112
    .local v2, "$i$a$-cache-FlowLayoutKt$FlowRow$list$1":I
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p1, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local p1, "it$iv":Ljava/lang/Object;
    move-object/from16 v0, v17

    check-cast v0, Ljava/util/List;

    .line 113
    .local v0, "mutableList":Ljava/util/List;
    move/from16 p2, v2

    .end local v2    # "$i$a$-cache-FlowLayoutKt$FlowRow$list$1":I
    .local p2, "$i$a$-cache-FlowLayoutKt$FlowRow$list$1":I
    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$list$1$1;

    invoke-direct {v2, v8}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$list$1$1;-><init>(Lkotlin/jvm/functions/Function3;)V

    move-object/from16 p3, v6

    .end local v6    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local p3, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const v6, 0x29d91e82

    move/from16 p4, v7

    const/4 v7, 0x1

    .end local v7    # "$i$f$cache":I
    .local p4, "$i$f$cache":I
    invoke-static {v6, v7, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    invoke-virtual {v3, v4, v0}, Landroidx/compose/foundation/layout/FlowRowOverflow;->addOverflowComposables$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V

    .line 115
    nop

    .line 1603
    .end local v0    # "mutableList":Ljava/util/List;
    .end local p2    # "$i$a$-cache-FlowLayoutKt$FlowRow$list$1":I
    nop

    .line 1604
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1605
    nop

    .line 1601
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p1    # "it$iv":Ljava/lang/Object;
    :goto_1e
    nop

    .line 111
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p0    # "invalid$iv":Z
    .end local p4    # "$i$f$cache":I
    check-cast v0, Ljava/util/List;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 110
    nop

    .line 118
    .local v0, "list":Ljava/util/List;
    shl-int/lit8 v2, v23, 0x3

    and-int/lit8 v2, v2, 0x70

    .local v2, "$changed$iv":I
    move-object/from16 v5, v18

    .local v5, "modifier$iv":Landroidx/compose/ui/Modifier;
    const/4 v6, 0x0

    .line 1607
    .local v6, "$i$f$Layout":I
    const v7, 0x5365e06c

    move-object/from16 p0, v0

    .end local v0    # "list":Ljava/util/List;
    .local p0, "list":Ljava/util/List;
    const-string v0, "CC(Layout)P(!1,2)168@6883L62,165@6769L182:Layout.kt#80mrfh"

    invoke-static {v11, v7, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1609
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutKt;->combineAsVirtualLayouts(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 1610
    nop

    .line 1611
    const v7, -0x1154b8ad

    move-object/from16 p1, v0

    const-string v0, "CC(remember):Layout.kt#9igjgp"

    invoke-static {v11, v7, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v0, v2, 0x380

    xor-int/lit16 v0, v0, 0x180

    const/16 v7, 0x100

    if-le v0, v7, :cond_29

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    :cond_29
    and-int/lit16 v0, v2, 0x180

    const/16 v7, 0x100

    if-ne v0, v7, :cond_2b

    :cond_2a
    const/16 v21, 0x1

    goto :goto_1f

    :cond_2b
    const/16 v21, 0x0

    .local v21, "invalid$iv$iv":Z
    :goto_1f
    move-object v0, v11

    .local v0, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1612
    .restart local v7    # "$i$f$cache":I
    move-object/from16 p2, v1

    .end local v1    # "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .local p2, "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1613
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    if-nez v21, :cond_2d

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p4, v2

    .end local v2    # "$changed$iv":I
    .local p4, "$changed$iv":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2c

    goto :goto_20

    .line 1617
    :cond_2c
    goto :goto_21

    .line 1613
    .end local p4    # "$changed$iv":I
    .restart local v2    # "$changed$iv":I
    :cond_2d
    move/from16 p4, v2

    .line 1614
    .end local v2    # "$changed$iv":I
    .restart local p4    # "$changed$iv":I
    :goto_20
    const/4 v2, 0x0

    .line 1611
    .local v2, "$i$a$-cache-LayoutKt$Layout$3$iv":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/layout/MultiContentMeasurePolicyKt;->createMeasurePolicy(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    .line 1614
    .end local v2    # "$i$a$-cache-LayoutKt$Layout$3$iv":I
    nop

    .line 1615
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1616
    move-object v1, v2

    .line 1612
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_21
    nop

    .line 1611
    .end local v0    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local v21    # "invalid$iv$iv":Z
    check-cast v1, Landroidx/compose/ui/layout/MeasurePolicy;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v0, p4, 0x70

    .line 1608
    nop

    .local v1, "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    move-object v2, v5

    .local v2, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    move-object/from16 v7, p1

    .local v0, "$changed$iv$iv":I
    .local v7, "content$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v16, 0x0

    .line 1618
    .local v16, "$i$f$Layout":I
    move/from16 p1, v0

    .end local v0    # "$changed$iv$iv":I
    .local p1, "$changed$iv$iv":I
    const v0, -0x4ee9b9da

    move-object/from16 p5, v3

    .end local v3    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    .local p5, "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    const-string v3, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh"

    invoke-static {v11, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1619
    const/4 v0, 0x0

    invoke-static {v11, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 1620
    .local v0, "compositeKeyHash$iv$iv":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v3

    .line 1621
    .local v3, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 p6, v0

    .end local v0    # "compositeKeyHash$iv$iv":I
    .local p6, "compositeKeyHash$iv$iv":I
    invoke-static {v11, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 1623
    .local v0, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v17

    move-object/from16 p8, v2

    .end local v2    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    .local p8, "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    shl-int/lit8 v2, p1, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    .line 1622
    move-object/from16 v19, v17

    .local v2, "$changed$iv$iv$iv":I
    .local v19, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    const/16 v17, 0x0

    .line 1624
    .local v17, "$i$f$ReusableComposeNode":I
    move/from16 v20, v2

    .end local v2    # "$changed$iv$iv$iv":I
    .local v20, "$changed$iv$iv$iv":I
    const v2, -0x2942ffcf

    move-object/from16 v21, v4

    .end local v4    # "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .local v21, "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    const-string v4, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp"

    invoke-static {v11, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1625
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v2

    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    if-nez v2, :cond_2e

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1626
    :cond_2e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1627
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 1628
    move-object/from16 v2, v19

    .end local v19    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v2, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_22

    .line 1630
    .end local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v19    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    :cond_2f
    move-object/from16 v2, v19

    .end local v19    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1632
    :goto_22
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .local v4, "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 1633
    .local v19, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    sget-object v22, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v24, v2

    .end local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v24, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v4, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1634
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v4, v3, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1635
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .local v2, "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v22, 0x0

    .line 1636
    .local v22, "$i$f$set-impl":I
    move-object/from16 v25, v4

    .local v25, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    .line 1637
    .local v26, "$i$a$-with-Updater$set$1$iv$iv$iv":I
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v27

    if-nez v27, :cond_31

    move-object/from16 v27, v1

    .end local v1    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v27, "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v28, v3

    .end local v3    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .local v28, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_23

    :cond_30
    move-object/from16 v3, v25

    goto :goto_24

    .end local v27    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v28    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v1    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v3    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    :cond_31
    move-object/from16 v27, v1

    move-object/from16 v28, v3

    .line 1638
    .end local v1    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v3    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .restart local v27    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v28    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    :goto_23
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v3, v25

    .end local v25    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1639
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1641
    :goto_24
    nop

    .line 1636
    .end local v3    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v26    # "$i$a$-with-Updater$set$1$iv$iv$iv":I
    nop

    .line 1641
    nop

    .line 1642
    .end local v2    # "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v22    # "$i$f$set-impl":I
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v4, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1643
    nop

    .line 1632
    .end local v4    # "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    nop

    .line 1644
    shr-int/lit8 v1, v20, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v11, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1645
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1624
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1646
    nop

    .line 1618
    .end local v17    # "$i$f$ReusableComposeNode":I
    .end local v20    # "$changed$iv$iv$iv":I
    .end local v24    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1647
    nop

    .line 1607
    .end local v0    # "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    .end local v7    # "content$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v16    # "$i$f$Layout":I
    .end local v27    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v28    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local p1    # "$changed$iv$iv":I
    .end local p6    # "compositeKeyHash$iv$iv":I
    .end local p8    # "modifier$iv$iv":Landroidx/compose/ui/Modifier;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1648
    nop

    .end local v5    # "modifier$iv":Landroidx/compose/ui/Modifier;
    .end local v6    # "$i$f$Layout":I
    .end local p4    # "$changed$iv":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 119
    .end local v21    # "overflowState":Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .end local p0    # "list":Ljava/util/List;
    .end local p2    # "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    :cond_32
    move-object/from16 v2, p3

    move-object/from16 v7, p5

    move-object v4, v13

    move v5, v14

    move v6, v15

    move-object/from16 v1, v18

    move-object v3, v12

    goto :goto_25

    .end local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v12    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v13    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local v14    # "maxItemsInEachRow":I
    .end local v15    # "maxLines":I
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v23    # "$dirty":I
    .local v0, "$dirty":I
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    .local p0, "modifier":Landroidx/compose/ui/Modifier;
    .local p1, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local p2, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local p3, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local p4, "maxItemsInEachRow":I
    .local p5, "maxLines":I
    .local p6, "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    :cond_33
    move/from16 v23, v0

    move-object v11, v1

    .end local v0    # "$dirty":I
    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v23    # "$dirty":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v1, p0

    move/from16 v5, p4

    move-object/from16 v7, p6

    move-object v2, v6

    move-object v4, v14

    move/from16 v6, p5

    move-object v3, v12

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local p4    # "maxItemsInEachRow":I
    .end local p5    # "maxLines":I
    .end local p6    # "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v3, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v4, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v5, "maxItemsInEachRow":I
    .local v6, "maxLines":I
    .local v7, "overflow":Landroidx/compose/foundation/layout/FlowRowOverflow;
    :goto_25
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_34

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$1;

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_34
    return-void
.end method

.method public static final FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p2, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p3, "itemVerticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p4, "maxItemsInEachRow"    # I
    .param p5, "maxLines"    # I
    .param p6, "content"    # Lkotlin/jvm/functions/Function3;
    .param p7, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p8, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "II",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/FlowRowScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 162
    move/from16 v8, p8

    const v0, -0x7b6532ec

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p7    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(FlowRow)P(5,1,6,2,3,4)161@7269L215:FlowLayout.kt#2w3rfo"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p8

    .local v2, "$dirty":I
    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_5

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit8 v7, p9, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_8

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, p9, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v2, v12

    goto :goto_7

    :cond_b
    move-object/from16 v11, p3

    :goto_7
    and-int/lit8 v12, p9, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_e

    move/from16 v13, p4

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v2, v14

    goto :goto_9

    :cond_e
    move/from16 v13, p4

    :goto_9
    and-int/lit8 v14, p9, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v8

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v2, v2, v16

    goto :goto_b

    :cond_11
    move/from16 v15, p5

    :goto_b
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v17

    if-nez v16, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v2, v2, v18

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const v18, 0x92493

    and-int v0, v2, v18

    move/from16 p7, v3

    const v3, 0x92492

    if-eq v0, v3, :cond_15

    const/4 v0, 0x1

    goto :goto_e

    :cond_15
    const/4 v0, 0x0

    :goto_e
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1e

    if-eqz p7, :cond_16

    .line 154
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v9, v0

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_f

    .line 162
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_16
    move-object v9, v4

    .line 154
    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v9, "modifier":Landroidx/compose/ui/Modifier;
    :goto_f
    if-eqz v5, :cond_17

    .line 155
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    move/from16 v20, v10

    move-object v10, v0

    move/from16 v0, v20

    .end local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v0, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    goto :goto_10

    .line 154
    .end local v0    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_17
    move v0, v10

    move-object v10, v6

    .line 155
    .end local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v10, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_10
    if-eqz v7, :cond_18

    .line 156
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v3

    move-object v11, v3

    .end local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v3, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    goto :goto_11

    .line 155
    .end local v3    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_18
    move-object/from16 v11, p2

    .line 156
    .end local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v11, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_11
    if-eqz v0, :cond_19

    .line 157
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v0

    move/from16 v20, v12

    move-object v12, v0

    move/from16 v0, v20

    .end local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v0, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    goto :goto_12

    .line 156
    .end local v0    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .restart local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    :cond_19
    move v0, v12

    move-object/from16 v12, p3

    .line 157
    .end local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v12, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    :goto_12
    if-eqz v0, :cond_1a

    .line 158
    const v0, 0x7fffffff

    move v13, v0

    .end local p4    # "maxItemsInEachRow":I
    .local v13, "maxItemsInEachRow":I
    :cond_1a
    if-eqz v14, :cond_1b

    .line 159
    const v0, 0x7fffffff

    move v14, v0

    .end local p5    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_13

    .line 158
    .end local v0    # "maxLines":I
    .restart local p5    # "maxLines":I
    :cond_1b
    move v14, v15

    .line 159
    .end local p5    # "maxLines":I
    .local v14, "maxLines":I
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 162
    const/4 v0, -0x1

    const-string v3, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)"

    const v4, -0x7b6532ec

    invoke-static {v4, v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 163
    :cond_1c
    nop

    .line 164
    nop

    .line 165
    nop

    .line 166
    nop

    .line 167
    nop

    .line 168
    nop

    .line 169
    sget-object v0, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowRowOverflow;

    move-result-object v15

    .line 170
    and-int/lit8 v0, v2, 0xe

    or-int v0, v0, v17

    and-int/lit8 v3, v2, 0x70

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    shl-int/lit8 v3, v2, 0x3

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int v18, v0, v3

    .line 162
    const/16 v19, 0x0

    move-object/from16 v16, p6

    move-object/from16 v17, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v17, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 171
    :cond_1d
    move v0, v2

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v6, v14

    move v5, v13

    goto :goto_14

    .end local v9    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v10    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v11    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v12    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local v13    # "maxItemsInEachRow":I
    .end local v14    # "maxLines":I
    .end local v17    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .restart local p4    # "maxItemsInEachRow":I
    .restart local p5    # "maxLines":I
    :cond_1e
    move-object/from16 v17, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v17    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move v0, v2

    move-object v1, v4

    move-object v2, v6

    move v6, v15

    move-object/from16 v4, p3

    move v5, v13

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p1    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p2    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p3    # "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local p4    # "maxItemsInEachRow":I
    .end local p5    # "maxLines":I
    .local v0, "$dirty":I
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v3    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v4, "itemVerticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v5, "maxItemsInEachRow":I
    .local v6, "maxLines":I
    :goto_14
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1f

    move v7, v0

    .end local v0    # "$dirty":I
    .local v7, "$dirty":I
    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$2;

    move/from16 v9, p9

    move v11, v7

    move-object/from16 v7, p6

    .end local v7    # "$dirty":I
    .local v11, "$dirty":I
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_15

    .end local v11    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_1f
    move v11, v0

    .end local v0    # "$dirty":I
    .restart local v11    # "$dirty":I
    :goto_15
    return-void
.end method

.method public static final synthetic access$intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J
    .locals 2
    .param p0, "children"    # Ljava/util/List;
    .param p1, "mainAxisSizes"    # [I
    .param p2, "crossAxisSizes"    # [I
    .param p3, "mainAxisAvailable"    # I
    .param p4, "mainAxisSpacing"    # I
    .param p5, "crossAxisSpacing"    # I
    .param p6, "maxItemsInMainAxis"    # I
    .param p7, "maxLines"    # I
    .param p8, "overflow"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final breakDownItems-di9J0FM(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 68
    .param p0, "$this$breakDownItems_u2ddi9J0FM"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "measurePolicy"    # Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .param p2, "measurablesIterator"    # Ljava/util/Iterator;
    .param p3, "mainAxisSpacingDp"    # F
    .param p4, "crossAxisSpacingDp"    # F
    .param p5, "constraints"    # J
    .param p7, "maxItemsInMainAxis"    # I
    .param p8, "maxLines"    # I
    .param p9, "overflow"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "Ljava/util/Iterator<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;FFJII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1239
    move-object/from16 v6, p0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    const/4 v0, 0x0

    .line 1849
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 1850
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv":I
    const/4 v2, 0x0

    .line 1851
    .local v2, "$i$f$MutableVector":I
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    new-array v4, v1, [Landroidx/compose/ui/layout/MeasureResult;

    const/4 v15, 0x0

    invoke-direct {v3, v4, v15}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1849
    .end local v1    # "capacity$iv$iv":I
    .end local v2    # "$i$f$MutableVector":I
    nop

    .line 1239
    .end local v0    # "$i$f$mutableVectorOf":I
    nop

    .line 1240
    .local v3, "items":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v0, 0x0

    .line 1852
    .local v0, "$i$f$getMainAxisMax-impl":I
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v0

    .line 1240
    .end local v0    # "$i$f$getMainAxisMax-impl":I
    nop

    .line 1241
    .local v0, "mainAxisMax":I
    const/4 v1, 0x0

    .line 1853
    .local v1, "$i$f$getMainAxisMin-impl":I
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v1

    .line 1241
    .end local v1    # "$i$f$getMainAxisMin-impl":I
    move/from16 v16, v1

    .line 1242
    .local v16, "mainAxisMin":I
    const/4 v1, 0x0

    .line 1854
    .local v1, "$i$f$getCrossAxisMax-impl":I
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v1

    .line 1242
    .end local v1    # "$i$f$getCrossAxisMax-impl":I
    nop

    .line 1243
    .local v1, "crossAxisMax":I
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->mutableIntObjectMapOf()Landroidx/collection/MutableIntObjectMap;

    move-result-object v2

    .line 1244
    .local v2, "placeables":Landroidx/collection/MutableIntObjectMap;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v4

    check-cast v7, Ljava/util/List;

    .line 1246
    .local v7, "measurables":Ljava/util/List;
    move/from16 v4, p3

    invoke-interface {v6, v4}, Landroidx/compose/ui/layout/MeasureScope;->toPx-0680j_4(F)F

    move-result v5

    float-to-double v8, v5

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v5, v8

    float-to-int v5, v5

    .line 1247
    .local v5, "spacing":I
    move/from16 v8, p4

    invoke-interface {v6, v8}, Landroidx/compose/ui/layout/MeasureScope;->toPx-0680j_4(F)F

    move-result v9

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-float v9, v9

    float-to-int v9, v9

    .line 1248
    .local v9, "crossAxisSpacing":I
    invoke-static {v15, v0, v15, v1}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    move-result-wide v17

    .line 1250
    .local v17, "subsetConstraints":J
    nop

    .line 1251
    const/16 v23, 0xe

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v24}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy-yUG9Ft0$default(JIIIIILjava/lang/Object;)J

    move-result-wide v10

    .line 1253
    move-wide/from16 v26, v17

    .end local v17    # "subsetConstraints":J
    .local v26, "subsetConstraints":J
    invoke-interface {v13}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v12

    if-eqz v12, :cond_0

    sget-object v12, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    goto :goto_0

    .line 1254
    :cond_0
    sget-object v12, Landroidx/compose/foundation/layout/LayoutOrientation;->Vertical:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 1252
    :goto_0
    invoke-static {v10, v11, v12}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    move-result-wide v10

    .line 1249
    nop

    .line 1257
    .local v10, "measureConstraints":J
    const/4 v12, 0x0

    .line 1258
    .local v12, "index":I
    const/16 v17, 0x0

    .line 1259
    .local v17, "measurable":Ljava/lang/Object;
    new-instance v18, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct/range {v18 .. v18}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    move-object/from16 v28, v18

    .line 1261
    .local v28, "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    const/16 v19, 0x0

    .line 1262
    .local v19, "lineIndex":I
    const/16 v18, 0x0

    .local v18, "leftOver":I
    move/from16 v34, v0

    .line 1263
    .end local v18    # "leftOver":I
    .local v34, "leftOver":I
    move/from16 v36, v1

    .line 1265
    .local v36, "leftOverCrossAxis":I
    instance-of v15, v14, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;

    move/from16 v38, v1

    .end local v1    # "crossAxisMax":I
    .local v38, "crossAxisMax":I
    if-eqz v15, :cond_1

    .line 1266
    new-instance v18, Landroidx/compose/foundation/layout/FlowLineInfo;

    .line 1267
    nop

    .line 1268
    nop

    .line 1269
    move/from16 v15, v34

    .end local v34    # "leftOver":I
    .local v15, "leftOver":I
    invoke-interface {v6, v15}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v21

    .line 1270
    move/from16 v1, v36

    .end local v36    # "leftOverCrossAxis":I
    .local v1, "leftOverCrossAxis":I
    invoke-interface {v6, v1}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v22

    .line 1266
    const/16 v20, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v23}, Landroidx/compose/foundation/layout/FlowLineInfo;-><init>(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v36, v19

    .end local v19    # "lineIndex":I
    .local v36, "lineIndex":I
    goto :goto_1

    .line 1273
    .end local v1    # "leftOverCrossAxis":I
    .end local v15    # "leftOver":I
    .restart local v19    # "lineIndex":I
    .restart local v34    # "leftOver":I
    .local v36, "leftOverCrossAxis":I
    :cond_1
    move/from16 v15, v34

    move/from16 v1, v36

    move/from16 v36, v19

    .end local v19    # "lineIndex":I
    .end local v34    # "leftOver":I
    .restart local v1    # "leftOverCrossAxis":I
    .restart local v15    # "leftOver":I
    .local v36, "lineIndex":I
    const/16 v18, 0x0

    .line 1265
    :goto_1
    nop

    .line 1264
    move-object/from16 v40, v18

    .line 1276
    .local v40, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    const/16 v18, 0x0

    .line 1277
    .local v18, "nextSize":Ljava/lang/Object;
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    .local v19, "$this$breakDownItems_di9J0FM_u24lambda_u2415":Z
    const/16 v20, 0x0

    .line 1278
    .local v20, "$i$a$-run-FlowLayoutKt$breakDownItems$nextSize$1":I
    move-object/from16 v41, v3

    move-object/from16 v3, v40

    if-nez v19, :cond_2

    const/16 v21, 0x0

    goto :goto_2

    .end local v40    # "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .local v3, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .local v41, "items":Landroidx/compose/runtime/collection/MutableVector;
    :cond_2
    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/FlowLayoutKt;->safeNext(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;

    move-result-object v21

    :goto_2
    move-object/from16 v40, v21

    .line 1279
    .end local v17    # "measurable":Ljava/lang/Object;
    .local v40, "measurable":Ljava/lang/Object;
    if-eqz v40, :cond_3

    new-instance v4, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$nextSize$1$1;

    move/from16 v23, v5

    move-object/from16 v5, v28

    .end local v28    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v5, "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v23, "spacing":I
    invoke-direct {v4, v5}, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$nextSize$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v8, v40

    .end local v40    # "measurable":Ljava/lang/Object;
    .local v8, "measurable":Ljava/lang/Object;
    invoke-static {v8, v13, v10, v11, v4}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v4

    goto :goto_3

    .end local v8    # "measurable":Ljava/lang/Object;
    .end local v23    # "spacing":I
    .local v5, "spacing":I
    .restart local v28    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v40    # "measurable":Ljava/lang/Object;
    :cond_3
    move/from16 v23, v5

    move-object/from16 v5, v28

    move-object/from16 v8, v40

    .end local v28    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v40    # "measurable":Ljava/lang/Object;
    .local v5, "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v8    # "measurable":Ljava/lang/Object;
    .restart local v23    # "spacing":I
    const/4 v4, 0x0

    .line 1281
    :goto_3
    nop

    .line 1277
    .end local v19    # "$this$breakDownItems_di9J0FM_u24lambda_u2415":Z
    .end local v20    # "$i$a$-run-FlowLayoutKt$breakDownItems$nextSize$1":I
    nop

    .line 1276
    move-object/from16 v47, v4

    .line 1283
    .end local v18    # "nextSize":Ljava/lang/Object;
    .local v47, "nextSize":Ljava/lang/Object;
    if-eqz v47, :cond_4

    invoke-virtual/range {v47 .. v47}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    .line 1284
    .local v4, "nextMainAxisSize":Ljava/lang/Integer;
    :goto_4
    if-eqz v47, :cond_5

    invoke-virtual/range {v47 .. v47}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    goto :goto_5

    :cond_5
    const/16 v17, 0x0

    :goto_5
    move-object/from16 v28, v17

    .line 1286
    .local v28, "nextCrossAxisSize":Ljava/lang/Integer;
    const/16 v40, 0x0

    .line 1287
    .local v40, "startBreakLineIndex":I
    const/16 v17, 0x0

    .line 1855
    .local v17, "$i$f$mutableIntListOf":I
    move-object/from16 v53, v4

    .end local v4    # "nextMainAxisSize":Ljava/lang/Integer;
    .local v53, "nextMainAxisSize":Ljava/lang/Integer;
    new-instance v4, Landroidx/collection/MutableIntList;

    move-object/from16 v54, v8

    .end local v8    # "measurable":Ljava/lang/Object;
    .local v54, "measurable":Ljava/lang/Object;
    const/4 v8, 0x1

    move/from16 v24, v9

    move/from16 v37, v12

    const/4 v9, 0x0

    const/4 v12, 0x0

    .end local v9    # "crossAxisSpacing":I
    .end local v12    # "index":I
    .local v24, "crossAxisSpacing":I
    .local v37, "index":I
    invoke-direct {v4, v12, v8, v9}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1287
    .end local v17    # "$i$f$mutableIntListOf":I
    nop

    .line 1288
    .local v4, "endBreakLineList":Landroidx/collection/MutableIntList;
    const/16 v17, 0x0

    .line 1856
    .restart local v17    # "$i$f$mutableIntListOf":I
    move-object/from16 v55, v4

    .end local v4    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v55, "endBreakLineList":Landroidx/collection/MutableIntList;
    new-instance v4, Landroidx/collection/MutableIntList;

    invoke-direct {v4, v12, v8, v9}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1288
    .end local v17    # "$i$f$mutableIntListOf":I
    nop

    .line 1291
    .local v4, "crossAxisSizes":Landroidx/collection/MutableIntList;
    new-instance v42, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;

    .line 1292
    nop

    .line 1297
    nop

    .line 1295
    nop

    .line 1296
    nop

    .line 1293
    nop

    .line 1294
    nop

    .line 1291
    const/16 v25, 0x0

    move-wide/from16 v20, p5

    move/from16 v18, p7

    move/from16 v22, p8

    move-object/from16 v19, p9

    move-object/from16 v17, v42

    invoke-direct/range {v17 .. v25}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;-><init>(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1290
    move-object/from16 v29, v42

    .line 1299
    .local v29, "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    const/4 v9, 0x0

    .line 1303
    .local v9, "ellipsisWrapInfo":Ljava/lang/Object;
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v43

    .line 1304
    invoke-static {v15, v1}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v45

    .line 1306
    nop

    .line 1301
    nop

    .line 1303
    nop

    .line 1308
    nop

    .line 1304
    nop

    .line 1306
    nop

    .line 1311
    nop

    .line 1305
    nop

    .line 1307
    nop

    .line 1309
    nop

    .line 1310
    nop

    .line 1302
    const/16 v44, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    .end local v29    # "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    .local v42, "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    invoke-virtual/range {v42 .. v52}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v17

    .line 1313
    .end local v42    # "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    .restart local v29    # "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    move-object/from16 v30, v17

    .local v30, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    const/16 v18, 0x0

    .line 1314
    .local v18, "$i$a$-also-FlowLayoutKt$breakDownItems$wrapInfo$1":I
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v19

    if-eqz v19, :cond_7

    .line 1315
    nop

    .line 1316
    nop

    .line 1317
    nop

    .line 1318
    if-eqz v47, :cond_6

    move/from16 v31, v8

    goto :goto_6

    :cond_6
    move/from16 v31, v12

    .line 1319
    :goto_6
    nop

    .line 1320
    nop

    .line 1321
    nop

    .line 1322
    nop

    .line 1316
    const/16 v32, -0x1

    const/16 v33, 0x0

    const/16 v35, 0x0

    move/from16 v34, v15

    .end local v15    # "leftOver":I
    .restart local v34    # "leftOver":I
    invoke-virtual/range {v29 .. v35}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    move-result-object v15

    .line 1315
    move-object v9, v15

    goto :goto_7

    .line 1314
    .end local v34    # "leftOver":I
    .restart local v15    # "leftOver":I
    :cond_7
    move/from16 v34, v15

    .line 1325
    .end local v15    # "leftOver":I
    .restart local v34    # "leftOver":I
    :goto_7
    nop

    .line 1313
    .end local v18    # "$i$a$-also-FlowLayoutKt$breakDownItems$wrapInfo$1":I
    .end local v30    # "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    nop

    .line 1300
    nop

    .line 1328
    .local v17, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    const/4 v15, 0x0

    .local v15, "mainAxisTotalSize":I
    move/from16 v15, v16

    .line 1329
    const/16 v18, 0x0

    .line 1330
    .local v18, "crossAxisTotalSize":I
    const/16 v19, 0x0

    .line 1331
    .local v19, "currentLineMainAxisSize":I
    const/16 v20, 0x0

    move/from16 v63, v18

    move/from16 v62, v36

    move-object/from16 v12, v54

    move-object/from16 v18, v9

    move v9, v15

    move/from16 v15, v20

    move/from16 v20, v8

    move v8, v1

    move/from16 v1, v37

    .line 1332
    .end local v36    # "lineIndex":I
    .end local v37    # "index":I
    .end local v54    # "measurable":Ljava/lang/Object;
    .local v1, "index":I
    .local v8, "leftOverCrossAxis":I
    .local v9, "mainAxisTotalSize":I
    .local v12, "measurable":Ljava/lang/Object;
    .local v15, "currentLineCrossAxisSize":I
    .local v18, "ellipsisWrapInfo":Ljava/lang/Object;
    .local v62, "lineIndex":I
    .local v63, "crossAxisTotalSize":I
    :goto_8
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v21

    if-nez v21, :cond_18

    if-eqz v12, :cond_18

    .line 1333
    invoke-static/range {v53 .. v53}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {v53 .. v53}, Ljava/lang/Integer;->intValue()I

    move-result v21

    .line 1334
    .local v21, "itemMainAxisSize":I
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v22, v4

    .end local v4    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v22, "crossAxisSizes":Landroidx/collection/MutableIntList;
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 1335
    .local v4, "itemCrossAxisSize":I
    move/from16 v25, v0

    .end local v0    # "mainAxisMax":I
    .local v25, "mainAxisMax":I
    add-int v0, v19, v21

    .line 1336
    .end local v19    # "currentLineMainAxisSize":I
    .local v0, "currentLineMainAxisSize":I
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v64

    .line 1337
    .end local v15    # "currentLineCrossAxisSize":I
    .local v64, "currentLineCrossAxisSize":I
    sub-int v15, v34, v21

    .line 1338
    .end local v34    # "leftOver":I
    .local v15, "leftOver":I
    move/from16 v36, v4

    .end local v4    # "itemCrossAxisSize":I
    .local v36, "itemCrossAxisSize":I
    add-int/lit8 v4, v1, 0x1

    move/from16 v19, v0

    move-object/from16 v0, p9

    .end local v0    # "currentLineMainAxisSize":I
    .restart local v19    # "currentLineMainAxisSize":I
    invoke-virtual {v0, v4}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->setItemShown$foundation_layout_release(I)V

    .line 1339
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1340
    iget-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {v2, v1, v4}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 1342
    add-int/lit8 v4, v1, 0x1

    sub-int v4, v4, v40

    .line 1343
    .local v4, "nextIndexInLine":I
    move/from16 v0, p7

    if-ge v4, v0, :cond_8

    move/from16 v30, v20

    goto :goto_9

    :cond_8
    const/16 v30, 0x0

    :goto_9
    move/from16 v42, v30

    .line 1345
    .local v42, "willFitLine":Z
    if-eqz v3, :cond_f

    .line 1346
    if-eqz v42, :cond_9

    move/from16 v0, v62

    goto :goto_a

    :cond_9
    add-int/lit8 v30, v62, 0x1

    move/from16 v0, v30

    .line 1347
    :goto_a
    move/from16 v43, v1

    if-eqz v42, :cond_a

    move v1, v4

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    .line 1354
    .end local v1    # "index":I
    .local v43, "index":I
    :goto_b
    nop

    .line 1349
    if-eqz v42, :cond_c

    .line 1350
    sub-int v30, v15, v23

    .local v30, "$this$fastCoerceAtLeast$iv":I
    const/16 v31, 0x0

    .local v31, "minimumValue$iv":I
    const/16 v32, 0x0

    .line 1857
    .local v32, "$i$f$fastCoerceAtLeast":I
    move/from16 v58, v4

    if-gez v30, :cond_b

    move/from16 v4, v31

    goto :goto_c

    :cond_b
    move/from16 v4, v30

    .end local v30    # "$this$fastCoerceAtLeast$iv":I
    .end local v31    # "minimumValue$iv":I
    .end local v32    # "$i$f$fastCoerceAtLeast":I
    goto :goto_c

    .line 1352
    :cond_c
    move/from16 v58, v4

    move/from16 v4, v25

    .line 1354
    .end local v4    # "nextIndexInLine":I
    .local v58, "nextIndexInLine":I
    :goto_c
    invoke-interface {v6, v4}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v4

    .line 1362
    nop

    .line 1356
    if-eqz v42, :cond_d

    .line 1357
    move-object/from16 v31, v12

    move v12, v8

    goto :goto_d

    .line 1359
    :cond_d
    sub-int v30, v8, v64

    sub-int v30, v30, v24

    .line 1360
    const/16 v31, 0x0

    .restart local v30    # "$this$fastCoerceAtLeast$iv":I
    .restart local v31    # "minimumValue$iv":I
    const/16 v32, 0x0

    .line 1858
    .restart local v32    # "$i$f$fastCoerceAtLeast":I
    if-gez v30, :cond_e

    move/from16 v67, v31

    move-object/from16 v31, v12

    move/from16 v12, v67

    goto :goto_d

    :cond_e
    move-object/from16 v31, v12

    move/from16 v12, v30

    .line 1362
    .end local v12    # "measurable":Ljava/lang/Object;
    .end local v30    # "$this$fastCoerceAtLeast$iv":I
    .end local v32    # "$i$f$fastCoerceAtLeast":I
    .local v31, "measurable":Ljava/lang/Object;
    :goto_d
    invoke-interface {v6, v12}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v12

    .line 1345
    invoke-virtual {v3, v0, v1, v4, v12}, Landroidx/compose/foundation/layout/FlowLineInfo;->update-4j6BHR0$foundation_layout_release(IIFF)V

    goto :goto_e

    .end local v31    # "measurable":Ljava/lang/Object;
    .end local v43    # "index":I
    .end local v58    # "nextIndexInLine":I
    .restart local v1    # "index":I
    .restart local v4    # "nextIndexInLine":I
    .restart local v12    # "measurable":Ljava/lang/Object;
    :cond_f
    move/from16 v43, v1

    move/from16 v58, v4

    move-object/from16 v31, v12

    .line 1365
    .end local v1    # "index":I
    .end local v4    # "nextIndexInLine":I
    .end local v12    # "measurable":Ljava/lang/Object;
    .restart local v31    # "measurable":Ljava/lang/Object;
    .restart local v43    # "index":I
    .restart local v58    # "nextIndexInLine":I
    :goto_e
    nop

    .line 1366
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    .local v0, "$this$breakDownItems_di9J0FM_u24lambda_u2417":Z
    const/4 v1, 0x0

    .line 1367
    .local v1, "$i$a$-run-FlowLayoutKt$breakDownItems$1":I
    if-nez v0, :cond_10

    const/4 v4, 0x0

    goto :goto_f

    :cond_10
    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/FlowLayoutKt;->safeNext(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;

    move-result-object v4

    :goto_f
    move-object v12, v4

    .line 1368
    .end local v31    # "measurable":Ljava/lang/Object;
    .restart local v12    # "measurable":Ljava/lang/Object;
    const/4 v4, 0x0

    iput-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1369
    if-eqz v12, :cond_11

    new-instance v4, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$1$1;

    invoke-direct {v4, v5}, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v13, v10, v11, v4}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v4

    goto :goto_10

    :cond_11
    const/4 v4, 0x0

    .line 1371
    :goto_10
    nop

    .line 1366
    .end local v0    # "$this$breakDownItems_di9J0FM_u24lambda_u2417":Z
    .end local v1    # "$i$a$-run-FlowLayoutKt$breakDownItems$1":I
    nop

    .line 1365
    move-object/from16 v47, v4

    .line 1373
    if-eqz v47, :cond_12

    invoke-virtual/range {v47 .. v47}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    move-result v0

    add-int v0, v0, v23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_11

    :cond_12
    const/4 v0, 0x0

    .line 1374
    .end local v53    # "nextMainAxisSize":Ljava/lang/Integer;
    .local v0, "nextMainAxisSize":Ljava/lang/Integer;
    :goto_11
    if-eqz v47, :cond_13

    invoke-virtual/range {v47 .. v47}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_12

    :cond_13
    const/4 v1, 0x0

    :goto_12
    move-object/from16 v28, v1

    .line 1377
    nop

    .line 1378
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v57

    .line 1379
    invoke-static {v15, v8}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v59

    .line 1380
    nop

    .line 1382
    if-nez v47, :cond_14

    const/16 v61, 0x0

    goto :goto_13

    .line 1383
    :cond_14
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v30

    invoke-static/range {v30 .. v31}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v1

    move-object/from16 v61, v1

    .line 1382
    :goto_13
    nop

    .line 1384
    nop

    .line 1388
    nop

    .line 1377
    nop

    .line 1378
    nop

    .line 1385
    nop

    .line 1379
    nop

    .line 1382
    nop

    .line 1388
    nop

    .line 1380
    nop

    .line 1384
    nop

    .line 1386
    nop

    .line 1387
    nop

    .line 1377
    const/16 v65, 0x0

    const/16 v66, 0x0

    move-object/from16 v56, v29

    .end local v29    # "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    .local v56, "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    invoke-virtual/range {v56 .. v66}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v30

    .line 1376
    move/from16 v1, v64

    .line 1390
    .end local v17    # "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .end local v56    # "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    .end local v64    # "currentLineCrossAxisSize":I
    .local v1, "currentLineCrossAxisSize":I
    .restart local v29    # "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    .local v30, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInLine()Z

    move-result v4

    if-eqz v4, :cond_17

    .line 1391
    move/from16 v4, v19

    .end local v19    # "currentLineMainAxisSize":I
    .local v4, "currentLineMainAxisSize":I
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 1392
    move-object/from16 v19, v0

    move/from16 v0, v25

    .end local v25    # "mainAxisMax":I
    .local v0, "mainAxisMax":I
    .local v19, "nextMainAxisSize":Ljava/lang/Integer;
    invoke-static {v9, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 1393
    add-int v33, v63, v1

    .line 1394
    .end local v63    # "crossAxisTotalSize":I
    .local v33, "crossAxisTotalSize":I
    nop

    .line 1395
    nop

    .line 1396
    nop

    .line 1397
    if-eqz v47, :cond_15

    move/from16 v31, v20

    goto :goto_14

    :cond_15
    const/16 v31, 0x0

    .line 1398
    :goto_14
    nop

    .line 1399
    nop

    .line 1400
    nop

    .line 1401
    add-int/lit8 v17, v43, 0x1

    sub-int v35, v17, v40

    .line 1395
    move/from16 v34, v15

    move/from16 v32, v62

    .end local v15    # "leftOver":I
    .end local v62    # "lineIndex":I
    .local v32, "lineIndex":I
    .restart local v34    # "leftOver":I
    invoke-virtual/range {v29 .. v35}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    move-result-object v15

    .line 1394
    .end local v32    # "lineIndex":I
    .restart local v62    # "lineIndex":I
    nop

    .line 1403
    .end local v18    # "ellipsisWrapInfo":Ljava/lang/Object;
    .local v15, "ellipsisWrapInfo":Ljava/lang/Object;
    move/from16 v25, v0

    move-object/from16 v0, v22

    .end local v22    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v0, "crossAxisSizes":Landroidx/collection/MutableIntList;
    .restart local v25    # "mainAxisMax":I
    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 1404
    move/from16 v17, v25

    .line 1405
    .end local v34    # "leftOver":I
    .local v17, "leftOver":I
    sub-int v18, v38, v33

    sub-int v18, v18, v24

    .line 1406
    .end local v8    # "leftOverCrossAxis":I
    .local v18, "leftOverCrossAxis":I
    add-int/lit8 v8, v43, 0x1

    .line 1407
    .end local v40    # "startBreakLineIndex":I
    .local v8, "startBreakLineIndex":I
    move/from16 v64, v1

    .end local v1    # "currentLineCrossAxisSize":I
    .restart local v64    # "currentLineCrossAxisSize":I
    add-int/lit8 v1, v43, 0x1

    move-object/from16 v22, v3

    move-object/from16 v3, v55

    .end local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v3, "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v22, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    invoke-virtual {v3, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 1408
    const/4 v1, 0x0

    .line 1409
    .end local v4    # "currentLineMainAxisSize":I
    .local v1, "currentLineMainAxisSize":I
    const/4 v4, 0x0

    .line 1411
    .end local v64    # "currentLineCrossAxisSize":I
    .local v4, "currentLineCrossAxisSize":I
    if-eqz v19, :cond_16

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v31

    sub-int v31, v31, v23

    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    goto :goto_15

    :cond_16
    const/16 v31, 0x0

    .line 1412
    .end local v19    # "nextMainAxisSize":Ljava/lang/Integer;
    .local v31, "nextMainAxisSize":Ljava/lang/Integer;
    :goto_15
    add-int/lit8 v62, v62, 0x1

    .line 1413
    add-int v33, v33, v24

    move/from16 v19, v1

    move/from16 v40, v8

    move/from16 v34, v17

    move/from16 v8, v18

    move-object/from16 v53, v31

    move/from16 v63, v33

    move-object/from16 v18, v15

    move v15, v4

    goto :goto_16

    .line 1390
    .end local v4    # "currentLineCrossAxisSize":I
    .end local v17    # "leftOver":I
    .end local v31    # "nextMainAxisSize":Ljava/lang/Integer;
    .end local v33    # "crossAxisTotalSize":I
    .local v0, "nextMainAxisSize":Ljava/lang/Integer;
    .local v1, "currentLineCrossAxisSize":I
    .local v3, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .local v8, "leftOverCrossAxis":I
    .local v15, "leftOver":I
    .local v18, "ellipsisWrapInfo":Ljava/lang/Object;
    .local v19, "currentLineMainAxisSize":I
    .local v22, "crossAxisSizes":Landroidx/collection/MutableIntList;
    .restart local v40    # "startBreakLineIndex":I
    .restart local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .restart local v63    # "crossAxisTotalSize":I
    :cond_17
    move/from16 v64, v1

    move/from16 v34, v15

    move/from16 v4, v19

    move-object/from16 v19, v0

    move-object/from16 v0, v22

    move-object/from16 v22, v3

    move-object/from16 v3, v55

    .end local v1    # "currentLineCrossAxisSize":I
    .end local v15    # "leftOver":I
    .end local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v0, "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v3, "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v4, "currentLineMainAxisSize":I
    .local v19, "nextMainAxisSize":Ljava/lang/Integer;
    .local v22, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .restart local v34    # "leftOver":I
    .restart local v64    # "currentLineCrossAxisSize":I
    move-object/from16 v53, v19

    move/from16 v15, v64

    move/from16 v19, v4

    .line 1415
    .end local v4    # "currentLineMainAxisSize":I
    .end local v64    # "currentLineCrossAxisSize":I
    .local v15, "currentLineCrossAxisSize":I
    .local v19, "currentLineMainAxisSize":I
    .restart local v53    # "nextMainAxisSize":Ljava/lang/Integer;
    :goto_16
    nop

    .end local v21    # "itemMainAxisSize":I
    .end local v36    # "itemCrossAxisSize":I
    .end local v42    # "willFitLine":Z
    .end local v58    # "nextIndexInLine":I
    add-int/lit8 v1, v43, 0x1

    move-object v4, v0

    move-object/from16 v55, v3

    move-object/from16 v3, v22

    move/from16 v0, v25

    move-object/from16 v17, v30

    .end local v43    # "index":I
    .local v1, "index":I
    goto/16 :goto_8

    .line 1332
    .end local v22    # "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .end local v25    # "mainAxisMax":I
    .end local v30    # "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v0, "mainAxisMax":I
    .local v3, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .local v4, "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v17, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .restart local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    :cond_18
    move/from16 v25, v0

    move/from16 v43, v1

    move-object/from16 v22, v3

    move-object v0, v4

    move-object/from16 v31, v12

    move-object/from16 v3, v55

    .line 1418
    .end local v1    # "index":I
    .end local v4    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .end local v12    # "measurable":Ljava/lang/Object;
    .end local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v0, "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v3, "endBreakLineList":Landroidx/collection/MutableIntList;
    .restart local v22    # "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .restart local v25    # "mainAxisMax":I
    .local v31, "measurable":Ljava/lang/Object;
    .restart local v43    # "index":I
    if-eqz v18, :cond_1a

    move-object/from16 v1, v18

    .local v1, "it":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    const/4 v4, 0x0

    .line 1419
    .local v4, "$i$a$-let-FlowLayoutKt$breakDownItems$2":I
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsis()Landroidx/compose/ui/layout/Measurable;

    move-result-object v12

    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1420
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v12

    add-int/lit8 v12, v12, -0x1

    move-object/from16 v21, v1

    .end local v1    # "it":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    .local v21, "it":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceable()Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    invoke-virtual {v2, v12, v1}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 1421
    move-object v1, v3

    check-cast v1, Landroidx/collection/IntList;

    .local v1, "this_$iv":Landroidx/collection/IntList;
    const/4 v12, 0x0

    .line 1859
    .local v12, "$i$f$getLastIndex":I
    move/from16 v30, v4

    .end local v4    # "$i$a$-let-FlowLayoutKt$breakDownItems$2":I
    .local v30, "$i$a$-let-FlowLayoutKt$breakDownItems$2":I
    iget v4, v1, Landroidx/collection/IntList;->_size:I

    add-int/lit8 v4, v4, -0x1

    .line 1421
    .end local v1    # "this_$iv":Landroidx/collection/IntList;
    .end local v12    # "$i$f$getLastIndex":I
    nop

    .line 1422
    .end local v62    # "lineIndex":I
    .local v4, "lineIndex":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceEllipsisOnLastContentLine()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 1423
    move-object v1, v3

    check-cast v1, Landroidx/collection/IntList;

    .restart local v1    # "this_$iv":Landroidx/collection/IntList;
    const/4 v12, 0x0

    .line 1860
    .local v12, "$i$f$getSize":I
    iget v1, v1, Landroidx/collection/IntList;->_size:I

    .line 1423
    .end local v1    # "this_$iv":Landroidx/collection/IntList;
    .end local v12    # "$i$f$getSize":I
    add-int/lit8 v1, v1, -0x1

    .line 1424
    .local v1, "lastIndex":I
    invoke-virtual {v0, v4}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v12

    .line 1425
    .local v12, "lastLineCrossAxis":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    move-result-wide v32

    move-object/from16 v35, v5

    .end local v5    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v35, "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-static/range {v32 .. v33}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v5

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v0, v4, v5}, Landroidx/collection/MutableIntList;->set(II)I

    .line 1426
    invoke-virtual {v3}, Landroidx/collection/MutableIntList;->last()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v1, v5}, Landroidx/collection/MutableIntList;->set(II)I

    goto :goto_17

    .line 1428
    .end local v1    # "lastIndex":I
    .end local v12    # "lastLineCrossAxis":I
    .end local v35    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v5    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    :cond_19
    move-object/from16 v35, v5

    .end local v5    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v35    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 1429
    invoke-virtual {v3}, Landroidx/collection/MutableIntList;->last()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 1430
    :goto_17
    nop

    .line 1418
    .end local v21    # "it":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    .end local v30    # "$i$a$-let-FlowLayoutKt$breakDownItems$2":I
    move/from16 v62, v4

    goto :goto_18

    .end local v4    # "lineIndex":I
    .end local v35    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v5    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v62    # "lineIndex":I
    :cond_1a
    move-object/from16 v35, v5

    .line 1433
    .end local v5    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v35    # "placeableItem":Lkotlin/jvm/internal/Ref$ObjectRef;
    :goto_18
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    new-array v4, v1, [Landroidx/compose/ui/layout/Placeable;

    const/4 v5, 0x0

    :goto_19
    if-ge v5, v1, :cond_1b

    invoke-virtual {v2, v5}, Landroidx/collection/MutableIntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v12

    aput-object v12, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_19

    .line 1434
    .local v4, "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    :cond_1b
    move-object v1, v3

    check-cast v1, Landroidx/collection/IntList;

    .local v1, "this_$iv":Landroidx/collection/IntList;
    const/4 v5, 0x0

    .line 1861
    .local v5, "$i$f$getSize":I
    iget v1, v1, Landroidx/collection/IntList;->_size:I

    .end local v1    # "this_$iv":Landroidx/collection/IntList;
    .end local v5    # "$i$f$getSize":I
    new-array v1, v1, [I

    .line 1434
    nop

    .line 1435
    .local v1, "crossAxisOffsets":[I
    move-object v5, v3

    check-cast v5, Landroidx/collection/IntList;

    .local v5, "this_$iv":Landroidx/collection/IntList;
    const/4 v12, 0x0

    .line 1862
    .local v12, "$i$f$getSize":I
    iget v5, v5, Landroidx/collection/IntList;->_size:I

    .end local v5    # "this_$iv":Landroidx/collection/IntList;
    .end local v12    # "$i$f$getSize":I
    new-array v5, v5, [I

    .line 1435
    move-object/from16 v21, v5

    .line 1436
    .local v21, "crossAxisSizesArray":[I
    const/4 v5, 0x0

    .line 1438
    .end local v63    # "crossAxisTotalSize":I
    .local v5, "crossAxisTotalSize":I
    const/4 v12, 0x0

    .line 1439
    .local v12, "startIndex":I
    move-object v13, v3

    check-cast v13, Landroidx/collection/IntList;

    .local v13, "this_$iv":Landroidx/collection/IntList;
    const/16 v30, 0x0

    .line 1863
    .local v30, "$i$f$forEachIndexed":I
    nop

    .line 1864
    iget-object v14, v13, Landroidx/collection/IntList;->content:[I

    .line 1865
    .local v14, "content$iv":[I
    const/16 v32, 0x0

    move-object/from16 v33, v14

    .end local v14    # "content$iv":[I
    .local v32, "i$iv":I
    .local v33, "content$iv":[I
    iget v14, v13, Landroidx/collection/IntList;->_size:I

    move/from16 v67, v32

    move/from16 v32, v5

    move/from16 v5, v67

    .local v5, "i$iv":I
    .local v32, "crossAxisTotalSize":I
    :goto_1a
    if-ge v5, v14, :cond_1d

    .line 1866
    move-wide/from16 v44, v10

    .end local v10    # "measureConstraints":J
    .local v44, "measureConstraints":J
    aget v10, v33, v5

    .local v10, "endIndex":I
    move v11, v5

    .local v11, "currentLineIndex":I
    const/16 v36, 0x0

    .line 1440
    .local v36, "$i$a$-forEachIndexed-FlowLayoutKt$breakDownItems$3":I
    move/from16 v39, v8

    move-object v8, v4

    .end local v4    # "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .local v8, "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .local v39, "leftOverCrossAxis":I
    invoke-virtual {v0, v11}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v4

    .line 1442
    .local v4, "crossAxisSize":I
    move-object/from16 v42, v0

    .end local v0    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v42, "crossAxisSizes":Landroidx/collection/MutableIntList;
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;

    .line 1443
    nop

    .line 1444
    const/16 v46, 0x0

    .line 1867
    .local v46, "$i$f$getCrossAxisMin-impl":I
    invoke-static/range {v26 .. v27}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v46

    .line 1445
    .end local v46    # "$i$f$getCrossAxisMin-impl":I
    const/16 v48, 0x0

    .line 1868
    .local v48, "$i$f$getMainAxisMax-impl":I
    invoke-static/range {v26 .. v27}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v48

    .line 1446
    .end local v48    # "$i$f$getMainAxisMax-impl":I
    nop

    .line 1447
    nop

    .line 1448
    nop

    .line 1449
    nop

    .line 1450
    nop

    .line 1451
    nop

    .line 1452
    nop

    .line 1453
    nop

    .line 1454
    nop

    .line 1442
    move/from16 v37, v11

    move-object v11, v1

    move v1, v9

    move v9, v12

    move/from16 v12, v37

    move/from16 v37, v20

    move-object/from16 v20, v13

    move-object/from16 v13, v41

    move/from16 v41, v37

    move-object/from16 v55, v3

    move/from16 v37, v5

    move/from16 v5, v23

    move/from16 v3, v48

    move-object/from16 v23, v22

    move-object/from16 v22, v2

    move/from16 v2, v46

    const/16 v46, 0x0

    .end local v2    # "placeables":Landroidx/collection/MutableIntObjectMap;
    .end local v3    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .end local v41    # "items":Landroidx/compose/runtime/collection/MutableVector;
    .local v1, "mainAxisTotalSize":I
    .local v5, "spacing":I
    .local v9, "startIndex":I
    .local v11, "crossAxisOffsets":[I
    .local v12, "currentLineIndex":I
    .local v13, "items":Landroidx/compose/runtime/collection/MutableVector;
    .local v20, "this_$iv":Landroidx/collection/IntList;
    .local v22, "placeables":Landroidx/collection/MutableIntObjectMap;
    .local v23, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .local v37, "i$iv":I
    .restart local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    invoke-static/range {v0 .. v12}, Landroidx/compose/foundation/layout/RowColumnMeasurePolicyKt;->measure(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v0

    .line 1441
    move-object v2, v11

    move-object v11, v8

    move-object v8, v2

    move/from16 v48, v9

    move v2, v10

    move v10, v5

    move-object v9, v7

    .line 1456
    .end local v5    # "spacing":I
    .end local v7    # "measurables":Ljava/util/List;
    .local v0, "result":Landroidx/compose/ui/layout/MeasureResult;
    .local v2, "endIndex":I
    .local v8, "crossAxisOffsets":[I
    .local v9, "measurables":Ljava/util/List;
    .local v10, "spacing":I
    .local v11, "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .local v48, "startIndex":I
    const/4 v3, 0x0

    .line 1457
    .local v3, "mainAxisSize":I
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 1458
    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v3

    .line 1459
    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v4

    goto :goto_1b

    .line 1461
    :cond_1c
    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v3

    .line 1462
    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v4

    .line 1464
    :goto_1b
    aput v4, v21, v12

    .line 1465
    add-int v32, v32, v4

    .line 1466
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1467
    invoke-virtual {v13, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1468
    move v5, v2

    .line 1469
    .end local v48    # "startIndex":I
    .local v5, "startIndex":I
    nop

    .line 1866
    .end local v0    # "result":Landroidx/compose/ui/layout/MeasureResult;
    .end local v2    # "endIndex":I
    .end local v3    # "mainAxisSize":I
    .end local v4    # "crossAxisSize":I
    .end local v12    # "currentLineIndex":I
    .end local v36    # "$i$a$-forEachIndexed-FlowLayoutKt$breakDownItems$3":I
    nop

    .line 1865
    add-int/lit8 v0, v37, 0x1

    move/from16 v2, v41

    move-object/from16 v41, v13

    move-object/from16 v13, v20

    move/from16 v20, v2

    move-object/from16 v6, p0

    move v12, v5

    move-object v7, v9

    move-object v4, v11

    move-object/from16 v2, v22

    move-object/from16 v22, v23

    move-object/from16 v3, v55

    move v5, v0

    move v9, v1

    move-object v1, v8

    move/from16 v23, v10

    move/from16 v8, v39

    move-object/from16 v0, v42

    move-wide/from16 v10, v44

    .end local v37    # "i$iv":I
    .local v0, "i$iv":I
    goto/16 :goto_1a

    .end local v11    # "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .end local v20    # "this_$iv":Landroidx/collection/IntList;
    .end local v39    # "leftOverCrossAxis":I
    .end local v42    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .end local v44    # "measureConstraints":J
    .end local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v0, "crossAxisSizes":Landroidx/collection/MutableIntList;
    .local v1, "crossAxisOffsets":[I
    .local v2, "placeables":Landroidx/collection/MutableIntObjectMap;
    .local v3, "endBreakLineList":Landroidx/collection/MutableIntList;
    .local v4, "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .local v5, "i$iv":I
    .restart local v7    # "measurables":Ljava/util/List;
    .local v8, "leftOverCrossAxis":I
    .local v9, "mainAxisTotalSize":I
    .local v10, "measureConstraints":J
    .local v12, "startIndex":I
    .local v13, "this_$iv":Landroidx/collection/IntList;
    .local v22, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .local v23, "spacing":I
    .restart local v41    # "items":Landroidx/compose/runtime/collection/MutableVector;
    :cond_1d
    move/from16 v37, v20

    move-object/from16 v20, v13

    move-object/from16 v13, v41

    move/from16 v41, v37

    move-object/from16 v42, v0

    move-object/from16 v55, v3

    move/from16 v37, v5

    move/from16 v39, v8

    move-wide/from16 v44, v10

    move/from16 v48, v12

    move/from16 v10, v23

    const/16 v46, 0x0

    move-object v8, v1

    move-object v11, v4

    move v1, v9

    move-object/from16 v23, v22

    move-object/from16 v22, v2

    move-object v9, v7

    .line 1869
    .end local v0    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .end local v2    # "placeables":Landroidx/collection/MutableIntObjectMap;
    .end local v3    # "endBreakLineList":Landroidx/collection/MutableIntList;
    .end local v4    # "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "i$iv":I
    .end local v7    # "measurables":Ljava/util/List;
    .end local v12    # "startIndex":I
    .end local v41    # "items":Landroidx/compose/runtime/collection/MutableVector;
    .local v1, "mainAxisTotalSize":I
    .local v8, "crossAxisOffsets":[I
    .local v9, "measurables":Ljava/util/List;
    .local v10, "spacing":I
    .restart local v11    # "arrayOfPlaceables":[Landroidx/compose/ui/layout/Placeable;
    .local v13, "items":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v20    # "this_$iv":Landroidx/collection/IntList;
    .local v22, "placeables":Landroidx/collection/MutableIntObjectMap;
    .local v23, "lineInfo":Landroidx/compose/foundation/layout/FlowLineInfo;
    .restart local v39    # "leftOverCrossAxis":I
    .restart local v42    # "crossAxisSizes":Landroidx/collection/MutableIntList;
    .restart local v44    # "measureConstraints":J
    .restart local v48    # "startIndex":I
    .restart local v55    # "endBreakLineList":Landroidx/collection/MutableIntList;
    nop

    .line 1471
    .end local v20    # "this_$iv":Landroidx/collection/IntList;
    .end local v30    # "$i$f$forEachIndexed":I
    .end local v33    # "content$iv":[I
    move-object v0, v13

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 1870
    .local v2, "$i$f$isEmpty":I
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v3

    if-nez v3, :cond_1e

    goto :goto_1c

    :cond_1e
    move/from16 v41, v46

    .line 1471
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "$i$f$isEmpty":I
    :goto_1c
    if-eqz v41, :cond_1f

    .line 1472
    const/4 v0, 0x0

    .line 1473
    .end local v1    # "mainAxisTotalSize":I
    .local v0, "mainAxisTotalSize":I
    const/16 v32, 0x0

    move v3, v0

    move/from16 v4, v32

    goto :goto_1d

    .line 1471
    .end local v0    # "mainAxisTotalSize":I
    .restart local v1    # "mainAxisTotalSize":I
    :cond_1f
    move v3, v1

    move/from16 v4, v32

    .line 1476
    .end local v1    # "mainAxisTotalSize":I
    .end local v32    # "crossAxisTotalSize":I
    .local v3, "mainAxisTotalSize":I
    .local v4, "crossAxisTotalSize":I
    :goto_1d
    nop

    .line 1477
    nop

    .line 1478
    nop

    .line 1479
    nop

    .line 1480
    nop

    .line 1481
    nop

    .line 1482
    nop

    .line 1483
    nop

    .line 1476
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-wide/from16 v1, p5

    move-object v6, v13

    move-object/from16 v5, v21

    .end local v13    # "items":Landroidx/compose/runtime/collection/MutableVector;
    .end local v21    # "crossAxisSizesArray":[I
    .local v5, "crossAxisSizesArray":[I
    .local v6, "items":Landroidx/compose/runtime/collection/MutableVector;
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->placeHelper-BmaY500(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v12

    return-object v12
.end method

.method public static final columnMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 19
    .param p0, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p1, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p2, "maxItemsInMainAxis"    # I
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    .line 515
    move-object/from16 v0, p3

    move/from16 v1, p4

    const v2, -0x77fd7175

    const-string v3, "C(columnMeasurementHelper)P(2)515@20043L880:FlowLayout.kt#2w3rfo"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)"

    invoke-static {v2, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 516
    :cond_0
    const v2, 0x6d8e05da

    const-string v3, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v2, v1, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_1

    .line 517
    move-object/from16 v9, p0

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 516
    :cond_1
    move-object/from16 v9, p0

    .line 517
    :goto_0
    and-int/lit8 v2, v1, 0x6

    if-ne v2, v3, :cond_3

    :cond_2
    move v2, v5

    goto :goto_1

    :cond_3
    move v2, v4

    :goto_1
    and-int/lit8 v3, v1, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v6, 0x20

    if-le v3, v6, :cond_4

    .line 518
    move-object/from16 v8, p1

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    .line 517
    :cond_4
    move-object/from16 v8, p1

    .line 518
    :goto_2
    and-int/lit8 v3, v1, 0x30

    if-ne v3, v6, :cond_6

    :cond_5
    move v3, v5

    goto :goto_3

    :cond_6
    move v3, v4

    :goto_3
    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v6, 0x100

    if-le v3, v6, :cond_7

    .line 519
    move/from16 v13, p2

    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    .line 518
    :cond_7
    move/from16 v13, p2

    .line 519
    :goto_4
    and-int/lit16 v3, v1, 0x180

    if-ne v3, v6, :cond_9

    :cond_8
    move v4, v5

    :cond_9
    or-int/2addr v2, v4

    .line 516
    nop

    .local v2, "invalid$iv":Z
    move-object/from16 v3, p3

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 1715
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1716
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_b

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_a

    goto :goto_5

    .line 1720
    :cond_a
    goto :goto_6

    .line 1717
    :cond_b
    :goto_5
    const/16 v18, 0x0

    .line 525
    .local v18, "$i$a$-cache-FlowLayoutKt$columnMeasurementHelper$1":I
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v10

    .line 526
    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 528
    invoke-interface {v8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v12

    .line 531
    sget-object v6, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getVisible()Landroidx/compose/foundation/layout/FlowRowOverflow;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/FlowRowOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v15

    .line 522
    new-instance v6, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 523
    nop

    .line 527
    nop

    .line 524
    nop

    .line 525
    nop

    .line 526
    nop

    .line 528
    nop

    .line 529
    nop

    .line 530
    nop

    .line 531
    nop

    .line 522
    const/4 v7, 0x0

    const v14, 0x7fffffff

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v16}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 521
    nop

    .line 533
    .local v6, "measurePolicy":Landroidx/compose/foundation/layout/FlowMeasurePolicy;
    new-instance v7, Landroidx/compose/foundation/layout/FlowLayoutKt$columnMeasurementHelper$1$1;

    invoke-direct {v7, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt$columnMeasurementHelper$1$1;-><init>(Landroidx/compose/foundation/layout/FlowMeasurePolicy;)V

    check-cast v7, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 535
    nop

    .line 1717
    .end local v6    # "measurePolicy":Landroidx/compose/foundation/layout/FlowMeasurePolicy;
    .end local v18    # "$i$a$-cache-FlowLayoutKt$columnMeasurementHelper$1":I
    nop

    .line 1718
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1719
    move-object v5, v7

    .line 1715
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_6
    nop

    .line 516
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v5, Landroidx/compose/ui/layout/MeasurePolicy;

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 515
    :cond_c
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 516
    return-object v5
.end method

.method public static final columnMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .locals 21
    .param p0, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p1, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p2, "itemHorizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p3, "maxItemsInMainAxis"    # I
    .param p4, "maxLines"    # I
    .param p5, "overflowState"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I

    .line 547
    move-object/from16 v0, p2

    move-object/from16 v1, p6

    move/from16 v2, p7

    const v3, -0x126568c7

    const-string v4, "C(columnMeasurementMultiContentHelper)P(5)547@21271L713:FlowLayout.kt#2w3rfo"

    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)"

    invoke-static {v3, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 548
    :cond_0
    const v3, 0x1125edd3

    const-string v4, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v3, v4, :cond_1

    .line 549
    move-object/from16 v10, p0

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 548
    :cond_1
    move-object/from16 v10, p0

    .line 549
    :goto_0
    and-int/lit8 v3, v2, 0x6

    if-ne v3, v4, :cond_3

    :cond_2
    move v3, v6

    goto :goto_1

    :cond_3
    move v3, v5

    :goto_1
    and-int/lit8 v4, v2, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v7, 0x20

    if-le v4, v7, :cond_4

    .line 550
    move-object/from16 v9, p1

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    .line 549
    :cond_4
    move-object/from16 v9, p1

    .line 550
    :goto_2
    and-int/lit8 v4, v2, 0x30

    if-ne v4, v7, :cond_6

    :cond_5
    move v4, v6

    goto :goto_3

    :cond_6
    move v4, v5

    :goto_3
    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v7, 0x100

    if-le v4, v7, :cond_7

    .line 551
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    and-int/lit16 v4, v2, 0x180

    if-ne v4, v7, :cond_9

    :cond_8
    move v4, v6

    goto :goto_4

    :cond_9
    move v4, v5

    :goto_4
    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    const/16 v7, 0x800

    if-le v4, v7, :cond_a

    .line 552
    move/from16 v14, p3

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_5

    .line 551
    :cond_a
    move/from16 v14, p3

    .line 552
    :goto_5
    and-int/lit16 v4, v2, 0xc00

    if-ne v4, v7, :cond_c

    :cond_b
    move v4, v6

    goto :goto_6

    :cond_c
    move v4, v5

    :goto_6
    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v4, v2

    xor-int/lit16 v4, v4, 0x6000

    const/16 v7, 0x4000

    if-le v4, v7, :cond_d

    .line 553
    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_7

    .line 552
    :cond_d
    move/from16 v15, p4

    .line 553
    :goto_7
    and-int/lit16 v4, v2, 0x6000

    if-ne v4, v7, :cond_f

    :cond_e
    move v5, v6

    :cond_f
    or-int/2addr v3, v5

    .line 554
    move-object/from16 v4, p5

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 548
    nop

    .local v3, "invalid$iv":Z
    move-object/from16 v5, p6

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 1721
    .local v6, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1722
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_11

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_10

    goto :goto_8

    .line 1726
    :cond_10
    goto :goto_9

    .line 1723
    :cond_11
    :goto_8
    const/16 v19, 0x0

    .line 559
    .local v19, "$i$a$-cache-FlowLayoutKt$columnMeasurementMultiContentHelper$1":I
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v11

    .line 560
    sget-object v8, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    invoke-virtual {v8, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->horizontal$foundation_layout_release(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    move-result-object v12

    .line 562
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v13

    .line 556
    move-object v8, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .local v8, "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 557
    nop

    .line 561
    nop

    .line 558
    nop

    .line 559
    nop

    .line 560
    nop

    .line 562
    nop

    .line 563
    nop

    .line 564
    nop

    .line 565
    nop

    .line 556
    move-object/from16 v16, v8

    .end local v8    # "it$iv":Ljava/lang/Object;
    .local v16, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    const/16 v17, 0x0

    move-object/from16 v20, v16

    move-object/from16 v16, v4

    move-object/from16 v4, v20

    .end local v16    # "it$iv":Ljava/lang/Object;
    .local v4, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v7 .. v17}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 566
    nop

    .line 1723
    .end local v19    # "$i$a$-cache-FlowLayoutKt$columnMeasurementMultiContentHelper$1":I
    nop

    .line 1724
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1725
    nop

    .line 1721
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_9
    nop

    .line 548
    .end local v3    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    check-cast v7, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 547
    :cond_12
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v7, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    .line 548
    return-object v7
.end method

.method public static final crossAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I
    .locals 1
    .param p0, "$this$crossAxisMin"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p1, "isHorizontal"    # Z
    .param p2, "mainAxisSize"    # I

    .line 1507
    if-eqz p1, :cond_0

    .line 1508
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result v0

    goto :goto_0

    .line 1510
    :cond_0
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result v0

    .line 1511
    :goto_0
    return v0
.end method

.method public static final getCROSS_AXIS_ALIGNMENT_START()Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .locals 1

    .line 1514
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    return-object v0
.end method

.method public static final getCROSS_AXIS_ALIGNMENT_TOP()Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .locals 1

    .line 1513
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    return-object v0
.end method

.method private static final intrinsicCrossAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J
    .locals 30
    .param p0, "children"    # Ljava/util/List;
    .param p1, "mainAxisSize"    # Lkotlin/jvm/functions/Function3;
    .param p2, "crossAxisSize"    # Lkotlin/jvm/functions/Function3;
    .param p3, "mainAxisAvailable"    # I
    .param p4, "mainAxisSpacing"    # I
    .param p5, "crossAxisSpacing"    # I
    .param p6, "maxItemsInMainAxis"    # I
    .param p7, "maxLines"    # I
    .param p8, "overflow"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;IIIII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")J"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    .line 1107
    .local v3, "$i$f$intrinsicCrossAxisSize":I
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    .line 1126
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 1107
    if-eqz v4, :cond_0

    .line 1108
    invoke-static {v5, v5}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v4

    return-wide v4

    .line 1117
    :cond_0
    nop

    .line 1118
    nop

    .line 1119
    nop

    .line 1120
    nop

    .line 1116
    const v4, 0x7fffffff

    move/from16 v7, p3

    invoke-static {v5, v7, v5, v4}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    move-result-wide v11

    .line 1111
    new-instance v8, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;

    .line 1112
    nop

    .line 1113
    nop

    .line 1116
    nop

    .line 1114
    nop

    .line 1122
    nop

    .line 1123
    nop

    .line 1111
    const/16 v16, 0x0

    move/from16 v14, p4

    move/from16 v15, p5

    move/from16 v9, p6

    move/from16 v13, p7

    move-object/from16 v10, p8

    invoke-direct/range {v8 .. v16}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;-><init>(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1110
    move-object v9, v8

    .line 1125
    .local v9, "buildingBlocks":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 1126
    .local v8, "nextChild":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    if-eqz v8, :cond_1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v2, v8, v6, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    goto :goto_0

    :cond_1
    move v10, v5

    .line 1127
    .local v10, "nextCrossAxisSize":I
    :goto_0
    if-eqz v8, :cond_2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v1, v8, v6, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    goto :goto_1

    :cond_2
    move v6, v5

    .line 1129
    .local v6, "nextMainAxisSize":I
    :goto_1
    move/from16 v11, p3

    .line 1130
    .local v11, "remaining":I
    const/16 v17, 0x0

    .line 1131
    .local v17, "currentCrossAxisSize":I
    const/16 v16, 0x0

    .line 1132
    .local v16, "totalCrossAxisSize":I
    const/16 v20, 0x0

    .line 1133
    .local v20, "lastBreak":I
    const/4 v15, 0x0

    .line 1136
    .local v15, "lineIndex":I
    nop

    .line 1137
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x1

    if-le v12, v13, :cond_3

    move v12, v13

    goto :goto_2

    :cond_3
    move v12, v5

    .line 1138
    :goto_2
    nop

    .line 1139
    move v14, v12

    move/from16 v18, v13

    invoke-static {v11, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v12

    .line 1141
    const/16 v21, 0x0

    if-nez v8, :cond_4

    move-object/from16 v19, v21

    goto :goto_3

    :cond_4
    invoke-static {v6, v10}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v19

    .line 1142
    :goto_3
    nop

    .line 1143
    nop

    .line 1144
    nop

    .line 1145
    nop

    .line 1146
    nop

    .line 1136
    move/from16 v22, v11

    .end local v11    # "remaining":I
    .local v22, "remaining":I
    const/4 v11, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v24, v10

    move v10, v14

    move-object/from16 v14, v19

    .end local v10    # "nextCrossAxisSize":I
    .local v24, "nextCrossAxisSize":I
    const/16 v19, 0x0

    invoke-virtual/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v10

    .line 1135
    nop

    .line 1149
    .local v10, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v11

    if-eqz v11, :cond_7

    .line 1151
    nop

    .line 1153
    if-eqz v8, :cond_5

    move/from16 v13, v23

    goto :goto_4

    :cond_5
    move v13, v5

    .line 1154
    :goto_4
    nop

    .line 1155
    nop

    .line 1152
    move-object/from16 v11, p8

    invoke-virtual {v11, v13, v5, v5}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->ellipsisSize-F35zm-w$foundation_layout_release(ZII)Landroidx/collection/IntIntPair;

    move-result-object v4

    .line 1157
    if-eqz v4, :cond_6

    .line 1152
    invoke-virtual {v4}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v4

    .line 1157
    invoke-static {v4, v5}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v5

    .line 1151
    nop

    :cond_6
    nop

    .line 1150
    nop

    .line 1158
    .local v5, "size":I
    const/4 v4, 0x0

    .line 1159
    .local v4, "noOfItemsShown":I
    invoke-static {v5, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v12

    return-wide v12

    .line 1162
    .end local v4    # "noOfItemsShown":I
    .end local v5    # "size":I
    :cond_7
    move-object/from16 v11, p8

    const/4 v12, 0x0

    .line 1163
    .local v12, "noOfItemsShown":I
    const/4 v13, 0x0

    .local v13, "index":I
    move-object v14, v0

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    move/from16 v5, v17

    move/from16 v25, v20

    move-object/from16 v20, v10

    move/from16 v10, v24

    .end local v17    # "currentCrossAxisSize":I
    .end local v24    # "nextCrossAxisSize":I
    .local v5, "currentCrossAxisSize":I
    .local v10, "nextCrossAxisSize":I
    .local v20, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v25, "lastBreak":I
    :goto_5
    if-ge v13, v14, :cond_11

    .line 1164
    move/from16 v26, v10

    .line 1165
    .local v26, "childCrossAxisSize":I
    move/from16 v27, v6

    .line 1166
    .local v27, "childMainAxisSize":I
    sub-int v4, v22, v27

    .line 1167
    .end local v22    # "remaining":I
    .local v4, "remaining":I
    add-int/lit8 v22, v13, 0x1

    .line 1168
    .end local v12    # "noOfItemsShown":I
    .local v22, "noOfItemsShown":I
    move/from16 v12, v26

    .end local v26    # "childCrossAxisSize":I
    .local v12, "childCrossAxisSize":I
    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v17

    .line 1171
    .end local v5    # "currentCrossAxisSize":I
    .restart local v17    # "currentCrossAxisSize":I
    add-int/lit8 v5, v13, 0x1

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 1172
    if-eqz v8, :cond_8

    add-int/lit8 v5, v13, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v8, v5, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    .line 1174
    .end local v10    # "nextCrossAxisSize":I
    .local v0, "nextCrossAxisSize":I
    :goto_6
    if-eqz v8, :cond_9

    add-int/lit8 v5, v13, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v1, v8, v5, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    add-int v5, v5, p4

    goto :goto_7

    :cond_9
    const/4 v5, 0x0

    .line 1173
    :goto_7
    nop

    .line 1177
    .end local v6    # "nextMainAxisSize":I
    .local v5, "nextMainAxisSize":I
    nop

    .line 1178
    add-int/lit8 v6, v13, 0x2

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v10

    if-ge v6, v10, :cond_a

    move/from16 v10, v23

    goto :goto_8

    :cond_a
    const/4 v10, 0x0

    .line 1179
    :goto_8
    add-int/lit8 v6, v13, 0x1

    sub-int v6, v6, v25

    .line 1180
    move/from16 v19, v12

    move/from16 v18, v13

    const v1, 0x7fffffff

    .end local v12    # "childCrossAxisSize":I
    .end local v13    # "index":I
    .local v18, "index":I
    .local v19, "childCrossAxisSize":I
    invoke-static {v4, v1}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v12

    .line 1182
    if-nez v8, :cond_b

    .line 1183
    move-object/from16 v26, v21

    goto :goto_9

    .line 1185
    :cond_b
    invoke-static {v5, v0}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v28

    invoke-static/range {v28 .. v29}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v26

    .line 1187
    :goto_9
    nop

    .line 1188
    nop

    .line 1189
    nop

    .line 1190
    nop

    .line 1191
    nop

    .line 1177
    move/from16 v28, v18

    .end local v18    # "index":I
    .local v28, "index":I
    const/16 v18, 0x0

    move/from16 v29, v19

    .end local v19    # "childCrossAxisSize":I
    .local v29, "childCrossAxisSize":I
    const/16 v19, 0x0

    move-object/from16 v11, v26

    move/from16 v26, v14

    move-object v14, v11

    move v11, v6

    invoke-virtual/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v10

    .line 1176
    move v12, v15

    .line 1193
    .end local v15    # "lineIndex":I
    .end local v20    # "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v10, "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v12, "lineIndex":I
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInLine()Z

    move-result v6

    if-eqz v6, :cond_10

    .line 1194
    add-int v6, v17, p5

    add-int v13, v16, v6

    .line 1197
    .end local v16    # "totalCrossAxisSize":I
    .local v13, "totalCrossAxisSize":I
    nop

    .line 1198
    if-eqz v8, :cond_c

    move/from16 v11, v23

    goto :goto_a

    :cond_c
    const/4 v11, 0x0

    .line 1199
    :goto_a
    nop

    .line 1200
    nop

    .line 1201
    nop

    .line 1202
    add-int/lit8 v6, v28, 0x1

    sub-int v15, v6, v25

    .line 1196
    nop

    .line 1197
    nop

    .line 1198
    nop

    .line 1200
    nop

    .line 1201
    nop

    .line 1199
    nop

    .line 1202
    nop

    .line 1196
    move v14, v4

    .end local v4    # "remaining":I
    .local v14, "remaining":I
    invoke-virtual/range {v9 .. v15}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    move-result-object v4

    .line 1195
    move v15, v12

    .line 1204
    .end local v12    # "lineIndex":I
    .local v4, "ellipsisWrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    .restart local v15    # "lineIndex":I
    const/4 v6, 0x0

    .line 1205
    .end local v17    # "currentCrossAxisSize":I
    .local v6, "currentCrossAxisSize":I
    move/from16 v11, p3

    .line 1206
    .end local v14    # "remaining":I
    .restart local v11    # "remaining":I
    add-int/lit8 v25, v28, 0x1

    .line 1207
    sub-int v5, v5, p4

    .line 1208
    add-int/lit8 v15, v15, 0x1

    .line 1209
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v12

    if-eqz v12, :cond_f

    .line 1210
    if-eqz v4, :cond_e

    invoke-virtual {v4}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    move-result-wide v16

    .local v16, "it":J
    const/4 v1, 0x0

    .line 1211
    .local v1, "$i$a$-let-FlowLayoutKt$intrinsicCrossAxisSize$3":I
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceEllipsisOnLastContentLine()Z

    move-result v12

    if-nez v12, :cond_d

    .line 1212
    invoke-static/range {v16 .. v17}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v12

    add-int v12, v12, p5

    add-int/2addr v13, v12

    .line 1214
    :cond_d
    nop

    .line 1210
    .end local v1    # "$i$a$-let-FlowLayoutKt$intrinsicCrossAxisSize$3":I
    .end local v16    # "it":J
    nop

    :cond_e
    move/from16 v16, v13

    .line 1215
    .end local v13    # "totalCrossAxisSize":I
    .local v16, "totalCrossAxisSize":I
    move v12, v6

    move v6, v5

    move v5, v12

    move-object/from16 v20, v10

    move/from16 v12, v22

    move v10, v0

    move/from16 v22, v11

    goto :goto_c

    .line 1209
    .end local v16    # "totalCrossAxisSize":I
    .restart local v13    # "totalCrossAxisSize":I
    :cond_f
    move/from16 v16, v6

    move v6, v5

    move/from16 v5, v16

    move/from16 v16, v13

    goto :goto_b

    .line 1193
    .end local v6    # "currentCrossAxisSize":I
    .end local v11    # "remaining":I
    .end local v13    # "totalCrossAxisSize":I
    .end local v15    # "lineIndex":I
    .local v4, "remaining":I
    .restart local v12    # "lineIndex":I
    .restart local v16    # "totalCrossAxisSize":I
    .restart local v17    # "currentCrossAxisSize":I
    :cond_10
    move v14, v4

    move v15, v12

    .end local v4    # "remaining":I
    .end local v12    # "lineIndex":I
    .restart local v14    # "remaining":I
    .restart local v15    # "lineIndex":I
    move v6, v5

    move v11, v14

    move/from16 v5, v17

    .line 1163
    .end local v14    # "remaining":I
    .end local v17    # "currentCrossAxisSize":I
    .end local v27    # "childMainAxisSize":I
    .end local v29    # "childCrossAxisSize":I
    .local v5, "currentCrossAxisSize":I
    .local v6, "nextMainAxisSize":I
    .restart local v11    # "remaining":I
    :goto_b
    add-int/lit8 v13, v28, 0x1

    move v4, v1

    move-object/from16 v20, v10

    move/from16 v12, v22

    move/from16 v14, v26

    move-object/from16 v1, p1

    move v10, v0

    move/from16 v22, v11

    move-object/from16 v0, p0

    move-object/from16 v11, p8

    .end local v28    # "index":I
    .local v13, "index":I
    goto/16 :goto_5

    .end local v0    # "nextCrossAxisSize":I
    .end local v11    # "remaining":I
    .local v10, "nextCrossAxisSize":I
    .local v12, "noOfItemsShown":I
    .restart local v20    # "wrapInfo":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v22, "remaining":I
    :cond_11
    move/from16 v28, v13

    .line 1220
    .end local v13    # "index":I
    :goto_c
    sub-int v0, v16, p5

    .line 1221
    .end local v16    # "totalCrossAxisSize":I
    .local v0, "totalCrossAxisSize":I
    invoke-static {v0, v12}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v13

    return-wide v13
.end method

.method private static final intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J
    .locals 30
    .param p0, "children"    # Ljava/util/List;
    .param p1, "mainAxisSizes"    # [I
    .param p2, "crossAxisSizes"    # [I
    .param p3, "mainAxisAvailable"    # I
    .param p4, "mainAxisSpacing"    # I
    .param p5, "crossAxisSpacing"    # I
    .param p6, "maxItemsInMainAxis"    # I
    .param p7, "maxLines"    # I
    .param p8, "overflow"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;[I[IIIIII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")J"
        }
    .end annotation

    .line 1079
    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 1734
    .local v1, "$i$f$intrinsicCrossAxisSize":I
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 1735
    invoke-static {v3, v3}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v2

    move/from16 v4, p3

    goto/16 :goto_d

    .line 1744
    :cond_0
    nop

    .line 1745
    nop

    .line 1746
    nop

    .line 1747
    nop

    .line 1743
    const v2, 0x7fffffff

    move/from16 v4, p3

    invoke-static {v3, v4, v3, v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    move-result-wide v8

    .line 1738
    new-instance v5, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;

    .line 1739
    nop

    .line 1740
    nop

    .line 1743
    nop

    .line 1741
    nop

    .line 1749
    nop

    .line 1750
    nop

    .line 1738
    const/4 v13, 0x0

    move/from16 v11, p4

    move/from16 v12, p5

    move/from16 v6, p6

    move/from16 v10, p7

    move-object/from16 v7, p8

    invoke-direct/range {v5 .. v13}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;-><init>(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1737
    move-object v6, v5

    .line 1752
    .local v6, "buildingBlocks$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 1753
    .local v5, "nextChild$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    if-eqz v5, :cond_1

    const/4 v7, 0x0

    .local v7, "index":I
    move-object v8, v5

    .local v8, "$this$intrinsicCrossAxisSize_u24lambda_u2413":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v9, 0x0

    .line 1082
    .local v9, "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$2":I
    aget v7, p2, v7

    .line 1753
    .end local v7    # "index":I
    .end local v8    # "$this$intrinsicCrossAxisSize_u24lambda_u2413":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v9    # "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$2":I
    goto :goto_0

    :cond_1
    move v7, v3

    .line 1754
    .local v7, "nextCrossAxisSize$iv":I
    :goto_0
    if-eqz v5, :cond_2

    const/4 v8, 0x0

    .local v8, "index":I
    move-object v9, v5

    .local v9, "$this$intrinsicCrossAxisSize_u24lambda_u2412":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v10, 0x0

    .line 1081
    .local v10, "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$1":I
    aget v8, p1, v8

    .line 1754
    .end local v8    # "index":I
    .end local v9    # "$this$intrinsicCrossAxisSize_u24lambda_u2412":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v10    # "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$1":I
    goto :goto_1

    :cond_2
    move v8, v3

    .line 1756
    .local v8, "nextMainAxisSize$iv":I
    :goto_1
    move/from16 v9, p3

    .line 1757
    .local v9, "remaining$iv":I
    const/4 v14, 0x0

    .line 1758
    .local v14, "currentCrossAxisSize$iv":I
    const/4 v13, 0x0

    .line 1759
    .local v13, "totalCrossAxisSize$iv":I
    const/16 v17, 0x0

    .line 1760
    .local v17, "lastBreak$iv":I
    const/4 v12, 0x0

    .line 1763
    .local v12, "lineIndex$iv":I
    nop

    .line 1764
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x1

    if-le v10, v11, :cond_3

    move v10, v11

    goto :goto_2

    :cond_3
    move v10, v3

    .line 1765
    :goto_2
    nop

    .line 1766
    move v15, v9

    move/from16 v16, v10

    .end local v9    # "remaining$iv":I
    .local v15, "remaining$iv":I
    invoke-static {v15, v2}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v9

    .line 1768
    const/16 v18, 0x0

    if-nez v5, :cond_4

    move-object/from16 v19, v18

    goto :goto_3

    :cond_4
    invoke-static {v8, v7}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v19

    .line 1769
    :goto_3
    nop

    .line 1770
    nop

    .line 1771
    nop

    .line 1772
    nop

    .line 1773
    nop

    .line 1763
    move/from16 v20, v8

    .end local v8    # "nextMainAxisSize$iv":I
    .local v20, "nextMainAxisSize$iv":I
    const/4 v8, 0x0

    move/from16 v21, v15

    .end local v15    # "remaining$iv":I
    .local v21, "remaining$iv":I
    const/4 v15, 0x0

    move/from16 v22, v7

    move/from16 v7, v16

    .end local v7    # "nextCrossAxisSize$iv":I
    .local v22, "nextCrossAxisSize$iv":I
    const/16 v16, 0x0

    move-object/from16 v29, v19

    move/from16 v19, v11

    move-object/from16 v11, v29

    invoke-virtual/range {v6 .. v16}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v7

    .line 1762
    nop

    .line 1776
    .local v7, "wrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v8

    if-eqz v8, :cond_7

    .line 1778
    nop

    .line 1780
    if-eqz v5, :cond_5

    move/from16 v11, v19

    goto :goto_4

    :cond_5
    move v11, v3

    .line 1781
    :goto_4
    nop

    .line 1782
    nop

    .line 1779
    move-object/from16 v8, p8

    invoke-virtual {v8, v11, v3, v3}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->ellipsisSize-F35zm-w$foundation_layout_release(ZII)Landroidx/collection/IntIntPair;

    move-result-object v2

    .line 1784
    if-eqz v2, :cond_6

    .line 1779
    invoke-virtual {v2}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v2

    .line 1784
    invoke-static {v2, v3}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v3

    .line 1778
    nop

    :cond_6
    nop

    .line 1777
    nop

    .line 1785
    .local v3, "size$iv":I
    const/4 v2, 0x0

    .line 1786
    .local v2, "noOfItemsShown$iv":I
    invoke-static {v3, v2}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v9

    move-wide v2, v9

    goto/16 :goto_d

    .line 1789
    .end local v2    # "noOfItemsShown$iv":I
    .end local v3    # "size$iv":I
    :cond_7
    move-object/from16 v8, p8

    const/4 v9, 0x0

    .line 1790
    .local v9, "noOfItemsShown$iv":I
    const/4 v10, 0x0

    .local v10, "index$iv":I
    move-object v11, v0

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11

    move v15, v14

    move v14, v13

    move v13, v12

    move v12, v10

    move v10, v9

    move/from16 v9, v21

    move/from16 v21, v17

    move-object/from16 v17, v7

    move/from16 v7, v22

    .end local v22    # "nextCrossAxisSize$iv":I
    .local v7, "nextCrossAxisSize$iv":I
    .local v9, "remaining$iv":I
    .local v10, "noOfItemsShown$iv":I
    .local v12, "index$iv":I
    .local v13, "lineIndex$iv":I
    .local v14, "totalCrossAxisSize$iv":I
    .local v15, "currentCrossAxisSize$iv":I
    .local v17, "wrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v21, "lastBreak$iv":I
    :goto_5
    if-ge v12, v11, :cond_11

    .line 1791
    move/from16 v22, v7

    .line 1792
    .local v22, "childCrossAxisSize$iv":I
    move/from16 v23, v20

    .line 1793
    .local v23, "childMainAxisSize$iv":I
    sub-int v9, v9, v23

    .line 1794
    add-int/lit8 v24, v12, 0x1

    .line 1795
    .end local v10    # "noOfItemsShown$iv":I
    .local v24, "noOfItemsShown$iv":I
    move/from16 v16, v12

    move v12, v13

    move v13, v14

    move/from16 v10, v22

    .end local v14    # "totalCrossAxisSize$iv":I
    .end local v22    # "childCrossAxisSize$iv":I
    .local v10, "childCrossAxisSize$iv":I
    .local v12, "lineIndex$iv":I
    .local v13, "totalCrossAxisSize$iv":I
    .local v16, "index$iv":I
    invoke-static {v15, v10}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 1798
    .end local v15    # "currentCrossAxisSize$iv":I
    .local v14, "currentCrossAxisSize$iv":I
    add-int/lit8 v15, v16, 0x1

    invoke-static {v0, v15}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v15

    move-object v5, v15

    check-cast v5, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 1799
    if-eqz v5, :cond_8

    add-int/lit8 v15, v16, 0x1

    .local v15, "index":I
    move-object/from16 v22, v5

    .local v22, "$this$intrinsicCrossAxisSize_u24lambda_u2413":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v25, 0x0

    .line 1082
    .local v25, "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$2":I
    aget v15, p2, v15

    .line 1799
    .end local v15    # "index":I
    .end local v22    # "$this$intrinsicCrossAxisSize_u24lambda_u2413":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v25    # "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$2":I
    goto :goto_6

    :cond_8
    move v15, v3

    :goto_6
    move v7, v15

    .line 1801
    if-eqz v5, :cond_9

    add-int/lit8 v15, v16, 0x1

    .restart local v15    # "index":I
    move-object/from16 v22, v5

    .local v22, "$this$intrinsicCrossAxisSize_u24lambda_u2412":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v25, 0x0

    .line 1081
    .local v25, "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$1":I
    aget v15, p1, v15

    .line 1801
    .end local v15    # "index":I
    .end local v22    # "$this$intrinsicCrossAxisSize_u24lambda_u2412":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v25    # "$i$a$-intrinsicCrossAxisSize-FlowLayoutKt$intrinsicCrossAxisSize$1":I
    add-int v15, v15, p4

    goto :goto_7

    :cond_9
    move v15, v3

    .line 1800
    :goto_7
    nop

    .line 1804
    .end local v20    # "nextMainAxisSize$iv":I
    .local v15, "nextMainAxisSize$iv":I
    nop

    .line 1805
    add-int/lit8 v3, v16, 0x2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_a

    move/from16 v2, v19

    goto :goto_8

    :cond_a
    const/4 v2, 0x0

    .line 1806
    :goto_8
    add-int/lit8 v3, v16, 0x1

    sub-int v3, v3, v21

    .line 1807
    move/from16 v25, v1

    move v1, v9

    move/from16 v20, v10

    const v0, 0x7fffffff

    .end local v9    # "remaining$iv":I
    .end local v10    # "childCrossAxisSize$iv":I
    .local v1, "remaining$iv":I
    .local v20, "childCrossAxisSize$iv":I
    .local v25, "$i$f$intrinsicCrossAxisSize":I
    invoke-static {v1, v0}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v9

    .line 1809
    if-nez v5, :cond_b

    .line 1810
    move-object/from16 v26, v18

    goto :goto_9

    .line 1812
    :cond_b
    invoke-static {v15, v7}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v26

    .line 1814
    :goto_9
    nop

    .line 1815
    nop

    .line 1816
    nop

    .line 1817
    nop

    .line 1818
    nop

    .line 1804
    move/from16 v27, v15

    .end local v15    # "nextMainAxisSize$iv":I
    .local v27, "nextMainAxisSize$iv":I
    const/4 v15, 0x0

    move/from16 v28, v16

    .end local v16    # "index$iv":I
    .local v28, "index$iv":I
    const/16 v16, 0x0

    move v8, v3

    move v3, v7

    move v7, v2

    move v2, v1

    move v1, v11

    move-object/from16 v11, v26

    .end local v1    # "remaining$iv":I
    .end local v7    # "nextCrossAxisSize$iv":I
    .local v2, "remaining$iv":I
    .local v3, "nextCrossAxisSize$iv":I
    invoke-virtual/range {v6 .. v16}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v7

    .line 1803
    nop

    .line 1820
    .end local v17    # "wrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .local v7, "wrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInLine()Z

    move-result v8

    if-eqz v8, :cond_10

    .line 1821
    add-int v8, v14, p5

    add-int v10, v13, v8

    .line 1824
    .end local v13    # "totalCrossAxisSize$iv":I
    .local v10, "totalCrossAxisSize$iv":I
    nop

    .line 1825
    if-eqz v5, :cond_c

    move/from16 v8, v19

    goto :goto_a

    :cond_c
    const/4 v8, 0x0

    .line 1826
    :goto_a
    nop

    .line 1827
    nop

    .line 1828
    nop

    .line 1829
    add-int/lit8 v9, v28, 0x1

    sub-int v9, v9, v21

    .line 1823
    nop

    .line 1824
    nop

    .line 1825
    nop

    .line 1827
    nop

    .line 1828
    nop

    .line 1826
    nop

    .line 1829
    nop

    .line 1823
    move v11, v12

    move v12, v9

    move v9, v11

    move v11, v2

    .end local v2    # "remaining$iv":I
    .end local v12    # "lineIndex$iv":I
    .local v9, "lineIndex$iv":I
    .local v11, "remaining$iv":I
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    move-result-object v2

    .line 1822
    move v12, v9

    .line 1831
    .end local v9    # "lineIndex$iv":I
    .local v2, "ellipsisWrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    .restart local v12    # "lineIndex$iv":I
    const/4 v15, 0x0

    .line 1832
    .end local v14    # "currentCrossAxisSize$iv":I
    .local v15, "currentCrossAxisSize$iv":I
    move/from16 v9, p3

    .line 1833
    .end local v11    # "remaining$iv":I
    .local v9, "remaining$iv":I
    add-int/lit8 v21, v28, 0x1

    .line 1834
    sub-int v8, v27, p4

    .line 1835
    .end local v27    # "nextMainAxisSize$iv":I
    .restart local v8    # "nextMainAxisSize$iv":I
    add-int/lit8 v13, v12, 0x1

    .line 1836
    .end local v12    # "lineIndex$iv":I
    .local v13, "lineIndex$iv":I
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v11

    if-eqz v11, :cond_f

    .line 1837
    if-eqz v2, :cond_e

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    move-result-wide v0

    .local v0, "it$iv":J
    const/4 v11, 0x0

    .line 1838
    .local v11, "$i$a$-let-FlowLayoutKt$intrinsicCrossAxisSize$3$iv":I
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceEllipsisOnLastContentLine()Z

    move-result v12

    if-nez v12, :cond_d

    .line 1839
    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v12

    add-int v12, v12, p5

    add-int/2addr v10, v12

    .line 1841
    :cond_d
    nop

    .line 1837
    .end local v0    # "it$iv":J
    .end local v11    # "$i$a$-let-FlowLayoutKt$intrinsicCrossAxisSize$3$iv":I
    nop

    :cond_e
    move v14, v10

    .line 1842
    .end local v10    # "totalCrossAxisSize$iv":I
    .local v14, "totalCrossAxisSize$iv":I
    move-object/from16 v17, v7

    move/from16 v20, v8

    move/from16 v10, v24

    move v7, v3

    goto :goto_c

    .line 1836
    .end local v14    # "totalCrossAxisSize$iv":I
    .restart local v10    # "totalCrossAxisSize$iv":I
    :cond_f
    move/from16 v20, v8

    move v14, v10

    goto :goto_b

    .line 1820
    .end local v8    # "nextMainAxisSize$iv":I
    .end local v9    # "remaining$iv":I
    .end local v10    # "totalCrossAxisSize$iv":I
    .end local v15    # "currentCrossAxisSize$iv":I
    .local v2, "remaining$iv":I
    .restart local v12    # "lineIndex$iv":I
    .local v13, "totalCrossAxisSize$iv":I
    .local v14, "currentCrossAxisSize$iv":I
    .restart local v27    # "nextMainAxisSize$iv":I
    :cond_10
    move v11, v2

    .end local v2    # "remaining$iv":I
    .local v11, "remaining$iv":I
    move v9, v11

    move v15, v14

    move/from16 v20, v27

    move v14, v13

    move v13, v12

    .line 1790
    .end local v11    # "remaining$iv":I
    .end local v12    # "lineIndex$iv":I
    .end local v23    # "childMainAxisSize$iv":I
    .end local v27    # "nextMainAxisSize$iv":I
    .restart local v9    # "remaining$iv":I
    .local v13, "lineIndex$iv":I
    .local v14, "totalCrossAxisSize$iv":I
    .restart local v15    # "currentCrossAxisSize$iv":I
    .local v20, "nextMainAxisSize$iv":I
    :goto_b
    add-int/lit8 v12, v28, 0x1

    move-object/from16 v8, p8

    move v2, v0

    move v11, v1

    move-object/from16 v17, v7

    move/from16 v10, v24

    move/from16 v1, v25

    move-object/from16 v0, p0

    move v7, v3

    const/4 v3, 0x0

    .end local v28    # "index$iv":I
    .local v12, "index$iv":I
    goto/16 :goto_5

    .end local v3    # "nextCrossAxisSize$iv":I
    .end local v24    # "noOfItemsShown$iv":I
    .end local v25    # "$i$f$intrinsicCrossAxisSize":I
    .local v1, "$i$f$intrinsicCrossAxisSize":I
    .local v7, "nextCrossAxisSize$iv":I
    .local v10, "noOfItemsShown$iv":I
    .restart local v17    # "wrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    :cond_11
    move/from16 v25, v1

    move/from16 v28, v12

    move v12, v13

    move v13, v14

    .end local v1    # "$i$f$intrinsicCrossAxisSize":I
    .end local v14    # "totalCrossAxisSize$iv":I
    .local v12, "lineIndex$iv":I
    .local v13, "totalCrossAxisSize$iv":I
    .restart local v25    # "$i$f$intrinsicCrossAxisSize":I
    .restart local v28    # "index$iv":I
    move v13, v12

    .line 1847
    .end local v12    # "lineIndex$iv":I
    .end local v28    # "index$iv":I
    .local v13, "lineIndex$iv":I
    .restart local v14    # "totalCrossAxisSize$iv":I
    :goto_c
    sub-int v14, v14, p5

    .line 1848
    invoke-static {v14, v10}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v2

    .line 1079
    .end local v5    # "nextChild$iv":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v6    # "buildingBlocks$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;
    .end local v7    # "nextCrossAxisSize$iv":I
    .end local v9    # "remaining$iv":I
    .end local v10    # "noOfItemsShown$iv":I
    .end local v13    # "lineIndex$iv":I
    .end local v14    # "totalCrossAxisSize$iv":I
    .end local v15    # "currentCrossAxisSize$iv":I
    .end local v17    # "wrapInfo$iv":Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;
    .end local v20    # "nextMainAxisSize$iv":I
    .end local v21    # "lastBreak$iv":I
    .end local v25    # "$i$f$intrinsicCrossAxisSize":I
    :goto_d
    return-wide v2
.end method

.method public static final mainAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I
    .locals 1
    .param p0, "$this$mainAxisMin"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p1, "isHorizontal"    # Z
    .param p2, "crossAxisSize"    # I

    .line 1500
    if-eqz p1, :cond_0

    .line 1501
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result v0

    goto :goto_0

    .line 1503
    :cond_0
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result v0

    .line 1504
    :goto_0
    return v0
.end method

.method private static final maxIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I
    .locals 17
    .param p0, "children"    # Ljava/util/List;
    .param p1, "mainAxisSize"    # Lkotlin/jvm/functions/Function3;
    .param p2, "crossAxisAvailable"    # I
    .param p3, "mainAxisSpacing"    # I
    .param p4, "maxItemsInMainAxis"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;III)I"
        }
    .end annotation

    const/4 v0, 0x0

    .line 954
    .local v0, "$i$f$maxIntrinsicMainAxisSize":I
    const/4 v1, 0x0

    .line 955
    .local v1, "fixedSpace":I
    const/4 v2, 0x0

    .line 956
    .local v2, "currentFixedSpace":I
    const/4 v3, 0x0

    .line 957
    .local v3, "lastBreak":I
    move-object/from16 v4, p0

    .local v4, "$this$fastForEachIndexed$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1727
    .local v5, "$i$f$fastForEachIndexed":I
    nop

    .line 1728
    const/4 v6, 0x0

    .local v6, "index$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_2

    .line 1729
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1730
    .local v8, "item$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v9, "child":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    move v10, v6

    .local v10, "index":I
    const/4 v11, 0x0

    .line 958
    .local v11, "$i$a$-fastForEachIndexed-FlowLayoutKt$maxIntrinsicMainAxisSize$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v14, p1

    invoke-interface {v14, v9, v12, v13}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    add-int v12, v12, p3

    .line 959
    .local v12, "size":I
    add-int/lit8 v13, v10, 0x1

    sub-int/2addr v13, v3

    move/from16 v15, p4

    if-eq v13, v15, :cond_1

    add-int/lit8 v13, v10, 0x1

    move/from16 v16, v0

    .end local v0    # "$i$f$maxIntrinsicMainAxisSize":I
    .local v16, "$i$f$maxIntrinsicMainAxisSize":I
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v13, v0, :cond_0

    goto :goto_1

    .line 966
    :cond_0
    add-int/2addr v2, v12

    goto :goto_2

    .line 959
    .end local v16    # "$i$f$maxIntrinsicMainAxisSize":I
    .restart local v0    # "$i$f$maxIntrinsicMainAxisSize":I
    :cond_1
    move/from16 v16, v0

    .line 960
    .end local v0    # "$i$f$maxIntrinsicMainAxisSize":I
    .restart local v16    # "$i$f$maxIntrinsicMainAxisSize":I
    :goto_1
    move v0, v10

    .line 961
    .end local v3    # "lastBreak":I
    .local v0, "lastBreak":I
    add-int/2addr v2, v12

    .line 962
    sub-int v2, v2, p3

    .line 963
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 964
    const/4 v2, 0x0

    move v3, v0

    .line 968
    .end local v0    # "lastBreak":I
    .restart local v3    # "lastBreak":I
    :goto_2
    nop

    .line 1730
    .end local v9    # "child":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v10    # "index":I
    .end local v11    # "$i$a$-fastForEachIndexed-FlowLayoutKt$maxIntrinsicMainAxisSize$1":I
    .end local v12    # "size":I
    nop

    .line 1728
    .end local v8    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    move/from16 v0, v16

    goto :goto_0

    .line 1732
    .end local v6    # "index$iv":I
    .end local v16    # "$i$f$maxIntrinsicMainAxisSize":I
    .local v0, "$i$f$maxIntrinsicMainAxisSize":I
    :cond_2
    nop

    .line 969
    .end local v4    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEachIndexed":I
    return v1
.end method

.method public static final measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J
    .locals 5
    .param p0, "$this$measureAndCache_u2drqJ1uqs"    # Landroidx/compose/ui/layout/Measurable;
    .param p1, "measurePolicy"    # Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .param p2, "constraints"    # J
    .param p4, "storePlaceable"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable;",
            "Lkotlin/Unit;",
            ">;)J"
        }
    .end annotation

    .line 1526
    nop

    .line 1527
    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    invoke-static {v0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 1528
    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    invoke-static {v0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/RowColumnParentData;->getFlowLayoutData()Landroidx/compose/foundation/layout/FlowLayoutData;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowLayoutData;->getFillCrossAxisFraction()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    .line 1531
    invoke-interface {p0, p2, p3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1532
    .local v0, "placeable":Landroidx/compose/ui/layout/Placeable;
    move-object v1, p1

    .local v1, "$this$measureAndCache_rqJ1uqs_u24lambda_u2420":Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    const/4 v2, 0x0

    .line 1533
    .local v2, "$i$a$-with-FlowLayoutKt$measureAndCache$1":I
    invoke-interface {v1, v0}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    .line 1534
    .local v3, "mainAxis":I
    invoke-interface {v1, v0}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v4

    .line 1535
    .local v4, "crossAxis":I
    invoke-static {v3, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v1

    .line 1532
    .end local v1    # "$this$measureAndCache_rqJ1uqs_u24lambda_u2420":Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .end local v2    # "$i$a$-with-FlowLayoutKt$measureAndCache$1":I
    .end local v3    # "mainAxis":I
    .end local v4    # "crossAxis":I
    nop

    .end local v0    # "placeable":Landroidx/compose/ui/layout/Placeable;
    goto :goto_2

    .line 1538
    :cond_2
    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    invoke-interface {p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v1

    const v2, 0x7fffffff

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    move-result v0

    .line 1539
    .local v0, "mainAxis":I
    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    invoke-interface {p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v2

    invoke-static {v1, v2, v0}, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    move-result v1

    .line 1540
    .local v1, "crossAxis":I
    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v2

    move-wide v1, v2

    .line 1526
    .end local v0    # "mainAxis":I
    .end local v1    # "crossAxis":I
    :goto_2
    return-wide v1
.end method

.method private static final minIntrinsicMainAxisSize(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I
    .locals 23
    .param p0, "children"    # Ljava/util/List;
    .param p1, "mainAxisSize"    # Lkotlin/jvm/functions/Function3;
    .param p2, "crossAxisSize"    # Lkotlin/jvm/functions/Function3;
    .param p3, "crossAxisAvailable"    # I
    .param p4, "mainAxisSpacing"    # I
    .param p5, "crossAxisSpacing"    # I
    .param p6, "maxItemsInMainAxis"    # I
    .param p7, "maxLines"    # I
    .param p8, "overflow"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;IIIII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")I"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v9, p3

    move/from16 v6, p6

    move/from16 v7, p7

    const/4 v10, 0x0

    .line 989
    .local v10, "$i$f$minIntrinsicMainAxisSize":I
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 990
    return v2

    .line 992
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    .line 993
    .local v1, "mainAxisSizes":[I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [I

    .line 995
    .local v3, "crossAxisSizes":[I
    const/4 v4, 0x0

    .local v4, "index":I
    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_1

    .line 996
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 997
    .local v8, "child":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v13, p1

    invoke-interface {v13, v8, v11, v12}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    .line 998
    .local v11, "mainAxisItemSize":I
    aput v11, v1, v4

    .line 999
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v15, p2

    invoke-interface {v15, v8, v12, v14}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    aput v12, v3, v4

    .line 995
    .end local v8    # "child":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v11    # "mainAxisItemSize":I
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object/from16 v13, p1

    move-object/from16 v15, p2

    .line 1003
    .end local v4    # "index":I
    const v4, 0x7fffffff

    if-eq v7, v4, :cond_2

    if-eq v6, v4, :cond_2

    .line 1004
    mul-int v4, v6, v7

    goto :goto_1

    .line 1006
    :cond_2
    nop

    .line 1003
    :goto_1
    nop

    .line 1002
    nop

    .line 1009
    .local v4, "maxItemsThatCanBeShown":I
    nop

    .line 1010
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v8, 0x1

    if-ge v4, v5, :cond_4

    .line 1011
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    move-result-object v5

    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ExpandIndicator:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    if-eq v5, v11, :cond_3

    .line 1012
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    move-result-object v5

    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ExpandOrCollapseIndicator:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    if-ne v5, v11, :cond_4

    .line 1013
    :cond_3
    move v5, v8

    goto :goto_2

    .line 1014
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-lt v4, v5, :cond_5

    .line 1015
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getMinLinesToShowCollapse$foundation_layout_release()I

    move-result v5

    if-lt v7, v5, :cond_5

    .line 1016
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    move-result-object v5

    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ExpandOrCollapseIndicator:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    if-ne v5, v11, :cond_5

    move v5, v8

    goto :goto_2

    .line 1017
    :cond_5
    move v5, v2

    .line 1009
    :goto_2
    nop

    .line 1008
    move v11, v5

    .line 1019
    .local v11, "mustHaveEllipsis":Z
    if-eqz v11, :cond_6

    move v5, v8

    goto :goto_3

    :cond_6
    move v5, v2

    :goto_3
    sub-int/2addr v4, v5

    .line 1020
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 1021
    .end local v4    # "maxItemsThatCanBeShown":I
    .local v12, "maxItemsThatCanBeShown":I
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->sum([I)I

    move-result v4

    .line 1733
    .local v4, "$this$minIntrinsicMainAxisSize_u24lambda_u249":I
    const/4 v5, 0x0

    .line 1021
    .local v5, "$i$a$-run-FlowLayoutKt$minIntrinsicMainAxisSize$maxMainAxisSize$1":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    sub-int/2addr v14, v8

    mul-int v14, v14, p4

    add-int/2addr v14, v4

    .line 1022
    .end local v4    # "$this$minIntrinsicMainAxisSize_u24lambda_u249":I
    .end local v5    # "$i$a$-run-FlowLayoutKt$minIntrinsicMainAxisSize$maxMainAxisSize$1":I
    .local v14, "maxMainAxisSize":I
    move v4, v14

    .line 1023
    .local v4, "mainAxisUsed":I
    array-length v5, v3

    if-nez v5, :cond_7

    move v5, v8

    goto :goto_4

    :cond_7
    move v5, v2

    :goto_4
    if-nez v5, :cond_14

    aget v5, v3, v2

    .line 1733
    .local v5, "it":I
    const/16 v16, 0x0

    .line 1023
    .local v16, "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$crossAxisUsed$1":I
    move/from16 v16, v2

    .end local v5    # "it":I
    .end local v16    # "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$crossAxisUsed$1":I
    new-instance v2, Lkotlin/ranges/IntRange;

    invoke-static {v3}, Lkotlin/collections/ArraysKt;->getLastIndex([I)I

    move-result v0

    invoke-direct {v2, v8, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-virtual {v2}, Lkotlin/ranges/IntRange;->iterator()Lkotlin/collections/IntIterator;

    move-result-object v0

    :cond_8
    :goto_5
    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    aget v2, v3, v2

    .line 1733
    .local v2, "it":I
    const/16 v17, 0x0

    .line 1023
    .local v17, "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$crossAxisUsed$1":I
    nop

    .end local v2    # "it":I
    .end local v17    # "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$crossAxisUsed$1":I
    if-ge v5, v2, :cond_8

    move v5, v2

    goto :goto_5

    .line 1025
    .local v5, "crossAxisUsed":I
    :cond_9
    array-length v0, v1

    if-nez v0, :cond_a

    move v0, v8

    goto :goto_6

    :cond_a
    move/from16 v0, v16

    :goto_6
    if-nez v0, :cond_13

    aget v0, v1, v16

    .line 1733
    .local v0, "it":I
    const/4 v2, 0x0

    .line 1025
    .local v2, "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$minimumItemSize$1":I
    nop

    .end local v0    # "it":I
    .end local v2    # "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$minimumItemSize$1":I
    new-instance v2, Lkotlin/ranges/IntRange;

    move/from16 v16, v0

    .local v16, "it":I
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([I)I

    move-result v0

    invoke-direct {v2, v8, v0}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-virtual {v2}, Lkotlin/ranges/IntRange;->iterator()Lkotlin/collections/IntIterator;

    move-result-object v0

    move/from16 v2, v16

    .end local v16    # "it":I
    :cond_b
    :goto_7
    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v8

    aget v8, v1, v8

    .line 1733
    .local v8, "it":I
    const/16 v16, 0x0

    .line 1025
    .local v16, "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$minimumItemSize$1":I
    nop

    .end local v8    # "it":I
    .end local v16    # "$i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$minimumItemSize$1":I
    if-ge v2, v8, :cond_b

    move v2, v8

    goto :goto_7

    :cond_c
    move/from16 v16, v2

    .line 1026
    .local v16, "minimumItemSize":I
    move/from16 v0, v16

    .line 1027
    .local v0, "low":I
    move v2, v14

    .line 1028
    .local v2, "high":I
    :goto_8
    if-gt v0, v2, :cond_12

    .line 1029
    if-ne v5, v9, :cond_d

    .line 1030
    return v4

    .line 1032
    :cond_d
    add-int v8, v0, v2

    div-int/lit8 v17, v8, 0x2

    .line 1033
    .local v17, "mid":I
    move v8, v2

    move-object v2, v3

    .end local v3    # "crossAxisSizes":[I
    .local v2, "crossAxisSizes":[I
    .local v8, "high":I
    move/from16 v3, v17

    .line 1036
    .end local v4    # "mainAxisUsed":I
    .local v3, "mainAxisUsed":I
    nop

    .line 1037
    nop

    .line 1038
    nop

    .line 1039
    nop

    .line 1040
    nop

    .line 1041
    nop

    .line 1042
    nop

    .line 1043
    nop

    .line 1044
    nop

    .line 1035
    move/from16 v4, p4

    move/from16 v18, v0

    move/from16 v20, v5

    move/from16 v19, v10

    move-object/from16 v0, p0

    move/from16 v5, p5

    move v10, v8

    move-object/from16 v8, p8

    .end local v0    # "low":I
    .end local v5    # "crossAxisUsed":I
    .end local v8    # "high":I
    .local v10, "high":I
    .local v18, "low":I
    .local v19, "$i$f$minIntrinsicMainAxisSize":I
    .local v20, "crossAxisUsed":I
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->access$intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J

    move-result-wide v21

    .line 1034
    nop

    .line 1046
    .local v21, "pair":J
    invoke-static/range {v21 .. v22}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    move-result v5

    .line 1047
    .end local v20    # "crossAxisUsed":I
    .restart local v5    # "crossAxisUsed":I
    invoke-static/range {v21 .. v22}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v0

    .line 1049
    .local v0, "itemShown":I
    if-gt v5, v9, :cond_10

    if-ge v0, v12, :cond_e

    goto :goto_9

    .line 1054
    :cond_e
    if-ge v5, v9, :cond_f

    .line 1055
    add-int/lit8 v4, v17, -0x1

    move v0, v3

    move-object v3, v2

    move v2, v4

    move v4, v0

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v0, v18

    move/from16 v10, v19

    .end local v10    # "high":I
    .local v4, "high":I
    goto :goto_8

    .line 1057
    .end local v4    # "high":I
    .restart local v10    # "high":I
    :cond_f
    return v3

    .line 1050
    :cond_10
    :goto_9
    add-int/lit8 v4, v17, 0x1

    .line 1051
    .end local v18    # "low":I
    .local v4, "low":I
    if-le v4, v10, :cond_11

    .line 1052
    return v4

    .line 1051
    :cond_11
    move/from16 v6, p6

    move/from16 v7, p7

    move v0, v4

    move v4, v3

    move-object v3, v2

    move v2, v10

    move/from16 v10, v19

    goto :goto_8

    .line 1061
    .end local v17    # "mid":I
    .end local v19    # "$i$f$minIntrinsicMainAxisSize":I
    .end local v21    # "pair":J
    .local v0, "low":I
    .local v2, "high":I
    .local v3, "crossAxisSizes":[I
    .local v4, "mainAxisUsed":I
    .local v10, "$i$f$minIntrinsicMainAxisSize":I
    :cond_12
    return v4

    .line 1025
    .end local v0    # "low":I
    .end local v2    # "high":I
    .end local v16    # "minimumItemSize":I
    :cond_13
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 1023
    .end local v5    # "crossAxisUsed":I
    :cond_14
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public static final placeHelper-BmaY500(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;
    .locals 19
    .param p0, "$this$placeHelper_u2dBmaY500"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "constraints"    # J
    .param p3, "mainAxisTotalSize"    # I
    .param p4, "crossAxisTotalSize"    # I
    .param p5, "crossAxisSizes"    # [I
    .param p6, "items"    # Landroidx/compose/runtime/collection/MutableVector;
    .param p7, "measureHelper"    # Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .param p8, "outPosition"    # [I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "JII[I",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "[I)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1553
    move-object/from16 v0, p0

    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v7

    .line 1554
    .local v7, "isHorizontal":Z
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->getVerticalArrangement()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v8

    .line 1555
    .local v8, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->getHorizontalArrangement()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v9

    .line 1557
    .local v9, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const/4 v1, 0x0

    .local v1, "totalCrossAxisSize":I
    move/from16 v1, p4

    .line 1559
    if-eqz v7, :cond_2

    .line 1560
    move-object v2, v8

    .local v2, "$this$placeHelper_BmaY500_u24lambda_u2421":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    const/4 v3, 0x0

    .line 1561
    .local v3, "$i$a$-with-FlowLayoutKt$placeHelper$1":I
    invoke-interface {v2}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v4

    invoke-interface {v0, v4}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v4

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    mul-int/2addr v4, v5

    .line 1562
    .local v4, "totalCrossAxisSpacing":I
    add-int/2addr v1, v4

    .line 1563
    nop

    .line 1564
    const/4 v5, 0x0

    .line 1871
    .local v5, "$i$f$getCrossAxisMin-impl":I
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v5

    .line 1564
    .end local v5    # "$i$f$getCrossAxisMin-impl":I
    const/4 v6, 0x0

    .line 1874
    .local v6, "$i$f$getCrossAxisMax-impl":I
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v6

    .line 1564
    .end local v6    # "$i$f$getCrossAxisMax-impl":I
    move v10, v1

    .local v5, "minimumValue$iv":I
    .local v6, "maximumValue$iv":I
    .local v10, "$this$fastCoerceIn$iv":I
    const/4 v11, 0x0

    .line 1875
    .local v11, "$i$f$fastCoerceIn":I
    move v12, v10

    .local v12, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v13, 0x0

    .line 1879
    .local v13, "$i$f$fastCoerceAtLeast":I
    if-ge v12, v5, :cond_0

    move v12, v5

    .line 1875
    .end local v12    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v13    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v12, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v13, 0x0

    .line 1884
    .local v13, "$i$f$fastCoerceAtMost":I
    if-le v12, v6, :cond_1

    move v12, v6

    .line 1875
    .end local v12    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v13    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 1563
    .end local v5    # "minimumValue$iv":I
    .end local v6    # "maximumValue$iv":I
    .end local v10    # "$this$fastCoerceIn$iv":I
    .end local v11    # "$i$f$fastCoerceIn":I
    nop

    .line 1565
    .end local v1    # "totalCrossAxisSize":I
    .local v12, "totalCrossAxisSize":I
    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/unit/Density;

    move-object/from16 v5, p5

    move-object/from16 v6, p8

    invoke-interface {v2, v1, v12, v5, v6}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 1566
    nop

    .line 1560
    .end local v2    # "$this$placeHelper_BmaY500_u24lambda_u2421":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v3    # "$i$a$-with-FlowLayoutKt$placeHelper$1":I
    .end local v4    # "totalCrossAxisSpacing":I
    goto :goto_1

    .line 1568
    .end local v12    # "totalCrossAxisSize":I
    .restart local v1    # "totalCrossAxisSize":I
    :cond_2
    move-object/from16 v5, p5

    move-object/from16 v6, p8

    move-object v13, v9

    .local v13, "$this$placeHelper_BmaY500_u24lambda_u2422":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const/4 v2, 0x0

    .line 1569
    .local v2, "$i$a$-with-FlowLayoutKt$placeHelper$2":I
    invoke-interface {v13}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v3

    invoke-interface {v0, v3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v3

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    mul-int/2addr v3, v4

    .line 1570
    .local v3, "totalCrossAxisSpacing":I
    add-int/2addr v1, v3

    .line 1571
    nop

    .line 1572
    const/4 v4, 0x0

    .line 1885
    .local v4, "$i$f$getCrossAxisMin-impl":I
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v4

    .line 1572
    .end local v4    # "$i$f$getCrossAxisMin-impl":I
    const/4 v10, 0x0

    .line 1888
    .local v10, "$i$f$getCrossAxisMax-impl":I
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v10

    .line 1572
    .end local v10    # "$i$f$getCrossAxisMax-impl":I
    move v11, v1

    .local v4, "minimumValue$iv":I
    .local v10, "maximumValue$iv":I
    .local v11, "$this$fastCoerceIn$iv":I
    const/4 v12, 0x0

    .line 1889
    .local v12, "$i$f$fastCoerceIn":I
    move v14, v11

    .local v14, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v15, 0x0

    .line 1893
    .local v15, "$i$f$fastCoerceAtLeast":I
    if-ge v14, v4, :cond_3

    move v14, v4

    .line 1889
    .end local v14    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v15    # "$i$f$fastCoerceAtLeast":I
    :cond_3
    nop

    .local v14, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v15, 0x0

    .line 1898
    .local v15, "$i$f$fastCoerceAtMost":I
    if-le v14, v10, :cond_4

    move v15, v10

    goto :goto_0

    :cond_4
    move v15, v14

    .line 1889
    .end local v14    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v15    # "$i$f$fastCoerceAtMost":I
    :goto_0
    nop

    .line 1571
    .end local v4    # "minimumValue$iv":I
    .end local v10    # "maximumValue$iv":I
    .end local v11    # "$this$fastCoerceIn$iv":I
    .end local v12    # "$i$f$fastCoerceIn":I
    nop

    .line 1573
    .end local v1    # "totalCrossAxisSize":I
    .local v15, "totalCrossAxisSize":I
    move-object v14, v0

    check-cast v14, Landroidx/compose/ui/unit/Density;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v17

    move-object/from16 v16, v5

    move-object/from16 v18, v6

    invoke-interface/range {v13 .. v18}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 1574
    nop

    .line 1568
    .end local v2    # "$i$a$-with-FlowLayoutKt$placeHelper$2":I
    .end local v3    # "totalCrossAxisSpacing":I
    .end local v13    # "$this$placeHelper_BmaY500_u24lambda_u2422":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    move v12, v15

    .line 1578
    .end local v15    # "totalCrossAxisSize":I
    .local v12, "totalCrossAxisSize":I
    :goto_1
    const/4 v1, 0x0

    .line 1899
    .local v1, "$i$f$getMainAxisMin-impl":I
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v1

    .line 1578
    .end local v1    # "$i$f$getMainAxisMin-impl":I
    const/4 v2, 0x0

    .line 1902
    .local v2, "$i$f$getMainAxisMax-impl":I
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    .line 1578
    .end local v2    # "$i$f$getMainAxisMax-impl":I
    nop

    .local v1, "minimumValue$iv":I
    move/from16 v3, p3

    .local v2, "maximumValue$iv":I
    .local v3, "$this$fastCoerceIn$iv":I
    const/4 v4, 0x0

    .line 1903
    .local v4, "$i$f$fastCoerceIn":I
    move v5, v3

    .local v5, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v6, 0x0

    .line 1907
    .local v6, "$i$f$fastCoerceAtLeast":I
    if-ge v5, v1, :cond_5

    move v5, v1

    .line 1903
    .end local v5    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v6    # "$i$f$fastCoerceAtLeast":I
    :cond_5
    nop

    .local v5, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v6, 0x0

    .line 1912
    .local v6, "$i$f$fastCoerceAtMost":I
    if-le v5, v2, :cond_6

    move v5, v2

    .line 1903
    .end local v5    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v6    # "$i$f$fastCoerceAtMost":I
    :cond_6
    nop

    .line 1578
    .end local v1    # "minimumValue$iv":I
    .end local v2    # "maximumValue$iv":I
    .end local v3    # "$this$fastCoerceIn$iv":I
    .end local v4    # "$i$f$fastCoerceIn":I
    nop

    .line 1577
    move v10, v5

    .line 1580
    .local v10, "finalMainAxisTotalSize":I
    const/4 v1, 0x0

    .line 1581
    .local v1, "layoutWidth":I
    const/4 v2, 0x0

    .line 1582
    .local v2, "layoutHeight":I
    if-eqz v7, :cond_7

    .line 1583
    move v1, v10

    .line 1584
    move v2, v12

    goto :goto_2

    .line 1586
    :cond_7
    move v1, v12

    .line 1587
    move v2, v10

    .line 1590
    :goto_2
    new-instance v3, Landroidx/compose/foundation/layout/FlowLayoutKt$placeHelper$3;

    move-object/from16 v11, p6

    invoke-direct {v3, v11}, Landroidx/compose/foundation/layout/FlowLayoutKt$placeHelper$3;-><init>(Landroidx/compose/runtime/collection/MutableVector;)V

    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    return-object v3
.end method

.method public static final rowMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 19
    .param p0, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p1, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p2, "maxItemsInMainAxis"    # I
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    .line 450
    move-object/from16 v0, p3

    move/from16 v1, p4

    const v2, 0x582ba447

    const-string v3, "C(rowMeasurementHelper)P(!1,2)450@17773L923:FlowLayout.kt#2w3rfo"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)"

    invoke-static {v2, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 451
    :cond_0
    const v2, -0x47b576b

    const-string v3, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v2, v1, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_1

    .line 452
    move-object/from16 v8, p0

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 451
    :cond_1
    move-object/from16 v8, p0

    .line 452
    :goto_0
    and-int/lit8 v2, v1, 0x6

    if-ne v2, v3, :cond_3

    :cond_2
    move v2, v5

    goto :goto_1

    :cond_3
    move v2, v4

    :goto_1
    and-int/lit8 v3, v1, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v6, 0x20

    if-le v3, v6, :cond_4

    .line 453
    move-object/from16 v9, p1

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    .line 452
    :cond_4
    move-object/from16 v9, p1

    .line 453
    :goto_2
    and-int/lit8 v3, v1, 0x30

    if-ne v3, v6, :cond_6

    :cond_5
    move v3, v5

    goto :goto_3

    :cond_6
    move v3, v4

    :goto_3
    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v6, 0x100

    if-le v3, v6, :cond_7

    .line 454
    move/from16 v13, p2

    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    .line 453
    :cond_7
    move/from16 v13, p2

    .line 454
    :goto_4
    and-int/lit16 v3, v1, 0x180

    if-ne v3, v6, :cond_9

    :cond_8
    move v4, v5

    :cond_9
    or-int/2addr v2, v4

    .line 451
    nop

    .local v2, "invalid$iv":Z
    move-object/from16 v3, p3

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 1703
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1704
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_b

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_a

    goto :goto_5

    .line 1708
    :cond_a
    goto :goto_6

    .line 1705
    :cond_b
    :goto_5
    const/16 v18, 0x0

    .line 460
    .local v18, "$i$a$-cache-FlowLayoutKt$rowMeasurementHelper$1":I
    invoke-interface {v8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v10

    .line 461
    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 463
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v12

    .line 466
    sget-object v6, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getVisible()Landroidx/compose/foundation/layout/FlowRowOverflow;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/FlowRowOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v15

    .line 457
    new-instance v6, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 458
    nop

    .line 459
    nop

    .line 462
    nop

    .line 460
    nop

    .line 461
    nop

    .line 463
    nop

    .line 464
    nop

    .line 465
    nop

    .line 466
    nop

    .line 457
    const/4 v7, 0x1

    const v14, 0x7fffffff

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v16}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v6, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    .line 456
    nop

    .line 470
    .local v6, "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    new-instance v7, Landroidx/compose/foundation/layout/FlowLayoutKt$rowMeasurementHelper$1$1;

    invoke-direct {v7, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt$rowMeasurementHelper$1$1;-><init>(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)V

    check-cast v7, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 472
    nop

    .line 1705
    .end local v6    # "measurePolicy":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .end local v18    # "$i$a$-cache-FlowLayoutKt$rowMeasurementHelper$1":I
    nop

    .line 1706
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1707
    move-object v5, v7

    .line 1703
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_6
    nop

    .line 451
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v5, Landroidx/compose/ui/layout/MeasurePolicy;

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 450
    :cond_c
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 451
    return-object v5
.end method

.method public static final rowMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .locals 21
    .param p0, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p1, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p2, "itemVerticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p3, "maxItemsInMainAxis"    # I
    .param p4, "maxLines"    # I
    .param p5, "overflowState"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I

    .line 485
    move-object/from16 v0, p2

    move-object/from16 v1, p6

    move/from16 v2, p7

    const v3, -0x77d057b1    # -5.2859993E-34f

    const-string v4, "C(rowMeasurementMultiContentHelper)P(!1,5)485@19075L706:FlowLayout.kt#2w3rfo"

    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)"

    invoke-static {v3, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 486
    :cond_0
    const v3, 0x2c61a19c

    const-string v4, "CC(remember):FlowLayout.kt#9igjgp"

    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v3, v4, :cond_1

    .line 487
    move-object/from16 v9, p0

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 486
    :cond_1
    move-object/from16 v9, p0

    .line 487
    :goto_0
    and-int/lit8 v3, v2, 0x6

    if-ne v3, v4, :cond_3

    :cond_2
    move v3, v6

    goto :goto_1

    :cond_3
    move v3, v5

    :goto_1
    and-int/lit8 v4, v2, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v7, 0x20

    if-le v4, v7, :cond_4

    .line 488
    move-object/from16 v10, p1

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    .line 487
    :cond_4
    move-object/from16 v10, p1

    .line 488
    :goto_2
    and-int/lit8 v4, v2, 0x30

    if-ne v4, v7, :cond_6

    :cond_5
    move v4, v6

    goto :goto_3

    :cond_6
    move v4, v5

    :goto_3
    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v7, 0x100

    if-le v4, v7, :cond_7

    .line 489
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    and-int/lit16 v4, v2, 0x180

    if-ne v4, v7, :cond_9

    :cond_8
    move v4, v6

    goto :goto_4

    :cond_9
    move v4, v5

    :goto_4
    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    const/16 v7, 0x800

    if-le v4, v7, :cond_a

    .line 490
    move/from16 v14, p3

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_5

    .line 489
    :cond_a
    move/from16 v14, p3

    .line 490
    :goto_5
    and-int/lit16 v4, v2, 0xc00

    if-ne v4, v7, :cond_c

    :cond_b
    move v4, v6

    goto :goto_6

    :cond_c
    move v4, v5

    :goto_6
    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v4, v2

    xor-int/lit16 v4, v4, 0x6000

    const/16 v7, 0x4000

    if-le v4, v7, :cond_d

    .line 491
    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_7

    .line 490
    :cond_d
    move/from16 v15, p4

    .line 491
    :goto_7
    and-int/lit16 v4, v2, 0x6000

    if-ne v4, v7, :cond_f

    :cond_e
    move v5, v6

    :cond_f
    or-int/2addr v3, v5

    .line 492
    move-object/from16 v4, p5

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 486
    nop

    .local v3, "invalid$iv":Z
    move-object/from16 v5, p6

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 1709
    .local v6, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1710
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_11

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_10

    goto :goto_8

    .line 1714
    :cond_10
    goto :goto_9

    .line 1711
    :cond_11
    :goto_8
    const/16 v19, 0x0

    .line 497
    .local v19, "$i$a$-cache-FlowLayoutKt$rowMeasurementMultiContentHelper$1":I
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v11

    .line 498
    sget-object v8, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    invoke-virtual {v8, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->vertical$foundation_layout_release(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    move-result-object v12

    .line 500
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v13

    .line 494
    move-object v8, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .local v8, "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 495
    nop

    .line 496
    nop

    .line 499
    nop

    .line 497
    nop

    .line 498
    nop

    .line 500
    nop

    .line 501
    nop

    .line 502
    nop

    .line 503
    nop

    .line 494
    move-object/from16 v16, v8

    .end local v8    # "it$iv":Ljava/lang/Object;
    .local v16, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x1

    const/16 v17, 0x0

    move-object/from16 v20, v16

    move-object/from16 v16, v4

    move-object/from16 v4, v20

    .end local v16    # "it$iv":Ljava/lang/Object;
    .local v4, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v7 .. v17}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 504
    nop

    .line 1711
    .end local v19    # "$i$a$-cache-FlowLayoutKt$rowMeasurementMultiContentHelper$1":I
    nop

    .line 1712
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1713
    nop

    .line 1709
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_9
    nop

    .line 486
    .end local v3    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    check-cast v7, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 485
    :cond_12
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v7, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    .line 486
    return-object v7
.end method

.method private static final safeNext(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;
    .locals 2
    .param p0, "$this$safeNext"    # Ljava/util/Iterator;
    .param p1, "info"    # Landroidx/compose/foundation/layout/FlowLineInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;",
            "Landroidx/compose/foundation/layout/FlowLineInfo;",
            ")",
            "Landroidx/compose/ui/layout/Measurable;"
        }
    .end annotation

    .line 1488
    nop

    .line 1489
    :try_start_0
    instance-of v0, p0, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;

    if-eqz v0, :cond_0

    .line 1490
    move-object v0, p0

    check-cast v0, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;->getNext$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;

    move-result-object v0

    goto :goto_0

    .line 1492
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/Measurable;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    goto :goto_1

    .line 1494
    :catch_0
    move-exception v0

    .line 1495
    .local v0, "e":Ljava/lang/IndexOutOfBoundsException;
    const/4 v1, 0x0

    move-object v0, v1

    .line 1488
    .end local v0    # "e":Ljava/lang/IndexOutOfBoundsException;
    :goto_1
    return-object v0
.end method
