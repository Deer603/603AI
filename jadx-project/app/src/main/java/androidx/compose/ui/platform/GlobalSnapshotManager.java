package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", "sent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "ensureStarted", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GlobalSnapshotManager {
    public static final int $stable = 0;
    public static final GlobalSnapshotManager INSTANCE = null;
    private static final AtomicBoolean sent = null;
    private static final AtomicBoolean started = null;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    /* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $channel;
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Channel<Unit> r2, Continuation<? super AnonymousClass1> r3) {
            this.$channel = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$channel, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:37:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object e$iv) {
            Object $result = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ChannelIterator r4 = (ChannelIterator) this.L$1;
            ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) this.L$0;
            ResultKt.throwOnFailure(e$iv);     // Catch: Throwable -> L9
            AnonymousClass1 r8 = this;
            ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
            Throwable cause$iv$iv = null;
            ChannelIterator r5 = r4;
            ReceiveChannel r6 = null;
            int $i$f$consume = 0;
            int $i$f$consume2 = 0;
            Object r1 = $result;
            Object $result2 = e$iv;
        L37:
        L24:
            th = move-exception;
            e$iv$iv = th;
            $this$consume$iv$iv = $this$consume$iv$iv2;
        L30:
            Throwable cause$iv$iv2 = e$iv$iv;
            throw e$iv$iv;     // Catch: Throwable -> L32
        L32:
            e$iv$iv = move-exception;
            ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv2);
            throw e$iv$iv;
        L19:
            if (((Boolean) e$iv).booleanValue() == false) goto L21;
            Unit r9 = (Unit) r5.next();     // Catch: Throwable -> L24
            GlobalSnapshotManager.access$getSent$p().set(false);     // Catch: Throwable -> L24
            Snapshot.Companion.sendApplyNotifications();     // Catch: Throwable -> L24
            e$iv = $result2;
            $result = r1;
            int $i$f$consume3 = $i$f$consume2;
            int $i$f$consumeEach = $i$f$consume;
            ReceiveChannel $this$consumeEach_u24lambda_u241$iv = r6;
            ChannelIterator r7 = r5;
            Throwable cause$iv$iv3 = cause$iv$iv;
            $this$consume$iv$iv = $this$consume$iv$iv2;
            AnonymousClass1 r10 = r8;
        L43:
            r10.L$0 = $this$consume$iv$iv;     // Catch: Throwable -> L26
            r10.L$1 = r7;     // Catch: Throwable -> L26
            r10.label = 1;     // Catch: Throwable -> L26
            Object r11 = r7.hasNext(r10);     // Catch: Throwable -> L26
            if (r11 != $result) goto L17;
            return $result;
        L17:
            Object r12 = $result;
            $result2 = e$iv;
            e$iv = r11;
            r8 = r10;
            $this$consume$iv$iv2 = $this$consume$iv$iv;
            cause$iv$iv = cause$iv$iv3;
            r5 = r7;
            r6 = $this$consumeEach_u24lambda_u241$iv;
            $i$f$consume = $i$f$consumeEach;
            $i$f$consume2 = $i$f$consume3;
            r1 = r12;
        L26:
            e$iv$iv = th;
            goto L30
        L21:
            Unit r14 = Unit.INSTANCE;     // Catch: Throwable -> L24
            ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv);
            return Unit.INSTANCE;
        L9:
            e$iv$iv = th;
            goto L30
        L11:
            ResultKt.throwOnFailure(e$iv);
            ReceiveChannel $this$consumeEach$iv = this.$channel;
            $this$consume$iv$iv = $this$consumeEach$iv;
            cause$iv$iv3 = null;
            $i$f$consumeEach = 0;
            $i$f$consume3 = 0;
            $this$consumeEach_u24lambda_u241$iv = null;
            r7 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L28
            r10 = this;
        L28:
            e$iv$iv = th;
            goto L30
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private GlobalSnapshotManager() {
    }

    public static final /* synthetic */ AtomicBoolean access$getSent$p() {
        return sent;
    }

    static {
        INSTANCE = new GlobalSnapshotManager();
        started = new AtomicBoolean(false);
        sent = new AtomicBoolean(false);
        $stable = 8;
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true) == false) goto L6;
        final Channel channel = ChannelKt.Channel$default(1, null, null, 6, null);
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.Companion.getMain()), null, null, new AnonymousClass1(channel, null), 3, null);
        Snapshot.Companion.registerGlobalWriteObserver(new AnonymousClass2(channel));
        return;
    }
}
