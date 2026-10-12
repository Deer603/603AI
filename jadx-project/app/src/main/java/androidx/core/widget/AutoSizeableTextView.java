package androidx.core.widget;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public interface AutoSizeableTextView {

    @Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE = false;

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int r1);

    static {
        if (Build.VERSION.SDK_INT < 27) goto L5;
        boolean r0 = true;
    L6:
        PLATFORM_SUPPORTS_AUTOSIZE = r0;
        return;
    L5:
        r0 = false;
        goto L6
    }
}
