package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ \u0010\u0010\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\bJ\f\u0010\u0019\u001a\u00020\u0011*\u00020\u000fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "generateBatchErrorMessage", "", "failedCommand", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "toStringForLog", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EditProcessor {
    public static final int $stable = 0;
    private EditingBuffer mBuffer;
    private TextFieldValue mBufferState;

    static {
        $stable = 8;
    }

    public EditProcessor() {
        this.mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m6422getZerod9O1mEE(), null, null);
        this.mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m6665getSelectiond9O1mEE(), null);
    }

    public static final /* synthetic */ String access$toStringForLog(EditProcessor $this, EditCommand $receiver) {
        return $this.toStringForLog($receiver);
    }

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final void reset(TextFieldValue newValue, TextInputSession textInputSession) {
        boolean textChanged = false;
        boolean selectionChanged = false;
        boolean compositionChanged = !Intrinsics.areEqual(newValue.m6664getCompositionMzsxiRA(), this.mBuffer.m6577getCompositionMzsxiRA$ui_text_release());
        if (Intrinsics.areEqual(this.mBufferState.getAnnotatedString().getText(), newValue.getAnnotatedString().getText()) == true) goto L6;
        this.mBuffer = new EditingBuffer(newValue.getAnnotatedString(), newValue.m6665getSelectiond9O1mEE(), null);
        textChanged = true;
    L9:
        if (newValue.m6664getCompositionMzsxiRA() != null) goto L12;
        this.mBuffer.commitComposition$ui_text_release();
    L14:
        if (textChanged == true) goto L19;
        if (selectionChanged == true) goto L20;
        if (compositionChanged == true) goto L19;
    L20:
        TextFieldValue oldValue = this.mBufferState;
        this.mBufferState = newValue;
        if (textInputSession == null) goto L24;
        textInputSession.updateState(oldValue, newValue);
        return;
    L24:
        return;
    L19:
        this.mBuffer.commitComposition$ui_text_release();
        newValue = TextFieldValue.m6660copy3r_uNRQ$default(newValue, null, 0, null, 3, null);
        goto L20
    L12:
        if (TextRange.m6411getCollapsedimpl(newValue.m6664getCompositionMzsxiRA().m6421unboximpl()) == true) goto L14;
        this.mBuffer.setComposition$ui_text_release(TextRange.m6415getMinimpl(newValue.m6664getCompositionMzsxiRA().m6421unboximpl()), TextRange.m6414getMaximpl(newValue.m6664getCompositionMzsxiRA().m6421unboximpl()));
        goto L14
    L6:
        if (TextRange.m6410equalsimpl0(this.mBufferState.m6665getSelectiond9O1mEE(), newValue.m6665getSelectiond9O1mEE()) == true) goto L9;
        this.mBuffer.setSelection$ui_text_release(TextRange.m6415getMinimpl(newValue.m6665getSelectiond9O1mEE()), TextRange.m6414getMaximpl(newValue.m6665getSelectiond9O1mEE()));
        selectionChanged = true;
        goto L9
    }

    public final TextFieldValue apply(List<? extends EditCommand> r12) {
        Object lastCommand = null;
        int index$iv = 0;
        int r4 = r12.size();     // Catch: Exception -> L16
    L4:
        if (index$iv >= r4) goto L7;
        Object item$iv = r12.get(index$iv);     // Catch: Exception -> L16
        EditCommand it = (EditCommand) item$iv;     // Catch: Exception -> L16
        lastCommand = it;
        it.applyTo(this.mBuffer);     // Catch: Exception -> L16
        index$iv = index$iv + 1;
        goto L4
    L7:
        AnnotatedString r3 = this.mBuffer.toAnnotatedString$ui_text_release();
        long $this$apply_u24lambda_u242 = this.mBuffer.m6578getSelectiond9O1mEE$ui_text_release();
        TextRange r2 = TextRange.m6405boximpl($this$apply_u24lambda_u242);
        r2.m6421unboximpl();
        if (TextRange.m6416getReversedimpl(this.mBufferState.m6665getSelectiond9O1mEE()) == false) goto L11;
        r2 = null;
    L11:
        if (r2 == null) goto L13;
        long $this$apply_u24lambda_u243 = r2.m6421unboximpl();
    L14:
        TextFieldValue newState = new TextFieldValue(r3, $this$apply_u24lambda_u243, this.mBuffer.m6577getCompositionMzsxiRA$ui_text_release(), null);
        this.mBufferState = newState;
        return newState;
    L13:
        $this$apply_u24lambda_u243 = TextRangeKt.TextRange(TextRange.m6414getMaximpl($this$apply_u24lambda_u242), TextRange.m6415getMinimpl($this$apply_u24lambda_u242));
    L16:
        e = move-exception;
        throw new RuntimeException(generateBatchErrorMessage(r12, (EditCommand) lastCommand), e);
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    private final String generateBatchErrorMessage(List<? extends EditCommand> r17, final EditCommand failedCommand) {
        StringBuilder $this$generateBatchErrorMessage_u24lambda_u243 = new StringBuilder();
        StringBuilder r4 = $this$generateBatchErrorMessage_u24lambda_u243.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m6577getCompositionMzsxiRA$ui_text_release() + ", selection=" + TextRange.m6420toStringimpl(this.mBuffer.m6578getSelectiond9O1mEE$ui_text_release()) + "):");
        Intrinsics.checkNotNullExpressionValue(r4, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r4.append('\n'), "append(...)");
        CollectionsKt.joinTo$default(r17, $this$generateBatchErrorMessage_u24lambda_u243, "\n", null, null, 0, null, new EditProcessor$generateBatchErrorMessage$1$1(failedCommand, this), 60, null);
        String r1 = $this$generateBatchErrorMessage_u24lambda_u243.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    private final String toStringForLog(EditCommand $this$toStringForLog) {
        if (($this$toStringForLog instanceof CommitTextCommand) == false) goto L6;
        return "CommitTextCommand(text.length=" + ((CommitTextCommand) $this$toStringForLog).getText().length() + ", newCursorPosition=" + ((CommitTextCommand) $this$toStringForLog).getNewCursorPosition() + ')';
    L6:
        if (($this$toStringForLog instanceof SetComposingTextCommand) == false) goto L9;
        return "SetComposingTextCommand(text.length=" + ((SetComposingTextCommand) $this$toStringForLog).getText().length() + ", newCursorPosition=" + ((SetComposingTextCommand) $this$toStringForLog).getNewCursorPosition() + ')';
    L9:
        if (($this$toStringForLog instanceof SetComposingRegionCommand) == false) goto L12;
        return $this$toStringForLog.toString();
    L12:
        if (($this$toStringForLog instanceof DeleteSurroundingTextCommand) == false) goto L15;
        return $this$toStringForLog.toString();
    L15:
        if (($this$toStringForLog instanceof DeleteSurroundingTextInCodePointsCommand) == false) goto L18;
        return $this$toStringForLog.toString();
    L18:
        if (($this$toStringForLog instanceof SetSelectionCommand) == false) goto L21;
        return $this$toStringForLog.toString();
    L21:
        if (($this$toStringForLog instanceof FinishComposingTextCommand) == false) goto L24;
        return $this$toStringForLog.toString();
    L24:
        if (($this$toStringForLog instanceof BackspaceCommand) == false) goto L27;
        return $this$toStringForLog.toString();
    L27:
        if (($this$toStringForLog instanceof MoveCursorCommand) == false) goto L30;
        return $this$toStringForLog.toString();
    L30:
        if (($this$toStringForLog instanceof DeleteAllCommand) == true) goto L46;
        StringBuilder r0 = new StringBuilder().append("Unknown EditCommand: ");
        String r1 = Reflection.getOrCreateKotlinClass($this$toStringForLog.getClass()).getSimpleName();
        if (r1 != null) goto L36;
        r1 = "{anonymous EditCommand}";
    L36:
        return r0.append(r1).toString();
    L46:
        return $this$toStringForLog.toString();
    }
}
