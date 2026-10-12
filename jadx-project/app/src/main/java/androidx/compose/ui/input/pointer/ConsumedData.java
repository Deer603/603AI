package androidx.compose.ui.input.pointer;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "positionChange", "", "downChange", "(ZZ)V", "value", "getDownChange$annotations", "()V", "getDownChange", "()Z", "setDownChange", "(Z)V", "getPositionChange$annotations", "getPositionChange", "setPositionChange", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConsumedData {
    public static final int $stable = 0;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    static {
        $stable = 8;
    }

    public ConsumedData() {
        boolean r2 = false;
        this(r2, r2, 3, null);
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public ConsumedData(boolean positionChange, boolean downChange) {
        this.positionChange = positionChange;
        this.downChange = downChange;
    }

    public /* synthetic */ ConsumedData(boolean r2, boolean r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }

    public ConsumedData(PointerInputChange change) {
        this(change.getPositionChange$ui_release(), change.getDownChange$ui_release());
        this.change = change;
    }

    public final boolean getPositionChange() {
        PointerInputChange r0 = this.change;
        if (r0 == null) goto L7;
        PointerInputChange r1 = r0.getConsumedDelegate$ui_release();
        if (r1 == null) goto L7;
    L12:
        return r1.getPositionChange$ui_release();
    L7:
        r1 = this.change;
        if (r1 != null) goto L12;
        return this.positionChange;
    }

    public final void setPositionChange(boolean value) {
        PointerInputChange r0 = this.change;
        if (r0 == null) goto L5;
        PointerInputChange r1 = r0.getConsumedDelegate$ui_release();
    L6:
        if (r1 == null) goto L9;
        r1.setPositionChange$ui_release(value);
    L9:
        PointerInputChange r2 = this.change;
        if (r2 == null) goto L13;
        r2.setPositionChange$ui_release(value);
    L13:
        this.positionChange = value;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final boolean getDownChange() {
        PointerInputChange r0 = this.change;
        if (r0 == null) goto L7;
        PointerInputChange r1 = r0.getConsumedDelegate$ui_release();
        if (r1 == null) goto L7;
    L12:
        return r1.getDownChange$ui_release();
    L7:
        r1 = this.change;
        if (r1 != null) goto L12;
        return this.downChange;
    }

    public final void setDownChange(boolean value) {
        PointerInputChange r0 = this.change;
        if (r0 == null) goto L5;
        PointerInputChange r1 = r0.getConsumedDelegate$ui_release();
    L6:
        if (r1 == null) goto L9;
        r1.setDownChange$ui_release(value);
    L9:
        PointerInputChange r2 = this.change;
        if (r2 == null) goto L13;
        r2.setDownChange$ui_release(value);
    L13:
        this.downChange = value;
        return;
    L5:
        r1 = null;
        goto L6
    }
}
