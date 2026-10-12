package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a&\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0016H\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"DefaultGlowColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultGlowPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "FlingDestretchFactor", "", "destretchMultiplier", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "destretchMultiplier-GyEprt8", "(I)F", "rememberPlatformOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "rememberPlatformOverscrollFactory", "Landroidx/compose/foundation/OverscrollFactory;", "glowColor", "glowDrawPadding", "rememberPlatformOverscrollFactory-3J-VO9M", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/OverscrollFactory;", "defaultOverscrollFactory", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidOverscroll_androidKt {
    private static final long DefaultGlowColor = 0;
    private static final PaddingValues DefaultGlowPaddingValues = null;
    private static final float FlingDestretchFactor = 4.0f;

    /* JADX INFO: renamed from: access$destretchMultiplier-GyEprt8, reason: not valid java name */
    public static final /* synthetic */ float m230access$destretchMultiplierGyEprt8(int source) {
        return m231destretchMultiplierGyEprt8(source);
    }

    public static final /* synthetic */ long access$getDefaultGlowColor$p() {
        return DefaultGlowColor;
    }

    public static final /* synthetic */ PaddingValues access$getDefaultGlowPaddingValues$p() {
        return DefaultGlowPaddingValues;
    }

    /* JADX INFO: renamed from: rememberPlatformOverscrollFactory-3J-VO9M, reason: not valid java name */
    public static final OverscrollFactory m232rememberPlatformOverscrollFactory3JVO9M(long glowColor, PaddingValues glowDrawPadding, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, -2017030679, "C(rememberPlatformOverscrollFactory)P(0:c#ui.graphics.Color)86@3974L7,87@4013L7:AndroidOverscroll.android.kt#71ulvw");
        if ((r13 & 1) == 0) goto L5;
        long glowColor2 = DefaultGlowColor;
        long glowColor3 = glowColor2;
    L7:
        if ((r13 & 2) == 0) goto L9;
        PaddingValues glowDrawPadding2 = DefaultGlowPaddingValues;
        PaddingValues glowDrawPadding3 = glowDrawPadding2;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-2017030679, $changed, -1, "androidx.compose.foundation.rememberPlatformOverscrollFactory (AndroidOverscroll.android.kt:85)");
    L13:
        ProvidableCompositionLocal<Context> r8 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r1 = $composer.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context = (Context) r1;
        ProvidableCompositionLocal<Density> r9 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r14;
        AndroidEdgeEffectOverscrollFactory r2 = new AndroidEdgeEffectOverscrollFactory(context, density, glowColor3, glowDrawPadding3, null);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L9:
        glowDrawPadding3 = glowDrawPadding;
        goto L11
    L5:
        glowColor3 = glowColor;
        goto L7
    }

    public static final OverscrollFactory defaultOverscrollFactory(CompositionLocalAccessorScope $this$defaultOverscrollFactory) {
        Context context = (Context) $this$defaultOverscrollFactory.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) $this$defaultOverscrollFactory.getCurrentValue(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration config = (OverscrollConfiguration) $this$defaultOverscrollFactory.getCurrentValue(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (config != null) goto L6;
        return null;
    L6:
        return new AndroidEdgeEffectOverscrollFactory(context, density, config.m323getGlowColor0d7_KjU(), config.getDrawPadding(), null);
    }

    public static final OverscrollEffect rememberPlatformOverscrollEffect(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1569526143, "C(rememberPlatformOverscrollEffect)108@4780L7,109@4819L7,110@4873L7:AndroidOverscroll.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1569526143, $changed, -1, "androidx.compose.foundation.rememberPlatformOverscrollEffect (AndroidOverscroll.android.kt:107)");
    L5:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context = (Context) r5;
        ProvidableCompositionLocal<Density> r1 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r6;
        ProvidableCompositionLocal<OverscrollConfiguration> r2 = OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        OverscrollConfiguration config = (OverscrollConfiguration) r3;
        if (config != null) goto L8;
        $composer.startReplaceGroup(-461477086);
        $composer.endReplaceGroup();
        AndroidEdgeEffectOverscrollEffect r4 = null;
    L17:
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L8:
        $composer.startReplaceGroup(-461444412);
        ComposerKt.sourceInformation($composer, "114@4948L226");
        ComposerKt.sourceInformationMarkerStart($composer, 1786230318, "CC(remember):AndroidOverscroll.android.kt#9igjgp");
        boolean invalid$iv = ($composer.changed(context) | $composer.changed(density)) | $composer.changed(config);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv = new AndroidEdgeEffectOverscrollEffect(context, density, config.m323getGlowColor0d7_KjU(), config.getDrawPadding(), null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        r4 = (AndroidEdgeEffectOverscrollEffect) it$iv;
        goto L17
    L11:
        if (it$iv != Composer.Companion.getEmpty()) goto L15;
        goto L14
    }

    /* JADX INFO: renamed from: destretchMultiplier-GyEprt8, reason: not valid java name */
    private static final float m231destretchMultiplierGyEprt8(int source) {
        if (NestedScrollSource.m5470equalsimpl0(source, NestedScrollSource.Companion.m5481getSideEffectWNlRxjI()) == false) goto L5;
        return 4.0f;
    L5:
        return 1.0f;
    }

    static {
        DefaultGlowColor = ColorKt.Color(4284900966L);
        DefaultGlowPaddingValues = PaddingKt.m720PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
    }
}
