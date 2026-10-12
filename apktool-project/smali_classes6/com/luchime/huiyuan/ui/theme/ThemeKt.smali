.class public final Lcom/luchime/huiyuan/ui/theme/ThemeKt;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0008\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "HuiyuanColorScheme",
        "Landroidx/compose/material3/ColorScheme;",
        "HuiyuanAITheme",
        "",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
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
.field private static final HuiyuanColorScheme:Landroidx/compose/material3/ColorScheme;


# direct methods
.method static constructor <clinit>()V
    .locals 76

    .line 7
    nop

    .line 8
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanInk()J

    move-result-wide v1

    .line 9
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanGreen()J

    move-result-wide v11

    .line 10
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanRed()J

    move-result-wide v19

    .line 11
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanPaper()J

    move-result-wide v27

    .line 12
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanPaper()J

    move-result-wide v31

    .line 13
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanPaper()J

    move-result-wide v3

    .line 14
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanInk()J

    move-result-wide v13

    .line 15
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanInk()J

    move-result-wide v21

    .line 16
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanInk()J

    move-result-wide v29

    .line 17
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/ColorKt;->getHuiyuanInk()J

    move-result-wide v33

    .line 8
    nop

    .line 13
    nop

    .line 7
    nop

    .line 9
    nop

    .line 14
    nop

    .line 7
    nop

    .line 10
    nop

    .line 15
    nop

    .line 7
    nop

    .line 11
    nop

    .line 16
    nop

    .line 12
    nop

    .line 17
    nop

    .line 7
    const/16 v74, 0xf

    const/16 v75, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const-wide/16 v59, 0x0

    const-wide/16 v61, 0x0

    const-wide/16 v63, 0x0

    const-wide/16 v65, 0x0

    const-wide/16 v67, 0x0

    const-wide/16 v69, 0x0

    const-wide/16 v71, 0x0

    const v73, -0x1e664

    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->lightColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/luchime/huiyuan/ui/theme/ThemeKt;->HuiyuanColorScheme:Landroidx/compose/material3/ColorScheme;

    return-void
.end method

.method public static final HuiyuanAITheme(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .param p0, "content"    # Lkotlin/jvm/functions/Function2;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    const v0, 0x1f1a8620

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string p1, "C(HuiyuanAITheme)23@600L121:Theme.kt#q3nhc0"

    invoke-static {v5, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move p1, p2

    .local p1, "$dirty":I
    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr p1, v1

    :cond_1
    and-int/lit8 v1, p1, 0x3

    if-eq v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v2, p1, 0x1

    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v2, "com.luchime.huiyuan.ui.theme.HuiyuanAITheme (Theme.kt:22)"

    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 25
    :cond_3
    sget-object v1, Lcom/luchime/huiyuan/ui/theme/ThemeKt;->HuiyuanColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 26
    invoke-static {}, Lcom/luchime/huiyuan/ui/theme/TypeKt;->getTypography()Landroidx/compose/material3/Typography;

    move-result-object v3

    .line 27
    shl-int/lit8 v0, p1, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v6, v0, 0x186

    .line 24
    const/4 v2, 0x0

    const/4 v7, 0x2

    move-object v4, p0

    .end local p0    # "content":Lkotlin/jvm/functions/Function2;
    .local v4, "content":Lkotlin/jvm/functions/Function2;
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_2

    .line 20
    .end local v4    # "content":Lkotlin/jvm/functions/Function2;
    .restart local p0    # "content":Lkotlin/jvm/functions/Function2;
    :cond_4
    move-object v4, p0

    .end local p0    # "content":Lkotlin/jvm/functions/Function2;
    .restart local v4    # "content":Lkotlin/jvm/functions/Function2;
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 29
    :cond_5
    :goto_2
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance v0, Lcom/luchime/huiyuan/ui/theme/ThemeKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, v4, p2}, Lcom/luchime/huiyuan/ui/theme/ThemeKt$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_6
    return-void
.end method

.method static final HuiyuanAITheme$lambda$0(Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    or-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p0, p2, v0}, Lcom/luchime/huiyuan/ui/theme/ThemeKt;->HuiyuanAITheme(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
