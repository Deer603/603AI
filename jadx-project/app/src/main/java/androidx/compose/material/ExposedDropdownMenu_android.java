package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"OnPlatformWindowBoundsChange", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "platformWindowBoundsCalculator", "Landroidx/compose/material/WindowBoundsCalculator;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/WindowBoundsCalculator;", "getWindowBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/view/View;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExposedDropdownMenu_android {
    public static final /* synthetic */ IntRect access$getWindowBounds(View $receiver) {
        return getWindowBounds($receiver);
    }

    public static final WindowBoundsCalculator platformWindowBoundsCalculator(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1216067952, "C(platformWindowBoundsCalculator)36@1338L7,37@1357L47:ExposedDropdownMenu.android.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1216067952, $changed, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
    L5:
        ProvidableCompositionLocal<View> r0 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        View view = (View) r3;
        ComposerKt.sourceInformationMarkerStart($composer, 1694068495, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean invalid$iv = $composer.changed(view);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new WindowBoundsCalculator(view);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        WindowBoundsCalculator r4 = (WindowBoundsCalculator) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void OnPlatformWindowBoundsChange(final Function0<Unit> r10, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1063434120);
        ComposerKt.sourceInformation($composer2, "C(OnPlatformWindowBoundsChange)42@1515L7,43@1550L107,43@1527L130:ExposedDropdownMenu.android.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
    L9:
        boolean r5 = true;
        if (($dirty & 3) == 2) goto L12;
        boolean r2 = true;
    L14:
        if ($composer2.shouldExecute(r2, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L33:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L37;
        r0.updateScope(new AnonymousClass2(r10, $changed));
        return;
    L37:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(1063434120, $dirty, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
    L18:
        ProvidableCompositionLocal<View> r1 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final View view = (View) r7;
        ComposerKt.sourceInformationMarkerStart($composer2, 1104636856, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        boolean r3 = $composer2.changedInstance(view);
        if (($dirty & 14) == 4) goto L22;
        r5 = false;
    L22:
        boolean invalid$iv = r3 | r5;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L25;
    L28:
        Object value$iv = (Function1) new ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1(view, r10);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(view, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
        goto L33
    L25:
        if (it$iv != Composer.Companion.getEmpty()) goto L29;
    L12:
        r2 = false;
        goto L14
    L5:
        if ($composer2.changedInstance(r10) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L9
    L7:
        r4 = 2;
        goto L8
    }

    private static final IntRect getWindowBounds(View $this$getWindowBounds) {
        Rect it = new Rect();
        $this$getWindowBounds.getWindowVisibleDisplayFrame(it);
        return RectHelper_androidKt.toComposeIntRect(it);
    }
}
