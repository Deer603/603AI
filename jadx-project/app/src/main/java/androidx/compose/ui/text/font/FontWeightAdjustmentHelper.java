package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelper;", "", "()V", "getFontWeightAdjustment", "", "context", "Landroid/content/Context;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontWeightAdjustmentHelper {
    public static final int $stable = 0;
    public static final FontWeightAdjustmentHelper INSTANCE = null;

    static {
        INSTANCE = new FontWeightAdjustmentHelper();
    }

    private FontWeightAdjustmentHelper() {
    }

    public final int getFontWeightAdjustment(Context context) {
        if (Build.VERSION.SDK_INT >= 31) goto L7;
        return 0;
    L7:
        return FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context);
    }
}
