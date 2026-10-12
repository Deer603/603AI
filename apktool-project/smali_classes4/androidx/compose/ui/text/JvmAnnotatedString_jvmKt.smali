.class public final Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;
.super Ljava/lang/Object;
.source "JvmAnnotatedString.jvm.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n150#2,3:64\n34#2,6:67\n153#2:73\n269#2,3:74\n34#2,6:77\n272#2:83\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n44#1:64,3\n44#1:67,6\n44#1:73\n56#1:74,3\n56#1:77,6\n56#1:83\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0004\u0018\u00010\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a,\u0010\u0008\u001a\u00020\t*\u00020\t2\u001e\u0010\u0008\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "collectRangeTransitions",
        "",
        "ranges",
        "",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "target",
        "Ljava/util/SortedSet;",
        "",
        "transform",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "Lkotlin/Function3;",
        "",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V
    .locals 16
    .param p0, "ranges"    # Ljava/util/List;
    .param p1, "target"    # Ljava/util/SortedSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "*>;>;",
            "Ljava/util/SortedSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 56
    if-eqz p0, :cond_1

    move-object/from16 v0, p0

    .local v0, "$this$fastFold$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 74
    .local v1, "$i$f$fastFold":I
    nop

    .line 75
    const/4 v2, 0x0

    .local v2, "accumulator$iv":Ljava/lang/Object;
    move-object/from16 v2, p1

    .line 76
    move-object v3, v0

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 77
    .local v4, "$i$f$fastForEach":I
    nop

    .line 78
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_0

    .line 79
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 80
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "e$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 76
    .local v9, "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    move-object v10, v8

    check-cast v10, Landroidx/compose/ui/text/AnnotatedString$Range;

    .local v10, "range":Landroidx/compose/ui/text/AnnotatedString$Range;
    move-object v11, v2

    .local v11, "acc":Ljava/util/SortedSet;
    const/4 v12, 0x0

    .line 57
    .local v12, "$i$a$-fastFold-JvmAnnotatedString_jvmKt$collectRangeTransitions$1":I
    move-object v13, v11

    .local v13, "$this$collectRangeTransitions_u24lambda_u242_u24lambda_u241":Ljava/util/SortedSet;
    const/4 v14, 0x0

    .line 58
    .local v14, "$i$a$-apply-JvmAnnotatedString_jvmKt$collectRangeTransitions$1$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v15}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-virtual {v10}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v15}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 60
    nop

    .line 57
    .end local v13    # "$this$collectRangeTransitions_u24lambda_u242_u24lambda_u241":Ljava/util/SortedSet;
    .end local v14    # "$i$a$-apply-JvmAnnotatedString_jvmKt$collectRangeTransitions$1$1":I
    nop

    .line 60
    nop

    .line 76
    .end local v10    # "range":Landroidx/compose/ui/text/AnnotatedString$Range;
    .end local v11    # "acc":Ljava/util/SortedSet;
    .end local v12    # "$i$a$-fastFold-JvmAnnotatedString_jvmKt$collectRangeTransitions$1":I
    nop

    .line 80
    .end local v8    # "e$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    nop

    .line 78
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 82
    .end local v5    # "index$iv$iv":I
    :cond_0
    nop

    .line 83
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    nop

    .line 62
    .end local v0    # "$this$fastFold$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastFold":I
    .end local v2    # "accumulator$iv":Ljava/lang/Object;
    :cond_1
    return-void
.end method

