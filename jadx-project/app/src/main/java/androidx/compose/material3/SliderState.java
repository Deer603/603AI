package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u0003H\u0016J?\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020V2'\u0010W\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0Y\u0012\u0006\u0012\u0004\u0018\u00010Z0X¢\u0006\u0002\b[H\u0096@¢\u0006\u0002\u0010\\J\u001a\u0010]\u001a\u00020\b2\u0006\u0010^\u001a\u00020_H\u0000ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ \u0010b\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00032\u0006\u0010e\u001a\u00020\u0003H\u0002J \u0010f\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u0003H\u0002J\u001d\u0010h\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u0005H\u0000¢\u0006\u0002\bkR\u0014\u0010\f\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010(R+\u0010)\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010,R+\u0010/\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010,R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R+\u00107\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\b8\u0010\u000e\"\u0004\b9\u0010,R\u0014\u0010;\u001a\u00020<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R+\u0010?\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b@\u00106\"\u0004\bA\u0010BR+\u0010E\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010.\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010,R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u0010,R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR+\u0010N\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bO\u0010\u000e\"\u0004\bP\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "value", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "(FILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "coercedValueAsFraction", "getCoercedValueAsFraction$material3_release", "()F", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "gestureEndAction", "getGestureEndAction$material3_release", "()Lkotlin/jvm/functions/Function0;", "<set-?>", "", "isDragging", "isDragging$material3_release", "()Z", "setDragging", "(Z)V", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isRtl", "isRtl$material3_release", "setRtl$material3_release", "onValueChange", "Lkotlin/Function1;", "getOnValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnValueChangeFinished", "setOnValueChangeFinished", "(Lkotlin/jvm/functions/Function0;)V", "pressOffset", "getPressOffset", "setPressOffset", "(F)V", "pressOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "rawOffset", "getRawOffset", "setRawOffset", "rawOffset$delegate", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "getSteps", "()I", "thumbWidth", "getThumbWidth$material3_release", "setThumbWidth$material3_release", "thumbWidth$delegate", "tickFractions", "", "getTickFractions$material3_release", "()[F", "totalWidth", "getTotalWidth", "setTotalWidth", "(I)V", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "trackHeight", "getTrackHeight$material3_release", "setTrackHeight$material3_release", "trackHeight$delegate", "newVal", "getValue", "setValue", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "valueState", "getValueState", "setValueState", "valueState$delegate", "dispatchRawDelta", "delta", "drag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPress", "pos", "Landroidx/compose/ui/geometry/Offset;", "onPress-k-4lQ0M$material3_release", "(J)V", "scaleToOffset", "minPx", "maxPx", "userValue", "scaleToUserValue", "offset", "updateDimensions", "newTrackHeight", "newTotalWidth", "updateDimensions$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderState implements DraggableState {
    public static final int $stable = 0;
    private final DragScope dragScope;
    private final Function0<Unit> gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private Function1<? super Float, Unit> onValueChange;
    private Function0<Unit> onValueChangeFinished;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private final MutatorMutex scrollMutex;
    private final int steps;
    private final MutableFloatState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final ClosedFloatingPointRange<Float> valueRange;
    private final MutableFloatState valueState$delegate;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderState$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", i = {}, l = {1972}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;
        final /* synthetic */ SliderState this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(SliderState r2, MutatePriority r3, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$dragPriority = r3;
            this.$block = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.this$0, this.$dragPriority, this.$block, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            AnonymousClass2 r1 = this;
            ResultKt.throwOnFailure($result);
        L11:
            SliderState.access$setDragging(r1.this$0, false);
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            SliderState.access$setDragging(this.this$0, true);
            this.label = 1;
            if (SliderState.access$getScrollMutex$p(this.this$0).mutateWith(SliderState.access$getDragScope$p(this.this$0), this.$dragPriority, this.$block, this) != r0) goto L10;
            return r0;
        L10:
            r1 = this;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public SliderState() {
        float r1 = 0.0f;
        int r2 = 0;
        Function0 r3 = null;
        ClosedFloatingPointRange r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public SliderState(float value, int steps, Function0<Unit> r7, ClosedFloatingPointRange<Float> r8) {
        this.steps = steps;
        this.onValueChangeFinished = r7;
        this.valueRange = r8;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(value);
        this.tickFractions = SliderKt.access$stepsToTickFractions(this.steps);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.thumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gestureEndAction = new SliderState$gestureEndAction$1(this);
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, value));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new SliderState$dragScope$1(this);
        this.scrollMutex = new MutatorMutex();
    }

    public static final /* synthetic */ DragScope access$getDragScope$p(SliderState $this) {
        return $this.dragScope;
    }

    public static final /* synthetic */ MutatorMutex access$getScrollMutex$p(SliderState $this) {
        return $this.scrollMutex;
    }

    public static final /* synthetic */ void access$setDragging(SliderState $this, boolean r1) {
        $this.setDragging(r1);
    }

    public /* synthetic */ SliderState(float r2, int r3, Function0 r4, ClosedFloatingPointRange r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = RangesKt.rangeTo(0.0f, 1.0f);
    L14:
        this(r2, r3, r4, r5);
    }

    public final int getSteps() {
        return this.steps;
    }

    public final Function0<Unit> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final void setOnValueChangeFinished(Function0<Unit> r1) {
        this.onValueChangeFinished = r1;
    }

    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getValueState() {
        FloatState $this$getValue$iv = this.valueState$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setValueState(float r4) {
        MutableFloatState $this$setValue$iv = this.valueState$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final void setValue(float newVal) {
        float coercedValue = RangesKt.coerceIn(newVal, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        float snappedValue = SliderKt.access$snapValueToTick(coercedValue, this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        setValueState(snappedValue);
    }

    public final float getValue() {
        return getValueState();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority dragPriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super Unit> r5) {
        Object r0 = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, dragPriority, r4, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float delta) {
        float maxPx = Math.max(getTotalWidth() - (getThumbWidth$material3_release() / 2.0f), 0.0f);
        float minPx = Math.min(getThumbWidth$material3_release() / 2.0f, maxPx);
        setRawOffset((getRawOffset() + delta) + getPressOffset());
        setPressOffset(0.0f);
        float offsetInTrack = SliderKt.access$snapValueToTick(getRawOffset(), this.tickFractions, minPx, maxPx);
        float scaledUserValue = scaleToUserValue(minPx, maxPx, offsetInTrack);
        if (scaledUserValue != getValue()) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        return;
    L8:
        if (this.onValueChange == null) goto L12;
        Function1<? super Float, Unit> r5 = this.onValueChange;
        if (r5 == null) goto L15;
        r5.invoke(Float.valueOf(scaledUserValue));
        return;
    L15:
        return;
    L12:
        setValue(scaledUserValue);
        return;
    L5:
        r4 = false;
        goto L6
    }

    public final Function1<Float, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(Function1<? super Float, Unit> r1) {
        this.onValueChange = r1;
    }

    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    private final int getTotalWidth() {
        IntState $this$getValue$iv = this.totalWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setTotalWidth(int r4) {
        MutableIntState $this$setValue$iv = this.totalWidth$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final boolean isRtl$material3_release() {
        return this.isRtl;
    }

    public final void setRtl$material3_release(boolean r1) {
        this.isRtl = r1;
    }

    public final float getTrackHeight$material3_release() {
        FloatState $this$getValue$iv = this.trackHeight$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setTrackHeight$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.trackHeight$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getThumbWidth$material3_release() {
        FloatState $this$getValue$iv = this.thumbWidth$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setThumbWidth$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.thumbWidth$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.access$calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), RangesKt.coerceIn(getValue(), this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    private final void setDragging(boolean r5) {
        MutableState $this$setValue$iv = this.isDragging$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean isDragging$material3_release() {
        State $this$getValue$iv = this.isDragging$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void updateDimensions$material3_release(float newTrackHeight, int newTotalWidth) {
        setTrackHeight$material3_release(newTrackHeight);
        setTotalWidth(newTotalWidth);
    }

    public final Function0<Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    /* JADX INFO: renamed from: onPress-k-4lQ0M$material3_release, reason: not valid java name */
    public final void m2652onPressk4lQ0M$material3_release(long pos) {
        if (this.isRtl == false) goto L5;
        float to = getTotalWidth() - Offset.m4125getXimpl(pos);
    L6:
        setPressOffset(to - getRawOffset());
        return;
    L5:
        to = Offset.m4125getXimpl(pos);
        goto L6
    }

    private final float getRawOffset() {
        FloatState $this$getValue$iv = this.rawOffset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setRawOffset(float r4) {
        MutableFloatState $this$setValue$iv = this.rawOffset$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float getPressOffset() {
        FloatState $this$getValue$iv = this.pressOffset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setPressOffset(float r4) {
        MutableFloatState $this$setValue$iv = this.pressOffset$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float scaleToUserValue(float minPx, float maxPx, float offset) {
        return SliderKt.access$scale(minPx, maxPx, offset, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float minPx, float maxPx, float userValue) {
        return SliderKt.access$scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), userValue, minPx, maxPx);
    }
}
