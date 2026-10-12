.class final Landroidx/compose/ui/CombinedAlignment;
.super Ljava/lang/Object;
.source "Alignment.kt"

# interfaces
.implements Landroidx/compose/ui/Alignment;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,279:1\n54#2:280\n59#2:282\n85#3:281\n90#3:283\n80#3:285\n32#4:284\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n*L\n115#1:280\n116#1:282\n115#1:281\n116#1:283\n117#1:285\n117#1:284\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\rH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/CombinedAlignment;",
        "Landroidx/compose/ui/Alignment;",
        "horizontal",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "vertical",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V",
        "align",
        "Landroidx/compose/ui/unit/IntOffset;",
        "size",
        "Landroidx/compose/ui/unit/IntSize;",
        "space",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "align-KFBX0sM",
        "(JJLandroidx/compose/ui/unit/LayoutDirection;)J",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final horizontal:Landroidx/compose/ui/Alignment$Horizontal;

.field private final vertical:Landroidx/compose/ui/Alignment$Vertical;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V
    .locals 0
    .param p1, "horizontal"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p2, "vertical"    # Landroidx/compose/ui/Alignment$Vertical;

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Landroidx/compose/ui/CombinedAlignment;->horizontal:Landroidx/compose/ui/Alignment$Horizontal;

    .line 112
    iput-object p2, p0, Landroidx/compose/ui/CombinedAlignment;->vertical:Landroidx/compose/ui/Alignment$Vertical;

    .line 110
    return-void
.end method


# virtual methods
.method public align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J
    .locals 13
    .param p1, "size"    # J
    .param p3, "space"    # J
    .param p5, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;

    .line 115
    iget-object v0, p0, Landroidx/compose/ui/CombinedAlignment;->horizontal:Landroidx/compose/ui/Alignment$Horizontal;

    const/4 v1, 0x0

    .line 280
    .local v1, "$i$f$getWidth-impl":I
    move-wide v2, p1

    .local v2, "value$iv$iv":J
    const/4 v4, 0x0

    .line 281
    .local v4, "$i$f$unpackInt1":I
    const/16 v5, 0x20

    shr-long v6, v2, v5

    long-to-int v2, v6

    .line 280
    .end local v2    # "value$iv$iv":J
    .end local v4    # "$i$f$unpackInt1":I
    nop

    .line 115
    .end local v1    # "$i$f$getWidth-impl":I
    const/4 v1, 0x0

    .line 280
    .restart local v1    # "$i$f$getWidth-impl":I
    move-wide/from16 v3, p3

    .local v3, "value$iv$iv":J
    const/4 v6, 0x0

    .line 281
    .local v6, "$i$f$unpackInt1":I
    shr-long v7, v3, v5

    long-to-int v3, v7

    .line 280
    .end local v3    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackInt1":I
    nop

    .line 115
    .end local v1    # "$i$f$getWidth-impl":I
    move-object/from16 v1, p5

    invoke-interface {v0, v2, v3, v1}, Landroidx/compose/ui/Alignment$Horizontal;->align(IILandroidx/compose/ui/unit/LayoutDirection;)I

    move-result v0

    .line 116
    .local v0, "x":I
    iget-object v2, p0, Landroidx/compose/ui/CombinedAlignment;->vertical:Landroidx/compose/ui/Alignment$Vertical;

    const/4 v3, 0x0

    .line 282
    .local v3, "$i$f$getHeight-impl":I
    move-wide v6, p1

    .local v6, "value$iv$iv":J
    const/4 v4, 0x0

    .line 283
    .local v4, "$i$f$unpackInt2":I
    const-wide v8, 0xffffffffL

    and-long v10, v6, v8

    long-to-int v4, v10

    .line 282
    .end local v4    # "$i$f$unpackInt2":I
    .end local v6    # "value$iv$iv":J
    nop

    .line 116
    .end local v3    # "$i$f$getHeight-impl":I
    const/4 v3, 0x0

    .line 282
    .restart local v3    # "$i$f$getHeight-impl":I
    move-wide/from16 v6, p3

    .restart local v6    # "value$iv$iv":J
    const/4 v10, 0x0

    .line 283
    .local v10, "$i$f$unpackInt2":I
    and-long v11, v6, v8

    long-to-int v6, v11

    .line 282
    .end local v6    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackInt2":I
    nop

    .line 116
    .end local v3    # "$i$f$getHeight-impl":I
    invoke-interface {v2, v4, v6}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v2

    .line 117
    .local v2, "y":I
    const/4 v3, 0x0

    .line 284
    .local v3, "$i$f$IntOffset":I
    const/4 v4, 0x0

    .line 285
    .local v4, "$i$f$packInts":I
    int-to-long v6, v0

    shl-long v5, v6, v5

    int-to-long v10, v2

    and-long v7, v10, v8

    or-long v4, v5, v7

    .line 284
    .end local v4    # "$i$f$packInts":I
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    .line 117
    .end local v3    # "$i$f$IntOffset":I
    return-wide v3
.end method
