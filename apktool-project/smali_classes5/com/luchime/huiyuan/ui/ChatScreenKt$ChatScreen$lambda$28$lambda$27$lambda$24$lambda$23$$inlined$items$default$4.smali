.class public final Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/ChatScreenKt;->ChatScreen(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/lang/String;IZZLjava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ChatScreen.kt\ncom/luchime/huiyuan/ui/ChatScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n207#2,5:181\n212#2:192\n213#2:199\n220#2,3:206\n1247#3,6:186\n1247#3,6:193\n1247#3,6:200\n*S KotlinDebug\n*F\n+ 1 ChatScreen.kt\ncom/luchime/huiyuan/ui/ChatScreenKt\n*L\n211#1:186,6\n212#1:193,6\n213#1:200,6\n*E\n"
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

.field final synthetic $favorites$inlined:Ljava/util/Set;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$favorites$inlined:Ljava/util/Set;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

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

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 21
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

    if-eqz v5, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, -0x1

    const-string v7, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"

    const v10, -0x25b7f321

    invoke-static {v10, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object v5, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v7, v3, 0xe

    .local v7, "$changed\\1":I
    check-cast v5, Lcom/luchime/huiyuan/ui/TimelineItem;

    .local v5, "item\\1":Lcom/luchime/huiyuan/ui/TimelineItem;
    move-object/from16 v10, p1

    .local v10, "$this$ChatScreen_u24lambda_u2428_u24lambda_u2427_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    move-object/from16 v11, p3

    .local v11, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 181
    .local v18, "$i$a$-items$default-ChatScreenKt$ChatScreen$3$1$3$1$2\\1\\179\\0":I
    const v12, -0x139f1b34

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v12, "C:ChatScreen.kt#cyjvf"

    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 182
    instance-of v12, v5, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    if-eqz v12, :cond_16

    const v12, 0x72fae60a

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v12, "210@8449L32,211@8525L66,212@8644L226,207@8243L657"

    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 183
    move-object v12, v5

    check-cast v12, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    .line 184
    move-object v13, v5

    check-cast v13, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    invoke-virtual {v13}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->getSourceQuote()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_6

    iget-object v13, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$favorites$inlined:Ljava/util/Set;

    move-object v14, v5

    check-cast v14, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    invoke-virtual {v14}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->getSourceQuote()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    move-object v13, v12

    const/4 v12, 0x1

    goto :goto_4

    :cond_6
    move-object v13, v12

    const/4 v12, 0x0

    .line 185
    :goto_4
    const v14, 0x72fafd59

    const-string v15, "CC(remember):ChatScreen.kt#9igjgp"

    invoke-static {v11, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v14, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    and-int/lit8 v16, v7, 0x70

    xor-int/lit8 v8, v16, 0x30

    if-le v8, v6, :cond_7

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    and-int/lit8 v8, v7, 0x30

    if-ne v8, v6, :cond_9

    :cond_8
    const/4 v8, 0x1

    goto :goto_5

    :cond_9
    const/4 v8, 0x0

    :goto_5
    or-int/2addr v8, v14

    .local v8, "invalid\\2":Z
    move-object v14, v11

    .local v14, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 186
    .local v16, "$i$f$cache\\2\\185":I
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\2":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 187
    .local v19, "$i$a$-let-ComposerKt$cache$1\\3\\186\\2":I
    if-nez v8, :cond_b

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v9, v6, :cond_a

    goto :goto_6

    .line 191
    :cond_a
    goto :goto_7

    .line 188
    :cond_b
    :goto_6
    const/4 v6, 0x0

    .line 185
    .local v6, "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$1\\4\\188\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$1$1;

    iget-object v2, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-direct {v1, v2, v5}, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$1$1;-><init>(Landroid/content/Context;Lcom/luchime/huiyuan/ui/TimelineItem;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 188
    .end local v6    # "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$1\\4\\188\\1":I
    nop

    .line 189
    .local v1, "value\\3":Ljava/lang/Object;
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 190
    move-object v9, v1

    .line 186
    .end local v1    # "value\\3":Ljava/lang/Object;
    .end local v9    # "it\\2":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1\\3\\186\\2":I
    :goto_7
    nop

    .line 185
    .end local v8    # "invalid\\2":Z
    .end local v14    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache\\2\\185":I
    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 192
    const v1, 0x72fb06fb

    invoke-static {v11, v1, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, v7, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v6, 0x20

    if-le v2, v6, :cond_c

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    and-int/lit8 v2, v7, 0x30

    const/16 v6, 0x20

    if-ne v2, v6, :cond_e

    :cond_d
    const/4 v2, 0x1

    goto :goto_8

    :cond_e
    const/4 v2, 0x0

    :goto_8
    or-int/2addr v1, v2

    .local v1, "invalid\\5":Z
    move-object v2, v11

    .local v2, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 193
    .local v6, "$i$f$cache\\5\\192":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it\\5":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 194
    .local v14, "$i$a$-let-ComposerKt$cache$1\\6\\193\\5":I
    if-nez v1, :cond_10

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid\\5":Z
    .local v19, "invalid\\5":Z
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v8, v1, :cond_f

    goto :goto_9

    .line 198
    :cond_f
    move/from16 v20, v3

    goto :goto_a

    .line 194
    .end local v19    # "invalid\\5":Z
    .restart local v1    # "invalid\\5":Z
    :cond_10
    move/from16 v19, v1

    .line 195
    .end local v1    # "invalid\\5":Z
    .restart local v19    # "invalid\\5":Z
    :goto_9
    const/4 v1, 0x0

    .line 192
    .local v1, "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$2\\7\\195\\1":I
    move/from16 v16, v1

    .end local v1    # "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$2\\7\\195\\1":I
    .local v16, "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$2\\7\\195\\1":I
    new-instance v1, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$2$1;

    move/from16 v20, v3

    .end local v3    # "$dirty":I
    .local v20, "$dirty":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    invoke-direct {v1, v3, v5}, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$2$1;-><init>(Landroid/content/Context;Lcom/luchime/huiyuan/ui/TimelineItem;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 195
    .end local v16    # "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$2\\7\\195\\1":I
    nop

    .line 196
    .local v1, "value\\6":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 197
    move-object v8, v1

    .line 193
    .end local v1    # "value\\6":Ljava/lang/Object;
    .end local v8    # "it\\5":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1\\6\\193\\5":I
    :goto_a
    nop

    .line 192
    .end local v2    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache\\5\\192":I
    .end local v19    # "invalid\\5":Z
    move-object v14, v8

    check-cast v14, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 199
    const v1, 0x72fb167b

    invoke-static {v11, v1, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, v7, 0x70

    xor-int/lit8 v1, v1, 0x30

    const/16 v6, 0x20

    if-le v1, v6, :cond_11

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    :cond_11
    and-int/lit8 v1, v7, 0x30

    const/16 v6, 0x20

    if-ne v1, v6, :cond_13

    :cond_12
    const/4 v8, 0x1

    goto :goto_b

    :cond_13
    const/4 v8, 0x0

    :goto_b
    iget-object v1, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v8

    .local v1, "invalid\\8":Z
    move-object v2, v11

    .local v2, "$this$cache\\8":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 200
    .local v3, "$i$f$cache\\8\\199":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\8":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 201
    .local v8, "$i$a$-let-ComposerKt$cache$1\\9\\200\\8":I
    if-nez v1, :cond_15

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v6, v15, :cond_14

    goto :goto_c

    .line 205
    :cond_14
    move/from16 v16, v1

    move/from16 v17, v3

    goto :goto_d

    .line 202
    :cond_15
    :goto_c
    const/4 v15, 0x0

    .line 199
    .local v15, "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$3\\10\\202\\1":I
    move/from16 v16, v1

    .end local v1    # "invalid\\8":Z
    .local v16, "invalid\\8":Z
    new-instance v1, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;

    move/from16 v17, v3

    .end local v3    # "$i$f$cache\\8\\199":I
    .local v17, "$i$f$cache\\8\\199":I
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4;->$onToggleFavorite$inlined:Lkotlin/jvm/functions/Function2;

    invoke-direct {v1, v5, v3}, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;-><init>(Lcom/luchime/huiyuan/ui/TimelineItem;Lkotlin/jvm/functions/Function2;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 202
    .end local v15    # "$i$a$-cache-ChatScreenKt$ChatScreen$3$1$3$1$2$3\\10\\202\\1":I
    nop

    .line 203
    .local v1, "value\\9":Ljava/lang/Object;
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 204
    move-object v6, v1

    .line 200
    .end local v1    # "value\\9":Ljava/lang/Object;
    .end local v6    # "it\\8":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1\\9\\200\\8":I
    :goto_d
    nop

    .line 199
    .end local v2    # "$this$cache\\8":Landroidx/compose/runtime/Composer;
    .end local v16    # "invalid\\8":Z
    .end local v17    # "$i$f$cache\\8\\199":I
    move-object v15, v6

    check-cast v15, Lkotlin/jvm/functions/Function0;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 182
    const/16 v17, 0x0

    move-object/from16 v16, v11

    move-object v11, v13

    move-object v13, v9

    .end local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v16, "$composer\\1":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v17}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->access$MessageBubble(Lcom/luchime/huiyuan/ui/TimelineItem$Message;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v2, v16

    .end local v16    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\1":Landroidx/compose/runtime/Composer;
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_e

    .line 206
    .end local v2    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v20    # "$dirty":I
    .local v3, "$dirty":I
    .restart local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    :cond_16
    move/from16 v20, v3

    move-object v2, v11

    .end local v3    # "$dirty":I
    .end local v11    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$dirty":I
    instance-of v1, v5, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    if-eqz v1, :cond_17

    const v1, 0x72fb3ced

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "219@8958L20"

    invoke-static {v2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-object v1, v5

    check-cast v1, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->access$ThinkLogBubble(Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 181
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 208
    nop

    .line 179
    .end local v2    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v5    # "item\\1":Lcom/luchime/huiyuan/ui/TimelineItem;
    .end local v7    # "$changed\\1":I
    .end local v10    # "$this$ChatScreen_u24lambda_u2428_u24lambda_u2427_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v18    # "$i$a$-items$default-ChatScreenKt$ChatScreen$3$1$3$1$2\\1\\179\\0":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_f

    .line 181
    .restart local v2    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .restart local v5    # "item\\1":Lcom/luchime/huiyuan/ui/TimelineItem;
    .restart local v7    # "$changed\\1":I
    .restart local v10    # "$this$ChatScreen_u24lambda_u2428_u24lambda_u2427_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .restart local v18    # "$i$a$-items$default-ChatScreenKt$ChatScreen$3$1$3$1$2\\1\\179\\0":I
    :cond_17
    const v1, 0x72fade17

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 179
    .end local v2    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v5    # "item\\1":Lcom/luchime/huiyuan/ui/TimelineItem;
    .end local v7    # "$changed\\1":I
    .end local v10    # "$this$ChatScreen_u24lambda_u2428_u24lambda_u2427_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v18    # "$i$a$-items$default-ChatScreenKt$ChatScreen$3$1$3$1$2\\1\\179\\0":I
    .end local v20    # "$dirty":I
    .restart local v3    # "$dirty":I
    :cond_18
    move/from16 v20, v3

    .end local v3    # "$dirty":I
    .restart local v20    # "$dirty":I
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    :cond_19
    :goto_f
    return-void
.end method
