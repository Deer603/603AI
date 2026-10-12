package com.luchime.huiyuan;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.luchime.huiyuan.ui.HuiyuanAppKt;
import com.luchime.huiyuan.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda$-1759944654, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f87lambda$1759944654;
    private static Function2<Composer, Integer, Unit> lambda$360958139;

    public ComposableSingletons$MainActivityKt() {
    }

    /* JADX INFO: renamed from: getLambda$-1759944654$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7401getLambda$1759944654$app() {
        return f87lambda$1759944654;
    }

    public final Function2<Composer, Integer, Unit> getLambda$360958139$app() {
        return lambda$360958139;
    }

    static {
        INSTANCE = new ComposableSingletons$MainActivityKt();
        f87lambda$1759944654 = ComposableLambdaKt.composableLambdaInstance(-1759944654, false, new ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0());
        lambda$360958139 = ComposableLambdaKt.composableLambdaInstance(360958139, false, new ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda1());
    }

    static final Unit lambda_360958139$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C14@479L59:MainActivity.kt#mpeojn");
        if (($changed & 3) == 2) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(360958139, $changed, -1, "com.luchime.huiyuan.ComposableSingletons$MainActivityKt.lambda$360958139.<anonymous> (MainActivity.kt:14)");
    L11:
        ThemeKt.HuiyuanAITheme(f87lambda$1759944654, $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit lambda__1759944654$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C15@512L12:MainActivity.kt#mpeojn");
        if (($changed & 3) == 2) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1759944654, $changed, -1, "com.luchime.huiyuan.ComposableSingletons$MainActivityKt.lambda$-1759944654.<anonymous> (MainActivity.kt:15)");
    L11:
        HuiyuanAppKt.HuiyuanApp($composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }
}
