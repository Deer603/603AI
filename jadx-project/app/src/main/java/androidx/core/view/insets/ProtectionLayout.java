package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.R;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object PROTECTION_VIEW = null;
    private ProtectionGroup mGroup;
    private final List<Protection> mProtections;

    static {
        PROTECTION_VIEW = new Object();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context, List<Protection> protections) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(protections);
    }

    public void setProtections(List<Protection> protections) {
        this.mProtections.clear();
        this.mProtections.addAll(protections);
        if (isAttachedToWindow() == false) goto L6;
        removeProtectionViews();
        addProtectionViews();
        requestApplyInsets();
        return;
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup rootView = (ViewGroup) getRootView();
        Object tag = rootView.getTag(R.id.tag_system_bar_state_monitor);
        if ((tag instanceof SystemBarStateMonitor) == true) goto L5;
        SystemBarStateMonitor monitor = new SystemBarStateMonitor(rootView);
        rootView.setTag(R.id.tag_system_bar_state_monitor, monitor);
        return monitor;
    L5:
        return (SystemBarStateMonitor) tag;
    }

    private void maybeUninstallSystemBarStateMonitor() {
        ViewGroup rootView = (ViewGroup) getRootView();
        Object tag = rootView.getTag(R.id.tag_system_bar_state_monitor);
        if ((tag instanceof SystemBarStateMonitor) == true) goto L5;
        return;
    L5:
        SystemBarStateMonitor monitor = (SystemBarStateMonitor) tag;
        if (monitor.hasCallback() == false) goto L8;
        return;
    L8:
        monitor.detachFromWindow();
        rootView.setTag(R.id.tag_system_bar_state_monitor, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mGroup == null) goto L5;
        removeProtectionViews();
    L5:
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        maybeUninstallSystemBarStateMonitor();
    }

    private void addProtectionViews() {
        if (this.mProtections.isEmpty() == false) goto L5;
        return;
    L5:
        SystemBarStateMonitor monitor = getOrInstallSystemBarStateMonitor();
        this.mGroup = new ProtectionGroup(monitor, this.mProtections);
        int nonProtectionChildCount = getChildCount();
        int i = 0;
        int size = this.mGroup.size();
    L6:
        if (i >= size) goto L8;
        Protection protection = this.mGroup.getProtection(i);
        addProtectionView(getContext(), i + nonProtectionChildCount, protection);
        i = i + 1;
        goto L6
    }

    private void removeProtectionViews() {
        if (this.mGroup == null) goto L11;
        removeViews(getChildCount() - this.mGroup.size(), this.mGroup.size());
        int i = 0;
        int size = this.mGroup.size();
    L5:
        ProtectionGroup r2 = this.mGroup;
        if (i >= size) goto L8;
        r2.getProtection(i).getAttributes().setCallback(null);
        i = i + 1;
        goto L5
    L8:
        r2.dispose();
        this.mGroup = null;
        return;
    }

    private void addProtectionView(Context context, int index, Protection protection) {
        Protection.Attributes attrs = protection.getAttributes();
        switch(protection.getSide()) {
            case 1: goto L9;
            case 2: goto L8;
            case 4: goto L7;
            case 8: goto L6;
            default: goto L5;
        };
    L6:
        int width = -1;
        int height = attrs.getHeight();
        int gravity = 80;
    L10:
        final FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(width, height, gravity);
        Insets margin = attrs.getMargin();
        params.leftMargin = margin.left;
        params.topMargin = margin.top;
        params.rightMargin = margin.right;
        params.bottomMargin = margin.bottom;
        final View view = new View(context);
        view.setTag(PROTECTION_VIEW);
        view.setTranslationX(attrs.getTranslationX());
        view.setTranslationY(attrs.getTranslationY());
        view.setAlpha(attrs.getAlpha());
        if (attrs.isVisible() == false) goto L13;
        int r7 = 0;
    L14:
        view.setVisibility(r7);
        view.setBackground(attrs.getDrawable());
        Protection.Attributes.Callback callback = new AnonymousClass1(this, params, view);
        attrs.setCallback(callback);
        addView(view, index, params);
        return;
    L13:
        r7 = 4;
        goto L14
    L7:
        width = attrs.getWidth();
        height = -1;
        gravity = 5;
        goto L10
    L8:
        width = -1;
        height = attrs.getHeight();
        gravity = 48;
        goto L10
    L9:
        width = attrs.getWidth();
        height = -1;
        gravity = 3;
        goto L10
    L5:
        throw new IllegalArgumentException("Unexpected side: " + protection.getSide());
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child != null) goto L4;
    L13:
        super.addView(child, index, params);
        return;
    L4:
        if (child.getTag() == PROTECTION_VIEW) goto L13;
        if (this.mGroup == null) goto L8;
        int protectionViewCount = this.mGroup.size();
    L9:
        int maxIndex = getChildCount() - protectionViewCount;
        if (index > maxIndex) goto L12;
        if (index >= 0) goto L13;
    L12:
        index = maxIndex;
        goto L13
    L8:
        protectionViewCount = 0;
        goto L9
    }
}
