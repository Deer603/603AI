package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J\b\u0010/\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\u000e\u00102\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J \u00103\u001a\u00020+2\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u00105J\b\u00106\u001a\u00020+H\u0002J\f\u00107\u001a\u00020\u0006*\u00020\u0006H\u0002J\f\u00108\u001a\u00020\u0010*\u00020\u0006H\u0002J\f\u00109\u001a\u00020\u0010*\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u00020\u0018X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u0018X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%X\u0096\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Landroidx/compose/material3/TimePickerState;", "state", "(Landroidx/compose/material3/TimePickerState;)V", "anim", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "clockFaceValues", "Landroidx/collection/IntList;", "getClockFaceValues", "()Landroidx/collection/IntList;", "currentAngle", "getCurrentAngle", "()F", "value", "", "hour", "getHour", "()I", "setHour", "(I)V", "hourAngle", "is24hour", "", "()Z", "set24hour", "(Z)V", "isAfternoon", "setAfternoon", "minute", "getMinute", "setMinute", "minuteAngle", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "selection", "Landroidx/compose/material3/TimePickerSelectionMode;", "getSelection-yecRtBI", "setSelection-6_8s6DQ", "getState", "()Landroidx/compose/material3/TimePickerState;", "animateToCurrent", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endValueForAnimation", "new", "isUpdated", "offsetAngle", "angle", "onGestureEnd", "rotateTo", "animate", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBaseStateMinute", "normalize", "toHour", "toMinute", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 0;
    private Animatable<Float, AnimationVector1D> anim;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex;
    private final TimePickerState state;

    /* JADX INFO: renamed from: androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2, reason: invalid class name */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", i = {}, l = {738}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;
        final /* synthetic */ AnalogTimePickerState this$0;

        AnonymousClass2(AnalogTimePickerState r2, float r3, Continuation<? super AnonymousClass2> r4) {
            this.this$0 = r2;
            this.$end = r3;
            super(1, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r4) {
            return new AnonymousClass2(this.this$0, this.$end, r4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super AnimationResult<Float, AnimationVector1D>> r3) {
            return ((AnonymousClass2) create(r3)).invokeSuspend(Unit.INSTANCE);
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
            return $result;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            Object r2 = Animatable.animateTo$default(AnalogTimePickerState.access$getAnim$p(this.this$0), Boxing.boxFloat(this.$end), AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null), null, null, this, 12, null);
            if (r2 != r0) goto L11;
            return r0;
        L11:
            return r2;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", i = {}, l = {789}, m = "invokeSuspend", n = {}, s = {})
    static final class C04662 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;
        final /* synthetic */ AnalogTimePickerState this$0;

        C04662(AnalogTimePickerState r2, float r3, Continuation<? super C04662> r4) {
            this.this$0 = r2;
            this.$end = r3;
            super(1, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r4) {
            return new C04662(this.this$0, this.$end, r4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super AnimationResult<Float, AnimationVector1D>> r3) {
            return ((C04662) create(r3)).invokeSuspend(Unit.INSTANCE);
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
            return $result;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            Object r2 = Animatable.animateTo$default(AnalogTimePickerState.access$getAnim$p(this.this$0), Boxing.boxFloat(this.$end), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, null, this, 12, null);
            if (r2 != r0) goto L11;
            return r0;
        L11:
            return r2;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AnalogTimePickerState$rotateTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", i = {}, l = {803, 806}, m = "invokeSuspend", n = {}, s = {})
    static final class C04672 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ float $angle;
        final /* synthetic */ boolean $animate;
        int label;
        final /* synthetic */ AnalogTimePickerState this$0;

        C04672(AnalogTimePickerState r2, float r3, boolean r4, Continuation<? super C04672> r5) {
            this.this$0 = r2;
            this.$angle = r3;
            this.$animate = r4;
            super(1, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r5) {
            return new C04672(this.this$0, this.$angle, this.$animate, r5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> r3) {
            return ((C04672) create(r3)).invokeSuspend(Unit.INSTANCE);
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
            return $result;
        L7:
            ResultKt.throwOnFailure($result);
        L29:
            return Unit.INSTANCE;
        L8:
            ResultKt.throwOnFailure($result);
            boolean r2 = TimePickerSelectionMode.m2874equalsimpl0(this.this$0.mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI());
            AnalogTimePickerState r3 = this.this$0;
            if (r2 == false) goto L15;
            int r4 = 12;
            AnalogTimePickerState.access$setHourAngle$p(r3, (AnalogTimePickerState.access$toHour(this.this$0, this.$angle) % 12) * 0.5235988f);
            TimePickerState r5 = this.this$0.getState();
            int r6 = AnalogTimePickerState.access$toHour(this.this$0, AnalogTimePickerState.access$getHourAngle$p(this.this$0)) % 12;
            if (this.this$0.isAfternoon() == true) goto L14;
            r4 = 0;
        L14:
            r5.setHour(r6 + r4);
        L16:
            boolean r7 = this.$animate;
            AnalogTimePickerState r8 = this.this$0;
            if (r7 == true) goto L23;
            this.label = 1;
            if (AnalogTimePickerState.access$getAnim$p(r8).snapTo(Boxing.boxFloat(AnalogTimePickerState.access$offsetAngle(this.this$0, this.$angle)), this) != r0) goto L29;
            return r0;
        L23:
            float endAngle = AnalogTimePickerState.access$endValueForAnimation(r8, AnalogTimePickerState.access$offsetAngle(this.this$0, this.$angle));
            this.label = 2;
            Object r9 = Animatable.animateTo$default(AnalogTimePickerState.access$getAnim$p(this.this$0), Boxing.boxFloat(endAngle), AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null), null, null, this, 12, null);
            if (r9 != r0) goto L27;
            return r0;
        L27:
            return r9;
        L15:
            AnalogTimePickerState.access$setMinuteAngle$p(r3, AnalogTimePickerState.access$toMinute(this.this$0, this.$angle) * 0.10471976f);
            this.this$0.getState().setMinute(AnalogTimePickerState.access$toMinute(this.this$0, AnalogTimePickerState.access$getMinuteAngle$p(this.this$0)));
            goto L16
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: getSelection-yecRtBI, reason: not valid java name */
    public int mo1887getSelectionyecRtBI() {
        return this.state.mo1887getSelectionyecRtBI();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.state.is24hour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return this.state.isAfternoon();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean r2) {
        this.state.set24hour(r2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean r2) {
        this.state.setAfternoon(r2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo1888setSelection6_8s6DQ(int r2) {
        this.state.mo1888setSelection6_8s6DQ(r2);
    }

    public AnalogTimePickerState(TimePickerState state) {
        this.state = state;
        this.hourAngle = ((this.state.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (this.state.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        this.mutex = new MutatorMutex();
    }

    public static final /* synthetic */ float access$endValueForAnimation(AnalogTimePickerState $this, float r2) {
        return $this.endValueForAnimation(r2);
    }

    public static final /* synthetic */ Animatable access$getAnim$p(AnalogTimePickerState $this) {
        return $this.anim;
    }

    public static final /* synthetic */ float access$getHourAngle$p(AnalogTimePickerState $this) {
        return $this.hourAngle;
    }

    public static final /* synthetic */ float access$getMinuteAngle$p(AnalogTimePickerState $this) {
        return $this.minuteAngle;
    }

    public static final /* synthetic */ float access$offsetAngle(AnalogTimePickerState $this, float angle) {
        return $this.offsetAngle(angle);
    }

    public static final /* synthetic */ void access$setHourAngle$p(AnalogTimePickerState $this, float r1) {
        $this.hourAngle = r1;
    }

    public static final /* synthetic */ void access$setMinuteAngle$p(AnalogTimePickerState $this, float r1) {
        $this.minuteAngle = r1;
    }

    public static final /* synthetic */ int access$toHour(AnalogTimePickerState $this, float $receiver) {
        return $this.toHour($receiver);
    }

    public static final /* synthetic */ int access$toMinute(AnalogTimePickerState $this, float $receiver) {
        return $this.toMinute($receiver);
    }

    public final TimePickerState getState() {
        return this.state;
    }

    public final float getCurrentAngle() {
        return this.anim.getValue().floatValue();
    }

    public final Object animateToCurrent(Continuation<? super Unit> r6) {
        if (isUpdated() == true) goto L7;
        return Unit.INSTANCE;
    L7:
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L9;
        float end = endValueForAnimation(this.hourAngle);
    L10:
        Object r1 = this.mutex.mutate(MutatePriority.PreventUserInput, new AnonymousClass2(this, end, null), r6);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L14;
        return r1;
    L14:
        return Unit.INSTANCE;
    L9:
        end = endValueForAnimation(this.minuteAngle);
        goto L10
    }

    private final boolean isUpdated() {
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L11;
        if (normalize(this.anim.getTargetValue().floatValue()) != normalize(this.hourAngle)) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == false) goto L11;
        return false;
    L7:
        r0 = false;
    L11:
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == true) goto L13;
    L18:
        return true;
    L13:
        if (normalize(this.anim.getTargetValue().floatValue()) != normalize(this.minuteAngle)) goto L15;
        boolean r1 = true;
    L16:
        if (r1 == false) goto L18;
        return false;
    L15:
        r1 = false;
        goto L16
    }

    public final IntList getClockFaceValues() {
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == false) goto L6;
        return TimePickerKt.access$getMinutes$p();
    L6:
        return TimePickerKt.access$getHours$p();
    }

    private final float endValueForAnimation(float r4) {
        float diff = this.anim.getValue().floatValue() - r4;
    L4:
        if (diff <= 3.1415927f) goto L7;
        diff = diff - 6.2831855f;
    L7:
        if (diff > (-3.1415927f)) goto L10;
        diff = diff + 6.2831855f;
        goto L7
    L10:
        return this.anim.getValue().floatValue() - diff;
    }

    public final Object onGestureEnd(Continuation<? super Unit> r6) {
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L5;
        float r0 = this.hourAngle;
    L6:
        float end = endValueForAnimation(r0);
        Object r1 = this.mutex.mutate(MutatePriority.PreventUserInput, new C04662(this, end, null), r6);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r1;
    L10:
        return Unit.INSTANCE;
    L5:
        r0 = this.minuteAngle;
        goto L6
    }

    public static /* synthetic */ Object rotateTo$default(AnalogTimePickerState r0, float r1, boolean r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.rotateTo(r1, r2, r3);
    }

    public final Object rotateTo(float angle, boolean animate, Continuation<? super Unit> r7) {
        Object r0 = this.mutex.mutate(MutatePriority.UserInput, new C04672(this, angle, animate, null), r7);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int value) {
        this.minuteAngle = (value * 0.10471976f) - 1.5707964f;
        this.state.setMinute(value);
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == false) goto L5;
        this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
    L5:
        updateBaseStateMinute();
    }

    private final void updateBaseStateMinute() {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r3 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        this.state.setMinute(getMinute());     // Catch: Throwable -> L10
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L10
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        return;
    L10:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        throw th;
    L5:
        r3 = null;
        goto L6
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int value) {
        this.hourAngle = ((value % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(value);
        if (TimePickerSelectionMode.m2874equalsimpl0(mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L6;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        return;
    }

    private final float normalize(float $this$normalize) {
        double normalizedAngle = ((double) $this$normalize) % 6.283185307179586d;
        if (normalizedAngle >= 0.0d) goto L6;
        normalizedAngle = normalizedAngle + 6.283185307179586d;
    L6:
        return (float) normalizedAngle;
    }

    private final int toHour(float $this$toHour) {
        double totalOffset = ((double) 0.2617994f) + 1.5707963267948966d;
        return ((int) ((((double) $this$toHour) + totalOffset) / 0.5235987901687622d)) % 12;
    }

    private final int toMinute(float $this$toMinute) {
        double totalOffset = ((double) 0.05235988f) + 1.5707963267948966d;
        return ((int) ((((double) $this$toMinute) + totalOffset) / 0.10471975803375244d)) % 60;
    }

    private final float offsetAngle(float angle) {
        float ret = 1.5707964f + angle;
        if (ret >= 0.0f) goto L6;
        return 6.2831855f + ret;
    L6:
        return ret;
    }
}
