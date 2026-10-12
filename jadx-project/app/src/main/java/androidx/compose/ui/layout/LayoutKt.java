package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a \u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\r\u001a>\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00070\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001a;\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00070\u000fH\u0001¢\u0006\u0002\u0010\u0015\u001a3\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001a2\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010\u001d\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001a2\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"LargeDimension", "", "Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "contents", "", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/ExtensionFunctionType;", "modifierMaterializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "materializerOfWithCompositionLocalInjection", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    public static final void Layout(Function2<? super Composer, ? super Integer, Unit> r17, Modifier modifier, MeasurePolicy measurePolicy, Composer $composer, int $changed, int r22) {
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        if ((r22 & 2) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L6:
        int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap = $composer.getCurrentCompositionLocalMap();
        Modifier materialized = ComposedModifierKt.materializeModifier($composer, modifier2);
        Function0<ComposeUiNode> r6 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv = (($changed << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L9;
        ComposablesKt.invalidApplier();
    L9:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L12;
        $composer.createNode(r6);
    L13:
        Composer $this$Layout_u24lambda_u240 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240, localMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240.getInserting() == true) goto L19;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240.rememberedValue(), Integer.valueOf(compositeKeyHash)) == false) goto L19;
    L20:
        Updater.m3815setimpl($this$Layout_u24lambda_u240, materialized, ComposeUiNode.Companion.getSetModifier());
        r17.invoke($composer, Integer.valueOf(($changed$iv >> 6) & 14));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L19:
        $this$Layout_u24lambda_u240.updateRememberedValue(Integer.valueOf(compositeKeyHash));
        $this$Layout_u24lambda_u240.apply(Integer.valueOf(compositeKeyHash), r11);
        goto L20
    L12:
        $composer.useNode();
        goto L13
    L5:
        modifier2 = modifier;
        goto L6
    }

    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer $composer, int $changed, int r21) {
        ComposerKt.sourceInformationMarkerStart($composer, 544976794, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh");
        if ((r21 & 1) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L6:
        int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        Modifier materialized = ComposedModifierKt.materializeModifier($composer, modifier2);
        CompositionLocalMap localMap = $composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> r6 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart($composer, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L9;
        ComposablesKt.invalidApplier();
    L9:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L12;
        $composer.createNode(r6);
    L13:
        Composer $this$Layout_u24lambda_u241 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u241, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u241, localMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$Layout_u24lambda_u241, materialized, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u241.getInserting() == true) goto L19;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u241.rememberedValue(), Integer.valueOf(compositeKeyHash)) == false) goto L19;
    L20:
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L19:
        $this$Layout_u24lambda_u241.updateRememberedValue(Integer.valueOf(compositeKeyHash));
        $this$Layout_u24lambda_u241.apply(Integer.valueOf(compositeKeyHash), r11);
        goto L20
    L12:
        $composer.useNode();
        goto L13
    L5:
        modifier2 = modifier;
        goto L6
    }

    public static final void Layout(List<? extends Function2<? super Composer, ? super Integer, Unit>> r20, Modifier modifier, MultiContentMeasurePolicy measurePolicy, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 1399185516, "CC(Layout)P(!1,2)168@6883L62,165@6769L182:Layout.kt#80mrfh");
        if ((r25 & 2) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L6:
        Function2<Composer, Integer, Unit> r4 = combineAsVirtualLayouts(r20);
        ComposerKt.sourceInformationMarkerStart($composer, -290764973, "CC(remember):Layout.kt#9igjgp");
        if ((($changed & 896) ^ 384) <= 256) goto L11;
        MultiContentMeasurePolicy r5 = measurePolicy;
        if ($composer.changed(r5) == false) goto L13;
    L14:
        boolean invalid$iv = true;
    L16:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv = MultiContentMeasurePolicyKt.createMeasurePolicy(r5);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L23:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int $changed$iv = $changed & 112;
        Modifier modifier$iv = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
        Function0<ComposeUiNode> r13 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L26;
        ComposablesKt.invalidApplier();
    L26:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L29;
        $composer.createNode(r13);
    L30:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L37;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L37;
    L38:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r4.invoke($composer, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L37:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r2);
        goto L38
    L29:
        $composer.useNode();
        goto L30
    L19:
        if (it$iv != Composer.Companion.getEmpty()) goto L23;
    L13:
        if (($changed & 384) == 256) goto L14;
        invalid$iv = false;
        goto L16
    L11:
        r5 = measurePolicy;
        goto L13
    L5:
        modifier2 = modifier;
        goto L6
    }

    public static final Function2<Composer, Integer, Unit> combineAsVirtualLayouts(final List<? extends Function2<? super Composer, ? super Integer, Unit>> r3) {
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new AnonymousClass1(r3));
    }

    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new C06361(modifier));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new LayoutKt$materializerOfWithCompositionLocalInjection$1(modifier));
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r19, final MeasurePolicy measurePolicy, Composer $composer, final int $changed, final int r23) {
        Composer $composer2 = $composer.startRestartGroup(1949933075);
        ComposerKt.sourceInformation($composer2, "C(MultiMeasureLayout)P(2)238@9345L23,242@9497L427:Layout.kt#80mrfh");
        int $dirty = $changed;
        int r5 = r23 & 1;
        if (r5 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r7 = modifier;
    L14:
        if ((r23 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r23 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
        boolean r1 = true;
    L38:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L64;
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(1949933075, $dirty2, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:237)");
    L45:
        int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        Modifier materialized = ComposedModifierKt.materializeModifier($composer2, modifier2);
        CompositionLocalMap localMap = $composer2.getCurrentCompositionLocalMap();
        Function0<LayoutNode> r9 = LayoutNode.Companion.getConstructor$ui_release();
        int $changed$iv = (($dirty2 << 3) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L51;
        $composer2.createNode(r9);
    L52:
        Composer $this$MultiMeasureLayout_u24lambda_u243 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$MultiMeasureLayout_u24lambda_u243, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$MultiMeasureLayout_u24lambda_u243, localMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3812initimpl($this$MultiMeasureLayout_u24lambda_u243, LayoutKt$MultiMeasureLayout$1$1.INSTANCE);
        Updater.m3815setimpl($this$MultiMeasureLayout_u24lambda_u243, materialized, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$MultiMeasureLayout_u24lambda_u243.getInserting() == true) goto L58;
        int compositeKeyHash2 = compositeKeyHash;
        Modifier modifier3 = modifier2;
        if (Intrinsics.areEqual($this$MultiMeasureLayout_u24lambda_u243.rememberedValue(), Integer.valueOf(compositeKeyHash2)) == true) goto L60;
    L59:
        $this$MultiMeasureLayout_u24lambda_u243.updateRememberedValue(Integer.valueOf(compositeKeyHash2));
        $this$MultiMeasureLayout_u24lambda_u243.apply(Integer.valueOf(compositeKeyHash2), r14);
    L60:
        r19.invoke($composer2, Integer.valueOf(($changed$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventEnd();
    L63:
        final Modifier modifier4 = modifier3;
    L65:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L69;
        r8.updateScope(new AnonymousClass2(modifier4, r19, measurePolicy, $changed, r23));
        return;
    L69:
        return;
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
    L64:
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        goto L65
    L36:
        r1 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changed(measurePolicy) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
        goto L33
    L31:
        r10 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r19) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
        goto L24
    L21:
        r11 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L14
    L10:
        r12 = 2;
        goto L11
    L12:
        r7 = modifier;
        goto L14
    }
}
