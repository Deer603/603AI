package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0010J6\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\b0\fH&J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u0004H¦\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", "T", "", "size", "", "getSize", "()I", "forEach", "", "fromIndex", "toIndex", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "get", "index", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IntervalList<T> {

    /* JADX INFO: compiled from: IntervalList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "T", "", "startIndex", "", "size", "value", "(IILjava/lang/Object;)V", "getSize", "()I", "getStartIndex", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        static {
        }

        public Interval(int startIndex, int size, T r8) {
            this.startIndex = startIndex;
            this.size = size;
            this.value = r8;
            boolean value$iv = true;
            if (this.startIndex < 0) goto L5;
            boolean value$iv2 = true;
        L7:
            if (value$iv2 == true) goto L10;
            InlineClassHelperKt.throwIllegalArgumentException("startIndex should be >= 0");
        L10:
            if (this.size > 0) goto L14;
            value$iv = false;
        L14:
            if (value$iv == true) goto L18;
            InlineClassHelperKt.throwIllegalArgumentException("size should be > 0");
            return;
        L18:
            return;
        L5:
            value$iv2 = false;
            goto L7
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final int getSize() {
            return this.size;
        }

        public final T getValue() {
            return this.value;
        }
    }

    void forEach(int r1, int r2, Function1<? super Interval<? extends T>, Unit> r3);

    Interval<T> get(int r1);

    int getSize();

    static /* synthetic */ void forEach$default(IntervalList r0, int r1, int r2, Function1 r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 1) == 0) goto L7;
        r1 = 0;
    L7:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.getSize() - 1;
    L9:
        r0.forEach(r1, r2, r3);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
    }
}
