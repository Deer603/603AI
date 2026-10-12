package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImeEditCommand.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\f\u0010\u0010\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0001\u001a$\u0010\u0015\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0016H\u0001\u001a\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a8\u0010\u0018\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001c0\u001bj\u0002`\u001d\u0018\u00010\u001aH\u0000\u001a\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¨\u0006\u001f"}, d2 = {"isSurrogatePair", "", "high", "", "low", "commitText", "", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "text", "", "newCursorPosition", "", "deleteSurroundingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingTextInCodePoints", "finishComposingText", "imeDelete", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "imeReplace", "", "setComposingRegion", "setComposingText", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "setSelection", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImeEditCommand_androidKt {
    public static final /* synthetic */ boolean access$isSurrogatePair(char high, char low) {
        return isSurrogatePair(high, low);
    }

    public static final void commitText(ImeEditCommandScope $this$commitText, final String text, final int newCursorPosition) {
        $this$commitText.edit(new AnonymousClass1(text, newCursorPosition));
    }

    public static final void setComposingRegion(ImeEditCommandScope $this$setComposingRegion, final int start, final int end) {
        $this$setComposingRegion.edit(new C03641(start, end));
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope r0, String r1, int r2, List r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        setComposingText(r0, r1, r2, r3);
    }

    public static final void setComposingText(ImeEditCommandScope $this$setComposingText, final String text, final int newCursorPosition, final List<AnnotatedString.Range<AnnotatedString.Annotation>> r4) {
        $this$setComposingText.edit(new C03651(text, r4, newCursorPosition));
    }

    public static final void deleteSurroundingText(ImeEditCommandScope $this$deleteSurroundingText, final int lengthBeforeCursor, final int lengthAfterCursor) {
        $this$deleteSurroundingText.edit(new C03611(lengthBeforeCursor, lengthAfterCursor));
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope $this$deleteSurroundingTextInCodePoints, final int lengthBeforeCursor, final int lengthAfterCursor) {
        $this$deleteSurroundingTextInCodePoints.edit(new C03621(lengthBeforeCursor, lengthAfterCursor));
    }

    public static final void finishComposingText(ImeEditCommandScope $this$finishComposingText) {
        $this$finishComposingText.edit(C03631.INSTANCE);
    }

    public static final void setSelection(final ImeEditCommandScope $this$setSelection, final int start, final int end) {
        $this$setSelection.edit(new C03661($this$setSelection, start, end));
    }

    private static final boolean isSurrogatePair(char high, char low) {
        if (Character.isHighSurrogate(high) == true) goto L5;
    L7:
        return false;
    L5:
        if (Character.isLowSurrogate(low) == false) goto L7;
        return true;
    }

    public static final void imeReplace(TextFieldBuffer $this$imeReplace, int start, int end, CharSequence text) {
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        int i = 0;
        int cMin = min;
    L3:
        if (cMin >= max) goto L9;
        if (i >= text.length()) goto L9;
        if (text.charAt(i) != $this$imeReplace.asCharSequence().charAt(cMin)) goto L9;
        i = i + 1;
        cMin = cMin + 1;
    L9:
        int j = text.length();
        int cMax = max;
    L10:
        if (cMax <= cMin) goto L15;
        if (j <= i) goto L15;
        if (text.charAt(j - 1) != $this$imeReplace.asCharSequence().charAt(cMax - 1)) goto L15;
        j = j - 1;
        cMax = cMax - 1;
    L15:
        if (cMin != cMax) goto L19;
        if (i != j) goto L19;
        $this$imeReplace.commitComposition$foundation_release();
        $this$imeReplace.clearHighlight$foundation_release();
    L20:
        $this$imeReplace.m1182setSelection5zctL8(TextRangeKt.TextRange(text.length() + min));
        return;
    L19:
        $this$imeReplace.replace(cMin, cMax, text.subSequence(i, j));
        goto L20
    }

    public static final void imeDelete(TextFieldBuffer $this$imeDelete, int start, int end) {
        TextRange initialComposition = $this$imeDelete.m1178getCompositionMzsxiRA$foundation_release();
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        TextFieldBufferKt.delete($this$imeDelete, min, max);
        if (initialComposition == null) goto L9;
        initialComposition.m6421unboximpl();
        long adjustedComposition = TextFieldBufferKt.m1186adjustTextRangevJH6DeI(initialComposition.m6421unboximpl(), min, max, 0);
        if (TextRange.m6411getCollapsedimpl(adjustedComposition) == false) goto L7;
        $this$imeDelete.commitComposition$foundation_release();
        return;
    L7:
        TextFieldBuffer.setComposition$foundation_release$default($this$imeDelete, TextRange.m6415getMinimpl(adjustedComposition), TextRange.m6414getMaximpl(adjustedComposition), null, 4, null);
        return;
    }
}
