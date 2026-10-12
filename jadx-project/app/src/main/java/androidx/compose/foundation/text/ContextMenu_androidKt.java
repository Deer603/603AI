package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ContextMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\f\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\r2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\b\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0080@¢\u0006\u0002\u0010\u0018\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\rH\u0080@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"ContextMenuArea", "", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "enabled", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextItem", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "label", "Landroidx/compose/foundation/text/TextContextMenuItems;", "operation", "getContextMenuItemsAvailability", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextMenu_androidKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: ContextMenu.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, String> {
        final /* synthetic */ TextContextMenuItems $label;

        public AnonymousClass1(TextContextMenuItems r2) {
            this.$label = r2;
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(Composer r3, Integer r4) {
            return invoke(r3, r4.intValue());
        }

        public final String invoke(Composer $composer, int $changed) {
            $composer.startReplaceGroup(-1744780674);
            ComposerKt.sourceInformation($composer, "C143@5379L16:ContextMenu.android.kt#423gt5");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(-1744780674, $changed, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:143)");
        L5:
            String r0 = this.$label.resolvedString($composer, 0);
            if (ComposerKt.isTraceInProgress() == false) goto L8;
            ComposerKt.traceEventEnd();
        L8:
            $composer.endReplaceGroup();
            return r0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContextMenu.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0}, l = {154}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"})
    static final class C03471 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C03471(Continuation<? super C03471> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ContextMenu.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0, 0, 0}, l = {167}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability", "isPassword", "hasSelection"}, s = {"L$0", "I$0", "I$1"})
    static final class C03482 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C03482(Continuation<? super C03482> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability(null, this);
        }
    }

    public static final void ContextMenuArea(final TextFieldSelectionManager manager, final Function2<? super Composer, ? super Integer, Unit> r19, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1985516685);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuArea)P(1)44@1908L31,45@1965L24,46@2022L55,50@2183L17,53@2353L186,48@2123L450:ContextMenu.android.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(manager) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18) goto L19;
        boolean r2 = true;
    L21:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L53:
        ScopeUpdateScope r1 = $composer2.endRestartGroup();
        if (r1 == null) goto L57;
        r1.updateScope(new AnonymousClass3(manager, r19, $changed));
        return;
    L57:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-1985516685, $dirty2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer2, 181406995, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L28;
        boolean r20 = false;
        Object value$iv = new ContextMenuState(null, 1, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        final ContextMenuState state = (ContextMenuState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L33;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L33:
        final CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 181410667, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L37;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m1107boximpl(MenuItemsAvailability.Companion.m1120getNoneJKCFgKw()), null, 2, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L37:
        final MutableState menuItemsAvailability = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 181415781, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L41;
        Object value$iv3 = (Function0) new ContextMenu_androidKt$ContextMenuArea$1$1(state);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L41:
        Function0 r6 = (Function0) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function1<ContextMenuScope, Unit> r4 = TextFieldSelectionManager_androidKt.contextMenuBuilder(manager, state, menuItemsAvailability);
        boolean r5 = manager.getEnabled();
        ComposerKt.sourceInformationMarkerStart($composer2, 181421390, "CC(remember):ContextMenu.android.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(coroutineScope) | $composer2.changedInstance(manager);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L47;
        ContextMenuState state2 = state;
        if (it$iv4 != Composer.Companion.getEmpty()) goto L49;
    L48:
        Object value$iv4 = (Function0) new ContextMenu_androidKt$ContextMenuArea$2$1(coroutineScope, menuItemsAvailability, manager);
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L49:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ContextMenuState state3 = state2;
        ContextMenuArea_androidKt.ContextMenuArea(state3, r6, r4, null, r5, (Function0) it$iv4, r19, $composer2, (($dirty2 << 15) & 3670016) | 54, 8);
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
        goto L53
    L47:
        state2 = state;
        goto L48
    L28:
        r20 = false;
        goto L29
    L19:
        r2 = false;
        goto L21
    L12:
        if ($composer2.changedInstance(r19) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L16
    L14:
        r7 = 16;
        goto L15
    }

    public static final void ContextMenuArea(final TextFieldSelectionState selectionState, boolean enabled, final Function2<? super Composer, ? super Integer, Unit> r21, Composer $composer, final int $changed) {
        final boolean r5 = enabled;
        Composer $composer2 = $composer.startRestartGroup(2103477555);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuArea)P(2,1)68@2749L31,69@2806L24,70@2863L55,75@3098L497,90@3711L17,93@3828L193,88@3651L404:ContextMenu.android.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(selectionState) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(r5) == false) goto L14;
        int r4 = 32;
    L15:
        $dirty = $dirty | r4;
        goto L17
    L14:
        r4 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L26;
        boolean r2 = true;
    L28:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == true) goto L30;
        $composer2.skipToGroupEnd();
    L66:
        ScopeUpdateScope r1 = $composer2.endRestartGroup();
        if (r1 == null) goto L70;
        r1.updateScope(new AnonymousClass6(selectionState, r5, r21, $changed));
        return;
    L70:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(2103477555, $dirty2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 181433907, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L36;
        Object value$iv = new ContextMenuState(null, 1, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L36:
        final ContextMenuState state = (ContextMenuState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L40;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L40:
        final CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 181437579, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L44;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m1107boximpl(MenuItemsAvailability.Companion.m1120getNoneJKCFgKw()), null, 2, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L44:
        final MutableState menuItemsAvailability = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableState r6 = menuItemsAvailability;
        ComposerKt.sourceInformationMarkerStart($composer2, 181445541, "CC(remember):ContextMenu.android.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(coroutineScope);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L47;
    L50:
        Object value$iv3 = (Function2) new ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1(coroutineScope);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L51:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function1<ContextMenuScope, Unit> r7 = TextFieldSelectionState_androidKt.contextMenuBuilder(selectionState, state, r6, (Function2) it$iv3);
        ComposerKt.sourceInformationMarkerStart($composer2, 181464677, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L55;
        Object value$iv4 = (Function0) new ContextMenu_androidKt$ContextMenuArea$4$1(state);
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L55:
        Function0 r9 = (Function0) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 181468597, "CC(remember):ContextMenu.android.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(coroutineScope) | $composer2.changedInstance(selectionState);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L58;
    L61:
        Object value$iv5 = (Function0) new ContextMenu_androidKt$ContextMenuArea$5$1(coroutineScope, menuItemsAvailability, selectionState);
        $composer2.updateRememberedValue(value$iv5);
        it$iv5 = value$iv5;
    L62:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r5 = enabled;
        ContextMenuArea_androidKt.ContextMenuArea(state, r9, r7, null, r5, (Function0) it$iv5, r21, $composer2, ((($dirty2 << 9) & 57344) | 54) | (($dirty2 << 12) & 3670016), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
        goto L66
    L58:
        if (it$iv5 != Composer.Companion.getEmpty()) goto L62;
    L47:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L51;
    L26:
        r2 = false;
        goto L28
    L19:
        if ($composer2.changedInstance(r21) == false) goto L21;
        int r8 = 256;
    L22:
        $dirty = $dirty | r8;
        goto L23
    L21:
        r8 = 128;
        goto L22
    }

    public static final void ContextMenuArea(final SelectionManager manager, Function2<? super Composer, ? super Integer, Unit> r12, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(605522716);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuArea)P(1)104@4185L31,107@4321L17,105@4261L180:ContextMenu.android.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(manager) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r12) == false) goto L14;
        int r2 = 32;
    L15:
        $dirty = $dirty | r2;
        goto L17
    L14:
        r2 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r3 = true;
    L21:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L23;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r12;
        $composer2.skipToGroupEnd();
    L37:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L41;
        r13.updateScope(new AnonymousClass8(manager, r7, $changed));
        return;
    L41:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(605522716, $dirty, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer2, 181479859, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L29;
        Object value$iv = new ContextMenuState(null, 1, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        final ContextMenuState state = (ContextMenuState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 181484197, "CC(remember):ContextMenu.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L33;
        Object value$iv2 = (Function0) new ContextMenu_androidKt$ContextMenuArea$7$1(state);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r7 = r12;
        ContextMenuArea_androidKt.ContextMenuArea(state, (Function0) it$iv2, SelectionManager_androidKt.contextMenuBuilder(manager, state), null, false, null, r7, $composer2, (($dirty << 15) & 3670016) | 54, 56);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
        goto L37
    L19:
        r3 = false;
        goto L21
    }

    public static final void TextItem(ContextMenuScope $this$TextItem, final ContextMenuState state, TextContextMenuItems label, boolean enabled, final Function0<Unit> r14) {
        if (enabled == false) goto L6;
        ContextMenuScope.item$default($this$TextItem, new AnonymousClass1(label), null, false, null, new AnonymousClass2(r14, state), 14, null);
        return;
    }

    public static final Object getContextMenuItemsAvailability(TextFieldSelectionState $this$getContextMenuItemsAvailability, Continuation<? super MenuItemsAvailability> r8) {
        if ((r8 instanceof C03471) == false) goto L7;
        C03471 r0 = (C03471) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        boolean r7 = r0.Z$0;
        TextFieldSelectionState $this$getContextMenuItemsAvailability2 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r4 = $result;
    L18:
        return MenuItemsAvailability.m1107boximpl(MenuItemsAvailability.m1109constructorimpl(r7, ((Boolean) r4).booleanValue(), $this$getContextMenuItemsAvailability2.canCut(), $this$getContextMenuItemsAvailability2.canSelectAll(), $this$getContextMenuItemsAvailability2.canAutofill()));
    L13:
        ResultKt.throwOnFailure($result);
        boolean r3 = $this$getContextMenuItemsAvailability.canCopy();
        r0.L$0 = $this$getContextMenuItemsAvailability;
        r0.Z$0 = r3;
        r0.label = 1;
        r4 = $this$getContextMenuItemsAvailability.canPaste(r0);
        if (r4 != r2) goto L16;
        return r2;
    L16:
        $this$getContextMenuItemsAvailability2 = $this$getContextMenuItemsAvailability;
        r7 = r3;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03471(r8);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    public static final Object getContextMenuItemsAvailability(TextFieldSelectionManager r10, Continuation<? super MenuItemsAvailability> r11) {
        if ((r11 instanceof C03482) == false) goto L7;
        C03482 r0 = (C03482) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r1 = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r4 = false;
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        int r12 = r0.I$2;
        int r3 = r0.I$1;
        int r5 = r0.I$0;
        TextFieldSelectionManager r6 = (TextFieldSelectionManager) r0.L$0;
        ResultKt.throwOnFailure(r1);
        Object r8 = r1;
        ?? r7 = r5;
    L26:
        ClipEntry r9 = (ClipEntry) r8;
        if (r9 != null) goto L29;
        int r13 = r12;
        int r14 = r3;
        ?? r15 = r7;
    L33:
        boolean r16 = false;
        ?? r17 = r15;
        int r18 = r13;
    L34:
        if (r16 == false) goto L36;
        boolean r19 = true;
        ?? r20 = r17;
        ?? r21 = r18;
    L37:
        if (r14 != 0) goto L39;
    L42:
        boolean r110 = false;
    L44:
        if (TextRange.m6413getLengthimpl(r6.getValue$foundation_release().m6665getSelectiond9O1mEE()) == r6.getValue$foundation_release().getText().length()) goto L46;
        boolean r22 = true;
    L48:
        if (r6.getEditable() == false) goto L53;
        if (TextRange.m6411getCollapsedimpl(r6.getValue$foundation_release().m6665getSelectiond9O1mEE()) == false) goto L53;
        r4 = true;
    L53:
        return MenuItemsAvailability.m1107boximpl(MenuItemsAvailability.m1109constructorimpl(r21, r19, r110, r22, r4));
    L46:
        r22 = false;
        goto L48
    L39:
        if (r6.getEditable() == false) goto L42;
        if (r20 != 0) goto L42;
        r110 = true;
    L36:
        r19 = false;
        r20 = r17;
        r21 = r18;
        goto L37
    L29:
        if (ClipboardUtils_androidKt.hasText(r9) != true) goto L31;
        r18 = r12;
        r14 = r3;
        r16 = true;
        r17 = r7;
        goto L34
    L31:
        r18 = r12;
        r14 = r3;
        r16 = false;
        r17 = r7;
        goto L34
    L13:
        ResultKt.throwOnFailure(r1);
        r6 = r10;
        r17 = r6.getVisualTransformation$foundation_release() instanceof PasswordVisualTransformation;
        r14 = !TextRange.m6411getCollapsedimpl(r6.getValue$foundation_release().m6665getSelectiond9O1mEE()) ? 1 : 0;
        if (r14 == 0) goto L17;
        if (r17 != 0) goto L17;
        r18 = 1;
    L19:
        if (r6.getEditable() == false) goto L36;
        Clipboard r23 = r6.getClipboard$foundation_release();
        r15 = r17;
        r13 = r18;
        if (r23 == null) goto L33;
        r0.L$0 = r6;
        r0.I$0 = r17;
        r0.I$1 = r14;
        r0.I$2 = r18 == true ? 1 : 0;
        r0.label = 1;
        r8 = r23.getClipEntry(r0);
        if (r8 != r2) goto L25;
        return r2;
    L25:
        r3 = r14;
        r12 = r18 == true ? 1 : 0;
        r7 = r17;
    L17:
        r18 = 0;
        goto L19
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03482(r11);
        goto L8
    }
}
