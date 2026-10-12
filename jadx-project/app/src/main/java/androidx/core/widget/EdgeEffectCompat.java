package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes4.dex */
public final class EdgeEffectCompat {
    private final EdgeEffect mEdgeEffect;

    static class Api21Impl {
        private Api21Impl() {
        }

        static void onPull(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
            edgeEffect.onPull(deltaDistance, displacement);
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        public static EdgeEffect create(Context context, AttributeSet attrs) {
            return new EdgeEffect(context, attrs);
        L6:
            return new EdgeEffect(context);
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
            return edgeEffect.onPullDistance(deltaDistance, displacement);
        L5:
            edgeEffect.onPull(deltaDistance, displacement);
            return 0.0f;
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            return edgeEffect.getDistance();
        L5:
            return 0.0f;
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    public static EdgeEffect create(Context context, AttributeSet attrs) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return Api31Impl.create(context, attrs);
    L7:
        return new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0.0f;
    L5:
        return Api31Impl.getDistance(edgeEffect);
    }

    @Deprecated
    public void setSize(int width, int height) {
        this.mEdgeEffect.setSize(width, height);
    }

    @Deprecated
    public boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public void finish() {
        this.mEdgeEffect.finish();
    }

    @Deprecated
    public boolean onPull(float deltaDistance) {
        this.mEdgeEffect.onPull(deltaDistance);
        return true;
    }

    @Deprecated
    public boolean onPull(float deltaDistance, float displacement) {
        onPull(this.mEdgeEffect, deltaDistance, displacement);
        return true;
    }

    public static void onPull(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        Api21Impl.onPull(edgeEffect, deltaDistance, displacement);
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        onPull(edgeEffect, deltaDistance, displacement);
        return deltaDistance;
    L5:
        return Api31Impl.onPullDistance(edgeEffect, deltaDistance, displacement);
    }

    @Deprecated
    public boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int velocity) {
        this.mEdgeEffect.onAbsorb(velocity);
        return true;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }
}
