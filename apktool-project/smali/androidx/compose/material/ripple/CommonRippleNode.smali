.class public final Landroidx/compose/material/ripple/CommonRippleNode;
.super Landroidx/compose/material/ripple/RippleNode;
.source "CommonRipple.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n357#2,4:174\n329#2,6:178\n339#2,3:185\n342#2,9:189\n361#2:198\n357#2,4:199\n329#2,6:203\n339#2,3:210\n342#2,2:214\n345#2,6:217\n361#2:223\n1399#3:184\n1270#3:188\n1399#3:209\n1270#3:213\n1#4:216\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n*L\n75#1:174,4\n75#1:178,6\n75#1:185,3\n75#1:189,9\n75#1:198\n98#1:199,4\n98#1:203,6\n98#1:210,3\n98#1:214,2\n98#1:217,6\n98#1:223\n75#1:184\n75#1:188\n98#1:209\n98#1:213\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0002\u0010\rJ*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u000c\u0010\u001d\u001a\u00020\u0013*\u00020\u001eH\u0016R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/material/ripple/CommonRippleNode;",
        "Landroidx/compose/material/ripple/RippleNode;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "bounded",
        "",
        "radius",
        "Landroidx/compose/ui/unit/Dp;",
        "color",
        "Landroidx/compose/ui/graphics/ColorProducer;",
        "rippleAlpha",
        "Lkotlin/Function0;",
        "Landroidx/compose/material/ripple/RippleAlpha;",
        "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "ripples",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
        "Landroidx/compose/material/ripple/RippleAnimation;",
        "addRipple",
        "",
        "interaction",
        "size",
        "Landroidx/compose/ui/geometry/Size;",
        "targetRadius",
        "",
        "addRipple-12SF9DM",
        "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V",
        "onDetach",
        "removeRipple",
        "drawRipples",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "material-ripple_release"
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
.field private final ripples:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
            "Landroidx/compose/material/ripple/RippleAnimation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/material/ripple/CommonRippleNode;->$stable:I

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)V
    .locals 7
    .param p1, "interactionSource"    # Landroidx/compose/foundation/interaction/InteractionSource;
    .param p2, "bounded"    # Z
    .param p3, "radius"    # F
    .param p4, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p5, "rippleAlpha"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "ZF",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/material/ripple/RippleAlpha;",
            ">;)V"
        }
    .end annotation

    .line 70
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .end local p1    # "interactionSource":Landroidx/compose/foundation/interaction/InteractionSource;
    .end local p2    # "bounded":Z
    .end local p3    # "radius":F
    .end local p4    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local p5    # "rippleAlpha":Lkotlin/jvm/functions/Function0;
    .local v1, "interactionSource":Landroidx/compose/foundation/interaction/InteractionSource;
    .local v2, "bounded":Z
    .local v3, "radius":F
    .local v4, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v5, "rippleAlpha":Lkotlin/jvm/functions/Function0;
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/ripple/RippleNode;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    new-instance p1, Landroidx/collection/MutableScatterMap;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p2, p3}, Landroidx/collection/MutableScatterMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 64
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/material/ripple/CommonRippleNode;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic access$getRipples$p(Landroidx/compose/material/ripple/CommonRippleNode;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/material/ripple/CommonRippleNode;

    .line 64
    iget-object v0, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method


# virtual methods
.method public addRipple-12SF9DM(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V
    .locals 21
    .param p1, "interaction"    # Landroidx/compose/foundation/interaction/PressInteraction$Press;
    .param p2, "size"    # J
    .param p4, "targetRadius"    # F

    .line 75
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    check-cast v2, Landroidx/collection/ScatterMap;

    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v3, 0x0

    .line 174
    .local v3, "$i$f$forEach":I
    iget-object v4, v2, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 175
    .local v4, "k$iv":[Ljava/lang/Object;
    iget-object v5, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 177
    .local v5, "v$iv":[Ljava/lang/Object;
    move-object v6, v2

    .local v6, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v7, 0x0

    .line 178
    .local v7, "$i$f$forEachIndexed":I
    iget-object v8, v6, Landroidx/collection/ScatterMap;->metadata:[J

    .line 179
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 181
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_4

    .line 182
    :goto_0
    aget-wide v11, v8, v10

    .line 183
    .local v11, "slot$iv$iv":J
    move-wide v13, v11

    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v15, 0x0

    .line 184
    .local v15, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v16, v2

    move/from16 v17, v3

    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "$i$f$forEach":I
    .local v16, "this_$iv":Landroidx/collection/ScatterMap;
    .local v17, "$i$f$forEach":I
    not-long v2, v13

    const/16 v18, 0x7

    shl-long v2, v2, v18

    and-long/2addr v2, v13

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v18

    .line 183
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v15    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v18

    if-eqz v2, :cond_3

    .line 185
    sub-int v2, v10, v9

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 186
    .local v2, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v2, :cond_2

    .line 187
    const-wide/16 v14, 0xff

    and-long/2addr v14, v11

    .local v14, "value$iv$iv$iv":J
    const/16 v18, 0x0

    .line 188
    .local v18, "$i$f$isFull":I
    const-wide/16 v19, 0x80

    cmp-long v19, v14, v19

    if-gez v19, :cond_0

    const/16 v19, 0x1

    goto :goto_2

    :cond_0
    const/16 v19, 0x0

    .line 187
    .end local v14    # "value$iv$iv$iv":J
    .end local v18    # "$i$f$isFull":I
    :goto_2
    if-eqz v19, :cond_1

    .line 189
    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    .line 190
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v18, 0x0

    .line 177
    .local v18, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    aget-object v19, v4, v15

    aget-object v20, v5, v15

    check-cast v20, Landroidx/compose/material/ripple/RippleAnimation;

    .local v20, "ripple":Landroidx/compose/material/ripple/RippleAnimation;
    check-cast v19, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    const/16 v19, 0x0

    .line 75
    .local v19, "$i$a$-forEach-CommonRippleNode$addRipple$1":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material/ripple/RippleAnimation;->finish()V

    .line 177
    .end local v19    # "$i$a$-forEach-CommonRippleNode$addRipple$1":I
    .end local v20    # "ripple":Landroidx/compose/material/ripple/RippleAnimation;
    nop

    .line 190
    .end local v15    # "index$iv":I
    .end local v18    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    nop

    .line 192
    .end local v14    # "index$iv$iv":I
    :cond_1
    shr-long/2addr v11, v3

    .line 186
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 194
    .end local v13    # "j$iv$iv":I
    :cond_2
    if-ne v2, v3, :cond_6

    .line 181
    .end local v2    # "bitCount$iv$iv":I
    .end local v11    # "slot$iv$iv":J
    :cond_3
    if-eq v10, v9, :cond_5

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v16

    move/from16 v3, v17

    goto :goto_0

    .end local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v17    # "$i$f$forEach":I
    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "$i$f$forEach":I
    :cond_4
    move-object/from16 v16, v2

    move/from16 v17, v3

    .line 197
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "$i$f$forEach":I
    .end local v10    # "i$iv$iv":I
    .restart local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v17    # "$i$f$forEach":I
    :cond_5
    nop

    .line 198
    .end local v6    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 76
    .end local v4    # "k$iv":[Ljava/lang/Object;
    .end local v5    # "v$iv":[Ljava/lang/Object;
    .end local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v17    # "$i$f$forEach":I
    invoke-virtual {v0}, Landroidx/compose/material/ripple/CommonRippleNode;->getBounded()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Landroidx/compose/foundation/interaction/PressInteraction$Press;->getPressPosition-F1C5BW0()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    goto :goto_3

    :cond_7
    move-object v2, v3

    .line 78
    .local v2, "origin":Landroidx/compose/ui/geometry/Offset;
    :goto_3
    new-instance v4, Landroidx/compose/material/ripple/RippleAnimation;

    invoke-virtual {v0}, Landroidx/compose/material/ripple/CommonRippleNode;->getBounded()Z

    move-result v5

    move/from16 v6, p4

    invoke-direct {v4, v2, v6, v5, v3}, Landroidx/compose/material/ripple/RippleAnimation;-><init>(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    nop

    .line 79
    .local v4, "rippleAnimation":Landroidx/compose/material/ripple/RippleAnimation;
    iget-object v5, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v5, v1, v4}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    invoke-virtual {v0}, Landroidx/compose/material/ripple/CommonRippleNode;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v7

    new-instance v5, Landroidx/compose/material/ripple/CommonRippleNode$addRipple$2;

    invoke-direct {v5, v4, v0, v1, v3}, Landroidx/compose/material/ripple/CommonRippleNode$addRipple$2;-><init>(Landroidx/compose/material/ripple/RippleAnimation;Landroidx/compose/material/ripple/CommonRippleNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/Continuation;)V

    move-object v10, v5

    check-cast v10, Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 88
    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/node/DrawModifierNode;

    invoke-static {v3}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 89
    return-void
.end method

.method public drawRipples(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 32
    .param p1, "$this$drawRipples"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 96
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material/ripple/CommonRippleNode;->getRippleAlpha()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material/ripple/RippleAlpha;

    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleAlpha;->getPressedAlpha()F

    move-result v3

    .line 97
    .local v3, "alpha":F
    const/4 v0, 0x0

    cmpg-float v0, v3, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_8

    .line 98
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    move-object v11, v1

    check-cast v11, Landroidx/collection/ScatterMap;

    .local v11, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v12, 0x0

    .line 199
    .local v12, "$i$f$forEach":I
    iget-object v13, v11, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 200
    .local v13, "k$iv":[Ljava/lang/Object;
    iget-object v14, v11, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 202
    .local v14, "v$iv":[Ljava/lang/Object;
    move-object v15, v11

    .local v15, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/16 v16, 0x0

    .line 203
    .local v16, "$i$f$forEachIndexed":I
    iget-object v1, v15, Landroidx/collection/ScatterMap;->metadata:[J

    .line 204
    .local v1, "m$iv$iv":[J
    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    .line 206
    .local v2, "lastIndex$iv$iv":I
    const/4 v4, 0x0

    .local v4, "i$iv$iv":I
    if-gt v4, v2, :cond_5

    .line 207
    :goto_1
    aget-wide v5, v1, v4

    .line 208
    .local v5, "slot$iv$iv":J
    move-wide v7, v5

    .local v7, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v17, 0x0

    .line 209
    .local v17, "$i$f$maskEmptyOrDeleted":I
    not-long v9, v7

    const/16 v18, 0x7

    shl-long v9, v9, v18

    and-long/2addr v9, v7

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v9, v18

    .line 208
    .end local v7    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v17    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v7, v7, v18

    if-eqz v7, :cond_4

    .line 210
    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v10, v7, 0x8

    .line 211
    .local v10, "bitCount$iv$iv":I
    const/4 v7, 0x0

    move-wide/from16 v18, v5

    move v5, v7

    .local v5, "j$iv$iv":I
    .local v18, "slot$iv$iv":J
    :goto_2
    if-ge v5, v10, :cond_3

    .line 212
    const-wide/16 v6, 0xff

    and-long v6, v18, v6

    .local v6, "value$iv$iv$iv":J
    const/4 v8, 0x0

    .line 213
    .local v8, "$i$f$isFull":I
    const-wide/16 v20, 0x80

    cmp-long v17, v6, v20

    if-gez v17, :cond_1

    const/4 v6, 0x1

    goto :goto_3

    :cond_1
    const/4 v6, 0x0

    .line 212
    .end local v6    # "value$iv$iv$iv":J
    .end local v8    # "$i$f$isFull":I
    :goto_3
    if-eqz v6, :cond_2

    .line 214
    shl-int/lit8 v6, v4, 0x3

    add-int v17, v6, v5

    .line 215
    .local v17, "index$iv$iv":I
    move/from16 v20, v17

    .local v20, "index$iv":I
    const/16 v21, 0x0

    .line 202
    .local v21, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    aget-object v6, v13, v20

    aget-object v7, v14, v20

    move-object/from16 v22, v7

    check-cast v22, Landroidx/compose/material/ripple/RippleAnimation;

    .local v22, "ripple":Landroidx/compose/material/ripple/RippleAnimation;
    check-cast v6, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    const/16 v23, 0x0

    .line 98
    .local v23, "$i$a$-forEach-CommonRippleNode$drawRipples$1":I
    move-object/from16 v6, v22

    .line 216
    .local v6, "$this$drawRipples_u24lambda_u242_u24lambda_u241":Landroidx/compose/material/ripple/RippleAnimation;
    const/16 v24, 0x0

    .line 98
    .local v24, "$i$a$-with-CommonRippleNode$drawRipples$1$1":I
    move-object v7, v1

    move v8, v2

    .end local v1    # "m$iv$iv":[J
    .end local v2    # "lastIndex$iv$iv":I
    .local v7, "m$iv$iv":[J
    .local v8, "lastIndex$iv$iv":I
    invoke-virtual {v0}, Landroidx/compose/material/ripple/CommonRippleNode;->getRippleColor-0d7_KjU()J

    move-result-wide v1

    move-object/from16 v25, v7

    .end local v7    # "m$iv$iv":[J
    .local v25, "m$iv$iv":[J
    const/16 v7, 0xe

    move/from16 v26, v8

    .end local v8    # "lastIndex$iv$iv":I
    .local v26, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    move/from16 v27, v4

    .end local v4    # "i$iv$iv":I
    .local v27, "i$iv$iv":I
    const/4 v4, 0x0

    move/from16 v28, v5

    .end local v5    # "j$iv$iv":I
    .local v28, "j$iv$iv":I
    const/4 v5, 0x0

    move-object/from16 v29, v6

    .end local v6    # "$this$drawRipples_u24lambda_u242_u24lambda_u241":Landroidx/compose/material/ripple/RippleAnimation;
    .local v29, "$this$drawRipples_u24lambda_u242_u24lambda_u241":Landroidx/compose/material/ripple/RippleAnimation;
    const/4 v6, 0x0

    move/from16 v30, v26

    move/from16 v31, v27

    move/from16 v26, v9

    move-object/from16 v9, v29

    .end local v26    # "lastIndex$iv$iv":I
    .end local v27    # "i$iv$iv":I
    .end local v29    # "$this$drawRipples_u24lambda_u242_u24lambda_u241":Landroidx/compose/material/ripple/RippleAnimation;
    .local v9, "$this$drawRipples_u24lambda_u242_u24lambda_u241":Landroidx/compose/material/ripple/RippleAnimation;
    .local v30, "lastIndex$iv$iv":I
    .local v31, "i$iv$iv":I
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move v7, v3

    move-object/from16 v3, p1

    .end local v3    # "alpha":F
    .local v7, "alpha":F
    invoke-virtual {v9, v3, v1, v2}, Landroidx/compose/material/ripple/RippleAnimation;->draw-4WTKRHQ(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V

    .line 202
    .end local v9    # "$this$drawRipples_u24lambda_u242_u24lambda_u241":Landroidx/compose/material/ripple/RippleAnimation;
    .end local v22    # "ripple":Landroidx/compose/material/ripple/RippleAnimation;
    .end local v23    # "$i$a$-forEach-CommonRippleNode$drawRipples$1":I
    .end local v24    # "$i$a$-with-CommonRippleNode$drawRipples$1$1":I
    nop

    .line 215
    .end local v20    # "index$iv":I
    .end local v21    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    goto :goto_4

    .line 212
    .end local v7    # "alpha":F
    .end local v17    # "index$iv$iv":I
    .end local v25    # "m$iv$iv":[J
    .end local v28    # "j$iv$iv":I
    .end local v30    # "lastIndex$iv$iv":I
    .end local v31    # "i$iv$iv":I
    .restart local v1    # "m$iv$iv":[J
    .restart local v2    # "lastIndex$iv$iv":I
    .restart local v3    # "alpha":F
    .restart local v4    # "i$iv$iv":I
    .restart local v5    # "j$iv$iv":I
    :cond_2
    move-object/from16 v25, v1

    move/from16 v30, v2

    move v7, v3

    move/from16 v31, v4

    move/from16 v28, v5

    move/from16 v26, v9

    move-object/from16 v3, p1

    .line 217
    .end local v1    # "m$iv$iv":[J
    .end local v2    # "lastIndex$iv$iv":I
    .end local v3    # "alpha":F
    .end local v4    # "i$iv$iv":I
    .end local v5    # "j$iv$iv":I
    .restart local v7    # "alpha":F
    .restart local v25    # "m$iv$iv":[J
    .restart local v28    # "j$iv$iv":I
    .restart local v30    # "lastIndex$iv$iv":I
    .restart local v31    # "i$iv$iv":I
    :goto_4
    shr-long v18, v18, v26

    .line 211
    add-int/lit8 v5, v28, 0x1

    move v3, v7

    move-object/from16 v1, v25

    move/from16 v9, v26

    move/from16 v2, v30

    move/from16 v4, v31

    .end local v28    # "j$iv$iv":I
    .restart local v5    # "j$iv$iv":I
    goto :goto_2

    .end local v7    # "alpha":F
    .end local v25    # "m$iv$iv":[J
    .end local v30    # "lastIndex$iv$iv":I
    .end local v31    # "i$iv$iv":I
    .restart local v1    # "m$iv$iv":[J
    .restart local v2    # "lastIndex$iv$iv":I
    .restart local v3    # "alpha":F
    .restart local v4    # "i$iv$iv":I
    :cond_3
    move-object/from16 v25, v1

    move/from16 v30, v2

    move v7, v3

    move/from16 v31, v4

    move/from16 v28, v5

    move/from16 v26, v9

    move-object/from16 v3, p1

    .line 219
    .end local v1    # "m$iv$iv":[J
    .end local v2    # "lastIndex$iv$iv":I
    .end local v3    # "alpha":F
    .end local v4    # "i$iv$iv":I
    .end local v5    # "j$iv$iv":I
    .restart local v7    # "alpha":F
    .restart local v25    # "m$iv$iv":[J
    .restart local v30    # "lastIndex$iv$iv":I
    .restart local v31    # "i$iv$iv":I
    move/from16 v1, v26

    if-ne v10, v1, :cond_7

    goto :goto_5

    .line 208
    .end local v7    # "alpha":F
    .end local v10    # "bitCount$iv$iv":I
    .end local v18    # "slot$iv$iv":J
    .end local v25    # "m$iv$iv":[J
    .end local v30    # "lastIndex$iv$iv":I
    .end local v31    # "i$iv$iv":I
    .restart local v1    # "m$iv$iv":[J
    .restart local v2    # "lastIndex$iv$iv":I
    .restart local v3    # "alpha":F
    .restart local v4    # "i$iv$iv":I
    .local v5, "slot$iv$iv":J
    :cond_4
    move-object/from16 v25, v1

    move/from16 v30, v2

    move v7, v3

    move/from16 v31, v4

    move-object/from16 v3, p1

    .line 206
    .end local v1    # "m$iv$iv":[J
    .end local v2    # "lastIndex$iv$iv":I
    .end local v3    # "alpha":F
    .end local v4    # "i$iv$iv":I
    .end local v5    # "slot$iv$iv":J
    .restart local v7    # "alpha":F
    .restart local v25    # "m$iv$iv":[J
    .restart local v30    # "lastIndex$iv$iv":I
    .restart local v31    # "i$iv$iv":I
    :goto_5
    move/from16 v8, v30

    move/from16 v4, v31

    .end local v30    # "lastIndex$iv$iv":I
    .end local v31    # "i$iv$iv":I
    .restart local v4    # "i$iv$iv":I
    .restart local v8    # "lastIndex$iv$iv":I
    if-eq v4, v8, :cond_6

    add-int/lit8 v4, v4, 0x1

    move v3, v7

    move v2, v8

    move-object/from16 v1, v25

    goto/16 :goto_1

    .end local v7    # "alpha":F
    .end local v8    # "lastIndex$iv$iv":I
    .end local v25    # "m$iv$iv":[J
    .restart local v1    # "m$iv$iv":[J
    .restart local v2    # "lastIndex$iv$iv":I
    .restart local v3    # "alpha":F
    :cond_5
    move-object/from16 v25, v1

    move v8, v2

    move v7, v3

    move-object/from16 v3, p1

    .line 222
    .end local v1    # "m$iv$iv":[J
    .end local v2    # "lastIndex$iv$iv":I
    .end local v3    # "alpha":F
    .end local v4    # "i$iv$iv":I
    .restart local v7    # "alpha":F
    .restart local v8    # "lastIndex$iv$iv":I
    .restart local v25    # "m$iv$iv":[J
    :cond_6
    nop

    .line 223
    .end local v8    # "lastIndex$iv$iv":I
    .end local v15    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v16    # "$i$f$forEachIndexed":I
    .end local v25    # "m$iv$iv":[J
    :cond_7
    goto :goto_6

    .line 97
    .end local v7    # "alpha":F
    .end local v11    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "$i$f$forEach":I
    .end local v13    # "k$iv":[Ljava/lang/Object;
    .end local v14    # "v$iv":[Ljava/lang/Object;
    .restart local v3    # "alpha":F
    :cond_8
    move-object/from16 v0, p0

    move v7, v3

    move-object/from16 v3, p1

    .line 100
    .end local v3    # "alpha":F
    .restart local v7    # "alpha":F
    :goto_6
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 103
    iget-object v0, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 104
    return-void
.end method

.method public removeRipple(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V
    .locals 1
    .param p1, "interaction"    # Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 92
    iget-object v0, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material/ripple/RippleAnimation;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleAnimation;->finish()V

    .line 93
    :cond_0
    return-void
.end method
