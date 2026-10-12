.class public final synthetic Landroidx/lifecycle/serialization/SavedStateHandleDelegate$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Landroidx/lifecycle/serialization/SavedStateHandleDelegate;"
    method = "registerSave$lambda$1"
    proto = "(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)Landroid/os/Bundle;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/lifecycle/serialization/SavedStateHandleDelegate;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate$$ExternalSyntheticLambda0;->f$0:Landroidx/lifecycle/serialization/SavedStateHandleDelegate;

    return-void
.end method


# virtual methods
.method public final saveState()Landroid/os/Bundle;
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/lifecycle/serialization/SavedStateHandleDelegate$$ExternalSyntheticLambda0;->f$0:Landroidx/lifecycle/serialization/SavedStateHandleDelegate;

    invoke-static {v0}, Landroidx/lifecycle/serialization/SavedStateHandleDelegate;->registerSave$lambda$1(Landroidx/lifecycle/serialization/SavedStateHandleDelegate;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
