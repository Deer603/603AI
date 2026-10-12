package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

/* JADX INFO: compiled from: WordBoundary.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"getWordEnd", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", "offset", "getWordStart", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WordBoundary_androidKt {
    public static final int getWordStart(WordIterator $this$getWordStart, int offset) {
        int retOffset = $this$getWordStart.prevBoundary(offset);
        if ($this$getWordStart.isOnPunctuation(retOffset) == false) goto L5;
        int retOffset2 = $this$getWordStart.getPunctuationBeginning(offset);
    L7:
        if (retOffset2 != (-1)) goto L10;
        return offset;
    L10:
        return retOffset2;
    L5:
        retOffset2 = $this$getWordStart.getPrevWordBeginningOnTwoWordsBoundary(offset);
        goto L7
    }

    public static final int getWordEnd(WordIterator $this$getWordEnd, int offset) {
        int retOffset = $this$getWordEnd.nextBoundary(offset);
        if ($this$getWordEnd.isAfterPunctuation(retOffset) == false) goto L5;
        int retOffset2 = $this$getWordEnd.getPunctuationEnd(offset);
    L7:
        if (retOffset2 != (-1)) goto L10;
        return offset;
    L10:
        return retOffset2;
    L5:
        retOffset2 = $this$getWordEnd.getNextWordEndOnTwoWordBoundary(offset);
        goto L7
    }
}
