package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: IndentationFixSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"EllipsisChar", "", "getEllipsizedLeftPadding", "", "Landroid/text/Layout;", "lineIndex", "", "paint", "Landroid/graphics/Paint;", "getEllipsizedRightPadding", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IndentationFixSpan_androidKt {
    private static final String EllipsisChar = "…";

    /* JADX INFO: compiled from: IndentationFixSpan.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Layout.Alignment.values().length];
            r0[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L6:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static /* synthetic */ float getEllipsizedLeftPadding$default(Layout r0, int r1, TextPaint r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getPaint();
    L6:
        return getEllipsizedLeftPadding(r0, r1, r2);
    }

    public static final float getEllipsizedLeftPadding(Layout $this$getEllipsizedLeftPadding, int lineIndex, Paint paint) {
        float lineLeft = $this$getEllipsizedLeftPadding.getLineLeft(lineIndex);
        if (TextLayout_androidKt.isLineEllipsized($this$getEllipsizedLeftPadding, lineIndex) == true) goto L5;
    L16:
        return 0.0f;
    L5:
        if ($this$getEllipsizedLeftPadding.getParagraphDirection(lineIndex) != 1) goto L16;
        if (lineLeft >= 0.0f) goto L16;
        int ellipsisIndex = $this$getEllipsizedLeftPadding.getLineStart(lineIndex) + $this$getEllipsizedLeftPadding.getEllipsisStart(lineIndex);
        float horizontal = $this$getEllipsizedLeftPadding.getPrimaryHorizontal(ellipsisIndex);
        float length = (horizontal - lineLeft) + paint.measureText(EllipsisChar);
        Layout.Alignment r5 = $this$getEllipsizedLeftPadding.getParagraphAlignment(lineIndex);
        if (r5 != null) goto L11;
        int r6 = -1;
    L12:
        if (r6 != 1) goto L15;
        return Math.abs(lineLeft) + (($this$getEllipsizedLeftPadding.getWidth() - length) / 2.0f);
    L15:
        return Math.abs(lineLeft) + ($this$getEllipsizedLeftPadding.getWidth() - length);
    L11:
        r6 = WhenMappings.$EnumSwitchMapping$0[r5.ordinal()];
        goto L12
    }

    public static /* synthetic */ float getEllipsizedRightPadding$default(Layout r0, int r1, TextPaint r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getPaint();
    L6:
        return getEllipsizedRightPadding(r0, r1, r2);
    }

    public static final float getEllipsizedRightPadding(Layout $this$getEllipsizedRightPadding, int lineIndex, Paint paint) {
        if (TextLayout_androidKt.isLineEllipsized($this$getEllipsizedRightPadding, lineIndex) == false) goto L17;
        int r1 = -1;
        if ($this$getEllipsizedRightPadding.getParagraphDirection(lineIndex) == (-1)) goto L7;
        return 0.0f;
    L7:
        if ($this$getEllipsizedRightPadding.getWidth() >= $this$getEllipsizedRightPadding.getLineRight(lineIndex)) goto L21;
        int ellipsisIndex = $this$getEllipsizedRightPadding.getLineStart(lineIndex) + $this$getEllipsizedRightPadding.getEllipsisStart(lineIndex);
        float horizontal = $this$getEllipsizedRightPadding.getPrimaryHorizontal(ellipsisIndex);
        float length = ($this$getEllipsizedRightPadding.getLineRight(lineIndex) - horizontal) + paint.measureText(EllipsisChar);
        Layout.Alignment r4 = $this$getEllipsizedRightPadding.getParagraphAlignment(lineIndex);
        if (r4 == null) goto L13;
        r1 = WhenMappings.$EnumSwitchMapping$0[r4.ordinal()];
    L13:
        if (r1 != 1) goto L16;
        return ($this$getEllipsizedRightPadding.getWidth() - $this$getEllipsizedRightPadding.getLineRight(lineIndex)) - (($this$getEllipsizedRightPadding.getWidth() - length) / 2.0f);
    L16:
        return ($this$getEllipsizedRightPadding.getWidth() - $this$getEllipsizedRightPadding.getLineRight(lineIndex)) - ($this$getEllipsizedRightPadding.getWidth() - length);
    L21:
        return 0.0f;
    L17:
        return 0.0f;
    }
}
