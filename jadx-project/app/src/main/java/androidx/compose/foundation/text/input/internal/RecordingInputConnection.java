package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0016H\u0002J\b\u0010*\u001a\u00020\u0007H\u0016J\b\u0010+\u001a\u00020\u0007H\u0002J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0012\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u000101H\u0016J\"\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010;\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u0012H\u0016J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0012H\u0016J\u0018\u0010A\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0012H\u0016J\b\u0010B\u001a\u00020\u0007H\u0016J\b\u0010C\u001a\u00020\u0007H\u0002J\u0017\u0010D\u001a\u00020\u00072\f\u0010E\u001a\b\u0012\u0004\u0012\u00020(0FH\u0082\bJ\b\u0010G\u001a\u00020\u0007H\u0016J\u0010\u0010H\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0016J\u001a\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u00105\u001a\u00020\u0012H\u0016J\n\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0012\u0010P\u001a\u0004\u0018\u00010<2\u0006\u00105\u001a\u00020\u0012H\u0016J\u0018\u0010Q\u001a\u00020<2\u0006\u0010R\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0016J\u0018\u0010S\u001a\u00020<2\u0006\u0010R\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0016J\u0010\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0012H\u0016J\u0010\u0010Y\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0012H\u0016J$\u0010[\u001a\u00020(2\u0006\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u001c\u0010b\u001a\u00020\u00072\b\u0010c\u001a\u0004\u0018\u00010V2\b\u0010d\u001a\u0004\u0018\u000107H\u0016J\u001a\u0010e\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\u0010\u0010i\u001a\u00020\u00072\u0006\u0010j\u001a\u00020\u0007H\u0016J\u0010\u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0012H\u0016J\u0010\u0010m\u001a\u00020\u00072\u0006\u0010n\u001a\u00020oH\u0016J\u0010\u0010p\u001a\u00020(2\u0006\u0010q\u001a\u00020\u0012H\u0002J\u0018\u0010r\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0012H\u0016J\u001a\u0010u\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u0012H\u0016J\u0018\u0010v\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0012H\u0016J\u0016\u0010w\u001a\u00020(2\u0006\u0010x\u001a\u00020\u00032\u0006\u0010y\u001a\u00020zR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006{"}, d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "initState", "Landroidx/compose/ui/text/input/TextFieldValue;", "eventCallback", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "autoCorrect", "", "legacyTextFieldState", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "textFieldSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputEventCallback2;ZLandroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;)V", "getAutoCorrect", "()Z", "batchDepth", "", "currentExtractedTextRequestToken", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "getEventCallback", "()Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "extractedTextMonitorMode", "isActive", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "textFieldValue", "getTextFieldValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setTextFieldValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "addEditCommandWithBatch", "", "editCommand", "beginBatchEdit", "beginBatchEditInternal", "clearMetaKeyStates", "states", "closeConnection", "commitCompletion", "text", "Landroid/view/inputmethod/CompletionInfo;", "commitContent", "inputContentInfo", "Landroid/view/inputmethod/InputContentInfo;", "flags", "opts", "Landroid/os/Bundle;", "commitCorrection", "correctionInfo", "Landroid/view/inputmethod/CorrectionInfo;", "commitText", "", "newCursorPosition", "deleteSurroundingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "ensureActive", "block", "Lkotlin/Function0;", "finishComposingText", "getCursorCapsMode", "reqModes", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", "request", "Landroid/view/inputmethod/ExtractedTextRequest;", "getHandler", "Landroid/os/Handler;", "getSelectedText", "getTextAfterCursor", "maxChars", "getTextBeforeCursor", "logDebug", "message", "", "performContextMenuAction", "id", "performEditorAction", "editorAction", "performHandwritingGesture", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "executor", "Ljava/util/concurrent/Executor;", "consumer", "Ljava/util/function/IntConsumer;", "performPrivateCommand", "action", "data", "previewHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "reportFullscreenMode", "enabled", "requestCursorUpdates", "cursorUpdateMode", "sendKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "sendSynthesizedKeyEvent", "code", "setComposingRegion", "start", "end", "setComposingText", "setSelection", "updateInputState", "state", "inputMethodManager", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 0;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<EditCommand> editCommands;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private final LegacyTextFieldState legacyTextFieldState;
    private final TextFieldSelectionManager textFieldSelectionManager;
    private TextFieldValue textFieldValue;
    private final ViewConfiguration viewConfiguration;

    static {
        $stable = 8;
    }

    public RecordingInputConnection(TextFieldValue initState, InputEventCallback2 eventCallback, boolean autoCorrect, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.eventCallback = eventCallback;
        this.autoCorrect = autoCorrect;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = initState;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue r2, InputEventCallback2 r3, boolean r4, LegacyTextFieldState r5, TextFieldSelectionManager r6, ViewConfiguration r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r8 & 16) == 0) goto L9;
        r6 = null;
    L9:
        if ((r8 & 32) == 0) goto L11;
        ViewConfiguration r10 = null;
    L12:
        this(r2, r3, r4, r5, r6, r10);
        return;
    L11:
        r10 = r7;
        goto L12
    }

    public static final /* synthetic */ void access$addEditCommandWithBatch(RecordingInputConnection $this, EditCommand editCommand) {
        $this.addEditCommandWithBatch(editCommand);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final TextFieldValue getTextFieldValue$foundation_release() {
        return this.textFieldValue;
    }

    public final void setTextFieldValue$foundation_release(TextFieldValue value) {
        this.textFieldValue = value;
    }

    private final boolean ensureActive(Function0<Unit> r5) {
        boolean applying = this.isActive;
        if (applying == false) goto L6;
        r5.invoke();
    L6:
        return applying;
    }

    public final void updateInputState(TextFieldValue state, InputMethodManager inputMethodManager) {
        if (this.isActive == true) goto L5;
        return;
    L5:
        setTextFieldValue$foundation_release(state);
        if (this.extractedTextMonitorMode == false) goto L8;
        inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, RecordingInputConnection_androidKt.access$toExtractedText(state));
    L8:
        TextRange r0 = state.m6664getCompositionMzsxiRA();
        int compositionEnd = -1;
        if (r0 == null) goto L11;
        int compositionStart = TextRange.m6415getMinimpl(r0.m6421unboximpl());
    L12:
        TextRange r2 = state.m6664getCompositionMzsxiRA();
        if (r2 == null) goto L15;
        compositionEnd = TextRange.m6414getMaximpl(r2.m6421unboximpl());
    L15:
        inputMethodManager.updateSelection(TextRange.m6415getMinimpl(state.m6665getSelectiond9O1mEE()), TextRange.m6414getMaximpl(state.m6665getSelectiond9O1mEE()), compositionStart, compositionEnd);
        return;
    L11:
        compositionStart = -1;
        goto L12
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        this.editCommands.add(editCommand);     // Catch: Throwable -> L6
        endBatchEditInternal();
        return;
    L6:
        th = move-exception;
        endBatchEditInternal();
        throw th;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        return beginBatchEditInternal();
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        this.batchDepth--;
        if (this.batchDepth != 0) goto L8;
        if (this.editCommands.isEmpty() == true) goto L8;
        this.eventCallback.onEditCommands(CollectionsKt.toMutableList(this.editCommands));
        this.editCommands.clear();
    L8:
        if (this.batchDepth <= 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L6;
        addEditCommandWithBatch(new CommitTextCommand(String.valueOf(text), newCursorPosition));
    L6:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L6;
        addEditCommandWithBatch(new SetComposingRegionCommand(start, end));
    L6:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L6;
        addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
    L6:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L7;
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    L7:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L7;
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    L7:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L7;
        addEditCommandWithBatch(new SetSelectionCommand(start, end));
        return true;
    L7:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L7;
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    L7:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L7;
        this.eventCallback.onKeyEvent(event);
        return true;
    L7:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        String result = TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, maxChars).toString();
        return result;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        String result = TextFieldValueKt.getTextAfterSelection(this.textFieldValue, maxChars).toString();
        return result;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (TextRange.m6411getCollapsedimpl(this.textFieldValue.m6665getSelectiond9O1mEE()) == false) goto L5;
        return null;
    L5:
        CharSequence result = TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
        return result;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean applying$iv = this.isActive;
        if (applying$iv == false) goto L46;
        boolean r6 = false;
        if ((cursorUpdateMode & 1) == 0) goto L7;
        boolean r5 = true;
    L8:
        boolean immediate = r5;
        if ((cursorUpdateMode & 2) == 0) goto L11;
        boolean monitor = true;
    L12:
        boolean includeLineBounds = false;
        if (Build.VERSION.SDK_INT >= 33) goto L15;
        boolean includeEditorBounds = false;
        boolean includeLineBounds2 = false;
        boolean includeEditorBounds2 = true;
        boolean includeLineBounds3 = true;
    L43:
        this.eventCallback.onRequestCursorAnchorInfo(immediate, monitor, includeEditorBounds2, includeLineBounds3, includeEditorBounds, includeLineBounds2);
        return true;
    L15:
        if ((cursorUpdateMode & 16) == 0) goto L17;
        boolean r13 = true;
    L18:
        boolean includeInsertionMarker = r13;
        if ((cursorUpdateMode & 8) == 0) goto L21;
        boolean r14 = true;
    L22:
        boolean includeCharacterBounds = r14;
        if ((cursorUpdateMode & 4) == 0) goto L25;
        boolean r15 = true;
    L26:
        boolean includeEditorBounds3 = r15;
        if (Build.VERSION.SDK_INT >= 34) goto L29;
    L33:
        if (includeInsertionMarker == true) goto L41;
        if (includeCharacterBounds == true) goto L41;
        if (includeEditorBounds3 == true) goto L41;
        if (includeLineBounds == true) goto L41;
        if (Build.VERSION.SDK_INT < 34) goto L40;
        includeEditorBounds = true;
        includeLineBounds2 = true;
        includeEditorBounds2 = true;
        includeLineBounds3 = true;
        goto L43
    L40:
        includeEditorBounds = true;
        includeLineBounds2 = includeLineBounds;
        includeEditorBounds2 = true;
        includeLineBounds3 = true;
    L41:
        includeEditorBounds = includeEditorBounds3;
        includeLineBounds2 = includeLineBounds;
        includeEditorBounds2 = includeInsertionMarker;
        includeLineBounds3 = includeCharacterBounds;
        goto L43
    L29:
        if ((cursorUpdateMode & 32) == 0) goto L31;
        r6 = true;
    L31:
        includeLineBounds = r6;
        goto L33
    L25:
        r15 = false;
        goto L26
    L21:
        r14 = false;
        goto L22
    L17:
        r13 = false;
        goto L18
    L11:
        monitor = false;
        goto L12
    L7:
        r5 = false;
        goto L8
    L46:
        return applying$iv;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        int r1 = 0;
        if ((flags & 1) == 0) goto L5;
        boolean r0 = true;
    L6:
        this.extractedTextMonitorMode = r0;
        if (this.extractedTextMonitorMode == false) goto L11;
        if (request == null) goto L10;
        r1 = request.token;
    L10:
        this.currentExtractedTextRequestToken = r1;
    L11:
        ExtractedText extractedText = RecordingInputConnection_androidKt.access$toExtractedText(this.textFieldValue);
        return extractedText;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        switch(id) {
            case 16908319: goto L10;
            case 16908320: goto L9;
            case 16908321: goto L8;
            case 16908322: goto L7;
            default: goto L11;
        };
    L7:
        sendSynthesizedKeyEvent(279);
        goto L11
    L8:
        sendSynthesizedKeyEvent(278);
        goto L11
    L9:
        sendSynthesizedKeyEvent(277);
        goto L11
    L10:
        addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.getText().length()));
    L11:
        return false;
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        switch(editorAction) {
            case 0: goto L13;
            case 1: goto L6;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            case 7: goto L7;
            default: goto L6;
        };
    L6:
        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + editorAction);
        int imeAction = ImeAction.Companion.m6596getDefaulteUduSuo();
    L14:
        this.eventCallback.mo1255onImeActionKlQnJC8(imeAction);
        return true;
    L7:
        imeAction = ImeAction.Companion.m6601getPreviouseUduSuo();
        goto L14
    L8:
        imeAction = ImeAction.Companion.m6597getDoneeUduSuo();
        goto L14
    L9:
        imeAction = ImeAction.Companion.m6599getNexteUduSuo();
        goto L14
    L10:
        imeAction = ImeAction.Companion.m6603getSendeUduSuo();
        goto L14
    L11:
        imeAction = ImeAction.Companion.m6602getSearcheUduSuo();
        goto L14
    L12:
        imeAction = ImeAction.Companion.m6598getGoeUduSuo();
        goto L14
    L13:
        imeAction = ImeAction.Companion.m6596getDefaulteUduSuo();
        goto L14
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        if (Build.VERSION.SDK_INT < 34) goto L6;
        Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, this.viewConfiguration, executor, consumer, new AnonymousClass1(this));
        return;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        return false;
    L5:
        return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m6415getMinimpl(this.textFieldValue.m6665getSelectiond9O1mEE()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        boolean applying$iv = this.isActive;
        if (applying$iv == true) goto L5;
        return applying$iv;
    L5:
        return false;
    }

    private final void logDebug(String message) {
    }
}
