package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderUnderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "text", "", "(Ljava/lang/CharSequence;)V", "breakIterator", "Ljava/text/BreakIterator;", "kotlin.jvm.PlatformType", "next", "", "offset", "previous", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 0;
    private final BreakIterator breakIterator;
    private final CharSequence text;

    static {
        $stable = 8;
    }

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence text) {
        this.text = text;
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText(this.text.toString());
        this.breakIterator = it;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int offset) {
        return this.breakIterator.preceding(offset);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int offset) {
        return this.breakIterator.following(offset);
    }
}
