package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat CONSUMED = null;
    private static final String TAG = "WindowInsetsCompat";
    private final Impl mImpl;

    static class Api21ReflectionHolder {
        private static Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static Field sStableInsets;
        private static Field sViewAttachInfoField;

        private Api21ReflectionHolder() {
        }

        static {
            sViewAttachInfoField = View.class.getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L4
            sViewAttachInfoField.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
            Class<?> sAttachInfoClass = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L4
            sStableInsets = sAttachInfoClass.getDeclaredField("mStableInsets");     // Catch: ReflectiveOperationException -> L4
            sStableInsets.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
            sContentInsets = sAttachInfoClass.getDeclaredField("mContentInsets");     // Catch: ReflectiveOperationException -> L4
            sContentInsets.setAccessible(true);     // Catch: ReflectiveOperationException -> L4
            sReflectionSucceeded = true;     // Catch: ReflectiveOperationException -> L4
            return;
        L4:
            e = move-exception;
            Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }

        public static WindowInsetsCompat getRootWindowInsets(View v) {
            if (sReflectionSucceeded == true) goto L5;
        L19:
            return null;
        L5:
            if (v.isAttachedToWindow() == false) goto L19;
            View rootView = v.getRootView();
            Object attachInfo = sViewAttachInfoField.get(rootView);     // Catch: IllegalAccessException -> L16
            if (attachInfo == null) goto L18;
            Rect stableInsets = (Rect) sStableInsets.get(attachInfo);     // Catch: IllegalAccessException -> L16
            Rect visibleInsets = (Rect) sContentInsets.get(attachInfo);     // Catch: IllegalAccessException -> L16
            if (stableInsets == null) goto L18;
            if (visibleInsets == null) goto L18;
            WindowInsetsCompat insets = new Builder().setStableInsets(Insets.of(stableInsets)).setSystemWindowInsets(Insets.of(visibleInsets)).build();     // Catch: IllegalAccessException -> L16
            insets.setRootWindowInsets(insets);     // Catch: IllegalAccessException -> L16
            insets.copyRootViewBounds(v.getRootView());     // Catch: IllegalAccessException -> L16
            return insets;
        L18:
            return null;
        L16:
            e = move-exception;
            Log.w(WindowInsetsCompat.TAG, "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            goto L18
        }
    }

    public static final class Builder {
        private final BuilderImpl mImpl;

        public Builder() {
            if (Build.VERSION.SDK_INT < 34) goto L6;
            this.mImpl = new BuilderImpl34();
            return;
        L6:
            if (Build.VERSION.SDK_INT < 30) goto L9;
            this.mImpl = new BuilderImpl30();
            return;
        L9:
            if (Build.VERSION.SDK_INT < 29) goto L11;
            this.mImpl = new BuilderImpl29();
            return;
        L11:
            this.mImpl = new BuilderImpl20();
        }

        public Builder(WindowInsetsCompat insets) {
            if (Build.VERSION.SDK_INT < 34) goto L6;
            this.mImpl = new BuilderImpl34(insets);
            return;
        L6:
            if (Build.VERSION.SDK_INT < 30) goto L9;
            this.mImpl = new BuilderImpl30(insets);
            return;
        L9:
            if (Build.VERSION.SDK_INT < 29) goto L11;
            this.mImpl = new BuilderImpl29(insets);
            return;
        L11:
            this.mImpl = new BuilderImpl20(insets);
        }

        @Deprecated
        public Builder setSystemWindowInsets(Insets insets) {
            this.mImpl.setSystemWindowInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemGestureInsets(Insets insets) {
            this.mImpl.setSystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setMandatorySystemGestureInsets(Insets insets) {
            this.mImpl.setMandatorySystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setTappableElementInsets(Insets insets) {
            this.mImpl.setTappableElementInsets(insets);
            return this;
        }

        public Builder setInsets(int typeMask, Insets insets) {
            this.mImpl.setInsets(typeMask, insets);
            return this;
        }

        public Builder setInsetsIgnoringVisibility(int typeMask, Insets insets) {
            this.mImpl.setInsetsIgnoringVisibility(typeMask, insets);
            return this;
        }

        public Builder setVisible(int typeMask, boolean visible) {
            this.mImpl.setVisible(typeMask, visible);
            return this;
        }

        @Deprecated
        public Builder setStableInsets(Insets insets) {
            this.mImpl.setStableInsets(insets);
            return this;
        }

        public Builder setDisplayCutout(DisplayCutoutCompat displayCutout) {
            this.mImpl.setDisplayCutout(displayCutout);
            return this;
        }

        public WindowInsetsCompat build() {
            return this.mImpl.build();
        }
    }

    private static class BuilderImpl {
        private final WindowInsetsCompat mInsets;
        Insets[] mInsetsTypeMask;

        BuilderImpl() {
            WindowInsetsCompat r2 = (WindowInsetsCompat) null;
            this(new WindowInsetsCompat(null));
        }

        BuilderImpl(WindowInsetsCompat insets) {
            this.mInsets = insets;
        }

        void setSystemWindowInsets(Insets insets) {
        }

        void setSystemGestureInsets(Insets insets) {
        }

        void setMandatorySystemGestureInsets(Insets insets) {
        }

        void setTappableElementInsets(Insets insets) {
        }

        void setStableInsets(Insets insets) {
        }

        void setDisplayCutout(DisplayCutoutCompat displayCutout) {
        }

        void setInsets(int typeMask, Insets insets) {
            if (this.mInsetsTypeMask != null) goto L5;
            this.mInsetsTypeMask = new Insets[10];
        L5:
            int i = 1;
        L7:
            if (i > 512) goto L13;
            if ((typeMask & i) == 0) goto L12;
            this.mInsetsTypeMask[Type.indexOf(i)] = insets;
        L12:
            i = i << 1;
            goto L7
        }

        void setInsetsIgnoringVisibility(int typeMask, Insets insets) {
            if (typeMask == 8) goto L6;
            return;
        L6:
            throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
        }

        void setVisible(int typeMask, boolean visible) {
        }

        protected final void applyInsetTypes() {
            if (this.mInsetsTypeMask == null) goto L19;
            Insets statusBars = this.mInsetsTypeMask[Type.indexOf(1)];
            Insets navigationBars = this.mInsetsTypeMask[Type.indexOf(2)];
            if (navigationBars != null) goto L7;
            navigationBars = this.mInsets.getInsets(2);
        L7:
            if (statusBars != null) goto L9;
            statusBars = this.mInsets.getInsets(1);
        L9:
            setSystemWindowInsets(Insets.max(statusBars, navigationBars));
            Insets i = this.mInsetsTypeMask[Type.indexOf(16)];
            if (i == null) goto L12;
            setSystemGestureInsets(i);
        L12:
            Insets i2 = this.mInsetsTypeMask[Type.indexOf(32)];
            if (i2 == null) goto L15;
            setMandatorySystemGestureInsets(i2);
        L15:
            Insets i3 = this.mInsetsTypeMask[Type.indexOf(64)];
            if (i3 == null) goto L20;
            setTappableElementInsets(i3);
            return;
        L20:
            return;
        }

        WindowInsetsCompat build() {
            applyInsetTypes();
            return this.mInsets;
        }
    }

    private static class BuilderImpl20 extends BuilderImpl {
        private static Constructor<WindowInsets> sConstructor;
        private static boolean sConstructorFetched;
        private static Field sConsumedField;
        private static boolean sConsumedFieldFetched;
        private WindowInsets mPlatformInsets;
        private Insets mStableInsets;

        static {
            sConsumedFieldFetched = false;
            sConstructorFetched = false;
        }

        BuilderImpl20() {
            this.mPlatformInsets = createWindowInsetsInstance();
        }

        BuilderImpl20(WindowInsetsCompat insets) {
            super(insets);
            this.mPlatformInsets = insets.toWindowInsets();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(Insets insets) {
            if (this.mPlatformInsets == null) goto L6;
            this.mPlatformInsets = this.mPlatformInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            return;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(Insets insets) {
            this.mStableInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setStableInsets(this.mStableInsets);
            return windowInsetsCompat;
        }

        private static WindowInsets createWindowInsetsInstance() {
            if (sConsumedFieldFetched == true) goto L10;
            sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");     // Catch: ReflectiveOperationException -> L6
        L8:
            sConsumedFieldFetched = true;
        L6:
            e = move-exception;
            Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets.CONSUMED field", e);
        L10:
            if (sConsumedField == null) goto L19;
            WindowInsets consumed = (WindowInsets) sConsumedField.get(null);     // Catch: ReflectiveOperationException -> L16
            if (consumed == null) goto L19;
            return new WindowInsets(consumed);
        L16:
            e = move-exception;
            Log.i(WindowInsetsCompat.TAG, "Could not get value from WindowInsets.CONSUMED field", e);
        L19:
            if (sConstructorFetched == true) goto L26;
            sConstructor = WindowInsets.class.getConstructor(new Class[]{Rect.class});     // Catch: ReflectiveOperationException -> L22
        L24:
            sConstructorFetched = true;
        L22:
            e = move-exception;
            Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets(Rect) constructor", e);
        L26:
            if (sConstructor != null) goto L38;
        L31:
            return null;
        L38:
            return sConstructor.newInstance(new Object[]{new Rect()});
        L29:
            e = move-exception;
            Log.i(WindowInsetsCompat.TAG, "Could not invoke WindowInsets(Rect) constructor", e);
            goto L31
        }
    }

    private static class BuilderImpl29 extends BuilderImpl {
        final WindowInsets.Builder mPlatBuilder;

        BuilderImpl29() {
            this.mPlatBuilder = new WindowInsets.Builder();
        }

        BuilderImpl29(WindowInsetsCompat insets) {
            super(insets);
            WindowInsets platInsets = insets.toWindowInsets();
            if (platInsets == null) goto L5;
            WindowInsets.Builder r1 = new WindowInsets.Builder(platInsets);
        L6:
            this.mPlatBuilder = r1;
            return;
        L5:
            r1 = new WindowInsets.Builder();
            goto L6
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(Insets insets) {
            this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setMandatorySystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setTappableElementInsets(Insets insets) {
            this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(Insets insets) {
            this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayCutout(DisplayCutoutCompat displayCutout) {
            WindowInsets.Builder r0 = this.mPlatBuilder;
            if (displayCutout == null) goto L5;
            DisplayCutout r1 = displayCutout.unwrap();
        L6:
            r0.setDisplayCutout(r1);
            return;
        L5:
            r1 = null;
            goto L6
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatBuilder.build());
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            return windowInsetsCompat;
        }
    }

    private static class BuilderImpl30 extends BuilderImpl29 {
        BuilderImpl30() {
        }

        BuilderImpl30(WindowInsetsCompat insets) {
            super(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int typeMask, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl30.toPlatformType(typeMask), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int typeMask, Insets insets) {
            this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl30.toPlatformType(typeMask), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int typeMask, boolean visible) {
            this.mPlatBuilder.setVisible(TypeImpl30.toPlatformType(typeMask), visible);
        }
    }

    private static class BuilderImpl34 extends BuilderImpl30 {
        BuilderImpl34() {
        }

        BuilderImpl34(WindowInsetsCompat insets) {
            super(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int typeMask, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl34.toPlatformType(typeMask), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int typeMask, Insets insets) {
            this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl34.toPlatformType(typeMask), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int typeMask, boolean visible) {
            this.mPlatBuilder.setVisible(TypeImpl34.toPlatformType(typeMask), visible);
        }
    }

    private static class Impl {
        static final WindowInsetsCompat CONSUMED = null;
        final WindowInsetsCompat mHost;

        static {
            CONSUMED = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        }

        Impl(WindowInsetsCompat host) {
            this.mHost = host;
        }

        boolean isRound() {
            return false;
        }

        boolean isConsumed() {
            return false;
        }

        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        DisplayCutoutCompat getDisplayCutout() {
            return null;
        }

        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        Insets getSystemWindowInsets() {
            return Insets.NONE;
        }

        Insets getStableInsets() {
            return Insets.NONE;
        }

        Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        WindowInsetsCompat inset(int left, int top, int right, int bottom) {
            return CONSUMED;
        }

        Insets getInsets(int typeMask) {
            return Insets.NONE;
        }

        Insets getInsetsIgnoringVisibility(int typeMask) {
            if ((typeMask & 8) != 0) goto L7;
            return Insets.NONE;
        L7:
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        boolean isVisible(int typeMask) {
            return true;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if ((o instanceof Impl) == true) goto L8;
            return false;
        L8:
            Impl impl = (Impl) o;
            if (isRound() != impl.isRound()) goto L20;
            if (isConsumed() != impl.isConsumed()) goto L20;
            if (ObjectsCompat.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) == false) goto L20;
            if (ObjectsCompat.equals(getStableInsets(), impl.getStableInsets()) == false) goto L20;
            if (ObjectsCompat.equals(getDisplayCutout(), impl.getDisplayCutout()) == false) goto L20;
            return true;
        L20:
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout()});
        }

        void setRootWindowInsets(WindowInsetsCompat rootWindowInsets) {
        }

        void setRootViewData(Insets visibleInsets) {
        }

        void copyRootViewBounds(View rootView) {
        }

        void setSystemUiVisibility(int systemUiVisibility) {
        }

        void copyWindowDataInto(WindowInsetsCompat other) {
        }

        public void setOverriddenInsets(Insets[] insetsTypeMask) {
        }

        public void setStableInsets(Insets stableInsets) {
        }
    }

    private static class Impl20 extends Impl {
        private static final int SYSTEM_BAR_VISIBILITY_MASK = 6;
        private static Class<?> sAttachInfoClass;
        private static Field sAttachInfoField;
        private static Method sGetViewRootImplMethod;
        private static Field sVisibleInsetsField;
        private static boolean sVisibleRectReflectionFetched;
        private Insets[] mOverriddenInsets;
        final WindowInsets mPlatformInsets;
        Insets mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        int mSystemUiVisibility;
        private Insets mSystemWindowInsets;

        static {
            sVisibleRectReflectionFetched = false;
        }

        Impl20(WindowInsetsCompat host, WindowInsets insets) {
            super(host);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = insets;
        }

        Impl20(WindowInsetsCompat host, Impl20 other) {
            this(host, new WindowInsets(other.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int typeMask) {
            return getInsets(typeMask, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int typeMask) {
            return getInsets(typeMask, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int typeMask) {
            int i = 1;
        L4:
            if (i > 512) goto L13;
            if ((typeMask & i) == 0) goto L12;
            if (isTypeVisible(i) == true) goto L12;
            return false;
        L12:
            i = i << 1;
            goto L4
        L13:
            return true;
        }

        private Insets getInsets(int typeMask, boolean ignoreVisibility) {
            Insets result = Insets.NONE;
            int i = 1;
        L4:
            if (i > 512) goto L10;
            if ((typeMask & i) == 0) goto L9;
            result = Insets.max(result, getInsetsForType(i, ignoreVisibility));
        L9:
            i = i << 1;
            goto L4
        L10:
            return result;
        }

        protected Insets getInsetsForType(int type, boolean ignoreVisibility) {
            Insets overriddenInsets = null;
            switch(type) {
                case 1: goto L58;
                case 2: goto L42;
                case 8: goto L23;
                case 16: goto L21;
                case 32: goto L19;
                case 64: goto L17;
                case 128: goto L7;
                default: goto L5;
            };
        L42:
            if (ignoreVisibility == false) goto L46;
            Insets rootStable = getRootStableInsets();
            Insets stable = getStableInsets();
            return Insets.of(Math.max(rootStable.left, stable.left), 0, Math.max(rootStable.right, stable.right), Math.max(rootStable.bottom, stable.bottom));
        L46:
            if ((this.mSystemUiVisibility & 2) != 0) goto L48;
            Insets systemWindow = getSystemWindowInsets();
            if (this.mRootWindowInsets == null) goto L53;
            overriddenInsets = this.mRootWindowInsets.getStableInsets();
        L53:
            int bottom = systemWindow.bottom;
            if (overriddenInsets == null) goto L57;
            bottom = Math.min(bottom, overriddenInsets.bottom);
        L57:
            return Insets.of(systemWindow.left, 0, systemWindow.right, bottom);
        L48:
            return Insets.NONE;
        L58:
            if (ignoreVisibility == false) goto L62;
            return Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
        L62:
            if ((this.mSystemUiVisibility & 4) == 0) goto L66;
            return Insets.NONE;
        L66:
            return Insets.of(0, getSystemWindowInsets().top, 0, 0);
        L5:
            return Insets.NONE;
        L7:
            if (this.mRootWindowInsets == null) goto L9;
            DisplayCutoutCompat cutout = this.mRootWindowInsets.getDisplayCutout();
        L11:
            if (cutout == null) goto L15;
            return Insets.of(cutout.getSafeInsetLeft(), cutout.getSafeInsetTop(), cutout.getSafeInsetRight(), cutout.getSafeInsetBottom());
        L15:
            return Insets.NONE;
        L9:
            cutout = getDisplayCutout();
            goto L11
        L17:
            return getTappableElementInsets();
        L19:
            return getMandatorySystemGestureInsets();
        L21:
            return getSystemGestureInsets();
        L23:
            if (this.mOverriddenInsets == null) goto L26;
            overriddenInsets = this.mOverriddenInsets[Type.indexOf(8)];
        L26:
            if (overriddenInsets == null) goto L28;
            return overriddenInsets;
        L28:
            Insets systemWindow2 = getSystemWindowInsets();
            Insets rootStable2 = getRootStableInsets();
            if (systemWindow2.bottom <= rootStable2.bottom) goto L33;
            return Insets.of(0, 0, 0, systemWindow2.bottom);
        L33:
            if (this.mRootViewVisibleInsets == null) goto L41;
            if (this.mRootViewVisibleInsets.equals(Insets.NONE) == true) goto L41;
            if (this.mRootViewVisibleInsets.bottom <= rootStable2.bottom) goto L41;
            return Insets.of(0, 0, 0, this.mRootViewVisibleInsets.bottom);
        L41:
            return Insets.NONE;
        }

        protected boolean isTypeVisible(int type) {
            switch(type) {
                case 1: goto L7;
                case 2: goto L7;
                case 4: goto L5;
                case 8: goto L7;
                case 128: goto L7;
                default: goto L4;
            };
        L4:
            return true;
        L5:
            return false;
        L7:
            return true ^ getInsetsForType(type, false).equals(Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final Insets getSystemWindowInsets() {
            if (this.mSystemWindowInsets != null) goto L6;
            this.mSystemWindowInsets = Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
        L6:
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int left, int top, int right, int bottom) {
            Builder b = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            b.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), left, top, right, bottom));
            b.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), left, top, right, bottom));
            return b.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(WindowInsetsCompat other) {
            other.setRootWindowInsets(this.mRootWindowInsets);
            other.setRootViewData(this.mRootViewVisibleInsets);
            other.setSystemUiVisibility(this.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(WindowInsetsCompat rootWindowInsets) {
            this.mRootWindowInsets = rootWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(Insets visibleInsets) {
            this.mRootViewVisibleInsets = visibleInsets;
        }

        private Insets getRootStableInsets() {
            if (this.mRootWindowInsets == null) goto L7;
            return this.mRootWindowInsets.getStableInsets();
        L7:
            return Insets.NONE;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(View rootView) {
            Insets visibleInsets = getVisibleInsets(rootView);
            if (visibleInsets != null) goto L5;
            visibleInsets = Insets.NONE;
        L5:
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setSystemUiVisibility(int systemUiVisibility) {
            this.mSystemUiVisibility = systemUiVisibility;
        }

        private Insets getVisibleInsets(View rootView) {
            if (Build.VERSION.SDK_INT >= 30) goto L27;
            if (sVisibleRectReflectionFetched == true) goto L8;
            loadReflectionField();
        L8:
            if (sGetViewRootImplMethod != null) goto L10;
        L25:
            return null;
        L10:
            if (sAttachInfoClass == null) goto L25;
            if (sVisibleInsetsField == null) goto L25;
            Object viewRootImpl = sGetViewRootImplMethod.invoke(rootView, new Object[0]);     // Catch: ReflectiveOperationException -> L22
            if (viewRootImpl != null) goto L18;
            Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());     // Catch: ReflectiveOperationException -> L22
            return null;
        L18:
            Object mAttachInfo = sAttachInfoField.get(viewRootImpl);     // Catch: ReflectiveOperationException -> L22
            Rect visibleRect = (Rect) sVisibleInsetsField.get(mAttachInfo);     // Catch: ReflectiveOperationException -> L22
            if (visibleRect != null) goto L21;
            return null;
        L21:
            return Insets.of(visibleRect);
        L22:
            e = move-exception;
            Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            return null;
        L27:
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(Insets[] insetsTypeMask) {
            this.mOverriddenInsets = insetsTypeMask;
        }

        private static void loadReflectionField() {
            sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);     // Catch: ReflectiveOperationException -> L5
            sAttachInfoClass = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L5
            sVisibleInsetsField = sAttachInfoClass.getDeclaredField("mVisibleInsets");     // Catch: ReflectiveOperationException -> L5
            Class<?> viewRootImplClass = Class.forName("android.view.ViewRootImpl");     // Catch: ReflectiveOperationException -> L5
            sAttachInfoField = viewRootImplClass.getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L5
            sVisibleInsetsField.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
            sAttachInfoField.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
        L7:
            sVisibleRectReflectionFetched = true;
            return;
        L5:
            e = move-exception;
            Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            goto L7
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object o) {
            if (super.equals(o) == true) goto L5;
            return false;
        L5:
            Impl20 impl20 = (Impl20) o;
            if (Objects.equals(this.mRootViewVisibleInsets, impl20.mRootViewVisibleInsets) == true) goto L8;
            return false;
        L8:
            if (systemBarVisibilityEquals(this.mSystemUiVisibility, impl20.mSystemUiVisibility) == false) goto L13;
            return true;
        L13:
            return false;
        }

        static boolean systemBarVisibilityEquals(int vis1, int vis2) {
            if ((vis1 & 6) != (vis2 & 6)) goto L5;
            return true;
        L5:
            return false;
        }
    }

    private static class Impl21 extends Impl20 {
        private Insets mStableInsets;

        Impl21(WindowInsetsCompat host, WindowInsets insets) {
            super(host, insets);
            this.mStableInsets = null;
        }

        Impl21(WindowInsetsCompat host, Impl21 other) {
            super(host, other);
            this.mStableInsets = null;
            this.mStableInsets = other.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final Insets getStableInsets() {
            if (this.mStableInsets != null) goto L6;
            this.mStableInsets = Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
        L6:
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(Insets stableInsets) {
            this.mStableInsets = stableInsets;
        }
    }

    private static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat host, WindowInsets insets) {
            super(host, insets);
        }

        Impl28(WindowInsetsCompat host, Impl28 other) {
            super(host, other);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        DisplayCutoutCompat getDisplayCutout() {
            return DisplayCutoutCompat.wrap(this.mPlatformInsets.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeDisplayCutout() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if ((o instanceof Impl28) == true) goto L8;
            return false;
        L8:
            Impl28 otherImpl28 = (Impl28) o;
            if (Objects.equals(this.mPlatformInsets, otherImpl28.mPlatformInsets) == false) goto L16;
            if (Objects.equals(this.mRootViewVisibleInsets, otherImpl28.mRootViewVisibleInsets) == false) goto L16;
            if (systemBarVisibilityEquals(this.mSystemUiVisibility, otherImpl28.mSystemUiVisibility) == false) goto L16;
            return true;
        L16:
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }
    }

    private static class Impl29 extends Impl28 {
        private Insets mMandatorySystemGestureInsets;
        private Insets mSystemGestureInsets;
        private Insets mTappableElementInsets;

        Impl29(WindowInsetsCompat host, WindowInsets insets) {
            super(host, insets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        Impl29(WindowInsetsCompat host, Impl29 other) {
            super(host, other);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets getSystemGestureInsets() {
            if (this.mSystemGestureInsets != null) goto L6;
            this.mSystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
        L6:
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets != null) goto L6;
            this.mMandatorySystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
        L6:
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets getTappableElementInsets() {
            if (this.mTappableElementInsets != null) goto L6;
            this.mTappableElementInsets = Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
        L6:
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int left, int top, int right, int bottom) {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(left, top, right, bottom));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(Insets stableInsets) {
        }
    }

    private static class Impl30 extends Impl29 {
        static final WindowInsetsCompat CONSUMED = null;

        static {
            CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);
        }

        Impl30(WindowInsetsCompat host, WindowInsets insets) {
            super(host, insets);
        }

        Impl30(WindowInsetsCompat host, Impl30 other) {
            super(host, other);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int typeMask) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl30.toPlatformType(typeMask)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int typeMask) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl30.toPlatformType(typeMask)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int typeMask) {
            return this.mPlatformInsets.isVisible(TypeImpl30.toPlatformType(typeMask));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(View rootView) {
        }
    }

    private static class Impl34 extends Impl30 {
        static final WindowInsetsCompat CONSUMED = null;

        static {
            CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);
        }

        Impl34(WindowInsetsCompat host, WindowInsets insets) {
            super(host, insets);
        }

        Impl34(WindowInsetsCompat host, Impl34 other) {
            super(host, other);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int typeMask) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl34.toPlatformType(typeMask)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int typeMask) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl34.toPlatformType(typeMask)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int typeMask) {
            return this.mPlatformInsets.isVisible(TypeImpl34.toPlatformType(typeMask));
        }
    }

    public static final class Side {
        public static final int BOTTOM = 8;
        public static final int LEFT = 1;
        public static final int RIGHT = 4;
        public static final int TOP = 2;

        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsSide {
        }

        private Side() {
        }

        public static int all() {
            return 15;
        }
    }

    public static final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 512;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 10;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int SYSTEM_OVERLAYS = 512;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        private Type() {
        }

        public static int statusBars() {
            return 1;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int captionBar() {
            return 4;
        }

        public static int ime() {
            return 8;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int tappableElement() {
            return 64;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int systemOverlays() {
            return 512;
        }

        public static int systemBars() {
            return 519;
        }

        static int all() {
            return -1;
        }

        static int indexOf(int type) {
            switch(type) {
                case 1: goto L23;
                case 2: goto L21;
                case 4: goto L19;
                case 8: goto L17;
                case 16: goto L15;
                case 32: goto L13;
                case 64: goto L11;
                case 128: goto L9;
                case 256: goto L7;
                case 512: goto L5;
                default: goto L4;
            };
        L5:
            return 9;
        L7:
            return 8;
        L9:
            return 7;
        L11:
            return 6;
        L13:
            return 5;
        L15:
            return 4;
        L17:
            return 3;
        L19:
            return 2;
        L21:
            return 1;
        L23:
            return 0;
        L4:
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + type);
        }
    }

    private static final class TypeImpl30 {
        private TypeImpl30() {
        }

        static int toPlatformType(int typeMask) {
            int result = 0;
            int i = 1;
        L4:
            if (i > 512) goto L18;
            if ((typeMask & i) == 0) goto L17;
            switch(i) {
                case 1: goto L16;
                case 2: goto L15;
                case 4: goto L14;
                case 8: goto L13;
                case 16: goto L12;
                case 32: goto L11;
                case 64: goto L10;
                case 128: goto L9;
                default: goto L17;
            };
        L9:
            result = result | WindowInsets.Type.displayCutout();
            goto L17
        L10:
            result = result | WindowInsets.Type.tappableElement();
            goto L17
        L11:
            result = result | WindowInsets.Type.mandatorySystemGestures();
            goto L17
        L12:
            result = result | WindowInsets.Type.systemGestures();
            goto L17
        L13:
            result = result | WindowInsets.Type.ime();
            goto L17
        L14:
            result = result | WindowInsets.Type.captionBar();
            goto L17
        L15:
            result = result | WindowInsets.Type.navigationBars();
            goto L17
        L16:
            result = result | WindowInsets.Type.statusBars();
        L17:
            i = i << 1;
            goto L4
        L18:
            return result;
        }
    }

    private static final class TypeImpl34 {
        private TypeImpl34() {
        }

        static int toPlatformType(int typeMask) {
            int result = 0;
            int i = 1;
        L4:
            if (i > 512) goto L19;
            if ((typeMask & i) == 0) goto L18;
            switch(i) {
                case 1: goto L17;
                case 2: goto L16;
                case 4: goto L15;
                case 8: goto L14;
                case 16: goto L13;
                case 32: goto L12;
                case 64: goto L11;
                case 128: goto L10;
                case 512: goto L9;
                default: goto L18;
            };
        L9:
            result = result | WindowInsets.Type.systemOverlays();
            goto L18
        L10:
            result = result | WindowInsets.Type.displayCutout();
            goto L18
        L11:
            result = result | WindowInsets.Type.tappableElement();
            goto L18
        L12:
            result = result | WindowInsets.Type.mandatorySystemGestures();
            goto L18
        L13:
            result = result | WindowInsets.Type.systemGestures();
            goto L18
        L14:
            result = result | WindowInsets.Type.ime();
            goto L18
        L15:
            result = result | WindowInsets.Type.captionBar();
            goto L18
        L16:
            result = result | WindowInsets.Type.navigationBars();
            goto L18
        L17:
            result = result | WindowInsets.Type.statusBars();
        L18:
            i = i << 1;
            goto L4
        L19:
            return result;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 34) goto L6;
        CONSUMED = Impl34.CONSUMED;
        return;
    L6:
        if (Build.VERSION.SDK_INT < 30) goto L8;
        CONSUMED = Impl30.CONSUMED;
        return;
    L8:
        CONSUMED = Impl.CONSUMED;
    }

    private WindowInsetsCompat(WindowInsets insets) {
        if (Build.VERSION.SDK_INT < 34) goto L6;
        this.mImpl = new Impl34(this, insets);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 30) goto L9;
        this.mImpl = new Impl30(this, insets);
        return;
    L9:
        if (Build.VERSION.SDK_INT < 29) goto L12;
        this.mImpl = new Impl29(this, insets);
        return;
    L12:
        if (Build.VERSION.SDK_INT < 28) goto L14;
        this.mImpl = new Impl28(this, insets);
        return;
    L14:
        this.mImpl = new Impl21(this, insets);
    }

    public WindowInsetsCompat(WindowInsetsCompat src) {
        if (src == null) goto L32;
        Impl srcImpl = src.mImpl;
        if (Build.VERSION.SDK_INT < 34) goto L10;
        if ((srcImpl instanceof Impl34) == false) goto L10;
        this.mImpl = new Impl34(this, (Impl34) srcImpl);
    L31:
        srcImpl.copyWindowDataInto(this);
        return;
    L10:
        if (Build.VERSION.SDK_INT < 30) goto L15;
        if ((srcImpl instanceof Impl30) == false) goto L15;
        this.mImpl = new Impl30(this, (Impl30) srcImpl);
    L15:
        if (Build.VERSION.SDK_INT < 29) goto L20;
        if ((srcImpl instanceof Impl29) == false) goto L20;
        this.mImpl = new Impl29(this, (Impl29) srcImpl);
    L20:
        if (Build.VERSION.SDK_INT < 28) goto L25;
        if ((srcImpl instanceof Impl28) == false) goto L25;
        this.mImpl = new Impl28(this, (Impl28) srcImpl);
    L25:
        if ((srcImpl instanceof Impl21) == false) goto L28;
        this.mImpl = new Impl21(this, (Impl21) srcImpl);
        goto L31
    L28:
        if ((srcImpl instanceof Impl20) == false) goto L30;
        this.mImpl = new Impl20(this, (Impl20) srcImpl);
        goto L31
    L30:
        this.mImpl = new Impl(this);
        goto L31
    L32:
        this.mImpl = new Impl(this);
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets insets) {
        return toWindowInsetsCompat(insets, null);
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets insets, View view) {
        WindowInsetsCompat wic = new WindowInsetsCompat((WindowInsets) Preconditions.checkNotNull(insets));
        if (view != null) goto L5;
    L7:
        return wic;
    L5:
        if (view.isAttachedToWindow() == false) goto L7;
        wic.setRootWindowInsets(ViewCompat.getRootWindowInsets(view));
        wic.copyRootViewBounds(view.getRootView());
        wic.setSystemUiVisibility(view.getWindowSystemUiVisibility());
        goto L7
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.mImpl.getSystemWindowInsets().left;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.mImpl.getSystemWindowInsets().top;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.mImpl.getSystemWindowInsets().right;
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.mImpl.getSystemWindowInsets().equals(Insets.NONE);
    }

    public boolean hasInsets() {
        if (getInsets(Type.all()).equals(Insets.NONE) == true) goto L5;
    L10:
        return true;
    L5:
        if (getInsetsIgnoringVisibility(Type.all() ^ Type.ime()).equals(Insets.NONE) == false) goto L10;
        if (getDisplayCutout() != null) goto L10;
        return false;
    }

    public boolean isConsumed() {
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        return this.mImpl.isRound();
    }

    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.consumeSystemWindowInsets();
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int left, int top, int right, int bottom) {
        return new Builder(this).setSystemWindowInsets(Insets.of(left, top, right, bottom)).build();
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(Rect systemWindowInsets) {
        return new Builder(this).setSystemWindowInsets(Insets.of(systemWindowInsets)).build();
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.mImpl.getStableInsets().top;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.mImpl.getStableInsets().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.mImpl.getStableInsets().right;
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.mImpl.getStableInsets().bottom;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.mImpl.getStableInsets().equals(Insets.NONE);
    }

    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.consumeStableInsets();
    }

    public DisplayCutoutCompat getDisplayCutout() {
        return this.mImpl.getDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.consumeDisplayCutout();
    }

    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.mImpl.getSystemWindowInsets();
    }

    @Deprecated
    public Insets getStableInsets() {
        return this.mImpl.getStableInsets();
    }

    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    @Deprecated
    public Insets getTappableElementInsets() {
        return this.mImpl.getTappableElementInsets();
    }

    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.mImpl.getSystemGestureInsets();
    }

    public WindowInsetsCompat inset(Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public WindowInsetsCompat inset(int left, int top, int right, int bottom) {
        return this.mImpl.inset(left, top, right, bottom);
    }

    public Insets getInsets(int typeMask) {
        return this.mImpl.getInsets(typeMask);
    }

    public Insets getInsetsIgnoringVisibility(int typeMask) {
        return this.mImpl.getInsetsIgnoringVisibility(typeMask);
    }

    public boolean isVisible(int typeMask) {
        return this.mImpl.isVisible(typeMask);
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof WindowInsetsCompat) == true) goto L9;
        return false;
    L9:
        WindowInsetsCompat other = (WindowInsetsCompat) o;
        return ObjectsCompat.equals(this.mImpl, other.mImpl);
    }

    public int hashCode() {
        if (this.mImpl != null) goto L6;
        return 0;
    L6:
        return this.mImpl.hashCode();
    }

    public WindowInsets toWindowInsets() {
        if ((this.mImpl instanceof Impl20) == true) goto L7;
        return null;
    L7:
        return ((Impl20) this.mImpl).mPlatformInsets;
    }

    static Insets insetInsets(Insets insets, int left, int top, int right, int bottom) {
        int newLeft = Math.max(0, insets.left - left);
        int newTop = Math.max(0, insets.top - top);
        int newRight = Math.max(0, insets.right - right);
        int newBottom = Math.max(0, insets.bottom - bottom);
        if (newLeft != left) goto L9;
        if (newTop != top) goto L9;
        if (newRight != right) goto L9;
        if (newBottom != bottom) goto L9;
        return insets;
    L9:
        return Insets.of(newLeft, newTop, newRight, newBottom);
    }

    void setOverriddenInsets(Insets[] insetsTypeMask) {
        this.mImpl.setOverriddenInsets(insetsTypeMask);
    }

    void setStableInsets(Insets stableInsets) {
        this.mImpl.setStableInsets(stableInsets);
    }

    void setRootWindowInsets(WindowInsetsCompat rootWindowInsets) {
        this.mImpl.setRootWindowInsets(rootWindowInsets);
    }

    void setRootViewData(Insets visibleInsets) {
        this.mImpl.setRootViewData(visibleInsets);
    }

    void copyRootViewBounds(View rootView) {
        this.mImpl.copyRootViewBounds(rootView);
    }

    void setSystemUiVisibility(int systemUiVisibility) {
        this.mImpl.setSystemUiVisibility(systemUiVisibility);
    }
}
