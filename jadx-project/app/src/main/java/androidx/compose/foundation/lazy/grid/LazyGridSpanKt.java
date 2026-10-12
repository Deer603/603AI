package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"GridItemSpan", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "currentLineSpan", "", "(I)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridSpanKt {
    public static final long GridItemSpan(int currentLineSpan) {
        if (currentLineSpan <= 0) goto L4;
        boolean value$iv = true;
    L6:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("The span value should be higher than 0");
    L9:
        return GridItemSpan.m847constructorimpl(currentLineSpan);
    L4:
        value$iv = false;
        goto L6
    }
}
