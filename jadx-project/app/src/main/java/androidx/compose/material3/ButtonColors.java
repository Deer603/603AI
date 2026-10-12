package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/ButtonColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "enabled", "", "containerColor-vNxB06k$material3_release", "(Z)J", "contentColor-vNxB06k$material3_release", "copy", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/ButtonColors;", "equals", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    static {
    }

    public /* synthetic */ ButtonColors(long r1, long r3, long r5, long r7, DefaultConstructorMarker r9) {
        this(r1, r3, r5, r7);
    }

    private ButtonColors(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor) {
        this.containerColor = containerColor;
        this.contentColor = contentColor;
        this.disabledContainerColor = disabledContainerColor;
        this.disabledContentColor = disabledContentColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1932getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m1933getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1934getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m1935getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ ButtonColors m1928copyjRlVdoo$default(ButtonColors r9, long r10, long r12, long r14, long r16, int r18, Object r19) {
        if ((r18 & 1) == 0) goto L5;
        long r1 = r9.containerColor;
    L7:
        if ((r18 & 2) == 0) goto L9;
        long r3 = r9.contentColor;
    L11:
        if ((r18 & 4) == 0) goto L13;
        long r5 = r9.disabledContainerColor;
    L15:
        if ((r18 & 8) == 0) goto L17;
        long r7 = r9.disabledContentColor;
    L19:
        return r9.m1931copyjRlVdoo(r1, r3, r5, r7);
    L17:
        r7 = r16;
        goto L19
    L13:
        r5 = r14;
        goto L15
    L9:
        r3 = r12;
        goto L11
    L5:
        r1 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final ButtonColors m1931copyjRlVdoo(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor) {
        boolean r10 = true;
        if (containerColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = containerColor;
    L10:
        if (contentColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = contentColor;
    L17:
        if (disabledContainerColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = disabledContainerColor;
    L24:
        if (disabledContentColor != 16) goto L27;
        r10 = false;
    L27:
        if (r10 == false) goto L29;
        long r19 = disabledContentColor;
    L31:
        return new ButtonColors(r13, r15, r17, r19, null);
    L29:
        r19 = this.disabledContentColor;
        goto L31
    L22:
        r17 = this.disabledContainerColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.contentColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.containerColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1929containerColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.containerColor;
    L5:
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1930contentColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.contentColor;
    L5:
        return this.disabledContentColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L23:
        return false;
    L8:
        if ((other instanceof ButtonColors) == false) goto L23;
        if (Color.m4367equalsimpl0(this.containerColor, ((ButtonColors) other).containerColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.contentColor, ((ButtonColors) other).contentColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.disabledContainerColor, ((ButtonColors) other).disabledContainerColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledContentColor, ((ButtonColors) other).disabledContentColor) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.contentColor);
        return (((result2 * 31) + Color.m4373hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContentColor);
    }
}
