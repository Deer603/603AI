package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"SimpleLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SimpleLayoutKt {
    public static final void SimpleLayout(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r22, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-2105228848);
        ComposerKt.sourceInformation($composer2, "C(SimpleLayout)P(1)31@1128L507:SimpleLayout.kt#eksfi3");
        int $dirty = $changed;
        int r6 = r25 & 1;
        if (r6 == 0) goto L6;
        $dirty = $dirty | 6;
        final Modifier modifier2 = modifier;
    L14:
        if ((r25 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if (($dirty & 19) == 18) goto L26;
        boolean r8 = true;
    L28:
        if ($composer2.shouldExecute(r8, $dirty & 1) == false) goto L54;
        if (r6 == 0) goto L31;
        Modifier.Companion modifier3 = Modifier.Companion;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-2105228848, $dirty, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:30)");
    L35:
        AnonymousClass1 r3 = AnonymousClass1.INSTANCE;
        int $changed$iv = ((($dirty >> 3) & 14) | 384) | (($dirty << 3) & 112);
        Modifier modifier$iv = modifier3;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r13 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        Modifier modifier4 = modifier3;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L38;
        ComposablesKt.invalidApplier();
    L38:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L41;
        $composer2.createNode(r13);
    L42:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, r3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L49;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L49;
    L50:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r22.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        modifier2 = modifier4;
    L55:
        ScopeUpdateScope r5 = $composer2.endRestartGroup();
        if (r5 == null) goto L59;
        r5.updateScope(new AnonymousClass2(modifier2, r22, $changed, r25));
        return;
    L59:
        return;
    L49:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r4);
        goto L50
    L41:
        $composer2.useNode();
        goto L42
    L31:
        modifier3 = modifier2;
        goto L33
    L54:
        $composer2.skipToGroupEnd();
        goto L55
    L26:
        r8 = false;
        goto L28
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r22) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L14
    L10:
        r10 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }
}
