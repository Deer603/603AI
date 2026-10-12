package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J$\u0010\u0016\u001a\u00020\u0011*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "bounded", "", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(ZLkotlin/jvm/functions/Function0;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "", "handleInteraction", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "handleInteraction$material_ripple_release", "drawStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "radius", "color", "Landroidx/compose/ui/graphics/Color;", "drawStateLayer-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StateLayer {
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final boolean bounded;
    private Interaction currentInteraction;
    private final List<Interaction> interactions;
    private final Function0<RippleAlpha> rippleAlpha;

    public StateLayer(boolean bounded, Function0<RippleAlpha> r5) {
        this.bounded = bounded;
        this.rippleAlpha = r5;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
    }

    public static final /* synthetic */ Animatable access$getAnimatedAlpha$p(StateLayer $this) {
        return $this.animatedAlpha;
    }

    public final void handleInteraction$material_ripple_release(Interaction interaction, CoroutineScope scope) {
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L6;
        this.interactions.add(interaction);
    L23:
        Interaction newInteraction = (Interaction) CollectionsKt.lastOrNull(this.interactions);
        if (Intrinsics.areEqual(this.currentInteraction, newInteraction) == false) goto L26;
        return;
    L26:
        if (newInteraction == null) goto L38;
        RippleAlpha rippleAlpha = this.rippleAlpha.invoke();
        if ((interaction instanceof HoverInteraction.Enter) == false) goto L31;
        float targetAlpha = rippleAlpha.getHoveredAlpha();
    L37:
        AnimationSpec incomingAnimationSpec = RippleKt.access$incomingStateLayerAnimationSpecFor(newInteraction);
        BuildersKt.launch$default(scope, null, null, new StateLayer$handleInteraction$1(this, targetAlpha, incomingAnimationSpec, null), 3, null);
    L39:
        this.currentInteraction = newInteraction;
        return;
    L31:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L34;
        targetAlpha = rippleAlpha.getFocusedAlpha();
        goto L37
    L34:
        if ((interaction instanceof DragInteraction.Start) == false) goto L36;
        targetAlpha = rippleAlpha.getDraggedAlpha();
        goto L37
    L36:
        targetAlpha = 0.0f;
        goto L37
    L38:
        AnimationSpec outgoingAnimationSpec = RippleKt.access$outgoingStateLayerAnimationSpecFor(this.currentInteraction);
        BuildersKt.launch$default(scope, null, null, new StateLayer$handleInteraction$2(this, outgoingAnimationSpec, null), 3, null);
        goto L39
    L6:
        if ((interaction instanceof HoverInteraction.Exit) == false) goto L9;
        this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        goto L23
    L9:
        if ((interaction instanceof FocusInteraction.Focus) == false) goto L12;
        this.interactions.add(interaction);
        goto L23
    L12:
        if ((interaction instanceof FocusInteraction.Unfocus) == false) goto L15;
        this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        goto L23
    L15:
        if ((interaction instanceof DragInteraction.Start) == false) goto L18;
        this.interactions.add(interaction);
        goto L23
    L18:
        if ((interaction instanceof DragInteraction.Stop) == false) goto L21;
        this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        goto L23
    L21:
        if ((interaction instanceof DragInteraction.Cancel) == false) goto L41;
        this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        goto L23
    }

    /* JADX INFO: renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m1880drawStateLayermxwnekA(DrawScope $this$drawStateLayer_u2dmxwnekA, float radius, long color) {
        float alpha = this.animatedAlpha.getValue().floatValue();
        if (alpha <= 0.0f) goto L23;
        long modulatedColor = Color.m4365copywmQWz5c$default(color, alpha, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.bounded == false) goto L17;
        float right$iv = Size.m4194getWidthimpl($this$drawStateLayer_u2dmxwnekA.mo4917getSizeNHjbRc());
        float bottom$iv = Size.m4191getHeightimpl($this$drawStateLayer_u2dmxwnekA.mo4917getSizeNHjbRc());
        int clipOp$iv = ClipOp.Companion.m4355getIntersectrtfAjoo();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$drawStateLayer_u2dmxwnekA.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L13
        $this$clipRect_rOu3jXo_u24lambda_u244$iv.mo4841clipRectN_I0leg(0.0f, 0.0f, right$iv, bottom$iv, clipOp$iv);     // Catch: Throwable -> L13
        long previousSize$iv$iv2 = previousSize$iv$iv;
        DrawScope.m4898drawCircleVaOC9Bg$default($this$drawStateLayer_u2dmxwnekA, modulatedColor, radius, 0, 0.0f, null, null, 0, 124, null);     // Catch: Throwable -> L11
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv2);
        return;
    L11:
        th = th;
        DrawContext $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L15:
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv2);
        throw th;
    L13:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        previousSize$iv$iv2 = previousSize$iv$iv;
        goto L15
    L17:
        DrawScope.m4898drawCircleVaOC9Bg$default($this$drawStateLayer_u2dmxwnekA, modulatedColor, radius, 0, 0.0f, null, null, 0, 124, null);
        return;
    }
}
