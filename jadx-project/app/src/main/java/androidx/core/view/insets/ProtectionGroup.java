package androidx.core.view.insets;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class ProtectionGroup implements SystemBarStateMonitor.Callback {
    private int mAnimationCount;
    private boolean mDisposed;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;
    private final SystemBarStateMonitor mMonitor;
    private final ArrayList<Protection> mProtections;

    ProtectionGroup(SystemBarStateMonitor monitor, List<Protection> protections) {
        this.mProtections = new ArrayList();
        this.mInsets = Insets.NONE;
        this.mInsetsIgnoringVisibility = Insets.NONE;
        addProtections(protections, false);
        addProtections(protections, true);
        monitor.addCallback(this);
        this.mMonitor = monitor;
    }

    private void addProtections(List<Protection> protections, boolean occupiesCorners) {
        int size = protections.size();
        int i = 0;
    L3:
        if (i >= size) goto L13;
        Protection protection = protections.get(i);
        if (protection.occupiesCorners() != occupiesCorners) goto L10;
        Object controller = protection.getController();
        if (controller != null) goto L12;
        protection.setController(this);
        this.mProtections.add(protection);
        goto L10
    L12:
        throw new IllegalStateException(protection + " is already controlled by " + controller);
    L10:
        i = i + 1;
        goto L3
    }

    private void updateInsets() {
        Insets consumed = Insets.NONE;
        int i = this.mProtections.size() - 1;
    L3:
        if (i < 0) goto L5;
        Protection protection = this.mProtections.get(i);
        consumed = Insets.max(consumed, protection.dispatchInsets(this.mInsets, this.mInsetsIgnoringVisibility, consumed));
        i = i - 1;
        goto L3
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onInsetsChanged(Insets insets, Insets insetsIgnoringVisibility) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insetsIgnoringVisibility;
        updateInsets();
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onColorHintChanged(int color) {
        int i = this.mProtections.size() - 1;
    L3:
        if (i < 0) goto L5;
        this.mProtections.get(i).dispatchColorHint(color);
        i = i - 1;
        goto L3
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationStart() {
        this.mAnimationCount++;
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationProgress(int sides, Insets insets, RectF alpha) {
        Insets insetsStable = this.mInsetsIgnoringVisibility;
        int i = this.mProtections.size() - 1;
    L3:
        if (i < 0) goto L27;
        Protection protection = this.mProtections.get(i);
        int side = protection.getSide();
        if ((side & sides) == 0) goto L26;
        protection.setSystemVisible(true);
        switch(side) {
            case 1: goto L23;
            case 2: goto L19;
            case 4: goto L15;
            case 8: goto L11;
            default: goto L26;
        };
    L11:
        if (insetsStable.bottom <= 0) goto L13;
        protection.setSystemInsetAmount(insets.bottom / insetsStable.bottom);
    L13:
        protection.setSystemAlpha(alpha.bottom);
        goto L26
    L15:
        if (insetsStable.right <= 0) goto L17;
        protection.setSystemInsetAmount(insets.right / insetsStable.right);
    L17:
        protection.setSystemAlpha(alpha.right);
        goto L26
    L19:
        if (insetsStable.top <= 0) goto L21;
        protection.setSystemInsetAmount(insets.top / insetsStable.top);
    L21:
        protection.setSystemAlpha(alpha.top);
        goto L26
    L23:
        if (insetsStable.left <= 0) goto L25;
        protection.setSystemInsetAmount(insets.left / insetsStable.left);
    L25:
        protection.setSystemAlpha(alpha.left);
    L26:
        i = i - 1;
        goto L3
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationEnd() {
        if (this.mAnimationCount <= 0) goto L5;
        boolean wasAnimating = true;
    L6:
        this.mAnimationCount--;
        if (wasAnimating == true) goto L9;
        return;
    L9:
        if (this.mAnimationCount != 0) goto L13;
        updateInsets();
        return;
    L13:
        return;
    L5:
        wasAnimating = false;
        goto L6
    }

    int size() {
        return this.mProtections.size();
    }

    Protection getProtection(int index) {
        return this.mProtections.get(index);
    }

    void dispose() {
        if (this.mDisposed == false) goto L5;
        return;
    L5:
        this.mDisposed = true;
        this.mMonitor.removeCallback(this);
        int i = this.mProtections.size() - 1;
    L6:
        ArrayList<Protection> r0 = this.mProtections;
        if (i < 0) goto L9;
        r0.get(i).setController(null);
        i = i - 1;
        goto L6
    L9:
        r0.clear();
    }
}
