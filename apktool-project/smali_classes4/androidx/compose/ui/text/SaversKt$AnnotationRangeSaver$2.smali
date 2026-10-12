.class final Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/text/AnnotatedString$Range<",
        "+",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n93#2:547\n93#2:549\n93#2:551\n93#2:553\n65#2,2:555\n65#2,2:558\n65#2,2:561\n65#2,2:564\n65#2,2:567\n65#2,2:570\n93#2:573\n1#3:548\n1#3:550\n1#3:552\n1#3:554\n1#3:557\n1#3:560\n1#3:563\n1#3:566\n1#3:569\n1#3:572\n1#3:574\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n172#1:547\n173#1:549\n174#1:551\n175#1:553\n179#1:555,2\n183#1:558,2\n187#1:561,2\n191#1:564,2\n195#1:567,2\n199#1:570,2\n203#1:573\n172#1:548\n173#1:550\n174#1:552\n175#1:554\n179#1:557\n183#1:560\n187#1:563\n191#1:566\n195#1:569\n199#1:572\n203#1:574\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0000\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "",
        "it",
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
.field public static final INSTANCE:Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;

    invoke-direct {v0}, Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;->INSTANCE:Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Landroidx/compose/ui/text/AnnotatedString$Range;
    .locals 12
    .param p1, "it"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 171
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    .line 172
    .local v0, "list":Ljava/util/List;
    const/4 v1, 0x0

    .line 555
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 172
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .local v1, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 547
    .local v3, "$i$f$restore":I
    const/4 v4, 0x0

    if-eqz v1, :cond_0

    move-object v5, v1

    .line 548
    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 547
    .local v6, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v5, Landroidx/compose/ui/text/AnnotationType;

    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_0

    :cond_0
    move-object v5, v4

    .line 172
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$restore":I
    :goto_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 173
    .local v5, "marker":Landroidx/compose/ui/text/AnnotationType;
    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .restart local v1    # "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 549
    .restart local v3    # "$i$f$restore":I
    if-eqz v1, :cond_1

    move-object v6, v1

    .line 550
    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 549
    .local v7, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v6, Ljava/lang/Integer;

    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_1

    :cond_1
    move-object v6, v4

    .line 173
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$restore":I
    :goto_1
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 174
    .local v1, "start":I
    const/4 v3, 0x3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .local v3, "value$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 551
    .local v6, "$i$f$restore":I
    if-eqz v3, :cond_2

    move-object v7, v3

    .line 552
    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 551
    .local v8, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v7, Ljava/lang/Integer;

    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_2

    :cond_2
    move-object v7, v4

    .line 174
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$restore":I
    :goto_2
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 175
    .local v3, "end":I
    const/4 v6, 0x4

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .local v6, "value$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 553
    .local v7, "$i$f$restore":I
    if-eqz v6, :cond_3

    move-object v8, v6

    .line 554
    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 553
    .local v9, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v8, Ljava/lang/String;

    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-SaversKt$restore$2$iv":I
    goto :goto_3

    :cond_3
    move-object v8, v4

    .line 175
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$restore":I
    :goto_3
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 177
    .local v8, "tag":Ljava/lang/String;
    sget-object v6, Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotationType;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x1

    packed-switch v6, :pswitch_data_0

    .line 204
    new-instance v2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v2

    .line 203
    :pswitch_0
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 573
    .local v6, "$i$f$restore":I
    if-eqz v2, :cond_4

    move-object v4, v2

    .line 574
    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 573
    .local v7, "$i$a$-let-SaversKt$restore$2$iv":I
    check-cast v4, Ljava/lang/String;

    .line 203
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$restore":I
    .end local v7    # "$i$a$-let-SaversKt$restore$2$iv":I
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 204
    .local v4, "item":Ljava/lang/String;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 205
    invoke-static {v4}, Landroidx/compose/ui/text/StringAnnotation;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroidx/compose/ui/text/StringAnnotation;->box-impl(Ljava/lang/String;)Landroidx/compose/ui/text/StringAnnotation;

    move-result-object v6

    .line 206
    nop

    .line 207
    nop

    .line 208
    nop

    .line 204
    invoke-direct {v2, v6, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .end local v4    # "item":Ljava/lang/String;
    goto/16 :goto_a

    .line 199
    :pswitch_1
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .local v6, "value$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->access$getClickableSaver$p()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v7

    .local v7, "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 570
    .local v9, "$i$f$restore":I
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    instance-of v2, v7, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v2, :cond_5

    goto :goto_4

    .line 571
    :cond_5
    if-eqz v6, :cond_6

    move-object v2, v6

    .line 572
    .local v2, "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 571
    .local v4, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v10, v7

    .line 572
    .local v10, "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 571
    .local v11, "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v10, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v10, Landroidx/compose/ui/text/LinkAnnotation$Clickable;

    move-object v4, v10

    .line 199
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-SaversKt$restore$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :cond_6
    :goto_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 200
    .local v4, "item":Landroidx/compose/ui/text/LinkAnnotation$Clickable;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-direct {v2, v4, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .end local v4    # "item":Landroidx/compose/ui/text/LinkAnnotation$Clickable;
    goto/16 :goto_a

    .line 195
    :pswitch_2
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "value$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->access$getLinkSaver$p()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v7

    .restart local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 567
    .restart local v9    # "$i$f$restore":I
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    instance-of v2, v7, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v2, :cond_7

    goto :goto_5

    .line 568
    :cond_7
    if-eqz v6, :cond_8

    move-object v2, v6

    .line 569
    .restart local v2    # "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 568
    .local v4, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v10, v7

    .line 569
    .restart local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 568
    .restart local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v10, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v10, Landroidx/compose/ui/text/LinkAnnotation$Url;

    move-object v4, v10

    .line 195
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-SaversKt$restore$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :cond_8
    :goto_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 196
    .local v4, "item":Landroidx/compose/ui/text/LinkAnnotation$Url;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-direct {v2, v4, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .end local v4    # "item":Landroidx/compose/ui/text/LinkAnnotation$Url;
    goto/16 :goto_a

    .line 191
    :pswitch_3
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "value$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->access$getUrlAnnotationSaver$p()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v7

    .restart local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 564
    .restart local v9    # "$i$f$restore":I
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    instance-of v2, v7, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v2, :cond_9

    goto :goto_6

    .line 565
    :cond_9
    if-eqz v6, :cond_a

    move-object v2, v6

    .line 566
    .restart local v2    # "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 565
    .local v4, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v10, v7

    .line 566
    .restart local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 565
    .restart local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v10, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v10, Landroidx/compose/ui/text/UrlAnnotation;

    move-object v4, v10

    .line 191
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-SaversKt$restore$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :cond_a
    :goto_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 192
    .local v4, "item":Landroidx/compose/ui/text/UrlAnnotation;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-direct {v2, v4, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .end local v4    # "item":Landroidx/compose/ui/text/UrlAnnotation;
    goto/16 :goto_a

    .line 187
    :pswitch_4
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "value$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->access$getVerbatimTtsAnnotationSaver$p()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v7

    .restart local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 561
    .restart local v9    # "$i$f$restore":I
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    instance-of v2, v7, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v2, :cond_b

    goto :goto_7

    .line 562
    :cond_b
    if-eqz v6, :cond_c

    move-object v2, v6

    .line 563
    .restart local v2    # "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 562
    .local v4, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v10, v7

    .line 563
    .restart local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 562
    .restart local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v10, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v10, Landroidx/compose/ui/text/VerbatimTtsAnnotation;

    move-object v4, v10

    .line 187
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-SaversKt$restore$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :cond_c
    :goto_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 188
    .local v4, "item":Landroidx/compose/ui/text/VerbatimTtsAnnotation;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-direct {v2, v4, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .end local v4    # "item":Landroidx/compose/ui/text/VerbatimTtsAnnotation;
    goto :goto_a

    .line 183
    :pswitch_5
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "value$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->getSpanStyleSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v7

    .restart local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 558
    .restart local v9    # "$i$f$restore":I
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    instance-of v2, v7, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v2, :cond_d

    goto :goto_8

    .line 559
    :cond_d
    if-eqz v6, :cond_e

    move-object v2, v6

    .line 560
    .restart local v2    # "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 559
    .local v4, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v10, v7

    .line 560
    .restart local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 559
    .restart local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v10, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v10, Landroidx/compose/ui/text/SpanStyle;

    move-object v4, v10

    .line 183
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-SaversKt$restore$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :cond_e
    :goto_8
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 184
    .local v4, "item":Landroidx/compose/ui/text/SpanStyle;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-direct {v2, v4, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .end local v4    # "item":Landroidx/compose/ui/text/SpanStyle;
    goto :goto_a

    .line 179
    :pswitch_6
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "value$iv":Ljava/lang/Object;
    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->getParagraphStyleSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v7

    .restart local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v9, 0x0

    .line 555
    .restart local v9    # "$i$f$restore":I
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    instance-of v2, v7, Landroidx/compose/ui/text/NonNullValueClassSaver;

    if-nez v2, :cond_f

    goto :goto_9

    .line 556
    :cond_f
    if-eqz v6, :cond_10

    move-object v2, v6

    .line 557
    .restart local v2    # "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 556
    .local v4, "$i$a$-let-SaversKt$restore$1$iv":I
    move-object v10, v7

    .line 557
    .restart local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    const/4 v11, 0x0

    .line 556
    .restart local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    invoke-interface {v10, v6}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "$this$restore_u24lambda_u243_u24lambda_u242$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v11    # "$i$a$-with-SaversKt$restore$1$1$iv":I
    check-cast v10, Landroidx/compose/ui/text/ParagraphStyle;

    move-object v4, v10

    .line 179
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-SaversKt$restore$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    .end local v7    # "saver$iv":Landroidx/compose/runtime/saveable/Saver;
    .end local v9    # "$i$f$restore":I
    :cond_10
    :goto_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 180
    .local v4, "item":Landroidx/compose/ui/text/ParagraphStyle;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-direct {v2, v4, v1, v3, v8}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .line 211
    .end local v4    # "item":Landroidx/compose/ui/text/ParagraphStyle;
    :goto_a
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 140
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2;->invoke(Ljava/lang/Object;)Landroidx/compose/ui/text/AnnotatedString$Range;

    move-result-object v0

    return-object v0
.end method
