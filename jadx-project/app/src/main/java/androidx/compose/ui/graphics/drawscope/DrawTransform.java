package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H&J$\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DrawTransform {

    /* JADX INFO: compiled from: DrawTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4979getCenterF1C5BW0(DrawTransform $this) {
            return DrawTransform.m4972access$getCenterF1C5BW0$jd($this);
        }

        /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static /* synthetic */ void m4978clipRectN_I0leg$default(DrawTransform r0, float r1, float r2, float r3, float r4, int r5, int r6, Object r7) {
            DrawTransform.m4974clipRectN_I0leg$default(r0, r1, r2, r3, r4, r5, r6, r7);
        }

        /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m4977clipPathmtrdDE$default(DrawTransform r0, Path r1, int r2, int r3, Object r4) {
            DrawTransform.m4973clipPathmtrdDE$default(r0, r1, r2, r3, r4);
        }

        public static /* synthetic */ void translate$default(DrawTransform r0, float r1, float r2, int r3, Object r4) {
            DrawTransform.translate$default(r0, r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ void m4980rotateUv8p0NA$default(DrawTransform r0, float r1, long r2, int r4, Object r5) {
            DrawTransform.m4975rotateUv8p0NA$default(r0, r1, r2, r4, r5);
        }

        /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
        public static /* synthetic */ void m4981scale0AR0LA0$default(DrawTransform r0, float r1, float r2, long r3, int r5, Object r6) {
            DrawTransform.m4976scale0AR0LA0$default(r0, r1, r2, r3, r5, r6);
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo4840clipPathmtrdDE(Path r1, int r2);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo4841clipRectN_I0leg(float r1, float r2, float r3, float r4, int r5);

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    long mo4843getSizeNHjbRc();

    void inset(float r1, float r2, float r3, float r4);

    /* JADX INFO: renamed from: rotate-Uv8p0NA */
    void mo4844rotateUv8p0NA(float r1, long r2);

    /* JADX INFO: renamed from: scale-0AR0LA0 */
    void mo4845scale0AR0LA0(float r1, float r2, long r3);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo4846transform58bKbWc(float[] r1);

    void translate(float r1, float r2);

    /* JADX INFO: renamed from: access$getCenter-F1C5BW0$jd, reason: not valid java name */
    static /* synthetic */ long m4972access$getCenterF1C5BW0$jd(DrawTransform $this) {
        return super.mo4842getCenterF1C5BW0();
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    default long mo4842getCenterF1C5BW0() {
        long arg0$iv = mo4843getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv) / 2.0f;
        long arg0$iv2 = mo4843getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv2) / 2.0f;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4974clipRectN_I0leg$default(DrawTransform r6, float r7, float r8, float r9, float r10, int r11, int r12, Object r13) {
        if (r13 != null) goto L21;
        if ((r12 & 1) == 0) goto L7;
        r7 = 0.0f;
    L7:
        if ((r12 & 2) == 0) goto L10;
        r8 = 0.0f;
    L10:
        if ((r12 & 4) == 0) goto L13;
        long arg0$iv = r6.mo4843getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        r9 = Float.intBitsToFloat(bits$iv$iv$iv);
    L13:
        if ((r12 & 8) == 0) goto L16;
        long arg0$iv2 = r6.mo4843getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        r10 = Float.intBitsToFloat(bits$iv$iv$iv2);
    L16:
        if ((r12 & 16) == 0) goto L18;
        r11 = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L18:
        r6.mo4841clipRectN_I0leg(r7, r8, r9, r10, r11);
        return;
    L21:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4973clipPathmtrdDE$default(DrawTransform r0, Path r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L6:
        r0.mo4840clipPathmtrdDE(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    static /* synthetic */ void translate$default(DrawTransform r1, float r2, float r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 1) == 0) goto L7;
        r2 = 0.0f;
    L7:
        if ((r4 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        r1.translate(r2, r3);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    /* JADX INFO: renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4975rotateUv8p0NA$default(DrawTransform r0, float r1, long r2, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.mo4842getCenterF1C5BW0();
    L6:
        r0.mo4844rotateUv8p0NA(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m4976scale0AR0LA0$default(DrawTransform r0, float r1, float r2, long r3, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L6;
        r3 = r0.mo4842getCenterF1C5BW0();
    L6:
        r0.mo4845scale0AR0LA0(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }
}
