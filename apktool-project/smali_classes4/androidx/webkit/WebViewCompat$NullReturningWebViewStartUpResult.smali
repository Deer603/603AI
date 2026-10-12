.class Landroidx/webkit/WebViewCompat$NullReturningWebViewStartUpResult;
.super Ljava/lang/Object;
.source "WebViewCompat.java"

# interfaces
.implements Landroidx/webkit/WebViewStartUpResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/WebViewCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NullReturningWebViewStartUpResult"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/webkit/WebViewCompat$1;)V
    .locals 0
    .param p1, "x0"    # Landroidx/webkit/WebViewCompat$1;

    .line 1336
    invoke-direct {p0}, Landroidx/webkit/WebViewCompat$NullReturningWebViewStartUpResult;-><init>()V

    return-void
.end method


# virtual methods
.method public getBlockingStartUpLocations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/webkit/BlockingStartUpLocation;",
            ">;"
        }
    .end annotation

    .line 1349
    const/4 v0, 0x0

    return-object v0
.end method

.method public getMaxTimePerTaskInUiThreadMillis()Ljava/lang/Long;
    .locals 1

    .line 1344
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTotalTimeInUiThreadMillis()Ljava/lang/Long;
    .locals 1

    .line 1339
    const/4 v0, 0x0

    return-object v0
.end method
