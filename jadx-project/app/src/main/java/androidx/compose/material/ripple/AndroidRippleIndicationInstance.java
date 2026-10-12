package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Replaced by the new RippleNode implementation")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u001aH\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020\u001aH\u0016J\b\u00102\u001a\u00020\u001aH\u0016J\b\u00103\u001a\u00020\u001aH\u0016J\b\u00104\u001a\u00020\u001aH\u0016J\u0010\u00105\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0016J\f\u00106\u001a\u00020\u001a*\u000207H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u00020(X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010)R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/material/ripple/RippleHostKey;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "view", "Landroid/view/ViewGroup;", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "invalidateTick", "getInvalidateTick", "()Z", "setInvalidateTick", "(Z)V", "invalidateTick$delegate", "Landroidx/compose/runtime/MutableState;", "onInvalidateRipple", "Lkotlin/Function0;", "", "F", "rippleContainer", "Landroidx/compose/material/ripple/RippleContainer;", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "getRippleHostView", "()Landroidx/compose/material/ripple/RippleHostView;", "setRippleHostView", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView$delegate", "rippleRadius", "", "rippleSize", "Landroidx/compose/ui/geometry/Size;", "J", "addRipple", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispose", "getOrCreateRippleContainer", "onAbandoned", "onForgotten", "onRemembered", "onResetRippleHostView", "removeRipple", "drawIndication", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final Function0<Unit> onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;
    private final ViewGroup view;

    static {
        $stable = 8;
    }

    public /* synthetic */ AndroidRippleIndicationInstance(boolean r1, float r2, State r3, State r4, ViewGroup r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    public static final /* synthetic */ boolean access$getInvalidateTick(AndroidRippleIndicationInstance $this) {
        return $this.getInvalidateTick();
    }

    public static final /* synthetic */ void access$setInvalidateTick(AndroidRippleIndicationInstance $this, boolean r1) {
        $this.setInvalidateTick(r1);
    }

    private AndroidRippleIndicationInstance(boolean bounded, float radius, State<Color> r6, State<RippleAlpha> r7, ViewGroup view) {
        super(bounded, r7);
        this.bounded = bounded;
        this.radius = radius;
        this.color = r6;
        this.rippleAlpha = r7;
        this.view = view;
        this.rippleHostView$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.invalidateTick$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.rippleSize = Size.Companion.m4203getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    private final RippleHostView getRippleHostView() {
        State $this$getValue$iv = this.rippleHostView$delegate;
        return (RippleHostView) $this$getValue$iv.getValue();
    }

    private final void setRippleHostView(RippleHostView r4) {
        MutableState $this$setValue$iv = this.rippleHostView$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final boolean getInvalidateTick() {
        State $this$getValue$iv = this.invalidateTick$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setInvalidateTick(boolean r5) {
        MutableState $this$setValue$iv = this.invalidateTick$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope $this$drawIndication) {
        this.rippleSize = $this$drawIndication.mo4917getSizeNHjbRc();
        float $this$isUnspecified$iv = this.radius;
        if (Float.isNaN($this$isUnspecified$iv) == false) goto L5;
        int r0 = MathKt.roundToInt(RippleAnimationKt.m1868getRippleEndRadiuscSwnlzA($this$drawIndication, this.bounded, $this$drawIndication.mo4917getSizeNHjbRc()));
    L6:
        this.rippleRadius = r0;
        long color = this.color.getValue().m4376unboximpl();
        float alpha = this.rippleAlpha.getValue().getPressedAlpha();
        $this$drawIndication.drawContent();
        m1872drawStateLayerH2RKhps($this$drawIndication, this.radius, color);
        ContentDrawScope $this$drawIntoCanvas$iv = $this$drawIndication;
        Canvas canvas = $this$drawIntoCanvas$iv.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView $this$drawIndication_u24lambda_u241_u24lambda_u240 = getRippleHostView();
        if ($this$drawIndication_u24lambda_u241_u24lambda_u240 == null) goto L11;
        $this$drawIndication_u24lambda_u241_u24lambda_u240.m1871setRipplePropertiesbiQXAtU($this$drawIndication.mo4917getSizeNHjbRc(), this.rippleRadius, color, alpha);
        $this$drawIndication_u24lambda_u241_u24lambda_u240.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        return;
    L11:
        return;
    L5:
        r0 = $this$drawIndication.mo370roundToPx0680j_4(this.radius);
        goto L6
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press interaction, CoroutineScope scope) {
        RippleContainer $this$addRipple_u24lambda_u243 = getOrCreateRippleContainer();
        RippleHostView $this$addRipple_u24lambda_u243_u24lambda_u242 = $this$addRipple_u24lambda_u243.getRippleHostView(this);
        $this$addRipple_u24lambda_u243_u24lambda_u242.m1870addRippleKOepWvA(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m4376unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView($this$addRipple_u24lambda_u243_u24lambda_u242);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press interaction) {
        RippleHostView r0 = getRippleHostView();
        if (r0 == null) goto L6;
        r0.removeRipple();
        return;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    private final void dispose() {
        RippleContainer $this$dispose_u24lambda_u244 = this.rippleContainer;
        if ($this$dispose_u24lambda_u244 == null) goto L6;
        $this$dispose_u24lambda_u244.disposeRippleIfNeeded(this);
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
        this.rippleContainer = Ripple_androidKt.access$createAndAttachRippleContainerIfNeeded(this.view);
        RippleContainer r1 = this.rippleContainer;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
