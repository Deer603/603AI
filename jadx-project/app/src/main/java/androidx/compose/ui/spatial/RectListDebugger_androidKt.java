package androidx.compose.ui.spatial;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RectListDebugger.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"RectListDebugger", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RectListDebugger_androidKt {
    public static final void RectListDebugger(Modifier modifier, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(949081399);
        ComposerKt.sourceInformation($composer2, "C(RectListDebugger)39@1564L78:RectListDebugger.android.kt#2zyoiz");
        int $dirty = $changed;
        int r5 = r24 & 1;
        if (r5 == 0) goto L6;
        $dirty = $dirty | 6;
        final Modifier modifier2 = modifier;
    L14:
        if (($dirty & 3) == 2) goto L16;
        boolean r6 = true;
    L18:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L44;
        if (r5 == 0) goto L21;
        Modifier.Companion modifier3 = Modifier.Companion;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(949081399, $dirty, -1, "androidx.compose.ui.spatial.RectListDebugger (RectListDebugger.android.kt:38)");
    L25:
        Modifier modifier$iv = modifier3.then(RectListDebuggerModifierElement.INSTANCE);
        MeasurePolicy measurePolicy$iv = EmptyFillMeasurePolicy.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 544976794, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> r12 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart($composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L28;
        ComposablesKt.invalidApplier();
    L28:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L31;
        $composer2.createNode(r12);
    L32:
        Composer $this$Layout_u24lambda_u241$iv = Updater.m3808constructorimpl($composer2);
        Composer $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u241$iv.getInserting() == true) goto L38;
        Modifier modifier4 = modifier3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u241$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L40;
    L39:
        $this$Layout_u24lambda_u241$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), r3);
    L40:
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L43;
        ComposerKt.traceEventEnd();
    L43:
        modifier2 = modifier4;
    L45:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L49;
        r2.updateScope(new AnonymousClass1(modifier2, $changed, r24));
        return;
    L49:
        return;
    L38:
        modifier4 = modifier3;
        goto L39
    L31:
        $composer2.useNode();
        goto L32
    L21:
        modifier3 = modifier2;
        goto L23
    L44:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        goto L45
    L16:
        r6 = false;
        goto L18
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L14
    L10:
        r8 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }
}
