.class public final Landroidx/webkit/ProxyConfig$ProxyRule;
.super Ljava/lang/Object;
.source "ProxyConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/ProxyConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProxyRule"
.end annotation


# instance fields
.field private final mSchemeFilter:Ljava/lang/String;

.field private final mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .line 141
    const-string v0, "*"

    invoke-direct {p0, v0, p1}, Landroidx/webkit/ProxyConfig$ProxyRule;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "schemeFilter"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Landroidx/webkit/ProxyConfig$ProxyRule;->mSchemeFilter:Ljava/lang/String;

    .line 134
    iput-object p2, p0, Landroidx/webkit/ProxyConfig$ProxyRule;->mUrl:Ljava/lang/String;

    .line 135
    return-void
.end method


# virtual methods
.method public getSchemeFilter()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Landroidx/webkit/ProxyConfig$ProxyRule;->mSchemeFilter:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Landroidx/webkit/ProxyConfig$ProxyRule;->mUrl:Ljava/lang/String;

    return-object v0
.end method
