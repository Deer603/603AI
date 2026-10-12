.class public final Landroidx/compose/ui/platform/SubcompositionKt;
.super Ljava/lang/Object;
.source "Subcomposition.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "createSubcomposition",
        "Landroidx/compose/runtime/ReusableComposition;",
        "container",
        "Landroidx/compose/ui/node/LayoutNode;",
        "parent",
        "Landroidx/compose/runtime/CompositionContext;",
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


# direct methods
.method public static final createSubcomposition(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;
    .locals 1
    .param p0, "container"    # Landroidx/compose/ui/node/LayoutNode;
    .param p1, "parent"    # Landroidx/compose/runtime/CompositionContext;

    .line 29
    invoke-static {p0}, Landroidx/compose/ui/platform/Wrapper_androidKt;->createApplier(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/runtime/AbstractApplier;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/Applier;

    invoke-static {v0, p1}, Landroidx/compose/runtime/CompositionKt;->ReusableComposition(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;

    move-result-object v0

    return-object v0
.end method
