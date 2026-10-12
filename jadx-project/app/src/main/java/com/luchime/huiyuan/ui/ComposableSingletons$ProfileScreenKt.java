package com.luchime.huiyuan.ui;

import androidx.compose.foundation.layout.RowScope;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfileScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$ProfileScreenKt {
    public static final ComposableSingletons$ProfileScreenKt INSTANCE = new ComposableSingletons$ProfileScreenKt();

    /* JADX INFO: renamed from: lambda$-49090299, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f96lambda$49090299 = ComposableLambdaKt.composableLambdaInstance(-49090299, false, new Function3() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__49090299$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-122674877, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f94lambda$122674877 = ComposableLambdaKt.composableLambdaInstance(-122674877, false, new Function3() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__122674877$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$582696286 = ComposableLambdaKt.composableLambdaInstance(582696286, false, new Function2() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_582696286$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1601579651, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f95lambda$1601579651 = ComposableLambdaKt.composableLambdaInstance(-1601579651, false, new Function2() { // from class: com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__1601579651$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-122674877$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7409getLambda$122674877$app() {
        return f94lambda$122674877;
    }

    /* JADX INFO: renamed from: getLambda$-1601579651$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7410getLambda$1601579651$app() {
        return f95lambda$1601579651;
    }

    /* JADX INFO: renamed from: getLambda$-49090299$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7411getLambda$49090299$app() {
        return f96lambda$49090299;
    }

    public final Function2<Composer, Integer, Unit> getLambda$582696286$app() {
        return lambda$582696286;
    }

    static final Unit lambda_582696286$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C293@11519L46:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582696286, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$582696286.<anonymous> (ProfileScreen.kt:293)");
            }
            TextKt.m2820Text4IGK_g("清除全部数据？", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1601579651$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C294@11590L33:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1601579651, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$-1601579651.<anonymous> (ProfileScreen.kt:294)");
            }
            TextKt.m2820Text4IGK_g("该操作会删除本机保存的对话、收藏和统计，无法撤销。", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__49090299$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C300@11860L62:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-49090299, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$-49090299.<anonymous> (ProfileScreen.kt:300)");
            }
            TextKt.m2820Text4IGK_g("确认清除", (Modifier) null, HuiyuanDesignKt.getSignalRed(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__122674877$lambda$1(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C306@12125L23:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-122674877, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$-122674877.<anonymous> (ProfileScreen.kt:306)");
            }
            TextKt.m2820Text4IGK_g("取消", (Modifier) null, HuiyuanDesignKt.getInk(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
