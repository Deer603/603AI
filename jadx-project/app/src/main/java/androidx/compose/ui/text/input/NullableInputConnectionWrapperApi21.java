package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: NullableInputConnectionWrapper.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0006\u0010\u001f\u001a\u00020\u0006J\b\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010%2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010,\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010-\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010.2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u00101\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u001a\u00104\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "delegate", "Landroid/view/inputmethod/InputConnection;", "onConnectionClosed", "Lkotlin/Function1;", "", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "getDelegate", "()Landroid/view/inputmethod/InputConnection;", "beginBatchEdit", "", "clearMetaKeyStates", "p0", "", "closeConnection", "closeDelegate", "commitCompletion", "Landroid/view/inputmethod/CompletionInfo;", "commitContent", "Landroid/view/inputmethod/InputContentInfo;", "p1", "p2", "Landroid/os/Bundle;", "commitCorrection", "Landroid/view/inputmethod/CorrectionInfo;", "commitText", "", "deleteSurroundingText", "deleteSurroundingTextInCodePoints", "disposeDelegate", "endBatchEdit", "finishComposingText", "getCursorCapsMode", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroid/view/inputmethod/ExtractedTextRequest;", "getHandler", "Landroid/os/Handler;", "getSelectedText", "getTextAfterCursor", "getTextBeforeCursor", "performContextMenuAction", "performEditorAction", "performPrivateCommand", "", "reportFullscreenMode", "requestCursorUpdates", "sendKeyEvent", "Landroid/view/KeyEvent;", "setComposingRegion", "setComposingText", "setSelection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {
    private InputConnection delegate;
    private final Function1<NullableInputConnectionWrapper, Unit> onConnectionClosed;

    /* JADX WARN: Multi-variable type inference failed */
    public NullableInputConnectionWrapperApi21(InputConnection delegate, Function1<? super NullableInputConnectionWrapper, Unit> r2) {
        this.onConnectionClosed = r2;
        this.delegate = delegate;
    }

    protected final InputConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        InputConnection it = this.delegate;
        if (it == null) goto L6;
        closeDelegate(it);
        this.delegate = null;
        return;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.delegate == null) goto L6;
        disposeDelegate();
        this.onConnectionClosed.invoke(this);
        return;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getTextBeforeCursor(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getTextAfterCursor(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getSelectedText(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.getCursorCapsMode(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getExtractedText(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.deleteSurroundingText(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.setComposingText(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.setComposingRegion(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.finishComposingText();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.commitText(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.commitCompletion(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.commitCorrection(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int p0, int p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.setSelection(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.performEditorAction(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.performContextMenuAction(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.sendKeyEvent(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.clearMetaKeyStates(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.reportFullscreenMode(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String p0, Bundle p1) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.performPrivateCommand(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int p0) {
        InputConnection r0 = this.delegate;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.requestCursorUpdates(p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
        return false;
    }

    protected void closeDelegate(InputConnection delegate) {
    }
}
