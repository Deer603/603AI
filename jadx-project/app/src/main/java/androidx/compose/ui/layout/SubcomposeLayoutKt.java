package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0001\u001a6\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001a>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0015"}, d2 = {"ReusedSlotId", "androidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1", "Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;", "SubcomposeLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "state", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SubcomposeSlotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "maxSlotsToRetainForReuse", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SubcomposeLayoutKt {
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = null;

    public static final /* synthetic */ SubcomposeLayoutKt$ReusedSlotId$1 access$getReusedSlotId$p() {
        return ReusedSlotId;
    }

    public static final void SubcomposeLayout(final Modifier modifier, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> r9, Composer $composer, final int $changed, final int r12) {
        Composer $composer2 = $composer.startRestartGroup(-1298353104);
        ComposerKt.sourceInformation($composer2, "C(SubcomposeLayout)P(1)84@4114L36,83@4080L144:SubcomposeLayout.kt#80mrfh");
        int $dirty = $changed;
        int r1 = r12 & 1;
        if (r1 == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r12 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if (($dirty & 19) == 18) goto L25;
        boolean r2 = true;
    L27:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L42;
        if (r1 == 0) goto L30;
        Modifier modifier2 = Modifier.Companion;
    L32:
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventStart(-1298353104, $dirty, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:82)");
    L34:
        ComposerKt.sourceInformationMarkerStart($composer2, -1663485749, "CC(remember):SubcomposeLayout.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L38;
        Object value$iv = new SubcomposeLayoutState();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> r3 = r9;
        SubcomposeLayout((SubcomposeLayoutState) it$iv, modifier2, r3, $composer2, (($dirty << 3) & 112) | (($dirty << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        modifier = modifier2;
    L43:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L47;
        r10.updateScope(new AnonymousClass2(modifier, r3, $changed, r12));
        return;
    L47:
        return;
    L30:
        modifier2 = modifier;
        goto L32
    L42:
        r3 = r9;
        $composer2.skipToGroupEnd();
        goto L43
    L25:
        r2 = false;
        goto L27
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r9) == false) goto L20;
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

    public static final void SubcomposeLayout(final SubcomposeLayoutState state, Modifier modifier, final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> r22, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-511989831);
        ComposerKt.sourceInformation($composer2, "C(SubcomposeLayout)P(2,1)116@5575L23,117@5628L28,120@5784L435:SubcomposeLayout.kt#80mrfh");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r25 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L24:
        if ((r25 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
        boolean r2 = true;
    L38:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L75;
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(-511989831, $dirty2, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:115)");
    L45:
        int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionContext compositionContext = ComposablesKt.rememberCompositionContext($composer2, 0);
        Modifier materialized = ComposedModifierKt.materializeModifier($composer2, modifier2);
        CompositionLocalMap localMap = $composer2.getCurrentCompositionLocalMap();
        Function0<LayoutNode> r11 = LayoutNode.Companion.getConstructor$ui_release();
        ComposerKt.sourceInformationMarkerStart($composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L51;
        $composer2.createNode(r11);
    L52:
        Composer $this$SubcomposeLayout_u24lambda_u241 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$SubcomposeLayout_u24lambda_u241, state, state.getSetRoot$ui_release());
        Updater.m3815setimpl($this$SubcomposeLayout_u24lambda_u241, compositionContext, state.getSetCompositionContext$ui_release());
        Updater.m3815setimpl($this$SubcomposeLayout_u24lambda_u241, r22, state.getSetMeasurePolicy$ui_release());
        Updater.m3815setimpl($this$SubcomposeLayout_u24lambda_u241, localMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$SubcomposeLayout_u24lambda_u241, materialized, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$SubcomposeLayout_u24lambda_u241.getInserting() == true) goto L58;
        int compositeKeyHash2 = compositeKeyHash;
        Modifier modifier3 = modifier2;
        if (Intrinsics.areEqual($this$SubcomposeLayout_u24lambda_u241.rememberedValue(), Integer.valueOf(compositeKeyHash2)) == true) goto L60;
    L59:
        $this$SubcomposeLayout_u24lambda_u241.updateRememberedValue(Integer.valueOf(compositeKeyHash2));
        $this$SubcomposeLayout_u24lambda_u241.apply(Integer.valueOf(compositeKeyHash2), r10);
    L60:
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if ($composer2.getSkipping() == true) goto L70;
        $composer2.startReplaceGroup(-26326018);
        ComposerKt.sourceInformation($composer2, "132@6276L34,132@6265L45");
        ComposerKt.sourceInformationMarkerStart($composer2, -1663416567, "CC(remember):SubcomposeLayout.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(state);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L65;
    L68:
        Object value$iv = (Function0) new SubcomposeLayoutKt$SubcomposeLayout$4$1(state);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L69:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) it$iv, $composer2, 0);
        $composer2.endReplaceGroup();
    L72:
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
    L74:
        final Modifier modifier4 = modifier3;
    L76:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L80;
        r8.updateScope(new AnonymousClass5(state, modifier4, r22, $changed, r25));
        return;
    L80:
        return;
    L65:
        if (it$iv != Composer.Companion.getEmpty()) goto L69;
    L70:
        $composer2.startReplaceGroup(-26267397);
        $composer2.endReplaceGroup();
        goto L72
    L58:
        compositeKeyHash2 = compositeKeyHash;
        modifier3 = modifier2;
        goto L59
    L51:
        $composer2.useNode();
        goto L52
    L41:
        modifier2 = r7;
        goto L43
    L75:
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        goto L76
    L36:
        r2 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r22) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
        goto L33
    L31:
        r9 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L20;
        int r12 = 32;
    L21:
        $dirty = $dirty | r12;
        goto L24
    L20:
        r12 = 16;
        goto L21
    L22:
        r7 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(state) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L12
    L10:
        r6 = 2;
        goto L11
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int maxSlotsToRetainForReuse) {
        return new FixedCountSubcomposeSlotReusePolicy(maxSlotsToRetainForReuse);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1] */
    static {
        ReusedSlotId = new SubcomposeLayoutKt$ReusedSlotId$1();
    }
}
