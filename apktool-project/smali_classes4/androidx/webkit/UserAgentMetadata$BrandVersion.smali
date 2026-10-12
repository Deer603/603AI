.class public final Landroidx/webkit/UserAgentMetadata$BrandVersion;
.super Ljava/lang/Object;
.source "UserAgentMetadata.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/UserAgentMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BrandVersion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/webkit/UserAgentMetadata$BrandVersion$Builder;
    }
.end annotation


# instance fields
.field private final mBrand:Ljava/lang/String;

.field private final mFullVersion:Ljava/lang/String;

.field private final mMajorVersion:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "brand"    # Ljava/lang/String;
    .param p2, "majorVersion"    # Ljava/lang/String;
    .param p3, "fullVersion"    # Ljava/lang/String;

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    iput-object p1, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mBrand:Ljava/lang/String;

    .line 211
    iput-object p2, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mMajorVersion:Ljava/lang/String;

    .line 212
    iput-object p3, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mFullVersion:Ljava/lang/String;

    .line 213
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/webkit/UserAgentMetadata$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Ljava/lang/String;
    .param p3, "x2"    # Ljava/lang/String;
    .param p4, "x3"    # Landroidx/webkit/UserAgentMetadata$1;

    .line 202
    invoke-direct {p0, p1, p2, p3}, Landroidx/webkit/UserAgentMetadata$BrandVersion;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "o"    # Ljava/lang/Object;

    .line 250
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 251
    :cond_0
    instance-of v1, p1, Landroidx/webkit/UserAgentMetadata$BrandVersion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 252
    :cond_1
    move-object v1, p1

    check-cast v1, Landroidx/webkit/UserAgentMetadata$BrandVersion;

    .line 253
    .local v1, "that":Landroidx/webkit/UserAgentMetadata$BrandVersion;
    iget-object v3, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mBrand:Ljava/lang/String;

    iget-object v4, v1, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mBrand:Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mMajorVersion:Ljava/lang/String;

    iget-object v4, v1, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mMajorVersion:Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mFullVersion:Ljava/lang/String;

    iget-object v4, v1, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mFullVersion:Ljava/lang/String;

    .line 254
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    .line 253
    :goto_0
    return v0
.end method

.method public getBrand()Ljava/lang/String;
    .locals 1

    .line 220
    iget-object v0, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mBrand:Ljava/lang/String;

    return-object v0
.end method

.method public getFullVersion()Ljava/lang/String;
    .locals 1

    .line 236
    iget-object v0, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mFullVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getMajorVersion()Ljava/lang/String;
    .locals 1

    .line 228
    iget-object v0, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mMajorVersion:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 259
    iget-object v0, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mBrand:Ljava/lang/String;

    iget-object v1, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mMajorVersion:Ljava/lang/String;

    iget-object v2, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mFullVersion:Ljava/lang/String;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mBrand:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mMajorVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/webkit/UserAgentMetadata$BrandVersion;->mFullVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
