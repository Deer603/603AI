package kotlinx.coroutines.channels;

import androidx.autofill.HintConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u009b\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\u001a"}, d2 = {"broadcast", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BroadcastKt {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    /* JADX INFO: compiled from: Broadcast.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {52, 53}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    static final class AnonymousClass2<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $channel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ReceiveChannel<? extends E> r2, Continuation<? super AnonymousClass2> r3) {
            this.$channel = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$channel, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:9:0x0042). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass2<E> r1 = this;
            ChannelIterator<E> r2 = (ChannelIterator) r1.L$1;
            ProducerScope $this$broadcast = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
            ChannelIterator<E> r3 = r2;
            ProducerScope $this$broadcast2 = $this$broadcast;
        L9:
            r1.L$0 = $this$broadcast2;
            r1.L$1 = r3;
            r1.label = 1;
            Object r4 = r3.hasNext(r1);
            if (r4 != $result2) goto L12;
            return $result2;
        L12:
            Object r7 = $result2;
            Object $result3 = $result;
            $result = r4;
            ProducerScope $this$broadcast3 = $this$broadcast2;
            AnonymousClass2<E> r5 = r1;
            Object r6 = r7;
        L14:
            if (((Boolean) $result).booleanValue() == false) goto L21;
            r5.L$0 = $this$broadcast3;
            r5.L$1 = r3;
            r5.label = 2;
            Object e = $this$broadcast3.send(r3.next(), r5);
            if (e != r6) goto L18;
            return r6;
        L18:
            $result = $result3;
            $result2 = r6;
            r1 = r5;
            $this$broadcast2 = $this$broadcast3;
            goto L9
        L21:
            return Unit.INSTANCE;
        L7:
            ChannelIterator<E> r8 = (ChannelIterator) this.L$1;
            ProducerScope $this$broadcast4 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$broadcast3 = $this$broadcast4;
            r3 = r8;
            r5 = this;
            r6 = $result2;
            $result3 = $result;
            goto L14
        L8:
            ResultKt.throwOnFailure($result);
            r1 = this;
            $this$broadcast2 = (ProducerScope) r1.L$0;
            r3 = r1.$channel.iterator();
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(ReceiveChannel r0, int r1, CoroutineStart r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = CoroutineStart.LAZY;
    L9:
        return broadcast(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> BroadcastChannel<E> broadcast(final ReceiveChannel<? extends E> r12, int capacity, CoroutineStart start) {
        CoroutineScope scope = CoroutineScopeKt.plus(CoroutineScopeKt.plus(GlobalScope.INSTANCE, Dispatchers.getUnconfined()), new BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        return broadcast$default(scope, null, capacity, start, new AnonymousClass1(r12), new AnonymousClass2(r12, null), 1, null);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(CoroutineScope r0, EmptyCoroutineContext r1, int r2, CoroutineStart r3, Function1 r4, Function2 r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = EmptyCoroutineContext.INSTANCE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = 1;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = CoroutineStart.LAZY;
    L12:
        if ((r6 & 8) == 0) goto L14;
        Function1 r8 = null;
    L15:
        CoroutineStart r9 = r3;
        return broadcast(r0, r1, r2, r9, r8, r5);
    L14:
        r8 = r4;
        goto L15
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> BroadcastChannel<E> broadcast(CoroutineScope $this$broadcast, CoroutineContext context, int capacity, CoroutineStart start, Function1<? super Throwable, Unit> r8, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> r9) {
        CoroutineContext newContext = CoroutineContextKt.newCoroutineContext($this$broadcast, context);
        BroadcastChannel channel = BroadcastChannelKt.BroadcastChannel(capacity);
        if (start.isLazy() == false) goto L5;
        LazyBroadcastCoroutine coroutine = new LazyBroadcastCoroutine(newContext, channel, r9);
    L7:
        if (r8 == null) goto L9;
        coroutine.invokeOnCompletion(r8);
    L9:
        coroutine.start(start, coroutine, r9);
        return coroutine;
    L5:
        coroutine = new BroadcastCoroutine(newContext, channel, true);
        goto L7
    }
}
