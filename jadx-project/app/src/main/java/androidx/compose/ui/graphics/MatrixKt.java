package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "isIdentity", "", "isIdentity-58bKbWc", "([F)Z", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MatrixKt {
    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m4620dotp89u6pk(float[] m1, int row, float[] m2, int column) {
        return (((m1[(row * 4) + 0] * m2[(0 * 4) + column]) + (m1[(row * 4) + 1] * m2[(1 * 4) + column])) + (m1[(row * 4) + 2] * m2[(2 * 4) + column])) + (m1[(row * 4) + 3] * m2[(3 * 4) + column]);
    }

    /* JADX INFO: renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m4621isIdentity58bKbWc(float[] $this$isIdentity_u2d58bKbWc) {
        if ($this$isIdentity_u2d58bKbWc.length >= 16) goto L6;
        return false;
    L6:
        if ($this$isIdentity_u2d58bKbWc[0] != 1.0f) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L11;
        return false;
    L11:
        if ($this$isIdentity_u2d58bKbWc[1] != 0.0f) goto L13;
        boolean r2 = true;
    L14:
        if (r2 == true) goto L16;
        return false;
    L16:
        if ($this$isIdentity_u2d58bKbWc[2] != 0.0f) goto L18;
        boolean r3 = true;
    L19:
        if (r3 == true) goto L21;
        return false;
    L21:
        if ($this$isIdentity_u2d58bKbWc[3] != 0.0f) goto L23;
        boolean r4 = true;
    L24:
        if (r4 == true) goto L26;
        return false;
    L26:
        if ($this$isIdentity_u2d58bKbWc[4] != 0.0f) goto L28;
        boolean r5 = true;
    L29:
        if (r5 == true) goto L31;
        return false;
    L31:
        if ($this$isIdentity_u2d58bKbWc[5] != 1.0f) goto L33;
        boolean r6 = true;
    L34:
        if (r6 == true) goto L36;
        return false;
    L36:
        if ($this$isIdentity_u2d58bKbWc[6] != 0.0f) goto L38;
        boolean r7 = true;
    L39:
        if (r7 == true) goto L41;
        return false;
    L41:
        if ($this$isIdentity_u2d58bKbWc[7] != 0.0f) goto L43;
        boolean r8 = true;
    L44:
        if (r8 == true) goto L46;
        return false;
    L46:
        if ($this$isIdentity_u2d58bKbWc[8] != 0.0f) goto L48;
        boolean r9 = true;
    L49:
        if (r9 == true) goto L51;
        return false;
    L51:
        if ($this$isIdentity_u2d58bKbWc[9] != 0.0f) goto L53;
        boolean r10 = true;
    L54:
        if (r10 == true) goto L56;
        return false;
    L56:
        if ($this$isIdentity_u2d58bKbWc[10] != 1.0f) goto L58;
        boolean r11 = true;
    L59:
        if (r11 == true) goto L61;
        return false;
    L61:
        if ($this$isIdentity_u2d58bKbWc[11] != 0.0f) goto L63;
        boolean r12 = true;
    L64:
        if (r12 == true) goto L66;
        return false;
    L66:
        if ($this$isIdentity_u2d58bKbWc[12] != 0.0f) goto L68;
        boolean r13 = true;
    L69:
        if (r13 == true) goto L71;
        return false;
    L71:
        if ($this$isIdentity_u2d58bKbWc[13] != 0.0f) goto L73;
        boolean r14 = true;
    L74:
        if (r14 == true) goto L76;
        return false;
    L76:
        if ($this$isIdentity_u2d58bKbWc[14] != 0.0f) goto L78;
        boolean r15 = true;
    L79:
        if (r15 == true) goto L81;
        return false;
    L81:
        if ($this$isIdentity_u2d58bKbWc[15] != 1.0f) goto L83;
        boolean r16 = true;
    L84:
        if (r16 == true) goto L87;
        return false;
    L87:
        return true;
    L83:
        r16 = false;
        goto L84
    L78:
        r15 = false;
        goto L79
    L73:
        r14 = false;
        goto L74
    L68:
        r13 = false;
        goto L69
    L63:
        r12 = false;
        goto L64
    L58:
        r11 = false;
        goto L59
    L53:
        r10 = false;
        goto L54
    L48:
        r9 = false;
        goto L49
    L43:
        r8 = false;
        goto L44
    L38:
        r7 = false;
        goto L39
    L33:
        r6 = false;
        goto L34
    L28:
        r5 = false;
        goto L29
    L23:
        r4 = false;
        goto L24
    L18:
        r3 = false;
        goto L19
    L13:
        r2 = false;
        goto L14
    L8:
        r1 = false;
        goto L9
    }
}
