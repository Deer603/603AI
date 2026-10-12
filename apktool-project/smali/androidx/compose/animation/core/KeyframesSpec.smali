.class public final Landroidx/compose/animation/core/KeyframesSpec;
.super Ljava/lang/Object;
.source "AnimationSpec.kt"

# interfaces
.implements Landroidx/compose/animation/core/DurationBasedAnimationSpec;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;,
        Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/animation/core/DurationBasedAnimationSpec<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1073:1\n382#2,4:1074\n354#2,6:1078\n364#2,3:1085\n367#2,9:1089\n386#2:1098\n425#2:1099\n425#2:1100\n1399#3:1084\n1270#3:1088\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n644#1:1074,4\n644#1:1078,6\n644#1:1085,3\n644#1:1089,9\n644#1:1098\n654#1:1099\n657#1:1100\n644#1:1084\n644#1:1088\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fB\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J,\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u0002H\n0\t\"\u0008\u0008\u0001\u0010\n*\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/animation/core/KeyframesSpec;",
        "T",
        "Landroidx/compose/animation/core/DurationBasedAnimationSpec;",
        "config",
        "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;",
        "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V",
        "getConfig",
        "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;",
        "vectorize",
        "Landroidx/compose/animation/core/VectorizedKeyframesSpec;",
        "V",
        "Landroidx/compose/animation/core/AnimationVector;",
        "converter",
        "Landroidx/compose/animation/core/TwoWayConverter;",
        "KeyframeEntity",
        "KeyframesSpecConfig",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V
    .locals 0
    .param p1, "config"    # Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig<",
            "TT;>;)V"
        }
    .end annotation

    .line 550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 551
    iput-object p1, p0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    return-void
.end method


# virtual methods
.method public final getConfig()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig<",
            "TT;>;"
        }
    .end annotation

    .line 551
    iget-object v0, p0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    return-object v0
.end method

.method public bridge synthetic vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;
    .locals 1
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;

    .line 550
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/KeyframesSpec;->vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/VectorizedAnimationSpec;

    return-object v0
.end method

.method public bridge synthetic vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;
    .locals 1
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;

    .line 550
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/KeyframesSpec;->vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;

    return-object v0
.end method

.method public bridge synthetic vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
    .locals 1
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;

    .line 550
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/KeyframesSpec;->vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;

    return-object v0
.end method

