package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001f\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J+\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0017¢\u0006\u0002\u0010(J+\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0017¢\u0006\u0002\u0010(J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010+J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010+J+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0017¢\u0006\u0002\u0010(R\u0016\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0018\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0013\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0017\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,²\u0006\n\u0010-\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "equals", "other", "", "hashCode", "", "indicatorColor", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release", "focused"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedTrailingIconColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldForExposedDropdownMenusColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, DefaultConstructorMarker r45) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43);
    }

    private DefaultTextFieldForExposedDropdownMenusColors(long textColor, long disabledTextColor, long cursorColor, long errorCursorColor, long focusedIndicatorColor, long unfocusedIndicatorColor, long errorIndicatorColor, long disabledIndicatorColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long focusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long backgroundColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor) {
        this.textColor = textColor;
        this.disabledTextColor = disabledTextColor;
        this.cursorColor = cursorColor;
        this.errorCursorColor = errorCursorColor;
        this.focusedIndicatorColor = focusedIndicatorColor;
        this.unfocusedIndicatorColor = unfocusedIndicatorColor;
        this.errorIndicatorColor = errorIndicatorColor;
        this.disabledIndicatorColor = disabledIndicatorColor;
        this.leadingIconColor = leadingIconColor;
        this.disabledLeadingIconColor = disabledLeadingIconColor;
        this.errorLeadingIconColor = errorLeadingIconColor;
        this.trailingIconColor = trailingIconColor;
        this.focusedTrailingIconColor = focusedTrailingIconColor;
        this.disabledTrailingIconColor = disabledTrailingIconColor;
        this.errorTrailingIconColor = errorTrailingIconColor;
        this.backgroundColor = backgroundColor;
        this.focusedLabelColor = focusedLabelColor;
        this.unfocusedLabelColor = unfocusedLabelColor;
        this.disabledLabelColor = disabledLabelColor;
        this.errorLabelColor = errorLabelColor;
        this.placeholderColor = placeholderColor;
        this.disabledPlaceholderColor = disabledPlaceholderColor;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> leadingIconColor(boolean enabled, boolean isError, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-776179197);
        ComposerKt.sourceInformation($composer, "C(leadingIconColor)505@24664L207:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-776179197, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:504)");
    L6:
        if (enabled == true) goto L8;
        long r0 = this.disabledLeadingIconColor;
    L11:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r1;
    L8:
        if (isError == false) goto L10;
        r0 = this.errorLeadingIconColor;
        goto L11
    L10:
        r0 = this.leadingIconColor;
        goto L11
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> trailingIconColor(boolean enabled, boolean isError, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1665901393);
        ComposerKt.sourceInformation($composer, "C(trailingIconColor)517@25035L210:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1665901393, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:516)");
    L6:
        if (enabled == true) goto L8;
        long r0 = this.disabledTrailingIconColor;
    L11:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r1;
    L8:
        if (isError == false) goto L10;
        r0 = this.errorTrailingIconColor;
        goto L11
    L10:
        r0 = this.trailingIconColor;
        goto L11
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> trailingIconColor(boolean enabled, boolean isError, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(79259602);
        ComposerKt.sourceInformation($composer, "C(trailingIconColor)P(!1,2)532@25465L25,534@25507L262:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(79259602, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:531)");
    L5:
        State<Boolean> r0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer, ($changed >> 6) & 14);
        if (enabled == true) goto L8;
        long r1 = this.disabledTrailingIconColor;
    L14:
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r1), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventEnd();
    L17:
        $composer.endReplaceGroup();
        return r2;
    L8:
        if (isError == false) goto L11;
        r1 = this.errorTrailingIconColor;
        goto L14
    L11:
        if (trailingIconColor$lambda$0(r0) == false) goto L13;
        r1 = this.focusedTrailingIconColor;
        goto L14
    L13:
        r1 = this.trailingIconColor;
        goto L14
    }

    private static final boolean trailingIconColor$lambda$0(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> indicatorColor(boolean enabled, boolean isError, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(476110356);
        ComposerKt.sourceInformation($composer, "C(indicatorColor)P(!1,2)550@25986L25:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(476110356, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:549)");
    L5:
        State<Boolean> r9 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer, ($changed >> 6) & 14);
        if (enabled == true) goto L8;
        long targetValue = this.disabledIndicatorColor;
    L15:
        if (enabled == false) goto L17;
        $composer.startReplaceGroup(-889472281);
        ComposerKt.sourceInformation($composer, "560@26309L75");
        State<Color> r2 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(targetValue, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer, 48, 12);
        $composer.endReplaceGroup();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        $composer.endReplaceGroup();
        return r2;
    L17:
        $composer.startReplaceGroup(-889369423);
        ComposerKt.sourceInformation($composer, "562@26414L33");
        r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(targetValue), $composer, 0);
        $composer.endReplaceGroup();
        goto L19
    L8:
        if (isError == false) goto L11;
        targetValue = this.errorIndicatorColor;
        goto L15
    L11:
        if (indicatorColor$lambda$1(r9) == false) goto L13;
        targetValue = this.focusedIndicatorColor;
        goto L15
    L13:
        targetValue = this.unfocusedIndicatorColor;
        goto L15
    }

    private static final boolean indicatorColor$lambda$1(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> backgroundColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-28962788);
        ComposerKt.sourceInformation($composer, "C(backgroundColor)568@26563L37:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-28962788, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:567)");
    L5:
        State<Color> r0 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(this.backgroundColor), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        $composer.endReplaceGroup();
        return r0;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> placeholderColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1742462291);
        ComposerKt.sourceInformation($composer, "C(placeholderColor)573@26707L81:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1742462291, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:572)");
    L5:
        if (enabled == false) goto L7;
        long r0 = this.placeholderColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.disabledPlaceholderColor;
        goto L8
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> labelColor(boolean enabled, boolean error, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1749156593);
        ComposerKt.sourceInformation($composer, "C(labelColor)582@26999L25,591@27277L33:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1749156593, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:581)");
    L5:
        State<Boolean> r0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer, ($changed >> 6) & 14);
        if (enabled == true) goto L8;
        long targetValue = this.disabledLabelColor;
    L14:
        State<Color> r3 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(targetValue), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventEnd();
    L17:
        $composer.endReplaceGroup();
        return r3;
    L8:
        if (error == false) goto L11;
        targetValue = this.errorLabelColor;
        goto L14
    L11:
        if (labelColor$lambda$2(r0) == false) goto L13;
        targetValue = this.focusedLabelColor;
        goto L14
    L13:
        targetValue = this.unfocusedLabelColor;
        goto L14
    }

    private static final boolean labelColor$lambda$2(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> textColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(394526077);
        ComposerKt.sourceInformation($composer, "C(textColor)596@27410L67:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(394526077, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:595)");
    L5:
        if (enabled == false) goto L7;
        long r0 = this.textColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.disabledTextColor;
        goto L8
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> cursorColor(boolean isError, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-930693132);
        ComposerKt.sourceInformation($composer, "C(cursorColor)601@27579L68:ExposedDropdownMenu.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-930693132, $changed, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:600)");
    L5:
        if (isError == false) goto L7;
        long r0 = this.errorCursorColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.cursorColor;
        goto L8
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L77:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L77;
        DefaultTextFieldForExposedDropdownMenusColors r2 = (DefaultTextFieldForExposedDropdownMenusColors) other;
        if (Color.m4367equalsimpl0(this.textColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).textColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.disabledTextColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).disabledTextColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.cursorColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).cursorColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.errorCursorColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).errorCursorColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.focusedIndicatorColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).focusedIndicatorColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.unfocusedIndicatorColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).unfocusedIndicatorColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.errorIndicatorColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).errorIndicatorColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.disabledIndicatorColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).disabledIndicatorColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.leadingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).leadingIconColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).disabledLeadingIconColor) == true) goto L41;
        return false;
    L41:
        if (Color.m4367equalsimpl0(this.errorLeadingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).errorLeadingIconColor) == true) goto L44;
        return false;
    L44:
        if (Color.m4367equalsimpl0(this.trailingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).trailingIconColor) == true) goto L47;
        return false;
    L47:
        if (Color.m4367equalsimpl0(this.focusedTrailingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).focusedTrailingIconColor) == true) goto L50;
        return false;
    L50:
        if (Color.m4367equalsimpl0(this.disabledTrailingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).disabledTrailingIconColor) == true) goto L53;
        return false;
    L53:
        if (Color.m4367equalsimpl0(this.errorTrailingIconColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).errorTrailingIconColor) == true) goto L56;
        return false;
    L56:
        if (Color.m4367equalsimpl0(this.backgroundColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).backgroundColor) == true) goto L59;
        return false;
    L59:
        if (Color.m4367equalsimpl0(this.focusedLabelColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).focusedLabelColor) == true) goto L62;
        return false;
    L62:
        if (Color.m4367equalsimpl0(this.unfocusedLabelColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).unfocusedLabelColor) == true) goto L65;
        return false;
    L65:
        if (Color.m4367equalsimpl0(this.disabledLabelColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).disabledLabelColor) == true) goto L68;
        return false;
    L68:
        if (Color.m4367equalsimpl0(this.errorLabelColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).errorLabelColor) == true) goto L71;
        return false;
    L71:
        if (Color.m4367equalsimpl0(this.placeholderColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).placeholderColor) == true) goto L74;
        return false;
    L74:
        if (Color.m4367equalsimpl0(this.disabledPlaceholderColor, ((DefaultTextFieldForExposedDropdownMenusColors) other).disabledPlaceholderColor) == true) goto L76;
        return false;
    L76:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.textColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.disabledTextColor);
        return (((((((((((((((((((((((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.cursorColor)) * 31) + Color.m4373hashCodeimpl(this.errorCursorColor)) * 31) + Color.m4373hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.leadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.trailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.backgroundColor)) * 31) + Color.m4373hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4373hashCodeimpl(this.errorLabelColor)) * 31) + Color.m4373hashCodeimpl(this.placeholderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledPlaceholderColor);
    }
}
