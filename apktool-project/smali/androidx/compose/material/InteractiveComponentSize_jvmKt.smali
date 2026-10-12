.class public final Landroidx/compose/material/InteractiveComponentSize_jvmKt;
.super Ljava/lang/Object;
.source "InteractiveComponentSize.jvm.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0008\u00a8\u0006\u0004"
    }
    d2 = {
        "identityHashCode",
        "",
        "value",
        "",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final identityHashCode(Ljava/lang/Object;)I
    .locals 2
    .param p0, "value"    # Ljava/lang/Object;

    const/4 v0, 0x0

    .line 20
    .local v0, "$i$f$identityHashCode":I
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    return v1
.end method
