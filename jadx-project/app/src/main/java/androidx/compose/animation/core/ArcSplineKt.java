package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: ArcSpline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"ArcSplineArcAbove", "", "ArcSplineArcBelow", "ArcSplineArcStartFlip", "ArcSplineArcStartHorizontal", "ArcSplineArcStartLinear", "ArcSplineArcStartVertical", "DownArc", "Epsilon", "", "HalfPi", "LutSize", "OurPercentCache", "", "StartHorizontal", "StartLinear", "StartVertical", "UpArc", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ArcSplineKt {
    public static final int ArcSplineArcAbove = 5;
    public static final int ArcSplineArcBelow = 4;
    public static final int ArcSplineArcStartFlip = 3;
    public static final int ArcSplineArcStartHorizontal = 2;
    public static final int ArcSplineArcStartLinear = 0;
    public static final int ArcSplineArcStartVertical = 1;
    private static final int DownArc = 4;
    private static final float Epsilon = 0.001f;
    private static final float HalfPi = 1.5707964f;
    private static final int LutSize = 101;
    private static final float[] OurPercentCache = null;
    private static final int StartHorizontal = 2;
    private static final int StartLinear = 3;
    private static final int StartVertical = 1;
    private static final int UpArc = 5;

    public static final /* synthetic */ float[] access$getOurPercentCache$p() {
        return OurPercentCache;
    }

    static {
        OurPercentCache = new float[91];
    }
}
