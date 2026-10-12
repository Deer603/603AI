package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;

/* JADX INFO: compiled from: DrawStyleSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DrawStyleSpan_androidKt {
    /* JADX INFO: renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m6704toAndroidJoinWw9F2mQ(int $this$toAndroidJoin_u2dWw9F2mQ) {
        if (StrokeJoin.m4725equalsimpl0($this$toAndroidJoin_u2dWw9F2mQ, StrokeJoin.Companion.m4730getMiterLxFBmk8()) == false) goto L6;
        return Paint.Join.MITER;
    L6:
        if (StrokeJoin.m4725equalsimpl0($this$toAndroidJoin_u2dWw9F2mQ, StrokeJoin.Companion.m4731getRoundLxFBmk8()) == false) goto L9;
        return Paint.Join.ROUND;
    L9:
        if (StrokeJoin.m4725equalsimpl0($this$toAndroidJoin_u2dWw9F2mQ, StrokeJoin.Companion.m4729getBevelLxFBmk8()) == false) goto L12;
        return Paint.Join.BEVEL;
    L12:
        return Paint.Join.MITER;
    }

    /* JADX INFO: renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m6703toAndroidCapBeK7IIE(int $this$toAndroidCap_u2dBeK7IIE) {
        if (StrokeCap.m4715equalsimpl0($this$toAndroidCap_u2dBeK7IIE, StrokeCap.Companion.m4719getButtKaPHkGw()) == false) goto L6;
        return Paint.Cap.BUTT;
    L6:
        if (StrokeCap.m4715equalsimpl0($this$toAndroidCap_u2dBeK7IIE, StrokeCap.Companion.m4720getRoundKaPHkGw()) == false) goto L9;
        return Paint.Cap.ROUND;
    L9:
        if (StrokeCap.m4715equalsimpl0($this$toAndroidCap_u2dBeK7IIE, StrokeCap.Companion.m4721getSquareKaPHkGw()) == false) goto L12;
        return Paint.Cap.SQUARE;
    L12:
        return Paint.Cap.BUTT;
    }
}
