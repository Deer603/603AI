package com.luchime.huiyuan.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$HuiyuanAppKt {
    public static final ComposableSingletons$HuiyuanAppKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda$-1957827056, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f92lambda$1957827056;
    private static Function2<Composer, Integer, Unit> lambda$689415095;

    public ComposableSingletons$HuiyuanAppKt() {
    }

    /* JADX INFO: renamed from: getLambda$-1957827056$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7407getLambda$1957827056$app() {
        return f92lambda$1957827056;
    }

    public final Function2<Composer, Integer, Unit> getLambda$689415095$app() {
        return lambda$689415095;
    }

    static {
        INSTANCE = new ComposableSingletons$HuiyuanAppKt();
        f92lambda$1957827056 = ComposableLambdaKt.composableLambdaInstance(-1957827056, false, new ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda0());
        lambda$689415095 = ComposableLambdaKt.composableLambdaInstance(689415095, false, new ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda1());
    }

    static final Unit lambda__1957827056$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C570@22544L12:HuiyuanApp.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1957827056, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt.lambda$-1957827056.<anonymous> (HuiyuanApp.kt:570)");
    L11:
        HuiyuanAppKt.HuiyuanApp($composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit lambda_689415095$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C576@22701L12:HuiyuanApp.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(689415095, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt.lambda$689415095.<anonymous> (HuiyuanApp.kt:576)");
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
