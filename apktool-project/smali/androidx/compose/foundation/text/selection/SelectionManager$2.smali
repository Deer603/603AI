.class final Landroidx/compose/foundation/text/selection/SelectionManager$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SelectionManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/SelectionManager;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/lang/Boolean;",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Landroidx/compose/foundation/text/selection/SelectionAdjustment;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1107:1\n1#2:1108\n54#3:1109\n59#3:1111\n85#4:1110\n90#4:1112\n273#5:1113\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager$2\n*L\n253#1:1109\n253#1:1111\n253#1:1110\n253#1:1112\n264#1:1113\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "<anonymous>",
        "",
        "isInTouchMode",
        "",
        "layoutCoordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "rawPosition",
        "Landroidx/compose/ui/geometry/Offset;",
        "selectionMode",
        "Landroidx/compose/foundation/text/selection/SelectionAdjustment;",
        "invoke-Rg1IO4c",
        "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/text/selection/SelectionManager;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/selection/SelectionManager;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionManager$2;->this$0:Landroidx/compose/foundation/text/selection/SelectionManager;

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;
    .param p4, "p4"    # Ljava/lang/Object;

    .line 250
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object v3, p2

    check-cast v3, Landroidx/compose/ui/layout/LayoutCoordinates;

    move-object v0, p3

    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v4

    move-object v6, p4

    check-cast v6, Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/foundation/text/selection/SelectionManager$2;->invoke-Rg1IO4c(ZLandroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke-Rg1IO4c(ZLandroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V
    .locals 16
    .param p1, "isInTouchMode"    # Z
    .param p2, "layoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p3, "rawPosition"    # J
    .param p5, "selectionMode"    # Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 253
    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    invoke-interface/range {p2 .. p2}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v3

    .line 1108
    .local v3, "$this$invoke_Rg1IO4c_u24lambda_u240":J
    const/4 v5, 0x0

    .line 253
    .local v5, "$i$a$-with-SelectionManager$2$textRect$1":I
    new-instance v6, Landroidx/compose/ui/geometry/Rect;

    const/4 v7, 0x0

    .line 1109
    .local v7, "$i$f$getWidth-impl":I
    move-wide v8, v3

    .local v8, "value$iv$iv":J
    const/4 v10, 0x0

    .line 1110
    .local v10, "$i$f$unpackInt1":I
    const/16 v11, 0x20

    shr-long v11, v8, v11

    long-to-int v8, v11

    .line 1109
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackInt1":I
    nop

    .line 253
    .end local v7    # "$i$f$getWidth-impl":I
    int-to-float v7, v8

    const/4 v8, 0x0

    .line 1111
    .local v8, "$i$f$getHeight-impl":I
    move-wide v9, v3

    .local v9, "value$iv$iv":J
    const/4 v11, 0x0

    .line 1112
    .local v11, "$i$f$unpackInt2":I
    const-wide v12, 0xffffffffL

    and-long/2addr v12, v9

    long-to-int v9, v12

    .line 1111
    .end local v9    # "value$iv$iv":J
    .end local v11    # "$i$f$unpackInt2":I
    nop

    .line 253
    .end local v8    # "$i$f$getHeight-impl":I
    int-to-float v8, v9

    const/4 v9, 0x0

    invoke-direct {v6, v9, v9, v7, v8}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 252
    .end local v3    # "$this$invoke_Rg1IO4c_u24lambda_u240":J
    .end local v5    # "$i$a$-with-SelectionManager$2$textRect$1":I
    nop

    .line 256
    .local v6, "textRect":Landroidx/compose/ui/geometry/Rect;
    invoke-static {v6, v1, v2}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->containsInclusive-Uv8p0NA(Landroidx/compose/ui/geometry/Rect;J)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 257
    move-wide v3, v1

    goto :goto_0

    .line 259
    :cond_0
    invoke-static {v1, v2, v6}, Landroidx/compose/foundation/text/input/internal/TextLayoutStateKt;->coerceIn-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)J

    move-result-wide v3

    .line 256
    :goto_0
    nop

    .line 255
    nop

    .line 262
    .local v3, "position":J
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager$2;->this$0:Landroidx/compose/foundation/text/selection/SelectionManager;

    move-object/from16 v7, p2

    invoke-static {v5, v7, v3, v4}, Landroidx/compose/foundation/text/selection/SelectionManager;->access$convertToContainerCoordinates-R5De75A(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v8

    .line 264
    .local v8, "positionInContainer":J
    move-wide v10, v8

    .local v10, "$this$isSpecified$iv":J
    const/4 v5, 0x0

    .line 1113
    .local v5, "$i$f$isSpecified-k-4lQ0M":I
    const-wide v12, 0x7fffffff7fffffffL

    and-long/2addr v12, v10

    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v12, v12, v14

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v12, :cond_1

    move v5, v13

    goto :goto_1

    :cond_1
    move v5, v14

    .line 264
    .end local v5    # "$i$f$isSpecified-k-4lQ0M":I
    .end local v10    # "$this$isSpecified$iv":J
    :goto_1
    if-eqz v5, :cond_2

    .line 265
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager$2;->this$0:Landroidx/compose/foundation/text/selection/SelectionManager;

    move/from16 v10, p1

    invoke-virtual {v5, v10}, Landroidx/compose/foundation/text/selection/SelectionManager;->setInTouchMode(Z)V

    .line 266
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager$2;->this$0:Landroidx/compose/foundation/text/selection/SelectionManager;

    .line 267
    nop

    .line 268
    nop

    .line 269
    nop

    .line 266
    move-object/from16 v11, p5

    invoke-static {v5, v8, v9, v14, v11}, Landroidx/compose/foundation/text/selection/SelectionManager;->access$startSelection-9KIMszo(Landroidx/compose/foundation/text/selection/SelectionManager;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V

    .line 272
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager$2;->this$0:Landroidx/compose/foundation/text/selection/SelectionManager;

    invoke-virtual {v5}, Landroidx/compose/foundation/text/selection/SelectionManager;->getFocusRequester()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v5

    const/4 v12, 0x0

    invoke-static {v5, v14, v13, v12}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z

    .line 273
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionManager$2;->this$0:Landroidx/compose/foundation/text/selection/SelectionManager;

    invoke-virtual {v5, v14}, Landroidx/compose/foundation/text/selection/SelectionManager;->setShowToolbar$foundation_release(Z)V

    goto :goto_2

    .line 264
    :cond_2
    move/from16 v10, p1

    move-object/from16 v11, p5

    .line 275
    :goto_2
    return-void
.end method
