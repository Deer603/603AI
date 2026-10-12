package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "applier", "offset", "", "(Landroidx/compose/runtime/Applier;I)V", "current", "getCurrent", "()Ljava/lang/Object;", "nesting", "clear", "", "down", "node", "(Ljava/lang/Object;)V", "insertBottomUp", "index", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", "from", "to", "count", "remove", "up", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 0;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    static {
        $stable = 8;
    }

    public OffsetApplier(Applier<N> r1, int offset) {
        this.applier = r1;
        this.offset = offset;
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N r2) {
        this.nesting++;
        this.applier.down(r2);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (this.nesting <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
    L9:
        this.nesting--;
        this.applier.up();
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, N r4) {
        Applier<N> r0 = this.applier;
        if (this.nesting != 0) goto L5;
        int r1 = this.offset;
    L6:
        r0.insertTopDown(r1 + index, r4);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, N r4) {
        Applier<N> r0 = this.applier;
        if (this.nesting != 0) goto L5;
        int r1 = this.offset;
    L6:
        r0.insertBottomUp(r1 + index, r4);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        Applier<N> r0 = this.applier;
        if (this.nesting != 0) goto L5;
        int r1 = this.offset;
    L6:
        r0.remove(r1 + index, count);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        if (this.nesting != 0) goto L5;
        int effectiveOffset = this.offset;
    L6:
        this.applier.move(from + effectiveOffset, to + effectiveOffset, count);
        return;
    L5:
        effectiveOffset = 0;
        goto L6
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }
}
