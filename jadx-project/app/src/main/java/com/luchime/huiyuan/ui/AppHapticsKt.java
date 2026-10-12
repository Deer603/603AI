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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppHaptics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\r\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"LocalAppHaptics", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/luchime/huiyuan/ui/AppHaptics;", "getLocalAppHaptics", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberAppHaptics", "(Landroidx/compose/runtime/Composer;I)Lcom/luchime/huiyuan/ui/AppHaptics;", "hapticClickable", "Landroidx/compose/ui/Modifier;", "enabled", "", "cue", "Lcom/luchime/huiyuan/ui/HapticCue;", "onClick", "Lkotlin/Function0;", "", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AppHapticsKt {
    private static final ProvidableCompositionLocal<AppHaptics> LocalAppHaptics = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.luchime.huiyuan.ui.AppHapticsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppHapticsKt.LocalAppHaptics$lambda$0();
        }
    });

    public static final ProvidableCompositionLocal<AppHaptics> getLocalAppHaptics() {
        return LocalAppHaptics;
    }

    static final AppHaptics LocalAppHaptics$lambda$0() {
        throw new IllegalStateException("AppHaptics must be provided by HuiyuanApp".toString());
    }

    public static final AppHaptics rememberAppHaptics(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 135321239, "C(rememberAppHaptics)82@2601L7,83@2620L35:AppHaptics.kt#cyjvf");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(135321239, $changed, -1, "com.luchime.huiyuan.ui.rememberAppHaptics (AppHaptics.kt:81)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = $composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd($composer);
        View view = (View) objConsume;
        ComposerKt.sourceInformationMarkerStart($composer, 1194695162, "CC(remember):AppHaptics.kt#9igjgp");
        boolean zChanged = $composer.changed(view);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object appHaptics = new AppHaptics(view);
            $composer.updateRememberedValue(appHaptics);
            objRememberedValue = appHaptics;
        }
        AppHaptics appHaptics2 = (AppHaptics) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return appHaptics2;
    }

    public static /* synthetic */ Modifier hapticClickable$default(Modifier modifier, boolean z, HapticCue hapticCue, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            hapticCue = HapticCue.TAP;
        }
        return hapticClickable(modifier, z, hapticCue, function0);
    }

    public static final Modifier hapticClickable(Modifier $this$hapticClickable, final boolean enabled, final HapticCue cue, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter($this$hapticClickable, "<this>");
        Intrinsics.checkNotNullParameter(cue, "cue");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default($this$hapticClickable, null, new Function3() { // from class: com.luchime.huiyuan.ui.AppHapticsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AppHapticsKt.hapticClickable$lambda$4(enabled, cue, onClick, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    static final Modifier hapticClickable$lambda$4(boolean $enabled, final HapticCue $cue, final Function0 $onClick, Modifier composed, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        $composer.startReplaceGroup(-2046353089);
        ComposerKt.sourceInformation($composer, "C91@2846L7,92@2887L54:AppHaptics.kt#cyjvf");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2046353089, $changed, -1, "com.luchime.huiyuan.ui.hapticClickable.<anonymous> (AppHaptics.kt:91)");
        }
        ProvidableCompositionLocal<AppHaptics> providableCompositionLocal = LocalAppHaptics;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = $composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final AppHaptics haptics = (AppHaptics) objConsume;
        ComposerKt.sourceInformationMarkerStart($composer, 549705557, "CC(remember):AppHaptics.kt#9igjgp");
        boolean zChangedInstance = $composer.changedInstance(haptics) | $composer.changed($cue.ordinal()) | $composer.changed($onClick);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.AppHapticsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppHapticsKt.hapticClickable$lambda$4$lambda$3$lambda$2(haptics, $cue, $onClick);
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier modifierM268clickableXHw0xAI$default = ClickableKt.m268clickableXHw0xAI$default(composed, $enabled, null, null, (Function0) objRememberedValue, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceGroup();
        return modifierM268clickableXHw0xAI$default;
    }

    static final Unit hapticClickable$lambda$4$lambda$3$lambda$2(AppHaptics $haptics, HapticCue $cue, Function0 $onClick) {
        $haptics.perform($cue);
        $onClick.invoke();
        return Unit.INSTANCE;
    }
}
