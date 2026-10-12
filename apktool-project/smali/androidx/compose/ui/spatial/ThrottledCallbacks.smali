.class public final Landroidx/compose/ui/spatial/ThrottledCallbacks;
.super Ljava/lang/Object;
.source "ThrottledCallbacks.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n405#1,6:495\n395#1:501\n396#1,6:518\n402#1:531\n387#1,3:532\n390#1,3:540\n395#1:543\n396#1,6:560\n402#1:573\n387#1,6:574\n397#2,3:502\n354#2,6:505\n364#2,3:512\n367#2,2:516\n370#2,6:524\n400#2:530\n397#2,3:544\n354#2,6:547\n364#2,3:554\n367#2,2:558\n370#2,6:566\n400#2:572\n397#2,3:580\n354#2,6:583\n364#2,3:590\n367#2,9:594\n400#2:603\n1399#3:511\n1270#3:515\n1399#3:553\n1270#3:557\n1399#3:589\n1270#3:593\n54#4:535\n59#4:537\n85#5:536\n90#5:538\n787#6:539\n679#7:604\n1#8:605\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n*L\n172#1:495,6\n182#1:501\n182#1:518,6\n182#1:531\n198#1:532,3\n198#1:540,3\n227#1:543\n227#1:560,6\n227#1:573\n238#1:574,6\n182#1:502,3\n182#1:505,6\n182#1:512,3\n182#1:516,2\n182#1:524,6\n182#1:530\n227#1:544,3\n227#1:547,6\n227#1:554,3\n227#1:558,2\n227#1:566,6\n227#1:572\n395#1:580,3\n395#1:583,6\n395#1:590,3\n395#1:594,9\n395#1:603\n182#1:511\n182#1:515\n227#1:553\n227#1:557\n395#1:589\n395#1:593\n206#1:535\n206#1:537\n206#1:536\n206#1:538\n206#1:539\n413#1:604\n413#1:605\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0000\u0018\u00002\u00020\u0001:\u0001RB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u0000H\u0002JH\u0010%\u001a\u00020\n2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)J@\u0010*\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,J\u000e\u0010-\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010.\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ&\u0010/\u001a\u00020#2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nJ,\u00104\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J:\u00105\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020#0<J:\u0010>\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020#0<J\u0014\u0010?\u001a\u00020@2\n\u0010$\u001a\u00060\u0004R\u00020\u0000H\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\nH\u0002J\u000e\u0010C\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ*\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\u0008\u0010G\u001a\u0004\u0018\u00010\u0019\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008H\u0010IJ)\u0010J\u001a\u00020#*\u00060\u0004R\u00020\u00002\u0016\u0010K\u001a\u0012\u0012\u0008\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\u0008J/\u0010L\u001a\u00020#*\u000c\u0012\u0008\u0012\u00060\u0004R\u00020\u00000\u00102\u0016\u0010K\u001a\u0012\u0012\u0008\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\u0008J.\u0010M\u001a\u00060\u0004R\u00020\u0000*\u000c\u0012\u0008\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u0010N\u001a\u0002012\n\u0010O\u001a\u00060\u0004R\u00020\u0000H\u0002J*\u0010P\u001a\u00020@*\u000c\u0012\u0008\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u0010N\u001a\u0002012\n\u0010O\u001a\u00060\u0004R\u00020\u0000H\u0002J7\u0010Q\u001a\u00020#*\u000c\u0012\u0008\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u00100\u001a\u0002012\u0016\u0010K\u001a\u0012\u0012\u0008\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\u0008R \u0010\u0003\u001a\u0008\u0018\u00010\u0004R\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001b\u0010\u000f\u001a\u000c\u0012\u0008\u0012\u00060\u0004R\u00020\u00000\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u000c\"\u0004\u0008\u0016\u0010\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u0014X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\u0008 \u0010\u000c\"\u0004\u0008!\u0010\u000e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006S"
    }
    d2 = {
        "Landroidx/compose/ui/spatial/ThrottledCallbacks;",
        "",
        "()V",
        "globalChangeEntries",
        "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
        "getGlobalChangeEntries",
        "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
        "setGlobalChangeEntries",
        "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V",
        "minDebounceDeadline",
        "",
        "getMinDebounceDeadline",
        "()J",
        "setMinDebounceDeadline",
        "(J)V",
        "rectChangedMap",
        "Landroidx/collection/MutableIntObjectMap;",
        "getRectChangedMap",
        "()Landroidx/collection/MutableIntObjectMap;",
        "screenOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "getScreenOffset-nOcc-ac",
        "setScreenOffset--gyyYBs",
        "J",
        "viewToWindowMatrix",
        "Landroidx/compose/ui/graphics/Matrix;",
        "getViewToWindowMatrix-3i98HWw",
        "()[F",
        "setViewToWindowMatrix-Q8lPUPs",
        "([F)V",
        "[F",
        "windowOffset",
        "getWindowOffset-nOcc-ac",
        "setWindowOffset--gyyYBs",
        "addToGlobalEntries",
        "",
        "entry",
        "debounceEntry",
        "currentMillis",
        "minDeadline",
        "debounceEntry-b8qMvQI",
        "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J",
        "fire",
        "fire-WY9HvpM",
        "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V",
        "fireGlobalChangeEntries",
        "fireOnRectChangedEntries",
        "fireOnUpdatedRect",
        "id",
        "",
        "topLeft",
        "bottomRight",
        "fireWithUpdatedRect",
        "registerOnGlobalChange",
        "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;",
        "throttleMillis",
        "debounceMillis",
        "node",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "callback",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
        "registerOnRectChanged",
        "removeFromGlobalEntries",
        "",
        "roundDownToMultipleOf8",
        "x",
        "triggerDebounced",
        "updateOffsets",
        "screen",
        "window",
        "matrix",
        "updateOffsets-bT0EZQs",
        "(JJ[F)Z",
        "linkedForEach",
        "block",
        "multiForEach",
        "multiPut",
        "key",
        "value",
        "multiRemove",
        "runFor",
        "Entry",
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
.field private globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

.field private minDebounceDeadline:J

.field private final rectChangedMap:Landroidx/collection/MutableIntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private screenOffset:J

.field private viewToWindowMatrix:[F

.field private windowOffset:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->mutableIntObjectMapOf()Landroidx/collection/MutableIntObjectMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 95
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 96
    sget-object v0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 97
    sget-object v0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 32
    return-void
.end method

.method public static final synthetic access$multiRemove(Landroidx/compose/ui/spatial/ThrottledCallbacks;Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .param p1, "$receiver"    # Landroidx/collection/MutableIntObjectMap;
    .param p2, "key"    # I
    .param p3, "value"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->multiRemove(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$removeFromGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks;Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .param p1, "entry"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 32
    invoke-direct {p0, p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->removeFromGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z

    move-result v0

    return v0
.end method

.method private final addToGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V
    .locals 1
    .param p1, "entry"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 354
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 355
    .local v0, "oldInitialEntry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    invoke-virtual {p1, v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 356
    iput-object p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 357
    return-void
.end method

.method private final debounceEntry-b8qMvQI(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J
    .locals 14
    .param p1, "entry"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .param p2, "windowOffset"    # J
    .param p4, "screenOffset"    # J
    .param p6, "viewToWindowMatrix"    # [F
    .param p7, "currentMillis"    # J
    .param p9, "minDeadline"    # J

    .line 336
    move-wide/from16 v10, p7

    move-wide/from16 v12, p9

    .line 337
    .local v12, "newMinDeadline":J
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastUninvokedFireMillis()J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    .line 338
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastUninvokedFireMillis()J

    move-result-wide v1

    sub-long v1, v10, v1

    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    .line 339
    invoke-virtual {p1, v10, v11}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastInvokeMillis(J)V

    .line 340
    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 341
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getTopLeft()J

    move-result-wide v1

    .line 342
    .local v1, "topLeft":J
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getBottomRight()J

    move-result-wide v3

    .line 343
    .local v3, "bottomRight":J
    move-object v0, p1

    move-wide/from16 v5, p2

    move-wide/from16 v7, p4

    move-object/from16 v9, p6

    invoke-virtual/range {v0 .. v9}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->fire-9b-9wPM(JJJJ[F)V

    .end local v1    # "topLeft":J
    .end local v3    # "bottomRight":J
    goto :goto_0

    .line 346
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastUninvokedFireMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 345
    move-wide v12, v0

    .line 349
    :cond_1
    :goto_0
    return-wide v12
.end method

.method private final fire-WY9HvpM(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V
    .locals 19
    .param p1, "entry"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .param p2, "windowOffset"    # J
    .param p4, "screenOffset"    # J
    .param p6, "viewToWindowMatrix"    # [F
    .param p7, "currentMillis"    # J

    .line 304
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v11, p7

    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastInvokeMillis()J

    move-result-wide v13

    .line 305
    .local v13, "lastInvokeMillis":J
    sub-long v2, v11, v13

    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getThrottleMillis()J

    move-result-wide v4

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    move v15, v2

    .line 306
    .local v15, "throttleOkay":Z
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    move-result-wide v5

    const-wide/16 v16, 0x0

    cmp-long v2, v5, v16

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    move/from16 v18, v3

    .line 307
    .local v18, "debounceOkay":Z
    invoke-virtual {v1, v11, v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 308
    if-eqz v15, :cond_2

    if-eqz v18, :cond_2

    .line 309
    invoke-virtual {v1, v11, v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastInvokeMillis(J)V

    .line 310
    nop

    .line 311
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getTopLeft()J

    move-result-wide v2

    .line 312
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getBottomRight()J

    move-result-wide v4

    .line 313
    nop

    .line 314
    nop

    .line 315
    nop

    .line 310
    move-wide/from16 v6, p2

    move-wide/from16 v8, p4

    move-object/from16 v10, p6

    invoke-virtual/range {v1 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->fire-9b-9wPM(JJJJ[F)V

    .line 318
    :cond_2
    if-nez v18, :cond_3

    .line 319
    iget-wide v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 320
    .local v1, "currentMinDeadline":J
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    move-result-wide v3

    add-long/2addr v3, v11

    .line 321
    .local v3, "thisDeadline":J
    cmp-long v5, v1, v16

    if-lez v5, :cond_3

    cmp-long v5, v3, v1

    if-gez v5, :cond_3

    .line 322
    iput-wide v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 325
    .end local v1    # "currentMinDeadline":J
    .end local v3    # "thisDeadline":J
    :cond_3
    return-void
.end method

.method private final fireWithUpdatedRect(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V
    .locals 23
    .param p1, "entry"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .param p2, "topLeft"    # J
    .param p4, "bottomRight"    # J
    .param p6, "currentMillis"    # J

    .line 258
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v11, p6

    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastInvokeMillis()J

    move-result-wide v13

    .line 259
    .local v13, "lastInvokeMillis":J
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getThrottleMillis()J

    move-result-wide v15

    .line 260
    .local v15, "throttleMillis":J
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    move-result-wide v17

    .line 261
    .local v17, "debounceMillis":J
    sub-long v2, v11, v13

    cmp-long v2, v2, v15

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    move/from16 v19, v2

    .line 262
    .local v19, "pastThrottleDeadline":Z
    const-wide/16 v5, 0x0

    cmp-long v2, v17, v5

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    move/from16 v20, v2

    .line 263
    .local v20, "zeroDebounce":Z
    cmp-long v2, v15, v5

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    move/from16 v21, v2

    .line 265
    .local v21, "zeroThrottle":Z
    invoke-virtual/range {p1 .. p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setTopLeft(J)V

    .line 266
    move-wide/from16 v7, p4

    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setBottomRight(J)V

    .line 281
    if-nez v20, :cond_3

    if-eqz v21, :cond_4

    :cond_3
    if-eqz v20, :cond_5

    :cond_4
    goto :goto_3

    :cond_5
    move v3, v4

    :goto_3
    move/from16 v22, v3

    .line 283
    .local v22, "canInvoke":Z
    if-eqz v19, :cond_6

    if-eqz v22, :cond_6

    .line 284
    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 285
    invoke-virtual {v1, v11, v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastInvokeMillis(J)V

    .line 286
    iget-wide v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    iget-wide v8, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    iget-object v10, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    invoke-virtual/range {v1 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->fire-9b-9wPM(JJJJ[F)V

    goto :goto_4

    .line 287
    :cond_6
    if-nez v20, :cond_7

    .line 288
    invoke-virtual {v1, v11, v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 289
    iget-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 290
    .local v2, "currentMinDeadline":J
    add-long v7, v11, v17

    .line 291
    .local v7, "thisDeadline":J
    cmp-long v4, v2, v5

    if-lez v4, :cond_7

    cmp-long v4, v7, v2

    if-gez v4, :cond_7

    .line 292
    iput-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 295
    .end local v2    # "currentMinDeadline":J
    .end local v7    # "thisDeadline":J
    :cond_7
    :goto_4
    return-void
.end method

.method private final linkedForEach(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1, "$this$linkedForEach"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 387
    .local v0, "$i$f$linkedForEach":I
    move-object v1, p1

    .line 388
    .local v1, "node":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_0
    if-eqz v1, :cond_0

    .line 389
    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v1

    goto :goto_0

    .line 392
    :cond_0
    return-void
.end method

.method private final multiForEach(Landroidx/collection/MutableIntObjectMap;Lkotlin/jvm/functions/Function1;)V
    .locals 21
    .param p1, "$this$multiForEach"    # Landroidx/collection/MutableIntObjectMap;
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 395
    .local v0, "$i$f$multiForEach":I
    move-object/from16 v1, p1

    check-cast v1, Landroidx/collection/IntObjectMap;

    .local v1, "this_$iv":Landroidx/collection/IntObjectMap;
    const/4 v2, 0x0

    .line 580
    .local v2, "$i$f$forEachValue":I
    iget-object v3, v1, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 582
    .local v3, "v$iv":[Ljava/lang/Object;
    move-object v4, v1

    .local v4, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    const/4 v5, 0x0

    .line 583
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 584
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 586
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_5

    .line 587
    :goto_0
    aget-wide v9, v6, v8

    .line 588
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 589
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 588
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_4

    .line 590
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 591
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_3

    .line 592
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 593
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 592
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_2

    .line 594
    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    .line 595
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 582
    .local v16, "$i$a$-forEachIndexed-IntObjectMap$forEachValue$1$iv":I
    aget-object v17, v3, v15

    check-cast v17, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .local v17, "it":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/16 v18, 0x0

    .line 396
    .local v18, "$i$a$-forEachValue-ThrottledCallbacks$multiForEach$1":I
    move-object/from16 v19, v17

    move/from16 v20, v12

    move-object/from16 v12, v19

    .line 397
    .local v12, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_3
    if-eqz v12, :cond_1

    .line 398
    move/from16 v19, v0

    move-object/from16 v0, p2

    .end local v0    # "$i$f$multiForEach":I
    .local v19, "$i$f$multiForEach":I
    invoke-interface {v0, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v12

    move/from16 v0, v19

    goto :goto_3

    .line 401
    .end local v19    # "$i$f$multiForEach":I
    .restart local v0    # "$i$f$multiForEach":I
    :cond_1
    move/from16 v19, v0

    move-object/from16 v0, p2

    .line 582
    .end local v0    # "$i$f$multiForEach":I
    .end local v12    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v17    # "it":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v18    # "$i$a$-forEachValue-ThrottledCallbacks$multiForEach$1":I
    .restart local v19    # "$i$f$multiForEach":I
    nop

    .line 595
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-IntObjectMap$forEachValue$1$iv":I
    goto :goto_4

    .line 592
    .end local v14    # "index$iv$iv":I
    .end local v19    # "$i$f$multiForEach":I
    .restart local v0    # "$i$f$multiForEach":I
    :cond_2
    move/from16 v19, v0

    move/from16 v20, v12

    move-object/from16 v0, p2

    .line 597
    .end local v0    # "$i$f$multiForEach":I
    .restart local v19    # "$i$f$multiForEach":I
    :goto_4
    shr-long v9, v9, v20

    .line 591
    add-int/lit8 v13, v13, 0x1

    move/from16 v0, v19

    move/from16 v12, v20

    goto :goto_1

    .end local v19    # "$i$f$multiForEach":I
    .restart local v0    # "$i$f$multiForEach":I
    :cond_3
    move/from16 v19, v0

    move/from16 v20, v12

    move-object/from16 v0, p2

    .line 599
    .end local v0    # "$i$f$multiForEach":I
    .end local v13    # "j$iv$iv":I
    .restart local v19    # "$i$f$multiForEach":I
    if-ne v11, v12, :cond_7

    goto :goto_5

    .line 588
    .end local v11    # "bitCount$iv$iv":I
    .end local v19    # "$i$f$multiForEach":I
    .restart local v0    # "$i$f$multiForEach":I
    :cond_4
    move/from16 v19, v0

    move-object/from16 v0, p2

    .line 586
    .end local v0    # "$i$f$multiForEach":I
    .end local v9    # "slot$iv$iv":J
    .restart local v19    # "$i$f$multiForEach":I
    :goto_5
    if-eq v8, v7, :cond_6

    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v19

    goto :goto_0

    .end local v19    # "$i$f$multiForEach":I
    .restart local v0    # "$i$f$multiForEach":I
    :cond_5
    move/from16 v19, v0

    move-object/from16 v0, p2

    .line 602
    .end local v0    # "$i$f$multiForEach":I
    .end local v8    # "i$iv$iv":I
    .restart local v19    # "$i$f$multiForEach":I
    :cond_6
    nop

    .line 603
    .end local v4    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 402
    .end local v1    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v3    # "v$iv":[Ljava/lang/Object;
    return-void
.end method

.method private final multiPut(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .locals 4
    .param p1, "$this$multiPut"    # Landroidx/collection/MutableIntObjectMap;
    .param p2, "key"    # I
    .param p3, "value"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;I",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ")",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;"
        }
    .end annotation

    .line 413
    move-object v0, p1

    .local v0, "this_$iv":Landroidx/collection/MutableIntObjectMap;
    const/4 v1, 0x0

    .line 604
    .local v1, "$i$f$getOrPut":I
    invoke-virtual {v0, p2}, Landroidx/collection/MutableIntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 413
    .local v2, "$i$a$-getOrPut-ThrottledCallbacks$multiPut$entry$1":I
    nop

    .line 604
    .end local v2    # "$i$a$-getOrPut-ThrottledCallbacks$multiPut$entry$1":I
    move-object v2, p3

    .line 605
    .local v2, "it$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 604
    .local v3, "$i$a$-also-MutableIntObjectMap$getOrPut$1$iv":I
    invoke-virtual {v0, p2, v2}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 413
    .end local v0    # "this_$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v1    # "$i$f$getOrPut":I
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-also-MutableIntObjectMap$getOrPut$1$iv":I
    :cond_0
    move-object v0, v2

    check-cast v0, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 414
    .local v0, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    if-eq v0, p3, :cond_2

    .line 415
    :goto_0
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 416
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_0

    .line 418
    :cond_1
    invoke-virtual {v0, p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 420
    :cond_2
    return-object p3
.end method

.method private final multiRemove(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 6
    .param p1, "$this$multiRemove"    # Landroidx/collection/MutableIntObjectMap;
    .param p2, "key"    # I
    .param p3, "value"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;I",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ")Z"
        }
    .end annotation

    .line 424
    invoke-virtual {p1, p2}, Landroidx/collection/MutableIntObjectMap;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 425
    .local v0, "result":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    .line 426
    :cond_0
    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    .line 427
    invoke-virtual {p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v1

    .line 428
    .local v1, "next":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    invoke-virtual {p3, v4}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 429
    if-eqz v1, :cond_1

    .line 430
    invoke-virtual {p1, p2, v1}, Landroidx/collection/MutableIntObjectMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 432
    :cond_1
    move v1, v3

    .end local v1    # "next":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    goto :goto_2

    .line 435
    :cond_2
    invoke-virtual {p1, p2, v0}, Landroidx/collection/MutableIntObjectMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 436
    move-object v2, v0

    .line 437
    .local v2, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_0
    if-eqz v2, :cond_5

    .line 438
    invoke-virtual {v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v5

    if-nez v5, :cond_3

    return v1

    .line 439
    .local v5, "next":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :cond_3
    if-ne v5, p3, :cond_4

    .line 440
    invoke-virtual {p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 441
    invoke-virtual {p3, v4}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 442
    goto :goto_1

    .line 444
    :cond_4
    invoke-virtual {v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v2

    .end local v5    # "next":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    goto :goto_0

    .line 446
    :cond_5
    :goto_1
    move v1, v3

    .line 424
    .end local v0    # "result":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v2    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_2
    return v1
.end method

.method private final removeFromGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 6
    .param p1, "entry"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 365
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 366
    .local v0, "initialGlobalEntry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, p1, :cond_0

    .line 367
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 368
    invoke-virtual {p1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 369
    return v1

    .line 371
    :cond_0
    move-object v3, v0

    .line 372
    .local v3, "last":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v2

    .line 373
    .local v4, "node":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_0
    if-eqz v4, :cond_4

    .line 374
    if-ne v4, p1, :cond_3

    .line 375
    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 376
    :goto_1
    invoke-virtual {p1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 377
    return v1

    .line 379
    :cond_3
    move-object v3, v4

    .line 380
    invoke-virtual {v4}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v4

    goto :goto_0

    .line 382
    :cond_4
    const/4 v1, 0x0

    return v1
.end method

.method private final roundDownToMultipleOf8(J)J
    .locals 3
    .param p1, "x"    # J

    .line 118
    const/4 v0, 0x3

    shr-long v1, p1, v0

    shl-long v0, v1, v0

    return-wide v0
.end method

.method private final runFor(Landroidx/collection/MutableIntObjectMap;ILkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1, "$this$runFor"    # Landroidx/collection/MutableIntObjectMap;
    .param p2, "id"    # I
    .param p3, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 405
    .local v0, "$i$f$runFor":I
    invoke-virtual {p1, p2}, Landroidx/collection/MutableIntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 406
    .local v1, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_0
    if-eqz v1, :cond_0

    .line 407
    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v1

    goto :goto_0

    .line 410
    :cond_0
    return-void
.end method


# virtual methods
.method public final fireGlobalChangeEntries(J)V
    .locals 28
    .param p1, "currentMillis"    # J

    .line 195
    move-object/from16 v0, p0

    iget-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 196
    .local v2, "windowOffset":J
    iget-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 197
    .local v4, "screenOffset":J
    iget-object v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 198
    .local v6, "viewToWindowMatrix":[F
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    if-eqz v1, :cond_1

    .local v1, "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    move-object/from16 v9, p0

    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    move-object v10, v1

    .end local v1    # "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .local v10, "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v11, 0x0

    .line 532
    .local v11, "$i$f$linkedForEach":I
    move-object v12, v1

    .line 533
    .local v12, "node$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_0
    if-eqz v12, :cond_0

    .line 534
    move-object v1, v12

    .local v1, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v13, 0x0

    .line 199
    .local v13, "$i$a$-linkedForEach-ThrottledCallbacks$fireGlobalChangeEntries$1":I
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNode()Landroidx/compose/ui/node/DelegatableNode;

    move-result-object v7

    invoke-static {v7}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v14

    .line 200
    .local v14, "node":Landroidx/compose/ui/node/LayoutNode;
    invoke-virtual {v14}, Landroidx/compose/ui/node/LayoutNode;->getOffsetFromRoot-nOcc-ac$ui_release()J

    move-result-wide v7

    .line 201
    .local v7, "offsetFromRoot":J
    invoke-virtual {v14}, Landroidx/compose/ui/node/LayoutNode;->getLastSize-YbymL2g$ui_release()J

    move-result-wide v15

    .line 204
    .local v15, "lastSize":J
    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setTopLeft(J)V

    .line 205
    nop

    .line 206
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v17

    const/16 v18, 0x0

    .line 535
    .local v18, "$i$f$getWidth-impl":I
    move-wide/from16 v19, v15

    .local v19, "value$iv$iv":J
    const/16 v21, 0x0

    .line 536
    .local v21, "$i$f$unpackInt1":I
    const/16 v22, 0x20

    move-wide/from16 v23, v2

    .end local v2    # "windowOffset":J
    .local v23, "windowOffset":J
    shr-long v2, v19, v22

    long-to-int v2, v2

    .line 535
    .end local v19    # "value$iv$iv":J
    .end local v21    # "$i$f$unpackInt1":I
    nop

    .line 206
    .end local v18    # "$i$f$getWidth-impl":I
    add-int v17, v17, v2

    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    const/4 v3, 0x0

    .line 537
    .local v3, "$i$f$getHeight-impl":I
    move-wide/from16 v18, v15

    .local v18, "value$iv$iv":J
    const/16 v20, 0x0

    .line 538
    .local v20, "$i$f$unpackInt2":I
    const-wide v25, 0xffffffffL

    move/from16 v21, v2

    move/from16 v27, v3

    .end local v3    # "$i$f$getHeight-impl":I
    .local v27, "$i$f$getHeight-impl":I
    and-long v2, v18, v25

    long-to-int v2, v2

    .line 537
    .end local v18    # "value$iv$iv":J
    .end local v20    # "$i$f$unpackInt2":I
    nop

    .line 206
    .end local v27    # "$i$f$getHeight-impl":I
    add-int v2, v21, v2

    .local v2, "y$iv":I
    move/from16 v3, v17

    .local v3, "x$iv":I
    const/16 v17, 0x0

    .line 539
    .local v17, "$i$f$packXY":I
    move-wide/from16 v18, v4

    .end local v4    # "screenOffset":J
    .local v18, "screenOffset":J
    int-to-long v4, v3

    shl-long v4, v4, v22

    move/from16 v20, v3

    move-wide/from16 v21, v4

    .end local v3    # "x$iv":I
    .local v20, "x$iv":I
    int-to-long v3, v2

    and-long v3, v3, v25

    or-long v2, v21, v3

    .line 205
    .end local v2    # "y$iv":I
    .end local v17    # "$i$f$packXY":I
    .end local v20    # "x$iv":I
    invoke-virtual {v1, v2, v3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setBottomRight(J)V

    .line 208
    nop

    .line 209
    nop

    .line 210
    nop

    .line 211
    nop

    .line 212
    nop

    .line 213
    nop

    .line 208
    move-wide/from16 v4, v18

    move-wide/from16 v2, v23

    move-wide/from16 v17, v7

    move-wide/from16 v7, p1

    .end local v7    # "offsetFromRoot":J
    .end local v18    # "screenOffset":J
    .end local v23    # "windowOffset":J
    .local v2, "windowOffset":J
    .restart local v4    # "screenOffset":J
    .local v17, "offsetFromRoot":J
    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fire-WY9HvpM(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V

    .line 215
    nop

    .line 534
    .end local v1    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v13    # "$i$a$-linkedForEach-ThrottledCallbacks$fireGlobalChangeEntries$1":I
    .end local v14    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v15    # "lastSize":J
    .end local v17    # "offsetFromRoot":J
    nop

    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v12

    move-object/from16 v0, p0

    goto :goto_0

    .line 542
    :cond_0
    nop

    .line 216
    .end local v9    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v10    # "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v11    # "$i$f$linkedForEach":I
    .end local v12    # "node$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :cond_1
    return-void
.end method

.method public final fireOnRectChangedEntries(J)V
    .locals 32
    .param p1, "currentMillis"    # J

    .line 179
    move-object/from16 v0, p0

    iget-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 180
    .local v2, "windowOffset":J
    iget-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 181
    .local v4, "screenOffset":J
    iget-object v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 182
    .local v6, "viewToWindowMatrix":[F
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .local v1, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    move-object/from16 v9, p0

    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    move-object v10, v1

    .end local v1    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v10, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    const/4 v11, 0x0

    .line 501
    .local v11, "$i$f$multiForEach":I
    move-object v12, v10

    check-cast v12, Landroidx/collection/IntObjectMap;

    .local v12, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    const/4 v13, 0x0

    .line 502
    .local v13, "$i$f$forEachValue":I
    iget-object v14, v12, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 504
    .local v14, "v$iv$iv":[Ljava/lang/Object;
    move-object v15, v12

    .local v15, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    const/16 v16, 0x0

    .line 505
    .local v16, "$i$f$forEachIndexed":I
    iget-object v1, v15, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 506
    .local v1, "m$iv$iv$iv":[J
    array-length v7, v1

    add-int/lit8 v7, v7, -0x2

    .line 508
    .local v7, "lastIndex$iv$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv$iv":I
    if-gt v8, v7, :cond_5

    .line 509
    :goto_0
    aget-wide v17, v1, v8

    .line 510
    .local v17, "slot$iv$iv$iv":J
    move-wide/from16 v19, v17

    .local v19, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v21, 0x0

    .line 511
    .local v21, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v22, v1

    move-wide/from16 v0, v19

    move-wide/from16 v19, v2

    .end local v1    # "m$iv$iv$iv":[J
    .end local v2    # "windowOffset":J
    .local v0, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v19, "windowOffset":J
    .local v22, "m$iv$iv$iv":[J
    not-long v2, v0

    const/16 v23, 0x7

    shl-long v2, v2, v23

    and-long/2addr v2, v0

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v2, v23

    .line 510
    .end local v0    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v21    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v23

    if-eqz v0, :cond_4

    .line 512
    sub-int v0, v8, v7

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 513
    .local v0, "bitCount$iv$iv$iv":I
    const/4 v2, 0x0

    .local v2, "j$iv$iv$iv":I
    :goto_1
    if-ge v2, v0, :cond_3

    .line 514
    const-wide/16 v23, 0xff

    and-long v23, v17, v23

    .local v23, "value$iv$iv$iv$iv":J
    const/4 v3, 0x0

    .line 515
    .local v3, "$i$f$isFull":I
    const-wide/16 v25, 0x80

    cmp-long v21, v23, v25

    if-gez v21, :cond_0

    const/16 v21, 0x1

    goto :goto_2

    :cond_0
    const/16 v21, 0x0

    .line 514
    .end local v3    # "$i$f$isFull":I
    .end local v23    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v21, :cond_2

    .line 516
    shl-int/lit8 v3, v8, 0x3

    add-int v21, v3, v2

    .line 517
    .local v21, "index$iv$iv$iv":I
    move/from16 v23, v21

    .local v23, "index$iv$iv":I
    const/16 v24, 0x0

    .line 504
    .local v24, "$i$a$-forEachIndexed-IntObjectMap$forEachValue$1$iv$iv":I
    aget-object v3, v14, v23

    move-object/from16 v25, v3

    check-cast v25, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .local v25, "it$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/16 v26, 0x0

    .line 518
    .local v26, "$i$a$-forEachValue-ThrottledCallbacks$multiForEach$1$iv":I
    move-object/from16 v3, v25

    move-object/from16 v27, v3

    .line 519
    .local v27, "entry$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_3
    if-eqz v27, :cond_1

    .line 520
    move v3, v1

    move-object/from16 v1, v27

    .local v1, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/16 v28, 0x0

    .line 183
    .local v28, "$i$a$-multiForEach-ThrottledCallbacks$fireOnRectChangedEntries$1":I
    nop

    .line 184
    nop

    .line 185
    nop

    .line 186
    nop

    .line 187
    nop

    .line 188
    nop

    .line 183
    move/from16 v30, v2

    move/from16 v29, v11

    move-object/from16 v31, v12

    move v11, v0

    move v12, v3

    move-wide/from16 v2, v19

    move-object/from16 v0, p0

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move v9, v7

    move v10, v8

    move-wide/from16 v7, p1

    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v8    # "i$iv$iv$iv":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v2, "windowOffset":J
    .local v9, "lastIndex$iv$iv$iv":I
    .local v10, "i$iv$iv$iv":I
    .local v11, "bitCount$iv$iv$iv":I
    .local v19, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v20, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v29, "$i$f$multiForEach":I
    .local v30, "j$iv$iv$iv":I
    .local v31, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fire-WY9HvpM(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V

    .line 190
    nop

    .line 520
    .end local v1    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v28    # "$i$a$-multiForEach-ThrottledCallbacks$fireOnRectChangedEntries$1":I
    nop

    .line 521
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v27

    move v7, v9

    move v8, v10

    move v0, v11

    move v1, v12

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    move/from16 v11, v29

    move-object/from16 v12, v31

    move-wide/from16 v19, v2

    move/from16 v2, v30

    goto :goto_3

    .line 523
    .end local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v29    # "$i$f$multiForEach":I
    .end local v30    # "j$iv$iv$iv":I
    .end local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v0    # "bitCount$iv$iv$iv":I
    .local v2, "j$iv$iv$iv":I
    .restart local v7    # "lastIndex$iv$iv$iv":I
    .restart local v8    # "i$iv$iv$iv":I
    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v10, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v11, "$i$f$multiForEach":I
    .restart local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v19, "windowOffset":J
    :cond_1
    move/from16 v30, v2

    move/from16 v29, v11

    move-object/from16 v31, v12

    move-wide/from16 v2, v19

    move v11, v0

    move v12, v1

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move v9, v7

    move v10, v8

    .line 504
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v8    # "i$iv$iv$iv":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v25    # "it$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v26    # "$i$a$-forEachValue-ThrottledCallbacks$multiForEach$1$iv":I
    .end local v27    # "entry$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .local v2, "windowOffset":J
    .local v9, "lastIndex$iv$iv$iv":I
    .local v10, "i$iv$iv$iv":I
    .local v11, "bitCount$iv$iv$iv":I
    .local v19, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .restart local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v29    # "$i$f$multiForEach":I
    .restart local v30    # "j$iv$iv$iv":I
    .restart local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    nop

    .line 517
    .end local v23    # "index$iv$iv":I
    .end local v24    # "$i$a$-forEachIndexed-IntObjectMap$forEachValue$1$iv$iv":I
    goto :goto_4

    .line 514
    .end local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v21    # "index$iv$iv$iv":I
    .end local v29    # "$i$f$multiForEach":I
    .end local v30    # "j$iv$iv$iv":I
    .end local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v0    # "bitCount$iv$iv$iv":I
    .local v2, "j$iv$iv$iv":I
    .restart local v7    # "lastIndex$iv$iv$iv":I
    .restart local v8    # "i$iv$iv$iv":I
    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v10, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v11, "$i$f$multiForEach":I
    .restart local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v19, "windowOffset":J
    :cond_2
    move/from16 v30, v2

    move/from16 v29, v11

    move-object/from16 v31, v12

    move-wide/from16 v2, v19

    move v11, v0

    move v12, v1

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move v9, v7

    move v10, v8

    .line 524
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v8    # "i$iv$iv$iv":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v2, "windowOffset":J
    .local v9, "lastIndex$iv$iv$iv":I
    .local v10, "i$iv$iv$iv":I
    .local v11, "bitCount$iv$iv$iv":I
    .local v19, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .restart local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v29    # "$i$f$multiForEach":I
    .restart local v30    # "j$iv$iv$iv":I
    .restart local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :goto_4
    shr-long v17, v17, v12

    .line 513
    add-int/lit8 v0, v30, 0x1

    move v7, v9

    move v8, v10

    move v1, v12

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    move-object/from16 v12, v31

    move-wide/from16 v19, v2

    move v2, v0

    move v0, v11

    move/from16 v11, v29

    .end local v30    # "j$iv$iv$iv":I
    .local v0, "j$iv$iv$iv":I
    goto/16 :goto_1

    .end local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v29    # "$i$f$multiForEach":I
    .end local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v0, "bitCount$iv$iv$iv":I
    .local v2, "j$iv$iv$iv":I
    .restart local v7    # "lastIndex$iv$iv$iv":I
    .restart local v8    # "i$iv$iv$iv":I
    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v10, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v11, "$i$f$multiForEach":I
    .restart local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v19, "windowOffset":J
    :cond_3
    move/from16 v30, v2

    move/from16 v29, v11

    move-object/from16 v31, v12

    move-wide/from16 v2, v19

    move v11, v0

    move v12, v1

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move v9, v7

    move v10, v8

    .line 526
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v8    # "i$iv$iv$iv":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v2, "windowOffset":J
    .local v9, "lastIndex$iv$iv$iv":I
    .local v10, "i$iv$iv$iv":I
    .local v11, "bitCount$iv$iv$iv":I
    .local v19, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .restart local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v29    # "$i$f$multiForEach":I
    .restart local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    if-ne v11, v12, :cond_7

    goto :goto_5

    .line 510
    .end local v2    # "windowOffset":J
    .end local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v29    # "$i$f$multiForEach":I
    .end local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v7    # "lastIndex$iv$iv$iv":I
    .restart local v8    # "i$iv$iv$iv":I
    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v10, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v11, "$i$f$multiForEach":I
    .restart local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v19, "windowOffset":J
    :cond_4
    move/from16 v29, v11

    move-object/from16 v31, v12

    move-wide/from16 v2, v19

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move v9, v7

    move v10, v8

    .line 508
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v8    # "i$iv$iv$iv":I
    .end local v11    # "$i$f$multiForEach":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v17    # "slot$iv$iv$iv":J
    .restart local v2    # "windowOffset":J
    .local v9, "lastIndex$iv$iv$iv":I
    .local v10, "i$iv$iv$iv":I
    .local v19, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .restart local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v29    # "$i$f$multiForEach":I
    .restart local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :goto_5
    if-eq v10, v9, :cond_6

    add-int/lit8 v8, v10, 0x1

    move-object/from16 v0, p0

    move v7, v9

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    move-object/from16 v1, v22

    move/from16 v11, v29

    move-object/from16 v12, v31

    .end local v10    # "i$iv$iv$iv":I
    .restart local v8    # "i$iv$iv$iv":I
    goto/16 :goto_0

    .end local v19    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v22    # "m$iv$iv$iv":[J
    .end local v29    # "$i$f$multiForEach":I
    .end local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v1, "m$iv$iv$iv":[J
    .restart local v7    # "lastIndex$iv$iv$iv":I
    .local v9, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v10, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v11    # "$i$f$multiForEach":I
    .restart local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_5
    move-object/from16 v22, v1

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move/from16 v29, v11

    move-object/from16 v31, v12

    move v9, v7

    .line 529
    .end local v1    # "m$iv$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv$iv":I
    .end local v8    # "i$iv$iv$iv":I
    .end local v10    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v11    # "$i$f$multiForEach":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v9, "lastIndex$iv$iv$iv":I
    .restart local v19    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .restart local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v22    # "m$iv$iv$iv":[J
    .restart local v29    # "$i$f$multiForEach":I
    .restart local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_6
    nop

    .line 530
    .end local v9    # "lastIndex$iv$iv$iv":I
    .end local v15    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v16    # "$i$f$forEachIndexed":I
    .end local v22    # "m$iv$iv$iv":[J
    :cond_7
    nop

    .line 531
    .end local v13    # "$i$f$forEachValue":I
    .end local v14    # "v$iv$iv":[Ljava/lang/Object;
    .end local v31    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    nop

    .line 191
    .end local v19    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v20    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v29    # "$i$f$multiForEach":I
    return-void
.end method

.method public final fireOnUpdatedRect(IJJJ)V
    .locals 13
    .param p1, "id"    # I
    .param p2, "topLeft"    # J
    .param p4, "bottomRight"    # J
    .param p6, "currentMillis"    # J

    .line 172
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .local v0, "$this$runFor$iv":Landroidx/collection/MutableIntObjectMap;
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    const/4 v2, 0x0

    .line 495
    .local v2, "$i$f$runFor":I
    invoke-virtual {v0, p1}, Landroidx/collection/MutableIntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 496
    .local v3, "entry$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_0
    if-eqz v3, :cond_0

    .line 497
    move-object v5, v3

    .local v5, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v12, 0x0

    .line 173
    .local v12, "$i$a$-runFor-ThrottledCallbacks$fireOnUpdatedRect$1":I
    move-object v4, p0

    move-wide v6, p2

    move-wide/from16 v8, p4

    move-wide/from16 v10, p6

    invoke-direct/range {v4 .. v11}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fireWithUpdatedRect(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V

    .line 174
    nop

    .line 497
    .end local v5    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v12    # "$i$a$-runFor-ThrottledCallbacks$fireOnUpdatedRect$1":I
    nop

    .line 498
    invoke-virtual {v3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v3

    goto :goto_0

    .line 500
    :cond_0
    nop

    .line 175
    .end local v0    # "$this$runFor$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v1    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v2    # "$i$f$runFor":I
    .end local v3    # "entry$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    return-void
.end method

.method public final getGlobalChangeEntries()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .locals 1

    .line 91
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    return-object v0
.end method

.method public final getMinDebounceDeadline()J
    .locals 2

    .line 95
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    return-wide v0
.end method

.method public final getRectChangedMap()Landroidx/collection/MutableIntObjectMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    return-object v0
.end method

.method public final getScreenOffset-nOcc-ac()J
    .locals 2

    .line 97
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    return-wide v0
.end method

.method public final getViewToWindowMatrix-3i98HWw()[F
    .locals 1

    .line 98
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    return-object v0
.end method

.method public final getWindowOffset-nOcc-ac()J
    .locals 2

    .line 96
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    return-wide v0
.end method

.method public final registerOnGlobalChange(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 11
    .param p1, "id"    # I
    .param p2, "throttleMillis"    # J
    .param p4, "debounceMillis"    # J
    .param p6, "node"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p7, "callback"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"
        }
    .end annotation

    .line 154
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_0

    move-wide v0, p2

    goto :goto_0

    :cond_0
    move-wide v0, p4

    :goto_0
    move-wide v7, v0

    .line 157
    .local v7, "debounceToUse":J
    new-instance v2, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 158
    nop

    .line 159
    nop

    .line 160
    nop

    .line 161
    nop

    .line 162
    nop

    .line 157
    move-object v3, p0

    move v4, p1

    move-wide v5, p2

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;-><init>(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V

    .line 156
    nop

    .line 164
    .local v2, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    invoke-direct {p0, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->addToGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 165
    move-object v0, v2

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    return-object v0
.end method

.method public final registerOnRectChanged(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 10
    .param p1, "id"    # I
    .param p2, "throttleMillis"    # J
    .param p4, "debounceMillis"    # J
    .param p6, "node"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p7, "callback"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"
        }
    .end annotation

    .line 130
    const-wide/16 v2, 0x0

    cmp-long v0, p4, v2

    if-nez v0, :cond_0

    move-wide v5, p2

    goto :goto_0

    :cond_0
    move-wide v5, p4

    .line 132
    .local v5, "debounceToUse":J
    :goto_0
    iget-object v9, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 133
    nop

    .line 135
    new-instance v0, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 136
    nop

    .line 137
    nop

    .line 138
    nop

    .line 139
    nop

    .line 140
    nop

    .line 135
    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;-><init>(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V

    .line 132
    invoke-direct {p0, v9, p1, v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->multiPut(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    return-object v0
.end method

.method public final setGlobalChangeEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 91
    iput-object p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    return-void
.end method

.method public final setMinDebounceDeadline(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 95
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    return-void
.end method

.method public final setScreenOffset--gyyYBs(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 97
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    return-void
.end method

.method public final setViewToWindowMatrix-Q8lPUPs([F)V
    .locals 0
    .param p1, "<set-?>"    # [F

    .line 98
    iput-object p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    return-void
.end method

.method public final setWindowOffset--gyyYBs(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 96
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    return-void
.end method

.method public final triggerDebounced(J)V
    .locals 36
    .param p1, "currentMillis"    # J

    .line 222
    move-object/from16 v0, p0

    iget-wide v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    cmp-long v1, v1, p1

    if-lez v1, :cond_0

    return-void

    .line 223
    :cond_0
    iget-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 224
    .local v2, "windowOffset":J
    iget-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 225
    .local v4, "screenOffset":J
    iget-object v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 226
    .local v6, "viewToWindowMatrix":[F
    const-wide/16 v7, 0x0

    .local v7, "minDeadline":J
    const-wide v7, 0x7fffffffffffffffL

    .line 227
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .local v1, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    move-object/from16 v11, p0

    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    move-object v12, v1

    .end local v1    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v12, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    const/4 v13, 0x0

    .line 543
    .local v13, "$i$f$multiForEach":I
    move-object v14, v12

    check-cast v14, Landroidx/collection/IntObjectMap;

    .local v14, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    const/4 v15, 0x0

    .line 544
    .local v15, "$i$f$forEachValue":I
    iget-object v1, v14, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 546
    .local v1, "v$iv$iv":[Ljava/lang/Object;
    move-object v9, v14

    .local v9, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    const/16 v16, 0x0

    .line 547
    .local v16, "$i$f$forEachIndexed":I
    iget-object v10, v9, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 548
    .local v10, "m$iv$iv$iv":[J
    array-length v0, v10

    add-int/lit8 v0, v0, -0x2

    .line 550
    .local v0, "lastIndex$iv$iv$iv":I
    move-object/from16 v17, v1

    .end local v1    # "v$iv$iv":[Ljava/lang/Object;
    .local v17, "v$iv$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "i$iv$iv$iv":I
    if-gt v1, v0, :cond_6

    .line 551
    :goto_0
    aget-wide v18, v10, v1

    .line 552
    .local v18, "slot$iv$iv$iv":J
    move-wide/from16 v20, v18

    .local v20, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v22, 0x0

    .line 553
    .local v22, "$i$f$maskEmptyOrDeleted":I
    move/from16 v23, v0

    move/from16 v24, v1

    move-wide/from16 v0, v20

    move-wide/from16 v20, v2

    .end local v1    # "i$iv$iv$iv":I
    .end local v2    # "windowOffset":J
    .local v0, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v20, "windowOffset":J
    .local v23, "lastIndex$iv$iv$iv":I
    .local v24, "i$iv$iv$iv":I
    not-long v2, v0

    const/16 v25, 0x7

    shl-long v2, v2, v25

    and-long/2addr v2, v0

    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v2, v25

    .line 552
    .end local v0    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v22    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v25

    if-eqz v0, :cond_5

    .line 554
    sub-int v1, v24, v23

    not-int v0, v1

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 555
    .local v0, "bitCount$iv$iv$iv":I
    const/4 v2, 0x0

    .local v2, "j$iv$iv$iv":I
    :goto_1
    if-ge v2, v0, :cond_4

    .line 556
    const-wide/16 v25, 0xff

    and-long v25, v18, v25

    .local v25, "value$iv$iv$iv$iv":J
    const/4 v3, 0x0

    .line 557
    .local v3, "$i$f$isFull":I
    const-wide/16 v27, 0x80

    cmp-long v22, v25, v27

    if-gez v22, :cond_1

    const/16 v22, 0x1

    goto :goto_2

    :cond_1
    const/16 v22, 0x0

    .line 556
    .end local v3    # "$i$f$isFull":I
    .end local v25    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v22, :cond_3

    .line 558
    shl-int/lit8 v3, v24, 0x3

    add-int v22, v3, v2

    .line 559
    .local v22, "index$iv$iv$iv":I
    move/from16 v25, v22

    .local v25, "index$iv$iv":I
    const/16 v26, 0x0

    .line 546
    .local v26, "$i$a$-forEachIndexed-IntObjectMap$forEachValue$1$iv$iv":I
    aget-object v3, v17, v25

    move-object/from16 v27, v3

    check-cast v27, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .local v27, "it$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/16 v28, 0x0

    .line 560
    .local v28, "$i$a$-forEachValue-ThrottledCallbacks$multiForEach$1$iv":I
    move-object/from16 v3, v27

    move-object/from16 v29, v3

    .line 561
    .local v29, "entry$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_3
    if-eqz v29, :cond_2

    .line 562
    move v3, v1

    move-object/from16 v1, v29

    .local v1, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/16 v30, 0x0

    .line 228
    .local v30, "$i$a$-multiForEach-ThrottledCallbacks$triggerDebounced$1":I
    nop

    .line 229
    nop

    .line 230
    nop

    .line 231
    nop

    .line 232
    nop

    .line 233
    nop

    .line 234
    nop

    .line 235
    nop

    .line 229
    move/from16 v31, v23

    move-object/from16 v23, v11

    move/from16 v11, v31

    move/from16 v31, v24

    move-object/from16 v24, v12

    move/from16 v12, v31

    move/from16 v32, v2

    move/from16 v31, v13

    move-object/from16 v33, v14

    move v13, v0

    move v14, v3

    move-wide/from16 v2, v20

    move-object/from16 v0, p0

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    move-wide v9, v7

    move-wide/from16 v7, p1

    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v7    # "minDeadline":J
    .end local v10    # "m$iv$iv$iv":[J
    .end local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v2, "windowOffset":J
    .local v9, "minDeadline":J
    .local v11, "lastIndex$iv$iv$iv":I
    .local v12, "i$iv$iv$iv":I
    .local v13, "bitCount$iv$iv$iv":I
    .local v20, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .local v21, "m$iv$iv$iv":[J
    .local v23, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v24, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v31, "$i$f$multiForEach":I
    .local v32, "j$iv$iv$iv":I
    .local v33, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    invoke-direct/range {v0 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->debounceEntry-b8qMvQI(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J

    move-result-wide v34

    .line 228
    move-wide/from16 v7, v34

    .line 237
    .end local v9    # "minDeadline":J
    .restart local v7    # "minDeadline":J
    nop

    .line 562
    .end local v1    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v30    # "$i$a$-multiForEach-ThrottledCallbacks$triggerDebounced$1":I
    nop

    .line 563
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v29

    move-object/from16 v0, v23

    move/from16 v23, v11

    move-object v11, v0

    move-object/from16 v0, v24

    move/from16 v24, v12

    move-object v12, v0

    move v0, v13

    move v1, v14

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move/from16 v13, v31

    move-object/from16 v14, v33

    move-wide/from16 v20, v2

    move/from16 v2, v32

    goto :goto_3

    .line 565
    .end local v21    # "m$iv$iv$iv":[J
    .end local v31    # "$i$f$multiForEach":I
    .end local v32    # "j$iv$iv$iv":I
    .end local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v0    # "bitCount$iv$iv$iv":I
    .local v2, "j$iv$iv$iv":I
    .local v9, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v10    # "m$iv$iv$iv":[J
    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v12, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v13, "$i$f$multiForEach":I
    .restart local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v20, "windowOffset":J
    .local v23, "lastIndex$iv$iv$iv":I
    .local v24, "i$iv$iv$iv":I
    :cond_2
    move/from16 v3, v23

    move-object/from16 v23, v11

    move v11, v3

    move/from16 v3, v24

    move-object/from16 v24, v12

    move v12, v3

    move/from16 v32, v2

    move/from16 v31, v13

    move-object/from16 v33, v14

    move-wide/from16 v2, v20

    move v13, v0

    move v14, v1

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    move-object/from16 v0, p0

    move-wide v9, v7

    .line 546
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v7    # "minDeadline":J
    .end local v10    # "m$iv$iv$iv":[J
    .end local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v27    # "it$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v28    # "$i$a$-forEachValue-ThrottledCallbacks$multiForEach$1$iv":I
    .end local v29    # "entry$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .local v2, "windowOffset":J
    .local v9, "minDeadline":J
    .local v11, "lastIndex$iv$iv$iv":I
    .local v12, "i$iv$iv$iv":I
    .local v13, "bitCount$iv$iv$iv":I
    .local v20, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v21    # "m$iv$iv$iv":[J
    .local v23, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v24, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v31    # "$i$f$multiForEach":I
    .restart local v32    # "j$iv$iv$iv":I
    .restart local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    nop

    .line 559
    .end local v25    # "index$iv$iv":I
    .end local v26    # "$i$a$-forEachIndexed-IntObjectMap$forEachValue$1$iv$iv":I
    goto :goto_4

    .line 556
    .end local v21    # "m$iv$iv$iv":[J
    .end local v22    # "index$iv$iv$iv":I
    .end local v31    # "$i$f$multiForEach":I
    .end local v32    # "j$iv$iv$iv":I
    .end local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v0    # "bitCount$iv$iv$iv":I
    .local v2, "j$iv$iv$iv":I
    .restart local v7    # "minDeadline":J
    .local v9, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v10    # "m$iv$iv$iv":[J
    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v12, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v13, "$i$f$multiForEach":I
    .restart local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v20, "windowOffset":J
    .local v23, "lastIndex$iv$iv$iv":I
    .local v24, "i$iv$iv$iv":I
    :cond_3
    move/from16 v3, v23

    move-object/from16 v23, v11

    move v11, v3

    move/from16 v3, v24

    move-object/from16 v24, v12

    move v12, v3

    move/from16 v32, v2

    move/from16 v31, v13

    move-object/from16 v33, v14

    move-wide/from16 v2, v20

    move v13, v0

    move v14, v1

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    move-object/from16 v0, p0

    .line 566
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v10    # "m$iv$iv$iv":[J
    .end local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v2, "windowOffset":J
    .local v11, "lastIndex$iv$iv$iv":I
    .local v12, "i$iv$iv$iv":I
    .local v13, "bitCount$iv$iv$iv":I
    .local v20, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v21    # "m$iv$iv$iv":[J
    .local v23, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v24, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v31    # "$i$f$multiForEach":I
    .restart local v32    # "j$iv$iv$iv":I
    .restart local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :goto_4
    shr-long v18, v18, v14

    .line 555
    add-int/lit8 v1, v32, 0x1

    move-object/from16 v0, v23

    move/from16 v23, v11

    move-object v11, v0

    move-object/from16 v0, v24

    move/from16 v24, v12

    move-object v12, v0

    move v0, v13

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move/from16 v13, v31

    move-wide/from16 v20, v2

    move v2, v1

    move v1, v14

    move-object/from16 v14, v33

    .end local v32    # "j$iv$iv$iv":I
    .local v1, "j$iv$iv$iv":I
    goto/16 :goto_1

    .end local v1    # "j$iv$iv$iv":I
    .end local v21    # "m$iv$iv$iv":[J
    .end local v31    # "$i$f$multiForEach":I
    .end local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v0    # "bitCount$iv$iv$iv":I
    .local v2, "j$iv$iv$iv":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v10    # "m$iv$iv$iv":[J
    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v12, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v13, "$i$f$multiForEach":I
    .restart local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v20, "windowOffset":J
    .local v23, "lastIndex$iv$iv$iv":I
    .local v24, "i$iv$iv$iv":I
    :cond_4
    move/from16 v3, v23

    move-object/from16 v23, v11

    move v11, v3

    move/from16 v3, v24

    move-object/from16 v24, v12

    move v12, v3

    move/from16 v32, v2

    move/from16 v31, v13

    move-object/from16 v33, v14

    move-wide/from16 v2, v20

    move v13, v0

    move v14, v1

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    move-object/from16 v0, p0

    .line 568
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v10    # "m$iv$iv$iv":[J
    .end local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v2, "windowOffset":J
    .local v11, "lastIndex$iv$iv$iv":I
    .local v12, "i$iv$iv$iv":I
    .local v13, "bitCount$iv$iv$iv":I
    .local v20, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v21    # "m$iv$iv$iv":[J
    .local v23, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v24, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v31    # "$i$f$multiForEach":I
    .restart local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    if-ne v13, v14, :cond_8

    goto :goto_5

    .line 552
    .end local v2    # "windowOffset":J
    .end local v21    # "m$iv$iv$iv":[J
    .end local v31    # "$i$f$multiForEach":I
    .end local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v10    # "m$iv$iv$iv":[J
    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v12, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .local v13, "$i$f$multiForEach":I
    .restart local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v20, "windowOffset":J
    .local v23, "lastIndex$iv$iv$iv":I
    .local v24, "i$iv$iv$iv":I
    :cond_5
    move/from16 v0, v23

    move-object/from16 v23, v11

    move v11, v0

    move/from16 v0, v24

    move-object/from16 v24, v12

    move v12, v0

    move-object/from16 v0, p0

    move/from16 v31, v13

    move-object/from16 v33, v14

    move-wide/from16 v2, v20

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    .line 550
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v10    # "m$iv$iv$iv":[J
    .end local v13    # "$i$f$multiForEach":I
    .end local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v18    # "slot$iv$iv$iv":J
    .restart local v2    # "windowOffset":J
    .local v11, "lastIndex$iv$iv$iv":I
    .local v12, "i$iv$iv$iv":I
    .local v20, "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v21    # "m$iv$iv$iv":[J
    .local v23, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v24, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v31    # "$i$f$multiForEach":I
    .restart local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :goto_5
    if-eq v12, v11, :cond_7

    add-int/lit8 v1, v12, 0x1

    move v0, v11

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move-object/from16 v11, v23

    move-object/from16 v12, v24

    move/from16 v13, v31

    move-object/from16 v14, v33

    .end local v12    # "i$iv$iv$iv":I
    .local v1, "i$iv$iv$iv":I
    goto/16 :goto_0

    .end local v20    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v21    # "m$iv$iv$iv":[J
    .end local v23    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v24    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v31    # "$i$f$multiForEach":I
    .end local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v0, "lastIndex$iv$iv$iv":I
    .restart local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v10    # "m$iv$iv$iv":[J
    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .local v12, "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v13    # "$i$f$multiForEach":I
    .restart local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_6
    move-object/from16 v20, v9

    move-object/from16 v21, v10

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    move/from16 v31, v13

    move-object/from16 v33, v14

    move v11, v0

    move-object/from16 v0, p0

    .line 571
    .end local v0    # "lastIndex$iv$iv$iv":I
    .end local v1    # "i$iv$iv$iv":I
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v10    # "m$iv$iv$iv":[J
    .end local v12    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v13    # "$i$f$multiForEach":I
    .end local v14    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v11, "lastIndex$iv$iv$iv":I
    .restart local v20    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v21    # "m$iv$iv$iv":[J
    .restart local v23    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .restart local v24    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v31    # "$i$f$multiForEach":I
    .restart local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_7
    nop

    .line 572
    .end local v11    # "lastIndex$iv$iv$iv":I
    .end local v16    # "$i$f$forEachIndexed":I
    .end local v20    # "this_$iv$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v21    # "m$iv$iv$iv":[J
    :cond_8
    nop

    .line 573
    .end local v15    # "$i$f$forEachValue":I
    .end local v17    # "v$iv$iv":[Ljava/lang/Object;
    .end local v33    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    nop

    .line 238
    .end local v23    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v24    # "$this$multiForEach$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v31    # "$i$f$multiForEach":I
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    if-eqz v1, :cond_a

    .local v1, "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    move-object/from16 v11, p0

    .local v11, "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    move-object v12, v1

    .end local v1    # "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .local v12, "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v13, 0x0

    .line 574
    .local v13, "$i$f$linkedForEach":I
    move-object v14, v1

    move-wide v9, v7

    .line 575
    .end local v7    # "minDeadline":J
    .local v9, "minDeadline":J
    .local v14, "node$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    :goto_6
    if-eqz v14, :cond_9

    .line 576
    move-object v1, v14

    .local v1, "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    const/4 v15, 0x0

    .line 239
    .local v15, "$i$a$-linkedForEach-ThrottledCallbacks$triggerDebounced$2":I
    nop

    .line 240
    nop

    .line 241
    nop

    .line 242
    nop

    .line 243
    nop

    .line 244
    nop

    .line 245
    nop

    .line 246
    nop

    .line 240
    move-wide/from16 v7, p1

    invoke-direct/range {v0 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->debounceEntry-b8qMvQI(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J

    move-result-wide v16

    .line 239
    move-wide/from16 v9, v16

    .line 248
    nop

    .line 576
    .end local v1    # "entry":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v15    # "$i$a$-linkedForEach-ThrottledCallbacks$triggerDebounced$2":I
    nop

    .line 577
    invoke-virtual {v14}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    move-result-object v14

    goto :goto_6

    .line 579
    :cond_9
    move-wide v7, v9

    .line 249
    .end local v9    # "minDeadline":J
    .end local v11    # "this_$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .end local v12    # "$this$linkedForEach$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .end local v13    # "$i$f$linkedForEach":I
    .end local v14    # "node$iv":Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .restart local v7    # "minDeadline":J
    :cond_a
    const-wide v9, 0x7fffffffffffffffL

    cmp-long v1, v7, v9

    if-nez v1, :cond_b

    const-wide/16 v9, -0x1

    goto :goto_7

    :cond_b
    move-wide v9, v7

    :goto_7
    iput-wide v9, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 250
    return-void
.end method

.method public final updateOffsets-bT0EZQs(JJ[F)Z
    .locals 3
    .param p1, "screen"    # J
    .param p3, "window"    # J
    .param p5, "matrix"    # [F

    .line 101
    const/4 v0, 0x0

    .line 102
    .local v0, "updated":Z
    iget-wide v1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    invoke-static {p3, p4, v1, v2}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    .line 103
    iput-wide p3, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 104
    const/4 v0, 0x1

    .line 106
    :cond_0
    iget-wide v1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    invoke-static {p1, p2, v1, v2}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_1

    .line 107
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 108
    const/4 v0, 0x1

    .line 110
    :cond_1
    if-eqz p5, :cond_2

    .line 111
    iput-object p5, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 112
    const/4 v0, 0x1

    .line 114
    :cond_2
    return v0
.end method
