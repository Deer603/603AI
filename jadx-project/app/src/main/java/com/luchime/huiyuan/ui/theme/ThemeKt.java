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
    private static final ColorScheme HuiyuanColorScheme = ColorSchemeKt.m2063lightColorSchemeCXl9yA$default(ColorKt.getHuiyuanInk(), ColorKt.getHuiyuanPaper(), 0, 0, 0, ColorKt.getHuiyuanGreen(), ColorKt.getHuiyuanInk(), 0, 0, ColorKt.getHuiyuanRed(), ColorKt.getHuiyuanInk(), 0, 0, ColorKt.getHuiyuanPaper(), ColorKt.getHuiyuanInk(), ColorKt.getHuiyuanPaper(), ColorKt.getHuiyuanInk(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -124516, 15, null);

    static final Unit HuiyuanAITheme$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        HuiyuanAITheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HuiyuanAITheme(Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed) {
        final Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(521831968);
        ComposerKt.sourceInformation($composer2, "C(HuiyuanAITheme)23@600L121:Theme.kt#q3nhc0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            function2 = content;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521831968, $dirty, -1, "com.luchime.huiyuan.ui.theme.HuiyuanAITheme (Theme.kt:22)");
            }
            function2 = content;
            MaterialThemeKt.MaterialTheme(HuiyuanColorScheme, null, TypeKt.getTypography(), function2, $composer2, (($dirty << 9) & 7168) | 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.HuiyuanAITheme$lambda$0(function2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
