package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope $this$async, CoroutineContext context, CoroutineStart start, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r4) {
        return BuildersKt__Builders_commonKt.async($this$async, context, start, r4);
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope r0, CoroutineContext r1, CoroutineStart r2, Function2 r3, int r4, Object r5) {
        return BuildersKt__Builders_commonKt.async$default(r0, r1, r2, r3, r4, r5);
    }

    public static final <T> Object invoke(CoroutineDispatcher $this$invoke, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r2, Continuation<? super T> r3) {
        return BuildersKt__Builders_commonKt.invoke($this$invoke, r2, r3);
    }

    public static final Job launch(CoroutineScope $this$launch, CoroutineContext context, CoroutineStart start, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r4) {
        return BuildersKt__Builders_commonKt.launch($this$launch, context, start, r4);
    }

    public static /* synthetic */ Job launch$default(CoroutineScope r0, CoroutineContext r1, CoroutineStart r2, Function2 r3, int r4, Object r5) {
        return BuildersKt__Builders_commonKt.launch$default(r0, r1, r2, r3, r4, r5);
    }

    public static final <T> T runBlocking(CoroutineContext r1, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r2) throws InterruptedException {
        return (T) BuildersKt__BuildersKt.runBlocking(r1, r2);
    }

    public static /* synthetic */ Object runBlocking$default(CoroutineContext r0, Function2 r1, int r2, Object r3) throws InterruptedException {
        return BuildersKt__BuildersKt.runBlocking$default(r0, r1, r2, r3);
    }

    public static final <T> Object withContext(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r2, Continuation<? super T> r3) {
        return BuildersKt__Builders_commonKt.withContext(context, r2, r3);
    }
}
