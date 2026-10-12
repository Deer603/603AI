package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: SharedTransitionScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0014H\u0003\u001a5\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f0#¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0007¢\u0006\u0002\u0010'\u001a1\u0010(\u001a\u00020\u001f2\"\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f0\u0005¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0007¢\u0006\u0002\u0010)\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\f\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000\".\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00120\u00128\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003\"\u0018\u0010\u0017\u001a\u00020\u0010*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u0017\u001a\u00020\u0010*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a¨\u0006*"}, d2 = {"DefaultBoundsTransform", "Landroidx/compose/animation/BoundsTransform;", "getDefaultBoundsTransform$annotations", "()V", "DefaultClipInOverlayDuringTransition", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "DefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/geometry/Rect;", "ParentClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "getParentClip$annotations", "VisualDebugging", "", "cachedScaleToBoundsImplMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "getCachedScaleToBoundsImplMap$annotations", "shouldCache", "getShouldCache", "(Landroidx/compose/ui/Alignment;)Z", "(Landroidx/compose/ui/layout/ContentScale;)Z", "ScaleToBoundsCached", "contentScale", "alignment", "SharedTransitionLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SharedTransitionScope", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SharedTransitionScopeKt {
    private static final BoundsTransform DefaultBoundsTransform = null;
    private static final Function2<LayoutDirection, Density, Path> DefaultClipInOverlayDuringTransition = null;
    private static final SpringSpec<Rect> DefaultSpring = null;
    private static final SharedTransitionScope.OverlayClip ParentClip = null;
    public static final boolean VisualDebugging = false;
    private static final MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> cachedScaleToBoundsImplMap = null;

    public static final /* synthetic */ ScaleToBoundsImpl access$ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
        return ScaleToBoundsCached(contentScale, alignment);
    }

    public static final /* synthetic */ BoundsTransform access$getDefaultBoundsTransform$p() {
        return DefaultBoundsTransform;
    }

    public static final /* synthetic */ Function2 access$getDefaultClipInOverlayDuringTransition$p() {
        return DefaultClipInOverlayDuringTransition;
    }

    public static final /* synthetic */ SharedTransitionScope.OverlayClip access$getParentClip$p() {
        return ParentClip;
    }

    private static /* synthetic */ void getCachedScaleToBoundsImplMap$annotations() {
    }

    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }

    private static /* synthetic */ void getParentClip$annotations() {
    }

    public static final void SharedTransitionLayout(final Modifier modifier, final Function3<? super SharedTransitionScope, ? super Composer, ? super Integer, Unit> r7, Composer $composer, final int $changed, final int r10) {
        Composer $composer2 = $composer.startRestartGroup(2043053727);
        ComposerKt.sourceInformation($composer2, "C(SharedTransitionLayout)P(1)99@4829L279,99@4807L301:SharedTransitionScope.kt#xbi5r1");
        int $dirty = $changed;
        int r2 = r10 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r10 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if (($dirty & 19) == 18) goto L25;
        boolean r3 = true;
    L27:
        if ($composer2.shouldExecute(r3, $dirty & 1) == false) goto L36;
        if (r2 == 0) goto L31;
        modifier = Modifier.Companion;
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(2043053727, $dirty, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:98)");
    L33:
        SharedTransitionScope(ComposableLambdaKt.rememberComposableLambda(-130587847, true, new AnonymousClass1(modifier, r7), $composer2, 54), $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
    L37:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L41;
        r0.updateScope(new AnonymousClass2(modifier, r7, $changed, r10));
        return;
    L41:
        return;
    L36:
        $composer2.skipToGroupEnd();
        goto L37
    L25:
        r3 = false;
        goto L27
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r7) == false) goto L20;
        int r4 = 32;
    L21:
        $dirty = $dirty | r4;
        goto L23
    L20:
        r4 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(modifier) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    }

    public static final void SharedTransitionScope(final Function4<? super SharedTransitionScope, ? super Modifier, ? super Composer, ? super Integer, Unit> r5, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2093217917);
        ComposerKt.sourceInformation($composer2, "C(SharedTransitionScope)122@6005L1014,122@5990L1029:SharedTransitionScope.kt#xbi5r1");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r5) == false) goto L7;
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
        r0.updateScope(new C01892(r5, $changed));
        return;
    L26:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-2093217917, $dirty, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:121)");
    L18:
        LookaheadScopeKt.LookaheadScope(ComposableLambdaKt.rememberComposableLambda(-863967934, true, new C01881(r5), $composer2, 54), $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
        goto L22
    L12:
        r3 = false;
        goto L14
    }

    static {
        DefaultSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
        ParentClip = new SharedTransitionScopeKt$ParentClip$1();
        DefaultClipInOverlayDuringTransition = SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1.INSTANCE;
        DefaultBoundsTransform = new SharedTransitionScopeKt$$ExternalSyntheticLambda0();
        int r1 = 0;
        cachedScaleToBoundsImplMap = new MutableScatterMap(r1, 1, null);
    }

    static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect r0, Rect r1) {
        return DefaultSpring;
    }

    private static final ScaleToBoundsImpl ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
        if (getShouldCache(contentScale) == false) goto L15;
        if (getShouldCache(alignment) == false) goto L15;
        MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> r0 = cachedScaleToBoundsImplMap;
        MutableScatterMap<Alignment, ScaleToBoundsImpl> r2 = r0.get(contentScale);
        if (r2 != null) goto L9;
        int r6 = 0;
        r2 = new MutableScatterMap(r6, 1, null);
        r0.set(contentScale, r2);
    L9:
        MutableScatterMap<Alignment, ScaleToBoundsImpl> r1 = r2;
        ScaleToBoundsImpl r3 = r1.get(alignment);
        if (r3 != null) goto L13;
        r3 = new ScaleToBoundsImpl(contentScale, alignment);
        r1.set(alignment, r3);
    L13:
        return r3;
    L15:
        return new ScaleToBoundsImpl(contentScale, alignment);
    }

    private static final boolean getShouldCache(Alignment $this$shouldCache) {
        if ($this$shouldCache != Alignment.Companion.getTopStart()) goto L5;
    L22:
        return true;
    L5:
        if ($this$shouldCache == Alignment.Companion.getTopCenter()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getTopEnd()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getCenterStart()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getCenter()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getCenterEnd()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getBottomStart()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getBottomCenter()) goto L22;
        if ($this$shouldCache == Alignment.Companion.getBottomEnd()) goto L22;
        return false;
    }

    private static final boolean getShouldCache(ContentScale $this$shouldCache) {
        if ($this$shouldCache != ContentScale.Companion.getFillWidth()) goto L5;
    L18:
        return true;
    L5:
        if ($this$shouldCache == ContentScale.Companion.getFillHeight()) goto L18;
        if ($this$shouldCache == ContentScale.Companion.getFillBounds()) goto L18;
        if ($this$shouldCache == ContentScale.Companion.getFit()) goto L18;
        if ($this$shouldCache == ContentScale.Companion.getCrop()) goto L18;
        if ($this$shouldCache == ContentScale.Companion.getNone()) goto L18;
        if ($this$shouldCache == ContentScale.Companion.getInside()) goto L18;
        return false;
    }
}
