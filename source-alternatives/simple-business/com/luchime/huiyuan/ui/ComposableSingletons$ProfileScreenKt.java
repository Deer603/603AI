package com.luchime.huiyuan.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfileScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$ProfileScreenKt {
    public static final ComposableSingletons$ProfileScreenKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda$-122674877, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f94lambda$122674877;

    /* JADX INFO: renamed from: lambda$-1601579651, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f95lambda$1601579651;

    /* JADX INFO: renamed from: lambda$-49090299, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f96lambda$49090299;
    private static Function2<Composer, Integer, Unit> lambda$582696286;

    public ComposableSingletons$ProfileScreenKt() {
    }

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
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(582696286, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$582696286.<anonymous> (ProfileScreen.kt:293)");
    L11:
        TextKt.m2820Text4IGK_g("清除全部数据？", null, 0, 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196614, 0, 131038);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__1601579651$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C294@11590L33:ProfileScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1601579651, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$-1601579651.<anonymous> (ProfileScreen.kt:294)");
    L11:
        TextKt.m2820Text4IGK_g("该操作会删除本机保存的对话、收藏和统计，无法撤销。", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 6, 0, 131070);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static {
        INSTANCE = new ComposableSingletons$ProfileScreenKt();
        f96lambda$49090299 = ComposableLambdaKt.composableLambdaInstance(-49090299, false, new ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda0());
        f94lambda$122674877 = ComposableLambdaKt.composableLambdaInstance(-122674877, false, new ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda1());
        lambda$582696286 = ComposableLambdaKt.composableLambdaInstance(582696286, false, new ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda2());
        f95lambda$1601579651 = ComposableLambdaKt.composableLambdaInstance(-1601579651, false, new ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda3());
    }

    static final Unit lambda__49090299$lambda$0(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C300@11860L62:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-49090299, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$-49090299.<anonymous> (ProfileScreen.kt:300)");
    L11:
        TextKt.m2820Text4IGK_g("确认清除", null, HuiyuanDesignKt.getSignalRed(), 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196998, 0, 131034);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__122674877$lambda$1(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C306@12125L23:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-122674877, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ProfileScreenKt.lambda$-122674877.<anonymous> (ProfileScreen.kt:306)");
    L11:
        TextKt.m2820Text4IGK_g("取消", null, HuiyuanDesignKt.getInk(), 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 390, 0, 131066);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }
}
