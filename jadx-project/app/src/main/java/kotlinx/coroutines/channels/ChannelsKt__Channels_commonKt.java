package kotlinx.coroutines.channels;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001aP\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\u00042\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\u000b¢\u0006\u0002\b\fH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\r\u001a2\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\u000bH\u0086H¢\u0006\u0002\u0010\u0010\u001a$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0012\"\b\b\u0000\u0010\t*\u00020\u0013*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0007\u001a$\u0010\u0014\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0013*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0087@¢\u0006\u0002\u0010\u0015\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\t0\u0017\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0086@¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"DEFAULT_CLOSE_MESSAGE", "", "cancelConsumed", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "cause", "", "consume", "R", "E", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", "", "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__Channels_commonKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1, reason: invalid class name */
    /* JADX INFO: compiled from: Channels.common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {82}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__Channels_commonKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Channels.common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {112}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    static final class C07171<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C07171(Continuation<? super C07171> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toList(null, this);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object receiveOrNull(ReceiveChannel $this$receiveOrNull, Continuation $completion) {
        Intrinsics.checkNotNull($this$receiveOrNull, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return $this$receiveOrNull.receiveOrNull($completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ SelectClause1 onReceiveOrNull(ReceiveChannel $this$onReceiveOrNull) {
        Intrinsics.checkNotNull($this$onReceiveOrNull, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return $this$onReceiveOrNull.getOnReceiveOrNull();
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> r3, Function1<? super ReceiveChannel<? extends E>, ? extends R> r4) {
        R r2 = r4.invoke(r3);     // Catch: Throwable -> L6
        ChannelsKt.cancelConsumed(r3, null);
        return r2;
    L6:
        e = move-exception;
        throw e;     // Catch: Throwable -> L9
    L9:
        e = move-exception;
        ChannelsKt.cancelConsumed(r3, e);
        throw e;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:45:0x007a). Please report as a decompilation issue!!! */
    public static final <E> Object consumeEach(ReceiveChannel<? extends E> r9, Function1<? super E, Unit> r10, Continuation<? super Unit> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object e = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r3 = (ChannelIterator) r0.L$2;
        ReceiveChannel<? extends E> r5 = (ReceiveChannel) r0.L$1;
        Function1<? super E, Unit> r6 = (Function1) r0.L$0;
        ResultKt.throwOnFailure(e);     // Catch: Throwable -> L15
        Function1<? super E, Unit> r7 = r6;
        ReceiveChannel<? extends E> r8 = r5;
        Throwable cause$iv = null;
        ChannelIterator r4 = r3;
        int r12 = 0;
        Object r2 = r1;
        AnonymousClass1 r13 = r0;
        Object $result = e;
    L45:
    L30:
        th = move-exception;
        e$iv = th;
        r5 = r8;
    L34:
        Throwable cause$iv2 = e$iv;
        throw e$iv;     // Catch: Throwable -> L36
    L36:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed(r5, cause$iv2);
        throw e$iv;
    L25:
        if (((Boolean) e).booleanValue() == false) goto L27;
        r7.invoke(r4.next());     // Catch: Throwable -> L30
        e = $result;
        r0 = r13;
        r1 = r2;
        int $i$f$consumeEach = r12;
        ChannelIterator r14 = r4;
        Throwable cause$iv3 = cause$iv;
        r5 = r8;
        Function1<? super E, Unit> r15 = r7;
    L20:
        r0.L$0 = r15;     // Catch: Throwable -> L15
        r0.L$1 = r5;     // Catch: Throwable -> L15
        r0.L$2 = r14;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r16 = r14.hasNext(r0);     // Catch: Throwable -> L15
        if (r16 != r1) goto L23;
        return r1;
    L23:
        AnonymousClass1 r17 = r0;
        $result = e;
        e = r16;
        r7 = r15;
        r8 = r5;
        cause$iv = cause$iv3;
        r4 = r14;
        r12 = $i$f$consumeEach;
        r2 = r1;
        r13 = r17;
        goto L45
    L27:
        Unit r18 = Unit.INSTANCE;     // Catch: Throwable -> L30
        ChannelsKt.cancelConsumed(r8, cause$iv);
        return Unit.INSTANCE;
    L15:
        e$iv = th;
        goto L34
    L17:
        ResultKt.throwOnFailure(e);
        r5 = r9;
        cause$iv3 = null;
        $i$f$consumeEach = 0;
        r15 = r10;
        r14 = r5.iterator();     // Catch: Throwable -> L32
    L32:
        e$iv = th;
        goto L34
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r11);
        goto L8
    }

    private static final <E> Object consumeEach$$forInline(ReceiveChannel<? extends E> r8, Function1<? super E, Unit> r9, Continuation<? super Unit> r10) {
        ChannelIterator<? extends E> r6 = r8.iterator();     // Catch: Throwable -> L10
    L5:
        if (((Boolean) r6.hasNext(null)).booleanValue() == false) goto L7;
        Object e = r6.next();     // Catch: Throwable -> L10
        r9.invoke(e);     // Catch: Throwable -> L10
        goto L5
    L7:
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L10
        ChannelsKt.cancelConsumed(r8, null);
        return Unit.INSTANCE;
    L10:
        e$iv = move-exception;
        throw e$iv;     // Catch: Throwable -> L13
    L13:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed(r8, e$iv);
        throw e$iv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:43:0x008f). Please report as a decompilation issue!!! */
    public static final <E> Object toList(ReceiveChannel<? extends E> r14, Continuation<? super List<? extends E>> r15) {
        if ((r15 instanceof C07171) == false) goto L7;
        C07171 r0 = (C07171) r15;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object e$iv = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r5 = (ChannelIterator) r0.L$3;
        ReceiveChannel<? extends E> r7 = (ReceiveChannel) r0.L$2;
        List $this$toList_u24lambda_u243 = (List) r0.L$1;
        List r9 = (List) r0.L$0;
        ResultKt.throwOnFailure(e$iv);     // Catch: Throwable -> L15
        List r10 = r9;
        ?? r11 = $this$toList_u24lambda_u243;
        ReceiveChannel<? extends E> r8 = r7;
        Throwable cause$iv$iv = null;
        ChannelIterator r6 = r5;
        int r12 = 0;
        List r4 = null;
        int $i$f$consume = 0;
        Object r2 = r1;
        C07171 r3 = r0;
        Object $result = e$iv;
    L43:
    L30:
        th = move-exception;
        e$iv$iv = th;
        r7 = r8;
    L34:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L36
    L36:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed(r7, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) e$iv).booleanValue() == false) goto L27;
        r11.add(r6.next());     // Catch: Throwable -> L30
        e$iv = $result;
        r0 = r3;
        r1 = r2;
        int $i$f$consumeEach = $i$f$consume;
        List $this$toList_u24lambda_u244 = r4;
        int $i$f$consume2 = r12;
        ChannelIterator r13 = r6;
        Throwable cause$iv$iv3 = cause$iv$iv;
        r7 = r8;
        ?? r16 = r11;
        List $this$toList_u24lambda_u245 = r10;
    L20:
        r0.L$0 = $this$toList_u24lambda_u245;     // Catch: Throwable -> L15
        r0.L$1 = r16;     // Catch: Throwable -> L15
        r0.L$2 = r7;     // Catch: Throwable -> L15
        r0.L$3 = r13;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r17 = r13.hasNext(r0);     // Catch: Throwable -> L15
        if (r17 != r1) goto L23;
        return r1;
    L23:
        C07171 r18 = r0;
        $result = e$iv;
        e$iv = r17;
        r10 = $this$toList_u24lambda_u245;
        r11 = r16;
        r8 = r7;
        cause$iv$iv = cause$iv$iv3;
        r6 = r13;
        r12 = $i$f$consume2;
        r4 = $this$toList_u24lambda_u244;
        $i$f$consume = $i$f$consumeEach;
        r2 = r1;
        r3 = r18;
        goto L43
    L27:
        Unit r19 = Unit.INSTANCE;     // Catch: Throwable -> L30
        ChannelsKt.cancelConsumed(r8, cause$iv$iv);
        return CollectionsKt.build(r10);
    L15:
        e$iv$iv = th;
        goto L34
    L17:
        ResultKt.throwOnFailure(e$iv);
        List $this$toList_u24lambda_u246 = CollectionsKt.createListBuilder();
        r7 = r14;
        cause$iv$iv3 = null;
        r16 = $this$toList_u24lambda_u246;
        $this$toList_u24lambda_u244 = null;
        $i$f$consume2 = 0;
        $this$toList_u24lambda_u245 = $this$toList_u24lambda_u246;
        $i$f$consumeEach = 0;
        r13 = r7.iterator();     // Catch: Throwable -> L32
    L32:
        e$iv$iv = th;
        goto L34
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07171(r15);
        goto L8
    }

    public static final void cancelConsumed(ReceiveChannel<?> r4, Throwable cause) {
        CancellationException r0 = null;
        if (cause != null) goto L5;
    L9:
        r4.cancel(r0);
        return;
    L5:
        if ((cause instanceof CancellationException) == false) goto L7;
        r0 = (CancellationException) cause;
    L7:
        if (r0 != null) goto L9;
        r0 = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", cause);
        goto L9
    }
}
