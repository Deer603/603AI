.class public final synthetic Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Landroidx/webkit/WebViewCompat;"
    method = "lambda$startUpWebView$0"
    proto = "(Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;Landroidx/webkit/WebViewStartUpResult;)V"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;

.field public final synthetic f$1:Landroidx/webkit/WebViewStartUpResult;


# direct methods
.method public synthetic constructor <init>(Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;Landroidx/webkit/WebViewStartUpResult;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda1;->f$0:Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;

    iput-object p2, p0, Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda1;->f$1:Landroidx/webkit/WebViewStartUpResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda1;->f$0:Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;

    iget-object v1, p0, Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda1;->f$1:Landroidx/webkit/WebViewStartUpResult;

    invoke-static {v0, v1}, Landroidx/webkit/WebViewCompat;->lambda$startUpWebView$0(Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;Landroidx/webkit/WebViewStartUpResult;)V

    return-void
.end method
