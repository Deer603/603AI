package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;

/* JADX INFO: compiled from: HapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/DefaultHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "performHapticFeedback", "", "hapticFeedbackType", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "performHapticFeedback-CdsT49E", "(I)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultHapticFeedback implements HapticFeedback {
    public static final int $stable = 0;
    private final View view;

    static {
        $stable = 8;
    }

    public DefaultHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E */
    public void mo5088performHapticFeedbackCdsT49E(int hapticFeedbackType) {
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5096getConfirm5zf0vsI()) == false) goto L6;
        this.view.performHapticFeedback(16);
        return;
    L6:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5097getContextClick5zf0vsI()) == false) goto L9;
        this.view.performHapticFeedback(6);
        return;
    L9:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5098getGestureEnd5zf0vsI()) == false) goto L12;
        this.view.performHapticFeedback(13);
        return;
    L12:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5099getGestureThresholdActivate5zf0vsI()) == false) goto L15;
        this.view.performHapticFeedback(23);
        return;
    L15:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5100getLongPress5zf0vsI()) == false) goto L18;
        this.view.performHapticFeedback(0);
        return;
    L18:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5101getReject5zf0vsI()) == false) goto L21;
        this.view.performHapticFeedback(17);
        return;
    L21:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5102getSegmentFrequentTick5zf0vsI()) == false) goto L24;
        this.view.performHapticFeedback(27);
        return;
    L24:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5103getSegmentTick5zf0vsI()) == false) goto L27;
        this.view.performHapticFeedback(26);
        return;
    L27:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI()) == false) goto L30;
        this.view.performHapticFeedback(9);
        return;
    L30:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5105getToggleOff5zf0vsI()) == false) goto L33;
        this.view.performHapticFeedback(22);
        return;
    L33:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5106getToggleOn5zf0vsI()) == false) goto L36;
        this.view.performHapticFeedback(21);
        return;
    L36:
        if (HapticFeedbackType.m5092equalsimpl0(hapticFeedbackType, HapticFeedbackType.Companion.m5107getVirtualKey5zf0vsI()) == false) goto L50;
        this.view.performHapticFeedback(1);
        return;
    }
}