.method public vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;
    .locals 28
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;)",
            "Landroidx/compose/animation/core/VectorizedKeyframesSpec<",
            "TV;>;"
        }
    .end annotation

    .line 641
    move-object/from16 v0, p0

    new-instance v1, Landroidx/collection/MutableIntList;

    iget-object v2, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v2}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/collection/MutableIntObjectMap;->getSize()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Landroidx/collection/MutableIntList;-><init>(I)V

    .line 643
    .local v1, "timestamps":Landroidx/collection/MutableIntList;
    new-instance v2, Landroidx/collection/MutableIntObjectMap;

    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/collection/MutableIntObjectMap;->getSize()I

    move-result v3

    invoke-direct {v2, v3}, Landroidx/collection/MutableIntObjectMap;-><init>(I)V

    .line 642
    nop

    .line 644
    .local v2, "timeToInfoMap":Landroidx/collection/MutableIntObjectMap;
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;

    move-result-object v3

    check-cast v3, Landroidx/collection/IntObjectMap;

    .local v3, "this_$iv":Landroidx/collection/IntObjectMap;
    const/4 v4, 0x0

    .line 1074
    .local v4, "$i$f$forEach":I
    iget-object v5, v3, Landroidx/collection/IntObjectMap;->keys:[I

    .line 1075
    .local v5, "k$iv":[I
    iget-object v6, v3, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 1077
    .local v6, "v$iv":[Ljava/lang/Object;
    move-object v7, v3

    .local v7, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    const/4 v8, 0x0

    .line 1078
    .local v8, "$i$f$forEachIndexed":I
    iget-object v9, v7, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 1079
    .local v9, "m$iv$iv":[J
    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    .line 1081
    .local v10, "lastIndex$iv$iv":I
    const/4 v11, 0x0

    .local v11, "i$iv$iv":I
    if-gt v11, v10, :cond_4

    .line 1082
    :goto_0
    aget-wide v13, v9, v11

    .line 1083
    .local v13, "slot$iv$iv":J
    move-wide v15, v13

    .local v15, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1084
    .local v17, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v18, v13

    move-wide v12, v15

    .end local v13    # "slot$iv$iv":J
    .end local v15    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v18, "slot$iv$iv":J
    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v14, v20

    .line 1083
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v17    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v12, v12, v20

    if-eqz v12, :cond_3

    .line 1085
    sub-int v12, v11, v10

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    .line 1086
    .local v12, "bitCount$iv$iv":I
    const/4 v14, 0x0

    .local v14, "j$iv$iv":I
    :goto_1
    if-ge v14, v12, :cond_2

    .line 1087
    const-wide/16 v15, 0xff

    and-long v15, v18, v15

    .local v15, "value$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1088
    .local v17, "$i$f$isFull":I
    const-wide/16 v20, 0x80

    cmp-long v20, v15, v20

    if-gez v20, :cond_0

    const/16 v20, 0x1

    goto :goto_2

    :cond_0
    const/16 v20, 0x0

    .line 1087
    .end local v15    # "value$iv$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v20, :cond_1

    .line 1089
    shl-int/lit8 v15, v11, 0x3

    add-int/2addr v15, v14

    .line 1090
    .local v15, "index$iv$iv":I
    move/from16 v16, v15

    .local v16, "index$iv":I
    const/16 v17, 0x0

    .line 1077
    .local v17, "$i$a$-forEachIndexed-IntObjectMap$forEach$1$iv":I
    aget v20, v5, v16

    .local v20, "key":I
    aget-object v21, v6, v16

    check-cast v21, Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;

    .local v21, "value":Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;
    move/from16 v22, v20

    .end local v20    # "key":I
    .local v22, "key":I
    const/16 v20, 0x0

    .line 645
    .local v20, "$i$a$-forEach-KeyframesSpec$vectorize$1":I
    move/from16 v23, v13

    move/from16 v13, v22

    .end local v22    # "key":I
    .local v13, "key":I
    invoke-virtual {v1, v13}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 646
    nop

    .line 647
    move-object/from16 v22, v3

    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .local v22, "this_$iv":Landroidx/collection/IntObjectMap;
    new-instance v3, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    .line 648
    move/from16 v24, v4

    .end local v4    # "$i$f$forEach":I
    .local v24, "$i$f$forEach":I
    invoke-interface/range {p1 .. p1}, Landroidx/compose/animation/core/TwoWayConverter;->getConvertToVector()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    move-object/from16 v25, v5

    .end local v5    # "k$iv":[I
    .local v25, "k$iv":[I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;->getValue$animation_core_release()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/animation/core/AnimationVector;

    .line 649
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;->getEasing$animation_core_release()Landroidx/compose/animation/core/Easing;

    move-result-object v5

    .line 650
    move-object/from16 v26, v6

    .end local v6    # "v$iv":[Ljava/lang/Object;
    .local v26, "v$iv":[Ljava/lang/Object;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;->getArcMode--9T-Mq4$animation_core_release()I

    move-result v6

    .line 647
    move-object/from16 v27, v7

    .end local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .local v27, "this_$iv$iv":Landroidx/collection/IntObjectMap;
    const/4 v7, 0x0

    invoke-direct {v3, v4, v5, v6, v7}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;-><init>(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 646
    invoke-virtual {v2, v13, v3}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 652
    nop

    .line 1077
    .end local v13    # "key":I
    .end local v20    # "$i$a$-forEach-KeyframesSpec$vectorize$1":I
    .end local v21    # "value":Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;
    nop

    .line 1090
    .end local v16    # "index$iv":I
    .end local v17    # "$i$a$-forEachIndexed-IntObjectMap$forEach$1$iv":I
    goto :goto_3

    .line 1087
    .end local v15    # "index$iv$iv":I
    .end local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v24    # "$i$f$forEach":I
    .end local v25    # "k$iv":[I
    .end local v26    # "v$iv":[Ljava/lang/Object;
    .end local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v4    # "$i$f$forEach":I
    .restart local v5    # "k$iv":[I
    .restart local v6    # "v$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_1
    move-object/from16 v22, v3

    move/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    move/from16 v23, v13

    .line 1092
    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv":[I
    .end local v6    # "v$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v24    # "$i$f$forEach":I
    .restart local v25    # "k$iv":[I
    .restart local v26    # "v$iv":[Ljava/lang/Object;
    .restart local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :goto_3
    shr-long v18, v18, v23

    .line 1086
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, v22

    move/from16 v13, v23

    move/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    goto :goto_1

    .end local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v24    # "$i$f$forEach":I
    .end local v25    # "k$iv":[I
    .end local v26    # "v$iv":[Ljava/lang/Object;
    .end local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v4    # "$i$f$forEach":I
    .restart local v5    # "k$iv":[I
    .restart local v6    # "v$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_2
    move-object/from16 v22, v3

    move/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    move/from16 v23, v13

    .line 1094
    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv":[I
    .end local v6    # "v$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v14    # "j$iv$iv":I
    .restart local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v24    # "$i$f$forEach":I
    .restart local v25    # "k$iv":[I
    .restart local v26    # "v$iv":[Ljava/lang/Object;
    .restart local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    move/from16 v3, v23

    if-ne v12, v3, :cond_6

    goto :goto_4

    .line 1083
    .end local v12    # "bitCount$iv$iv":I
    .end local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v24    # "$i$f$forEach":I
    .end local v25    # "k$iv":[I
    .end local v26    # "v$iv":[Ljava/lang/Object;
    .end local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v4    # "$i$f$forEach":I
    .restart local v5    # "k$iv":[I
    .restart local v6    # "v$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_3
    move-object/from16 v22, v3

    move/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    .line 1081
    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv":[I
    .end local v6    # "v$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v18    # "slot$iv$iv":J
    .restart local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v24    # "$i$f$forEach":I
    .restart local v25    # "k$iv":[I
    .restart local v26    # "v$iv":[Ljava/lang/Object;
    .restart local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :goto_4
    if-eq v11, v10, :cond_5

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, v22

    move/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    goto/16 :goto_0

    .end local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v24    # "$i$f$forEach":I
    .end local v25    # "k$iv":[I
    .end local v26    # "v$iv":[Ljava/lang/Object;
    .end local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .restart local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v4    # "$i$f$forEach":I
    .restart local v5    # "k$iv":[I
    .restart local v6    # "v$iv":[Ljava/lang/Object;
    .restart local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_4
    move-object/from16 v22, v3

    move/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    .line 1097
    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv":[I
    .end local v6    # "v$iv":[Ljava/lang/Object;
    .end local v7    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    .end local v11    # "i$iv$iv":I
    .restart local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .restart local v24    # "$i$f$forEach":I
    .restart local v25    # "k$iv":[I
    .restart local v26    # "v$iv":[Ljava/lang/Object;
    .restart local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_5
    nop

    .line 1098
    .end local v8    # "$i$f$forEachIndexed":I
    .end local v9    # "m$iv$iv":[J
    .end local v10    # "lastIndex$iv$iv":I
    .end local v27    # "this_$iv$iv":Landroidx/collection/IntObjectMap;
    :cond_6
    nop

    .line 654
    .end local v22    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v24    # "$i$f$forEach":I
    .end local v25    # "k$iv":[I
    .end local v26    # "v$iv":[Ljava/lang/Object;
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;

    move-result-object v3

    check-cast v3, Landroidx/collection/IntObjectMap;

    .restart local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    const/4 v4, 0x0

    .local v4, "key$iv":I
    const/4 v5, 0x0

    .line 1099
    .local v5, "$i$f$contains":I
    invoke-virtual {v3, v4}, Landroidx/collection/IntObjectMap;->containsKey(I)Z

    move-result v3

    .line 654
    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v4    # "key$iv":I
    .end local v5    # "$i$f$contains":I
    if-nez v3, :cond_7

    .line 655
    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3}, Landroidx/collection/MutableIntList;->add(II)V

    .line 657
    :cond_7
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;

    move-result-object v3

    check-cast v3, Landroidx/collection/IntObjectMap;

    .restart local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    iget-object v4, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v4}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getDurationMillis()I

    move-result v4

    .restart local v4    # "key$iv":I
    const/4 v5, 0x0

    .line 1100
    .restart local v5    # "$i$f$contains":I
    invoke-virtual {v3, v4}, Landroidx/collection/IntObjectMap;->containsKey(I)Z

    move-result v3

    .line 657
    .end local v3    # "this_$iv":Landroidx/collection/IntObjectMap;
    .end local v4    # "key$iv":I
    .end local v5    # "$i$f$contains":I
    if-nez v3, :cond_8

    .line 658
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getDurationMillis()I

    move-result v3

    invoke-virtual {v1, v3}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 660
    :cond_8
    invoke-virtual {v1}, Landroidx/collection/MutableIntList;->sort()V

    .line 662
    new-instance v4, Landroidx/compose/animation/core/VectorizedKeyframesSpec;

    .line 663
    move-object v5, v1

    check-cast v5, Landroidx/collection/IntList;

    .line 664
    move-object v6, v2

    check-cast v6, Landroidx/collection/IntObjectMap;

    .line 665
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getDurationMillis()I

    move-result v7

    .line 666
    iget-object v3, v0, Landroidx/compose/animation/core/KeyframesSpec;->config:Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;

    invoke-virtual {v3}, Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;->getDelayMillis()I

    move-result v8

    .line 667
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    move-result-object v9

    .line 668
    sget-object v3, Landroidx/compose/animation/core/ArcMode;->Companion:Landroidx/compose/animation/core/ArcMode$Companion;

    invoke-virtual {v3}, Landroidx/compose/animation/core/ArcMode$Companion;->getArcLinear--9T-Mq4()I

    move-result v10

    .line 662
    const/4 v11, 0x0

    invoke-direct/range {v4 .. v11}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;-><init>(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
