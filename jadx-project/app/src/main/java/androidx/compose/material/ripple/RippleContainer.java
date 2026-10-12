package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: RippleContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\n\u0010\u001a\u001a\u00020\u000f*\u00020\u001bJ\n\u0010\u001c\u001a\u00020\f*\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MaxRippleHosts", "", "nextHostIndex", "rippleHostMap", "Landroidx/compose/material/ripple/RippleHostMap;", "rippleHosts", "", "Landroidx/compose/material/ripple/RippleHostView;", "unusedRippleHosts", "onLayout", "", "changed", "", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "requestLayout", "disposeRippleIfNeeded", "Landroidx/compose/material/ripple/RippleHostKey;", "getRippleHostView", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RippleContainer extends ViewGroup {
    public static final int $stable = 0;
    private final int MaxRippleHosts;
    private int nextHostIndex;
    private final RippleHostMap rippleHostMap;
    private final List<RippleHostView> rippleHosts;
    private final List<RippleHostView> unusedRippleHosts;

    static {
        $stable = 8;
    }

    public RippleContainer(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        this.rippleHosts = new ArrayList();
        this.unusedRippleHosts = new ArrayList();
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView initialHostView = new RippleHostView(context);
        addView(initialHostView);
        this.rippleHosts.add(initialHostView);
        this.unusedRippleHosts.add(initialHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public final RippleHostView getRippleHostView(RippleHostKey $this$getRippleHostView) {
        RippleHostView existingRippleHostView = this.rippleHostMap.get($this$getRippleHostView);
        if (existingRippleHostView == null) goto L5;
        return existingRippleHostView;
    L5:
        RippleHostView rippleHostView = (RippleHostView) CollectionsKt.removeFirstOrNull(this.unusedRippleHosts);
        if (rippleHostView == null) goto L8;
    L18:
        this.rippleHostMap.set($this$getRippleHostView, rippleHostView);
        return rippleHostView;
    L8:
        if (this.nextHostIndex <= CollectionsKt.getLastIndex(this.rippleHosts)) goto L10;
        RippleHostView it = new RippleHostView(getContext());
        addView(it);
        this.rippleHosts.add(it);
    L14:
        rippleHostView = it;
        if (this.nextHostIndex >= (this.MaxRippleHosts - 1)) goto L17;
        this.nextHostIndex++;
        goto L18
    L17:
        this.nextHostIndex = 0;
        goto L18
    L10:
        it = this.rippleHosts.get(this.nextHostIndex);
        RippleHostKey existingInstance = this.rippleHostMap.get(it);
        if (existingInstance == null) goto L14;
        existingInstance.onResetRippleHostView();
        this.rippleHostMap.remove(existingInstance);
        it.disposeRipple();
        goto L14
    }

    public final void disposeRippleIfNeeded(RippleHostKey $this$disposeRippleIfNeeded) {
        $this$disposeRippleIfNeeded.onResetRippleHostView();
        RippleHostView rippleHost = this.rippleHostMap.get($this$disposeRippleIfNeeded);
        if (rippleHost == null) goto L6;
        rippleHost.disposeRipple();
        this.rippleHostMap.remove($this$disposeRippleIfNeeded);
        this.unusedRippleHosts.add(rippleHost);
        return;
    }
}
