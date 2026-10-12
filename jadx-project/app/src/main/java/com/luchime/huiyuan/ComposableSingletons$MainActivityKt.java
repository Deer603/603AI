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
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();

    /* JADX INFO: renamed from: lambda$-1759944654, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f87lambda$1759944654 = ComposableLambdaKt.composableLambdaInstance(-1759944654, false, new Function2() { // from class: com.luchime.huiyuan.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__1759944654$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$360958139 = ComposableLambdaKt.composableLambdaInstance(360958139, false, new Function2() { // from class: com.luchime.huiyuan.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_360958139$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1759944654$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7401getLambda$1759944654$app() {
        return f87lambda$1759944654;
    }

    public final Function2<Composer, Integer, Unit> getLambda$360958139$app() {
        return lambda$360958139;
    }

    static final Unit lambda_360958139$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C14@479L59:MainActivity.kt#mpeojn");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(360958139, $changed, -1, "com.luchime.huiyuan.ComposableSingletons$MainActivityKt.lambda$360958139.<anonymous> (MainActivity.kt:14)");
            }
            ThemeKt.HuiyuanAITheme(f87lambda$1759944654, $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1759944654$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C15@512L12:MainActivity.kt#mpeojn");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1759944654, $changed, -1, "com.luchime.huiyuan.ComposableSingletons$MainActivityKt.lambda$-1759944654.<anonymous> (MainActivity.kt:15)");
            }
            HuiyuanAppKt.HuiyuanApp($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
