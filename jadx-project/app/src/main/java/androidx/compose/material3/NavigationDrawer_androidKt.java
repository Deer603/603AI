package androidx.compose.material3;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NavigationDrawer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003¨\u0006\u0012"}, d2 = {"PredictiveBackDrawerMaxScaleXDistanceGrow", "Landroidx/compose/ui/unit/Dp;", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "F", "PredictiveBackDrawerMaxScaleXDistanceShrink", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleYDistance", "getPredictiveBackDrawerMaxScaleYDistance", "DrawerPredictiveBackHandler", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerPredictiveBackState;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/DrawerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NavigationDrawer_androidKt {
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = 0.0f;
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = 0.0f;
    private static final float PredictiveBackDrawerMaxScaleYDistance = 0.0f;

    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final Function3<? super DrawerPredictiveBackState, ? super Composer, ? super Integer, Unit> r24, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1444817207);
        ComposerKt.sourceInformation($composer2, "C(DrawerPredictiveBackHandler)P(1)45@1743L40,46@1800L24,47@1862L7,*51@2024L7,57@2337L1264,57@2285L1316,89@3644L99,89@3607L136,95@3749L34:NavigationDrawer.android.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(drawerState) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int $dirty2 = $dirty;
        if (($dirty2 & 19) != 18) goto L23;
        if ($composer2.getSkipping() == false) goto L23;
        $composer2.skipToGroupEnd();
    L63:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L67;
        r0.updateScope(new AnonymousClass4(drawerState, r24, $changed));
        return;
    L67:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1444817207, $dirty2, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer2, 228403032, "CC(remember):NavigationDrawer.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L28;
        Object value$iv = new DrawerPredictiveBackState();
        $composer2.updateRememberedValue(value$iv);
    L29:
        DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L32;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L33:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<LayoutDirection> r1 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r8 != LayoutDirection.Rtl) goto L36;
        boolean isRtl = true;
    L37:
        Ref.FloatRef maxScaleXDistanceGrow = new Ref.FloatRef();
        Ref.FloatRef maxScaleXDistanceShrink = new Ref.FloatRef();
        Ref.FloatRef maxScaleYDistance = new Ref.FloatRef();
        ProvidableCompositionLocal<Density> r15 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r15);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$DrawerPredictiveBackHandler_u24lambda_u241 = (Density) r6;
        maxScaleXDistanceGrow.element = $this$DrawerPredictiveBackHandler_u24lambda_u241.mo376toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
        maxScaleXDistanceShrink.element = $this$DrawerPredictiveBackHandler_u24lambda_u241.mo376toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
        maxScaleYDistance.element = $this$DrawerPredictiveBackHandler_u24lambda_u241.mo376toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
        boolean r16 = drawerState.isOpen();
        ComposerKt.sourceInformationMarkerStart($composer2, 228423264, "CC(remember):NavigationDrawer.android.kt#9igjgp");
        boolean r7 = ((($composer2.changed(isRtl) | $composer2.changed(maxScaleXDistanceGrow.element)) | $composer2.changed(maxScaleXDistanceShrink.element)) | $composer2.changed(maxScaleYDistance.element)) | $composer2.changedInstance(scope);
        if (($dirty2 & 14) != 4) goto L40;
        boolean r9 = true;
    L41:
        boolean invalid$iv = r7 | r9;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L44;
    L47:
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 value$iv2 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, scope, drawerState, isRtl, maxScaleXDistanceGrow, maxScaleXDistanceShrink, maxScaleYDistance, null);
        $composer2.updateRememberedValue(value$iv2);
    L48:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        PredictiveBackHandlerKt.PredictiveBackHandler(r16, (Function2) value$iv2, $composer2, 0, 0);
        Boolean r3 = Boolean.valueOf(drawerState.isClosed());
        ComposerKt.sourceInformationMarkerStart($composer2, 228463923, "CC(remember):NavigationDrawer.android.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L51;
        boolean invalid$iv2 = true;
    L52:
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L59;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L59;
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1 value$iv3 = it$iv3;
    L60:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r3, (Function2) value$iv3, $composer2, 0);
        r24.invoke(drawerPredictiveBackState, $composer2, Integer.valueOf(($dirty2 & 112) | 6));
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventEnd();
    L59:
        value$iv3 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
        $composer2.updateRememberedValue(value$iv3);
        goto L60
    L51:
        invalid$iv2 = false;
        goto L52
    L44:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L47;
        value$iv2 = it$iv2;
        goto L48
    L40:
        r9 = false;
        goto L41
    L36:
        isRtl = false;
        goto L37
    L32:
        value$iv$iv = it$iv$iv;
        goto L33
    L28:
        value$iv = it$iv;
        goto L29
    L12:
        if ($composer2.changedInstance(r24) == false) goto L14;
        int r4 = 32;
    L15:
        $dirty = $dirty | r4;
        goto L16
    L14:
        r4 = 16;
        goto L15
    }

    static {
        PredictiveBackDrawerMaxScaleXDistanceGrow = Dp.m6973constructorimpl(12);
        PredictiveBackDrawerMaxScaleXDistanceShrink = Dp.m6973constructorimpl(24);
        PredictiveBackDrawerMaxScaleYDistance = Dp.m6973constructorimpl(48);
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }
}
