.class final Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "RectManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/spatial/RectManager;->currentRectInfo(ILandroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/spatial/RelativeLayoutBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager$currentRectInfo$1\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,547:1\n787#2:548\n787#2:549\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager$currentRectInfo$1\n*L\n147#1:548\n148#1:549\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "l",
        "",
        "t",
        "r",
        "b",
        "invoke"
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
.field final synthetic $node:Landroidx/compose/ui/node/DelegatableNode;

.field final synthetic $result:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/ui/spatial/RectManager;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/spatial/RectManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
            ">;",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Landroidx/compose/ui/spatial/RectManager;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->$node:Landroidx/compose/ui/node/DelegatableNode;

    iput-object p3, p0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->this$0:Landroidx/compose/ui/spatial/RectManager;

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;
    .param p4, "p4"    # Ljava/lang/Object;

    .line 143
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move-object v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->invoke(IIII)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(IIII)V
    .locals 18
    .param p1, "l"    # I
    .param p2, "t"    # I
    .param p3, "r"    # I
    .param p4, "b"    # I

    .line 144
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->$result:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 146
    iget-object v2, v0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->$node:Landroidx/compose/ui/node/DelegatableNode;

    .line 147
    const/4 v3, 0x0

    .line 548
    .local v3, "$i$f$packXY":I
    move/from16 v12, p1

    int-to-long v4, v12

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    move/from16 v13, p2

    int-to-long v7, v13

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    or-long v3, v4, v7

    .line 148
    .end local v3    # "$i$f$packXY":I
    const/4 v5, 0x0

    .line 549
    .local v5, "$i$f$packXY":I
    move/from16 v14, p3

    int-to-long v7, v14

    shl-long v6, v7, v6

    move/from16 v15, p4

    move-wide/from16 v16, v9

    int-to-long v9, v15

    and-long v8, v9, v16

    or-long v5, v6, v8

    .line 149
    .end local v5    # "$i$f$packXY":I
    iget-object v7, v0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->this$0:Landroidx/compose/ui/spatial/RectManager;

    invoke-static {v7}, Landroidx/compose/ui/spatial/RectManager;->access$getThrottledCallbacks$p(Landroidx/compose/ui/spatial/RectManager;)Landroidx/compose/ui/spatial/ThrottledCallbacks;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->getWindowOffset-nOcc-ac()J

    move-result-wide v7

    .line 150
    iget-object v9, v0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->this$0:Landroidx/compose/ui/spatial/RectManager;

    invoke-static {v9}, Landroidx/compose/ui/spatial/RectManager;->access$getThrottledCallbacks$p(Landroidx/compose/ui/spatial/RectManager;)Landroidx/compose/ui/spatial/ThrottledCallbacks;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->getScreenOffset-nOcc-ac()J

    move-result-wide v9

    .line 151
    iget-object v11, v0, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;->this$0:Landroidx/compose/ui/spatial/RectManager;

    invoke-static {v11}, Landroidx/compose/ui/spatial/RectManager;->access$getThrottledCallbacks$p(Landroidx/compose/ui/spatial/RectManager;)Landroidx/compose/ui/spatial/ThrottledCallbacks;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->getViewToWindowMatrix-3i98HWw()[F

    move-result-object v11

    .line 145
    invoke-static/range {v2 .. v11}, Landroidx/compose/ui/spatial/ThrottledCallbacksKt;->rectInfoFor-Q-MZNJw(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;

    move-result-object v2

    .line 144
    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 153
    return-void
.end method
