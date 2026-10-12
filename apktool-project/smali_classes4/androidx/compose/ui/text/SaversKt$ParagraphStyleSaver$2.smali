.class final Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Savers.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/text/SaversKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/text/ParagraphStyle;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n93#2:547\n93#2:549\n65#2,2:551\n65#2,2:554\n65#2,2:557\n65#2,2:560\n65#2,2:563\n93#2:566\n65#2,2:568\n1#3:548\n1#3:550\n1#3:553\n1#3:556\n1#3:559\n1#3:562\n1#3:565\n1#3:567\n1#3:570\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n281#1:547\n282#1:549\n283#1:551,2\n284#1:554,2\n285#1:557,2\n286#1:560,2\n287#1:563,2\n288#1:566\n289#1:568,2\n281#1:548\n282#1:550\n283#1:553\n284#1:556\n285#1:559\n286#1:562\n287#1:565\n288#1:567\n289#1:570\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/text/ParagraphStyle;",
        "it",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;

    invoke-direct {v0}, Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;->INSTANCE:Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Landroidx/compose/ui/text/ParagraphStyle;
    .locals 19
    .param p1, "it"    # Ljava/lang/Object;

    .line 279
    move-object/from16 v0, p1

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 280
    .local v1, "list":Ljava/util/List;
    new-instance v2, Landroidx/compose/ui/text/ParagraphStyle;

    .line 281
    const/4 v3, 0x0

    .line 551
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 281
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .local v3, "value$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 547
    .local v5, "$i$f$restore":I
    if-eqz v3, :cond_0

    move-object v7, v3

    .line 548
    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 547
    .local v8, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v7, Landroidx/compose/ui/text/style/TextAlign;

    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v5    # "$i$f$restore":I
    :goto_0
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7}, Landroidx/compose/ui/text/style/TextAlign;->unbox-impl()I

    move-result v3

    .line 282
    const/4 v5, 0x1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .local v5, "value$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 549
    .local v7, "$i$f$restore":I
    if-eqz v5, :cond_1

    move-object v8, v5

    .line 550
    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 549
    .local v9, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v8, Landroidx/compose/ui/text/style/TextDirection;

    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$restore":I
    :goto_1
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v8}, Landroidx/compose/ui/text/style/TextDirection;->unbox-impl()I

    move-result v5

    .line 283
    const/4 v7, 0x2

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .local v7, "value$iv":Ljava/lang/Object;
    sget-object v8, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-static {v8}, Landroidx/compose/ui/text/SaversKt;->getSaver(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v8

    .local v8, "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 551
    .local v9, "$i$f$restore":I
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    instance-of v10, v8, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v10, :cond_2

    const/4 v12, 0x0

    goto :goto_2

    .line 552
    :cond_2
    if-eqz v7, :cond_3

    move-object v10, v7

    .line 553
    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 552
    .local v11, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v12, v8

    .line 553
    .local v12, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v13, 0x0

    .line 552
    .local v13, "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v12, v7}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .end local v12    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v13    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v12, Landroidx/compose/ui/unit/TextUnit;

    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-SaversKt$restore$1$iv":I
    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v8    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :goto_2
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v12}, Landroidx/compose/ui/unit/TextUnit;->unbox-impl()J

    move-result-wide v7

    .line 284
    const/4 v9, 0x3

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .local v9, "value$iv":Ljava/lang/Object;
    sget-object v10, Landroidx/compose/ui/text/style/TextIndent;->Companion:Landroidx/compose/ui/text/style/TextIndent$Companion;

    invoke-static {v10}, Landroidx/compose/ui/text/SaversKt;->getSaver(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v10

    .local v10, "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 554
    .local v11, "$i$f$restore":I
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    instance-of v12, v10, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v12, :cond_4

    const/4 v14, 0x0

    goto :goto_3

    .line 555
    :cond_4
    if-eqz v9, :cond_5

    move-object v12, v9

    .line 556
    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 555
    .local v13, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v14, v10

    .line 556
    .local v14, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v15, 0x0

    .line 555
    .local v15, "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v14, v9}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .end local v14    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v15    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v14, Landroidx/compose/ui/text/style/TextIndent;

    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    goto :goto_3

    :cond_5
    const/4 v14, 0x0

    .line 285
    .end local v9    # "value$iv":Ljava/lang/Object;
    .end local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$f$restore":I
    :goto_3
    const/4 v9, 0x4

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .restart local v9    # "value$iv":Ljava/lang/Object;
    sget-object v10, Landroidx/compose/ui/text/PlatformParagraphStyle;->Companion:Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;

    invoke-static {v10}, Landroidx/compose/ui/text/Savers_androidKt;->getSaver(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v10

    .restart local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 557
    .restart local v11    # "$i$f$restore":I
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    instance-of v12, v10, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v12, :cond_6

    const/4 v15, 0x0

    goto :goto_4

    .line 558
    :cond_6
    if-eqz v9, :cond_7

    move-object v12, v9

    .line 559
    .restart local v12    # "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 558
    .restart local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v15, v10

    .line 559
    .local v15, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/16 v16, 0x0

    .line 558
    .local v16, "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v15, v9}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .end local v15    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v16    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v15, Landroidx/compose/ui/text/PlatformParagraphStyle;

    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    goto :goto_4

    :cond_7
    const/4 v15, 0x0

    .line 286
    .end local v9    # "value$iv":Ljava/lang/Object;
    .end local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$f$restore":I
    :goto_4
    const/4 v9, 0x5

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .restart local v9    # "value$iv":Ljava/lang/Object;
    sget-object v10, Landroidx/compose/ui/text/style/LineHeightStyle;->Companion:Landroidx/compose/ui/text/style/LineHeightStyle$Companion;

    invoke-static {v10}, Landroidx/compose/ui/text/SaversKt;->getSaver(Landroidx/compose/ui/text/style/LineHeightStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v10

    .restart local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 560
    .restart local v11    # "$i$f$restore":I
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    instance-of v12, v10, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v12, :cond_8

    const/4 v9, 0x0

    goto :goto_5

    .line 561
    :cond_8
    if-eqz v9, :cond_9

    move-object v12, v9

    .line 562
    .restart local v12    # "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 561
    .restart local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    move-object/from16 v16, v10

    .line 562
    .local v16, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/16 v17, 0x0

    .line 561
    .local v17, "$i$a$-with-SaversKt$restore$1$1$iv":I
    move-object/from16 v6, v16

    .end local v16    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .local v6, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    invoke-interface {v6, v9}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .end local v6    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v17    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v6, Landroidx/compose/ui/text/style/LineHeightStyle;

    move-object v9, v6

    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    goto :goto_5

    :cond_9
    const/4 v9, 0x0

    .line 287
    .end local v9    # "value$iv":Ljava/lang/Object;
    .end local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$f$restore":I
    :goto_5
    const/4 v6, 0x6

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .local v6, "value$iv":Ljava/lang/Object;
    sget-object v10, Landroidx/compose/ui/text/style/LineBreak;->Companion:Landroidx/compose/ui/text/style/LineBreak$Companion;

    invoke-static {v10}, Landroidx/compose/ui/text/Savers_androidKt;->getSaver(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v10

    .restart local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 563
    .restart local v11    # "$i$f$restore":I
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    instance-of v12, v10, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v12, :cond_a

    const/4 v0, 0x0

    goto :goto_6

    .line 564
    :cond_a
    if-eqz v6, :cond_b

    move-object v12, v6

    .line 565
    .restart local v12    # "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 564
    .restart local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    move-object/from16 v16, v10

    .line 565
    .restart local v16    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/16 v17, 0x0

    .line 564
    .restart local v17    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    move-object/from16 v0, v16

    .end local v16    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .local v0, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    invoke-interface {v0, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v17    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v0, Landroidx/compose/ui/text/style/LineBreak;

    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v10    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$f$restore":I
    :goto_6
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/LineBreak;->unbox-impl()I

    move-result v10

    .line 288
    const/4 v0, 0x7

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .local v0, "value$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 566
    .local v6, "$i$f$restore":I
    if-eqz v0, :cond_c

    move-object v11, v0

    .line 567
    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 566
    .local v12, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v11, Landroidx/compose/ui/text/style/Hyphens;

    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_7

    :cond_c
    const/4 v11, 0x0

    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$restore":I
    :goto_7
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v11}, Landroidx/compose/ui/text/style/Hyphens;->unbox-impl()I

    move-result v11

    .line 289
    const/16 v0, 0x8

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .restart local v0    # "value$iv":Ljava/lang/Object;
    sget-object v6, Landroidx/compose/ui/text/style/TextMotion;->Companion:Landroidx/compose/ui/text/style/TextMotion$Companion;

    invoke-static {v6}, Landroidx/compose/ui/text/Savers_androidKt;->getSaver(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v6

    .local v6, "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v12, 0x0

    .line 568
    .local v12, "$i$f$restore":I
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    instance-of v4, v6, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v4, :cond_d

    move-object/from16 v18, v1

    const/4 v12, 0x0

    goto :goto_8

    .line 569
    :cond_d
    if-eqz v0, :cond_e

    move-object v4, v0

    .line 570
    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 569
    .restart local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    move-object/from16 v16, v6

    .line 570
    .restart local v16    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/16 v17, 0x0

    .line 569
    .restart local v17    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    move-object/from16 v18, v1

    move-object/from16 v1, v16

    .end local v16    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .local v1, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .local v18, "list":Ljava/util/List;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v17    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v1, Landroidx/compose/ui/text/style/TextMotion;

    move-object v12, v1

    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-SaversKt$restore$1$iv":I
    goto :goto_8

    .end local v18    # "list":Ljava/util/List;
    .local v1, "list":Ljava/util/List;
    :cond_e
    move-object/from16 v18, v1

    .end local v1    # "list":Ljava/util/List;
    .restart local v18    # "list":Ljava/util/List;
    const/4 v12, 0x0

    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v6    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v12    # "$i$f$restore":I
    :goto_8
    nop

    .line 280
    const/4 v13, 0x0

    move v4, v5

    move-wide v5, v7

    move-object v7, v14

    move-object v8, v15

    invoke-direct/range {v2 .. v13}, Landroidx/compose/ui/text/ParagraphStyle;-><init>(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 290
    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 264
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2;->invoke(Ljava/lang/Object;)Landroidx/compose/ui/text/ParagraphStyle;

    move-result-object v0

    return-object v0
.end method
