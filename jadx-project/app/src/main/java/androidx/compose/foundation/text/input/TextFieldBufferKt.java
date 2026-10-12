package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextFieldBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a{\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2`\u0010\u000e\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u000fH\u0080\b\u001a\u001a\u0010\u0016\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004\u001aE\u0010\u001a\u001a\u00020\n*\u00020\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u001dH\u0087\b\u001aE\u0010\u001f\u001a\u00020\n*\u00020\u001b26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\n0\u001dH\u0087\b\u001a\u001a\u0010 \u001a\u00020\n*\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#\u001a\n\u0010$\u001a\u00020\n*\u00020\u0017\u001a\n\u0010%\u001a\u00020\n*\u00020\u0017\u001a\u001e\u0010&\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"adjustTextRange", "Landroidx/compose/ui/text/TextRange;", "originalRange", "replaceStart", "", "replaceEnd", "insertedTextLength", "adjustTextRange-vJH6DeI", "(JIII)J", "findCommonPrefixAndSuffix", "", "a", "", "b", "onFound", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", "delete", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "forEachChange", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "block", "Lkotlin/Function2;", "range", "forEachChangeReversed", "insert", "index", "text", "", "placeCursorAtEnd", "selectAll", "setSelectionCoerced", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldBufferKt {
    /* JADX INFO: renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    public static final long m1186adjustTextRangevJH6DeI(long originalRange, int replaceStart, int replaceEnd, int insertedTextLength) {
        int selStart = TextRange.m6415getMinimpl(originalRange);
        int selEnd = TextRange.m6414getMaximpl(originalRange);
        if (selEnd >= replaceStart) goto L5;
        return originalRange;
    L5:
        if (selStart > replaceStart) goto L11;
        if (replaceEnd > selEnd) goto L11;
        int diff = insertedTextLength - (replaceEnd - replaceStart);
        if (selStart != selEnd) goto L10;
        selStart = selStart + diff;
    L10:
        int selEnd2 = selEnd + diff;
    L20:
        return TextRangeKt.TextRange(selStart, selEnd2);
    L11:
        if (selStart <= replaceStart) goto L14;
        if (selEnd >= replaceEnd) goto L14;
        selStart = replaceStart + insertedTextLength;
        selEnd2 = replaceStart + insertedTextLength;
    L14:
        if (selStart < replaceEnd) goto L16;
        int diff2 = insertedTextLength - (replaceEnd - replaceStart);
        selStart = selStart + diff2;
        selEnd2 = selEnd + diff2;
        goto L20
    L16:
        if (replaceStart >= selStart) goto L18;
        selStart = replaceStart + insertedTextLength;
        selEnd2 = selEnd + (insertedTextLength - (replaceEnd - replaceStart));
        goto L20
    L18:
        selEnd2 = replaceStart;
        goto L20
    }

    public static final void insert(TextFieldBuffer $this$insert, int index, String text) {
        $this$insert.replace(index, index, text);
    }

    public static final void delete(TextFieldBuffer $this$delete, int start, int end) {
        $this$delete.replace(start, end, "");
    }

    public static final void placeCursorAtEnd(TextFieldBuffer $this$placeCursorAtEnd) {
        $this$placeCursorAtEnd.placeCursorBeforeCharAt($this$placeCursorAtEnd.getLength());
    }

    public static final void selectAll(TextFieldBuffer $this$selectAll) {
        $this$selectAll.m1182setSelection5zctL8(TextRangeKt.TextRange(0, $this$selectAll.getLength()));
    }

    public static final void forEachChange(TextFieldBuffer.ChangeList $this$forEachChange, Function2<? super TextRange, ? super TextRange, Unit> r6) {
        int i = 0;
    L4:
        if (i >= $this$forEachChange.getChangeCount()) goto L6;
        r6.invoke(TextRange.m6405boximpl($this$forEachChange.mo1185getRangejx7JFs(i)), TextRange.m6405boximpl($this$forEachChange.mo1184getOriginalRangejx7JFs(i)));
        i = i + 1;
        goto L4
    }

    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList $this$forEachChangeReversed, Function2<? super TextRange, ? super TextRange, Unit> r6) {
        int i = $this$forEachChangeReversed.getChangeCount() - 1;
    L3:
        if (i < 0) goto L5;
        r6.invoke(TextRange.m6405boximpl($this$forEachChangeReversed.mo1185getRangejx7JFs(i)), TextRange.m6405boximpl($this$forEachChangeReversed.mo1184getOriginalRangejx7JFs(i)));
        i = i - 1;
        goto L3
    }

    public static final void findCommonPrefixAndSuffix(CharSequence a, CharSequence b, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r11) {
        int aStart = 0;
        int aEnd = a.length();
        int bStart = 0;
        int bEnd = b.length();
        boolean r6 = false;
        if (a.length() <= 0) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == true) goto L8;
    L26:
        if (aStart < aEnd) goto L29;
        if (bStart < bEnd) goto L29;
        return;
    L29:
        r11.invoke(Integer.valueOf(aStart), Integer.valueOf(aEnd), Integer.valueOf(bStart), Integer.valueOf(bEnd));
        return;
    L8:
        if (b.length() <= 0) goto L10;
        r6 = true;
    L10:
        if (r6 == false) goto L26;
        boolean prefixFound = false;
        boolean suffixFound = false;
    L12:
        if (prefixFound == false) goto L14;
    L17:
        if (suffixFound == false) goto L19;
    L22:
        if (aStart >= aEnd) goto L26;
        if (bStart >= bEnd) goto L26;
        if (prefixFound == false) goto L12;
        if (suffixFound == false) goto L12;
    L19:
        if (a.charAt(aEnd - 1) != b.charAt(bEnd - 1)) goto L21;
        aEnd = aEnd - 1;
        bEnd = bEnd - 1;
        goto L22
    L21:
        suffixFound = true;
        goto L22
    L14:
        if (a.charAt(aStart) != b.charAt(bStart)) goto L16;
        aStart = aStart + 1;
        bStart = bStart + 1;
        goto L17
    L16:
        prefixFound = true;
        goto L17
    L5:
        r5 = false;
        goto L6
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = r1;
    L5:
        setSelectionCoerced(r0, r1, r2);
    }

    public static final void setSelectionCoerced(TextFieldBuffer $this$setSelectionCoerced, int start, int end) {
        $this$setSelectionCoerced.m1182setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(start, 0, $this$setSelectionCoerced.getLength()), RangesKt.coerceIn(end, 0, $this$setSelectionCoerced.getLength())));
    }
}
