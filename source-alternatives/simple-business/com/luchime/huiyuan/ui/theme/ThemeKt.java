package com.luchime.huiyuan.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"HuiyuanColorScheme", "Landroidx/compose/material3/ColorScheme;", "HuiyuanAITheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ThemeKt {
    private static final ColorScheme HuiyuanColorScheme = null;

    static final Unit HuiyuanAITheme$lambda$0(Function2 r1, int r2, Composer r3, int r4) {
        HuiyuanAITheme(r1, r3, RecomposeScopeImplKt.updateChangedFlags(r2 | 1));
        return Unit.INSTANCE;
    }

    static {
        long r1 = ColorKt.getHuiyuanInk();
        long r11 = ColorKt.getHuiyuanGreen();
        long r19 = ColorKt.getHuiyuanRed();
        long r27 = ColorKt.getHuiyuanPaper();
        long r31 = ColorKt.getHuiyuanPaper();
        HuiyuanColorScheme = ColorSchemeKt.m2063lightColorSchemeCXl9yA$default(r1, ColorKt.getHuiyuanPaper(), 0, 0, 0, r11, ColorKt.getHuiyuanInk(), 0, 0, r19, ColorKt.getHuiyuanInk(), 0, 0, r27, ColorKt.getHuiyuanInk(), r31, ColorKt.getHuiyuanInk(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -124516, 15, null);
    }

    public static final void HuiyuanAITheme(Function2<? super Composer, ? super Integer, Unit> r8, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(r8, "content");
        Composer $composer2 = $composer.startRestartGroup(521831968);
        ComposerKt.sourceInformation($composer2, "C(HuiyuanAITheme)23@600L121:Theme.kt#q3nhc0");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r8) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r2 = true;
    L14:
        if ($composer2.shouldExecute(r2, $dirty & 1) == true) goto L16;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r8;
        $composer2.skipToGroupEnd();
    L22:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L26;
        r9.updateScope(new ThemeKt$$ExternalSyntheticLambda0(r4, $changed));
        return;
    L26:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(521831968, $dirty, -1, "com.luchime.huiyuan.ui.theme.HuiyuanAITheme (Theme.kt:22)");
    L18:
        r4 = r8;
        MaterialThemeKt.MaterialTheme(HuiyuanColorScheme, null, TypeKt.getTypography(), r4, $composer2, (($dirty << 9) & 7168) | 390, 2);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
        goto L22
    L12:
        r2 = false;
        goto L14
    }
}
