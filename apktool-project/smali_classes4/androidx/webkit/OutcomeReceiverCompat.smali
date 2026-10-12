.class public interface abstract Landroidx/webkit/OutcomeReceiverCompat;
.super Ljava/lang/Object;
.source "OutcomeReceiverCompat.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Throwable;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 48
    .local p0, "this":Landroidx/webkit/OutcomeReceiverCompat;, "Landroidx/webkit/OutcomeReceiverCompat<TT;TE;>;"
    .local p1, "error":Ljava/lang/Throwable;, "TE;"
    return-void
.end method

.method public abstract onResult(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
