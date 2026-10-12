package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CutCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016JB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/CutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    static {
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public /* bridge */ /* synthetic */ CornerBasedShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        return copy(topStart, topEnd, bottomEnd, bottomStart);
    }

    public CutCornerShape(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public Outline mo1001createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, LayoutDirection layoutDirection) {
        if ((((topStart + topEnd) + bottomStart) + bottomEnd) != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L26;
        Path $this$createOutline_LjSzlW0_u24lambda_u240 = AndroidPath_androidKt.Path();
        if (layoutDirection != LayoutDirection.Ltr) goto L11;
        float cornerSize = topStart;
    L12:
        $this$createOutline_LjSzlW0_u24lambda_u240.moveTo(0.0f, cornerSize);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(cornerSize, 0.0f);
        if (layoutDirection != LayoutDirection.Ltr) goto L15;
        float cornerSize2 = topEnd;
    L16:
        int bits$iv$iv$iv = (int) (size >> 32);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(Float.intBitsToFloat(bits$iv$iv$iv) - cornerSize2, 0.0f);
        int bits$iv$iv$iv2 = (int) (size >> 32);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(Float.intBitsToFloat(bits$iv$iv$iv2), cornerSize2);
        if (layoutDirection != LayoutDirection.Ltr) goto L19;
        float cornerSize3 = bottomEnd;
    L20:
        int bits$iv$iv$iv3 = (int) (size >> 32);
        int bits$iv$iv$iv4 = (int) (size & 4294967295L);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4) - cornerSize3);
        int bits$iv$iv$iv5 = (int) (size >> 32);
        int bits$iv$iv$iv6 = (int) (size & 4294967295L);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(Float.intBitsToFloat(bits$iv$iv$iv5) - cornerSize3, Float.intBitsToFloat(bits$iv$iv$iv6));
        if (layoutDirection != LayoutDirection.Ltr) goto L23;
        float cornerSize4 = bottomStart;
    L24:
        int bits$iv$iv$iv7 = (int) (size & 4294967295L);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(cornerSize4, Float.intBitsToFloat(bits$iv$iv$iv7));
        int bits$iv$iv$iv8 = (int) (size & 4294967295L);
        $this$createOutline_LjSzlW0_u24lambda_u240.lineTo(0.0f, Float.intBitsToFloat(bits$iv$iv$iv8) - cornerSize4);
        $this$createOutline_LjSzlW0_u24lambda_u240.close();
        return new Outline.Generic($this$createOutline_LjSzlW0_u24lambda_u240);
    L23:
        cornerSize4 = bottomEnd;
        goto L24
    L19:
        cornerSize3 = bottomStart;
        goto L20
    L15:
        cornerSize2 = topStart;
        goto L16
    L11:
        cornerSize = topEnd;
        goto L12
    L26:
        return new Outline.Rectangle(SizeKt.m4215toRectuvyYCjk(size));
    L5:
        r1 = false;
        goto L6
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public CutCornerShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        return new CutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof CutCornerShape) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(getTopStart(), ((CutCornerShape) other).getTopStart()) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(getTopEnd(), ((CutCornerShape) other).getTopEnd()) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(getBottomEnd(), ((CutCornerShape) other).getBottomEnd()) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(getBottomStart(), ((CutCornerShape) other).getBottomStart()) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int result = getTopStart().hashCode();
        int result2 = (result * 31) + getTopEnd().hashCode();
        return (((result2 * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }
}
