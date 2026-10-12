package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledSelectedColor-0d7_KjU", "()J", "J", "getDisabledUnselectedColor-0d7_KjU", "getSelectedColor-0d7_KjU", "getUnselectedColor-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RadioButtonColors;", "equals", "", "other", "hashCode", "", "radioColor", "Landroidx/compose/runtime/State;", "enabled", "selected", "radioColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    static {
    }

    public /* synthetic */ RadioButtonColors(long r1, long r3, long r5, long r7, DefaultConstructorMarker r9) {
        this(r1, r3, r5, r7);
    }

    private RadioButtonColors(long selectedColor, long unselectedColor, long disabledSelectedColor, long disabledUnselectedColor) {
        this.selectedColor = selectedColor;
        this.unselectedColor = unselectedColor;
        this.disabledSelectedColor = disabledSelectedColor;
        this.disabledUnselectedColor = disabledUnselectedColor;
    }

    /* JADX INFO: renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2519getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* JADX INFO: renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2520getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2517getDisabledSelectedColor0d7_KjU() {
        return this.disabledSelectedColor;
    }

    /* JADX INFO: renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2518getDisabledUnselectedColor0d7_KjU() {
        return this.disabledUnselectedColor;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m2515copyjRlVdoo$default(RadioButtonColors r9, long r10, long r12, long r14, long r16, int r18, Object r19) {
        if ((r18 & 1) == 0) goto L5;
        long r1 = r9.selectedColor;
    L7:
        if ((r18 & 2) == 0) goto L9;
        long r3 = r9.unselectedColor;
    L11:
        if ((r18 & 4) == 0) goto L13;
        long r5 = r9.disabledSelectedColor;
    L15:
        if ((r18 & 8) == 0) goto L17;
        long r7 = r9.disabledUnselectedColor;
    L19:
        return r9.m2516copyjRlVdoo(r1, r3, r5, r7);
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
    public final RadioButtonColors m2516copyjRlVdoo(long selectedColor, long unselectedColor, long disabledSelectedColor, long disabledUnselectedColor) {
        boolean r10 = true;
        if (selectedColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = selectedColor;
    L10:
        if (unselectedColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = unselectedColor;
    L17:
        if (disabledSelectedColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = disabledSelectedColor;
    L24:
        if (disabledUnselectedColor != 16) goto L27;
        r10 = false;
    L27:
        if (r10 == false) goto L29;
        long r19 = disabledUnselectedColor;
    L31:
        return new RadioButtonColors(r13, r15, r17, r19, null);
    L29:
        r19 = this.disabledUnselectedColor;
        goto L31
    L22:
        r17 = this.disabledSelectedColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.unselectedColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.selectedColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    public final State<Color> radioColor$material3_release(boolean enabled, boolean selected, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1840145292, "C(radioColor):RadioButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-1840145292, $changed, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
    L6:
        if (enabled == false) goto L9;
        if (selected == false) goto L9;
        long r0 = this.selectedColor;
    L16:
        long target = r0;
        if (enabled == false) goto L19;
        $composer.startReplaceGroup(350067971);
        ComposerKt.sourceInformation($composer, "240@10272L75");
        Composer $composer2 = $composer;
        State<Color> r13 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer2, 48, 12);
        $composer2.endReplaceGroup();
    L21:
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r13;
    L19:
        $composer2 = $composer;
        $composer2.startReplaceGroup(350170674);
        ComposerKt.sourceInformation($composer2, "242@10377L28");
        r13 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer2, 0);
        $composer2.endReplaceGroup();
    L9:
        if (enabled == false) goto L12;
        if (selected == true) goto L12;
        r0 = this.unselectedColor;
    L12:
        if (enabled == true) goto L15;
        if (selected == false) goto L15;
        r0 = this.disabledSelectedColor;
    L15:
        r0 = this.disabledUnselectedColor;
        goto L16
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L23:
        return false;
    L8:
        if ((other instanceof RadioButtonColors) == false) goto L23;
        if (Color.m4367equalsimpl0(this.selectedColor, ((RadioButtonColors) other).selectedColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.unselectedColor, ((RadioButtonColors) other).unselectedColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.disabledSelectedColor, ((RadioButtonColors) other).disabledSelectedColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledUnselectedColor, ((RadioButtonColors) other).disabledUnselectedColor) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.selectedColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.unselectedColor);
        return (((result2 * 31) + Color.m4373hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUnselectedColor);
    }
}
