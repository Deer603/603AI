.class final Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SelectionRegistrarImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;->sort(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,217:1\n69#2:218\n65#2:221\n69#2:224\n70#3:219\n60#3:222\n70#3:225\n22#4:220\n22#4:223\n22#4:226\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1\n*L\n155#1:218\n156#1:221\n158#1:224\n155#1:219\n156#1:222\n158#1:225\n155#1:220\n156#1:223\n158#1:226\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "a",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "b",
        "invoke",
        "(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1;->$containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;
    .locals 16
    .param p1, "a"    # Landroidx/compose/foundation/text/selection/Selectable;
    .param p2, "b"    # Landroidx/compose/foundation/text/selection/Selectable;

    .line 139
    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    .line 140
    .local v1, "layoutCoordinatesA":Landroidx/compose/ui/layout/LayoutCoordinates;
    invoke-interface/range {p2 .. p2}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v2

    .line 143
    .local v2, "layoutCoordinatesB":Landroidx/compose/ui/layout/LayoutCoordinates;
    if-eqz v1, :cond_0

    .line 144
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1;->$containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    sget-object v4, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v4

    invoke-interface {v3, v1, v4, v5}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v3

    goto :goto_0

    .line 146
    :cond_0
    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v3

    .line 143
    :goto_0
    nop

    .line 142
    nop

    .line 149
    .local v3, "positionA":J
    if-eqz v2, :cond_1

    .line 150
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1;->$containerLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    sget-object v6, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v6

    invoke-interface {v5, v2, v6, v7}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v5

    goto :goto_1

    .line 152
    :cond_1
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v5

    .line 149
    :goto_1
    nop

    .line 148
    nop

    .line 155
    .local v5, "positionB":J
    const/4 v7, 0x0

    .line 218
    .local v7, "$i$f$getY-impl":I
    move-wide v8, v3

    .local v8, "value$iv$iv":J
    const/4 v10, 0x0

    .line 219
    .local v10, "$i$f$unpackFloat2":I
    const-wide v11, 0xffffffffL

    and-long v13, v8, v11

    long-to-int v13, v13

    .local v13, "bits$iv$iv$iv":I
    const/4 v14, 0x0

    .line 220
    .local v14, "$i$f$floatFromBits":I
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 219
    .end local v13    # "bits$iv$iv$iv":I
    .end local v14    # "$i$f$floatFromBits":I
    nop

    .line 218
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackFloat2":I
    nop

    .line 155
    .end local v7    # "$i$f$getY-impl":I
    const/4 v7, 0x0

    .line 218
    .restart local v7    # "$i$f$getY-impl":I
    move-wide v8, v5

    .restart local v8    # "value$iv$iv":J
    const/4 v10, 0x0

    .line 219
    .restart local v10    # "$i$f$unpackFloat2":I
    and-long v14, v8, v11

    long-to-int v14, v14

    .local v14, "bits$iv$iv$iv":I
    const/4 v15, 0x0

    .line 220
    .local v15, "$i$f$floatFromBits":I
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    .line 219
    .end local v14    # "bits$iv$iv$iv":I
    .end local v15    # "$i$f$floatFromBits":I
    nop

    .line 218
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackFloat2":I
    nop

    .line 155
    .end local v7    # "$i$f$getY-impl":I
    cmpg-float v7, v13, v14

    if-nez v7, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_3

    .line 156
    const/4 v7, 0x0

    .line 221
    .local v7, "$i$f$getX-impl":I
    move-wide v8, v3

    .restart local v8    # "value$iv$iv":J
    const/4 v10, 0x0

    .line 222
    .local v10, "$i$f$unpackFloat1":I
    const/16 v11, 0x20

    shr-long v12, v8, v11

    long-to-int v12, v12

    .local v12, "bits$iv$iv$iv":I
    const/4 v13, 0x0

    .line 223
    .local v13, "$i$f$floatFromBits":I
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 222
    .end local v12    # "bits$iv$iv$iv":I
    .end local v13    # "$i$f$floatFromBits":I
    nop

    .line 221
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackFloat1":I
    nop

    .end local v7    # "$i$f$getX-impl":I
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    check-cast v7, Ljava/lang/Comparable;

    .line 156
    const/4 v8, 0x0

    .line 221
    .local v8, "$i$f$getX-impl":I
    move-wide v9, v5

    .local v9, "value$iv$iv":J
    const/4 v12, 0x0

    .line 222
    .local v12, "$i$f$unpackFloat1":I
    shr-long v13, v9, v11

    long-to-int v11, v13

    .local v11, "bits$iv$iv$iv":I
    const/4 v13, 0x0

    .line 223
    .restart local v13    # "$i$f$floatFromBits":I
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 222
    .end local v11    # "bits$iv$iv$iv":I
    .end local v13    # "$i$f$floatFromBits":I
    nop

    .line 221
    .end local v9    # "value$iv$iv":J
    .end local v12    # "$i$f$unpackFloat1":I
    nop

    .end local v8    # "$i$f$getX-impl":I
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    check-cast v8, Ljava/lang/Comparable;

    .line 156
    invoke-static {v7, v8}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v7

    goto :goto_3

    .line 158
    :cond_3
    const/4 v7, 0x0

    .line 224
    .local v7, "$i$f$getY-impl":I
    move-wide v8, v3

    .local v8, "value$iv$iv":J
    const/4 v10, 0x0

    .line 225
    .local v10, "$i$f$unpackFloat2":I
    and-long v13, v8, v11

    long-to-int v13, v13

    .local v13, "bits$iv$iv$iv":I
    const/4 v14, 0x0

    .line 226
    .local v14, "$i$f$floatFromBits":I
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 225
    .end local v13    # "bits$iv$iv$iv":I
    .end local v14    # "$i$f$floatFromBits":I
    nop

    .line 224
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackFloat2":I
    nop

    .end local v7    # "$i$f$getY-impl":I
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    check-cast v7, Ljava/lang/Comparable;

    .line 158
    const/4 v8, 0x0

    .line 224
    .local v8, "$i$f$getY-impl":I
    move-wide v9, v5

    .restart local v9    # "value$iv$iv":J
    const/4 v13, 0x0

    .line 225
    .local v13, "$i$f$unpackFloat2":I
    and-long/2addr v11, v9

    long-to-int v11, v11

    .restart local v11    # "bits$iv$iv$iv":I
    const/4 v12, 0x0

    .line 226
    .local v12, "$i$f$floatFromBits":I
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 225
    .end local v11    # "bits$iv$iv$iv":I
    .end local v12    # "$i$f$floatFromBits":I
    nop

    .line 224
    .end local v9    # "value$iv$iv":J
    .end local v13    # "$i$f$unpackFloat2":I
    nop

    .end local v8    # "$i$f$getY-impl":I
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    check-cast v8, Ljava/lang/Comparable;

    .line 158
    invoke-static {v7, v8}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v7

    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 159
    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 138
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/text/selection/Selectable;

    move-object v1, p2

    check-cast v1, Landroidx/compose/foundation/text/selection/Selectable;

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$sort$1;->invoke(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
