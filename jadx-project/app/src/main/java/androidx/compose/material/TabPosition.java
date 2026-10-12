package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/TabPosition;", "", "left", "Landroidx/compose/ui/unit/Dp;", "width", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLeft-D9Ej5fM", "()F", "F", "right", "getRight-D9Ej5fM", "getWidth-D9Ej5fM", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabPosition {
    public static final int $stable = 0;
    private final float left;
    private final float width;

    static {
    }

    public /* synthetic */ TabPosition(float r1, float r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private TabPosition(float left, float width) {
        this.left = left;
        this.width = width;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m1803getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1805getWidthD9Ej5fM() {
        return this.width;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m1804getRightD9Ej5fM() {
        float arg0$iv = this.left;
        float other$iv = this.width;
        return Dp.m6973constructorimpl(arg0$iv + other$iv);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TabPosition) == true) goto L9;
        return false;
    L9:
        if (Dp.m6978equalsimpl0(this.left, ((TabPosition) other).left) == true) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.width, ((TabPosition) other).width) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.left);
        return (result * 31) + Dp.m6979hashCodeimpl(this.width);
    }

    public String toString() {
        return "TabPosition(left=" + Dp.m6984toStringimpl(this.left) + ", right=" + Dp.m6984toStringimpl(m1804getRightD9Ej5fM()) + ", width=" + Dp.m6984toStringimpl(this.width) + ')';
    }
}
