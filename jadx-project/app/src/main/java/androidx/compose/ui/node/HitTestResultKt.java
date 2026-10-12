package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"IS_IN_EXPANDED_BOUNDS", "", "IS_IN_LAYER", "DistanceAndFlags", "Landroidx/compose/ui/node/DistanceAndFlags;", "distance", "", "isInLayer", "", "isInExpandedBounds", "(FZZ)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    public static final /* synthetic */ long access$DistanceAndFlags(float distance, boolean isInLayer, boolean isInExpandedBounds) {
        return DistanceAndFlags(distance, isInLayer, isInExpandedBounds);
    }

    static /* synthetic */ long DistanceAndFlags$default(float r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = false;
    L6:
        return DistanceAndFlags(r0, r1, r2);
    }

    private static final long DistanceAndFlags(float distance, boolean isInLayer, boolean isInExpandedBounds) {
        long v1 = Float.floatToRawIntBits(distance);
        long r2 = 0;
        if (isInLayer == false) goto L5;
        long v2 = 1;
    L6:
        if (isInExpandedBounds == false) goto L9;
        r2 = IS_IN_EXPANDED_BOUNDS;
    L9:
        return DistanceAndFlags.m5853constructorimpl((v1 << 32) | (4294967295L & (r2 | v2)));
    L5:
        v2 = 0;
        goto L6
    }
}
