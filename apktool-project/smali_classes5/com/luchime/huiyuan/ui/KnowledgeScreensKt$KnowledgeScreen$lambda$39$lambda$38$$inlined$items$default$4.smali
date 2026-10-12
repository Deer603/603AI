.class public final Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->KnowledgeScreen(Ljava/util/List;Ljava/lang/String;ZLjava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 KnowledgeScreens.kt\ncom/luchime/huiyuan/ui/KnowledgeScreensKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n182#2,6:181\n188#2:193\n189#2:200\n190#2:207\n192#2:214\n1247#3,6:187\n1247#3,6:194\n1247#3,6:201\n1247#3,6:208\n*S KotlinDebug\n*F\n+ 1 KnowledgeScreens.kt\ncom/luchime/huiyuan/ui/KnowledgeScreensKt\n*L\n187#1:187,6\n188#1:194,6\n189#1:201,6\n190#1:208,6\n*E\n"
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
.field final synthetic $askName$inlined:Ljava/lang/String;

.field final synthetic $context$inlined:Landroid/content/Context;

.field final synthetic $favorites$inlined:Ljava/util/Set;

.field final synthetic $isLandscape$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onAsk$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;Ljava/lang/String;ZLandroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$favorites$inlined:Ljava/util/Set;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$askName$inlined:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$isLandscape$inlined:Z

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$onAsk$inlined:Lkotlin/jvm/functions/Function1;

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

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 23
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

    if-nez v5, :cond_3

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    .line 179
    :cond_3
    and-int/lit16 v5, v3, 0x93

    const/16 v6, 0x92

    if-eq v5, v6, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-interface {v2, v5, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"

    const v7, -0x25b7f321

    invoke-static {v7, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object v5, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v6, v3, 0xe

    .local v6, "$changed\\1":I
    move-object v7, v5

    check-cast v7, Lcom/luchime/huiyuan/LexiconEntry;

    .local v7, "entry\\1":Lcom/luchime/huiyuan/LexiconEntry;
    move-object/from16 v5, p1

    .local v5, "$this$KnowledgeScreen_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    move-object/from16 v15, p3

    .local v15, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v17, 0x0

    .line 181
    .local v17, "$i$a$-items$default-KnowledgeScreensKt$KnowledgeScreen$1$1$7\\1\\179\\0":I
    const v8, 0x50d4d6e5

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "C*186@7812L33,187@7877L57,188@7969L48,189@8047L37,181@7591L511:KnowledgeScreens.kt#cyjvf"

    invoke-static {v15, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 185
    iget-object v8, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$favorites$inlined:Ljava/util/Set;

    invoke-virtual {v7}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    .line 183
    nop

    .line 182
    iget-object v8, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$askName$inlined:Ljava/lang/String;

    .line 184
    iget-boolean v9, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$isLandscape$inlined:Z

    .line 185
    nop

    .line 186
    const v11, 0x23a3dea0

    const-string v12, "CC(remember):KnowledgeScreens.kt#9igjgp"

    invoke-static {v15, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v11, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    .local v11, "invalid\\2":Z
    move-object v13, v15

    .local v13, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 187
    .local v14, "$i$f$cache\\2\\186":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it\\2":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 188
    .local v16, "$i$a$-let-ComposerKt$cache$1\\3\\187\\2":I
    if-nez v11, :cond_7

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_6

    goto :goto_4

    .line 192
    :cond_6
    goto :goto_5

    .line 189
    :cond_7
    :goto_4
    const/4 v2, 0x0

    .line 186
    .local v2, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$1\\4\\189\\1":I
    move-object/from16 v18, v1

    .end local v1    # "it\\2":Ljava/lang/Object;
    .local v18, "it\\2":Ljava/lang/Object;
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$1$1;

    move/from16 v19, v2

    .end local v2    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$1\\4\\189\\1":I
    .local v19, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$1\\4\\189\\1":I
    iget-object v2, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-direct {v1, v2, v7}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$1$1;-><init>(Landroid/content/Context;Lcom/luchime/huiyuan/LexiconEntry;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 189
    .end local v19    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$1\\4\\189\\1":I
    nop

    .line 190
    .local v1, "value\\3":Ljava/lang/Object;
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 191
    nop

    .line 187
    .end local v1    # "value\\3":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\3\\187\\2":I
    .end local v18    # "it\\2":Ljava/lang/Object;
    :goto_5
    nop

    .line 186
    .end local v11    # "invalid\\2":Z
    .end local v13    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache\\2\\186":I
    move-object v11, v1

    check-cast v11, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 193
    const v1, 0x23a3e6d8

    invoke-static {v15, v1, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\5":Z
    move-object v2, v15

    .local v2, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 194
    .local v13, "$i$f$cache\\5\\193":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it\\5":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 195
    .local v16, "$i$a$-let-ComposerKt$cache$1\\6\\194\\5":I
    if-nez v1, :cond_9

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid\\5":Z
    .local v19, "invalid\\5":Z
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v14, v1, :cond_8

    goto :goto_6

    .line 199
    :cond_8
    move/from16 v20, v3

    goto :goto_7

    .line 195
    .end local v19    # "invalid\\5":Z
    .restart local v1    # "invalid\\5":Z
    :cond_9
    move/from16 v19, v1

    .line 196
    .end local v1    # "invalid\\5":Z
    .restart local v19    # "invalid\\5":Z
    :goto_6
    const/4 v1, 0x0

    .line 193
    .local v1, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$2\\7\\196\\1":I
    move/from16 v18, v1

    .end local v1    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$2\\7\\196\\1":I
    .local v18, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$2\\7\\196\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;

    move/from16 v20, v3

    .end local v3    # "$dirty":I
    .local v20, "$dirty":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-direct {v1, v3, v7}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;-><init>(Landroid/content/Context;Lcom/luchime/huiyuan/LexiconEntry;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 196
    .end local v18    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$2\\7\\196\\1":I
    nop

    .line 197
    .local v1, "value\\6":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 198
    move-object v14, v1

    .line 194
    .end local v1    # "value\\6":Ljava/lang/Object;
    .end local v14    # "it\\5":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\6\\194\\5":I
    :goto_7
    nop

    .line 193
    .end local v2    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache\\5\\193":I
    .end local v19    # "invalid\\5":Z
    check-cast v14, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 200
    const v1, 0x23a3f24f

    invoke-static {v15, v1, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\8":Z
    move-object v2, v15

    .local v2, "$this$cache\\8":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 201
    .local v3, "$i$f$cache\\8\\200":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it\\8":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 202
    .local v16, "$i$a$-let-ComposerKt$cache$1\\9\\201\\8":I
    if-nez v1, :cond_b

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid\\8":Z
    .local v19, "invalid\\8":Z
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_a

    goto :goto_8

    .line 206
    :cond_a
    move/from16 v21, v3

    goto :goto_9

    .line 202
    .end local v19    # "invalid\\8":Z
    .restart local v1    # "invalid\\8":Z
    :cond_b
    move/from16 v19, v1

    .line 203
    .end local v1    # "invalid\\8":Z
    .restart local v19    # "invalid\\8":Z
    :goto_8
    const/4 v1, 0x0

    .line 200
    .local v1, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$3\\10\\203\\1":I
    move/from16 v18, v1

    .end local v1    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$3\\10\\203\\1":I
    .local v18, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$3\\10\\203\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;

    move/from16 v21, v3

    .end local v3    # "$i$f$cache\\8\\200":I
    .local v21, "$i$f$cache\\8\\200":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    invoke-direct {v1, v3, v7}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/luchime/huiyuan/LexiconEntry;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 203
    .end local v18    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$3\\10\\203\\1":I
    nop

    .line 204
    .local v1, "value\\9":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 205
    move-object v13, v1

    .line 201
    .end local v1    # "value\\9":Ljava/lang/Object;
    .end local v13    # "it\\8":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\9\\201\\8":I
    :goto_9
    nop

    .line 200
    .end local v2    # "$this$cache\\8":Landroidx/compose/runtime/Composer;
    .end local v19    # "invalid\\8":Z
    .end local v21    # "$i$f$cache\\8\\200":I
    check-cast v13, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 207
    const v1, 0x23a3fc04

    invoke-static {v15, v1, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$onAsk$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid\\11":Z
    move-object v2, v15

    .local v2, "$this$cache\\11":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 208
    .local v3, "$i$f$cache\\11\\207":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it\\11":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 209
    .local v16, "$i$a$-let-ComposerKt$cache$1\\12\\208\\11":I
    if-nez v1, :cond_d

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid\\11":Z
    .local v19, "invalid\\11":Z
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v12, v1, :cond_c

    goto :goto_a

    .line 213
    :cond_c
    move/from16 v21, v3

    goto :goto_b

    .line 209
    .end local v19    # "invalid\\11":Z
    .restart local v1    # "invalid\\11":Z
    :cond_d
    move/from16 v19, v1

    .line 210
    .end local v1    # "invalid\\11":Z
    .restart local v19    # "invalid\\11":Z
    :goto_a
    const/4 v1, 0x0

    .line 207
    .local v1, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$4\\13\\210\\1":I
    move/from16 v18, v1

    .end local v1    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$4\\13\\210\\1":I
    .local v18, "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$4\\13\\210\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$4$1;

    move/from16 v21, v3

    .end local v3    # "$i$f$cache\\11\\207":I
    .local v21, "$i$f$cache\\11\\207":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4;->$onAsk$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v7}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$4$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/luchime/huiyuan/LexiconEntry;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 210
    .end local v18    # "$i$a$-cache-KnowledgeScreensKt$KnowledgeScreen$1$1$7$4\\13\\210\\1":I
    nop

    .line 211
    .local v1, "value\\12":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 212
    move-object v12, v1

    .line 208
    .end local v1    # "value\\12":Ljava/lang/Object;
    .end local v12    # "it\\11":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\12\\208\\11":I
    :goto_b
    nop

    .line 207
    .end local v2    # "$this$cache\\11":Landroidx/compose/runtime/Composer;
    .end local v19    # "invalid\\11":Z
    .end local v21    # "$i$f$cache\\11\\207":I
    check-cast v12, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 v1, v6, 0x3

    and-int/lit8 v16, v1, 0xe

    .line 181
    move-object/from16 v22, v14

    move-object v14, v12

    move-object/from16 v12, v22

    invoke-static/range {v7 .. v16}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->access$KnowledgeCard(Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 214
    nop

    .line 179
    .end local v5    # "$this$KnowledgeScreen_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v6    # "$changed\\1":I
    .end local v7    # "entry\\1":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v15    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v17    # "$i$a$-items$default-KnowledgeScreensKt$KnowledgeScreen$1$1$7\\1\\179\\0":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_c

    .end local v20    # "$dirty":I
    .local v3, "$dirty":I
    :cond_e
    move/from16 v20, v3

    .end local v3    # "$dirty":I
    .restart local v20    # "$dirty":I
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    :cond_f
    :goto_c
    return-void
.end method
