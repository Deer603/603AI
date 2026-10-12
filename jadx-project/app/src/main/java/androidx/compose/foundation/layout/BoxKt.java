package androidx.compose.foundation.layout;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001aJ\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010 \u001a\u00020\u000fH\u0002\u001a\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0001\u001a\u001d\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010$\u001a<\u0010%\u001a\u00020\u0013*\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0002H\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006/"}, d2 = {"Cache1", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Cache2", "DefaultBoxMeasurePolicy", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "boxChildDataNode", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "Landroidx/compose/ui/layout/Measurable;", "getBoxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "matchesParentSize", "", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "contentAlignment", "propagateMinConstraints", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cacheFor", "propagate", "maybeCachedBoxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BoxKt {
    private static final MutableScatterMap<Alignment, MeasurePolicy> Cache1 = null;
    private static final MutableScatterMap<Alignment, MeasurePolicy> Cache2 = null;
    private static final MeasurePolicy DefaultBoxMeasurePolicy = null;
    private static final MeasurePolicy EmptyBoxMeasurePolicy = null;

    public static final /* synthetic */ boolean access$getMatchesParentSize(Measurable $receiver) {
        return getMatchesParentSize($receiver);
    }

    public static final /* synthetic */ void access$placeInBox(Placeable.PlacementScope $receiver, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int boxWidth, int boxHeight, Alignment alignment) {
        placeInBox($receiver, placeable, measurable, layoutDirection, boxWidth, boxHeight, alignment);
    }

    public static final void Box(Modifier modifier, Alignment contentAlignment, boolean propagateMinConstraints, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r23, Composer $composer, int $changed, int r26) {
        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        if ((r26 & 1) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L7:
        if ((r26 & 2) == 0) goto L9;
        Alignment contentAlignment2 = Alignment.Companion.getTopStart();
    L11:
        if ((r26 & 4) == 0) goto L13;
        boolean propagateMinConstraints2 = false;
    L14:
        MeasurePolicy measurePolicy = maybeCachedBoxMeasurePolicy(contentAlignment2, propagateMinConstraints2);
        int $changed$iv = ($changed << 3) & 112;
        Modifier modifier$iv = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
        Function0<ComposeUiNode> r12 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L17;
        ComposablesKt.invalidApplier();
    L17:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L20;
        $composer.createNode(r12);
    L21:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r0 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L28;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L28;
    L29:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        r23.invoke(BoxScopeInstance.INSTANCE, $composer, Integer.valueOf((($changed >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L28:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r0);
        goto L29
    L20:
        $composer.useNode();
        goto L21
    L13:
        propagateMinConstraints2 = propagateMinConstraints;
        goto L14
    L9:
        contentAlignment2 = contentAlignment;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    private static final MutableScatterMap<Alignment, MeasurePolicy> cacheFor(boolean propagate) {
        MutableScatterMap<Alignment, MeasurePolicy> r0 = new MutableScatterMap(9);
        r0.set(Alignment.Companion.getTopStart(), new BoxMeasurePolicy(Alignment.Companion.getTopStart(), propagate));
        r0.set(Alignment.Companion.getTopCenter(), new BoxMeasurePolicy(Alignment.Companion.getTopCenter(), propagate));
        r0.set(Alignment.Companion.getTopEnd(), new BoxMeasurePolicy(Alignment.Companion.getTopEnd(), propagate));
        r0.set(Alignment.Companion.getCenterStart(), new BoxMeasurePolicy(Alignment.Companion.getCenterStart(), propagate));
        r0.set(Alignment.Companion.getCenter(), new BoxMeasurePolicy(Alignment.Companion.getCenter(), propagate));
        r0.set(Alignment.Companion.getCenterEnd(), new BoxMeasurePolicy(Alignment.Companion.getCenterEnd(), propagate));
        r0.set(Alignment.Companion.getBottomStart(), new BoxMeasurePolicy(Alignment.Companion.getBottomStart(), propagate));
        r0.set(Alignment.Companion.getBottomCenter(), new BoxMeasurePolicy(Alignment.Companion.getBottomCenter(), propagate));
        r0.set(Alignment.Companion.getBottomEnd(), new BoxMeasurePolicy(Alignment.Companion.getBottomEnd(), propagate));
        return r0;
    }

    static {
        Cache1 = cacheFor(true);
        Cache2 = cacheFor(false);
        DefaultBoxMeasurePolicy = new BoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        EmptyBoxMeasurePolicy = BoxKt$EmptyBoxMeasurePolicy$1.INSTANCE;
    }

    public static final MeasurePolicy maybeCachedBoxMeasurePolicy(Alignment alignment, boolean propagateMinConstraints) {
        if (propagateMinConstraints == false) goto L4;
        MutableScatterMap<Alignment, MeasurePolicy> r0 = Cache1;
    L5:
        MeasurePolicy r1 = r0.get(alignment);
        if (r1 == null) goto L8;
        return r1;
    L8:
        return new BoxMeasurePolicy(alignment, propagateMinConstraints);
    L4:
        r0 = Cache2;
        goto L5
    }

    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean propagateMinConstraints, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 56522820, "C(rememberBoxMeasurePolicy):Box.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(56522820, $changed, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
    L6:
        if (Intrinsics.areEqual(alignment, Alignment.Companion.getTopStart()) == false) goto L9;
        if (propagateMinConstraints == true) goto L9;
        $composer.startReplaceGroup(-1709785313);
        $composer.endReplaceGroup();
        BoxMeasurePolicy r0 = DefaultBoxMeasurePolicy;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventEnd();
    L35:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L9:
        $composer.startReplaceGroup(-1709737635);
        ComposerKt.sourceInformation($composer, "112@5065L121");
        ComposerKt.sourceInformationMarkerStart($composer, -55152523, "CC(remember):Box.kt#9igjgp");
        boolean r1 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L14;
        if ($composer.changed(alignment) == false) goto L14;
    L15:
        boolean r2 = true;
    L18:
        if ((($changed & 112) ^ 48) <= 32) goto L22;
        if ($composer.changed(propagateMinConstraints) == false) goto L22;
    L23:
        r1 = true;
    L24:
        boolean invalid$iv = r2 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L27;
    L30:
        Object value$iv = new BoxMeasurePolicy(alignment, propagateMinConstraints);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        r0 = (BoxMeasurePolicy) it$iv;
        goto L33
    L27:
        if (it$iv != Composer.Companion.getEmpty()) goto L31;
    L22:
        if (($changed & 48) != 32) goto L24;
    L14:
        if (($changed & 6) == 4) goto L15;
        r2 = false;
        goto L18
    }

    private static final void placeInBox(Placeable.PlacementScope $this$placeInBox, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int boxWidth, int boxHeight, Alignment alignment) {
        BoxChildDataNode r0 = getBoxChildDataNode(measurable);
        if (r0 == null) goto L6;
        Alignment r1 = r0.getAlignment();
        if (r1 == null) goto L6;
    L7:
        Alignment childAlignment = r1;
        int width$iv = placeable.getWidth();
        int height$iv = placeable.getHeight();
        long position = childAlignment.mo3942alignKFBX0sM(IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L)), IntSize.m7139constructorimpl((((long) boxWidth) << 32) | (((long) boxHeight) & 4294967295L)), layoutDirection);
        Placeable.PlacementScope.m5778place70tqf50$default($this$placeInBox, placeable, position, 0.0f, 2, null);
        return;
    L6:
        r1 = alignment;
        goto L7
    }

    public static final void Box(final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-211209833);
        ComposerKt.sourceInformation($composer2, "C(Box)233@9532L66:Box.kt#2w3rfo");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r6 = true;
    L14:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L16;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L37:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L41;
        r2.updateScope(new AnonymousClass2(modifier, $changed));
        return;
    L41:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-211209833, $dirty, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
    L18:
        MeasurePolicy r3 = EmptyBoxMeasurePolicy;
        int r7 = ($dirty & 14) | 48;
        ComposerKt.sourceInformationMarkerStart($composer2, 544976794, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> r10 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart($composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        $composer2.createNode(r10);
    L25:
        Composer $this$Layout_u24lambda_u241$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, r3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u241$iv.getInserting() == true) goto L31;
        $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u241$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L33;
    L32:
        $this$Layout_u24lambda_u241$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), r4);
    L33:
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
        goto L37
    L31:
        $composer3 = $composer2;
        goto L32
    L24:
        $composer2.useNode();
        goto L25
    L12:
        r6 = false;
        goto L14
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    private static final BoxChildDataNode getBoxChildDataNode(Measurable $this$boxChildDataNode) {
        Object r0 = $this$boxChildDataNode.getParentData();
        if ((r0 instanceof BoxChildDataNode) == true) goto L7;
        return null;
    L7:
        return (BoxChildDataNode) r0;
    }

    private static final boolean getMatchesParentSize(Measurable $this$matchesParentSize) {
        BoxChildDataNode r0 = getBoxChildDataNode($this$matchesParentSize);
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.getMatchParentSize();
    }
}
