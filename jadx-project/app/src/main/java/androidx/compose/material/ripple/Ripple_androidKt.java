package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"createAndAttachRippleContainerIfNeeded", "Landroidx/compose/material/ripple/RippleContainer;", "view", "Landroid/view/ViewGroup;", "createPlatformRippleNode", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "createPlatformRippleNode-TDGSqEk", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;", "findNearestViewGroup", "initialView", "Landroid/view/View;", "material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Ripple_androidKt {
    public static final /* synthetic */ RippleContainer access$createAndAttachRippleContainerIfNeeded(ViewGroup view) {
        return createAndAttachRippleContainerIfNeeded(view);
    }

    public static final /* synthetic */ ViewGroup access$findNearestViewGroup(View initialView) {
        return findNearestViewGroup(initialView);
    }

    /* JADX INFO: renamed from: createPlatformRippleNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m1879createPlatformRippleNodeTDGSqEk(InteractionSource interactionSource, boolean bounded, float radius, ColorProducer color, Function0<RippleAlpha> r11) {
        return new AndroidRippleNode(interactionSource, bounded, radius, color, r11, null);
    }

    private static final RippleContainer createAndAttachRippleContainerIfNeeded(ViewGroup view) {
        int index = 0;
        int r1 = view.getChildCount();
    L3:
        if (index >= r1) goto L9;
        View child = view.getChildAt(index);
        if ((child instanceof RippleContainer) == true) goto L7;
        index = index + 1;
        goto L3
    L7:
        return (RippleContainer) child;
    L9:
        RippleContainer $this$createAndAttachRippleContainerIfNeeded_u24lambda_u240 = new RippleContainer(view.getContext());
        view.addView($this$createAndAttachRippleContainerIfNeeded_u24lambda_u240);
        return $this$createAndAttachRippleContainerIfNeeded_u24lambda_u240;
    }

    private static final ViewGroup findNearestViewGroup(View initialView) {
        Object view = initialView;
    L4:
        if ((view instanceof ViewGroup) == true) goto L11;
        ViewParent parent = ((View) view).getParent();
        if ((parent instanceof View) == false) goto L9;
        view = parent;
        goto L4
    L9:
        throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
    L11:
        return (ViewGroup) view;
    }
}
