package androidx.compose.foundation.lazy.layout;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LazyLayoutIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJT\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0001\u0010\u00112\u0006\u0010\u0012\u001a\u00020\n26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u0002H\u00110\u0014H\u0086\b¢\u0006\u0002\u0010\u0019R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Interval", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "()V", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "itemCount", "", "getItemCount", "()I", "getContentType", "index", "getKey", "withInterval", "T", "globalIndex", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "localIntervalIndex", "content", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: LazyLayoutIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R1\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "key", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "getKey", "()Lkotlin/jvm/functions/Function1;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Interval {
        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return LazyLayoutIntervalContent$Interval$type$1.INSTANCE;
        }
    }

    static {
    }

    public abstract IntervalList<Interval> getIntervals();

    public LazyLayoutIntervalContent() {
    }

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final Object getKey(int index) {
        IntervalList.Interval<Interval> r2 = getIntervals().get(index);
        int localIntervalIndex$iv = index - r2.getStartIndex();
        Interval content = r2.getValue();
        Function1<Integer, Object> r7 = content.getKey();
        if (r7 == null) goto L8;
        Object r8 = r7.invoke(Integer.valueOf(localIntervalIndex$iv));
        if (r8 == null) goto L8;
        return r8;
    L8:
        return Lazy_androidKt.getDefaultLazyLayoutKey(index);
    }

    public final Object getContentType(int index) {
        IntervalList.Interval<Interval> r2 = getIntervals().get(index);
        int localIntervalIndex$iv = index - r2.getStartIndex();
        Interval content = r2.getValue();
        return content.getType().invoke(Integer.valueOf(localIntervalIndex$iv));
    }

    public final <T> T withInterval(int globalIndex, Function2<? super Integer, ? super Interval, ? extends T> r7) {
        IntervalList.Interval<Interval> r1 = getIntervals().get(globalIndex);
        int localIntervalIndex = globalIndex - r1.getStartIndex();
        return r7.invoke(Integer.valueOf(localIntervalIndex), r1.getValue());
    }
}
