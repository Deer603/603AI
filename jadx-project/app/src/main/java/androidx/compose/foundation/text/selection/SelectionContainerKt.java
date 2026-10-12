package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SelectionContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"DisableSelection", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionContainer", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionContainerKt {
    public static final /* synthetic */ void access$SelectionContainer$lambda$2(MutableState $selection$delegate, Selection value) {
        SelectionContainer$lambda$2($selection$delegate, value);
    }

    public static final void SelectionContainer(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r11, Composer $composer, final int $changed, final int r14) {
        Composer $composer2 = $composer.startRestartGroup(-1075498320);
        ComposerKt.sourceInformation($composer2, "C(SelectionContainer)P(1)53@2355L45,57@2513L18,54@2405L160:SelectionContainer.kt#eksfi3");
        int $dirty = $changed;
        int r1 = r14 & 1;
        if (r1 == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r14 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if (($dirty & 19) == 18) goto L25;
        boolean r3 = true;
    L27:
        if ($composer2.shouldExecute(r3, $dirty & 1) == false) goto L45;
        if (r1 == 0) goto L30;
        modifier = Modifier.Companion;
    L30:
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-1075498320, $dirty, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:52)");
    L33:
        ComposerKt.sourceInformationMarkerStart($composer2, 882584971, "CC(remember):SelectionContainer.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L37;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L37:
        final MutableState selection$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Selection r2 = SelectionContainer$lambda$1(selection$delegate);
        ComposerKt.sourceInformationMarkerStart($composer2, 882590000, "CC(remember):SelectionContainer.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L41;
        Object value$iv2 = (Function1) new SelectionContainerKt$SelectionContainer$1$1(selection$delegate);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function2<? super Composer, ? super Integer, Unit> r4 = r11;
        SelectionContainer(modifier2, r2, (Function1) it$iv2, r4, $composer2, (($dirty & 14) | 384) | (($dirty << 6) & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        modifier = modifier2;
    L46:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L50;
        r12.updateScope(new AnonymousClass2(modifier, r4, $changed, r14));
        return;
    L50:
        return;
    L45:
        r4 = r11;
        $composer2.skipToGroupEnd();
        goto L46
    L25:
        r3 = false;
        goto L27
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r11) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L23
    L20:
        r5 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(modifier) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> r4) {
        MutableState<Selection> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void SelectionContainer$lambda$2(MutableState<Selection> r4, Selection value) {
        r4.setValue(value);
    }

    public static final void DisableSelection(final Function2<? super Composer, ? super Integer, Unit> r4, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(336063542);
        ComposerKt.sourceInformation($composer2, "C(DisableSelection)70@2856L82:SelectionContainer.kt#eksfi3");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r4) == false) goto L7;
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
        r0.updateScope(new AnonymousClass1(r4, $changed));
        return;
    L26:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(336063542, $dirty, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:69)");
    L18:
        CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), r4, $composer2, ProvidedValue.$stable | (($dirty << 3) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
        goto L22
    L12:
        r3 = false;
        goto L14
    }

    public static final void SelectionContainer(Modifier modifier, final Selection selection, final Function1<? super Selection, Unit> r25, final Function2<? super Composer, ? super Integer, Unit> r26, Composer $composer, final int $changed, final int r29) {
        Composer $composer2 = $composer.startRestartGroup(2078139907);
        ComposerKt.sourceInformation($composer2, "C(SelectionContainer)P(1,3,2)91@3548L83,93@3651L44,95@3732L7,96@3765L24,97@3839L7,99@3883L253,106@4180L7,117@4649L2468,117@4592L2525,173@7149L106,173@7123L132:SelectionContainer.kt#eksfi3");
        int $dirty = $changed;
        int r6 = r29 & 1;
        if (r6 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r7 = modifier;
    L14:
        if ((r29 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r29 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        if ((r29 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L43:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L46;
        boolean r1 = true;
    L48:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L81;
        if (r6 == 0) goto L51;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(2078139907, $dirty2, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:89)");
    L55:
        final SelectionRegistrarImpl registrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m3923rememberSaveable(new Object[0], SelectionRegistrarImpl.Companion.getSaver(), null, SelectionContainerKt$SelectionContainer$registrarImpl$1.INSTANCE, $composer2, 3072, 4);
        ComposerKt.sourceInformationMarkerStart($composer2, 882626442, "CC(remember):SelectionContainer.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L59;
        Object value$iv = new SelectionManager(registrarImpl);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L59:
        final SelectionManager manager = (SelectionManager) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Clipboard> r8 = CompositionLocalsKt.getLocalClipboard();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Clipboard clipboard = (Clipboard) r15;
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L63;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L63:
        final CoroutineScope coroutineScope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<HapticFeedback> r9 = CompositionLocalsKt.getLocalHapticFeedback();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        manager.setHapticFeedBack((HapticFeedback) r16);
        ComposerKt.sourceInformationMarkerStart($composer2, 882634075, "CC(remember):SelectionContainer.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(coroutineScope) | $composer2.changed(clipboard);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L70;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L70;
    L71:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        manager.setOnCopyHandler((Function1) it$iv2);
        ProvidableCompositionLocal<TextToolbar> r10 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        manager.setTextToolbar((TextToolbar) r14);
        manager.setOnSelectionChange(r25);
        manager.setSelection(selection);
        SimpleLayoutKt.SimpleLayout(modifier2.then(manager.getModifier()), ComposableLambdaKt.rememberComposableLambda(-1869667463, true, new AnonymousClass4(manager, registrarImpl, r26), $composer2, 54), $composer2, 48, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 882738440, "CC(remember):SelectionContainer.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(manager);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L74;
    L77:
        Object value$iv2 = (Function1) new SelectionContainerKt$SelectionContainer$5$1(manager);
        $composer2.updateRememberedValue(value$iv2);
        it$iv3 = value$iv2;
    L78:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(manager, (Function1) it$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
    L82:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L86;
        r11.updateScope(new AnonymousClass6(modifier2, selection, r25, r26, $changed, r29));
        return;
    L86:
        return;
    L74:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L78;
    L70:
        Object value$iv3 = (Function1) new SelectionContainerKt$SelectionContainer$3$1(coroutineScope, clipboard);
        $composer2.updateRememberedValue(value$iv3);
        it$iv2 = value$iv3;
        goto L71
    L51:
        modifier2 = r7;
        goto L53
    L81:
        $composer2.skipToGroupEnd();
        modifier2 = r7;
        goto L82
    L46:
        r1 = false;
        goto L48
    L37:
        if (($changed & 3072) != 0) goto L43;
        if ($composer2.changedInstance(r26) == false) goto L41;
        int r12 = 2048;
    L42:
        $dirty = $dirty | r12;
        goto L43
    L41:
        r12 = 1024;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r25) == false) goto L31;
        int r13 = 256;
    L32:
        $dirty = $dirty | r13;
        goto L34
    L31:
        r13 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(selection) == false) goto L21;
        int r17 = 32;
    L22:
        $dirty = $dirty | r17;
        goto L24
    L21:
        r17 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L14
    L10:
        r18 = 2;
        goto L11
    L12:
        r7 = modifier;
        goto L14
    }
}
