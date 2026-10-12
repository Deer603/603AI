.class public final Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;
.super Ljava/lang/Object;
.source "VelocityTracker.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,706:1\n662#1:719\n669#1,2:720\n665#1,6:722\n662#1:728\n662#1:729\n657#1:730\n644#1:732\n644#1:733\n34#2,6:707\n34#2,6:713\n69#3:731\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n481#1:719\n483#1:720,2\n485#1:722,6\n492#1:728\n494#1:729\n507#1:730\n629#1:732\n635#1:733\n383#1:707,6\n418#1:713,6\n507#1:731\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\u001a(\u0010\u0013\u001a\u000c\u0012\u0008\u0012\u00060\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0082\u0008\u00a2\u0006\u0002\u0010\u0019\u001a(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\u0008\u001a2\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0008\u0008\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a\u0012\u0010&\u001a\u00020\'*\u00020(2\u0006\u0010)\u001a\u00020*\u001a\u0014\u0010+\u001a\u00020\'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010,\u001a\u00020\'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010-\u001a\u00020\u0003*\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002\u001a,\u0010/\u001a\u00020\u0003*\u000c\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0082\n\u00a2\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0003*\u00020\u0015H\u0082\u0008\u001a4\u00105\u001a\u00020\'*\u000c\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0003H\u0082\n\u00a2\u0006\u0002\u00107\u001a1\u00105\u001a\u00020\'*\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00142\u0006\u00109\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0002\u00a2\u0006\u0002\u0010<\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\",\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\",\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0010\u0010\n\u001a\u0004\u0008\u0011\u0010\u000c\"\u0004\u0008\u0012\u0010\u000e*\u0018\u0008\u0002\u0010\u0013\"\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0012\u0004\u0012\u00020\u00150\u0014*\u000c\u0008\u0002\u0010=\"\u00020\u00152\u00020\u0015\u00a8\u0006>"
    }
    d2 = {
        "AssumePointerMoveStoppedMilliseconds",
        "",
        "DefaultWeight",
        "",
        "HistorySize",
        "HorizonMilliseconds",
        "<set-?>",
        "",
        "VelocityTrackerAddPointsFix",
        "getVelocityTrackerAddPointsFix$annotations",
        "()V",
        "getVelocityTrackerAddPointsFix",
        "()Z",
        "setVelocityTrackerAddPointsFix",
        "(Z)V",
        "VelocityTrackerStrategyUseImpulse",
        "getVelocityTrackerStrategyUseImpulse$annotations",
        "getVelocityTrackerStrategyUseImpulse",
        "setVelocityTrackerStrategyUseImpulse",
        "Matrix",
        "",
        "",
        "Landroidx/compose/ui/input/pointer/util/Vector;",
        "rows",
        "cols",
        "(II)[[F",
        "calculateImpulseVelocity",
        "dataPoints",
        "time",
        "sampleCount",
        "isDataDifferential",
        "kineticEnergyToVelocity",
        "kineticEnergy",
        "polyFitLeastSquares",
        "x",
        "y",
        "degree",
        "coefficients",
        "addPointerInputChange",
        "",
        "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
        "event",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "addPointerInputChangeLegacy",
        "addPointerInputChangeWithFix",
        "dot",
        "a",
        "get",
        "Landroidx/compose/ui/input/pointer/util/Matrix;",
        "row",
        "col",
        "([[FII)F",
        "norm",
        "set",
        "value",
        "([[FIIF)V",
        "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;",
        "index",
        "",
        "dataPoint",
        "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V",
        "Vector",
        "ui_release"
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
.field private static final AssumePointerMoveStoppedMilliseconds:I = 0x28

.field private static final DefaultWeight:F = 1.0f

.field private static final HistorySize:I = 0x14

.field private static final HorizonMilliseconds:I = 0x64

.field private static VelocityTrackerAddPointsFix:Z

.field private static VelocityTrackerStrategyUseImpulse:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 685
    const/4 v0, 0x1

    sput-boolean v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix:Z

    return-void
.end method

.method private static final Matrix(II)[[F
    .locals 4
    .param p0, "rows"    # I
    .param p1, "cols"    # I

    const/4 v0, 0x0

    .line 662
    .local v0, "$i$f$Matrix":I
    new-array v1, p0, [[F

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_0

    new-array v3, p1, [F

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static final synthetic access$calculateImpulseVelocity([F[FIZ)F
    .locals 1
    .param p0, "dataPoints"    # [F
    .param p1, "time"    # [F
    .param p2, "sampleCount"    # I
    .param p3, "isDataDifferential"    # Z

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->calculateImpulseVelocity([F[FIZ)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V
    .locals 0
    .param p0, "$receiver"    # [Landroidx/compose/ui/input/pointer/util/DataPointAtTime;
    .param p1, "index"    # I
    .param p2, "time"    # J
    .param p4, "dataPoint"    # F

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V

    return-void
.end method

.method public static final addPointerInputChange(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 1
    .param p0, "$this$addPointerInputChange"    # Landroidx/compose/ui/input/pointer/util/VelocityTracker;
    .param p1, "event"    # Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 363
    sget-boolean v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix:Z

    if-eqz v0, :cond_0

    .line 364
    invoke-static {p0, p1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->addPointerInputChangeWithFix(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V

    goto :goto_0

    .line 366
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->addPointerInputChangeLegacy(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V

    .line 368
    :goto_0
    return-void
.end method

.method private static final addPointerInputChangeLegacy(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 16
    .param p0, "$this$addPointerInputChangeLegacy"    # Landroidx/compose/ui/input/pointer/util/VelocityTracker;
    .param p1, "event"    # Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 374
    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 375
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 376
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 381
    :cond_0
    const-wide/16 v1, 0x0

    .local v1, "previousPointerPosition":J
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    move-result-wide v1

    .line 383
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getHistorical()Ljava/util/List;

    move-result-object v3

    .local v3, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 707
    .local v4, "$i$f$fastForEach":I
    nop

    .line 708
    const/4 v5, 0x0

    .local v5, "index$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 709
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 710
    .local v7, "item$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/input/pointer/HistoricalChange;

    .local v8, "it":Landroidx/compose/ui/input/pointer/HistoricalChange;
    const/4 v9, 0x0

    .line 390
    .local v9, "$i$a$-fastForEach-VelocityTrackerKt$addPointerInputChangeLegacy$1":I
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    move-result-wide v10

    invoke-static {v10, v11, v1, v2}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    move-result-wide v10

    .line 391
    .local v10, "historicalDelta":J
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    move-result-wide v1

    .line 394
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    move-result-wide v12

    invoke-static {v12, v13, v10, v11}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    move-result-wide v12

    invoke-virtual {v0, v12, v13}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 395
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getUptimeMillis()J

    move-result-wide v12

    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    move-result-wide v14

    invoke-virtual {v0, v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 396
    nop

    .line 710
    .end local v8    # "it":Landroidx/compose/ui/input/pointer/HistoricalChange;
    .end local v9    # "$i$a$-fastForEach-VelocityTrackerKt$addPointerInputChangeLegacy$1":I
    .end local v10    # "historicalDelta":J
    nop

    .line 708
    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 712
    .end local v5    # "index$iv":I
    :cond_1
    nop

    .line 401
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    move-result-wide v3

    .line 402
    .local v3, "delta":J
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 403
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    move-result-wide v5

    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    move-result-wide v7

    invoke-virtual {v0, v5, v6, v7, v8}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 404
    return-void
.end method

.method private static final addPointerInputChangeWithFix(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 11
    .param p0, "$this$addPointerInputChangeWithFix"    # Landroidx/compose/ui/input/pointer/util/VelocityTracker;
    .param p1, "event"    # Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 408
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 417
    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 418
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getHistorical()Ljava/util/List;

    move-result-object v0

    .local v0, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 713
    .local v1, "$i$f$fastForEach":I
    nop

    .line 714
    const/4 v2, 0x0

    .local v2, "index$iv":I
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    .line 715
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 716
    .local v4, "item$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/input/pointer/HistoricalChange;

    .local v5, "it":Landroidx/compose/ui/input/pointer/HistoricalChange;
    const/4 v6, 0x0

    .line 418
    .local v6, "$i$a$-fastForEach-VelocityTrackerKt$addPointerInputChangeWithFix$1":I
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getUptimeMillis()J

    move-result-wide v7

    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getOriginalEventPosition-F1C5BW0$ui_release()J

    move-result-wide v9

    invoke-virtual {p0, v7, v8, v9, v10}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 716
    .end local v5    # "it":Landroidx/compose/ui/input/pointer/HistoricalChange;
    .end local v6    # "$i$a$-fastForEach-VelocityTrackerKt$addPointerInputChangeWithFix$1":I
    nop

    .line 714
    .end local v4    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 718
    .end local v2    # "index$iv":I
    :cond_1
    nop

    .line 419
    .end local v0    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEach":I
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getOriginalEventPosition-F1C5BW0$ui_release()J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 424
    :cond_2
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getLastMoveEventTimeStamp$ui_release()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x28

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 425
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 427
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setLastMoveEventTimeStamp$ui_release(J)V

    .line 428
    return-void
.end method

.method private static final calculateImpulseVelocity([F[FIZ)F
    .locals 12
    .param p0, "dataPoints"    # [F
    .param p1, "time"    # [F
    .param p2, "sampleCount"    # I
    .param p3, "isDataDifferential"    # Z

    .line 617
    const/4 v0, 0x0

    .line 618
    .local v0, "work":F
    add-int/lit8 v1, p2, -0x1

    .line 619
    .local v1, "start":I
    aget v2, p1, v1

    .line 620
    .local v2, "nextTime":F
    move v3, v1

    .local v3, "i":I
    :goto_0
    const/high16 v4, 0x40000000    # 2.0f

    if-lez v3, :cond_4

    .line 621
    move v5, v2

    .line 622
    .local v5, "currentTime":F
    add-int/lit8 v6, v3, -0x1

    aget v2, p1, v6

    .line 623
    cmpg-float v6, v5, v2

    if-nez v6, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_1

    .line 624
    goto :goto_3

    .line 627
    :cond_1
    if-eqz p3, :cond_2

    add-int/lit8 v6, v3, -0x1

    aget v6, p0, v6

    neg-float v6, v6

    goto :goto_2

    :cond_2
    aget v6, p0, v3

    add-int/lit8 v7, v3, -0x1

    aget v7, p0, v7

    sub-float/2addr v6, v7

    .line 626
    :goto_2
    nop

    .line 628
    .local v6, "dataPointsDelta":F
    sub-float v7, v5, v2

    div-float v7, v6, v7

    .line 629
    .local v7, "vCurr":F
    const/4 v8, 0x0

    .line 732
    .local v8, "$i$f$kineticEnergyToVelocity":I
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v9

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v10

    mul-float/2addr v4, v10

    float-to-double v10, v4

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    double-to-float v4, v10

    mul-float/2addr v9, v4

    .line 629
    .end local v8    # "$i$f$kineticEnergyToVelocity":I
    nop

    .line 630
    .local v9, "vPrev":F
    sub-float v4, v7, v9

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v8

    mul-float/2addr v4, v8

    add-float/2addr v0, v4

    .line 631
    if-ne v3, v1, :cond_3

    .line 632
    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v0, v4

    .line 620
    .end local v5    # "currentTime":F
    .end local v6    # "dataPointsDelta":F
    .end local v7    # "vCurr":F
    .end local v9    # "vPrev":F
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 635
    .end local v3    # "i":I
    :cond_4
    const/4 v3, 0x0

    .line 733
    .local v3, "$i$f$kineticEnergyToVelocity":I
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    mul-float/2addr v4, v6

    float-to-double v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-float v4, v6

    mul-float/2addr v5, v4

    .line 635
    .end local v3    # "$i$f$kineticEnergyToVelocity":I
    return v5
.end method

.method private static final dot([F[F)F
    .locals 5
    .param p0, "$this$dot"    # [F
    .param p1, "a"    # [F

    .line 650
    const/4 v0, 0x0

    .line 651
    .local v0, "result":F
    const/4 v1, 0x0

    .local v1, "i":I
    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 652
    aget v3, p0, v1

    aget v4, p1, v1

    mul-float/2addr v3, v4

    add-float/2addr v0, v3

    .line 651
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 654
    .end local v1    # "i":I
    :cond_0
    return v0
.end method

.method private static final get([[FII)F
    .locals 2
    .param p0, "$this$get"    # [[F
    .param p1, "row"    # I
    .param p2, "col"    # I

    const/4 v0, 0x0

    .line 665
    .local v0, "$i$f$get":I
    aget-object v1, p0, p1

    aget v1, v1, p2

    return v1
.end method

.method public static final getVelocityTrackerAddPointsFix()Z
    .locals 1

    .line 685
    sget-boolean v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix:Z

    return v0
.end method

.method public static synthetic getVelocityTrackerAddPointsFix$annotations()V
    .locals 0

    return-void
.end method

.method public static final getVelocityTrackerStrategyUseImpulse()Z
    .locals 1

    .line 698
    sget-boolean v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerStrategyUseImpulse:Z

    return v0
.end method

.method public static synthetic getVelocityTrackerStrategyUseImpulse$annotations()V
    .locals 0

    return-void
.end method

.method private static final kineticEnergyToVelocity(F)F
    .locals 4
    .param p0, "kineticEnergy"    # F

    const/4 v0, 0x0

    .line 644
    .local v0, "$i$f$kineticEnergyToVelocity":I
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    mul-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    return v1
.end method

.method private static final norm([F)F
    .locals 3
    .param p0, "$this$norm"    # [F

    const/4 v0, 0x0

    .line 657
    .local v0, "$i$f$norm":I
    invoke-static {p0, p0}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    return v1
.end method

.method public static final polyFitLeastSquares([F[FII[F)[F
    .locals 17
    .param p0, "x"    # [F
    .param p1, "y"    # [F
    .param p2, "sampleCount"    # I
    .param p3, "degree"    # I
    .param p4, "coefficients"    # [F

    .line 462
    move/from16 v0, p2

    move/from16 v1, p3

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    .line 463
    const-string v2, "The degree must be at positive integer"

    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 465
    :cond_0
    if-nez v0, :cond_1

    .line 466
    const-string v2, "At least one point must be provided"

    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 470
    :cond_1
    if-lt v1, v0, :cond_2

    .line 471
    add-int/lit8 v2, v0, -0x1

    goto :goto_0

    .line 473
    :cond_2
    move v2, v1

    .line 470
    :goto_0
    nop

    .line 469
    nop

    .line 477
    .local v2, "truncatedDegree":I
    move/from16 v3, p2

    .line 478
    .local v3, "m":I
    add-int/lit8 v4, v2, 0x1

    .line 481
    .local v4, "n":I
    const/4 v5, 0x0

    .line 719
    .local v5, "$i$f$Matrix":I
    new-array v6, v4, [[F

    const/4 v7, 0x0

    move v8, v7

    :goto_1
    if-ge v8, v4, :cond_3

    new-array v9, v3, [F

    aput-object v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 481
    .end local v5    # "$i$f$Matrix":I
    :cond_3
    nop

    .line 482
    .local v6, "a":[[F
    const/4 v5, 0x0

    .local v5, "h":I
    :goto_2
    if-ge v5, v3, :cond_5

    .line 483
    const/4 v8, 0x0

    .local v8, "row$iv":I
    const/high16 v9, 0x3f800000    # 1.0f

    .local v9, "value$iv":F
    move-object v10, v6

    .local v10, "$this$set$iv":[[F
    const/4 v11, 0x0

    .line 720
    .local v11, "$i$f$set":I
    aget-object v12, v10, v8

    aput v9, v12, v5

    .line 721
    nop

    .line 484
    .end local v8    # "row$iv":I
    .end local v9    # "value$iv":F
    .end local v10    # "$this$set$iv":[[F
    .end local v11    # "$i$f$set":I
    const/4 v8, 0x1

    .local v8, "i":I
    :goto_3
    if-ge v8, v4, :cond_4

    .line 485
    add-int/lit8 v9, v8, -0x1

    .local v9, "row$iv":I
    move-object v10, v6

    .local v10, "$this$get$iv":[[F
    const/4 v11, 0x0

    .line 722
    .local v11, "$i$f$get":I
    aget-object v12, v10, v9

    aget v9, v12, v5

    .line 485
    .end local v9    # "row$iv":I
    .end local v10    # "$this$get$iv":[[F
    .end local v11    # "$i$f$get":I
    aget v10, p0, v5

    mul-float/2addr v9, v10

    .local v9, "value$iv":F
    move-object v10, v6

    .local v10, "$this$set$iv":[[F
    const/4 v11, 0x0

    .line 726
    .local v11, "$i$f$set":I
    aget-object v12, v10, v8

    aput v9, v12, v5

    .line 727
    nop

    .line 484
    .end local v9    # "value$iv":F
    .end local v10    # "$this$set$iv":[[F
    .end local v11    # "$i$f$set":I
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 482
    .end local v8    # "i":I
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 492
    .end local v5    # "h":I
    :cond_5
    const/4 v5, 0x0

    .line 728
    .local v5, "$i$f$Matrix":I
    new-array v8, v4, [[F

    move v9, v7

    :goto_4
    if-ge v9, v4, :cond_6

    new-array v10, v3, [F

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 492
    .end local v5    # "$i$f$Matrix":I
    :cond_6
    nop

    .line 494
    .local v8, "q":[[F
    const/4 v5, 0x0

    .line 729
    .restart local v5    # "$i$f$Matrix":I
    new-array v9, v4, [[F

    move v10, v7

    :goto_5
    if-ge v10, v4, :cond_7

    new-array v11, v4, [F

    aput-object v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 494
    .end local v5    # "$i$f$Matrix":I
    :cond_7
    nop

    .line 495
    .local v9, "r":[[F
    const/4 v5, 0x0

    .local v5, "j":I
    :goto_6
    if-ge v5, v4, :cond_e

    .line 496
    aget-object v10, v8, v5

    .line 497
    .local v10, "w":[F
    aget-object v11, v6, v5

    invoke-static {v11, v10, v7, v7, v3}, Lkotlin/collections/ArraysKt;->copyInto([F[FIII)[F

    .line 499
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_7
    if-ge v11, v5, :cond_9

    .line 500
    aget-object v12, v8, v11

    .line 501
    .local v12, "z":[F
    invoke-static {v10, v12}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    move-result v13

    .line 502
    .local v13, "dot":F
    const/4 v14, 0x0

    .local v14, "h":I
    :goto_8
    if-ge v14, v3, :cond_8

    .line 503
    aget v15, v10, v14

    aget v16, v12, v14

    mul-float v16, v16, v13

    sub-float v15, v15, v16

    aput v15, v10, v14

    .line 502
    add-int/lit8 v14, v14, 0x1

    goto :goto_8

    .line 499
    .end local v12    # "z":[F
    .end local v13    # "dot":F
    .end local v14    # "h":I
    :cond_8
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    .line 507
    .end local v11    # "i":I
    :cond_9
    move-object v11, v10

    .local v11, "$this$norm$iv":[F
    const/4 v12, 0x0

    .line 730
    .local v12, "$i$f$norm":I
    invoke-static {v11, v11}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    move-result v13

    float-to-double v13, v13

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    double-to-float v13, v13

    .line 507
    .end local v11    # "$this$norm$iv":[F
    .end local v12    # "$i$f$norm":I
    const v11, 0x358637bd    # 1.0E-6f

    .local v11, "minimumValue$iv":F
    .local v13, "$this$fastCoerceAtLeast$iv":F
    const/4 v12, 0x0

    .line 731
    .local v12, "$i$f$fastCoerceAtLeast":I
    cmpg-float v14, v13, v11

    if-gez v14, :cond_a

    goto :goto_9

    :cond_a
    move v11, v13

    .line 507
    .end local v11    # "minimumValue$iv":F
    .end local v12    # "$i$f$fastCoerceAtLeast":I
    .end local v13    # "$this$fastCoerceAtLeast$iv":F
    :goto_9
    const/high16 v12, 0x3f800000    # 1.0f

    div-float/2addr v12, v11

    .line 508
    .local v12, "inverseNorm":F
    const/4 v11, 0x0

    .local v11, "h":I
    :goto_a
    if-ge v11, v3, :cond_b

    .line 509
    aget v13, v10, v11

    mul-float/2addr v13, v12

    aput v13, v10, v11

    .line 508
    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    .line 512
    .end local v11    # "h":I
    :cond_b
    aget-object v11, v9, v5

    .line 513
    .local v11, "v":[F
    const/4 v13, 0x0

    .local v13, "i":I
    :goto_b
    if-ge v13, v4, :cond_d

    .line 514
    if-ge v13, v5, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    aget-object v14, v6, v13

    invoke-static {v10, v14}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    move-result v14

    :goto_c
    aput v14, v11, v13

    .line 513
    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    .line 495
    .end local v10    # "w":[F
    .end local v11    # "v":[F
    .end local v12    # "inverseNorm":F
    .end local v13    # "i":I
    :cond_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 520
    .end local v5    # "j":I
    :cond_e
    move-object/from16 v5, p1

    .line 525
    .local v5, "wy":[F
    nop

    .line 535
    add-int/lit8 v7, v4, -0x1

    .local v7, "i":I
    :goto_d
    const/4 v10, -0x1

    if-ge v10, v7, :cond_10

    .line 536
    aget-object v10, v8, v7

    invoke-static {v10, v5}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    move-result v10

    .line 537
    .local v10, "c":F
    aget-object v11, v9, v7

    .line 538
    .local v11, "ri":[F
    add-int/lit8 v12, v4, -0x1

    .local v12, "j":I
    add-int/lit8 v13, v7, 0x1

    if-gt v13, v12, :cond_f

    .line 539
    :goto_e
    aget v14, v11, v12

    aget v15, p4, v12

    mul-float/2addr v14, v15

    sub-float/2addr v10, v14

    .line 538
    if-eq v12, v13, :cond_f

    add-int/lit8 v12, v12, -0x1

    goto :goto_e

    .line 541
    .end local v12    # "j":I
    :cond_f
    aget v12, v11, v7

    div-float v12, v10, v12

    aput v12, p4, v7

    .line 535
    .end local v10    # "c":F
    .end local v11    # "ri":[F
    add-int/lit8 v7, v7, -0x1

    goto :goto_d

    .line 544
    .end local v7    # "i":I
    :cond_10
    return-object p4
.end method

.method public static synthetic polyFitLeastSquares$default([F[FII[FILjava/lang/Object;)[F
    .locals 0

    .line 452
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    .line 460
    add-int/lit8 p4, p3, 0x1

    const/4 p5, 0x0

    invoke-static {p4, p5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p4

    new-array p4, p4, [F

    .line 452
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->polyFitLeastSquares([F[FII[F)[F

    move-result-object p0

    return-object p0
.end method

.method private static final set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V
    .locals 2
    .param p0, "$this$set"    # [Landroidx/compose/ui/input/pointer/util/DataPointAtTime;
    .param p1, "index"    # I
    .param p2, "time"    # J
    .param p4, "dataPoint"    # F

    .line 338
    aget-object v0, p0, p1

    .line 339
    .local v0, "currentEntry":Landroidx/compose/ui/input/pointer/util/DataPointAtTime;
    if-nez v0, :cond_0

    .line 340
    new-instance v1, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;

    invoke-direct {v1, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;-><init>(JF)V

    aput-object v1, p0, p1

    goto :goto_0

    .line 342
    :cond_0
    invoke-virtual {v0, p2, p3}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;->setTime(J)V

    .line 343
    invoke-virtual {v0, p4}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;->setDataPoint(F)V

    .line 345
    :goto_0
    return-void
.end method

.method private static final set([[FIIF)V
    .locals 2
    .param p0, "$this$set"    # [[F
    .param p1, "row"    # I
    .param p2, "col"    # I
    .param p3, "value"    # F

    const/4 v0, 0x0

    .line 669
    .local v0, "$i$f$set":I
    aget-object v1, p0, p1

    aput p3, v1, p2

    .line 670
    return-void
.end method

.method public static final setVelocityTrackerAddPointsFix(Z)V
    .locals 0
    .param p0, "<set-?>"    # Z

    .line 685
    sput-boolean p0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix:Z

    return-void
.end method

.method public static final setVelocityTrackerStrategyUseImpulse(Z)V
    .locals 0
    .param p0, "<set-?>"    # Z

    .line 698
    sput-boolean p0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerStrategyUseImpulse:Z

    return-void
.end method
