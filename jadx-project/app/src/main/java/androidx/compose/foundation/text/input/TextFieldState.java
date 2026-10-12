package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: TextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002[\\B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001fH\u0000¢\u0006\u0002\b9J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\u0016H\u0001J&\u0010<\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020AH\u0002J\"\u0010B\u001a\u0002072\u0017\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002070D¢\u0006\u0002\bEH\u0086\bJE\u0010F\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020A2\u0017\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002070D¢\u0006\u0002\bEH\u0080\b¢\u0006\u0002\bGJ'\u0010H\u001a\u0002072\u0017\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002070D¢\u0006\u0002\bEH\u0080\b¢\u0006\u0002\bIJ\b\u0010J\u001a\u000207H\u0001J(\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020O2\u0006\u0010@\u001a\u00020AH\u0002J\u0015\u0010P\u001a\u0002072\u0006\u00108\u001a\u00020\u001fH\u0000¢\u0006\u0002\bQJ\b\u0010R\u001a\u00020\u0016H\u0001J%\u0010S\u001a\u0002072\u0006\u0010T\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000eH\u0001¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020\u0003H\u0016J \u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010?\u001a\u00020\u000eH\u0002R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u00020+8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R+\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020/8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0014\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "", "initialText", "", "initialSelection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialTextUndoManager", "Landroidx/compose/foundation/text/input/TextUndoManager;", "(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "composition", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "isEditing", "()Z", "setEditing", "(Z)V", "isEditing$delegate", "Landroidx/compose/runtime/MutableState;", "mainBuffer", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "getMainBuffer$foundation_release$annotations", "()V", "getMainBuffer$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldBuffer;", "setMainBuffer$foundation_release", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "notifyImeListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "selection", "getSelection-d9O1mEE", "()J", "text", "", "getText", "()Ljava/lang/CharSequence;", "textUndoManager", "getTextUndoManager$foundation_release", "()Landroidx/compose/foundation/text/input/TextUndoManager;", "undoState", "Landroidx/compose/foundation/text/input/UndoState;", "getUndoState$annotations", "getUndoState", "()Landroidx/compose/foundation/text/input/UndoState;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "value", "getValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "setValue", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V", "value$delegate", "addNotifyImeListener", "", "notifyImeListener", "addNotifyImeListener$foundation_release", "commitEdit", "newValue", "commitEditAsUser", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "restartImeIfContentChanges", "undoBehavior", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "edit", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "editAsUser", "editAsUser$foundation_release", "editWithNoSideEffects", "editWithNoSideEffects$foundation_release", "finishEditing", "recordEditForUndo", "previousValue", "postValue", "changes", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "removeNotifyImeListener", "removeNotifyImeListener$foundation_release", "startEdit", "syncMainBufferToTemporaryBuffer", "temporaryBuffer", "textChanged", "selectionChanged", "syncMainBufferToTemporaryBuffer$foundation_release", "toString", "updateValueAndNotifyListeners", "oldValue", "NotifyImeListener", "Saver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldState {
    public static final int $stable = 0;
    private final MutableState isEditing$delegate;
    private TextFieldBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;
    private final MutableState value$delegate;

    /* JADX INFO: compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "onChange", "", "oldValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "newValue", "restartIme", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence r1, TextFieldCharSequence r2, boolean r3);
    }

    /* JADX INFO: compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "()V", "restore", "value", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = null;

        static {
            INSTANCE = new Saver();
        }

        private Saver() {
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public /* bridge */ /* synthetic */ TextFieldState restore(Object value) {
            return restore(value);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public /* bridge */ /* synthetic */ Object save(SaverScope $this$save, TextFieldState r3) {
            return save2($this$save, r3);
        }

        /* JADX INFO: renamed from: save, reason: avoid collision after fix types in other method */
        public Object save2(SaverScope $this$save, TextFieldState value) {
            String r0 = value.getText().toString();
            Integer r1 = Integer.valueOf(TextRange.m6417getStartimpl(value.m1190getSelectiond9O1mEE()));
            Integer r2 = Integer.valueOf(TextRange.m6412getEndimpl(value.m1190getSelectiond9O1mEE()));
            TextUndoManager.Companion.Saver $this$save_u24lambda_u240 = TextUndoManager.Companion.Saver.INSTANCE;
            return CollectionsKt.listOf(new Object[]{r0, r1, r2, $this$save_u24lambda_u240.save2($this$save, value.getTextUndoManager$foundation_release())});
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextFieldState restore(Object value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List r0 = (List) value;
            Object text = r0.get(0);
            Object selectionStart = r0.get(1);
            Object selectionEnd = r0.get(2);
            Object savedTextUndoManager = r0.get(3);
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(selectionStart, "null cannot be cast to non-null type kotlin.Int");
            int r5 = ((Integer) selectionStart).intValue();
            Intrinsics.checkNotNull(selectionEnd, "null cannot be cast to non-null type kotlin.Int");
            long r7 = TextRangeKt.TextRange(r5, ((Integer) selectionEnd).intValue());
            TextUndoManager.Companion.Saver $this$restore_u24lambda_u241 = TextUndoManager.Companion.Saver.INSTANCE;
            Intrinsics.checkNotNull(savedTextUndoManager);
            TextUndoManager r9 = $this$restore_u24lambda_u241.restore(savedTextUndoManager);
            Intrinsics.checkNotNull(r9);
            return new TextFieldState((String) text, r7, r9, null);
        }
    }

    /* JADX INFO: compiled from: TextFieldState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[TextFieldEditUndoBehavior.values().length];
            r0[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
    }

    public /* synthetic */ TextFieldState(String r1, long r2, TextUndoManager r4, DefaultConstructorMarker r5) {
        this(r1, r2, r4);
    }

    public /* synthetic */ TextFieldState(String r1, long r2, DefaultConstructorMarker r4) {
        this(r1, r2);
    }

    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    public static /* synthetic */ void getUndoState$annotations() {
    }

    private TextFieldState(String initialText, long initialSelection, TextUndoManager initialTextUndoManager) {
        this.textUndoManager = initialTextUndoManager;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(initialText, TextRangeKt.m6423coerceIn8ffj60Q(initialSelection, 0, initialText.length()), null, null, null, 28, null), null, null, null, 14, null);
        this.isEditing$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.value$delegate = SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(initialText, initialSelection, null, null, null, 28, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector(new NotifyImeListener[16], 0);
    }

    public static final /* synthetic */ void access$commitEditAsUser(TextFieldState $this, InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior) {
        $this.commitEditAsUser(inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public static final /* synthetic */ void access$updateValueAndNotifyListeners(TextFieldState $this, TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartImeIfContentChanges) {
        $this.updateValueAndNotifyListeners(oldValue, newValue, restartImeIfContentChanges);
    }

    public /* synthetic */ TextFieldState(String r1, long r2, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = TextRangeKt.TextRange(r1.length());
    L8:
        this(r1, r2, null);
    }

    private TextFieldState(String initialText, long initialSelection) {
        this(initialText, initialSelection, new TextUndoManager(null, null, 3, null), null);
    }

    public final TextUndoManager getTextUndoManager$foundation_release() {
        return this.textUndoManager;
    }

    public final TextFieldBuffer getMainBuffer$foundation_release() {
        return this.mainBuffer;
    }

    public final void setMainBuffer$foundation_release(TextFieldBuffer r1) {
        this.mainBuffer = r1;
    }

    private final boolean isEditing() {
        State $this$getValue$iv = this.isEditing$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setEditing(boolean r5) {
        MutableState $this$setValue$iv = this.isEditing$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final void setValue(TextFieldCharSequence r4) {
        MutableState $this$setValue$iv = this.value$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final TextFieldCharSequence getValue$foundation_release() {
        State $this$getValue$iv = this.value$delegate;
        return (TextFieldCharSequence) $this$getValue$iv.getValue();
    }

    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1190getSelectiond9O1mEE() {
        return getValue$foundation_release().m1188getSelectiond9O1mEE();
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1189getCompositionMzsxiRA() {
        return getValue$foundation_release().m1187getCompositionMzsxiRA();
    }

    public final void edit(Function1<? super TextFieldBuffer, Unit> r4) {
        TextFieldBuffer mutableValue = startEdit();
        r4.invoke(mutableValue);     // Catch: Throwable -> L6
        commitEdit(mutableValue);     // Catch: Throwable -> L6
        finishEditing();
        return;
    L6:
        th = move-exception;
        finishEditing();
        throw th;
    }

    public String toString() {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r3 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        String r6 = "TextFieldState(selection=" + TextRange.m6420toStringimpl(m1190getSelectiond9O1mEE()) + ", text=\"" + getText() + "\")";     // Catch: Throwable -> L10
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        return r6;
    L10:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        throw th;
    L5:
        r3 = null;
        goto L6
    }

    public final UndoState getUndoState() {
        return this.undoState;
    }

    public final TextFieldBuffer startEdit() {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r0 = previousSnapshot$iv.getReadObserver();
    L6:
        Function1<Object, Unit> r4 = r0;
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        boolean isEditingFreeze = isEditing();     // Catch: Throwable -> L17
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        if (isEditingFreeze == true) goto L11;
        boolean value$iv = true;
    L13:
        if (value$iv == true) goto L15;
        InlineClassHelperKt.throwIllegalStateException("TextFieldState does not support concurrent or nested editing.");
    L15:
        setEditing(true);
        return new TextFieldBuffer(getValue$foundation_release(), null, null, null, 14, null);
    L11:
        value$iv = false;
    L17:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        throw th;
    L5:
        r0 = null;
        goto L6
    }

    public final void commitEdit(TextFieldBuffer newValue) {
        if (newValue.getChanges().getChangeCount() <= 0) goto L5;
        boolean textChanged = true;
    L6:
        boolean selectionChanged = true ^ TextRange.m6410equalsimpl0(newValue.m1180getSelectiond9O1mEE(), this.mainBuffer.m1180getSelectiond9O1mEE());
        if (textChanged == false) goto L9;
        this.textUndoManager.clearHistory();
    L9:
        syncMainBufferToTemporaryBuffer$foundation_release(newValue, textChanged, selectionChanged);
        return;
    L5:
        textChanged = false;
        goto L6
    }

    public final void finishEditing() {
        setEditing(false);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState $this, InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior, Function1 block, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        restartImeIfContentChanges = true;
    L6:
        if ((r5 & 4) == 0) goto L8;
        undoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
    L8:
        $this.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        block.invoke($this.getMainBuffer$foundation_release());
        access$commitEditAsUser($this, inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void editAsUser$foundation_release(InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior, Function1<? super TextFieldBuffer, Unit> r6) {
        getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        r6.invoke(getMainBuffer$foundation_release());
        access$commitEditAsUser(this, inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void editWithNoSideEffects$foundation_release(Function1<? super TextFieldBuffer, Unit> r10) {
        getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        r10.invoke(getMainBuffer$foundation_release());
        TextFieldCharSequence afterEditValue = TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default(getMainBuffer$foundation_release(), 0, null, null, 7, null);
        access$updateValueAndNotifyListeners(this, getValue$foundation_release(), afterEditValue, true);
    }

    static /* synthetic */ void commitEditAsUser$default(TextFieldState r0, InputTransformation r1, boolean r2, TextFieldEditUndoBehavior r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = TextFieldEditUndoBehavior.MergeIfPossible;
    L8:
        r0.commitEditAsUser(r1, r2, r3);
    }

    private final void commitEditAsUser(InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior) {
        TextFieldCharSequence beforeEditValue = getValue$foundation_release();
        if (this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() == 0) goto L5;
    L15:
        boolean r4 = false;
        if (this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() == 0) goto L18;
        boolean r3 = true;
    L19:
        boolean contentMayHaveChanged = r3;
        TextFieldCharSequence afterEditValue = new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m1180getSelectiond9O1mEE(), this.mainBuffer.m1178getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getHighlight$foundation_release(), TextFieldStateKt.m1191access$finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m1178getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getComposingAnnotations$foundation_release()), null);
        if (inputTransformation != null) goto L26;
        if (contentMayHaveChanged == false) goto L24;
        if (restartImeIfContentChanges == false) goto L24;
        r4 = true;
    L24:
        updateValueAndNotifyListeners(beforeEditValue, afterEditValue, r4);
        recordEditForUndo(beforeEditValue, afterEditValue, this.mainBuffer.getChangeTracker$foundation_release(), undoBehavior);
        return;
    L26:
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(afterEditValue, this.mainBuffer.getChangeTracker$foundation_release(), beforeEditValue, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer);
        boolean textChangedByFilter = !StringsKt.contentEquals(textFieldBuffer.asCharSequence(), afterEditValue);
        boolean selectionChangedByFilter = !TextRange.m6410equalsimpl0(textFieldBuffer.m1180getSelectiond9O1mEE(), afterEditValue.m1188getSelectiond9O1mEE());
        if (textChangedByFilter == true) goto L31;
        if (selectionChangedByFilter == true) goto L31;
        updateValueAndNotifyListeners(beforeEditValue, TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0, afterEditValue.m1187getCompositionMzsxiRA(), null, 5, null), restartImeIfContentChanges);
    L32:
        recordEditForUndo(beforeEditValue, getValue$foundation_release(), textFieldBuffer.getChanges(), undoBehavior);
        return;
    L31:
        syncMainBufferToTemporaryBuffer$foundation_release(textFieldBuffer, textChangedByFilter, selectionChangedByFilter);
        goto L32
    L18:
        r3 = false;
        goto L19
    L5:
        if (TextRange.m6410equalsimpl0(beforeEditValue.m1188getSelectiond9O1mEE(), this.mainBuffer.m1180getSelectiond9O1mEE()) == false) goto L15;
        if (Intrinsics.areEqual(beforeEditValue.m1187getCompositionMzsxiRA(), this.mainBuffer.m1178getCompositionMzsxiRA$foundation_release()) == true) goto L9;
    L13:
        updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m1180getSelectiond9O1mEE(), this.mainBuffer.m1178getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getHighlight$foundation_release(), TextFieldStateKt.m1191access$finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m1178getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getComposingAnnotations$foundation_release()), null), restartImeIfContentChanges);
        return;
    L9:
        if (Intrinsics.areEqual(beforeEditValue.getHighlight(), this.mainBuffer.getHighlight$foundation_release()) == false) goto L13;
        if (Intrinsics.areEqual(beforeEditValue.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations$foundation_release()) == false) goto L13;
    }

    private final void updateValueAndNotifyListeners(TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartImeIfContentChanges) {
        setValue(newValue);
        finishEditing();
        MutableVector<NotifyImeListener> r0 = this.notifyImeListeners;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L14;
        NotifyImeListener it = (NotifyImeListener) content$iv[i$iv];
        if (restartImeIfContentChanges == true) goto L7;
    L11:
        boolean r7 = false;
    L12:
        it.onChange(oldValue, newValue, r7);
        i$iv = i$iv + 1;
        goto L3
    L7:
        if (oldValue.contentEquals(newValue) == true) goto L11;
        if (oldValue.m1187getCompositionMzsxiRA() == null) goto L11;
        r7 = true;
        goto L12
    }

    private final void recordEditForUndo(TextFieldCharSequence previousValue, TextFieldCharSequence postValue, TextFieldBuffer.ChangeList changes, TextFieldEditUndoBehavior undoBehavior) {
        switch(WhenMappings.$EnumSwitchMapping$0[undoBehavior.ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            case 3: goto L5;
            default: goto L11;
        };
    L5:
        TextUndoManagerKt.recordChanges(this.textUndoManager, previousValue, postValue, changes, false);
        return;
    L6:
        TextUndoManagerKt.recordChanges(this.textUndoManager, previousValue, postValue, changes, true);
        return;
    L7:
        this.textUndoManager.clearHistory();
        return;
    }

    public final void addNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    public final void removeNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    public final void syncMainBufferToTemporaryBuffer$foundation_release(TextFieldBuffer temporaryBuffer, boolean textChanged, boolean selectionChanged) {
        TextFieldCharSequence oldValue = TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0, null, null, 7, null);
        if (textChanged == false) goto L5;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(temporaryBuffer.toString(), temporaryBuffer.m1180getSelectiond9O1mEE(), null, null, null, 28, null), null, null, null, 14, null);
    L8:
        if (textChanged == true) goto L12;
        if (selectionChanged == true) goto L12;
        if (Intrinsics.areEqual(oldValue.m1187getCompositionMzsxiRA(), temporaryBuffer.m1178getCompositionMzsxiRA$foundation_release()) == false) goto L12;
    L13:
        TextFieldCharSequence finalValue = TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0, null, null, 7, null);
        updateValueAndNotifyListeners(oldValue, finalValue, true);
        return;
    L12:
        this.mainBuffer.commitComposition$foundation_release();
        goto L13
    L5:
        if (selectionChanged == false) goto L8;
        this.mainBuffer.m1182setSelection5zctL8(TextRangeKt.TextRange(TextRange.m6417getStartimpl(temporaryBuffer.m1180getSelectiond9O1mEE()), TextRange.m6412getEndimpl(temporaryBuffer.m1180getSelectiond9O1mEE())));
        goto L8
    }
}
