package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0007\u001a<\u0010\t\u001a\u00020\n*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0011H\u0082@¢\u0006\u0002\u0010\u0012\u001a(\u0010\u0013\u001a\u00020\n*\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00112\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f\u001a&\u0010\u0016\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"SCROLL_FACTOR", "", "awaitCtrlMouseScrollOrNull", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstCtrlMouseScroll", "detectZoom", "", "panZoomLock", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "canPan", "Lkotlin/Function1;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectZoomByCtrlMouseScroll", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {312}, m = "awaitCtrlMouseScrollOrNull", n = {"$this$awaitCtrlMouseScrollOrNull", "scrollConfig"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.access$awaitCtrlMouseScrollOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {299}, m = "awaitFirstCtrlMouseScroll", n = {"$this$awaitFirstCtrlMouseScroll", "scrollConfig"}, s = {"L$0", "L$1"})
    static final class C02721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C02721(Continuation<? super C02721> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.access$awaitFirstCtrlMouseScroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {337, 339, 385}, m = "detectZoom", n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", NotificationCompat.CATEGORY_EVENT, "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
    static final class C02731 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C02731(Continuation<? super C02731> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.access$detectZoom(null, false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", i = {0, 1}, l = {272, 284}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<TransformEvent> $channel;
        final /* synthetic */ CoroutineContext $currentContext;
        final /* synthetic */ ScrollConfig $scrollConfig;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(CoroutineContext r2, ScrollConfig r3, Channel<TransformEvent> r4, Continuation<? super AnonymousClass2> r5) {
            this.$currentContext = r2;
            this.$scrollConfig = r3;
            this.$channel = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$currentContext, this.$scrollConfig, this.$channel, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a6 -> B:40:0x00ab). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L14;
                case 1: goto L9;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            AwaitPointerEventScope $this$awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L12
            AnonymousClass2 r3 = this;
            AwaitPointerEventScope $this$awaitPointerEventScope2 = $this$awaitPointerEventScope;
            Object $result2 = $result;
        L40:
            Offset r13 = (Offset) $result;     // Catch: Throwable -> L33
            if (r13 == null) goto L32;
            long scrollDelta = r13.m4135unboximpl();     // Catch: Throwable -> L33
            Object $result3 = $result2;
            AwaitPointerEventScope $this$awaitPointerEventScope3 = $this$awaitPointerEventScope2;
            AnonymousClass2 r2 = r3;
        L23:
            int bits$iv$iv$iv = (int) (4294967295L & scrollDelta);
            float zoomChange = (float) Math.pow(2.0d, Float.intBitsToFloat(bits$iv$iv$iv) / 545.0f);     // Catch: Throwable -> L35
            r2.$channel.mo8915trySendJP2dKIU(new TransformEvent.TransformDelta(zoomChange, Offset.Companion.m4141getZeroF1C5BW0(), 0.0f, null));     // Catch: Throwable -> L35
            r2.L$0 = $this$awaitPointerEventScope3;     // Catch: Throwable -> L35
            r2.label = 2;     // Catch: Throwable -> L35
            Object r4 = TransformableKt.access$awaitCtrlMouseScrollOrNull($this$awaitPointerEventScope3, r2.$scrollConfig, r2);     // Catch: Throwable -> L35
            if (r4 != r0) goto L27;
            return r0;
        L27:
            AwaitPointerEventScope r11 = $this$awaitPointerEventScope3;
            $result2 = $result3;
            $result = r4;
            r3 = r2;
            $this$awaitPointerEventScope2 = r11;
        L35:
            th = th;
        L36:
            r2.$channel.mo8915trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
            throw th;
        L32:
            r3.$channel.mo8915trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
            $result = $result2;
            AwaitPointerEventScope $this$awaitPointerEventScope4 = $this$awaitPointerEventScope2;
            AnonymousClass2 r5 = r3;
        L16:
            if (JobKt.isActive(r5.$currentContext) == false) goto L39;
            r5.L$0 = $this$awaitPointerEventScope4;     // Catch: Throwable -> L35
            r5.label = 1;     // Catch: Throwable -> L35
            Object r6 = TransformableKt.access$awaitFirstCtrlMouseScroll($this$awaitPointerEventScope4, r5.$scrollConfig, r5);     // Catch: Throwable -> L35
            if (r6 != r0) goto L20;
            return r0;
        L20:
            AwaitPointerEventScope r12 = $this$awaitPointerEventScope4;
            Object $result4 = $result;
            $result = r6;
            AnonymousClass2 r7 = r5;
            AwaitPointerEventScope $this$awaitPointerEventScope5 = r12;
        L21:
            scrollDelta = ((Offset) $result).m4135unboximpl();     // Catch: Throwable -> L33
            r7.$channel.mo8915trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);     // Catch: Throwable -> L33
            $result3 = $result4;
            $this$awaitPointerEventScope3 = $this$awaitPointerEventScope5;
            r2 = r7;
            goto L23
        L39:
            return Unit.INSTANCE;
        L33:
            th = th;
            r2 = r3;
            goto L36
        L9:
            AwaitPointerEventScope $this$awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L12
            r7 = this;
            $this$awaitPointerEventScope5 = $this$awaitPointerEventScope6;
            $result4 = $result;
            goto L21
        L14:
            ResultKt.throwOnFailure($result);
            $this$awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
            r5 = this;
            goto L16
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L12:
            th = th;
            r2 = this;
            goto L36
        }
    }

    public static final /* synthetic */ Object access$awaitCtrlMouseScrollOrNull(AwaitPointerEventScope $receiver, ScrollConfig scrollConfig, Continuation $completion) {
        return awaitCtrlMouseScrollOrNull($receiver, scrollConfig, $completion);
    }

    public static final /* synthetic */ Object access$awaitFirstCtrlMouseScroll(AwaitPointerEventScope $receiver, ScrollConfig scrollConfig, Continuation $completion) {
        return awaitFirstCtrlMouseScroll($receiver, scrollConfig, $completion);
    }

    public static final /* synthetic */ Object access$detectZoom(AwaitPointerEventScope $receiver, boolean panZoomLock, Channel channel, Function1 canPan, Continuation $completion) {
        return detectZoom($receiver, panZoomLock, channel, canPan, $completion);
    }

    public static final /* synthetic */ Object access$detectZoomByCtrlMouseScroll(PointerInputScope $receiver, Channel channel, ScrollConfig scrollConfig, Continuation $completion) {
        return detectZoomByCtrlMouseScroll($receiver, channel, scrollConfig, $completion);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier r0, TransformableState r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = true;
    L9:
        return transformable(r0, r1, r2, r3);
    }

    public static final Modifier transformable(Modifier $this$transformable, TransformableState state, boolean lockRotationOnZoomPan, boolean enabled) {
        return transformable($this$transformable, state, C02741.INSTANCE, lockRotationOnZoomPan, enabled);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier r0, TransformableState r1, Function1 r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = false;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = true;
    L9:
        return transformable(r0, r1, r2, r3, r4);
    }

    public static final Modifier transformable(Modifier $this$transformable, TransformableState state, Function1<? super Offset, Boolean> r3, boolean lockRotationOnZoomPan, boolean enabled) {
        return $this$transformable.then(new TransformableElement(state, r3, lockRotationOnZoomPan, enabled));
    }

    private static final Object detectZoomByCtrlMouseScroll(PointerInputScope $this$detectZoomByCtrlMouseScroll, Channel<TransformEvent> r4, ScrollConfig scrollConfig, Continuation<? super Unit> r6) {
        CoroutineContext currentContext = r6.getContext();
        Object r0 = $this$detectZoomByCtrlMouseScroll.awaitPointerEventScope(new AnonymousClass2(currentContext, scrollConfig, r4, null), r6);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:18:0x0052). Please report as a decompilation issue!!! */
    private static final Object awaitFirstCtrlMouseScroll(AwaitPointerEventScope $this$awaitFirstCtrlMouseScroll, ScrollConfig scrollConfig, Continuation<? super Offset> r7) {
        if ((r7 instanceof C02721) == false) goto L7;
        C02721 r0 = (C02721) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ScrollConfig scrollConfig2 = (ScrollConfig) r0.L$1;
        AwaitPointerEventScope $this$awaitFirstCtrlMouseScroll2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r3 = $result2;
        Object $result3 = $result;
    L18:
        Offset offset = (Offset) $result;
        if (offset == null) goto L21;
        return offset;
    L21:
        $result = $result3;
        $result2 = r3;
    L14:
        r0.L$0 = $this$awaitFirstCtrlMouseScroll2;
        r0.L$1 = scrollConfig2;
        r0.label = 1;
        Object r4 = awaitCtrlMouseScrollOrNull($this$awaitFirstCtrlMouseScroll2, scrollConfig2, r0);
        if (r4 != $result2) goto L17;
        return $result2;
    L17:
        Object r5 = $result2;
        $result3 = $result;
        $result = r4;
        r3 = r5;
        goto L18
    L13:
        ResultKt.throwOnFailure($result);
        $this$awaitFirstCtrlMouseScroll2 = $this$awaitFirstCtrlMouseScroll;
        scrollConfig2 = scrollConfig;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C02721(r7);
        goto L8
    }

    private static final Object awaitCtrlMouseScrollOrNull(AwaitPointerEventScope $this$awaitCtrlMouseScrollOrNull, ScrollConfig scrollConfig, Continuation<? super Offset> r12) {
        if ((r12 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ScrollConfig $this$awaitCtrlMouseScrollOrNull_u24lambda_u240 = (ScrollConfig) r0.L$1;
        AwaitPointerEventScope $this$awaitCtrlMouseScrollOrNull2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r3 = $result;
    L17:
        PointerEvent pointer = (PointerEvent) r3;
        if (PointerEvent_androidKt.m5556isCtrlPressed5xRPYO0(pointer.m5530getKeyboardModifiersk7X9c1A()) == true) goto L20;
    L30:
        return null;
    L20:
        if (PointerEventType.m5538equalsimpl0(pointer.m5531getType7fucELk(), PointerEventType.Companion.m5547getScroll7fucELk()) == false) goto L30;
        long scrollDelta = $this$awaitCtrlMouseScrollOrNull_u24lambda_u240.mo398calculateMouseWheelScroll8xgXZGE($this$awaitCtrlMouseScrollOrNull2, pointer, $this$awaitCtrlMouseScrollOrNull2.mo5498getSizeYbymL2g());
        if (Offset.m4122equalsimpl0(scrollDelta, Offset.Companion.m4141getZeroF1C5BW0()) == false) goto L25;
        return null;
    L25:
        List<PointerInputChange> r4 = pointer.getChanges();
        int index$iv = 0;
        int r5 = r4.size();
    L26:
        if (index$iv >= r5) goto L29;
        Object item$iv = r4.get(index$iv);
        PointerInputChange it = (PointerInputChange) item$iv;
        it.consume();
        index$iv = index$iv + 1;
        goto L26
    L29:
        return Offset.m4114boximpl(scrollDelta);
    L13:
        ResultKt.throwOnFailure($result);
        r0.L$0 = $this$awaitCtrlMouseScrollOrNull;
        r0.L$1 = scrollConfig;
        r0.label = 1;
        r3 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitCtrlMouseScrollOrNull, null, r0, 1, null);
        if (r3 != r2) goto L16;
        return r2;
    L16:
        $this$awaitCtrlMouseScrollOrNull2 = $this$awaitCtrlMouseScrollOrNull;
        $this$awaitCtrlMouseScrollOrNull_u24lambda_u240 = scrollConfig;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r12);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02bc -> B:90:0x02de). Please report as a decompilation issue!!! */
    private static final Object detectZoom(AwaitPointerEventScope $this$detectZoom, boolean r31, Channel<TransformEvent> r32, Function1<? super Offset, Boolean> r33, Continuation<? super Unit> r34) {
        if ((r34 instanceof C02731) == false) goto L7;
        C02731 r1 = (C02731) r34;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        C02731 r5 = r1;
        Object $result = r5.result;
        Object r8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r5.label) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        int r2 = r5.I$2;
        int r3 = r5.I$1;
        float touchSlop = r5.F$2;
        int r6 = r5.I$0;
        long pan = r5.J$0;
        float zoom = r5.F$1;
        float rotation = r5.F$0;
        boolean panZoomLock = r5.Z$0;
        PointerEvent event = (PointerEvent) r5.L$3;
        Function1<? super Offset, Boolean> r9 = (Function1) r5.L$2;
        Channel<TransformEvent> r10 = (Channel) r5.L$1;
        AwaitPointerEventScope $this$detectZoom2 = (AwaitPointerEventScope) r5.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$detectZoom3 = $this$detectZoom2;
        PointerEvent event2 = event;
        Continuation $completion = r34;
        Channel<TransformEvent> r15 = r10;
        float rotation2 = rotation;
        Function1<? super Offset, Boolean> r13 = r9;
        Object r11 = r8;
        C02731 r12 = r5;
        int r7 = r6;
        float touchSlop2 = touchSlop;
        Object $result2 = $result;
    L90:
        PointerEvent finalEvent = (PointerEvent) $result;
        List<PointerInputChange> r4 = finalEvent.getChanges();
        Continuation $completion2 = $completion;
        int r0 = r4.size();
        int r35 = r2;
        int index$iv$iv = 0;
    L91:
        if (index$iv$iv >= r0) goto L96;
        Object item$iv$iv = r4.get(index$iv$iv);
        if (((PointerInputChange) item$iv$iv).isConsumed() == true) goto L94;
        index$iv$iv = index$iv$iv + 1;
        goto L91
    L94:
        boolean r14 = true;
    L97:
        if (r14 == false) goto L100;
        if (r7 != 0) goto L100;
        boolean finallyCanceled = true;
    L101:
        if (r35 != 0) goto L114;
        if (finallyCanceled == true) goto L114;
        List<PointerInputChange> r16 = event2.getChanges();
        int $i$f$fastAny = r16.size();
        int $i$f$fastForEach = 0;
    L104:
        if ($i$f$fastForEach >= $i$f$fastAny) goto L109;
        Object item$iv$iv2 = r16.get($i$f$fastForEach);
        if (((PointerInputChange) item$iv$iv2).getPressed() == true) goto L107;
        $i$f$fastForEach = $i$f$fastForEach + 1;
        goto L104
    L107:
        boolean r17 = true;
    L110:
        if (r17 == false) goto L114;
        Continuation $completion3 = $completion2;
        int r18 = r3;
        Object $result3 = $result2;
        int r19 = r7;
        float touchSlop3 = touchSlop2;
        float zoom2 = zoom;
        C02731 r20 = r12;
        long pan2 = pan;
        Function1<? super Offset, Boolean> r110 = r13;
        boolean panZoomLock2 = panZoomLock;
        Channel<TransformEvent> r111 = r15;
        AwaitPointerEventScope $this$detectZoom4 = $this$detectZoom3;
    L20:
        r20.L$0 = $this$detectZoom4;
        r20.L$1 = r111;
        r20.L$2 = r110;
        r20.L$3 = null;
        r20.Z$0 = panZoomLock2;
        r20.F$0 = rotation2;
        r20.F$1 = zoom2;
        r20.J$0 = pan2;
        r20.I$0 = r19;
        r20.F$2 = touchSlop3;
        r20.I$1 = r18;
        Continuation $completion4 = $completion3;
        r20.label = 2;
        Object r112 = AwaitPointerEventScope.awaitPointerEvent$default($this$detectZoom4, null, r20, 1, null);
        if (r112 != r11) goto L23;
        return r11;
    L23:
        AwaitPointerEventScope r21 = $this$detectZoom4;
        Channel<TransformEvent> r113 = r111;
        AwaitPointerEventScope $this$detectZoom5 = r21;
        boolean panZoomLock3 = panZoomLock2;
        float rotation3 = rotation2;
        Object r114 = r11;
        long pan3 = pan2;
        C02731 r22 = r20;
        touchSlop2 = touchSlop3;
        Object r23 = $result3;
        int r24 = r18;
        Continuation $completion5 = $completion4;
    L24:
        PointerEvent event3 = (PointerEvent) r112;
        List<PointerInputChange> r30 = event3.getChanges();
        Continuation $completion6 = $completion5;
        int r25 = r30.size();
        int r36 = r24;
        int index$iv$iv2 = 0;
    L25:
        if (index$iv$iv2 >= r25) goto L30;
        int r37 = r25;
        List<PointerInputChange> r26 = r30;
        Object item$iv$iv3 = r26.get(index$iv$iv2);
        if (((PointerInputChange) item$iv$iv3).isConsumed() == true) goto L28;
        index$iv$iv2 = index$iv$iv2 + 1;
        r30 = r26;
        r25 = r37;
        goto L25
    L28:
        int r27 = 1;
    L31:
        r2 = r27;
        if (r2 != 0) goto L85;
        float zoomChange = TransformGestureDetectorKt.calculateZoom(event3);
        float rotationChange = TransformGestureDetectorKt.calculateRotation(event3);
        int r38 = r19;
        long panChange = TransformGestureDetectorKt.calculatePan(event3);
        if (r38 != 0) goto L52;
        zoom2 = zoom2 * zoomChange;
        rotation3 = rotation3 + rotationChange;
        pan3 = Offset.m4130plusMKHz9U(pan3, panChange);
        float rotationChange2 = rotationChange;
        float centroidSize = TransformGestureDetectorKt.calculateCentroidSize(event3, false);
        float zoomMotion = Math.abs(1.0f - zoom2) * centroidSize;
        float centroidSize2 = Math.abs(((3.1415927f * rotation3) * centroidSize) / 180.0f);
        float panMotion = Offset.m4123getDistanceimpl(pan3);
        if (zoomMotion > touchSlop2) goto L46;
        if (centroidSize2 > touchSlop2) goto L46;
        if (panMotion > touchSlop2) goto L42;
    L44:
        int r115 = r36;
        int r28 = r38;
    L53:
        if (r28 != 0) goto L55;
        long pan4 = pan3;
    L84:
        pan3 = pan4;
        r3 = r115;
    L86:
        PointerEventPass r29 = PointerEventPass.Final;
        r22.L$0 = $this$detectZoom5;
        r22.L$1 = r113;
        r22.L$2 = r110;
        r22.L$3 = event3;
        r22.Z$0 = panZoomLock3;
        r22.F$0 = rotation3;
        r22.F$1 = zoom2;
        r22.J$0 = pan3;
        r22.I$0 = r28;
        r22.F$2 = touchSlop2;
        r22.I$1 = r3;
        r22.I$2 = r2;
        boolean panZoomLock4 = panZoomLock3;
        r22.label = 3;
        Object r39 = $this$detectZoom5.awaitPointerEvent(r29, r22);
        if (r39 != r114) goto L89;
        return r114;
    L89:
        $result2 = r23;
        $this$detectZoom3 = $this$detectZoom5;
        event2 = event3;
        r13 = r110;
        r15 = r113;
        panZoomLock = panZoomLock4;
        $completion = $completion6;
        int r210 = r28;
        $result = r39;
        float r211 = zoom2;
        r7 = r210;
        C02731 r212 = r22;
        zoom = r211;
        long r213 = pan3;
        r12 = r212;
        r11 = r114;
        rotation2 = rotation3;
        pan = r213;
        goto L90
    L55:
        if (r115 == 0) goto L57;
        float effectiveRotation = 0.0f;
    L59:
        if (effectiveRotation != 0.0f) goto L61;
        boolean r116 = true;
    L62:
        if (r116 == true) goto L64;
        pan4 = pan3;
    L75:
        r113.mo8915trySendJP2dKIU(new TransformEvent.TransformDelta(zoomChange, panChange, effectiveRotation, null));
    L76:
        List<PointerInputChange> r40 = event3.getChanges();
        int index$iv = 0;
        int r41 = r40.size();
    L77:
        if (index$iv >= r41) goto L84;
        Object item$iv = r40.get(index$iv);
        PointerInputChange it = (PointerInputChange) item$iv;
        if (PointerEventKt.positionChanged(it) == false) goto L81;
        it.consume();
    L81:
        index$iv = index$iv + 1;
        goto L77
    L64:
        if (zoomChange != 1.0f) goto L66;
        boolean r117 = true;
    L67:
        if (r117 == false) goto L73;
        pan4 = pan3;
        if (Offset.m4122equalsimpl0(panChange, Offset.Companion.m4141getZeroF1C5BW0()) == true) goto L76;
        if (r110.invoke(Offset.m4114boximpl(panChange)).booleanValue() == false) goto L76;
    L73:
        pan4 = pan3;
        goto L75
    L66:
        r117 = false;
        goto L67
    L61:
        r116 = false;
        goto L62
    L57:
        effectiveRotation = rotationChange2;
        goto L59
    L42:
        if (r110.invoke(Offset.m4114boximpl(panChange)).booleanValue() == false) goto L44;
    L46:
        if (panZoomLock3 == true) goto L48;
    L50:
        r115 = 0;
    L51:
        r113.mo8915trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
        r28 = 1;
        goto L53
    L48:
        if (centroidSize2 >= touchSlop2) goto L50;
        r115 = 1;
        goto L51
    L52:
        rotationChange2 = rotationChange;
        r115 = r36;
        r28 = r38;
        goto L53
    L85:
        r113.mo8915trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
        r3 = r36;
        r28 = r19;
        goto L86
    L30:
        r27 = 0;
        goto L31
    L109:
        r17 = false;
    L114:
        return Unit.INSTANCE;
    L100:
        finallyCanceled = false;
        goto L101
    L96:
        r14 = false;
        goto L97
    L13:
        int r42 = r5.I$1;
        float touchSlop4 = r5.F$2;
        int r43 = r5.I$0;
        long pan5 = r5.J$0;
        float zoom3 = r5.F$1;
        float rotation4 = r5.F$0;
        boolean panZoomLock5 = r5.Z$0;
        Function1<? super Offset, Boolean> r118 = (Function1) r5.L$2;
        Channel<TransformEvent> r119 = (Channel) r5.L$1;
        $this$detectZoom5 = (AwaitPointerEventScope) r5.L$0;
        ResultKt.throwOnFailure($result);
        r112 = $result;
        r113 = r119;
        $completion5 = r34;
        r110 = r118;
        rotation3 = rotation4;
        r24 = r42;
        panZoomLock3 = panZoomLock5;
        r114 = r8;
        pan3 = pan5;
        touchSlop2 = touchSlop4;
        r22 = r5;
        zoom2 = zoom3;
        r19 = r43;
        r23 = r112;
        goto L24
    L14:
        int r44 = r5.I$1;
        float touchSlop5 = r5.F$2;
        int r45 = r5.I$0;
        long pan6 = r5.J$0;
        float zoom4 = r5.F$1;
        float rotation5 = r5.F$0;
        boolean panZoomLock6 = r5.Z$0;
        Function1<? super Offset, Boolean> r120 = (Function1) r5.L$2;
        Channel<TransformEvent> r121 = (Channel) r5.L$1;
        AwaitPointerEventScope $this$detectZoom6 = (AwaitPointerEventScope) r5.L$0;
        ResultKt.throwOnFailure($result);
    L19:
        $this$detectZoom4 = $this$detectZoom6;
        r111 = r121;
        r110 = r120;
        panZoomLock2 = panZoomLock6;
        rotation2 = rotation5;
        r11 = r8;
        pan2 = pan6;
        r20 = r5;
        zoom2 = zoom4;
        r19 = r45;
        touchSlop3 = touchSlop5;
        $result3 = $result;
        r18 = r44;
        $completion3 = r34;
        goto L20
    L15:
        ResultKt.throwOnFailure($result);
        r121 = r32;
        panZoomLock6 = r31;
        r120 = r33;
        rotation5 = 0.0f;
        long pan7 = Offset.Companion.m4141getZeroF1C5BW0();
        float touchSlop6 = $this$detectZoom.getViewConfiguration().getTouchSlop();
        r5.L$0 = $this$detectZoom;
        r5.L$1 = r121;
        r5.L$2 = r120;
        r5.Z$0 = panZoomLock6;
        r5.F$0 = 0.0f;
        r5.F$1 = 1.0f;
        r5.J$0 = pan7;
        r5.I$0 = 0;
        r5.F$2 = touchSlop6;
        r5.I$1 = 0;
        r5.label = 1;
        if (TapGestureDetectorKt.awaitFirstDown$default($this$detectZoom, false, null, r5, 2, null) != r8) goto L18;
        return r8;
    L18:
        zoom4 = 1.0f;
        pan6 = pan7;
        r45 = 0;
        r44 = 0;
        $this$detectZoom6 = $this$detectZoom;
        touchSlop5 = touchSlop6;
        goto L19
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C02731(r34);
        goto L8
    }
}
