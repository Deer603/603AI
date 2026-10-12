package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u0004H¦B¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", "E", "", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "next0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ChannelIterator<E> {

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public static /* synthetic */ Object next(ChannelIterator $this, Continuation r4) {
            if ((r4 instanceof ChannelIterator$next0$1) == false) goto L7;
            ChannelIterator$next0$1 r0 = (ChannelIterator$next0$1) r4;
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
            $this = (ChannelIterator) r0.L$0;
            ResultKt.throwOnFailure($result);
            Object r2 = $result;
        L17:
            if (((Boolean) r2).booleanValue() == false) goto L21;
            return $this.next();
        L21:
            throw new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        L13:
            ResultKt.throwOnFailure($result);
            r0.L$0 = $this;
            r0.label = 1;
            r2 = $this.hasNext(r0);
            if (r2 != r1) goto L17;
            return r1;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new ChannelIterator$next0$1(r4);
            goto L8
        }
    }

    Object hasNext(Continuation<? super Boolean> r1);

    E next();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object next(Continuation r1);
}
