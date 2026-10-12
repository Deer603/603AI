package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ThreadContextElement<S> extends CoroutineContext.Element {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> r1, R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(r1, r2, r3);
        }

        public static <S, E extends CoroutineContext.Element> E get(ThreadContextElement<S> r1, CoroutineContext.Key<E> r2) {
            return (E) CoroutineContext.Element.DefaultImpls.get(r1, r2);
        }

        public static <S> CoroutineContext minusKey(ThreadContextElement<S> r1, CoroutineContext.Key<?> r2) {
            return CoroutineContext.Element.DefaultImpls.minusKey(r1, r2);
        }

        public static <S> CoroutineContext plus(ThreadContextElement<S> r1, CoroutineContext context) {
            return CoroutineContext.Element.DefaultImpls.plus(r1, context);
        }
    }

    void restoreThreadContext(CoroutineContext r1, S r2);

    S updateThreadContext(CoroutineContext r1);
}
