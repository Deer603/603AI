package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Bullet.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "Landroidx/compose/ui/unit/TextUnit;", "padding", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getPadding-XSAIIZE", "()J", "J", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSize-XSAIIZE", "copy", "copy-1XB3EBo", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/Bullet;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Bullet implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long padding;
    private final Shape shape;
    private final long size;

    static {
        $stable = 8;
    }

    public /* synthetic */ Bullet(Shape r1, long r2, long r4, Brush r6, float r7, DrawStyle r8, DefaultConstructorMarker r9) {
        this(r1, r2, r4, r6, r7, r8);
    }

    private Bullet(Shape shape, long size, long padding, Brush brush, float alpha, DrawStyle drawStyle) {
        this.shape = shape;
        this.size = size;
        this.padding = padding;
        this.brush = brush;
        this.alpha = alpha;
        this.drawStyle = drawStyle;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getSize-XSAIIZE, reason: not valid java name */
    public final long m6253getSizeXSAIIZE() {
        return this.size;
    }

    /* JADX INFO: renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m6252getPaddingXSAIIZE() {
        return this.padding;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* JADX INFO: renamed from: copy-1XB3EBo$default, reason: not valid java name */
    public static /* synthetic */ Bullet m6250copy1XB3EBo$default(Bullet r0, Shape r1, long r2, long r4, Brush r6, float r7, DrawStyle r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.shape;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.size;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r0.padding;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = r0.brush;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = r0.alpha;
    L18:
        if ((r9 & 32) == 0) goto L20;
        DrawStyle r11 = r0.drawStyle;
    L21:
        long r12 = r4;
        long r5 = r2;
        Shape r3 = r1;
        return r0.m6251copy1XB3EBo(r3, r5, r12, r6, r7, r11);
    L20:
        r11 = r8;
        goto L21
    }

    /* JADX INFO: renamed from: copy-1XB3EBo, reason: not valid java name */
    public final Bullet m6251copy1XB3EBo(Shape shape, long size, long padding, Brush brush, float alpha, DrawStyle drawStyle) {
        return new Bullet(shape, size, padding, brush, alpha, drawStyle, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L32:
        return false;
    L8:
        if ((other instanceof Bullet) == false) goto L32;
        if (Intrinsics.areEqual(this.shape, ((Bullet) other).shape) == true) goto L14;
        return false;
    L14:
        if (TextUnit.m7164equalsimpl0(this.size, ((Bullet) other).size) == true) goto L17;
        return false;
    L17:
        if (TextUnit.m7164equalsimpl0(this.padding, ((Bullet) other).padding) == true) goto L20;
        return false;
    L20:
        if (Intrinsics.areEqual(this.brush, ((Bullet) other).brush) == true) goto L23;
        return false;
    L23:
        if (this.alpha != ((Bullet) other).alpha) goto L25;
        boolean r2 = true;
    L26:
        if (r2 == true) goto L29;
        return false;
    L29:
        if (Intrinsics.areEqual(this.drawStyle, ((Bullet) other).drawStyle) == true) goto L31;
        return false;
    L31:
        return true;
    L25:
        r2 = false;
        goto L26
    }

    public int hashCode() {
        int result = this.shape.hashCode();
        int result2 = (result * 31) + TextUnit.m7168hashCodeimpl(this.size);
        int result3 = ((result2 * 31) + TextUnit.m7168hashCodeimpl(this.padding)) * 31;
        Brush r2 = this.brush;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return ((((result3 + r3) * 31) + Float.hashCode(this.alpha)) * 31) + this.drawStyle.hashCode();
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + TextUnit.m7174toStringimpl(this.size) + ", padding=" + TextUnit.m7174toStringimpl(this.padding) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }
}
