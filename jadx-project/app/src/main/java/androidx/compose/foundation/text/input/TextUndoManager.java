package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextUndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR/\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager;", "", "initialStagingUndo", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "undoManager", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)V", "canRedo", "", "getCanRedo", "()Z", "canUndo", "getCanUndo", "<set-?>", "stagingUndo", "getStagingUndo", "()Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "setStagingUndo", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)V", "stagingUndo$delegate", "Landroidx/compose/runtime/MutableState;", "clearHistory", "", "flush", "record", "op", "redo", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "undo", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextUndoManager {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final MutableState stagingUndo$delegate;
    private final UndoManager<TextUndoOperation> undoManager;

    /* JADX INFO: compiled from: TextUndoManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager$Companion;", "", "()V", "Saver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: TextUndoManager.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0014\u0010\n\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextUndoManager;", "", "()V", "undoManagerSaver", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "restore", "value", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {
            public static final int $stable = 0;
            public static final Saver INSTANCE = null;
            private static final androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> undoManagerSaver = null;

            private Saver() {
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public /* bridge */ /* synthetic */ TextUndoManager restore(Object value) {
                return restore(value);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public /* bridge */ /* synthetic */ Object save(SaverScope $this$save, TextUndoManager r3) {
                return save2($this$save, r3);
            }

            static {
                INSTANCE = new Saver();
                UndoManager.Companion r0 = UndoManager.Companion;
                final androidx.compose.runtime.saveable.Saver<TextUndoOperation, Object> r1 = TextUndoOperation.Companion.getSaver();
                undoManagerSaver = new TextUndoManager$Companion$Saver$special$$inlined$createSaver$1(r1);
                $stable = 8;
            }

            /* JADX INFO: renamed from: save, reason: avoid collision after fix types in other method */
            public Object save2(SaverScope $this$save, TextUndoManager value) {
                TextUndoOperation it = TextUndoManager.access$getStagingUndo(value);
                if (it == null) goto L5;
                Object r2 = TextUndoOperation.Companion.getSaver().save($this$save, it);
            L7:
                return CollectionsKt.listOf(new Object[]{r2, undoManagerSaver.save($this$save, TextUndoManager.access$getUndoManager$p(value))});
            L5:
                r2 = null;
                goto L7
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.saveable.Saver
            public TextUndoManager restore(Object value) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List r0 = (List) value;
                Object savedStagingUndo = r0.get(0);
                Object savedUndoManager = r0.get(1);
                if (savedStagingUndo == null) goto L5;
                TextUndoOperation r6 = TextUndoOperation.Companion.getSaver().restore(savedStagingUndo);
            L6:
                androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> r2 = undoManagerSaver;
                Intrinsics.checkNotNull(savedUndoManager);
                UndoManager<TextUndoOperation> r4 = r2.restore(savedUndoManager);
                Intrinsics.checkNotNull(r4);
                return new TextUndoManager(r6, r4);
            L5:
                r6 = null;
                goto L6
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextUndoManager() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public TextUndoManager(TextUndoOperation initialStagingUndo, UndoManager<TextUndoOperation> r4) {
        this.undoManager = r4;
        this.stagingUndo$delegate = SnapshotStateKt.mutableStateOf$default(initialStagingUndo, null, 2, null);
    }

    public /* synthetic */ TextUndoManager(TextUndoOperation r7, UndoManager r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r7 = null;
    L6:
        if ((r9 & 2) == 0) goto L8;
        List r1 = null;
        List r2 = null;
        int r3 = 100;
        r8 = new UndoManager(r1, r2, r3, 3, null);
    L8:
        this(r7, r8);
    }

    public static final /* synthetic */ TextUndoOperation access$getStagingUndo(TextUndoManager $this) {
        return $this.getStagingUndo();
    }

    public static final /* synthetic */ UndoManager access$getUndoManager$p(TextUndoManager $this) {
        return $this.undoManager;
    }

    private final TextUndoOperation getStagingUndo() {
        State $this$getValue$iv = this.stagingUndo$delegate;
        return (TextUndoOperation) $this$getValue$iv.getValue();
    }

    private final void setStagingUndo(TextUndoOperation r4) {
        MutableState $this$setValue$iv = this.stagingUndo$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final boolean getCanUndo() {
        if (this.undoManager.getCanUndo$foundation_release() == false) goto L5;
    L8:
        return true;
    L5:
        if (getStagingUndo() != null) goto L8;
        return false;
    }

    public final boolean getCanRedo() {
        if (this.undoManager.getCanRedo$foundation_release() == true) goto L5;
    L7:
        return false;
    L5:
        if (getStagingUndo() != null) goto L7;
        return true;
    }

    public final void undo(TextFieldState state) {
        if (getCanUndo() == true) goto L5;
        return;
    L5:
        flush();
        TextUndoOperationKt.undo(state, this.undoManager.undo());
    }

    public final void redo(TextFieldState state) {
        if (getCanRedo() == true) goto L5;
        return;
    L5:
        TextUndoOperationKt.redo(state, this.undoManager.redo());
    }

    public final void record(TextUndoOperation op) {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r3 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        TextUndoOperation unobservedStagingUndo = getStagingUndo();     // Catch: Throwable -> L18
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        if (unobservedStagingUndo != null) goto L12;
        setStagingUndo(op);
        return;
    L12:
        TextUndoOperation mergedOp = TextUndoManagerKt.merge(unobservedStagingUndo, op);
        if (mergedOp == null) goto L16;
        setStagingUndo(mergedOp);
        return;
    L16:
        flush();
        setStagingUndo(op);
        return;
    L18:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        throw th;
    L5:
        r3 = null;
        goto L6
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.undoManager.clearHistory();
    }

    private final void flush() {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r4 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        TextUndoOperation unobservedStagingUndo = getStagingUndo();     // Catch: Throwable -> L13
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        if (unobservedStagingUndo == null) goto L11;
        this.undoManager.record(unobservedStagingUndo);
    L11:
        setStagingUndo(null);
        return;
    L13:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        throw th;
    L5:
        r4 = null;
        goto L6
    }
}
