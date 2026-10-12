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
    public static final ComposableSingletons$HuiyuanAppKt INSTANCE = new ComposableSingletons$HuiyuanAppKt();

    /* JADX INFO: renamed from: lambda$-1957827056, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f92lambda$1957827056 = ComposableLambdaKt.composableLambdaInstance(-1957827056, false, new Function2() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HuiyuanAppKt.lambda__1957827056$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$689415095 = ComposableLambdaKt.composableLambdaInstance(689415095, false, new Function2() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HuiyuanAppKt.lambda_689415095$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1957827056$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7407getLambda$1957827056$app() {
        return f92lambda$1957827056;
    }

    public final Function2<Composer, Integer, Unit> getLambda$689415095$app() {
        return lambda$689415095;
    }

    static final Unit lambda__1957827056$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C570@22544L12:HuiyuanApp.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1957827056, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt.lambda$-1957827056.<anonymous> (HuiyuanApp.kt:570)");
            }
            HuiyuanAppKt.HuiyuanApp($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_689415095$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C576@22701L12:HuiyuanApp.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(689415095, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt.lambda$689415095.<anonymous> (HuiyuanApp.kt:576)");
            }
            HuiyuanAppKt.HuiyuanApp($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
