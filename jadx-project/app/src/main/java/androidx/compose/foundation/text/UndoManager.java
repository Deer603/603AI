package androidx.compose.foundation.text;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\bJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "maxStoredCharacters", "", "(I)V", "forceNextSnapshot", "", "lastSnapshot", "", "Ljava/lang/Long;", "getMaxStoredCharacters", "()I", "redoStack", "Landroidx/compose/foundation/text/UndoManager$Entry;", "storedCharacters", "undoStack", "", "makeSnapshot", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "redo", "removeLastUndo", "snapshotIfNeeded", "now", "undo", "Entry", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UndoManager {
    public static final int $stable = 0;
    private boolean forceNextSnapshot;
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    private Entry redoStack;
    private int storedCharacters;
    private Entry undoStack;

    /* JADX INFO: compiled from: UndoManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", "next", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/foundation/text/UndoManager$Entry;Landroidx/compose/ui/text/input/TextFieldValue;)V", "getNext", "()Landroidx/compose/foundation/text/UndoManager$Entry;", "setNext", "(Landroidx/compose/foundation/text/UndoManager$Entry;)V", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Entry {
        private Entry next;
        private TextFieldValue value;

        public Entry(Entry next, TextFieldValue value) {
            this.next = next;
            this.value = value;
        }

        public /* synthetic */ Entry(Entry r1, TextFieldValue r2, int r3, DefaultConstructorMarker r4) {
            if ((r3 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1, r2);
        }

        public final Entry getNext() {
            return this.next;
        }

        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(Entry r1) {
            this.next = r1;
        }

        public final void setValue(TextFieldValue r1) {
            this.value = r1;
        }
    }

    static {
        $stable = 8;
    }

    public UndoManager() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public UndoManager(int maxStoredCharacters) {
        this.maxStoredCharacters = maxStoredCharacters;
    }

    public /* synthetic */ UndoManager(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    L5:
        this(r1);
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager r0, TextFieldValue r1, long r2, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = UndoManager_jvmKt.timeNowMillis();
    L5:
        r0.snapshotIfNeeded(r1, r2);
    }

    public final void snapshotIfNeeded(TextFieldValue value, long now) {
        if (this.forceNextSnapshot == true) goto L10;
        Long r0 = this.lastSnapshot;
        if (r0 == null) goto L7;
        long r1 = r0.longValue();
    L9:
        if (now > (r1 + ((long) UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()))) goto L10;
        return;
    L7:
        r1 = 0;
    L10:
        this.lastSnapshot = Long.valueOf(now);
        makeSnapshot(value);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final void makeSnapshot(TextFieldValue value) {
        this.forceNextSnapshot = false;
        Entry r0 = this.undoStack;
        if (r0 == null) goto L5;
        TextFieldValue r1 = r0.getValue();
    L7:
        if (Intrinsics.areEqual(value, r1) == false) goto L9;
        return;
    L9:
        String r2 = value.getText();
        Entry r3 = this.undoStack;
        if (r3 == null) goto L14;
        TextFieldValue r4 = r3.getValue();
        if (r4 == null) goto L14;
        String r5 = r4.getText();
    L15:
        boolean r6 = Intrinsics.areEqual(r2, r5);
        Entry r7 = this.undoStack;
        if (r6 == false) goto L21;
        if (r7 == null) goto L25;
        r7.setValue(value);
        return;
    L25:
        return;
    L21:
        this.undoStack = new Entry(r7, value);
        this.redoStack = null;
        this.storedCharacters += value.getText().length();
        if (this.storedCharacters <= this.maxStoredCharacters) goto L26;
        removeLastUndo();
        return;
    L26:
        return;
    L14:
        r5 = null;
        goto L15
    L5:
        r1 = null;
        goto L7
    }

    private final void removeLastUndo() {
        Entry entry = this.undoStack;
        if (entry == null) goto L5;
        Entry r2 = entry.getNext();
    L6:
        if (r2 != null) goto L8;
        return;
    L8:
        if (entry == null) goto L12;
        Entry r3 = entry.getNext();
        if (r3 == null) goto L12;
        Entry r4 = r3.getNext();
    L13:
        if (r4 == null) goto L15;
        entry = entry.getNext();
        goto L8
    L15:
        if (entry == null) goto L20;
        entry.setNext(null);
        return;
    L20:
        return;
    L12:
        r4 = null;
        goto L13
    L5:
        r2 = null;
        goto L6
    }

    public final TextFieldValue undo() {
        Entry undoEntry = this.undoStack;
        if (undoEntry == null) goto L8;
        Entry nextEntry = undoEntry.getNext();
        if (nextEntry == null) goto L10;
        this.undoStack = nextEntry;
        this.storedCharacters -= undoEntry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, undoEntry.getValue());
        return nextEntry.getValue();
    L10:
        return null;
    L8:
        return null;
    }

    public final TextFieldValue redo() {
        Entry redoEntry = this.redoStack;
        if (redoEntry == null) goto L5;
        this.redoStack = redoEntry.getNext();
        this.undoStack = new Entry(this.undoStack, redoEntry.getValue());
        this.storedCharacters += redoEntry.getValue().getText().length();
        return redoEntry.getValue();
    L5:
        return null;
    }
}
