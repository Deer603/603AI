package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J$\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u00032\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0+H\u0087@¢\u0006\u0002\u0010,J0\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u00032\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0+2\b\b\u0002\u0010.\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020)H\u0086@¢\u0006\u0002\u00101J\u000e\u00102\u001a\u00020)H\u0086@¢\u0006\u0002\u00101J\b\u00103\u001a\u00020\u0014H\u0002J\r\u00104\u001a\u00020\rH\u0000¢\u0006\u0002\b5J\u0016\u00106\u001a\u00020)2\u0006\u0010&\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u00107R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0012¨\u00069"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "anchoredDraggableState", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "currentOffset", "", "getCurrentOffset", "()F", "currentValue", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "<set-?>", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "density$delegate", "Landroidx/compose/runtime/MutableState;", "isAnimationRunning", "()Z", "isClosed", "isOpen", "offset", "Landroidx/compose/runtime/State;", "getOffset$annotations", "()V", "getOffset", "()Landroidx/compose/runtime/State;", "targetValue", "getTargetValue", "animateTo", "", "anim", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animationSpec", "velocity", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "open", "requireDensity", "requireOffset", "requireOffset$material3_release", "snapTo", "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private final MutableState density$delegate;
    private final State<Float> offset;

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<DrawerState, DrawerValue> Saver(final Function1<? super DrawerValue, Boolean> r3) {
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(r3));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.DrawerState$animateTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/material3/DrawerValue;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;
        final /* synthetic */ DrawerState this$0;

        AnonymousClass3(DrawerState r2, float r3, AnimationSpec<Float> r4, Continuation<? super AnonymousClass3> r5) {
            this.this$0 = r2;
            this.$velocity = r3;
            this.$animationSpec = r4;
            super(4, r5);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AnchoredDragScope r5, DraggableAnchors<DrawerValue> r6, DrawerValue r7, Continuation<? super Unit> r8) {
            AnonymousClass3 r0 = new AnonymousClass3(this.this$0, this.$velocity, this.$animationSpec, r8);
            r0.L$0 = r5;
            r0.L$1 = r6;
            r0.L$2 = r7;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, DraggableAnchors<DrawerValue> r3, DrawerValue r4, Continuation<? super Unit> r5) {
            return invoke2(r2, r3, r4, r5);
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
            AnonymousClass3 r1 = this;
            ResultKt.throwOnFailure($result);
        L19:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            DraggableAnchors anchors = (DraggableAnchors) this.L$1;
            DrawerValue latestTarget = (DrawerValue) this.L$2;
            float targetOffset = anchors.positionOf(latestTarget);
            if (Float.isNaN(targetOffset) == true) goto L19;
            final Ref.FloatRef prev = new Ref.FloatRef();
            if (Float.isNaN(this.this$0.getCurrentOffset()) == false) goto L12;
            float r4 = 0.0f;
        L13:
            prev.element = r4;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (SuspendAnimationKt.animate(prev.element, targetOffset, this.$velocity, this.$animationSpec, new AnonymousClass1($this$anchoredDrag, prev), this) != r0) goto L16;
            return r0;
        L16:
            r1 = this;
            goto L19
        L12:
            r4 = this.this$0.getCurrentOffset();
            goto L13
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        Companion = new Companion(null);
    }

    @Deprecated(message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object.", replaceWith = @ReplaceWith(expression = "currentOffset", imports = {}))
    public static /* synthetic */ void getOffset$annotations() {
    }

    public DrawerState(DrawerValue initialValue, Function1<? super DrawerValue, Boolean> r9) {
        TweenSpec r0 = NavigationDrawerKt.access$getAnimationSpec$p();
        this.anchoredDraggableState = new AnchoredDraggableState(initialValue, DrawerState$anchoredDraggableState$1.INSTANCE, new DrawerState$anchoredDraggableState$2(this), r0, r9);
        this.offset = new DrawerState$offset$1(this);
        this.density$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final /* synthetic */ Object access$animateTo(DrawerState $this, DrawerValue targetValue, AnimationSpec animationSpec, float velocity, Continuation $completion) {
        return $this.animateTo(targetValue, animationSpec, velocity, $completion);
    }

    public static final /* synthetic */ Density access$requireDensity(DrawerState $this) {
        return $this.requireDensity();
    }

    public /* synthetic */ DrawerState(DrawerValue r1, AnonymousClass1 r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = AnonymousClass1.INSTANCE;
    L5:
        this(r1, r2);
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final boolean isOpen() {
        if (getCurrentValue() != DrawerValue.Open) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isClosed() {
        if (getCurrentValue() != DrawerValue.Closed) goto L5;
        return true;
    L5:
        return false;
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final Object open(Continuation<? super Unit> r8) {
        Object r9 = animateTo$default(this, DrawerValue.Open, null, 0.0f, r8, 6, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    public final Object close(Continuation<? super Unit> r8) {
        Object r9 = animateTo$default(this, DrawerValue.Closed, null, 0.0f, r8, 6, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    @Deprecated(message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    public final Object animateTo(DrawerValue targetValue, AnimationSpec<Float> r9, Continuation<? super Unit> r10) {
        Object r8 = animateTo$default(this, targetValue, r9, 0.0f, r10, 4, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public final Object snapTo(DrawerValue targetValue, Continuation<? super Unit> r4) {
        Object r0 = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, targetValue, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final Density getDensity$material3_release() {
        State $this$getValue$iv = this.density$delegate;
        return (Density) $this$getValue$iv.getValue();
    }

    public final void setDensity$material3_release(Density r4) {
        MutableState $this$setValue$iv = this.density$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final Density requireDensity() {
        Density r0 = getDensity$material3_release();
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
    }

    public final float requireOffset$material3_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object animateTo$default(DrawerState r0, DrawerValue r1, TweenSpec r2, float r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = NavigationDrawerKt.access$getAnimationSpec$p();
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = r0.anchoredDraggableState.getLastVelocity();
    L9:
        return r0.animateTo(r1, r2, r3, r4);
    }

    private final Object animateTo(DrawerValue targetValue, AnimationSpec<Float> r9, float velocity, Continuation<? super Unit> r11) {
        Object r8 = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, targetValue, null, new AnonymousClass3(this, velocity, r9, null), r11, 2, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }
}
