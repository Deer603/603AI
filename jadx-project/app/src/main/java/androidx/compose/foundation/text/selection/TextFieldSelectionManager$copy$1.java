package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$copy$1(TextFieldSelectionManager r2, boolean r3, Continuation<? super TextFieldSelectionManager$copy$1> r4) {
        this.this$0 = r2;
        this.$cancelSelection = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((TextFieldSelectionManager$copy$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L17:
        if (this.$cancelSelection == false) goto L19;
        int newCursorOffset = TextRange.m6414getMaximpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE());
        TextFieldValue newValue = TextFieldSelectionManager.m1494access$createTextFieldValueFDrldGo(this.this$0, this.this$0.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(newCursorOffset, newCursorOffset));
        this.this$0.getOnValueChange$foundation_release().invoke(newValue);
        TextFieldSelectionManager.access$setHandleState(this.this$0, HandleState.None);
        return Unit.INSTANCE;
    L19:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        if (TextRange.m6411getCollapsedimpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE()) == true) goto L10;
        Clipboard r1 = this.this$0.getClipboard$foundation_release();
        if (r1 == null) goto L17;
        this.label = 1;
        if (r1.setClipEntry(ClipboardUtils_androidKt.toClipEntry(TextFieldValueKt.getSelectedText(this.this$0.getValue$foundation_release())), this) != r0) goto L17;
        return r0;
    L10:
        return Unit.INSTANCE;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
