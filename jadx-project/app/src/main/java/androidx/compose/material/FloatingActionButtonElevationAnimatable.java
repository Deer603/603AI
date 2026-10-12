package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014J\u000e\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0016J3\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0003*\u0004\u0018\u00010\rH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/FloatingActionButtonElevationAnimatable;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "hoveredElevation", "focusedElevation", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "F", "lastTargetInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "targetInteraction", "animateElevation", "", "to", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "snapElevation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateElevation", "updateElevation-lDy3nrA", "(FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateTarget", "calculateTarget-u2uoSUM", "(Landroidx/compose/foundation/interaction/Interaction;)F", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FloatingActionButtonElevationAnimatable {
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;
    private Interaction lastTargetInteraction;
    private float pressedElevation;
    private Interaction targetInteraction;

    /* JADX INFO: renamed from: androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1, reason: invalid class name */
    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {384}, m = "animateElevation", n = {"this", "to"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FloatingActionButtonElevationAnimatable this$0;

        AnonymousClass1(FloatingActionButtonElevationAnimatable r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.animateElevation(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {370}, m = "snapElevation", n = {"this"}, s = {"L$0"})
    static final class C04291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FloatingActionButtonElevationAnimatable this$0;

        C04291(FloatingActionButtonElevationAnimatable r1, Continuation<? super C04291> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return FloatingActionButtonElevationAnimatable.access$snapElevation(this.this$0, this);
        }
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float r1, float r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    private FloatingActionButtonElevationAnimatable(float defaultElevation, float pressedElevation, float hoveredElevation, float focusedElevation) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.hoveredElevation = hoveredElevation;
        this.focusedElevation = focusedElevation;
        Object r3 = null;
        String r4 = null;
        this.animatable = new Animatable(Dp.m6971boximpl(this.defaultElevation), VectorConvertersKt.getVectorConverter(Dp.Companion), r3, r4, 12, null);
    }

    public static final /* synthetic */ Object access$snapElevation(FloatingActionButtonElevationAnimatable $this, Continuation $completion) {
        return $this.snapElevation($completion);
    }

    /* JADX INFO: renamed from: calculateTarget-u2uoSUM, reason: not valid java name */
    private final float m1684calculateTargetu2uoSUM(Interaction $this$calculateTarget_u2du2uoSUM) {
        if (($this$calculateTarget_u2du2uoSUM instanceof PressInteraction.Press) == false) goto L6;
        return this.pressedElevation;
    L6:
        if (($this$calculateTarget_u2du2uoSUM instanceof HoverInteraction.Enter) == false) goto L9;
        return this.hoveredElevation;
    L9:
        if (($this$calculateTarget_u2du2uoSUM instanceof FocusInteraction.Focus) == false) goto L12;
        return this.focusedElevation;
    L12:
        return this.defaultElevation;
    }

    /* JADX INFO: renamed from: updateElevation-lDy3nrA, reason: not valid java name */
    public final Object m1685updateElevationlDy3nrA(float defaultElevation, float pressedElevation, float hoveredElevation, float focusedElevation, Continuation<? super Unit> r7) {
        this.defaultElevation = defaultElevation;
        this.pressedElevation = pressedElevation;
        this.hoveredElevation = hoveredElevation;
        this.focusedElevation = focusedElevation;
        Object r0 = snapElevation(r7);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private final Object snapElevation(Continuation<? super Unit> r10) {
        if ((r10 instanceof C04291) == false) goto L7;
        C04291 r0 = (C04291) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FloatingActionButtonElevationAnimatable r3 = (FloatingActionButtonElevationAnimatable) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L23:
        r3.lastTargetInteraction = r3.targetInteraction;
    L29:
        return Unit.INSTANCE;
    L15:
        Throwable th = th;
    L26:
        r3.lastTargetInteraction = r3.targetInteraction;
        throw th;
    L17:
        ResultKt.throwOnFailure($result);
        float target = m1684calculateTargetu2uoSUM(this.targetInteraction);
        if (Dp.m6978equalsimpl0(this.animatable.getTargetValue().m6987unboximpl(), target) == true) goto L29;
        Animatable<Dp, AnimationVector1D> r5 = this.animatable;     // Catch: Throwable -> L24
        Dp r6 = Dp.m6971boximpl(target);     // Catch: Throwable -> L24
        r0.L$0 = this;     // Catch: Throwable -> L24
        r0.label = 1;     // Catch: Throwable -> L24
        if (r5.snapTo(r6, r0) != r2) goto L22;
        return r2;
    L22:
        r3 = this;
    L24:
        th = move-exception;
        th = th;
        r3 = this;
        goto L26
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C04291(this, r10);
        goto L8
    }

    public final Object animateElevation(Interaction to, Continuation<? super Unit> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        to = (Interaction) r0.L$1;
        FloatingActionButtonElevationAnimatable r3 = (FloatingActionButtonElevationAnimatable) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L24:
        FloatingActionButtonElevationAnimatable r4 = r3;
    L25:
        r4.lastTargetInteraction = to;
        return Unit.INSTANCE;
    L15:
        Throwable th = th;
    L29:
        r3.lastTargetInteraction = to;
        throw th;
    L17:
        ResultKt.throwOnFailure($result);
        r4 = this;
        float target = r4.m1684calculateTargetu2uoSUM(to);
        r4.targetInteraction = to;
    L27:
        th = move-exception;
        th = th;
        r3 = r4;
        goto L29
    L19:
        if (Dp.m6978equalsimpl0(r4.animatable.getTargetValue().m6987unboximpl(), target) == true) goto L25;
        Animatable<Dp, AnimationVector1D> r5 = r4.animatable;     // Catch: Throwable -> L27
        Interaction r6 = r4.lastTargetInteraction;     // Catch: Throwable -> L27
        r0.L$0 = r4;     // Catch: Throwable -> L27
        r0.L$1 = to;     // Catch: Throwable -> L27
        r0.label = 1;     // Catch: Throwable -> L27
        if (ElevationKt.m1662animateElevationrAjV9yQ(r5, target, r6, to, r0) != r2) goto L23;
        return r2;
    L23:
        r3 = r4;
        goto L24
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r11);
        goto L8
    }

    public final State<Dp> asState() {
        return this.animatable.asState();
    }
}
