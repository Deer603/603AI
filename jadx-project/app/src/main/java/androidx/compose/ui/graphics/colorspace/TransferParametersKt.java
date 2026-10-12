package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

/* JADX INFO: compiled from: TransferParameters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TypeHLGish", "", "TypePQish", "isSpecialG", "", "gamma", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransferParametersKt {
    public static final double TypeHLGish = -3.0d;
    public static final double TypePQish = -2.0d;

    public static final /* synthetic */ boolean access$isSpecialG(double gamma) {
        return isSpecialG(gamma);
    }

    private static final boolean isSpecialG(double gamma) {
        if (gamma != (-2.0d)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return true;
    L8:
        if (gamma != (-3.0d)) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L14;
        return true;
    L14:
        return false;
    L10:
        r1 = false;
        goto L11
    L5:
        r0 = false;
        goto L6
    }
}
