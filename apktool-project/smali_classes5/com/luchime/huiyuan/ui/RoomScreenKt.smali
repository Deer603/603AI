.class public final Lcom/luchime/huiyuan/ui/RoomScreenKt;
.super Ljava/lang/Object;
.source "RoomScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRoomScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomScreen.kt\ncom/luchime/huiyuan/ui/RoomScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,153:1\n1247#2,6:154\n1247#2,6:160\n1247#2,6:166\n85#3:172\n85#3:173\n64#4,5:174\n*S KotlinDebug\n*F\n+ 1 RoomScreen.kt\ncom/luchime/huiyuan/ui/RoomScreenKt\n*L\n47#1:154,6\n51#1:160,6\n143#1:166,6\n45#1:172\n46#1:173\n144#1:174,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006H\u0001\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008\u00b2\u0006\u0016\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u008a\u0084\u0002\u00b2\u0006\u0010\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006X\u008a\u0084\u0002"
    }
    d2 = {
        "RoomScreen",
        "",
        "onModelSelected",
        "Lkotlin/Function1;",
        "Lcom/luchime/huiyuan/ui/AIModel;",
        "onOpenChat",
        "Lkotlin/Function0;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "app",
        "latestModelCallback",
        "latestOpenChat"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final RoomScreen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .param p0, "onModelSelected"    # Lkotlin/jvm/functions/Function1;
    .param p1, "onOpenChat"    # Lkotlin/jvm/functions/Function0;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "onModelSelected"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onOpenChat"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    const v3, -0x20ca8e2c

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const-string v4, "C(RoomScreen)44@1485L37,45@1549L32,46@1606L37,50@1723L4727,48@1649L4807,142@6485L181,142@6462L204:RoomScreen.kt#cyjvf"

    invoke-static {v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v4, p3

    .local v4, "$dirty":I
    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v4, v5

    :cond_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_1

    :cond_2
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    :cond_3
    move v10, v4

    .end local v4    # "$dirty":I
    .local v10, "$dirty":I
    and-int/lit8 v4, v10, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v5, v10, 0x1

    invoke-interface {v7, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, -0x1

    const-string v5, "com.luchime.huiyuan.ui.RoomScreen (RoomScreen.kt:43)"

    invoke-static {v3, v10, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 45
    :cond_5
    and-int/lit8 v3, v10, 0xe

    invoke-static {v0, v7, v3}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    .line 46
    .local v3, "latestModelCallback$delegate":Landroidx/compose/runtime/State;
    shr-int/lit8 v4, v10, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-static {v1, v7, v4}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v11

    .line 47
    .local v11, "latestOpenChat$delegate":Landroidx/compose/runtime/State;
    const v4, -0x185f8dc7

    const-string v12, "CC(remember):RoomScreen.kt#9igjgp"

    invoke-static {v7, v4, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v4, 0x0

    .local v4, "invalid\\1":Z
    move-object v5, v7

    .local v5, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 154
    .local v8, "$i$f$cache\\1\\47":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\1":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 155
    .local v13, "$i$a$-let-ComposerKt$cache$1\\2\\154\\1":I
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v9, v14, :cond_6

    .line 156
    const/4 v14, 0x0

    .line 47
    .local v14, "$i$a$-cache-RoomScreenKt$RoomScreen$webViewHolder$1\\3\\156\\0":I
    new-array v14, v6, [Landroid/webkit/WebView;

    .line 156
    .end local v14    # "$i$a$-cache-RoomScreenKt$RoomScreen$webViewHolder$1\\3\\156\\0":I
    nop

    .line 157
    .local v14, "value\\2":Ljava/lang/Object;
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 158
    move-object v9, v14

    .end local v14    # "value\\2":Ljava/lang/Object;
    goto :goto_3

    .line 159
    :cond_6
    nop

    .line 154
    .end local v9    # "it\\1":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1\\2\\154\\1":I
    :goto_3
    nop

    .line 47
    .end local v4    # "invalid\\1":Z
    .end local v5    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache\\1\\47":I
    move-object v13, v9

    check-cast v13, [Landroid/webkit/WebView;

    .local v13, "webViewHolder":[Landroid/webkit/WebView;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 50
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static {v4, v5, v6, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 51
    const v4, -0x185f6cd5

    invoke-static {v7, v4, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    .local v4, "invalid\\4":Z
    move-object v6, v7

    .local v6, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 160
    .local v8, "$i$f$cache\\4\\51":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\4":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 161
    .local v14, "$i$a$-let-ComposerKt$cache$1\\5\\160\\4":I
    if-nez v4, :cond_8

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v9, v15, :cond_7

    goto :goto_4

    .line 165
    :cond_7
    move/from16 p2, v4

    goto :goto_5

    .line 162
    :cond_8
    :goto_4
    const/4 v15, 0x0

    .line 51
    .local v15, "$i$a$-cache-RoomScreenKt$RoomScreen$1\\6\\162\\0":I
    move/from16 p2, v4

    .end local v4    # "invalid\\4":Z
    .local p2, "invalid\\4":Z
    new-instance v4, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;

    invoke-direct {v4, v13, v3, v11}, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda0;-><init>([Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 162
    .end local v15    # "$i$a$-cache-RoomScreenKt$RoomScreen$1\\6\\162\\0":I
    nop

    .line 163
    .local v4, "value\\5":Ljava/lang/Object;
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 164
    move-object v9, v4

    .line 160
    .end local v4    # "value\\5":Ljava/lang/Object;
    .end local v9    # "it\\4":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1\\5\\160\\4":I
    :goto_5
    nop

    .line 51
    .end local v6    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache\\4\\51":I
    .end local p2    # "invalid\\4":Z
    move-object v4, v9

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 50
    nop

    .line 49
    const/4 v6, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x4

    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 143
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v5, -0x185d2b57

    invoke-static {v7, v5, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    .local v5, "invalid\\7":Z
    move-object v6, v7

    .local v6, "$this$cache\\7":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 166
    .local v8, "$i$f$cache\\7\\143":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it\\7":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 167
    .local v12, "$i$a$-let-ComposerKt$cache$1\\8\\166\\7":I
    if-nez v5, :cond_a

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v9, v14, :cond_9

    goto :goto_6

    .line 171
    :cond_9
    goto :goto_7

    .line 168
    :cond_a
    :goto_6
    const/4 v14, 0x0

    .line 143
    .local v14, "$i$a$-cache-RoomScreenKt$RoomScreen$2\\9\\168\\0":I
    new-instance v15, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v15, v13}, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda1;-><init>([Landroid/webkit/WebView;)V

    .line 168
    .end local v14    # "$i$a$-cache-RoomScreenKt$RoomScreen$2\\9\\168\\0":I
    nop

    .line 169
    .local v15, "value\\8":Ljava/lang/Object;
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 170
    move-object v9, v15

    .line 166
    .end local v9    # "it\\7":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1\\8\\166\\7":I
    .end local v15    # "value\\8":Ljava/lang/Object;
    :goto_7
    nop

    .line 143
    .end local v5    # "invalid\\7":Z
    .end local v6    # "$this$cache\\7":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache\\7\\143":I
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v5, 0x6

    invoke-static {v4, v9, v7, v5}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v3    # "latestModelCallback$delegate":Landroidx/compose/runtime/State;
    .end local v11    # "latestOpenChat$delegate":Landroidx/compose/runtime/State;
    .end local v13    # "webViewHolder":[Landroid/webkit/WebView;
    goto :goto_8

    .line 39
    :cond_b
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 152
    :cond_c
    :goto_8
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v4, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda2;

    invoke-direct {v4, v0, v1, v2}, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void
.end method

.method private static final RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
    .locals 4
    .param p0, "$latestModelCallback$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 45
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 172
    .local v3, "$i$f$getValue\\1\\45":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\45":I
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 45
    return-object v0
.end method

.method private static final RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;
    .locals 4
    .param p0, "$latestOpenChat$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 46
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 173
    .local v3, "$i$f$getValue\\1\\46":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue\\1\\46":I
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 46
    return-object v0
.end method

.method static final RoomScreen$lambda$12$lambda$11([Landroid/webkit/WebView;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 3
    .param p0, "$webViewHolder"    # [Landroid/webkit/WebView;
    .param p1, "$this$DisposableEffect"    # Landroidx/compose/runtime/DisposableEffectScope;

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    move-object v0, p1

    .local v0, "this_\\1":Landroidx/compose/runtime/DisposableEffectScope;
    const/4 v1, 0x0

    .line 174
    .local v1, "$i$f$onDispose\\1\\144":I
    new-instance v2, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1;

    invoke-direct {v2, p0}, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1;-><init>([Landroid/webkit/WebView;)V

    check-cast v2, Landroidx/compose/runtime/DisposableEffectResult;

    .line 178
    nop

    .line 150
    .end local v0    # "this_\\1":Landroidx/compose/runtime/DisposableEffectScope;
    .end local v1    # "$i$f$onDispose\\1\\144":I
    return-object v2
.end method

.method static final RoomScreen$lambda$13(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p2, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p1, p3, v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final RoomScreen$lambda$8$lambda$7([Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 8
    .param p0, "$webViewHolder"    # [Landroid/webkit/WebView;
    .param p1, "$latestModelCallback$delegate"    # Landroidx/compose/runtime/State;
    .param p2, "$latestOpenChat$delegate"    # Landroidx/compose/runtime/State;
    .param p3, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    new-instance v0, Landroidx/webkit/WebViewAssetLoader$Builder;

    invoke-direct {v0}, Landroidx/webkit/WebViewAssetLoader$Builder;-><init>()V

    .line 53
    new-instance v1, Landroidx/webkit/WebViewAssetLoader$AssetsPathHandler;

    invoke-direct {v1, p3}, Landroidx/webkit/WebViewAssetLoader$AssetsPathHandler;-><init>(Landroid/content/Context;)V

    check-cast v1, Landroidx/webkit/WebViewAssetLoader$PathHandler;

    const-string v2, "/assets/"

    invoke-virtual {v0, v2, v1}, Landroidx/webkit/WebViewAssetLoader$Builder;->addPathHandler(Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;)Landroidx/webkit/WebViewAssetLoader$Builder;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroidx/webkit/WebViewAssetLoader$Builder;->build()Landroidx/webkit/WebViewAssetLoader;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    nop

    .line 55
    .local v0, "assetLoader":Landroidx/webkit/WebViewAssetLoader;
    new-instance v1, Landroid/webkit/WebView;

    invoke-direct {v1, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    move-object v2, v1

    .local v2, "$this$RoomScreen_u24lambda_u248_u24lambda_u247_u24lambda_u246\\1":Landroid/webkit/WebView;
    const/4 v3, 0x0

    .line 56
    .local v3, "$i$a$-apply-RoomScreenKt$RoomScreen$1$1$1\\1\\55\\0":I
    const/4 v4, 0x0

    aput-object v2, p0, v4

    .line 57
    const/16 v5, 0x18

    const/16 v6, 0x1f

    const/16 v7, 0x14

    invoke-static {v7, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 58
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 59
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 60
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 61
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 62
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 63
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 64
    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 65
    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 66
    const/4 v4, 0x2

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setOverScrollMode(I)V

    .line 67
    new-instance v4, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda4;

    invoke-direct {v4}, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda4;-><init>()V

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 76
    new-instance v4, Landroid/webkit/WebChromeClient;

    invoke-direct {v4}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 77
    nop

    .line 78
    new-instance v4, Lcom/luchime/huiyuan/ui/RoomBridge;

    .line 77
    new-instance v5, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda5;

    invoke-direct {v5, v2, p1, p2}, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda5;-><init>(Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 78
    invoke-direct {v4, v5}, Lcom/luchime/huiyuan/ui/RoomBridge;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 93
    nop

    .line 77
    const-string v5, "RoomBridge"

    invoke-virtual {v2, v4, v5}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    new-instance v4, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;

    invoke-direct {v4, v0, p1, p2}, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;-><init>(Landroidx/webkit/WebViewAssetLoader;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    check-cast v4, Landroid/webkit/WebViewClient;

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 138
    const-string v4, "https://appassets.androidplatform.net/assets/room603/index.html"

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 139
    nop

    .line 55
    .end local v2    # "$this$RoomScreen_u24lambda_u248_u24lambda_u247_u24lambda_u246\\1":Landroid/webkit/WebView;
    .end local v3    # "$i$a$-apply-RoomScreenKt$RoomScreen$1$1$1\\1\\55\\0":I
    nop

    .line 139
    return-object v1
.end method

.method static final RoomScreen$lambda$8$lambda$7$lambda$6$lambda$3(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3
    .param p0, "view"    # Landroid/view/View;
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 72
    :pswitch_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 70
    :pswitch_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 74
    :cond_0
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static final RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5(Landroid/webkit/WebView;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$this_apply"    # Landroid/webkit/WebView;
    .param p1, "$latestModelCallback$delegate"    # Landroidx/compose/runtime/State;
    .param p2, "$latestOpenChat$delegate"    # Landroidx/compose/runtime/State;
    .param p3, "characterId"    # Ljava/lang/String;

    const-string v0, "characterId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    new-instance v0, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda3;

    invoke-direct {v0, p3, p1, p2}, Lcom/luchime/huiyuan/ui/RoomScreenKt$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 92
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 2
    .param p0, "$characterId"    # Ljava/lang/String;
    .param p1, "$latestModelCallback$delegate"    # Landroidx/compose/runtime/State;
    .param p2, "$latestOpenChat$delegate"    # Landroidx/compose/runtime/State;

    .line 80
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :goto_0
    goto :goto_1

    :sswitch_0
    const-string v1, "tango"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->TANGO:Lcom/luchime/huiyuan/ui/AIModel;

    goto :goto_2

    .line 80
    :sswitch_1
    const-string v1, "piaoai"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->PIAO:Lcom/luchime/huiyuan/ui/AIModel;

    goto :goto_2

    .line 80
    :sswitch_2
    const-string v1, "kunkun"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 81
    :cond_2
    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->HUIYUAN:Lcom/luchime/huiyuan/ui/AIModel;

    goto :goto_2

    .line 80
    :sswitch_3
    const-string v1, "guigui"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 83
    :cond_3
    sget-object v0, Lcom/luchime/huiyuan/ui/AIModel;->GUIGUI:Lcom/luchime/huiyuan/ui/AIModel;

    goto :goto_2

    .line 85
    :goto_1
    const/4 v0, 0x0

    .line 80
    :goto_2
    nop

    .line 87
    .local v0, "model":Lcom/luchime/huiyuan/ui/AIModel;
    if-eqz v0, :cond_4

    .line 88
    invoke-static {p1}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    invoke-static {p2}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 91
    :cond_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x499acde0 -> :sswitch_3
        -0x42c51680 -> :sswitch_2
        -0x3aebd1b1 -> :sswitch_1
        0x6906849 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final synthetic access$RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .param p0, "$latestModelCallback$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .param p0, "$latestOpenChat$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method
