.class public Landroidx/webkit/NoVarySearchHeader;
.super Ljava/lang/Object;
.source "NoVarySearchHeader.java"


# instance fields
.field public final consideredQueryParameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ignoreDifferencesInParameters:Z

.field public final ignoredQueryParameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final varyOnKeyOrder:Z


# direct methods
.method private constructor <init>(ZZLjava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1, "varyOnKeyOrder"    # Z
    .param p2, "ignoreDifferencesInParameters"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 87
    .local p3, "ignoredQueryParameters":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local p4, "consideredQueryParameters":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-boolean p1, p0, Landroidx/webkit/NoVarySearchHeader;->varyOnKeyOrder:Z

    .line 89
    iput-boolean p2, p0, Landroidx/webkit/NoVarySearchHeader;->ignoreDifferencesInParameters:Z

    .line 90
    iput-object p3, p0, Landroidx/webkit/NoVarySearchHeader;->ignoredQueryParameters:Ljava/util/List;

    .line 91
    iput-object p4, p0, Landroidx/webkit/NoVarySearchHeader;->consideredQueryParameters:Ljava/util/List;

    .line 92
    return-void
.end method

.method public static alwaysVaryHeader()Landroidx/webkit/NoVarySearchHeader;
    .locals 5

    .line 112
    new-instance v0, Landroidx/webkit/NoVarySearchHeader;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/webkit/NoVarySearchHeader;-><init>(ZZLjava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static neverVaryExcept(ZLjava/util/List;)Landroidx/webkit/NoVarySearchHeader;
    .locals 3
    .param p0, "varyOnOrdering"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/webkit/NoVarySearchHeader;"
        }
    .end annotation

    .line 131
    .local p1, "consideredQueryParameters":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Landroidx/webkit/NoVarySearchHeader;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2, v1, p1}, Landroidx/webkit/NoVarySearchHeader;-><init>(ZZLjava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static neverVaryHeader()Landroidx/webkit/NoVarySearchHeader;
    .locals 5

    .line 102
    new-instance v0, Landroidx/webkit/NoVarySearchHeader;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/webkit/NoVarySearchHeader;-><init>(ZZLjava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static varyExcept(ZLjava/util/List;)Landroidx/webkit/NoVarySearchHeader;
    .locals 3
    .param p0, "varyOnOrdering"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/webkit/NoVarySearchHeader;"
        }
    .end annotation

    .line 151
    .local p1, "ignoredQueryParameters":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Landroidx/webkit/NoVarySearchHeader;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, p1, v1}, Landroidx/webkit/NoVarySearchHeader;-><init>(ZZLjava/util/List;Ljava/util/List;)V

    return-object v0
.end method
