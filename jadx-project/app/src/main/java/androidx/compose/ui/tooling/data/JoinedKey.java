package androidx.compose.ui.tooling.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTree.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/tooling/data/JoinedKey;", "", "left", "right", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getLeft", "()Ljava/lang/Object;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JoinedKey {
    public static final int $stable = 0;
    private final Object left;
    private final Object right;

    static {
        $stable = 8;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey r0, Object r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.left;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.right;
    L9:
        return r0.copy(r1, r2);
    }

    public final Object component1() {
        return this.left;
    }

    public final Object component2() {
        return this.right;
    }

    public final JoinedKey copy(Object r2, Object r3) {
        return new JoinedKey(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof JoinedKey) == true) goto L8;
        return false;
    L8:
        JoinedKey r1 = (JoinedKey) r6;
        if (Intrinsics.areEqual(this.left, r1.left) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.right, r1.right) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.left != null) goto L5;
        int r0 = 0;
    L6:
        int r2 = r0 * 31;
        if (this.right == null) goto L11;
        r1 = this.right.hashCode();
    L11:
        return r2 + r1;
    L5:
        r0 = this.left.hashCode();
        goto L6
    }

    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }

    public JoinedKey(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }
}
