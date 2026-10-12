package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SelectionGestures.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\rH\u0082@¢\u0006\u0002\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\"\u0010\u001d\u001a\u00020\u0010*\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0080@¢\u0006\u0002\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010\"\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010$\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a \u0010%\u001a\u00020\u0019*\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100'H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006("}, d2 = {"STATIC_KEY", "", "isPrecisePointer", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "distanceIsTolerable", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "change1", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change2", "awaitDown", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelection", "", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "clicksCounter", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "down", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionBtf2", "selectionGestureInput", "Landroidx/compose/ui/Modifier;", "mouseSelectionObserver", "textDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "selectionGesturePointerInputBtf2", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelectionFirstPress", "downEvent", "touchSelectionSubsequentPress", "updateSelectionTouchMode", "updateTouchMode", "Lkotlin/Function1;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {430}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
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
            return SelectionGesturesKt.access$awaitDown(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {159, 183}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C03991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C03991(Continuation<? super C03991> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.access$mouseSelection(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {357, 384}, m = "mouseSelectionBtf2", n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C04001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04001(Continuation<? super C04001> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.access$mouseSelectionBtf2(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", i = {0}, l = {209, 217, 220, 221}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClicksCounter $clicksCounter;
        final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
        final /* synthetic */ TextDragObserver $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(ClicksCounter r2, MouseSelectionObserver r3, TextDragObserver r4, Continuation<? super AnonymousClass2> r5) {
            this.$clicksCounter = r2;
            this.$mouseSelectionObserver = r3;
            this.$textDragObserver = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, r6);
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r19) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L10;
                case 1: goto L9;
                case 2: goto L8;
                case 3: goto L7;
                case 4: goto L6;
                default: goto L5;
            };
        L6:
            Object $result = r19;
            ResultKt.throwOnFailure($result);
        L46:
            Object $result2 = Unit.INSTANCE;
            return $result2;
        L7:
            Object $result3 = r19;
            ResultKt.throwOnFailure($result3);
            goto L46
        L8:
            Object $result4 = r19;
            ResultKt.throwOnFailure($result4);
            goto L46
        L9:
            Object $result5 = r19;
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result5);
            Object r5 = $result5;
        L13:
            PointerEvent downEvent = (PointerEvent) r5;
            this.$clicksCounter.update(downEvent);
            boolean isPrecise = SelectionGesturesKt.isPrecisePointer(downEvent);
            if (isPrecise == true) goto L16;
        L33:
            if (isPrecise == true) goto L46;
            int r6 = this.$clicksCounter.getClicks();
            TextDragObserver r8 = this.$textDragObserver;
            if (r6 != 1) goto L41;
            this.L$0 = null;
            this.label = 3;
            if (SelectionGesturesKt.access$touchSelectionFirstPress($this$awaitEachGesture, r8, downEvent, this) != r1) goto L39;
            return r1;
        L39:
            $result3 = $result5;
            goto L46
        L41:
            this.L$0 = null;
            this.label = 4;
            if (SelectionGesturesKt.access$touchSelectionSubsequentPress($this$awaitEachGesture, r8, downEvent, this) != r1) goto L44;
            return r1;
        L44:
            $result = $result5;
            goto L46
        L16:
            if (PointerEvent_androidKt.m5562isPrimaryPressedaHzCxE(downEvent.m5529getButtonsry648PA()) == false) goto L33;
            List<PointerInputChange> r9 = downEvent.getChanges();
            int index$iv$iv = 0;
            int r12 = r9.size();
        L18:
            if (index$iv$iv >= r12) goto L26;
            Object it$iv = r9.get(index$iv$iv);
            PointerInputChange it = (PointerInputChange) it$iv;
            boolean r17 = false;
            if (it.isConsumed() == true) goto L22;
            boolean r13 = true;
        L23:
            if (r13 == false) goto L27;
            index$iv$iv = index$iv$iv + 1;
        L27:
            if (r17 == false) goto L33;
            this.L$0 = null;
            this.label = 2;
            if (SelectionGesturesKt.access$mouseSelectionBtf2($this$awaitEachGesture, this.$mouseSelectionObserver, this.$clicksCounter, downEvent, this) != r1) goto L31;
            return r1;
        L31:
            $result4 = $result5;
            goto L46
        L22:
            r13 = false;
            goto L23
        L26:
            r17 = true;
            goto L27
        L10:
            ResultKt.throwOnFailure(r19);
            $result5 = r19;
            $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture;
            this.label = 1;
            r5 = SelectionGesturesKt.access$awaitDown($this$awaitEachGesture, this);
            if (r5 != r1) goto L13;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {126, 130}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C04021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04021(Continuation<? super C04021> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.access$touchSelection(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {238, 242}, m = "touchSelectionFirstPress", n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C04041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04041(Continuation<? super C04041> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.access$touchSelectionFirstPress(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionGestures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {281, 322}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
    static final class C04051 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C04051(Continuation<? super C04051> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SelectionGesturesKt.access$touchSelectionSubsequentPress(null, null, null, this);
        }
    }

    public static final /* synthetic */ Object access$awaitDown(AwaitPointerEventScope $receiver, Continuation $completion) {
        return awaitDown($receiver, $completion);
    }

    public static final /* synthetic */ boolean access$distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange change1, PointerInputChange change2) {
        return distanceIsTolerable(viewConfiguration, change1, change2);
    }

    public static final /* synthetic */ Object access$mouseSelection(AwaitPointerEventScope $receiver, MouseSelectionObserver observer, ClicksCounter clicksCounter, PointerEvent down, Continuation $completion) {
        return mouseSelection($receiver, observer, clicksCounter, down, $completion);
    }

    public static final /* synthetic */ Object access$mouseSelectionBtf2(AwaitPointerEventScope $receiver, MouseSelectionObserver observer, ClicksCounter clicksCounter, PointerEvent down, Continuation $completion) {
        return mouseSelectionBtf2($receiver, observer, clicksCounter, down, $completion);
    }

    public static final /* synthetic */ Object access$touchSelection(AwaitPointerEventScope $receiver, TextDragObserver observer, PointerEvent down, Continuation $completion) {
        return touchSelection($receiver, observer, down, $completion);
    }

    public static final /* synthetic */ Object access$touchSelectionFirstPress(AwaitPointerEventScope $receiver, TextDragObserver observer, PointerEvent downEvent, Continuation $completion) {
        return touchSelectionFirstPress($receiver, observer, downEvent, $completion);
    }

    public static final /* synthetic */ Object access$touchSelectionSubsequentPress(AwaitPointerEventScope $receiver, TextDragObserver observer, PointerEvent downEvent, Continuation $completion) {
        return touchSelectionSubsequentPress($receiver, observer, downEvent, $completion);
    }

    public static final Modifier updateSelectionTouchMode(Modifier $this$updateSelectionTouchMode, final Function1<? super Boolean, Unit> r3) {
        return SuspendingPointerInputFilterKt.pointerInput($this$updateSelectionTouchMode, Integer.valueOf(STATIC_KEY), new C04061(r3));
    }

    public static final Modifier selectionGestureInput(Modifier $this$selectionGestureInput, final MouseSelectionObserver mouseSelectionObserver, final TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput($this$selectionGestureInput, mouseSelectionObserver, textDragObserver, new C04011(mouseSelectionObserver, textDragObserver));
    }

    private static final Object touchSelection(AwaitPointerEventScope $this$touchSelection, final TextDragObserver observer, PointerEvent down, Continuation<? super Unit> r11) {
        if ((r11 instanceof C04021) == false) goto L7;
        C04021 r0 = (C04021) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L20;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        TextDragObserver observer2 = (TextDragObserver) r0.L$1;
        AwaitPointerEventScope $this$touchSelection2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L15
        AwaitPointerEventScope $this$touchSelection3 = $this$touchSelection2;
        observer = observer2;
        Object r8 = $result;
    L33:
        if (((Boolean) r8).booleanValue() == false) goto L41;
        List<PointerInputChange> r9 = $this$touchSelection3.getCurrentEvent().getChanges();     // Catch: CancellationException -> L44
        int index$iv = 0;
        int r3 = r9.size();     // Catch: CancellationException -> L44
    L35:
        if (index$iv >= r3) goto L40;
        Object item$iv = r9.get(index$iv);     // Catch: CancellationException -> L44
        PointerInputChange it = (PointerInputChange) item$iv;     // Catch: CancellationException -> L44
        if (PointerEventKt.changedToUp(it) == false) goto L39;
        it.consume();     // Catch: CancellationException -> L44
    L39:
        index$iv = index$iv + 1;     // Catch: CancellationException -> L44
        goto L35
    L40:
        observer.onStop();     // Catch: CancellationException -> L44
    L43:
        return Unit.INSTANCE;
    L41:
        observer.onCancel();     // Catch: CancellationException -> L44
    L15:
        CancellationException c = e;
    L46:
        observer2.onCancel();
        throw c;
    L17:
        PointerInputChange firstDown = (PointerInputChange) r0.L$2;
        observer = (TextDragObserver) r0.L$1;
        $this$touchSelection3 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L44
        Object r4 = $result;
    L25:
        PointerInputChange drag = (PointerInputChange) r4;     // Catch: CancellationException -> L44
        if (drag == null) goto L43;
        if (distanceIsTolerable($this$touchSelection3.getViewConfiguration(), firstDown, drag) == false) goto L43;
        observer.mo1133onStartk4lQ0M(drag.m5589getPositionF1C5BW0());     // Catch: CancellationException -> L44
        long r5 = drag.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L44
        Function1<PointerInputChange, Unit> r10 = new C04032(observer);     // Catch: CancellationException -> L44
        r0.L$0 = $this$touchSelection3;     // Catch: CancellationException -> L44
        r0.L$1 = observer;     // Catch: CancellationException -> L44
        r0.L$2 = null;     // Catch: CancellationException -> L44
        r0.label = 2;     // Catch: CancellationException -> L44
        r8 = DragGestureDetectorKt.m432dragjO51t88($this$touchSelection3, r5, r10, r0);     // Catch: CancellationException -> L44
        if (r8 != r2) goto L33;
        return r2;
    L20:
        ResultKt.throwOnFailure($result);
        PointerInputChange firstDown2 = (PointerInputChange) CollectionsKt.first(down.getChanges());     // Catch: CancellationException -> L44
        long r6 = firstDown2.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L44
        r0.L$0 = $this$touchSelection;     // Catch: CancellationException -> L44
        r0.L$1 = observer;     // Catch: CancellationException -> L44
        r0.L$2 = firstDown2;     // Catch: CancellationException -> L44
        r0.label = 1;     // Catch: CancellationException -> L44
        Object r12 = DragGestureDetectorKt.m422awaitLongPressOrCancellationrnUCldI($this$touchSelection, r6, r0);     // Catch: CancellationException -> L44
        if (r12 != r2) goto L24;
        return r2;
    L24:
        $this$touchSelection3 = $this$touchSelection;
        firstDown = firstDown2;
        r4 = r12;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L44:
        e = move-exception;
        c = e;
        observer2 = observer;
    L7:
        r0 = new C04021(r11);
        goto L8
    }

    private static final Object mouseSelection(AwaitPointerEventScope $this$mouseSelection, final MouseSelectionObserver observer, ClicksCounter clicksCounter, PointerEvent down, Continuation<? super Unit> r13) {
        if ((r13 instanceof C03991) == false) goto L7;
        C03991 r0 = (C03991) r13;
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
        Ref.BooleanRef dragConsumed = (Ref.BooleanRef) r0.L$2;
        observer = (MouseSelectionObserver) r0.L$1;
        AwaitPointerEventScope $this$mouseSelection2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$mouseSelection3 = $this$mouseSelection2;
        Object r11 = $result;
    L43:
        boolean shouldConsumeUp = ((Boolean) r11).booleanValue();
        if (shouldConsumeUp == true) goto L46;
    L54:
        observer.onDragDone();
    L56:
        return Unit.INSTANCE;
    L46:
        if (dragConsumed.element == false) goto L54;
        List<PointerInputChange> r9 = $this$mouseSelection3.getCurrentEvent().getChanges();
        int index$iv = 0;
        int r3 = r9.size();
    L48:
        if (index$iv >= r3) goto L54;
        Object item$iv = r9.get(index$iv);
        PointerInputChange it = (PointerInputChange) item$iv;
        if (PointerEventKt.changedToUp(it) == false) goto L52;
        it.consume();
    L52:
        index$iv = index$iv + 1;
        goto L48
    L13:
        MouseSelectionObserver observer2 = (MouseSelectionObserver) r0.L$1;
        AwaitPointerEventScope $this$mouseSelection4 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r12 = $result;
    L22:
        boolean shouldConsumeUp2 = ((Boolean) r12).booleanValue();
        if (shouldConsumeUp2 == false) goto L31;
        List<PointerInputChange> r10 = $this$mouseSelection4.getCurrentEvent().getChanges();
        int index$iv2 = 0;
        int r4 = r10.size();
    L25:
        if (index$iv2 >= r4) goto L31;
        Object item$iv2 = r10.get(index$iv2);
        PointerInputChange it2 = (PointerInputChange) item$iv2;
        if (PointerEventKt.changedToUp(it2) == false) goto L29;
        it2.consume();
    L29:
        index$iv2 = index$iv2 + 1;
    L31:
        observer2.onDragDone();
        goto L56
    L14:
        ResultKt.throwOnFailure($result);
        clicksCounter.update(down);
        PointerInputChange downChange = down.getChanges().get(0);
        if (TextFieldSelectionManager_androidKt.isShiftPressed(down) == false) goto L33;
        boolean started = observer.mo1369onExtendk4lQ0M(downChange.m5589getPositionF1C5BW0());
        if (started == false) goto L56;
        long r14 = downChange.m5587getIdJ3iCeTQ();
        Function1<PointerInputChange, Unit> r5 = new SelectionGesturesKt$mouseSelection$shouldConsumeUp$1(observer);
        r0.L$0 = $this$mouseSelection;
        r0.L$1 = observer;
        r0.label = 1;
        r12 = DragGestureDetectorKt.m432dragjO51t88($this$mouseSelection, r14, r5, r0);
        if (r12 != r2) goto L21;
        return r2;
    L21:
        $this$mouseSelection4 = $this$mouseSelection;
        observer2 = observer;
        goto L22
    L33:
        switch(clicksCounter.getClicks()) {
            case 1: goto L36;
            case 2: goto L35;
            default: goto L34;
        };
    L34:
        final SelectionAdjustment selectionAdjustment = SelectionAdjustment.Companion.getParagraph();
    L37:
        boolean started2 = observer.mo1371onStart3MmeM6k(downChange.m5589getPositionF1C5BW0(), selectionAdjustment);
        if (started2 == false) goto L56;
        final Ref.BooleanRef dragConsumed2 = new Ref.BooleanRef();
        dragConsumed2.element = !Intrinsics.areEqual(selectionAdjustment, SelectionAdjustment.Companion.getNone());
        long r6 = downChange.m5587getIdJ3iCeTQ();
        Function1<PointerInputChange, Unit> r7 = new SelectionGesturesKt$mouseSelection$shouldConsumeUp$2(observer, selectionAdjustment, dragConsumed2);
        r0.L$0 = $this$mouseSelection;
        r0.L$1 = observer;
        r0.L$2 = dragConsumed2;
        r0.label = 2;
        r11 = DragGestureDetectorKt.m432dragjO51t88($this$mouseSelection, r6, r7, r0);
        if (r11 != r2) goto L42;
        return r2;
    L42:
        $this$mouseSelection3 = $this$mouseSelection;
        dragConsumed = dragConsumed2;
        goto L43
    L35:
        selectionAdjustment = SelectionAdjustment.Companion.getWord();
        goto L37
    L36:
        selectionAdjustment = SelectionAdjustment.Companion.getNone();
        goto L37
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03991(r13);
        goto L8
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope $this$selectionGesturePointerInputBtf2, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super Unit> r6) {
        ClicksCounter clicksCounter = new ClicksCounter($this$selectionGesturePointerInputBtf2.getViewConfiguration());
        Object r1 = ForEachGestureKt.awaitEachGesture($this$selectionGesturePointerInputBtf2, new AnonymousClass2(clicksCounter, mouseSelectionObserver, textDragObserver, null), r6);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r1;
    L6:
        return Unit.INSTANCE;
    }

    private static final Object touchSelectionFirstPress(AwaitPointerEventScope $this$touchSelectionFirstPress, final TextDragObserver observer, PointerEvent downEvent, Continuation<? super Unit> r11) {
        if ((r11 instanceof C04041) == false) goto L7;
        C04041 r0 = (C04041) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L20;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        TextDragObserver observer2 = (TextDragObserver) r0.L$1;
        AwaitPointerEventScope $this$touchSelectionFirstPress2 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L15
        AwaitPointerEventScope $this$touchSelectionFirstPress3 = $this$touchSelectionFirstPress2;
        observer = observer2;
        Object r8 = $result;
    L32:
        boolean dragCompletedWithUp = ((Boolean) r8).booleanValue();     // Catch: CancellationException -> L44
        if (dragCompletedWithUp == false) goto L41;
        List<PointerInputChange> r9 = $this$touchSelectionFirstPress3.getCurrentEvent().getChanges();     // Catch: CancellationException -> L44
        int index$iv = 0;
        int r3 = r9.size();     // Catch: CancellationException -> L44
    L35:
        if (index$iv >= r3) goto L40;
        Object item$iv = r9.get(index$iv);     // Catch: CancellationException -> L44
        PointerInputChange it = (PointerInputChange) item$iv;     // Catch: CancellationException -> L44
        if (PointerEventKt.changedToUp(it) == false) goto L39;
        it.consume();     // Catch: CancellationException -> L44
    L39:
        index$iv = index$iv + 1;     // Catch: CancellationException -> L44
        goto L35
    L40:
        observer.onStop();     // Catch: CancellationException -> L44
    L43:
        return Unit.INSTANCE;
    L41:
        observer.onCancel();     // Catch: CancellationException -> L44
    L15:
        CancellationException c = e;
    L46:
        observer2.onCancel();
        throw c;
    L17:
        PointerInputChange firstDown = (PointerInputChange) r0.L$2;
        observer = (TextDragObserver) r0.L$1;
        $this$touchSelectionFirstPress3 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L44
        Object r4 = $result;
    L25:
        PointerInputChange longPress = (PointerInputChange) r4;     // Catch: CancellationException -> L44
        if (longPress == null) goto L43;
        if (distanceIsTolerable($this$touchSelectionFirstPress3.getViewConfiguration(), firstDown, longPress) == false) goto L43;
        observer.mo1133onStartk4lQ0M(longPress.m5589getPositionF1C5BW0());     // Catch: CancellationException -> L44
        long r5 = longPress.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L44
        Function1<PointerInputChange, Unit> r10 = new SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1(observer);     // Catch: CancellationException -> L44
        r0.L$0 = $this$touchSelectionFirstPress3;     // Catch: CancellationException -> L44
        r0.L$1 = observer;     // Catch: CancellationException -> L44
        r0.L$2 = null;     // Catch: CancellationException -> L44
        r0.label = 2;     // Catch: CancellationException -> L44
        r8 = DragGestureDetectorKt.m432dragjO51t88($this$touchSelectionFirstPress3, r5, r10, r0);     // Catch: CancellationException -> L44
        if (r8 != r2) goto L32;
        return r2;
    L20:
        ResultKt.throwOnFailure($result);
        PointerInputChange firstDown2 = (PointerInputChange) CollectionsKt.first(downEvent.getChanges());     // Catch: CancellationException -> L44
        long r6 = firstDown2.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L44
        r0.L$0 = $this$touchSelectionFirstPress;     // Catch: CancellationException -> L44
        r0.L$1 = observer;     // Catch: CancellationException -> L44
        r0.L$2 = firstDown2;     // Catch: CancellationException -> L44
        r0.label = 1;     // Catch: CancellationException -> L44
        Object r12 = DragGestureDetectorKt.m422awaitLongPressOrCancellationrnUCldI($this$touchSelectionFirstPress, r6, r0);     // Catch: CancellationException -> L44
        if (r12 != r2) goto L24;
        return r2;
    L24:
        $this$touchSelectionFirstPress3 = $this$touchSelectionFirstPress;
        firstDown = firstDown2;
        r4 = r12;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L44:
        e = move-exception;
        c = e;
        observer2 = observer;
    L7:
        r0 = new C04041(r11);
        goto L8
    }

    private static final Object touchSelectionSubsequentPress(AwaitPointerEventScope r17, TextDragObserver r18, PointerEvent downEvent, Continuation<? super Unit> r20) {
        if ((r20 instanceof C04051) == false) goto L7;
        C04051 r0 = (C04051) r20;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        C04051 r2 = r0;
        Object $result = r2.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r2.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        TextDragObserver observer = (TextDragObserver) r2.L$1;
        AwaitPointerEventScope $this$touchSelectionSubsequentPress = (AwaitPointerEventScope) r2.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L15
        Object r5 = $result;
    L44:
        boolean dragCompletedWithUp = ((Boolean) r5).booleanValue();     // Catch: CancellationException -> L15
        if (dragCompletedWithUp == false) goto L53;
        List<PointerInputChange> r6 = $this$touchSelectionSubsequentPress.getCurrentEvent().getChanges();     // Catch: CancellationException -> L15
        int index$iv = 0;
        int r7 = r6.size();     // Catch: CancellationException -> L15
    L47:
        if (index$iv >= r7) goto L52;
        Object item$iv = r6.get(index$iv);     // Catch: CancellationException -> L15
        PointerInputChange it = (PointerInputChange) item$iv;     // Catch: CancellationException -> L15
        if (PointerEventKt.changedToUp(it) == false) goto L51;
        it.consume();     // Catch: CancellationException -> L15
    L51:
        index$iv = index$iv + 1;     // Catch: CancellationException -> L15
        goto L47
    L52:
        observer.onStop();     // Catch: CancellationException -> L15
    L55:
        return Unit.INSTANCE;
    L53:
        observer.onCancel();     // Catch: CancellationException -> L15
    L15:
        c = e;
    L58:
        observer.onCancel();
        throw c;
    L17:
        long pointerId = r2.J$0;
        Ref.LongRef overSlop = (Ref.LongRef) r2.L$3;
        PointerInputChange firstDown = (PointerInputChange) r2.L$2;
        TextDragObserver observer2 = (TextDragObserver) r2.L$1;
        AwaitPointerEventScope $this$touchSelectionSubsequentPress2 = (AwaitPointerEventScope) r2.L$0;
        ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L20
        Object r11 = $result;
        Ref.LongRef overSlop2 = overSlop;
        final TextDragObserver observer3 = observer2;
        AwaitPointerEventScope $this$touchSelectionSubsequentPress3 = $this$touchSelectionSubsequentPress2;
        long pointerId2 = pointerId;
    L26:
        DownResolution downResolution = (DownResolution) r11;     // Catch: CancellationException -> L56
        if (downResolution != null) goto L30;
        downResolution = DownResolution.Timeout;     // Catch: CancellationException -> L56
    L30:
        if (downResolution == DownResolution.Cancel) goto L32;
        observer3.mo1133onStartk4lQ0M(firstDown.m5589getPositionF1C5BW0());     // Catch: CancellationException -> L56
        if (downResolution != DownResolution.Up) goto L38;
        observer3.onStop();     // Catch: CancellationException -> L56
        return Unit.INSTANCE;
    L38:
        if (downResolution != DownResolution.Drag) goto L40;
        observer3.mo1132onDragk4lQ0M(overSlop2.element);     // Catch: CancellationException -> L56
    L40:
        Function1<PointerInputChange, Unit> r8 = new SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1(observer3);     // Catch: CancellationException -> L56
        r2.L$0 = $this$touchSelectionSubsequentPress3;     // Catch: CancellationException -> L56
        r2.L$1 = observer3;     // Catch: CancellationException -> L56
        r2.L$2 = null;     // Catch: CancellationException -> L56
        r2.L$3 = null;     // Catch: CancellationException -> L56
        r2.label = 2;     // Catch: CancellationException -> L56
        r5 = DragGestureDetectorKt.m432dragjO51t88($this$touchSelectionSubsequentPress3, pointerId2, r8, r2);     // Catch: CancellationException -> L56
        if (r5 != r1) goto L43;
        return r1;
    L43:
        $this$touchSelectionSubsequentPress = $this$touchSelectionSubsequentPress3;
        observer = observer3;
        goto L44
    L32:
        return Unit.INSTANCE;
    L20:
        c = e;
        observer = observer2;
        goto L58
    L22:
        ResultKt.throwOnFailure($result);
        $this$touchSelectionSubsequentPress3 = r17;
        observer3 = r18;
        firstDown = (PointerInputChange) CollectionsKt.first(downEvent.getChanges());     // Catch: CancellationException -> L56
        pointerId2 = firstDown.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L56
        overSlop2 = new Ref.LongRef();     // Catch: CancellationException -> L56
        overSlop2.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();     // Catch: CancellationException -> L56
        long r12 = $this$touchSelectionSubsequentPress3.getViewConfiguration().getLongPressTimeoutMillis();     // Catch: CancellationException -> L56
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 r13 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(pointerId2, overSlop2, null);     // Catch: CancellationException -> L56
        r2.L$0 = $this$touchSelectionSubsequentPress3;     // Catch: CancellationException -> L56
        r2.L$1 = observer3;     // Catch: CancellationException -> L56
        r2.L$2 = firstDown;     // Catch: CancellationException -> L56
        r2.L$3 = overSlop2;     // Catch: CancellationException -> L56
        r2.J$0 = pointerId2;     // Catch: CancellationException -> L56
        r2.label = 1;     // Catch: CancellationException -> L56
        r11 = $this$touchSelectionSubsequentPress3.withTimeoutOrNull(r12, r13, r2);     // Catch: CancellationException -> L56
        if (r11 != r1) goto L26;
        return r1;
    L56:
        c = e;
        observer = observer3;
        goto L58
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C04051(r20);
        goto L8
    }

    private static final Object mouseSelectionBtf2(AwaitPointerEventScope $this$mouseSelectionBtf2, final MouseSelectionObserver observer, ClicksCounter clicksCounter, PointerEvent down, Continuation<? super Unit> r14) {
        if ((r14 instanceof C04001) == false) goto L7;
        C04001 r0 = (C04001) r14;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Ref.BooleanRef dragConsumed = (Ref.BooleanRef) r0.L$2;
        observer = (MouseSelectionObserver) r0.L$1;
        AwaitPointerEventScope $this$mouseSelectionBtf3 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r4 = $result;
    L58:
        boolean shouldConsumeUp = ((Boolean) r4).booleanValue();     // Catch: Throwable -> L15
        if (shouldConsumeUp == true) goto L61;
    L69:
        observer.onDragDone();
    L73:
        return Unit.INSTANCE;
    L61:
        if (dragConsumed.element == false) goto L69;
        List<PointerInputChange> r10 = $this$mouseSelectionBtf3.getCurrentEvent().getChanges();     // Catch: Throwable -> L15
        int index$iv = 0;
        int r3 = r10.size();     // Catch: Throwable -> L15
    L63:
        if (index$iv >= r3) goto L69;
        Object item$iv = r10.get(index$iv);     // Catch: Throwable -> L15
        PointerInputChange it = (PointerInputChange) item$iv;     // Catch: Throwable -> L15
        if (PointerEventKt.changedToUp(it) == false) goto L67;
        it.consume();     // Catch: Throwable -> L15
    L67:
        index$iv = index$iv + 1;
        goto L63
    L17:
        MouseSelectionObserver observer2 = (MouseSelectionObserver) r0.L$1;
        AwaitPointerEventScope $this$mouseSelectionBtf4 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L20
        Object r12 = $result;
    L30:
        boolean shouldConsumeUp2 = ((Boolean) r12).booleanValue();     // Catch: Throwable -> L20
        if (shouldConsumeUp2 == false) goto L39;
        List<PointerInputChange> r13 = $this$mouseSelectionBtf4.getCurrentEvent().getChanges();     // Catch: Throwable -> L20
        int index$iv2 = 0;
        int r5 = r13.size();     // Catch: Throwable -> L20
    L33:
        if (index$iv2 >= r5) goto L39;
        Object item$iv2 = r13.get(index$iv2);     // Catch: Throwable -> L20
        PointerInputChange it2 = (PointerInputChange) item$iv2;     // Catch: Throwable -> L20
        if (PointerEventKt.changedToUp(it2) == false) goto L37;
        it2.consume();     // Catch: Throwable -> L20
    L37:
        index$iv2 = index$iv2 + 1;
    L39:
        observer2.onDragDone();
    L20:
        Throwable th = th;
    L42:
        observer2.onDragDone();
        throw th;
    L22:
        ResultKt.throwOnFailure($result);
        boolean r6 = false;
        PointerInputChange downChange = down.getChanges().get(0);
        if (TextFieldSelectionManager_androidKt.isShiftPressed(down) == false) goto L45;
        boolean started = observer.mo1369onExtendk4lQ0M(downChange.m5589getPositionF1C5BW0());
        if (started == false) goto L73;
        downChange.consume();     // Catch: Throwable -> L40
        long r15 = downChange.m5587getIdJ3iCeTQ();     // Catch: Throwable -> L40
        Function1<PointerInputChange, Unit> r7 = new SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1(observer);     // Catch: Throwable -> L40
        r0.L$0 = $this$mouseSelectionBtf2;     // Catch: Throwable -> L40
        r0.L$1 = observer;     // Catch: Throwable -> L40
        r0.label = 1;     // Catch: Throwable -> L40
        r12 = DragGestureDetectorKt.m432dragjO51t88($this$mouseSelectionBtf2, r15, r7, r0);     // Catch: Throwable -> L40
        if (r12 != r2) goto L29;
        return r2;
    L29:
        $this$mouseSelectionBtf4 = $this$mouseSelectionBtf2;
        observer2 = observer;
    L40:
        th = move-exception;
        th = th;
        observer2 = observer;
        goto L42
    L45:
        switch(clicksCounter.getClicks()) {
            case 1: goto L48;
            case 2: goto L47;
            default: goto L46;
        };
    L46:
        final SelectionAdjustment selectionAdjustment = SelectionAdjustment.Companion.getParagraph();
    L49:
        boolean started2 = observer.mo1371onStart3MmeM6k(downChange.m5589getPositionF1C5BW0(), selectionAdjustment);
        if (started2 == false) goto L73;
        downChange.consume();     // Catch: Throwable -> L15
        final Ref.BooleanRef dragConsumed2 = new Ref.BooleanRef();     // Catch: Throwable -> L15
        if (Intrinsics.areEqual(selectionAdjustment, SelectionAdjustment.Companion.getNone()) == true) goto L54;
        r6 = true;
    L54:
        dragConsumed2.element = r6;     // Catch: Throwable -> L15
        long r8 = downChange.m5587getIdJ3iCeTQ();     // Catch: Throwable -> L15
        Function1<PointerInputChange, Unit> r9 = new SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2(observer, selectionAdjustment, dragConsumed2);     // Catch: Throwable -> L15
        r0.L$0 = $this$mouseSelectionBtf2;     // Catch: Throwable -> L15
        r0.L$1 = observer;     // Catch: Throwable -> L15
        r0.L$2 = dragConsumed2;     // Catch: Throwable -> L15
        r0.label = 2;     // Catch: Throwable -> L15
        r4 = DragGestureDetectorKt.m432dragjO51t88($this$mouseSelectionBtf2, r8, r9, r0);     // Catch: Throwable -> L15
        if (r4 != r2) goto L57;
        return r2;
    L57:
        $this$mouseSelectionBtf3 = $this$mouseSelectionBtf2;
        dragConsumed = dragConsumed2;
        goto L58
    L47:
        selectionAdjustment = SelectionAdjustment.Companion.getWord();
        goto L49
    L48:
        selectionAdjustment = SelectionAdjustment.Companion.getNone();
        goto L49
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        th = move-exception;
        observer.onDragDone();
        throw th;
    L7:
        r0 = new C04001(r14);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:18:0x0054). Please report as a decompilation issue!!! */
    private static final Object awaitDown(AwaitPointerEventScope r18, Continuation<? super PointerEvent> r19) {
        if ((r19 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r19;
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
        AwaitPointerEventScope $this$awaitDown = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitDown2 = $this$awaitDown;
        Object r4 = $result2;
        Object $result3 = $result;
    L18:
        PointerEvent event = (PointerEvent) $result;
        List<PointerInputChange> r7 = event.getChanges();
        int index$iv$iv = 0;
        int r11 = r7.size();
    L19:
        if (index$iv$iv >= r11) goto L24;
        Object item$iv$iv = r7.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (PointerEventKt.changedToDownIgnoreConsumed(it) == false) goto L22;
        index$iv$iv = index$iv$iv + 1;
        goto L19
    L22:
        boolean r12 = false;
    L25:
        if (r12 == false) goto L27;
        return event;
    L27:
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$awaitDown3 = $this$awaitDown2;
    L14:
        PointerEventPass r6 = PointerEventPass.Main;
        r1.L$0 = $this$awaitDown3;
        r1.label = 1;
        Object r8 = $this$awaitDown3.awaitPointerEvent(r6, r1);
        if (r8 != $result2) goto L17;
        return $result2;
    L17:
        Object r17 = $result2;
        $result3 = $result;
        $result = r8;
        $this$awaitDown2 = $this$awaitDown3;
        r4 = r17;
        goto L18
    L24:
        r12 = true;
        goto L25
    L13:
        ResultKt.throwOnFailure($result);
        $this$awaitDown3 = r18;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(r19);
        goto L8
    }

    private static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange change1, PointerInputChange change2) {
        float slop = DragGestureDetectorKt.m435pointerSlopE8SPZFQ(viewConfiguration, change1.m5592getTypeT8wyACA());
        if (Offset.m4123getDistanceimpl(Offset.m4129minusMKHz9U(change1.m5589getPositionF1C5BW0(), change2.m5589getPositionF1C5BW0())) >= slop) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean isPrecisePointer(PointerEvent $this$isPrecisePointer) {
        List<PointerInputChange> r0 = $this$isPrecisePointer.getChanges();
        int index$iv$iv = 0;
        int r5 = r0.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = r0.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (PointerType.m5660equalsimpl0(it.m5592getTypeT8wyACA(), PointerType.Companion.m5665getMouseT8wyACA()) == false) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }
}
