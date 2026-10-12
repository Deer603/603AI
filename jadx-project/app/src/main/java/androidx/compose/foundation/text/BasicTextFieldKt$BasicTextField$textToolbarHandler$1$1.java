package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "hideTextToolbar", "", "showTextToolbar", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ TextToolbar $currentTextToolbar;

    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar $currentTextToolbar, CoroutineScope $coroutineScope) {
        this.$currentTextToolbar = $currentTextToolbar;
        this.$coroutineScope = $coroutineScope;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public Object showTextToolbar(TextFieldSelectionState selectionState, Rect r20, Continuation<? super Unit> r21) {
        if ((r21 instanceof BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) == false) goto L7;
        BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 r1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) r21;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        TextToolbar r5 = (TextToolbar) r1.L$5;
        Rect r7 = (Rect) r1.L$4;
        Function0<Unit> r8 = (Function0) r1.L$3;
        TextFieldSelectionState $this$menuItem$iv = (TextFieldSelectionState) r1.L$2;
        final TextFieldSelectionState $this$showTextToolbar_u24lambda_u245 = (TextFieldSelectionState) r1.L$1;
        final CoroutineScope r11 = (CoroutineScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        TextToolbar r9 = r5;
        final TextFieldSelectionState $this$menuItem$iv2 = $this$menuItem$iv;
        Function0<Unit> r10 = r8;
        Rect r12 = r7;
        Object r13 = $result;
    L21:
        boolean enabled$iv = ((Boolean) r13).booleanValue();
        final TextToolbarState desiredState$iv = TextToolbarState.None;
        if (enabled$iv == true) goto L24;
        Function0<Unit> r14 = null;
    L25:
        boolean enabled$iv2 = $this$showTextToolbar_u24lambda_u245.canCut();
        final TextToolbarState desiredState$iv2 = TextToolbarState.None;
        final TextFieldSelectionState $this$menuItem$iv3 = $this$showTextToolbar_u24lambda_u245;
        if (enabled$iv2 == true) goto L28;
        Function0<Unit> r15 = null;
    L29:
        boolean enabled$iv3 = $this$showTextToolbar_u24lambda_u245.canSelectAll();
        final TextToolbarState desiredState$iv3 = TextToolbarState.Selection;
        final TextFieldSelectionState $this$menuItem$iv4 = $this$showTextToolbar_u24lambda_u245;
        if (enabled$iv3 == true) goto L32;
        Function0<Unit> r6 = null;
    L33:
        boolean enabled$iv4 = $this$showTextToolbar_u24lambda_u245.canAutofill();
        final TextToolbarState desiredState$iv4 = TextToolbarState.None;
        final TextFieldSelectionState $this$menuItem$iv5 = $this$showTextToolbar_u24lambda_u245;
        if (enabled$iv4 == true) goto L36;
        Function0<Unit> r16 = null;
    L37:
        r9.showMenu(r12, r10, r14, r15, r6, r16);
        return Unit.INSTANCE;
    L36:
        r16 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$5($this$menuItem$iv5, desiredState$iv4, $this$showTextToolbar_u24lambda_u245);
        goto L37
    L32:
        r6 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$4($this$menuItem$iv4, desiredState$iv3, $this$showTextToolbar_u24lambda_u245);
        goto L33
    L28:
        r15 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3($this$menuItem$iv3, desiredState$iv2, r11, $this$showTextToolbar_u24lambda_u245);
        goto L29
    L24:
        r14 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$2($this$menuItem$iv2, desiredState$iv, r11, $this$showTextToolbar_u24lambda_u245);
        goto L25
    L13:
        ResultKt.throwOnFailure($result);
        TextToolbar r17 = this.$currentTextToolbar;
        r11 = this.$coroutineScope;
        $this$showTextToolbar_u24lambda_u245 = selectionState;
        boolean enabled$iv5 = $this$showTextToolbar_u24lambda_u245.canCopy();
        final TextToolbarState desiredState$iv5 = TextToolbarState.None;
        if (enabled$iv5 == true) goto L16;
        Function0<Unit> r18 = null;
    L17:
        r1.L$0 = r11;
        r1.L$1 = $this$showTextToolbar_u24lambda_u245;
        r1.L$2 = $this$showTextToolbar_u24lambda_u245;
        r1.L$3 = r18;
        r1.L$4 = r20;
        r1.L$5 = r17;
        r1.label = 1;
        r13 = $this$showTextToolbar_u24lambda_u245.canPaste(r1);
        if (r13 != r4) goto L20;
        return r4;
    L20:
        $this$menuItem$iv2 = $this$showTextToolbar_u24lambda_u245;
        Function0<Unit> r19 = r18;
        r12 = r20;
        r9 = r17;
        r10 = r19;
        goto L21
    L16:
        r18 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1($this$showTextToolbar_u24lambda_u245, desiredState$iv5, r11, $this$showTextToolbar_u24lambda_u245);
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(this, r21);
        goto L8
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public void hideTextToolbar() {
        if (this.$currentTextToolbar.getStatus() != TextToolbarStatus.Shown) goto L6;
        this.$currentTextToolbar.hide();
        return;
    }
}
