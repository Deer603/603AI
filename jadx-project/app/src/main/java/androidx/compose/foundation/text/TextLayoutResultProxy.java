package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u0016\u0010'\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "value", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "decorationBoxCoordinates", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getDecorationBoxCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setDecorationBoxCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getInnerTextFieldCoordinates", "setInnerTextFieldCoordinates", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "getLineEnd", "", "lineIndex", "visibleEnd", "", "getLineForVerticalPosition", "vertical", "", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "coerceInVisibleBounds", "getOffsetForPosition-3MmeM6k", "(JZ)I", "isPositionOnText", "offset", "isPositionOnText-k-4lQ0M", "(J)Z", "translateDecorationToInnerCoordinates", "translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release", "(J)J", "translateInnerToDecorationCoordinates", "translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release", "coercedInVisibleBoundsOfInputText", "coercedInVisibleBoundsOfInputText-MK-Hz9U", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutResultProxy {
    public static final int $stable = 0;
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    static {
        $stable = 8;
    }

    public TextLayoutResultProxy(TextLayoutResult value, LayoutCoordinates innerTextFieldCoordinates, LayoutCoordinates decorationBoxCoordinates) {
        this.value = value;
        this.innerTextFieldCoordinates = innerTextFieldCoordinates;
        this.decorationBoxCoordinates = decorationBoxCoordinates;
    }

    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult r2, LayoutCoordinates r3, LayoutCoordinates r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = null;
    L8:
        this(r2, r3, r4);
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates r1) {
        this.innerTextFieldCoordinates = r1;
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates r1) {
        this.decorationBoxCoordinates = r1;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m1164getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy r0, long r1, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = true;
    L6:
        return r0.m1165getOffsetForPosition3MmeM6k(r1, r3);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m1165getOffsetForPosition3MmeM6k(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds == false) goto L4;
        long coercedPosition = m1163coercedInVisibleBoundsOfInputTextMKHz9U(position);
    L5:
        long relativePosition = m1167translateDecorationToInnerCoordinatesMKHz9U$foundation_release(coercedPosition);
        return this.value.m6387getOffsetForPositionk4lQ0M(relativePosition);
    L4:
        coercedPosition = position;
        goto L5
    }

    public final int getLineForVerticalPosition(float vertical) {
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(vertical);
        long coercedPosition = m1163coercedInVisibleBoundsOfInputTextMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        long arg0$iv = m1167translateDecorationToInnerCoordinatesMKHz9U$foundation_release(coercedPosition);
        int bits$iv$iv$iv = (int) (arg0$iv & 4294967295L);
        float relativeVertical = Float.intBitsToFloat(bits$iv$iv$iv);
        return this.value.getLineForVerticalPosition(relativeVertical);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.getLineEnd(r1, r2);
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        return this.value.getLineEnd(lineIndex, visibleEnd);
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m1166isPositionOnTextk4lQ0M(long offset) {
        long visibleOffset = m1163coercedInVisibleBoundsOfInputTextMKHz9U(offset);
        long relativeOffset = m1167translateDecorationToInnerCoordinatesMKHz9U$foundation_release(visibleOffset);
        int bits$iv$iv$iv = (int) (4294967295L & relativeOffset);
        int line = this.value.getLineForVerticalPosition(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (relativeOffset >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) < this.value.getLineLeft(line)) goto L7;
        int bits$iv$iv$iv3 = (int) (relativeOffset >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) > this.value.getLineRight(line)) goto L7;
        return true;
    L7:
        return false;
    }

    /* JADX INFO: renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m1167translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long offset) {
        LayoutCoordinates innerCoords = this.innerTextFieldCoordinates;
        if (innerCoords == null) goto L20;
        LayoutCoordinates decorationCoords = null;
        if (innerCoords.isAttached() == true) goto L8;
        innerCoords = null;
    L8:
        if (innerCoords == null) goto L20;
        LayoutCoordinates it = this.decorationBoxCoordinates;
        if (it != null) goto L13;
    L19:
        return offset;
    L13:
        if (it.isAttached() == false) goto L15;
        decorationCoords = it;
    L15:
        if (decorationCoords == null) goto L19;
        return innerCoords.mo5723localPositionOfR5De75A(decorationCoords, offset);
    L20:
        return offset;
    }

    /* JADX INFO: renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m1168translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long offset) {
        LayoutCoordinates innerCoords = this.innerTextFieldCoordinates;
        if (innerCoords == null) goto L20;
        LayoutCoordinates decorationCoords = null;
        if (innerCoords.isAttached() == true) goto L8;
        innerCoords = null;
    L8:
        if (innerCoords == null) goto L20;
        LayoutCoordinates it = this.decorationBoxCoordinates;
        if (it != null) goto L13;
    L19:
        return offset;
    L13:
        if (it.isAttached() == false) goto L15;
        decorationCoords = it;
    L15:
        if (decorationCoords == null) goto L19;
        return decorationCoords.mo5723localPositionOfR5De75A(innerCoords, offset);
    L20:
        return offset;
    }

    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    private final long m1163coercedInVisibleBoundsOfInputTextMKHz9U(long $this$coercedInVisibleBoundsOfInputText_u2dMK_u2dHz9U) {
        LayoutCoordinates innerTextFieldCoordinates = this.innerTextFieldCoordinates;
        if (innerTextFieldCoordinates != null) goto L5;
    L12:
        Rect visibleInnerTextFieldRect = Rect.Companion.getZero();
    L14:
        return TextLayoutResultProxyKt.m1169access$coerceIn3MmeM6k($this$coercedInVisibleBoundsOfInputText_u2dMK_u2dHz9U, visibleInnerTextFieldRect);
    L5:
        if (innerTextFieldCoordinates.isAttached() == false) goto L9;
        LayoutCoordinates r2 = this.decorationBoxCoordinates;
        visibleInnerTextFieldRect = null;
        if (r2 == null) goto L11;
        visibleInnerTextFieldRect = LayoutCoordinates.localBoundingBoxOf$default(r2, innerTextFieldCoordinates, false, 2, null);
    L11:
        if (visibleInnerTextFieldRect != null) goto L14;
    L9:
        visibleInnerTextFieldRect = Rect.Companion.getZero();
        goto L11
    }
}
