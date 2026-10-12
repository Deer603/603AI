package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowInsetsAnimationCompat {
    private static final boolean DEBUG = false;
    private static final String TAG = "WindowInsetsAnimCompat";
    private Impl mImpl;

    public static final class BoundsCompat {
        private final Insets mLowerBound;
        private final Insets mUpperBound;

        public BoundsCompat(Insets lowerBound, Insets upperBound) {
            this.mLowerBound = lowerBound;
            this.mUpperBound = upperBound;
        }

        private BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.mLowerBound = Impl30.getLowerBounds(bounds);
            this.mUpperBound = Impl30.getHigherBounds(bounds);
        }

        public Insets getLowerBound() {
            return this.mLowerBound;
        }

        public Insets getUpperBound() {
            return this.mUpperBound;
        }

        public BoundsCompat inset(Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.insetInsets(this.mLowerBound, insets.left, insets.top, insets.right, insets.bottom), WindowInsetsCompat.insetInsets(this.mUpperBound, insets.left, insets.top, insets.right, insets.bottom));
        }

        public String toString() {
            return "Bounds{lower=" + this.mLowerBound + " upper=" + this.mUpperBound + "}";
        }

        public WindowInsetsAnimation.Bounds toBounds() {
            return Impl30.createPlatformBounds(this);
        }

        public static BoundsCompat toBoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }
    }

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsetsCompat mDispachedInsets;
        private final int mDispatchMode;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat r1, List<WindowInsetsAnimationCompat> r2);

        public Callback(int dispatchMode) {
            this.mDispatchMode = dispatchMode;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onPrepare(WindowInsetsAnimationCompat animation) {
        }

        public BoundsCompat onStart(WindowInsetsAnimationCompat animation, BoundsCompat bounds) {
            return bounds;
        }

        public void onEnd(WindowInsetsAnimationCompat animation) {
        }
    }

    private static class Impl {
        private float mAlpha;
        private final long mDurationMillis;
        private float mFraction;
        private final Interpolator mInterpolator;
        private final int mTypeMask;

        Impl(int typeMask, Interpolator interpolator, long durationMillis) {
            this.mAlpha = 1.0f;
            this.mTypeMask = typeMask;
            this.mInterpolator = interpolator;
            this.mDurationMillis = durationMillis;
        }

        public int getTypeMask() {
            return this.mTypeMask;
        }

        public float getFraction() {
            return this.mFraction;
        }

        public float getInterpolatedFraction() {
            if (this.mInterpolator == null) goto L7;
            return this.mInterpolator.getInterpolation(this.mFraction);
        L7:
            return this.mFraction;
        }

        public Interpolator getInterpolator() {
            return this.mInterpolator;
        }

        public long getDurationMillis() {
            return this.mDurationMillis;
        }

        public float getAlpha() {
            return this.mAlpha;
        }

        public void setFraction(float fraction) {
            this.mFraction = fraction;
        }

        public void setAlpha(float alpha) {
            this.mAlpha = alpha;
        }
    }

    private static class Impl21 extends Impl {
        private static final Interpolator HIDE_IME_INTERPOLATOR = null;
        private static final Interpolator HIDE_SYSTEM_BAR_INTERPOLATOR = null;
        private static final Interpolator SHOW_IME_INTERPOLATOR = null;
        private static final Interpolator SHOW_SYSTEM_BAR_INTERPOLATOR = null;

        private static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
            private static final int COMPAT_ANIMATION_DURATION_IME = 160;
            private static final int COMPAT_ANIMATION_DURATION_SYSTEM_BAR = 250;
            final Callback mCallback;
            private WindowInsetsCompat mLastInsets;

            Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                this.mCallback = callback;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                if (rootWindowInsets == null) goto L5;
                WindowInsetsCompat r1 = new WindowInsetsCompat.Builder(rootWindowInsets).build();
            L6:
                this.mLastInsets = r1;
                return;
            L5:
                r1 = null;
                goto L6
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(final View v, WindowInsets insets) {
                if (v.isLaidOut() == true) goto L6;
                this.mLastInsets = WindowInsetsCompat.toWindowInsetsCompat(insets, v);
                return Impl21.forwardToViewIfNeeded(v, insets);
            L6:
                final WindowInsetsCompat targetInsets = WindowInsetsCompat.toWindowInsetsCompat(insets, v);
                if (this.mLastInsets != null) goto L10;
                this.mLastInsets = ViewCompat.getRootWindowInsets(v);
            L10:
                if (this.mLastInsets != null) goto L13;
                this.mLastInsets = targetInsets;
                return Impl21.forwardToViewIfNeeded(v, insets);
            L13:
                Callback callback = Impl21.getCallback(v);
                if (callback != null) goto L16;
            L19:
                int[] showingTypes = new int[1];
                int[] hidingTypes = new int[1];
                Impl21.buildAnimationMask(targetInsets, this.mLastInsets, showingTypes, hidingTypes);
                int r4 = showingTypes[0];
                final int animationMask = hidingTypes[0] | r4;
                if (animationMask != 0) goto L23;
                this.mLastInsets = targetInsets;
                return Impl21.forwardToViewIfNeeded(v, insets);
            L23:
                final WindowInsetsCompat startingInsets = this.mLastInsets;
                Interpolator interpolator = Impl21.createInsetInterpolator(showingTypes[0], hidingTypes[0]);
                if ((WindowInsetsCompat.Type.ime() & animationMask) == 0) goto L26;
                long r12 = 160;
            L27:
                final WindowInsetsAnimationCompat anim = new WindowInsetsAnimationCompat(animationMask, interpolator, r12);
                anim.setFraction(0.0f);
                final ValueAnimator animator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(anim.getDurationMillis());
                final BoundsCompat animationBounds = Impl21.computeAnimationBounds(targetInsets, startingInsets, animationMask);
                Impl21.dispatchOnPrepare(v, anim, targetInsets, false);
                animator.addUpdateListener(new AnonymousClass1(this, anim, targetInsets, startingInsets, animationMask, v));
                animator.addListener(new AnonymousClass2(this, anim, v));
                OneShotPreDrawListener.add(v, new AnonymousClass3(this, v, anim, animationBounds, animator));
                this.mLastInsets = targetInsets;
                return Impl21.forwardToViewIfNeeded(v, insets);
            L26:
                r12 = 250;
                goto L27
            L16:
                if (Objects.equals(callback.mDispachedInsets, targetInsets) == false) goto L19;
                return Impl21.forwardToViewIfNeeded(v, insets);
            }
        }

        static {
            SHOW_IME_INTERPOLATOR = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
            HIDE_IME_INTERPOLATOR = new FastOutLinearInInterpolator();
            SHOW_SYSTEM_BAR_INTERPOLATOR = new DecelerateInterpolator(1.5f);
            HIDE_SYSTEM_BAR_INTERPOLATOR = new AccelerateInterpolator(1.5f);
        }

        Impl21(int typeMask, Interpolator interpolator, long durationMillis) {
            super(typeMask, interpolator, durationMillis);
        }

        static void setCallback(View view, Callback callback) {
            if (callback == null) goto L4;
            View.OnApplyWindowInsetsListener proxyListener = createProxyListener(view, callback);
        L5:
            view.setTag(R.id.tag_window_insets_animation_callback, proxyListener);
            if (view.getTag(R.id.tag_compat_insets_dispatch) == null) goto L8;
            return;
        L8:
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) goto L12;
            view.setOnApplyWindowInsetsListener(proxyListener);
            return;
        L12:
            return;
        L4:
            proxyListener = null;
            goto L5
        }

        private static View.OnApplyWindowInsetsListener createProxyListener(View view, Callback callback) {
            return new Impl21OnApplyWindowInsetsListener(view, callback);
        }

        static BoundsCompat computeAnimationBounds(WindowInsetsCompat targetInsets, WindowInsetsCompat startingInsets, int mask) {
            Insets targetInsetsInsets = targetInsets.getInsets(mask);
            Insets startingInsetsInsets = startingInsets.getInsets(mask);
            Insets lowerBound = Insets.of(Math.min(targetInsetsInsets.left, startingInsetsInsets.left), Math.min(targetInsetsInsets.top, startingInsetsInsets.top), Math.min(targetInsetsInsets.right, startingInsetsInsets.right), Math.min(targetInsetsInsets.bottom, startingInsetsInsets.bottom));
            Insets upperBound = Insets.of(Math.max(targetInsetsInsets.left, startingInsetsInsets.left), Math.max(targetInsetsInsets.top, startingInsetsInsets.top), Math.max(targetInsetsInsets.right, startingInsetsInsets.right), Math.max(targetInsetsInsets.bottom, startingInsetsInsets.bottom));
            return new BoundsCompat(lowerBound, upperBound);
        }

        static void buildAnimationMask(WindowInsetsCompat targetInsets, WindowInsetsCompat currentInsets, int[] showingTypes, int[] hidingTypes) {
            int i = 1;
        L4:
            if (i > 512) goto L31;
            Insets target = targetInsets.getInsets(i);
            Insets current = currentInsets.getInsets(i);
            boolean hiding = true;
            if (target.left <= current.left) goto L8;
        L15:
            boolean showing = true;
        L17:
            if (target.left >= current.left) goto L19;
        L26:
            if (showing == hiding) goto L30;
            if (showing == false) goto L29;
            showingTypes[0] = showingTypes[0] | i;
            goto L30
        L29:
            hidingTypes[0] = hidingTypes[0] | i;
        L30:
            i = i << 1;
            goto L4
        L19:
            if (target.top < current.top) goto L26;
            if (target.right < current.right) goto L26;
            if (target.bottom < current.bottom) goto L26;
            hiding = false;
            goto L26
        L8:
            if (target.top > current.top) goto L15;
            if (target.right > current.right) goto L15;
            if (target.bottom > current.bottom) goto L15;
            showing = false;
            goto L17
        }

        static Interpolator createInsetInterpolator(int showingTypes, int hidingTypes) {
            if ((WindowInsetsCompat.Type.ime() & showingTypes) == 0) goto L7;
            return SHOW_IME_INTERPOLATOR;
        L7:
            if ((WindowInsetsCompat.Type.ime() & hidingTypes) == 0) goto L11;
            return HIDE_IME_INTERPOLATOR;
        L11:
            if ((WindowInsetsCompat.Type.systemBars() & showingTypes) == 0) goto L15;
            return SHOW_SYSTEM_BAR_INTERPOLATOR;
        L15:
            if ((WindowInsetsCompat.Type.systemBars() & hidingTypes) != 0) goto L17;
            return null;
        L17:
            return HIDE_SYSTEM_BAR_INTERPOLATOR;
        }

        static WindowInsetsCompat interpolateInsets(WindowInsetsCompat target, WindowInsetsCompat starting, float fraction, int typeMask) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(target);
            int i = 1;
        L4:
            if (i > 512) goto L11;
            if ((typeMask & i) != 0) goto L8;
            builder.setInsets(i, target.getInsets(i));
        L9:
            i = i << 1;
            goto L4
        L8:
            Insets targetInsets = target.getInsets(i);
            Insets startingInsets = starting.getInsets(i);
            Insets interpolatedInsets = WindowInsetsCompat.insetInsets(targetInsets, (int) (((double) ((targetInsets.left - startingInsets.left) * (1.0f - fraction))) + 0.5d), (int) (((double) ((targetInsets.top - startingInsets.top) * (1.0f - fraction))) + 0.5d), (int) (((double) ((targetInsets.right - startingInsets.right) * (1.0f - fraction))) + 0.5d), (int) (((double) ((targetInsets.bottom - startingInsets.bottom) * (1.0f - fraction))) + 0.5d));
            builder.setInsets(i, interpolatedInsets);
            goto L9
        L11:
            return builder.build();
        }

        static WindowInsets forwardToViewIfNeeded(View v, WindowInsets insets) {
            if (v.getTag(R.id.tag_on_apply_window_listener) == null) goto L6;
            return insets;
        L6:
            return v.onApplyWindowInsets(insets);
        }

        static void dispatchOnPrepare(View v, WindowInsetsAnimationCompat anim, WindowInsetsCompat insets, boolean stopDispatch) {
            Callback callback = getCallback(v);
            if (callback == null) goto L12;
            callback.mDispachedInsets = insets;
            if (stopDispatch == true) goto L12;
            callback.onPrepare(anim);
            if (callback.getDispatchMode() != 0) goto L9;
            boolean r1 = true;
        L10:
            stopDispatch = r1;
            goto L12
        L9:
            r1 = false;
        L12:
            if ((v instanceof ViewGroup) == false) goto L17;
            ViewGroup viewGroup = (ViewGroup) v;
            int i = 0;
        L15:
            if (i >= viewGroup.getChildCount()) goto L19;
            View child = viewGroup.getChildAt(i);
            dispatchOnPrepare(child, anim, insets, stopDispatch);
            i = i + 1;
            goto L15
        L19:
            return;
        }

        static void dispatchOnStart(View v, WindowInsetsAnimationCompat anim, BoundsCompat animationBounds) {
            Callback callback = getCallback(v);
            if (callback == null) goto L8;
            callback.onStart(anim, animationBounds);
            if (callback.getDispatchMode() != 0) goto L8;
            return;
        L8:
            if ((v instanceof ViewGroup) == false) goto L13;
            ViewGroup viewGroup = (ViewGroup) v;
            int i = 0;
        L11:
            if (i >= viewGroup.getChildCount()) goto L15;
            View child = viewGroup.getChildAt(i);
            dispatchOnStart(child, anim, animationBounds);
            i = i + 1;
            goto L11
        L15:
            return;
        }

        static void dispatchOnProgress(View v, WindowInsetsCompat interpolateInsets, List<WindowInsetsAnimationCompat> runningAnimations) {
            Callback callback = getCallback(v);
            WindowInsetsCompat insets = interpolateInsets;
            if (callback == null) goto L8;
            insets = callback.onProgress(insets, runningAnimations);
            if (callback.getDispatchMode() != 0) goto L8;
            return;
        L8:
            if ((v instanceof ViewGroup) == false) goto L13;
            ViewGroup viewGroup = (ViewGroup) v;
            int i = 0;
        L11:
            if (i >= viewGroup.getChildCount()) goto L15;
            View child = viewGroup.getChildAt(i);
            dispatchOnProgress(child, insets, runningAnimations);
            i = i + 1;
            goto L11
        L15:
            return;
        }

        static void dispatchOnEnd(View v, WindowInsetsAnimationCompat anim) {
            Callback callback = getCallback(v);
            if (callback == null) goto L8;
            callback.onEnd(anim);
            if (callback.getDispatchMode() != 0) goto L8;
            return;
        L8:
            if ((v instanceof ViewGroup) == false) goto L13;
            ViewGroup viewGroup = (ViewGroup) v;
            int i = 0;
        L11:
            if (i >= viewGroup.getChildCount()) goto L15;
            View child = viewGroup.getChildAt(i);
            dispatchOnEnd(child, anim);
            i = i + 1;
            goto L11
        L15:
            return;
        }

        static Callback getCallback(View child) {
            Object listener = child.getTag(R.id.tag_window_insets_animation_callback);
            if ((listener instanceof Impl21OnApplyWindowInsetsListener) == false) goto L6;
            Callback callback = ((Impl21OnApplyWindowInsetsListener) listener).mCallback;
            return callback;
        L6:
            return null;
        }
    }

    private static class Impl30 extends Impl {
        private final WindowInsetsAnimation mWrapped;

        private static class ProxyCallback extends WindowInsetsAnimation$Callback {
            private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations;
            private final Callback mCompat;
            private List<WindowInsetsAnimationCompat> mRORunningAnimations;
            private ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;

            ProxyCallback(Callback compat) {
                super(compat.getDispatchMode());
                this.mAnimations = new HashMap();
                this.mCompat = compat;
            }

            private WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(WindowInsetsAnimation animation) {
                WindowInsetsAnimationCompat animationCompat = this.mAnimations.get(animation);
                if (animationCompat != null) goto L6;
                WindowInsetsAnimationCompat animationCompat2 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(animation);
                this.mAnimations.put(animation, animationCompat2);
                return animationCompat2;
            L6:
                return animationCompat;
            }

            public void onPrepare(WindowInsetsAnimation animation) {
                this.mCompat.onPrepare(getWindowInsetsAnimationCompat(animation));
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation animation, WindowInsetsAnimation.Bounds bounds) {
                return this.mCompat.onStart(getWindowInsetsAnimationCompat(animation), BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }

            public WindowInsets onProgress(WindowInsets insets, List<WindowInsetsAnimation> runningAnimations) {
                if (this.mTmpRunningAnimations != null) goto L5;
                this.mTmpRunningAnimations = new ArrayList(runningAnimations.size());
                this.mRORunningAnimations = Collections.unmodifiableList(this.mTmpRunningAnimations);
            L6:
                int i = runningAnimations.size() - 1;
            L7:
                if (i < 0) goto L10;
                WindowInsetsAnimation animation = runningAnimations.get(i);
                WindowInsetsAnimationCompat animationCompat = getWindowInsetsAnimationCompat(animation);
                animationCompat.setFraction(animation.getFraction());
                this.mTmpRunningAnimations.add(animationCompat);
                i = i - 1;
                goto L7
            L10:
                return this.mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(insets), this.mRORunningAnimations).toWindowInsets();
            L5:
                this.mTmpRunningAnimations.clear();
                goto L6
            }

            public void onEnd(WindowInsetsAnimation animation) {
                this.mCompat.onEnd(getWindowInsetsAnimationCompat(animation));
                this.mAnimations.remove(animation);
            }
        }

        Impl30(WindowInsetsAnimation wrapped) {
            super(0, null, 0);
            this.mWrapped = wrapped;
        }

        Impl30(int typeMask, Interpolator interpolator, long durationMillis) {
            this(new WindowInsetsAnimation(typeMask, interpolator, durationMillis));
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
            return this.mWrapped.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public Interpolator getInterpolator() {
            return this.mWrapped.getInterpolator();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
            return this.mWrapped.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
            return this.mWrapped.getFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float fraction) {
            this.mWrapped.setFraction(fraction);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
            return this.mWrapped.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getAlpha() {
            return this.mWrapped.getAlpha();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setAlpha(float alpha) {
            this.mWrapped.setAlpha(alpha);
        }

        public static void setCallback(View view, Callback callback) {
            if (callback == null) goto L4;
            WindowInsetsAnimation$Callback platformCallback = new ProxyCallback(callback);
        L5:
            view.setWindowInsetsAnimationCallback(platformCallback);
            return;
        L4:
            platformCallback = null;
            goto L5
        }

        public static WindowInsetsAnimation.Bounds createPlatformBounds(BoundsCompat bounds) {
            return new WindowInsetsAnimation.Bounds(bounds.getLowerBound().toPlatformInsets(), bounds.getUpperBound().toPlatformInsets());
        }

        public static Insets getLowerBounds(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getLowerBound());
        }

        public static Insets getHigherBounds(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getUpperBound());
        }
    }

    public WindowInsetsAnimationCompat(int typeMask, Interpolator interpolator, long durationMillis) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        this.mImpl = new Impl30(typeMask, interpolator, durationMillis);
        return;
    L5:
        this.mImpl = new Impl21(typeMask, interpolator, durationMillis);
    }

    private WindowInsetsAnimationCompat(WindowInsetsAnimation animation) {
        this(0, null, 0);
        if (Build.VERSION.SDK_INT < 30) goto L6;
        this.mImpl = new Impl30(animation);
        return;
    }

    public int getTypeMask() {
        return this.mImpl.getTypeMask();
    }

    public float getFraction() {
        return this.mImpl.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.mImpl.getInterpolatedFraction();
    }

    public Interpolator getInterpolator() {
        return this.mImpl.getInterpolator();
    }

    public long getDurationMillis() {
        return this.mImpl.getDurationMillis();
    }

    public void setFraction(float fraction) {
        this.mImpl.setFraction(fraction);
    }

    public float getAlpha() {
        return this.mImpl.getAlpha();
    }

    public void setAlpha(float alpha) {
        this.mImpl.setAlpha(alpha);
    }

    static WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    static void setCallback(View view, Callback callback) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        Impl30.setCallback(view, callback);
        return;
    L5:
        Impl21.setCallback(view, callback);
    }
}
