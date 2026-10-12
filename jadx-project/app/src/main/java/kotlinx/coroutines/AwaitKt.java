package kotlinx.coroutines;

import androidx.core.view.MotionEventCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {MotionEventCompat.AXIS_GENERIC_16}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$3, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.joinAll(null, this);
        }
    }

    public static final <T> Object awaitAll(Deferred<? extends T>[] r1, Continuation<? super List<? extends T>> r2) {
        if (r1.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L10;
        return CollectionsKt.emptyList();
    L10:
        return new AwaitAll(r1).await(r2);
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> Object awaitAll(Collection<? extends Deferred<? extends T>> r5, Continuation<? super List<? extends T>> r6) {
        if (r5.isEmpty() == false) goto L7;
        return CollectionsKt.emptyList();
    L7:
        return new AwaitAll((Deferred[]) r5.toArray(new Deferred[0])).await(r6);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:19:0x0058). Please report as a decompilation issue!!! */
    public static final Object joinAll(Job[] r8, Continuation<? super Unit> r9) {
        if ((r9 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        int r4 = r0.I$1;
        int r5 = r0.I$0;
        Job[] r6 = (Job[]) r0.L$0;
        ResultKt.throwOnFailure($result);
    L19:
        r5 = r5 + 1;
    L14:
        if (r5 >= r4) goto L21;
        Job it = r6[r5];
        r0.L$0 = r6;
        r0.I$0 = r5;
        r0.I$1 = r4;
        r0.label = 1;
        if (it.join(r0) != r1) goto L19;
        return r1;
    L21:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r4 = r8.length;
        r5 = 0;
        r6 = r8;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r9);
        goto L8
    }

    public static final Object joinAll(Collection<? extends Job> r6, Continuation<? super Unit> r7) {
        if ((r7 instanceof AnonymousClass3) == false) goto L7;
        AnonymousClass3 r0 = (AnonymousClass3) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Iterator r3 = (Iterator) r0.L$0;
        ResultKt.throwOnFailure($result);
    L15:
        if (r3.hasNext() == false) goto L22;
        Object element$iv = r3.next();
        Job it = (Job) element$iv;
        r0.L$0 = r3;
        r0.label = 1;
        if (it.join(r0) != r1) goto L15;
        return r1;
    L22:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        Collection<? extends Job> $this$forEach$iv = r6;
        r3 = $this$forEach$iv.iterator();
        goto L15
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass3(r7);
        goto L8
    }
}
