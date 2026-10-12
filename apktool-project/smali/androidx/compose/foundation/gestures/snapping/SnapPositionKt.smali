.class public final Landroidx/compose/foundation/gestures/snapping/SnapPositionKt;
.super Ljava/lang/Object;
.source "SnapPosition.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "calculateDistanceToDesiredSnapPosition",
        "",
        "mainAxisViewPortSize",
        "",
        "beforeContentPadding",
        "afterContentPadding",
        "itemSize",
        "itemOffset",
        "itemIndex",
        "snapPosition",
        "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
        "itemCount",
        "foundation_release"
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
.method public static final calculateDistanceToDesiredSnapPosition(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)F
    .locals 8
    .param p0, "mainAxisViewPortSize"    # I
    .param p1, "beforeContentPadding"    # I
    .param p2, "afterContentPadding"    # I
    .param p3, "itemSize"    # I
    .param p4, "itemOffset"    # I
    .param p5, "itemIndex"    # I
    .param p6, "snapPosition"    # Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    .param p7, "itemCount"    # I

    .line 137
    nop

    .line 127
    move-object v0, p6

    .local v0, "$this$calculateDistanceToDesiredSnapPosition_u24lambda_u240":Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    const/4 v7, 0x0

    .line 128
    .local v7, "$i$a$-with-SnapPositionKt$calculateDistanceToDesiredSnapPosition$desiredDistance$1":I
    nop

    .line 129
    nop

    .line 130
    nop

    .line 131
    nop

    .line 132
    nop

    .line 133
    nop

    .line 134
    nop

    .line 128
    move v1, p0

    move v3, p1

    move v4, p2

    move v2, p3

    move v5, p5

    move v6, p7

    .end local p0    # "mainAxisViewPortSize":I
    .end local p1    # "beforeContentPadding":I
    .end local p2    # "afterContentPadding":I
    .end local p3    # "itemSize":I
    .end local p5    # "itemIndex":I
    .end local p7    # "itemCount":I
    .local v1, "mainAxisViewPortSize":I
    .local v2, "itemSize":I
    .local v3, "beforeContentPadding":I
    .local v4, "afterContentPadding":I
    .local v5, "itemIndex":I
    .local v6, "itemCount":I
    invoke-interface/range {v0 .. v6}, Landroidx/compose/foundation/gestures/snapping/SnapPosition;->position(IIIIII)I

    move-result p0

    .line 135
    nop

    .line 127
    .end local v0    # "$this$calculateDistanceToDesiredSnapPosition_u24lambda_u240":Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    .end local v7    # "$i$a$-with-SnapPositionKt$calculateDistanceToDesiredSnapPosition$desiredDistance$1":I
    nop

    .line 137
    int-to-float p0, p0

    .line 126
    nop

    .line 139
    .local p0, "desiredDistance":F
    int-to-float p1, p4

    sub-float/2addr p1, p0

    return p1
.end method
