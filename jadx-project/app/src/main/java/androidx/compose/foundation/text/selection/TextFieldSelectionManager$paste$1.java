package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
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
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    TextFieldSelectionManager$paste$1(TextFieldSelectionManager r2, Continuation<? super TextFieldSelectionManager$paste$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new TextFieldSelectionManager$paste$1(this.this$0, r4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((TextFieldSelectionManager$paste$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
    L13:
        ClipEntry r5 = (ClipEntry) $result;
        if (r5 == null) goto L25;
        AnnotatedString text = ClipboardUtils_androidKt.readAnnotatedString(r5);
        if (text == null) goto L25;
        AnnotatedString r1 = TextFieldValueKt.getTextBeforeSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()));
        int newCursorOffset = TextRange.m6415getMinimpl(this.this$0.getValue$foundation_release().m6665getSelectiond9O1mEE()) + text.length();
        TextFieldValue newValue = TextFieldSelectionManager.m1494access$createTextFieldValueFDrldGo(this.this$0, r1, TextRangeKt.TextRange(newCursorOffset, newCursorOffset));
        this.this$0.getOnValueChange$foundation_release().invoke(newValue);
        TextFieldSelectionManager.access$setHandleState(this.this$0, HandleState.None);
        UndoManager r6 = this.this$0.getUndoManager();
        if (r6 == null) goto L22;
        r6.forceNextSnapshot();
    L22:
        return Unit.INSTANCE;
    L25:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        Clipboard r2 = this.this$0.getClipboard$foundation_release();
        if (r2 == null) goto L25;
        this.label = 1;
        Object r3 = r2.getClipEntry(this);
        if (r3 != r0) goto L12;
        return r0;
    L12:
        $result = r3;
        goto L13
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
