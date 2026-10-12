package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: RectManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\r\u001a\u00020\u0002*\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0002*\u00020\u0001H\u0082\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\u0007\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"hasNonTranslationComponents", "", "", "getHasNonTranslationComponents$annotations", "(I)V", "getHasNonTranslationComponents", "(I)Z", "isIdentity", "isIdentity$annotations", "isSet", "Landroidx/compose/ui/unit/IntOffset;", "isSet--gyyYBs", "(J)Z", "analyzeComponents", "Landroidx/compose/ui/graphics/Matrix;", "analyzeComponents-58bKbWc", "([F)I", "toInt", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RectManagerKt {
    /* JADX INFO: renamed from: access$analyzeComponents-58bKbWc, reason: not valid java name */
    public static final /* synthetic */ int m6207access$analyzeComponents58bKbWc(float[] $receiver) {
        return m6209analyzeComponents58bKbWc($receiver);
    }

    /* JADX INFO: renamed from: access$isSet--gyyYBs, reason: not valid java name */
    public static final /* synthetic */ boolean m6208access$isSetgyyYBs(long $receiver) {
        return m6210isSetgyyYBs($receiver);
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int r0) {
    }

    private static /* synthetic */ void isIdentity$annotations(int r0) {
    }

    /* JADX INFO: renamed from: isSet--gyyYBs, reason: not valid java name */
    private static final boolean m6210isSetgyyYBs(long $this$isSet) {
        return !IntOffset.m7100equalsimpl0($this$isSet, IntOffset.Companion.m7111getMaxnOccac());
    }

    /* JADX INFO: renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    private static final int m6209analyzeComponents58bKbWc(float[] $this$analyzeComponents_u2d58bKbWc) {
        int r3 = 0;
        if ($this$analyzeComponents_u2d58bKbWc.length >= 16) goto L6;
        return 0;
    L6:
        if ($this$analyzeComponents_u2d58bKbWc[0] != 1.0f) goto L8;
        boolean r1 = true;
    L10:
        if (r1 == true) goto L12;
    L52:
        boolean isIdentity3x3 = false;
    L54:
        if ($this$analyzeComponents_u2d58bKbWc[12] != 0.0f) goto L56;
        boolean r6 = true;
    L57:
        if (r6 == true) goto L59;
    L74:
        boolean hasNoTranslationComponents = false;
    L75:
        boolean $this$toInt$iv = isIdentity3x3;
        if ($this$toInt$iv == false) goto L78;
        int r5 = 1;
    L79:
        int r7 = r5 << 1;
        boolean $this$toInt$iv2 = hasNoTranslationComponents;
        if ($this$toInt$iv2 == false) goto L83;
        r3 = 1;
    L83:
        return r3 | r7;
    L78:
        r5 = 0;
        goto L79
    L59:
        if ($this$analyzeComponents_u2d58bKbWc[13] != 0.0f) goto L61;
        boolean r8 = true;
    L62:
        if (r8 == false) goto L74;
        if ($this$analyzeComponents_u2d58bKbWc[14] != 0.0f) goto L66;
        boolean r9 = true;
    L67:
        if (r9 == false) goto L74;
        if ($this$analyzeComponents_u2d58bKbWc[15] != 1.0f) goto L71;
        boolean r2 = true;
    L72:
        if (r2 == false) goto L74;
        hasNoTranslationComponents = true;
        goto L75
    L71:
        r2 = false;
        goto L72
    L66:
        r9 = false;
        goto L67
    L61:
        r8 = false;
        goto L62
    L56:
        r6 = false;
        goto L57
    L12:
        if ($this$analyzeComponents_u2d58bKbWc[1] != 0.0f) goto L14;
        boolean r4 = true;
    L15:
        if (r4 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[2] != 0.0f) goto L19;
        boolean r10 = true;
    L20:
        if (r10 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[4] != 0.0f) goto L24;
        boolean r11 = true;
    L25:
        if (r11 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[5] != 1.0f) goto L29;
        boolean r12 = true;
    L30:
        if (r12 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[6] != 0.0f) goto L34;
        boolean r13 = true;
    L35:
        if (r13 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[8] != 0.0f) goto L39;
        boolean r14 = true;
    L40:
        if (r14 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[9] != 0.0f) goto L44;
        boolean r15 = true;
    L45:
        if (r15 == false) goto L52;
        if ($this$analyzeComponents_u2d58bKbWc[10] != 1.0f) goto L49;
        boolean r16 = true;
    L50:
        if (r16 == false) goto L52;
        isIdentity3x3 = true;
        goto L54
    L49:
        r16 = false;
        goto L50
    L44:
        r15 = false;
        goto L45
    L39:
        r14 = false;
        goto L40
    L34:
        r13 = false;
        goto L35
    L29:
        r12 = false;
        goto L30
    L24:
        r11 = false;
        goto L25
    L19:
        r10 = false;
        goto L20
    L14:
        r4 = false;
        goto L15
    L8:
        r1 = false;
        goto L10
    }

    private static final boolean isIdentity(int $this$isIdentity) {
        if ($this$isIdentity != 3) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean getHasNonTranslationComponents(int $this$hasNonTranslationComponents) {
        if (($this$hasNonTranslationComponents & 2) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    private static final int toInt(boolean r1) {
        return r1 ? 1 : 0;
    }
}