.method public static final transform(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/text/AnnotatedString;
    .locals 23
    .param p0, "$this$transform"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p1, "transform"    # Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/compose/ui/text/AnnotatedString;"
        }
    .end annotation

    .line 33
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    invoke-static {v0}, Lkotlin/collections/SetsKt;->sortedSetOf([Ljava/lang/Object;)Ljava/util/TreeSet;

    move-result-object v0

    .line 34
    .local v0, "transitions":Ljava/util/TreeSet;
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    move-result-object v3

    move-object v5, v0

    check-cast v5, Ljava/util/SortedSet;

    invoke-static {v3, v5}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;->collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V

    .line 36
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v3, "resultStr":Lkotlin/jvm/internal/Ref$ObjectRef;
    const-string v5, ""

    iput-object v5, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 37
    new-array v4, v4, [Lkotlin/Pair;

    invoke-static {v2, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 38
    .local v1, "offsetMap":Ljava/util/Map;
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    new-instance v2, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt$transform$1;

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    invoke-direct {v2, v3, v12, v11, v1}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt$transform$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)V

    move-object v8, v2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lkotlin/collections/CollectionsKt;->windowed$default(Ljava/lang/Iterable;IIZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/List;

    .line 44
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .local v2, "$this$fastMap$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 64
    .local v4, "$i$f$fastMap":I
    nop

    .line 65
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .local v5, "target$iv":Ljava/util/ArrayList;
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 67
    .local v7, "$i$f$fastForEach":I
    nop

    .line 68
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_0

    .line 69
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 70
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v10

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 66
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v15, v5

    check-cast v15, Ljava/util/Collection;

    move-object/from16 v16, v13

    check-cast v16, Landroidx/compose/ui/text/AnnotatedString$Range;

    .local v16, "it":Landroidx/compose/ui/text/AnnotatedString$Range;
    const/16 v17, 0x0

    .line 44
    .local v17, "$i$a$-fastMap-JvmAnnotatedString_jvmKt$transform$newAnnotations$1":I
    move-object/from16 v18, v0

    .end local v0    # "transitions":Ljava/util/TreeSet;
    .local v18, "transitions":Ljava/util/TreeSet;
    new-instance v0, Landroidx/compose/ui/text/AnnotatedString$Range;

    move-object/from16 v19, v2

    .end local v2    # "$this$fastMap$iv":Ljava/util/List;
    .local v19, "$this$fastMap$iv":Ljava/util/List;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    move-result v20

    move/from16 v21, v4

    .end local v4    # "$i$f$fastMap":I
    .local v21, "$i$f$fastMap":I
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    move-result v20

    move-object/from16 v22, v5

    .end local v5    # "target$iv":Ljava/util/ArrayList;
    .local v22, "target$iv":Ljava/util/ArrayList;
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-direct {v0, v2, v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;II)V

    .line 66
    .end local v16    # "it":Landroidx/compose/ui/text/AnnotatedString$Range;
    .end local v17    # "$i$a$-fastMap-JvmAnnotatedString_jvmKt$transform$newAnnotations$1":I
    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 68
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v18

    move-object/from16 v2, v19

    move/from16 v4, v21

    move-object/from16 v5, v22

    goto :goto_0

    .end local v18    # "transitions":Ljava/util/TreeSet;
    .end local v19    # "$this$fastMap$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastMap":I
    .end local v22    # "target$iv":Ljava/util/ArrayList;
    .restart local v0    # "transitions":Ljava/util/TreeSet;
    .restart local v2    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastMap":I
    .restart local v5    # "target$iv":Ljava/util/ArrayList;
    :cond_0
    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move/from16 v21, v4

    move-object/from16 v22, v5

    .line 72
    .end local v0    # "transitions":Ljava/util/TreeSet;
    .end local v2    # "$this$fastMap$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastMap":I
    .end local v5    # "target$iv":Ljava/util/ArrayList;
    .end local v8    # "index$iv$iv":I
    .restart local v18    # "transitions":Ljava/util/TreeSet;
    .restart local v19    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v21    # "$i$f$fastMap":I
    .restart local v22    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 73
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move-object/from16 v0, v22

    check-cast v0, Ljava/util/List;

    .end local v19    # "$this$fastMap$iv":Ljava/util/List;
    .end local v21    # "$i$f$fastMap":I
    .end local v22    # "target$iv":Ljava/util/ArrayList;
    goto :goto_1

    .line 44
    .end local v18    # "transitions":Ljava/util/TreeSet;
    .restart local v0    # "transitions":Ljava/util/TreeSet;
    :cond_1
    move-object/from16 v18, v0

    .end local v0    # "transitions":Ljava/util/TreeSet;
    .restart local v18    # "transitions":Ljava/util/TreeSet;
    const/4 v0, 0x0

    .line 43
    :goto_1
    nop

    .line 46
    .local v0, "newAnnotations":Ljava/util/List;
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString;

    iget-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, v0, v4}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v2
.end method
