package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u000f\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/AnimationData;", "", "zoom", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "degrees", "(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDegrees", "()F", "getOffset-F1C5BW0", "()J", "J", "getZoom", "component1", "component2", "component2-F1C5BW0", "component3", "copy", "copy-d-4ec7I", "(FJF)Landroidx/compose/foundation/gestures/AnimationData;", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    public /* synthetic */ AnimationData(float r1, long r2, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r4);
    }

    /* JADX INFO: renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ AnimationData m399copyd4ec7I$default(AnimationData r0, float r1, long r2, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.zoom;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.offset;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.degrees;
    L12:
        return r0.m401copyd4ec7I(r1, r2, r4);
    }

    public final float component1() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m400component2F1C5BW0() {
        return this.offset;
    }

    public final float component3() {
        return this.degrees;
    }

    /* JADX INFO: renamed from: copy-d-4ec7I, reason: not valid java name */
    public final AnimationData m401copyd4ec7I(float r7, long r8, float r10) {
        return new AnimationData(r7, r8, r10, null);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AnimationData) == true) goto L8;
        return false;
    L8:
        AnimationData r1 = (AnimationData) r8;
        if (Float.compare(this.zoom, r1.zoom) == 0) goto L12;
        return false;
    L12:
        if (Offset.m4122equalsimpl0(this.offset, r1.offset) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.degrees, r1.degrees) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Float.hashCode(this.zoom) * 31) + Offset.m4127hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.degrees);
    }

    public String toString() {
        return "AnimationData(zoom=" + this.zoom + ", offset=" + Offset.m4133toStringimpl(this.offset) + ", degrees=" + this.degrees + ')';
    }

    private AnimationData(float zoom, long offset, float degrees) {
        this.zoom = zoom;
        this.offset = offset;
        this.degrees = degrees;
    }

    public final float getDegrees() {
        return this.degrees;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m402getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getZoom() {
        return this.zoom;
    }
}
