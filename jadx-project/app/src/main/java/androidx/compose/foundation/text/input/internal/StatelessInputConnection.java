package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: StatelessInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010 H\u0016J\"\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\bH\u0016J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0016J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0016J\b\u00101\u001a\u00020\u001aH\u0016J\b\u00102\u001a\u00020\u001aH\u0002J\b\u00103\u001a\u00020\u001aH\u0016J\u0010\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0016J\u001a\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010$\u001a\u00020\bH\u0016J\n\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010+2\u0006\u0010$\u001a\u00020\bH\u0016J\u0018\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0016J\u0018\u0010?\u001a\u00020+2\u0006\u0010>\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\bH\u0016J\u0010\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\bH\u0016J$\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u001c\u0010N\u001a\u00020\u001a2\b\u0010O\u001a\u0004\u0018\u00010B2\b\u0010P\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010Q\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0010\u0010U\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020\u001aH\u0016J\u0010\u0010W\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\bH\u0016J\u0010\u0010Y\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010\\\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\bH\u0002J\u0018\u0010^\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020\b2\u0006\u0010`\u001a\u00020\bH\u0016J\u001a\u0010a\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\bH\u0016J\u0018\u0010b\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020\b2\u0006\u0010`\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR%\u0010\f\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "session", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/EditorInfo;)V", "batchDepth", "", "commitContentDelegateInputConnection", "getCommitContentDelegateInputConnection$annotations", "()V", "editCommands", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "Lkotlin/ExtensionFunctionType;", "terminalInputConnection", "androidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "text", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "beginBatchEdit", "", "beginBatchEditInternal", "clearMetaKeyStates", "states", "closeConnection", "commitCompletion", "Landroid/view/inputmethod/CompletionInfo;", "commitContent", "inputContentInfo", "Landroid/view/inputmethod/InputContentInfo;", "flags", "opts", "Landroid/os/Bundle;", "commitCorrection", "correctionInfo", "Landroid/view/inputmethod/CorrectionInfo;", "commitText", "", "newCursorPosition", "deleteSurroundingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "finishComposingText", "getCursorCapsMode", "reqModes", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", "request", "Landroid/view/inputmethod/ExtractedTextRequest;", "getHandler", "Landroid/os/Handler;", "getSelectedText", "getTextAfterCursor", "maxChars", "getTextBeforeCursor", "logDebug", "message", "", "performContextMenuAction", "id", "performEditorAction", "editorAction", "performHandwritingGesture", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "executor", "Ljava/util/concurrent/Executor;", "consumer", "Ljava/util/function/IntConsumer;", "performPrivateCommand", "action", "data", "previewHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "reportFullscreenMode", "enabled", "requestCursorUpdates", "cursorUpdateMode", "sendKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "sendSynthesizedKeyEvent", "code", "setComposingRegion", "start", "end", "setComposingText", "setSelection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 0;
    private int batchDepth;
    private final InputConnection commitContentDelegateInputConnection;
    private final MutableVector<Function1<ImeEditCommandScope, Unit>> editCommands;
    private final TextInputSession session;
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    static {
        $stable = 8;
    }

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(TextInputSession session, EditorInfo editorInfo) {
        this.session = session;
        this.editCommands = new MutableVector(new Function1[16], 0);
        this.terminalInputConnection = new StatelessInputConnection$terminalInputConnection$1(this);
        this.commitContentDelegateInputConnection = InputConnectionCompat.createWrapper(this.terminalInputConnection, editorInfo, new StatelessInputConnection$commitContentDelegateInputConnection$1(this));
    }

    public static final /* synthetic */ TextInputSession access$getSession$p(StatelessInputConnection $this) {
        return $this.session;
    }

    public static final /* synthetic */ void access$logDebug(StatelessInputConnection $this, String message) {
        $this.logDebug(message);
    }

    private final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    private final boolean beginBatchEditInternal() {
        return this.session.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        return this.session.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        logDebug("commitText(\"" + text + "\", " + newCursorPosition + ')');
        if (text != null) goto L5;
        return true;
    L5:
        ImeEditCommand_androidKt.commitText(this.session, text.toString(), newCursorPosition);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        logDebug("setComposingRegion(" + start + ", " + end + ')');
        ImeEditCommand_androidKt.setComposingRegion(this.session, start, end);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        logDebug("setComposingText(\"" + text + "\", " + newCursorPosition + ')');
        if (text != null) goto L5;
        return true;
    L5:
        TextInputSession r1 = this.session;
        String r2 = text.toString();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> r4 = null;
        if ((text instanceof Spanned) == false) goto L8;
        Spanned r3 = (Spanned) text;
    L9:
        if (r3 == null) goto L11;
        r4 = StatelessInputConnection_androidKt.toAnnotationList(r3);
    L11:
        ImeEditCommand_androidKt.setComposingText(r1, r2, newCursorPosition, r4);
        return true;
    L8:
        r3 = null;
        goto L9
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        logDebug("deleteSurroundingTextInCodePoints(" + beforeLength + ", " + afterLength + ')');
        ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints(this.session, beforeLength, afterLength);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        logDebug("deleteSurroundingText(" + beforeLength + ", " + afterLength + ')');
        ImeEditCommand_androidKt.deleteSurroundingText(this.session, beforeLength, afterLength);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        logDebug("setSelection(" + start + ", " + end + ')');
        ImeEditCommand_androidKt.setSelection(this.session, start, end);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        ImeEditCommand_androidKt.finishComposingText(this.session);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        logDebug("sendKeyEvent(" + event + ')');
        this.session.sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        String result = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), maxChars).toString();
        logDebug("getTextBeforeCursor(" + maxChars + ", " + flags + "): " + result);
        return result;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        String result = TextFieldCharSequenceKt.getTextAfterSelection(getText(), maxChars).toString();
        logDebug("getTextAfterCursor(" + maxChars + ", " + flags + "): " + result);
        return result;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (TextRange.m6411getCollapsedimpl(getText().m1188getSelectiond9O1mEE()) == false) goto L5;
        CharSequence result = null;
    L6:
        logDebug("getSelectedText(" + flags + "): " + result);
        return result;
    L5:
        result = TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        goto L6
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        logDebug("requestCursorUpdates(" + cursorUpdateMode + ')');
        this.session.requestCursorUpdates(cursorUpdateMode);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        logDebug("performHandwritingGesture(" + gesture + ", " + executor + ", " + consumer + ')');
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        return;
    L5:
        Api34PerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.session, gesture, executor, consumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + gesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT >= 34) goto L7;
        return false;
    L7:
        return Api34PerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.session, gesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        logDebug("getExtractedText(" + request + ", " + flags + ')');
        return StatelessInputConnection_androidKt.access$toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        logDebug("getCursorCapsMode(" + reqModes + ')');
        return TextUtils.getCapsMode(getText(), TextRange.m6415getMinimpl(getText().m1188getSelectiond9O1mEE()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        logDebug("performContextMenuAction(" + id + ')');
        switch(id) {
            case 16908319: goto L8;
            case 16908320: goto L7;
            case 16908321: goto L6;
            case 16908322: goto L5;
            default: goto L9;
        };
    L5:
        sendSynthesizedKeyEvent(279);
        goto L9
    L6:
        sendSynthesizedKeyEvent(278);
        goto L9
    L7:
        sendSynthesizedKeyEvent(277);
        goto L9
    L8:
        ImeEditCommand_androidKt.setSelection(this.session, 0, getText().length());
    L9:
        return false;
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        logDebug("performEditorAction(" + editorAction + ')');
        switch(editorAction) {
            case 0: goto L11;
            case 1: goto L4;
            case 2: goto L10;
            case 3: goto L9;
            case 4: goto L8;
            case 5: goto L7;
            case 6: goto L6;
            case 7: goto L5;
            default: goto L4;
        };
    L4:
        logDebug("IME sent an unrecognized editor action: " + editorAction);
        int imeAction = ImeAction.Companion.m6596getDefaulteUduSuo();
    L12:
        this.session.mo1218onImeActionKlQnJC8(imeAction);
        return true;
    L5:
        imeAction = ImeAction.Companion.m6601getPreviouseUduSuo();
        goto L12
    L6:
        imeAction = ImeAction.Companion.m6597getDoneeUduSuo();
        goto L12
    L7:
        imeAction = ImeAction.Companion.m6599getNexteUduSuo();
        goto L12
    L8:
        imeAction = ImeAction.Companion.m6603getSendeUduSuo();
        goto L12
    L9:
        imeAction = ImeAction.Companion.m6602getSearcheUduSuo();
        goto L12
    L10:
        imeAction = ImeAction.Companion.m6598getGoeUduSuo();
        goto L12
    L11:
        imeAction = ImeAction.Companion.m6596getDefaulteUduSuo();
        goto L12
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        StringBuilder r0 = new StringBuilder().append("commitCompletion(");
        if (text == null) goto L5;
        CharSequence r1 = text.getText();
    L6:
        logDebug(r0.append(r1).append(')').toString());
        return false;
    L5:
        r1 = null;
        goto L6
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        logDebug("clearMetaKeyStates(" + states + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        logDebug("reportFullscreenMode(" + enabled + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        logDebug("performPrivateCommand(" + action + ", " + data + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(action, data);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        logDebug("commitContent(" + inputContentInfo + ", " + flags + ", " + opts + ')');
        return Api25CommitContentImpl.INSTANCE.commitContent(this.commitContentDelegateInputConnection, inputContentInfo, flags, opts);
    }

    private final void logDebug(String message) {
    }
}
