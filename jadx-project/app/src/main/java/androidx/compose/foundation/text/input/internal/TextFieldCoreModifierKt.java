package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldCoreModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a$\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u000fH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0010"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "F", "isSpecified", "", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/ui/graphics/Brush;)Z", "getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorRect", "rtl", "textLayoutSize", "", "roundToNext", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = 0.0f;

    public static final /* synthetic */ Rect access$getCursorRectInScroller(Density $receiver, Rect cursorRect, boolean rtl, int textLayoutSize) {
        return getCursorRectInScroller($receiver, cursorRect, rtl, textLayoutSize);
    }

    public static final /* synthetic */ boolean access$isSpecified(Brush $receiver) {
        return isSpecified($receiver);
    }

    public static final /* synthetic */ float access$roundToNext(float $receiver) {
        return roundToNext($receiver);
    }

    static {
        DefaultCursorThickness = Dp.m6973constructorimpl(2);
    }

    private static final boolean isSpecified(Brush $this$isSpecified) {
        if (($this$isSpecified instanceof SolidColor) == false) goto L12;
        long $this$isUnspecified$iv = ((SolidColor) $this$isSpecified).m4701getValue0d7_KjU();
        if ($this$isUnspecified$iv != 16) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L11;
        return true;
    L11:
        return false;
    L7:
        r0 = 0;
        goto L8
    L12:
        return true;
    }

    private static final Rect getCursorRectInScroller(Density $this$getCursorRectInScroller, Rect cursorRect, boolean rtl, int textLayoutSize) {
        int thickness = $this$getCursorRectInScroller.mo370roundToPx0680j_4(DefaultCursorThickness);
        if (rtl == false) goto L5;
        float r1 = textLayoutSize - cursorRect.getRight();
    L6:
        float cursorLeft = r1;
        if (rtl == false) goto L9;
        float cursorRight = (textLayoutSize - cursorRect.getRight()) + thickness;
    L11:
        return Rect.copy$default(cursorRect, cursorLeft, 0.0f, cursorRight, 0.0f, 10, null);
    L9:
        cursorRight = cursorRect.getLeft() + thickness;
        goto L11
    L5:
        r1 = cursorRect.getLeft();
        goto L6
    }

    private static final float roundToNext(float $this$roundToNext) {
        if (Float.isNaN($this$roundToNext) == true) goto L12;
        if (Float.isInfinite($this$roundToNext) == true) goto L12;
        if ($this$roundToNext <= 0.0f) goto L14;
        return (float) Math.ceil($this$roundToNext);
    L14:
        return (float) Math.floor($this$roundToNext);
    L12:
        return $this$roundToNext;
    }
}
