package com.luchime.huiyuan.ui;

import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppHaptics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/luchime/huiyuan/ui/AppHaptics;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "lastStreamTickAt", "", "perform", "", "cue", "Lcom/luchime/huiyuan/ui/HapticCue;", "streamTick", "feedback", "constant", "", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppHaptics {
    public static final int $stable = 0;
    private static final Companion Companion = null;

    @Deprecated
    public static final long STREAM_TICK_THROTTLE_MS = 54;
    private long lastStreamTickAt;
    private final View view;

    /* JADX INFO: compiled from: AppHaptics.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/luchime/huiyuan/ui/AppHaptics$Companion;", "", "<init>", "()V", "STREAM_TICK_THROTTLE_MS", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: AppHaptics.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[HapticCue.values().length];
            r0[HapticCue.TAP.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L23:
            r0[HapticCue.SELECTION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L29:
            r0[HapticCue.CONFIRM.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L33:
            r0[HapticCue.STREAM_COMPLETE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L25:
            r0[HapticCue.DESTRUCTIVE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L27:
            r0[HapticCue.STREAM_TICK.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L21:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public AppHaptics(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void perform(HapticCue cue) {
        Intrinsics.checkNotNullParameter(cue, "cue");
        if (this.view.isAttachedToWindow() == true) goto L5;
        return;
    L5:
        if (this.view.hasWindowFocus() == false) goto L30;
        int r2 = 1;
        switch(WhenMappings.$EnumSwitchMapping$0[cue.ordinal()]) {
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L18;
            case 4: goto L18;
            case 5: goto L13;
            case 6: goto L11;
            default: goto L10;
        };
    L11:
        streamTick();
        return;
    L22:
        feedback(4);
        return;
    L23:
        feedback(1);
        return;
    L10:
        throw new NoWhenBranchMatchedException();
    L13:
        if (Build.VERSION.SDK_INT < 30) goto L15;
        int r0 = 17;
    L16:
        feedback(r0);
        return;
    L15:
        r0 = 0;
        goto L16
    L18:
        if (Build.VERSION.SDK_INT < 30) goto L21;
        r2 = 16;
    L21:
        feedback(r2);
        return;
    }

    private final void streamTick() {
        long now = SystemClock.uptimeMillis();
        if (this.lastStreamTickAt != 0) goto L5;
    L7:
        this.lastStreamTickAt = now;
        feedback(4);
        return;
    L5:
        if ((now - this.lastStreamTickAt) >= 54) goto L7;
    }

    private final void feedback(int constant) {
        this.view.performHapticFeedback(constant);
    }
}
