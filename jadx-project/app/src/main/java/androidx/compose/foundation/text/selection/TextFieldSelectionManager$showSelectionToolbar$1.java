package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", i = {0, 0}, l = {781}, m = "invokeSuspend", n = {"copy", "cut"}, s = {"L$0", "L$1"})
final class TextFieldSelectionManager$showSelectionToolbar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$showSelectionToolbar$1(TextFieldSelectionManager r2, Continuation<? super TextFieldSelectionManager$showSelectionToolbar$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new TextFieldSelectionManager$showSelectionToolbar$1(this.this$0, r4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((TextFieldSelectionManager$showSelectionToolbar$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r2 = true;
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Function0<Unit> r1 = (Function0) this.L$1;
        Function0<Unit> r3 = (Function0) this.L$0;
        ResultKt.throwOnFailure($result);
        Function0<Unit> r5 = r3;
        Function0<Unit> r4 = r1;
    L37:
        ClipEntry r13 = (ClipEntry) $result;
        if (r13 == null) goto L44;
        if (ClipboardUtils_androidKt.hasText(r13) == true) goto L45;
        r2 = false;
    L45:
        if (r2 == false) goto L47;
        final TextFieldSelectionManager r6 = this.this$0;
        Function0<Unit> r7 = new TextFieldSelectionManager$showSelectionToolbar$1$paste$1(r6);
        Function0<Unit> r9 = r4;
        Function0<Unit> r8 = r5;
    L48:
        Function0<Unit> r10 = r7;
        if (TextRange.m6413getLengthimpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE()) == this.this$0.getValue$foundation_release().getText().length()) goto L51;
        final TextFieldSelectionManager r11 = this.this$0;
        Function0<Unit> r12 = new TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1(r11);
    L53:
        if (this.this$0.getEditable() == true) goto L55;
    L57:
        Function0<Unit> r14 = null;
    L58:
        TextToolbar r15 = this.this$0.getTextToolbar();
        if (r15 == null) goto L62;
        r15.showMenu(TextFieldSelectionManager.access$getContentRect(this.this$0), r8, r10, r9, r12, r14);
    L62:
        return Unit.INSTANCE;
    L55:
        if (TextRange.m6411getCollapsedimpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE()) == false) goto L57;
        final TextFieldSelectionManager r16 = this.this$0;
        r14 = new TextFieldSelectionManager$showSelectionToolbar$1$autofill$1(r16);
        goto L58
    L51:
        r12 = null;
    L47:
        r7 = null;
        r9 = r4;
        r8 = r5;
    L44:
        r2 = false;
        goto L45
    L7:
        ResultKt.throwOnFailure($result);
        if (this.this$0.getEnabled() == false) goto L64;
        LegacyTextFieldState r17 = this.this$0.getState$foundation_release();
        if (r17 != null) goto L12;
    L14:
        boolean r18 = false;
    L15:
        if (r18 == true) goto L64;
        boolean isPassword = this.this$0.getVisualTransformation$foundation_release() instanceof PasswordVisualTransformation;
        if (TextRange.m6411getCollapsedimpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE()) == true) goto L21;
        if (isPassword == true) goto L21;
        final TextFieldSelectionManager r19 = this.this$0;
        r5 = new TextFieldSelectionManager$showSelectionToolbar$1$copy$1(r19);
    L23:
        if (TextRange.m6411getCollapsedimpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE()) == false) goto L25;
    L28:
        r4 = null;
    L30:
        if (this.this$0.getEditable() == false) goto L47;
        Clipboard r20 = this.this$0.getClipboard$foundation_release();
        if (r20 == null) goto L44;
        this.L$0 = r5;
        this.L$1 = r4;
        this.label = 1;
        Object r21 = r20.getClipEntry(this);
        if (r21 != r0) goto L36;
        return r0;
    L36:
        $result = r21;
        goto L37
    L25:
        if (this.this$0.getEditable() == false) goto L28;
        if (isPassword == true) goto L28;
        final TextFieldSelectionManager r22 = this.this$0;
        r4 = new TextFieldSelectionManager$showSelectionToolbar$1$cut$1(r22);
    L21:
        r5 = null;
        goto L23
    L12:
        if (r17.isInTouchMode() == true) goto L14;
        r18 = true;
    L64:
        return Unit.INSTANCE;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
