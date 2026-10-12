.class public final synthetic Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Landroidx/webkit/WebViewCompat;"
    method = "lambda$startUpWebView$2"
    proto = "(Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;)V"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;


# direct methods
.method public synthetic constructor <init>(Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda3;->f$0:Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/webkit/WebViewCompat$$ExternalSyntheticLambda3;->f$0:Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;

    invoke-static {v0}, Landroidx/webkit/WebViewCompat;->lambda$startUpWebView$2(Landroidx/webkit/WebViewCompat$WebViewStartUpCallback;)V

    return-void
.end method
