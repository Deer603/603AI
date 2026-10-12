package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "lengthBeforeCursor", "", "lengthAfterCursor", "(II)V", "getLengthAfterCursor", "()I", "getLengthBeforeCursor", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    static {
    }

    public DeleteSurroundingTextCommand(int lengthBeforeCursor, int lengthAfterCursor) {
        this.lengthBeforeCursor = lengthBeforeCursor;
        this.lengthAfterCursor = lengthAfterCursor;
        if (this.lengthBeforeCursor >= 0) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L13;
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + this.lengthBeforeCursor + " and " + this.lengthAfterCursor + " respectively.");
        return;
    L13:
        return;
    L5:
        if (this.lengthAfterCursor < 0) goto L7;
        value$iv = true;
        goto L9
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer buffer) {
        int $this$addExactOrElse$iv = buffer.getSelectionEnd$ui_text_release();
        int right$iv = this.lengthAfterCursor;
        int result$iv = $this$addExactOrElse$iv + right$iv;
        if ((($this$addExactOrElse$iv ^ result$iv) & (right$iv ^ result$iv)) >= 0) goto L5;
        result$iv = buffer.getLength$ui_text_release();
    L5:
        buffer.delete$ui_text_release(buffer.getSelectionEnd$ui_text_release(), Math.min(result$iv, buffer.getLength$ui_text_release()));
        int $this$subtractExactOrElse$iv = buffer.getSelectionStart$ui_text_release();
        int right$iv2 = this.lengthBeforeCursor;
        int result$iv2 = $this$subtractExactOrElse$iv - right$iv2;
        if ((($this$subtractExactOrElse$iv ^ right$iv2) & ($this$subtractExactOrElse$iv ^ result$iv2)) >= 0) goto L8;
        result$iv2 = 0;
    L8:
        buffer.delete$ui_text_release(Math.max(0, result$iv2), buffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof DeleteSurroundingTextCommand) == true) goto L9;
        return false;
    L9:
        if (this.lengthBeforeCursor == ((DeleteSurroundingTextCommand) other).lengthBeforeCursor) goto L12;
        return false;
    L12:
        if (this.lengthAfterCursor == ((DeleteSurroundingTextCommand) other).lengthAfterCursor) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = this.lengthBeforeCursor;
        return (result * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
