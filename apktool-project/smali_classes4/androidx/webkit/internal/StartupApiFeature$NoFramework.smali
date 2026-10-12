.class public Landroidx/webkit/internal/StartupApiFeature$NoFramework;
.super Landroidx/webkit/internal/StartupApiFeature;
.source "StartupApiFeature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/internal/StartupApiFeature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NoFramework"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "publicFeatureValue"    # Ljava/lang/String;
    .param p2, "internalFeatureValue"    # Ljava/lang/String;

    .line 183
    invoke-direct {p0, p1, p2}, Landroidx/webkit/internal/StartupApiFeature;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    return-void
.end method


# virtual methods
.method public final isSupportedByFramework()Z
    .locals 1

    .line 188
    const/4 v0, 0x0

    return v0
.end method
