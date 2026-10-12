package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: BoringLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004J \u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "()V", "create", "Landroid/text/BoringLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "metrics", "Landroid/text/BoringLayout$Metrics;", "alignment", "Landroid/text/Layout$Alignment;", "includePadding", "", "useFallbackLineSpacing", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "isFallbackLineSpacingEnabled", "layout", "measure", "textDir", "Landroid/text/TextDirectionHeuristic;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BoringLayoutFactory {
    public static final int $stable = 0;
    public static final BoringLayoutFactory INSTANCE = null;

    static {
        INSTANCE = new BoringLayoutFactory();
    }

    private BoringLayoutFactory() {
    }

    public final BoringLayout.Metrics measure(CharSequence text, TextPaint paint, TextDirectionHeuristic textDir) {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        return BoringLayoutFactory33.isBoring(text, paint, textDir);
    L6:
        return BoringLayoutFactoryDefault.isBoring(text, paint, textDir);
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory r12, CharSequence r13, TextPaint r14, int r15, BoringLayout.Metrics r16, Layout.Alignment r17, boolean r18, boolean r19, TextUtils.TruncateAt r20, int r21, int r22, Object r23) {
        if ((r22 & 16) == 0) goto L5;
        Layout.Alignment r7 = Layout.Alignment.ALIGN_NORMAL;
    L7:
        if ((r22 & 32) == 0) goto L9;
        boolean r8 = false;
    L11:
        if ((r22 & 64) == 0) goto L13;
        boolean r9 = true;
    L15:
        if ((r22 & 128) == 0) goto L17;
        TextUtils.TruncateAt r10 = null;
    L19:
        if ((r22 & 256) == 0) goto L21;
        int r11 = r15;
    L23:
        return r12.create(r13, r14, r15, r16, r7, r8, r9, r10, r11);
    L21:
        r11 = r21;
        goto L23
    L17:
        r10 = r20;
        goto L19
    L13:
        r9 = r19;
        goto L15
    L9:
        r8 = r18;
        goto L11
    L5:
        r7 = r17;
        goto L7
    }

    public final BoringLayout create(CharSequence text, TextPaint paint, int width, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean includePadding, boolean useFallbackLineSpacing, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
        boolean value$iv = true;
        if (width < 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("negative width");
    L10:
        if (ellipsizedWidth >= 0) goto L14;
        value$iv = false;
    L14:
        if (value$iv == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("negative ellipsized width");
    L17:
        if (Build.VERSION.SDK_INT < 33) goto L20;
        return BoringLayoutFactory33.create(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, useFallbackLineSpacing, ellipsize, ellipsizedWidth);
    L20:
        return BoringLayoutFactoryDefault.create(text, paint, width, alignment, 1.0f, 0.0f, metrics, includePadding, ellipsize, ellipsizedWidth);
    L5:
        value$iv2 = false;
        goto L7
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout layout) {
        if (Build.VERSION.SDK_INT >= 33) goto L5;
        return false;
    L5:
        return BoringLayoutFactory33.isFallbackLineSpacingEnabled(layout);
    }
}
