package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChangeTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J*\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0006\u0010\u0012\u001a\u00020\rJ\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "initialChanges", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker;)V", "_changes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "_changesTemp", "changeCount", "", "getChangeCount", "()I", "appendNewChange", "", "mergedOverlappingChange", "preMin", "preMax", "postDelta", "clearChanges", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "toString", "", "trackChange", "preStart", "preEnd", "postLength", "Change", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 0;
    private MutableVector<Change> _changes;
    private MutableVector<Change> _changesTemp;

    /* JADX INFO: compiled from: ChangeTracker.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "preStart", "", "preEnd", "originalStart", "originalEnd", "(IIII)V", "getOriginalEnd", "()I", "setOriginalEnd", "(I)V", "getOriginalStart", "setOriginalStart", "getPreEnd", "setPreEnd", "getPreStart", "setPreStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public static /* synthetic */ Change copy$default(Change r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.preStart;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.preEnd;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.originalStart;
        L12:
            if ((r5 & 8) == 0) goto L15;
            r4 = r0.originalEnd;
        L15:
            return r0.copy(r1, r2, r3, r4);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        public final Change copy(int r2, int r3, int r4, int r5) {
            return new Change(r2, r3, r4, r5);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof Change) == true) goto L8;
            return false;
        L8:
            Change r1 = (Change) r6;
            if (this.preStart == r1.preStart) goto L12;
            return false;
        L12:
            if (this.preEnd == r1.preEnd) goto L15;
            return false;
        L15:
            if (this.originalStart == r1.originalStart) goto L18;
            return false;
        L18:
            if (this.originalEnd == r1.originalEnd) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ')';
        }

        public Change(int preStart, int preEnd, int originalStart, int originalEnd) {
            this.preStart = preStart;
            this.preEnd = preEnd;
            this.originalStart = originalStart;
            this.originalEnd = originalEnd;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public final void setPreStart(int r1) {
            this.preStart = r1;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final void setPreEnd(int r1) {
            this.preEnd = r1;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final void setOriginalStart(int r1) {
            this.originalStart = r1;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final void setOriginalEnd(int r1) {
            this.originalEnd = r1;
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ChangeTracker(ChangeTracker initialChanges) {
        this._changes = new MutableVector(new Change[16], 0);
        this._changesTemp = new MutableVector(new Change[16], 0);
        if (initialChanges == null) goto L11;
        MutableVector<Change> r0 = initialChanges._changes;
        if (r0 == null) goto L13;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L7:
        if (i$iv >= size$iv) goto L14;
        Change it = (Change) content$iv[i$iv];
        this._changes.add(new Change(it.getPreStart(), it.getPreEnd(), it.getOriginalStart(), it.getOriginalEnd()));
        i$iv = i$iv + 1;
        goto L7
    L14:
        return;
    L13:
        return;
    }

    public /* synthetic */ ChangeTracker(ChangeTracker r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    public final void trackChange(int preStart, int preEnd, int postLength) {
        if (preStart != preEnd) goto L5;
        if (postLength != 0) goto L5;
        return;
    L5:
        int preMin = Math.min(preStart, preEnd);
        int preMax = Math.max(preStart, preEnd);
        int i = 0;
        boolean recordedNewChange = false;
        int postDelta = postLength - (preMax - preMin);
        Change mergedOverlappingChange = null;
    L7:
        if (i >= this._changes.getSize()) goto L44;
        Change change = this._changes.content[i];
        int r7 = change.getPreStart();
        boolean r8 = true;
        if (preMin > r7) goto L12;
        if (r7 > preMax) goto L12;
        boolean r9 = true;
    L13:
        if (r9 == true) goto L40;
        int r10 = change.getPreEnd();
        if (preMin > r10) goto L18;
        if (r10 > preMax) goto L18;
        boolean r11 = true;
    L19:
        if (r11 == true) goto L40;
        int r12 = change.getPreStart();
        if (preMin > change.getPreEnd()) goto L24;
        if (r12 > preMin) goto L24;
        boolean r13 = true;
    L25:
        if (r13 == true) goto L40;
        int r14 = change.getPreStart();
        if (preMax > change.getPreEnd()) goto L30;
        if (r14 > preMax) goto L30;
    L31:
        if (r8 == true) goto L40;
        if (change.getPreStart() <= preMax) goto L37;
        if (recordedNewChange == true) goto L37;
        appendNewChange(mergedOverlappingChange, preMin, preMax, postDelta);
        recordedNewChange = true;
    L37:
        if (recordedNewChange == false) goto L39;
        change.setPreStart(change.getPreStart() + postDelta);
        change.setPreEnd(change.getPreEnd() + postDelta);
    L39:
        this._changesTemp.add(change);
        i = i + 1;
    L30:
        r8 = false;
    L24:
        r13 = false;
    L18:
        r11 = false;
    L40:
        if (mergedOverlappingChange != null) goto L42;
        mergedOverlappingChange = change;
    L43:
        i = i + 1;
        goto L7
    L42:
        mergedOverlappingChange.setPreEnd(change.getPreEnd());
        mergedOverlappingChange.setOriginalEnd(change.getOriginalEnd());
    L12:
        r9 = false;
        goto L13
    L44:
        if (recordedNewChange == true) goto L46;
        appendNewChange(mergedOverlappingChange, preMin, preMax, postDelta);
    L46:
        MutableVector<Change> r6 = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = r6;
        this._changesTemp.clear();
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* JADX INFO: renamed from: getRange--jx7JFs */
    public long mo1185getRangejx7JFs(int changeIndex) {
        Change it = this._changes.content[changeIndex];
        return TextRangeKt.TextRange(it.getPreStart(), it.getPreEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* JADX INFO: renamed from: getOriginalRange--jx7JFs */
    public long mo1184getOriginalRangejx7JFs(int changeIndex) {
        Change it = this._changes.content[changeIndex];
        return TextRangeKt.TextRange(it.getOriginalStart(), it.getOriginalEnd());
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u244 = new StringBuilder();
        $this$toString_u24lambda_u244.append("ChangeList(changes=[");
        MutableVector<Change> r3 = this._changes;
        int i$iv = 0;
        Object[] content$iv = r3.content;
        int size$iv = r3.getSize();
    L3:
        if (i$iv >= size$iv) goto L8;
        Change change = (Change) content$iv[i$iv];
        int i = i$iv;
        $this$toString_u24lambda_u244.append('(' + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
        if (i >= (getChangeCount() - 1)) goto L7;
        $this$toString_u24lambda_u244.append(", ");
    L7:
        i$iv = i$iv + 1;
        goto L3
    L8:
        $this$toString_u24lambda_u244.append("])");
        String r0 = $this$toString_u24lambda_u244.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private final void appendNewChange(Change mergedOverlappingChange, int preMin, int preMax, int postDelta) {
        int originalDelta = 0;
        if (this._changesTemp.getSize() != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L10;
        Change it = this._changesTemp.last();
        originalDelta = it.getPreEnd() - it.getOriginalEnd();
    L10:
        if (mergedOverlappingChange != null) goto L12;
        int originalStart = preMin - originalDelta;
        int originalEnd = (preMax - preMin) + originalStart;
        Change newChange = new Change(preMin, preMax + postDelta, originalStart, originalEnd);
    L19:
        this._changesTemp.add(newChange);
        return;
    L12:
        newChange = mergedOverlappingChange;
        if (newChange.getPreStart() <= preMin) goto L16;
        newChange.setPreStart(preMin);
        newChange.setOriginalStart(preMin);
    L16:
        if (preMax <= newChange.getPreEnd()) goto L18;
        int originalDelta2 = newChange.getPreEnd() - newChange.getOriginalEnd();
        newChange.setPreEnd(preMax);
        newChange.setOriginalEnd(preMax - originalDelta2);
    L18:
        int originalDelta3 = newChange.getPreEnd();
        newChange.setPreEnd(originalDelta3 + postDelta);
        goto L19
    L5:
        r2 = false;
        goto L6
    }
}
