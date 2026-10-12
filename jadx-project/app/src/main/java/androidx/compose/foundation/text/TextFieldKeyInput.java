package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ!\u0010+\u001a\u00020\u00172\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b.H\u0002J\u0018\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001c\u00104\u001a\u0004\u0018\u0001052\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107J\f\u00108\u001a\u00020\u0017*\u000209H\u0002J\u0012\u00108\u001a\u00020\u0017*\b\u0012\u0004\u0012\u0002090:H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0018\u001a\u00020\u0019X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "selectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "", "singleLine", "preparedSelectionState", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "keyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "onValueChange", "Lkotlin/Function1;", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEditable", "()Z", "I", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSingleLine", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "commandExecutionContext", "block", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "process", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "typedCommand", "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "apply", "Landroidx/compose/ui/text/input/EditCommand;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldKeyInput {
    public static final int $stable = 0;
    private final boolean editable;
    private final int imeAction;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final Function1<TextFieldValue, Unit> onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final LegacyTextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    static {
        $stable = 8;
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState r1, TextFieldSelectionManager r2, TextFieldValue r3, boolean r4, boolean r5, TextPreparedSelectionState r6, OffsetMapping r7, UndoManager r8, DeadKeyCombiner r9, KeyMapping r10, Function1 r11, int r12, DefaultConstructorMarker r13) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(LegacyTextFieldState state, TextFieldSelectionManager selectionManager, TextFieldValue value, boolean editable, boolean singleLine, TextPreparedSelectionState preparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner keyCombiner, KeyMapping keyMapping, Function1<? super TextFieldValue, Unit> r11, int imeAction) {
        this.state = state;
        this.selectionManager = selectionManager;
        this.value = value;
        this.editable = editable;
        this.singleLine = singleLine;
        this.preparedSelectionState = preparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = keyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = r11;
        this.imeAction = imeAction;
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState r18, TextFieldSelectionManager r19, TextFieldValue r20, boolean r21, boolean r22, TextPreparedSelectionState r23, OffsetMapping r24, UndoManager r25, DeadKeyCombiner r26, KeyMapping r27, Function1 r28, int r29, int r30, DefaultConstructorMarker r31) {
        if ((r30 & 4) == 0) goto L5;
        TextFieldValue r6 = new TextFieldValue(null, 0, null, 7, null);
    L7:
        if ((r30 & 8) == 0) goto L9;
        boolean r7 = true;
    L11:
        if ((r30 & 16) == 0) goto L13;
        boolean r8 = false;
    L15:
        if ((r30 & 64) == 0) goto L17;
        OffsetMapping r10 = OffsetMapping.Companion.getIdentity();
    L19:
        if ((r30 & 128) == 0) goto L21;
        UndoManager r11 = null;
    L23:
        if ((r30 & 512) == 0) goto L25;
        KeyMapping r13 = KeyMapping_androidKt.getPlatformDefaultKeyMapping();
    L27:
        if ((r30 & 1024) == 0) goto L29;
        Function1 r14 = AnonymousClass1.INSTANCE;
    L30:
        this(r18, r19, r6, r7, r8, r23, r10, r11, r26, r13, r14, r29, null);
        return;
    L29:
        r14 = r28;
        goto L30
    L25:
        r13 = r27;
        goto L27
    L21:
        r11 = r25;
        goto L23
    L17:
        r10 = r24;
        goto L19
    L13:
        r8 = r22;
        goto L15
    L9:
        r7 = r21;
        goto L11
    L5:
        r6 = r20;
        goto L7
    }

    public static final /* synthetic */ void access$apply(TextFieldKeyInput $this, EditCommand $receiver) {
        $this.apply($receiver);
    }

    public static final /* synthetic */ void access$apply(TextFieldKeyInput $this, List $receiver) {
        $this.apply($receiver);
    }

    public static final /* synthetic */ int access$getImeAction$p(TextFieldKeyInput $this) {
        return $this.imeAction;
    }

    public static final /* synthetic */ Function1 access$getOnValueChange$p(TextFieldKeyInput $this) {
        return $this.onValueChange;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    private final void apply(List<? extends EditCommand> r7) {
        EditProcessor r0 = this.state.getProcessor();
        List<? extends EditCommand> r1 = CollectionsKt.toMutableList(r7);
        r1.add(0, new FinishComposingTextCommand());
        TextFieldValue newTextFieldValue = r0.apply(r1);
        this.onValueChange.invoke(newTextFieldValue);
    }

    private final void apply(EditCommand $this$apply) {
        apply(CollectionsKt.listOf($this$apply));
    }

    /* JADX INFO: renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m1147typedCommandZmokQxo(KeyEvent event) {
        if (TextFieldKeyInput_androidKt.m1152isTypedEventZmokQxo(event) == true) goto L5;
        return null;
    L5:
        Integer r0 = this.keyCombiner.m1049consumeZmokQxo(event);
        if (r0 == null) goto L9;
        int codePoint = r0.intValue();
        String text = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), codePoint).toString();
        return new CommitTextCommand(text, 1);
    L9:
        return null;
    }

    /* JADX INFO: renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m1148processZmokQxo(KeyEvent event) {
        CommitTextCommand it = m1147typedCommandZmokQxo(event);
        if (it == null) goto L10;
        if (this.editable == false) goto L8;
        apply(it);
        this.preparedSelectionState.resetCachedX();
        return true;
    L8:
        return false;
    L10:
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo(event), KeyEventType.Companion.m5442getKeyDownCS__XNY()) == true) goto L12;
        return false;
    L12:
        final KeyCommand command = this.keyMapping.mo1051mapZmokQxo(event);
        if (command != null) goto L15;
    L24:
        return false;
    L15:
        if (command.getEditsText() == true) goto L17;
    L19:
        final Ref.BooleanRef consumed = new Ref.BooleanRef();
        consumed.element = true;
        commandExecutionContext(new TextFieldKeyInput$process$2(command, this, consumed));
        UndoManager r1 = this.undoManager;
        if (r1 == null) goto L23;
        r1.forceNextSnapshot();
    L23:
        return consumed.element;
    L17:
        if (this.editable == true) goto L19;
        goto L19
    }

    private final void commandExecutionContext(Function1<? super TextFieldPreparedSelection, Unit> r6) {
        TextFieldPreparedSelection preparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        r6.invoke(preparedSelection);
        if (TextRange.m6410equalsimpl0(preparedSelection.m1430getSelectiond9O1mEE(), this.value.m6665getSelectiond9O1mEE()) == true) goto L5;
    L6:
        this.onValueChange.invoke(preparedSelection.getValue());
        return;
    L5:
        if (Intrinsics.areEqual(preparedSelection.getAnnotatedString(), this.value.getAnnotatedString()) == false) goto L6;
    }
}
