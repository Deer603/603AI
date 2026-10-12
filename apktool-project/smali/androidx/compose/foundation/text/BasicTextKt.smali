.class public final Landroidx/compose/foundation/text/BasicTextKt;
.super Ljava/lang/Object;
.source "BasicText.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,701:1\n75#2:702\n75#2:703\n75#2:716\n75#2:717\n75#2:747\n75#2:748\n75#2:761\n75#2:797\n1247#3,6:704\n1247#3,6:710\n1247#3,6:749\n1247#3,6:755\n1247#3,6:791\n1247#3,6:798\n1247#3,6:815\n1247#3,6:821\n1247#3,6:827\n1247#3,6:833\n1247#3,6:839\n1247#3,6:845\n1247#3,6:851\n1247#3,6:857\n1247#3,6:863\n121#4,6:718\n128#4,4:733\n132#4:743\n134#4:746\n121#4,6:762\n128#4,4:777\n132#4:787\n134#4:790\n79#4,6:869\n86#4,3:884\n89#4,2:893\n93#4:898\n272#5,9:724\n281#5,2:744\n272#5,9:768\n281#5,2:788\n347#5,9:875\n356#5,3:895\n4206#6,6:737\n4206#6,6:781\n4206#6,6:887\n303#7,3:804\n70#7,4:807\n75#7:813\n306#7:814\n1#8:811\n1#8:812\n85#9:899\n113#9,2:900\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n104#1:702\n107#1:703\n128#1:716\n141#1:717\n197#1:747\n200#1:748\n225#1:761\n251#1:797\n109#1:704,6\n112#1:710,6\n202#1:749,6\n205#1:755,6\n238#1:791,6\n254#1:798,6\n635#1:815,6\n642#1:821,6\n644#1:827,6\n655#1:833,6\n660#1:839,6\n672#1:845,6\n691#1:851,6\n695#1:857,6\n696#1:863,6\n149#1:718,6\n149#1:733,4\n149#1:743\n149#1:746\n215#1:762,6\n215#1:777,4\n215#1:787\n215#1:790\n663#1:869,6\n663#1:884,3\n663#1:893,2\n663#1:898\n149#1:724,9\n149#1:744,2\n215#1:768,9\n215#1:788,2\n663#1:875,9\n663#1:895,3\n149#1:737,6\n215#1:781,6\n663#1:887,6\n537#1:804,3\n537#1:807,4\n537#1:813\n537#1:814\n537#1:812\n238#1:899\n238#1:900,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010$\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010%\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010&\u001a\u00ba\u0001\u0010\'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u000e2\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010,2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u00100\u001a@\u00101\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204\u0012\u000c\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010503\u0018\u0001022\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u000208022\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000e05H\u0002\u001a\u001e\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<0;2\u0008\u0010=\u001a\u0004\u0018\u00010>H\u0002\u001a\u00cc\u0001\u0010?\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u0014\u0010@\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020B0A\u0018\u0001022\u001c\u0010C\u001a\u0018\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010D02\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0010+\u001a\u0004\u0018\u00010,2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010F\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006G\u00b2\u0006\n\u0010H\u001a\u00020\u0003X\u008a\u008e\u0002"
    }
    d2 = {
        "BasicText",
        "",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "style",
        "Landroidx/compose/ui/text/TextStyle;",
        "onTextLayout",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "overflow",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "softWrap",
        "",
        "maxLines",
        "",
        "minLines",
        "inlineContent",
        "",
        "",
        "Landroidx/compose/foundation/text/InlineTextContent;",
        "BasicText-VhcvRP8",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V",
        "color",
        "Landroidx/compose/ui/graphics/ColorProducer;",
        "BasicText-RWo7tUw",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V",
        "autoSize",
        "Landroidx/compose/foundation/text/TextAutoSize;",
        "BasicText-CL7eQgs",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V",
        "BasicText-4YKlhWE",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V",
        "BasicText-BpD7jsM",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V",
        "LayoutWithLinksAndInlineContent",
        "hasInlineContent",
        "fontFamilyResolver",
        "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
        "selectionController",
        "Landroidx/compose/foundation/text/modifiers/SelectionController;",
        "onShowTranslation",
        "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;",
        "LayoutWithLinksAndInlineContent-11Od_4g",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V",
        "measureWithTextRangeMeasureConstraints",
        "",
        "Lkotlin/Pair;",
        "Landroidx/compose/ui/layout/Placeable;",
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/unit/IntOffset;",
        "measurables",
        "Landroidx/compose/ui/layout/Measurable;",
        "shouldMeasureLinks",
        "selectionIdSaver",
        "Landroidx/compose/runtime/saveable/Saver;",
        "",
        "selectionRegistrar",
        "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
        "textModifier",
        "placeholders",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "Landroidx/compose/ui/text/Placeholder;",
        "onPlaceholderLayout",
        "Landroidx/compose/ui/geometry/Rect;",
        "textModifier-CL7eQgs",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;",
        "foundation_release",
        "displayedText"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic BasicText-4YKlhWE(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "inlineContent"    # Ljava/util/Map;
    .param p8, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p9, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 393
    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0x26a8f0e8

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)393@18530L273:BasicText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p9

    .local v2, "$dirty":I
    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v10, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v10, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v10, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v12, v10, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v9, 0x6000

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
    and-int/lit8 v14, v10, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v9

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    and-int/lit8 v16, v10, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v17, v9, v17

    if-nez v17, :cond_14

    move/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    move/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v18

    move/from16 v19, v0

    move-object/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v19, v9, v18

    if-nez v19, :cond_17

    move/from16 v19, v0

    move-object/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v2, v2, v20

    goto :goto_f

    :cond_17
    move/from16 v19, v0

    move-object/from16 v0, p7

    :goto_f
    const v20, 0x492493

    and-int v0, v2, v20

    move/from16 p8, v3

    const v3, 0x492492

    if-eq v0, v3, :cond_18

    const/4 v0, 0x1

    goto :goto_10

    :cond_18
    const/4 v0, 0x0

    :goto_10
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_22

    if-eqz p8, :cond_19

    .line 386
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move/from16 v26, v12

    move-object v12, v0

    move/from16 v0, v26

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_11

    .line 393
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_19
    move v0, v12

    move-object v12, v4

    .line 386
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v12, "modifier":Landroidx/compose/ui/Modifier;
    :goto_11
    if-eqz v5, :cond_1a

    .line 387
    sget-object v3, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v3

    move-object v13, v3

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_12

    .line 386
    .end local v3    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_1a
    move-object v13, v6

    .line 387
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v13, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_12
    if-eqz v7, :cond_1b

    .line 388
    const/4 v3, 0x0

    move/from16 v26, v14

    move-object v14, v3

    move/from16 v3, v26

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_13

    .line 387
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_1b
    move v3, v14

    move-object v14, v8

    .line 388
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v14, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_13
    if-eqz v0, :cond_1c

    .line 389
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v0

    move v15, v0

    .end local p4    # "overflow":I
    .local v0, "overflow":I
    goto :goto_14

    .line 388
    .end local v0    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_1c
    move/from16 v15, p4

    .line 389
    .end local p4    # "overflow":I
    .local v15, "overflow":I
    :goto_14
    if-eqz v3, :cond_1d

    .line 390
    const/4 v0, 0x1

    move/from16 v26, v16

    move/from16 v16, v0

    move/from16 v0, v26

    .end local p5    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_15

    .line 389
    .end local v0    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_1d
    move/from16 v0, v16

    move/from16 v16, p5

    .line 390
    .end local p5    # "softWrap":Z
    .local v16, "softWrap":Z
    :goto_15
    if-eqz v0, :cond_1e

    .line 391
    const v0, 0x7fffffff

    move/from16 v17, v0

    const v0, -0x26a8f0e8

    .end local p6    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_16

    .line 390
    .end local v0    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_1e
    move/from16 v17, p6

    const v0, -0x26a8f0e8

    .line 391
    .end local p6    # "maxLines":I
    .local v17, "maxLines":I
    :goto_16
    if-eqz v19, :cond_1f

    .line 392
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    move-object/from16 v19, v3

    .end local p7    # "inlineContent":Ljava/util/Map;
    .local v3, "inlineContent":Ljava/util/Map;
    goto :goto_17

    .line 391
    .end local v3    # "inlineContent":Ljava/util/Map;
    .restart local p7    # "inlineContent":Ljava/util/Map;
    :cond_1f
    move-object/from16 v19, p7

    .line 392
    .end local p7    # "inlineContent":Ljava/util/Map;
    .local v19, "inlineContent":Ljava/util/Map;
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_20

    .line 393
    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.BasicText (BasicText.kt:392)"

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 395
    :cond_20
    nop

    .line 396
    nop

    .line 397
    nop

    .line 398
    nop

    .line 399
    nop

    .line 400
    nop

    .line 401
    nop

    .line 402
    nop

    .line 403
    and-int/lit8 v0, v2, 0xe

    or-int v0, v0, v18

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

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    shl-int/lit8 v3, v2, 0x3

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int v23, v0, v3

    .line 394
    const/16 v18, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x600

    move-object/from16 v22, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v25}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-CL7eQgs(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 405
    :cond_21
    move-object v3, v13

    move-object v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    move-object/from16 v8, v19

    goto :goto_18

    .end local v12    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v13    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v14    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v15    # "overflow":I
    .end local v16    # "softWrap":Z
    .end local v17    # "maxLines":I
    .end local v19    # "inlineContent":Ljava/util/Map;
    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "overflow":I
    .restart local p5    # "softWrap":Z
    .restart local p6    # "maxLines":I
    .restart local p7    # "inlineContent":Ljava/util/Map;
    :cond_22
    move-object/from16 v22, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v5, p4

    move/from16 v7, p6

    move-object v12, v4

    move-object v3, v6

    move-object v4, v8

    move/from16 v6, p5

    move-object/from16 v8, p7

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "inlineContent":Ljava/util/Map;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "inlineContent":Ljava/util/Map;
    .restart local v12    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_18
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_23

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$7;

    move-object v1, v12

    move v12, v2

    move-object v2, v1

    move-object/from16 v1, p0

    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v12, "$dirty":I
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$7;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_19

    .local v2, "$dirty":I
    .local v12, "modifier":Landroidx/compose/ui/Modifier;
    :cond_23
    move-object/from16 v26, v12

    move v12, v2

    move-object/from16 v2, v26

    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v12, "$dirty":I
    :goto_19
    return-void
.end method

.method public static final synthetic BasicText-4YKlhWE(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p9, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compat"
    .end annotation

    .line 418
    move/from16 v9, p9

    move/from16 v10, p10

    const v0, 0x5bf3fbc9

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)417@19201L86:BasicText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p9

    .local v2, "$dirty":I
    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v10, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v10, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v10, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v12, v10, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v9, 0x6000

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
    and-int/lit8 v14, v10, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v9

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    and-int/lit8 v16, v10, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v17, v9, v17

    if-nez v17, :cond_14

    move/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    move/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v18

    move/from16 v18, v0

    move/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v18, v9, v18

    if-nez v18, :cond_17

    move/from16 v18, v0

    move/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v2, v2, v19

    goto :goto_f

    :cond_17
    move/from16 v18, v0

    move/from16 v0, p7

    :goto_f
    const v19, 0x492493

    and-int v0, v2, v19

    move/from16 p8, v3

    const v3, 0x492492

    if-eq v0, v3, :cond_18

    const/4 v0, 0x1

    goto :goto_10

    :cond_18
    const/4 v0, 0x0

    :goto_10
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_22

    if-eqz p8, :cond_19

    .line 411
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move/from16 v24, v12

    move-object v12, v0

    move/from16 v0, v24

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_11

    .line 418
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_19
    move v0, v12

    move-object v12, v4

    .line 411
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v12, "modifier":Landroidx/compose/ui/Modifier;
    :goto_11
    if-eqz v5, :cond_1a

    .line 412
    sget-object v3, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v3

    move-object v13, v3

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_12

    .line 411
    .end local v3    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_1a
    move-object v13, v6

    .line 412
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v13, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_12
    if-eqz v7, :cond_1b

    .line 413
    const/4 v3, 0x0

    move/from16 v24, v14

    move-object v14, v3

    move/from16 v3, v24

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_13

    .line 412
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_1b
    move v3, v14

    move-object v14, v8

    .line 413
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v14, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_13
    if-eqz v0, :cond_1c

    .line 414
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v0

    move v15, v0

    .end local p4    # "overflow":I
    .local v0, "overflow":I
    goto :goto_14

    .line 413
    .end local v0    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_1c
    move/from16 v15, p4

    .line 414
    .end local p4    # "overflow":I
    .local v15, "overflow":I
    :goto_14
    if-eqz v3, :cond_1d

    .line 415
    const/4 v0, 0x1

    move/from16 v24, v16

    move/from16 v16, v0

    move/from16 v0, v24

    .end local p5    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_15

    .line 414
    .end local v0    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_1d
    move/from16 v0, v16

    move/from16 v16, p5

    .line 415
    .end local p5    # "softWrap":Z
    .local v16, "softWrap":Z
    :goto_15
    if-eqz v0, :cond_1e

    .line 416
    const v0, 0x7fffffff

    move/from16 v17, v0

    const v0, 0x5bf3fbc9

    .end local p6    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_16

    .line 415
    .end local v0    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_1e
    move/from16 v17, p6

    const v0, 0x5bf3fbc9

    .line 416
    .end local p6    # "maxLines":I
    .local v17, "maxLines":I
    :goto_16
    if-eqz v18, :cond_1f

    .line 417
    const/4 v3, 0x1

    move/from16 v18, v3

    .end local p7    # "minLines":I
    .local v3, "minLines":I
    goto :goto_17

    .line 416
    .end local v3    # "minLines":I
    .restart local p7    # "minLines":I
    :cond_1f
    move/from16 v18, p7

    .line 417
    .end local p7    # "minLines":I
    .local v18, "minLines":I
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_20

    .line 418
    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.BasicText (BasicText.kt:417)"

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    and-int/lit8 v0, v2, 0xe

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

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int v22, v0, v3

    const/16 v23, 0x300

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v23}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-RWo7tUw(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_21
    move-object v3, v13

    move-object v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    move/from16 v8, v18

    goto :goto_18

    .end local v12    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v13    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v14    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v15    # "overflow":I
    .end local v16    # "softWrap":Z
    .end local v17    # "maxLines":I
    .end local v18    # "minLines":I
    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "overflow":I
    .restart local p5    # "softWrap":Z
    .restart local p6    # "maxLines":I
    .restart local p7    # "minLines":I
    :cond_22
    move-object/from16 v21, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v21    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v5, p4

    move/from16 v7, p6

    move-object v12, v4

    move-object v3, v6

    move-object v4, v8

    move/from16 v6, p5

    move/from16 v8, p7

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "minLines":I
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "minLines":I
    .restart local v12    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_18
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_23

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$8;

    move-object v1, v12

    move v12, v2

    move-object v2, v1

    move-object/from16 v1, p0

    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v12, "$dirty":I
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$8;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIIII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_19

    .local v2, "$dirty":I
    .local v12, "modifier":Landroidx/compose/ui/Modifier;
    :cond_23
    move-object/from16 v24, v12

    move v12, v2

    move-object/from16 v2, v24

    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v12, "$dirty":I
    :goto_19
    return-void
.end method

.method public static final synthetic BasicText-BpD7jsM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p8, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 369
    move/from16 v8, p8

    const v0, 0x3cf10926

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p7    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)369@17839L234:BasicText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p8

    .local v2, "$dirty":I
    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v9, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v9, p0

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    :goto_1
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_b

    move-object/from16 v10, p3

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v2, v11

    goto :goto_7

    :cond_b
    move-object/from16 v10, p3

    :goto_7
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_e

    move/from16 v12, p4

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v2, v13

    goto :goto_9

    :cond_e
    move/from16 v12, p4

    :goto_9
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v2, v14

    move/from16 v14, p5

    goto :goto_b

    :cond_f
    and-int/2addr v14, v8

    if-nez v14, :cond_11

    move/from16 v14, p5

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v2, v15

    goto :goto_b

    :cond_11
    move/from16 v14, p5

    :goto_b
    and-int/lit8 v15, p9, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_12

    or-int v2, v2, v16

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v16

    if-nez v16, :cond_14

    move/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v2, v2, v17

    goto :goto_d

    :cond_14
    move/from16 v0, p6

    :goto_d
    const v17, 0x92493

    and-int v0, v2, v17

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

    .line 363
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v10, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_f

    .line 369
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_16
    move-object v10, v4

    .line 363
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "modifier":Landroidx/compose/ui/Modifier;
    :goto_f
    if-eqz v5, :cond_17

    .line 364
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move/from16 v22, v11

    move-object v11, v0

    move/from16 v0, v22

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v0, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_10

    .line 363
    .end local v0    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_17
    move v0, v11

    move-object v11, v6

    .line 364
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v11, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_10
    if-eqz v7, :cond_18

    .line 365
    const/4 v3, 0x0

    move-object v12, v3

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_11

    .line 364
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_18
    move-object/from16 v12, p3

    .line 365
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v12, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_11
    if-eqz v0, :cond_19

    .line 366
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v0

    move/from16 v22, v13

    move v13, v0

    move/from16 v0, v22

    .end local p4    # "overflow":I
    .local v0, "overflow":I
    goto :goto_12

    .line 365
    .end local v0    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_19
    move v0, v13

    move/from16 v13, p4

    .line 366
    .end local p4    # "overflow":I
    .local v13, "overflow":I
    :goto_12
    if-eqz v0, :cond_1a

    .line 367
    const/4 v0, 0x1

    move v14, v0

    .end local p5    # "softWrap":Z
    .local v14, "softWrap":Z
    :cond_1a
    if-eqz v15, :cond_1b

    .line 368
    const v0, 0x7fffffff

    move v15, v0

    .end local p6    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_13

    .line 367
    .end local v0    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_1b
    move/from16 v15, p6

    .line 368
    .end local p6    # "maxLines":I
    .local v15, "maxLines":I
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 369
    const/4 v0, -0x1

    const-string v3, "androidx.compose.foundation.text.BasicText (BasicText.kt:368)"

    const v4, 0x3cf10926

    invoke-static {v4, v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 371
    :cond_1c
    nop

    .line 372
    nop

    .line 373
    nop

    .line 374
    nop

    .line 375
    nop

    .line 376
    nop

    .line 378
    nop

    .line 377
    and-int/lit8 v0, v2, 0xe

    const/high16 v3, 0xc00000

    or-int/2addr v0, v3

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

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int v20, v0, v3

    .line 370
    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x300

    move-object/from16 v19, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v19, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v9 .. v21}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-RWo7tUw(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 380
    :cond_1d
    move-object v3, v11

    move-object v4, v12

    move v5, v13

    move v7, v15

    move v6, v14

    goto :goto_14

    .end local v10    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v11    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v12    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v13    # "overflow":I
    .end local v14    # "softWrap":Z
    .end local v15    # "maxLines":I
    .end local v19    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "overflow":I
    .restart local p5    # "softWrap":Z
    .restart local p6    # "maxLines":I
    :cond_1e
    move-object/from16 v19, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v19    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v5, p4

    move/from16 v7, p6

    move-object v10, v4

    move-object v3, v6

    move-object/from16 v4, p3

    move v6, v14

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .restart local v10    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_14
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_1f

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$6;

    move-object v1, v10

    move v10, v2

    move-object v2, v1

    move-object/from16 v1, p0

    move/from16 v9, p9

    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "$dirty":I
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$6;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_15

    .local v2, "$dirty":I
    .local v10, "modifier":Landroidx/compose/ui/Modifier;
    :cond_1f
    move-object/from16 v22, v10

    move v10, v2

    move-object/from16 v2, v22

    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "$dirty":I
    :goto_15
    return-void
.end method

.method public static final BasicText-CL7eQgs(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V
    .locals 40
    .param p0, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "inlineContent"    # Ljava/util/Map;
    .param p9, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p10, "autoSize"    # Landroidx/compose/foundation/text/TextAutoSize;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;IZII",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Landroidx/compose/foundation/text/TextAutoSize;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 195
    move-object/from16 v1, p0

    move-object/from16 v0, p10

    move/from16 v15, p12

    move/from16 v2, p14

    const v3, -0x5013ac4b

    move-object/from16 v4, p11

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(BasicText)P(10,5,9,6,7:c#ui.text.style.TextOverflow,8,3,4,2,1)196@10069L7:BasicText.kt#423gt5"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p12

    .local v5, "$dirty":I
    move/from16 v6, p13

    .local v6, "$dirty1":I
    and-int/lit8 v7, v2, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v15, 0x6

    if-nez v7, :cond_2

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v5, v7

    :cond_2
    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v10, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v15, 0x30

    if-nez v10, :cond_5

    move-object/from16 v10, p1

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v5, v11

    goto :goto_3

    :cond_5
    move-object/from16 v10, p1

    :goto_3
    and-int/lit8 v11, v2, 0x4

    if-eqz v11, :cond_6

    or-int/lit16 v5, v5, 0x180

    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v15, 0x180

    if-nez v12, :cond_8

    move-object/from16 v12, p2

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x100

    goto :goto_4

    :cond_7
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v5, v13

    goto :goto_5

    :cond_8
    move-object/from16 v12, p2

    :goto_5
    and-int/lit8 v13, v2, 0x8

    if-eqz v13, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move-object/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v15, 0xc00

    if-nez v14, :cond_b

    move-object/from16 v14, p3

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v5, v5, v16

    goto :goto_7

    :cond_b
    move-object/from16 v14, p3

    :goto_7
    and-int/lit8 v16, v2, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move/from16 v8, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v8, v15, 0x6000

    if-nez v8, :cond_e

    move/from16 v8, p4

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_8

    :cond_d
    const/16 v17, 0x2000

    :goto_8
    or-int v5, v5, v17

    goto :goto_9

    :cond_e
    move/from16 v8, p4

    :goto_9
    and-int/lit8 v17, v2, 0x20

    const/high16 v18, 0x30000

    if-eqz v17, :cond_f

    or-int v5, v5, v18

    move/from16 v3, p5

    goto :goto_b

    :cond_f
    and-int v18, v15, v18

    if-nez v18, :cond_11

    move/from16 v3, p5

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v19, 0x10000

    :goto_a
    or-int v5, v5, v19

    goto :goto_b

    :cond_11
    move/from16 v3, p5

    :goto_b
    and-int/lit8 v19, v2, 0x40

    const/high16 v20, 0x180000

    if-eqz v19, :cond_12

    or-int v5, v5, v20

    move/from16 v9, p6

    goto :goto_d

    :cond_12
    and-int v20, v15, v20

    if-nez v20, :cond_14

    move/from16 v9, p6

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v21, 0x80000

    :goto_c
    or-int v5, v5, v21

    goto :goto_d

    :cond_14
    move/from16 v9, p6

    :goto_d
    and-int/lit16 v1, v2, 0x80

    const/high16 v21, 0xc00000

    if-eqz v1, :cond_15

    or-int v5, v5, v21

    move/from16 v21, v1

    move/from16 v1, p7

    goto :goto_f

    :cond_15
    and-int v21, v15, v21

    if-nez v21, :cond_17

    move/from16 v21, v1

    move/from16 v1, p7

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v22

    if-eqz v22, :cond_16

    const/high16 v22, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v22, 0x400000

    :goto_e
    or-int v5, v5, v22

    goto :goto_f

    :cond_17
    move/from16 v21, v1

    move/from16 v1, p7

    :goto_f
    and-int/lit16 v1, v2, 0x100

    const/high16 v22, 0x6000000

    if-eqz v1, :cond_18

    or-int v5, v5, v22

    move/from16 v22, v1

    move-object/from16 v1, p8

    goto :goto_11

    :cond_18
    and-int v22, v15, v22

    if-nez v22, :cond_1a

    move/from16 v22, v1

    move-object/from16 v1, p8

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v23, 0x2000000

    :goto_10
    or-int v5, v5, v23

    goto :goto_11

    :cond_1a
    move/from16 v22, v1

    move-object/from16 v1, p8

    :goto_11
    and-int/lit16 v1, v2, 0x200

    const/high16 v23, 0x30000000

    if-eqz v1, :cond_1b

    or-int v5, v5, v23

    move/from16 v23, v1

    move-object/from16 v1, p9

    goto :goto_13

    :cond_1b
    and-int v23, v15, v23

    if-nez v23, :cond_1d

    move/from16 v23, v1

    move-object/from16 v1, p9

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1c

    const/high16 v24, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v24, 0x10000000

    :goto_12
    or-int v5, v5, v24

    goto :goto_13

    :cond_1d
    move/from16 v23, v1

    move-object/from16 v1, p9

    :goto_13
    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_1e

    or-int/lit8 v6, v6, 0x6

    goto :goto_16

    :cond_1e
    and-int/lit8 v24, p13, 0x6

    if-nez v24, :cond_21

    and-int/lit8 v24, p13, 0x8

    if-nez v24, :cond_1f

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    goto :goto_14

    :cond_1f
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    :goto_14
    if-eqz v24, :cond_20

    const/16 v24, 0x4

    goto :goto_15

    :cond_20
    const/16 v24, 0x2

    :goto_15
    or-int v6, v6, v24

    :cond_21
    :goto_16
    const v24, 0x12492493

    and-int v0, v5, v24

    move/from16 v24, v1

    const v1, 0x12492492

    const/16 v25, 0x1

    if-ne v0, v1, :cond_23

    and-int/lit8 v0, v6, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_22

    goto :goto_17

    :cond_22
    const/4 v0, 0x0

    goto :goto_18

    :cond_23
    :goto_17
    move/from16 v0, v25

    :goto_18
    and-int/lit8 v1, v5, 0x1

    invoke-interface {v4, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_3f

    if-eqz v7, :cond_24

    .line 185
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_19

    .line 195
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_24
    move-object v0, v10

    .line 185
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_19
    if-eqz v11, :cond_25

    .line 186
    sget-object v1, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v1

    move-object v2, v1

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v1, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_1a

    .line 185
    .end local v1    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_25
    move-object v2, v12

    .line 186
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v2, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_1a
    if-eqz v13, :cond_26

    .line 187
    const/4 v1, 0x0

    move-object v3, v1

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v1, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_1b

    .line 186
    .end local v1    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_26
    move-object v3, v14

    .line 187
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_1b
    if-eqz v16, :cond_27

    .line 188
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v1

    .end local p4    # "overflow":I
    .local v1, "overflow":I
    goto :goto_1c

    .line 187
    .end local v1    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_27
    move v1, v8

    .line 188
    .end local p4    # "overflow":I
    .restart local v1    # "overflow":I
    :goto_1c
    if-eqz v17, :cond_28

    .line 189
    const/4 v7, 0x1

    .end local p5    # "softWrap":Z
    .local v7, "softWrap":Z
    goto :goto_1d

    .line 188
    .end local v7    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_28
    move/from16 v7, p5

    .line 189
    .end local p5    # "softWrap":Z
    .restart local v7    # "softWrap":Z
    :goto_1d
    if-eqz v19, :cond_29

    .line 190
    const v8, 0x7fffffff

    .end local p6    # "maxLines":I
    .local v8, "maxLines":I
    goto :goto_1e

    .line 189
    .end local v8    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_29
    move/from16 v8, p6

    .line 190
    .end local p6    # "maxLines":I
    .restart local v8    # "maxLines":I
    :goto_1e
    if-eqz v21, :cond_2a

    .line 191
    const/4 v10, 0x1

    move/from16 v39, v10

    move v10, v7

    move/from16 v7, v39

    .end local p7    # "minLines":I
    .local v10, "minLines":I
    goto :goto_1f

    .line 190
    .end local v10    # "minLines":I
    .restart local p7    # "minLines":I
    :cond_2a
    move v10, v7

    move/from16 v7, p7

    .line 191
    .end local p7    # "minLines":I
    .local v7, "minLines":I
    .local v10, "softWrap":Z
    :goto_1f
    if-eqz v22, :cond_2b

    .line 192
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v11

    move-object/from16 v20, v11

    const/4 v11, 0x2

    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v11, "inlineContent":Ljava/util/Map;
    goto :goto_20

    .line 191
    .end local v11    # "inlineContent":Ljava/util/Map;
    .restart local p8    # "inlineContent":Ljava/util/Map;
    :cond_2b
    move-object/from16 v20, p8

    const/4 v11, 0x2

    .line 192
    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v20, "inlineContent":Ljava/util/Map;
    :goto_20
    if-eqz v23, :cond_2c

    .line 193
    const/4 v12, 0x0

    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v12, "color":Landroidx/compose/ui/graphics/ColorProducer;
    goto :goto_21

    .line 192
    .end local v12    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :cond_2c
    move-object/from16 v12, p9

    .line 193
    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local v12    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :goto_21
    if-eqz v24, :cond_2d

    .line 194
    const/4 v13, 0x0

    move-object v14, v13

    .end local p10    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v13, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    goto :goto_22

    .line 193
    .end local v13    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .restart local p10    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :cond_2d
    move-object/from16 v14, p10

    .line 194
    .end local p10    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v14, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :goto_22
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v13

    if-eqz v13, :cond_2e

    .line 195
    const-string v13, "androidx.compose.foundation.text.BasicText (BasicText.kt:194)"

    const v9, -0x5013ac4b

    invoke-static {v9, v5, v6, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 196
    :cond_2e
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/HeightInLinesModifierKt;->validateMinMaxLines(II)V

    .line 197
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionRegistrarKt;->getLocalSelectionRegistrar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/CompositionLocal;

    .local v9, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v13, 0x6

    .local v13, "$changed$iv":I
    const/16 v17, 0x0

    .line 747
    .local v17, "$i$f$getCurrent":I
    const v11, 0x789c5f52

    move-object/from16 v18, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v18, "modifier":Landroidx/compose/ui/Modifier;
    const-string v0, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v4, v11, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v19

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 197
    .end local v9    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v13    # "$changed$iv":I
    .end local v17    # "$i$f$getCurrent":I
    move-object/from16 v9, v19

    check-cast v9, Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 199
    .local v9, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    const-string v13, "CC(remember):BasicText.kt#9igjgp"

    if-eqz v9, :cond_33

    const v11, -0x5e6c872a

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v11, "199@10217L7,201@10371L77,201@10288L160,204@10461L180"

    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 200
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/CompositionLocal;

    .local v11, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v17, 0x6

    .local v17, "$changed$iv":I
    const/16 v19, 0x0

    .line 748
    .local v19, "$i$f$getCurrent":I
    move/from16 v22, v1

    const v1, 0x789c5f52

    .end local v1    # "overflow":I
    .local v22, "overflow":I
    invoke-static {v4, v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v17    # "$changed$iv":I
    .end local v19    # "$i$f$getCurrent":I
    check-cast v1, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 200
    move-object/from16 v21, v2

    .end local v2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v21, "style":Landroidx/compose/ui/text/TextStyle;
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/TextSelectionColors;->getBackgroundColor-0d7_KjU()J

    move-result-wide v1

    .line 202
    .local v1, "backgroundSelectionColor":J
    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Landroidx/compose/foundation/text/BasicTextKt;->selectionIdSaver(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v17

    move-object/from16 v19, v3

    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v19, "onTextLayout":Lkotlin/jvm/functions/Function1;
    const v3, -0x138fc8ff

    invoke-static {v4, v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    .local v3, "invalid$iv":Z
    move-object/from16 p1, v4

    .local p1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v23, 0x0

    .line 749
    .local v23, "$i$f$cache":I
    move/from16 p2, v3

    .end local v3    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 750
    .local v24, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_30

    sget-object v26, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v31, v4

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v31, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_2f

    goto :goto_23

    .line 754
    :cond_2f
    move-object/from16 v4, p1

    goto :goto_24

    .line 750
    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v4    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_30
    move-object/from16 v31, v4

    .line 751
    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_23
    const/4 v4, 0x0

    .line 202
    .local v4, "$i$a$-cache-BasicTextKt$BasicText$selectionController$selectableId$2":I
    move-object/from16 p3, v3

    .end local v3    # "it$iv":Ljava/lang/Object;
    .local p3, "it$iv":Ljava/lang/Object;
    new-instance v3, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectionController$selectableId$2$1;

    invoke-direct {v3, v9}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectionController$selectableId$2$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 751
    .end local v4    # "$i$a$-cache-BasicTextKt$BasicText$selectionController$selectableId$2":I
    nop

    .line 752
    .local v3, "value$iv":Ljava/lang/Object;
    move-object/from16 v4, p1

    .end local p1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 753
    nop

    .line 749
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    :goto_24
    nop

    .line 202
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v23    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static/range {v31 .. v31}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v4, 0x0

    const/16 v23, 0x4

    const/16 v24, 0x0

    move-object/from16 p4, v3

    move/from16 p6, v4

    move-object/from16 p1, v11

    move-object/from16 p2, v17

    move/from16 p7, v23

    move-object/from16 p3, v24

    move-object/from16 p5, v31

    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .local p5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p1 .. p7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, p5

    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v27

    .line 201
    move-wide/from16 p1, v27

    .line 205
    .local p1, "selectableId":J
    const v3, -0x138fbd58

    invoke-static {v4, v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    move v3, v5

    move v11, v6

    move-wide/from16 v5, p1

    .end local v6    # "$dirty1":I
    .end local p1    # "selectableId":J
    .local v3, "$dirty":I
    .local v5, "selectableId":J
    .local v11, "$dirty1":I
    invoke-interface {v4, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v17

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    or-int v17, v17, v23

    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v23

    or-int v17, v17, v23

    .local v17, "invalid$iv":Z
    move-object/from16 p1, v4

    .local p1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v23, 0x0

    .line 755
    .restart local v23    # "$i$f$cache":I
    move-wide/from16 v30, v1

    .end local v1    # "backgroundSelectionColor":J
    .local v30, "backgroundSelectionColor":J
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 756
    .local v2, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v17, :cond_32

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p2, v2

    .end local v2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .local p2, "$i$a$-let-ComposerKt$cache$1$iv":I
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_31

    goto :goto_25

    .line 760
    :cond_31
    move-object/from16 v35, v9

    move-object/from16 v9, p1

    goto :goto_26

    .line 756
    .end local p2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .restart local v2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :cond_32
    move/from16 p2, v2

    .line 757
    .end local v2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .restart local p2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_25
    const/4 v2, 0x0

    .line 206
    .local v2, "$i$a$-cache-BasicTextKt$BasicText$selectionController$2":I
    new-instance v26, Landroidx/compose/foundation/text/modifiers/SelectionController;

    const/16 v33, 0x8

    const/16 v34, 0x0

    const/16 v32, 0x0

    move-wide/from16 v27, v5

    move-object/from16 v29, v9

    .end local v5    # "selectableId":J
    .end local v9    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .local v27, "selectableId":J
    .local v29, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    invoke-direct/range {v26 .. v34}, Landroidx/compose/foundation/text/modifiers/SelectionController;-><init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 757
    move-object/from16 v35, v29

    .end local v2    # "$i$a$-cache-BasicTextKt$BasicText$selectionController$2":I
    .end local v27    # "selectableId":J
    .end local v29    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .restart local v5    # "selectableId":J
    .local v35, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    move-object/from16 v2, v26

    .line 758
    .local v2, "value$iv":Ljava/lang/Object;
    move-object/from16 v9, p1

    .end local p1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 759
    move-object v1, v2

    .line 755
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local p2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_26
    nop

    .line 205
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "invalid$iv":Z
    .end local v23    # "$i$f$cache":I
    check-cast v1, Landroidx/compose/foundation/text/modifiers/SelectionController;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 199
    .end local v5    # "selectableId":J
    .end local v30    # "backgroundSelectionColor":J
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v27, v1

    goto :goto_27

    .line 208
    .end local v11    # "$dirty1":I
    .end local v19    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v21    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v22    # "overflow":I
    .end local v35    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .local v1, "overflow":I
    .local v2, "style":Landroidx/compose/ui/text/TextStyle;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v5, "$dirty":I
    .restart local v6    # "$dirty1":I
    .local v9, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    :cond_33
    move/from16 v22, v1

    move-object/from16 v21, v2

    move-object/from16 v19, v3

    move v3, v5

    move v11, v6

    move-object/from16 v35, v9

    .end local v1    # "overflow":I
    .end local v2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .end local v9    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .local v3, "$dirty":I
    .restart local v11    # "$dirty1":I
    .restart local v19    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v21    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local v22    # "overflow":I
    .restart local v35    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    const v1, -0x5e65088e

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 209
    const/16 v27, 0x0

    .line 199
    :goto_27
    nop

    .line 198
    nop

    .line 211
    .local v27, "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    move v5, v3

    move-object/from16 v3, v19

    .end local v19    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v5    # "$dirty":I
    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt;->hasInlineContent(Landroidx/compose/ui/text/AnnotatedString;)Z

    move-result v19

    .line 212
    .local v19, "hasInlineContent":Z
    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNodeKt;->hasLinks(Landroidx/compose/ui/text/AnnotatedString;)Z

    move-result v36

    .line 213
    .local v36, "hasLinks":Z
    if-nez v19, :cond_38

    if-nez v36, :cond_38

    const v1, -0x5e624d5c

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "224@11307L7,214@10891L757"

    invoke-static {v4, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

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
    nop

    .line 223
    nop

    .line 224
    nop

    .line 225
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .local v1, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v2, 0x0

    .local v2, "$changed$iv":I
    const/4 v6, 0x0

    .line 761
    .local v6, "$i$f$getCurrent":I
    const v9, 0x789c5f52

    invoke-static {v4, v9, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v1    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v2    # "$changed$iv":I
    .end local v6    # "$i$f$getCurrent":I
    check-cast v0, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 226
    nop

    .line 227
    nop

    .line 228
    nop

    .line 229
    nop

    .line 230
    nop

    .line 231
    nop

    .line 217
    const/4 v9, 0x0

    move/from16 v23, v10

    .end local v10    # "softWrap":Z
    .local v23, "softWrap":Z
    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p0

    move-object v15, v4

    move/from16 v38, v5

    move v6, v8

    move/from16 v37, v11

    move-object/from16 v2, v21

    move/from16 v4, v22

    move/from16 v5, v23

    move-object/from16 v11, v27

    move-object v8, v0

    move-object/from16 v0, v18

    .end local v8    # "maxLines":I
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v21    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v22    # "overflow":I
    .end local v23    # "softWrap":Z
    .end local v27    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "overflow":I
    .local v5, "softWrap":Z
    .local v6, "maxLines":I
    .local v11, "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .local v15, "$composer":Landroidx/compose/runtime/Composer;
    .local v37, "$dirty1":I
    .local v38, "$dirty":I
    invoke-static/range {v0 .. v14}, Landroidx/compose/foundation/text/BasicTextKt;->textModifier-CL7eQgs(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 233
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v4    # "overflow":I
    .end local v5    # "softWrap":Z
    .restart local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v21    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local v22    # "overflow":I
    .restart local v23    # "softWrap":Z
    sget-object v0, Landroidx/compose/foundation/text/EmptyMeasurePolicy;->INSTANCE:Landroidx/compose/foundation/text/EmptyMeasurePolicy;

    check-cast v0, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 215
    const/16 v2, 0x30

    .local v0, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v2, "$changed$iv":I
    .local v8, "modifier$iv":Landroidx/compose/ui/Modifier;
    const/4 v4, 0x0

    .line 762
    .local v4, "$i$f$Layout":I
    const v5, 0x207baf9a

    const-string v9, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh"

    invoke-static {v15, v5, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 763
    const/4 v5, 0x0

    invoke-static {v15, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 764
    .local v5, "compositeKeyHash$iv":I
    invoke-static {v15, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 765
    .local v9, "materialized$iv":Landroidx/compose/ui/Modifier;
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v10

    .line 767
    .local v10, "localMap$iv":Landroidx/compose/runtime/CompositionLocalMap;
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    .line 766
    const/16 v16, 0x6

    .local v13, "factory$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v16, "$changed$iv$iv":I
    const/16 v17, 0x0

    .line 768
    .local v17, "$i$f$ReusableComposeNode":I
    move/from16 p1, v2

    .end local v2    # "$changed$iv":I
    .local p1, "$changed$iv":I
    const v2, 0x53ca7ea5

    move-object/from16 p2, v3

    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local p2, "onTextLayout":Lkotlin/jvm/functions/Function1;
    const-string v3, "CC(ReusableComposeNode):Composables.kt#9igjgp"

    invoke-static {v15, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 769
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v2

    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    if-nez v2, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 770
    :cond_34
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 771
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-eqz v2, :cond_35

    .line 772
    invoke-interface {v15, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_28

    .line 774
    :cond_35
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 776
    :goto_28
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .local v2, "$this$Layout_u24lambda_u241$iv":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 777
    .local v3, "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    sget-object v24, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move/from16 p3, v3

    .end local v3    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    .local p3, "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v2, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 778
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v2, v10, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 779
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v2, v9, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 780
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .local v3, "block$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v24, 0x0

    .line 781
    .local v24, "$i$f$set-impl":I
    move-object/from16 p4, v2

    .local p4, "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v25, 0x0

    .line 782
    .local v25, "$i$a$-with-Updater$set$1$iv$iv":I
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v26

    if-nez v26, :cond_37

    move-object/from16 p5, v0

    .end local v0    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local p5, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    move/from16 p6, v4

    .end local v4    # "$i$f$Layout":I
    .local p6, "$i$f$Layout":I
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    goto :goto_29

    :cond_36
    move-object/from16 v4, p4

    goto :goto_2a

    .end local p5    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local p6    # "$i$f$Layout":I
    .restart local v0    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v4    # "$i$f$Layout":I
    :cond_37
    move-object/from16 p5, v0

    move/from16 p6, v4

    .line 783
    .end local v0    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v4    # "$i$f$Layout":I
    .restart local p5    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local p6    # "$i$f$Layout":I
    :goto_29
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v4, p4

    .end local p4    # "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .local v4, "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 784
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 786
    :goto_2a
    nop

    .line 781
    .end local v4    # "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v25    # "$i$a$-with-Updater$set$1$iv$iv":I
    nop

    .line 786
    nop

    .line 787
    .end local v3    # "block$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v24    # "$i$f$set-impl":I
    nop

    .line 776
    .end local v2    # "$this$Layout_u24lambda_u241$iv":Landroidx/compose/runtime/Composer;
    .end local p3    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    nop

    .line 788
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 768
    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 789
    nop

    .line 762
    .end local v13    # "factory$iv$iv":Lkotlin/jvm/functions/Function0;
    .end local v16    # "$changed$iv$iv":I
    .end local v17    # "$i$f$ReusableComposeNode":I
    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 790
    nop

    .line 213
    .end local v5    # "compositeKeyHash$iv":I
    .end local v8    # "modifier$iv":Landroidx/compose/ui/Modifier;
    .end local v9    # "materialized$iv":Landroidx/compose/ui/Modifier;
    .end local v10    # "localMap$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local p1    # "$changed$iv":I
    .end local p5    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local p6    # "$i$f$Layout":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v3, p2

    move-object/from16 v31, v15

    goto/16 :goto_30

    .end local v6    # "maxLines":I
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v23    # "softWrap":Z
    .end local v37    # "$dirty1":I
    .end local v38    # "$dirty":I
    .end local p2    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$dirty":I
    .local v8, "maxLines":I
    .local v10, "softWrap":Z
    .local v11, "$dirty1":I
    .restart local v27    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    :cond_38
    move-object/from16 v1, p0

    move-object/from16 p2, v3

    move-object v15, v4

    move/from16 v38, v5

    move v6, v8

    move/from16 v23, v10

    move/from16 v37, v11

    move-object/from16 v11, v27

    const/4 v5, 0x0

    .line 235
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .end local v8    # "maxLines":I
    .end local v10    # "softWrap":Z
    .end local v27    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .restart local v6    # "maxLines":I
    .local v11, "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v23    # "softWrap":Z
    .restart local v37    # "$dirty1":I
    .restart local v38    # "$dirty":I
    .restart local p2    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    const v2, -0x5e555555

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "237@11821L39,250@12319L7,253@12442L292,239@11870L907"

    invoke-static {v15, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 238
    const v2, -0x138f13e5

    invoke-static {v15, v2, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v2, v38, 0xe

    const/4 v3, 0x4

    if-ne v2, v3, :cond_39

    move/from16 v9, v25

    goto :goto_2b

    :cond_39
    move v9, v5

    .local v9, "invalid$iv":Z
    :goto_2b
    move-object v2, v15

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 791
    .local v3, "$i$f$cache":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 792
    .local v5, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v9, :cond_3b

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v4, v8, :cond_3a

    goto :goto_2c

    .line 796
    :cond_3a
    move/from16 p1, v3

    goto :goto_2d

    .line 793
    :cond_3b
    :goto_2c
    const/4 v8, 0x0

    .line 238
    .local v8, "$i$a$-cache-BasicTextKt$BasicText$displayedText$2":I
    move/from16 p1, v3

    const/4 v3, 0x2

    const/4 v10, 0x0

    .end local v3    # "$i$f$cache":I
    .local p1, "$i$f$cache":I
    invoke-static {v1, v10, v3, v10}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v3

    .line 793
    .end local v8    # "$i$a$-cache-BasicTextKt$BasicText$displayedText$2":I
    nop

    .line 794
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 795
    move-object v4, v3

    .line 791
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2d
    nop

    .line 238
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "invalid$iv":Z
    .end local p1    # "$i$f$cache":I
    move-object v2, v4

    check-cast v2, Landroidx/compose/runtime/MutableState;

    .local v2, "displayedText$delegate":Landroidx/compose/runtime/MutableState;
    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 241
    nop

    .line 242
    invoke-static {v2}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText_CL7eQgs$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v17

    .line 243
    nop

    .line 244
    nop

    .line 245
    nop

    .line 246
    nop

    .line 247
    nop

    .line 248
    nop

    .line 249
    nop

    .line 250
    nop

    .line 251
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v4, 0x0

    .local v4, "$changed$iv":I
    const/4 v5, 0x0

    .line 797
    .local v5, "$i$f$getCurrent":I
    const v9, 0x789c5f52

    invoke-static {v15, v9, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v4    # "$changed$iv":I
    .end local v5    # "$i$f$getCurrent":I
    move-object/from16 v26, v0

    check-cast v26, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 252
    nop

    .line 253
    nop

    .line 254
    const v0, -0x138ec548

    invoke-static {v15, v0, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid$iv":Z
    move-object v3, v15

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 798
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 799
    .local v8, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_3d

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_3c

    goto :goto_2e

    .line 803
    :cond_3c
    goto :goto_2f

    .line 800
    :cond_3d
    :goto_2e
    const/4 v9, 0x0

    .line 254
    .local v9, "$i$a$-cache-BasicTextKt$BasicText$2":I
    new-instance v10, Landroidx/compose/foundation/text/BasicTextKt$BasicText$2$1;

    invoke-direct {v10, v2}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$2$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 800
    .end local v9    # "$i$a$-cache-BasicTextKt$BasicText$2":I
    nop

    .line 801
    .local v10, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 802
    move-object v5, v10

    .line 798
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v10    # "value$iv":Ljava/lang/Object;
    :goto_2f
    nop

    .line 254
    .end local v0    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    move-object/from16 v29, v5

    check-cast v29, Lkotlin/jvm/functions/Function1;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 262
    shr-int/lit8 v0, v38, 0x3

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v3, v38, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v0, v3

    shr-int/lit8 v3, v38, 0xc

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v38, 0x9

    const/high16 v4, 0x70000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v38, 0x6

    const/high16 v4, 0x380000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v38, 0x6

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v38, 0x6

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v38, 0x6

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int v32, v0, v3

    shr-int/lit8 v0, v38, 0x15

    and-int/lit16 v0, v0, 0x380

    shl-int/lit8 v3, v37, 0xc

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v33, v0, v3

    .line 240
    const/16 v34, 0x0

    move/from16 v24, v6

    move/from16 v25, v7

    move-object/from16 v27, v11

    move-object/from16 v28, v12

    move-object/from16 v30, v14

    move-object/from16 v31, v15

    move-object/from16 v16, v18

    move-object/from16 v18, p2

    .end local v6    # "maxLines":I
    .end local v7    # "minLines":I
    .end local v11    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .end local v12    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local v14    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p2    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v16, "modifier":Landroidx/compose/ui/Modifier;
    .local v18, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v24, "maxLines":I
    .local v25, "minLines":I
    .restart local v27    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .local v28, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v30, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v34}, Landroidx/compose/foundation/text/BasicTextKt;->LayoutWithLinksAndInlineContent-11Od_4g(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V

    .line 235
    move-object/from16 v3, v18

    move-object/from16 v18, v16

    .end local v2    # "displayedText$delegate":Landroidx/compose/runtime/MutableState;
    .end local v16    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v24    # "maxLines":I
    .end local v25    # "minLines":I
    .end local v27    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .end local v28    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local v30    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v6    # "maxLines":I
    .restart local v7    # "minLines":I
    .restart local v11    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .restart local v12    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local v14    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v18, "modifier":Landroidx/compose/ui/Modifier;
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_30
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 265
    .end local v11    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .end local v19    # "hasInlineContent":Z
    .end local v35    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .end local v36    # "hasLinks":Z
    :cond_3e
    move-object v4, v3

    move v8, v7

    move-object v10, v12

    move-object v11, v14

    move-object/from16 v2, v18

    move-object/from16 v9, v20

    move-object/from16 v3, v21

    move/from16 v5, v22

    move v7, v6

    move/from16 v6, v23

    goto :goto_31

    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v7    # "minLines":I
    .end local v12    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local v14    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v20    # "inlineContent":Ljava/util/Map;
    .end local v21    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v22    # "overflow":I
    .end local v23    # "softWrap":Z
    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v37    # "$dirty1":I
    .end local v38    # "$dirty":I
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$dirty":I
    .local v6, "$dirty1":I
    .local p1, "modifier":Landroidx/compose/ui/Modifier;
    .local p2, "style":Landroidx/compose/ui/text/TextStyle;
    .local p3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local p4, "overflow":I
    .local p5, "softWrap":Z
    .local p6, "maxLines":I
    .restart local p7    # "minLines":I
    .restart local p8    # "inlineContent":Ljava/util/Map;
    .restart local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local p10    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :cond_3f
    move-object/from16 v1, p0

    move-object/from16 v31, v4

    move/from16 v38, v5

    move/from16 v37, v6

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v37    # "$dirty1":I
    .restart local v38    # "$dirty":I
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move v5, v8

    move-object v2, v10

    move-object v3, v12

    move-object v4, v14

    move/from16 v8, p7

    move-object/from16 v10, p9

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "minLines":I
    .end local p8    # "inlineContent":Ljava/util/Map;
    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local p10    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "minLines":I
    .local v9, "inlineContent":Ljava/util/Map;
    .local v10, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v11, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :goto_31
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_40

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$3;

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$3;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_40
    return-void
.end method

.method public static final synthetic BasicText-RWo7tUw(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "inlineContent"    # Ljava/util/Map;
    .param p9, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 344
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, -0x3f70023c

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)344@17259L194:BasicText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p11

    .local v2, "$dirty":I
    and-int/lit8 v3, v12, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v13, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_2

    move-object/from16 v13, p0

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v13, p0

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v12, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v12, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v11, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v2, v9

    goto :goto_7

    :cond_b
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v9, v12, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v10, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v11, 0x6000

    if-nez v10, :cond_e

    move/from16 v10, p4

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    move/from16 v10, p4

    :goto_9
    and-int/lit8 v14, v12, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v11

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    and-int/lit8 v16, v12, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v17, v11, v17

    if-nez v17, :cond_14

    move/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    move/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v12, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v18

    move/from16 v18, v0

    move/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v18, v11, v18

    if-nez v18, :cond_17

    move/from16 v18, v0

    move/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v2, v2, v19

    goto :goto_f

    :cond_17
    move/from16 v18, v0

    move/from16 v0, p7

    :goto_f
    and-int/lit16 v0, v12, 0x100

    const/high16 v19, 0x6000000

    if-eqz v0, :cond_18

    or-int v2, v2, v19

    move/from16 v19, v0

    move-object/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v19, v11, v19

    if-nez v19, :cond_1a

    move/from16 v19, v0

    move-object/from16 v0, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v20, 0x2000000

    :goto_10
    or-int v2, v2, v20

    goto :goto_11

    :cond_1a
    move/from16 v19, v0

    move-object/from16 v0, p8

    :goto_11
    and-int/lit16 v0, v12, 0x200

    const/high16 v20, 0x30000000

    if-eqz v0, :cond_1b

    or-int v2, v2, v20

    move/from16 v20, v0

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v20, v11, v20

    if-nez v20, :cond_1d

    move/from16 v20, v0

    move-object/from16 v0, p9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_12
    or-int v2, v2, v21

    goto :goto_13

    :cond_1d
    move/from16 v20, v0

    move-object/from16 v0, p9

    :goto_13
    const v21, 0x12492493

    and-int v0, v2, v21

    move/from16 p10, v3

    const v3, 0x12492492

    if-eq v0, v3, :cond_1e

    const/4 v0, 0x1

    goto :goto_14

    :cond_1e
    const/4 v0, 0x0

    :goto_14
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2a

    if-eqz p10, :cond_1f

    .line 335
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move/from16 v28, v14

    move-object v14, v0

    move/from16 v0, v28

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_15

    .line 344
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_1f
    move v0, v14

    move-object v14, v4

    .line 335
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v14, "modifier":Landroidx/compose/ui/Modifier;
    :goto_15
    if-eqz v5, :cond_20

    .line 336
    sget-object v3, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v3

    move-object v15, v3

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_16

    .line 335
    .end local v3    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_20
    move-object v15, v6

    .line 336
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v15, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_16
    if-eqz v7, :cond_21

    .line 337
    const/4 v3, 0x0

    move/from16 v28, v16

    move-object/from16 v16, v3

    move/from16 v3, v28

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_17

    .line 336
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_21
    move/from16 v3, v16

    move-object/from16 v16, v8

    .line 337
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v16, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_17
    if-eqz v9, :cond_22

    .line 338
    sget-object v4, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v4

    move/from16 v17, v4

    const v4, -0x3f70023c

    .end local p4    # "overflow":I
    .local v4, "overflow":I
    goto :goto_18

    .line 337
    .end local v4    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_22
    move/from16 v17, v10

    const v4, -0x3f70023c

    .line 338
    .end local p4    # "overflow":I
    .local v17, "overflow":I
    :goto_18
    if-eqz v0, :cond_23

    .line 339
    const/4 v0, 0x1

    move/from16 v28, v18

    move/from16 v18, v0

    move/from16 v0, v28

    .end local p5    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_19

    .line 338
    .end local v0    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_23
    move/from16 v0, v18

    move/from16 v18, p5

    .line 339
    .end local p5    # "softWrap":Z
    .local v18, "softWrap":Z
    :goto_19
    if-eqz v3, :cond_24

    .line 340
    const v3, 0x7fffffff

    move/from16 v28, v19

    move/from16 v19, v3

    move/from16 v3, v28

    .end local p6    # "maxLines":I
    .local v3, "maxLines":I
    goto :goto_1a

    .line 339
    .end local v3    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_24
    move/from16 v3, v19

    move/from16 v19, p6

    .line 340
    .end local p6    # "maxLines":I
    .local v19, "maxLines":I
    :goto_1a
    if-eqz v0, :cond_25

    .line 341
    const/4 v0, 0x1

    move/from16 v28, v20

    move/from16 v20, v0

    move/from16 v0, v28

    .end local p7    # "minLines":I
    .local v0, "minLines":I
    goto :goto_1b

    .line 340
    .end local v0    # "minLines":I
    .restart local p7    # "minLines":I
    :cond_25
    move/from16 v0, v20

    move/from16 v20, p7

    .line 341
    .end local p7    # "minLines":I
    .local v20, "minLines":I
    :goto_1b
    if-eqz v3, :cond_26

    .line 342
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    move-object/from16 v21, v3

    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v3, "inlineContent":Ljava/util/Map;
    goto :goto_1c

    .line 341
    .end local v3    # "inlineContent":Ljava/util/Map;
    .restart local p8    # "inlineContent":Ljava/util/Map;
    :cond_26
    move-object/from16 v21, p8

    .line 342
    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v21, "inlineContent":Ljava/util/Map;
    :goto_1c
    if-eqz v0, :cond_27

    .line 343
    const/4 v0, 0x0

    move-object/from16 v22, v0

    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v0, "color":Landroidx/compose/ui/graphics/ColorProducer;
    goto :goto_1d

    .line 342
    .end local v0    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :cond_27
    move-object/from16 v22, p9

    .line 343
    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v22, "color":Landroidx/compose/ui/graphics/ColorProducer;
    :goto_1d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_28

    .line 344
    const/4 v0, -0x1

    const-string v3, "androidx.compose.foundation.text.BasicText (BasicText.kt:343)"

    invoke-static {v4, v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 346
    :cond_28
    nop

    .line 347
    nop

    .line 348
    nop

    .line 349
    nop

    .line 350
    nop

    .line 351
    nop

    .line 352
    nop

    .line 353
    nop

    .line 354
    nop

    .line 355
    and-int/lit8 v0, v2, 0xe

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

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000000

    and-int/2addr v3, v2

    or-int v25, v0, v3

    .line 345
    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x400

    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-CL7eQgs(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 357
    :cond_29
    move-object v4, v14

    move-object v3, v15

    move-object/from16 v8, v16

    move/from16 v5, v17

    move/from16 v6, v18

    move/from16 v7, v19

    move-object/from16 v9, v21

    move-object/from16 v10, v22

    goto :goto_1e

    .end local v14    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v16    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v17    # "overflow":I
    .end local v18    # "softWrap":Z
    .end local v19    # "maxLines":I
    .end local v20    # "minLines":I
    .end local v21    # "inlineContent":Ljava/util/Map;
    .end local v22    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local v24    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "overflow":I
    .restart local p5    # "softWrap":Z
    .restart local p6    # "maxLines":I
    .restart local p7    # "minLines":I
    .restart local p8    # "inlineContent":Ljava/util/Map;
    .restart local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :cond_2a
    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v24    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v7, p6

    move/from16 v20, p7

    move-object/from16 v9, p8

    move-object v3, v6

    move v5, v10

    move/from16 v6, p5

    move-object/from16 v10, p9

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "minLines":I
    .end local p8    # "inlineContent":Ljava/util/Map;
    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v9, "inlineContent":Ljava/util/Map;
    .local v10, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local v20    # "minLines":I
    :goto_1e
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_2b

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$5;

    move-object/from16 v1, p0

    move v14, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v8, v20

    .end local v20    # "minLines":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v8, "minLines":I
    .local v14, "$dirty":I
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$5;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1f

    .end local v14    # "$dirty":I
    .local v2, "$dirty":I
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v20    # "minLines":I
    :cond_2b
    move v14, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v8, v20

    .end local v20    # "minLines":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v8, "minLines":I
    .restart local v14    # "$dirty":I
    :goto_1f
    return-void
.end method

.method public static final BasicText-RWo7tUw(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p9, "autoSize"    # Landroidx/compose/foundation/text/TextAutoSize;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;IZII",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Landroidx/compose/foundation/text/TextAutoSize;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 102
    move-object/from16 v1, p0

    move-object/from16 v0, p9

    move/from16 v11, p11

    move/from16 v12, p12

    const v2, -0x3e089999

    move-object/from16 v3, p10

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const-string v4, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)103@5400L7,148@7222L41:BasicText.kt#423gt5"

    invoke-static {v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v4, p11

    .local v4, "$dirty":I
    and-int/lit8 v5, v12, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v4, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v11, 0x6

    if-nez v5, :cond_2

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v4, v5

    :cond_2
    :goto_1
    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_3

    :cond_5
    move-object/from16 v7, p1

    :goto_3
    and-int/lit8 v8, v12, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v4, v4, 0x180

    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v11, 0x180

    if-nez v9, :cond_8

    move-object/from16 v9, p2

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, v12, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v4, v4, 0xc00

    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v11, 0xc00

    if-nez v13, :cond_b

    move-object/from16 v13, p3

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    goto :goto_7

    :cond_b
    move-object/from16 v13, p3

    :goto_7
    and-int/lit8 v14, v12, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v11, 0x6000

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    goto :goto_9

    :cond_e
    move/from16 v15, p4

    :goto_9
    and-int/lit8 v16, v12, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v17

    move/from16 v6, p5

    goto :goto_b

    :cond_f
    and-int v17, v11, v17

    if-nez v17, :cond_11

    move/from16 v6, p5

    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v4, v4, v17

    goto :goto_b

    :cond_11
    move/from16 v6, p5

    :goto_b
    and-int/lit8 v17, v12, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v4, v4, v18

    move/from16 v2, p6

    goto :goto_d

    :cond_12
    and-int v18, v11, v18

    if-nez v18, :cond_14

    move/from16 v2, p6

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v19, 0x80000

    :goto_c
    or-int v4, v4, v19

    goto :goto_d

    :cond_14
    move/from16 v2, p6

    :goto_d
    and-int/lit16 v1, v12, 0x80

    const/high16 v19, 0xc00000

    if-eqz v1, :cond_15

    or-int v4, v4, v19

    move/from16 v19, v1

    move/from16 v1, p7

    goto :goto_f

    :cond_15
    and-int v19, v11, v19

    if-nez v19, :cond_17

    move/from16 v19, v1

    move/from16 v1, p7

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v4, v4, v20

    goto :goto_f

    :cond_17
    move/from16 v19, v1

    move/from16 v1, p7

    :goto_f
    and-int/lit16 v1, v12, 0x100

    const/high16 v20, 0x6000000

    if-eqz v1, :cond_18

    or-int v4, v4, v20

    move/from16 v20, v1

    move-object/from16 v1, p8

    goto :goto_11

    :cond_18
    and-int v20, v11, v20

    if-nez v20, :cond_1a

    move/from16 v20, v1

    move-object/from16 v1, p8

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_19

    const/high16 v21, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v21, 0x2000000

    :goto_10
    or-int v4, v4, v21

    goto :goto_11

    :cond_1a
    move/from16 v20, v1

    move-object/from16 v1, p8

    :goto_11
    and-int/lit16 v1, v12, 0x200

    const/high16 v21, 0x30000000

    if-eqz v1, :cond_1b

    :goto_12
    or-int v4, v4, v21

    goto :goto_14

    :cond_1b
    and-int v21, v11, v21

    if-nez v21, :cond_1e

    const/high16 v21, 0x40000000    # 2.0f

    and-int v21, v11, v21

    if-nez v21, :cond_1c

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    goto :goto_13

    :cond_1c
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    :goto_13
    if-eqz v21, :cond_1d

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v21, 0x10000000

    goto :goto_12

    :cond_1e
    :goto_14
    const v21, 0x12492493

    and-int v0, v4, v21

    move/from16 v21, v1

    const v1, 0x12492492

    if-eq v0, v1, :cond_1f

    const/4 v0, 0x1

    goto :goto_15

    :cond_1f
    const/4 v0, 0x0

    :goto_15
    and-int/lit8 v1, v4, 0x1

    invoke-interface {v3, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_36

    if-eqz v5, :cond_20

    .line 93
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v7, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v7, "modifier":Landroidx/compose/ui/Modifier;
    :cond_20
    if-eqz v8, :cond_21

    .line 94
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move-object/from16 v24, v0

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v0, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_16

    .line 93
    .end local v0    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_21
    move-object/from16 v24, v9

    .line 94
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v24, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_16
    if-eqz v10, :cond_22

    .line 95
    const/4 v0, 0x0

    move-object/from16 v25, v0

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v0, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_17

    .line 94
    .end local v0    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_22
    move-object/from16 v25, v13

    .line 95
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v25, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_17
    if-eqz v14, :cond_23

    .line 96
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v0

    move/from16 v26, v0

    .end local p4    # "overflow":I
    .local v0, "overflow":I
    goto :goto_18

    .line 95
    .end local v0    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_23
    move/from16 v26, v15

    .line 96
    .end local p4    # "overflow":I
    .local v26, "overflow":I
    :goto_18
    if-eqz v16, :cond_24

    .line 97
    const/4 v0, 0x1

    move/from16 v27, v0

    .end local p5    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_19

    .line 96
    .end local v0    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_24
    move/from16 v27, v6

    .line 97
    .end local p5    # "softWrap":Z
    .local v27, "softWrap":Z
    :goto_19
    if-eqz v17, :cond_25

    .line 98
    const v0, 0x7fffffff

    .end local p6    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_1a

    .line 97
    .end local v0    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_25
    move/from16 v0, p6

    .line 98
    .end local p6    # "maxLines":I
    .restart local v0    # "maxLines":I
    :goto_1a
    if-eqz v19, :cond_26

    .line 99
    const/4 v1, 0x1

    .end local p7    # "minLines":I
    .local v1, "minLines":I
    goto :goto_1b

    .line 98
    .end local v1    # "minLines":I
    .restart local p7    # "minLines":I
    :cond_26
    move/from16 v1, p7

    .line 99
    .end local p7    # "minLines":I
    .restart local v1    # "minLines":I
    :goto_1b
    if-eqz v20, :cond_27

    .line 100
    const/4 v5, 0x0

    move-object/from16 v34, v5

    .end local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v5, "color":Landroidx/compose/ui/graphics/ColorProducer;
    goto :goto_1c

    .line 99
    .end local v5    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :cond_27
    move-object/from16 v34, p8

    .line 100
    .end local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v34, "color":Landroidx/compose/ui/graphics/ColorProducer;
    :goto_1c
    if-eqz v21, :cond_28

    .line 101
    const/4 v5, 0x0

    move-object/from16 v36, v5

    .end local p9    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v5, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    goto :goto_1d

    .line 100
    .end local v5    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .restart local p9    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :cond_28
    move-object/from16 v36, p9

    .line 101
    .end local p9    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v36, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :goto_1d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_29

    .line 102
    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.text.BasicText (BasicText.kt:101)"

    const v8, -0x3e089999

    invoke-static {v8, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 103
    :cond_29
    invoke-static {v1, v0}, Landroidx/compose/foundation/text/HeightInLinesModifierKt;->validateMinMaxLines(II)V

    .line 104
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionRegistrarKt;->getLocalSelectionRegistrar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/CompositionLocal;

    .local v5, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v6, 0x6

    .local v6, "$changed$iv":I
    const/4 v8, 0x0

    .line 702
    .local v8, "$i$f$getCurrent":I
    const v9, 0x789c5f52

    const-string v10, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v3, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 104
    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v6    # "$changed$iv":I
    .end local v8    # "$i$f$getCurrent":I
    move-object v5, v13

    check-cast v5, Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 106
    .local v5, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    if-eqz v5, :cond_2e

    const v8, -0x5eb3338a

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "106@5548L7,108@5702L77,108@5619L160,111@5792L180"

    invoke-static {v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 107
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/CompositionLocal;

    .local v8, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v13, 0x6

    .local v13, "$changed$iv":I
    const/4 v14, 0x0

    .line 703
    .local v14, "$i$f$getCurrent":I
    invoke-static {v3, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v8    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v13    # "$changed$iv":I
    .end local v14    # "$i$f$getCurrent":I
    check-cast v15, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 107
    invoke-virtual {v15}, Landroidx/compose/foundation/text/selection/TextSelectionColors;->getBackgroundColor-0d7_KjU()J

    move-result-wide v13

    .line 109
    .local v13, "backgroundSelectionColor":J
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Landroidx/compose/foundation/text/BasicTextKt;->selectionIdSaver(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v15

    const v2, -0x1392109f

    const-string v6, "CC(remember):BasicText.kt#9igjgp"

    invoke-static {v3, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv":Z
    move-object v6, v3

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 704
    .local v18, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 705
    .local v20, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_2b

    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v28, v0

    .end local v0    # "maxLines":I
    .local v28, "maxLines":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v9, v0, :cond_2a

    goto :goto_1e

    .line 709
    :cond_2a
    goto :goto_1f

    .line 705
    .end local v28    # "maxLines":I
    .restart local v0    # "maxLines":I
    :cond_2b
    move/from16 v28, v0

    .line 706
    .end local v0    # "maxLines":I
    .restart local v28    # "maxLines":I
    :goto_1e
    const/4 v0, 0x0

    .line 109
    .local v0, "$i$a$-cache-BasicTextKt$BasicText$selectionController$selectableId$1":I
    move/from16 p1, v0

    .end local v0    # "$i$a$-cache-BasicTextKt$BasicText$selectionController$selectableId$1":I
    .local p1, "$i$a$-cache-BasicTextKt$BasicText$selectionController$selectableId$1":I
    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectionController$selectableId$1$1;

    invoke-direct {v0, v5}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectionController$selectableId$1$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 706
    .end local p1    # "$i$a$-cache-BasicTextKt$BasicText$selectionController$selectableId$1":I
    nop

    .line 707
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 708
    move-object v9, v0

    .line 704
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_1f
    nop

    .line 109
    .end local v2    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache":I
    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    const/4 v2, 0x4

    const/4 v6, 0x0

    move/from16 p6, v0

    move/from16 p7, v2

    move-object/from16 p5, v3

    move-object/from16 p3, v6

    move-object/from16 p1, v8

    move-object/from16 p4, v9

    move-object/from16 p2, v15

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .local p5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p1 .. p7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v2, p5

    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    .line 108
    nop

    .line 112
    .local v8, "selectableId":J
    const v0, -0x139204f8

    const-string v3, "CC(remember):BasicText.kt#9igjgp"

    invoke-static {v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface {v2, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v3

    or-int/2addr v0, v3

    .local v0, "invalid$iv":Z
    move-object v3, v2

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 710
    .local v6, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 711
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_2d

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v21, v0

    .end local v0    # "invalid$iv":Z
    .local v21, "invalid$iv":Z
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v15, v0, :cond_2c

    goto :goto_20

    .line 715
    :cond_2c
    move-wide/from16 v37, v13

    move-wide v13, v8

    move-wide/from16 v8, v37

    move-object v0, v5

    goto :goto_21

    .line 711
    .end local v21    # "invalid$iv":Z
    .restart local v0    # "invalid$iv":Z
    :cond_2d
    move/from16 v21, v0

    .line 712
    .end local v0    # "invalid$iv":Z
    .restart local v21    # "invalid$iv":Z
    :goto_20
    const/4 v0, 0x0

    .line 113
    .local v0, "$i$a$-cache-BasicTextKt$BasicText$selectionController$1":I
    new-instance v20, Landroidx/compose/foundation/text/modifiers/SelectionController;

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v29, 0x0

    move-object/from16 p4, v5

    move-wide/from16 p2, v8

    move-wide/from16 p5, v13

    move-object/from16 p1, v20

    move/from16 p8, v22

    move-object/from16 p9, v23

    move-object/from16 p7, v29

    .end local v5    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .end local v8    # "selectableId":J
    .end local v13    # "backgroundSelectionColor":J
    .local p2, "selectableId":J
    .local p4, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .local p5, "backgroundSelectionColor":J
    invoke-direct/range {p1 .. p9}, Landroidx/compose/foundation/text/modifiers/SelectionController;-><init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 712
    move-object/from16 v5, p1

    move-wide/from16 v13, p2

    move-object/from16 v0, p4

    move-wide/from16 v8, p5

    .line 713
    .end local p2    # "selectableId":J
    .end local p4    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .end local p5    # "backgroundSelectionColor":J
    .local v0, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .local v5, "value$iv":Ljava/lang/Object;
    .local v8, "backgroundSelectionColor":J
    .local v13, "selectableId":J
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 714
    move-object v15, v5

    .line 710
    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_21
    nop

    .line 112
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    .end local v21    # "invalid$iv":Z
    check-cast v15, Landroidx/compose/foundation/text/modifiers/SelectionController;

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 106
    .end local v8    # "backgroundSelectionColor":J
    .end local v13    # "selectableId":J
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v33, v15

    goto :goto_22

    .line 115
    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v28    # "maxLines":I
    .local v0, "maxLines":I
    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    :cond_2e
    move/from16 v28, v0

    move-object v2, v3

    move-object v0, v5

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v5    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .local v0, "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .restart local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v28    # "maxLines":I
    const v3, -0x5eabb4ee

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 116
    const/16 v33, 0x0

    .line 106
    :goto_22
    nop

    .line 105
    nop

    .line 119
    .local v33, "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    if-nez v33, :cond_30

    if-nez v25, :cond_30

    if-eqz v36, :cond_2f

    move/from16 v29, v1

    move-object/from16 v1, p0

    goto :goto_23

    .line 136
    :cond_2f
    const v3, -0x5e9f82a6

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "140@6983L7"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 137
    nop

    .line 138
    new-instance v3, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    .line 139
    nop

    .line 140
    nop

    .line 141
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/CompositionLocal;

    .local v5, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v6, 0x0

    .local v6, "$changed$iv":I
    const/4 v8, 0x0

    .line 717
    .local v8, "$i$f$getCurrent":I
    const v9, 0x789c5f52

    invoke-static {v2, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v6    # "$changed$iv":I
    .end local v8    # "$i$f$getCurrent":I
    check-cast v9, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 142
    nop

    .line 143
    nop

    .line 144
    nop

    .line 145
    nop

    .line 146
    nop

    .line 138
    const/4 v5, 0x0

    move-object/from16 p2, p0

    move/from16 p8, v1

    move-object/from16 p1, v3

    move-object/from16 p10, v5

    move-object/from16 p4, v9

    move-object/from16 p3, v24

    move/from16 p5, v26

    move/from16 p6, v27

    move/from16 p7, v28

    move-object/from16 p9, v34

    .end local v1    # "minLines":I
    .end local v24    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v26    # "overflow":I
    .end local v27    # "softWrap":Z
    .end local v28    # "maxLines":I
    .end local v34    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local p3, "style":Landroidx/compose/ui/text/TextStyle;
    .local p5, "overflow":I
    .local p6, "softWrap":Z
    .local p7, "maxLines":I
    .local p8, "minLines":I
    .local p9, "color":Landroidx/compose/ui/graphics/ColorProducer;
    invoke-direct/range {p1 .. p10}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, p2

    move/from16 v29, p8

    .end local p3    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p5    # "overflow":I
    .end local p6    # "softWrap":Z
    .end local p7    # "maxLines":I
    .end local p8    # "minLines":I
    .end local p9    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local v24    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local v26    # "overflow":I
    .restart local v27    # "softWrap":Z
    .restart local v28    # "maxLines":I
    .local v29, "minLines":I
    .restart local v34    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 137
    invoke-interface {v7, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 136
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v22, v7

    goto :goto_24

    .line 119
    .end local v29    # "minLines":I
    .restart local v1    # "minLines":I
    :cond_30
    move/from16 v29, v1

    move-object/from16 v1, p0

    .end local v1    # "minLines":I
    .restart local v29    # "minLines":I
    :goto_23
    const v3, -0x5ea952fb

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "127@6494L7"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 120
    nop

    .line 121
    new-instance v3, Landroidx/compose/ui/text/AnnotatedString;

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v3, v1, v5, v6, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 122
    nop

    .line 123
    nop

    .line 124
    nop

    .line 125
    nop

    .line 126
    nop

    .line 127
    nop

    .line 128
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/CompositionLocal;

    .restart local v5    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v6, 0x0

    .restart local v6    # "$changed$iv":I
    const/4 v8, 0x0

    .line 716
    .restart local v8    # "$i$f$getCurrent":I
    const v9, 0x789c5f52

    invoke-static {v2, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v5    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v6    # "$changed$iv":I
    .end local v8    # "$i$f$getCurrent":I
    move-object/from16 v30, v9

    check-cast v30, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 129
    nop

    .line 130
    nop

    .line 131
    nop

    .line 132
    nop

    .line 133
    nop

    .line 134
    nop

    .line 120
    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    move-object/from16 v23, v3

    move-object/from16 v22, v7

    .end local v7    # "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "modifier":Landroidx/compose/ui/Modifier;
    invoke-static/range {v22 .. v36}, Landroidx/compose/foundation/text/BasicTextKt;->textModifier-CL7eQgs(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 119
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_24
    nop

    .line 118
    nop

    .line 149
    .local v3, "finalModifier":Landroidx/compose/ui/Modifier;
    sget-object v5, Landroidx/compose/foundation/text/EmptyMeasurePolicy;->INSTANCE:Landroidx/compose/foundation/text/EmptyMeasurePolicy;

    check-cast v5, Landroidx/compose/ui/layout/MeasurePolicy;

    .local v5, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    const/16 v6, 0x30

    .restart local v6    # "$changed$iv":I
    const/4 v7, 0x0

    .line 718
    .local v7, "$i$f$Layout":I
    const v8, 0x207baf9a

    const-string v9, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh"

    invoke-static {v2, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 719
    const/4 v8, 0x0

    invoke-static {v2, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v8

    .line 720
    .local v8, "compositeKeyHash$iv":I
    invoke-static {v2, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 721
    .local v9, "materialized$iv":Landroidx/compose/ui/Modifier;
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v10

    .line 723
    .local v10, "localMap$iv":Landroidx/compose/runtime/CompositionLocalMap;
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    .line 722
    const/4 v14, 0x6

    .local v13, "factory$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v14, "$changed$iv$iv":I
    const/4 v15, 0x0

    .line 724
    .local v15, "$i$f$ReusableComposeNode":I
    move-object/from16 p4, v0

    .end local v0    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .restart local p4    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    const v0, 0x53ca7ea5

    const-string v1, "CC(ReusableComposeNode):Composables.kt#9igjgp"

    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 725
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_31

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 726
    :cond_31
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 727
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_32

    .line 728
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_25

    .line 730
    :cond_32
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 732
    :goto_25
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .local v0, "$this$Layout_u24lambda_u241$iv":Landroidx/compose/runtime/Composer;
    const/4 v1, 0x0

    .line 733
    .local v1, "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move/from16 p1, v1

    .end local v1    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    .local p1, "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 734
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v10, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 735
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0, v9, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 736
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .local v1, "block$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v16, 0x0

    .line 737
    .local v16, "$i$f$set-impl":I
    move-object/from16 p2, v0

    .local p2, "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 738
    .local v17, "$i$a$-with-Updater$set$1$iv$iv":I
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v18

    if-nez v18, :cond_34

    move-object/from16 v18, v2

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v18, "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 p3, v3

    .end local v3    # "finalModifier":Landroidx/compose/ui/Modifier;
    .local p3, "finalModifier":Landroidx/compose/ui/Modifier;
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_33

    goto :goto_26

    :cond_33
    move-object/from16 v3, p2

    goto :goto_27

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p3    # "finalModifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v3    # "finalModifier":Landroidx/compose/ui/Modifier;
    :cond_34
    move-object/from16 v18, v2

    move-object/from16 p3, v3

    .line 739
    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v3    # "finalModifier":Landroidx/compose/ui/Modifier;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p3    # "finalModifier":Landroidx/compose/ui/Modifier;
    :goto_26
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, p2

    .end local p2    # "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 740
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 742
    :goto_27
    nop

    .line 737
    .end local v3    # "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$a$-with-Updater$set$1$iv$iv":I
    nop

    .line 742
    nop

    .line 743
    .end local v1    # "block$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v16    # "$i$f$set-impl":I
    nop

    .line 732
    .end local v0    # "$this$Layout_u24lambda_u241$iv":Landroidx/compose/runtime/Composer;
    .end local p1    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv":I
    nop

    .line 744
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 724
    invoke-static/range {v18 .. v18}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 745
    nop

    .line 718
    .end local v13    # "factory$iv$iv":Lkotlin/jvm/functions/Function0;
    .end local v14    # "$changed$iv$iv":I
    .end local v15    # "$i$f$ReusableComposeNode":I
    invoke-static/range {v18 .. v18}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 746
    nop

    .end local v5    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v6    # "$changed$iv":I
    .end local v7    # "$i$f$Layout":I
    .end local v8    # "compositeKeyHash$iv":I
    .end local v9    # "materialized$iv":Landroidx/compose/ui/Modifier;
    .end local v10    # "localMap$iv":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 150
    .end local v33    # "selectionController":Landroidx/compose/foundation/text/modifiers/SelectionController;
    .end local p3    # "finalModifier":Landroidx/compose/ui/Modifier;
    .end local p4    # "selectionRegistrar":Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    :cond_35
    move v0, v4

    move-object/from16 v2, v22

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    move/from16 v5, v26

    move/from16 v6, v27

    move/from16 v7, v28

    move/from16 v8, v29

    move-object/from16 v9, v34

    move-object/from16 v10, v36

    goto :goto_28

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v22    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v24    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v25    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v26    # "overflow":I
    .end local v27    # "softWrap":Z
    .end local v28    # "maxLines":I
    .end local v29    # "minLines":I
    .end local v34    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local v36    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    .local p1, "modifier":Landroidx/compose/ui/Modifier;
    .local p2, "style":Landroidx/compose/ui/text/TextStyle;
    .local p3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local p4, "overflow":I
    .local p5, "softWrap":Z
    .local p6, "maxLines":I
    .local p7, "minLines":I
    .local p8, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local p9, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :cond_36
    move-object/from16 v18, v3

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v8, p7

    move-object/from16 v10, p9

    move v0, v4

    move-object v2, v7

    move-object v3, v9

    move-object v4, v13

    move v5, v15

    move/from16 v7, p6

    move-object/from16 v9, p8

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "minLines":I
    .end local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local p9    # "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    .local v0, "$dirty":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "minLines":I
    .local v9, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v10, "autoSize":Landroidx/compose/foundation/text/TextAutoSize;
    :goto_28
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_37

    move v1, v0

    .end local v0    # "$dirty":I
    .local v1, "$dirty":I
    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$1;

    move v14, v1

    move-object/from16 v1, p0

    .end local v1    # "$dirty":I
    .local v14, "$dirty":I
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$1;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_29

    .end local v14    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_37
    move v14, v0

    .end local v0    # "$dirty":I
    .restart local v14    # "$dirty":I
    :goto_29
    return-void
.end method

.method public static final synthetic BasicText-VhcvRP8(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .param p0, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "inlineContent"    # Ljava/util/Map;
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compat"
    .end annotation

    .line 433
    move/from16 v10, p10

    move/from16 v11, p11

    const v0, 0x32bf773b

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)432@19757L280:BasicText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p10

    .local v2, "$dirty":I
    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    move-object/from16 v12, p0

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v11, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v2, v9

    goto :goto_7

    :cond_b
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v9, v11, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v10, 0x6000

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
    and-int/lit8 v14, v11, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v10

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    and-int/lit8 v16, v11, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v17, v10, v17

    if-nez v17, :cond_14

    move/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    move/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v11, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v18

    move/from16 v18, v0

    move/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v18, v10, v18

    if-nez v18, :cond_17

    move/from16 v18, v0

    move/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v2, v2, v19

    goto :goto_f

    :cond_17
    move/from16 v18, v0

    move/from16 v0, p7

    :goto_f
    and-int/lit16 v0, v11, 0x100

    const/high16 v19, 0x6000000

    if-eqz v0, :cond_18

    or-int v2, v2, v19

    move/from16 v19, v0

    move-object/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v19, v10, v19

    if-nez v19, :cond_1a

    move/from16 v19, v0

    move-object/from16 v0, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v20, 0x2000000

    :goto_10
    or-int v2, v2, v20

    goto :goto_11

    :cond_1a
    move/from16 v19, v0

    move-object/from16 v0, p8

    :goto_11
    const v20, 0x2492493

    and-int v0, v2, v20

    move/from16 p9, v3

    const v3, 0x2492492

    if-eq v0, v3, :cond_1b

    const/4 v0, 0x1

    goto :goto_12

    :cond_1b
    const/4 v0, 0x0

    :goto_12
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_26

    if-eqz p9, :cond_1c

    .line 424
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v13, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_13

    .line 433
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_1c
    move-object v13, v4

    .line 424
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    :goto_13
    if-eqz v5, :cond_1d

    .line 425
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move/from16 v27, v14

    move-object v14, v0

    move/from16 v0, v27

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v0, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_14

    .line 424
    .end local v0    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_1d
    move v0, v14

    move-object v14, v6

    .line 425
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v14, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_14
    if-eqz v7, :cond_1e

    .line 426
    const/4 v3, 0x0

    move-object v15, v3

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_15

    .line 425
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_1e
    move-object v15, v8

    .line 426
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v15, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_15
    if-eqz v9, :cond_1f

    .line 427
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v3

    move/from16 v27, v16

    move/from16 v16, v3

    move/from16 v3, v27

    .end local p4    # "overflow":I
    .local v3, "overflow":I
    goto :goto_16

    .line 426
    .end local v3    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_1f
    move/from16 v3, v16

    move/from16 v16, p4

    .line 427
    .end local p4    # "overflow":I
    .local v16, "overflow":I
    :goto_16
    if-eqz v0, :cond_20

    .line 428
    const/4 v0, 0x1

    move/from16 v17, v0

    const v0, 0x32bf773b

    .end local p5    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_17

    .line 427
    .end local v0    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_20
    move/from16 v17, p5

    const v0, 0x32bf773b

    .line 428
    .end local p5    # "softWrap":Z
    .local v17, "softWrap":Z
    :goto_17
    if-eqz v3, :cond_21

    .line 429
    const v3, 0x7fffffff

    move/from16 v27, v18

    move/from16 v18, v3

    move/from16 v3, v27

    .end local p6    # "maxLines":I
    .local v3, "maxLines":I
    goto :goto_18

    .line 428
    .end local v3    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_21
    move/from16 v3, v18

    move/from16 v18, p6

    .line 429
    .end local p6    # "maxLines":I
    .local v18, "maxLines":I
    :goto_18
    if-eqz v3, :cond_22

    .line 430
    const/4 v3, 0x1

    move/from16 v27, v19

    move/from16 v19, v3

    move/from16 v3, v27

    .end local p7    # "minLines":I
    .local v3, "minLines":I
    goto :goto_19

    .line 429
    .end local v3    # "minLines":I
    .restart local p7    # "minLines":I
    :cond_22
    move/from16 v3, v19

    move/from16 v19, p7

    .line 430
    .end local p7    # "minLines":I
    .local v19, "minLines":I
    :goto_19
    if-eqz v3, :cond_23

    .line 431
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    move-object/from16 v20, v3

    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v3, "inlineContent":Ljava/util/Map;
    goto :goto_1a

    .line 430
    .end local v3    # "inlineContent":Ljava/util/Map;
    .restart local p8    # "inlineContent":Ljava/util/Map;
    :cond_23
    move-object/from16 v20, p8

    .line 431
    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v20, "inlineContent":Ljava/util/Map;
    :goto_1a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_24

    .line 433
    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.BasicText (BasicText.kt:432)"

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 434
    :cond_24
    nop

    .line 435
    nop

    .line 436
    nop

    .line 437
    nop

    .line 438
    nop

    .line 439
    nop

    .line 440
    nop

    .line 441
    nop

    .line 442
    and-int/lit8 v0, v2, 0xe

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

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    or-int v24, v0, v3

    .line 433
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x600

    move-object/from16 v23, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v23, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v12 .. v26}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-CL7eQgs(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 443
    :cond_25
    move-object v4, v13

    move-object v3, v14

    move-object v8, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move/from16 v7, v18

    move-object/from16 v9, v20

    goto :goto_1b

    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v14    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v15    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v16    # "overflow":I
    .end local v17    # "softWrap":Z
    .end local v18    # "maxLines":I
    .end local v19    # "minLines":I
    .end local v20    # "inlineContent":Ljava/util/Map;
    .end local v23    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "overflow":I
    .restart local p5    # "softWrap":Z
    .restart local p6    # "maxLines":I
    .restart local p7    # "minLines":I
    .restart local p8    # "inlineContent":Ljava/util/Map;
    :cond_26
    move-object/from16 v23, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v23    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v19, p7

    move-object/from16 v9, p8

    move-object v3, v6

    move/from16 v6, p5

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "minLines":I
    .end local p8    # "inlineContent":Ljava/util/Map;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v9, "inlineContent":Ljava/util/Map;
    .restart local v19    # "minLines":I
    :goto_1b
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_27

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$9;

    move-object/from16 v1, p0

    move v13, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v8, v19

    .end local v19    # "minLines":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v8, "minLines":I
    .local v13, "$dirty":I
    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$9;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1c

    .end local v13    # "$dirty":I
    .local v2, "$dirty":I
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v19    # "minLines":I
    :cond_27
    move v13, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v8, v19

    .end local v19    # "minLines":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v8, "minLines":I
    .restart local v13    # "$dirty":I
    :goto_1c
    return-void
.end method

.method public static final synthetic BasicText-VhcvRP8(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 302
    move/from16 v10, p10

    move/from16 v11, p11

    const v0, -0x46bd8e2e

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)302@14843L93:BasicText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p10

    .local v2, "$dirty":I
    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    move-object/from16 v12, p0

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v11, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v2, v9

    goto :goto_7

    :cond_b
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v9, v11, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v13, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v10, 0x6000

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
    and-int/lit8 v14, v11, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    move/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v10

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    and-int/lit8 v16, v11, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v2, v2, v17

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v17, v10, v17

    if-nez v17, :cond_14

    move/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    move/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v11, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v18

    move/from16 v18, v0

    move/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v18, v10, v18

    if-nez v18, :cond_17

    move/from16 v18, v0

    move/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v2, v2, v19

    goto :goto_f

    :cond_17
    move/from16 v18, v0

    move/from16 v0, p7

    :goto_f
    and-int/lit16 v0, v11, 0x100

    const/high16 v19, 0x6000000

    if-eqz v0, :cond_18

    or-int v2, v2, v19

    move/from16 v19, v0

    move-object/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v19, v10, v19

    if-nez v19, :cond_1a

    move/from16 v19, v0

    move-object/from16 v0, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v20, 0x2000000

    :goto_10
    or-int v2, v2, v20

    goto :goto_11

    :cond_1a
    move/from16 v19, v0

    move-object/from16 v0, p8

    :goto_11
    const v20, 0x2492493

    and-int v0, v2, v20

    move/from16 p9, v3

    const v3, 0x2492492

    if-eq v0, v3, :cond_1b

    const/4 v0, 0x1

    goto :goto_12

    :cond_1b
    const/4 v0, 0x0

    :goto_12
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_26

    if-eqz p9, :cond_1c

    .line 294
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v13, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_13

    .line 302
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_1c
    move-object v13, v4

    .line 294
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    :goto_13
    if-eqz v5, :cond_1d

    .line 295
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move/from16 v25, v14

    move-object v14, v0

    move/from16 v0, v25

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v0, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_14

    .line 294
    .end local v0    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_1d
    move v0, v14

    move-object v14, v6

    .line 295
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v14, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_14
    if-eqz v7, :cond_1e

    .line 296
    const/4 v3, 0x0

    move-object v15, v3

    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_15

    .line 295
    .end local v3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_1e
    move-object v15, v8

    .line 296
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v15, "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_15
    if-eqz v9, :cond_1f

    .line 297
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v3

    move/from16 v25, v16

    move/from16 v16, v3

    move/from16 v3, v25

    .end local p4    # "overflow":I
    .local v3, "overflow":I
    goto :goto_16

    .line 296
    .end local v3    # "overflow":I
    .restart local p4    # "overflow":I
    :cond_1f
    move/from16 v3, v16

    move/from16 v16, p4

    .line 297
    .end local p4    # "overflow":I
    .local v16, "overflow":I
    :goto_16
    if-eqz v0, :cond_20

    .line 298
    const/4 v0, 0x1

    move/from16 v17, v0

    const v0, -0x46bd8e2e

    .end local p5    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_17

    .line 297
    .end local v0    # "softWrap":Z
    .restart local p5    # "softWrap":Z
    :cond_20
    move/from16 v17, p5

    const v0, -0x46bd8e2e

    .line 298
    .end local p5    # "softWrap":Z
    .local v17, "softWrap":Z
    :goto_17
    if-eqz v3, :cond_21

    .line 299
    const v3, 0x7fffffff

    move/from16 v25, v18

    move/from16 v18, v3

    move/from16 v3, v25

    .end local p6    # "maxLines":I
    .local v3, "maxLines":I
    goto :goto_18

    .line 298
    .end local v3    # "maxLines":I
    .restart local p6    # "maxLines":I
    :cond_21
    move/from16 v3, v18

    move/from16 v18, p6

    .line 299
    .end local p6    # "maxLines":I
    .local v18, "maxLines":I
    :goto_18
    if-eqz v3, :cond_22

    .line 300
    const/4 v3, 0x1

    move/from16 v25, v19

    move/from16 v19, v3

    move/from16 v3, v25

    .end local p7    # "minLines":I
    .local v3, "minLines":I
    goto :goto_19

    .line 299
    .end local v3    # "minLines":I
    .restart local p7    # "minLines":I
    :cond_22
    move/from16 v3, v19

    move/from16 v19, p7

    .line 300
    .end local p7    # "minLines":I
    .local v19, "minLines":I
    :goto_19
    if-eqz v3, :cond_23

    .line 301
    const/4 v3, 0x0

    move-object/from16 v20, v3

    .end local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v3, "color":Landroidx/compose/ui/graphics/ColorProducer;
    goto :goto_1a

    .line 300
    .end local v3    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :cond_23
    move-object/from16 v20, p8

    .line 301
    .end local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v20, "color":Landroidx/compose/ui/graphics/ColorProducer;
    :goto_1a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_24

    .line 302
    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.BasicText (BasicText.kt:301)"

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 303
    :cond_24
    and-int/lit8 v0, v2, 0xe

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

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    or-int v23, v0, v3

    const/16 v24, 0x200

    const/16 v21, 0x0

    move-object/from16 v22, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v12 .. v24}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-RWo7tUw(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 304
    :cond_25
    move-object v4, v13

    move-object v3, v14

    move-object v8, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move/from16 v7, v18

    move-object/from16 v9, v20

    goto :goto_1b

    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v14    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v15    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v16    # "overflow":I
    .end local v17    # "softWrap":Z
    .end local v18    # "maxLines":I
    .end local v19    # "minLines":I
    .end local v20    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "overflow":I
    .restart local p5    # "softWrap":Z
    .restart local p6    # "maxLines":I
    .restart local p7    # "minLines":I
    .restart local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    :cond_26
    move-object/from16 v22, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v19, p7

    move-object/from16 v9, p8

    move-object v3, v6

    move/from16 v6, p5

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local p4    # "overflow":I
    .end local p5    # "softWrap":Z
    .end local p6    # "maxLines":I
    .end local p7    # "minLines":I
    .end local p8    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "overflow":I
    .local v6, "softWrap":Z
    .local v7, "maxLines":I
    .local v8, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v9, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .restart local v19    # "minLines":I
    :goto_1b
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_27

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$4;

    move-object/from16 v1, p0

    move v13, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v8, v19

    .end local v19    # "minLines":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v8, "minLines":I
    .local v13, "$dirty":I
    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$4;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1c

    .end local v13    # "$dirty":I
    .local v2, "$dirty":I
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v19    # "minLines":I
    :cond_27
    move v13, v2

    move-object v2, v4

    move-object v4, v8

    move/from16 v8, v19

    .end local v19    # "minLines":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v8, "minLines":I
    .restart local v13    # "$dirty":I
    :goto_1c
    return-void
.end method

.method private static final BasicText_CL7eQgs$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/AnnotatedString;
    .locals 4
    .param p0, "$displayedText$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            ">;)",
            "Landroidx/compose/ui/text/AnnotatedString;"
        }
    .end annotation

    .line 238
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 899
    .local v3, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/text/AnnotatedString;

    .line 238
    return-object v0
.end method

.method private static final BasicText_CL7eQgs$lambda$6(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/AnnotatedString;)V
    .locals 4
    .param p0, "$displayedText$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "value"    # Landroidx/compose/ui/text/AnnotatedString;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            ">;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            ")V"
        }
    .end annotation

    .line 238
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v3, 0x0

    .line 900
    .local v3, "$i$f$setValue":I
    invoke-interface {v2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 901
    nop

    .line 238
    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method private static final LayoutWithLinksAndInlineContent-11Od_4g(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V
    .locals 29
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p2, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p3, "hasInlineContent"    # Z
    .param p4, "inlineContent"    # Ljava/util/Map;
    .param p5, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "overflow"    # I
    .param p7, "softWrap"    # Z
    .param p8, "maxLines"    # I
    .param p9, "minLines"    # I
    .param p10, "fontFamilyResolver"    # Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .param p11, "selectionController"    # Landroidx/compose/foundation/text/modifiers/SelectionController;
    .param p12, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p13, "onShowTranslation"    # Lkotlin/jvm/functions/Function1;
    .param p14, "autoSize"    # Landroidx/compose/foundation/text/TextAutoSize;
    .param p15, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p16, "$changed"    # I
    .param p17, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "IZII",
            "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
            "Landroidx/compose/foundation/text/modifiers/SelectionController;",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/text/TextAutoSize;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 631
    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v15, p14

    move/from16 v0, p16

    move/from16 v1, p17

    move/from16 v5, p18

    const v6, -0x7e46da9f

    move-object/from16 v7, p15

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .end local p15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const-string v8, "C(LayoutWithLinksAndInlineContent)P(7,14,9,3,4,13,10:c#ui.text.style.TextOverflow,12,5,6,2,11,1,8)671@28101L117,662@27779L1426:BasicText.kt#423gt5"

    invoke-static {v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v8, p16

    .local v8, "$dirty":I
    move/from16 v9, p17

    .local v9, "$dirty1":I
    and-int/lit8 v10, v5, 0x1

    if-eqz v10, :cond_0

    or-int/lit8 v8, v8, 0x6

    move-object/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v0, 0x6

    if-nez v10, :cond_2

    move-object/from16 v10, p0

    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x4

    goto :goto_0

    :cond_1
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v8, v13

    goto :goto_1

    :cond_2
    move-object/from16 v10, p0

    :goto_1
    and-int/lit8 v13, v5, 0x2

    if-eqz v13, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v13, v0, 0x30

    if-nez v13, :cond_5

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x20

    goto :goto_2

    :cond_4
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v8, v13

    :cond_5
    :goto_3
    and-int/lit8 v13, v5, 0x4

    const/16 v16, 0x80

    if-eqz v13, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v13, v0, 0x180

    if-nez v13, :cond_8

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x100

    goto :goto_4

    :cond_7
    move/from16 v13, v16

    :goto_4
    or-int/2addr v8, v13

    :cond_8
    :goto_5
    and-int/lit8 v13, v5, 0x8

    const/16 v18, 0x800

    const/16 v19, 0x400

    if-eqz v13, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_b

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_a

    move/from16 v13, v18

    goto :goto_6

    :cond_a
    move/from16 v13, v19

    :goto_6
    or-int/2addr v8, v13

    :cond_b
    :goto_7
    and-int/lit8 v13, v5, 0x10

    const/16 v20, 0x4000

    const/16 v21, 0x2000

    if-eqz v13, :cond_c

    or-int/lit16 v8, v8, 0x6000

    move-object/from16 v14, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v0, 0x6000

    if-nez v14, :cond_e

    move-object/from16 v14, p4

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_d

    move/from16 v23, v20

    goto :goto_8

    :cond_d
    move/from16 v23, v21

    :goto_8
    or-int v8, v8, v23

    goto :goto_9

    :cond_e
    move-object/from16 v14, p4

    :goto_9
    and-int/lit8 v23, v5, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_f

    or-int v8, v8, v24

    move-object/from16 v12, p5

    goto :goto_b

    :cond_f
    and-int v23, v0, v24

    if-nez v23, :cond_11

    move-object/from16 v12, p5

    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v24, 0x10000

    :goto_a
    or-int v8, v8, v24

    goto :goto_b

    :cond_11
    move-object/from16 v12, p5

    :goto_b
    and-int/lit8 v24, v5, 0x40

    if-eqz v24, :cond_12

    const/high16 v24, 0x180000

    or-int v8, v8, v24

    move/from16 v11, p6

    goto :goto_d

    :cond_12
    const/high16 v24, 0x180000

    and-int v24, v0, v24

    if-nez v24, :cond_14

    move/from16 v11, p6

    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v25, 0x80000

    :goto_c
    or-int v8, v8, v25

    goto :goto_d

    :cond_14
    move/from16 v11, p6

    :goto_d
    and-int/lit16 v6, v5, 0x80

    if-eqz v6, :cond_15

    const/high16 v6, 0xc00000

    or-int/2addr v8, v6

    move/from16 v6, p7

    goto :goto_f

    :cond_15
    const/high16 v6, 0xc00000

    and-int/2addr v6, v0

    if-nez v6, :cond_17

    move/from16 v6, p7

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v26

    if-eqz v26, :cond_16

    const/high16 v26, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v26, 0x400000

    :goto_e
    or-int v8, v8, v26

    goto :goto_f

    :cond_17
    move/from16 v6, p7

    :goto_f
    and-int/lit16 v0, v5, 0x100

    if-eqz v0, :cond_18

    const/high16 v0, 0x6000000

    or-int/2addr v8, v0

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    const/high16 v0, 0x6000000

    and-int v0, p16, v0

    if-nez v0, :cond_1a

    move/from16 v0, p8

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v26

    if-eqz v26, :cond_19

    const/high16 v26, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v26, 0x2000000

    :goto_10
    or-int v8, v8, v26

    goto :goto_11

    :cond_1a
    move/from16 v0, p8

    :goto_11
    and-int/lit16 v0, v5, 0x200

    if-eqz v0, :cond_1b

    const/high16 v0, 0x30000000

    or-int/2addr v8, v0

    move/from16 v0, p9

    goto :goto_13

    :cond_1b
    const/high16 v0, 0x30000000

    and-int v0, p16, v0

    if-nez v0, :cond_1d

    move/from16 v0, p9

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v26

    if-eqz v26, :cond_1c

    const/high16 v26, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v26, 0x10000000

    :goto_12
    or-int v8, v8, v26

    goto :goto_13

    :cond_1d
    move/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v5, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v9, v9, 0x6

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_20

    move-object/from16 v0, p10

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1f

    const/16 v26, 0x4

    goto :goto_14

    :cond_1f
    const/16 v26, 0x2

    :goto_14
    or-int v9, v9, v26

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    :goto_15
    and-int/lit16 v0, v5, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v9, v9, 0x30

    move-object/from16 v0, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v0, v1, 0x30

    if-nez v0, :cond_23

    move-object/from16 v0, p11

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_22

    const/16 v17, 0x20

    goto :goto_16

    :cond_22
    const/16 v17, 0x10

    :goto_16
    or-int v9, v9, v17

    goto :goto_17

    :cond_23
    move-object/from16 v0, p11

    :goto_17
    and-int/lit16 v0, v5, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v9, v9, 0x180

    move-object/from16 v0, p12

    goto :goto_18

    :cond_24
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_25

    const/16 v16, 0x100

    :cond_25
    or-int v9, v9, v16

    goto :goto_18

    :cond_26
    move-object/from16 v0, p12

    :goto_18
    and-int/lit16 v0, v5, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v9, v9, 0xc00

    move-object/from16 v0, p13

    goto :goto_1a

    :cond_27
    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_29

    move-object/from16 v0, p13

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_28

    goto :goto_19

    :cond_28
    move/from16 v18, v19

    :goto_19
    or-int v9, v9, v18

    goto :goto_1a

    :cond_29
    move-object/from16 v0, p13

    :goto_1a
    and-int/lit16 v0, v5, 0x4000

    if-eqz v0, :cond_2a

    or-int/lit16 v9, v9, 0x6000

    goto :goto_1d

    :cond_2a
    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_2d

    const v0, 0x8000

    and-int/2addr v0, v1

    if-nez v0, :cond_2b

    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1b

    :cond_2b
    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    :goto_1b
    if-eqz v0, :cond_2c

    goto :goto_1c

    :cond_2c
    move/from16 v20, v21

    :goto_1c
    or-int v9, v9, v20

    :cond_2d
    :goto_1d
    move v0, v9

    .end local v9    # "$dirty1":I
    .local v0, "$dirty1":I
    const v9, 0x12492493

    and-int/2addr v9, v8

    const v1, 0x12492492

    const/16 v16, 0x1

    if-ne v9, v1, :cond_2f

    and-int/lit16 v1, v0, 0x2493

    const/16 v9, 0x2492

    if-eq v1, v9, :cond_2e

    goto :goto_1e

    :cond_2e
    const/4 v1, 0x0

    goto :goto_1f

    :cond_2f
    :goto_1e
    move/from16 v1, v16

    :goto_1f
    and-int/lit8 v9, v8, 0x1

    invoke-interface {v7, v1, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_54

    if-eqz v13, :cond_30

    .line 620
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .end local p4    # "inlineContent":Ljava/util/Map;
    .local v1, "inlineContent":Ljava/util/Map;
    goto :goto_20

    .line 631
    .end local v1    # "inlineContent":Ljava/util/Map;
    .restart local p4    # "inlineContent":Ljava/util/Map;
    :cond_30
    move-object v1, v14

    .line 620
    .end local p4    # "inlineContent":Ljava/util/Map;
    .restart local v1    # "inlineContent":Ljava/util/Map;
    :goto_20
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_31

    .line 631
    const-string v9, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:630)"

    const v13, -0x7e46da9f

    invoke-static {v13, v8, v0, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 634
    :cond_31
    invoke-static {v2}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNodeKt;->hasLinks(Landroidx/compose/ui/text/AnnotatedString;)Z

    move-result v9

    const-string v14, "CC(remember):BasicText.kt#9igjgp"

    if-eqz v9, :cond_35

    const v9, -0x249105e7

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v9, "634@26844L38"

    invoke-static {v7, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 635
    const v9, -0x11b2174f

    invoke-static {v7, v9, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v9, v8, 0x70

    const/16 p15, 0x0

    const/16 v4, 0x20

    if-ne v9, v4, :cond_32

    move/from16 v4, v16

    goto :goto_21

    :cond_32
    move/from16 v4, p15

    .local v4, "invalid$iv":Z
    :goto_21
    move-object v9, v7

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 815
    .local v17, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 816
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v4, :cond_34

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v20, v0

    .end local v0    # "$dirty1":I
    .local v20, "$dirty1":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v13, v0, :cond_33

    goto :goto_22

    .line 820
    :cond_33
    goto :goto_23

    .line 816
    .end local v20    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    :cond_34
    move/from16 v20, v0

    .line 817
    .end local v0    # "$dirty1":I
    .restart local v20    # "$dirty1":I
    :goto_22
    const/4 v0, 0x0

    .line 635
    .local v0, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$textScope$1":I
    move/from16 v19, v0

    .end local v0    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$textScope$1":I
    .local v19, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$textScope$1":I
    new-instance v0, Landroidx/compose/foundation/text/TextLinkScope;

    invoke-direct {v0, v2}, Landroidx/compose/foundation/text/TextLinkScope;-><init>(Landroidx/compose/ui/text/AnnotatedString;)V

    .line 817
    .end local v19    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$textScope$1":I
    nop

    .line 818
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 819
    move-object v13, v0

    .line 815
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_23
    nop

    .line 635
    .end local v4    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    move-object v0, v13

    check-cast v0, Landroidx/compose/foundation/text/TextLinkScope;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 634
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_24

    .line 636
    .end local v20    # "$dirty1":I
    .local v0, "$dirty1":I
    :cond_35
    move/from16 v20, v0

    const/16 p15, 0x0

    .end local v0    # "$dirty1":I
    .restart local v20    # "$dirty1":I
    const v0, -0x2490056e

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v0, 0x0

    .line 634
    :goto_24
    nop

    .line 633
    nop

    .line 641
    .local v0, "textScope":Landroidx/compose/foundation/text/TextLinkScope;
    invoke-static {v2}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNodeKt;->hasLinks(Landroidx/compose/ui/text/AnnotatedString;)Z

    move-result v4

    if-eqz v4, :cond_39

    const v4, -0x248cff27

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v4, "641@27109L70"

    invoke-static {v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 642
    const v4, -0x11b1f60f

    invoke-static {v7, v4, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, v8, 0x70

    const/16 v9, 0x20

    if-ne v4, v9, :cond_36

    move/from16 v4, v16

    goto :goto_25

    :cond_36
    move/from16 v4, p15

    :goto_25
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    .restart local v4    # "invalid$iv":Z
    move-object v9, v7

    .restart local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 821
    .local v13, "$i$f$cache":I
    move/from16 v17, v4

    .end local v4    # "invalid$iv":Z
    .local v17, "invalid$iv":Z
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 822
    .restart local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v17, :cond_38

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_37

    goto :goto_26

    .line 826
    :cond_37
    goto :goto_27

    .line 823
    :cond_38
    :goto_26
    const/4 v5, 0x0

    .line 642
    .local v5, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1":I
    move-object/from16 v19, v4

    .end local v4    # "it$iv":Ljava/lang/Object;
    .local v19, "it$iv":Ljava/lang/Object;
    new-instance v4, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1;

    invoke-direct {v4, v0, v2}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 823
    .end local v5    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1":I
    nop

    .line 824
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 825
    nop

    .line 821
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v19    # "it$iv":Ljava/lang/Object;
    :goto_27
    nop

    .line 642
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache":I
    .end local v17    # "invalid$iv":Z
    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 641
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2b

    .line 643
    :cond_39
    const v4, -0x248b8329

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v4, "643@27209L8"

    invoke-static {v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 644
    const v4, -0x11b1e9cd

    invoke-static {v7, v4, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, v8, 0x70

    const/16 v9, 0x20

    if-ne v4, v9, :cond_3a

    move/from16 v4, v16

    goto :goto_28

    :cond_3a
    move/from16 v4, p15

    .local v4, "invalid$iv":Z
    :goto_28
    move-object v5, v7

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 827
    .local v9, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 828
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v4, :cond_3c

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v4

    .end local v4    # "invalid$iv":Z
    .local v19, "invalid$iv":Z
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v13, v4, :cond_3b

    goto :goto_29

    .line 832
    :cond_3b
    goto :goto_2a

    .line 828
    .end local v19    # "invalid$iv":Z
    .restart local v4    # "invalid$iv":Z
    :cond_3c
    move/from16 v19, v4

    .line 829
    .end local v4    # "invalid$iv":Z
    .restart local v19    # "invalid$iv":Z
    :goto_29
    const/4 v4, 0x0

    .line 644
    .local v4, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2":I
    move/from16 v18, v4

    .end local v4    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2":I
    .local v18, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2":I
    new-instance v4, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1;-><init>(Landroidx/compose/ui/text/AnnotatedString;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 829
    .end local v18    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2":I
    nop

    .line 830
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 831
    move-object v13, v4

    .line 827
    .end local v4    # "value$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2a
    nop

    .line 644
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    .end local v19    # "invalid$iv":Z
    move-object v4, v13

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 643
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 641
    :goto_2b
    nop

    .line 640
    nop

    .line 649
    .local v4, "styledText":Lkotlin/jvm/functions/Function0;
    if-eqz p3, :cond_3d

    .line 650
    invoke-static {v2, v1}, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt;->resolveInlineContent(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)Lkotlin/Pair;

    move-result-object v5

    goto :goto_2c

    .line 651
    :cond_3d
    new-instance v5, Lkotlin/Pair;

    const/4 v9, 0x0

    invoke-direct {v5, v9, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 649
    :goto_2c
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 648
    nop

    .local v9, "placeholders":Ljava/util/List;
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v21, v5

    check-cast v21, Ljava/util/List;

    .line 654
    .local v21, "inlineComposables":Ljava/util/List;
    if-eqz p3, :cond_3f

    const v5, -0x2486b05e

    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "654@27526L61"

    invoke-static {v7, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 655
    const v5, -0x11b1c1f8

    invoke-static {v7, v5, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v5, 0x0

    .local v5, "invalid$iv":Z
    move-object v13, v7

    .local v13, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 833
    .local v17, "$i$f$cache":I
    move-object/from16 v24, v1

    .end local v1    # "inlineContent":Ljava/util/Map;
    .local v24, "inlineContent":Ljava/util/Map;
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 834
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v25, v4

    .end local v4    # "styledText":Lkotlin/jvm/functions/Function0;
    .local v25, "styledText":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_3e

    .line 835
    const/4 v4, 0x0

    .line 655
    .local v4, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$measuredPlaceholderPositions$1":I
    move-object/from16 v19, v1

    move/from16 p4, v4

    const/4 v1, 0x0

    const/4 v4, 0x2

    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$measuredPlaceholderPositions$1":I
    .local v19, "it$iv":Ljava/lang/Object;
    .local p4, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$measuredPlaceholderPositions$1":I
    invoke-static {v1, v1, v4, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    .line 835
    .end local p4    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$measuredPlaceholderPositions$1":I
    nop

    .line 836
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 837
    move-object/from16 v19, v4

    .end local v4    # "value$iv":Ljava/lang/Object;
    goto :goto_2d

    .line 838
    .end local v19    # "it$iv":Ljava/lang/Object;
    .restart local v1    # "it$iv":Ljava/lang/Object;
    :cond_3e
    move-object/from16 v19, v1

    const/4 v1, 0x0

    .line 833
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2d
    nop

    .line 655
    .end local v5    # "invalid$iv":Z
    .end local v13    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    move-object/from16 v4, v19

    check-cast v4, Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 654
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2e

    .line 656
    .end local v24    # "inlineContent":Ljava/util/Map;
    .end local v25    # "styledText":Lkotlin/jvm/functions/Function0;
    .local v1, "inlineContent":Ljava/util/Map;
    .local v4, "styledText":Lkotlin/jvm/functions/Function0;
    :cond_3f
    move-object/from16 v24, v1

    move-object/from16 v25, v4

    const/4 v1, 0x0

    .end local v1    # "inlineContent":Ljava/util/Map;
    .end local v4    # "styledText":Lkotlin/jvm/functions/Function0;
    .restart local v24    # "inlineContent":Ljava/util/Map;
    .restart local v25    # "styledText":Lkotlin/jvm/functions/Function0;
    const v4, -0x2485598e

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v4, v1

    .line 654
    :goto_2e
    nop

    .line 653
    nop

    .line 659
    .local v4, "measuredPlaceholderPositions":Landroidx/compose/runtime/MutableState;
    if-eqz p3, :cond_42

    const v1, -0x2483ed4d

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "659@27709L44"

    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 660
    const v1, -0x11b1ab29

    invoke-static {v7, v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid$iv":Z
    move-object v5, v7

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 839
    .local v13, "$i$f$cache":I
    move/from16 p4, v1

    .end local v1    # "invalid$iv":Z
    .local p4, "invalid$iv":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 840
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p4, :cond_41

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v1, v6, :cond_40

    goto :goto_2f

    .line 844
    :cond_40
    goto :goto_30

    .line 841
    :cond_41
    :goto_2f
    const/4 v6, 0x0

    .line 660
    .local v6, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1":I
    move-object/from16 v18, v1

    .end local v1    # "it$iv":Ljava/lang/Object;
    .local v18, "it$iv":Ljava/lang/Object;
    new-instance v1, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1;

    invoke-direct {v1, v4}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 841
    .end local v6    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1":I
    nop

    .line 842
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 843
    nop

    .line 839
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v18    # "it$iv":Ljava/lang/Object;
    :goto_30
    nop

    .line 660
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 659
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_31

    .line 661
    :cond_42
    const v5, -0x2482d64e

    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v13, v1

    .line 659
    :goto_31
    nop

    .line 658
    nop

    .line 669
    .local v13, "onPlaceholderLayout":Lkotlin/jvm/functions/Function1;
    nop

    .line 670
    invoke-interface/range {v25 .. v25}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/compose/ui/text/AnnotatedString;

    .line 671
    nop

    .line 672
    const v1, -0x11b179e0

    invoke-static {v7, v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v5, v8, 0x380

    move/from16 p4, v1

    const/16 v1, 0x100

    if-ne v5, v1, :cond_43

    goto :goto_32

    :cond_43
    move/from16 v16, p15

    :goto_32
    or-int v1, p4, v16

    .local v1, "invalid$iv":Z
    move-object v5, v7

    .restart local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 845
    .local v16, "$i$f$cache":I
    move/from16 p4, v1

    .end local v1    # "invalid$iv":Z
    .restart local p4    # "invalid$iv":Z
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 846
    .restart local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p4, :cond_45

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v19, v6

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v1, v6, :cond_44

    goto :goto_33

    .line 850
    :cond_44
    goto :goto_34

    .line 846
    :cond_45
    move-object/from16 v19, v6

    .line 847
    :goto_33
    const/4 v6, 0x0

    .line 672
    .local v6, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$2":I
    move-object/from16 v18, v1

    .end local v1    # "it$iv":Ljava/lang/Object;
    .restart local v18    # "it$iv":Ljava/lang/Object;
    new-instance v1, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$2$1;

    invoke-direct {v1, v0, v3}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$2$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 847
    .end local v6    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$2":I
    nop

    .line 848
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 849
    nop

    .line 845
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v18    # "it$iv":Ljava/lang/Object;
    :goto_34
    nop

    .line 672
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 676
    nop

    .line 677
    nop

    .line 678
    nop

    .line 679
    nop

    .line 680
    nop

    .line 681
    nop

    .line 682
    nop

    .line 683
    nop

    .line 684
    nop

    .line 685
    nop

    .line 686
    nop

    .line 669
    move-object/from16 v16, p11

    move-object/from16 v17, p12

    move-object/from16 v18, p13

    move/from16 v22, v8

    move-object v5, v10

    move-object v3, v14

    move-object/from16 v6, v19

    move/from16 v10, p7

    move-object v8, v1

    move-object v1, v7

    move-object v14, v9

    move v9, v11

    move-object v7, v12

    move-object/from16 v19, v15

    move/from16 v11, p8

    move/from16 v12, p9

    move-object v15, v13

    move-object/from16 v13, p10

    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "$dirty":I
    .end local v9    # "placeholders":Ljava/util/List;
    .end local v13    # "onPlaceholderLayout":Lkotlin/jvm/functions/Function1;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    .local v14, "placeholders":Ljava/util/List;
    .local v15, "onPlaceholderLayout":Lkotlin/jvm/functions/Function1;
    .local v22, "$dirty":I
    invoke-static/range {v5 .. v19}, Landroidx/compose/foundation/text/BasicTextKt;->textModifier-CL7eQgs(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 689
    if-nez p3, :cond_48

    const v5, -0x24736513

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "690@28867L55"

    invoke-static {v1, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 690
    nop

    .line 691
    const v5, -0x11b11a5e

    invoke-static {v1, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    .local v3, "invalid$iv":Z
    move-object v5, v1

    .restart local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 851
    .local v7, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 852
    .local v9, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_47

    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v8, v10, :cond_46

    goto :goto_35

    .line 856
    :cond_46
    goto :goto_36

    .line 853
    :cond_47
    :goto_35
    const/4 v10, 0x0

    .line 691
    .local v10, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$3":I
    new-instance v11, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$3$1;

    invoke-direct {v11, v0}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$3$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;)V

    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 853
    .end local v10    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$3":I
    nop

    .line 854
    .local v11, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 855
    move-object v8, v11

    .line 851
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v11    # "value$iv":Ljava/lang/Object;
    :goto_36
    nop

    .line 691
    .end local v3    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 690
    new-instance v3, Landroidx/compose/foundation/text/LinksTextMeasurePolicy;

    invoke-direct {v3, v8}, Landroidx/compose/foundation/text/LinksTextMeasurePolicy;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 689
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast v3, Landroidx/compose/ui/layout/MeasurePolicy;

    goto/16 :goto_3b

    .line 693
    :cond_48
    const v5, -0x2470b2b8

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "694@29038L55,695@29128L39"

    invoke-static {v1, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 694
    nop

    .line 695
    const v5, -0x11b104fe

    invoke-static {v1, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    .local v5, "invalid$iv":Z
    move-object v7, v1

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 857
    .local v8, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 858
    .local v10, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_4a

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v9, v11, :cond_49

    goto :goto_37

    .line 862
    :cond_49
    goto :goto_38

    .line 859
    :cond_4a
    :goto_37
    const/4 v11, 0x0

    .line 695
    .local v11, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$4":I
    new-instance v12, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$4$1;

    invoke-direct {v12, v0}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$4$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;)V

    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 859
    .end local v11    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$4":I
    nop

    .line 860
    .local v12, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 861
    move-object v9, v12

    .line 857
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v12    # "value$iv":Ljava/lang/Object;
    :goto_38
    nop

    .line 695
    .end local v5    # "invalid$iv":Z
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache":I
    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 696
    const v5, -0x11b0f9ce

    invoke-static {v1, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .restart local v3    # "invalid$iv":Z
    move-object v5, v1

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 863
    .local v7, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 864
    .restart local v10    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_4c

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_4b

    goto :goto_39

    .line 868
    :cond_4b
    goto :goto_3a

    .line 865
    :cond_4c
    :goto_39
    const/4 v11, 0x0

    .line 696
    .local v11, "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$5":I
    new-instance v12, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$5$1;

    invoke-direct {v12, v4}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$5$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 865
    .end local v11    # "$i$a$-cache-BasicTextKt$LayoutWithLinksAndInlineContent$5":I
    nop

    .line 866
    .restart local v12    # "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 867
    move-object v8, v12

    .line 863
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v12    # "value$iv":Ljava/lang/Object;
    :goto_3a
    nop

    .line 696
    .end local v3    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 694
    new-instance v3, Landroidx/compose/foundation/text/TextMeasurePolicy;

    invoke-direct {v3, v9, v8}, Landroidx/compose/foundation/text/TextMeasurePolicy;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 693
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast v3, Landroidx/compose/ui/layout/MeasurePolicy;

    :goto_3b
    nop

    .line 663
    nop

    .local v3, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    move/from16 v5, p15

    .local v5, "$changed$iv":I
    .local v6, "modifier$iv":Landroidx/compose/ui/Modifier;
    const/4 v7, 0x0

    .line 869
    .local v7, "$i$f$Layout":I
    const v8, -0x4ee9b9da

    const-string v9, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh"

    invoke-static {v1, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 870
    move/from16 v8, p15

    invoke-static {v1, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v9

    .line 871
    .local v9, "compositeKeyHash$iv":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v8

    .line 872
    .local v8, "localMap$iv":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v1, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    .line 874
    .local v10, "materialized$iv":Landroidx/compose/ui/Modifier;
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    shl-int/lit8 v12, v5, 0x6

    and-int/lit16 v12, v12, 0x380

    or-int/lit8 v12, v12, 0x6

    .line 873
    nop

    .local v11, "factory$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v12, "$changed$iv$iv":I
    const/4 v13, 0x0

    .line 875
    .local v13, "$i$f$ReusableComposeNode":I
    move-object/from16 p4, v4

    .end local v4    # "measuredPlaceholderPositions":Landroidx/compose/runtime/MutableState;
    .local p4, "measuredPlaceholderPositions":Landroidx/compose/runtime/MutableState;
    const v4, -0x2942ffcf

    move/from16 v16, v5

    .end local v5    # "$changed$iv":I
    .local v16, "$changed$iv":I
    const-string v5, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp"

    invoke-static {v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 876
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v4

    instance-of v4, v4, Landroidx/compose/runtime/Applier;

    if-nez v4, :cond_4d

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 877
    :cond_4d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 878
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-eqz v4, :cond_4e

    .line 879
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3c

    .line 881
    :cond_4e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 883
    :goto_3c
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .local v4, "$this$Layout_u24lambda_u240$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 884
    .local v5, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v18, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v18, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v4, v3, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 885
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v4, v8, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 886
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .local v1, "block$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v17, 0x0

    .line 887
    .local v17, "$i$f$set-impl":I
    move-object/from16 v19, v4

    .local v19, "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v23, 0x0

    .line 888
    .local v23, "$i$a$-with-Updater$set$1$iv$iv":I
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v26

    if-nez v26, :cond_50

    move-object/from16 v26, v3

    .end local v3    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v26, "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    move/from16 v27, v5

    .end local v5    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    .local v27, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4f

    goto :goto_3d

    :cond_4f
    move-object/from16 v5, v19

    goto :goto_3e

    .end local v26    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v27    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    .restart local v3    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v5    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    :cond_50
    move-object/from16 v26, v3

    move/from16 v27, v5

    .line 889
    .end local v3    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v5    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    .restart local v26    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v27    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    :goto_3d
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v5, v19

    .end local v19    # "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .local v5, "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 890
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 892
    :goto_3e
    nop

    .line 887
    .end local v5    # "$this$set_impl_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v23    # "$i$a$-with-Updater$set$1$iv$iv":I
    nop

    .line 892
    nop

    .line 893
    .end local v1    # "block$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v17    # "$i$f$set-impl":I
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v4, v10, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 894
    nop

    .line 883
    .end local v4    # "$this$Layout_u24lambda_u240$iv":Landroidx/compose/runtime/Composer;
    .end local v27    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv":I
    nop

    .line 895
    shr-int/lit8 v1, v12, 0x6

    and-int/lit8 v1, v1, 0xe

    .local v1, "$changed":I
    move-object/from16 v3, v18

    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 665
    .local v4, "$i$a$-Layout-BasicTextKt$LayoutWithLinksAndInlineContent$1":I
    const v5, -0x1e5fe07c

    move/from16 v17, v1

    .end local v1    # "$changed":I
    .local v17, "$changed":I
    const-string v1, "C:BasicText.kt#423gt5"

    invoke-static {v3, v5, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    if-nez v0, :cond_51

    const v1, -0x1e5fc1db

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_3f

    :cond_51
    const v1, 0x200d6d5c

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "664@27830L18"

    invoke-static {v3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Landroidx/compose/foundation/text/TextLinkScope;->LinksComposables(Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 666
    :goto_3f
    if-nez v21, :cond_52

    const v1, -0x1e5efb81

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 p15, v0

    goto :goto_40

    :cond_52
    const v1, -0x1e5efb80

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "*665@27886L48"

    invoke-static {v3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-object/from16 v1, v21

    .line 811
    .local v1, "it":Ljava/util/List;
    const/4 v5, 0x0

    .line 666
    .local v5, "$i$a$-let-BasicTextKt$LayoutWithLinksAndInlineContent$1$1":I
    shr-int/lit8 v19, v22, 0x3

    move-object/from16 p15, v0

    .end local v0    # "textScope":Landroidx/compose/foundation/text/TextLinkScope;
    .local p15, "textScope":Landroidx/compose/foundation/text/TextLinkScope;
    and-int/lit8 v0, v19, 0xe

    invoke-static {v2, v1, v3, v0}, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt;->InlineChildren(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    .end local v1    # "it":Ljava/util/List;
    .end local v5    # "$i$a$-let-BasicTextKt$LayoutWithLinksAndInlineContent$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 665
    :goto_40
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 667
    nop

    .line 895
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$a$-Layout-BasicTextKt$LayoutWithLinksAndInlineContent$1":I
    .end local v17    # "$changed":I
    nop

    .line 896
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 875
    invoke-static/range {v18 .. v18}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 897
    nop

    .line 869
    .end local v11    # "factory$iv$iv":Lkotlin/jvm/functions/Function0;
    .end local v12    # "$changed$iv$iv":I
    .end local v13    # "$i$f$ReusableComposeNode":I
    invoke-static/range {v18 .. v18}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 898
    nop

    .end local v6    # "modifier$iv":Landroidx/compose/ui/Modifier;
    .end local v7    # "$i$f$Layout":I
    .end local v8    # "localMap$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v9    # "compositeKeyHash$iv":I
    .end local v10    # "materialized$iv":Landroidx/compose/ui/Modifier;
    .end local v16    # "$changed$iv":I
    .end local v26    # "measurePolicy$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 700
    .end local v14    # "placeholders":Ljava/util/List;
    .end local v15    # "onPlaceholderLayout":Lkotlin/jvm/functions/Function1;
    .end local v21    # "inlineComposables":Ljava/util/List;
    .end local v25    # "styledText":Lkotlin/jvm/functions/Function0;
    .end local p4    # "measuredPlaceholderPositions":Landroidx/compose/runtime/MutableState;
    .end local p15    # "textScope":Landroidx/compose/foundation/text/TextLinkScope;
    :cond_53
    move-object/from16 v5, v24

    goto :goto_41

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v20    # "$dirty1":I
    .end local v22    # "$dirty":I
    .end local v24    # "inlineContent":Ljava/util/Map;
    .local v0, "$dirty1":I
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$dirty":I
    .local p4, "inlineContent":Ljava/util/Map;
    :cond_54
    move/from16 v20, v0

    move-object/from16 v18, v7

    move/from16 v22, v8

    .end local v0    # "$dirty1":I
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "$dirty":I
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$dirty1":I
    .restart local v22    # "$dirty":I
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v5, v14

    .end local p4    # "inlineContent":Ljava/util/Map;
    .local v5, "inlineContent":Ljava/util/Map;
    :goto_41
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_55

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$6;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v28, v1

    move-object/from16 v19, v18

    move-object/from16 v1, p0

    move/from16 v18, p18

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .local v19, "$composer":Landroidx/compose/runtime/Composer;
    invoke-direct/range {v0 .. v18}, Landroidx/compose/foundation/text/BasicTextKt$LayoutWithLinksAndInlineContent$6;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v28

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_42

    .end local v19    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_55
    move-object/from16 v19, v18

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v19    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_42
    return-void
.end method

.method public static final synthetic access$BasicText_CL7eQgs$lambda$6(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/AnnotatedString;)V
    .locals 0
    .param p0, "$displayedText$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "value"    # Landroidx/compose/ui/text/AnnotatedString;

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText_CL7eQgs$lambda$6(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/AnnotatedString;)V

    return-void
.end method

.method public static final synthetic access$LayoutWithLinksAndInlineContent-11Od_4g(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V
    .locals 0
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p2, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p3, "hasInlineContent"    # Z
    .param p4, "inlineContent"    # Ljava/util/Map;
    .param p5, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "overflow"    # I
    .param p7, "softWrap"    # Z
    .param p8, "maxLines"    # I
    .param p9, "minLines"    # I
    .param p10, "fontFamilyResolver"    # Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .param p11, "selectionController"    # Landroidx/compose/foundation/text/modifiers/SelectionController;
    .param p12, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p13, "onShowTranslation"    # Lkotlin/jvm/functions/Function1;
    .param p14, "autoSize"    # Landroidx/compose/foundation/text/TextAutoSize;
    .param p15, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p16, "$changed"    # I
    .param p17, "$changed1"    # I
    .param p18, "$default"    # I

    .line 1
    invoke-static/range {p0 .. p18}, Landroidx/compose/foundation/text/BasicTextKt;->LayoutWithLinksAndInlineContent-11Od_4g(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method

.method public static final synthetic access$measureWithTextRangeMeasureConstraints(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;
    .locals 1
    .param p0, "measurables"    # Ljava/util/List;
    .param p1, "shouldMeasureLinks"    # Lkotlin/jvm/functions/Function0;

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/BasicTextKt;->measureWithTextRangeMeasureConstraints(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final measureWithTextRangeMeasureConstraints(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;
    .locals 21
    .param p0, "measurables"    # Ljava/util/List;
    .param p1, "shouldMeasureLinks"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Landroidx/compose/ui/layout/Placeable;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;>;>;"
        }
    .end annotation

    .line 535
    invoke-interface/range {p1 .. p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 536
    new-instance v0, Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;

    invoke-direct {v0}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;-><init>()V

    .line 537
    .local v0, "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    move-object/from16 v1, p0

    .local v1, "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 804
    .local v2, "$i$f$fastMapIndexedNotNull":I
    nop

    .line 805
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 806
    .local v3, "target$iv":Ljava/util/ArrayList;
    move-object v4, v1

    .local v4, "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 807
    .local v5, "$i$f$fastForEachIndexed":I
    nop

    .line 808
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_0

    .line 809
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 810
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move v9, v6

    .local v9, "index$iv":I
    move-object v10, v8

    .local v10, "e$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 806
    .local v11, "$i$a$-fastForEachIndexed-ListUtilsKt$fastMapIndexedNotNull$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .local v12, "measurable":Landroidx/compose/ui/layout/Measurable;
    const/4 v13, 0x0

    .line 539
    .local v13, "$i$a$-fastMapIndexedNotNull-BasicTextKt$measureWithTextRangeMeasureConstraints$1":I
    invoke-interface {v12}, Landroidx/compose/ui/layout/Measurable;->getParentData()Ljava/lang/Object;

    move-result-object v14

    const-string/jumbo v15, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Landroidx/compose/foundation/text/TextRangeLayoutModifier;

    invoke-virtual {v14}, Landroidx/compose/foundation/text/TextRangeLayoutModifier;->getMeasurePolicy()Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;

    move-result-object v14

    .line 538
    nop

    .line 541
    .local v14, "rangeMeasurePolicy":Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;
    move-object v15, v14

    .line 811
    .local v15, "$this$measureWithTextRangeMeasureConstraints_u24lambda_u249_u24lambda_u248":Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;
    const/16 v16, 0x0

    .line 541
    .local v16, "$i$a$-with-BasicTextKt$measureWithTextRangeMeasureConstraints$1$rangeMeasureResult$1":I
    invoke-interface {v15, v0}, Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;->measure(Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;

    move-result-object v15

    .line 540
    .end local v15    # "$this$measureWithTextRangeMeasureConstraints_u24lambda_u249_u24lambda_u248":Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;
    .end local v16    # "$i$a$-with-BasicTextKt$measureWithTextRangeMeasureConstraints$1$rangeMeasureResult$1":I
    nop

    .line 543
    .local v15, "rangeMeasureResult":Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;
    nop

    .line 544
    move-object/from16 v16, v0

    .end local v0    # "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    .local v16, "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    sget-object v0, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 545
    move-object/from16 v17, v1

    .end local v1    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .local v17, "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    invoke-virtual {v15}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;->getWidth()I

    move-result v1

    .line 546
    move/from16 v18, v2

    .end local v2    # "$i$f$fastMapIndexedNotNull":I
    .local v18, "$i$f$fastMapIndexedNotNull":I
    invoke-virtual {v15}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;->getWidth()I

    move-result v2

    .line 547
    move-object/from16 v19, v3

    .end local v3    # "target$iv":Ljava/util/ArrayList;
    .local v19, "target$iv":Ljava/util/ArrayList;
    invoke-virtual {v15}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;->getHeight()I

    move-result v3

    .line 548
    move-object/from16 v20, v4

    .end local v4    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .local v20, "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    invoke-virtual {v15}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;->getHeight()I

    move-result v4

    .line 544
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/compose/ui/unit/Constraints$Companion;->fitPrioritizingWidth-Zbe2FdA(IIII)J

    move-result-wide v0

    .line 543
    invoke-interface {v12, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    .line 542
    nop

    .line 551
    .local v0, "placeable":Landroidx/compose/ui/layout/Placeable;
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {v15}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;->getPlace()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 806
    .end local v0    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v12    # "measurable":Landroidx/compose/ui/layout/Measurable;
    .end local v13    # "$i$a$-fastMapIndexedNotNull-BasicTextKt$measureWithTextRangeMeasureConstraints$1":I
    .end local v14    # "rangeMeasurePolicy":Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;
    .end local v15    # "rangeMeasureResult":Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;
    nop

    .line 812
    .local v1, "it$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 806
    .local v0, "$i$a$-let-ListUtilsKt$fastMapIndexedNotNull$2$1$iv":I
    move-object/from16 v2, v19

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 810
    .end local v0    # "$i$a$-let-ListUtilsKt$fastMapIndexedNotNull$2$1$iv":I
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v9    # "index$iv":I
    .end local v10    # "e$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEachIndexed-ListUtilsKt$fastMapIndexedNotNull$2$iv":I
    nop

    .line 808
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    goto :goto_0

    .end local v16    # "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    .end local v17    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastMapIndexedNotNull":I
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    .end local v20    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .local v0, "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    .local v1, "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .restart local v2    # "$i$f$fastMapIndexedNotNull":I
    .restart local v3    # "target$iv":Ljava/util/ArrayList;
    .restart local v4    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    :cond_0
    move-object/from16 v16, v0

    move-object/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    .line 813
    .end local v0    # "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    .end local v1    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastMapIndexedNotNull":I
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    .end local v4    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .end local v6    # "index$iv$iv":I
    .restart local v16    # "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    .restart local v17    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastMapIndexedNotNull":I
    .restart local v19    # "target$iv":Ljava/util/ArrayList;
    .restart local v20    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    nop

    .line 814
    .end local v5    # "$i$f$fastForEachIndexed":I
    .end local v20    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    move-object/from16 v0, v19

    check-cast v0, Ljava/util/List;

    .end local v16    # "textRangeLayoutMeasureScope":Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;
    .end local v17    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastMapIndexedNotNull":I
    .end local v19    # "target$iv":Ljava/util/ArrayList;
    goto :goto_1

    .line 554
    :cond_1
    const/4 v0, 0x0

    .line 535
    :goto_1
    return-object v0
.end method

.method private static final selectionIdSaver(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;
    .locals 2
    .param p0, "selectionRegistrar"    # Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
            ")",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 447
    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sget-object v1, Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$2;->INSTANCE:Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$2;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v0

    .line 450
    return-object v0
.end method

.method private static final textModifier-CL7eQgs(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;
    .locals 32
    .param p0, "$this$textModifier_u2dCL7eQgs"    # Landroidx/compose/ui/Modifier;
    .param p1, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p4, "overflow"    # I
    .param p5, "softWrap"    # Z
    .param p6, "maxLines"    # I
    .param p7, "minLines"    # I
    .param p8, "fontFamilyResolver"    # Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .param p9, "placeholders"    # Ljava/util/List;
    .param p10, "onPlaceholderLayout"    # Lkotlin/jvm/functions/Function1;
    .param p11, "selectionController"    # Landroidx/compose/foundation/text/modifiers/SelectionController;
    .param p12, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p13, "onShowTranslation"    # Lkotlin/jvm/functions/Function1;
    .param p14, "autoSize"    # Landroidx/compose/foundation/text/TextAutoSize;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;IZII",
            "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/text/modifiers/SelectionController;",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/text/TextAutoSize;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 574
    move-object/from16 v0, p0

    if-nez p11, :cond_0

    .line 576
    new-instance v1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    .line 577
    nop

    .line 578
    nop

    .line 579
    nop

    .line 580
    nop

    .line 581
    nop

    .line 582
    nop

    .line 583
    nop

    .line 584
    nop

    .line 585
    nop

    .line 586
    nop

    .line 587
    nop

    .line 588
    nop

    .line 589
    nop

    .line 590
    nop

    .line 576
    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v4, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v15, p13

    move-object/from16 v14, p14

    invoke-direct/range {v1 .. v16}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 575
    nop

    .line 592
    .local v1, "staticTextModifier":Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    return-object v2

    .line 595
    .end local v1    # "staticTextModifier":Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;
    :cond_0
    new-instance v17, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    .line 596
    nop

    .line 597
    nop

    .line 598
    nop

    .line 599
    nop

    .line 600
    nop

    .line 601
    nop

    .line 602
    nop

    .line 603
    nop

    .line 604
    nop

    .line 605
    nop

    .line 606
    nop

    .line 607
    nop

    .line 608
    nop

    .line 595
    const/16 v31, 0x0

    move-object/from16 v18, p1

    move-object/from16 v19, p2

    move-object/from16 v21, p3

    move/from16 v22, p4

    move/from16 v23, p5

    move/from16 v24, p6

    move/from16 v25, p7

    move-object/from16 v20, p8

    move-object/from16 v26, p9

    move-object/from16 v27, p10

    move-object/from16 v28, p11

    move-object/from16 v29, p12

    move-object/from16 v30, p14

    invoke-direct/range {v17 .. v31}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 594
    nop

    .line 610
    .local v17, "selectableTextModifier":Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;
    invoke-virtual/range {p11 .. p11}, Landroidx/compose/foundation/text/modifiers/SelectionController;->getModifier()Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v17

    check-cast v2, Landroidx/compose/ui/Modifier;

    invoke-interface {v1, v2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    return-object v1
.end method
