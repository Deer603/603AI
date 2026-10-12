.class public final synthetic Landroidx/compose/ui/platform/FocusFinderCompat$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Landroidx/compose/ui/platform/FocusFinderCompat;"
    method = "userSpecifiedFocusComparator$lambda$0"
    proto = "(Landroidx/compose/ui/platform/FocusFinderCompat;Landroid/view/View;Landroid/view/View;)Landroid/view/View;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/platform/FocusFinderCompat;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/FocusFinderCompat;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/FocusFinderCompat$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/ui/platform/FocusFinderCompat;

    return-void
.end method


# virtual methods
.method public final get(Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/compose/ui/platform/FocusFinderCompat$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/ui/platform/FocusFinderCompat;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/platform/FocusFinderCompat;->userSpecifiedFocusComparator$lambda$0(Landroidx/compose/ui/platform/FocusFinderCompat;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
