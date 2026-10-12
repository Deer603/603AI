package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\n\u0010-\u001a\u00020.*\u00020.J\n\u0010-\u001a\u00020/*\u00020/J\u001e\u0010-\u001a\u000200*\u0002002\b\b\u0002\u00101\u001a\u00020(ø\u0001\u0000¢\u0006\u0004\b2\u00103J\n\u00104\u001a\u00020\u0005*\u00020\u0005J\n\u00105\u001a\u00020\u0005*\u00020\u0005J\n\u00106\u001a\u00020\n*\u00020\nJ\u0014\u00107\u001a\u000208*\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\n\u00107\u001a\u00020.*\u00020.J\n\u0010;\u001a\u00020\u0005*\u00020\u0005J\n\u0010<\u001a\u00020\u0005*\u00020\u0005J\n\u0010=\u001a\u00020\n*\u00020\nR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "startIndex", "", "endIndex", "startLineIndex", "endLineIndex", "top", "", "bottom", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "getBottom", "()F", "setBottom", "(F)V", "getEndIndex", "()I", "getEndLineIndex", "setEndLineIndex", "(I)V", "length", "getLength", "getParagraph", "()Landroidx/compose/ui/text/Paragraph;", "getStartIndex", "getStartLineIndex", "setStartLineIndex", "getTop", "setTop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "toGlobal", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "treatZeroAsNull", "toGlobal-xdX6-G0", "(JZ)J", "toGlobalIndex", "toGlobalLineIndex", "toGlobalYPosition", "toLocal", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocalIndex", "toLocalLineIndex", "toLocalYPosition", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParagraphInfo {
    public static final int $stable = 0;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    static {
        $stable = 8;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo r0, Paragraph r1, int r2, int r3, int r4, int r5, float r6, float r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.paragraph;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.startIndex;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.endIndex;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.startLineIndex;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.endLineIndex;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.top;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.bottom;
    L23:
        float r10 = r6;
        float r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        Paragraph r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph r9, int r10, int r11, int r12, int r13, float r14, float r15) {
        return new ParagraphInfo(r9, r10, r11, r12, r13, r14, r15);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof ParagraphInfo) == true) goto L8;
        return false;
    L8:
        ParagraphInfo r1 = (ParagraphInfo) r6;
        if (Intrinsics.areEqual(this.paragraph, r1.paragraph) == true) goto L12;
        return false;
    L12:
        if (this.startIndex == r1.startIndex) goto L15;
        return false;
    L15:
        if (this.endIndex == r1.endIndex) goto L18;
        return false;
    L18:
        if (this.startLineIndex == r1.startLineIndex) goto L21;
        return false;
    L21:
        if (this.endLineIndex == r1.endLineIndex) goto L24;
        return false;
    L24:
        if (Float.compare(this.top, r1.top) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.bottom, r1.bottom) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public ParagraphInfo(Paragraph paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
        this.paragraph = paragraph;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.startLineIndex = startLineIndex;
        this.endLineIndex = endLineIndex;
        this.top = top;
        this.bottom = bottom;
    }

    public /* synthetic */ ParagraphInfo(Paragraph r2, int r3, int r4, int r5, int r6, float r7, float r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 8) == 0) goto L6;
        r5 = -1;
    L6:
        if ((r9 & 16) == 0) goto L9;
        r6 = -1;
    L9:
        if ((r9 & 32) == 0) goto L12;
        r7 = -1.0f;
    L12:
        if ((r9 & 64) == 0) goto L14;
        float r11 = -1.0f;
    L15:
        float r12 = r7;
        this(r2, r3, r4, r5, r6, r12, r11);
        return;
    L14:
        r11 = r8;
        goto L15
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final void setStartLineIndex(int r1) {
        this.startLineIndex = r1;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final void setEndLineIndex(int r1) {
        this.endLineIndex = r1;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setTop(float r1) {
        this.top = r1;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final void setBottom(float r1) {
        this.bottom = r1;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final int toLocalIndex(int $this$toLocalIndex) {
        return RangesKt.coerceIn($this$toLocalIndex, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toGlobalIndex(int $this$toGlobalIndex) {
        return this.startIndex + $this$toGlobalIndex;
    }

    public final int toLocalLineIndex(int $this$toLocalLineIndex) {
        return $this$toLocalLineIndex - this.startLineIndex;
    }

    public final int toGlobalLineIndex(int $this$toGlobalLineIndex) {
        return this.startLineIndex + $this$toGlobalLineIndex;
    }

    public final float toGlobalYPosition(float $this$toGlobalYPosition) {
        return this.top + $this$toGlobalYPosition;
    }

    public final float toLocalYPosition(float $this$toLocalYPosition) {
        return $this$toLocalYPosition - this.top;
    }

    /* JADX INFO: renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m6283toLocalMKHz9U(long $this$toLocal_u2dMK_u2dHz9U) {
        int bits$iv$iv$iv = (int) ($this$toLocal_u2dMK_u2dHz9U >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) ($this$toLocal_u2dMK_u2dHz9U & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv2) - this.top;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public final Rect toGlobal(Rect $this$toGlobal) {
        float y$iv = this.top;
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return $this$toGlobal.m4162translatek4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
    }

    public final Rect toLocal(Rect $this$toLocal) {
        float y$iv = -this.top;
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return $this$toLocal.m4162translatek4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
    }

    public final Path toGlobal(Path $this$toGlobal) {
        float y$iv = this.top;
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        $this$toGlobal.mo4261translatek4lQ0M(Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
        return $this$toGlobal;
    }

    /* JADX INFO: renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m6281toGlobalxdX6G0$default(ParagraphInfo r0, long r1, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r3 = true;
    L6:
        return r0.m6282toGlobalxdX6G0(r1, r3);
    }

    /* JADX INFO: renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m6282toGlobalxdX6G0(long $this$toGlobal_u2dxdX6_u2dG0, boolean treatZeroAsNull) {
        if (treatZeroAsNull == false) goto L8;
        if (TextRange.m6410equalsimpl0($this$toGlobal_u2dxdX6_u2dG0, TextRange.Companion.m6422getZerod9O1mEE()) == false) goto L8;
        return TextRange.Companion.m6422getZerod9O1mEE();
    L8:
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m6417getStartimpl($this$toGlobal_u2dxdX6_u2dG0)), toGlobalIndex(TextRange.m6412getEndimpl($this$toGlobal_u2dxdX6_u2dG0)));
    }
}
