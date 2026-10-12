package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "text", "", "newCursorPosition", "", "(Ljava/lang/String;I)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getNewCursorPosition", "()I", "getText", "()Ljava/lang/String;", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SetComposingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    static {
    }

    public SetComposingTextCommand(AnnotatedString annotatedString, int newCursorPosition) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = newCursorPosition;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetComposingTextCommand(String r4, int r5) {
        this(new AnnotatedString(r4, null, 2, 0 == true ? 1 : 0), r5);
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer buffer) {
        if (buffer.hasComposition$ui_text_release() == false) goto L10;
        int compositionStart = buffer.getCompositionStart$ui_text_release();
        buffer.replace$ui_text_release(buffer.getCompositionStart$ui_text_release(), buffer.getCompositionEnd$ui_text_release(), getText());
        if (getText().length() <= 0) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L16;
        buffer.setComposition$ui_text_release(compositionStart, getText().length() + compositionStart);
    L16:
        int newCursor = buffer.getCursor$ui_text_release();
        int r4 = this.newCursorPosition;
        int r5 = this.newCursorPosition;
        if (r4 <= 0) goto L19;
        int newCursorInBuffer = (r5 + newCursor) - 1;
    L20:
        buffer.setCursor$ui_text_release(RangesKt.coerceIn(newCursorInBuffer, 0, buffer.getLength$ui_text_release()));
        return;
    L19:
        newCursorInBuffer = (r5 + newCursor) - getText().length();
        goto L20
    L7:
        r3 = false;
        goto L8
    L10:
        int selectionStart = buffer.getSelectionStart$ui_text_release();
        buffer.replace$ui_text_release(buffer.getSelectionStart$ui_text_release(), buffer.getSelectionEnd$ui_text_release(), getText());
        if (getText().length() <= 0) goto L13;
        boolean r6 = true;
    L14:
        if (r6 == false) goto L16;
        buffer.setComposition$ui_text_release(selectionStart, getText().length() + selectionStart);
        goto L16
    L13:
        r6 = false;
        goto L14
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SetComposingTextCommand) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(getText(), ((SetComposingTextCommand) other).getText()) == true) goto L12;
        return false;
    L12:
        if (this.newCursorPosition == ((SetComposingTextCommand) other).newCursorPosition) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = getText().hashCode();
        return (result * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }
}
