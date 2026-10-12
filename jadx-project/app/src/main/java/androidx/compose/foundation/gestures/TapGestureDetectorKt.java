package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.InputDeviceCompat;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0001H\u0087@¢\u0006\u0002\u0010\u001b\u001a&\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001e\u001a&\u0010\u001f\u001a\u00020\u0018*\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0080@¢\u0006\u0002\u0010\u001e\u001a\u001c\u0010 \u001a\u0004\u0018\u00010\u0018*\u00020\u00192\u0006\u0010!\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\"\u001a\u0012\u0010#\u001a\u00020\u000e*\u00020\u0019H\u0082@¢\u0006\u0002\u0010$\u001a[\u0010%\u001a\u00020\u000e*\u00020&2/\b\u0002\u0010'\u001a)\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n¢\u0006\u0002\b\u00102\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010)H\u0080@¢\u0006\u0002\u0010*\u001a\u008b\u0001\u0010+\u001a\u00020\u000e*\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010)2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010)2/\b\u0002\u0010'\u001a)\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n¢\u0006\u0002\b\u00102\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010)H\u0086@¢\u0006\u0002\u0010.\u001a\u001e\u0010/\u001a\u00020\u0001*\u0002002\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u0001H\u0002\u001aL\u00102\u001a\u000203*\u0002042\u0006\u00105\u001a\u0002032\b\b\u0002\u00106\u001a\u00020\u00132'\u00107\u001a#\b\u0001\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f08¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0002\u00109\u001a\u001c\u0010:\u001a\u00020;*\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0080@¢\u0006\u0002\u0010<\u001a\u0014\u0010=\u001a\u0004\u0018\u00010\u0018*\u00020\u0019H\u0087@¢\u0006\u0002\u0010$\u001a\u001e\u0010=\u001a\u0004\u0018\u00010\u0018*\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010<\"*\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\"7\u0010\t\u001a)\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n¢\u0006\u0002\b\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011\"\u001a\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0016¨\u0006>"}, d2 = {"value", "", "DetectTapGesturesEnableNewDispatchingBehavior", "getDetectTapGesturesEnableNewDispatchingBehavior$annotations", "()V", "getDetectTapGesturesEnableNewDispatchingBehavior", "()Z", "setDetectTapGesturesEnableNewDispatchingBehavior", "(Z)V", "NoPressGesture", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "coroutineStartForCurrentDispatchBehavior", "Lkotlinx/coroutines/CoroutineStart;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "getCoroutineStartForCurrentDispatchBehavior", "()Lkotlinx/coroutines/CoroutineStart;", "awaitFirstDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "requireUnconsumed", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPrimaryFirstDown", "awaitSecondDown", "firstUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onPress", "onTap", "Lkotlin/Function1;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapGestures", "onDoubleTap", "onLongPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isChangedToDown", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onlyPrimaryMouseButton", "launchAwaitingReset", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "resetJob", "start", "block", "Lkotlin/Function2;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/Job;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "waitForLongPress", "Landroidx/compose/foundation/gestures/LongPressResult;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TapGestureDetectorKt {
    private static final Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> NoPressGesture = null;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {291}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {304}, m = "awaitPrimaryFirstDown", n = {"$this$awaitPrimaryFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitPrimaryFirstDown(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {227}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
    static final class C02642 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        C02642(PointerInputChange r2, Continuation<? super C02642> r3) {
            this.$firstUp = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02642 r0 = new C02642(this.$firstUp, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super PointerInputChange> r4) {
            return ((C02642) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super PointerInputChange> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004c -> B:12:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            long minUptime = this.J$0;
            AwaitPointerEventScope $this$withTimeoutOrNull = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            C02642 r9 = this;
            long minUptime2 = minUptime;
            Object r1 = $result2;
            Object $result3 = $result;
        L12:
            PointerInputChange change = (PointerInputChange) $result;
            if (change.getUptimeMillis() < minUptime2) goto L15;
            return change;
        L15:
            $result = $result3;
            $result2 = r1;
            AwaitPointerEventScope $this$withTimeoutOrNull2 = $this$withTimeoutOrNull;
        L8:
            r9.L$0 = $this$withTimeoutOrNull2;
            r9.J$0 = minUptime2;
            r9.label = 1;
            Object r2 = TapGestureDetectorKt.awaitFirstDown$default($this$withTimeoutOrNull2, false, null, r9, 3, null);
            if (r2 != $result2) goto L11;
            return $result2;
        L11:
            $this$withTimeoutOrNull = $this$withTimeoutOrNull2;
            r1 = $result2;
            $result3 = $result;
            $result = r2;
            goto L12
        L7:
            ResultKt.throwOnFailure($result);
            $this$withTimeoutOrNull2 = (AwaitPointerEventScope) this.L$0;
            long minUptime3 = this.$firstUp.getUptimeMillis() + $this$withTimeoutOrNull2.getViewConfiguration().getDoubleTapMinTimeMillis();
            r9 = this;
            minUptime2 = minUptime3;
            goto L8
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {209}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
    static final class C02651 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02651(Continuation<? super C02651> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.access$consumeUntilUp(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    static final class C02662 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0, 0, 1}, l = {251, InputDeviceCompat.SOURCE_KEYBOARD}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, s = {"L$0", "L$1", "L$0"})
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
            static final class C00231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                C00231(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r2, PressGestureScopeImpl r3, PointerInputChange r4, Continuation<? super C00231> r5) {
                    this.$onPress = r2;
                    this.$pressScope = r3;
                    this.$down = r4;
                    super(2, r5);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                    return new C00231(this.$onPress, this.$pressScope, this.$down, r6);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00231) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L7;
                        case 1: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure($result);
                L11:
                    return Unit.INSTANCE;
                L7:
                    ResultKt.throwOnFailure($result);
                    Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> r1 = this.$onPress;
                    PressGestureScopeImpl r2 = this.$pressScope;
                    Offset r3 = Offset.m4114boximpl(this.$down.m5589getPositionF1C5BW0());
                    this.label = 1;
                    if (r1.invoke(r2, r3, this) != r0) goto L11;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C00242 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                C00242(PressGestureScopeImpl r2, Continuation<? super C00242> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new C00242(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00242) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                AnonymousClass3(PressGestureScopeImpl r2, Continuation<? super AnonymousClass3> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new AnonymousClass3(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineScope r2, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r3, Function1<? super Offset, Unit> r4, PressGestureScopeImpl r5, Continuation<? super AnonymousClass1> r6) {
                this.$$this$coroutineScope = r2;
                this.$onPress = r3;
                this.$onTap = r4;
                this.$pressScope = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, r8);
                r0.L$0 = r7;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
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
                Job resetJob = (Job) this.L$0;
                ResultKt.throwOnFailure($result);
                Job resetJob2 = resetJob;
            L18:
                PointerInputChange up = (PointerInputChange) $result;
                if (up != null) goto L21;
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob2, null, new C00242(this.$pressScope, null), 2, null);
            L25:
                return Unit.INSTANCE;
            L21:
                up.consume();
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob2, null, new AnonymousClass3(this.$pressScope, null), 2, null);
                Function1<Offset, Unit> r1 = this.$onTap;
                if (r1 == null) goto L25;
                r1.invoke(Offset.m4114boximpl(up.m5589getPositionF1C5BW0()));
                goto L25
            L7:
                Job resetJob3 = (Job) this.L$1;
                AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                resetJob2 = resetJob3;
                AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
            L12:
                PointerInputChange it = (PointerInputChange) $result;
                it.consume();
                PointerInputChange down = (PointerInputChange) $result;
                if (this.$onPress == TapGestureDetectorKt.access$getNoPressGesture$p()) goto L15;
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob2, null, new C00231(this.$onPress, this.$pressScope, down, null), 2, null);
            L15:
                this.L$0 = resetJob2;
                this.L$1 = null;
                this.label = 2;
                $result = TapGestureDetectorKt.waitForUpOrCancellation$default($this$awaitEachGesture2, null, this, 1, null);
                if ($result != r0) goto L18;
                return r0;
            L8:
                ResultKt.throwOnFailure($result);
                AwaitPointerEventScope $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
                Job resetJob4 = BuildersKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior(), new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.$pressScope, null), 1, null);
                this.L$0 = $this$awaitEachGesture3;
                this.L$1 = resetJob4;
                this.label = 1;
                Object r5 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture3, false, null, this, 3, null);
                if (r5 != r0) goto L11;
                return r0;
            L11:
                $result = r5;
                resetJob2 = resetJob4;
                $this$awaitEachGesture2 = $this$awaitEachGesture3;
                goto L12
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C02662(PointerInputScope r2, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r3, Function1<? super Offset, Unit> r4, PressGestureScopeImpl r5, Continuation<? super C02662> r6) {
            this.$this_detectTapAndPress = r2;
            this.$onPress = r3;
            this.$onTap = r4;
            this.$pressScope = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            C02662 r0 = new C02662(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, r8);
            r0.L$0 = r7;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02662) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(this.$this_detectTapAndPress, new AnonymousClass1($this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {LocationRequestCompat.QUALITY_LOW_POWER}, m = "invokeSuspend", n = {}, s = {})
    static final class C02672 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
        final /* synthetic */ Function1<Offset, Unit> $onLongPress;
        final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", "down", "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
            final /* synthetic */ Function1<Offset, Unit> $onLongPress;
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            static final class C00251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                C00251(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r2, PressGestureScopeImpl r3, PointerInputChange r4, Continuation<? super C00251> r5) {
                    this.$onPress = r2;
                    this.$pressScope = r3;
                    this.$down = r4;
                    super(2, r5);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                    return new C00251(this.$onPress, this.$pressScope, this.$down, r6);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00251) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L7;
                        case 1: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure($result);
                L11:
                    return Unit.INSTANCE;
                L7:
                    ResultKt.throwOnFailure($result);
                    Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> r1 = this.$onPress;
                    PressGestureScopeImpl r2 = this.$pressScope;
                    Offset r3 = Offset.m4114boximpl(this.$down.m5589getPositionF1C5BW0());
                    this.label = 1;
                    if (r1.invoke(r2, r3, this) != r0) goto L11;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C00262 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                C00262(PressGestureScopeImpl r2, Continuation<? super C00262> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new C00262(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00262) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                AnonymousClass3(PressGestureScopeImpl r2, Continuation<? super AnonymousClass3> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new AnonymousClass3(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                AnonymousClass4(PressGestureScopeImpl r2, Continuation<? super AnonymousClass4> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new AnonymousClass4(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass4) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {157, 158}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Job $cancelOrReleaseJob;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                AnonymousClass5(Job r2, PressGestureScopeImpl r3, Continuation<? super AnonymousClass5> r4) {
                    this.$cancelOrReleaseJob = r2;
                    this.$pressScope = r3;
                    super(2, r4);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                    return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, r5);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass5) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                    ResultKt.throwOnFailure($result);
                L15:
                    return Unit.INSTANCE;
                L7:
                    ResultKt.throwOnFailure($result);
                L11:
                    this.label = 2;
                    if (this.$pressScope.reset(this) != r0) goto L15;
                    return r0;
                L8:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (this.$cancelOrReleaseJob.join(this) != r0) goto L11;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass6(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r2, PressGestureScopeImpl r3, PointerInputChange r4, Continuation<? super AnonymousClass6> r5) {
                    this.$onPress = r2;
                    this.$pressScope = r3;
                    this.$secondDown = r4;
                    super(2, r5);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                    return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, r6);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass6) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L7;
                        case 1: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure($result);
                L11:
                    return Unit.INSTANCE;
                L7:
                    ResultKt.throwOnFailure($result);
                    Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> r1 = this.$onPress;
                    PressGestureScopeImpl r2 = this.$pressScope;
                    Offset r3 = Offset.m4114boximpl(this.$secondDown.m5589getPositionF1C5BW0());
                    this.label = 1;
                    if (r1.invoke(r2, r3, this) != r0) goto L11;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                AnonymousClass7(PressGestureScopeImpl r2, Continuation<? super AnonymousClass7> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new AnonymousClass7(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass7) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                AnonymousClass8(PressGestureScopeImpl r2, Continuation<? super AnonymousClass8> r3) {
                    this.$pressScope = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new AnonymousClass8(this.$pressScope, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((AnonymousClass8) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object r2) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure(r2);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineScope r2, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r3, Function1<? super Offset, Unit> r4, Function1<? super Offset, Unit> r5, Function1<? super Offset, Unit> r6, PressGestureScopeImpl r7, Continuation<? super AnonymousClass1> r8) {
                this.$$this$coroutineScope = r2;
                this.$onPress = r3;
                this.$onLongPress = r4;
                this.$onDoubleTap = r5;
                this.$onTap = r6;
                this.$pressScope = r7;
                super(2, r8);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r9, Continuation<?> r10) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, r10);
                r0.L$0 = r9;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L14;
                    case 1: goto L13;
                    case 2: goto L12;
                    case 3: goto L11;
                    case 4: goto L10;
                    case 5: goto L9;
                    case 6: goto L8;
                    case 7: goto L7;
                    case 8: goto L6;
                    default: goto L5;
                };
            L6:
                Job resetJob = (Job) this.L$0;
                ResultKt.throwOnFailure($result);
                Job resetJob2 = resetJob;
            L86:
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob2, null, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null), 2, null);
                return Unit.INSTANCE;
            L7:
                PointerInputChange secondDown = (PointerInputChange) this.L$3;
                PointerInputChange upOrCancel = (PointerInputChange) this.L$2;
                Job resetJob3 = (Job) this.L$1;
                AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
                PointerInputChange upOrCancel2 = upOrCancel;
                PointerInputChange upOrCancel3 = secondDown;
                $result = $result;
            L80:
                LongPressResult longPressResult = (LongPressResult) $result;
                if (Intrinsics.areEqual(longPressResult, LongPressResult.Success.INSTANCE) == false) goto L89;
                this.$onLongPress.invoke(Offset.m4114boximpl(upOrCancel3.m5589getPositionF1C5BW0()));
                this.L$0 = resetJob3;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 8;
                if (TapGestureDetectorKt.access$consumeUntilUp($this$awaitEachGesture2, this) != r0) goto L85;
                return r0;
            L85:
                resetJob2 = resetJob3;
                goto L86
            L89:
                if ((longPressResult instanceof LongPressResult.Released) == false) goto L92;
                PointerInputChange secondUp = ((LongPressResult.Released) longPressResult).getFinalUpChange();
                PointerInputChange upOrCancel4 = upOrCancel2;
                Job resetJob4 = resetJob3;
            L95:
                if (secondUp == null) goto L97;
                secondUp.consume();
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob4, null, new AnonymousClass7(this.$pressScope, null), 2, null);
                this.$onDoubleTap.invoke(Offset.m4114boximpl(secondUp.m5589getPositionF1C5BW0()));
            L104:
                return Unit.INSTANCE;
            L97:
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob4, null, new AnonymousClass8(this.$pressScope, null), 2, null);
                Function1<Offset, Unit> r15 = this.$onTap;
                if (r15 == null) goto L104;
                r15.invoke(Offset.m4114boximpl(upOrCancel4.m5589getPositionF1C5BW0()));
                goto L104
            L92:
                if ((longPressResult instanceof LongPressResult.Canceled) == false) goto L102;
                secondUp = null;
                upOrCancel4 = upOrCancel2;
                resetJob4 = resetJob3;
                goto L95
            L102:
                throw new NoWhenBranchMatchedException();
            L8:
                upOrCancel4 = (PointerInputChange) this.L$1;
                Job resetJob5 = (Job) this.L$0;
                ResultKt.throwOnFailure($result);
                Job resetJob6 = resetJob5;
            L75:
                secondUp = (PointerInputChange) $result;
                resetJob4 = resetJob6;
                goto L95
            L9:
                Job cancelOrReleaseJob = (Job) this.L$2;
                PointerInputChange upOrCancel5 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                $this$awaitEachGesture2 = $this$awaitEachGesture3;
                Job cancelOrReleaseJob2 = cancelOrReleaseJob;
                $result = $result;
            L60:
                PointerInputChange secondDown2 = (PointerInputChange) $result;
                if (secondDown2 != null) goto L66;
                Function1<Offset, Unit> r16 = this.$onTap;
                if (r16 == null) goto L104;
                r16.invoke(Offset.m4114boximpl(upOrCancel5.m5589getPositionF1C5BW0()));
                goto L104
            L66:
                resetJob6 = BuildersKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior(), new AnonymousClass5(cancelOrReleaseJob2, this.$pressScope, null), 1, null);
                if (this.$onPress == TapGestureDetectorKt.access$getNoPressGesture$p()) goto L70;
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob6, null, new AnonymousClass6(this.$onPress, this.$pressScope, secondDown2, null), 2, null);
            L70:
                if (this.$onLongPress != null) goto L76;
                this.L$0 = resetJob6;
                this.L$1 = upOrCancel5;
                this.L$2 = null;
                this.label = 6;
                $result = TapGestureDetectorKt.waitForUpOrCancellation$default($this$awaitEachGesture2, null, this, 1, null);
                if ($result != r0) goto L74;
                return r0;
            L74:
                upOrCancel4 = upOrCancel5;
                goto L75
            L76:
                this.L$0 = $this$awaitEachGesture2;
                this.L$1 = resetJob6;
                this.L$2 = upOrCancel5;
                this.L$3 = secondDown2;
                this.label = 7;
                Object r2 = TapGestureDetectorKt.waitForLongPress$default($this$awaitEachGesture2, null, this, 1, null);
                if (r2 != r0) goto L79;
                return r0;
            L79:
                upOrCancel3 = secondDown2;
                $result = r2;
                upOrCancel2 = upOrCancel5;
                resetJob3 = resetJob6;
                goto L80
            L10:
                Job resetJob7 = (Job) this.L$0;
                ResultKt.throwOnFailure($result);
                Job resetJob8 = resetJob7;
            L37:
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob8, null, new C00262(this.$pressScope, null), 2, null);
                return Unit.INSTANCE;
            L11:
                Job resetJob9 = (Job) this.L$2;
                PointerInputChange down = (PointerInputChange) this.L$1;
                AwaitPointerEventScope $this$awaitEachGesture4 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                Job resetJob10 = resetJob9;
                $result = $result;
            L31:
                LongPressResult longPressResult2 = (LongPressResult) $result;
                if (Intrinsics.areEqual(longPressResult2, LongPressResult.Success.INSTANCE) == false) goto L40;
                this.$onLongPress.invoke(Offset.m4114boximpl(down.m5589getPositionF1C5BW0()));
                this.L$0 = resetJob10;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (TapGestureDetectorKt.access$consumeUntilUp($this$awaitEachGesture4, this) != r0) goto L36;
                return r0;
            L36:
                resetJob8 = resetJob10;
                goto L37
            L40:
                if ((longPressResult2 instanceof LongPressResult.Released) == false) goto L43;
                PointerInputChange r4 = ((LongPressResult.Released) longPressResult2).getFinalUpChange();
            L45:
                PointerInputChange upOrCancel6 = r4;
                AwaitPointerEventScope $this$awaitEachGesture5 = $this$awaitEachGesture4;
                Job resetJob11 = resetJob10;
            L46:
                if (upOrCancel6 != null) goto L48;
                cancelOrReleaseJob2 = TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob11, null, new AnonymousClass3(this.$pressScope, null), 2, null);
            L49:
                if (upOrCancel6 == null) goto L104;
                if (this.$onDoubleTap != null) goto L56;
                Function1<Offset, Unit> r1 = this.$onTap;
                if (r1 == null) goto L104;
                r1.invoke(Offset.m4114boximpl(upOrCancel6.m5589getPositionF1C5BW0()));
                goto L104
            L56:
                this.L$0 = $this$awaitEachGesture5;
                this.L$1 = upOrCancel6;
                this.L$2 = cancelOrReleaseJob2;
                this.label = 5;
                Object r6 = TapGestureDetectorKt.access$awaitSecondDown($this$awaitEachGesture5, upOrCancel6, this);
                if (r6 != r0) goto L59;
                return r0;
            L59:
                AwaitPointerEventScope r13 = $this$awaitEachGesture5;
                upOrCancel5 = upOrCancel6;
                $result = r6;
                $this$awaitEachGesture2 = r13;
                goto L60
            L48:
                upOrCancel6.consume();
                cancelOrReleaseJob2 = TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob11, null, new AnonymousClass4(this.$pressScope, null), 2, null);
                goto L49
            L43:
                if ((longPressResult2 instanceof LongPressResult.Canceled) == false) goto L106;
                r4 = null;
                goto L45
            L106:
                throw new NoWhenBranchMatchedException();
            L12:
                Job resetJob12 = (Job) this.L$1;
                $this$awaitEachGesture5 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                resetJob10 = resetJob12;
                $result = $result;
            L27:
                upOrCancel6 = (PointerInputChange) $result;
                resetJob11 = resetJob10;
                goto L46
            L13:
                AwaitPointerEventScope $this$awaitEachGesture6 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure($result);
                $this$awaitEachGesture4 = $this$awaitEachGesture6;
            L18:
                down = (PointerInputChange) $result;
                down.consume();
                resetJob10 = BuildersKt.launch$default(this.$$this$coroutineScope, null, TapGestureDetectorKt.access$getCoroutineStartForCurrentDispatchBehavior(), new TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.$pressScope, null), 1, null);
                if (this.$onPress == TapGestureDetectorKt.access$getNoPressGesture$p()) goto L22;
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, resetJob10, null, new C00251(this.$onPress, this.$pressScope, down, null), 2, null);
            L22:
                if (this.$onLongPress != null) goto L28;
                this.L$0 = $this$awaitEachGesture4;
                this.L$1 = resetJob10;
                this.label = 2;
                $result = TapGestureDetectorKt.waitForUpOrCancellation$default($this$awaitEachGesture4, null, this, 1, null);
                if ($result != r0) goto L26;
                return r0;
            L26:
                $this$awaitEachGesture5 = $this$awaitEachGesture4;
                goto L27
            L28:
                this.L$0 = $this$awaitEachGesture4;
                this.L$1 = down;
                this.L$2 = resetJob10;
                this.label = 3;
                $result = TapGestureDetectorKt.waitForLongPress$default($this$awaitEachGesture4, null, this, 1, null);
                if ($result != r0) goto L31;
                return r0;
            L14:
                ResultKt.throwOnFailure($result);
                AwaitPointerEventScope $this$awaitEachGesture7 = (AwaitPointerEventScope) this.L$0;
                this.L$0 = $this$awaitEachGesture7;
                this.label = 1;
                Object r3 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture7, false, null, this, 3, null);
                if (r3 != r0) goto L17;
                return r0;
            L17:
                $result = r3;
                $this$awaitEachGesture4 = $this$awaitEachGesture7;
                goto L18
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C02672(PointerInputScope r2, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r3, Function1<? super Offset, Unit> r4, Function1<? super Offset, Unit> r5, Function1<? super Offset, Unit> r6, Continuation<? super C02672> r7) {
            this.$this_detectTapGestures = r2;
            this.$onPress = r3;
            this.$onLongPress = r4;
            this.$onDoubleTap = r5;
            this.$onTap = r6;
            super(2, r7);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
            C02672 r0 = new C02672(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, r9);
            r0.L$0 = r8;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02672) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            PressGestureScopeImpl pressScope = new PressGestureScopeImpl(this.$this_detectTapGestures);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(this.$this_detectTapGestures, new AnonymousClass1($this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressScope, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", i = {0}, l = {502, 504}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class C02681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Job $resetJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02681(Job r2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super C02681> r4) {
            this.$resetJob = r2;
            this.$block = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C02681 r0 = new C02681(this.$resetJob, this.$block, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02681) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            ResultKt.throwOnFailure($result);
        L18:
            return Unit.INSTANCE;
        L7:
            CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure($result);
        L14:
            Function2<CoroutineScope, Continuation<? super Unit>, Object> r2 = this.$block;
            this.L$0 = null;
            this.label = 2;
            if (r2.invoke($this$launch, this) != r0) goto L18;
            return r0;
        L8:
            ResultKt.throwOnFailure($result);
            $this$launch = (CoroutineScope) this.L$0;
            if (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled == false) goto L14;
            this.L$0 = $this$launch;
            this.label = 1;
            if (this.$resetJob.join(this) != r0) goto L14;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {384}, m = "waitForLongPress", n = {"result"}, s = {"L$0"})
    static final class C02691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02691(Continuation<? super C02691> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForLongPress(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", i = {0, 1}, l = {386, 409}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"})
    static final class C02702 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerEventPass $pass;
        final /* synthetic */ Ref.ObjectRef<LongPressResult> $result;
        private /* synthetic */ Object L$0;
        int label;

        C02702(PointerEventPass r2, Ref.ObjectRef<LongPressResult> r3, Continuation<? super C02702> r4) {
            this.$pass = r2;
            this.$result = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C02702 r0 = new C02702(this.$pass, this.$result, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C02702) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Type inference failed for: r2v10, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
        /* JADX WARN: Type inference failed for: r2v12, types: [T, androidx.compose.foundation.gestures.LongPressResult$Success] */
        /* JADX WARN: Type inference failed for: r2v21, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.compose.foundation.gestures.LongPressResult$Released] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010e -> B:44:0x0111). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r20) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r3 = 0;
            int r4 = 1;
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            Object $result = r20;
            AwaitPointerEventScope $this$withTimeout = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            C02702 r7 = this;
            AwaitPointerEventScope $this$withTimeout2 = $this$withTimeout;
            Object $result2 = $result;
        L44:
            PointerEvent consumeCheck = (PointerEvent) $result;
            List<PointerInputChange> r2 = consumeCheck.getChanges();
            int index$iv$iv = 0;
            int r9 = r2.size();
        L45:
            if (index$iv$iv >= r9) goto L50;
            Object item$iv$iv = r2.get(index$iv$iv);
            if (((PointerInputChange) item$iv$iv).isConsumed() == true) goto L48;
            index$iv$iv = index$iv$iv + 1;
            goto L45
        L48:
            boolean r5 = true;
        L51:
            if (r5 == false) goto L55;
            Ref.ObjectRef<LongPressResult> r6 = r7.$result;
            r6.element = LongPressResult.Canceled.INSTANCE;
        L54:
            return Unit.INSTANCE;
        L55:
            Object $result3 = $result2;
            AwaitPointerEventScope $this$withTimeout3 = $this$withTimeout2;
            C02702 r8 = r7;
            r3 = 0;
            r4 = 1;
        L9:
            r8.L$0 = $this$withTimeout3;
            r8.label = r4;
            Object r10 = $this$withTimeout3.awaitPointerEvent(r8.$pass, r8);
            if (r10 != r1) goto L12;
            return r1;
        L12:
            AwaitPointerEventScope r18 = $this$withTimeout3;
            $result2 = $result3;
            Object $result4 = r10;
            r7 = r8;
            $this$withTimeout2 = r18;
        L13:
            PointerEvent event = (PointerEvent) $result4;
            List<PointerInputChange> r11 = event.getChanges();
            int index$iv$iv2 = 0;
            int r12 = r11.size();
        L14:
            if (index$iv$iv2 >= r12) goto L19;
            Object item$iv$iv2 = r11.get(index$iv$iv2);
            if (PointerEventKt.changedToUp((PointerInputChange) item$iv$iv2) == false) goto L17;
            index$iv$iv2 = index$iv$iv2 + 1;
            goto L14
        L17:
            int r13 = r3;
        L20:
            if (r13 == 0) goto L23;
            Ref.ObjectRef<LongPressResult> r14 = r7.$result;
            r14.element = new LongPressResult.Released(event.getChanges().get(r3));
            goto L54
        L23:
            if (TapGestureDetector_androidKt.isDeepPress(event) == false) goto L25;
            Ref.ObjectRef<LongPressResult> r15 = r7.$result;
            r15.element = LongPressResult.Success.INSTANCE;
            goto L54
        L25:
            List<PointerInputChange> r16 = event.getChanges();
            int $i$f$fastAny = 0;
            int $i$f$fastForEach = 0;
            int index$iv$iv3 = 0;
            int r17 = r16.size();
        L26:
            if (index$iv$iv3 >= r17) goto L38;
            Object it$iv = r16.get(index$iv$iv3);
            PointerInputChange it = (PointerInputChange) it$iv;
            if (it.isConsumed() == true) goto L33;
            int $i$f$fastAny2 = $i$f$fastAny;
            int $i$f$fastForEach2 = $i$f$fastForEach;
            if (PointerEventKt.m5534isOutOfBoundsjwHxaWs(it, $this$withTimeout2.mo5498getSizeYbymL2g(), $this$withTimeout2.mo5497getExtendedTouchPaddingNHjbRc()) == true) goto L34;
            boolean r19 = false;
        L35:
            if (r19 == true) goto L36;
            index$iv$iv3 = index$iv$iv3 + 1;
            $i$f$fastAny = $i$f$fastAny2;
            $i$f$fastForEach = $i$f$fastForEach2;
            goto L26
        L36:
            boolean r21 = true;
        L39:
            if (r21 == false) goto L41;
            Ref.ObjectRef<LongPressResult> r22 = r7.$result;
            r22.element = LongPressResult.Canceled.INSTANCE;
            goto L54
        L41:
            r7.L$0 = $this$withTimeout2;
            r7.label = 2;
            $result = $this$withTimeout2.awaitPointerEvent(PointerEventPass.Final, r7);
            if ($result != r1) goto L44;
            return r1;
        L34:
            r19 = true;
            goto L35
        L33:
            $i$f$fastAny2 = $i$f$fastAny;
            $i$f$fastForEach2 = $i$f$fastForEach;
            goto L34
        L38:
            r21 = false;
            goto L39
        L19:
            r13 = r4;
            goto L20
        L50:
            r5 = false;
            goto L51
        L7:
            $result4 = r20;
            AwaitPointerEventScope $this$withTimeout4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result4);
            r7 = this;
            $this$withTimeout2 = $this$withTimeout4;
            $result2 = $result4;
            goto L13
        L8:
            ResultKt.throwOnFailure(r20);
            $result3 = r20;
            $this$withTimeout3 = (AwaitPointerEventScope) this.L$0;
            r8 = this;
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {352, 366}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C02712 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C02712(Continuation<? super C02712> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    public static final /* synthetic */ Object access$awaitSecondDown(AwaitPointerEventScope $receiver, PointerInputChange firstUp, Continuation $completion) {
        return awaitSecondDown($receiver, firstUp, $completion);
    }

    public static final /* synthetic */ Object access$consumeUntilUp(AwaitPointerEventScope $receiver, Continuation $completion) {
        return consumeUntilUp($receiver, $completion);
    }

    public static final /* synthetic */ CoroutineStart access$getCoroutineStartForCurrentDispatchBehavior() {
        return getCoroutineStartForCurrentDispatchBehavior();
    }

    public static final /* synthetic */ Function3 access$getNoPressGesture$p() {
        return NoPressGesture;
    }

    private static /* synthetic */ void getCoroutineStartForCurrentDispatchBehavior$annotations() {
    }

    @Deprecated(message = "This flag has been moved to ComposeFoundationFlags and renamed to isDetectTapGesturesImmediateCoroutineDispatchEnabled. For compatibility,  DetectTapGesturesEnableNewDispatchingBehavior controls the new flag (isDetectTapGesturesImmediateCoroutineDispatchEnabled). Please use  isDetectTapGesturesImmediateCoroutineDispatchEnabled instead.", replaceWith = @ReplaceWith(expression = "isDetectTapGesturesImmediateCoroutineDispatchEnabled", imports = {"androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled"}))
    public static /* synthetic */ void getDetectTapGesturesEnableNewDispatchingBehavior$annotations() {
    }

    static {
        NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope r1, Function1 r2, Function1 r3, Function3 r4, Function1 r5, Continuation r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = NoPressGesture;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        return detectTapGestures(r1, r2, r3, r4, r5, r6);
    }

    public static final Object detectTapGestures(PointerInputScope $this$detectTapGestures, Function1<? super Offset, Unit> r8, Function1<? super Offset, Unit> r9, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r10, Function1<? super Offset, Unit> r11, Continuation<? super Unit> r12) {
        Object r7 = CoroutineScopeKt.coroutineScope(new C02672($this$detectTapGestures, r10, r9, r8, r11, null), r12);
        if (r7 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r7;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:18:0x0052). Please report as a decompilation issue!!! */
    private static final Object consumeUntilUp(AwaitPointerEventScope r17, Continuation<? super Unit> r18) {
        if ((r18 instanceof C02651) == false) goto L7;
        C02651 r1 = (C02651) r18;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        AwaitPointerEventScope $this$consumeUntilUp = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$consumeUntilUp2 = $this$consumeUntilUp;
        Object r4 = $result2;
        Object $result3 = $result;
    L18:
        PointerEvent event = (PointerEvent) $result;
        List<PointerInputChange> r7 = event.getChanges();
        int index$iv = 0;
        int r10 = r7.size();
    L19:
        if (index$iv >= r10) goto L21;
        Object item$iv = r7.get(index$iv);
        PointerInputChange it = (PointerInputChange) item$iv;
        it.consume();
        index$iv = index$iv + 1;
        goto L19
    L21:
        List<PointerInputChange> r2 = event.getChanges();
        int index$iv$iv = 0;
        int r11 = r2.size();
    L22:
        if (index$iv$iv >= r11) goto L27;
        Object item$iv$iv = r2.get(index$iv$iv);
        PointerInputChange it2 = (PointerInputChange) item$iv$iv;
        if (it2.getPressed() == true) goto L25;
        index$iv$iv = index$iv$iv + 1;
        goto L22
    L25:
        boolean r3 = true;
    L28:
        if (r3 == false) goto L30;
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$consumeUntilUp3 = $this$consumeUntilUp2;
    L14:
        r1.L$0 = $this$consumeUntilUp3;
        r1.label = 1;
        Object r6 = AwaitPointerEventScope.awaitPointerEvent$default($this$consumeUntilUp3, null, r1, 1, null);
        if (r6 != $result2) goto L17;
        return $result2;
    L17:
        Object r16 = $result2;
        $result3 = $result;
        $result = r6;
        $this$consumeUntilUp2 = $this$consumeUntilUp3;
        r4 = r16;
        goto L18
    L30:
        return Unit.INSTANCE;
    L27:
        r3 = false;
        goto L28
    L13:
        ResultKt.throwOnFailure($result);
        $this$consumeUntilUp3 = r17;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C02651(r18);
        goto L8
    }

    private static final Object awaitSecondDown(AwaitPointerEventScope $this$awaitSecondDown, PointerInputChange firstUp, Continuation<? super PointerInputChange> r6) {
        return $this$awaitSecondDown.withTimeoutOrNull($this$awaitSecondDown.getViewConfiguration().getDoubleTapTimeoutMillis(), new C02642(firstUp, null), r6);
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope r0, Function3 r1, Function1 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = NoPressGesture;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = null;
    L9:
        return detectTapAndPress(r0, r1, r2, r3);
    }

    public static final Object detectTapAndPress(PointerInputScope $this$detectTapAndPress, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> r9, Function1<? super Offset, Unit> r10, Continuation<? super Unit> r11) {
        PressGestureScopeImpl pressScope = new PressGestureScopeImpl($this$detectTapAndPress);
        Object r8 = CoroutineScopeKt.coroutineScope(new C02662($this$detectTapAndPress, r9, r10, pressScope, null), r11);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope r0, boolean r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return awaitFirstDown(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope $this$awaitFirstDown, boolean requireUnconsumed, Continuation $completion) {
        return awaitFirstDown($this$awaitFirstDown, requireUnconsumed, PointerEventPass.Main, $completion);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:18:0x0057). Please report as a decompilation issue!!! */
    public static final Object awaitFirstDown(AwaitPointerEventScope $this$awaitFirstDown, boolean requireUnconsumed, PointerEventPass pass, Continuation<? super PointerInputChange> r13) {
        if ((r13 instanceof AnonymousClass2) == false) goto L7;
        AnonymousClass2 r0 = (AnonymousClass2) r13;
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
        boolean requireUnconsumed2 = r0.Z$0;
        PointerEventPass pass2 = (PointerEventPass) r0.L$1;
        AwaitPointerEventScope $this$awaitFirstDown2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r3 = $result2;
        Object $result3 = $result;
    L18:
        PointerEvent event = (PointerEvent) $result;
        if (requireUnconsumed2 == false) goto L21;
        boolean r6 = true;
    L23:
        if (isChangedToDown$default(event, r6, false, 2, null) == true) goto L25;
        $result = $result3;
        $result2 = r3;
    L14:
        r0.L$0 = $this$awaitFirstDown2;
        r0.L$1 = pass2;
        r0.Z$0 = requireUnconsumed2;
        r0.label = 1;
        Object r4 = $this$awaitFirstDown2.awaitPointerEvent(pass2, r0);
        if (r4 != $result2) goto L17;
        return $result2;
    L17:
        Object r9 = $result2;
        $result3 = $result;
        $result = r4;
        r3 = r9;
        goto L18
    L25:
        return event.getChanges().get(0);
    L21:
        r6 = false;
        goto L23
    L13:
        ResultKt.throwOnFailure($result);
        $this$awaitFirstDown2 = $this$awaitFirstDown;
        requireUnconsumed2 = requireUnconsumed;
        pass2 = pass;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass2(r13);
        goto L8
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope r0, boolean r1, PointerEventPass r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = PointerEventPass.Main;
    L9:
        return awaitFirstDown(r0, r1, r2, r3);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:18:0x0057). Please report as a decompilation issue!!! */
    public static final Object awaitPrimaryFirstDown(AwaitPointerEventScope $this$awaitPrimaryFirstDown, boolean requireUnconsumed, PointerEventPass pass, Continuation<? super PointerInputChange> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
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
        boolean requireUnconsumed2 = r0.Z$0;
        PointerEventPass pass2 = (PointerEventPass) r0.L$1;
        AwaitPointerEventScope $this$awaitPrimaryFirstDown2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r3 = $result2;
        Object $result3 = $result;
    L18:
        PointerEvent event = (PointerEvent) $result;
        if (requireUnconsumed2 == false) goto L21;
        boolean r6 = true;
    L23:
        if (isChangedToDown(event, r6, true) == true) goto L25;
        $result = $result3;
        $result2 = r3;
    L14:
        r0.L$0 = $this$awaitPrimaryFirstDown2;
        r0.L$1 = pass2;
        r0.Z$0 = requireUnconsumed2;
        r0.label = 1;
        Object r4 = $this$awaitPrimaryFirstDown2.awaitPointerEvent(pass2, r0);
        if (r4 != $result2) goto L17;
        return $result2;
    L17:
        Object r7 = $result2;
        $result3 = $result;
        $result = r4;
        r3 = r7;
        goto L18
    L25:
        return event.getChanges().get(0);
    L21:
        r6 = false;
        goto L23
    L13:
        ResultKt.throwOnFailure($result);
        $this$awaitPrimaryFirstDown2 = $this$awaitPrimaryFirstDown;
        requireUnconsumed2 = requireUnconsumed;
        pass2 = pass;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r11);
        goto L8
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope r0, boolean r1, PointerEventPass r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = PointerEventPass.Main;
    L9:
        return awaitPrimaryFirstDown(r0, r1, r2, r3);
    }

    static /* synthetic */ boolean isChangedToDown$default(PointerEvent r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
    L6:
        return isChangedToDown(r0, r1, r2);
    }

    private static final boolean isChangedToDown(PointerEvent $this$isChangedToDown, boolean requireUnconsumed, boolean onlyPrimaryMouseButton) {
        if (onlyPrimaryMouseButton == false) goto L13;
        List<PointerInputChange> r2 = $this$isChangedToDown.getChanges();
        int index$iv$iv = 0;
        int r7 = r2.size();
    L5:
        if (index$iv$iv >= r7) goto L10;
        Object item$iv$iv = r2.get(index$iv$iv);
        if (PointerType.m5660equalsimpl0(((PointerInputChange) item$iv$iv).m5592getTypeT8wyACA(), PointerType.Companion.m5665getMouseT8wyACA()) == false) goto L8;
        index$iv$iv = index$iv$iv + 1;
        goto L5
    L8:
        boolean r3 = false;
    L11:
        if (r3 == false) goto L13;
        boolean onlyPrimaryButtonCausesDown = true;
    L15:
        if (onlyPrimaryButtonCausesDown == true) goto L17;
    L19:
        List<PointerInputChange> r4 = $this$isChangedToDown.getChanges();
        int index$iv$iv2 = 0;
        int r8 = r4.size();
    L20:
        if (index$iv$iv2 >= r8) goto L29;
        Object item$iv$iv2 = r4.get(index$iv$iv2);
        PointerInputChange it = (PointerInputChange) item$iv$iv2;
        if (requireUnconsumed == false) goto L24;
        boolean r14 = PointerEventKt.changedToDown(it);
    L25:
        if (r14 == false) goto L34;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L20
    L34:
        return false;
    L24:
        r14 = PointerEventKt.changedToDownIgnoreConsumed(it);
        goto L25
    L29:
        return true;
    L17:
        if (PointerEvent_androidKt.m5562isPrimaryPressedaHzCxE($this$isChangedToDown.m5529getButtonsry648PA()) == true) goto L19;
        return false;
    L10:
        r3 = true;
    L13:
        onlyPrimaryButtonCausesDown = false;
        goto L15
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object waitForUpOrCancellation(AwaitPointerEventScope $this$waitForUpOrCancellation, Continuation $completion) {
        return waitForUpOrCancellation($this$waitForUpOrCancellation, PointerEventPass.Main, $completion);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010f -> B:49:0x0111). Please report as a decompilation issue!!! */
    public static final Object waitForUpOrCancellation(AwaitPointerEventScope r21, PointerEventPass r22, Continuation<? super PointerInputChange> r23) {
        if ((r23 instanceof C02712) == false) goto L7;
        C02712 r1 = (C02712) r23;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r6 = 0;
        int r7 = 1;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        PointerEventPass pass = (PointerEventPass) r1.L$1;
        AwaitPointerEventScope $this$waitForUpOrCancellation = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        PointerEventPass pass2 = pass;
        Object r17 = null;
        Object r4 = $result2;
        Object $result3 = $result;
    L49:
        PointerEvent consumeCheck = (PointerEvent) $result;
        List<PointerInputChange> r2 = consumeCheck.getChanges();
        int index$iv$iv = 0;
        int r10 = r2.size();
    L50:
        if (index$iv$iv >= r10) goto L55;
        Object item$iv$iv = r2.get(index$iv$iv);
        if (((PointerInputChange) item$iv$iv).isConsumed() == true) goto L53;
        index$iv$iv = index$iv$iv + 1;
        goto L50
    L53:
        boolean r3 = true;
    L56:
        if (r3 == false) goto L58;
        return r17;
    L58:
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$waitForUpOrCancellation2 = $this$waitForUpOrCancellation;
        r6 = 0;
        r7 = 1;
        PointerEventPass pass3 = pass2;
    L15:
        r1.L$0 = $this$waitForUpOrCancellation2;
        r1.L$1 = pass3;
        r1.label = r7;
        Object r9 = $this$waitForUpOrCancellation2.awaitPointerEvent(pass3, r1);
        if (r9 != $result2) goto L18;
        return $result2;
    L18:
        Object r20 = $result2;
        $result3 = $result;
        $result = r9;
        AwaitPointerEventScope $this$waitForUpOrCancellation3 = $this$waitForUpOrCancellation2;
        r4 = r20;
    L19:
        PointerEvent event = (PointerEvent) $result;
        List<PointerInputChange> r11 = event.getChanges();
        int index$iv$iv2 = 0;
        int r14 = r11.size();
    L20:
        if (index$iv$iv2 >= r14) goto L25;
        Object item$iv$iv2 = r11.get(index$iv$iv2);
        if (PointerEventKt.changedToUp((PointerInputChange) item$iv$iv2) == false) goto L23;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L20
    L23:
        int r12 = r6;
    L26:
        if (r12 != 0) goto L28;
        List<PointerInputChange> r5 = event.getChanges();
        int index$iv$iv3 = 0;
        int r13 = r5.size();
    L30:
        if (index$iv$iv3 >= r13) goto L42;
        Object it$iv = r5.get(index$iv$iv3);
        PointerInputChange it = (PointerInputChange) it$iv;
        if (it.isConsumed() == true) goto L37;
        r17 = null;
        PointerEventPass pass4 = pass3;
        if (PointerEventKt.m5534isOutOfBoundsjwHxaWs(it, $this$waitForUpOrCancellation3.mo5498getSizeYbymL2g(), $this$waitForUpOrCancellation3.mo5497getExtendedTouchPaddingNHjbRc()) == true) goto L38;
        boolean r8 = false;
    L39:
        if (r8 == true) goto L40;
        index$iv$iv3 = index$iv$iv3 + 1;
        pass3 = pass4;
        goto L30
    L40:
        boolean r15 = true;
    L43:
        if (r15 == false) goto L45;
        return r17;
    L45:
        PointerEventPass r16 = PointerEventPass.Final;
        r1.L$0 = $this$waitForUpOrCancellation3;
        PointerEventPass pass5 = pass4;
        r1.L$1 = pass5;
        r1.label = 2;
        $result = $this$waitForUpOrCancellation3.awaitPointerEvent(r16, r1);
        if ($result != r4) goto L48;
        return r4;
    L48:
        pass2 = pass5;
        $this$waitForUpOrCancellation = $this$waitForUpOrCancellation3;
    L38:
        r8 = true;
        goto L39
    L37:
        pass4 = pass3;
        r17 = null;
        goto L38
    L42:
        pass4 = pass3;
        r17 = null;
        r15 = false;
        goto L43
    L28:
        return event.getChanges().get(r6);
    L25:
        r12 = r7;
        goto L26
    L55:
        r3 = false;
        goto L56
    L13:
        PointerEventPass pass6 = (PointerEventPass) r1.L$1;
        AwaitPointerEventScope $this$waitForUpOrCancellation4 = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        $this$waitForUpOrCancellation3 = $this$waitForUpOrCancellation4;
        pass3 = pass6;
        r4 = $result2;
        $result3 = $result;
        goto L19
    L14:
        ResultKt.throwOnFailure($result);
        $this$waitForUpOrCancellation2 = r21;
        pass3 = r22;
        goto L15
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C02712(r23);
        goto L8
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope r0, PointerEventPass r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = PointerEventPass.Main;
    L6:
        return waitForUpOrCancellation(r0, r1, r2);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    public static final Object waitForLongPress(AwaitPointerEventScope $this$waitForLongPress, PointerEventPass pass, Continuation<? super LongPressResult> r10) {
        if ((r10 instanceof C02691) == false) goto L7;
        C02691 r0 = (C02691) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L15;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef result = (Ref.ObjectRef) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: PointerEventTimeoutCancellationException -> L22
    L20:
        return result.element;
    L15:
        ResultKt.throwOnFailure($result);
        Ref.ObjectRef result2 = new Ref.ObjectRef();
        result2.element = LongPressResult.Canceled.INSTANCE;
        long r4 = $this$waitForLongPress.getViewConfiguration().getLongPressTimeoutMillis();     // Catch: PointerEventTimeoutCancellationException -> L22
        C02702 r6 = new C02702(pass, result2, null);     // Catch: PointerEventTimeoutCancellationException -> L22
        r0.L$0 = result2;     // Catch: PointerEventTimeoutCancellationException -> L22
        r0.label = 1;     // Catch: PointerEventTimeoutCancellationException -> L22
        if ($this$waitForLongPress.withTimeout(r4, r6, r0) != r2) goto L19;
        return r2;
    L19:
        result = result2;
        goto L20
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L24:
        return LongPressResult.Success.INSTANCE;
    L7:
        r0 = new C02691(r10);
        goto L8
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope r0, PointerEventPass r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = PointerEventPass.Main;
    L6:
        return waitForLongPress(r0, r1, r2);
    }

    public static final void setDetectTapGesturesEnableNewDispatchingBehavior(boolean value) {
        ComposeFoundationFlags r0 = ComposeFoundationFlags.INSTANCE;
        ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled = value;
    }

    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    private static final CoroutineStart getCoroutineStartForCurrentDispatchBehavior() {
        if (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled == false) goto L6;
        return CoroutineStart.UNDISPATCHED;
    L6:
        return CoroutineStart.DEFAULT;
    }

    static /* synthetic */ Job launchAwaitingReset$default(CoroutineScope r0, Job r1, CoroutineStart r2, Function2 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = getCoroutineStartForCurrentDispatchBehavior();
    L6:
        return launchAwaitingReset(r0, r1, r2, r3);
    }

    private static final Job launchAwaitingReset(CoroutineScope $this$launchAwaitingReset, Job resetJob, CoroutineStart start, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r11) {
        return BuildersKt.launch$default($this$launchAwaitingReset, null, start, new C02681(resetJob, r11, null), 1, null);
    }
}
