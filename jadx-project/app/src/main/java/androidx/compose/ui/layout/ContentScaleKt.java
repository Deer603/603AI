package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContentScaleKt {
    /* JADX INFO: renamed from: access$computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m5708access$computeFillMaxDimensioniLBOSCw(long srcSize, long dstSize) {
        return m5711computeFillMaxDimensioniLBOSCw(srcSize, dstSize);
    }

    /* JADX INFO: renamed from: access$computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m5709access$computeFillMinDimensioniLBOSCw(long srcSize, long dstSize) {
        return m5712computeFillMinDimensioniLBOSCw(srcSize, dstSize);
    }

    /* JADX INFO: renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    private static final float m5711computeFillMaxDimensioniLBOSCw(long srcSize, long dstSize) {
        int bits$iv$iv$iv$iv = (int) (dstSize >> 32);
        int bits$iv$iv$iv$iv2 = (int) (srcSize >> 32);
        float widthScale = Float.intBitsToFloat(bits$iv$iv$iv$iv) / Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        int bits$iv$iv$iv$iv3 = (int) (dstSize & 4294967295L);
        int bits$iv$iv$iv$iv4 = (int) (4294967295L & srcSize);
        float heightScale = Float.intBitsToFloat(bits$iv$iv$iv$iv3) / Float.intBitsToFloat(bits$iv$iv$iv$iv4);
        return Math.max(widthScale, heightScale);
    }

    /* JADX INFO: renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    private static final float m5712computeFillMinDimensioniLBOSCw(long srcSize, long dstSize) {
        int bits$iv$iv$iv$iv = (int) (dstSize >> 32);
        int bits$iv$iv$iv$iv2 = (int) (srcSize >> 32);
        float widthScale = Float.intBitsToFloat(bits$iv$iv$iv$iv) / Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        int bits$iv$iv$iv$iv3 = (int) (dstSize & 4294967295L);
        int bits$iv$iv$iv$iv4 = (int) (4294967295L & srcSize);
        float heightScale = Float.intBitsToFloat(bits$iv$iv$iv$iv3) / Float.intBitsToFloat(bits$iv$iv$iv$iv4);
        return Math.min(widthScale, heightScale);
    }

    /* JADX INFO: renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    private static final float m5713computeFillWidthiLBOSCw(long srcSize, long dstSize) {
        int bits$iv$iv$iv = (int) (dstSize >> 32);
        int bits$iv$iv$iv2 = (int) (srcSize >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv) / Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    /* JADX INFO: renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    private static final float m5710computeFillHeightiLBOSCw(long srcSize, long dstSize) {
        int bits$iv$iv$iv = (int) (dstSize & 4294967295L);
        int bits$iv$iv$iv2 = (int) (4294967295L & srcSize);
        return Float.intBitsToFloat(bits$iv$iv$iv) / Float.intBitsToFloat(bits$iv$iv$iv2);
    }
}
