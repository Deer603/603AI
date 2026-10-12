.class public final Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->FavoritesScreen(Ljava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 KnowledgeScreens.kt\ncom/luchime/huiyuan/ui/KnowledgeScreensKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n273#2,4:181\n277#2:191\n278#2:198\n279#2:205\n281#2:212\n1247#3,6:185\n1247#3,6:192\n1247#3,6:199\n1247#3,6:206\n*S KotlinDebug\n*F\n+ 1 KnowledgeScreens.kt\ncom/luchime/huiyuan/ui/KnowledgeScreensKt\n*L\n276#1:185,6\n277#1:192,6\n278#1:199,6\n279#1:206,6\n*E\n"
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
.field final synthetic $context$inlined:Landroid/content/Context;

.field final synthetic $isLandscape$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onAsk$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLandroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-boolean p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$isLandscape$inlined:Z

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$onAsk$inlined:Lkotlin/jvm/functions/Function1;

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

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 22
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

    if-eq v5, v7, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-interface {v2, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, -0x1

    const-string v7, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"

    const v10, -0x25b7f321

    invoke-static {v10, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object v5, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v7, v3, 0xe

    .local v7, "$changed\\1":I
    move-object v10, v5

    check-cast v10, Lcom/luchime/huiyuan/FavoriteRecord;

    .local v10, "favorite\\1":Lcom/luchime/huiyuan/FavoriteRecord;
    move-object/from16 v5, p1

    .local v5, "$this$FavoritesScreen_u24lambda_u2454_u24lambda_u2453_u24lambda_u2452\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    move-object/from16 v11, p3

    .local v11, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 181
    .local v18, "$i$a$-items$default-KnowledgeScreensKt$FavoritesScreen$1$1$4\\1\\179\\0":I
    const v12, 0x6cdf9668

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v12, "C*275@11245L36,276@11313L63,277@11409L54,278@11493L38,272@11114L435:KnowledgeScreens.kt#cyjvf"

    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 182
    nop

    .line 183
    iget-boolean v12, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$isLandscape$inlined:Z

    .line 184
    const v13, 0x3d5197cc

    const-string v14, "CC(remember):KnowledgeScreens.kt#9igjgp"

    invoke-static {v11, v13, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v13, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v15, v7, 0x70

    xor-int/lit8 v15, v15, 0x30

    if-le v15, v6, :cond_6

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    :cond_6
    and-int/lit8 v15, v7, 0x30

    if-ne v15, v6, :cond_8

    :cond_7
    const/4 v15, 0x1

    goto :goto_4

    :cond_8
    const/4 v15, 0x0

    :goto_4
    or-int/2addr v13, v15

    .local v13, "invalid\\2":Z
    move-object v15, v11

    .local v15, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 185
    .local v16, "$i$f$cache\\2\\184":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it\\2":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 186
    .local v19, "$i$a$-let-ComposerKt$cache$1\\3\\185\\2":I
    if-nez v13, :cond_a

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_9

    goto :goto_5

    .line 190
    :cond_9
    goto :goto_6

    .line 187
    :cond_a
    :goto_5
    const/4 v9, 0x0

    .line 184
    .local v9, "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$1\\4\\187\\1":I
    new-instance v6, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$1$1;

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-direct {v6, v1, v10}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$1$1;-><init>(Landroid/content/Context;Lcom/luchime/huiyuan/FavoriteRecord;)V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 187
    .end local v9    # "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$1\\4\\187\\1":I
    nop

    .line 188
    .local v6, "value\\3":Ljava/lang/Object;
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 189
    move-object v8, v6

    .line 185
    .end local v6    # "value\\3":Ljava/lang/Object;
    .end local v8    # "it\\2":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1\\3\\185\\2":I
    :goto_6
    nop

    .line 184
    .end local v13    # "invalid\\2":Z
    .end local v15    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\2\\184":I
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 191
    const v1, 0x3d51a067

    invoke-static {v11, v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v6, v7, 0x70

    xor-int/lit8 v6, v6, 0x30

    const/16 v9, 0x20

    if-le v6, v9, :cond_b

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    and-int/lit8 v6, v7, 0x30

    const/16 v9, 0x20

    if-ne v6, v9, :cond_d

    :cond_c
    const/4 v6, 0x1

    goto :goto_7

    :cond_d
    const/4 v6, 0x0

    :goto_7
    or-int/2addr v1, v6

    .local v1, "invalid\\5":Z
    move-object v6, v11

    .local v6, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 192
    .local v9, "$i$f$cache\\5\\191":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it\\5":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 193
    .local v15, "$i$a$-let-ComposerKt$cache$1\\6\\192\\5":I
    if-nez v1, :cond_f

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid\\5":Z
    .local v19, "invalid\\5":Z
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_e

    goto :goto_8

    .line 197
    :cond_e
    goto :goto_9

    .line 193
    .end local v19    # "invalid\\5":Z
    .restart local v1    # "invalid\\5":Z
    :cond_f
    move/from16 v19, v1

    .line 194
    .end local v1    # "invalid\\5":Z
    .restart local v19    # "invalid\\5":Z
    :goto_8
    const/4 v1, 0x0

    .line 191
    .local v1, "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$2\\7\\194\\1":I
    move/from16 v16, v1

    .end local v1    # "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$2\\7\\194\\1":I
    .local v16, "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$2\\7\\194\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$2$1;

    iget-object v2, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-direct {v1, v2, v10}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$2$1;-><init>(Landroid/content/Context;Lcom/luchime/huiyuan/FavoriteRecord;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 194
    .end local v16    # "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$2\\7\\194\\1":I
    nop

    .line 195
    .local v1, "value\\6":Ljava/lang/Object;
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 196
    move-object v13, v1

    .line 192
    .end local v1    # "value\\6":Ljava/lang/Object;
    .end local v13    # "it\\5":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1\\6\\192\\5":I
    :goto_9
    nop

    .line 191
    .end local v6    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache\\5\\191":I
    .end local v19    # "invalid\\5":Z
    check-cast v13, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 198
    const v1, 0x3d51ac5e

    invoke-static {v11, v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, v7, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v9, 0x20

    if-le v2, v9, :cond_10

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    and-int/lit8 v2, v7, 0x30

    const/16 v9, 0x20

    if-ne v2, v9, :cond_12

    :cond_11
    const/4 v2, 0x1

    goto :goto_a

    :cond_12
    const/4 v2, 0x0

    :goto_a
    or-int/2addr v1, v2

    .local v1, "invalid\\8":Z
    move-object v2, v11

    .local v2, "$this$cache\\8":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 199
    .local v6, "$i$f$cache\\8\\198":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\8":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 200
    .local v15, "$i$a$-let-ComposerKt$cache$1\\9\\199\\8":I
    if-nez v1, :cond_14

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid\\8":Z
    .local v19, "invalid\\8":Z
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v9, v1, :cond_13

    goto :goto_b

    .line 204
    :cond_13
    move/from16 v21, v3

    goto :goto_c

    .line 200
    .end local v19    # "invalid\\8":Z
    .restart local v1    # "invalid\\8":Z
    :cond_14
    move/from16 v19, v1

    .line 201
    .end local v1    # "invalid\\8":Z
    .restart local v19    # "invalid\\8":Z
    :goto_b
    const/4 v1, 0x0

    .line 198
    .local v1, "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$3\\10\\201\\1":I
    move/from16 v16, v1

    .end local v1    # "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$3\\10\\201\\1":I
    .local v16, "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$3\\10\\201\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$3$1;

    move/from16 v21, v3

    .end local v3    # "$dirty":I
    .local v21, "$dirty":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    invoke-direct {v1, v3, v10}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$3$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/luchime/huiyuan/FavoriteRecord;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 201
    .end local v16    # "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$3\\10\\201\\1":I
    nop

    .line 202
    .local v1, "value\\9":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 203
    move-object v9, v1

    .line 199
    .end local v1    # "value\\9":Ljava/lang/Object;
    .end local v9    # "it\\8":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1\\9\\199\\8":I
    :goto_c
    nop

    .line 198
    .end local v2    # "$this$cache\\8":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\8\\198":I
    .end local v19    # "invalid\\8":Z
    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 205
    const v1, 0x3d51b6ce

    invoke-static {v11, v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$onAsk$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, v7, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    if-le v2, v3, :cond_15

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    and-int/lit8 v2, v7, 0x30

    const/16 v3, 0x20

    if-ne v2, v3, :cond_17

    :cond_16
    const/16 v17, 0x1

    goto :goto_d

    :cond_17
    const/16 v17, 0x0

    :goto_d
    or-int v1, v1, v17

    .local v1, "invalid\\11":Z
    move-object v2, v11

    .local v2, "$this$cache\\11":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 206
    .local v3, "$i$f$cache\\11\\205":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\11":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 207
    .local v14, "$i$a$-let-ComposerKt$cache$1\\12\\206\\11":I
    if-nez v1, :cond_19

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v6, v15, :cond_18

    goto :goto_e

    .line 211
    :cond_18
    move/from16 v16, v1

    move/from16 v17, v3

    goto :goto_f

    .line 208
    :cond_19
    :goto_e
    const/4 v15, 0x0

    .line 205
    .local v15, "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$4\\13\\208\\1":I
    move/from16 v16, v1

    .end local v1    # "invalid\\11":Z
    .local v16, "invalid\\11":Z
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;

    move/from16 v17, v3

    .end local v3    # "$i$f$cache\\11\\205":I
    .local v17, "$i$f$cache\\11\\205":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4;->$onAsk$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v10}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/luchime/huiyuan/FavoriteRecord;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 208
    .end local v15    # "$i$a$-cache-KnowledgeScreensKt$FavoritesScreen$1$1$4$4\\13\\208\\1":I
    nop

    .line 209
    .local v1, "value\\12":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 210
    move-object v6, v1

    .line 206
    .end local v1    # "value\\12":Ljava/lang/Object;
    .end local v6    # "it\\11":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1\\12\\206\\11":I
    :goto_f
    nop

    .line 205
    .end local v2    # "$this$cache\\11":Landroidx/compose/runtime/Composer;
    .end local v16    # "invalid\\11":Z
    .end local v17    # "$i$f$cache\\11\\205":I
    move-object v15, v6

    check-cast v15, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 v1, v7, 0x3

    and-int/lit8 v17, v1, 0xe

    .line 181
    move-object v14, v9

    move-object/from16 v16, v11

    move v11, v12

    move-object v12, v8

    .end local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v16, "$composer\\1":Landroidx/compose/runtime/Composer;
    invoke-static/range {v10 .. v17}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->access$FavoriteCard(Lcom/luchime/huiyuan/FavoriteRecord;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 212
    nop

    .line 179
    .end local v5    # "$this$FavoritesScreen_u24lambda_u2454_u24lambda_u2453_u24lambda_u2452\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v7    # "$changed\\1":I
    .end local v10    # "favorite\\1":Lcom/luchime/huiyuan/FavoriteRecord;
    .end local v16    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$a$-items$default-KnowledgeScreensKt$FavoritesScreen$1$1$4\\1\\179\\0":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_10

    .end local v21    # "$dirty":I
    .local v3, "$dirty":I
    :cond_1a
    move/from16 v21, v3

    .end local v3    # "$dirty":I
    .restart local v21    # "$dirty":I
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    :cond_1b
    :goto_10
    return-void
.end method
