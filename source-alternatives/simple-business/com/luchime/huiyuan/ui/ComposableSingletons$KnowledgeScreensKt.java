package com.luchime.huiyuan.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KnowledgeScreens.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$KnowledgeScreensKt {
    public static final ComposableSingletons$KnowledgeScreensKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda$-1919830167, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f93lambda$1919830167;
    private static Function2<Composer, Integer, Unit> lambda$1087424319;
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1130705734;
    private static Function2<Composer, Integer, Unit> lambda$693020480;

    public ComposableSingletons$KnowledgeScreensKt() {
    }

    /* JADX INFO: renamed from: getLambda$-1919830167$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7408getLambda$1919830167$app() {
        return f93lambda$1919830167;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1087424319$app() {
        return lambda$1087424319;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1130705734$app() {
        return lambda$1130705734;
    }

    public final Function2<Composer, Integer, Unit> getLambda$693020480$app() {
        return lambda$693020480;
    }

    static {
        INSTANCE = new ComposableSingletons$KnowledgeScreensKt();
        lambda$1087424319 = ComposableLambdaKt.composableLambdaInstance(1087424319, false, new ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda0());
        lambda$693020480 = ComposableLambdaKt.composableLambdaInstance(693020480, false, new ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda1());
        lambda$1130705734 = ComposableLambdaKt.composableLambdaInstance(1130705734, false, new ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda2());
        f93lambda$1919830167 = ComposableLambdaKt.composableLambdaInstance(-1919830167, false, new ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda3());
    }

    static final Unit lambda_1087424319$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C106@4412L22:KnowledgeScreens.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1087424319, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$1087424319.<anonymous> (KnowledgeScreens.kt:106)");
    L11:
        TextKt.m2820Text4IGK_g("搜索认知、创业、焦虑、AI…", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 6, 0, 131070);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda_693020480$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C107@4470L58:KnowledgeScreens.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(693020480, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$693020480.<anonymous> (KnowledgeScreens.kt:107)");
    L11:
        TextKt.m2820Text4IGK_g("⌕", null, 0, TextUnitKt.getSp(23), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 199686, 0, 131030);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda_1130705734$lambda$2(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C257@10604L44:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1130705734, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$1130705734.<anonymous> (KnowledgeScreens.kt:257)");
    L11:
        TextKt.m2820Text4IGK_g("浏览语录库", null, 0, 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196614, 0, 131038);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__1919830167$lambda$3(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C263@10755L266:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1919830167, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$-1919830167.<anonymous> (KnowledgeScreens.kt:263)");
    L11:
        TextKt.m2820Text4IGK_g("最近收藏", PaddingKt.m726paddingVpY3zN4(Modifier.Companion, Dp.m6973constructorimpl(17), Dp.m6973constructorimpl(14)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200118, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }
}
