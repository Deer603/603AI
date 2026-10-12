package com.luchime.huiyuan.ui;

import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppHaptics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/luchime/huiyuan/ui/AppHaptics;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "lastStreamTickAt", "", "perform", "", "cue", "Lcom/luchime/huiyuan/ui/HapticCue;", "streamTick", "feedback", "constant", "", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppHaptics {

    @Deprecated
    public static final long STREAM_TICK_THROTTLE_MS = 54;
    private long lastStreamTickAt;
    private final View view;
    private static final Companion Companion = new Companion();
    public static final int $stable = 8;

    /* JADX INFO: compiled from: AppHaptics.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HapticCue.values().length];
            try {
                iArr[HapticCue.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[HapticCue.SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[HapticCue.CONFIRM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[HapticCue.STREAM_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[HapticCue.DESTRUCTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[HapticCue.STREAM_TICK.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppHaptics(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void perform(HapticCue cue) {
        int i;
        Intrinsics.checkNotNullParameter(cue, "cue");
        if (!this.view.isAttachedToWindow() || !this.view.hasWindowFocus()) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[cue.ordinal()]) {
            case 1:
                feedback(1);
                return;
            case 2:
                feedback(4);
                return;
            case 3:
            case 4:
                feedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                return;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    i = 17;
                } else {
                    i = 0;
                }
                feedback(i);
                return;
            case 6:
                streamTick();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void streamTick() {
        long now = SystemClock.uptimeMillis();
        if (this.lastStreamTickAt == 0 || now - this.lastStreamTickAt >= 54) {
            this.lastStreamTickAt = now;
            feedback(4);
        }
    }

    private final void feedback(int constant) {
        this.view.performHapticFeedback(constant);
    }

    /* JADX INFO: compiled from: AppHaptics.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/luchime/huiyuan/ui/AppHaptics$Companion;", "", "<init>", "()V", "STREAM_TICK_THROTTLE_MS", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
        }
    }
}
