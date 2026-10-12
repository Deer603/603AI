package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TestModifierUpdater.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"TestModifierUpdaterLayout", "", "onAttached", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/TestModifierUpdater;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TestModifierUpdaterKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
    public static final void TestModifierUpdaterLayout(final Function1<? super TestModifierUpdater, Unit> r16, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1673066036);
        ComposerKt.sourceInformation($composer2, "C(TestModifierUpdaterLayout)49@1764L23,53@1919L278:TestModifierUpdater.kt#80mrfh");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r16) == false) goto L7;
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
        $composer2.skipToGroupEnd();
    L36:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L40;
        r2.updateScope(new AnonymousClass2(r16, $changed));
        return;
    L40:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1673066036, $dirty, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:48)");
    L18:
        int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        MeasurePolicy measurePolicy = TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.INSTANCE;
        Function0<LayoutNode> r7 = LayoutNode.Companion.getConstructor$ui_release();
        ComposerKt.sourceInformationMarkerStart($composer2, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startNode();
        if ($composer2.getInserting() == false) goto L24;
        $composer2.createNode(r7);
    L25:
        Composer $this$TestModifierUpdaterLayout_u24lambda_u240 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$TestModifierUpdaterLayout_u24lambda_u240, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$TestModifierUpdaterLayout_u24lambda_u240.getInserting() == true) goto L30;
        int compositeKeyHash2 = compositeKeyHash;
        if (Intrinsics.areEqual($this$TestModifierUpdaterLayout_u24lambda_u240.rememberedValue(), Integer.valueOf(compositeKeyHash2)) == false) goto L31;
    L32:
        Updater.m3812initimpl($this$TestModifierUpdaterLayout_u24lambda_u240, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(r16));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L31:
        $this$TestModifierUpdaterLayout_u24lambda_u240.updateRememberedValue(Integer.valueOf(compositeKeyHash2));
        $this$TestModifierUpdaterLayout_u24lambda_u240.apply(Integer.valueOf(compositeKeyHash2), r11);
        goto L32
    L30:
        compositeKeyHash2 = compositeKeyHash;
        goto L31
    L24:
        $composer2.useNode();
        goto L25
    L12:
        r6 = false;
        goto L14
    }
}
