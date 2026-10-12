.class public Landroidx/webkit/internal/SpeculativeLoadingConfigAdapter;
.super Ljava/lang/Object;
.source "SpeculativeLoadingConfigAdapter.java"

# interfaces
.implements Lorg/chromium/support_lib_boundary/SpeculativeLoadingConfigBoundaryInterface;


# instance fields
.field private final mSpeculativeLoadingConfig:Landroidx/webkit/SpeculativeLoadingConfig;


# direct methods
.method public constructor <init>(Landroidx/webkit/SpeculativeLoadingConfig;)V
    .locals 0
    .param p1, "config"    # Landroidx/webkit/SpeculativeLoadingConfig;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Landroidx/webkit/internal/SpeculativeLoadingConfigAdapter;->mSpeculativeLoadingConfig:Landroidx/webkit/SpeculativeLoadingConfig;

    .line 29
    return-void
.end method


# virtual methods
.method public getMaxPrefetches()I
    .locals 1

    .line 33
    iget-object v0, p0, Landroidx/webkit/internal/SpeculativeLoadingConfigAdapter;->mSpeculativeLoadingConfig:Landroidx/webkit/SpeculativeLoadingConfig;

    invoke-virtual {v0}, Landroidx/webkit/SpeculativeLoadingConfig;->getMaxPrefetches()I

    move-result v0

    return v0
.end method

.method public getMaxPrerenders()I
    .locals 1

    .line 43
    iget-object v0, p0, Landroidx/webkit/internal/SpeculativeLoadingConfigAdapter;->mSpeculativeLoadingConfig:Landroidx/webkit/SpeculativeLoadingConfig;

    invoke-virtual {v0}, Landroidx/webkit/SpeculativeLoadingConfig;->getMaxPrerenders()I

    move-result v0

    return v0
.end method

.method public getPrefetchTTLSeconds()I
    .locals 1

    .line 38
    iget-object v0, p0, Landroidx/webkit/internal/SpeculativeLoadingConfigAdapter;->mSpeculativeLoadingConfig:Landroidx/webkit/SpeculativeLoadingConfig;

    invoke-virtual {v0}, Landroidx/webkit/SpeculativeLoadingConfig;->getPrefetchTtlSeconds()I

    move-result v0

    return v0
.end method
