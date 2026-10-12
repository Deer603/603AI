.class public final Landroidx/compose/material3/internal/TextFieldImplKt;
.super Ljava/lang/Object;
.source "TextFieldImpl.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,501:1\n346#1,9:512\n357#1,4:525\n352#1:533\n365#1,2:534\n387#1,4:539\n364#1:547\n395#1,2:548\n399#1,4:553\n394#1:561\n407#1,3:562\n411#1,3:567\n406#1:586\n419#1,4:587\n418#1,13:600\n432#1:637\n1223#2,6:502\n1223#2,3:571\n1226#2,3:575\n1223#2,3:592\n1226#2,3:596\n1223#2,6:613\n1223#2,6:619\n1223#2,6:625\n1223#2,6:631\n1223#2,3:665\n1226#2,3:669\n1223#2,3:683\n1226#2,3:687\n708#3:508\n696#3:509\n708#3:510\n696#3:511\n1967#4:521\n1882#4,3:522\n1885#4,4:529\n1882#4,3:536\n1885#4,4:543\n1882#4,3:550\n1885#4,4:557\n1882#4,7:579\n1967#4:638\n1882#4,7:639\n1967#4:646\n1882#4,7:647\n1967#4:654\n1882#4,7:655\n1882#4,7:673\n1882#4,7:691\n68#5,2:565\n70#5:570\n71#5:574\n74#5:578\n70#5:591\n71#5:595\n74#5:599\n68#5,3:662\n71#5:668\n74#5:672\n68#5,3:680\n71#5:686\n74#5:690\n81#6:698\n81#6:699\n148#7:700\n148#7:701\n148#7:702\n148#7:703\n148#7:704\n148#7:705\n148#7:706\n148#7:707\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n*L\n122#1:512,9\n122#1:525,4\n122#1:533\n122#1:534,2\n122#1:539,4\n122#1:547\n122#1:548,2\n122#1:553,4\n122#1:561\n122#1:562,3\n122#1:567,3\n122#1:586\n122#1:587,4\n122#1:600,13\n122#1:637\n99#1:502,6\n122#1:571,3\n122#1:575,3\n122#1:592,3\n122#1:596,3\n156#1:613,6\n173#1:619,6\n254#1:625,6\n276#1:631,6\n407#1:665,3\n407#1:669,3\n419#1:683,3\n419#1:687,3\n126#1:508\n126#1:509\n130#1:510\n130#1:511\n122#1:521\n122#1:522,3\n122#1:529,4\n122#1:536,3\n122#1:543,4\n122#1:550,3\n122#1:557,4\n122#1:579,7\n353#1:638\n353#1:639,7\n365#1:646\n365#1:647,7\n395#1:654\n395#1:655,7\n407#1:673,7\n419#1:691,7\n122#1:565,2\n122#1:570\n122#1:574\n122#1:578\n122#1:591\n122#1:595\n122#1:599\n407#1:662,3\n407#1:668\n407#1:672\n419#1:680,3\n419#1:686\n419#1:690\n156#1:698\n173#1:699\n492#1:700\n493#1:701\n494#1:702\n495#1:703\n496#1:704\n497#1:705\n498#1:706\n500#1:707\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u00a0\u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03\u00a2\u0006\u0002\u000842\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0015\u0008\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0015\u0008\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0015\u0008\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0015\u0008\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0015\u0008\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0015\u0008\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103\u00a2\u0006\u0002\u000842\u0008\u0008\u0002\u0010>\u001a\u00020?2\u0008\u0008\u0002\u0010@\u001a\u00020?2\u0008\u0008\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03\u00a2\u0006\u0002\u00084H\u0001\u00a2\u0006\u0002\u0010I\u001a-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03\u00a2\u0006\u0002\u00084H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008N\u0010O\u001a5\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010P\u001a\u00020Q2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03\u00a2\u0006\u0002\u00084H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008R\u0010S\u001a\u00d7\u0001\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u00020?2\u0099\u0001\u0010M\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\\u00a2\u0006\u000c\u0008^\u0012\u0008\u0008_\u0012\u0004\u0008\u0008(`\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\\u00a2\u0006\u000c\u0008^\u0012\u0008\u0008_\u0012\u0004\u0008\u0008(a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\\u00a2\u0006\u000c\u0008^\u0012\u0008\u0008_\u0012\u0004\u0008\u0008(b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\\u00a2\u0006\u000c\u0008^\u0012\u0008\u0008_\u0012\u0004\u0008\u0008(c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\\u00a2\u0006\u000c\u0008^\u0012\u0008\u0008_\u0012\u0004\u0008\u0008(d\u0012\u0004\u0012\u00020.0[\u00a2\u0006\u0002\u00084H\u0083\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008e\u0010f\u001aH\u0010g\u001a\u0008\u0012\u0004\u0012\u00020h0\\2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010i\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008l\u0010m\u001a\u0012\u0010n\u001a\u00020\u00142\u0008\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u0012\u0010q\u001a\u00020\u00142\u0008\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u001c\u0010r\u001a\u00020\u0008*\u00020\u00082\u0006\u0010A\u001a\u00020?2\u0006\u0010s\u001a\u00020\u0001H\u0000\u001a\u001c\u0010t\u001a\u00020\u0008*\u00020\u00082\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0010\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0012\u0010\u0005\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u0019\u0010\u0005\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008\u001d\u0010\u0005\"\u000e\u0010\u001e\u001a\u00020\u0014X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\u0008!\u0010\u0005\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\u0008%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006y\u00b2\u0006\n\u0010z\u001a\u00020?X\u008a\u0084\u0002\u00b2\u0006\n\u0010{\u001a\u00020?X\u008a\u0084\u0002"
    }
    d2 = {
        "ContainerId",
        "",
        "HorizontalIconPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getHorizontalIconPadding",
        "()F",
        "F",
        "IconDefaultSizeModifier",
        "Landroidx/compose/ui/Modifier;",
        "getIconDefaultSizeModifier",
        "()Landroidx/compose/ui/Modifier;",
        "LabelId",
        "LeadingId",
        "MinFocusedLabelLineHeight",
        "getMinFocusedLabelLineHeight",
        "MinSupportingTextLineHeight",
        "getMinSupportingTextLineHeight",
        "MinTextLineHeight",
        "getMinTextLineHeight",
        "PlaceholderAnimationDelayOrDuration",
        "",
        "PlaceholderAnimationDuration",
        "PlaceholderId",
        "PrefixId",
        "PrefixSuffixTextPadding",
        "getPrefixSuffixTextPadding",
        "SuffixId",
        "SupportingId",
        "SupportingTopPadding",
        "getSupportingTopPadding",
        "TextFieldAnimationDuration",
        "TextFieldId",
        "TextFieldPadding",
        "getTextFieldPadding",
        "TrailingId",
        "ZeroConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "getZeroConstraints",
        "()J",
        "J",
        "layoutId",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "getLayoutId",
        "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;",
        "CommonDecorationBox",
        "",
        "type",
        "Landroidx/compose/material3/internal/TextFieldType;",
        "value",
        "innerTextField",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "label",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "prefix",
        "suffix",
        "supportingText",
        "singleLine",
        "",
        "enabled",
        "isError",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "colors",
        "Landroidx/compose/material3/TextFieldColors;",
        "container",
        "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V",
        "Decoration",
        "contentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "content",
        "Decoration-Iv8Zu3U",
        "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "Decoration-3J-VO9M",
        "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "TextFieldTransitionScope",
        "inputState",
        "Landroidx/compose/material3/internal/InputPhase;",
        "focusedLabelTextStyleColor",
        "unfocusedLabelTextStyleColor",
        "labelColor",
        "showLabel",
        "Lkotlin/Function5;",
        "Landroidx/compose/runtime/State;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "labelProgress",
        "labelTextStyleColor",
        "labelContentColor",
        "placeholderOpacity",
        "prefixSuffixOpacity",
        "TextFieldTransitionScope-Jy8F4Js",
        "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V",
        "animateBorderStrokeAsState",
        "Landroidx/compose/foundation/BorderStroke;",
        "focused",
        "focusedBorderThickness",
        "unfocusedBorderThickness",
        "animateBorderStrokeAsState-NuRrP5Q",
        "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;",
        "heightOrZero",
        "placeable",
        "Landroidx/compose/ui/layout/Placeable;",
        "widthOrZero",
        "defaultErrorSemantics",
        "defaultErrorMessage",
        "textFieldBackground",
        "color",
        "Landroidx/compose/ui/graphics/ColorProducer;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "material3_release",
        "showPlaceholder",
        "showPrefixSuffix"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ContainerId:Ljava/lang/String; = "Container"

.field private static final HorizontalIconPadding:F

.field private static final IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

.field public static final LabelId:Ljava/lang/String; = "Label"

.field public static final LeadingId:Ljava/lang/String; = "Leading"

.field private static final MinFocusedLabelLineHeight:F

.field private static final MinSupportingTextLineHeight:F

.field private static final MinTextLineHeight:F

.field private static final PlaceholderAnimationDelayOrDuration:I = 0x43

.field private static final PlaceholderAnimationDuration:I = 0x53

.field public static final PlaceholderId:Ljava/lang/String; = "Hint"

.field public static final PrefixId:Ljava/lang/String; = "Prefix"

.field private static final PrefixSuffixTextPadding:F

.field public static final SuffixId:Ljava/lang/String; = "Suffix"

.field public static final SupportingId:Ljava/lang/String; = "Supporting"

.field private static final SupportingTopPadding:F

.field public static final TextFieldAnimationDuration:I = 0x96

.field public static final TextFieldId:Ljava/lang/String; = "TextField"

.field private static final TextFieldPadding:F

.field public static final TrailingId:Ljava/lang/String; = "Trailing"

.field private static final ZeroConstraints:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 486
    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/material3/internal/TextFieldImplKt;->ZeroConstraints:J

    .line 492
    const/16 v0, 0x10

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 700
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 492
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->TextFieldPadding:F

    .line 493
    const/16 v0, 0xc

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 701
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 493
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->HorizontalIconPadding:F

    .line 494
    const/4 v0, 0x4

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 702
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 494
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->SupportingTopPadding:F

    .line 495
    const/4 v0, 0x2

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 703
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 495
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->PrefixSuffixTextPadding:F

    .line 496
    const/16 v0, 0x18

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 704
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 496
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->MinTextLineHeight:F

    .line 497
    const/16 v0, 0x10

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 705
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 497
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->MinFocusedLabelLineHeight:F

    .line 498
    const/16 v0, 0x10

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 706
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 498
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/TextFieldImplKt;->MinSupportingTextLineHeight:F

    .line 500
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x30

    .local v1, "$this$dp$iv":I
    const/4 v2, 0x0

    .line 707
    .local v2, "$i$f$getDp":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 500
    .end local v1    # "$this$dp$iv":I
    .end local v2    # "$i$f$getDp":I
    const/16 v2, 0x30

    .local v2, "$this$dp$iv":I
    const/4 v3, 0x0

    .line 707
    .local v3, "$i$f$getDp":I
    int-to-float v4, v2

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 500
    .end local v2    # "$this$dp$iv":I
    .end local v3    # "$i$f$getDp":I
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/internal/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static final CommonDecorationBox(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V
    .locals 79
    .param p0, "type"    # Landroidx/compose/material3/internal/TextFieldType;
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "innerTextField"    # Lkotlin/jvm/functions/Function2;
    .param p3, "visualTransformation"    # Landroidx/compose/ui/text/input/VisualTransformation;
    .param p4, "label"    # Lkotlin/jvm/functions/Function2;
    .param p5, "placeholder"    # Lkotlin/jvm/functions/Function2;
    .param p6, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p8, "prefix"    # Lkotlin/jvm/functions/Function2;
    .param p9, "suffix"    # Lkotlin/jvm/functions/Function2;
    .param p10, "supportingText"    # Lkotlin/jvm/functions/Function2;
    .param p11, "singleLine"    # Z
    .param p12, "enabled"    # Z
    .param p13, "isError"    # Z
    .param p14, "interactionSource"    # Landroidx/compose/foundation/interaction/InteractionSource;
    .param p15, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p16, "colors"    # Landroidx/compose/material3/TextFieldColors;
    .param p17, "container"    # Lkotlin/jvm/functions/Function2;
    .param p18, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p19, "$changed"    # I
    .param p20, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/internal/TextFieldType;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZZZ",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/material3/TextFieldColors;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 97
    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v15, p14

    move-object/from16 v0, p15

    move-object/from16 v1, p16

    move-object/from16 v2, p17

    move/from16 v3, p19

    move/from16 v6, p20

    move/from16 v7, p21

    const v8, 0x5a44f6ef

    move-object/from16 v9, p18

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p18    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v9, "C(CommonDecorationBox)P(15,16,4,17,7,9,8,14,10,12,13,11,3,6,5,2)98@4054L121,104@4251L25,114@4594L10,121@4911L7503:TextFieldImpl.kt#mqatfk"

    invoke-static {v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v9, p19

    .local v9, "$dirty":I
    move/from16 v10, p20

    .local v10, "$dirty1":I
    and-int/lit8 v11, v7, 0x1

    if-eqz v11, :cond_0

    or-int/lit8 v9, v9, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v11, v3, 0x6

    if-nez v11, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x4

    goto :goto_0

    :cond_1
    const/4 v12, 0x2

    :goto_0
    or-int/2addr v9, v12

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v12, v7, 0x2

    if-eqz v12, :cond_3

    or-int/lit8 v9, v9, 0x30

    move-object/from16 v12, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v12, v3, 0x30

    if-nez v12, :cond_5

    move-object/from16 v12, p1

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x20

    goto :goto_2

    :cond_4
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v9, v13

    goto :goto_3

    :cond_5
    move-object/from16 v12, p1

    :goto_3
    and-int/lit8 v13, v7, 0x4

    if-eqz v13, :cond_6

    or-int/lit16 v9, v9, 0x180

    move-object/from16 v13, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v13, v3, 0x180

    if-nez v13, :cond_8

    move-object/from16 v13, p2

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    const/16 v14, 0x100

    goto :goto_4

    :cond_7
    const/16 v14, 0x80

    :goto_4
    or-int/2addr v9, v14

    goto :goto_5

    :cond_8
    move-object/from16 v13, p2

    :goto_5
    and-int/lit8 v14, v7, 0x8

    if-eqz v14, :cond_9

    or-int/lit16 v9, v9, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v3, 0xc00

    if-nez v14, :cond_b

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v9, v14

    :cond_b
    :goto_7
    and-int/lit8 v14, v7, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v9, v9, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v3, 0x6000

    if-nez v14, :cond_e

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v9, v14

    :cond_e
    :goto_9
    and-int/lit8 v14, v7, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_f

    or-int v9, v9, v16

    move-object/from16 v3, p5

    goto :goto_b

    :cond_f
    and-int v16, v3, v16

    if-nez v16, :cond_11

    move-object/from16 v3, p5

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v9, v9, v16

    goto :goto_b

    :cond_11
    move-object/from16 v3, p5

    :goto_b
    and-int/lit8 v16, v7, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v9, v9, v17

    move-object/from16 v3, p6

    goto :goto_d

    :cond_12
    and-int v17, p19, v17

    if-nez v17, :cond_14

    move-object/from16 v3, p6

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v9, v9, v17

    goto :goto_d

    :cond_14
    move-object/from16 v3, p6

    :goto_d
    and-int/lit16 v3, v7, 0x80

    const/high16 v17, 0xc00000

    if-eqz v3, :cond_15

    or-int v9, v9, v17

    move/from16 v17, v3

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v17, p19, v17

    if-nez v17, :cond_17

    move/from16 v17, v3

    move-object/from16 v3, p7

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v18, 0x400000

    :goto_e
    or-int v9, v9, v18

    goto :goto_f

    :cond_17
    move/from16 v17, v3

    move-object/from16 v3, p7

    :goto_f
    and-int/lit16 v3, v7, 0x100

    const/high16 v18, 0x6000000

    if-eqz v3, :cond_18

    or-int v9, v9, v18

    move/from16 v18, v3

    move-object/from16 v3, p8

    goto :goto_11

    :cond_18
    and-int v18, p19, v18

    if-nez v18, :cond_1a

    move/from16 v18, v3

    move-object/from16 v3, p8

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v19, 0x2000000

    :goto_10
    or-int v9, v9, v19

    goto :goto_11

    :cond_1a
    move/from16 v18, v3

    move-object/from16 v3, p8

    :goto_11
    and-int/lit16 v3, v7, 0x200

    const/high16 v19, 0x30000000

    if-eqz v3, :cond_1b

    or-int v9, v9, v19

    move/from16 v19, v3

    move-object/from16 v3, p9

    goto :goto_13

    :cond_1b
    and-int v19, p19, v19

    if-nez v19, :cond_1d

    move/from16 v19, v3

    move-object/from16 v3, p9

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1c

    const/high16 v20, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v20, 0x10000000

    :goto_12
    or-int v9, v9, v20

    goto :goto_13

    :cond_1d
    move/from16 v19, v3

    move-object/from16 v3, p9

    :goto_13
    and-int/lit16 v3, v7, 0x400

    if-eqz v3, :cond_1e

    or-int/lit8 v10, v10, 0x6

    move/from16 v20, v3

    move-object/from16 v3, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v20, v6, 0x6

    if-nez v20, :cond_20

    move/from16 v20, v3

    move-object/from16 v3, p10

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v21, 0x4

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2

    :goto_14
    or-int v10, v10, v21

    goto :goto_15

    :cond_20
    move/from16 v20, v3

    move-object/from16 v3, p10

    :goto_15
    and-int/lit16 v3, v7, 0x800

    if-eqz v3, :cond_21

    or-int/lit8 v10, v10, 0x30

    move/from16 v21, v3

    move/from16 v3, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v21, v6, 0x30

    if-nez v21, :cond_23

    move/from16 v21, v3

    move/from16 v3, p11

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_22

    const/16 v22, 0x20

    goto :goto_16

    :cond_22
    const/16 v22, 0x10

    :goto_16
    or-int v10, v10, v22

    goto :goto_17

    :cond_23
    move/from16 v21, v3

    move/from16 v3, p11

    :goto_17
    and-int/lit16 v3, v7, 0x1000

    if-eqz v3, :cond_24

    or-int/lit16 v10, v10, 0x180

    move/from16 v22, v3

    move/from16 v3, p12

    goto :goto_19

    :cond_24
    move/from16 v22, v3

    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_26

    move/from16 v3, p12

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_25

    const/16 v23, 0x100

    goto :goto_18

    :cond_25
    const/16 v23, 0x80

    :goto_18
    or-int v10, v10, v23

    goto :goto_19

    :cond_26
    move/from16 v3, p12

    :goto_19
    and-int/lit16 v3, v7, 0x2000

    if-eqz v3, :cond_27

    or-int/lit16 v10, v10, 0xc00

    move/from16 v23, v3

    move/from16 v3, p13

    goto :goto_1b

    :cond_27
    move/from16 v23, v3

    and-int/lit16 v3, v6, 0xc00

    if-nez v3, :cond_29

    move/from16 v3, p13

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_28

    const/16 v24, 0x800

    goto :goto_1a

    :cond_28
    const/16 v24, 0x400

    :goto_1a
    or-int v10, v10, v24

    goto :goto_1b

    :cond_29
    move/from16 v3, p13

    :goto_1b
    and-int/lit16 v3, v7, 0x4000

    if-eqz v3, :cond_2a

    or-int/lit16 v10, v10, 0x6000

    goto :goto_1d

    :cond_2a
    and-int/lit16 v3, v6, 0x6000

    if-nez v3, :cond_2c

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2b

    const/16 v3, 0x4000

    goto :goto_1c

    :cond_2b
    const/16 v3, 0x2000

    :goto_1c
    or-int/2addr v10, v3

    :cond_2c
    :goto_1d
    const v3, 0x8000

    and-int/2addr v3, v7

    if-eqz v3, :cond_2d

    const/high16 v3, 0x30000

    :goto_1e
    or-int/2addr v10, v3

    goto :goto_1f

    :cond_2d
    const/high16 v3, 0x30000

    and-int/2addr v3, v6

    if-nez v3, :cond_2f

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    const/high16 v3, 0x20000

    goto :goto_1e

    :cond_2e
    const/high16 v3, 0x10000

    goto :goto_1e

    :cond_2f
    :goto_1f
    const/high16 v3, 0x10000

    and-int/2addr v3, v7

    if-eqz v3, :cond_30

    const/high16 v3, 0x180000

    :goto_20
    or-int/2addr v10, v3

    goto :goto_21

    :cond_30
    const/high16 v3, 0x180000

    and-int/2addr v3, v6

    if-nez v3, :cond_32

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_31

    const/high16 v3, 0x100000

    goto :goto_20

    :cond_31
    const/high16 v3, 0x80000

    goto :goto_20

    :cond_32
    :goto_21
    const/high16 v3, 0x20000

    and-int/2addr v3, v7

    if-eqz v3, :cond_33

    const/high16 v3, 0xc00000

    :goto_22
    or-int/2addr v10, v3

    goto :goto_23

    :cond_33
    const/high16 v3, 0xc00000

    and-int/2addr v3, v6

    if-nez v3, :cond_35

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_34

    const/high16 v3, 0x800000

    goto :goto_22

    :cond_34
    const/high16 v3, 0x400000

    goto :goto_22

    :cond_35
    :goto_23
    move v3, v10

    .end local v10    # "$dirty1":I
    .local v3, "$dirty1":I
    const v10, 0x12492493

    and-int/2addr v10, v9

    const v5, 0x12492492

    if-ne v10, v5, :cond_37

    const v5, 0x492493

    and-int/2addr v5, v3

    const v10, 0x492492

    if-ne v5, v10, :cond_37

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v5

    if-nez v5, :cond_36

    goto :goto_24

    .line 294
    :cond_36
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v35, v3

    move-object/from16 v53, v8

    move/from16 v36, v9

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    goto/16 :goto_62

    .line 97
    :cond_37
    :goto_24
    if-eqz v14, :cond_38

    .line 84
    const/4 v5, 0x0

    .end local p5    # "placeholder":Lkotlin/jvm/functions/Function2;
    .local v5, "placeholder":Lkotlin/jvm/functions/Function2;
    goto :goto_25

    .line 97
    .end local v5    # "placeholder":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "placeholder":Lkotlin/jvm/functions/Function2;
    :cond_38
    move-object/from16 v5, p5

    .line 84
    .end local p5    # "placeholder":Lkotlin/jvm/functions/Function2;
    .restart local v5    # "placeholder":Lkotlin/jvm/functions/Function2;
    :goto_25
    if-eqz v16, :cond_39

    .line 85
    const/4 v10, 0x0

    .end local p6    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v10, "leadingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_26

    .line 84
    .end local v10    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p6    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_39
    move-object/from16 v10, p6

    .line 85
    .end local p6    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v10    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_26
    if-eqz v17, :cond_3a

    .line 86
    const/4 v14, 0x0

    .end local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v14, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_27

    .line 85
    .end local v14    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_3a
    move-object/from16 v14, p7

    .line 86
    .end local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v14    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_27
    if-eqz v18, :cond_3b

    .line 87
    const/16 v16, 0x0

    .end local p8    # "prefix":Lkotlin/jvm/functions/Function2;
    .local v16, "prefix":Lkotlin/jvm/functions/Function2;
    goto :goto_28

    .line 86
    .end local v16    # "prefix":Lkotlin/jvm/functions/Function2;
    .restart local p8    # "prefix":Lkotlin/jvm/functions/Function2;
    :cond_3b
    move-object/from16 v16, p8

    .line 87
    .end local p8    # "prefix":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "prefix":Lkotlin/jvm/functions/Function2;
    :goto_28
    if-eqz v19, :cond_3c

    .line 88
    const/16 v17, 0x0

    .end local p9    # "suffix":Lkotlin/jvm/functions/Function2;
    .local v17, "suffix":Lkotlin/jvm/functions/Function2;
    goto :goto_29

    .line 87
    .end local v17    # "suffix":Lkotlin/jvm/functions/Function2;
    .restart local p9    # "suffix":Lkotlin/jvm/functions/Function2;
    :cond_3c
    move-object/from16 v17, p9

    .line 88
    .end local p9    # "suffix":Lkotlin/jvm/functions/Function2;
    .restart local v17    # "suffix":Lkotlin/jvm/functions/Function2;
    :goto_29
    if-eqz v20, :cond_3d

    .line 89
    const/16 v18, 0x0

    move-object/from16 v33, v18

    .end local p10    # "supportingText":Lkotlin/jvm/functions/Function2;
    .local v18, "supportingText":Lkotlin/jvm/functions/Function2;
    goto :goto_2a

    .line 88
    .end local v18    # "supportingText":Lkotlin/jvm/functions/Function2;
    .restart local p10    # "supportingText":Lkotlin/jvm/functions/Function2;
    :cond_3d
    move-object/from16 v33, p10

    .line 89
    .end local p10    # "supportingText":Lkotlin/jvm/functions/Function2;
    .local v33, "supportingText":Lkotlin/jvm/functions/Function2;
    :goto_2a
    if-eqz v21, :cond_3e

    .line 90
    const/16 v18, 0x0

    move/from16 v24, v18

    .end local p11    # "singleLine":Z
    .local v18, "singleLine":Z
    goto :goto_2b

    .line 89
    .end local v18    # "singleLine":Z
    .restart local p11    # "singleLine":Z
    :cond_3e
    move/from16 v24, p11

    .line 90
    .end local p11    # "singleLine":Z
    .local v24, "singleLine":Z
    :goto_2b
    if-eqz v22, :cond_3f

    .line 91
    const/16 v18, 0x1

    move-object/from16 p18, v5

    move/from16 v5, v18

    .end local p12    # "enabled":Z
    .local v18, "enabled":Z
    goto :goto_2c

    .line 90
    .end local v18    # "enabled":Z
    .restart local p12    # "enabled":Z
    :cond_3f
    move-object/from16 p18, v5

    move/from16 v5, p12

    .line 91
    .end local p12    # "enabled":Z
    .local v5, "enabled":Z
    .local p18, "placeholder":Lkotlin/jvm/functions/Function2;
    :goto_2c
    if-eqz v23, :cond_40

    .line 92
    const/16 v18, 0x0

    move/from16 v6, v18

    .end local p13    # "isError":Z
    .local v18, "isError":Z
    goto :goto_2d

    .line 91
    .end local v18    # "isError":Z
    .restart local p13    # "isError":Z
    :cond_40
    move/from16 v6, p13

    .line 92
    .end local p13    # "isError":Z
    .local v6, "isError":Z
    :goto_2d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v18

    if-eqz v18, :cond_41

    .line 97
    const v7, 0x5a44f6ef

    move-object/from16 v34, v10

    .end local v10    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v34, "leadingIcon":Lkotlin/jvm/functions/Function2;
    const-string v10, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)"

    invoke-static {v7, v9, v3, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_2e

    .line 92
    .end local v34    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v10    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_41
    move-object/from16 v34, v10

    .line 97
    .end local v10    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v34    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_2e
    nop

    .line 99
    const v7, 0x12fd6ffb

    const-string v10, "CC(remember):TextFieldImpl.kt#9igjgp"

    invoke-static {v8, v7, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v7, v9, 0x70

    move/from16 v35, v3

    .end local v3    # "$dirty1":I
    .local v35, "$dirty1":I
    const/16 v3, 0x20

    const/16 p13, 0x0

    if-ne v7, v3, :cond_42

    const/4 v3, 0x1

    goto :goto_2f

    :cond_42
    move/from16 v3, p13

    :goto_2f
    and-int/lit16 v7, v9, 0x1c00

    const/16 v11, 0x800

    if-ne v7, v11, :cond_43

    const/4 v7, 0x1

    goto :goto_30

    :cond_43
    move/from16 v7, p13

    :goto_30
    or-int/2addr v3, v7

    .local v3, "invalid$iv":Z
    move-object v7, v8

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 502
    .local v11, "$i$f$cache":I
    move/from16 p11, v3

    .end local v3    # "invalid$iv":Z
    .local p11, "invalid$iv":Z
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 503
    .local v19, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p11, :cond_45

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v36, v9

    .end local v9    # "$dirty":I
    .local v36, "$dirty":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v3, v9, :cond_44

    goto :goto_31

    .line 507
    :cond_44
    move-object v9, v3

    goto :goto_32

    .line 503
    .end local v36    # "$dirty":I
    .restart local v9    # "$dirty":I
    :cond_45
    move/from16 v36, v9

    .line 504
    .end local v9    # "$dirty":I
    .restart local v36    # "$dirty":I
    :goto_31
    const/4 v9, 0x0

    .line 100
    .local v9, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$transformedText$1":I
    new-instance v20, Landroidx/compose/ui/text/AnnotatedString;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 p6, v12

    move-object/from16 p5, v20

    move/from16 p9, v21

    move-object/from16 p10, v22

    move-object/from16 p7, v23

    move-object/from16 p8, v25

    invoke-direct/range {p5 .. p10}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v12, p5

    invoke-interface {v4, v12}, Landroidx/compose/ui/text/input/VisualTransformation;->filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v9

    .line 504
    .end local v9    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$transformedText$1":I
    nop

    .line 505
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 506
    nop

    .line 503
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_32
    nop

    .line 502
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 99
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    .end local p11    # "invalid$iv":Z
    check-cast v9, Landroidx/compose/ui/text/input/TransformedText;

    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 102
    invoke-virtual {v9}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v3

    .line 103
    invoke-virtual {v3}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v3

    .line 98
    nop

    .line 105
    .local v3, "transformedText":Ljava/lang/String;
    shr-int/lit8 v7, v35, 0xc

    and-int/lit8 v7, v7, 0xe

    invoke-static {v15, v8, v7}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 107
    .local v7, "isFocused":Z
    nop

    .line 108
    if-eqz v7, :cond_46

    sget-object v9, Landroidx/compose/material3/internal/InputPhase;->Focused:Landroidx/compose/material3/internal/InputPhase;

    goto :goto_34

    .line 109
    :cond_46
    move-object v9, v3

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_47

    const/4 v9, 0x1

    goto :goto_33

    :cond_47
    move/from16 v9, p13

    :goto_33
    if-eqz v9, :cond_48

    sget-object v9, Landroidx/compose/material3/internal/InputPhase;->UnfocusedEmpty:Landroidx/compose/material3/internal/InputPhase;

    goto :goto_34

    .line 110
    :cond_48
    sget-object v9, Landroidx/compose/material3/internal/InputPhase;->UnfocusedNotEmpty:Landroidx/compose/material3/internal/InputPhase;

    .line 107
    :goto_34
    nop

    .line 106
    nop

    .line 113
    .local v9, "inputState":Landroidx/compose/material3/internal/InputPhase;
    invoke-virtual {v1, v5, v6, v7}, Landroidx/compose/material3/TextFieldColors;->labelColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v11

    .line 115
    .local v11, "labelColor":J
    move-object/from16 v37, v3

    .end local v3    # "transformedText":Ljava/lang/String;
    .local v37, "transformedText":Ljava/lang/String;
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v4, 0x6

    invoke-virtual {v3, v8, v4}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v3

    .line 116
    .local v3, "typography":Landroidx/compose/material3/Typography;
    invoke-virtual {v3}, Landroidx/compose/material3/Typography;->getBodyLarge()Landroidx/compose/ui/text/TextStyle;

    move-result-object v19

    .line 117
    .local v19, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    invoke-virtual {v3}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v20

    .line 119
    .local v20, "bodySmall":Landroidx/compose/ui/text/TextStyle;
    move/from16 v21, v4

    move/from16 v38, v5

    .end local v5    # "enabled":Z
    .local v38, "enabled":Z
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    sget-object v22, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-wide/from16 v39, v11

    .end local v11    # "labelColor":J
    .local v39, "labelColor":J
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v11

    invoke-static {v4, v5, v11, v12}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v4

    if-eqz v4, :cond_49

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v11

    invoke-static {v4, v5, v11, v12}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v4

    if-eqz v4, :cond_4a

    .line 120
    :cond_49
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v11

    invoke-static {v4, v5, v11, v12}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v4

    if-nez v4, :cond_4b

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v4

    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v11

    invoke-static {v4, v5, v11, v12}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v4

    if-eqz v4, :cond_4b

    :cond_4a
    const/4 v4, 0x1

    goto :goto_35

    :cond_4b
    move/from16 v4, p13

    .line 118
    :goto_35
    nop

    .line 125
    .local v4, "overrideLabelTextStyleColor":Z
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v11

    .local v11, "$this$CommonDecorationBox_u24lambda_u242":J
    const/4 v5, 0x0

    .line 126
    .local v5, "$i$a$-with-TextFieldImplKt$CommonDecorationBox$1":I
    if-eqz v4, :cond_4e

    move-wide/from16 v22, v11

    .local v22, "$this$takeOrElse_u2dDxMtmZc$iv":J
    const/16 v25, 0x0

    .line 508
    .local v25, "$i$f$takeOrElse-DxMtmZc":I
    move-wide/from16 v26, v22

    .local v26, "$this$isSpecified$iv$iv":J
    const/16 v28, 0x0

    .line 509
    .local v28, "$i$f$isSpecified-8_81llA":I
    const-wide/16 v29, 0x10

    cmp-long v29, v26, v29

    if-eqz v29, :cond_4c

    const/16 v26, 0x1

    goto :goto_36

    :cond_4c
    move/from16 v26, p13

    .line 508
    .end local v26    # "$this$isSpecified$iv$iv":J
    .end local v28    # "$i$f$isSpecified-8_81llA":I
    :goto_36
    if-eqz v26, :cond_4d

    move-wide/from16 v11, v22

    goto :goto_37

    :cond_4d
    const/16 v26, 0x0

    .line 126
    .local v26, "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$1$1":I
    nop

    .line 508
    .end local v26    # "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$1$1":I
    move-wide/from16 v11, v39

    .line 125
    .end local v5    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$1":I
    .end local v11    # "$this$CommonDecorationBox_u24lambda_u242":J
    .end local v22    # "$this$takeOrElse_u2dDxMtmZc$iv":J
    .end local v25    # "$i$f$takeOrElse-DxMtmZc":I
    :cond_4e
    :goto_37
    nop

    .line 129
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v22

    .local v22, "$this$CommonDecorationBox_u24lambda_u244":J
    const/4 v5, 0x0

    .line 130
    .local v5, "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    if-eqz v4, :cond_51

    move-wide/from16 v25, v22

    .local v25, "$this$takeOrElse_u2dDxMtmZc$iv":J
    const/16 v27, 0x0

    .line 510
    .local v27, "$i$f$takeOrElse-DxMtmZc":I
    move-wide/from16 v28, v25

    .local v28, "$this$isSpecified$iv$iv":J
    const/16 v30, 0x0

    .line 511
    .local v30, "$i$f$isSpecified-8_81llA":I
    const-wide/16 v31, 0x10

    cmp-long v31, v28, v31

    if-eqz v31, :cond_4f

    const/16 v28, 0x1

    goto :goto_38

    :cond_4f
    move/from16 v28, p13

    .line 510
    .end local v28    # "$this$isSpecified$iv$iv":J
    .end local v30    # "$i$f$isSpecified-8_81llA":I
    :goto_38
    if-eqz v28, :cond_50

    move-wide/from16 v22, v25

    goto :goto_39

    :cond_50
    const/16 v28, 0x0

    .line 130
    .local v28, "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$2$1":I
    nop

    .line 510
    .end local v28    # "$i$a$-takeOrElse-DxMtmZc-TextFieldImplKt$CommonDecorationBox$2$1":I
    move-wide/from16 v22, v39

    .line 129
    .end local v5    # "$i$a$-with-TextFieldImplKt$CommonDecorationBox$2":I
    .end local v22    # "$this$CommonDecorationBox_u24lambda_u244":J
    .end local v25    # "$this$takeOrElse_u2dDxMtmZc$iv":J
    .end local v27    # "$i$f$takeOrElse-DxMtmZc":I
    :cond_51
    :goto_39
    nop

    .line 133
    if-eqz p4, :cond_52

    const/4 v5, 0x1

    goto :goto_3a

    :cond_52
    move/from16 v5, p13

    .line 122
    :goto_3a
    nop

    .local v5, "showLabel$iv":Z
    .local v11, "focusedLabelTextStyleColor$iv":J
    move-wide/from16 v41, v22

    .local v41, "unfocusedLabelTextStyleColor$iv":J
    move/from16 v43, p13

    .local v43, "$changed$iv":I
    const/16 v44, 0x0

    .line 512
    .local v44, "$i$f$TextFieldTransitionScope-Jy8F4Js":I
    move-object/from16 v45, v3

    .end local v3    # "typography":Landroidx/compose/material3/Typography;
    .local v45, "typography":Landroidx/compose/material3/Typography;
    const v3, -0x40d508a2

    move/from16 v22, v4

    .end local v4    # "overrideLabelTextStyleColor":Z
    .local v22, "overrideLabelTextStyleColor":Z
    const-string v4, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk"

    invoke-static {v8, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 516
    and-int/lit8 v3, v43, 0xe

    or-int/lit8 v3, v3, 0x30

    const-string v4, "TextFieldInputState"

    move/from16 v46, v5

    move/from16 v5, p13

    .end local v5    # "showLabel$iv":Z
    .local v46, "showLabel$iv":Z
    invoke-static {v9, v4, v8, v3, v5}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v3

    .line 519
    .local v3, "transition$iv":Landroidx/compose/animation/core/Transition;
    sget-object v4, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelProgress$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelProgress$1;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    .line 520
    nop

    .line 519
    const/16 v23, 0x180

    move/from16 v25, v23

    .local v4, "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .local v25, "$changed$iv$iv":I
    const-string v26, "LabelProgress"

    .local v26, "label$iv$iv":Ljava/lang/String;
    move-object/from16 v27, v3

    .local v27, "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v28, 0x0

    .line 521
    .local v28, "$i$f$animateFloat":I
    const v5, -0x4fcbfb15

    move-object/from16 v47, v3

    .end local v3    # "transition$iv":Landroidx/compose/animation/core/Transition;
    .local v47, "transition$iv":Landroidx/compose/animation/core/Transition;
    const-string v3, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    invoke-static {v8, v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v3}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v3

    .local v3, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v5, v25, 0xe

    move-object/from16 p9, v3

    .end local v3    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local p9, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    shl-int/lit8 v3, v25, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v5

    shl-int/lit8 v5, v25, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v3, v5

    shl-int/lit8 v5, v25, 0x3

    const v29, 0xe000

    and-int v5, v5, v29

    or-int/2addr v3, v5

    .local v3, "$changed$iv$iv$iv":I
    move-object/from16 v5, v27

    .local v5, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v30, 0x0

    .line 522
    .local v30, "$i$f$animateValue":I
    move/from16 v31, v3

    .end local v3    # "$changed$iv$iv$iv":I
    .local v31, "$changed$iv$iv$iv":I
    const v3, -0x880d1ef

    move-object/from16 p5, v5

    .end local v5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local p5, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const-string v5, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v8, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 524
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v3

    shr-int/lit8 v5, v31, 0x9

    and-int/lit8 v5, v5, 0x70

    .local v5, "$changed$iv":I
    check-cast v3, Landroidx/compose/material3/internal/InputPhase;

    .local v3, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p6, v8

    .local p6, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v32, 0x0

    move-object/from16 p7, v3

    .end local v3    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local v32, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2$iv":I
    .local p7, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const v3, -0x796609df

    move-object/from16 v48, v9

    move-object/from16 v9, p6

    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v9, "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v48, "inputState":Landroidx/compose/material3/internal/InputPhase;
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "C:TextFieldImpl.kt#mqatfk"

    invoke-static {v9, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v49

    .end local v9    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, -0x1

    if-eqz v49, :cond_53

    .line 525
    move-wide/from16 v49, v11

    .end local v11    # "focusedLabelTextStyleColor$iv":J
    .local v49, "focusedLabelTextStyleColor$iv":J
    const v11, -0x796609df

    const-string v12, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"

    invoke-static {v11, v5, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_3b

    .line 524
    .end local v49    # "focusedLabelTextStyleColor$iv":J
    .restart local v11    # "focusedLabelTextStyleColor$iv":J
    :cond_53
    move-wide/from16 v49, v11

    .line 525
    .end local v11    # "focusedLabelTextStyleColor$iv":J
    .restart local v49    # "focusedLabelTextStyleColor$iv":J
    :goto_3b
    sget-object v11, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v12

    aget v11, v11, v12

    const/high16 v51, 0x3f800000    # 1.0f

    packed-switch v11, :pswitch_data_0

    .line 528
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    move/from16 v11, v51

    goto :goto_3c

    .line 527
    :pswitch_1
    const/4 v11, 0x0

    goto :goto_3c

    .line 526
    :pswitch_2
    move/from16 v11, v51

    .line 525
    :goto_3c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v52

    if-eqz v52, :cond_54

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_54
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v5    # "$changed$iv":I
    .end local v32    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2$iv":I
    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 524
    nop

    .line 529
    .local v5, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v11

    shr-int/lit8 v32, v31, 0x9

    and-int/lit8 v12, v32, 0x70

    .local v12, "$changed$iv":I
    check-cast v11, Landroidx/compose/material3/internal/InputPhase;

    .local v11, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p6, v8

    .restart local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v32, 0x0

    .restart local v32    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2$iv":I
    const v9, -0x796609df

    move-object/from16 p7, v5

    move-object/from16 v5, p6

    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v5, "$composer$iv":Landroidx/compose/runtime/Composer;
    .local p7, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_55

    .line 525
    const v9, -0x796609df

    move-object/from16 p6, v5

    .end local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v5, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"

    move-object/from16 p8, v11

    const/4 v11, -0x1

    .end local v11    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local p8, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v9, v12, v11, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_3d

    .line 529
    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v11    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    :cond_55
    move-object/from16 p6, v5

    move-object/from16 p8, v11

    .line 525
    .end local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    :goto_3d
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p8 .. p8}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v9

    aget v5, v5, v9

    packed-switch v5, :pswitch_data_1

    .line 528
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_3
    move/from16 v5, v51

    goto :goto_3e

    .line 527
    :pswitch_4
    const/4 v5, 0x0

    goto :goto_3e

    .line 526
    :pswitch_5
    move/from16 v5, v51

    .line 525
    :goto_3e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_56

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_56
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v12    # "$changed$iv":I
    .end local v32    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2$iv":I
    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 529
    nop

    .line 530
    .local v5, "targetValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v9

    shr-int/lit8 v11, v31, 0x3

    and-int/lit8 v11, v11, 0x70

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v4, v9, v8, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 532
    .local v9, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v11, v31, 0xe

    shl-int/lit8 v12, v31, 0x9

    and-int v12, v12, v29

    or-int/2addr v11, v12

    shl-int/lit8 v12, v31, 0x6

    const/high16 v32, 0x70000

    and-int v12, v12, v32

    or-int/2addr v11, v12

    move-object/from16 p6, p7

    move-object/from16 p7, v5

    move-object/from16 p11, v8

    move-object/from16 p8, v9

    move/from16 p12, v11

    move-object/from16 p10, v26

    .end local v5    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v9    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v26    # "label$iv$iv":Ljava/lang/String;
    .local p6, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .local p7, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local p8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local p10, "label$iv$iv":Ljava/lang/String;
    .local p11, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p5 .. p12}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 522
    move-object/from16 v11, p5

    move-object/from16 v54, p6

    move-object/from16 v12, p7

    move-object/from16 v55, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p11

    .end local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local p6    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local p7    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local p8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p9    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local p10    # "label$iv$iv":Ljava/lang/String;
    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    .local v11, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v12, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "label$iv$iv":Ljava/lang/String;
    .local v54, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .local v55, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 532
    nop

    .line 521
    .end local v8    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v11    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v12    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v30    # "$i$f$animateValue":I
    .end local v31    # "$changed$iv$iv$iv":I
    .end local v54    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local v55    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 519
    .end local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .end local v25    # "$changed$iv$iv":I
    .end local v26    # "label$iv$iv":Ljava/lang/String;
    .end local v27    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v28    # "$i$f$animateFloat":I
    nop

    .line 533
    nop

    .line 534
    .local v5, "labelProgress$iv":Landroidx/compose/runtime/State;
    sget-object v4, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    .line 535
    nop

    .line 534
    move/from16 v8, v23

    .local v8, "$changed$iv$iv":I
    const-string v11, "PlaceholderOpacity"

    .local v11, "label$iv$iv":Ljava/lang/String;
    move-object/from16 v12, v47

    .restart local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .local v12, "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v25, 0x0

    .line 521
    .local v25, "$i$f$animateFloat":I
    move-object/from16 v54, v5

    .end local v5    # "labelProgress$iv":Landroidx/compose/runtime/State;
    .local v54, "labelProgress$iv":Landroidx/compose/runtime/State;
    const v5, -0x4fcbfb15

    move/from16 v26, v8

    .end local v8    # "$changed$iv$iv":I
    .local v26, "$changed$iv$iv":I
    const-string v8, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v5, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v5}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v8, v26, 0xe

    move-object/from16 p9, v5

    .end local v5    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local p9    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    shl-int/lit8 v5, v26, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v8

    shl-int/lit8 v8, v26, 0x3

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v5, v8

    shl-int/lit8 v8, v26, 0x3

    and-int v8, v8, v29

    or-int/2addr v5, v8

    .local v5, "$changed$iv$iv$iv":I
    move-object v8, v12

    .local v8, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v27, 0x0

    .line 536
    .local v27, "$i$f$animateValue":I
    move/from16 v28, v5

    .end local v5    # "$changed$iv$iv$iv":I
    .local v28, "$changed$iv$iv$iv":I
    const v5, -0x880d1ef

    move-object/from16 p5, v8

    .end local v8    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const-string v8, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 538
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v5

    shr-int/lit8 v8, v28, 0x9

    and-int/lit8 v8, v8, 0x70

    .local v8, "$changed$iv":I
    check-cast v5, Landroidx/compose/material3/internal/InputPhase;

    .local v5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p6, v9

    .local p6, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v30, 0x0

    move-object/from16 p7, v5

    .end local v5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local v30, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2$iv":I
    .local p7, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const v5, 0x55952420

    move-object/from16 p10, v11

    move-object/from16 v11, p6

    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v11, "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p10    # "label$iv$iv":Ljava/lang/String;
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_57

    .line 539
    const v5, 0x55952420

    move-object/from16 v31, v11

    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v31, "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v11, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"

    move-object/from16 v55, v12

    const/4 v12, -0x1

    .end local v12    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v55, "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v5, v8, v12, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_3f

    .line 538
    .end local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v55    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v12    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_57
    move-object/from16 v31, v11

    move-object/from16 v55, v12

    .line 539
    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v55    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_3f
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v11

    aget v5, v5, v11

    packed-switch v5, :pswitch_data_2

    .line 542
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_6
    const/4 v5, 0x0

    goto :goto_40

    .line 541
    :pswitch_7
    if-eqz v46, :cond_58

    const/4 v5, 0x0

    goto :goto_40

    :cond_58
    move/from16 v5, v51

    goto :goto_40

    .line 540
    :pswitch_8
    move/from16 v5, v51

    .line 539
    :goto_40
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_59

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_59
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v8    # "$changed$iv":I
    .end local v30    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2$iv":I
    .end local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 538
    nop

    .line 543
    .local v5, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v8

    shr-int/lit8 v11, v28, 0x9

    and-int/lit8 v11, v11, 0x70

    .local v11, "$changed$iv":I
    check-cast v8, Landroidx/compose/material3/internal/InputPhase;

    .local v8, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object v12, v9

    .local v12, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v30, 0x0

    move-object/from16 p6, v5

    .end local v5    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2$iv":I
    .local p6, "initialValue$iv$iv$iv":Ljava/lang/Object;
    const v5, 0x55952420

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5a

    .line 539
    const v5, 0x55952420

    move-object/from16 p7, v8

    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const-string v8, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"

    move-object/from16 p8, v12

    const/4 v12, -0x1

    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local p8, "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static {v5, v11, v12, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_41

    .line 543
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    :cond_5a
    move-object/from16 p7, v8

    move-object/from16 p8, v12

    .line 539
    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    :goto_41
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v8

    aget v5, v5, v8

    packed-switch v5, :pswitch_data_3

    .line 542
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_9
    const/4 v5, 0x0

    goto :goto_42

    .line 541
    :pswitch_a
    if-eqz v46, :cond_5b

    const/4 v5, 0x0

    goto :goto_42

    :cond_5b
    move/from16 v5, v51

    goto :goto_42

    .line 540
    :pswitch_b
    move/from16 v5, v51

    .line 539
    :goto_42
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_5c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5c
    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v11    # "$changed$iv":I
    .end local v30    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2$iv":I
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 543
    nop

    .line 544
    .local v5, "targetValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v11, v28, 0x3

    and-int/lit8 v11, v11, 0x70

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v4, v8, v9, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 546
    .local v8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v11, v28, 0xe

    shl-int/lit8 v12, v28, 0x9

    and-int v12, v12, v29

    or-int/2addr v11, v12

    shl-int/lit8 v12, v28, 0x6

    and-int v12, v12, v32

    or-int/2addr v11, v12

    move-object/from16 p7, v5

    move-object/from16 p8, v8

    move-object/from16 p11, v9

    move/from16 p12, v11

    .end local v5    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local p7, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local p8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .restart local p11    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p5 .. p12}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 536
    move-object/from16 v57, p5

    move-object/from16 v8, p6

    move-object/from16 v11, p7

    move-object/from16 v30, p8

    move-object/from16 v56, p9

    move-object/from16 v12, p10

    .end local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local p6    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local p7    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local p8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p9    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local p10    # "label$iv$iv":Ljava/lang/String;
    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v11, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local v12, "label$iv$iv":Ljava/lang/String;
    .local v30, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v56, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local v57, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 546
    nop

    .line 521
    .end local v8    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local v11    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v27    # "$i$f$animateValue":I
    .end local v28    # "$changed$iv$iv$iv":I
    .end local v30    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v56    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v57    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 534
    .end local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .end local v12    # "label$iv$iv":Ljava/lang/String;
    .end local v25    # "$i$f$animateFloat":I
    .end local v26    # "$changed$iv$iv":I
    .end local v55    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    nop

    .line 547
    nop

    .line 548
    .local v5, "placeholderOpacity$iv":Landroidx/compose/runtime/State;
    sget-object v4, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    .line 549
    nop

    .line 548
    const-string v8, "PrefixSuffixOpacity"

    .local v8, "label$iv$iv":Ljava/lang/String;
    move/from16 v11, v23

    .restart local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .local v11, "$changed$iv$iv":I
    move-object/from16 v12, v47

    .local v12, "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v25, 0x0

    .line 521
    .restart local v25    # "$i$f$animateFloat":I
    move-object/from16 v55, v5

    .end local v5    # "placeholderOpacity$iv":Landroidx/compose/runtime/State;
    .local v55, "placeholderOpacity$iv":Landroidx/compose/runtime/State;
    const v5, -0x4fcbfb15

    move-object/from16 p10, v8

    .end local v8    # "label$iv$iv":Ljava/lang/String;
    .restart local p10    # "label$iv$iv":Ljava/lang/String;
    const-string v8, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v5, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v5}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v8, v11, 0xe

    move-object/from16 p9, v5

    .end local v5    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local p9    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    shl-int/lit8 v5, v11, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v8

    shl-int/lit8 v8, v11, 0x3

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v5, v8

    shl-int/lit8 v8, v11, 0x3

    and-int v8, v8, v29

    or-int/2addr v5, v8

    .local v5, "$changed$iv$iv$iv":I
    move-object v8, v12

    .local v8, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v26, 0x0

    .line 550
    .local v26, "$i$f$animateValue":I
    move/from16 v27, v5

    .end local v5    # "$changed$iv$iv$iv":I
    .local v27, "$changed$iv$iv$iv":I
    const v5, -0x880d1ef

    move-object/from16 p5, v8

    .end local v8    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const-string v8, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 552
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v5

    shr-int/lit8 v8, v27, 0x9

    and-int/lit8 v8, v8, 0x70

    .local v8, "$changed$iv":I
    check-cast v5, Landroidx/compose/material3/internal/InputPhase;

    .local v5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p6, v9

    .local p6, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    move-object/from16 p7, v5

    .end local v5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local v28, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2$iv":I
    .local p7, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const v5, 0x433c6eba

    move/from16 v30, v11

    move-object/from16 v11, p6

    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v11, "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v30, "$changed$iv$iv":I
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5d

    .line 553
    const v5, 0x433c6eba

    move-object/from16 v31, v11

    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v11, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"

    move-object/from16 v56, v12

    const/4 v12, -0x1

    .end local v12    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v56, "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v5, v8, v12, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_43

    .line 552
    .end local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v56    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v12    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_5d
    move-object/from16 v31, v11

    move-object/from16 v56, v12

    .line 553
    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v56    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_43
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v11

    aget v5, v5, v11

    packed-switch v5, :pswitch_data_4

    .line 556
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_c
    move/from16 v5, v51

    goto :goto_44

    .line 555
    :pswitch_d
    if-eqz v46, :cond_5e

    const/4 v5, 0x0

    goto :goto_44

    :cond_5e
    move/from16 v5, v51

    goto :goto_44

    .line 554
    :pswitch_e
    move/from16 v5, v51

    .line 553
    :goto_44
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_5f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5f
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v8    # "$changed$iv":I
    .end local v28    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2$iv":I
    .end local v31    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 552
    nop

    .line 557
    .local v5, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v8

    shr-int/lit8 v11, v27, 0x9

    and-int/lit8 v11, v11, 0x70

    .local v11, "$changed$iv":I
    check-cast v8, Landroidx/compose/material3/internal/InputPhase;

    .local v8, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object v12, v9

    .local v12, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    move-object/from16 p6, v5

    .end local v5    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v28    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2$iv":I
    .local p6, "initialValue$iv$iv$iv":Ljava/lang/Object;
    const v5, 0x433c6eba

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_60

    .line 553
    const v5, 0x433c6eba

    move-object/from16 p7, v8

    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const-string v8, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"

    move-object/from16 p8, v12

    const/4 v12, -0x1

    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local p8, "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static {v5, v11, v12, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_45

    .line 557
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    :cond_60
    move-object/from16 p7, v8

    move-object/from16 p8, v12

    .line 553
    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    :goto_45
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v8

    aget v5, v5, v8

    packed-switch v5, :pswitch_data_5

    .line 556
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_f
    move/from16 v12, v51

    goto :goto_46

    .line 555
    :pswitch_10
    if-eqz v46, :cond_61

    const/4 v12, 0x0

    goto :goto_46

    :cond_61
    move/from16 v12, v51

    goto :goto_46

    .line 554
    :pswitch_11
    move/from16 v12, v51

    .line 553
    :goto_46
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_62

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_62
    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v11    # "$changed$iv":I
    .end local v28    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2$iv":I
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 557
    nop

    .line 558
    .local v5, "targetValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v11, v27, 0x3

    and-int/lit8 v11, v11, 0x70

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v4, v8, v9, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 560
    .local v8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v11, v27, 0xe

    shl-int/lit8 v12, v27, 0x9

    and-int v12, v12, v29

    or-int/2addr v11, v12

    shl-int/lit8 v12, v27, 0x6

    and-int v12, v12, v32

    or-int/2addr v11, v12

    move-object/from16 p7, v5

    move-object/from16 p8, v8

    move-object/from16 p11, v9

    move/from16 p12, v11

    .end local v5    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local p7, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local p8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .restart local p11    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p5 .. p12}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 550
    move-object/from16 v52, p5

    move-object/from16 v8, p6

    move-object/from16 v11, p7

    move-object/from16 v28, p8

    move-object/from16 v51, p9

    move-object/from16 v12, p10

    .end local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local p6    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local p7    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local p8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p9    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local p10    # "label$iv$iv":Ljava/lang/String;
    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v11, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local v12, "label$iv$iv":Ljava/lang/String;
    .local v28, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v51, "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local v52, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 560
    nop

    .line 521
    .end local v8    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local v11    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v26    # "$i$f$animateValue":I
    .end local v27    # "$changed$iv$iv$iv":I
    .end local v28    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v51    # "typeConverter$iv$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v52    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 548
    .end local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .end local v12    # "label$iv$iv":Ljava/lang/String;
    .end local v25    # "$i$f$animateFloat":I
    .end local v30    # "$changed$iv$iv":I
    .end local v56    # "$this$animateFloat$iv$iv":Landroidx/compose/animation/core/Transition;
    nop

    .line 561
    nop

    .line 562
    .local v5, "prefixSuffixOpacity$iv":Landroidx/compose/runtime/State;
    sget-object v4, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    .line 564
    nop

    .line 562
    move/from16 v8, v23

    .restart local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .local v8, "$changed$iv$iv":I
    const-string v11, "LabelTextStyleColor"

    .local v11, "label$iv$iv":Ljava/lang/String;
    move-object/from16 v12, v47

    .local v12, "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v25, 0x0

    .line 565
    .local v25, "$i$f$animateColor":I
    move-object/from16 v51, v5

    .end local v5    # "prefixSuffixOpacity$iv":Landroidx/compose/runtime/State;
    .local v51, "prefixSuffixOpacity$iv":Landroidx/compose/runtime/State;
    const v5, -0x739d657f

    move/from16 v26, v8

    .end local v8    # "$changed$iv$iv":I
    .local v26, "$changed$iv$iv":I
    const-string v8, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 566
    invoke-virtual {v12}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v5

    shr-int/lit8 v8, v26, 0x6

    and-int/lit8 v8, v8, 0x70

    .local v8, "$changed$iv":I
    check-cast v5, Landroidx/compose/material3/internal/InputPhase;

    .local v5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p5, v9

    .local p5, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v27, 0x0

    move-object/from16 p6, v5

    .end local v5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local v27, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2$iv":I
    .local p6, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const v5, -0x66748bf

    move-object/from16 p10, v11

    move-object/from16 v11, p5

    .end local p5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v11, "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p10    # "label$iv$iv":Ljava/lang/String;
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v28

    if-eqz v28, :cond_63

    .line 567
    move-object/from16 v28, v11

    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v28, "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v11, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    move-object/from16 v30, v12

    const/4 v12, -0x1

    .end local v12    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v30, "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v5, v8, v12, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_47

    .line 566
    .end local v28    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v30    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v12    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_63
    move-object/from16 v28, v11

    move-object/from16 v30, v12

    .line 567
    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v28    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v30    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_47
    sget-object v11, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v12

    aget v11, v11, v12

    .line 568
    const/4 v12, 0x1

    if-ne v11, v12, :cond_64

    move-wide/from16 v11, v49

    goto :goto_48

    .line 569
    :cond_64
    move-wide/from16 v11, v41

    .line 567
    :goto_48
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v31

    if-eqz v31, :cond_65

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_65
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 566
    .end local v8    # "$changed$iv":I
    .end local v27    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2$iv":I
    .end local v28    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p6    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v8

    .line 570
    .local v8, "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    const v11, 0x72589593

    const-string v12, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v9, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    .local v11, "invalid$iv$iv$iv":Z
    move-object v12, v9

    .local v12, "$this$cache$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v27, 0x0

    .line 571
    .local v27, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv$iv$iv":Ljava/lang/Object;
    const/16 v28, 0x0

    .line 572
    .local v28, "$i$a$-let-ComposerKt$cache$1$iv$iv$iv":I
    if-nez v11, :cond_67

    sget-object v31, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p6, v11

    .end local v11    # "invalid$iv$iv$iv":Z
    .local p6, "invalid$iv$iv$iv":Z
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v5, v11, :cond_66

    goto :goto_49

    .line 577
    :cond_66
    move-object/from16 p7, v5

    goto :goto_4a

    .line 572
    .end local p6    # "invalid$iv$iv$iv":Z
    .restart local v11    # "invalid$iv$iv$iv":Z
    :cond_67
    move/from16 p6, v11

    .line 573
    .end local v11    # "invalid$iv$iv$iv":Z
    .restart local p6    # "invalid$iv$iv$iv":Z
    :goto_49
    const/4 v11, 0x0

    .line 574
    .local v11, "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv$iv":I
    sget-object v31, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 p7, v5

    .end local v5    # "it$iv$iv$iv":Ljava/lang/Object;
    .local p7, "it$iv$iv$iv":Ljava/lang/Object;
    invoke-static/range {v31 .. v31}, Landroidx/compose/animation/ColorVectorConverterKt;->getVectorConverter(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;

    move-result-object v5

    invoke-interface {v5, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/animation/core/TwoWayConverter;

    .line 573
    .end local v11    # "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv$iv":I
    nop

    .line 575
    .local v5, "value$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 576
    nop

    .line 572
    .end local v5    # "value$iv$iv$iv":Ljava/lang/Object;
    :goto_4a
    nop

    .line 571
    .end local v28    # "$i$a$-let-ComposerKt$cache$1$iv$iv$iv":I
    .end local p7    # "it$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 570
    .end local v12    # "$this$cache$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v27    # "$i$f$cache":I
    .end local p6    # "invalid$iv$iv$iv":Z
    check-cast v5, Landroidx/compose/animation/core/TwoWayConverter;

    .local v5, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 578
    and-int/lit8 v11, v26, 0xe

    shl-int/lit8 v12, v26, 0x3

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v11, v12

    shl-int/lit8 v12, v26, 0x3

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v11, v12

    shl-int/lit8 v12, v26, 0x3

    and-int v12, v12, v29

    or-int/2addr v11, v12

    .local v11, "$changed$iv$iv$iv":I
    move-object/from16 v12, v30

    .local v12, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v27, 0x0

    .line 579
    .local v27, "$i$f$animateValue":I
    move-object/from16 p9, v5

    .end local v5    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local p9, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    const v5, -0x880d1ef

    move-object/from16 v28, v8

    .end local v8    # "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .local v28, "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    const-string v8, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 581
    invoke-virtual {v12}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v5

    shr-int/lit8 v8, v11, 0x9

    and-int/lit8 v8, v8, 0x70

    .local v8, "$changed$iv":I
    check-cast v5, Landroidx/compose/material3/internal/InputPhase;

    .local v5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p6, v9

    .local p6, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v31, 0x0

    move-object/from16 p7, v5

    move/from16 v52, v11

    const v11, -0x66748bf

    move-object/from16 v5, p6

    .end local v11    # "$changed$iv$iv$iv":I
    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v5, "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v31, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2$iv":I
    .local v52, "$changed$iv$iv$iv":I
    .local p7, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v56

    if-eqz v56, :cond_68

    .line 567
    move-object/from16 v56, v5

    .end local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v56, "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v5, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    move-object/from16 p6, v12

    const/4 v12, -0x1

    .end local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local p6, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v11, v8, v12, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_4b

    .line 581
    .end local v56    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p6    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_68
    move-object/from16 v56, v5

    move-object/from16 p6, v12

    .line 567
    .end local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v56    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p6    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_4b
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v11

    aget v5, v5, v11

    .line 568
    const/4 v12, 0x1

    if-ne v5, v12, :cond_69

    move-wide/from16 v11, v49

    goto :goto_4c

    .line 569
    :cond_69
    move-wide/from16 v11, v41

    .line 567
    :goto_4c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_6a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6a
    invoke-interface/range {v56 .. v56}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v8    # "$changed$iv":I
    .end local v31    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2$iv":I
    .end local v56    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v5

    .line 581
    nop

    .line 582
    .local v5, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v8

    shr-int/lit8 v11, v52, 0x9

    and-int/lit8 v11, v11, 0x70

    .local v11, "$changed$iv":I
    check-cast v8, Landroidx/compose/material3/internal/InputPhase;

    .local v8, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object v12, v9

    .local v12, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v31, 0x0

    move-object/from16 p7, v5

    const v5, -0x66748bf

    .end local v5    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v31    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2$iv":I
    .local p7, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v56

    if-eqz v56, :cond_6b

    .line 567
    move-object/from16 p5, v8

    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local p5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const-string v8, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    move-object/from16 p8, v12

    const/4 v12, -0x1

    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local p8, "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static {v5, v11, v12, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_4d

    .line 582
    .end local p5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    :cond_6b
    move-object/from16 p5, v8

    move-object/from16 p8, v12

    .line 567
    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    :goto_4d
    sget-object v5, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p5 .. p5}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v8

    aget v5, v5, v8

    .line 568
    const/4 v12, 0x1

    if-ne v5, v12, :cond_6c

    move-wide/from16 v56, v49

    goto :goto_4e

    .line 569
    :cond_6c
    move-wide/from16 v56, v41

    .line 567
    :goto_4e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_6d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6d
    invoke-interface/range {p8 .. p8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v11    # "$changed$iv":I
    .end local v31    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2$iv":I
    .end local p5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .end local p8    # "$composer$iv":Landroidx/compose/runtime/Composer;
    invoke-static/range {v56 .. v57}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v5

    .line 582
    nop

    .line 583
    .local v5, "targetValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v11, v52, 0x3

    and-int/lit8 v11, v11, 0x70

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v4, v8, v9, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 585
    .local v8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v11, v52, 0xe

    shl-int/lit8 v12, v52, 0x9

    and-int v12, v12, v29

    or-int/2addr v11, v12

    shl-int/lit8 v12, v52, 0x6

    and-int v12, v12, v32

    or-int/2addr v11, v12

    move-object/from16 p5, p6

    move-object/from16 p6, p7

    move-object/from16 p7, v5

    move-object/from16 p8, v8

    move-object/from16 p11, v9

    move/from16 p12, v11

    .end local v5    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local p5, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local p6, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .local p7, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local p8, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .restart local p11    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p5 .. p12}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 579
    move-object/from16 v12, p5

    move-object/from16 v31, p6

    move-object/from16 v56, p7

    move-object/from16 v57, p8

    move-object/from16 v8, p9

    move-object/from16 v11, p10

    .end local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local p6    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local p7    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local p8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p9    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local p10    # "label$iv$iv":Ljava/lang/String;
    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v11, "label$iv$iv":Ljava/lang/String;
    .local v12, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v31, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .local v56, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local v57, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 585
    nop

    .line 578
    .end local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v27    # "$i$f$animateValue":I
    .end local v31    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local v52    # "$changed$iv$iv$iv":I
    .end local v56    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v57    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    nop

    .line 565
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 578
    nop

    .line 562
    .end local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .end local v8    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v11    # "label$iv$iv":Ljava/lang/String;
    .end local v25    # "$i$f$animateColor":I
    .end local v26    # "$changed$iv$iv":I
    .end local v28    # "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .end local v30    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    nop

    .line 586
    nop

    .line 587
    .local v5, "labelTextStyleColor$iv":Landroidx/compose/runtime/State;
    sget-object v4, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    .line 589
    nop

    .line 587
    const-string v8, "LabelContentColor"

    .local v8, "label$iv$iv":Ljava/lang/String;
    .local v23, "$changed$iv$iv":I
    move-object/from16 v11, v47

    .restart local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .local v11, "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    const/4 v12, 0x0

    .line 565
    .local v12, "$i$f$animateColor":I
    move-object/from16 v52, v5

    .end local v5    # "labelTextStyleColor$iv":Landroidx/compose/runtime/State;
    .local v52, "labelTextStyleColor$iv":Landroidx/compose/runtime/State;
    const v5, -0x739d657f

    move-object/from16 p10, v8

    .end local v8    # "label$iv$iv":Ljava/lang/String;
    .restart local p10    # "label$iv$iv":Ljava/lang/String;
    const-string v8, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 566
    invoke-virtual {v11}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v5

    shr-int/lit8 v8, v23, 0x6

    and-int/lit8 v8, v8, 0x70

    .local v8, "$changed$iv":I
    check-cast v5, Landroidx/compose/material3/internal/InputPhase;

    .local v5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p5, v9

    .local p5, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v25, 0x0

    move-object/from16 p6, v5

    .end local v5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local v25, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2$iv":I
    .local p6, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    const v5, 0x3cff1b76

    move-object/from16 v26, v11

    move-object/from16 v11, p5

    .end local p5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v11, "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v26, "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v27

    if-eqz v27, :cond_6e

    .line 590
    move-object/from16 v27, v11

    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v27, "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v11, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    move/from16 v28, v12

    const/4 v12, -0x1

    .end local v12    # "$i$f$animateColor":I
    .local v28, "$i$f$animateColor":I
    invoke-static {v5, v8, v12, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_4f

    .line 566
    .end local v27    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v28    # "$i$f$animateColor":I
    .restart local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v12    # "$i$f$animateColor":I
    :cond_6e
    move-object/from16 v27, v11

    move/from16 v28, v12

    .line 590
    .end local v11    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$animateColor":I
    .restart local v27    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v28    # "$i$f$animateColor":I
    :goto_4f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_6f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6f
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 566
    .end local v8    # "$changed$iv":I
    .end local v25    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2$iv":I
    .end local v27    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p6    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static/range {v39 .. v40}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v8

    .line 591
    .local v8, "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    const v11, 0x72589593

    const-string v12, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v9, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    .local v11, "invalid$iv$iv$iv":Z
    move-object v12, v9

    .local v12, "$this$cache$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v25, 0x0

    .line 592
    .local v25, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv$iv$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .line 593
    .local v27, "$i$a$-let-ComposerKt$cache$1$iv$iv$iv":I
    if-nez v11, :cond_71

    sget-object v30, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p6, v11

    .end local v11    # "invalid$iv$iv$iv":Z
    .local p6, "invalid$iv$iv$iv":Z
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v5, v11, :cond_70

    goto :goto_50

    .line 598
    :cond_70
    move-object/from16 p7, v5

    goto :goto_51

    .line 593
    .end local p6    # "invalid$iv$iv$iv":Z
    .restart local v11    # "invalid$iv$iv$iv":Z
    :cond_71
    move/from16 p6, v11

    .line 594
    .end local v11    # "invalid$iv$iv$iv":Z
    .restart local p6    # "invalid$iv$iv$iv":Z
    :goto_50
    const/4 v11, 0x0

    .line 595
    .local v11, "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv$iv":I
    sget-object v30, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 p7, v5

    .end local v5    # "it$iv$iv$iv":Ljava/lang/Object;
    .local p7, "it$iv$iv$iv":Ljava/lang/Object;
    invoke-static/range {v30 .. v30}, Landroidx/compose/animation/ColorVectorConverterKt;->getVectorConverter(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;

    move-result-object v5

    invoke-interface {v5, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/animation/core/TwoWayConverter;

    .line 594
    .end local v11    # "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv$iv":I
    nop

    .line 596
    .local v5, "value$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 597
    nop

    .line 593
    .end local v5    # "value$iv$iv$iv":Ljava/lang/Object;
    :goto_51
    nop

    .line 592
    .end local v27    # "$i$a$-let-ComposerKt$cache$1$iv$iv$iv":I
    .end local p7    # "it$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 591
    .end local v12    # "$this$cache$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v25    # "$i$f$cache":I
    .end local p6    # "invalid$iv$iv$iv":Z
    check-cast v5, Landroidx/compose/animation/core/TwoWayConverter;

    .local v5, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 599
    and-int/lit8 v11, v23, 0xe

    shl-int/lit8 v12, v23, 0x3

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v11, v12

    shl-int/lit8 v12, v23, 0x3

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v11, v12

    shl-int/lit8 v12, v23, 0x3

    and-int v12, v12, v29

    or-int/2addr v11, v12

    .local v11, "$changed$iv$iv$iv":I
    move-object/from16 v12, v26

    .local v12, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v25, 0x0

    .line 579
    .local v25, "$i$f$animateValue":I
    move-object/from16 p9, v5

    .end local v5    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local p9    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    const v5, -0x880d1ef

    move-object/from16 v27, v8

    .end local v8    # "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .local v27, "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    const-string v8, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v9, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 581
    invoke-virtual {v12}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v5

    shr-int/lit8 v8, v11, 0x9

    and-int/lit8 v8, v8, 0x70

    .local v8, "$changed$iv":I
    check-cast v5, Landroidx/compose/material3/internal/InputPhase;

    .local v5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 p6, v9

    .local p6, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v30, 0x0

    move-object/from16 p7, v5

    move/from16 v31, v11

    const v11, 0x3cff1b76

    move-object/from16 v5, p6

    .end local v11    # "$changed$iv$iv$iv":I
    .end local p6    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v5, "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v30, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2$iv":I
    .local v31, "$changed$iv$iv$iv":I
    .local p7, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v5, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v56

    if-eqz v56, :cond_72

    .line 590
    move-object/from16 v56, v5

    .end local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .local v56, "$composer$iv":Landroidx/compose/runtime/Composer;
    const-string v5, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    move-object/from16 p6, v12

    const/4 v12, -0x1

    .end local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local p6, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v11, v8, v12, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_52

    .line 581
    .end local v56    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p6    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_72
    move-object/from16 v56, v5

    move-object/from16 p6, v12

    .line 590
    .end local v5    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v56    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .restart local p6    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_52
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_73

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_73
    invoke-interface/range {v56 .. v56}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v8    # "$changed$iv":I
    .end local v30    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2$iv":I
    .end local v56    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local p7    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static/range {v39 .. v40}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v5

    .line 581
    nop

    .line 582
    .local v5, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v8

    shr-int/lit8 v11, v31, 0x9

    and-int/lit8 v11, v11, 0x70

    .local v11, "$changed$iv":I
    check-cast v8, Landroidx/compose/material3/internal/InputPhase;

    .local v8, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    move-object v12, v9

    .local v12, "$composer$iv":Landroidx/compose/runtime/Composer;
    const/16 v30, 0x0

    move-object/from16 p7, v5

    const v5, 0x3cff1b76

    .end local v5    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2$iv":I
    .local p7, "initialValue$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_74

    .line 590
    const-string v3, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    move-object/from16 p5, v8

    const/4 v8, -0x1

    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .local p5, "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v5, v11, v8, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_53

    .line 582
    .end local p5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    :cond_74
    move-object/from16 p5, v8

    .line 590
    .end local v8    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    .restart local p5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    :goto_53
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_75

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_75
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v11    # "$changed$iv":I
    .end local v12    # "$composer$iv":Landroidx/compose/runtime/Composer;
    .end local v30    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2$iv":I
    .end local p5    # "it$iv":Landroidx/compose/material3/internal/InputPhase;
    invoke-static/range {v39 .. v40}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v3

    .line 582
    nop

    .line 583
    .local v3, "targetValue$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v5

    shr-int/lit8 v8, v31, 0x3

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v5, v9, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 585
    .local v5, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v8, v31, 0xe

    shl-int/lit8 v11, v31, 0x9

    and-int v11, v11, v29

    or-int/2addr v8, v11

    shl-int/lit8 v11, v31, 0x6

    and-int v11, v11, v32

    or-int/2addr v8, v11

    move-object/from16 p5, p6

    move-object/from16 p6, p7

    move-object/from16 p7, v3

    move-object/from16 p8, v5

    move/from16 p12, v8

    move-object/from16 p11, v9

    .end local v3    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v5    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local p5, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local p6, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .local p7, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .restart local p8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .restart local p11    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p5 .. p12}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    .line 579
    move-object/from16 v9, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v29, p8

    move-object/from16 v5, p9

    move-object/from16 v8, p10

    move-object/from16 v53, p11

    .end local p5    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local p6    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local p7    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local p8    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p9    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local p10    # "label$iv$iv":Ljava/lang/String;
    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local v8, "label$iv$iv":Ljava/lang/String;
    .local v9, "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v11, "initialValue$iv$iv$iv":Ljava/lang/Object;
    .local v12, "targetValue$iv$iv$iv":Ljava/lang/Object;
    .local v29, "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v53, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v53 .. v53}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 585
    nop

    .line 599
    .end local v9    # "$this$animateValue$iv$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v11    # "initialValue$iv$iv$iv":Ljava/lang/Object;
    .end local v12    # "targetValue$iv$iv$iv":Ljava/lang/Object;
    .end local v25    # "$i$f$animateValue":I
    .end local v29    # "animationSpec$iv$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v31    # "$changed$iv$iv$iv":I
    nop

    .line 565
    invoke-static/range {v53 .. v53}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 599
    nop

    .line 587
    .end local v4    # "transitionSpec$iv$iv":Lkotlin/jvm/functions/Function3;
    .end local v5    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v8    # "label$iv$iv":Ljava/lang/String;
    .end local v23    # "$changed$iv$iv":I
    .end local v26    # "$this$animateColor$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v27    # "colorSpace$iv$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .end local v28    # "$i$f$animateColor":I
    nop

    .line 600
    nop

    .line 607
    .local v3, "labelContentColor$iv":Landroidx/compose/runtime/State;
    nop

    .line 608
    nop

    .line 609
    nop

    .line 610
    nop

    .line 611
    nop

    .line 612
    and-int v4, v43, v32

    .line 607
    move-object/from16 v5, v54

    .local v5, "labelProgress":Landroidx/compose/runtime/State;
    move-object v8, v3

    .local v8, "labelContentColor":Landroidx/compose/runtime/State;
    move-object/from16 v9, v52

    .local v4, "$changed":I
    .local v9, "labelTextStyleColor":Landroidx/compose/runtime/State;
    move-object/from16 v11, v53

    .local v11, "$composer":Landroidx/compose/runtime/Composer;
    move-object/from16 v12, v55

    .local v12, "placeholderAlpha":Landroidx/compose/runtime/State;
    move-object/from16 v23, v51

    .local v23, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    const/16 v56, 0x0

    .line 136
    .local v56, "$i$a$-TextFieldTransitionScope-Jy8F4Js-TextFieldImplKt$CommonDecorationBox$3":I
    move-object/from16 v57, v3

    .end local v3    # "labelContentColor$iv":Landroidx/compose/runtime/State;
    .local v57, "labelContentColor$iv":Landroidx/compose/runtime/State;
    const v3, -0x2216720c

    move/from16 v58, v4

    .end local v4    # "$changed":I
    .local v58, "$changed":I
    const-string v4, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk"

    invoke-static {v11, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v25

    .local v25, "labelProgressValue":F
    const v3, -0x95b99d5

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "*138@5668L506"

    invoke-static {v11, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 138
    const/16 v4, 0x36

    if-nez p4, :cond_76

    move-object/from16 p12, v5

    move-object/from16 v60, v8

    move-object/from16 v61, v9

    move-object/from16 p6, v19

    move-object/from16 v9, v20

    move/from16 v59, v22

    move/from16 v62, v25

    const/16 v19, 0x0

    goto :goto_54

    :cond_76
    move-object/from16 v26, p4

    .local v26, "it":Lkotlin/jvm/functions/Function2;
    const/16 v27, 0x0

    .line 139
    .local v27, "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1":I
    new-instance v28, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1;

    move-object/from16 p9, v8

    move-object/from16 p12, v9

    move-object/from16 p6, v19

    move-object/from16 p7, v20

    move/from16 p11, v22

    move/from16 p8, v25

    move-object/from16 p10, v26

    move-object/from16 p5, v28

    .end local v8    # "labelContentColor":Landroidx/compose/runtime/State;
    .end local v9    # "labelTextStyleColor":Landroidx/compose/runtime/State;
    .end local v19    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local v20    # "bodySmall":Landroidx/compose/ui/text/TextStyle;
    .end local v22    # "overrideLabelTextStyleColor":Z
    .end local v25    # "labelProgressValue":F
    .end local v26    # "it":Lkotlin/jvm/functions/Function2;
    .local p6, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local p7, "bodySmall":Landroidx/compose/ui/text/TextStyle;
    .local p8, "labelProgressValue":F
    .local p9, "labelContentColor":Landroidx/compose/runtime/State;
    .local p10, "it":Lkotlin/jvm/functions/Function2;
    .local p11, "overrideLabelTextStyleColor":Z
    .local p12, "labelTextStyleColor":Landroidx/compose/runtime/State;
    invoke-direct/range {p5 .. p12}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1;-><init>(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/State;)V

    move-object/from16 v3, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v62, p8

    move-object/from16 v60, p9

    move-object/from16 v19, p10

    move/from16 v59, p11

    move-object/from16 v61, p12

    move-object/from16 p12, v5

    .end local v5    # "labelProgress":Landroidx/compose/runtime/State;
    .end local p6    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local p7    # "bodySmall":Landroidx/compose/ui/text/TextStyle;
    .end local p8    # "labelProgressValue":F
    .end local p9    # "labelContentColor":Landroidx/compose/runtime/State;
    .end local p10    # "it":Lkotlin/jvm/functions/Function2;
    .end local p11    # "overrideLabelTextStyleColor":Z
    .local v8, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local v9, "bodySmall":Landroidx/compose/ui/text/TextStyle;
    .local v19, "it":Lkotlin/jvm/functions/Function2;
    .local v59, "overrideLabelTextStyleColor":Z
    .local v60, "labelContentColor":Landroidx/compose/runtime/State;
    .local v61, "labelTextStyleColor":Landroidx/compose/runtime/State;
    .local v62, "labelProgressValue":F
    .local p12, "labelProgress":Landroidx/compose/runtime/State;
    const v5, -0x49b4cc60

    const/4 v8, 0x1

    .end local v8    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .restart local p6    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    invoke-static {v5, v8, v3, v11, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 138
    .end local v19    # "it":Lkotlin/jvm/functions/Function2;
    .end local v27    # "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1":I
    move-object/from16 v19, v3

    :goto_54
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 137
    nop

    .line 155
    .local v19, "decoratedLabel":Lkotlin/jvm/functions/Function2;
    move/from16 v3, v38

    .end local v38    # "enabled":Z
    .local v3, "enabled":Z
    invoke-virtual {v1, v3, v6, v7}, Landroidx/compose/material3/TextFieldColors;->placeholderColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v25

    .line 156
    .local v25, "placeholderColor":J
    const v5, -0x95b32d4

    invoke-static {v11, v5, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v5, 0x0

    .local v5, "invalid$iv":Z
    move-object v8, v11

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v20, 0x0

    .line 613
    .local v20, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .line 614
    .local v27, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v28, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p5, v5

    .end local v5    # "invalid$iv":Z
    .local p5, "invalid$iv":Z
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_77

    .line 615
    const/4 v5, 0x0

    .line 157
    .local v5, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2":I
    move-object/from16 p7, v4

    .end local v4    # "it$iv":Ljava/lang/Object;
    .local p7, "it$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v4

    move/from16 p8, v5

    .end local v5    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2":I
    .local p8, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2":I
    new-instance v5, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1;

    invoke-direct {v5, v12}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1;-><init>(Landroidx/compose/runtime/State;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {v4, v5}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v4

    .line 615
    .end local p8    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2":I
    nop

    .line 616
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 617
    nop

    .end local v4    # "value$iv":Ljava/lang/Object;
    goto :goto_55

    .line 618
    .end local p7    # "it$iv":Ljava/lang/Object;
    .local v4, "it$iv":Ljava/lang/Object;
    :cond_77
    move-object/from16 p7, v4

    .line 614
    .end local v4    # "it$iv":Ljava/lang/Object;
    .restart local p7    # "it$iv":Ljava/lang/Object;
    :goto_55
    nop

    .line 613
    .end local v27    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p7    # "it$iv":Ljava/lang/Object;
    nop

    .line 156
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v20    # "$i$f$cache":I
    .end local p5    # "invalid$iv":Z
    check-cast v4, Landroidx/compose/runtime/State;

    .local v4, "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v5, -0x95b1996

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "160@6765L362"

    invoke-static {v11, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 160
    if-eqz p18, :cond_79

    move-object/from16 v5, v37

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_78

    const/4 v5, 0x1

    goto :goto_56

    :cond_78
    const/4 v5, 0x0

    :goto_56
    if-eqz v5, :cond_79

    invoke-static {v4}, Landroidx/compose/material3/internal/TextFieldImplKt;->CommonDecorationBox$lambda$15$lambda$7(Landroidx/compose/runtime/State;)Z

    move-result v5

    if-eqz v5, :cond_79

    .line 161
    new-instance v5, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1;

    move-object/from16 p9, p6

    move-object/from16 p10, p18

    move-object/from16 p5, v5

    move-object/from16 p6, v12

    move-wide/from16 p7, v25

    .end local v12    # "placeholderAlpha":Landroidx/compose/runtime/State;
    .end local v25    # "placeholderColor":J
    .end local p18    # "placeholder":Lkotlin/jvm/functions/Function2;
    .local p6, "placeholderAlpha":Landroidx/compose/runtime/State;
    .local p7, "placeholderColor":J
    .local p9, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local p10, "placeholder":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {p5 .. p10}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1;-><init>(Landroidx/compose/runtime/State;JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v12, p5

    move-object/from16 v5, p6

    move-wide/from16 v63, p7

    move-object/from16 v8, p9

    move-object/from16 v38, p10

    move-object/from16 p13, v4

    .end local v4    # "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    .end local p6    # "placeholderAlpha":Landroidx/compose/runtime/State;
    .end local p7    # "placeholderColor":J
    .end local p9    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local p10    # "placeholder":Lkotlin/jvm/functions/Function2;
    .local v5, "placeholderAlpha":Landroidx/compose/runtime/State;
    .local v8, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local v38, "placeholder":Lkotlin/jvm/functions/Function2;
    .local v63, "placeholderColor":J
    .local p13, "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    const v4, -0x275ecc34

    move-object/from16 p18, v5

    move-object/from16 p6, v8

    const/16 v5, 0x36

    const/4 v8, 0x1

    .end local v5    # "placeholderAlpha":Landroidx/compose/runtime/State;
    .end local v8    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local p6, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local p18, "placeholderAlpha":Landroidx/compose/runtime/State;
    invoke-static {v4, v8, v12, v11, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function3;

    goto :goto_57

    .line 160
    .end local v38    # "placeholder":Lkotlin/jvm/functions/Function2;
    .end local v63    # "placeholderColor":J
    .end local p13    # "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    .restart local v4    # "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    .restart local v12    # "placeholderAlpha":Landroidx/compose/runtime/State;
    .restart local v25    # "placeholderColor":J
    .local p18, "placeholder":Lkotlin/jvm/functions/Function2;
    :cond_79
    move-object/from16 v38, p18

    move-object/from16 p13, v4

    move-object/from16 p18, v12

    move-wide/from16 v63, v25

    .line 170
    .end local v4    # "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    .end local v12    # "placeholderAlpha":Landroidx/compose/runtime/State;
    .end local v25    # "placeholderColor":J
    .restart local v38    # "placeholder":Lkotlin/jvm/functions/Function2;
    .restart local v63    # "placeholderColor":J
    .restart local p13    # "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    .local p18, "placeholderAlpha":Landroidx/compose/runtime/State;
    const/4 v4, 0x0

    .line 160
    :goto_57
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 159
    nop

    .line 172
    .local v4, "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    invoke-virtual {v1, v3, v6, v7}, Landroidx/compose/material3/TextFieldColors;->prefixColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v25

    .line 173
    .local v25, "prefixColor":J
    const v5, -0x95ad073

    invoke-static {v11, v5, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v5, 0x0

    .local v5, "invalid$iv":Z
    move-object v8, v11

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 619
    .local v12, "$i$f$cache":I
    move-object/from16 v20, v4

    .end local v4    # "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    .local v20, "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .line 620
    .restart local v27    # "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v28, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p5, v5

    .end local v5    # "invalid$iv":Z
    .restart local p5    # "invalid$iv":Z
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_7a

    .line 621
    const/4 v5, 0x0

    .line 174
    .local v5, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2":I
    move-object/from16 p7, v4

    .end local v4    # "it$iv":Ljava/lang/Object;
    .local p7, "it$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v4

    move/from16 p8, v5

    .end local v5    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2":I
    .local p8, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2":I
    new-instance v5, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1;

    move/from16 p9, v12

    move-object/from16 v12, v23

    .end local v23    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local v12, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p9, "$i$f$cache":I
    invoke-direct {v5, v12}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1;-><init>(Landroidx/compose/runtime/State;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {v4, v5}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v4

    .line 621
    .end local p8    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2":I
    nop

    .line 622
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 623
    nop

    .end local v4    # "value$iv":Ljava/lang/Object;
    goto :goto_58

    .line 624
    .end local p7    # "it$iv":Ljava/lang/Object;
    .end local p9    # "$i$f$cache":I
    .local v4, "it$iv":Ljava/lang/Object;
    .local v12, "$i$f$cache":I
    .restart local v23    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    :cond_7a
    move-object/from16 p7, v4

    move/from16 p9, v12

    move-object/from16 v12, v23

    .line 620
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v23    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local v12, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .restart local p7    # "it$iv":Ljava/lang/Object;
    .restart local p9    # "$i$f$cache":I
    :goto_58
    nop

    .line 619
    .end local v27    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p7    # "it$iv":Ljava/lang/Object;
    nop

    .line 173
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p5    # "invalid$iv":Z
    .end local p9    # "$i$f$cache":I
    check-cast v4, Landroidx/compose/runtime/State;

    .local v4, "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v5, -0x95ab8ec

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "177@7507L341"

    invoke-static {v11, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 177
    if-eqz v16, :cond_7b

    invoke-static {v4}, Landroidx/compose/material3/internal/TextFieldImplKt;->CommonDecorationBox$lambda$15$lambda$9(Landroidx/compose/runtime/State;)Z

    move-result v5

    if-eqz v5, :cond_7b

    .line 178
    new-instance v5, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1;

    move-object/from16 p9, p6

    move-object/from16 p5, v5

    move-object/from16 p6, v12

    move-object/from16 p10, v16

    move-wide/from16 p7, v25

    .end local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .end local v16    # "prefix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "prefixColor":J
    .local p6, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p7, "prefixColor":J
    .local p9, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local p10, "prefix":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {p5 .. p10}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1;-><init>(Landroidx/compose/runtime/State;JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;)V

    move-wide/from16 v66, p7

    move-object/from16 v8, p9

    move-object/from16 v65, p10

    move-object/from16 v68, v4

    .end local v4    # "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    .end local p6    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .end local p7    # "prefixColor":J
    .end local p9    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local p10    # "prefix":Lkotlin/jvm/functions/Function2;
    .local v8, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .restart local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local v65, "prefix":Lkotlin/jvm/functions/Function2;
    .local v66, "prefixColor":J
    .local v68, "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    const v4, 0x105afde6

    move-object/from16 p6, v8

    move-object/from16 p5, v12

    const/16 v8, 0x36

    const/4 v12, 0x1

    .end local v8    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p5, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p6, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    invoke-static {v4, v12, v5, v11, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    goto :goto_59

    .line 177
    .end local v65    # "prefix":Lkotlin/jvm/functions/Function2;
    .end local v66    # "prefixColor":J
    .end local v68    # "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    .end local p5    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .restart local v4    # "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    .restart local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .restart local v16    # "prefix":Lkotlin/jvm/functions/Function2;
    .restart local v25    # "prefixColor":J
    :cond_7b
    move-object/from16 v68, v4

    move-object/from16 p5, v12

    move-object/from16 v65, v16

    move-wide/from16 v66, v25

    .line 187
    .end local v4    # "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    .end local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .end local v16    # "prefix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "prefixColor":J
    .restart local v65    # "prefix":Lkotlin/jvm/functions/Function2;
    .restart local v66    # "prefixColor":J
    .restart local v68    # "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    .restart local p5    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    const/4 v4, 0x0

    .line 177
    :goto_59
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 176
    nop

    .line 189
    .local v4, "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    invoke-virtual {v1, v3, v6, v7}, Landroidx/compose/material3/TextFieldColors;->suffixColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v25

    .local v25, "suffixColor":J
    const v5, -0x95a706c

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "191@8087L341"

    invoke-static {v11, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 191
    if-eqz v17, :cond_7c

    invoke-static/range {v68 .. v68}, Landroidx/compose/material3/internal/TextFieldImplKt;->CommonDecorationBox$lambda$15$lambda$9(Landroidx/compose/runtime/State;)Z

    move-result v5

    if-eqz v5, :cond_7c

    .line 192
    new-instance v5, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1;

    move-object/from16 p9, p6

    move-object/from16 p10, v17

    move-wide/from16 p7, v25

    move-object/from16 p6, p5

    move-object/from16 p5, v5

    .end local v17    # "suffix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "suffixColor":J
    .end local p5    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p6, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p7, "suffixColor":J
    .restart local p9    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local p10, "suffix":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {p5 .. p10}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1;-><init>(Landroidx/compose/runtime/State;JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v12, p6

    move-wide/from16 v71, p7

    move-object/from16 v69, p9

    move-object/from16 v70, p10

    .end local p6    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .end local p7    # "suffixColor":J
    .end local p9    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local p10    # "suffix":Lkotlin/jvm/functions/Function2;
    .restart local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local v69, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .local v70, "suffix":Lkotlin/jvm/functions/Function2;
    .local v71, "suffixColor":J
    const v8, -0x5af8699b

    move-object/from16 p5, v4

    const/16 v4, 0x36

    const/4 v12, 0x1

    .end local v4    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local v12    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p5, "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .restart local p6    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    invoke-static {v8, v12, v5, v11, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function2;

    move-object/from16 v23, v5

    goto :goto_5a

    .line 191
    .end local v69    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .end local v70    # "suffix":Lkotlin/jvm/functions/Function2;
    .end local v71    # "suffixColor":J
    .restart local v4    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .restart local v17    # "suffix":Lkotlin/jvm/functions/Function2;
    .restart local v25    # "suffixColor":J
    .local p5, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .local p6, "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    :cond_7c
    move-object/from16 v69, p6

    move-object/from16 v70, v17

    move-wide/from16 v71, v25

    move-object/from16 p6, p5

    move-object/from16 p5, v4

    .line 201
    .end local v4    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local v17    # "suffix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "suffixColor":J
    .restart local v69    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    .restart local v70    # "suffix":Lkotlin/jvm/functions/Function2;
    .restart local v71    # "suffixColor":J
    .local p5, "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .local p6, "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    const/16 v23, 0x0

    .line 191
    :goto_5a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 190
    nop

    .line 203
    .local v23, "decoratedSuffix":Lkotlin/jvm/functions/Function2;
    invoke-virtual {v1, v3, v6, v7}, Landroidx/compose/material3/TextFieldColors;->leadingIconColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v4

    .local v4, "leadingIconColor":J
    const v8, -0x95a2632

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "*205@8655L61"

    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 205
    if-nez v34, :cond_7d

    move-wide/from16 p8, v4

    const/4 v4, 0x0

    goto :goto_5b

    :cond_7d
    move-object/from16 v8, v34

    .local v8, "it":Lkotlin/jvm/functions/Function2;
    const/4 v12, 0x0

    .line 206
    .local v12, "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1":I
    move/from16 p7, v12

    .end local v12    # "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1":I
    .local p7, "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1":I
    new-instance v12, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1;

    invoke-direct {v12, v4, v5, v8}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1;-><init>(JLkotlin/jvm/functions/Function2;)V

    move-wide/from16 p8, v4

    .end local v4    # "leadingIconColor":J
    .local p8, "leadingIconColor":J
    const v4, -0x7c1480e

    move-object/from16 p10, v8

    const/16 v5, 0x36

    const/4 v8, 0x1

    .end local v8    # "it":Lkotlin/jvm/functions/Function2;
    .local p10, "it":Lkotlin/jvm/functions/Function2;
    invoke-static {v4, v8, v12, v11, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 205
    .end local p7    # "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1":I
    .end local p10    # "it":Lkotlin/jvm/functions/Function2;
    nop

    :goto_5b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 204
    nop

    .line 209
    .local v4, "decoratedLeading":Lkotlin/jvm/functions/Function2;
    move-object/from16 p7, v4

    .end local v4    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .local p7, "decoratedLeading":Lkotlin/jvm/functions/Function2;
    invoke-virtual {v1, v3, v6, v7}, Landroidx/compose/material3/TextFieldColors;->trailingIconColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v4

    .local v4, "trailingIconColor":J
    const v8, -0x95a02f1

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "*211@8937L62"

    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 211
    if-nez v14, :cond_7e

    move-wide/from16 v73, v4

    const/4 v4, 0x0

    goto :goto_5c

    :cond_7e
    move-object v8, v14

    .restart local v8    # "it":Lkotlin/jvm/functions/Function2;
    const/4 v12, 0x0

    .line 212
    .local v12, "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1":I
    move/from16 p10, v12

    .end local v12    # "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1":I
    .local p10, "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1":I
    new-instance v12, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1;

    invoke-direct {v12, v4, v5, v8}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1;-><init>(JLkotlin/jvm/functions/Function2;)V

    move-wide/from16 v73, v4

    .end local v4    # "trailingIconColor":J
    .local v73, "trailingIconColor":J
    const v4, 0x7bf77be6

    move-object/from16 v16, v8

    const/16 v5, 0x36

    const/4 v8, 0x1

    .end local v8    # "it":Lkotlin/jvm/functions/Function2;
    .local v16, "it":Lkotlin/jvm/functions/Function2;
    invoke-static {v4, v8, v12, v11, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 211
    .end local v16    # "it":Lkotlin/jvm/functions/Function2;
    .end local p10    # "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1":I
    nop

    :goto_5c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 210
    nop

    .line 215
    .local v4, "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    move-object/from16 p10, v4

    .end local v4    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .local p10, "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    invoke-virtual {v1, v3, v6, v7}, Landroidx/compose/material3/TextFieldColors;->supportingTextColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v4

    .local v4, "supportingTextColor":J
    const v8, -0x959ddf6

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "*217@9228L217"

    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 217
    if-nez v33, :cond_7f

    move/from16 v75, v3

    move-wide/from16 v76, v4

    const/16 v27, 0x0

    goto :goto_5d

    :cond_7f
    move-object/from16 v8, v33

    .restart local v8    # "it":Lkotlin/jvm/functions/Function2;
    const/4 v12, 0x0

    .line 218
    .local v12, "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1":I
    new-instance v1, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1;

    invoke-direct {v1, v4, v5, v9, v8}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1;-><init>(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;)V

    move/from16 v75, v3

    .end local v3    # "enabled":Z
    .local v75, "enabled":Z
    const v3, 0x4b52a37d    # 1.3804413E7f

    move-wide/from16 v76, v4

    const/16 v4, 0x36

    const/4 v5, 0x1

    .end local v4    # "supportingTextColor":J
    .local v76, "supportingTextColor":J
    invoke-static {v3, v5, v1, v11, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 217
    .end local v8    # "it":Lkotlin/jvm/functions/Function2;
    .end local v12    # "$i$a$-let-TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1":I
    move-object/from16 v27, v1

    :goto_5d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 216
    nop

    .line 227
    .local v27, "decoratedSupporting":Lkotlin/jvm/functions/Function2;
    sget-object v1, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/internal/TextFieldType;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_6

    .line 292
    move-object/from16 v22, p5

    move-object/from16 v1, p7

    move-object/from16 v21, p10

    move-object v0, v11

    move/from16 v25, v62

    .end local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v62    # "labelProgressValue":F
    .end local p5    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local p7    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local p10    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .local v0, "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .local v21, "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .local v22, "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .local v25, "labelProgressValue":F
    const v3, -0x21b15a9f

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_61

    .line 252
    .end local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v1    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local v21    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .end local v22    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "labelProgressValue":F
    .restart local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v62    # "labelProgressValue":F
    .restart local p5    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .restart local p7    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .restart local p10    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    :pswitch_12
    const v1, -0x21cc046f

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "253@10659L38,254@10766L314,275@11639L463,264@11098L1286"

    invoke-static {v11, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 254
    const v1, -0x95927b9

    invoke-static {v11, v1, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x0

    .local v1, "invalid$iv":Z
    move-object v3, v11

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 625
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 626
    .local v8, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v5, v12, :cond_80

    .line 627
    const/4 v12, 0x0

    .line 254
    .local v12, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$labelSize$1":I
    sget-object v16, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    move-result-wide v16

    move/from16 v25, v1

    .end local v1    # "invalid$iv":Z
    .local v25, "invalid$iv":Z
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    move-result-object v1

    move/from16 v16, v4

    .end local v4    # "$i$f$cache":I
    .local v16, "$i$f$cache":I
    const/4 v4, 0x2

    move-object/from16 v17, v5

    const/4 v5, 0x0

    .end local v5    # "it$iv":Ljava/lang/Object;
    .local v17, "it$iv":Ljava/lang/Object;
    invoke-static {v1, v5, v4, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    .line 627
    .end local v12    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$labelSize$1":I
    nop

    .line 628
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 629
    nop

    .end local v1    # "value$iv":Ljava/lang/Object;
    goto :goto_5e

    .line 630
    .end local v16    # "$i$f$cache":I
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v25    # "invalid$iv":Z
    .local v1, "invalid$iv":Z
    .restart local v4    # "$i$f$cache":I
    .restart local v5    # "it$iv":Ljava/lang/Object;
    :cond_80
    move/from16 v25, v1

    move/from16 v16, v4

    move-object/from16 v17, v5

    .end local v1    # "invalid$iv":Z
    .end local v4    # "$i$f$cache":I
    .end local v5    # "it$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$cache":I
    .restart local v17    # "it$iv":Ljava/lang/Object;
    .restart local v25    # "invalid$iv":Z
    move-object/from16 v1, v17

    .line 626
    :goto_5e
    nop

    .line 625
    .end local v8    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v17    # "it$iv":Ljava/lang/Object;
    nop

    .line 254
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local v25    # "invalid$iv":Z
    check-cast v1, Landroidx/compose/runtime/MutableState;

    .local v1, "labelSize":Landroidx/compose/runtime/MutableState;
    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 255
    new-instance v3, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1;

    invoke-direct {v3, v1, v0, v2}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;)V

    const v4, 0x96014d9

    const/16 v5, 0x36

    const/4 v12, 0x1

    invoke-static {v4, v12, v3, v11, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 266
    .local v3, "borderContainerWithId":Lkotlin/jvm/functions/Function2;
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v16, v4

    check-cast v16, Landroidx/compose/ui/Modifier;

    .line 267
    nop

    .line 268
    nop

    .line 269
    nop

    .line 270
    nop

    .line 271
    nop

    .line 272
    nop

    .line 273
    nop

    .line 275
    nop

    .line 287
    nop

    .line 276
    const v4, -0x958ab90

    invoke-static {v11, v4, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    move/from16 v4, v62

    .end local v62    # "labelProgressValue":F
    .local v4, "labelProgressValue":F
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v5

    .local v5, "invalid$iv":Z
    move-object v8, v11

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 631
    .local v10, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 632
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_82

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v12, v0, :cond_81

    goto :goto_5f

    .line 636
    :cond_81
    move-object v0, v12

    goto :goto_60

    .line 633
    :cond_82
    :goto_5f
    const/4 v0, 0x0

    .line 276
    .local v0, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$1":I
    move/from16 p11, v0

    .end local v0    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$1":I
    .local p11, "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$1":I
    new-instance v0, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$1$1;

    invoke-direct {v0, v4, v1}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$1$1;-><init>(FLandroidx/compose/runtime/MutableState;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 633
    .end local p11    # "$i$a$-cache-TextFieldImplKt$CommonDecorationBox$3$1":I
    nop

    .line 634
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 635
    nop

    .line 632
    .end local v0    # "value$iv":Ljava/lang/Object;
    :goto_60
    nop

    .line 631
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 276
    .end local v5    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    move-object/from16 v26, v0

    check-cast v26, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 288
    nop

    .line 274
    nop

    .line 289
    shr-int/lit8 v0, v36, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x6

    shl-int/lit8 v5, v35, 0x15

    const/high16 v8, 0xe000000

    and-int/2addr v5, v8

    or-int v31, v0, v5

    shr-int/lit8 v0, v35, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v32, v0, 0x30

    .line 265
    move-object/from16 v22, p5

    move-object/from16 v21, p10

    move-object/from16 v29, p15

    move/from16 v25, v4

    move-object/from16 v30, v11

    move-object/from16 v17, v13

    move-object/from16 v18, v20

    move-object/from16 v28, v27

    move-object/from16 v20, p7

    move-object/from16 v27, v3

    .end local v3    # "borderContainerWithId":Lkotlin/jvm/functions/Function2;
    .end local v4    # "labelProgressValue":F
    .end local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p5    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local p7    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local p10    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .local v18, "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    .local v20, "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .restart local v21    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .restart local v22    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .local v25, "labelProgressValue":F
    .local v27, "borderContainerWithId":Lkotlin/jvm/functions/Function2;
    .local v28, "decoratedSupporting":Lkotlin/jvm/functions/Function2;
    .local v30, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v32}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextFieldLayout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V

    .line 252
    move-object/from16 v1, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    move-object/from16 v27, v28

    move-object/from16 v0, v30

    move-object/from16 v20, v18

    .end local v18    # "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    .end local v21    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .end local v22    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local v28    # "decoratedSupporting":Lkotlin/jvm/functions/Function2;
    .end local v30    # "$composer":Landroidx/compose/runtime/Composer;
    .local v0, "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .local v3, "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .local v4, "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .local v20, "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    .local v27, "decoratedSupporting":Lkotlin/jvm/functions/Function2;
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_61

    .line 228
    .end local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v1    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local v3    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .end local v4    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "labelProgressValue":F
    .restart local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v62    # "labelProgressValue":F
    .restart local p5    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .restart local p7    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .restart local p10    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    :pswitch_13
    move-object/from16 v4, p5

    move-object/from16 v1, p7

    move-object/from16 v3, p10

    move-object v0, v11

    move/from16 v25, v62

    .end local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v62    # "labelProgressValue":F
    .end local p5    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local p7    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local p10    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .restart local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .restart local v3    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .restart local v4    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .restart local v25    # "labelProgressValue":F
    const v5, -0x21dc9887

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "228@9583L167,234@9768L769"

    invoke-static {v0, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 229
    new-instance v5, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$containerWithId$1;

    invoke-direct {v5, v2}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$3$containerWithId$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v8, 0x6853e27c

    const/16 v10, 0x36

    const/4 v12, 0x1

    invoke-static {v8, v12, v5, v0, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    move-object/from16 v26, v5

    check-cast v26, Lkotlin/jvm/functions/Function2;

    .line 236
    .local v26, "containerWithId":Lkotlin/jvm/functions/Function2;
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v16, v5

    check-cast v16, Landroidx/compose/ui/Modifier;

    .line 237
    nop

    .line 239
    nop

    .line 238
    nop

    .line 240
    nop

    .line 241
    nop

    .line 242
    nop

    .line 243
    nop

    .line 246
    nop

    .line 248
    nop

    .line 244
    nop

    .line 245
    nop

    .line 249
    shr-int/lit8 v5, v36, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/lit8 v5, v5, 0x6

    shl-int/lit8 v8, v35, 0x15

    const/high16 v10, 0xe000000

    and-int/2addr v8, v10

    or-int v30, v5, v8

    shr-int/lit8 v5, v35, 0x9

    and-int/lit16 v5, v5, 0x380

    or-int/lit8 v31, v5, 0x6

    .line 235
    move-object/from16 v17, p2

    move-object/from16 v28, p15

    move-object/from16 v29, v0

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v1

    .end local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v1    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local v3    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .end local v4    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .local v18, "decoratedLabel":Lkotlin/jvm/functions/Function2;
    .local v19, "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    .local v20, "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .restart local v21    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .restart local v22    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v31}, Landroidx/compose/material3/TextFieldKt;->TextFieldLayout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V

    .line 228
    move-object/from16 v20, v19

    move-object/from16 v19, v18

    .end local v18    # "decoratedLabel":Lkotlin/jvm/functions/Function2;
    .end local v26    # "containerWithId":Lkotlin/jvm/functions/Function2;
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .local v19, "decoratedLabel":Lkotlin/jvm/functions/Function2;
    .local v20, "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 136
    :goto_61
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 293
    .end local v1    # "decoratedLeading":Lkotlin/jvm/functions/Function2;
    .end local v19    # "decoratedLabel":Lkotlin/jvm/functions/Function2;
    .end local v20    # "decoratedPlaceholder":Lkotlin/jvm/functions/Function3;
    .end local v21    # "decoratedTrailing":Lkotlin/jvm/functions/Function2;
    .end local v22    # "decoratedPrefix":Lkotlin/jvm/functions/Function2;
    .end local v23    # "decoratedSuffix":Lkotlin/jvm/functions/Function2;
    .end local v25    # "labelProgressValue":F
    .end local v27    # "decoratedSupporting":Lkotlin/jvm/functions/Function2;
    .end local v63    # "placeholderColor":J
    .end local v66    # "prefixColor":J
    .end local v68    # "showPrefixSuffix$delegate":Landroidx/compose/runtime/State;
    .end local v71    # "suffixColor":J
    .end local v73    # "trailingIconColor":J
    .end local v76    # "supportingTextColor":J
    .end local p8    # "leadingIconColor":J
    .end local p13    # "showPlaceholder$delegate":Landroidx/compose/runtime/State;
    nop

    .line 607
    .end local v0    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v56    # "$i$a$-TextFieldTransitionScope-Jy8F4Js-TextFieldImplKt$CommonDecorationBox$3":I
    .end local v58    # "$changed":I
    .end local v60    # "labelContentColor":Landroidx/compose/runtime/State;
    .end local v61    # "labelTextStyleColor":Landroidx/compose/runtime/State;
    .end local p6    # "prefixSuffixAlpha":Landroidx/compose/runtime/State;
    .end local p12    # "labelProgress":Landroidx/compose/runtime/State;
    .end local p18    # "placeholderAlpha":Landroidx/compose/runtime/State;
    nop

    .line 512
    invoke-static/range {v53 .. v53}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 637
    nop

    .end local v41    # "unfocusedLabelTextStyleColor$iv":J
    .end local v43    # "$changed$iv":I
    .end local v44    # "$i$f$TextFieldTransitionScope-Jy8F4Js":I
    .end local v46    # "showLabel$iv":Z
    .end local v47    # "transition$iv":Landroidx/compose/animation/core/Transition;
    .end local v49    # "focusedLabelTextStyleColor$iv":J
    .end local v51    # "prefixSuffixOpacity$iv":Landroidx/compose/runtime/State;
    .end local v52    # "labelTextStyleColor$iv":Landroidx/compose/runtime/State;
    .end local v54    # "labelProgress$iv":Landroidx/compose/runtime/State;
    .end local v55    # "placeholderOpacity$iv":Landroidx/compose/runtime/State;
    .end local v57    # "labelContentColor$iv":Landroidx/compose/runtime/State;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_83

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 294
    .end local v7    # "isFocused":Z
    .end local v9    # "bodySmall":Landroidx/compose/ui/text/TextStyle;
    .end local v37    # "transformedText":Ljava/lang/String;
    .end local v39    # "labelColor":J
    .end local v45    # "typography":Landroidx/compose/material3/Typography;
    .end local v48    # "inputState":Landroidx/compose/material3/internal/InputPhase;
    .end local v59    # "overrideLabelTextStyleColor":Z
    .end local v69    # "bodyLarge":Landroidx/compose/ui/text/TextStyle;
    :cond_83
    move-object v8, v14

    move/from16 v12, v24

    move-object/from16 v11, v33

    move-object/from16 v7, v34

    move-object/from16 v9, v65

    move-object/from16 v10, v70

    move/from16 v13, v75

    move v14, v6

    move-object/from16 v6, v38

    .end local v24    # "singleLine":Z
    .end local v33    # "supportingText":Lkotlin/jvm/functions/Function2;
    .end local v34    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v38    # "placeholder":Lkotlin/jvm/functions/Function2;
    .end local v65    # "prefix":Lkotlin/jvm/functions/Function2;
    .end local v70    # "suffix":Lkotlin/jvm/functions/Function2;
    .end local v75    # "enabled":Z
    .local v6, "placeholder":Lkotlin/jvm/functions/Function2;
    .local v7, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v8, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v9, "prefix":Lkotlin/jvm/functions/Function2;
    .local v10, "suffix":Lkotlin/jvm/functions/Function2;
    .local v11, "supportingText":Lkotlin/jvm/functions/Function2;
    .local v12, "singleLine":Z
    .local v13, "enabled":Z
    .local v14, "isError":Z
    :goto_62
    invoke-interface/range {v53 .. v53}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_84

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$4;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v78, v1

    move-object/from16 v18, v2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v21}, Landroidx/compose/material3/internal/TextFieldImplKt$CommonDecorationBox$4;-><init>(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v78

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_84
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method private static final CommonDecorationBox$lambda$15$lambda$7(Landroidx/compose/runtime/State;)Z
    .locals 4
    .param p0, "$showPlaceholder$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 156
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 698
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 156
    return v0
.end method

.method private static final CommonDecorationBox$lambda$15$lambda$9(Landroidx/compose/runtime/State;)Z
    .locals 4
    .param p0, "$showPrefixSuffix$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 173
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 699
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 173
    return v0
.end method

.method private static final Decoration-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 13
    .param p0, "contentColor"    # J
    .param p2, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "content"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 299
    move/from16 v5, p5

    const v0, 0x480b140c

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(Decoration)P(1:c#ui.graphics.Color,2)298@12599L62:TextFieldImpl.kt#mqatfk"

    invoke-static {v10, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p5

    .local v1, "$dirty":I
    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_1

    invoke-interface {v10, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_1
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_3

    invoke-interface {v10, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_1

    :cond_2
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v5, 0x180

    if-nez v2, :cond_5

    move-object/from16 v4, p3

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_2

    :cond_4
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v1, v2

    goto :goto_3

    :cond_5
    move-object/from16 v4, p3

    :goto_3
    move v12, v1

    .end local v1    # "$dirty":I
    .local v12, "$dirty":I
    and-int/lit16 v1, v12, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)"

    invoke-static {v0, v12, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_8
    and-int/lit8 v0, v12, 0xe

    and-int/lit8 v1, v12, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v12, 0x380

    or-int v11, v0, v1

    move-wide v6, p0

    move-object v8, p2

    move-object v9, v4

    invoke-static/range {v6 .. v11}, Landroidx/compose/material3/internal/ProvideContentColorTextStyleKt;->ProvideContentColorTextStyle-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    :goto_5
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Landroidx/compose/material3/internal/TextFieldImplKt$Decoration$1;

    move-wide v1, p0

    move-object v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/internal/TextFieldImplKt$Decoration$1;-><init>(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;I)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method private static final Decoration-Iv8Zu3U(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .param p0, "contentColor"    # J
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 304
    const v0, 0x2758fb84

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v1, "C(Decoration)P(1:c#ui.graphics.Color)303@12806L84:TextFieldImpl.kt#mqatfk"

    invoke-static {p3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move v1, p4

    .local v1, "$dirty":I
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    invoke-interface {p3, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_1

    :cond_2
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v0

    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    and-int/lit8 v3, v1, 0x70

    or-int/2addr v2, v3

    invoke-static {v0, p2, p3, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    :goto_3
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v2, Landroidx/compose/material3/internal/TextFieldImplKt$Decoration$2;

    invoke-direct {v2, p0, p1, p2, p4}, Landroidx/compose/material3/internal/TextFieldImplKt$Decoration$2;-><init>(JLkotlin/jvm/functions/Function2;I)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_8
    return-void
.end method

.method private static final TextFieldTransitionScope-Jy8F4Js(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .param p0, "inputState"    # Landroidx/compose/material3/internal/InputPhase;
    .param p1, "focusedLabelTextStyleColor"    # J
    .param p3, "unfocusedLabelTextStyleColor"    # J
    .param p5, "labelColor"    # J
    .param p7, "showLabel"    # Z
    .param p8, "content"    # Lkotlin/jvm/functions/Function7;
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/internal/InputPhase;",
            "JJJZ",
            "Lkotlin/jvm/functions/Function7<",
            "-",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;-",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;-",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;-",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;-",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v6, p9

    const/4 v8, 0x0

    .line 346
    .local v8, "$i$f$TextFieldTransitionScope-Jy8F4Js":I
    const v0, -0x40d508a2

    const-string v1, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk"

    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 350
    and-int/lit8 v0, p10, 0xe

    or-int/lit8 v0, v0, 0x30

    const/4 v1, 0x0

    const-string v2, "TextFieldInputState"

    move-object/from16 v9, p0

    invoke-static {v9, v2, v6, v0, v1}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v10

    .line 353
    .local v10, "transition":Landroidx/compose/animation/core/Transition;
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelProgress$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelProgress$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 354
    nop

    .line 353
    move-object v11, v0

    .local v11, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    move-object v12, v10

    .local v12, "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    const-string v5, "LabelProgress"

    .local v5, "label$iv":Ljava/lang/String;
    const/16 v13, 0x180

    move v14, v13

    .local v14, "$changed$iv":I
    const/4 v15, 0x0

    .line 638
    .local v15, "$i$f$animateFloat":I
    const v0, -0x4fcbfb15

    const-string v1, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v4

    .local v4, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, v14, 0xe

    shl-int/lit8 v2, v14, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, v14, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, v14, 0x3

    const v16, 0xe000

    and-int v2, v2, v16

    or-int/2addr v1, v2

    move v2, v0

    .local v1, "$changed$iv$iv":I
    move-object v0, v12

    .local v0, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    move/from16 v17, v1

    .end local v1    # "$changed$iv$iv":I
    .local v17, "$changed$iv$iv":I
    const/16 v18, 0x0

    .line 639
    .local v18, "$i$f$animateValue":I
    const v1, -0x880d1ef

    const-string v3, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v6, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 641
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v7

    shr-int/lit8 v19, v17, 0x9

    and-int/lit8 v1, v19, 0x70

    .local v1, "$changed":I
    check-cast v7, Landroidx/compose/material3/internal/InputPhase;

    .local v7, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v19, p9

    .local v19, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .local v21, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2":I
    const v2, -0x796609df

    move/from16 v23, v13

    move-object/from16 v13, v19

    .end local v19    # "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "C:TextFieldImpl.kt#mqatfk"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v24

    move/from16 v25, v8

    .end local v8    # "$i$f$TextFieldTransitionScope-Jy8F4Js":I
    .local v25, "$i$f$TextFieldTransitionScope-Jy8F4Js":I
    const/4 v8, -0x1

    if-eqz v24, :cond_0

    .line 357
    move-object/from16 v24, v0

    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v24, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const-string v0, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"

    move-object/from16 v26, v3

    const v3, -0x796609df

    invoke-static {v3, v1, v8, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    .line 641
    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_0
    move-object/from16 v24, v0

    move-object/from16 v26, v3

    .line 357
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_0
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v7}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v3

    aget v0, v0, v3

    const/16 v27, 0x0

    const/high16 v28, 0x3f800000    # 1.0f

    packed-switch v0, :pswitch_data_0

    .line 360
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    move/from16 v0, v28

    goto :goto_1

    .line 359
    :pswitch_1
    move/from16 v0, v27

    goto :goto_1

    .line 358
    :pswitch_2
    move/from16 v0, v28

    .line 357
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v1    # "$changed":I
    .end local v7    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2":I
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 641
    nop

    .line 642
    .local v1, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v0

    shr-int/lit8 v3, v17, 0x9

    and-int/lit8 v3, v3, 0x70

    .local v3, "$changed":I
    check-cast v0, Landroidx/compose/material3/internal/InputPhase;

    .local v0, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v7, p9

    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    const v8, -0x796609df

    .local v13, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2":I
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v7, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v19

    if-eqz v19, :cond_2

    .line 357
    move-object/from16 v19, v0

    .end local v0    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v19, "it":Landroidx/compose/material3/internal/InputPhase;
    const-string v0, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"

    move-object/from16 v21, v1

    const/4 v1, -0x1

    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v21, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static {v8, v3, v1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_2

    .line 642
    .end local v19    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v21    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v0    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    :cond_2
    move-object/from16 v19, v0

    move-object/from16 v21, v1

    .line 357
    .end local v0    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v19    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v21    # "initialValue$iv$iv":Ljava/lang/Object;
    :goto_2
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    .line 360
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_3
    move/from16 v0, v28

    goto :goto_3

    .line 359
    :pswitch_4
    move/from16 v0, v27

    goto :goto_3

    .line 358
    :pswitch_5
    move/from16 v0, v28

    .line 357
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "$changed":I
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$labelProgress$2":I
    .end local v19    # "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 642
    nop

    .line 643
    .local v0, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v1

    shr-int/lit8 v3, v17, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v1, v6, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 645
    .local v3, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v1, v17, 0xe

    shl-int/lit8 v7, v17, 0x9

    and-int v7, v7, v16

    or-int/2addr v1, v7

    shl-int/lit8 v7, v17, 0x6

    const/high16 v8, 0x70000

    and-int/2addr v7, v8

    or-int/2addr v7, v1

    move-object/from16 v30, v2

    move/from16 v19, v8

    move-object/from16 v1, v21

    move-object/from16 v29, v26

    const v8, -0x880d1ef

    const v13, -0x4fcbfb15

    move-object v2, v0

    move-object/from16 v0, v24

    .end local v21    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v0, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v2, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 639
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v21    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 645
    nop

    .line 638
    .end local v2    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v4    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v17    # "$changed$iv$iv":I
    .end local v18    # "$i$f$animateValue":I
    .end local v21    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 353
    .end local v5    # "label$iv":Ljava/lang/String;
    .end local v11    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v12    # "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    .end local v14    # "$changed$iv":I
    .end local v15    # "$i$f$animateFloat":I
    nop

    .line 352
    move-object v11, v7

    .line 365
    .local v11, "labelProgress":Landroidx/compose/runtime/State;
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 366
    nop

    .line 365
    move-object v12, v10

    .restart local v12    # "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    move-object v14, v0

    .local v14, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const-string v5, "PlaceholderOpacity"

    .restart local v5    # "label$iv":Ljava/lang/String;
    move/from16 v15, v23

    .local v15, "$changed$iv":I
    const/16 v17, 0x0

    .line 646
    .local v17, "$i$f$animateFloat":I
    const-string v0, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    invoke-static {v6, v13, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v0}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v4

    .restart local v4    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v0, v15, 0xe

    shl-int/lit8 v1, v15, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    shl-int/lit8 v1, v15, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v15, 0x3

    and-int v1, v1, v16

    or-int v18, v0, v1

    .local v18, "$changed$iv$iv":I
    move-object v0, v12

    .restart local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v20, 0x0

    .line 647
    .local v20, "$i$f$animateValue":I
    move-object/from16 v1, v29

    invoke-static {v6, v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 649
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v3, v18, 0x9

    and-int/lit8 v3, v3, 0x70

    .local v3, "$changed":I
    check-cast v2, Landroidx/compose/material3/internal/InputPhase;

    .local v2, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v7, p9

    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .local v21, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2":I
    const v8, 0x55952420

    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    move-object/from16 v13, v30

    invoke-static {v7, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v24

    if-eqz v24, :cond_4

    .line 387
    move-object/from16 v24, v0

    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const-string v0, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"

    move-object/from16 v29, v1

    const/4 v1, -0x1

    invoke-static {v8, v3, v1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_4

    .line 649
    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_4
    move-object/from16 v24, v0

    move-object/from16 v29, v1

    .line 387
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_4
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v2}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_2

    .line 390
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_6
    move/from16 v0, v27

    goto :goto_5

    .line 389
    :pswitch_7
    if-eqz p7, :cond_5

    move/from16 v0, v27

    goto :goto_5

    :cond_5
    move/from16 v0, v28

    goto :goto_5

    .line 388
    :pswitch_8
    move/from16 v0, v28

    .line 387
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v3    # "$changed":I
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2":I
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 649
    nop

    .line 650
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v0

    shr-int/lit8 v2, v18, 0x9

    and-int/lit8 v2, v2, 0x70

    .local v2, "$changed":I
    check-cast v0, Landroidx/compose/material3/internal/InputPhase;

    .local v0, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v3, p9

    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .local v7, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2":I
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v21

    if-eqz v21, :cond_7

    .line 387
    move-object/from16 v21, v0

    .end local v0    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v21, "it":Landroidx/compose/material3/internal/InputPhase;
    const-string v0, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"

    move-object/from16 v30, v1

    const/4 v1, -0x1

    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v30, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static {v8, v2, v1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_6

    .line 650
    .end local v21    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v30    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v0    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    :cond_7
    move-object/from16 v21, v0

    move-object/from16 v30, v1

    .line 387
    .end local v0    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v21    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v30    # "initialValue$iv$iv":Ljava/lang/Object;
    :goto_6
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_3

    .line 390
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_9
    move/from16 v0, v27

    goto :goto_7

    .line 389
    :pswitch_a
    if-eqz p7, :cond_8

    move/from16 v0, v27

    goto :goto_7

    :cond_8
    move/from16 v0, v28

    goto :goto_7

    .line 388
    :pswitch_b
    move/from16 v0, v28

    .line 387
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v2    # "$changed":I
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$2":I
    .end local v21    # "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 650
    nop

    .line 651
    .local v2, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v0

    shr-int/lit8 v1, v18, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v6, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 653
    .local v3, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v0, v18, 0xe

    shl-int/lit8 v1, v18, 0x9

    and-int v1, v1, v16

    or-int/2addr v0, v1

    shl-int/lit8 v1, v18, 0x6

    and-int v1, v1, v19

    or-int v7, v0, v1

    move-object/from16 v0, v24

    move-object/from16 v8, v29

    move-object/from16 v1, v30

    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v30    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v0, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 647
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v30    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 653
    nop

    .line 646
    .end local v2    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v4    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v18    # "$changed$iv$iv":I
    .end local v20    # "$i$f$animateValue":I
    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v30    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 365
    .end local v5    # "label$iv":Ljava/lang/String;
    .end local v12    # "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    .end local v14    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v15    # "$changed$iv":I
    .end local v17    # "$i$f$animateFloat":I
    nop

    .line 364
    move-object v12, v7

    .line 395
    .local v12, "placeholderOpacity":Landroidx/compose/runtime/State;
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 396
    nop

    .line 395
    move-object v14, v10

    .local v14, "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    move-object v15, v0

    .local v15, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    move/from16 v17, v23

    .local v17, "$changed$iv":I
    const-string v5, "PrefixSuffixOpacity"

    .restart local v5    # "label$iv":Ljava/lang/String;
    const/16 v18, 0x0

    .line 654
    .local v18, "$i$f$animateFloat":I
    const-string v0, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    const v2, -0x4fcbfb15

    invoke-static {v6, v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v0}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v4

    .restart local v4    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v0, v17, 0xe

    shl-int/lit8 v1, v17, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    shl-int/lit8 v1, v17, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v17, 0x3

    and-int v1, v1, v16

    or-int v20, v0, v1

    .local v20, "$changed$iv$iv":I
    move-object v0, v14

    .restart local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v21, 0x0

    .line 655
    .local v21, "$i$f$animateValue":I
    const v1, -0x880d1ef

    invoke-static {v6, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 657
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v1

    shr-int/lit8 v2, v20, 0x9

    and-int/lit8 v2, v2, 0x70

    .local v2, "$changed":I
    check-cast v1, Landroidx/compose/material3/internal/InputPhase;

    .local v1, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v3, p9

    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    move-object/from16 v24, v0

    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v7, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2":I
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const v0, 0x433c6eba

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v26

    if-eqz v26, :cond_a

    .line 399
    move-object/from16 v26, v1

    .end local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v26, "it":Landroidx/compose/material3/internal/InputPhase;
    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"

    move-object/from16 v29, v3

    const/4 v3, -0x1

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_8

    .line 657
    .end local v26    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v3    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_a
    move-object/from16 v26, v1

    move-object/from16 v29, v3

    .line 399
    .end local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v26    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v29    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_8
    sget-object v1, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v26 .. v26}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v3

    aget v1, v1, v3

    packed-switch v1, :pswitch_data_4

    .line 402
    new-instance v3, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v3}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v3

    :pswitch_c
    move/from16 v1, v28

    goto :goto_9

    .line 401
    :pswitch_d
    if-eqz p7, :cond_b

    move/from16 v1, v27

    goto :goto_9

    :cond_b
    move/from16 v1, v28

    goto :goto_9

    .line 400
    :pswitch_e
    move/from16 v1, v28

    .line 399
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_c
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v2    # "$changed":I
    .end local v7    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2":I
    .end local v26    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 657
    nop

    .line 658
    .local v1, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v3, v20, 0x9

    and-int/lit8 v3, v3, 0x70

    .local v3, "$changed":I
    check-cast v2, Landroidx/compose/material3/internal/InputPhase;

    .local v2, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v7, p9

    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    .local v26, "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2":I
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v7, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v29

    if-eqz v29, :cond_d

    .line 399
    move-object/from16 v29, v1

    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v29, "initialValue$iv$iv":Ljava/lang/Object;
    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"

    move-object/from16 v30, v2

    const/4 v2, -0x1

    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v30, "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v0, v3, v2, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_a

    .line 658
    .end local v29    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v30    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    :cond_d
    move-object/from16 v29, v1

    move-object/from16 v30, v2

    .line 399
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v29    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v30    # "it":Landroidx/compose/material3/internal/InputPhase;
    :goto_a
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v30 .. v30}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_5

    .line 402
    new-instance v2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v2

    :pswitch_f
    move/from16 v27, v28

    goto :goto_b

    .line 401
    :pswitch_10
    if-eqz p7, :cond_e

    goto :goto_b

    :cond_e
    move/from16 v27, v28

    goto :goto_b

    .line 400
    :pswitch_11
    move/from16 v27, v28

    .line 399
    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_f
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "$changed":I
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v26    # "$i$a$-animateFloat-TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$2":I
    .end local v30    # "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 658
    nop

    .line 659
    .local v2, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v0

    shr-int/lit8 v1, v20, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v6, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 661
    .local v3, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v0, v20, 0xe

    shl-int/lit8 v1, v20, 0x9

    and-int v1, v1, v16

    or-int/2addr v0, v1

    shl-int/lit8 v1, v20, 0x6

    and-int v1, v1, v19

    or-int v7, v0, v1

    move-object/from16 v0, v24

    move-object/from16 v1, v29

    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v29    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 655
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v29    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 661
    nop

    .line 654
    .end local v2    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v4    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v20    # "$changed$iv$iv":I
    .end local v21    # "$i$f$animateValue":I
    .end local v24    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v29    # "initialValue$iv$iv":Ljava/lang/Object;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 395
    .end local v5    # "label$iv":Ljava/lang/String;
    .end local v14    # "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    .end local v15    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v17    # "$changed$iv":I
    .end local v18    # "$i$f$animateFloat":I
    nop

    .line 394
    move-object v14, v7

    .line 407
    .local v14, "prefixSuffixOpacity":Landroidx/compose/runtime/State;
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 409
    nop

    .line 407
    move-object v15, v10

    .local v15, "$this$animateColor$iv":Landroidx/compose/animation/core/Transition;
    const-string v5, "LabelTextStyleColor"

    .local v0, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .restart local v5    # "label$iv":Ljava/lang/String;
    move/from16 v17, v23

    .restart local v17    # "$changed$iv":I
    const/16 v18, 0x0

    .line 662
    .local v18, "$i$f$animateColor":I
    const v1, -0x739d657f

    const-string v2, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"

    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 663
    invoke-virtual {v15}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v1

    shr-int/lit8 v2, v17, 0x6

    and-int/lit8 v2, v2, 0x70

    .local v2, "$changed":I
    check-cast v1, Landroidx/compose/material3/internal/InputPhase;

    .local v1, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v3, p9

    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .local v4, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2":I
    const v7, -0x66748bf

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_10

    .line 411
    move-object/from16 v20, v1

    .end local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v20, "it":Landroidx/compose/material3/internal/InputPhase;
    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    move-object/from16 v21, v3

    const/4 v3, -0x1

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v7, v2, v3, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_c

    .line 663
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v3    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_10
    move-object/from16 v20, v1

    move-object/from16 v21, v3

    .line 411
    .end local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v21    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_c
    sget-object v1, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v3

    aget v1, v1, v3

    .line 412
    const/4 v3, 0x1

    if-ne v1, v3, :cond_11

    move-wide/from16 v26, p1

    goto :goto_d

    .line 413
    :cond_11
    move-wide/from16 v26, p3

    .line 411
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_12
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 663
    .end local v2    # "$changed":I
    .end local v4    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2":I
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v26 .. v27}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v1

    .line 664
    .local v1, "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    const v2, 0x72589593

    const-string v3, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv$iv":Z
    move-object/from16 v3, p9

    .local v3, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 665
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 666
    .local v21, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    if-nez v2, :cond_14

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v26, v2

    .end local v2    # "invalid$iv$iv":Z
    .local v26, "invalid$iv$iv":Z
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_13

    goto :goto_e

    .line 671
    :cond_13
    move-object v2, v7

    goto :goto_f

    .line 666
    .end local v26    # "invalid$iv$iv":Z
    .restart local v2    # "invalid$iv$iv":Z
    :cond_14
    move/from16 v26, v2

    .line 667
    .end local v2    # "invalid$iv$iv":Z
    .restart local v26    # "invalid$iv$iv":Z
    :goto_e
    const/4 v2, 0x0

    .line 668
    .local v2, "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    sget-object v24, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move/from16 v27, v2

    .end local v2    # "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    .local v27, "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    invoke-static/range {v24 .. v24}, Landroidx/compose/animation/ColorVectorConverterKt;->getVectorConverter(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/animation/core/TwoWayConverter;

    .line 667
    .end local v27    # "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    nop

    .line 669
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 670
    nop

    .line 666
    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    :goto_f
    nop

    .line 665
    .end local v7    # "it$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    nop

    .line 664
    .end local v3    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    .end local v26    # "invalid$iv$iv":Z
    move-object v4, v2

    check-cast v4, Landroidx/compose/animation/core/TwoWayConverter;

    .local v4, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 672
    and-int/lit8 v2, v17, 0xe

    shl-int/lit8 v3, v17, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v17, 0x3

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v17, 0x3

    and-int v3, v3, v16

    or-int/2addr v2, v3

    .local v2, "$changed$iv$iv":I
    move-object v3, v15

    .local v3, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    move/from16 v21, v2

    .end local v2    # "$changed$iv$iv":I
    .local v21, "$changed$iv$iv":I
    const/16 v24, 0x0

    .line 673
    .local v24, "$i$f$animateValue":I
    const v2, -0x880d1ef

    invoke-static {v6, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 675
    invoke-virtual {v3}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v7, v21, 0x9

    and-int/lit8 v7, v7, 0x70

    .local v7, "$changed":I
    check-cast v2, Landroidx/compose/material3/internal/InputPhase;

    .local v2, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v26, p9

    .local v26, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v27, 0x0

    move-object/from16 v28, v1

    move-object/from16 v1, v26

    move-object/from16 v26, v2

    const v2, -0x66748bf

    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    .local v26, "it":Landroidx/compose/material3/internal/InputPhase;
    .local v27, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2":I
    .local v28, "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v1, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_15

    .line 411
    move-object/from16 v29, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    move-object/from16 v30, v3

    const/4 v3, -0x1

    .end local v3    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v30, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v2, v7, v3, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_10

    .line 675
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v30    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v3    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_15
    move-object/from16 v29, v1

    move-object/from16 v30, v3

    .line 411
    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v3    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v30    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_10
    sget-object v1, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v26 .. v26}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v2

    aget v1, v1, v2

    .line 412
    const/4 v2, 0x1

    if-ne v1, v2, :cond_16

    move-wide/from16 v1, p1

    goto :goto_11

    .line 413
    :cond_16
    move-wide/from16 v1, p3

    .line 411
    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_17
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v7    # "$changed":I
    .end local v26    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v27    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2":I
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v1

    .line 675
    nop

    .line 676
    .local v1, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v3, v21, 0x9

    and-int/lit8 v3, v3, 0x70

    .local v3, "$changed":I
    check-cast v2, Landroidx/compose/material3/internal/InputPhase;

    .restart local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v7, p9

    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    move-object/from16 v27, v1

    const v1, -0x66748bf

    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v26, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2":I
    .local v27, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v7, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_18

    .line 411
    move-object/from16 v20, v2

    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    const-string v2, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"

    move-object/from16 v29, v4

    const/4 v4, -0x1

    .end local v4    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local v29, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    invoke-static {v1, v3, v4, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_12

    .line 676
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v29    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v4    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    :cond_18
    move-object/from16 v20, v2

    move-object/from16 v29, v4

    .line 411
    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v4    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v29    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    :goto_12
    sget-object v1, Landroidx/compose/material3/internal/TextFieldImplKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/internal/InputPhase;->ordinal()I

    move-result v2

    aget v1, v1, v2

    .line 412
    const/4 v2, 0x1

    if-ne v1, v2, :cond_19

    move-wide/from16 v1, p1

    goto :goto_13

    .line 413
    :cond_19
    move-wide/from16 v1, p3

    .line 411
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1a
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "$changed":I
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v26    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$2":I
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v2

    .line 676
    nop

    .line 677
    .local v2, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v1

    shr-int/lit8 v3, v21, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v6, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 679
    .local v3, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v1, v21, 0xe

    shl-int/lit8 v4, v21, 0x9

    and-int v4, v4, v16

    or-int/2addr v1, v4

    shl-int/lit8 v4, v21, 0x6

    and-int v4, v4, v19

    or-int v7, v1, v4

    move-object/from16 v20, v0

    move-object/from16 v1, v27

    move-object/from16 v4, v29

    move-object/from16 v0, v30

    .end local v27    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v29    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v30    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v0, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v4    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .local v20, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 673
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v4    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local v27    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v29    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .restart local v30    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 679
    nop

    .line 672
    .end local v2    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v21    # "$changed$iv$iv":I
    .end local v24    # "$i$f$animateValue":I
    .end local v27    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v30    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    nop

    .line 662
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 672
    nop

    .line 407
    .end local v5    # "label$iv":Ljava/lang/String;
    .end local v15    # "$this$animateColor$iv":Landroidx/compose/animation/core/Transition;
    .end local v17    # "$changed$iv":I
    .end local v18    # "$i$f$animateColor":I
    .end local v20    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v28    # "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .end local v29    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    nop

    .line 406
    move-object v15, v7

    .line 419
    .local v15, "labelTextStyleColor":Landroidx/compose/runtime/State;
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1;->INSTANCE:Landroidx/compose/material3/internal/TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 421
    nop

    .line 419
    nop

    .local v0, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    move-object/from16 v17, v10

    .local v17, "$this$animateColor$iv":Landroidx/compose/animation/core/Transition;
    .local v23, "$changed$iv":I
    const-string v5, "LabelContentColor"

    .restart local v5    # "label$iv":Ljava/lang/String;
    const/16 v18, 0x0

    .line 680
    .restart local v18    # "$i$f$animateColor":I
    const v1, -0x739d657f

    const-string v2, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"

    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 681
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v1

    shr-int/lit8 v2, v23, 0x6

    and-int/lit8 v2, v2, 0x70

    .local v2, "$changed":I
    check-cast v1, Landroidx/compose/material3/internal/InputPhase;

    .local v1, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v3, p9

    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .local v4, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2":I
    const v7, 0x3cff1b76

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v3, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_1b

    .line 422
    move-object/from16 v20, v1

    .end local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v20, "it":Landroidx/compose/material3/internal/InputPhase;
    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    move-object/from16 v21, v3

    const/4 v3, -0x1

    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v7, v2, v3, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_14

    .line 681
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v3    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_1b
    move-object/from16 v20, v1

    move-object/from16 v21, v3

    .line 422
    .end local v1    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v21    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1c
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 681
    .end local v2    # "$changed":I
    .end local v4    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2":I
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .end local v21    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v1

    .line 682
    .local v1, "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    const v2, 0x72589593

    const-string v3, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .local v2, "invalid$iv$iv":Z
    move-object/from16 v3, p9

    .local v3, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 683
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 684
    .local v21, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    if-nez v2, :cond_1e

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v26, v2

    .end local v2    # "invalid$iv$iv":Z
    .local v26, "invalid$iv$iv":Z
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_1d

    goto :goto_15

    .line 689
    :cond_1d
    move-object v2, v7

    goto :goto_16

    .line 684
    .end local v26    # "invalid$iv$iv":Z
    .restart local v2    # "invalid$iv$iv":Z
    :cond_1e
    move/from16 v26, v2

    .line 685
    .end local v2    # "invalid$iv$iv":Z
    .restart local v26    # "invalid$iv$iv":Z
    :goto_15
    const/4 v2, 0x0

    .line 686
    .local v2, "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    sget-object v24, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move/from16 v27, v2

    .end local v2    # "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    .local v27, "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    invoke-static/range {v24 .. v24}, Landroidx/compose/animation/ColorVectorConverterKt;->getVectorConverter(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/animation/core/TwoWayConverter;

    .line 685
    .end local v27    # "$i$a$-cache-TransitionKt$animateColor$typeConverter$1$iv":I
    nop

    .line 687
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 688
    nop

    .line 684
    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    :goto_16
    nop

    .line 683
    .end local v7    # "it$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    nop

    .line 682
    .end local v3    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    .end local v26    # "invalid$iv$iv":Z
    move-object v4, v2

    check-cast v4, Landroidx/compose/animation/core/TwoWayConverter;

    .local v4, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 690
    and-int/lit8 v2, v23, 0xe

    shl-int/lit8 v3, v23, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v23, 0x3

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v23, 0x3

    and-int v3, v3, v16

    or-int v21, v2, v3

    .local v21, "$changed$iv$iv":I
    move-object/from16 v2, v17

    .local v2, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v24, 0x0

    .line 691
    .restart local v24    # "$i$f$animateValue":I
    const v3, -0x880d1ef

    invoke-static {v6, v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 693
    invoke-virtual {v2}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v3

    shr-int/lit8 v7, v21, 0x9

    and-int/lit8 v7, v7, 0x70

    .local v7, "$changed":I
    check-cast v3, Landroidx/compose/material3/internal/InputPhase;

    .local v3, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v8, p9

    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    move-object/from16 v26, v1

    const v1, 0x3cff1b76

    .end local v1    # "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .local v22, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2":I
    .local v26, "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_1f

    .line 422
    move-object/from16 v27, v2

    .end local v2    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v27, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const-string v2, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    move-object/from16 v28, v3

    const/4 v3, -0x1

    .end local v3    # "it":Landroidx/compose/material3/internal/InputPhase;
    .local v28, "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v1, v7, v3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_17

    .line 693
    .end local v27    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v28    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v2    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v3    # "it":Landroidx/compose/material3/internal/InputPhase;
    :cond_1f
    move-object/from16 v27, v2

    move-object/from16 v28, v3

    .line 422
    .end local v2    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v3    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v27    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v28    # "it":Landroidx/compose/material3/internal/InputPhase;
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v7    # "$changed":I
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2":I
    .end local v28    # "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v1

    .line 693
    nop

    .line 694
    .local v1, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v3, v21, 0x9

    and-int/lit8 v3, v3, 0x70

    .local v3, "$changed":I
    check-cast v2, Landroidx/compose/material3/internal/InputPhase;

    .local v2, "it":Landroidx/compose/material3/internal/InputPhase;
    move-object/from16 v7, p9

    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    move-object/from16 v22, v1

    const v1, 0x3cff1b76

    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v8, "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2":I
    .local v22, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v7, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v13

    if-eqz v13, :cond_21

    .line 422
    const-string v13, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"

    move-object/from16 v20, v2

    const/4 v2, -0x1

    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static {v1, v3, v2, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_18

    .line 694
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    :cond_21
    move-object/from16 v20, v2

    .line 422
    .end local v2    # "it":Landroidx/compose/material3/internal/InputPhase;
    .restart local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    :goto_18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_22
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "$changed":I
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$a$-animateColor-TextFieldImplKt$TextFieldTransitionScope$labelContentColor$2":I
    .end local v20    # "it":Landroidx/compose/material3/internal/InputPhase;
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v2

    .line 694
    nop

    .line 695
    .local v2, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v1

    shr-int/lit8 v3, v21, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v6, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 697
    .local v3, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v1, v21, 0xe

    shl-int/lit8 v7, v21, 0x9

    and-int v7, v7, v16

    or-int/2addr v1, v7

    shl-int/lit8 v7, v21, 0x6

    and-int v7, v7, v19

    or-int/2addr v7, v1

    move-object v8, v0

    move-object/from16 v1, v22

    move-object/from16 v0, v27

    .end local v22    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v27    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v0, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v8, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    .line 691
    .end local v0    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v1    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v22    # "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v27    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static/range {p9 .. p9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 697
    nop

    .line 690
    .end local v2    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v21    # "$changed$iv$iv":I
    .end local v22    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v24    # "$i$f$animateValue":I
    .end local v27    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    nop

    .line 680
    invoke-static/range {p9 .. p9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 690
    nop

    .line 419
    .end local v4    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v5    # "label$iv":Ljava/lang/String;
    .end local v8    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v17    # "$this$animateColor$iv":Landroidx/compose/animation/core/Transition;
    .end local v18    # "$i$f$animateColor":I
    .end local v23    # "$changed$iv":I
    .end local v26    # "colorSpace$iv":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    nop

    .line 418
    move-object v3, v7

    .line 425
    .local v3, "labelContentColor":Landroidx/compose/runtime/State;
    nop

    .line 426
    nop

    .line 427
    nop

    .line 428
    nop

    .line 429
    nop

    .line 430
    and-int v0, p10, v19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 425
    move-object/from16 v0, p8

    move-object/from16 v6, p9

    move-object v1, v11

    move-object v4, v12

    move-object v5, v14

    move-object v2, v15

    .end local v11    # "labelProgress":Landroidx/compose/runtime/State;
    .end local v12    # "placeholderOpacity":Landroidx/compose/runtime/State;
    .end local v14    # "prefixSuffixOpacity":Landroidx/compose/runtime/State;
    .end local v15    # "labelTextStyleColor":Landroidx/compose/runtime/State;
    .local v1, "labelProgress":Landroidx/compose/runtime/State;
    .local v2, "labelTextStyleColor":Landroidx/compose/runtime/State;
    .local v4, "placeholderOpacity":Landroidx/compose/runtime/State;
    .local v5, "prefixSuffixOpacity":Landroidx/compose/runtime/State;
    invoke-interface/range {v0 .. v7}, Lkotlin/jvm/functions/Function7;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    move-object v0, v4

    .end local v4    # "placeholderOpacity":Landroidx/compose/runtime/State;
    .local v0, "placeholderOpacity":Landroidx/compose/runtime/State;
    invoke-static/range {p9 .. p9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 432
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method public static final synthetic access$Decoration-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "contentColor"    # J
    .param p2, "textStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "content"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/internal/TextFieldImplKt;->Decoration-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$Decoration-Iv8Zu3U(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "contentColor"    # J
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/internal/TextFieldImplKt;->Decoration-Iv8Zu3U(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final animateBorderStrokeAsState-NuRrP5Q(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "enabled"    # Z
    .param p1, "isError"    # Z
    .param p2, "focused"    # Z
    .param p3, "colors"    # Landroidx/compose/material3/TextFieldColors;
    .param p4, "focusedBorderThickness"    # F
    .param p5, "unfocusedBorderThickness"    # F
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Landroidx/compose/material3/TextFieldColors;",
            "FF",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/BorderStroke;",
            ">;"
        }
    .end annotation

    .line 442
    move/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v6, p6

    move/from16 v10, p7

    const v2, 0x7a02f0b5

    const-string v3, "C(animateBorderStrokeAsState)P(1,4,2!1,3:c#ui.unit.Dp,5:c#ui.unit.Dp)458@18252L73:TextFieldImpl.kt#mqatfk"

    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)"

    invoke-static {v2, v10, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 443
    :cond_0
    move/from16 v11, p1

    move-object/from16 v12, p3

    invoke-virtual {v12, v0, v11, v1}, Landroidx/compose/material3/TextFieldColors;->indicatorColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v2

    .line 445
    .local v2, "targetColor":J
    const/4 v13, 0x6

    const/16 v14, 0x96

    const/4 v15, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    const v5, 0x3cfa90ae

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "445@17754L84"

    invoke-static {v6, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 446
    invoke-static {v14, v4, v15, v13, v15}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v5

    check-cast v5, Landroidx/compose/animation/core/AnimationSpec;

    const/16 v8, 0x30

    const/16 v9, 0xc

    move v7, v4

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v13, v7

    move-object/from16 v7, p6

    invoke-static/range {v2 .. v9}, Landroidx/compose/animation/SingleValueAnimationKt;->animateColorAsState-euL9pac(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v4

    .line 445
    move-wide/from16 v16, v2

    move-object v6, v7

    .end local v2    # "targetColor":J
    .local v16, "targetColor":J
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_0

    .line 447
    .end local v16    # "targetColor":J
    .restart local v2    # "targetColor":J
    :cond_1
    move-wide/from16 v16, v2

    move v13, v4

    .end local v2    # "targetColor":J
    .restart local v16    # "targetColor":J
    const v2, 0x3cfc4441

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "447@17868L33"

    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 448
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v2

    invoke-static {v2, v6, v13}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v4

    .line 447
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 445
    :goto_0
    nop

    .line 444
    move-object v9, v4

    .line 452
    .local v9, "indicatorColor":Landroidx/compose/runtime/State;
    if-eqz v0, :cond_3

    const v2, 0x3cfdda29

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "453@18068L85"

    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 453
    if-eqz v1, :cond_2

    move/from16 v2, p4

    goto :goto_1

    :cond_2
    move/from16 v2, p5

    .line 454
    .local v2, "targetThickness":F
    :goto_1
    const/4 v3, 0x6

    invoke-static {v14, v13, v15, v3, v15}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v3

    check-cast v3, Landroidx/compose/animation/core/AnimationSpec;

    const/16 v7, 0x30

    const/16 v8, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateDpAsState-AjpBEmI(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 452
    .end local v2    # "targetThickness":F
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    .line 455
    :cond_3
    const v2, 0x3d010a74

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "455@18183L46"

    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 456
    invoke-static/range {p5 .. p5}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object v2

    shr-int/lit8 v3, v10, 0xf

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v6, v3}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 455
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 452
    :goto_2
    nop

    .line 451
    nop

    .line 459
    .local v2, "thickness":Landroidx/compose/runtime/State;
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v3

    invoke-interface {v9}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    move-result-object v3

    invoke-static {v3, v6, v13}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 442
    :cond_4
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 459
    return-object v3
.end method

.method public static final defaultErrorSemantics(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 4
    .param p0, "$this$defaultErrorSemantics"    # Landroidx/compose/ui/Modifier;
    .param p1, "isError"    # Z
    .param p2, "defaultErrorMessage"    # Ljava/lang/String;

    .line 311
    if-eqz p1, :cond_0

    new-instance v0, Landroidx/compose/material3/internal/TextFieldImplKt$defaultErrorSemantics$1;

    invoke-direct {v0, p2}, Landroidx/compose/material3/internal/TextFieldImplKt$defaultErrorSemantics$1;-><init>(Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v1, v2}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static final getHorizontalIconPadding()F
    .locals 1

    .line 493
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->HorizontalIconPadding:F

    return v0
.end method

.method public static final getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 500
    sget-object v0, Landroidx/compose/material3/internal/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public static final getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;
    .locals 3
    .param p0, "$this$layoutId"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 475
    invoke-interface {p0}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/layout/LayoutIdParentData;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/layout/LayoutIdParentData;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutIdParentData;->getLayoutId()Ljava/lang/Object;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public static final getMinFocusedLabelLineHeight()F
    .locals 1

    .line 497
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->MinFocusedLabelLineHeight:F

    return v0
.end method

.method public static final getMinSupportingTextLineHeight()F
    .locals 1

    .line 498
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->MinSupportingTextLineHeight:F

    return v0
.end method

.method public static final getMinTextLineHeight()F
    .locals 1

    .line 496
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->MinTextLineHeight:F

    return v0
.end method

.method public static final getPrefixSuffixTextPadding()F
    .locals 1

    .line 495
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->PrefixSuffixTextPadding:F

    return v0
.end method

.method public static final getSupportingTopPadding()F
    .locals 1

    .line 494
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->SupportingTopPadding:F

    return v0
.end method

.method public static final getTextFieldPadding()F
    .locals 1

    .line 492
    sget v0, Landroidx/compose/material3/internal/TextFieldImplKt;->TextFieldPadding:F

    return v0
.end method

.method public static final getZeroConstraints()J
    .locals 2

    .line 486
    sget-wide v0, Landroidx/compose/material3/internal/TextFieldImplKt;->ZeroConstraints:J

    return-wide v0
.end method

.method public static final heightOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 1
    .param p0, "placeable"    # Landroidx/compose/ui/layout/Placeable;

    .line 328
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final textFieldBackground(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0, "$this$textFieldBackground"    # Landroidx/compose/ui/Modifier;
    .param p1, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p2, "shape"    # Landroidx/compose/ui/graphics/Shape;

    .line 321
    new-instance v0, Landroidx/compose/material3/internal/TextFieldImplKt$textFieldBackground$1;

    invoke-direct {v0, p2, p1}, Landroidx/compose/material3/internal/TextFieldImplKt$textFieldBackground$1;-><init>(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/ColorProducer;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithCache(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 324
    return-object v0
.end method

.method public static final widthOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 1
    .param p0, "placeable"    # Landroidx/compose/ui/layout/Placeable;

    .line 326
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
