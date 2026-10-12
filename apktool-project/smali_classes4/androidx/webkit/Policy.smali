.class public final Landroidx/webkit/Policy;
.super Ljava/lang/Object;
.source "Policy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/webkit/Policy$ConfigRunnable;,
        Landroidx/webkit/Policy$Builder;
    }
.end annotation


# instance fields
.field private final mBehaviors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/webkit/Policy$ConfigRunnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/webkit/Policy$ConfigRunnable;",
            ">;)V"
        }
    .end annotation

    .line 37
    .local p1, "behaviors":Ljava/util/List;, "Ljava/util/List<Landroidx/webkit/Policy$ConfigRunnable;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Landroidx/webkit/Policy;->mBehaviors:Ljava/util/List;

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Landroidx/webkit/Policy$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/List;
    .param p2, "x1"    # Landroidx/webkit/Policy$1;

    .line 34
    invoke-direct {p0, p1}, Landroidx/webkit/Policy;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method configure(Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;)V
    .locals 2
    .param p1, "config"    # Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/webkit/WebViewBuilderException;
        }
    .end annotation

    .line 42
    iget-object v0, p0, Landroidx/webkit/Policy;->mBehaviors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/webkit/Policy$ConfigRunnable;

    .line 43
    .local v1, "behavior":Landroidx/webkit/Policy$ConfigRunnable;
    invoke-interface {v1, p1}, Landroidx/webkit/Policy$ConfigRunnable;->configure(Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;)V

    .line 44
    .end local v1    # "behavior":Landroidx/webkit/Policy$ConfigRunnable;
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method
