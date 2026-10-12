.class public final Landroidx/compose/material3/SliderDefaults;
.super Ljava/lang/Object;
.source "Slider.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2263:1\n1#2:2264\n1223#3,6:2265\n1223#3,6:2271\n1223#3,6:2278\n1223#3,6:2284\n1223#3,6:2291\n1223#3,6:2297\n1223#3,6:2304\n71#4:2277\n77#5:2290\n77#5:2303\n148#6:2310\n13694#7,3:2311\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n952#1:2265,6\n953#1:2271,6\n1005#1:2278,6\n1116#1:2284,6\n1139#1:2291,6\n1224#1:2297,6\n1247#1:2304,6\n968#1:2277\n1138#1:2290\n1246#1:2303\n1299#1:2310\n1348#1:2311,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001bH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019H\u0007\u00a2\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2!\u0008\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#\u00a2\u0006\u0002\u0008&2%\u0008\u0002\u0010\'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(\u00a2\u0006\u0002\u0008&2\u0008\u0008\u0002\u0010*\u001a\u00020\u00042\u0008\u0008\u0002\u0010+\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019H\u0007\u00a2\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019H\u0007\u00a2\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2!\u0008\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#\u00a2\u0006\u0002\u0008&2%\u0008\u0002\u0010\'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(\u00a2\u0006\u0002\u0008&2\u0008\u0008\u0002\u0010*\u001a\u00020\u00042\u0008\u0008\u0002\u0010+\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007\u00a2\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u00106\u001a\u00020)2\u0008\u0008\u0002\u00107\u001a\u00020)2\u0008\u0008\u0002\u00108\u001a\u00020)2\u0008\u0008\u0002\u00109\u001a\u00020)2\u0008\u0008\u0002\u0010:\u001a\u00020)2\u0008\u0008\u0002\u0010;\u001a\u00020)2\u0008\u0008\u0002\u0010<\u001a\u00020)2\u0008\u0008\u0002\u0010=\u001a\u00020)2\u0008\u0008\u0002\u0010>\u001a\u00020)2\u0008\u0008\u0002\u0010?\u001a\u00020)H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008F\u0010GJ\u00c4\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#\u00a2\u0006\u0002\u0008&2#\u0010\'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(\u00a2\u0006\u0002\u0008&2\u0006\u0010Q\u001a\u00020\u0019H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008R\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008X\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000c\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006Z"
    }
    d2 = {
        "Landroidx/compose/material3/SliderDefaults;",
        "",
        "()V",
        "TickSize",
        "Landroidx/compose/ui/unit/Dp;",
        "getTickSize-D9Ej5fM",
        "()F",
        "F",
        "TrackStopIndicatorSize",
        "getTrackStopIndicatorSize-D9Ej5fM",
        "trackPath",
        "Landroidx/compose/ui/graphics/Path;",
        "defaultSliderColors",
        "Landroidx/compose/material3/SliderColors;",
        "Landroidx/compose/material3/ColorScheme;",
        "getDefaultSliderColors$material3_release",
        "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;",
        "Thumb",
        "",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "colors",
        "enabled",
        "",
        "thumbSize",
        "Landroidx/compose/ui/unit/DpSize;",
        "Thumb-9LiSoMs",
        "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V",
        "Track",
        "rangeSliderState",
        "Landroidx/compose/material3/RangeSliderState;",
        "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V",
        "drawStopIndicator",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/ExtensionFunctionType;",
        "drawTick",
        "Lkotlin/Function3;",
        "Landroidx/compose/ui/graphics/Color;",
        "thumbTrackGapSize",
        "trackInsideCornerSize",
        "Track-4EFweAY",
        "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V",
        "sliderPositions",
        "Landroidx/compose/material3/SliderPositions;",
        "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V",
        "sliderState",
        "Landroidx/compose/material3/SliderState;",
        "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V",
        "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;",
        "thumbColor",
        "activeTrackColor",
        "activeTickColor",
        "inactiveTrackColor",
        "inactiveTickColor",
        "disabledThumbColor",
        "disabledActiveTrackColor",
        "disabledActiveTickColor",
        "disabledInactiveTrackColor",
        "disabledInactiveTickColor",
        "colors-q0g_0yA",
        "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;",
        "drawScope",
        "offset",
        "size",
        "color",
        "drawStopIndicator-x3O1jOs",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V",
        "drawTrack",
        "tickFractions",
        "",
        "activeRangeStart",
        "",
        "activeRangeEnd",
        "height",
        "startThumbWidth",
        "endThumbWidth",
        "isRangeSlider",
        "drawTrack-ngJ0SCU",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V",
        "drawTrackPath",
        "Landroidx/compose/ui/geometry/Size;",
        "startCornerRadius",
        "endCornerRadius",
        "drawTrackPath-Cx2C_VA",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/material3/SliderDefaults;

.field private static final TickSize:F

.field private static final TrackStopIndicatorSize:F

.field private static final trackPath:Landroidx/compose/ui/graphics/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/SliderDefaults;

    invoke-direct {v0}, Landroidx/compose/material3/SliderDefaults;-><init>()V

    sput-object v0, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    .line 1397
    sget-object v0, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SliderTokens;->getStopIndicatorSize-D9Ej5fM()F

    move-result v0

    sput v0, Landroidx/compose/material3/SliderDefaults;->TrackStopIndicatorSize:F

    .line 1400
    sget-object v0, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SliderTokens;->getStopIndicatorSize-D9Ej5fM()F

    move-result v0

    sput v0, Landroidx/compose/material3/SliderDefaults;->TickSize:F

    .line 1402
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/SliderDefaults;->trackPath:Landroidx/compose/ui/graphics/Path;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 839
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$drawStopIndicator-x3O1jOs(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/material3/SliderDefaults;
    .param p1, "drawScope"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .param p2, "offset"    # J
    .param p4, "size"    # F
    .param p5, "color"    # J

    .line 839
    invoke-direct/range {p0 .. p6}, Landroidx/compose/material3/SliderDefaults;->drawStopIndicator-x3O1jOs(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V

    return-void
.end method

.method public static final synthetic access$drawTrack-ngJ0SCU(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/material3/SliderDefaults;
    .param p1, "$receiver"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .param p2, "tickFractions"    # [F
    .param p3, "activeRangeStart"    # F
    .param p4, "activeRangeEnd"    # F
    .param p5, "inactiveTrackColor"    # J
    .param p7, "activeTrackColor"    # J
    .param p9, "inactiveTickColor"    # J
    .param p11, "activeTickColor"    # J
    .param p13, "height"    # F
    .param p14, "startThumbWidth"    # F
    .param p15, "endThumbWidth"    # F
    .param p16, "thumbTrackGapSize"    # F
    .param p17, "trackInsideCornerSize"    # F
    .param p18, "drawStopIndicator"    # Lkotlin/jvm/functions/Function2;
    .param p19, "drawTick"    # Lkotlin/jvm/functions/Function3;
    .param p20, "isRangeSlider"    # Z

    .line 839
    invoke-direct/range {p0 .. p20}, Landroidx/compose/material3/SliderDefaults;->drawTrack-ngJ0SCU(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V

    return-void
.end method

.method private final drawStopIndicator-x3O1jOs(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V
    .locals 14
    .param p1, "drawScope"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .param p2, "offset"    # J
    .param p4, "size"    # F
    .param p5, "color"    # J

    .line 1393
    move-object v0, p1

    .line 2264
    .local v0, "$this$drawStopIndicator_x3O1jOs_u24lambda_u249":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/4 v12, 0x0

    .line 1393
    .local v12, "$i$a$-with-SliderDefaults$drawStopIndicator$1":I
    move/from16 v13, p4

    invoke-interface {v0, v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v3, v1, v2

    const/16 v10, 0x78

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v4, p2

    move-wide/from16 v1, p5

    invoke-static/range {v0 .. v11}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawCircle-VaOC9Bg$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1394
    .end local v0    # "$this$drawStopIndicator_x3O1jOs_u24lambda_u249":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v12    # "$i$a$-with-SliderDefaults$drawStopIndicator$1":I
    return-void
.end method

.method private final drawTrack-ngJ0SCU(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V
    .locals 44
    .param p1, "$this$drawTrack_u2dngJ0SCU"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .param p2, "tickFractions"    # [F
    .param p3, "activeRangeStart"    # F
    .param p4, "activeRangeEnd"    # F
    .param p5, "inactiveTrackColor"    # J
    .param p7, "activeTrackColor"    # J
    .param p9, "inactiveTickColor"    # J
    .param p11, "activeTickColor"    # J
    .param p13, "height"    # F
    .param p14, "startThumbWidth"    # F
    .param p15, "endThumbWidth"    # F
    .param p16, "thumbTrackGapSize"    # F
    .param p17, "trackInsideCornerSize"    # F
    .param p18, "drawStopIndicator"    # Lkotlin/jvm/functions/Function2;
    .param p19, "drawTick"    # Lkotlin/jvm/functions/Function3;
    .param p20, "isRangeSlider"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "[FFFJJJJFFFFF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "-",
            "Landroidx/compose/ui/graphics/Color;",
            "Lkotlin/Unit;",
            ">;Z)V"
        }
    .end annotation

    .line 1285
    move-object/from16 v1, p1

    move/from16 v10, p16

    move-object/from16 v11, p18

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v0

    const/4 v12, 0x0

    invoke-static {v12, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v13

    .line 1286
    .local v13, "sliderStart":J
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v15

    .line 1287
    .local v15, "sliderEnd":J
    move/from16 v0, p13

    invoke-interface {v1, v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v2

    .line 1290
    .local v2, "trackStrokeWidth":F
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v4

    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    sub-float/2addr v4, v5

    mul-float v4, v4, p4

    add-float/2addr v3, v4

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v3

    .line 1289
    move-wide/from16 v17, v3

    .line 1293
    .local v17, "sliderValueEnd":J
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v4

    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    sub-float/2addr v4, v5

    mul-float v4, v4, p3

    add-float/2addr v3, v4

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v3

    .line 1292
    move-wide/from16 v19, v3

    .line 1295
    .local v19, "sliderValueStart":J
    const/high16 v3, 0x40000000    # 2.0f

    div-float v8, v2, v3

    .line 1296
    .local v8, "cornerSize":F
    move/from16 v4, p17

    invoke-interface {v1, v4}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v9

    .line 1297
    .local v9, "insideCornerSize":F
    const/4 v5, 0x0

    .line 1298
    .local v5, "startGap":F
    const/4 v6, 0x0

    .line 1299
    .local v6, "endGap":F
    const/4 v7, 0x0

    .local v7, "$this$dp$iv":I
    const/16 v21, 0x0

    .line 2310
    .local v21, "$i$f$getDp":I
    move/from16 v22, v3

    int-to-float v3, v7

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 1299
    .end local v7    # "$this$dp$iv":I
    .end local v21    # "$i$f$getDp":I
    invoke-static {v10, v3}, Landroidx/compose/ui/unit/Dp;->compareTo-0680j_4(FF)I

    move-result v3

    if-lez v3, :cond_0

    .line 1300
    move/from16 v3, p14

    invoke-interface {v1, v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v7

    div-float v7, v7, v22

    invoke-interface {v1, v10}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v21

    add-float v5, v7, v21

    .line 1301
    move/from16 v7, p15

    invoke-interface {v1, v7}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v21

    div-float v21, v21, v22

    invoke-interface {v1, v10}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v22

    add-float v6, v21, v22

    move/from16 v21, v5

    move/from16 v22, v6

    goto :goto_0

    .line 1299
    :cond_0
    move/from16 v3, p14

    move/from16 v7, p15

    move/from16 v21, v5

    move/from16 v22, v6

    .line 1305
    .end local v5    # "startGap":F
    .end local v6    # "endGap":F
    .local v21, "startGap":F
    .local v22, "endGap":F
    :goto_0
    if-eqz p20, :cond_1

    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v6

    add-float v6, v6, v21

    add-float/2addr v6, v8

    cmpl-float v5, v5, v6

    if-lez v5, :cond_1

    .line 1306
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v23

    .line 1307
    .local v23, "start":F
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    sub-float v24, v5, v21

    .line 1308
    .local v24, "end":F
    nop

    .line 1309
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v5

    .line 1310
    sub-float v12, v24, v23

    invoke-static {v12, v2}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v26

    .line 1311
    nop

    .line 1312
    nop

    .line 1313
    nop

    .line 1308
    move-object/from16 v0, p0

    move v12, v2

    move-wide v2, v5

    move-wide/from16 v4, v26

    move-wide/from16 v6, p5

    .end local v2    # "trackStrokeWidth":F
    .local v12, "trackStrokeWidth":F
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SliderDefaults;->drawTrackPath-Cx2C_VA(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V

    .line 1315
    if-eqz v11, :cond_2

    add-float v0, v23, v8

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v0

    invoke-interface {v11, v1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1305
    .end local v12    # "trackStrokeWidth":F
    .end local v23    # "start":F
    .end local v24    # "end":F
    .restart local v2    # "trackStrokeWidth":F
    :cond_1
    move v12, v2

    .line 1318
    .end local v2    # "trackStrokeWidth":F
    .restart local v12    # "trackStrokeWidth":F
    :cond_2
    :goto_1
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    sub-float v2, v2, v22

    sub-float/2addr v2, v8

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    .line 1319
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    add-float v0, v0, v22

    .line 1320
    .local v0, "start":F
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v23

    .line 1321
    .local v23, "end":F
    nop

    .line 1322
    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v3

    .line 1323
    sub-float v2, v23, v0

    invoke-static {v2, v12}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v5

    .line 1324
    nop

    .line 1325
    nop

    .line 1326
    nop

    .line 1321
    move v2, v9

    move v9, v8

    move v8, v2

    move/from16 v24, v0

    move-wide v2, v3

    move-wide v4, v5

    move-object/from16 v0, p0

    move-wide/from16 v6, p5

    .end local v0    # "start":F
    .local v8, "insideCornerSize":F
    .local v9, "cornerSize":F
    .local v24, "start":F
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SliderDefaults;->drawTrackPath-Cx2C_VA(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V

    .line 1328
    move/from16 v26, v9

    move v9, v8

    .end local v8    # "insideCornerSize":F
    .local v9, "insideCornerSize":F
    .local v26, "cornerSize":F
    if-eqz v11, :cond_4

    sub-float v0, v23, v26

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v0

    invoke-interface {v11, v1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1318
    .end local v23    # "end":F
    .end local v24    # "start":F
    .end local v26    # "cornerSize":F
    .local v8, "cornerSize":F
    :cond_3
    move/from16 v26, v8

    .line 1331
    .end local v8    # "cornerSize":F
    .restart local v26    # "cornerSize":F
    :cond_4
    :goto_2
    if-eqz p20, :cond_5

    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    add-float v2, v0, v21

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    move v0, v2

    .line 1332
    .local v0, "activeTrackStart":F
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    sub-float v23, v2, v22

    .line 1333
    .local v23, "activeTrackEnd":F
    if-eqz p20, :cond_6

    move v8, v9

    goto :goto_4

    :cond_6
    move/from16 v8, v26

    .line 1334
    .local v8, "startCornerRadius":F
    :goto_4
    sub-float v2, v23, v0

    cmpl-float v2, v2, v8

    if-lez v2, :cond_7

    .line 1335
    nop

    .line 1336
    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v2

    .line 1337
    sub-float v4, v23, v0

    invoke-static {v4, v12}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v4

    .line 1338
    nop

    .line 1339
    nop

    .line 1340
    nop

    .line 1335
    move-wide/from16 v6, p7

    move/from16 v24, v0

    move-object/from16 v0, p0

    .end local v0    # "activeTrackStart":F
    .local v24, "activeTrackStart":F
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SliderDefaults;->drawTrackPath-Cx2C_VA(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V

    goto :goto_5

    .line 1334
    .end local v24    # "activeTrackStart":F
    .restart local v0    # "activeTrackStart":F
    :cond_7
    move/from16 v24, v0

    .line 1344
    .end local v0    # "activeTrackStart":F
    .restart local v24    # "activeTrackStart":F
    :goto_5
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    add-float v0, v0, v26

    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v2

    .line 1345
    .local v2, "start":J
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    sub-float v0, v0, v26

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v4

    .line 1346
    .local v4, "end":J
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    sub-float v0, v0, v21

    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v6

    add-float v6, v6, v21

    invoke-static {v0, v6}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v0

    .line 1347
    .local v0, "tickStartGap":Lkotlin/ranges/ClosedFloatingPointRange;
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v6

    sub-float v6, v6, v22

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v7

    add-float v7, v7, v22

    invoke-static {v6, v7}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v6

    .line 1348
    .local v6, "tickEndGap":Lkotlin/ranges/ClosedFloatingPointRange;
    move-object/from16 v7, p2

    .local v7, "$this$forEachIndexed$iv":[F
    const/16 v25, 0x0

    .line 2311
    .local v25, "$i$f$forEachIndexed":I
    const/16 v27, 0x0

    .line 2312
    .local v27, "index$iv":I
    move/from16 v28, v8

    .end local v8    # "startCornerRadius":F
    .local v28, "startCornerRadius":F
    array-length v8, v7

    const/16 v29, 0x0

    move-object/from16 v30, v7

    move/from16 v7, v29

    .end local v7    # "$this$forEachIndexed$iv":[F
    .local v30, "$this$forEachIndexed$iv":[F
    :goto_6
    if-ge v7, v8, :cond_12

    aget v31, v30, v7

    .local v31, "item$iv":F
    add-int/lit8 v32, v27, 0x1

    .local v27, "index":I
    .local v32, "index$iv":I
    move/from16 v33, v31

    .local v33, "tick":F
    const/16 v34, 0x0

    .line 1350
    .local v34, "$i$a$-forEachIndexed-SliderDefaults$drawTrack$1":I
    const/16 v35, 0x1

    if-eqz v11, :cond_a

    .line 1351
    if-eqz p20, :cond_9

    if-eqz v27, :cond_8

    goto :goto_7

    :cond_8
    move/from16 v36, v7

    move/from16 v37, v8

    move/from16 v7, v27

    goto :goto_8

    :cond_9
    :goto_7
    move/from16 v36, v7

    move/from16 v37, v8

    move-object/from16 v7, p2

    array-length v8, v7

    add-int/lit8 v8, v8, -0x1

    move/from16 v7, v27

    .end local v27    # "index":I
    .local v7, "index":I
    if-ne v7, v8, :cond_b

    .line 1352
    :goto_8
    move-object/from16 v33, v0

    move-wide/from16 v40, v2

    move-object/from16 v0, p19

    goto/16 :goto_c

    .line 1350
    .end local v7    # "index":I
    .restart local v27    # "index":I
    :cond_a
    move/from16 v36, v7

    move/from16 v37, v8

    move/from16 v7, v27

    .line 1356
    .end local v27    # "index":I
    .restart local v7    # "index":I
    :cond_b
    cmpl-float v8, v33, p4

    if-gtz v8, :cond_d

    cmpg-float v8, v33, p3

    if-gez v8, :cond_c

    goto :goto_9

    :cond_c
    move/from16 v35, v29

    .line 1357
    .local v35, "outsideFraction":Z
    :cond_d
    :goto_9
    move/from16 v8, v33

    .end local v33    # "tick":F
    .local v8, "tick":F
    invoke-static {v2, v3, v4, v5, v8}, Landroidx/compose/ui/geometry/OffsetKt;->lerp-Wko1d7g(JJF)J

    move-result-wide v38

    move-wide/from16 v40, v2

    .end local v2    # "start":J
    .local v40, "start":J
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v38

    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v2

    .line 1359
    .local v2, "center":J
    if-eqz p20, :cond_e

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v27

    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    move-wide/from16 v38, v2

    .end local v2    # "center":J
    .local v38, "center":J
    move-object/from16 v2, v27

    check-cast v2, Ljava/lang/Comparable;

    invoke-interface {v0, v2}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_a

    .end local v38    # "center":J
    .restart local v2    # "center":J
    :cond_e
    move-wide/from16 v38, v2

    .end local v2    # "center":J
    .restart local v38    # "center":J
    :goto_a
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    check-cast v2, Ljava/lang/Comparable;

    invoke-interface {v6, v2}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 1360
    :cond_f
    move-object/from16 v33, v0

    move-object/from16 v0, p19

    goto :goto_c

    .line 1362
    :cond_10
    nop

    .line 1363
    nop

    .line 1364
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    .line 1365
    if-eqz v35, :cond_11

    move-wide/from16 v42, p9

    goto :goto_b

    :cond_11
    move-wide/from16 v42, p11

    :goto_b
    invoke-static/range {v42 .. v43}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v3

    .line 1362
    move-object/from16 v33, v0

    move-object/from16 v0, p19

    .end local v0    # "tickStartGap":Lkotlin/ranges/ClosedFloatingPointRange;
    .local v33, "tickStartGap":Lkotlin/ranges/ClosedFloatingPointRange;
    invoke-interface {v0, v1, v2, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1367
    nop

    .line 2312
    .end local v7    # "index":I
    .end local v8    # "tick":F
    .end local v34    # "$i$a$-forEachIndexed-SliderDefaults$drawTrack$1":I
    .end local v35    # "outsideFraction":Z
    .end local v38    # "center":J
    :goto_c
    nop

    .end local v31    # "item$iv":F
    add-int/lit8 v7, v36, 0x1

    move/from16 v27, v32

    move-object/from16 v0, v33

    move/from16 v8, v37

    move-wide/from16 v2, v40

    goto/16 :goto_6

    .line 2313
    .end local v32    # "index$iv":I
    .end local v33    # "tickStartGap":Lkotlin/ranges/ClosedFloatingPointRange;
    .end local v40    # "start":J
    .restart local v0    # "tickStartGap":Lkotlin/ranges/ClosedFloatingPointRange;
    .local v2, "start":J
    .local v27, "index$iv":I
    :cond_12
    nop

    .line 1368
    .end local v25    # "$i$f$forEachIndexed":I
    .end local v27    # "index$iv":I
    .end local v30    # "$this$forEachIndexed$iv":[F
    return-void
.end method

.method private final drawTrackPath-Cx2C_VA(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V
    .locals 21
    .param p1, "$this$drawTrackPath_u2dCx2C_VA"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .param p2, "offset"    # J
    .param p4, "size"    # J
    .param p6, "color"    # J
    .param p8, "startCornerRadius"    # F
    .param p9, "endCornerRadius"    # F

    .line 1377
    move/from16 v0, p8

    invoke-static {v0, v0}, Landroidx/compose/ui/geometry/CornerRadiusKt;->CornerRadius(FF)J

    move-result-wide v2

    .line 1378
    .local v2, "startCorner":J
    move/from16 v10, p9

    invoke-static {v10, v10}, Landroidx/compose/ui/geometry/CornerRadiusKt;->CornerRadius(FF)J

    move-result-wide v4

    .line 1381
    .local v4, "endCorner":J
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v1

    const/4 v6, 0x0

    invoke-static {v1, v6}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v6

    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v8

    invoke-static {v1, v8}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/geometry/RectKt;->Rect-tz77jQw(JJ)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 1382
    nop

    .line 1383
    nop

    .line 1384
    nop

    .line 1385
    nop

    .line 1380
    move-wide v6, v4

    move-wide v8, v2

    invoke-static/range {v1 .. v9}, Landroidx/compose/ui/geometry/RoundRectKt;->RoundRect-ZAM2FJo(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;

    move-result-object v1

    .line 1379
    nop

    .line 1387
    .local v1, "track":Landroidx/compose/ui/geometry/RoundRect;
    sget-object v6, Landroidx/compose/material3/SliderDefaults;->trackPath:Landroidx/compose/ui/graphics/Path;

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v6, v1, v7, v8, v7}, Landroidx/compose/ui/graphics/Path;->addRoundRect$default(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V

    .line 1388
    sget-object v12, Landroidx/compose/material3/SliderDefaults;->trackPath:Landroidx/compose/ui/graphics/Path;

    const/16 v19, 0x3c

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v11, p1

    move-wide/from16 v13, p6

    invoke-static/range {v11 .. v20}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1389
    sget-object v6, Landroidx/compose/material3/SliderDefaults;->trackPath:Landroidx/compose/ui/graphics/Path;

    invoke-interface {v6}, Landroidx/compose/ui/graphics/Path;->rewind()V

    .line 1390
    return-void
.end method


# virtual methods
.method public final Thumb-9LiSoMs(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p1, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "colors"    # Landroidx/compose/material3/SliderColors;
    .param p4, "enabled"    # Z
    .param p5, "thumbSize"    # J
    .param p7, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p8, "$changed"    # I

    .line 951
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p8

    const v0, -0x114d4821

    move-object/from16 v3, p7

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    .end local p7    # "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)947@42562L8,951@42678L46,952@42767L658,952@42733L692,975@43824L5,971@43620L220:Slider.kt#uh7d8r"

    invoke-static {v10, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p8

    .local v3, "$dirty":I
    and-int/lit8 v4, p9, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v3, v3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v3, v4

    :cond_2
    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    move-object/from16 v7, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v8, 0x30

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v3, v9

    goto :goto_3

    :cond_5
    move-object/from16 v7, p2

    :goto_3
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, p9, 0x4

    if-nez v9, :cond_6

    move-object/from16 v9, p3

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v9, p3

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    goto :goto_5

    :cond_8
    move-object/from16 v9, p3

    :goto_5
    and-int/lit8 v11, p9, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v3, v3, 0xc00

    move/from16 v12, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v8, 0xc00

    if-nez v12, :cond_b

    move/from16 v12, p4

    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v3, v13

    goto :goto_7

    :cond_b
    move/from16 v12, p4

    :goto_7
    and-int/lit8 v13, p9, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move-wide/from16 v14, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v8, 0x6000

    if-nez v14, :cond_e

    move-wide/from16 v14, p5

    invoke-interface {v10, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    goto :goto_9

    :cond_e
    move-wide/from16 v14, p5

    :goto_9
    and-int/lit8 v16, p9, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v3, v3, v17

    goto :goto_b

    :cond_f
    and-int v16, v8, v17

    if-nez v16, :cond_11

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v3, v3, v16

    :cond_11
    :goto_b
    const v16, 0x12493

    and-int v5, v3, v16

    const v6, 0x12492

    if-ne v5, v6, :cond_13

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_c

    .line 978
    :cond_12
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v11, v3

    move-object v3, v7

    move-wide v6, v14

    move-object v4, v9

    move v5, v12

    goto/16 :goto_14

    .line 951
    :cond_13
    :goto_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v5, v8, 0x1

    if-eqz v5, :cond_16

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v5

    if-eqz v5, :cond_14

    goto :goto_d

    .line 950
    :cond_14
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_15

    and-int/lit16 v3, v3, -0x381

    :cond_15
    move-wide/from16 v17, v14

    goto :goto_e

    .line 951
    :cond_16
    :goto_d
    if-eqz v4, :cond_17

    .line 947
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v7, v4

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v7, "modifier":Landroidx/compose/ui/Modifier;
    :cond_17
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_18

    .line 948
    shr-int/lit8 v4, v3, 0xf

    and-int/lit8 v4, v4, 0xe

    invoke-virtual {v1, v10, v4}, Landroidx/compose/material3/SliderDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;

    move-result-object v4

    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    and-int/lit16 v3, v3, -0x381

    move-object v9, v4

    .end local v4    # "colors":Landroidx/compose/material3/SliderColors;
    .local v9, "colors":Landroidx/compose/material3/SliderColors;
    :cond_18
    if-eqz v11, :cond_19

    .line 949
    const/4 v4, 0x1

    move v12, v4

    .end local p4    # "enabled":Z
    .local v12, "enabled":Z
    :cond_19
    if-eqz v13, :cond_1a

    .line 950
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbSize$p()J

    move-result-wide v4

    move-wide/from16 v17, v4

    .end local p5    # "thumbSize":J
    .local v4, "thumbSize":J
    goto :goto_e

    .line 949
    .end local v4    # "thumbSize":J
    .restart local p5    # "thumbSize":J
    :cond_1a
    move-wide/from16 v17, v14

    .line 950
    .end local p5    # "thumbSize":J
    .local v17, "thumbSize":J
    :goto_e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_1b

    .line 951
    const/4 v4, -0x1

    const-string v5, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)"

    invoke-static {v0, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1b
    nop

    .line 952
    const v0, -0x3fb217d4

    const-string v4, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v10, v0, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid$iv":Z
    move-object v5, v10

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 2265
    .local v6, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 2266
    .local v13, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v11, v14, :cond_1c

    .line 2267
    const/4 v14, 0x0

    .line 952
    .local v14, "$i$a$-cache-SliderDefaults$Thumb$interactions$1":I
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v14

    .line 2267
    .end local v14    # "$i$a$-cache-SliderDefaults$Thumb$interactions$1":I
    nop

    .line 2268
    .local v14, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2269
    nop

    .end local v14    # "value$iv":Ljava/lang/Object;
    goto :goto_f

    .line 2270
    :cond_1c
    move-object v14, v11

    .line 2266
    :goto_f
    nop

    .line 2265
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 952
    .end local v0    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    move-object v0, v14

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v0, "interactions":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 953
    const v5, -0x3fb20a50

    invoke-static {v10, v5, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, v3, 0xe

    const/4 v6, 0x4

    if-ne v4, v6, :cond_1d

    const/4 v4, 0x1

    goto :goto_10

    :cond_1d
    const/4 v4, 0x0

    .local v4, "invalid$iv":Z
    :goto_10
    move-object v6, v10

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 2271
    .local v11, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 2272
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    const/4 v15, 0x0

    if-nez v4, :cond_1f

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v13, v5, :cond_1e

    goto :goto_11

    .line 2276
    :cond_1e
    move-object v1, v13

    goto :goto_12

    .line 2273
    :cond_1f
    :goto_11
    const/4 v5, 0x0

    .line 953
    .local v5, "$i$a$-cache-SliderDefaults$Thumb$1":I
    new-instance v1, Landroidx/compose/material3/SliderDefaults$Thumb$1$1;

    invoke-direct {v1, v2, v0, v15}, Landroidx/compose/material3/SliderDefaults$Thumb$1$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 2273
    .end local v5    # "$i$a$-cache-SliderDefaults$Thumb$1":I
    nop

    .line 2274
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2275
    nop

    .line 2272
    .end local v1    # "value$iv":Ljava/lang/Object;
    :goto_12
    nop

    .line 2271
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 953
    .end local v4    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v4, v3, 0xe

    invoke-static {v2, v1, v10, v4}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 967
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_20

    .line 968
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/unit/DpSize;->getWidth-D9Ej5fM(J)F

    move-result v1

    .local v1, "arg0$iv":F
    const/4 v4, 0x2

    .local v4, "other$iv":I
    const/4 v5, 0x0

    .line 2277
    .local v5, "$i$f$div-u2uoSUM":I
    int-to-float v6, v4

    div-float v6, v1, v6

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v19

    .line 968
    .end local v1    # "arg0$iv":F
    .end local v4    # "other$iv":I
    .end local v5    # "$i$f$div-u2uoSUM":I
    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/ui/unit/DpSize;->copy-DwJknco$default(JFFILjava/lang/Object;)J

    move-result-wide v4

    goto :goto_13

    .line 970
    :cond_20
    move-wide/from16 v4, v17

    .line 967
    :goto_13
    nop

    .line 966
    nop

    .line 973
    .local v4, "size":J
    nop

    .line 974
    invoke-static {v7, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-6HolHcs(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 975
    const/4 v6, 0x0

    const/4 v11, 0x2

    invoke-static {v1, v2, v6, v11, v15}, Landroidx/compose/foundation/HoverableKt;->hoverable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 976
    invoke-virtual {v9, v12}, Landroidx/compose/material3/SliderColors;->thumbColor-vNxB06k$material3_release(Z)J

    move-result-wide v13

    sget-object v11, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v11}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    move-result-object v11

    const/4 v15, 0x6

    invoke-static {v11, v10, v15}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v11

    invoke-static {v1, v13, v14, v11}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 972
    invoke-static {v1, v10, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 978
    .end local v0    # "interactions":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "size":J
    :cond_21
    move v11, v3

    move-object v3, v7

    move-wide/from16 v6, v17

    move-object v4, v9

    move v5, v12

    .end local v7    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v9    # "colors":Landroidx/compose/material3/SliderColors;
    .end local v12    # "enabled":Z
    .end local v17    # "thumbSize":J
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    .local v5, "enabled":Z
    .local v6, "thumbSize":J
    .local v11, "$dirty":I
    :goto_14
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_22

    new-instance v0, Landroidx/compose/material3/SliderDefaults$Thumb$2;

    move-object/from16 v1, p0

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SliderDefaults$Thumb$2;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_22
    return-void
.end method

.method public final synthetic Track(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V
    .locals 14
    .param p1, "rangeSliderState"    # Landroidx/compose/material3/RangeSliderState;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "colors"    # Landroidx/compose/material3/SliderColors;
    .param p4, "enabled"    # Z
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)"
            imports = {}
        .end subannotation
    .end annotation

    .line 1190
    move/from16 v12, p6

    const v1, -0x606eb929

    move-object/from16 v2, p5

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(Track)P(3,2)1187@52807L8,1190@52865L218:Slider.kt#uh7d8r"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p6

    .local v2, "$dirty":I
    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v2, v4

    :cond_2
    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v5, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    goto :goto_3

    :cond_5
    move-object/from16 v5, p2

    :goto_3
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p7, 0x4

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v6, p3

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p3

    :goto_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move/from16 v8, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v12, 0xc00

    if-nez v8, :cond_b

    move/from16 v8, p4

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    goto :goto_7

    :cond_b
    move/from16 v8, p4

    :goto_7
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v12, 0x6000

    if-nez v10, :cond_e

    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v2, v10

    :cond_e
    :goto_9
    and-int/lit16 v10, v2, 0x2493

    const/16 v11, 0x2492

    if-ne v10, v11, :cond_10

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v10

    if-nez v10, :cond_f

    goto :goto_a

    .line 1199
    :cond_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v13, v2

    move-object v3, v5

    move-object v4, v6

    move v5, v8

    goto/16 :goto_f

    .line 1190
    :cond_10
    :goto_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v10, v12, 0x1

    if-eqz v10, :cond_13

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v10

    if-eqz v10, :cond_11

    goto :goto_b

    .line 1189
    :cond_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_12

    and-int/lit16 v2, v2, -0x381

    :cond_12
    move v13, v2

    move-object v2, v5

    move-object v4, v6

    move v3, v8

    goto :goto_e

    .line 1190
    :cond_13
    :goto_b
    if-eqz v4, :cond_14

    .line 1187
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_c

    .line 1190
    .end local v4    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_14
    move-object v4, v5

    .line 1187
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v4    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_c
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_15

    .line 1188
    shr-int/lit8 v5, v2, 0xc

    and-int/lit8 v5, v5, 0xe

    invoke-virtual {p0, v9, v5}, Landroidx/compose/material3/SliderDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;

    move-result-object v5

    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .local v5, "colors":Landroidx/compose/material3/SliderColors;
    and-int/lit16 v2, v2, -0x381

    goto :goto_d

    .line 1187
    .end local v5    # "colors":Landroidx/compose/material3/SliderColors;
    .restart local p3    # "colors":Landroidx/compose/material3/SliderColors;
    :cond_15
    move-object v5, v6

    .line 1188
    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .restart local v5    # "colors":Landroidx/compose/material3/SliderColors;
    :goto_d
    if-eqz v7, :cond_16

    .line 1189
    const/4 v6, 0x1

    move v13, v2

    move-object v2, v4

    move-object v4, v5

    move v3, v6

    .end local p4    # "enabled":Z
    .local v6, "enabled":Z
    goto :goto_e

    .line 1188
    .end local v6    # "enabled":Z
    .restart local p4    # "enabled":Z
    :cond_16
    move v13, v2

    move-object v2, v4

    move-object v4, v5

    move v3, v8

    .line 1189
    .end local v5    # "colors":Landroidx/compose/material3/SliderColors;
    .end local p4    # "enabled":Z
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    .local v13, "$dirty":I
    :goto_e
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_17

    .line 1190
    const/4 v5, -0x1

    const-string v6, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)"

    invoke-static {v1, v13, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1191
    :cond_17
    nop

    .line 1192
    nop

    .line 1193
    nop

    .line 1194
    nop

    .line 1195
    nop

    .line 1196
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbTrackGapSize$p()F

    move-result v7

    .line 1197
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getTrackInsideCornerSize$p()F

    move-result v8

    and-int/lit8 v1, v13, 0xe

    const/high16 v5, 0xd80000

    or-int/2addr v1, v5

    and-int/lit8 v5, v13, 0x70

    or-int/2addr v1, v5

    shr-int/lit8 v5, v13, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v1, v5

    shl-int/lit8 v5, v13, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v1, v5

    const/high16 v5, 0xe000000

    shl-int/lit8 v6, v13, 0xc

    and-int/2addr v5, v6

    or-int v10, v1, v5

    .line 1191
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v11, 0x30

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v11}, Landroidx/compose/material3/SliderDefaults;->Track-4EFweAY(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1199
    :cond_18
    move v5, v3

    move-object v3, v2

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "enabled":Z
    :goto_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$8;

    move-object v1, p0

    move-object v2, p1

    move/from16 v7, p7

    move v6, v12

    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/SliderDefaults$Track$8;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_19
    return-void
.end method

.method public final Track(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V
    .locals 25
    .param p1, "sliderPositions"    # Landroidx/compose/material3/SliderPositions;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "colors"    # Landroidx/compose/material3/SliderColors;
    .param p4, "enabled"    # Z
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        message = "Use version that supports slider state"
    .end annotation

    .line 1000
    move-object/from16 v1, p0

    move/from16 v6, p6

    const v0, -0x5c30f9c9

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(Track)P(3,2)997@44755L8,1004@45160L1834,1004@45108L1886:Slider.kt#uh7d8r"

    invoke-static {v8, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p6

    .local v2, "$dirty":I
    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v12, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v12, p1

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v12, p1

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v5, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move-object/from16 v5, p2

    :goto_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, p7, 0x4

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v7, p3

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    goto :goto_5

    :cond_8
    move-object/from16 v7, p3

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move/from16 v10, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_b

    move/from16 v10, p4

    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    move/from16 v10, p4

    :goto_7
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_e

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v2, v11

    :cond_e
    :goto_9
    and-int/lit16 v11, v2, 0x2493

    const/16 v13, 0x2492

    if-ne v11, v13, :cond_10

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_a

    .line 1050
    :cond_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v9, v2

    move-object v3, v5

    move-object v4, v7

    move v5, v10

    goto/16 :goto_12

    .line 1000
    :cond_10
    :goto_a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v11, v6, 0x1

    if-eqz v11, :cond_13

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_b

    .line 999
    :cond_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_12

    and-int/lit16 v2, v2, -0x381

    :cond_12
    move-object v3, v5

    move-object v5, v7

    move v7, v10

    goto :goto_e

    .line 1000
    :cond_13
    :goto_b
    if-eqz v3, :cond_14

    .line 997
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_c

    .line 1000
    .end local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_14
    move-object v3, v5

    .line 997
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v3    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_c
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_15

    .line 998
    shr-int/lit8 v5, v2, 0xc

    and-int/lit8 v5, v5, 0xe

    invoke-virtual {v1, v8, v5}, Landroidx/compose/material3/SliderDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;

    move-result-object v5

    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .local v5, "colors":Landroidx/compose/material3/SliderColors;
    and-int/lit16 v2, v2, -0x381

    goto :goto_d

    .line 997
    .end local v5    # "colors":Landroidx/compose/material3/SliderColors;
    .restart local p3    # "colors":Landroidx/compose/material3/SliderColors;
    :cond_15
    move-object v5, v7

    .line 998
    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .restart local v5    # "colors":Landroidx/compose/material3/SliderColors;
    :goto_d
    if-eqz v9, :cond_16

    .line 999
    const/4 v7, 0x1

    .end local p4    # "enabled":Z
    .local v7, "enabled":Z
    goto :goto_e

    .line 998
    .end local v7    # "enabled":Z
    .restart local p4    # "enabled":Z
    :cond_16
    move v7, v10

    .line 999
    .end local p4    # "enabled":Z
    .restart local v7    # "enabled":Z
    :goto_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_17

    .line 1000
    const/4 v9, -0x1

    const-string v10, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)"

    invoke-static {v0, v2, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1001
    :cond_17
    const/4 v0, 0x0

    invoke-virtual {v5, v7, v0}, Landroidx/compose/material3/SliderColors;->trackColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v10

    .line 1002
    .local v10, "inactiveTrackColor":J
    const/4 v9, 0x1

    invoke-virtual {v5, v7, v9}, Landroidx/compose/material3/SliderColors;->trackColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v13

    .line 1003
    .local v13, "activeTrackColor":J
    move/from16 p2, v2

    .end local v2    # "$dirty":I
    .local p2, "$dirty":I
    invoke-virtual {v5, v7, v0}, Landroidx/compose/material3/SliderColors;->tickColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v1

    .line 1004
    .local v1, "inactiveTickColor":J
    move-wide v15, v1

    .end local v1    # "inactiveTickColor":J
    .local v15, "inactiveTickColor":J
    invoke-virtual {v5, v7, v9}, Landroidx/compose/material3/SliderColors;->tickColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v0

    .line 1005
    .local v0, "activeTickColor":J
    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v2, v9, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {}, Landroidx/compose/material3/SliderKt;->getTrackHeight()F

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v4, -0x2fbea463

    const-string v9, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v8, v4, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v8, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    and-int/lit8 v9, p2, 0xe

    move-object/from16 v19, v3

    const/4 v3, 0x4

    .end local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v19, "modifier":Landroidx/compose/ui/Modifier;
    if-ne v9, v3, :cond_18

    const/4 v9, 0x1

    goto :goto_f

    :cond_18
    const/4 v9, 0x0

    :goto_f
    or-int v3, v4, v9

    invoke-interface {v8, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    or-int/2addr v3, v4

    move/from16 p4, v3

    move-wide v3, v15

    .end local v15    # "inactiveTickColor":J
    .local v3, "inactiveTickColor":J
    invoke-interface {v8, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v9

    or-int v9, p4, v9

    invoke-interface {v8, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v15

    or-int v20, v9, v15

    .local v20, "invalid$iv":Z
    move-object v9, v8

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 2278
    .local v21, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 2279
    .local v22, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v20, :cond_1a

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-wide/from16 v17, v0

    .end local v0    # "activeTickColor":J
    .local v17, "activeTickColor":J
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v15, v0, :cond_19

    goto :goto_10

    .line 2283
    :cond_19
    move-object v1, v9

    move-object v9, v15

    move-wide v15, v3

    move-object v3, v9

    goto :goto_11

    .line 2279
    .end local v17    # "activeTickColor":J
    .restart local v0    # "activeTickColor":J
    :cond_1a
    move-wide/from16 v17, v0

    .line 2280
    .end local v0    # "activeTickColor":J
    .restart local v17    # "activeTickColor":J
    :goto_10
    const/4 v0, 0x0

    .line 1005
    .local v0, "$i$a$-cache-SliderDefaults$Track$1":I
    move-object v1, v9

    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    new-instance v9, Landroidx/compose/material3/SliderDefaults$Track$1$1;

    move-wide/from16 v23, v3

    move-object v3, v15

    move-wide/from16 v15, v23

    .local v3, "it$iv":Ljava/lang/Object;
    .local v15, "inactiveTickColor":J
    invoke-direct/range {v9 .. v18}, Landroidx/compose/material3/SliderDefaults$Track$1$1;-><init>(JLandroidx/compose/material3/SliderPositions;JJJ)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 2280
    .end local v0    # "$i$a$-cache-SliderDefaults$Track$1":I
    nop

    .line 2281
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2282
    nop

    .line 2279
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_11
    nop

    .line 2278
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 1005
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v20    # "invalid$iv":Z
    .end local v21    # "$i$f$cache":I
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v0, 0x0

    invoke-static {v2, v9, v8, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1050
    .end local v10    # "inactiveTrackColor":J
    .end local v13    # "activeTrackColor":J
    .end local v15    # "inactiveTickColor":J
    .end local v17    # "activeTickColor":J
    :cond_1b
    move/from16 v9, p2

    move-object v4, v5

    move v5, v7

    move-object/from16 v3, v19

    .end local v7    # "enabled":Z
    .end local v19    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "$dirty":I
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    .local v5, "enabled":Z
    .local v9, "$dirty":I
    :goto_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1c

    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/SliderDefaults$Track$2;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1c
    return-void
.end method

.method public final synthetic Track(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V
    .locals 14
    .param p1, "sliderState"    # Landroidx/compose/material3/SliderState;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "colors"    # Landroidx/compose/material3/SliderColors;
    .param p4, "enabled"    # Z
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)"
            imports = {}
        .end subannotation
    .end annotation

    .line 1082
    move/from16 v12, p6

    const v1, 0x2360eb1e

    move-object/from16 v2, p5

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(Track)P(3,2)1079@48295L8,1082@48353L213:Slider.kt#uh7d8r"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p6

    .local v2, "$dirty":I
    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v2, v4

    :cond_2
    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v5, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    goto :goto_3

    :cond_5
    move-object/from16 v5, p2

    :goto_3
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p7, 0x4

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v6, p3

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p3

    :goto_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move/from16 v8, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v12, 0xc00

    if-nez v8, :cond_b

    move/from16 v8, p4

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    goto :goto_7

    :cond_b
    move/from16 v8, p4

    :goto_7
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v12, 0x6000

    if-nez v10, :cond_e

    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v2, v10

    :cond_e
    :goto_9
    and-int/lit16 v10, v2, 0x2493

    const/16 v11, 0x2492

    if-ne v10, v11, :cond_10

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v10

    if-nez v10, :cond_f

    goto :goto_a

    .line 1091
    :cond_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v13, v2

    move-object v3, v5

    move-object v4, v6

    move v5, v8

    goto/16 :goto_f

    .line 1082
    :cond_10
    :goto_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v10, v12, 0x1

    if-eqz v10, :cond_13

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v10

    if-eqz v10, :cond_11

    goto :goto_b

    .line 1081
    :cond_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_12

    and-int/lit16 v2, v2, -0x381

    :cond_12
    move v13, v2

    move-object v2, v5

    move-object v4, v6

    move v3, v8

    goto :goto_e

    .line 1082
    :cond_13
    :goto_b
    if-eqz v4, :cond_14

    .line 1079
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_c

    .line 1082
    .end local v4    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_14
    move-object v4, v5

    .line 1079
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v4    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_c
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_15

    .line 1080
    shr-int/lit8 v5, v2, 0xc

    and-int/lit8 v5, v5, 0xe

    invoke-virtual {p0, v9, v5}, Landroidx/compose/material3/SliderDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;

    move-result-object v5

    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .local v5, "colors":Landroidx/compose/material3/SliderColors;
    and-int/lit16 v2, v2, -0x381

    goto :goto_d

    .line 1079
    .end local v5    # "colors":Landroidx/compose/material3/SliderColors;
    .restart local p3    # "colors":Landroidx/compose/material3/SliderColors;
    :cond_15
    move-object v5, v6

    .line 1080
    .end local p3    # "colors":Landroidx/compose/material3/SliderColors;
    .restart local v5    # "colors":Landroidx/compose/material3/SliderColors;
    :goto_d
    if-eqz v7, :cond_16

    .line 1081
    const/4 v6, 0x1

    move v13, v2

    move-object v2, v4

    move-object v4, v5

    move v3, v6

    .end local p4    # "enabled":Z
    .local v6, "enabled":Z
    goto :goto_e

    .line 1080
    .end local v6    # "enabled":Z
    .restart local p4    # "enabled":Z
    :cond_16
    move v13, v2

    move-object v2, v4

    move-object v4, v5

    move v3, v8

    .line 1081
    .end local v5    # "colors":Landroidx/compose/material3/SliderColors;
    .end local p4    # "enabled":Z
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    .local v13, "$dirty":I
    :goto_e
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_17

    .line 1082
    const/4 v5, -0x1

    const-string v6, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)"

    invoke-static {v1, v13, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1083
    :cond_17
    nop

    .line 1084
    nop

    .line 1085
    nop

    .line 1086
    nop

    .line 1087
    nop

    .line 1088
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbTrackGapSize$p()F

    move-result v7

    .line 1089
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getTrackInsideCornerSize$p()F

    move-result v8

    and-int/lit8 v1, v13, 0xe

    const/high16 v5, 0xd80000

    or-int/2addr v1, v5

    and-int/lit8 v5, v13, 0x70

    or-int/2addr v1, v5

    shr-int/lit8 v5, v13, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v1, v5

    shl-int/lit8 v5, v13, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v1, v5

    const/high16 v5, 0xe000000

    shl-int/lit8 v6, v13, 0xc

    and-int/2addr v5, v6

    or-int v10, v1, v5

    .line 1083
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v11, 0x30

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v11}, Landroidx/compose/material3/SliderDefaults;->Track-4EFweAY(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1091
    :cond_18
    move v5, v3

    move-object v3, v2

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "enabled":Z
    :goto_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$3;

    move-object v1, p0

    move-object v2, p1

    move/from16 v7, p7

    move v6, v12

    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/SliderDefaults$Track$3;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_19
    return-void
.end method

.method public final Track-4EFweAY(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p1, "rangeSliderState"    # Landroidx/compose/material3/RangeSliderState;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "colors"    # Landroidx/compose/material3/SliderColors;
    .param p5, "drawStopIndicator"    # Lkotlin/jvm/functions/Function2;
    .param p6, "drawTick"    # Lkotlin/jvm/functions/Function3;
    .param p7, "thumbTrackGapSize"    # F
    .param p8, "trackInsideCornerSize"    # F
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/RangeSliderState;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/material3/SliderColors;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "-",
            "Landroidx/compose/ui/graphics/Color;",
            "Lkotlin/Unit;",
            ">;FF",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1237
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p10

    move/from16 v3, p11

    const v4, -0x204b9484

    move-object/from16 v5, p9

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1222@54320L8,1223@54389L232,1245@55370L7,1246@55426L706,1241@55223L909:Slider.kt#uh7d8r"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p10

    .local v6, "$dirty":I
    and-int/lit8 v7, v3, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v6, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v6, v7

    :cond_2
    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    move-object/from16 v8, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    goto :goto_3

    :cond_5
    move-object/from16 v8, p2

    :goto_3
    and-int/lit8 v9, v3, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v6, v6, 0x180

    move/from16 v11, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_8

    move/from16 v11, p3

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v6, v12

    goto :goto_5

    :cond_8
    move/from16 v11, p3

    :goto_5
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_b

    and-int/lit8 v12, v3, 0x8

    if-nez v12, :cond_9

    move-object/from16 v12, p4

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v12, p4

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v6, v14

    goto :goto_7

    :cond_b
    move-object/from16 v12, p4

    :goto_7
    and-int/lit16 v14, v0, 0x6000

    if-nez v14, :cond_e

    and-int/lit8 v14, v3, 0x10

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v14, p5

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v6, v6, v16

    goto :goto_9

    :cond_e
    move-object/from16 v14, p5

    :goto_9
    and-int/lit8 v16, v3, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v6, v6, v17

    move-object/from16 v15, p6

    goto :goto_b

    :cond_f
    and-int v17, v0, v17

    if-nez v17, :cond_11

    move-object/from16 v15, p6

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v6, v6, v18

    goto :goto_b

    :cond_11
    move-object/from16 v15, p6

    :goto_b
    and-int/lit8 v18, v3, 0x40

    const/high16 v20, 0x180000

    if-eqz v18, :cond_12

    or-int v6, v6, v20

    move/from16 v4, p7

    goto :goto_d

    :cond_12
    and-int v20, v0, v20

    if-nez v20, :cond_14

    move/from16 v4, p7

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v21, 0x80000

    :goto_c
    or-int v6, v6, v21

    goto :goto_d

    :cond_14
    move/from16 v4, p7

    :goto_d
    and-int/lit16 v10, v3, 0x80

    const/high16 v22, 0xc00000

    if-eqz v10, :cond_15

    or-int v6, v6, v22

    move/from16 v13, p8

    goto :goto_f

    :cond_15
    and-int v22, v0, v22

    if-nez v22, :cond_17

    move/from16 v13, p8

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v23, 0x400000

    :goto_e
    or-int v6, v6, v23

    goto :goto_f

    :cond_17
    move/from16 v13, p8

    :goto_f
    and-int/lit16 v0, v3, 0x100

    if-eqz v0, :cond_18

    const/high16 v0, 0x6000000

    :goto_10
    or-int/2addr v6, v0

    goto :goto_11

    :cond_18
    const/high16 v0, 0x6000000

    and-int v0, p10, v0

    if-nez v0, :cond_1a

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/high16 v0, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v0, 0x2000000

    goto :goto_10

    :cond_1a
    :goto_11
    const v0, 0x2492493

    and-int/2addr v0, v6

    const v3, 0x2492492

    if-ne v0, v3, :cond_1c

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_12

    .line 1266
    :cond_1b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v1, v5

    move/from16 v16, v6

    move-object v3, v8

    move-object v5, v12

    move v8, v4

    move v4, v11

    move v9, v13

    move-object v6, v14

    move-object v7, v15

    goto/16 :goto_22

    .line 1237
    :cond_1c
    :goto_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_20

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_13

    .line 1236
    :cond_1d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_1e

    and-int/lit16 v6, v6, -0x1c01

    :cond_1e
    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_1f

    const v0, -0xe001

    and-int/2addr v0, v6

    move-object v3, v12

    move v12, v4

    move-object v4, v3

    move v6, v0

    move-object v0, v8

    move v3, v11

    .end local v6    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_18

    .end local v0    # "$dirty":I
    .restart local v6    # "$dirty":I
    :cond_1f
    move-object v0, v12

    move v12, v4

    move-object v4, v0

    move-object v0, v8

    move v3, v11

    goto/16 :goto_18

    .line 1237
    :cond_20
    :goto_13
    if-eqz v7, :cond_21

    .line 1221
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v8, v0

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "modifier":Landroidx/compose/ui/Modifier;
    :cond_21
    if-eqz v9, :cond_22

    .line 1222
    const/4 v0, 0x1

    move v11, v0

    .end local p3    # "enabled":Z
    .local v11, "enabled":Z
    :cond_22
    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_23

    .line 1223
    shr-int/lit8 v0, v6, 0x18

    and-int/lit8 v0, v0, 0xe

    invoke-virtual {v1, v5, v0}, Landroidx/compose/material3/SliderDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;

    move-result-object v0

    .end local p4    # "colors":Landroidx/compose/material3/SliderColors;
    .local v0, "colors":Landroidx/compose/material3/SliderColors;
    and-int/lit16 v6, v6, -0x1c01

    move-object v12, v0

    .end local v0    # "colors":Landroidx/compose/material3/SliderColors;
    .local v12, "colors":Landroidx/compose/material3/SliderColors;
    :cond_23
    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_2a

    .line 1224
    const v0, -0x2fba2905

    const-string v7, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v5, v0, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v0, v6, 0x1c00

    xor-int/lit16 v0, v0, 0xc00

    const/16 v7, 0x800

    if-le v0, v7, :cond_24

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    :cond_24
    and-int/lit16 v0, v6, 0xc00

    const/16 v7, 0x800

    if-ne v0, v7, :cond_26

    :cond_25
    const/4 v0, 0x1

    goto :goto_14

    :cond_26
    const/4 v0, 0x0

    :goto_14
    and-int/lit16 v7, v6, 0x380

    const/16 v9, 0x100

    if-ne v7, v9, :cond_27

    const/4 v7, 0x1

    goto :goto_15

    :cond_27
    const/4 v7, 0x0

    :goto_15
    or-int/2addr v0, v7

    .local v0, "invalid$iv":Z
    move-object v7, v5

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 2297
    .local v9, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 2298
    .local v22, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_29

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p2, v0

    .end local v0    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_28

    goto :goto_16

    .line 2302
    :cond_28
    move-object v0, v3

    goto :goto_17

    .line 2298
    .end local p2    # "invalid$iv":Z
    .restart local v0    # "invalid$iv":Z
    :cond_29
    move/from16 p2, v0

    .line 2299
    .end local v0    # "invalid$iv":Z
    .restart local p2    # "invalid$iv":Z
    :goto_16
    const/4 v0, 0x0

    .line 1224
    .local v0, "$i$a$-cache-SliderDefaults$Track$9":I
    move/from16 p3, v0

    .end local v0    # "$i$a$-cache-SliderDefaults$Track$9":I
    .local p3, "$i$a$-cache-SliderDefaults$Track$9":I
    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$9$1;

    invoke-direct {v0, v12, v11}, Landroidx/compose/material3/SliderDefaults$Track$9$1;-><init>(Landroidx/compose/material3/SliderColors;Z)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 2299
    .end local p3    # "$i$a$-cache-SliderDefaults$Track$9":I
    nop

    .line 2300
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2301
    nop

    .line 2298
    .end local v0    # "value$iv":Ljava/lang/Object;
    :goto_17
    nop

    .line 2297
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 1224
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .end local p5    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v0, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v3, -0xe001

    and-int/2addr v6, v3

    move-object v14, v0

    .end local v0    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v14, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    :cond_2a
    if-eqz v16, :cond_2b

    .line 1232
    sget-object v0, Landroidx/compose/material3/SliderDefaults$Track$10;->INSTANCE:Landroidx/compose/material3/SliderDefaults$Track$10;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    move-object v15, v0

    .end local p6    # "drawTick":Lkotlin/jvm/functions/Function3;
    .local v15, "drawTick":Lkotlin/jvm/functions/Function3;
    :cond_2b
    if-eqz v18, :cond_2c

    .line 1235
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbTrackGapSize$p()F

    move-result v0

    move v4, v0

    .end local p7    # "thumbTrackGapSize":F
    .local v4, "thumbTrackGapSize":F
    :cond_2c
    if-eqz v10, :cond_2d

    .line 1236
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getTrackInsideCornerSize$p()F

    move-result v0

    move-object v3, v12

    move v12, v4

    move-object v4, v3

    move v13, v0

    move-object v0, v8

    move v3, v11

    .end local p8    # "trackInsideCornerSize":F
    .local v0, "trackInsideCornerSize":F
    goto :goto_18

    .line 1235
    .end local v0    # "trackInsideCornerSize":F
    .restart local p8    # "trackInsideCornerSize":F
    :cond_2d
    move-object v0, v12

    move v12, v4

    move-object v4, v0

    move-object v0, v8

    move v3, v11

    .line 1236
    .end local v8    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v11    # "enabled":Z
    .end local p8    # "trackInsideCornerSize":F
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    .local v12, "thumbTrackGapSize":F
    .local v13, "trackInsideCornerSize":F
    :goto_18
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_2e

    .line 1237
    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)"

    const v9, -0x204b9484

    invoke-static {v9, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1238
    :cond_2e
    const/4 v7, 0x0

    invoke-virtual {v4, v3, v7}, Landroidx/compose/material3/SliderColors;->trackColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v8

    .line 1239
    .local v8, "inactiveTrackColor":J
    move/from16 p2, v12

    const/4 v10, 0x1

    .end local v12    # "thumbTrackGapSize":F
    .local p2, "thumbTrackGapSize":F
    invoke-virtual {v4, v3, v10}, Landroidx/compose/material3/SliderColors;->trackColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v11

    .line 1240
    .local v11, "activeTrackColor":J
    move/from16 p3, v13

    move-object/from16 v16, v14

    .end local v13    # "trackInsideCornerSize":F
    .end local v14    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v16, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local p3, "trackInsideCornerSize":F
    invoke-virtual {v4, v3, v7}, Landroidx/compose/material3/SliderColors;->tickColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v13

    .line 1241
    .local v13, "inactiveTickColor":J
    move-wide/from16 p4, v8

    .end local v8    # "inactiveTrackColor":J
    .local p4, "inactiveTrackColor":J
    invoke-virtual {v4, v3, v10}, Landroidx/compose/material3/SliderColors;->tickColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v7

    .line 1243
    .local v7, "activeTickColor":J
    nop

    .line 1244
    const/4 v9, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v9, v10, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 1245
    invoke-static {}, Landroidx/compose/material3/SliderKt;->getTrackHeight()F

    move-result v9

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 1246
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/CompositionLocal;

    .local v9, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x0

    .local v18, "$changed$iv":I
    const/16 v19, 0x0

    .line 2303
    .local v19, "$i$f$getCurrent":I
    const v10, 0x789c5f52

    move-object/from16 v22, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "modifier":Landroidx/compose/ui/Modifier;
    const-string v0, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v5, v10, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1246
    .end local v9    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v19    # "$i$f$getCurrent":I
    sget-object v9, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    if-ne v0, v9, :cond_2f

    const/high16 v0, 0x43340000    # 180.0f

    goto :goto_19

    :cond_2f
    const/4 v0, 0x0

    :goto_19
    invoke-static {v1, v0}, Landroidx/compose/ui/draw/RotateKt;->rotate(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 1247
    const v1, -0x2fb9a58b

    const-string v9, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v5, v1, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    move-wide/from16 v9, p4

    .end local p4    # "inactiveTrackColor":J
    .local v9, "inactiveTrackColor":J
    invoke-interface {v5, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    invoke-interface {v5, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    invoke-interface {v5, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    invoke-interface {v5, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    const/high16 v18, 0x380000

    move/from16 p4, v1

    and-int v1, v6, v18

    const/high16 v2, 0x100000

    if-ne v1, v2, :cond_30

    const/4 v1, 0x1

    goto :goto_1a

    :cond_30
    const/4 v1, 0x0

    :goto_1a
    or-int v1, p4, v1

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v6

    move/from16 p4, v1

    const/high16 v1, 0x800000

    if-ne v2, v1, :cond_31

    const/4 v1, 0x1

    goto :goto_1b

    :cond_31
    const/4 v1, 0x0

    :goto_1b
    or-int v1, p4, v1

    const v2, 0xe000

    and-int/2addr v2, v6

    xor-int/lit16 v2, v2, 0x6000

    move/from16 p4, v1

    const/16 v1, 0x4000

    if-le v2, v1, :cond_33

    move-object/from16 v1, v16

    .end local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v1, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    goto :goto_1c

    :cond_32
    move-object/from16 v16, v1

    goto :goto_1d

    .end local v1    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    :cond_33
    move-object/from16 v1, v16

    .end local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .restart local v1    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    :goto_1c
    and-int/lit16 v2, v6, 0x6000

    move-object/from16 v16, v1

    const/16 v1, 0x4000

    .end local v1    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    if-ne v2, v1, :cond_34

    :goto_1d
    const/4 v1, 0x1

    goto :goto_1e

    :cond_34
    const/4 v1, 0x0

    :goto_1e
    or-int v1, p4, v1

    const/high16 v2, 0x70000

    and-int/2addr v2, v6

    move/from16 p4, v1

    const/high16 v1, 0x20000

    if-ne v2, v1, :cond_35

    const/16 v21, 0x1

    goto :goto_1f

    :cond_35
    const/16 v21, 0x0

    :goto_1f
    or-int v1, p4, v21

    .local v1, "invalid$iv":Z
    move-object v2, v5

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 2304
    .local v17, "$i$f$cache":I
    move/from16 p4, v1

    .end local v1    # "invalid$iv":Z
    .local p4, "invalid$iv":Z
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 2305
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p4, :cond_37

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p5, v2

    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local p5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_36

    goto :goto_20

    .line 2309
    :cond_36
    move-object v2, v1

    move/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v1, p5

    move-wide/from16 v25, v11

    move/from16 v12, p2

    move-object/from16 p2, v5

    move-wide v4, v9

    move-wide v10, v7

    move-wide v8, v13

    move-object/from16 v14, v16

    move/from16 v13, p3

    move-object/from16 p3, v2

    move/from16 v16, v6

    move-wide/from16 v6, v25

    goto :goto_21

    .line 2305
    .end local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_37
    move-object/from16 p5, v2

    .line 2306
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :goto_20
    const/16 v19, 0x0

    .line 1247
    .local v19, "$i$a$-cache-SliderDefaults$Track$11":I
    new-instance v2, Landroidx/compose/material3/SliderDefaults$Track$11$1;

    move/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v3, p1

    move-wide/from16 v25, v11

    move/from16 v12, p2

    move-object/from16 p2, v5

    move-wide v4, v9

    move-wide v10, v7

    move-wide v8, v13

    move-object/from16 v14, v16

    move/from16 v13, p3

    move-object/from16 p3, v1

    move/from16 v16, v6

    move-wide/from16 v6, v25

    move-object/from16 v1, p5

    .end local v3    # "enabled":Z
    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v7    # "activeTickColor":J
    .end local v9    # "inactiveTrackColor":J
    .end local v11    # "activeTrackColor":J
    .end local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v4, "inactiveTrackColor":J
    .local v6, "activeTrackColor":J
    .local v8, "inactiveTickColor":J
    .local v10, "activeTickColor":J
    .restart local v12    # "thumbTrackGapSize":F
    .local v13, "trackInsideCornerSize":F
    .restart local v14    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v16, "$dirty":I
    .local v20, "enabled":Z
    .local v21, "colors":Landroidx/compose/material3/SliderColors;
    .local p2, "$composer":Landroidx/compose/runtime/Composer;
    .local p3, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v2 .. v15}, Landroidx/compose/material3/SliderDefaults$Track$11$1;-><init>(Landroidx/compose/material3/RangeSliderState;JJJJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 2306
    .end local v19    # "$i$a$-cache-SliderDefaults$Track$11":I
    nop

    .line 2307
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2308
    nop

    .line 2305
    .end local v2    # "value$iv":Ljava/lang/Object;
    :goto_21
    nop

    .line 2304
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    nop

    .line 1247
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1242
    move-object/from16 v1, p2

    const/4 v3, 0x0

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1266
    .end local v4    # "inactiveTrackColor":J
    .end local v6    # "activeTrackColor":J
    .end local v8    # "inactiveTickColor":J
    .end local v10    # "activeTickColor":J
    :cond_38
    move v8, v12

    move/from16 v4, v20

    move-object/from16 v5, v21

    move-object/from16 v3, v22

    move v9, v13

    move-object v6, v14

    move-object v7, v15

    .end local v12    # "thumbTrackGapSize":F
    .end local v13    # "trackInsideCornerSize":F
    .end local v14    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .end local v15    # "drawTick":Lkotlin/jvm/functions/Function3;
    .end local v20    # "enabled":Z
    .end local v21    # "colors":Landroidx/compose/material3/SliderColors;
    .end local v22    # "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "colors":Landroidx/compose/material3/SliderColors;
    .local v6, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v7, "drawTick":Lkotlin/jvm/functions/Function3;
    .local v8, "thumbTrackGapSize":F
    .local v9, "trackInsideCornerSize":F
    :goto_22
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_39

    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$12;

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    move-object v13, v1

    move-object/from16 v1, p0

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/SliderDefaults$Track$12;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_23

    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_39
    move-object v13, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v13    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_23
    return-void
.end method

.method public final Track-4EFweAY(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p1, "sliderState"    # Landroidx/compose/material3/SliderState;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "colors"    # Landroidx/compose/material3/SliderColors;
    .param p5, "drawStopIndicator"    # Lkotlin/jvm/functions/Function2;
    .param p6, "drawTick"    # Lkotlin/jvm/functions/Function3;
    .param p7, "thumbTrackGapSize"    # F
    .param p8, "trackInsideCornerSize"    # F
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SliderState;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/material3/SliderColors;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "-",
            "Landroidx/compose/ui/graphics/Color;",
            "Lkotlin/Unit;",
            ">;FF",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1129
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p10

    move/from16 v3, p11

    const v4, 0x2fab503

    move-object/from16 v5, p9

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1114@49756L8,1115@49825L232,1137@50806L7,1138@50862L595,1133@50659L798:Slider.kt#uh7d8r"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p10

    .local v6, "$dirty":I
    and-int/lit8 v7, v3, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v6, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v6, v7

    :cond_2
    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    move-object/from16 v8, p2

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    goto :goto_3

    :cond_5
    move-object/from16 v8, p2

    :goto_3
    and-int/lit8 v9, v3, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v6, v6, 0x180

    move/from16 v11, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_8

    move/from16 v11, p3

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v6, v12

    goto :goto_5

    :cond_8
    move/from16 v11, p3

    :goto_5
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_b

    and-int/lit8 v12, v3, 0x8

    if-nez v12, :cond_9

    move-object/from16 v12, p4

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v12, p4

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v6, v14

    goto :goto_7

    :cond_b
    move-object/from16 v12, p4

    :goto_7
    and-int/lit16 v14, v0, 0x6000

    if-nez v14, :cond_e

    and-int/lit8 v14, v3, 0x10

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v14, p5

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v6, v6, v16

    goto :goto_9

    :cond_e
    move-object/from16 v14, p5

    :goto_9
    and-int/lit8 v16, v3, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v6, v6, v17

    move-object/from16 v15, p6

    goto :goto_b

    :cond_f
    and-int v17, v0, v17

    if-nez v17, :cond_11

    move-object/from16 v15, p6

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v6, v6, v18

    goto :goto_b

    :cond_11
    move-object/from16 v15, p6

    :goto_b
    and-int/lit8 v18, v3, 0x40

    const/high16 v20, 0x180000

    if-eqz v18, :cond_12

    or-int v6, v6, v20

    move/from16 v4, p7

    goto :goto_d

    :cond_12
    and-int v20, v0, v20

    if-nez v20, :cond_14

    move/from16 v4, p7

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v21, 0x80000

    :goto_c
    or-int v6, v6, v21

    goto :goto_d

    :cond_14
    move/from16 v4, p7

    :goto_d
    and-int/lit16 v10, v3, 0x80

    const/high16 v22, 0xc00000

    if-eqz v10, :cond_15

    or-int v6, v6, v22

    move/from16 v13, p8

    goto :goto_f

    :cond_15
    and-int v22, v0, v22

    if-nez v22, :cond_17

    move/from16 v13, p8

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v23, 0x400000

    :goto_e
    or-int v6, v6, v23

    goto :goto_f

    :cond_17
    move/from16 v13, p8

    :goto_f
    and-int/lit16 v0, v3, 0x100

    if-eqz v0, :cond_18

    const/high16 v0, 0x6000000

    :goto_10
    or-int/2addr v6, v0

    goto :goto_11

    :cond_18
    const/high16 v0, 0x6000000

    and-int v0, p10, v0

    if-nez v0, :cond_1a

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/high16 v0, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v0, 0x2000000

    goto :goto_10

    :cond_1a
    :goto_11
    const v0, 0x2492493

    and-int/2addr v0, v6

    const v3, 0x2492492

    if-ne v0, v3, :cond_1c

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_12

    .line 1158
    :cond_1b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v1, v5

    move/from16 v16, v6

    move-object v3, v8

    move-object v5, v12

    move v8, v4

    move v4, v11

    move v9, v13

    move-object v6, v14

    move-object v7, v15

    goto/16 :goto_22

    .line 1129
    :cond_1c
    :goto_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_20

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_13

    .line 1128
    :cond_1d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_1e

    and-int/lit16 v6, v6, -0x1c01

    :cond_1e
    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_1f

    const v0, -0xe001

    and-int/2addr v0, v6

    move-object v3, v12

    move v12, v4

    move-object v4, v3

    move v6, v0

    move-object v0, v8

    move v3, v11

    .end local v6    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_18

    .end local v0    # "$dirty":I
    .restart local v6    # "$dirty":I
    :cond_1f
    move-object v0, v12

    move v12, v4

    move-object v4, v0

    move-object v0, v8

    move v3, v11

    goto/16 :goto_18

    .line 1129
    :cond_20
    :goto_13
    if-eqz v7, :cond_21

    .line 1113
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v8, v0

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v8, "modifier":Landroidx/compose/ui/Modifier;
    :cond_21
    if-eqz v9, :cond_22

    .line 1114
    const/4 v0, 0x1

    move v11, v0

    .end local p3    # "enabled":Z
    .local v11, "enabled":Z
    :cond_22
    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_23

    .line 1115
    shr-int/lit8 v0, v6, 0x18

    and-int/lit8 v0, v0, 0xe

    invoke-virtual {v1, v5, v0}, Landroidx/compose/material3/SliderDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;

    move-result-object v0

    .end local p4    # "colors":Landroidx/compose/material3/SliderColors;
    .local v0, "colors":Landroidx/compose/material3/SliderColors;
    and-int/lit16 v6, v6, -0x1c01

    move-object v12, v0

    .end local v0    # "colors":Landroidx/compose/material3/SliderColors;
    .local v12, "colors":Landroidx/compose/material3/SliderColors;
    :cond_23
    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_2a

    .line 1116
    const v0, -0x2fbc6385

    const-string v7, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v5, v0, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v0, v6, 0x1c00

    xor-int/lit16 v0, v0, 0xc00

    const/16 v7, 0x800

    if-le v0, v7, :cond_24

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    :cond_24
    and-int/lit16 v0, v6, 0xc00

    const/16 v7, 0x800

    if-ne v0, v7, :cond_26

    :cond_25
    const/4 v0, 0x1

    goto :goto_14

    :cond_26
    const/4 v0, 0x0

    :goto_14
    and-int/lit16 v7, v6, 0x380

    const/16 v9, 0x100

    if-ne v7, v9, :cond_27

    const/4 v7, 0x1

    goto :goto_15

    :cond_27
    const/4 v7, 0x0

    :goto_15
    or-int/2addr v0, v7

    .local v0, "invalid$iv":Z
    move-object v7, v5

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 2284
    .local v9, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 2285
    .local v22, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_29

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p2, v0

    .end local v0    # "invalid$iv":Z
    .local p2, "invalid$iv":Z
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_28

    goto :goto_16

    .line 2289
    :cond_28
    move-object v0, v3

    goto :goto_17

    .line 2285
    .end local p2    # "invalid$iv":Z
    .restart local v0    # "invalid$iv":Z
    :cond_29
    move/from16 p2, v0

    .line 2286
    .end local v0    # "invalid$iv":Z
    .restart local p2    # "invalid$iv":Z
    :goto_16
    const/4 v0, 0x0

    .line 1116
    .local v0, "$i$a$-cache-SliderDefaults$Track$4":I
    move/from16 p3, v0

    .end local v0    # "$i$a$-cache-SliderDefaults$Track$4":I
    .local p3, "$i$a$-cache-SliderDefaults$Track$4":I
    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$4$1;

    invoke-direct {v0, v12, v11}, Landroidx/compose/material3/SliderDefaults$Track$4$1;-><init>(Landroidx/compose/material3/SliderColors;Z)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 2286
    .end local p3    # "$i$a$-cache-SliderDefaults$Track$4":I
    nop

    .line 2287
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2288
    nop

    .line 2285
    .end local v0    # "value$iv":Ljava/lang/Object;
    :goto_17
    nop

    .line 2284
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 1116
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .end local p5    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v0, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v3, -0xe001

    and-int/2addr v6, v3

    move-object v14, v0

    .end local v0    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v14, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    :cond_2a
    if-eqz v16, :cond_2b

    .line 1124
    sget-object v0, Landroidx/compose/material3/SliderDefaults$Track$5;->INSTANCE:Landroidx/compose/material3/SliderDefaults$Track$5;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    move-object v15, v0

    .end local p6    # "drawTick":Lkotlin/jvm/functions/Function3;
    .local v15, "drawTick":Lkotlin/jvm/functions/Function3;
    :cond_2b
    if-eqz v18, :cond_2c

    .line 1127
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getThumbTrackGapSize$p()F

    move-result v0

    move v4, v0

    .end local p7    # "thumbTrackGapSize":F
    .local v4, "thumbTrackGapSize":F
    :cond_2c
    if-eqz v10, :cond_2d

    .line 1128
    invoke-static {}, Landroidx/compose/material3/SliderKt;->access$getTrackInsideCornerSize$p()F

    move-result v0

    move-object v3, v12

    move v12, v4

    move-object v4, v3

    move v13, v0

    move-object v0, v8

    move v3, v11

    .end local p8    # "trackInsideCornerSize":F
    .local v0, "trackInsideCornerSize":F
    goto :goto_18

    .line 1127
    .end local v0    # "trackInsideCornerSize":F
    .restart local p8    # "trackInsideCornerSize":F
    :cond_2d
    move-object v0, v12

    move v12, v4

    move-object v4, v0

    move-object v0, v8

    move v3, v11

    .line 1128
    .end local v8    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v11    # "enabled":Z
    .end local p8    # "trackInsideCornerSize":F
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "colors":Landroidx/compose/material3/SliderColors;
    .local v12, "thumbTrackGapSize":F
    .local v13, "trackInsideCornerSize":F
    :goto_18
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_2e

    .line 1129
    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)"

    const v9, 0x2fab503

    invoke-static {v9, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1130
    :cond_2e
    const/4 v7, 0x0

    invoke-virtual {v4, v3, v7}, Landroidx/compose/material3/SliderColors;->trackColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v8

    .line 1131
    .local v8, "inactiveTrackColor":J
    move/from16 p2, v12

    const/4 v10, 0x1

    .end local v12    # "thumbTrackGapSize":F
    .local p2, "thumbTrackGapSize":F
    invoke-virtual {v4, v3, v10}, Landroidx/compose/material3/SliderColors;->trackColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v11

    .line 1132
    .local v11, "activeTrackColor":J
    move/from16 p3, v13

    move-object/from16 v16, v14

    .end local v13    # "trackInsideCornerSize":F
    .end local v14    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v16, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local p3, "trackInsideCornerSize":F
    invoke-virtual {v4, v3, v7}, Landroidx/compose/material3/SliderColors;->tickColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v13

    .line 1133
    .local v13, "inactiveTickColor":J
    move-wide/from16 p4, v8

    .end local v8    # "inactiveTrackColor":J
    .local p4, "inactiveTrackColor":J
    invoke-virtual {v4, v3, v10}, Landroidx/compose/material3/SliderColors;->tickColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v7

    .line 1135
    .local v7, "activeTickColor":J
    nop

    .line 1136
    const/4 v9, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v9, v10, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 1137
    invoke-static {}, Landroidx/compose/material3/SliderKt;->getTrackHeight()F

    move-result v9

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 1138
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/CompositionLocal;

    .local v9, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v18, 0x0

    .local v18, "$changed$iv":I
    const/16 v19, 0x0

    .line 2290
    .local v19, "$i$f$getCurrent":I
    const v10, 0x789c5f52

    move-object/from16 v22, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "modifier":Landroidx/compose/ui/Modifier;
    const-string v0, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v5, v10, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1138
    .end local v9    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$changed$iv":I
    .end local v19    # "$i$f$getCurrent":I
    sget-object v9, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    if-ne v0, v9, :cond_2f

    const/high16 v0, 0x43340000    # 180.0f

    goto :goto_19

    :cond_2f
    const/4 v0, 0x0

    :goto_19
    invoke-static {v1, v0}, Landroidx/compose/ui/draw/RotateKt;->rotate(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 1139
    const v1, -0x2fbbe07a

    const-string v9, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v5, v1, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    move-wide/from16 v9, p4

    .end local p4    # "inactiveTrackColor":J
    .local v9, "inactiveTrackColor":J
    invoke-interface {v5, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    invoke-interface {v5, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    invoke-interface {v5, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    invoke-interface {v5, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    or-int v1, v1, v18

    const/high16 v18, 0x380000

    move/from16 p4, v1

    and-int v1, v6, v18

    const/high16 v2, 0x100000

    if-ne v1, v2, :cond_30

    const/4 v1, 0x1

    goto :goto_1a

    :cond_30
    const/4 v1, 0x0

    :goto_1a
    or-int v1, p4, v1

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v6

    move/from16 p4, v1

    const/high16 v1, 0x800000

    if-ne v2, v1, :cond_31

    const/4 v1, 0x1

    goto :goto_1b

    :cond_31
    const/4 v1, 0x0

    :goto_1b
    or-int v1, p4, v1

    const v2, 0xe000

    and-int/2addr v2, v6

    xor-int/lit16 v2, v2, 0x6000

    move/from16 p4, v1

    const/16 v1, 0x4000

    if-le v2, v1, :cond_33

    move-object/from16 v1, v16

    .end local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v1, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    goto :goto_1c

    :cond_32
    move-object/from16 v16, v1

    goto :goto_1d

    .end local v1    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    :cond_33
    move-object/from16 v1, v16

    .end local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .restart local v1    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    :goto_1c
    and-int/lit16 v2, v6, 0x6000

    move-object/from16 v16, v1

    const/16 v1, 0x4000

    .end local v1    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    if-ne v2, v1, :cond_34

    :goto_1d
    const/4 v1, 0x1

    goto :goto_1e

    :cond_34
    const/4 v1, 0x0

    :goto_1e
    or-int v1, p4, v1

    const/high16 v2, 0x70000

    and-int/2addr v2, v6

    move/from16 p4, v1

    const/high16 v1, 0x20000

    if-ne v2, v1, :cond_35

    const/16 v21, 0x1

    goto :goto_1f

    :cond_35
    const/16 v21, 0x0

    :goto_1f
    or-int v1, p4, v21

    .local v1, "invalid$iv":Z
    move-object v2, v5

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 2291
    .local v17, "$i$f$cache":I
    move/from16 p4, v1

    .end local v1    # "invalid$iv":Z
    .local p4, "invalid$iv":Z
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 2292
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p4, :cond_37

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p5, v2

    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local p5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_36

    goto :goto_20

    .line 2296
    :cond_36
    move-object v2, v1

    move/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v1, p5

    move-wide/from16 v25, v11

    move/from16 v12, p2

    move-object/from16 p2, v5

    move-wide v4, v9

    move-wide v10, v7

    move-wide v8, v13

    move-object/from16 v14, v16

    move/from16 v13, p3

    move-object/from16 p3, v2

    move/from16 v16, v6

    move-wide/from16 v6, v25

    goto :goto_21

    .line 2292
    .end local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :cond_37
    move-object/from16 p5, v2

    .line 2293
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .restart local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    :goto_20
    const/16 v19, 0x0

    .line 1139
    .local v19, "$i$a$-cache-SliderDefaults$Track$6":I
    new-instance v2, Landroidx/compose/material3/SliderDefaults$Track$6$1;

    move/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v3, p1

    move-wide/from16 v25, v11

    move/from16 v12, p2

    move-object/from16 p2, v5

    move-wide v4, v9

    move-wide v10, v7

    move-wide v8, v13

    move-object/from16 v14, v16

    move/from16 v13, p3

    move-object/from16 p3, v1

    move/from16 v16, v6

    move-wide/from16 v6, v25

    move-object/from16 v1, p5

    .end local v3    # "enabled":Z
    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v7    # "activeTickColor":J
    .end local v9    # "inactiveTrackColor":J
    .end local v11    # "activeTrackColor":J
    .end local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v4, "inactiveTrackColor":J
    .local v6, "activeTrackColor":J
    .local v8, "inactiveTickColor":J
    .local v10, "activeTickColor":J
    .restart local v12    # "thumbTrackGapSize":F
    .local v13, "trackInsideCornerSize":F
    .restart local v14    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v16, "$dirty":I
    .local v20, "enabled":Z
    .local v21, "colors":Landroidx/compose/material3/SliderColors;
    .local p2, "$composer":Landroidx/compose/runtime/Composer;
    .local p3, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v2 .. v15}, Landroidx/compose/material3/SliderDefaults$Track$6$1;-><init>(Landroidx/compose/material3/SliderState;JJJJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 2293
    .end local v19    # "$i$a$-cache-SliderDefaults$Track$6":I
    nop

    .line 2294
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2295
    nop

    .line 2292
    .end local v2    # "value$iv":Ljava/lang/Object;
    :goto_21
    nop

    .line 2291
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p3    # "it$iv":Ljava/lang/Object;
    nop

    .line 1139
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1134
    move-object/from16 v1, p2

    const/4 v3, 0x0

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1158
    .end local v4    # "inactiveTrackColor":J
    .end local v6    # "activeTrackColor":J
    .end local v8    # "inactiveTickColor":J
    .end local v10    # "activeTickColor":J
    :cond_38
    move v8, v12

    move/from16 v4, v20

    move-object/from16 v5, v21

    move-object/from16 v3, v22

    move v9, v13

    move-object v6, v14

    move-object v7, v15

    .end local v12    # "thumbTrackGapSize":F
    .end local v13    # "trackInsideCornerSize":F
    .end local v14    # "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .end local v15    # "drawTick":Lkotlin/jvm/functions/Function3;
    .end local v20    # "enabled":Z
    .end local v21    # "colors":Landroidx/compose/material3/SliderColors;
    .end local v22    # "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "colors":Landroidx/compose/material3/SliderColors;
    .local v6, "drawStopIndicator":Lkotlin/jvm/functions/Function2;
    .local v7, "drawTick":Lkotlin/jvm/functions/Function3;
    .local v8, "thumbTrackGapSize":F
    .local v9, "trackInsideCornerSize":F
    :goto_22
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_39

    new-instance v0, Landroidx/compose/material3/SliderDefaults$Track$7;

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    move-object v13, v1

    move-object/from16 v1, p0

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/SliderDefaults$Track$7;-><init>(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFII)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_23

    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_39
    move-object v13, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v13    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_23
    return-void
.end method

.method public final colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;
    .locals 3
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    .line 846
    const v0, 0x52089c20

    const-string v1, "C(colors)845@36907L11:Slider.kt#uh7d8r"

    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/material3/SliderDefaults;->getDefaultSliderColors$material3_release(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;

    move-result-object v0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v0
.end method

.method public final colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;
    .locals 26
    .param p1, "thumbColor"    # J
    .param p3, "activeTrackColor"    # J
    .param p5, "activeTickColor"    # J
    .param p7, "inactiveTrackColor"    # J
    .param p9, "inactiveTickColor"    # J
    .param p11, "disabledThumbColor"    # J
    .param p13, "disabledActiveTrackColor"    # J
    .param p15, "disabledActiveTickColor"    # J
    .param p17, "disabledInactiveTrackColor"    # J
    .param p19, "disabledInactiveTickColor"    # J
    .param p21, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p22, "$changed"    # I
    .param p23, "$changed1"    # I

    .line 888
    move-object/from16 v0, p21

    move/from16 v1, p24

    const v2, 0x34c9025e

    const-string v3, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    .line 877
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide v6, v3

    .end local p1    # "thumbColor":J
    .local v3, "thumbColor":J
    goto :goto_0

    .line 888
    .end local v3    # "thumbColor":J
    .restart local p1    # "thumbColor":J
    :cond_0
    move-wide/from16 v6, p1

    .line 877
    .end local p1    # "thumbColor":J
    .local v6, "thumbColor":J
    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    .line 878
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide v8, v3

    .end local p3    # "activeTrackColor":J
    .local v3, "activeTrackColor":J
    goto :goto_1

    .line 877
    .end local v3    # "activeTrackColor":J
    .restart local p3    # "activeTrackColor":J
    :cond_1
    move-wide/from16 v8, p3

    .line 878
    .end local p3    # "activeTrackColor":J
    .local v8, "activeTrackColor":J
    :goto_1
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_2

    .line 879
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide v10, v3

    .end local p5    # "activeTickColor":J
    .local v3, "activeTickColor":J
    goto :goto_2

    .line 878
    .end local v3    # "activeTickColor":J
    .restart local p5    # "activeTickColor":J
    :cond_2
    move-wide/from16 v10, p5

    .line 879
    .end local p5    # "activeTickColor":J
    .local v10, "activeTickColor":J
    :goto_2
    and-int/lit8 v3, v1, 0x8

    if-eqz v3, :cond_3

    .line 880
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide v12, v3

    .end local p7    # "inactiveTrackColor":J
    .local v3, "inactiveTrackColor":J
    goto :goto_3

    .line 879
    .end local v3    # "inactiveTrackColor":J
    .restart local p7    # "inactiveTrackColor":J
    :cond_3
    move-wide/from16 v12, p7

    .line 880
    .end local p7    # "inactiveTrackColor":J
    .local v12, "inactiveTrackColor":J
    :goto_3
    and-int/lit8 v3, v1, 0x10

    if-eqz v3, :cond_4

    .line 881
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide v14, v3

    .end local p9    # "inactiveTickColor":J
    .local v3, "inactiveTickColor":J
    goto :goto_4

    .line 880
    .end local v3    # "inactiveTickColor":J
    .restart local p9    # "inactiveTickColor":J
    :cond_4
    move-wide/from16 v14, p9

    .line 881
    .end local p9    # "inactiveTickColor":J
    .local v14, "inactiveTickColor":J
    :goto_4
    and-int/lit8 v3, v1, 0x20

    if-eqz v3, :cond_5

    .line 882
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide/from16 v16, v3

    .end local p11    # "disabledThumbColor":J
    .local v3, "disabledThumbColor":J
    goto :goto_5

    .line 881
    .end local v3    # "disabledThumbColor":J
    .restart local p11    # "disabledThumbColor":J
    :cond_5
    move-wide/from16 v16, p11

    .line 882
    .end local p11    # "disabledThumbColor":J
    .local v16, "disabledThumbColor":J
    :goto_5
    and-int/lit8 v3, v1, 0x40

    if-eqz v3, :cond_6

    .line 883
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide/from16 v18, v3

    .end local p13    # "disabledActiveTrackColor":J
    .local v3, "disabledActiveTrackColor":J
    goto :goto_6

    .line 882
    .end local v3    # "disabledActiveTrackColor":J
    .restart local p13    # "disabledActiveTrackColor":J
    :cond_6
    move-wide/from16 v18, p13

    .line 883
    .end local p13    # "disabledActiveTrackColor":J
    .local v18, "disabledActiveTrackColor":J
    :goto_6
    and-int/lit16 v3, v1, 0x80

    if-eqz v3, :cond_7

    .line 884
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide/from16 v20, v3

    .end local p15    # "disabledActiveTickColor":J
    .local v3, "disabledActiveTickColor":J
    goto :goto_7

    .line 883
    .end local v3    # "disabledActiveTickColor":J
    .restart local p15    # "disabledActiveTickColor":J
    :cond_7
    move-wide/from16 v20, p15

    .line 884
    .end local p15    # "disabledActiveTickColor":J
    .local v20, "disabledActiveTickColor":J
    :goto_7
    and-int/lit16 v3, v1, 0x100

    if-eqz v3, :cond_8

    .line 885
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide/from16 v22, v3

    .end local p17    # "disabledInactiveTrackColor":J
    .local v3, "disabledInactiveTrackColor":J
    goto :goto_8

    .line 884
    .end local v3    # "disabledInactiveTrackColor":J
    .restart local p17    # "disabledInactiveTrackColor":J
    :cond_8
    move-wide/from16 v22, p17

    .line 885
    .end local p17    # "disabledInactiveTrackColor":J
    .local v22, "disabledInactiveTrackColor":J
    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    .line 886
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v3

    move-wide/from16 v24, v3

    .end local p19    # "disabledInactiveTickColor":J
    .local v3, "disabledInactiveTickColor":J
    goto :goto_9

    .line 885
    .end local v3    # "disabledInactiveTickColor":J
    .restart local p19    # "disabledInactiveTickColor":J
    :cond_9
    move-wide/from16 v24, p19

    .line 886
    .end local p19    # "disabledInactiveTickColor":J
    .local v24, "disabledInactiveTickColor":J
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 888
    const-string v1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)"

    move/from16 v3, p22

    move/from16 v4, p23

    invoke-static {v2, v3, v4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_a

    .line 886
    :cond_a
    move/from16 v3, p22

    move/from16 v4, p23

    .line 888
    :goto_a
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v2, 0x6

    invoke-virtual {v1, v0, v2}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Landroidx/compose/material3/SliderDefaults;->getDefaultSliderColors$material3_release(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;

    move-result-object v5

    .line 889
    nop

    .line 890
    nop

    .line 891
    nop

    .line 892
    nop

    .line 893
    nop

    .line 894
    nop

    .line 895
    nop

    .line 896
    nop

    .line 897
    nop

    .line 898
    nop

    .line 888
    invoke-virtual/range {v5 .. v25}, Landroidx/compose/material3/SliderColors;->copy--K518z4(JJJJJJJJJJ)Landroidx/compose/material3/SliderColors;

    move-result-object v1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v1
.end method

.method public final getDefaultSliderColors$material3_release(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;
    .locals 33
    .param p1, "$this$defaultSliderColors"    # Landroidx/compose/material3/ColorScheme;

    .line 903
    move-object/from16 v0, p1

    invoke-virtual {v0}, Landroidx/compose/material3/ColorScheme;->getDefaultSliderColorsCached$material3_release()Landroidx/compose/material3/SliderColors;

    move-result-object v1

    if-nez v1, :cond_0

    .line 904
    new-instance v2, Landroidx/compose/material3/SliderColors;

    .line 905
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v3

    .line 906
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getActiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v5

    .line 907
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getInactiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v7

    .line 908
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getInactiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v9

    .line 909
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getActiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v11

    .line 911
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledHandleColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v13

    .line 912
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledHandleOpacity()F

    move-result v15

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    .line 913
    move-object v15, v2

    invoke-virtual {v0}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    move-result-wide v1

    invoke-static {v13, v14, v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v13

    .line 915
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledActiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v16

    .line 916
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledActiveTrackOpacity()F

    move-result v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    .line 918
    sget-object v16, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    move-wide/from16 v17, v1

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledInactiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v19

    .line 919
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledInactiveTrackOpacity()F

    move-result v21

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v19 .. v26}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    .line 921
    sget-object v16, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    move-wide/from16 v19, v1

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledInactiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v21

    .line 922
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledInactiveTrackOpacity()F

    move-result v23

    const/16 v27, 0xe

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v21 .. v28}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    .line 924
    sget-object v16, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    move-wide/from16 v21, v1

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledActiveTrackColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v23

    .line 925
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getDisabledActiveTrackOpacity()F

    move-result v25

    const/16 v29, 0xe

    const/16 v30, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v23 .. v30}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    .line 904
    const/16 v23, 0x0

    move-wide/from16 v31, v1

    move-object v2, v15

    move-wide/from16 v15, v17

    move-wide/from16 v17, v19

    move-wide/from16 v19, v21

    move-wide/from16 v21, v31

    invoke-direct/range {v2 .. v23}, Landroidx/compose/material3/SliderColors;-><init>(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 927
    move-object v15, v2

    move-object v1, v15

    .line 2264
    .local v1, "it":Landroidx/compose/material3/SliderColors;
    const/4 v2, 0x0

    .line 927
    .local v2, "$i$a$-also-SliderDefaults$defaultSliderColors$1":I
    invoke-virtual {v0, v1}, Landroidx/compose/material3/ColorScheme;->setDefaultSliderColorsCached$material3_release(Landroidx/compose/material3/SliderColors;)V

    .line 903
    .end local v1    # "it":Landroidx/compose/material3/SliderColors;
    .end local v2    # "$i$a$-also-SliderDefaults$defaultSliderColors$1":I
    :cond_0
    return-object v1
.end method

.method public final getTickSize-D9Ej5fM()F
    .locals 1

    .line 1400
    sget v0, Landroidx/compose/material3/SliderDefaults;->TickSize:F

    return v0
.end method

.method public final getTrackStopIndicatorSize-D9Ej5fM()F
    .locals 1

    .line 1397
    sget v0, Landroidx/compose/material3/SliderDefaults;->TrackStopIndicatorSize:F

    return v0
.end method
