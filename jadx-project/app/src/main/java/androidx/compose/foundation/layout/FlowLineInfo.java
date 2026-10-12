package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ2\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\u00020\u0006X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u0006X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineInfo;", "", "lineIndex", "", "positionInLine", "maxMainAxisSize", "Landroidx/compose/ui/unit/Dp;", "maxCrossAxisSize", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLineIndex$foundation_layout_release", "()I", "setLineIndex$foundation_layout_release", "(I)V", "getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release", "()F", "setMaxCrossAxisSize-0680j_4$foundation_layout_release", "(F)V", "F", "getMaxMainAxisSize-D9Ej5fM$foundation_layout_release", "setMaxMainAxisSize-0680j_4$foundation_layout_release", "getPositionInLine$foundation_layout_release", "setPositionInLine$foundation_layout_release", "update", "", "update-4j6BHR0$foundation_layout_release", "(IIFF)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowLineInfo {
    public static final int $stable = 0;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    static {
        $stable = 8;
    }

    public /* synthetic */ FlowLineInfo(int r1, int r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    private FlowLineInfo(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }

    public /* synthetic */ FlowLineInfo(int r8, int r9, float r10, float r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L5;
        int r2 = 0;
    L7:
        if ((r12 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r12 & 4) == 0) goto L13;
        float r4 = Dp.m6973constructorimpl(0);
    L15:
        if ((r12 & 8) == 0) goto L17;
        float r5 = Dp.m6973constructorimpl(0);
    L18:
        this(r2, r3, r4, r5, null);
        return;
    L17:
        r5 = r11;
        goto L18
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public final int getLineIndex$foundation_layout_release() {
        return this.lineIndex;
    }

    public final void setLineIndex$foundation_layout_release(int r1) {
        this.lineIndex = r1;
    }

    public final int getPositionInLine$foundation_layout_release() {
        return this.positionInLine;
    }

    public final void setPositionInLine$foundation_layout_release(int r1) {
        this.positionInLine = r1;
    }

    /* JADX INFO: renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m657getMaxMainAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxMainAxisSize;
    }

    /* JADX INFO: renamed from: setMaxMainAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m659setMaxMainAxisSize0680j_4$foundation_layout_release(float r1) {
        this.maxMainAxisSize = r1;
    }

    /* JADX INFO: renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m656getMaxCrossAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxCrossAxisSize;
    }

    /* JADX INFO: renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m658setMaxCrossAxisSize0680j_4$foundation_layout_release(float r1) {
        this.maxCrossAxisSize = r1;
    }

    /* JADX INFO: renamed from: update-4j6BHR0$foundation_layout_release, reason: not valid java name */
    public final void m660update4j6BHR0$foundation_layout_release(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }
}
