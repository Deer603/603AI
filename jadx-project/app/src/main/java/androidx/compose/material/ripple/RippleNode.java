package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J*\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H&ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020.H\u0016J\u001a\u00107\u001a\u00020.2\u0006\u00101\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020.2\u0006\u0010/\u001a\u000200H&J\u0018\u0010<\u001a\u00020.2\u0006\u0010/\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\f\u0010@\u001a\u00020.*\u00020AH\u0016J\f\u0010B\u001a\u00020.*\u00020CH&R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u001b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020(X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBounded", "()Z", "hasValidSize", "pendingInteractions", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/foundation/interaction/PressInteraction;", "F", "getRippleAlpha", "()Lkotlin/jvm/functions/Function0;", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "getRippleColor-0d7_KjU", "()J", "<set-?>", "Landroidx/compose/ui/geometry/Size;", "rippleSize", "getRippleSize-NH-jbRc", "J", "shouldAutoInvalidate", "getShouldAutoInvalidate", "stateLayer", "Landroidx/compose/material/ripple/StateLayer;", "targetRadius", "", "getTargetRadius", "()F", "setTargetRadius", "(F)V", "addRipple", "", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "size", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "handlePressInteraction", "pressInteraction", "onAttach", "onRemeasured", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "removeRipple", "updateStateLayer", "Landroidx/compose/foundation/interaction/Interaction;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 0;
    private final boolean bounded;
    private final ColorProducer color;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;
    private final Function0<RippleAlpha> rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private StateLayer stateLayer;
    private float targetRadius;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1, reason: invalid class name */
    /* JADX INFO: compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RippleNode this$0;

        AnonymousClass1(RippleNode r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
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
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            Flow<Interaction> r2 = RippleNode.access$getInteractionSource$p(this.this$0).getInteractions();
            final RippleNode r4 = this.this$0;
            this.label = 1;
            if (r2.collect(new C00911(r4, $this$launch), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ RippleNode(InteractionSource r1, boolean r2, float r3, ColorProducer r4, Function0 r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: addRipple-12SF9DM */
    public abstract void mo1863addRipple12SF9DM(PressInteraction.Press r1, long r2, float r4);

    public abstract void drawRipples(DrawScope r1);

    public abstract void removeRipple(PressInteraction.Press r1);

    public static final /* synthetic */ boolean access$getHasValidSize$p(RippleNode $this) {
        return $this.hasValidSize;
    }

    public static final /* synthetic */ InteractionSource access$getInteractionSource$p(RippleNode $this) {
        return $this.interactionSource;
    }

    public static final /* synthetic */ MutableObjectList access$getPendingInteractions$p(RippleNode $this) {
        return $this.pendingInteractions;
    }

    public static final /* synthetic */ void access$handlePressInteraction(RippleNode $this, PressInteraction pressInteraction) {
        $this.handlePressInteraction(pressInteraction);
    }

    public static final /* synthetic */ void access$updateStateLayer(RippleNode $this, Interaction interaction, CoroutineScope scope) {
        $this.updateStateLayer(interaction, scope);
    }

    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final Function0<RippleAlpha> getRippleAlpha() {
        return this.rippleAlpha;
    }

    private RippleNode(InteractionSource interactionSource, boolean bounded, float radius, ColorProducer color, Function0<RippleAlpha> r10) {
        this.interactionSource = interactionSource;
        this.bounded = bounded;
        this.radius = radius;
        this.color = color;
        this.rippleAlpha = r10;
        this.rippleSize = Size.Companion.m4203getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList(0, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    protected final void setTargetRadius(float r1) {
        this.targetRadius = r1;
    }

    /* JADX INFO: renamed from: getRippleSize-NH-jbRc, reason: not valid java name */
    protected final long m1876getRippleSizeNHjbRc() {
        return this.rippleSize;
    }

    /* JADX INFO: renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m1875getRippleColor0d7_KjU() {
        return this.color.mo1640invoke0d7_KjU();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo364onRemeasuredozmzZPI(long size) {
        this.hasValidSize = true;
        Density density = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m7156toSizeozmzZPI(size);
        float $this$isUnspecified$iv = this.radius;
        if (Float.isNaN($this$isUnspecified$iv) == false) goto L5;
        float r3 = RippleAnimationKt.m1868getRippleEndRadiuscSwnlzA(density, this.bounded, this.rippleSize);
    L6:
        this.targetRadius = r3;
        ObjectList this_$iv = this.pendingInteractions;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r5 = this_$iv._size;
    L7:
        if (i$iv >= r5) goto L9;
        PressInteraction it = (PressInteraction) content$iv[i$iv];
        handlePressInteraction(it);
        i$iv = i$iv + 1;
        goto L7
    L9:
        this.pendingInteractions.clear();
        return;
    L5:
        r3 = density.mo376toPx0680j_4(this.radius);
        goto L6
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
    }

    private final void handlePressInteraction(PressInteraction pressInteraction) {
        if ((pressInteraction instanceof PressInteraction.Press) == false) goto L6;
        mo1863addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        return;
    L6:
        if ((pressInteraction instanceof PressInteraction.Release) == false) goto L9;
        removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        return;
    L9:
        if ((pressInteraction instanceof PressInteraction.Cancel) == false) goto L14;
        removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        return;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        $this$draw.drawContent();
        StateLayer $this$draw_u24lambda_u242 = this.stateLayer;
        if ($this$draw_u24lambda_u242 == null) goto L5;
        $this$draw_u24lambda_u242.m1880drawStateLayermxwnekA($this$draw, this.targetRadius, m1875getRippleColor0d7_KjU());
    L5:
        drawRipples($this$draw);
    }

    private final void updateStateLayer(Interaction interaction, CoroutineScope scope) {
        StateLayer instance = this.stateLayer;
        if (instance != null) goto L5;
        instance = new StateLayer(this.bounded, this.rippleAlpha);
        DrawModifierNodeKt.invalidateDraw(this);
        this.stateLayer = instance;
    L5:
        instance.handleInteraction$material_ripple_release(interaction, scope);
    }
}
