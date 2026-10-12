package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u001d\u001a\u00020\u001eJM\u0010\u001f\u001a\u00020\u001e2=\u0010 \u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0&\u0012\u0006\u0012\u0004\u0018\u00010'0!H¦@¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\u001a\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H&ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H&ø\u0001\u0000¢\u0006\u0004\b4\u00100J*\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u000e\u0010>\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020BH\u0082@¢\u0006\u0002\u0010CJ\u0016\u0010D\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020EH\u0082@¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020\u0006H&J\b\u0010H\u001a\u00020\u001eH\u0002JH\u0010I\u001a\u00020\u001e2\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010J\u001a\u00020\u0006R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientationLock", "Landroidx/compose/foundation/gestures/Orientation;", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "_canDrag", "<set-?>", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getEnabled", "()Z", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isListeningForEvents", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "disposeInteractionSource", "", "drag", "forEachDelta", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializePointerInputNode", "onCancelPointerInput", "onDetach", "onDragStarted", "startedPosition", "Landroidx/compose/ui/geometry/Offset;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "processDragCancel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStart", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDragImmediately", "startListeningForEvents", "update", "shouldResetPointerInputHandling", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    public static final int $stable = 0;
    private final Function1<PointerInputChange, Boolean> _canDrag;
    private Function1<? super PointerInputChange, Boolean> canDrag;
    private Channel<DragEvent> channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private Orientation orientationLock;
    private SuspendingPointerInputModifierNode pointerInputNode;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {552}, m = "processDragCancel", n = {"this"}, s = {"L$0"})
    static final class C02461 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DragGestureNode this$0;

        C02461(DragGestureNode r1, Continuation<? super C02461> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.access$processDragCancel(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {534, 537}, m = "processDragStart", n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "interaction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C02471 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DragGestureNode this$0;

        C02471(DragGestureNode r1, Continuation<? super C02471> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.access$processDragStart(this.this$0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0}, l = {544}, m = "processDragStop", n = {"this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1"})
    static final class C02481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DragGestureNode this$0;

        C02481(DragGestureNode r1, Continuation<? super C02481> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.access$processDragStop(this.this$0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    static final class C02491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {428}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
        static final class C00211 extends SuspendLambda implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            C00211(Ref.ObjectRef<DragEvent> r2, DragGestureNode r3, Continuation<? super C00211> r4) {
                this.$event = r2;
                this.this$0 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                C00211 r0 = new C00211(this.$event, this.this$0, r5);
                r0.L$0 = r4;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Function1<? super DragEvent.DragDelta, ? extends Unit> r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Function1<? super DragEvent.DragDelta, Unit> r3, Continuation<? super Unit> r4) {
                return ((C00211) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:25:0x0075). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:24:0x006e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r9) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L7;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                Ref.ObjectRef<DragEvent> r1 = (Ref.ObjectRef) this.L$1;
                Function1 r2 = (Function1) this.L$0;
                ResultKt.throwOnFailure(r9);
                Ref.ObjectRef<DragEvent> r3 = r1;
                Function1 r4 = r2;
                C00211 r5 = this;
                Object r6 = r0;
                Object r7 = r9;
            L24:
                DragEvent r8 = (DragEvent) r9;
                r9 = r7;
                r0 = r6;
                C00211 r10 = r5;
                Function1 r11 = r4;
                T r12 = r8;
            L25:
                r3.element = r12;
            L9:
                if ((r10.$event.element instanceof DragEvent.DragStopped) == true) goto L27;
                if ((r10.$event.element instanceof DragEvent.DragCancelled) == true) goto L27;
                DragEvent r13 = r10.$event.element;
                r12 = 0;
                if ((r13 instanceof DragEvent.DragDelta) == false) goto L15;
                DragEvent.DragDelta r14 = (DragEvent.DragDelta) r13;
            L16:
                if (r14 == null) goto L18;
                r11.invoke(r14);
            L18:
                r3 = r10.$event;
                Channel r15 = DragGestureNode.access$getChannel$p(r10.this$0);
                if (r15 == null) goto L25;
                r10.L$0 = r11;
                r10.L$1 = r3;
                r10.label = 1;
                Object r16 = r15.receive(r10);
                if (r16 != r0) goto L23;
                return r0;
            L23:
                Object r17 = r0;
                r7 = r9;
                r9 = r16;
                r4 = r11;
                r5 = r10;
                r6 = r17;
                goto L24
            L15:
                r14 = null;
            L27:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure(r9);
                r11 = (Function1) this.L$0;
                r10 = this;
                goto L9
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C02491(DragGestureNode r2, Continuation<? super C02491> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02491 r0 = new C02491(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02491) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v4, types: [T] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v44 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v21 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v23 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012e -> B:23:0x0077). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0132 -> B:23:0x0077). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x014b -> B:23:0x0077). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0150 -> B:23:0x0077). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r1 = this.label;
            switch(r1) {
                case 0: goto L22;
                case 1: goto L21;
                case 2: goto L20;
                case 3: goto L15;
                case 4: goto L10;
                case 5: goto L7;
                case 6: goto L6;
                default: goto L5;
            };
        L6:
            CoroutineScope r2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            ?? r4 = r2;
            C02491 r3 = this;
        L24:
            if (CoroutineScopeKt.isActive(r4) == false) goto L67;
            Ref.ObjectRef r5 = new Ref.ObjectRef();
            Channel r6 = DragGestureNode.access$getChannel$p(r3.this$0);
            if (r6 == null) goto L32;
            r3.L$0 = r4;
            r3.L$1 = r5;
            r3.L$2 = r5;
            r3.label = 1;
            Object r7 = r6.receive(r3);
            if (r7 != r0) goto L30;
            return r0;
        L30:
            ?? r8 = r4;
            C02491 r9 = r3;
            Object r10 = r0;
            Object r12 = r11;
            r11 = r7;
            Ref.ObjectRef r13 = r5;
        L31:
            ?? r14 = r8;
            ?? r15 = (DragEvent) r11;
        L33:
            r5.element = r15;
            if ((r13.element instanceof DragEvent.DragStarted) == false) goto L65;
            r9.L$0 = r14;
            r9.L$1 = r13;
            r9.L$2 = null;
            r9.label = 2;
            if (DragGestureNode.access$processDragStart(r9.this$0, (DragEvent.DragStarted) r13.element, r9) != r10) goto L38;
            return r10;
        L38:
            r11 = r12;
            r0 = r10;
            Ref.ObjectRef r16 = r13;
            ?? r17 = r14;
        L71:
            r9.L$0 = r17;     // Catch: CancellationException -> L58
            r9.L$1 = r16;     // Catch: CancellationException -> L58
            r9.label = 3;     // Catch: CancellationException -> L58
            ?? r18 = r17;
            if (r9.this$0.drag(new C00211(r16, r9.this$0, null), r9) != r0) goto L44;
            return r0;
        L44:
            if ((r16.element instanceof DragEvent.DragStopped) == false) goto L51;
            DragGestureNode r19 = r9.this$0;     // Catch: CancellationException -> L58
            Object r20 = r16.element;     // Catch: CancellationException -> L58
            Intrinsics.checkNotNull(r20, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");     // Catch: CancellationException -> L58
            r9.L$0 = r18;     // Catch: CancellationException -> L58
            r9.L$1 = null;     // Catch: CancellationException -> L58
            r9.label = 4;     // Catch: CancellationException -> L58
            if (DragGestureNode.access$processDragStop(r19, (DragEvent.DragStopped) r20, r9) != r0) goto L48;
            return r0;
        L48:
            r3 = r9;
            r4 = r18;
            goto L24
        L51:
            if ((r16.element instanceof DragEvent.DragCancelled) == false) goto L57;
            r9.L$0 = r18;     // Catch: CancellationException -> L58
            r9.L$1 = null;     // Catch: CancellationException -> L58
            r9.label = 5;     // Catch: CancellationException -> L58
            if (DragGestureNode.access$processDragCancel(r9.this$0, r9) != r0) goto L55;
            return r0;
        L55:
            r3 = r9;
            r4 = r18;
            goto L24
        L57:
            r3 = r9;
            r4 = r18;
        L59:
            ?? r21 = r17;
        L60:
            r9.L$0 = r21;
            r9.L$1 = null;
            r9.label = 6;
            if (DragGestureNode.access$processDragCancel(r9.this$0, r9) != r0) goto L63;
            return r0;
        L63:
            C02491 r22 = r9;
            r4 = r21;
            r3 = r22;
            goto L24
        L65:
            r11 = r12;
            r0 = r10;
            r3 = r9;
            r4 = r14;
            goto L24
        L32:
            r13 = r5;
            r14 = r4;
            r9 = r3;
            r10 = r0;
            r12 = r11;
            r15 = 0;
            goto L33
        L67:
            return Unit.INSTANCE;
        L7:
            CoroutineScope r23 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(r11);     // Catch: CancellationException -> L13
            r4 = r23;
            r3 = this;
            goto L24
        L10:
            CoroutineScope r24 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(r11);     // Catch: CancellationException -> L13
            r4 = r24;
            r3 = this;
            goto L24
        L15:
            r16 = (Ref.ObjectRef) this.L$1;
            CoroutineScope r25 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(r11);     // Catch: CancellationException -> L18
            r9 = this;
            r18 = r25;
        L19:
            r9 = this;
            r21 = r25;
            goto L60
        L20:
            r16 = (Ref.ObjectRef) this.L$1;
            CoroutineScope r26 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            r9 = this;
            r17 = r26;
            goto L71
        L21:
            Ref.ObjectRef r27 = (Ref.ObjectRef) this.L$2;
            Ref.ObjectRef r28 = (Ref.ObjectRef) this.L$1;
            CoroutineScope r29 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            r13 = r28;
            r8 = r29;
            r9 = this;
            r5 = r27;
            r10 = r0;
            r12 = r11;
            goto L31
        L22:
            ResultKt.throwOnFailure(r11);
            r4 = (CoroutineScope) this.L$0;
            r3 = this;
            goto L24
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L14:
            r9 = this;
            r21 = r1;
            goto L60
        }
    }

    static {
        $stable = 8;
    }

    public abstract Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> r1, Continuation<? super Unit> r2);

    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo394onDragStartedk4lQ0M(long r1);

    /* JADX INFO: renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo395onDragStoppedTH1AsA0(long r1);

    public abstract boolean startDragImmediately();

    public static final /* synthetic */ Channel access$getChannel$p(DragGestureNode $this) {
        return $this.channel;
    }

    public static final /* synthetic */ Orientation access$getOrientationLock$p(DragGestureNode $this) {
        return $this.orientationLock;
    }

    public static final /* synthetic */ boolean access$isListeningForEvents$p(DragGestureNode $this) {
        return $this.isListeningForEvents;
    }

    public static final /* synthetic */ Object access$processDragCancel(DragGestureNode $this, Continuation $completion) {
        return $this.processDragCancel($completion);
    }

    public static final /* synthetic */ Object access$processDragStart(DragGestureNode $this, DragEvent.DragStarted event, Continuation $completion) {
        return $this.processDragStart(event, $completion);
    }

    public static final /* synthetic */ Object access$processDragStop(DragGestureNode $this, DragEvent.DragStopped event, Continuation $completion) {
        return $this.processDragStop(event, $completion);
    }

    public static final /* synthetic */ void access$setChannel$p(DragGestureNode $this, Channel r1) {
        $this.channel = r1;
    }

    public static final /* synthetic */ void access$startListeningForEvents(DragGestureNode $this) {
        $this.startListeningForEvents();
    }

    public DragGestureNode(Function1<? super PointerInputChange, Boolean> r2, boolean enabled, MutableInteractionSource interactionSource, Orientation orientationLock) {
        this.orientationLock = orientationLock;
        this.canDrag = r2;
        this.enabled = enabled;
        this.interactionSource = interactionSource;
        this._canDrag = new DragGestureNode$_canDrag$1(this);
    }

    protected final Function1<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    private final void startListeningForEvents() {
        this.isListeningForEvents = true;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new C02491(this, null), 3, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (this.enabled == true) goto L5;
    L7:
        SuspendingPointerInputModifierNode r0 = this.pointerInputNode;
        if (r0 == null) goto L11;
        r0.mo204onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        return;
    L11:
        return;
    L5:
        if (this.pointerInputNode != null) goto L7;
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        goto L7
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode r0 = this.pointerInputNode;
        if (r0 == null) goto L6;
        r0.onCancelPointerInput();
        return;
    }

    private final Object processDragStart(DragEvent.DragStarted r10, Continuation<? super Unit> r11) {
        if ((r11 instanceof C02471) == false) goto L7;
        C02471 r0 = (C02471) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        DragInteraction.Start interaction = (DragInteraction.Start) r0.L$2;
        DragEvent.DragStarted event = (DragEvent.DragStarted) r0.L$1;
        DragGestureNode r3 = (DragGestureNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L29:
        DragGestureNode r4 = r3;
        DragEvent.DragStarted event2 = event;
    L30:
        r4.dragInteraction = interaction;
        r4.mo394onDragStartedk4lQ0M(event2.m414getStartPointF1C5BW0());
        return Unit.INSTANCE;
    L13:
        event2 = (DragEvent.DragStarted) r0.L$1;
        r4 = (DragGestureNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L23:
        interaction = new DragInteraction.Start();
        MutableInteractionSource r5 = r4.interactionSource;
        if (r5 == null) goto L30;
        r0.L$0 = r4;
        r0.L$1 = event2;
        r0.L$2 = interaction;
        r0.label = 2;
        if (r5.emit(interaction, r0) != r2) goto L28;
        return r2;
    L28:
        event = event2;
        r3 = r4;
        goto L29
    L14:
        ResultKt.throwOnFailure($result);
        r4 = this;
        event2 = r10;
        DragInteraction.Start oldInteraction = r4.dragInteraction;
        if (oldInteraction == null) goto L23;
        MutableInteractionSource r6 = r4.interactionSource;
        if (r6 == null) goto L23;
        DragInteraction.Cancel r7 = new DragInteraction.Cancel(oldInteraction);
        r0.L$0 = r4;
        r0.L$1 = event2;
        r0.label = 1;
        if (r6.emit(r7, r0) != r2) goto L23;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C02471(this, r11);
        goto L8
    }

    private final Object processDragStop(DragEvent.DragStopped event, Continuation<? super Unit> r11) {
        if ((r11 instanceof C02481) == false) goto L7;
        C02481 r0 = (C02481) r11;
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
        DragEvent.DragStopped event2 = null;
        DragEvent.DragStopped event3 = (DragEvent.DragStopped) r0.L$1;
        DragGestureNode r3 = (DragGestureNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L21:
        event = event3;
    L22:
        r3.dragInteraction = null;
    L23:
        r3.mo395onDragStoppedTH1AsA0(event.m415getVelocity9UxMQ8M());
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r3 = this;
        DragInteraction.Start interaction = r3.dragInteraction;
        if (interaction == null) goto L23;
        MutableInteractionSource r6 = r3.interactionSource;
        if (r6 == null) goto L22;
        DragInteraction.Stop r7 = new DragInteraction.Stop(interaction);
        r0.L$0 = r3;
        r0.L$1 = event;
        r0.label = 1;
        if (r6.emit(r7, r0) != r2) goto L20;
        return r2;
    L20:
        event3 = event;
        event2 = null;
        goto L21
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C02481(this, r11);
        goto L8
    }

    private final Object processDragCancel(Continuation<? super Unit> r10) {
        if ((r10 instanceof C02461) == false) goto L7;
        C02461 r0 = (C02461) r10;
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
        int r3 = 0;
        DragGestureNode r4 = (DragGestureNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L22:
        r4.dragInteraction = null;
    L23:
        r4.mo395onDragStoppedTH1AsA0(Velocity.Companion.m7222getZero9UxMQ8M());
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r4 = this;
        DragInteraction.Start interaction = r4.dragInteraction;
        if (interaction == null) goto L23;
        MutableInteractionSource r6 = r4.interactionSource;
        if (r6 == null) goto L22;
        DragInteraction.Cancel r7 = new DragInteraction.Cancel(interaction);
        r0.L$0 = r4;
        r0.label = 1;
        if (r6.emit(r7, r0) != r2) goto L20;
        return r2;
    L20:
        r3 = 0;
        goto L22
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C02461(this, r10);
        goto L8
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start interaction = this.dragInteraction;
        if (interaction == null) goto L9;
        MutableInteractionSource r2 = this.interactionSource;
        if (r2 == null) goto L7;
        r2.tryEmit(new DragInteraction.Cancel(interaction));
    L7:
        this.dragInteraction = null;
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void update$default(DragGestureNode r0, Function1 r1, boolean r2, MutableInteractionSource r3, Orientation r4, boolean r5, int r6, Object r7) {
        if (r7 != null) goto L22;
        if ((r6 & 1) == 0) goto L7;
        r1 = r0.canDrag;
    L7:
        if ((r6 & 2) == 0) goto L10;
        r2 = r0.enabled;
    L10:
        if ((r6 & 4) == 0) goto L13;
        r3 = r0.interactionSource;
    L13:
        if ((r6 & 8) == 0) goto L16;
        r4 = r0.orientationLock;
    L16:
        if ((r6 & 16) == 0) goto L18;
        boolean r8 = false;
    L19:
        r0.update(r1, r2, r3, r4, r8);
        return;
    L18:
        r8 = r5;
        goto L19
    L22:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    public final void update(Function1<? super PointerInputChange, Boolean> r5, boolean enabled, MutableInteractionSource interactionSource, Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        boolean resetPointerInputHandling = shouldResetPointerInputHandling;
        this.canDrag = r5;
        if (this.enabled == enabled) goto L12;
        this.enabled = enabled;
        if (enabled == true) goto L10;
        disposeInteractionSource();
        SuspendingPointerInputModifierNode it = this.pointerInputNode;
        if (it == null) goto L9;
        undelegate(it);
    L9:
        this.pointerInputNode = null;
    L10:
        resetPointerInputHandling = true;
    L12:
        if (Intrinsics.areEqual(this.interactionSource, interactionSource) == true) goto L15;
        disposeInteractionSource();
        this.interactionSource = interactionSource;
    L15:
        if (this.orientationLock == orientationLock) goto L17;
        this.orientationLock = orientationLock;
        resetPointerInputHandling = true;
    L17:
        if (resetPointerInputHandling == false) goto L22;
        SuspendingPointerInputModifierNode r1 = this.pointerInputNode;
        if (r1 == null) goto L23;
        r1.resetPointerInputHandler();
        return;
    L23:
        return;
    }
}
