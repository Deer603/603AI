package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "amount", "", "(I)V", "getAmount", "()I", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    static {
    }

    public MoveCursorCommand(int amount) {
        this.amount = amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer buffer) {
        if (buffer.getCursor$ui_text_release() != (-1)) goto L5;
        buffer.setCursor$ui_text_release(buffer.getSelectionStart$ui_text_release());
    L5:
        int newCursor = buffer.getSelectionStart$ui_text_release();
        String bufferText = buffer.toString();
        int r3 = this.amount;
        int r4 = this.amount;
        if (r3 <= 0) goto L12;
        int i = 0;
    L8:
        if (i >= r4) goto L17;
        int next = JvmCharHelpers_androidKt.findFollowingBreak(bufferText, newCursor);
        if (next == (-1)) goto L17;
        newCursor = next;
        i = i + 1;
    L17:
        buffer.setCursor$ui_text_release(newCursor);
        return;
    L12:
        int i2 = 0;
        int r5 = -r4;
    L13:
        if (i2 >= r5) goto L17;
        int prev = JvmCharHelpers_androidKt.findPrecedingBreak(bufferText, newCursor);
        if (prev == (-1)) goto L17;
        newCursor = prev;
        i2 = i2 + 1;
        goto L13
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof MoveCursorCommand) == true) goto L9;
        return false;
    L9:
        if (this.amount == ((MoveCursorCommand) other).amount) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
