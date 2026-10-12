package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextUndoOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"redo", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "op", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "undo", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextUndoOperationKt {
    public static final void undo(TextFieldState $this$undo, TextUndoOperation op) {
        $this$undo.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$undo_u24lambda_u240 = $this$undo.getMainBuffer$foundation_release();
        $this$undo_u24lambda_u240.replace(op.getIndex(), op.getIndex() + op.getPostText().length(), op.getPreText());
        TextFieldBufferKt.setSelectionCoerced($this$undo_u24lambda_u240, TextRange.m6417getStartimpl(op.m1382getPreSelectiond9O1mEE()), TextRange.m6412getEndimpl(op.m1382getPreSelectiond9O1mEE()));
        TextFieldCharSequence afterEditValue$iv = TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default($this$undo.getMainBuffer$foundation_release(), 0, null, null, 7, null);
        TextFieldState.access$updateValueAndNotifyListeners($this$undo, $this$undo.getValue$foundation_release(), afterEditValue$iv, true);
    }

    public static final void redo(TextFieldState $this$redo, TextUndoOperation op) {
        $this$redo.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$redo_u24lambda_u241 = $this$redo.getMainBuffer$foundation_release();
        $this$redo_u24lambda_u241.replace(op.getIndex(), op.getIndex() + op.getPreText().length(), op.getPostText());
        TextFieldBufferKt.setSelectionCoerced($this$redo_u24lambda_u241, TextRange.m6417getStartimpl(op.m1381getPostSelectiond9O1mEE()), TextRange.m6412getEndimpl(op.m1381getPostSelectiond9O1mEE()));
        TextFieldCharSequence afterEditValue$iv = TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default($this$redo.getMainBuffer$foundation_release(), 0, null, null, 7, null);
        TextFieldState.access$updateValueAndNotifyListeners($this$redo, $this$redo.getValue$foundation_release(), afterEditValue$iv, true);
    }
}
