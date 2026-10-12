package androidx.compose.ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;
import kotlin.Metadata;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"createGraphemeClusterSegmentFinder", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "text", "", "textPaint", "Landroid/text/TextPaint;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SegmentFinder_androidKt {
    public static final SegmentFinder createGraphemeClusterSegmentFinder(CharSequence text, TextPaint textPaint) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        return new GraphemeClusterSegmentFinderApi29(text, textPaint);
    L6:
        return new GraphemeClusterSegmentFinderUnderApi29(text);
    }
}
