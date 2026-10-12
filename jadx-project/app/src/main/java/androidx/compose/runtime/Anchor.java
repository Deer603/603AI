package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "loc", "", "(I)V", "location", "getLocation$runtime_release", "()I", "setLocation$runtime_release", "valid", "", "getValid", "()Z", "toIndexFor", "slots", "Landroidx/compose/runtime/SlotTable;", "writer", "Landroidx/compose/runtime/SlotWriter;", "toString", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Anchor {
    public static final int $stable = 0;
    private int location;

    static {
        $stable = 8;
    }

    public Anchor(int loc) {
        this.location = loc;
    }

    public final int getLocation$runtime_release() {
        return this.location;
    }

    public final void setLocation$runtime_release(int r1) {
        this.location = r1;
    }

    public final boolean getValid() {
        if (this.location == Integer.MIN_VALUE) goto L5;
        return true;
    L5:
        return false;
    }

    public final int toIndexFor(SlotTable slots) {
        return slots.anchorIndex(this);
    }

    public final int toIndexFor(SlotWriter writer) {
        return writer.anchorIndex(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }
}
