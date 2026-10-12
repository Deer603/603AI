package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "checked", "", "(Landroidx/compose/foundation/interaction/InteractionSource;Z)V", "getChecked", "()Z", "setChecked", "(Z)V", "initialOffset", "", "initialSize", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "isPressed", "offsetAnim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "sizeAnim", "onAttach", "", "update", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private boolean checked;
    private float initialOffset;
    private float initialSize;
    private InteractionSource interactionSource;
    private boolean isPressed;
    private Animatable<Float, AnimationVector1D> offsetAnim;
    private Animatable<Float, AnimationVector1D> sizeAnim;

    /* JADX INFO: renamed from: androidx.compose.material3.ThumbNode$onAttach$1, reason: invalid class name */
    /* JADX INFO: compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ThumbNode this$0;

        AnonymousClass1(ThumbNode r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final Ref.IntRef pressCount = new Ref.IntRef();
            Flow<Interaction> r3 = this.this$0.getInteractionSource().getInteractions();
            final ThumbNode r5 = this.this$0;
            this.label = 1;
            if (r3.collect(new C01201(pressCount, r5), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ Animatable access$getOffsetAnim$p(ThumbNode $this) {
        return $this.offsetAnim;
    }

    public static final /* synthetic */ Animatable access$getSizeAnim$p(ThumbNode $this) {
        return $this.sizeAnim;
    }

    public static final /* synthetic */ boolean access$isPressed$p(ThumbNode $this) {
        return $this.isPressed;
    }

    public static final /* synthetic */ void access$setPressed$p(ThumbNode $this, boolean r1) {
        $this.isPressed = r1;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(InteractionSource r1) {
        this.interactionSource = r1;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final void setChecked(boolean r1) {
        this.checked = r1;
    }

    public ThumbNode(InteractionSource interactionSource, boolean checked) {
        this.interactionSource = interactionSource;
        this.checked = checked;
        this.initialOffset = Float.NaN;
        this.initialSize = Float.NaN;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (measurable.maxIntrinsicHeight(Constraints.m6926getMaxWidthimpl(constraints)) != 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        boolean hasContent = r2;
        if (this.isPressed == false) goto L11;
        float r3 = SwitchTokens.INSTANCE.m3645getPressedHandleWidthD9Ej5fM();
    L17:
        float size = $this$measure_u2d3p2s80s.mo376toPx0680j_4(r3);
        Animatable<Float, AnimationVector1D> r4 = this.sizeAnim;
        if (r4 == null) goto L20;
        float r5 = r4.getValue().floatValue();
    L21:
        int actualSize = (int) r5;
        final Placeable placeable = measurable.mo5714measureBRTryo0(Constraints.Companion.m6936fixedJhjzzOo(actualSize, actualSize));
        float arg0$iv = SwitchKt.access$getSwitchHeight$p();
        float other$iv = $this$measure_u2d3p2s80s.mo372toDpu2uoSUM(size);
        float minBound = $this$measure_u2d3p2s80s.mo376toPx0680j_4(Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv - other$iv) / 2.0f));
        float arg0$iv2 = SwitchKt.access$getSwitchWidth$p();
        float other$iv2 = SwitchKt.getThumbDiameter();
        float arg0$iv3 = Dp.m6973constructorimpl(arg0$iv2 - other$iv2);
        float other$iv3 = SwitchKt.access$getThumbPadding$p();
        float maxBound = $this$measure_u2d3p2s80s.mo376toPx0680j_4(Dp.m6973constructorimpl(arg0$iv3 - other$iv3));
        if (this.isPressed == false) goto L27;
        if (this.checked == false) goto L27;
        final float offset = maxBound - $this$measure_u2d3p2s80s.mo376toPx0680j_4(SwitchTokens.INSTANCE.m3651getTrackOutlineWidthD9Ej5fM());
    L35:
        Animatable<Float, AnimationVector1D> r6 = this.sizeAnim;
        if (r6 == null) goto L38;
        Float r7 = r6.getTargetValue();
    L40:
        if (Intrinsics.areEqual(r7, size) == true) goto L42;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, size, null), 3, null);
    L42:
        Animatable<Float, AnimationVector1D> r8 = this.offsetAnim;
        if (r8 == null) goto L45;
        Float r9 = r8.getTargetValue();
    L47:
        if (Intrinsics.areEqual(r9, offset) == true) goto L50;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, offset, null), 3, null);
    L50:
        if (Float.isNaN(this.initialSize) == false) goto L55;
        if (Float.isNaN(this.initialOffset) == false) goto L55;
        this.initialSize = size;
        this.initialOffset = offset;
    L55:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, actualSize, actualSize, null, new ThumbNode$measure$3(placeable, this, offset), 4, null);
    L45:
        r9 = null;
        goto L47
    L38:
        r7 = null;
    L27:
        if (this.isPressed == false) goto L32;
        if (this.checked == true) goto L32;
        offset = $this$measure_u2d3p2s80s.mo376toPx0680j_4(SwitchTokens.INSTANCE.m3651getTrackOutlineWidthD9Ej5fM());
    L32:
        if (this.checked == false) goto L34;
        offset = maxBound;
        goto L35
    L34:
        offset = minBound;
        goto L35
    L20:
        r5 = size;
        goto L21
    L11:
        if (hasContent == false) goto L13;
    L16:
        r3 = SwitchKt.getThumbDiameter();
        goto L17
    L13:
        if (this.checked == true) goto L16;
        r3 = SwitchKt.getUncheckedThumbDiameter();
        goto L17
    L5:
        if (measurable.maxIntrinsicWidth(Constraints.m6925getMaxHeightimpl(constraints)) == 0) goto L7;
        r2 = true;
        goto L8
    }

    public final void update() {
        if (this.sizeAnim != null) goto L8;
        if (Float.isNaN(this.initialSize) == true) goto L8;
        this.sizeAnim = AnimatableKt.Animatable$default(this.initialSize, 0.0f, 2, null);
    L8:
        if (this.offsetAnim == null) goto L10;
        return;
    L10:
        if (Float.isNaN(this.initialOffset) == true) goto L14;
        this.offsetAnim = AnimatableKt.Animatable$default(this.initialOffset, 0.0f, 2, null);
        return;
    }
}
