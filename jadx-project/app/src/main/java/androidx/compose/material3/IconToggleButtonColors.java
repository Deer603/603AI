package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0017JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedContainerColor-0d7_KjU", "()J", "J", "getCheckedContentColor-0d7_KjU", "getContainerColor-0d7_KjU", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "Landroidx/compose/runtime/State;", "enabled", "", "checked", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3_release", "copy", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/IconToggleButtonColors;", "equals", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    static {
    }

    public /* synthetic */ IconToggleButtonColors(long r1, long r3, long r5, long r7, long r9, long r11, DefaultConstructorMarker r13) {
        this(r1, r3, r5, r7, r9, r11);
    }

    private IconToggleButtonColors(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor) {
        this.containerColor = containerColor;
        this.contentColor = contentColor;
        this.disabledContainerColor = disabledContainerColor;
        this.disabledContentColor = disabledContentColor;
        this.checkedContainerColor = checkedContainerColor;
        this.checkedContentColor = checkedContentColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2284getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2285getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2286getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m2287getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    /* JADX INFO: renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2282getCheckedContainerColor0d7_KjU() {
        return this.checkedContainerColor;
    }

    /* JADX INFO: renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2283getCheckedContentColor0d7_KjU() {
        return this.checkedContentColor;
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ IconToggleButtonColors m2280copytNS2XkQ$default(IconToggleButtonColors r13, long r14, long r16, long r18, long r20, long r22, long r24, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L5;
        long r1 = r13.containerColor;
    L7:
        if ((r26 & 2) == 0) goto L9;
        long r3 = r13.contentColor;
    L11:
        if ((r26 & 4) == 0) goto L13;
        long r5 = r13.disabledContainerColor;
    L15:
        if ((r26 & 8) == 0) goto L17;
        long r7 = r13.disabledContentColor;
    L19:
        if ((r26 & 16) == 0) goto L21;
        long r9 = r13.checkedContainerColor;
    L23:
        if ((r26 & 32) == 0) goto L25;
        long r11 = r13.checkedContentColor;
    L27:
        return r13.m2281copytNS2XkQ(r1, r3, r5, r7, r9, r11);
    L25:
        r11 = r24;
        goto L27
    L21:
        r9 = r22;
        goto L23
    L17:
        r7 = r20;
        goto L19
    L13:
        r5 = r18;
        goto L15
    L9:
        r3 = r16;
        goto L11
    L5:
        r1 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final IconToggleButtonColors m2281copytNS2XkQ(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor) {
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
        if (disabledContentColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = disabledContentColor;
    L31:
        if (checkedContainerColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = checkedContainerColor;
    L38:
        if (checkedContentColor != 16) goto L41;
        r10 = false;
    L41:
        if (r10 == false) goto L43;
        long r23 = checkedContentColor;
    L45:
        return new IconToggleButtonColors(r13, r15, r17, r19, r21, r23, null);
    L43:
        r23 = this.checkedContentColor;
        goto L45
    L36:
        r21 = this.checkedContainerColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.disabledContentColor;
        goto L31
    L26:
        r7 = false;
        goto L27
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

    public final State<Color> containerColor$material3_release(boolean enabled, boolean checked, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1175394478, "C(containerColor)P(1)1246@57659L28:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1175394478, $changed, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
    L6:
        if (enabled == true) goto L8;
        long target = this.disabledContainerColor;
    L11:
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L8:
        if (checked == true) goto L10;
        target = this.containerColor;
        goto L11
    L10:
        target = this.checkedContainerColor;
        goto L11
    }

    public final State<Color> contentColor$material3_release(boolean enabled, boolean checked, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1340854054, "C(contentColor)P(1)1263@58229L28:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1340854054, $changed, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
    L6:
        if (enabled == true) goto L8;
        long target = this.disabledContentColor;
    L11:
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L8:
        if (checked == true) goto L10;
        target = this.contentColor;
        goto L11
    L10:
        target = this.checkedContentColor;
        goto L11
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L29:
        return false;
    L8:
        if ((other instanceof IconToggleButtonColors) == false) goto L29;
        if (Color.m4367equalsimpl0(this.containerColor, ((IconToggleButtonColors) other).containerColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.contentColor, ((IconToggleButtonColors) other).contentColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.disabledContainerColor, ((IconToggleButtonColors) other).disabledContainerColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledContentColor, ((IconToggleButtonColors) other).disabledContentColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.checkedContainerColor, ((IconToggleButtonColors) other).checkedContainerColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.checkedContentColor, ((IconToggleButtonColors) other).checkedContentColor) == true) goto L28;
        return false;
    L28:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.contentColor);
        return (((((((result2 * 31) + Color.m4373hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContentColor)) * 31) + Color.m4373hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.checkedContentColor);
    }
}
