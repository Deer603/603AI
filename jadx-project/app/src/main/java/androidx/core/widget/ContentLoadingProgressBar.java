package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    private static final int MIN_DELAY_MS = 500;
    private static final int MIN_SHOW_TIME_MS = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    /* JADX INFO: renamed from: $r8$lambda$-QLbnDmeB_t0R62xLMJCkjyagZI, reason: not valid java name */
    public static /* synthetic */ void m7260$r8$lambda$QLbnDmeB_t0R62xLMJCkjyagZI(ContentLoadingProgressBar r0) {
        r0.showOnUiThread();
    }

    /* JADX INFO: renamed from: $r8$lambda$LzWHroRwziRn4m5pH-wlpZWokBw, reason: not valid java name */
    public static /* synthetic */ void m7261$r8$lambda$LzWHroRwziRn4m5pHwlpZWokBw(ContentLoadingProgressBar r0) {
        r0.hideOnUiThread();
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-core-widget-ContentLoadingProgressBar, reason: not valid java name */
    /* synthetic */ void m7262lambda$new$0$androidxcorewidgetContentLoadingProgressBar() {
        this.mPostedHide = false;
        this.mStartTime = -1;
        setVisibility(8);
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-core-widget-ContentLoadingProgressBar, reason: not valid java name */
    /* synthetic */ void m7263lambda$new$1$androidxcorewidgetContentLoadingProgressBar() {
        this.mPostedShow = false;
        if (this.mDismissed == true) goto L6;
        this.mStartTime = System.currentTimeMillis();
        setVisibility(0);
        return;
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        this.mStartTime = -1;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new ContentLoadingProgressBar$$ExternalSyntheticLambda0(this);
        this.mDelayedShow = new ContentLoadingProgressBar$$ExternalSyntheticLambda1(this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    public void hide() {
        post(new ContentLoadingProgressBar$$ExternalSyntheticLambda3(this));
    }

    private void hideOnUiThread() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        this.mPostedShow = false;
        long diff = System.currentTimeMillis() - this.mStartTime;
        if (diff < 500) goto L5;
    L10:
        setVisibility(8);
        return;
    L5:
        if (this.mStartTime == (-1)) goto L10;
        if (this.mPostedHide == true) goto L12;
        postDelayed(this.mDelayedHide, 500 - diff);
        this.mPostedHide = true;
        return;
    }

    public void show() {
        post(new ContentLoadingProgressBar$$ExternalSyntheticLambda2(this));
    }

    private void showOnUiThread() {
        this.mStartTime = -1;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        this.mPostedHide = false;
        if (this.mPostedShow == true) goto L6;
        postDelayed(this.mDelayedShow, 500);
        this.mPostedShow = true;
        return;
    }
}
