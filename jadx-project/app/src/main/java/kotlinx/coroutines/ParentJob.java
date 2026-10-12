package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H'¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/Job;", "getChildJobCancellationCause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ParentJob extends Job {

    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(ParentJob $this) {
            Job.DefaultImpls.cancel($this);
        }

        public static <R> R fold(ParentJob r1, R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
            return (R) Job.DefaultImpls.fold(r1, r2, r3);
        }

        public static <E extends CoroutineContext.Element> E get(ParentJob r1, CoroutineContext.Key<E> r2) {
            return (E) Job.DefaultImpls.get(r1, r2);
        }

        public static CoroutineContext minusKey(ParentJob $this, CoroutineContext.Key<?> r2) {
            return Job.DefaultImpls.minusKey($this, r2);
        }

        public static CoroutineContext plus(ParentJob $this, CoroutineContext context) {
            return Job.DefaultImpls.plus($this, context);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static Job plus(ParentJob $this, Job other) {
            return Job.DefaultImpls.plus($this, other);
        }
    }

    CancellationException getChildJobCancellationCause();
}
