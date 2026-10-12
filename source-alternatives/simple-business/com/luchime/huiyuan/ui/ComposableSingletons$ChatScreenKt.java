package com.luchime.huiyuan.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
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

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$ChatScreenKt {
    public static final ComposableSingletons$ChatScreenKt INSTANCE = null;

    /* JADX INFO: renamed from: lambda$-1226650512, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f88lambda$1226650512;

    /* JADX INFO: renamed from: lambda$-1320283468, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f89lambda$1320283468;

    /* JADX INFO: renamed from: lambda$-1731945330, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f90lambda$1731945330;

    /* JADX INFO: renamed from: lambda$-1788628498, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f91lambda$1788628498;
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1172547958;
    private static Function2<Composer, Integer, Unit> lambda$1605270863;
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1738058344;

    public ComposableSingletons$ChatScreenKt() {
    }

    /* JADX INFO: renamed from: getLambda$-1226650512$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7403getLambda$1226650512$app() {
        return f88lambda$1226650512;
    }

    /* JADX INFO: renamed from: getLambda$-1320283468$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7404getLambda$1320283468$app() {
        return f89lambda$1320283468;
    }

    /* JADX INFO: renamed from: getLambda$-1731945330$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7405getLambda$1731945330$app() {
        return f90lambda$1731945330;
    }

    /* JADX INFO: renamed from: getLambda$-1788628498$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7406getLambda$1788628498$app() {
        return f91lambda$1788628498;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1172547958$app() {
        return lambda$1172547958;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1605270863$app() {
        return lambda$1605270863;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1738058344$app() {
        return lambda$1738058344;
    }

    static final Unit lambda_1605270863$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C309@12545L46:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1605270863, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$1605270863.<anonymous> (ChatScreen.kt:309)");
    L11:
        TextKt.m2820Text4IGK_g("清空当前对话？", null, 0, 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196614, 0, 131038);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__1788628498$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C310@12616L26:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1788628498, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$-1788628498.<anonymous> (ChatScreen.kt:310)");
    L11:
        TextKt.m2820Text4IGK_g("聊天内容会被清除，收藏的语录会保留。", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 6, 0, 131070);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static {
        INSTANCE = new ComposableSingletons$ChatScreenKt();
        lambda$1172547958 = ComposableLambdaKt.composableLambdaInstance(1172547958, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda0());
        f89lambda$1320283468 = ComposableLambdaKt.composableLambdaInstance(-1320283468, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda1());
        lambda$1605270863 = ComposableLambdaKt.composableLambdaInstance(1605270863, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda2());
        f91lambda$1788628498 = ComposableLambdaKt.composableLambdaInstance(-1788628498, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda3());
        f88lambda$1226650512 = ComposableLambdaKt.composableLambdaInstance(-1226650512, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda4());
        lambda$1738058344 = ComposableLambdaKt.composableLambdaInstance(1738058344, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda5());
        f90lambda$1731945330 = ComposableLambdaKt.composableLambdaInstance(-1731945330, false, new ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda6());
    }

    static final Unit lambda_1172547958$lambda$0(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C316@12881L60:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1172547958, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$1172547958.<anonymous> (ChatScreen.kt:316)");
    L11:
        TextKt.m2820Text4IGK_g("清空", null, HuiyuanDesignKt.getSignalRed(), 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196998, 0, 131034);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__1320283468$lambda$1(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C322@13144L23:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1320283468, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$-1320283468.<anonymous> (ChatScreen.kt:322)");
    L11:
        TextKt.m2820Text4IGK_g("取消", null, HuiyuanDesignKt.getInk(), 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 390, 0, 131066);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__1226650512$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C723@26782L261:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1226650512, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$-1226650512.<anonymous> (ChatScreen.kt:723)");
    L11:
        TextKt.m2820Text4IGK_g("⟳", PaddingKt.m726paddingVpY3zN4(Modifier.Companion, Dp.m6973constructorimpl(9), Dp.m6973constructorimpl(3)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(18), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200118, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda_1738058344$lambda$5(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C990@36604L59:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1738058344, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$1738058344.<anonymous> (ChatScreen.kt:990)");
    L11:
        FontWeight r7 = FontWeight.Companion.getBlack();
        TextKt.m2820Text4IGK_g("随机", null, 0, TextUnitKt.getSp(11), null, r7, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 199686, 0, 131030);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit lambda__1731945330$lambda$6(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1090@41060L61:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1731945330, $changed, -1, "com.luchime.huiyuan.ui.ComposableSingletons$ChatScreenKt.lambda$-1731945330.<anonymous> (ChatScreen.kt:1090)");
    L11:
        FontWeight r7 = FontWeight.Companion.getBlack();
        TextKt.m2820Text4IGK_g("随机一句", null, 0, TextUnitKt.getSp(12), null, r7, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 199686, 0, 131030);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }
}
