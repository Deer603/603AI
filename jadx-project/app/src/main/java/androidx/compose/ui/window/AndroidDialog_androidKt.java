package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0015\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release", "currentContent"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidDialog_androidKt {
    public static final /* synthetic */ Function2 access$Dialog$lambda$0(State $currentContent$delegate) {
        return Dialog$lambda$0($currentContent$delegate);
    }

    public static final /* synthetic */ void access$DialogLayout(Modifier modifier, Function2 content, Composer $composer, int $changed, int $default) {
        DialogLayout(modifier, content, $composer, $changed, $default);
    }

    public static final void Dialog(final Function0<Unit> r23, DialogProperties properties, final Function2<? super Composer, ? super Integer, Unit> r25, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(-2032877254);
        ComposerKt.sourceInformation($composer2, "C(Dialog)P(1,2)178@7799L7,179@7838L7,180@7893L7,181@7923L28,182@7978L29,183@8027L38,185@8091L554,197@8676L129,197@8651L154,206@8822L182,206@8811L193:AndroidDialog.android.kt#2oxthz");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r28 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        DialogProperties properties2 = properties;
    L24:
        if ((r28 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        if (($dirty & 147) == 146) goto L36;
        boolean r9 = true;
    L38:
        if ($composer2.shouldExecute(r9, $dirty & 1) == false) goto L77;
        if (r3 == 0) goto L42;
        properties2 = new DialogProperties(false, false, false, 7, null);
    L42:
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventStart(-2032877254, $dirty, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:177)");
    L44:
        ProvidableCompositionLocal<View> r0 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        View view = (View) r15;
        ProvidableCompositionLocal<Density> r1 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r16;
        ProvidableCompositionLocal<LayoutDirection> r10 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r11;
        CompositionContext composition = ComposablesKt.rememberCompositionContext($composer2, 0);
        final State currentContent$delegate = SnapshotStateKt.rememberUpdatedState(r25, $composer2, ($dirty >> 6) & 14);
        UUID dialogId = (UUID) RememberSaveableKt.m3923rememberSaveable(new Object[0], null, null, AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE, $composer2, 3072, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -464817961, "CC(remember):AndroidDialog.android.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(view) | $composer2.changed(density);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L47;
    L50:
        final DialogProperties properties3 = properties2;
        final LayoutDirection layoutDirection2 = layoutDirection;
        DialogWrapper $this$Dialog_u24lambda_u242_u24lambda_u241 = new DialogWrapper(r23, properties3, view, layoutDirection2, density, dialogId);
        $this$Dialog_u24lambda_u242_u24lambda_u241.setContent(composition, ComposableLambdaKt.composableLambdaInstance(488261145, true, new AndroidDialog_androidKt$Dialog$dialog$1$1$1(currentContent$delegate)));
        $composer2.updateRememberedValue($this$Dialog_u24lambda_u242_u24lambda_u241);
        it$iv = $this$Dialog_u24lambda_u242_u24lambda_u241;
    L51:
        final DialogWrapper dialog = (DialogWrapper) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -464799666, "CC(remember):AndroidDialog.android.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(dialog);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L58;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L58;
    L59:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(dialog, (Function1) it$iv2, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -464794941, "CC(remember):AndroidDialog.android.kt#9igjgp");
        boolean r2 = $composer2.changedInstance(dialog);
        if (($dirty & 14) != 4) goto L62;
        boolean r12 = true;
    L63:
        boolean r4 = r2 | r12;
        if (($dirty & 112) != 32) goto L66;
        boolean r13 = true;
    L67:
        boolean invalid$iv3 = (r4 | r13) | $composer2.changed(layoutDirection2);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L70;
    L73:
        Object value$iv = (Function0) new AndroidDialog_androidKt$Dialog$2$1(dialog, r23, properties3, layoutDirection2);
        $composer2.updateRememberedValue(value$iv);
        it$iv3 = value$iv;
    L74:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) it$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventEnd();
    L78:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L82;
        r6.updateScope(new AnonymousClass3(r23, properties3, r25, $changed, r28));
        return;
    L82:
        return;
    L70:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L74;
    L66:
        r13 = false;
        goto L67
    L62:
        r12 = false;
    L58:
        Object value$iv2 = (Function1) new AndroidDialog_androidKt$Dialog$1$1(dialog);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
        goto L59
    L47:
        if (it$iv == Composer.Companion.getEmpty()) goto L50;
        properties3 = properties2;
        layoutDirection2 = layoutDirection;
        goto L51
    L77:
        $composer2.skipToGroupEnd();
        properties3 = properties2;
        goto L78
    L36:
        r9 = false;
        goto L38
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r25) == false) goto L31;
        int r14 = 256;
    L32:
        $dirty = $dirty | r14;
        goto L34
    L31:
        r14 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L22;
        properties2 = properties;
        if ($composer2.changed(properties2) == false) goto L20;
        int r17 = 32;
    L21:
        $dirty = $dirty | r17;
        goto L24
    L20:
        r17 = 16;
        goto L21
    L22:
        properties2 = properties;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r23) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    private static final Function2<Composer, Integer, Unit> Dialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function2) thisObj$iv;
    }

    private static final void DialogLayout(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r23, Composer $composer, final int $changed, final int r26) {
        Composer $composer2 = $composer.startRestartGroup(-1177876616);
        ComposerKt.sourceInformation($composer2, "C(DialogLayout)P(1)609@24608L606:AndroidDialog.android.kt#2oxthz");
        int $dirty = $changed;
        int r6 = r26 & 1;
        if (r6 == 0) goto L6;
        $dirty = $dirty | 6;
        final Modifier modifier2 = modifier;
    L14:
        if ((r26 & 2) == 0) goto L17;
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
        ComposerKt.traceEventStart(-1177876616, $dirty, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:608)");
    L35:
        MeasurePolicy measurePolicy$iv = AnonymousClass1.INSTANCE;
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
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L49;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L49;
    L50:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r23.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        modifier2 = modifier4;
    L55:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L59;
        r3.updateScope(new AnonymousClass2(modifier2, r23, $changed, r26));
        return;
    L59:
        return;
    L49:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r7);
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
        if ($composer2.changedInstance(r23) == false) goto L21;
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
