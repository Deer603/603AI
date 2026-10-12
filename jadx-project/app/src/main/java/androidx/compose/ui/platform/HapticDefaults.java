package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import kotlin.Metadata;

/* JADX INFO: compiled from: HapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/HapticDefaults;", "", "()V", "isPremiumVibratorEnabled", "", "context", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HapticDefaults {
    public static final int $stable = 0;
    public static final HapticDefaults INSTANCE = null;

    static {
        INSTANCE = new HapticDefaults();
    }

    private HapticDefaults() {
    }

    public final boolean isPremiumVibratorEnabled(Context context) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        Vibrator vibrator = (Vibrator) context.getSystemService(Vibrator.class);
        if (vibrator.areAllPrimitivesSupported(new int[]{1, 7, 2}) == false) goto L9;
        return true;
    L9:
        return false;
    L7:
        return false;
    }
}
