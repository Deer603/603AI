package kotlinx.coroutines.channels;

import androidx.autofill.HintConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u001aU\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u000b0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0016\u0010\u0013\u001a[\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001aY\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u001a\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Channel", "Lkotlinx/coroutines/channels/Channel;", "E", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "getOrElse", "T", "Lkotlinx/coroutines/channels/ChannelResult;", "onFailure", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "exception", "getOrElse-WpGqRn0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "onClosed", "action", "onClosed-WpGqRn0", "onFailure-WpGqRn0", "onSuccess", "value", "onSuccess-WpGqRn0", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ChannelKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m8922getOrElseWpGqRn0(Object r2, Function1<? super Throwable, ? extends T> r3) {
        if ((r2 instanceof ChannelResult.Failed) == false) goto L6;
        return r3.invoke(ChannelResult.m8930exceptionOrNullimpl(r2));
    L6:
        return r2;
    }

    /* JADX INFO: renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m8925onSuccessWpGqRn0(Object $this$onSuccess_u2dWpGqRn0, Function1<? super T, Unit> r3) {
        if (($this$onSuccess_u2dWpGqRn0 instanceof ChannelResult.Failed) == true) goto L5;
        r3.invoke($this$onSuccess_u2dWpGqRn0);
    L5:
        return $this$onSuccess_u2dWpGqRn0;
    }

    /* JADX INFO: renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m8924onFailureWpGqRn0(Object $this$onFailure_u2dWpGqRn0, Function1<? super Throwable, Unit> r3) {
        if (($this$onFailure_u2dWpGqRn0 instanceof ChannelResult.Failed) == false) goto L5;
        r3.invoke(ChannelResult.m8930exceptionOrNullimpl($this$onFailure_u2dWpGqRn0));
    L5:
        return $this$onFailure_u2dWpGqRn0;
    }

    /* JADX INFO: renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m8923onClosedWpGqRn0(Object $this$onClosed_u2dWpGqRn0, Function1<? super Throwable, Unit> r3) {
        if (($this$onClosed_u2dWpGqRn0 instanceof ChannelResult.Closed) == false) goto L5;
        r3.invoke(ChannelResult.m8930exceptionOrNullimpl($this$onClosed_u2dWpGqRn0));
    L5:
        return $this$onClosed_u2dWpGqRn0;
    }

    public static /* synthetic */ Channel Channel$default(int r0, BufferOverflow r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = BufferOverflow.SUSPEND;
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = null;
    L12:
        return Channel(r0, r1, r2);
    }

    public static final <E> Channel<E> Channel(int capacity, BufferOverflow onBufferOverflow, Function1<? super E, Unit> r5) {
        boolean r0 = false;
        switch(capacity) {
            case -2: goto L21;
            case -1: goto L14;
            case 0: goto L9;
            case 2147483647: goto L28;
            default: goto L5;
        };
    L5:
        if (onBufferOverflow != BufferOverflow.SUSPEND) goto L25;
        ConflatedBufferedChannel r1 = new BufferedChannel(capacity, r5);
    L27:
        return r1;
    L25:
        r1 = new ConflatedBufferedChannel(capacity, onBufferOverflow, r5);
        goto L27
    L28:
        return new BufferedChannel(Integer.MAX_VALUE, r5);
    L9:
        if (onBufferOverflow != BufferOverflow.SUSPEND) goto L11;
        ConflatedBufferedChannel r2 = new BufferedChannel(0, r5);
    L29:
        return r2;
    L11:
        r2 = new ConflatedBufferedChannel(1, onBufferOverflow, r5);
        goto L29
    L14:
        if (onBufferOverflow != BufferOverflow.SUSPEND) goto L16;
        r0 = true;
    L16:
        if (r0 == false) goto L19;
        return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, r5);
    L19:
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    L21:
        if (onBufferOverflow != BufferOverflow.SUSPEND) goto L23;
        ConflatedBufferedChannel r3 = new BufferedChannel(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), r5);
    L31:
        return r3;
    L23:
        r3 = new ConflatedBufferedChannel(1, onBufferOverflow, r5);
        goto L31
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ Channel Channel(int capacity) {
        return Channel$default(capacity, null, null, 6, null);
    }

    public static /* synthetic */ Channel Channel$default(int r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = 0;
    L6:
        return Channel(r0);
    }
}
