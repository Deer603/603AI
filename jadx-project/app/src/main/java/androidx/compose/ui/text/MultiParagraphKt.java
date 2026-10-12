package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a<\u0010\u000b\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u00020\u00010\u0010H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"findParagraphByIndex", "", "paragraphInfoList", "", "Landroidx/compose/ui/text/ParagraphInfo;", "index", "findParagraphByLineIndex", "lineIndex", "findParagraphByY", "y", "", "findParagraphsByRange", "", "range", "Landroidx/compose/ui/text/TextRange;", "action", "Lkotlin/Function1;", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "fastBinarySearch", "T", "comparison", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(List<ParagraphInfo> r18, int index) {
        int lastLineEnd = ((ParagraphInfo) CollectionsKt.last(r18)).getEndIndex();
        boolean value$iv = false;
        if (index > ((ParagraphInfo) CollectionsKt.last(r18)).getEndIndex()) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("Index " + index + " should be less or equal than last line's end " + lastLineEnd);
    L9:
        int low$iv = 0;
        int high$iv = r18.size() - 1;
    L10:
        if (low$iv > high$iv) goto L23;
        int mid$iv = (low$iv + high$iv) >>> 1;
        Object midVal$iv = r18.get(mid$iv);
        ParagraphInfo paragraphInfo = (ParagraphInfo) midVal$iv;
        if (paragraphInfo.getStartIndex() <= index) goto L15;
        int cmp$iv = 1;
    L19:
        if (cmp$iv < 0) goto L20;
        if (cmp$iv <= 0) goto L25;
        high$iv = mid$iv - 1;
    L25:
        if (mid$iv < 0) goto L30;
        if (mid$iv >= r18.size()) goto L30;
        value$iv = true;
    L30:
        if (value$iv == true) goto L33;
        InlineClassHelperKt.throwIllegalArgumentException("Found paragraph index " + mid$iv + " should be in range [0, " + r18.size() + ").\nDebug info: index=" + index + ", paragraphs=[" + ListUtilsKt.fastJoinToString$default(r18, null, null, null, 0, null, MultiParagraphKt$findParagraphByIndex$2$1.INSTANCE, 31, null) + ']');
    L33:
        return mid$iv;
    L20:
        low$iv = mid$iv + 1;
        goto L10
    L15:
        if (paragraphInfo.getEndIndex() > index) goto L17;
        cmp$iv = -1;
        goto L19
    L17:
        cmp$iv = 0;
        goto L19
    L23:
        int mid$iv2 = low$iv + 1;
        mid$iv = -mid$iv2;
        goto L25
    L5:
        value$iv2 = false;
        goto L7
    }

    public static final int findParagraphByY(List<ParagraphInfo> r11, float y) {
        if (y > 0.0f) goto L6;
        return 0;
    L6:
        if (y >= ((ParagraphInfo) CollectionsKt.last(r11)).getBottom()) goto L8;
        int low$iv = 0;
        int high$iv = r11.size() - 1;
    L10:
        if (low$iv > high$iv) goto L24;
        int mid$iv = (low$iv + high$iv) >>> 1;
        Object midVal$iv = r11.get(mid$iv);
        ParagraphInfo paragraphInfo = (ParagraphInfo) midVal$iv;
        if (paragraphInfo.getTop() <= y) goto L15;
        int cmp$iv = 1;
    L19:
        if (cmp$iv < 0) goto L20;
        if (cmp$iv <= 0) goto L32;
        high$iv = mid$iv - 1;
        goto L10
    L32:
        return mid$iv;
    L20:
        low$iv = mid$iv + 1;
        goto L10
    L15:
        if (paragraphInfo.getBottom() > y) goto L17;
        cmp$iv = -1;
        goto L19
    L17:
        cmp$iv = 0;
        goto L19
    L24:
        return -(low$iv + 1);
    L8:
        return CollectionsKt.getLastIndex(r11);
    }

    /* JADX INFO: renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m6274findParagraphsByRangeSbBc2M(List<ParagraphInfo> r6, long range, Function1<? super ParagraphInfo, Unit> r9) {
        int paragraphIndex = findParagraphByIndex(r6, TextRange.m6415getMinimpl(range));
        int i = paragraphIndex;
        int r2 = r6.size();
    L3:
        if (i >= r2) goto L10;
        ParagraphInfo paragraph = r6.get(i);
        if (paragraph.getStartIndex() >= TextRange.m6414getMaximpl(range)) goto L15;
        if (paragraph.getStartIndex() == paragraph.getEndIndex()) goto L9;
        r9.invoke(paragraph);
    L9:
        i = i + 1;
        goto L3
    L15:
        return;
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> r10, int lineIndex) {
        int low$iv = 0;
        int high$iv = r10.size() - 1;
    L3:
        if (low$iv > high$iv) goto L17;
        int mid$iv = (low$iv + high$iv) >>> 1;
        Object midVal$iv = r10.get(mid$iv);
        ParagraphInfo paragraphInfo = (ParagraphInfo) midVal$iv;
        if (paragraphInfo.getStartLineIndex() <= lineIndex) goto L8;
        int cmp$iv = 1;
    L12:
        if (cmp$iv < 0) goto L13;
        if (cmp$iv <= 0) goto L25;
        high$iv = mid$iv - 1;
        goto L3
    L25:
        return mid$iv;
    L13:
        low$iv = mid$iv + 1;
        goto L3
    L8:
        if (paragraphInfo.getEndLineIndex() > lineIndex) goto L10;
        cmp$iv = -1;
        goto L12
    L10:
        cmp$iv = 0;
        goto L12
    L17:
        return -(low$iv + 1);
    }

    private static final <T> int fastBinarySearch(List<? extends T> r6, Function1<? super T, Integer> r7) {
        int low = 0;
        int high = r6.size() - 1;
    L3:
        if (low > high) goto L11;
        int mid = (low + high) >>> 1;
        Object midVal = r6.get(mid);
        int cmp = r7.invoke(midVal).intValue();
        if (cmp < 0) goto L6;
        if (cmp <= 0) goto L9;
        high = mid - 1;
        goto L3
    L9:
        return mid;
    L6:
        low = mid + 1;
        goto L3
    L11:
        return -(low + 1);
    }
}
