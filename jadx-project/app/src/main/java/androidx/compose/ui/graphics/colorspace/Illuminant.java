package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

/* JADX INFO: compiled from: Illuminant.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u001cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "()V", "A", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "B", "getB", "C", "getC", "D50", "getD50", "D50Xyz", "", "getD50Xyz$ui_graphics_release", "()[F", "D55", "getD55", "D60", "getD60", "D65", "getD65", "D75", "getD75", "E", "getE", "newD50Xyz", "newD50Xyz$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Illuminant {
    private static final WhitePoint A = null;
    private static final WhitePoint B = null;
    private static final WhitePoint C = null;
    private static final WhitePoint D50 = null;
    private static final float[] D50Xyz = null;
    private static final WhitePoint D55 = null;
    private static final WhitePoint D60 = null;
    private static final WhitePoint D65 = null;
    private static final WhitePoint D75 = null;
    private static final WhitePoint E = null;
    public static final Illuminant INSTANCE = null;

    private Illuminant() {
    }

    static {
        INSTANCE = new Illuminant();
        A = new WhitePoint(0.44757f, 0.40745f);
        B = new WhitePoint(0.34842f, 0.35161f);
        C = new WhitePoint(0.31006f, 0.31616f);
        D50 = new WhitePoint(0.34567f, 0.3585f);
        D55 = new WhitePoint(0.33242f, 0.34743f);
        D60 = new WhitePoint(0.32168f, 0.33767f);
        D65 = new WhitePoint(0.31271f, 0.32902f);
        D75 = new WhitePoint(0.29902f, 0.31485f);
        E = new WhitePoint(0.33333f, 0.33333f);
        D50Xyz = new float[]{0.964212f, 1.0f, 0.825188f};
    }

    public final WhitePoint getA() {
        return A;
    }

    public final WhitePoint getB() {
        return B;
    }

    public final WhitePoint getC() {
        return C;
    }

    public final WhitePoint getD50() {
        return D50;
    }

    public final WhitePoint getD55() {
        return D55;
    }

    public final WhitePoint getD60() {
        return D60;
    }

    public final WhitePoint getD65() {
        return D65;
    }

    public final WhitePoint getD75() {
        return D75;
    }

    public final WhitePoint getE() {
        return E;
    }

    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    public final float[] newD50Xyz$ui_graphics_release() {
        return new float[]{0.964212f, 1.0f, 0.825188f};
    }
}
