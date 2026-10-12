package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MaterialTheme.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"PlatformMaterialTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MaterialTheme_androidKt {
    public static final void PlatformMaterialTheme(final Function2<? super Composer, ? super Integer, Unit> r4, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1322912246);
        ComposerKt.sourceInformation($composer2, "C(PlatformMaterialTheme)22@789L9:MaterialTheme.android.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r4) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L22:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L26;
        r0.updateScope(new AnonymousClass1(r4, $changed));
        return;
    L26:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1322912246, $dirty, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
    L18:
        r4.invoke($composer2, Integer.valueOf($dirty & 14));
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
        goto L22
    L12:
        r3 = false;
        goto L14
    }
}
