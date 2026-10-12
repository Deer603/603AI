.class final Landroidx/compose/runtime/MovableContentState$extractNestedStates$referencesToExtract$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Composer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/MovableContentState;->extractNestedStates$runtime_release(Landroidx/compose/runtime/Applier;Landroidx/collection/ObjectList;)Landroidx/collection/ScatterMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "invoke",
        "(Landroidx/compose/runtime/MovableContentStateReference;)Ljava/lang/Integer;"
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
.field final synthetic this$0:Landroidx/compose/runtime/MovableContentState;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MovableContentState;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/runtime/MovableContentState$extractNestedStates$referencesToExtract$2;->this$0:Landroidx/compose/runtime/MovableContentState;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/MovableContentStateReference;)Ljava/lang/Integer;
    .locals 2
    .param p1, "it"    # Landroidx/compose/runtime/MovableContentStateReference;

    .line 423
    iget-object v0, p0, Landroidx/compose/runtime/MovableContentState$extractNestedStates$referencesToExtract$2;->this$0:Landroidx/compose/runtime/MovableContentState;

    invoke-virtual {v0}, Landroidx/compose/runtime/MovableContentState;->getSlotTable$runtime_release()Landroidx/compose/runtime/SlotTable;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/runtime/MovableContentStateReference;->getAnchor$runtime_release()Landroidx/compose/runtime/Anchor;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/SlotTable;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 423
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/MovableContentStateReference;

    invoke-virtual {p0, v0}, Landroidx/compose/runtime/MovableContentState$extractNestedStates$referencesToExtract$2;->invoke(Landroidx/compose/runtime/MovableContentStateReference;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
