.class public final Lcom/luchime/huiyuan/ui/AppHapticsKt;
.super Ljava/lang/Object;
.source "AppHaptics.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppHaptics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppHaptics.kt\ncom/luchime/huiyuan/ui/AppHapticsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,98:1\n75#2:99\n75#2:106\n1247#3,6:100\n1247#3,6:107\n*S KotlinDebug\n*F\n+ 1 AppHaptics.kt\ncom/luchime/huiyuan/ui/AppHapticsKt\n*L\n83#1:99\n92#1:106\n84#1:100,6\n93#1:107,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\r\u0010\u0005\u001a\u00020\u0002H\u0001\u00a2\u0006\u0002\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\u0008*\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000\"\u001a\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0010"
    }
    d2 = {
        "LocalAppHaptics",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "Lcom/luchime/huiyuan/ui/AppHaptics;",
        "getLocalAppHaptics",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "rememberAppHaptics",
        "(Landroidx/compose/runtime/Composer;I)Lcom/luchime/huiyuan/ui/AppHaptics;",
        "hapticClickable",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "",
        "cue",
        "Lcom/luchime/huiyuan/ui/HapticCue;",
        "onClick",
        "Lkotlin/Function0;",
        "",
        "app"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LocalAppHaptics:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/luchime/huiyuan/ui/AppHaptics;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    new-instance v0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/AppHapticsKt;->LocalAppHaptics:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method static final LocalAppHaptics$lambda$0()Lcom/luchime/huiyuan/ui/AppHaptics;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    const-string v1, "AppHaptics must be provided by HuiyuanApp"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final getLocalAppHaptics()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/luchime/huiyuan/ui/AppHaptics;",
            ">;"
        }
    .end annotation

    .line 77
    sget-object v0, Lcom/luchime/huiyuan/ui/AppHapticsKt;->LocalAppHaptics:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method public static final hapticClickable(Landroidx/compose/ui/Modifier;ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
    .locals 3
    .param p0, "$this$hapticClickable"    # Landroidx/compose/ui/Modifier;
    .param p1, "enabled"    # Z
    .param p2, "cue"    # Lcom/luchime/huiyuan/ui/HapticCue;
    .param p3, "onClick"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lcom/luchime/huiyuan/ui/HapticCue;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    new-instance v0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1, p2, p3}, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;-><init>(ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v2}, Landroidx/compose/ui/ComposedModifierKt;->composed$default(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 97
    return-object v0
.end method

.method public static synthetic hapticClickable$default(Landroidx/compose/ui/Modifier;ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 87
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 88
    const/4 p1, 0x1

    .line 87
    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 89
    sget-object p2, Lcom/luchime/huiyuan/ui/HapticCue;->TAP:Lcom/luchime/huiyuan/ui/HapticCue;

    .line 87
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/luchime/huiyuan/ui/AppHapticsKt;->hapticClickable(Landroidx/compose/ui/Modifier;ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method static final hapticClickable$lambda$4(ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p0, "$enabled"    # Z
    .param p1, "$cue"    # Lcom/luchime/huiyuan/ui/HapticCue;
    .param p2, "$onClick"    # Lkotlin/jvm/functions/Function0;
    .param p3, "$this$composed"    # Landroidx/compose/ui/Modifier;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    move-object v0, p4

    const-string v1, "$this$composed"

    move-object v2, p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x79f8dec1

    invoke-interface {p4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "C91@2846L7,92@2887L54:AppHaptics.kt#cyjvf"

    invoke-static {p4, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.luchime.huiyuan.ui.hapticClickable.<anonymous> (AppHaptics.kt:91)"

    move/from16 v9, p5

    invoke-static {v1, v9, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v9, p5

    .line 92
    :goto_0
    sget-object v1, Lcom/luchime/huiyuan/ui/AppHapticsKt;->LocalAppHaptics:Landroidx/compose/runtime/ProvidableCompositionLocal;

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .local v1, "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    const/4 v3, 0x6

    .local v3, "$changed\\1":I
    move-object v4, p4

    .local v4, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 106
    .local v5, "$i$f$getCurrent\\1\\92":I
    const v6, 0x789c5f52

    const-string v7, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 92
    .end local v1    # "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    .end local v3    # "$changed\\1":I
    .end local v4    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$getCurrent\\1\\92":I
    move-object v1, v6

    check-cast v1, Lcom/luchime/huiyuan/ui/AppHaptics;

    .line 93
    .local v1, "haptics":Lcom/luchime/huiyuan/ui/AppHaptics;
    const v3, 0x20c3d755

    const-string v4, "CC(remember):AppHaptics.kt#9igjgp"

    invoke-static {p4, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    move-object v4, p1

    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-interface {p4, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .local v3, "invalid\\2":Z
    move-object v4, p4

    .local v4, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 107
    .local v5, "$i$f$cache\\2\\93":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\2":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 108
    .local v7, "$i$a$-let-ComposerKt$cache$1\\3\\107\\2":I
    if-nez v3, :cond_2

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_1

    goto :goto_1

    .line 112
    :cond_1
    goto :goto_2

    .line 109
    :cond_2
    :goto_1
    const/4 v8, 0x0

    .line 93
    .local v8, "$i$a$-cache-AppHapticsKt$hapticClickable$1$1\\4\\109\\0":I
    new-instance v10, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;

    invoke-direct {v10, v1, p1, p2}, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;-><init>(Lcom/luchime/huiyuan/ui/AppHaptics;Lcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)V

    .line 109
    .end local v8    # "$i$a$-cache-AppHapticsKt$hapticClickable$1$1\\4\\109\\0":I
    nop

    .line 110
    .local v10, "value\\3":Ljava/lang/Object;
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 111
    move-object v6, v10

    .line 107
    .end local v6    # "it\\2":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\3\\107\\2":I
    .end local v10    # "value\\3":Ljava/lang/Object;
    :goto_2
    nop

    .line 93
    .end local v3    # "invalid\\2":Z
    .end local v4    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache\\2\\93":I
    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v3, p0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v4
.end method

.method static final hapticClickable$lambda$4$lambda$3$lambda$2(Lcom/luchime/huiyuan/ui/AppHaptics;Lcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 1
    .param p0, "$haptics"    # Lcom/luchime/huiyuan/ui/AppHaptics;
    .param p1, "$cue"    # Lcom/luchime/huiyuan/ui/HapticCue;
    .param p2, "$onClick"    # Lkotlin/jvm/functions/Function0;

    .line 94
    invoke-virtual {p0, p1}, Lcom/luchime/huiyuan/ui/AppHaptics;->perform(Lcom/luchime/huiyuan/ui/HapticCue;)V

    .line 95
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 96
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final rememberAppHaptics(Landroidx/compose/runtime/Composer;I)Lcom/luchime/huiyuan/ui/AppHaptics;
    .locals 8
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    .line 82
    const v0, 0x810d697

    const-string v1, "C(rememberAppHaptics)82@2601L7,83@2620L35:AppHaptics.kt#cyjvf"

    invoke-static {p0, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.luchime.huiyuan.ui.rememberAppHaptics (AppHaptics.kt:81)"

    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 83
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .local v0, "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    const/4 v1, 0x0

    .local v1, "$changed\\1":I
    move-object v2, p0

    .local v2, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 99
    .local v3, "$i$f$getCurrent\\1\\83":I
    const v4, 0x789c5f52

    const-string v5, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 83
    .end local v0    # "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    .end local v1    # "$changed\\1":I
    .end local v2    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$getCurrent\\1\\83":I
    move-object v0, v4

    check-cast v0, Landroid/view/View;

    .line 84
    .local v0, "view":Landroid/view/View;
    const v1, 0x473599fa

    const-string v2, "CC(remember):AppHaptics.kt#9igjgp"

    invoke-static {p0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid\\2":Z
    move-object v2, p0

    .local v2, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 100
    .local v3, "$i$f$cache\\2\\84":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it\\2":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 101
    .local v5, "$i$a$-let-ComposerKt$cache$1\\3\\100\\2":I
    if-nez v1, :cond_2

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_1

    goto :goto_0

    .line 105
    :cond_1
    goto :goto_1

    .line 102
    :cond_2
    :goto_0
    const/4 v6, 0x0

    .line 84
    .local v6, "$i$a$-cache-AppHapticsKt$rememberAppHaptics$1\\4\\102\\0":I
    new-instance v7, Lcom/luchime/huiyuan/ui/AppHaptics;

    invoke-direct {v7, v0}, Lcom/luchime/huiyuan/ui/AppHaptics;-><init>(Landroid/view/View;)V

    .line 102
    .end local v6    # "$i$a$-cache-AppHapticsKt$rememberAppHaptics$1\\4\\102\\0":I
    nop

    .line 103
    .local v7, "value\\3":Ljava/lang/Object;
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 104
    move-object v4, v7

    .line 100
    .end local v4    # "it\\2":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1\\3\\100\\2":I
    .end local v7    # "value\\3":Ljava/lang/Object;
    :goto_1
    nop

    .line 84
    .end local v1    # "invalid\\2":Z
    .end local v2    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\2\\84":I
    check-cast v4, Lcom/luchime/huiyuan/ui/AppHaptics;

    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 82
    :cond_3
    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 84
    return-object v4
.end method
