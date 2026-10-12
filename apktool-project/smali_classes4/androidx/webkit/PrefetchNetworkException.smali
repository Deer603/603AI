.class public Landroidx/webkit/PrefetchNetworkException;
.super Landroidx/webkit/PrefetchException;
.source "PrefetchNetworkException.java"


# static fields
.field public static final NO_HTTP_RESPONSE_STATUS_CODE:I


# instance fields
.field public final httpResponseStatusCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/webkit/PrefetchNetworkException;-><init>(I)V

    .line 51
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "httpResponseStatusCode"    # I

    .line 45
    invoke-direct {p0}, Landroidx/webkit/PrefetchException;-><init>()V

    .line 46
    iput p1, p0, Landroidx/webkit/PrefetchNetworkException;->httpResponseStatusCode:I

    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "error"    # Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/webkit/PrefetchNetworkException;-><init>(Ljava/lang/String;I)V

    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "error"    # Ljava/lang/String;
    .param p2, "httpResponseStatusCode"    # I

    .line 40
    invoke-direct {p0, p1}, Landroidx/webkit/PrefetchException;-><init>(Ljava/lang/String;)V

    .line 41
    iput p2, p0, Landroidx/webkit/PrefetchNetworkException;->httpResponseStatusCode:I

    .line 42
    return-void
.end method
