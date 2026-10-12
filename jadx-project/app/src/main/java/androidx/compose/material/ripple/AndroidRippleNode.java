package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ*\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\f\u0010$\u001a\u00020\u0017*\u00020%H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/material/ripple/RippleHostKey;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "rippleContainer", "Landroidx/compose/material/ripple/RippleContainer;", "value", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "setRippleHostView", "(Landroidx/compose/material/ripple/RippleHostView;)V", "addRipple", "", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "size", "Landroidx/compose/ui/geometry/Size;", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "getOrCreateRippleContainer", "onDetach", "onResetRippleHostView", "removeRipple", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 0;
    private RippleContainer rippleContainer;
    private RippleHostView rippleHostView;

    static {
        $stable = 8;
    }

    public /* synthetic */ AndroidRippleNode(InteractionSource r1, boolean r2, float r3, ColorProducer r4, Function0 r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    private AndroidRippleNode(InteractionSource interactionSource, boolean bounded, float radius, ColorProducer color, Function0<RippleAlpha> r12) {
        super(interactionSource, bounded, radius, color, r12, null);
    }

    private final void setRippleHostView(RippleHostView value) {
        this.rippleHostView = value;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope $this$drawRipples) {
        Canvas canvas = $this$drawRipples.getDrawContext().getCanvas();
        RippleHostView $this$drawRipples_u24lambda_u241_u24lambda_u240 = this.rippleHostView;
        if ($this$drawRipples_u24lambda_u241_u24lambda_u240 == null) goto L7;
        $this$drawRipples_u24lambda_u241_u24lambda_u240.m1871setRipplePropertiesbiQXAtU(m1876getRippleSizeNHjbRc(), MathKt.roundToInt(getTargetRadius()), m1875getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha());
        $this$drawRipples_u24lambda_u241_u24lambda_u240.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        return;
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: addRipple-12SF9DM, reason: not valid java name */
    public void mo1863addRipple12SF9DM(PressInteraction.Press interaction, long size, float targetRadius) {
        RippleContainer $this$addRipple_12SF9DM_u24lambda_u243 = getOrCreateRippleContainer();
        RippleHostView $this$addRipple_12SF9DM_u24lambda_u243_u24lambda_u242 = $this$addRipple_12SF9DM_u24lambda_u243.getRippleHostView(this);
        $this$addRipple_12SF9DM_u24lambda_u243_u24lambda_u242.m1870addRippleKOepWvA(interaction, getBounded(), size, MathKt.roundToInt(targetRadius), m1875getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha(), new AndroidRippleNode$addRipple$1$1$1(this));
        setRippleHostView($this$addRipple_12SF9DM_u24lambda_u243_u24lambda_u242);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press interaction) {
        RippleHostView r0 = this.rippleHostView;
        if (r0 == null) goto L6;
        r0.removeRipple();
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        RippleContainer $this$onDetach_u24lambda_u244 = this.rippleContainer;
        if ($this$onDetach_u24lambda_u244 == null) goto L6;
        $this$onDetach_u24lambda_u244.disposeRippleIfNeeded(this);
        return;
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        if (this.rippleContainer == null) goto L6;
        RippleContainer r0 = this.rippleContainer;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        ViewGroup view = Ripple_androidKt.access$findNearestViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView()));
        this.rippleContainer = Ripple_androidKt.access$createAndAttachRippleContainerIfNeeded(view);
        RippleContainer r1 = this.rippleContainer;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
