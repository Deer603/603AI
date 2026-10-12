.class public final Landroidx/webkit/Policy$Builder;
.super Ljava/lang/Object;
.source "Policy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/Policy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field final mBehaviors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/webkit/Policy$ConfigRunnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/webkit/Policy$Builder;->mBehaviors:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public build()Landroidx/webkit/Policy;
    .locals 3

    .line 60
    new-instance v0, Landroidx/webkit/Policy;

    iget-object v1, p0, Landroidx/webkit/Policy$Builder;->mBehaviors:Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/webkit/Policy;-><init>(Ljava/util/List;Landroidx/webkit/Policy$1;)V

    return-object v0
.end method
