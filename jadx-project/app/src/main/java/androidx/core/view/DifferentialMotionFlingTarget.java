package androidx.core.view;

/* JADX INFO: loaded from: classes4.dex */
public interface DifferentialMotionFlingTarget {
    float getScaledScrollFactor();

    boolean startDifferentialMotionFling(float r1);

    void stopDifferentialMotionFling();
}
