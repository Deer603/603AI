package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m6579updateRangeAfterDeletepWDy79M(long target, long deleted) {
        int targetMin = TextRange.m6415getMinimpl(target);
        int targetMax = TextRange.m6414getMaximpl(target);
        if (TextRange.m6419intersects5zctL8(deleted, target) == false) goto L15;
        if (TextRange.m6407contains5zctL8(deleted, target) == false) goto L8;
        targetMin = TextRange.m6415getMinimpl(deleted);
        targetMax = targetMin;
    L18:
        return TextRangeKt.TextRange(targetMin, targetMax);
    L8:
        if (TextRange.m6407contains5zctL8(target, deleted) == false) goto L11;
        targetMax = targetMax - TextRange.m6413getLengthimpl(deleted);
        goto L18
    L11:
        if (TextRange.m6408containsimpl(deleted, targetMin) == false) goto L13;
        targetMin = TextRange.m6415getMinimpl(deleted);
        targetMax = targetMax - TextRange.m6413getLengthimpl(deleted);
        goto L18
    L13:
        targetMax = TextRange.m6415getMinimpl(deleted);
        goto L18
    L15:
        if (targetMax <= TextRange.m6415getMinimpl(deleted)) goto L18;
        targetMin = targetMin - TextRange.m6413getLengthimpl(deleted);
        targetMax = targetMax - TextRange.m6413getLengthimpl(deleted);
        goto L18
    }
}
