package com.luchime.huiyuan.ui;

import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppHaptics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\r\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"LocalAppHaptics", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/luchime/huiyuan/ui/AppHaptics;", "getLocalAppHaptics", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberAppHaptics", "(Landroidx/compose/runtime/Composer;I)Lcom/luchime/huiyuan/ui/AppHaptics;", "hapticClickable", "Landroidx/compose/ui/Modifier;", "enabled", "", "cue", "Lcom/luchime/huiyuan/ui/HapticCue;", "onClick", "Lkotlin/Function0;", "", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AppHapticsKt {
    private static final ProvidableCompositionLocal<AppHaptics> LocalAppHaptics = null;

    static {
        LocalAppHaptics = CompositionLocalKt.staticCompositionLocalOf(new AppHapticsKt$$ExternalSyntheticLambda1());
    }

    public static final ProvidableCompositionLocal<AppHaptics> getLocalAppHaptics() {
        return LocalAppHaptics;
    }

    static final AppHaptics LocalAppHaptics$lambda$0() {
        throw new IllegalStateException("AppHaptics must be provided by HuiyuanApp".toString());
    }

    public static final AppHaptics rememberAppHaptics(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 135321239, "C(rememberAppHaptics)82@2601L7,83@2620L35:AppHaptics.kt#cyjvf");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(135321239, $changed, -1, "com.luchime.huiyuan.ui.rememberAppHaptics (AppHaptics.kt:81)");
    L5:
        ProvidableCompositionLocal<View> r0 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        View view = (View) r4;
        ComposerKt.sourceInformationMarkerStart($composer, 1194695162, "CC(remember):AppHaptics.kt#9igjgp");
        boolean r1 = $composer.changed(view);
        Object r5 = $composer.rememberedValue();
        if (r1 == false) goto L8;
    L11:
        Object r7 = new AppHaptics(view);
        $composer.updateRememberedValue(r7);
        r5 = r7;
    L12:
        AppHaptics r6 = (AppHaptics) r5;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L8:
        if (r5 != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static /* synthetic */ Modifier hapticClickable$default(Modifier r0, boolean r1, HapticCue r2, Function0 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = HapticCue.TAP;
    L9:
        return hapticClickable(r0, r1, r2, r3);
    }

    public static final Modifier hapticClickable(Modifier $this$hapticClickable, final boolean enabled, final HapticCue cue, final Function0<Unit> r6) {
        Intrinsics.checkNotNullParameter($this$hapticClickable, "<this>");
        Intrinsics.checkNotNullParameter(cue, "cue");
        Intrinsics.checkNotNullParameter(r6, "onClick");
        return ComposedModifierKt.composed$default($this$hapticClickable, null, new AppHapticsKt$$ExternalSyntheticLambda2(enabled, cue, r6), 1, null);
    }

    static final Modifier hapticClickable$lambda$4(boolean $enabled, final HapticCue $cue, final Function0 $onClick, Modifier $this$composed, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
        $composer.startReplaceGroup(-2046353089);
        ComposerKt.sourceInformation($composer, "C91@2846L7,92@2887L54:AppHaptics.kt#cyjvf");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-2046353089, $changed, -1, "com.luchime.huiyuan.ui.hapticClickable.<anonymous> (AppHaptics.kt:91)");
    L6:
        ProvidableCompositionLocal<AppHaptics> r1 = LocalAppHaptics;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final AppHaptics haptics = (AppHaptics) r6;
        ComposerKt.sourceInformationMarkerStart($composer, 549705557, "CC(remember):AppHaptics.kt#9igjgp");
        boolean r3 = ($composer.changedInstance(haptics) | $composer.changed($cue.ordinal())) | $composer.changed($onClick);
        Object r7 = $composer.rememberedValue();
        if (r3 == false) goto L9;
    L12:
        Object r10 = new AppHapticsKt$$ExternalSyntheticLambda0(haptics, $cue, $onClick);
        $composer.updateRememberedValue(r10);
        r7 = r10;
    L13:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier r4 = ClickableKt.m268clickableXHw0xAI$default($this$composed, $enabled, null, null, (Function0) r7, 6, null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        $composer.endReplaceGroup();
        return r4;
    L9:
        if (r7 != Composer.Companion.getEmpty()) goto L13;
        goto L12
    }

    static final Unit hapticClickable$lambda$4$lambda$3$lambda$2(AppHaptics $haptics, HapticCue $cue, Function0 $onClick) {
        $haptics.perform($cue);
        $onClick.invoke();
        return Unit.INSTANCE;
    }
}
