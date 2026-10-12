.class final Landroidx/compose/foundation/layout/SizeNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "Size.kt"

# interfaces
.implements Landroidx/compose/ui/node/LayoutModifierNode;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1137\n97#2:1139\n97#2:1150\n97#2:1161\n97#2:1163\n97#2:1165\n97#2:1167\n105#3:1136\n105#3:1138\n101#3,10:1140\n101#3,10:1151\n110#3:1162\n105#3:1164\n110#3:1166\n105#3:1168\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n*L\n789#1:1135\n795#1:1137\n801#1:1139\n809#1:1150\n834#1:1161\n840#1:1163\n846#1:1165\n852#1:1167\n790#1:1136\n796#1:1138\n802#1:1140,10\n810#1:1151,10\n837#1:1162\n843#1:1164\n849#1:1166\n855#1:1168\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010\'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u0016\u0010\u0010\"\u0004\u0008\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0010\"\u0004\u0008\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00060"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/SizeNode;",
        "Landroidx/compose/ui/node/LayoutModifierNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "minWidth",
        "Landroidx/compose/ui/unit/Dp;",
        "minHeight",
        "maxWidth",
        "maxHeight",
        "enforceIncoming",
        "",
        "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getEnforceIncoming",
        "()Z",
        "setEnforceIncoming",
        "(Z)V",
        "getMaxHeight-D9Ej5fM",
        "()F",
        "setMaxHeight-0680j_4",
        "(F)V",
        "F",
        "getMaxWidth-D9Ej5fM",
        "setMaxWidth-0680j_4",
        "getMinHeight-D9Ej5fM",
        "setMinHeight-0680j_4",
        "getMinWidth-D9Ej5fM",
        "setMinWidth-0680j_4",
        "targetConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/unit/Density;",
        "getTargetConstraints-OenEA2s",
        "(Landroidx/compose/ui/unit/Density;)J",
        "maxIntrinsicHeight",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "measurable",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "width",
        "maxIntrinsicWidth",
        "height",
        "measure",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;",
        "minIntrinsicHeight",
        "minIntrinsicWidth",
        "foundation-layout_release"
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
.field private enforceIncoming:Z

.field private maxHeight:F

.field private maxWidth:F

.field private minHeight:F

.field private minWidth:F


# direct methods
.method private constructor <init>(FFFFZ)V
    .locals 0
    .param p1, "minWidth"    # F
    .param p2, "minHeight"    # F
    .param p3, "maxWidth"    # F
    .param p4, "maxHeight"    # F
    .param p5, "enforceIncoming"    # Z

    .line 785
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 780
    iput p1, p0, Landroidx/compose/foundation/layout/SizeNode;->minWidth:F

    .line 781
    iput p2, p0, Landroidx/compose/foundation/layout/SizeNode;->minHeight:F

    .line 782
    iput p3, p0, Landroidx/compose/foundation/layout/SizeNode;->maxWidth:F

    .line 783
    iput p4, p0, Landroidx/compose/foundation/layout/SizeNode;->maxHeight:F

    .line 784
    iput-boolean p5, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    .line 779
    return-void
.end method

