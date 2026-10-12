package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getDisabledIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getIconColor-0d7_KjU", "getTextColor-0d7_KjU", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    static {
    }

    public /* synthetic */ ContextMenuColors(long r1, long r3, long r5, long r7, long r9, DefaultConstructorMarker r11) {
        this(r1, r3, r5, r7, r9);
    }

    private ContextMenuColors(long backgroundColor, long textColor, long iconColor, long disabledTextColor, long disabledIconColor) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.iconColor = iconColor;
        this.disabledTextColor = disabledTextColor;
        this.disabledIconColor = disabledIconColor;
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m339getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m343getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m342getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m341getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m340getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L26:
        return false;
    L8:
        if ((other instanceof ContextMenuColors) == false) goto L26;
        if (Color.m4367equalsimpl0(this.backgroundColor, ((ContextMenuColors) other).backgroundColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.textColor, ((ContextMenuColors) other).textColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.iconColor, ((ContextMenuColors) other).iconColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledTextColor, ((ContextMenuColors) other).disabledTextColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledIconColor, ((ContextMenuColors) other).disabledIconColor) == true) goto L25;
        return false;
    L25:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.backgroundColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.textColor);
        return (((((result2 * 31) + Color.m4373hashCodeimpl(this.iconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTextColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIconColor);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + Color.m4374toStringimpl(this.backgroundColor) + ", textColor=" + Color.m4374toStringimpl(this.textColor) + ", iconColor=" + Color.m4374toStringimpl(this.iconColor) + ", disabledTextColor=" + Color.m4374toStringimpl(this.disabledTextColor) + ", disabledIconColor=" + Color.m4374toStringimpl(this.disabledIconColor) + ')';
    }
}
