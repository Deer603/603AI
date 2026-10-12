package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {PointerIconCompat.TYPE_CELL}, m = "invokeSuspend", n = {}, s = {})
final class SliderKt$sliderTapModifier$2$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;
    final /* synthetic */ CoroutineScope $scope;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pos", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", i = {}, l = {PointerIconCompat.TYPE_COPY}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(boolean r2, float r3, MutableState<Float> r4, State<Float> r5, Continuation<? super AnonymousClass1> r6) {
            this.$isRtl = r2;
            this.$maxPx = r3;
            this.$pressOffset = r4;
            this.$rawOffset = r5;
            super(3, r6);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope r5, Offset r6, Continuation<? super Unit> r7) {
            return m1762invoked4ec7I(r5, r6.m4135unboximpl(), r7);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m1762invoked4ec7I(PressGestureScope r7, long r8, Continuation<? super Unit> r10) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, r10);
            r0.L$0 = r7;
            r0.J$0 = r8;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L10;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);     // Catch: GestureCancellationException -> L8
        L22:
        L21:
            return Unit.INSTANCE;
        L10:
            ResultKt.throwOnFailure($result);
            PressGestureScope $this$detectTapGestures = (PressGestureScope) this.L$0;
            long pos = this.J$0;
            if (this.$isRtl == false) goto L13;
            float to = this.$maxPx - Offset.m4125getXimpl(pos);
        L14:
            this.$pressOffset.setValue(Boxing.boxFloat(to - this.$rawOffset.getValue().floatValue()));
            this.label = 1;     // Catch: GestureCancellationException -> L8
            if ($this$detectTapGestures.awaitRelease(this) != r0) goto L22;
            return r0;
        L13:
            to = Offset.m4125getXimpl(pos);
            goto L14
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L19:
            this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
            goto L21
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$sliderTapModifier$2$1$1(boolean r2, float r3, MutableState<Float> r4, State<Float> r5, CoroutineScope r6, DraggableState r7, State<? extends Function1<? super Float, Unit>> r8, Continuation<? super SliderKt$sliderTapModifier$2$1$1> r9) {
        this.$isRtl = r2;
        this.$maxPx = r3;
        this.$pressOffset = r4;
        this.$rawOffset = r5;
        this.$scope = r6;
        this.$draggableState = r7;
        this.$gestureEndAction = r8;
        super(2, r9);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r10, Continuation<?> r11) {
        SliderKt$sliderTapModifier$2$1$1 r0 = new SliderKt$sliderTapModifier$2$1$1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, r11);
        r0.L$0 = r10;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
        return ((SliderKt$sliderTapModifier$2$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
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
        PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
        AnonymousClass1 r5 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
        final CoroutineScope r3 = this.$scope;
        final DraggableState r4 = this.$draggableState;
        final State<Function1<Float, Unit>> r6 = this.$gestureEndAction;
        this.label = 1;
        if (TapGestureDetectorKt.detectTapGestures$default($this$pointerInput, null, null, r5, new AnonymousClass2(r3, r4, r6), this, 3, null) != r0) goto L11;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
