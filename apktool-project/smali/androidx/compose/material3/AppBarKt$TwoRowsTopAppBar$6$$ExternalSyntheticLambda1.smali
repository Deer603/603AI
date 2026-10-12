.class public final synthetic Landroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/compose/material3/ScrolledOffset;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Landroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6;"
    method = "invoke$lambda$3$lambda$2$lambda$1"
    proto = "(Landroidx/compose/material3/TopAppBarScrollBehavior;)F"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/compose/material3/TopAppBarScrollBehavior;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/TopAppBarScrollBehavior;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/material3/TopAppBarScrollBehavior;

    return-void
.end method


# virtual methods
.method public final offset()F
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/material3/TopAppBarScrollBehavior;

    invoke-static {v0}, Landroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6;->invoke$lambda$3$lambda$2$lambda$1(Landroidx/compose/material3/TopAppBarScrollBehavior;)F

    move-result v0

    return v0
.end method