.method public synthetic constructor <init>(FFFFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    .line 779
    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 780
    sget-object p1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp$Companion;->getUnspecified-D9Ej5fM()F

    move-result p1

    move v1, p1

    goto :goto_0

    .line 779
    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    .line 781
    sget-object p1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp$Companion;->getUnspecified-D9Ej5fM()F

    move-result p2

    move v2, p2

    goto :goto_1

    .line 779
    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    .line 782
    sget-object p1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp$Companion;->getUnspecified-D9Ej5fM()F

    move-result p3

    move v3, p3

    goto :goto_2

    .line 779
    :cond_2
    move v3, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    .line 783
    sget-object p1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp$Companion;->getUnspecified-D9Ej5fM()F

    move-result p4

    move v4, p4

    goto :goto_3

    .line 779
    :cond_3
    move v4, p4

    :goto_3
    const/4 v6, 0x0

    move-object v0, p0

    move v5, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeNode;-><init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 785
    return-void
.end method

.method public synthetic constructor <init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/layout/SizeNode;-><init>(FFFFZ)V

    return-void
.end method

.method private final getTargetConstraints-OenEA2s(Landroidx/compose/ui/unit/Density;)J
    .locals 10
    .param p1, "$this$targetConstraints"    # Landroidx/compose/ui/unit/Density;

    .line 789
    iget v0, p0, Landroidx/compose/foundation/layout/SizeNode;->maxWidth:F

    .local v0, "$this$isSpecified$iv":F
    const/4 v1, 0x0

    .line 1135
    .local v1, "$i$f$isSpecified-0680j_4":I
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    .line 789
    .end local v0    # "$this$isSpecified$iv":F
    .end local v1    # "$i$f$isSpecified-0680j_4":I
    const v0, 0x7fffffff

    if-nez v2, :cond_1

    .line 790
    iget v1, p0, Landroidx/compose/foundation/layout/SizeNode;->maxWidth:F

    invoke-interface {p1, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v1

    .local v1, "$this$fastCoerceAtLeast$iv":I
    const/4 v2, 0x0

    .local v2, "minimumValue$iv":I
    const/4 v3, 0x0

    .line 1136
    .local v3, "$i$f$fastCoerceAtLeast":I
    if-gez v1, :cond_0

    move v1, v2

    goto :goto_0

    .end local v1    # "$this$fastCoerceAtLeast$iv":I
    .end local v2    # "minimumValue$iv":I
    .end local v3    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    goto :goto_0

    .line 792
    :cond_1
    move v1, v0

    .line 789
    :goto_0
    nop

    .line 788
    nop

    .line 795
    .local v1, "maxWidth":I
    iget v2, p0, Landroidx/compose/foundation/layout/SizeNode;->maxHeight:F

    .local v2, "$this$isSpecified$iv":F
    const/4 v3, 0x0

    .line 1137
    .local v3, "$i$f$isSpecified-0680j_4":I
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    .line 795
    .end local v2    # "$this$isSpecified$iv":F
    .end local v3    # "$i$f$isSpecified-0680j_4":I
    if-nez v4, :cond_3

    .line 796
    iget v2, p0, Landroidx/compose/foundation/layout/SizeNode;->maxHeight:F

    invoke-interface {p1, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v2

    .local v2, "$this$fastCoerceAtLeast$iv":I
    const/4 v3, 0x0

    .local v3, "minimumValue$iv":I
    const/4 v4, 0x0

    .line 1138
    .local v4, "$i$f$fastCoerceAtLeast":I
    if-gez v2, :cond_2

    move v2, v3

    goto :goto_1

    .end local v2    # "$this$fastCoerceAtLeast$iv":I
    .end local v3    # "minimumValue$iv":I
    .end local v4    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    goto :goto_1

    .line 798
    :cond_3
    move v2, v0

    .line 795
    :goto_1
    nop

    .line 794
    nop

    .line 801
    .local v2, "maxHeight":I
    iget v3, p0, Landroidx/compose/foundation/layout/SizeNode;->minWidth:F

    .local v3, "$this$isSpecified$iv":F
    const/4 v4, 0x0

    .line 1139
    .local v4, "$i$f$isSpecified-0680j_4":I
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    .line 801
    .end local v3    # "$this$isSpecified$iv":F
    .end local v4    # "$i$f$isSpecified-0680j_4":I
    const/4 v3, 0x0

    if-nez v5, :cond_7

    .line 802
    iget v4, p0, Landroidx/compose/foundation/layout/SizeNode;->minWidth:F

    invoke-interface {p1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v4

    .local v4, "$this$fastCoerceIn$iv":I
    const/4 v5, 0x0

    .local v5, "minimumValue$iv":I
    const/4 v6, 0x0

    .line 1140
    .local v6, "$i$f$fastCoerceIn":I
    move v7, v4

    .local v7, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v8, 0x0

    .line 1144
    .local v8, "$i$f$fastCoerceAtLeast":I
    if-gez v7, :cond_4

    move v7, v5

    .line 1140
    .end local v7    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v8    # "$i$f$fastCoerceAtLeast":I
    :cond_4
    nop

    .local v7, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v8, 0x0

    .line 1149
    .local v8, "$i$f$fastCoerceAtMost":I
    if-le v7, v1, :cond_5

    move v7, v1

    .line 1140
    .end local v7    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v8    # "$i$f$fastCoerceAtMost":I
    :cond_5
    nop

    .line 802
    .end local v4    # "$this$fastCoerceIn$iv":I
    .end local v5    # "minimumValue$iv":I
    .end local v6    # "$i$f$fastCoerceIn":I
    nop

    .local v7, "it":I
    const/4 v4, 0x0

    .line 803
    .local v4, "$i$a$-let-SizeNode$targetConstraints$minWidth$1":I
    if-eq v7, v0, :cond_6

    goto :goto_2

    :cond_6
    move v7, v3

    .line 802
    .end local v4    # "$i$a$-let-SizeNode$targetConstraints$minWidth$1":I
    .end local v7    # "it":I
    :goto_2
    goto :goto_3

    .line 806
    :cond_7
    move v7, v3

    .line 801
    :goto_3
    nop

    .line 800
    nop

    .line 809
    .local v7, "minWidth":I
    iget v4, p0, Landroidx/compose/foundation/layout/SizeNode;->minHeight:F

    .local v4, "$this$isSpecified$iv":F
    const/4 v5, 0x0

    .line 1150
    .local v5, "$i$f$isSpecified-0680j_4":I
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    .line 809
    .end local v4    # "$this$isSpecified$iv":F
    .end local v5    # "$i$f$isSpecified-0680j_4":I
    if-nez v6, :cond_b

    .line 810
    iget v4, p0, Landroidx/compose/foundation/layout/SizeNode;->minHeight:F

    invoke-interface {p1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v4

    .local v4, "$this$fastCoerceIn$iv":I
    const/4 v5, 0x0

    .local v5, "minimumValue$iv":I
    const/4 v6, 0x0

    .line 1151
    .restart local v6    # "$i$f$fastCoerceIn":I
    move v8, v4

    .local v8, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v9, 0x0

    .line 1155
    .local v9, "$i$f$fastCoerceAtLeast":I
    if-gez v8, :cond_8

    move v8, v5

    .line 1151
    .end local v8    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v9    # "$i$f$fastCoerceAtLeast":I
    :cond_8
    nop

    .local v8, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v9, 0x0

    .line 1160
    .local v9, "$i$f$fastCoerceAtMost":I
    if-le v8, v2, :cond_9

    move v8, v2

    .line 1151
    .end local v8    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v9    # "$i$f$fastCoerceAtMost":I
    :cond_9
    nop

    .line 810
    .end local v4    # "$this$fastCoerceIn$iv":I
    .end local v5    # "minimumValue$iv":I
    .end local v6    # "$i$f$fastCoerceIn":I
    nop

    .local v8, "it":I
    const/4 v4, 0x0

    .line 811
    .local v4, "$i$a$-let-SizeNode$targetConstraints$minHeight$1":I
    if-eq v8, v0, :cond_a

    move v3, v8

    .line 810
    .end local v4    # "$i$a$-let-SizeNode$targetConstraints$minHeight$1":I
    .end local v8    # "it":I
    :cond_a
    goto :goto_4

    .line 814
    :cond_b
    nop

    .line 809
    :goto_4
    nop

    .line 808
    nop

    .line 817
    .local v3, "minHeight":I
    nop

    .line 819
    nop

    .line 818
    nop

    .line 820
    nop

    .line 816
    invoke-static {v7, v1, v3, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v4

    return-wide v4
.end method


# virtual methods
.method public final getEnforceIncoming()Z
    .locals 1

    .line 784
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    return v0
.end method

.method public final getMaxHeight-D9Ej5fM()F
    .locals 1

    .line 783
    iget v0, p0, Landroidx/compose/foundation/layout/SizeNode;->maxHeight:F

    return v0
.end method

.method public final getMaxWidth-D9Ej5fM()F
    .locals 1

    .line 782
    iget v0, p0, Landroidx/compose/foundation/layout/SizeNode;->maxWidth:F

    return v0
.end method

.method public final getMinHeight-D9Ej5fM()F
    .locals 1

    .line 781
    iget v0, p0, Landroidx/compose/foundation/layout/SizeNode;->minHeight:F

    return v0
.end method

.method public final getMinWidth-D9Ej5fM()F
    .locals 1

    .line 780
    iget v0, p0, Landroidx/compose/foundation/layout/SizeNode;->minWidth:F

    return v0
.end method

.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 4
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurable"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p3, "width"    # I

    .line 912
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/SizeNode;->getTargetConstraints-OenEA2s(Landroidx/compose/ui/unit/Density;)J

    move-result-wide v0

    .line 913
    .local v0, "constraints":J
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 914
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    goto :goto_1

    .line 916
    :cond_0
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    if-eqz v2, :cond_1

    move v2, p3

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    .line 917
    .local v2, "childWidth":I
    :goto_0
    invoke-interface {p2, v2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    move-result v3

    invoke-static {v0, v1, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v3

    move v2, v3

    .line 913
    .end local v2    # "childWidth":I
    :goto_1
    return v2
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 4
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurable"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p3, "height"    # I

    .line 899
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/SizeNode;->getTargetConstraints-OenEA2s(Landroidx/compose/ui/unit/Density;)J

    move-result-wide v0

    .line 900
    .local v0, "constraints":J
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 901
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    goto :goto_1

    .line 903
    :cond_0
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    if-eqz v2, :cond_1

    move v2, p3

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v2

    .line 904
    .local v2, "childHeight":I
    :goto_0
    invoke-interface {p2, v2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v3

    invoke-static {v0, v1, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v3

    move v2, v3

    .line 900
    .end local v2    # "childHeight":I
    :goto_1
    return v2
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 14
    .param p1, "$this$measure_u2d3p2s80s"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurable"    # Landroidx/compose/ui/layout/Measurable;
    .param p3, "constraints"    # J

    .line 829
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/SizeNode;->getTargetConstraints-OenEA2s(Landroidx/compose/ui/unit/Density;)J

    move-result-wide v0

    .local v0, "targetConstraints":J
    const/4 v2, 0x0

    .line 830
    .local v2, "$i$a$-let-SizeNode$measure$wrappedConstraints$1":I
    iget-boolean v3, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    if-eqz v3, :cond_0

    .line 831
    move-wide/from16 v3, p3

    invoke-static {v3, v4, v0, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrain-N9IONVI(JJ)J

    move-result-wide v5

    goto/16 :goto_4

    .line 834
    :cond_0
    move-wide/from16 v3, p3

    iget v5, p0, Landroidx/compose/foundation/layout/SizeNode;->minWidth:F

    .local v5, "$this$isSpecified$iv":F
    const/4 v6, 0x0

    .line 1161
    .local v6, "$i$f$isSpecified-0680j_4":I
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    .line 834
    .end local v5    # "$this$isSpecified$iv":F
    .end local v6    # "$i$f$isSpecified-0680j_4":I
    if-nez v7, :cond_1

    .line 835
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v5

    goto :goto_0

    .line 837
    :cond_1
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v5

    .local v5, "$this$fastCoerceAtMost$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v6

    .local v6, "maximumValue$iv":I
    const/4 v7, 0x0

    .line 1162
    .local v7, "$i$f$fastCoerceAtMost":I
    if-le v5, v6, :cond_2

    move v5, v6

    .line 834
    .end local v5    # "$this$fastCoerceAtMost$iv":I
    .end local v6    # "maximumValue$iv":I
    .end local v7    # "$i$f$fastCoerceAtMost":I
    :cond_2
    :goto_0
    nop

    .line 833
    nop

    .line 840
    .local v5, "resolvedMinWidth":I
    iget v6, p0, Landroidx/compose/foundation/layout/SizeNode;->maxWidth:F

    .local v6, "$this$isSpecified$iv":F
    const/4 v7, 0x0

    .line 1163
    .local v7, "$i$f$isSpecified-0680j_4":I
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    .line 840
    .end local v6    # "$this$isSpecified$iv":F
    .end local v7    # "$i$f$isSpecified-0680j_4":I
    if-nez v8, :cond_3

    .line 841
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v6

    goto :goto_1

    .line 843
    :cond_3
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v6

    .local v6, "$this$fastCoerceAtLeast$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v7

    .local v7, "minimumValue$iv":I
    const/4 v8, 0x0

    .line 1164
    .local v8, "$i$f$fastCoerceAtLeast":I
    if-ge v6, v7, :cond_4

    move v6, v7

    .line 840
    .end local v6    # "$this$fastCoerceAtLeast$iv":I
    .end local v7    # "minimumValue$iv":I
    .end local v8    # "$i$f$fastCoerceAtLeast":I
    :cond_4
    :goto_1
    nop

    .line 839
    nop

    .line 846
    .local v6, "resolvedMaxWidth":I
    iget v7, p0, Landroidx/compose/foundation/layout/SizeNode;->minHeight:F

    .local v7, "$this$isSpecified$iv":F
    const/4 v8, 0x0

    .line 1165
    .local v8, "$i$f$isSpecified-0680j_4":I
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    .line 846
    .end local v7    # "$this$isSpecified$iv":F
    .end local v8    # "$i$f$isSpecified-0680j_4":I
    if-nez v9, :cond_5

    .line 847
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v7

    goto :goto_2

    .line 849
    :cond_5
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v7

    .local v7, "$this$fastCoerceAtMost$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v8

    .local v8, "maximumValue$iv":I
    const/4 v9, 0x0

    .line 1166
    .local v9, "$i$f$fastCoerceAtMost":I
    if-le v7, v8, :cond_6

    move v7, v8

    .line 846
    .end local v7    # "$this$fastCoerceAtMost$iv":I
    .end local v8    # "maximumValue$iv":I
    .end local v9    # "$i$f$fastCoerceAtMost":I
    :cond_6
    :goto_2
    nop

    .line 845
    nop

    .line 852
    .local v7, "resolvedMinHeight":I
    iget v8, p0, Landroidx/compose/foundation/layout/SizeNode;->maxHeight:F

    .local v8, "$this$isSpecified$iv":F
    const/4 v9, 0x0

    .line 1167
    .local v9, "$i$f$isSpecified-0680j_4":I
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    .line 852
    .end local v8    # "$this$isSpecified$iv":F
    .end local v9    # "$i$f$isSpecified-0680j_4":I
    if-nez v10, :cond_7

    .line 853
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v8

    goto :goto_3

    .line 855
    :cond_7
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v8

    .local v8, "$this$fastCoerceAtLeast$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v9

    .local v9, "minimumValue$iv":I
    const/4 v10, 0x0

    .line 1168
    .local v10, "$i$f$fastCoerceAtLeast":I
    if-ge v8, v9, :cond_8

    move v8, v9

    .line 852
    .end local v8    # "$this$fastCoerceAtLeast$iv":I
    .end local v9    # "minimumValue$iv":I
    .end local v10    # "$i$f$fastCoerceAtLeast":I
    :cond_8
    :goto_3
    nop

    .line 851
    nop

    .line 858
    .local v8, "resolvedMaxHeight":I
    nop

    .line 859
    nop

    .line 860
    nop

    .line 861
    nop

    .line 857
    invoke-static {v5, v6, v7, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    move-result-wide v9

    move-wide v5, v9

    .line 863
    .end local v5    # "resolvedMinWidth":I
    .end local v6    # "resolvedMaxWidth":I
    .end local v7    # "resolvedMinHeight":I
    .end local v8    # "resolvedMaxHeight":I
    :goto_4
    nop

    .line 829
    .end local v0    # "targetConstraints":J
    .end local v2    # "$i$a$-let-SizeNode$measure$wrappedConstraints$1":I
    nop

    .line 828
    nop

    .line 865
    .local v5, "wrappedConstraints":J
    move-object/from16 v0, p2

    invoke-interface {v0, v5, v6}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 866
    .local v1, "placeable":Landroidx/compose/ui/layout/Placeable;
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v8

    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v9

    new-instance v2, Landroidx/compose/foundation/layout/SizeNode$measure$1;

    invoke-direct {v2, v1}, Landroidx/compose/foundation/layout/SizeNode$measure$1;-><init>(Landroidx/compose/ui/layout/Placeable;)V

    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    return-object v2
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 4
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurable"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p3, "width"    # I

    .line 886
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/SizeNode;->getTargetConstraints-OenEA2s(Landroidx/compose/ui/unit/Density;)J

    move-result-wide v0

    .line 887
    .local v0, "constraints":J
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 888
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    goto :goto_1

    .line 890
    :cond_0
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    if-eqz v2, :cond_1

    move v2, p3

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    .line 891
    .local v2, "childWidth":I
    :goto_0
    invoke-interface {p2, v2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    move-result v3

    invoke-static {v0, v1, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v3

    move v2, v3

    .line 887
    .end local v2    # "childWidth":I
    :goto_1
    return v2
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I
    .locals 4
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurable"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p3, "height"    # I

    .line 873
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/SizeNode;->getTargetConstraints-OenEA2s(Landroidx/compose/ui/unit/Density;)J

    move-result-wide v0

    .line 874
    .local v0, "constraints":J
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 875
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    goto :goto_1

    .line 877
    :cond_0
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    if-eqz v2, :cond_1

    move v2, p3

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v2

    .line 878
    .local v2, "childHeight":I
    :goto_0
    invoke-interface {p2, v2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    move-result v3

    invoke-static {v0, v1, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v3

    move v2, v3

    .line 874
    .end local v2    # "childHeight":I
    :goto_1
    return v2
.end method

.method public final setEnforceIncoming(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 784
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/SizeNode;->enforceIncoming:Z

    return-void
.end method

.method public final setMaxHeight-0680j_4(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 783
    iput p1, p0, Landroidx/compose/foundation/layout/SizeNode;->maxHeight:F

    return-void
.end method

.method public final setMaxWidth-0680j_4(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 782
    iput p1, p0, Landroidx/compose/foundation/layout/SizeNode;->maxWidth:F

    return-void
.end method

.method public final setMinHeight-0680j_4(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 781
    iput p1, p0, Landroidx/compose/foundation/layout/SizeNode;->minHeight:F

    return-void
.end method

.method public final setMinWidth-0680j_4(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 780
    iput p1, p0, Landroidx/compose/foundation/layout/SizeNode;->minWidth:F

    return-void
.end method
