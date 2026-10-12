package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BorderStroke.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getWidth-D9Ej5fM", "()F", "F", "copy", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Landroidx/compose/foundation/BorderStroke;", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    static {
    }

    public /* synthetic */ BorderStroke(float r1, Brush r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private BorderStroke(float width, Brush brush) {
        this.width = width;
        this.brush = brush;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m260getWidthD9Ej5fM() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof BorderStroke) == true) goto L9;
        return false;
    L9:
        if (Dp.m6978equalsimpl0(this.width, ((BorderStroke) other).width) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.brush, ((BorderStroke) other).brush) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Dp.m6979hashCodeimpl(this.width);
        return (result * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + Dp.m6984toStringimpl(this.width) + ", brush=" + this.brush + ')';
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m258copyD5KLDUw$default(BorderStroke r0, float r1, Brush r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.width;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.brush;
    L9:
        return r0.m259copyD5KLDUw(r1, r2);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m259copyD5KLDUw(float width, Brush brush) {
        return new BorderStroke(width, brush, null);
    }
}
