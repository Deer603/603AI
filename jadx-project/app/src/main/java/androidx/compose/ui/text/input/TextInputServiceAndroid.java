package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001RB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020%H\u0016J\u0006\u00107\u001a\u00020\u0016J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020:H\u0017J\b\u0010;\u001a\u00020%H\u0002J\b\u0010<\u001a\u00020%H\u0002J\u0010\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020/H\u0002J\u0010\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0016H\u0002J\b\u0010A\u001a\u00020%H\u0016J\b\u0010B\u001a\u00020%H\u0016JF\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020%0\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020%0\"H\u0016J\b\u0010D\u001a\u00020%H\u0016J\u001a\u0010E\u001a\u00020%2\b\u0010F\u001a\u0004\u0018\u00010)2\u0006\u0010G\u001a\u00020)H\u0016JD\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020%0\"2\u0006\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020:H\u0016R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020%0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020%0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006S"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "view", "Landroid/view/View;", "positionCalculator", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;)V", "rootPositionCalculator", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputCommandProcessorExecutor", "Ljava/util/concurrent/Executor;", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "baseInputConnection", "Landroid/view/inputmethod/BaseInputConnection;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "cursorAnchorInfoController", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "editorHasFocus", "", "focusedRect", "Landroid/graphics/Rect;", "frameCallback", "Ljava/lang/Runnable;", "ics", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "textInputCommandQueue", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "getView", "()Landroid/view/View;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "hideSoftwareKeyboard", "isEditorFocused", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "processInputCommands", "restartInputImmediately", "sendInputCommand", "command", "setKeyboardVisibleImmediately", "visible", "showSoftwareKeyboard", "startInput", "value", "stopInput", "updateState", "oldValue", "newValue", "updateTextLayoutResult", "textFieldValue", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "textFieldToRootTransform", "Landroidx/compose/ui/graphics/Matrix;", "innerTextFieldBounds", "decorationBoxBounds", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 0;
    private final Lazy baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand;
    private Function1<? super ImeAction, Unit> onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final enum TextInputCommand extends Enum<TextInputCommand> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ TextInputCommand[] $VALUES = null;
        public static final TextInputCommand HideKeyboard = null;
        public static final TextInputCommand ShowKeyboard = null;
        public static final TextInputCommand StartInput = null;
        public static final TextInputCommand StopInput = null;

        private static final /* synthetic */ TextInputCommand[] $values() {
            return new TextInputCommand[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
        }

        public static EnumEntries<TextInputCommand> getEntries() {
            return $ENTRIES;
        }

        public static TextInputCommand valueOf(String r1) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, r1);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }

        private TextInputCommand(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            StartInput = new TextInputCommand("StartInput", 0);
            StopInput = new TextInputCommand("StopInput", 1);
            ShowKeyboard = new TextInputCommand("ShowKeyboard", 2);
            HideKeyboard = new TextInputCommand("HideKeyboard", 3);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[TextInputCommand.values().length];
            r0[TextInputCommand.StartInput.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[TextInputCommand.StopInput.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[TextInputCommand.ShowKeyboard.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[TextInputCommand.HideKeyboard.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator rootPositionCalculator, InputMethodManager inputMethodManager, Executor inputCommandProcessorExecutor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = inputCommandProcessorExecutor;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m6422getZerod9O1mEE(), null, 4, null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.cursorAnchorInfoController = new CursorAnchorInfoController(rootPositionCalculator, this.inputMethodManager);
        this.textInputCommandQueue = new MutableVector(new TextInputCommand[16], 0);
    }

    public static final /* synthetic */ BaseInputConnection access$getBaseInputConnection(TextInputServiceAndroid $this) {
        return $this.getBaseInputConnection();
    }

    public static final /* synthetic */ CursorAnchorInfoController access$getCursorAnchorInfoController$p(TextInputServiceAndroid $this) {
        return $this.cursorAnchorInfoController;
    }

    public static final /* synthetic */ List access$getIcs$p(TextInputServiceAndroid $this) {
        return $this.ics;
    }

    public static final /* synthetic */ Function1 access$getOnEditCommand$p(TextInputServiceAndroid $this) {
        return $this.onEditCommand;
    }

    public static final /* synthetic */ Function1 access$getOnImeActionPerformed$p(TextInputServiceAndroid $this) {
        return $this.onImeActionPerformed;
    }

    public /* synthetic */ TextInputServiceAndroid(View r1, MatrixPositionCalculator r2, InputMethodManager r3, Executor r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance());
    L5:
        this(r1, r2, r3, r4);
    }

    public final View getView() {
        return this.view;
    }

    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    private final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator positionCalculator) {
        Executor r5 = null;
        this(view, positionCalculator, new InputMethodManagerImpl(view), r5, 8, null);
    }

    public final InputConnection createInputConnection(EditorInfo outAttrs) {
        if (this.editorHasFocus == true) goto L6;
        return null;
    L6:
        TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.access$updateWithEmojiCompat(outAttrs);
        TextFieldValue r0 = this.state;
        boolean r1 = this.imeOptions.getAutoCorrect();
        RecordingInputConnection it = new RecordingInputConnection(r0, new AnonymousClass1(this), r1);
        this.ics.add(new WeakReference(it));
        return it;
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, Unit> r4, Function1<? super ImeAction, Unit> r5) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = r4;
        this.onImeActionPerformed = r5;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = C06611.INSTANCE;
        this.onImeActionPerformed = AnonymousClass2.INSTANCE;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    private final void sendInputCommand(TextInputCommand command) {
        this.textInputCommandQueue.add(command);
        if (this.frameCallback != null) goto L6;
        Runnable p0 = new TextInputServiceAndroid$$ExternalSyntheticLambda0(this);
        this.inputCommandProcessorExecutor.execute(p0);
        this.frameCallback = p0;
        return;
    }

    static final void sendInputCommand$lambda$1(TextInputServiceAndroid this$0) {
        this$0.frameCallback = null;
        this$0.processInputCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processInputCommands() {
        if (this.view.isFocused() == true) goto L13;
        View focusedView = this.view.getRootView().findFocus();
        if (focusedView != null) goto L7;
    L9:
        boolean r3 = false;
    L10:
        if (r3 == false) goto L13;
        this.textInputCommandQueue.clear();
        return;
    L7:
        if (focusedView.onCheckIsTextEditor() != true) goto L9;
        r3 = true;
    L13:
        Ref.ObjectRef startInput = new Ref.ObjectRef();
        Ref.ObjectRef showKeyboard = new Ref.ObjectRef();
        MutableVector<TextInputCommand> r4 = this.textInputCommandQueue;
        int i$iv = 0;
        Object[] content$iv = r4.content;
        int size$iv = r4.getSize();
    L14:
        if (i$iv >= size$iv) goto L16;
        TextInputCommand command = (TextInputCommand) content$iv[i$iv];
        processInputCommands$applyToState(command, startInput, showKeyboard);
        i$iv = i$iv + 1;
        goto L14
    L16:
        this.textInputCommandQueue.clear();
        if (Intrinsics.areEqual(startInput.element, true) == false) goto L19;
        restartInputImmediately();
    L19:
        Boolean r2 = (Boolean) showKeyboard.element;
        if (r2 == null) goto L23;
        boolean p0 = r2.booleanValue();
        setKeyboardVisibleImmediately(p0);
    L23:
        if (Intrinsics.areEqual(startInput.element, false) == false) goto L28;
        restartInputImmediately();
        return;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Boolean, java.lang.Object] */
    private static final void processInputCommands$applyToState(TextInputCommand $this$processInputCommands_u24applyToState, Ref.ObjectRef<Boolean> r6, Ref.ObjectRef<Boolean> r7) {
        boolean r1 = true;
        switch(WhenMappings.$EnumSwitchMapping$0[$this$processInputCommands_u24applyToState.ordinal()]) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L6;
            case 4: goto L6;
            default: goto L18;
        };
    L12:
        r6.element = false;
        r7.element = false;
        return;
    L13:
        r6.element = true;
        r7.element = true;
        return;
    L18:
        return;
    L6:
        if (Intrinsics.areEqual(r6.element, false) == false) goto L8;
        return;
    L8:
        if ($this$processInputCommands_u24applyToState == TextInputCommand.ShowKeyboard) goto L11;
        r1 = false;
    L11:
        r7.element = Boolean.valueOf(r1);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue oldValue, TextFieldValue newValue) {
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
        r5.setMTextFieldValue$ui_release(newValue);
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

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        this.focusedRect = new Rect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()));
        if (this.ics.isEmpty() == false) goto L8;
        Rect it = this.focusedRect;
        if (it == null) goto L9;
        this.view.requestRectangleOnScreen(new Rect(it));
        return;
    L9:
        return;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1<? super Matrix, Unit> r11, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, r11, innerTextFieldBounds, decorationBoxBounds);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void setKeyboardVisibleImmediately(boolean visible) {
        InputMethodManager r0 = this.inputMethodManager;
        if (visible == false) goto L5;
        r0.showSoftInput();
        return;
    L5:
        r0.hideSoftInput();
    }
}
