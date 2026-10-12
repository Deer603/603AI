package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextLinkStyles.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "style", "Landroidx/compose/ui/text/SpanStyle;", "focusedStyle", "hoveredStyle", "pressedStyle", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)V", "getFocusedStyle", "()Landroidx/compose/ui/text/SpanStyle;", "getHoveredStyle", "getPressedStyle", "getStyle", "equals", "", "other", "hashCode", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextLinkStyles {
    public static final int $stable = 0;
    private final SpanStyle focusedStyle;
    private final SpanStyle hoveredStyle;
    private final SpanStyle pressedStyle;
    private final SpanStyle style;

    static {
    }

    public TextLinkStyles() {
        SpanStyle r1 = null;
        SpanStyle r2 = null;
        SpanStyle r3 = null;
        SpanStyle r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public TextLinkStyles(SpanStyle style, SpanStyle focusedStyle, SpanStyle hoveredStyle, SpanStyle pressedStyle) {
        this.style = style;
        this.focusedStyle = focusedStyle;
        this.hoveredStyle = hoveredStyle;
        this.pressedStyle = pressedStyle;
    }

    public /* synthetic */ TextLinkStyles(SpanStyle r2, SpanStyle r3, SpanStyle r4, SpanStyle r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }

    public final SpanStyle getStyle() {
        return this.style;
    }

    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L23:
        return false;
    L8:
        if ((other instanceof TextLinkStyles) == false) goto L23;
        if (Intrinsics.areEqual(this.style, ((TextLinkStyles) other).style) == true) goto L14;
        return false;
    L14:
        if (Intrinsics.areEqual(this.focusedStyle, ((TextLinkStyles) other).focusedStyle) == true) goto L17;
        return false;
    L17:
        if (Intrinsics.areEqual(this.hoveredStyle, ((TextLinkStyles) other).hoveredStyle) == true) goto L20;
        return false;
    L20:
        if (Intrinsics.areEqual(this.pressedStyle, ((TextLinkStyles) other).pressedStyle) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public int hashCode() {
        SpanStyle r0 = this.style;
        int r1 = 0;
        if (r0 == null) goto L5;
        int result = r0.hashCode();
    L6:
        int r2 = result * 31;
        SpanStyle r3 = this.focusedStyle;
        if (r3 == null) goto L9;
        int r4 = r3.hashCode();
    L10:
        int result2 = r2 + r4;
        int result3 = result2 * 31;
        SpanStyle r5 = this.hoveredStyle;
        if (r5 == null) goto L13;
        int r6 = r5.hashCode();
    L14:
        int result4 = (result3 + r6) * 31;
        SpanStyle r7 = this.pressedStyle;
        if (r7 == null) goto L18;
        r1 = r7.hashCode();
    L18:
        return result4 + r1;
    L13:
        r6 = 0;
        goto L14
    L9:
        r4 = 0;
        goto L10
    L5:
        result = 0;
        goto L6
    }
}
