package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"DragMultiplier", "", "rememberPullRefreshState", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "refreshing", "", "onRefresh", "Lkotlin/Function0;", "", "refreshThreshold", "Landroidx/compose/ui/unit/Dp;", "refreshingOffset", "rememberPullRefreshState-UuyPYSY", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    /* JADX INFO: renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m1862rememberPullRefreshStateUuyPYSY(final boolean refreshing, Function0<Unit> r19, float refreshThreshold, float refreshingOffset, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, -174977512, "C(rememberPullRefreshState)P(2!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp)64@2637L24,65@2687L31,*69@2803L7,75@2944L92,77@3053L141,77@3042L152:PullRefreshState.kt#t44y28");
        if ((r24 & 4) == 0) goto L5;
        float refreshThreshold2 = PullRefreshDefaults.INSTANCE.m1855getRefreshThresholdD9Ej5fM();
    L7:
        if ((r24 & 8) == 0) goto L9;
        float refreshingOffset2 = PullRefreshDefaults.INSTANCE.m1856getRefreshingOffsetD9Ej5fM();
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-174977512, $changed, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
    L13:
        int $this$dp$iv = Dp.m6972compareTo0680j_4(refreshThreshold2, Dp.m6973constructorimpl(0));
        if ($this$dp$iv <= 0) goto L16;
        boolean r3 = true;
    L17:
        if (r3 == false) goto L50;
        ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L22;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer);
        $composer.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L22:
        CoroutineScope scope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        State onRefreshState = SnapshotStateKt.rememberUpdatedState(r19, $composer, ($changed >> 3) & 14);
        final Ref.FloatRef thresholdPx = new Ref.FloatRef();
        final Ref.FloatRef refreshingOffsetPx = new Ref.FloatRef();
        ProvidableCompositionLocal<Density> r10 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density $this$rememberPullRefreshState_UuyPYSY_u24lambda_u241 = (Density) r14;
        thresholdPx.element = $this$rememberPullRefreshState_UuyPYSY_u24lambda_u241.mo376toPx0680j_4(refreshThreshold2);
        refreshingOffsetPx.element = $this$rememberPullRefreshState_UuyPYSY_u24lambda_u241.mo376toPx0680j_4(refreshingOffset2);
        ComposerKt.sourceInformationMarkerStart($composer, 975868834, "CC(remember):PullRefreshState.kt#9igjgp");
        boolean invalid$iv = $composer.changed(scope);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L25;
    L28:
        float refreshThreshold3 = refreshingOffsetPx.element;
        float refreshingOffset3 = thresholdPx.element;
        Object value$iv = new PullRefreshState(scope, onRefreshState, refreshThreshold3, refreshingOffset3);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        final PullRefreshState state = (PullRefreshState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 975872371, "CC(remember):PullRefreshState.kt#9igjgp");
        boolean r2 = $composer.changedInstance(state);
        if ((($changed & 14) ^ 6) <= 4) goto L34;
        if ($composer.changed(refreshing) == false) goto L34;
    L35:
        boolean r4 = true;
    L37:
        boolean invalid$iv2 = ((r2 | r4) | $composer.changed(thresholdPx.element)) | $composer.changed(refreshingOffsetPx.element);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L40;
    L43:
        Object value$iv2 = (Function0) new PullRefreshStateKt$rememberPullRefreshState$3$1(state, refreshing, thresholdPx, refreshingOffsetPx);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.SideEffect((Function0) it$iv2, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
    L47:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return state;
    L40:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L44;
    L34:
        if (($changed & 6) == 4) goto L35;
        r4 = false;
        goto L37
    L25:
        if (it$iv != Composer.Companion.getEmpty()) goto L29;
    L50:
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    L16:
        r3 = false;
        goto L17
    L9:
        refreshingOffset2 = refreshingOffset;
        goto L11
    L5:
        refreshThreshold2 = refreshThreshold;
        goto L7
    }
}
