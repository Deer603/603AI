package com.luchime.huiyuan.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KnowledgeScreens.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$KnowledgeScreensKt {
    public static final ComposableSingletons$KnowledgeScreensKt INSTANCE = new ComposableSingletons$KnowledgeScreensKt();
    private static Function2<Composer, Integer, Unit> lambda$1087424319 = ComposableLambdaKt.composableLambdaInstance(1087424319, false, new Function2() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$KnowledgeScreensKt.lambda_1087424319$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$693020480 = ComposableLambdaKt.composableLambdaInstance(693020480, false, new Function2() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$KnowledgeScreensKt.lambda_693020480$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1130705734 = ComposableLambdaKt.composableLambdaInstance(1130705734, false, new Function3() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$KnowledgeScreensKt.lambda_1130705734$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1919830167, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f93lambda$1919830167 = ComposableLambdaKt.composableLambdaInstance(-1919830167, false, new Function3() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$KnowledgeScreensKt.lambda__1919830167$lambda$3((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

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

    static final Unit lambda_1087424319$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C106@4412L22:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1087424319, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$1087424319.<anonymous> (KnowledgeScreens.kt:106)");
            }
            TextKt.m2820Text4IGK_g("搜索认知、创业、焦虑、AI…", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_693020480$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C107@4470L58:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693020480, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$693020480.<anonymous> (KnowledgeScreens.kt:107)");
            }
            TextKt.m2820Text4IGK_g("⌕", (Modifier) null, 0L, TextUnitKt.getSp(23), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1130705734$lambda$2(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C257@10604L44:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1130705734, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$1130705734.<anonymous> (KnowledgeScreens.kt:257)");
            }
            TextKt.m2820Text4IGK_g("浏览语录库", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1919830167$lambda$3(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C263@10755L266:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919830167, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$KnowledgeScreensKt.lambda$-1919830167.<anonymous> (KnowledgeScreens.kt:263)");
            }
            TextKt.m2820Text4IGK_g("最近收藏", PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(17), Dp.m6973constructorimpl(14)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200118, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
