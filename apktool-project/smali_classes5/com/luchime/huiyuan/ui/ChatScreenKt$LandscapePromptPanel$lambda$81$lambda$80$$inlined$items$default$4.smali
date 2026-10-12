.class public final Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/ChatScreenKt;->LandscapePromptPanel(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ChatScreen.kt\ncom/luchime/huiyuan/ui/ChatScreenKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n616#2,5:181\n621#2:188\n624#2:195\n625#2,2:197\n638#2:199\n118#3:186\n113#3:187\n113#3:196\n1247#4,6:189\n*S KotlinDebug\n*F\n+ 1 ChatScreen.kt\ncom/luchime/huiyuan/ui/ChatScreenKt\n*L\n620#1:186\n620#1:187\n624#1:196\n621#1:189,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $enabled$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onPrompt$inlined:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-boolean p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$enabled$inlined:Z

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$onPrompt$inlined:Lkotlin/jvm/functions/Function1;

    const/4 p2, 0x4

    invoke-direct {p0, p2}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;
    .param p4, "p4"    # Ljava/lang/Object;

    .line 178
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move-object v2, p3

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 25
    .param p1, "$this$items"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "it"    # I
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "C178@8826L22:LazyDsl.kt#428nma"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p4

    .local v3, "$dirty":I
    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p1

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move-object/from16 v4, p1

    :goto_1
    and-int/lit8 v5, p4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    .line 179
    :cond_3
    and-int/lit16 v5, v3, 0x93

    const/16 v7, 0x92

    const/4 v9, 0x1

    if-eq v5, v7, :cond_4

    move v5, v9

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-interface {v2, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, -0x1

    const-string v7, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"

    const v10, -0x25b7f321

    invoke-static {v10, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object v5, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v7, v3, 0xe

    .local v7, "$changed\\1":I
    check-cast v5, Ljava/lang/String;

    .local v5, "prompt\\1":Ljava/lang/String;
    move-object/from16 v10, p1

    .local v10, "$this$LandscapePromptPanel_u24lambda_u2481_u24lambda_u2480_u24lambda_u2479\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    move-object/from16 v11, p3

    .local v11, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v24, 0x0

    .line 181
    .local v24, "$i$a$-items$default-ChatScreenKt$LandscapePromptPanel$1$1$5\\1\\179\\0":I
    const v12, 0x40eaf88a

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v12, "C*620@23204L64,625@23371L424,615@22917L878:ChatScreen.kt#cyjvf"

    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 182
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v12, Landroidx/compose/ui/Modifier;

    .line 183
    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v12, v13, v9, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    .line 184
    iget-boolean v13, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$enabled$inlined:Z

    if-eqz v13, :cond_6

    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_6
    const v13, 0x3f0ccccd    # 0.55f

    :goto_4
    invoke-static {v12, v13}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v12

    .line 185
    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    .local v13, "$this$dp\\2":D
    const/4 v15, 0x0

    .line 186
    .local v15, "$i$f$getDp\\2\\185":I
    double-to-float v8, v13

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 185
    .end local v13    # "$this$dp\\2":D
    .end local v15    # "$i$f$getDp\\2\\185":I
    invoke-static {}, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;->getInk()J

    move-result-wide v13

    const/16 v15, 0xa

    .local v15, "$this$dp\\3":I
    const/16 v17, 0x0

    .line 187
    .local v17, "$i$f$getDp\\3\\185":I
    int-to-float v9, v15

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v9

    .line 185
    .end local v15    # "$this$dp\\3":I
    .end local v17    # "$i$f$getDp\\3\\185":I
    invoke-static {v9}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/graphics/Shape;

    invoke-static {v12, v8, v13, v14, v9}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 188
    iget-boolean v9, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$enabled$inlined:Z

    sget-object v12, Lcom/luchime/huiyuan/ui/HapticCue;->SELECTION:Lcom/luchime/huiyuan/ui/HapticCue;

    const v13, 0x23207b4b

    const-string v14, "CC(remember):ChatScreen.kt#9igjgp"

    invoke-static {v11, v13, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v13, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$onPrompt$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v14, v7, 0x70

    xor-int/lit8 v14, v14, 0x30

    if-le v14, v6, :cond_7

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    :cond_7
    and-int/lit8 v14, v7, 0x30

    if-ne v14, v6, :cond_9

    :cond_8
    const/16 v16, 0x1

    goto :goto_5

    :cond_9
    const/16 v16, 0x0

    :goto_5
    or-int v6, v13, v16

    .local v6, "invalid\\4":Z
    move-object v13, v11

    .local v13, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 189
    .local v14, "$i$f$cache\\4\\188":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it\\4":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 190
    .local v16, "$i$a$-let-ComposerKt$cache$1\\5\\189\\4":I
    if-nez v6, :cond_b

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v15, v1, :cond_a

    goto :goto_6

    .line 194
    :cond_a
    goto :goto_7

    .line 191
    :cond_b
    :goto_6
    const/4 v1, 0x0

    .line 188
    .local v1, "$i$a$-cache-ChatScreenKt$LandscapePromptPanel$1$1$5$1\\6\\191\\1":I
    move/from16 v17, v1

    .end local v1    # "$i$a$-cache-ChatScreenKt$LandscapePromptPanel$1$1$5$1\\6\\191\\1":I
    .local v17, "$i$a$-cache-ChatScreenKt$LandscapePromptPanel$1$1$5$1\\6\\191\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;

    iget-object v2, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4;->$onPrompt$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, v5}, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 191
    .end local v17    # "$i$a$-cache-ChatScreenKt$LandscapePromptPanel$1$1$5$1\\6\\191\\1":I
    nop

    .line 192
    .local v1, "value\\5":Ljava/lang/Object;
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 193
    move-object v15, v1

    .line 189
    .end local v1    # "value\\5":Ljava/lang/Object;
    .end local v15    # "it\\4":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\5\\189\\4":I
    :goto_7
    nop

    .line 188
    .end local v6    # "invalid\\4":Z
    .end local v13    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache\\4\\188":I
    check-cast v15, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v8, v9, v12, v15}, Lcom/luchime/huiyuan/ui/AppHapticsKt;->hapticClickable(Landroidx/compose/ui/Modifier;ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 195
    const/16 v2, 0xa

    .local v2, "$this$dp\\7":I
    const/4 v6, 0x0

    .line 196
    .local v6, "$i$f$getDp\\7\\195":I
    int-to-float v8, v2

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 195
    .end local v2    # "$this$dp\\7":I
    .end local v6    # "$i$f$getDp\\7\\195":I
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroidx/compose/ui/graphics/Shape;

    .line 197
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v13

    .line 198
    new-instance v2, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$2;

    invoke-direct {v2, v5}, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$2;-><init>(Ljava/lang/String;)V

    const/16 v6, 0x36

    const v8, -0x75f7ffba

    const/4 v9, 0x1

    invoke-static {v8, v9, v2, v11, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lkotlin/jvm/functions/Function2;

    .line 181
    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, 0xc00180

    const/16 v23, 0x78

    move-object/from16 v21, v11

    move-object v11, v1

    .end local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v21, "$composer\\1":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v23}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 199
    nop

    .line 179
    .end local v5    # "prompt\\1":Ljava/lang/String;
    .end local v7    # "$changed\\1":I
    .end local v10    # "$this$LandscapePromptPanel_u24lambda_u2481_u24lambda_u2480_u24lambda_u2479\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v21    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v24    # "$i$a$-items$default-ChatScreenKt$LandscapePromptPanel$1$1$5\\1\\179\\0":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_8

    :cond_c
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    :cond_d
    :goto_8
    return-void
.end method
