package kotlinx.coroutines.channels;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.EventLoop_commonKt;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@¢\u0006\u0002\u0010\u0007\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TickerChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, LocationRequestCompat.QUALITY_LOW_POWER, 105}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return TickerChannelsKt.access$fixedDelayTicker(0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, 84, 90, 92}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    static final class C07551 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07551(Continuation<? super C07551> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return TickerChannelsKt.access$fixedPeriodTicker(0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ TickerMode $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* JADX INFO: compiled from: TickerChannels.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r0 = new int[TickerMode.values().length];
                r0[TickerMode.FIXED_PERIOD.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
            L11:
                r0[TickerMode.FIXED_DELAY.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
            L9:
                $EnumSwitchMapping$0 = r0;
            }
        }

        AnonymousClass3(TickerMode r2, long r3, long r5, Continuation<? super AnonymousClass3> r7) {
            this.$mode = r2;
            this.$delayMillis = r3;
            this.$initialDelayMillis = r5;
            super(2, r7);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$mode, this.$delayMillis, this.$initialDelayMillis, r9);
            r0.L$0 = r8;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Unit> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ProducerScope<? super Unit> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass3 r1 = this;
            ResultKt.throwOnFailure($result);
        L22:
            return Unit.INSTANCE;
        L7:
            AnonymousClass3 r2 = this;
            ResultKt.throwOnFailure($result);
            goto L22
        L8:
            ResultKt.throwOnFailure($result);
            ProducerScope $this$produce = (ProducerScope) this.L$0;
            TickerMode r3 = this.$mode;
            switch(WhenMappings.$EnumSwitchMapping$0[r3.ordinal()]) {
                case 1: goto L16;
                case 2: goto L11;
                default: goto L22;
            };
        L11:
            this.label = 2;
            if (TickerChannelsKt.access$fixedDelayTicker(this.$delayMillis, this.$initialDelayMillis, $this$produce.getChannel(), this) != r0) goto L14;
            return r0;
        L14:
            r1 = this;
            goto L22
        L16:
            this.label = 1;
            if (TickerChannelsKt.access$fixedPeriodTicker(this.$delayMillis, this.$initialDelayMillis, $this$produce.getChannel(), this) != r0) goto L19;
            return r0;
        L19:
            r2 = this;
            goto L22
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ Object access$fixedDelayTicker(long delayMillis, long initialDelayMillis, SendChannel channel, Continuation $completion) {
        return fixedDelayTicker(delayMillis, initialDelayMillis, channel, $completion);
    }

    public static final /* synthetic */ Object access$fixedPeriodTicker(long delayMillis, long initialDelayMillis, SendChannel channel, Continuation $completion) {
        return fixedPeriodTicker(delayMillis, initialDelayMillis, channel, $completion);
    }

    public static /* synthetic */ ReceiveChannel ticker$default(long r0, long r2, EmptyCoroutineContext r4, TickerMode r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = EmptyCoroutineContext.INSTANCE;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = TickerMode.FIXED_PERIOD;
    L12:
        return ticker(r0, r2, r4, r5);
    }

    public static final ReceiveChannel<Unit> ticker(long delayMillis, long initialDelayMillis, CoroutineContext context, TickerMode mode) {
        boolean r3 = true;
        if (delayMillis < 0) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L18;
        if (initialDelayMillis >= 0) goto L12;
        r3 = false;
    L12:
        if (r3 == false) goto L16;
        return ProduceKt.produce(GlobalScope.INSTANCE, Dispatchers.getUnconfined().plus(context), 0, new AnonymousClass3(mode, delayMillis, initialDelayMillis, null));
    L16:
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + initialDelayMillis + " ms").toString());
    L18:
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + delayMillis + " ms").toString());
    L5:
        r2 = false;
        goto L7
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00df -> B:25:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f6 -> B:25:0x008f). Please report as a decompilation issue!!! */
    private static final Object fixedPeriodTicker(long delayMillis, long initialDelayMillis, SendChannel<? super Unit> r13, Continuation<? super Unit> r14) {
        if ((r14 instanceof C07551) == false) goto L7;
        C07551 r0 = (C07551) r14;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L16;
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            default: goto L11;
        };
    L12:
        long delayNs = r0.J$1;
        long deadline = r0.J$0;
        r13 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
        long delayNs2 = delayNs;
        long delayNs3 = deadline;
    L25:
        long deadline2 = delayNs3 + delayNs2;
        Unit r11 = Unit.INSTANCE;
        r0.L$0 = r13;
        r0.J$0 = deadline2;
        r0.J$1 = delayNs2;
        r0.label = 2;
        if (r13.send(r11, r0) != r1) goto L28;
        return r1;
    L28:
        long deadline3 = deadline2;
        long deadline4 = delayNs2;
    L29:
        AbstractTimeSource r2 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r2 == null) goto L32;
        long now = r2.nanoTime();
    L33:
        long nextDelay = RangesKt.coerceAtLeast(deadline3 - now, 0);
        if (nextDelay == 0) goto L36;
    L42:
        long delayNs4 = EventLoop_commonKt.delayNanosToMillis(nextDelay);
        r0.L$0 = r13;
        r0.J$0 = deadline3;
        r0.J$1 = deadline4;
        r0.label = 4;
        if (DelayKt.delay(delayNs4, r0) != r1) goto L45;
        return r1;
    L45:
        delayNs2 = deadline4;
        delayNs3 = deadline3;
        goto L25
    L36:
        if (deadline4 == 0) goto L42;
        long adjustedDelay = deadline4 - ((now - deadline3) % deadline4);
        long deadline5 = now + adjustedDelay;
        long now2 = EventLoop_commonKt.delayNanosToMillis(adjustedDelay);
        r0.L$0 = r13;
        r0.J$0 = deadline5;
        r0.J$1 = deadline4;
        r0.label = 3;
        if (DelayKt.delay(now2, r0) != r1) goto L40;
        return r1;
    L40:
        delayNs2 = deadline4;
        delayNs3 = deadline5;
        goto L25
    L32:
        now = System.nanoTime();
        goto L33
    L13:
        long delayNs5 = r0.J$1;
        long deadline6 = r0.J$0;
        r13 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
        delayNs2 = delayNs5;
        delayNs3 = deadline6;
        goto L25
    L14:
        deadline4 = r0.J$1;
        deadline3 = r0.J$0;
        r13 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
        goto L29
    L15:
        delayNs3 = r0.J$1;
        long delayMillis2 = r0.J$0;
        r13 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
    L24:
        delayNs2 = EventLoop_commonKt.delayToNanos(delayMillis2);
        goto L25
    L16:
        ResultKt.throwOnFailure($result);
        AbstractTimeSource r3 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r3 == null) goto L19;
        long r4 = r3.nanoTime();
    L20:
        long deadline7 = r4 + EventLoop_commonKt.delayToNanos(initialDelayMillis);
        r0.L$0 = r13;
        r0.J$0 = delayMillis;
        r0.J$1 = deadline7;
        r0.label = 1;
        if (DelayKt.delay(initialDelayMillis, r0) != r1) goto L23;
        return r1;
    L23:
        delayMillis2 = delayMillis;
        delayNs3 = deadline7;
        goto L24
    L19:
        r4 = System.nanoTime();
        goto L20
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07551(r14);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0078 -> B:20:0x005d). Please report as a decompilation issue!!! */
    private static final Object fixedDelayTicker(long delayMillis, long initialDelayMillis, SendChannel<? super Unit> r7, Continuation<? super Unit> r8) {
        if ((r8 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        delayMillis = r0.J$0;
        SendChannel channel = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
    L20:
        Unit r6 = Unit.INSTANCE;
        r0.L$0 = channel;
        r0.J$0 = delayMillis;
        r0.label = 2;
        if (channel.send(r6, r0) != r1) goto L23;
        return r1;
    L23:
        r0.L$0 = channel;
        r0.J$0 = delayMillis;
        r0.label = 3;
        if (DelayKt.delay(delayMillis, r0) != r1) goto L20;
        return r1;
    L13:
        delayMillis = r0.J$0;
        channel = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
        goto L23
    L14:
        delayMillis = r0.J$0;
        channel = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);
        goto L20
    L15:
        ResultKt.throwOnFailure($result);
        r0.L$0 = r7;
        r0.J$0 = delayMillis;
        r0.label = 1;
        if (DelayKt.delay(initialDelayMillis, r0) != r1) goto L18;
        return r1;
    L18:
        channel = r7;
        goto L20
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r8);
        goto L8
    }
}
