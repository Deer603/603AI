package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\f\u0010\u001d\u001a\u00020\u0015*\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020\u0015*\u00020 2\u0006\u0010\u0007\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "ripples", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/material/ripple/RippleAnimation;", "targetRadius", "", "addRipple", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onAbandoned", "onForgotten", "onRemembered", "removeRipple", "drawIndication", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;
    private float targetRadius;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonRipple.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PressInteraction.Press $interaction;
        final /* synthetic */ RippleAnimation $rippleAnimation;
        int label;
        final /* synthetic */ CommonRippleIndicationInstance this$0;

        AnonymousClass2(RippleAnimation r2, CommonRippleIndicationInstance r3, PressInteraction.Press r4, Continuation<? super AnonymousClass2> r5) {
            this.$rippleAnimation = r2;
            this.this$0 = r3;
            this.$interaction = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.$rippleAnimation, this.this$0, this.$interaction, r6);
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
                case 0: goto L10;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L8
        L14:
            CommonRippleIndicationInstance.access$getRipples$p(this.this$0).remove(this.$interaction);
            return Unit.INSTANCE;
        L10:
            ResultKt.throwOnFailure($result);
            this.label = 1;     // Catch: Throwable -> L8
            if (this.$rippleAnimation.animate(this) != r0) goto L14;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            th = move-exception;
            CommonRippleIndicationInstance.access$getRipples$p(this.this$0).remove(this.$interaction);
            throw th;
        }
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean r1, float r2, State r3, State r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    public static final /* synthetic */ SnapshotStateMap access$getRipples$p(CommonRippleIndicationInstance $this) {
        return $this.ripples;
    }

    private CommonRippleIndicationInstance(boolean bounded, float radius, State<Color> r4, State<RippleAlpha> r5) {
        super(bounded, r5);
        this.bounded = bounded;
        this.radius = radius;
        this.color = r4;
        this.rippleAlpha = r5;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
        this.targetRadius = Float.NaN;
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope $this$drawIndication) {
        float $this$isUnspecified$iv = this.radius;
        if (Float.isNaN($this$isUnspecified$iv) == false) goto L5;
        float r0 = RippleAnimationKt.m1868getRippleEndRadiuscSwnlzA($this$drawIndication, this.bounded, $this$drawIndication.mo4917getSizeNHjbRc());
    L6:
        this.targetRadius = r0;
        long color = this.color.getValue().m4376unboximpl();
        $this$drawIndication.drawContent();
        m1872drawStateLayerH2RKhps($this$drawIndication, this.radius, color);
        m1865drawRipples4WTKRHQ($this$drawIndication, color);
        return;
    L5:
        r0 = $this$drawIndication.mo376toPx0680j_4(this.radius);
        goto L6
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press interaction, CoroutineScope scope) {
        Map $this$forEach$iv = this.ripples;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> r2 = $this$forEach$iv.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        RippleAnimation ripple = r2.next().getValue();
        ripple.finish();
        goto L4
    L7:
        if (this.bounded == false) goto L9;
        Offset origin = Offset.m4114boximpl(interaction.m547getPressPositionF1C5BW0());
    L10:
        RippleAnimation rippleAnimation = new RippleAnimation(origin, this.targetRadius, this.bounded, null);
        this.ripples.put(interaction, rippleAnimation);
        BuildersKt.launch$default(scope, null, null, new AnonymousClass2(rippleAnimation, this, interaction, null), 3, null);
        return;
    L9:
        origin = null;
        goto L10
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press interaction) {
        RippleAnimation r0 = this.ripples.get(interaction);
        if (r0 == null) goto L6;
        r0.finish();
        return;
    }

    /* JADX INFO: renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1865drawRipples4WTKRHQ(DrawScope $this$drawRipples_u2d4WTKRHQ, long color) {
        Map $this$forEach$iv = this.ripples;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> r3 = $this$forEach$iv.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L14;
        RippleAnimation ripple = r3.next().getValue();
        float alpha = this.rippleAlpha.getValue().getPressedAlpha();
        if (alpha != 0.0f) goto L8;
        boolean r9 = true;
    L9:
        if (r9 == true) goto L4;
        ripple.m1867draw4WTKRHQ($this$drawRipples_u2d4WTKRHQ, Color.m4365copywmQWz5c$default(color, alpha, 0.0f, 0.0f, 0.0f, 14, null));
        goto L4
    L8:
        r9 = false;
        goto L9
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }
}
