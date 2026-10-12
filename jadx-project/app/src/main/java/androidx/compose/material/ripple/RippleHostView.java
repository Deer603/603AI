package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010 \u001a\u00020\rJ\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&H\u0016J0\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0018H\u0014J\u0018\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0014J\b\u00100\u001a\u00020\rH\u0016J\u0006\u00101\u001a\u00020\rJ0\u00102\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0006H\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bounded", "", "Ljava/lang/Boolean;", "lastRippleStateChangeTimeMillis", "", "Ljava/lang/Long;", "onInvalidateRipple", "Lkotlin/Function0;", "", "resetRippleRunnable", "Ljava/lang/Runnable;", "ripple", "Landroidx/compose/material/ripple/UnprojectedRipple;", "addRipple", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "size", "Landroidx/compose/ui/geometry/Size;", "radius", "", "color", "Landroidx/compose/ui/graphics/Color;", "alpha", "", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLkotlin/jvm/functions/Function0;)V", "createRipple", "disposeRipple", "draw", "canvas", "Landroid/graphics/Canvas;", "invalidateDrawable", "who", "Landroid/graphics/drawable/Drawable;", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "refreshDrawableState", "removeRipple", "setRippleProperties", "setRippleProperties-biQXAtU", "(JIJF)V", "setRippleState", "pressed", "Companion", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RippleHostView extends View {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final long MinimumRippleStateChangeTime = 5;
    private static final int[] PressedState = null;
    private static final long ResetRippleDelayDuration = 50;
    private static final int[] RestingState = null;
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private Function0<Unit> onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView$Companion;", "", "()V", "MinimumRippleStateChangeTime", "", "PressedState", "", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public RippleHostView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow() == true) goto L6;
        disposeRipple();
        return;
    L6:
        super.draw(canvas);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    private final void createRipple(boolean bounded) {
        UnprojectedRipple $this$createRipple_u24lambda_u240 = new UnprojectedRipple(bounded);
        setBackground($this$createRipple_u24lambda_u240);
        this.ripple = $this$createRipple_u24lambda_u240;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Function0<Unit> r0 = this.onInvalidateRipple;
        if (r0 == null) goto L6;
        r0.invoke();
        return;
    }

    /* JADX INFO: renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m1870addRippleKOepWvA(PressInteraction.Press interaction, boolean bounded, long size, int radius, long color, float alpha, Function0<Unit> r18) {
        if (this.ripple != null) goto L5;
    L6:
        createRipple(bounded);
        this.bounded = Boolean.valueOf(bounded);
    L7:
        UnprojectedRipple ripple = this.ripple;
        Intrinsics.checkNotNull(ripple);
        this.onInvalidateRipple = r18;
        m1871setRipplePropertiesbiQXAtU(size, radius, color, alpha);
        if (bounded == false) goto L10;
        ripple.setHotspot(Offset.m4125getXimpl(interaction.m547getPressPositionF1C5BW0()), Offset.m4126getYimpl(interaction.m547getPressPositionF1C5BW0()));
    L11:
        setRippleState(true);
        return;
    L10:
        ripple.setHotspot(ripple.getBounds().centerX(), ripple.getBounds().centerY());
        goto L11
    L5:
        if (Intrinsics.areEqual(Boolean.valueOf(bounded), this.bounded) == true) goto L7;
        goto L6
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m1871setRipplePropertiesbiQXAtU(long size, int radius, long color, float alpha) {
        UnprojectedRipple ripple = this.ripple;
        if (ripple != null) goto L5;
        return;
    L5:
        ripple.trySetRadius(radius);
        ripple.m1882setColorDxMtmZc(color, alpha);
        Rect newBounds = new Rect(0, 0, MathKt.roundToInt(Size.m4194getWidthimpl(size)), MathKt.roundToInt(Size.m4191getHeightimpl(size)));
        setLeft(newBounds.left);
        setTop(newBounds.top);
        setRight(newBounds.right);
        setBottom(newBounds.bottom);
        ripple.setBounds(newBounds);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        if (this.resetRippleRunnable == null) goto L5;
        removeCallbacks(this.resetRippleRunnable);
        Runnable r0 = this.resetRippleRunnable;
        Intrinsics.checkNotNull(r0);
        r0.run();
    L9:
        UnprojectedRipple ripple = this.ripple;
        if (ripple != null) goto L12;
        return;
    L12:
        ripple.setVisible(false, false);
        unscheduleDrawable(ripple);
        return;
    L5:
        UnprojectedRipple r1 = this.ripple;
        if (r1 == null) goto L9;
        r1.setState(RestingState);
        goto L9
    }

    private final void setRippleState(boolean pressed) {
        long currentTime = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable == null) goto L5;
        removeCallbacks(runnable);
        runnable.run();
    L5:
        Long r2 = this.lastRippleStateChangeTimeMillis;
        if (r2 == null) goto L8;
        long r3 = r2.longValue();
    L9:
        long timeSinceLastStateChange = currentTime - r3;
        if (pressed == false) goto L12;
    L14:
        if (pressed == false) goto L16;
        int[] state = PressedState;
    L17:
        UnprojectedRipple r5 = this.ripple;
        if (r5 == null) goto L21;
        r5.setState(state);
    L21:
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentTime);
        return;
    L16:
        state = RestingState;
        goto L17
    L12:
        if (timeSinceLastStateChange >= MinimumRippleStateChangeTime) goto L14;
        this.resetRippleRunnable = new RippleHostView$$ExternalSyntheticLambda0(this);
        postDelayed(this.resetRippleRunnable, ResetRippleDelayDuration);
        goto L21
    L8:
        r3 = 0;
        goto L9
    }

    static final void setRippleState$lambda$2(RippleHostView this$0) {
        UnprojectedRipple r0 = this$0.ripple;
        if (r0 == null) goto L6;
        r0.setState(RestingState);
    L6:
        this$0.resetRippleRunnable = null;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        PressedState = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
        RestingState = new int[0];
    }
}
