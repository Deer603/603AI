package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: LayoutHelper.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010#J\u000e\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u0010\u0010%\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u001a\u0010&\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010'\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0018\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", "offset", "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getLineBidiRuns", "", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "lineIndex", "getLineBidiRuns$ui_text_release", "(I)[Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "getLineVisibleEnd", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "lineStart", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutHelper {
    public static final int $stable = 0;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    /* JADX INFO: compiled from: LayoutHelper.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        static {
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun r0, int r1, int r2, boolean r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.start;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.end;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.isRtl;
        L12:
            return r0.copy(r1, r2, r3);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int r2, int r3, boolean r4) {
            return new BidiRun(r2, r3, r4);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof BidiRun) == true) goto L8;
            return false;
        L8:
            BidiRun r1 = (BidiRun) r6;
            if (this.start == r1.start) goto L12;
            return false;
        L12:
            if (this.end == r1.end) goto L15;
            return false;
        L15:
            if (this.isRtl == r1.isRtl) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int start, int end, boolean isRtl) {
            this.start = start;
            this.end = end;
            this.isRtl = isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }
    }

    static {
        $stable = 8;
    }

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        List lineFeeds = new ArrayList();
        int paragraphEnd = 0;
    L3:
        int paragraphEnd2 = StringsKt.indexOf$default(this.layout.getText(), '\n', paragraphEnd, false, 4, null);
        if (paragraphEnd2 >= 0) goto L6;
        int paragraphEnd3 = this.layout.getText().length();
        paragraphEnd = paragraphEnd3;
    L7:
        lineFeeds.add(Integer.valueOf(paragraphEnd));
        if (paragraphEnd < this.layout.getText().length()) goto L3;
        this.paragraphEnds = lineFeeds;
        int r0 = this.paragraphEnds.size();
        ArrayList r2 = new ArrayList(r0);
        int r3 = 0;
    L10:
        if (r3 >= r0) goto L12;
        r2.add(null);
        r3 = r3 + 1;
        goto L10
    L12:
        this.paragraphBidi = r2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
        return;
    L6:
        paragraphEnd = paragraphEnd2 + 1;
        goto L7
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final Bidi analyzeBidi(int paragraphIndex) {
        if (this.bidiProcessedParagraphs[paragraphIndex] == false) goto L7;
        return this.paragraphBidi.get(paragraphIndex);
    L7:
        if (paragraphIndex != 0) goto L9;
        int paragraphStart = 0;
    L10:
        int paragraphEnd = this.paragraphEnds.get(paragraphIndex).intValue();
        int paragraphLength = paragraphEnd - paragraphStart;
        char[] buffer = this.tmpBuffer;
        if (buffer != null) goto L13;
    L16:
        char[] buffer2 = new char[paragraphLength];
    L17:
        TextUtils.getChars(this.layout.getText(), paragraphStart, paragraphEnd, buffer2, 0);
        if (Bidi.requiresBidi(buffer2, 0, paragraphLength) == true) goto L20;
        Bidi bidi = null;
    L28:
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) goto L31;
        char[] r0 = buffer2;
    L35:
        this.tmpBuffer = r0;
        return bidi;
    L31:
        if (buffer2 != this.tmpBuffer) goto L33;
        r0 = null;
        goto L35
    L33:
        r0 = this.tmpBuffer;
        goto L35
    L20:
        if (isRtlParagraph(paragraphIndex) == false) goto L22;
        int flag = 1;
    L23:
        bidi = new Bidi(buffer2, 0, null, 0, paragraphLength, flag);
        if (bidi.getRunCount() != 1) goto L28;
        bidi = null;
        goto L28
    L22:
        flag = 0;
        goto L23
    L13:
        if (buffer.length < paragraphLength) goto L16;
        buffer2 = buffer;
        goto L17
    L9:
        paragraphStart = this.paragraphEnds.get(paragraphIndex - 1).intValue();
        goto L10
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.getParagraphForOffset(r1, r2);
    }

    public final int getParagraphForOffset(int offset, boolean upstream) {
        int it = CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int paragraphIndex = it + 1;
        if (it >= 0) goto L6;
        paragraphIndex = -paragraphIndex;
    L6:
        if (upstream == false) goto L12;
        if (paragraphIndex <= 0) goto L12;
        if (offset != this.paragraphEnds.get(paragraphIndex - 1).intValue()) goto L12;
        return paragraphIndex - 1;
    L12:
        return paragraphIndex;
    }

    public final int getParagraphStart(int paragraphIndex) {
        if (paragraphIndex != 0) goto L5;
        return 0;
    L5:
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final int getParagraphEnd(int paragraphIndex) {
        return this.paragraphEnds.get(paragraphIndex).intValue();
    }

    public final boolean isRtlParagraph(int paragraphIndex) {
        int lineNumber = this.layout.getLineForOffset(getParagraphStart(paragraphIndex));
        if (this.layout.getParagraphDirection(lineNumber) != (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection, boolean upstream) {
        if (upstream == false) goto L5;
        int lineNo = LayoutCompat_androidKt.getLineForOffset(this.layout, offset, upstream);
        int lineStart = this.layout.getLineStart(lineNo);
        int lineEnd = this.layout.getLineEnd(lineNo);
        if (offset == lineStart) goto L11;
        if (offset == lineEnd) goto L11;
        return getDownstreamHorizontal(offset, usePrimaryDirection);
    L11:
        if (offset == 0) goto L131;
        if (offset == this.layout.getText().length()) goto L131;
        int paraNo = getParagraphForOffset(offset, upstream);
        boolean isParaRtl = isRtlParagraph(paraNo);
        int lineVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paraNo);
        int bidiStart = lineStart - paragraphStart;
        int bidiEnd = lineVisibleEnd - paragraphStart;
        Bidi r12 = analyzeBidi(paraNo);
        if (r12 == null) goto L18;
        Bidi lineBidi = r12.createLineBidi(bidiStart, bidiEnd);
    L20:
        if (lineBidi == null) goto L110;
        if (lineBidi.getRunCount() == 1) goto L110;
        int r15 = lineBidi.getRunCount();
        BidiRun[] runs = new BidiRun[r15];
        int r14 = 0;
    L25:
        if (r14 >= r15) goto L31;
        int lineEnd2 = lineEnd;
        int lineEnd3 = lineStart + lineBidi.getRunStart(r14);
        int paraNo2 = paraNo;
        int paraNo3 = lineStart + lineBidi.getRunLimit(r14);
        int paragraphStart2 = paragraphStart;
        int bidiStart2 = bidiStart;
        if ((lineBidi.getRunLevel(r14) % 2) != 1) goto L29;
        boolean r9 = true;
    L30:
        runs[r14] = new BidiRun(lineEnd3, paraNo3, r9);
        r14 = r14 + 1;
        bidiStart = bidiStart2;
        lineEnd = lineEnd2;
        paraNo = paraNo2;
        paragraphStart = paragraphStart2;
        goto L25
    L29:
        r9 = false;
        goto L30
    L31:
        int r2 = lineBidi.getRunCount();
        byte[] levels = new byte[r2];
        int r6 = 0;
    L32:
        if (r6 >= r2) goto L34;
        levels[r6] = (byte) lineBidi.getRunLevel(r6);
        r6 = r6 + 1;
        goto L32
    L34:
        Bidi.reorderVisually(levels, 0, runs, 0, runs.length);
        if (offset != lineStart) goto L71;
        int index$iv = 0;
        int r3 = runs.length;
    L37:
        if (index$iv >= r3) goto L45;
        BidiRun it = runs[index$iv];
        if (it.getStart() != offset) goto L41;
        boolean r7 = true;
    L42:
        if (r7 == true) goto L43;
        index$iv = index$iv + 1;
        goto L37
    L43:
        int index = index$iv;
    L46:
        BidiRun run = runs[index];
        if (usePrimaryDirection == false) goto L49;
    L52:
        if (isParaRtl == true) goto L54;
        boolean isLeftRequested = true;
    L56:
        if (index != 0) goto L61;
        if (isLeftRequested == false) goto L61;
        return this.layout.getLineLeft(lineNo);
    L61:
        if (index != ArraysKt.getLastIndex(runs)) goto L65;
        if (isLeftRequested == true) goto L65;
        return this.layout.getLineRight(lineNo);
    L65:
        Layout r10 = this.layout;
        if (isLeftRequested == false) goto L70;
        return r10.getPrimaryHorizontal(runs[index - 1].getStart());
    L70:
        return r10.getPrimaryHorizontal(runs[index + 1].getStart());
    L54:
        isLeftRequested = false;
        goto L56
    L49:
        if (isParaRtl == run.isRtl()) goto L52;
        isLeftRequested = isParaRtl;
        goto L56
    L41:
        r7 = false;
        goto L42
    L45:
        index = -1;
        goto L46
    L71:
        if (offset <= lineVisibleEnd) goto L73;
        int lineEndAdjustedOffset = lineEndToVisibleEnd(offset, lineStart);
    L74:
        int index$iv2 = 0;
        int r16 = runs.length;
    L75:
        if (index$iv2 >= r16) goto L83;
        BidiRun it2 = runs[index$iv2];
        if (it2.getEnd() != lineEndAdjustedOffset) goto L79;
        boolean r11 = true;
    L80:
        if (r11 == true) goto L84;
        index$iv2 = index$iv2 + 1;
    L84:
        BidiRun run2 = runs[index$iv2];
        if (usePrimaryDirection == false) goto L87;
    L92:
        boolean isLeftRequested2 = isParaRtl;
    L94:
        if (index$iv2 != 0) goto L99;
        if (isLeftRequested2 == false) goto L99;
        return this.layout.getLineLeft(lineNo);
    L99:
        if (index$iv2 != ArraysKt.getLastIndex(runs)) goto L103;
        if (isLeftRequested2 == true) goto L103;
        return this.layout.getLineRight(lineNo);
    L103:
        Layout r13 = this.layout;
        if (isLeftRequested2 == false) goto L108;
        return r13.getPrimaryHorizontal(runs[index$iv2 - 1].getEnd());
    L108:
        return r13.getPrimaryHorizontal(runs[index$iv2 + 1].getEnd());
    L87:
        if (isParaRtl == run2.isRtl()) goto L92;
        if (isParaRtl == true) goto L91;
        isLeftRequested2 = true;
        goto L94
    L91:
        isLeftRequested2 = false;
        goto L94
    L79:
        r11 = false;
        goto L80
    L83:
        index$iv2 = -1;
        goto L84
    L73:
        lineEndAdjustedOffset = offset;
    L110:
        boolean runDirection = this.layout.isRtlCharAt(lineStart);
        if (usePrimaryDirection == true) goto L115;
        if (isParaRtl == runDirection) goto L115;
        boolean isStartLeft = isParaRtl;
    L119:
        if (offset != lineStart) goto L121;
        boolean isOffsetLeft = isStartLeft;
    L124:
        Layout r8 = this.layout;
        if (isOffsetLeft == false) goto L128;
        return r8.getLineLeft(lineNo);
    L128:
        return r8.getLineRight(lineNo);
    L121:
        if (isStartLeft == true) goto L123;
        isOffsetLeft = true;
        goto L124
    L123:
        isOffsetLeft = false;
    L115:
        if (isParaRtl == true) goto L117;
        isStartLeft = true;
        goto L119
    L117:
        isStartLeft = false;
        goto L119
    L18:
        lineBidi = null;
    L131:
        return getDownstreamHorizontal(offset, usePrimaryDirection);
    L5:
        return getDownstreamHorizontal(offset, usePrimaryDirection);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    private final float getDownstreamHorizontal(int offset, boolean primary) {
        int lineNo = this.layout.getLineForOffset(offset);
        int lineEnd = this.layout.getLineEnd(lineNo);
        int targetOffset = RangesKt.coerceAtMost(offset, lineEnd);
        Layout r3 = this.layout;
        if (primary == false) goto L6;
        return r3.getPrimaryHorizontal(targetOffset);
    L6:
        return r3.getSecondaryHorizontal(targetOffset);
    }

    private final int lineEndToVisibleEnd(int lineEnd, int lineStart) {
        int visibleEnd = lineEnd;
    L3:
        if (visibleEnd <= lineStart) goto L8;
        if (isLineEndSpace(this.layout.getText().charAt(visibleEnd - 1)) == false) goto L8;
        visibleEnd = visibleEnd - 1;
    L8:
        return visibleEnd;
    }

    public final BidiRun[] getLineBidiRuns$ui_text_release(int lineIndex) {
        int lineStart = this.layout.getLineStart(lineIndex);
        int lineEnd = this.layout.getLineEnd(lineIndex);
        boolean r5 = false;
        char r6 = 2;
        int paragraphIndex = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphIndex);
        int bidiStart = lineStart - paragraphStart;
        int bidiEnd = lineEnd - paragraphStart;
        Bidi r10 = analyzeBidi(paragraphIndex);
        if (r10 == null) goto L17;
        Bidi lineBidi = r10.createLineBidi(bidiStart, bidiEnd);
        if (lineBidi == null) goto L17;
        int r12 = lineBidi.getRunCount();
        BidiRun[] r13 = new BidiRun[r12];
        int r14 = 0;
    L8:
        if (r14 >= r12) goto L14;
        boolean r17 = r5;
        int r7 = lineStart + lineBidi.getRunStart(r14);
        char r18 = r6;
        int r8 = lineStart + lineBidi.getRunLimit(r14);
        if ((lineBidi.getRunLevel(r14) % 2) != 1) goto L12;
        boolean r1 = true;
    L13:
        r13[r14] = new BidiRun(r7, r8, r1);
        r14 = r14 + 1;
        r5 = r17;
        r6 = r18;
        goto L8
    L12:
        r1 = r17;
        goto L13
    L14:
        return r13;
    L17:
        return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
    }

    public final boolean isLineEndSpace(char c) {
        if (c != ' ') goto L5;
    L20:
        return true;
    L5:
        if (c == '\n') goto L20;
        if (c == 5760) goto L20;
        if (Intrinsics.compare(c, 8192) < 0) goto L15;
        if (Intrinsics.compare(c, 8202) > 0) goto L15;
        if (c != 8199) goto L20;
    L15:
        if (c == 8287) goto L20;
        if (c == 12288) goto L20;
        return false;
    }
}
