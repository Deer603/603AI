package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0016J\u000e\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u000206J\b\u00107\u001a\u00020\u0007H\u0002JN\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070\u0005J\u0018\u0010<\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010'2\u0006\u0010>\u001a\u00020'J.\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002062\u0006\u0010F\u001a\u000206R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020'@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "view", "Landroid/view/View;", "localToScreen", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "inputMethodManager", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "baseInputConnection", "Landroid/view/inputmethod/BaseInputConnection;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "cursorAnchorInfoController", "Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "focusedRect", "Landroid/graphics/Rect;", "getFocusedRect$foundation_release", "()Landroid/graphics/Rect;", "setFocusedRect$foundation_release", "(Landroid/graphics/Rect;)V", "ics", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "legacyTextFieldState", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "onEditCommand", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "getState", "()Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "createInputConnection", "outAttributes", "Landroid/view/inputmethod/EditorInfo;", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "restartInputImmediately", "startInput", "value", "textInputNode", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "updateState", "oldValue", "newValue", "updateTextLayoutResult", "textFieldValue", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "decorationBoxBounds", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 0;
    private final Lazy baseInputConnection$delegate;
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    private Rect focusedRect;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final InputMethodManager inputMethodManager;
    private LegacyTextFieldState legacyTextFieldState;
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand;
    private Function1<? super ImeAction, Unit> onImeActionPerformed;
    private TextFieldValue state;
    private TextFieldSelectionManager textFieldSelectionManager;
    private final View view;
    private ViewConfiguration viewConfiguration;

    static {
        $stable = 8;
    }

    public LegacyTextInputMethodRequest(View view, Function1<? super Matrix, Unit> r10, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.onEditCommand = LegacyTextInputMethodRequest$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = LegacyTextInputMethodRequest$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m6422getZerod9O1mEE(), null, 4, null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new LegacyTextInputMethodRequest$baseInputConnection$2(this));
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(r10, this.inputMethodManager);
    }

    public static final /* synthetic */ BaseInputConnection access$getBaseInputConnection(LegacyTextInputMethodRequest $this) {
        return $this.getBaseInputConnection();
    }

    public static final /* synthetic */ LegacyCursorAnchorInfoController access$getCursorAnchorInfoController$p(LegacyTextInputMethodRequest $this) {
        return $this.cursorAnchorInfoController;
    }

    public static final /* synthetic */ List access$getIcs$p(LegacyTextInputMethodRequest $this) {
        return $this.ics;
    }

    public static final /* synthetic */ Function1 access$getOnEditCommand$p(LegacyTextInputMethodRequest $this) {
        return $this.onEditCommand;
    }

    public static final /* synthetic */ Function1 access$getOnImeActionPerformed$p(LegacyTextInputMethodRequest $this) {
        return $this.onImeActionPerformed;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public /* bridge */ /* synthetic */ InputConnection createInputConnection(EditorInfo outAttributes) {
        return createInputConnection(outAttributes);
    }

    public final View getView() {
        return this.view;
    }

    public final TextFieldValue getState() {
        return this.state;
    }

    private final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    public final Rect getFocusedRect$foundation_release() {
        return this.focusedRect;
    }

    public final void setFocusedRect$foundation_release(Rect r1) {
        this.focusedRect = r1;
    }

    public final void startInput(TextFieldValue value, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode textInputNode, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, Unit> r6, Function1<? super ImeAction, Unit> r7) {
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = r6;
        this.onImeActionPerformed = r7;
        ViewConfiguration r0 = null;
        if (textInputNode == null) goto L5;
        LegacyTextFieldState r1 = textInputNode.getLegacyTextFieldState();
    L6:
        this.legacyTextFieldState = r1;
        if (textInputNode == null) goto L9;
        TextFieldSelectionManager r2 = textInputNode.getTextFieldSelectionManager();
    L10:
        this.textFieldSelectionManager = r2;
        if (textInputNode == null) goto L13;
        r0 = textInputNode.getViewConfiguration();
    L13:
        this.viewConfiguration = r0;
        return;
    L9:
        r2 = null;
        goto L10
    L5:
        r1 = null;
        goto L6
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public RecordingInputConnection createInputConnection(EditorInfo outAttributes) {
        EditorInfo_androidKt.m1229updatepLxbY9I$default(outAttributes, this.state.getText(), this.state.m6665getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.access$updateWithEmojiCompat(outAttributes);
        TextFieldValue r3 = this.state;
        boolean r5 = this.imeOptions.getAutoCorrect();
        InputEventCallback2 r10 = new AnonymousClass1(this);
        InputEventCallback2 r4 = r10;
        RecordingInputConnection it = new RecordingInputConnection(r3, r4, r5, this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference(it));
        return it;
    }

    public final void updateState(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean restartInput = false;
        if (TextRange.m6410equalsimpl0(this.state.m6665getSelectiond9O1mEE(), newValue.m6665getSelectiond9O1mEE()) == true) goto L5;
    L8:
        boolean needUpdateSelection = true;
    L9:
        this.state = newValue;
        int i = 0;
        int r4 = this.ics.size();
    L10:
        if (i >= r4) goto L16;
        RecordingInputConnection r5 = this.ics.get(i).get();
        if (r5 == null) goto L15;
        r5.setTextFieldValue$foundation_release(newValue);
    L15:
        i = i + 1;
        goto L10
    L16:
        this.cursorAnchorInfoController.invalidate();
        if (Intrinsics.areEqual(oldValue, newValue) == false) goto L28;
        if (needUpdateSelection == false) goto L54;
        InputMethodManager r1 = this.inputMethodManager;
        int r2 = TextRange.m6415getMinimpl(newValue.m6665getSelectiond9O1mEE());
        int r3 = TextRange.m6414getMaximpl(newValue.m6665getSelectiond9O1mEE());
        TextRange r6 = this.state.m6664getCompositionMzsxiRA();
        int r7 = -1;
        if (r6 == null) goto L22;
        int r8 = TextRange.m6415getMinimpl(r6.m6421unboximpl());
    L23:
        TextRange r9 = this.state.m6664getCompositionMzsxiRA();
        if (r9 == null) goto L26;
        r7 = TextRange.m6414getMaximpl(r9.m6421unboximpl());
    L26:
        r1.updateSelection(r2, r3, r8, r7);
        return;
    L22:
        r8 = -1;
        goto L23
    L54:
        return;
    L28:
        if (oldValue != null) goto L30;
    L39:
        if (restartInput == false) goto L41;
        restartInputImmediately();
        return;
    L41:
        int i2 = 0;
        int r10 = this.ics.size();
    L42:
        if (i2 >= r10) goto L55;
        RecordingInputConnection r11 = this.ics.get(i2).get();
        if (r11 == null) goto L46;
        r11.updateInputState(this.state, this.inputMethodManager);
    L46:
        i2 = i2 + 1;
        goto L42
    L55:
        return;
    L30:
        if (Intrinsics.areEqual(oldValue.getText(), newValue.getText()) == true) goto L32;
    L35:
        restartInput = true;
        goto L39
    L32:
        if (TextRange.m6410equalsimpl0(oldValue.m6665getSelectiond9O1mEE(), newValue.m6665getSelectiond9O1mEE()) == false) goto L39;
        if (Intrinsics.areEqual(oldValue.m6664getCompositionMzsxiRA(), newValue.m6664getCompositionMzsxiRA()) == true) goto L39;
    L5:
        if (Intrinsics.areEqual(this.state.m6664getCompositionMzsxiRA(), newValue.m6664getCompositionMzsxiRA()) == false) goto L8;
        needUpdateSelection = false;
        goto L9
    }

    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        this.focusedRect = new Rect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()));
        if (this.ics.isEmpty() == false) goto L8;
        Rect it = this.focusedRect;
        if (it == null) goto L9;
        this.view.requestRectangleOnScreen(new Rect(it));
        return;
    L9:
        return;
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }
}
