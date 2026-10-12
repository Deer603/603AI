package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CompletableJob.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/Job;", "complete", "", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CompletableJob extends Job {

    /* JADX INFO: compiled from: CompletableJob.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(CompletableJob $this) {
            Job.DefaultImpls.cancel($this);
        }

        public static <R> R fold(CompletableJob r1, R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
            return (R) Job.DefaultImpls.fold(r1, r2, r3);
        }

        public static <E extends CoroutineContext.Element> E get(CompletableJob r1, CoroutineContext.Key<E> r2) {
            return (E) Job.DefaultImpls.get(r1, r2);
        }

        public static CoroutineContext minusKey(CompletableJob $this, CoroutineContext.Key<?> r2) {
            return Job.DefaultImpls.minusKey($this, r2);
        }

        public static CoroutineContext plus(CompletableJob $this, CoroutineContext context) {
            return Job.DefaultImpls.plus($this, context);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static Job plus(CompletableJob $this, Job other) {
            return Job.DefaultImpls.plus($this, other);
        }
    }

    boolean complete();

    boolean completeExceptionally(Throwable r1);
}
