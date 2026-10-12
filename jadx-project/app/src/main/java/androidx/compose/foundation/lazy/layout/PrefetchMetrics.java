package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "()V", "averagesByContentType", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/Averages;", "lastUsedAverage", "lastUsedContentType", "overallAverage", "getAverage", "contentType", "getCompositionTimeNanos", "", "getMeasureTimeNanos", "saveCompositionTime", "", "timeNanos", "saveMeasureTime", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrefetchMetrics {
    public static final int $stable = 0;
    private final MutableScatterMap<Object, Averages> averagesByContentType;
    private Averages lastUsedAverage;
    private Object lastUsedContentType;
    private final Averages overallAverage;

    static {
        $stable = 8;
    }

    public PrefetchMetrics() {
        this.overallAverage = new Averages();
        this.averagesByContentType = ScatterMapKt.mutableScatterMapOf();
    }

    private final Averages getAverage(Object contentType) {
        Averages lastUsedAverage = this.lastUsedAverage;
        if (this.lastUsedContentType != contentType) goto L6;
        if (lastUsedAverage == null) goto L6;
        return lastUsedAverage;
    L6:
        MutableScatterMap<Object, Averages> r1 = this.averagesByContentType;
        Averages r3 = r1.get(contentType);
        if (r3 != null) goto L9;
        r3 = this.overallAverage.copy();
        r1.set(contentType, r3);
    L9:
        Averages it = r3;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = it;
        return r3;
    }

    public final long getCompositionTimeNanos(Object contentType) {
        return getAverage(contentType).getCompositionTimeNanos();
    }

    public final long getMeasureTimeNanos(Object contentType) {
        return getAverage(contentType).getMeasureTimeNanos();
    }

    public final void saveCompositionTime(Object contentType, long timeNanos) {
        this.overallAverage.saveCompositionTimeNanos(timeNanos);
        getAverage(contentType).saveCompositionTimeNanos(timeNanos);
    }

    public final void saveMeasureTime(Object contentType, long timeNanos) {
        this.overallAverage.saveMeasureTimeNanos(timeNanos);
        getAverage(contentType).saveMeasureTimeNanos(timeNanos);
    }
}
