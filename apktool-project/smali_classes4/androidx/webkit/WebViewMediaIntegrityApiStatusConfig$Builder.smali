.class public final Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;
.super Ljava/lang/Object;
.source "WebViewMediaIntegrityApiStatusConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final mDefaultStatus:I

.field private mOverrideRules:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1
    .param p1, "defaultStatus"    # I

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput p1, p0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->mDefaultStatus:I

    .line 113
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->mOverrideRules:Ljava/util/Map;

    .line 114
    return-void
.end method

.method static synthetic access$000(Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;)I
    .locals 1
    .param p0, "x0"    # Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;

    .line 103
    iget v0, p0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->mDefaultStatus:I

    return v0
.end method

.method static synthetic access$100(Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;

    .line 103
    iget-object v0, p0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->mOverrideRules:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public addOverrideRule(Ljava/lang/String;I)Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;
    .locals 2
    .param p1, "originPattern"    # Ljava/lang/String;
    .param p2, "permission"    # I

    .line 128
    iget-object v0, p0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->mOverrideRules:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    return-object p0
.end method

.method public build()Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;
    .locals 1

    .line 152
    new-instance v0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;

    invoke-direct {v0, p0}, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;-><init>(Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;)V

    return-object v0
.end method

.method public setOverrideRules(Ljava/util/Map;)Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;"
        }
    .end annotation

    .line 144
    .local p1, "overrideRules":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    iput-object p1, p0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->mOverrideRules:Ljava/util/Map;

    .line 145
    return-object p0
.end method
