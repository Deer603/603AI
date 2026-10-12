package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "text", "", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "(Ljava/lang/CharSequence;Landroidx/compose/ui/text/android/selection/WordIterator;)V", "nextEndBoundary", "", "offset", "nextStartBoundary", "previousEndBoundary", "previousStartBoundary", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 0;
    private final CharSequence text;
    private final WordIterator wordIterator;

    static {
        $stable = 8;
    }

    public WordSegmentFinder(CharSequence text, WordIterator wordIterator) {
        this.text = text;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int offset) {
        int boundary = offset;
    L3:
        boundary = this.wordIterator.prevBoundary(boundary);
        if (boundary == (-1)) goto L5;
        if (Character.isWhitespace(this.text.charAt(boundary)) == true) goto L3;
        return boundary;
    L5:
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int offset) {
        int boundary = offset;
    L3:
        boundary = this.wordIterator.prevBoundary(boundary);
        switch(boundary) {
            case -1: goto L8;
            case 0: goto L8;
            default: goto L6;
        };
    L6:
        if (Character.isWhitespace(this.text.charAt(boundary - 1)) == true) goto L3;
        return boundary;
    L8:
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int offset) {
        int boundary = offset;
    L3:
        boundary = this.wordIterator.nextBoundary(boundary);
        if (boundary == (-1)) goto L11;
        if (boundary == this.text.length()) goto L11;
        if (Character.isWhitespace(this.text.charAt(boundary)) == true) goto L3;
        return boundary;
    L11:
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int offset) {
        int boundary = offset;
    L3:
        boundary = this.wordIterator.nextBoundary(boundary);
        if (boundary == (-1)) goto L5;
        if (Character.isWhitespace(this.text.charAt(boundary - 1)) == true) goto L3;
        return boundary;
    L5:
        return -1;
    }
}
