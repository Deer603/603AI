.class public final synthetic Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/RoomScreenKt;"
    method = "RoomScreen$lambda$8$lambda$7"
    proto = "([Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/content/Context;)Landroid/webkit/WebView;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:[Landroid/webkit/WebView;

.field public final synthetic f$1:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>([Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;->f$0:[Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;->f$0:[Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/runtime/State;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen$lambda$8$lambda$7([Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1
.end method
