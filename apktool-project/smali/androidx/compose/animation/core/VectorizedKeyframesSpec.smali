.class public final Landroidx/compose/animation/core/VectorizedKeyframesSpec;
.super Ljava/lang/Object;
.source "VectorizedAnimationSpec.kt"

# interfaces
.implements Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroidx/compose/animation/core/AnimationVector;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec<",
        "TV;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,1038:1\n215#2,2:1039\n215#2,2:1041\n65#3:1043\n65#3:1044\n65#3:1045\n70#3:1047\n71#4:1046\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n246#1:1039,2\n259#1:1041,2\n301#1:1043\n304#1:1044\n335#1:1045\n469#1:1047\n418#1:1046\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B9\u0008\u0016\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00080\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bBC\u0008\u0000\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010&\u001a\u00020\u0006H\u0002J \u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0002J-\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00103J-\u00104\u001a\u00028\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00103J%\u00105\u001a\u0002062\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u00107R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010$\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00068"
    }
    d2 = {
        "Landroidx/compose/animation/core/VectorizedKeyframesSpec;",
        "V",
        "Landroidx/compose/animation/core/AnimationVector;",
        "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;",
        "keyframes",
        "",
        "",
        "Lkotlin/Pair;",
        "Landroidx/compose/animation/core/Easing;",
        "durationMillis",
        "delayMillis",
        "(Ljava/util/Map;II)V",
        "timestamps",
        "Landroidx/collection/IntList;",
        "Landroidx/collection/IntObjectMap;",
        "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;",
        "defaultEasing",
        "initialArcMode",
        "Landroidx/compose/animation/core/ArcMode;",
        "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "arcSpline",
        "Landroidx/compose/animation/core/ArcSpline;",
        "getDelayMillis",
        "()I",
        "getDurationMillis",
        "I",
        "lastInitialValue",
        "Landroidx/compose/animation/core/AnimationVector;",
        "lastTargetValue",
        "modes",
        "",
        "posArray",
        "",
        "slopeArray",
        "times",
        "valueVector",
        "velocityVector",
        "findEntryForTimeMillis",
        "timeMillis",
        "getEasedTime",
        "",
        "getEasedTimeFromIndex",
        "index",
        "asFraction",
        "",
        "getValueFromNanos",
        "playTimeNanos",
        "",
        "initialValue",
        "targetValue",
        "initialVelocity",
        "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;",
        "getVelocityFromNanos",
        "init",
        "",
        "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V",
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
.field private arcSpline:Landroidx/compose/animation/core/ArcSpline;

.field private final defaultEasing:Landroidx/compose/animation/core/Easing;

.field private final delayMillis:I

.field private final durationMillis:I

.field private final initialArcMode:I

.field private final keyframes:Landroidx/collection/IntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/IntObjectMap<",
            "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field private lastInitialValue:Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private lastTargetValue:Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private modes:[I

.field private posArray:[F

.field private slopeArray:[F

.field private times:[F

.field private final timestamps:Landroidx/collection/IntList;

.field private valueVector:Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private velocityVector:Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->$stable:I

    return-void
.end method

.method private constructor <init>(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;I)V
    .locals 1
    .param p1, "timestamps"    # Landroidx/collection/IntList;
    .param p2, "keyframes"    # Landroidx/collection/IntObjectMap;
    .param p3, "durationMillis"    # I
    .param p4, "delayMillis"    # I
    .param p5, "defaultEasing"    # Landroidx/compose/animation/core/Easing;
    .param p6, "initialArcMode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/IntList;",
            "Landroidx/collection/IntObjectMap<",
            "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo<",
            "TV;>;>;II",
            "Landroidx/compose/animation/core/Easing;",
            "I)V"
        }
    .end annotation

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 220
    iput-object p1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    .line 221
    iput-object p2, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    .line 222
    iput p3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->durationMillis:I

    .line 223
    iput p4, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->delayMillis:I

    .line 225
    iput-object p5, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->defaultEasing:Landroidx/compose/animation/core/Easing;

    .line 228
    iput p6, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->initialArcMode:I

    .line 281
    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyIntArray$p()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->modes:[I

    .line 282
    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyFloatArray$p()[F

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->times:[F

    .line 289
    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyFloatArray$p()[F

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->posArray:[F

    .line 290
    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyFloatArray$p()[F

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->slopeArray:[F

    .line 291
    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyArcSpline$p()Landroidx/compose/animation/core/ArcSpline;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    .line 217
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;-><init>(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;II)V
    .locals 17
    .param p1, "keyframes"    # Ljava/util/Map;
    .param p2, "durationMillis"    # I
    .param p3, "delayMillis"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "+",
            "Lkotlin/Pair<",
            "+TV;+",
            "Landroidx/compose/animation/core/Easing;",
            ">;>;II)V"
        }
    .end annotation

    .line 242
    move-object/from16 v0, p1

    .line 244
    const/4 v1, 0x0

    .line 245
    .local v1, "$i$a$-run-VectorizedKeyframesSpec$1":I
    new-instance v2, Landroidx/collection/MutableIntList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-direct {v2, v3}, Landroidx/collection/MutableIntList;-><init>(I)V

    .line 246
    .local v2, "times":Landroidx/collection/MutableIntList;
    move-object/from16 v3, p1

    .local v3, "$this$forEach$iv":Ljava/util/Map;
    const/4 v4, 0x0

    .line 1039
    .local v4, "$i$f$forEach":I
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .local v6, "element$iv":Ljava/util/Map$Entry;
    const/4 v7, 0x0

    .line 246
    .local v7, "$i$a$-forEach-VectorizedKeyframesSpec$1$1":I
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    .local v8, "t":I
    invoke-virtual {v2, v8}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 1039
    .end local v7    # "$i$a$-forEach-VectorizedKeyframesSpec$1$1":I
    .end local v8    # "t":I
    nop

    .end local v6    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_0

    .line 1040
    :cond_0
    nop

    .line 247
    .end local v3    # "$this$forEach$iv":Ljava/util/Map;
    .end local v4    # "$i$f$forEach":I
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 248
    invoke-virtual {v2, v3, v3}, Landroidx/collection/MutableIntList;->add(II)V

    .line 250
    :cond_1
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 251
    move/from16 v8, p2

    invoke-virtual {v2, v8}, Landroidx/collection/MutableIntList;->add(I)Z

    goto :goto_1

    .line 250
    :cond_2
    move/from16 v8, p2

    .line 253
    :goto_1
    invoke-virtual {v2}, Landroidx/collection/MutableIntList;->sort()V

    .line 254
    nop

    .line 244
    .end local v1    # "$i$a$-run-VectorizedKeyframesSpec$1":I
    .end local v2    # "times":Landroidx/collection/MutableIntList;
    move-object v6, v2

    check-cast v6, Landroidx/collection/IntList;

    .line 257
    const/4 v1, 0x0

    .line 258
    .local v1, "$i$a$-run-VectorizedKeyframesSpec$2":I
    new-instance v2, Landroidx/collection/MutableIntObjectMap;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Landroidx/collection/MutableIntObjectMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 259
    .local v2, "timeToInfoMap":Landroidx/collection/MutableIntObjectMap;
    move-object/from16 v3, p1

    .restart local v3    # "$this$forEach$iv":Ljava/util/Map;
    const/4 v4, 0x0

    .line 1041
    .restart local v4    # "$i$f$forEach":I
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .local v9, "element$iv":Ljava/util/Map$Entry;
    const/4 v10, 0x0

    .line 259
    .local v10, "$i$a$-forEach-VectorizedKeyframesSpec$2$1":I
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    .local v11, "time":I
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lkotlin/Pair;

    .line 260
    .local v12, "valueEasing":Lkotlin/Pair;
    nop

    .line 261
    new-instance v13, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    .line 262
    invoke-virtual {v12}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/animation/core/AnimationVector;

    .line 263
    invoke-virtual {v12}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/animation/core/Easing;

    .line 264
    sget-object v16, Landroidx/compose/animation/core/ArcMode;->Companion:Landroidx/compose/animation/core/ArcMode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/ArcMode$Companion;->getArcLinear--9T-Mq4()I

    move-result v0

    .line 261
    invoke-direct {v13, v14, v15, v0, v5}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;-><init>(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 260
    invoke-virtual {v2, v11, v13}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 266
    nop

    .line 1041
    .end local v10    # "$i$a$-forEach-VectorizedKeyframesSpec$2$1":I
    .end local v11    # "time":I
    .end local v12    # "valueEasing":Lkotlin/Pair;
    move-object/from16 v0, p1

    .end local v9    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_2

    .line 1042
    :cond_3
    nop

    .line 268
    .end local v3    # "$this$forEach$iv":Ljava/util/Map;
    .end local v4    # "$i$f$forEach":I
    nop

    .line 257
    .end local v1    # "$i$a$-run-VectorizedKeyframesSpec$2":I
    .end local v2    # "timeToInfoMap":Landroidx/collection/MutableIntObjectMap;
    move-object v7, v2

    check-cast v7, Landroidx/collection/IntObjectMap;

    .line 270
    nop

    .line 271
    nop

    .line 272
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    move-result-object v10

    .line 273
    sget-object v0, Landroidx/compose/animation/core/ArcMode;->Companion:Landroidx/compose/animation/core/ArcMode$Companion;

    invoke-virtual {v0}, Landroidx/compose/animation/core/ArcMode$Companion;->getArcLinear--9T-Mq4()I

    move-result v11

    .line 242
    const/4 v12, 0x0

    move-object/from16 v5, p0

    move/from16 v9, p3

    invoke-direct/range {v5 .. v12}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;-><init>(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 274
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 238
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 241
    const/4 p3, 0x0

    .line 238
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;-><init>(Ljava/util/Map;II)V

    .line 274
    return-void
.end method

.method private final findEntryForTimeMillis(I)I
    .locals 6
    .param p1, "timeMillis"    # I

    .line 497
    iget-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p1

    .end local p1    # "timeMillis":I
    .local v1, "timeMillis":I
    invoke-static/range {v0 .. v5}, Landroidx/collection/IntList;->binarySearch$default(Landroidx/collection/IntList;IIIILjava/lang/Object;)I

    move-result p1

    .line 498
    .local p1, "index":I
    const/4 v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 v0, p1, 0x2

    neg-int v0, v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method private final getEasedTime(I)F
    .locals 2
    .param p1, "timeMillis"    # I

    .line 464
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->findEntryForTimeMillis(I)I

    move-result v0

    .line 465
    .local v0, "index":I
    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->getEasedTimeFromIndex(IIZ)F

    move-result v1

    return v1
.end method

.method private final getEasedTimeFromIndex(IIZ)F
    .locals 9
    .param p1, "index"    # I
    .param p2, "timeMillis"    # I
    .param p3, "asFraction"    # Z

    .line 469
    iget-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 1047
    .local v1, "$i$f$getLastIndex":I
    iget v2, v0, Landroidx/collection/IntList;->_size:I

    add-int/lit8 v2, v2, -0x1

    .line 469
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$getLastIndex":I
    const/high16 v0, 0x447a0000    # 1000.0f

    if-lt p1, v2, :cond_0

    .line 471
    int-to-float v1, p2

    div-float/2addr v1, v0

    return v1

    .line 473
    :cond_0
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    invoke-virtual {v1, p1}, Landroidx/collection/IntList;->get(I)I

    move-result v1

    .line 474
    .local v1, "timeMin":I
    iget-object v2, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    add-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v3}, Landroidx/collection/IntList;->get(I)I

    move-result v2

    .line 476
    .local v2, "timeMax":I
    if-ne p2, v1, :cond_1

    .line 477
    int-to-float v3, v1

    div-float/2addr v3, v0

    return v3

    .line 480
    :cond_1
    sub-int v3, v2, v1

    .line 481
    .local v3, "timeRange":I
    iget-object v4, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v4, v1}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;->getEasing()Landroidx/compose/animation/core/Easing;

    move-result-object v4

    if-nez v4, :cond_3

    :cond_2
    iget-object v4, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->defaultEasing:Landroidx/compose/animation/core/Easing;

    .line 482
    .local v4, "easing":Landroidx/compose/animation/core/Easing;
    :cond_3
    sub-int v5, p2, v1

    int-to-float v5, v5

    int-to-float v6, v3

    div-float/2addr v5, v6

    .line 483
    .local v5, "rawFraction":F
    invoke-interface {v4, v5}, Landroidx/compose/animation/core/Easing;->transform(F)F

    move-result v6

    .line 485
    .local v6, "easedFraction":F
    if-eqz p3, :cond_4

    .line 486
    return v6

    .line 488
    :cond_4
    int-to-float v7, v3

    mul-float/2addr v7, v6

    int-to-float v8, v1

    add-float/2addr v7, v8

    div-float/2addr v7, v0

    return v7
.end method

.method private final init(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V
    .locals 12
    .param p1, "initialValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p2, "targetValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p3, "initialVelocity"    # Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TV;TV;)V"
        }
    .end annotation

    .line 294
    iget-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyArcSpline$p()Landroidx/compose/animation/core/ArcSpline;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 297
    .local v0, "requiresArcSpline":Z
    :goto_0
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->valueVector:Landroidx/compose/animation/core/AnimationVector;

    if-nez v1, :cond_5

    .line 298
    invoke-static {p1}, Landroidx/compose/animation/core/AnimationVectorsKt;->newInstance(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->valueVector:Landroidx/compose/animation/core/AnimationVector;

    .line 299
    invoke-static {p3}, Landroidx/compose/animation/core/AnimationVectorsKt;->newInstance(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->velocityVector:Landroidx/compose/animation/core/AnimationVector;

    .line 301
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    .local v1, "this_$iv":Landroidx/collection/IntList;
    const/4 v3, 0x0

    .line 1043
    .local v3, "$i$f$getSize":I
    iget v1, v1, Landroidx/collection/IntList;->_size:I

    .line 301
    .end local v1    # "this_$iv":Landroidx/collection/IntList;
    .end local v3    # "$i$f$getSize":I
    new-array v3, v1, [F

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_1

    iget-object v5, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    invoke-virtual {v5, v4}, Landroidx/collection/IntList;->get(I)I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x447a0000    # 1000.0f

    div-float/2addr v5, v6

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iput-object v3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->times:[F

    .line 303
    nop

    .line 304
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    .restart local v1    # "this_$iv":Landroidx/collection/IntList;
    const/4 v3, 0x0

    .line 1044
    .restart local v3    # "$i$f$getSize":I
    iget v1, v1, Landroidx/collection/IntList;->_size:I

    .line 304
    .end local v1    # "this_$iv":Landroidx/collection/IntList;
    .end local v3    # "$i$f$getSize":I
    new-array v3, v1, [I

    move v4, v2

    :goto_2
    if-ge v4, v1, :cond_4

    .line 305
    iget-object v5, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    iget-object v6, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    invoke-virtual {v6, v4}, Landroidx/collection/IntList;->get(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;->getArcMode--9T-Mq4()I

    move-result v5

    goto :goto_3

    :cond_2
    iget v5, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->initialArcMode:I

    .line 306
    .local v5, "mode":I
    :goto_3
    sget-object v6, Landroidx/compose/animation/core/ArcMode;->Companion:Landroidx/compose/animation/core/ArcMode$Companion;

    invoke-virtual {v6}, Landroidx/compose/animation/core/ArcMode$Companion;->getArcLinear--9T-Mq4()I

    move-result v6

    invoke-static {v5, v6}, Landroidx/compose/animation/core/ArcMode;->equals-impl0(II)Z

    move-result v6

    if-nez v6, :cond_3

    .line 307
    const/4 v0, 0x1

    .line 310
    :cond_3
    nop

    .end local v5    # "mode":I
    aput v5, v3, v4

    .line 304
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 303
    :cond_4
    iput-object v3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->modes:[I

    .line 314
    :cond_5
    if-nez v0, :cond_6

    .line 315
    return-void

    .line 319
    :cond_6
    nop

    .line 320
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyArcSpline$p()Landroidx/compose/animation/core/ArcSpline;

    move-result-object v3

    if-eq v1, v3, :cond_7

    .line 321
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->lastInitialValue:Landroidx/compose/animation/core/AnimationVector;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 322
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->lastTargetValue:Landroidx/compose/animation/core/AnimationVector;

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    .line 324
    :cond_7
    iput-object p1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->lastInitialValue:Landroidx/compose/animation/core/AnimationVector;

    .line 325
    iput-object p2, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->lastTargetValue:Landroidx/compose/animation/core/AnimationVector;

    .line 328
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationVector;->getSize$animation_core_release()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2

    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationVector;->getSize$animation_core_release()I

    move-result v3

    add-int/2addr v1, v3

    .line 329
    .local v1, "dimensionCount":I
    new-array v3, v1, [F

    iput-object v3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->posArray:[F

    .line 330
    new-array v3, v1, [F

    iput-object v3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->slopeArray:[F

    .line 335
    iget-object v3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    .local v3, "this_$iv":Landroidx/collection/IntList;
    const/4 v4, 0x0

    .line 1045
    .local v4, "$i$f$getSize":I
    iget v3, v3, Landroidx/collection/IntList;->_size:I

    .line 335
    .end local v3    # "this_$iv":Landroidx/collection/IntList;
    .end local v4    # "$i$f$getSize":I
    new-array v4, v3, [[F

    move v5, v2

    :goto_4
    if-ge v5, v3, :cond_c

    .line 336
    iget-object v6, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    invoke-virtual {v6, v5}, Landroidx/collection/IntList;->get(I)I

    move-result v6

    .line 337
    .local v6, "timestamp":I
    iget-object v7, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v7, v6}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    .line 340
    .local v7, "info":Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;
    if-nez v6, :cond_8

    if-nez v7, :cond_8

    .line 341
    new-array v8, v1, [F

    move v9, v2

    :goto_5
    if-ge v9, v1, :cond_b

    invoke-virtual {p1, v9}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v10

    aput v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    .line 342
    :cond_8
    invoke-virtual {p0}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->getDurationMillis()I

    move-result v8

    if-ne v6, v8, :cond_9

    if-nez v7, :cond_9

    .line 343
    new-array v8, v1, [F

    move v9, v2

    :goto_6
    if-ge v9, v1, :cond_b

    invoke-virtual {p2, v9}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v10

    aput v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 346
    :cond_9
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;->getVectorValue()Landroidx/compose/animation/core/AnimationVector;

    move-result-object v8

    .line 347
    .local v8, "vectorValue":Landroidx/compose/animation/core/AnimationVector;
    new-array v9, v1, [F

    move v10, v2

    :goto_7
    if-ge v10, v1, :cond_a

    invoke-virtual {v8, v10}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v11

    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_a
    move-object v8, v9

    .end local v6    # "timestamp":I
    .end local v7    # "info":Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;
    .end local v8    # "vectorValue":Landroidx/compose/animation/core/AnimationVector;
    :cond_b
    aput-object v8, v4, v5

    .line 335
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 334
    :cond_c
    nop

    .line 350
    .local v4, "values":[[F
    new-instance v2, Landroidx/compose/animation/core/ArcSpline;

    iget-object v3, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->modes:[I

    iget-object v5, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->times:[F

    invoke-direct {v2, v3, v5, v4}, Landroidx/compose/animation/core/ArcSpline;-><init>([I[F[[F)V

    iput-object v2, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    .line 352
    .end local v1    # "dimensionCount":I
    .end local v4    # "values":[[F
    :cond_d
    return-void
.end method


# virtual methods
.method public getDelayMillis()I
    .locals 1

    .line 223
    iget v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->delayMillis:I

    return v0
.end method

.method public getDurationMillis()I
    .locals 1

    .line 222
    iget v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->durationMillis:I

    return v0
.end method

.method public getValueFromNanos(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
    .locals 23
    .param p1, "playTimeNanos"    # J
    .param p3, "initialValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p4, "targetValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p5, "initialVelocity"    # Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTV;TV;TV;)TV;"
        }
    .end annotation

    .line 364
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-wide/32 v3, 0xf4240

    div-long v3, p1, v3

    .line 365
    .local v3, "playTimeMillis":J
    move-object v5, v0

    check-cast v5, Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;

    invoke-static {v5, v3, v4}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->clampPlayTime(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J

    move-result-wide v5

    long-to-int v5, v5

    .line 368
    .local v5, "clampedPlayTime":I
    iget-object v6, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v6, v5}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    .line 369
    .local v6, "keyframe":Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;
    if-eqz v6, :cond_0

    .line 370
    invoke-virtual {v6}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;->getVectorValue()Landroidx/compose/animation/core/AnimationVector;

    move-result-object v7

    return-object v7

    .line 373
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->getDurationMillis()I

    move-result v7

    if-lt v5, v7, :cond_1

    .line 374
    return-object v2

    .line 375
    :cond_1
    if-gtz v5, :cond_2

    .line 376
    return-object v1

    .line 379
    :cond_2
    move-object/from16 v7, p5

    invoke-direct {v0, v1, v2, v7}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->init(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V

    .line 382
    iget-object v8, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->valueVector:Landroidx/compose/animation/core/AnimationVector;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 385
    .local v8, "valueVector":Landroidx/compose/animation/core/AnimationVector;
    iget-object v9, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyArcSpline$p()Landroidx/compose/animation/core/ArcSpline;

    move-result-object v10

    if-eq v9, v10, :cond_4

    .line 387
    invoke-direct {v0, v5}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->getEasedTime(I)F

    move-result v9

    .line 389
    .local v9, "easedTime":F
    iget-object v10, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->posArray:[F

    .line 390
    .local v10, "posArray":[F
    iget-object v11, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    invoke-virtual {v11, v9, v10}, Landroidx/compose/animation/core/ArcSpline;->getPos(F[F)V

    .line 391
    const/4 v11, 0x0

    .local v11, "i":I
    array-length v12, v10

    :goto_0
    if-ge v11, v12, :cond_3

    .line 392
    aget v13, v10, v11

    invoke-virtual {v8, v11, v13}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 391
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 394
    .end local v11    # "i":I
    :cond_3
    return-object v8

    .line 398
    .end local v9    # "easedTime":F
    .end local v10    # "posArray":[F
    :cond_4
    invoke-direct {v0, v5}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->findEntryForTimeMillis(I)I

    move-result v9

    .line 401
    .local v9, "index":I
    const/4 v10, 0x1

    invoke-direct {v0, v9, v5, v10}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->getEasedTimeFromIndex(IIZ)F

    move-result v10

    .line 403
    .local v10, "easedTime":F
    iget-object v11, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    invoke-virtual {v11, v9}, Landroidx/collection/IntList;->get(I)I

    move-result v11

    .line 404
    .local v11, "timestampStart":I
    iget-object v12, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v12, v11}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    .line 408
    .local v12, "startKeyframe":Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;
    if-eqz v12, :cond_5

    invoke-virtual {v12}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;->getVectorValue()Landroidx/compose/animation/core/AnimationVector;

    move-result-object v13

    if-nez v13, :cond_6

    :cond_5
    move-object v13, v1

    .line 410
    .local v13, "startValue":Landroidx/compose/animation/core/AnimationVector;
    :cond_6
    iget-object v14, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->timestamps:Landroidx/collection/IntList;

    add-int/lit8 v15, v9, 0x1

    invoke-virtual {v14, v15}, Landroidx/collection/IntList;->get(I)I

    move-result v14

    .line 411
    .local v14, "timestampEnd":I
    iget-object v15, v0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->keyframes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v15, v14}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;

    .line 415
    .local v15, "endKeyframe":Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;
    if-eqz v15, :cond_7

    invoke-virtual {v15}, Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;->getVectorValue()Landroidx/compose/animation/core/AnimationVector;

    move-result-object v16

    if-nez v16, :cond_8

    :cond_7
    move-object/from16 v16, v2

    :cond_8
    move-object/from16 v17, v16

    .line 417
    .local v17, "endValue":Landroidx/compose/animation/core/AnimationVector;
    const/16 v16, 0x0

    .local v16, "i":I
    invoke-virtual {v8}, Landroidx/compose/animation/core/AnimationVector;->getSize$animation_core_release()I

    move-result v0

    move/from16 v1, v16

    .end local v16    # "i":I
    .local v1, "i":I
    :goto_1
    if-ge v1, v0, :cond_9

    .line 418
    invoke-virtual {v13, v1}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v16

    move/from16 v18, v0

    move-object/from16 v0, v17

    .end local v17    # "endValue":Landroidx/compose/animation/core/AnimationVector;
    .local v0, "endValue":Landroidx/compose/animation/core/AnimationVector;
    .local v16, "start$iv":F
    invoke-virtual {v0, v1}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v17

    .local v17, "stop$iv":F
    const/16 v19, 0x0

    .line 1046
    .local v19, "$i$f$lerp":I
    const/high16 v20, 0x3f800000    # 1.0f

    sub-float v20, v20, v10

    mul-float v20, v20, v16

    mul-float v21, v17, v10

    move-object/from16 v22, v0

    .end local v0    # "endValue":Landroidx/compose/animation/core/AnimationVector;
    .local v22, "endValue":Landroidx/compose/animation/core/AnimationVector;
    add-float v0, v20, v21

    .line 418
    .end local v16    # "start$iv":F
    .end local v17    # "stop$iv":F
    .end local v19    # "$i$f$lerp":I
    invoke-virtual {v8, v1, v0}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 417
    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v18

    move-object/from16 v17, v22

    goto :goto_1

    .line 420
    .end local v1    # "i":I
    .end local v22    # "endValue":Landroidx/compose/animation/core/AnimationVector;
    .local v17, "endValue":Landroidx/compose/animation/core/AnimationVector;
    :cond_9
    return-object v8
.end method

.method public getVelocityFromNanos(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
    .locals 13
    .param p1, "playTimeNanos"    # J
    .param p3, "initialValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p4, "targetValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p5, "initialVelocity"    # Landroidx/compose/animation/core/AnimationVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTV;TV;TV;)TV;"
        }
    .end annotation

    .line 429
    move-object/from16 v5, p5

    const-wide/32 v0, 0xf4240

    div-long v6, p1, v0

    .line 430
    .local v6, "playTimeMillis":J
    move-object v0, p0

    check-cast v0, Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;

    invoke-static {v0, v6, v7}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->clampPlayTime(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J

    move-result-wide v8

    .line 431
    .local v8, "clampedPlayTime":J
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-gez v0, :cond_0

    .line 432
    return-object v5

    .line 435
    :cond_0
    move-object/from16 v3, p3

    move-object/from16 v4, p4

    invoke-direct {p0, v3, v4, v5}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->init(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V

    .line 438
    iget-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->velocityVector:Landroidx/compose/animation/core/AnimationVector;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v10, v0

    .line 441
    .local v10, "velocityVector":Landroidx/compose/animation/core/AnimationVector;
    iget-object v0, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    invoke-static {}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->access$getEmptyArcSpline$p()Landroidx/compose/animation/core/ArcSpline;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 442
    long-to-int v0, v8

    invoke-direct {p0, v0}, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->getEasedTime(I)F

    move-result v0

    .line 443
    .local v0, "easedTime":F
    iget-object v1, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->slopeArray:[F

    .line 444
    .local v1, "slopeArray":[F
    iget-object v2, p0, Landroidx/compose/animation/core/VectorizedKeyframesSpec;->arcSpline:Landroidx/compose/animation/core/ArcSpline;

    invoke-virtual {v2, v0, v1}, Landroidx/compose/animation/core/ArcSpline;->getSlope(F[F)V

    .line 445
    const/4 v2, 0x0

    .local v2, "i":I
    array-length v11, v1

    :goto_0
    if-ge v2, v11, :cond_1

    .line 446
    aget v12, v1, v2

    invoke-virtual {v10, v2, v12}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 445
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 448
    .end local v2    # "i":I
    :cond_1
    return-object v10

    .line 453
    .end local v0    # "easedTime":F
    .end local v1    # "slopeArray":[F
    :cond_2
    move-object v0, p0

    check-cast v0, Landroidx/compose/animation/core/VectorizedAnimationSpec;

    const-wide/16 v1, 0x1

    sub-long v1, v8, v1

    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->getValueFromMillis(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object v0

    .line 452
    move-object v11, v0

    .line 454
    .local v11, "startNum":Landroidx/compose/animation/core/AnimationVector;
    move-object v0, p0

    check-cast v0, Landroidx/compose/animation/core/VectorizedAnimationSpec;

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-wide v1, v8

    .end local v8    # "clampedPlayTime":J
    .local v1, "clampedPlayTime":J
    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/core/VectorizedAnimationSpecKt;->getValueFromMillis(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object v0

    .line 455
    .local v0, "endNum":Landroidx/compose/animation/core/AnimationVector;
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-virtual {v11}, Landroidx/compose/animation/core/AnimationVector;->getSize$animation_core_release()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_3

    .line 456
    invoke-virtual {v11, v3}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v5

    invoke-virtual {v0, v3}, Landroidx/compose/animation/core/AnimationVector;->get$animation_core_release(I)F

    move-result v8

    sub-float/2addr v5, v8

    const/high16 v8, 0x447a0000    # 1000.0f

    mul-float/2addr v5, v8

    invoke-virtual {v10, v3, v5}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 455
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 458
    .end local v3    # "i":I
    :cond_3
    return-object v10
.end method
