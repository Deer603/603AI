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

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0017¢\u0006\u0002\u0010'J+\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0017¢\u0006\u0002\u0010'J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010*J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0017¢\u0006\u0002\u0010'J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010*J+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0017¢\u0006\u0002\u0010'R\u0016\u0010\u0011\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0017\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+²\u0006\n\u0010,\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldColors;", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "equals", "other", "", "hashCode", "", "indicatorColor", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release", "focused"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultTextFieldColors implements TextFieldColors {
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
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, DefaultConstructorMarker r43) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41);
    }

    private DefaultTextFieldColors(long textColor, long disabledTextColor, long cursorColor, long errorCursorColor, long focusedIndicatorColor, long unfocusedIndicatorColor, long errorIndicatorColor, long disabledIndicatorColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long backgroundColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor) {
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
        $composer.startReplaceGroup(1016171324);
        ComposerKt.sourceInformation($composer, "C(leadingIconColor)794@36709L207:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1016171324, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:793)");
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
    public State<Color> leadingIconColor(boolean enabled, boolean isError, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1519634405);
        ComposerKt.sourceInformation($composer, "C(leadingIconColor)P(!1,2)809@37110L207:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-1519634405, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:808)");
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
        $composer.startReplaceGroup(225259054);
        ComposerKt.sourceInformation($composer, "C(trailingIconColor)821@37481L210:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(225259054, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:820)");
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
        $composer.startReplaceGroup(1383318157);
        ComposerKt.sourceInformation($composer, "C(trailingIconColor)P(!1,2)836@37886L210:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1383318157, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:835)");
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
    public State<Color> indicatorColor(boolean enabled, boolean isError, InteractionSource interactionSource, Composer $composer, int $changed) {
        $composer.startReplaceGroup(998675979);
        ComposerKt.sourceInformation($composer, "C(indicatorColor)P(!1,2)851@38313L25:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(998675979, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:850)");
    L5:
        State<Boolean> r9 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer, ($changed >> 6) & 14);
        if (enabled == true) goto L8;
        long targetValue = this.disabledIndicatorColor;
    L15:
        if (enabled == false) goto L17;
        $composer.startReplaceGroup(1614254271);
        ComposerKt.sourceInformation($composer, "861@38636L75");
        State<Color> r2 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(targetValue, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer, 48, 12);
        $composer.endReplaceGroup();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        $composer.endReplaceGroup();
        return r2;
    L17:
        $composer.startReplaceGroup(1614357129);
        ComposerKt.sourceInformation($composer, "863@38741L33");
        r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(targetValue), $composer, 0);
        $composer.endReplaceGroup();
        goto L19
    L8:
        if (isError == false) goto L11;
        targetValue = this.errorIndicatorColor;
        goto L15
    L11:
        if (indicatorColor$lambda$0(r9) == false) goto L13;
        targetValue = this.focusedIndicatorColor;
        goto L15
    L13:
        targetValue = this.unfocusedIndicatorColor;
        goto L15
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> backgroundColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1423938813);
        ComposerKt.sourceInformation($composer, "C(backgroundColor)869@38890L37:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1423938813, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:868)");
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
        $composer.startReplaceGroup(264799724);
        ComposerKt.sourceInformation($composer, "C(placeholderColor)874@39034L81:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(264799724, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:873)");
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
        $composer.startReplaceGroup(727091888);
        ComposerKt.sourceInformation($composer, "C(labelColor)883@39326L25,892@39604L33:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(727091888, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:882)");
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
        if (labelColor$lambda$1(r0) == false) goto L13;
        targetValue = this.focusedLabelColor;
        goto L14
    L13:
        targetValue = this.unfocusedLabelColor;
        goto L14
    }

    private static final boolean labelColor$lambda$1(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State<Color> textColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(9804418);
        ComposerKt.sourceInformation($composer, "C(textColor)897@39737L67:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(9804418, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:896)");
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
        $composer.startReplaceGroup(-1446422485);
        ComposerKt.sourceInformation($composer, "C(cursorColor)902@39906L68:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1446422485, $changed, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:901)");
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
    L74:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L74;
        DefaultTextFieldColors r2 = (DefaultTextFieldColors) other;
        if (Color.m4367equalsimpl0(this.textColor, ((DefaultTextFieldColors) other).textColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.disabledTextColor, ((DefaultTextFieldColors) other).disabledTextColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.cursorColor, ((DefaultTextFieldColors) other).cursorColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.errorCursorColor, ((DefaultTextFieldColors) other).errorCursorColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.focusedIndicatorColor, ((DefaultTextFieldColors) other).focusedIndicatorColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.unfocusedIndicatorColor, ((DefaultTextFieldColors) other).unfocusedIndicatorColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.errorIndicatorColor, ((DefaultTextFieldColors) other).errorIndicatorColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.disabledIndicatorColor, ((DefaultTextFieldColors) other).disabledIndicatorColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.leadingIconColor, ((DefaultTextFieldColors) other).leadingIconColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconColor, ((DefaultTextFieldColors) other).disabledLeadingIconColor) == true) goto L41;
        return false;
    L41:
        if (Color.m4367equalsimpl0(this.errorLeadingIconColor, ((DefaultTextFieldColors) other).errorLeadingIconColor) == true) goto L44;
        return false;
    L44:
        if (Color.m4367equalsimpl0(this.trailingIconColor, ((DefaultTextFieldColors) other).trailingIconColor) == true) goto L47;
        return false;
    L47:
        if (Color.m4367equalsimpl0(this.disabledTrailingIconColor, ((DefaultTextFieldColors) other).disabledTrailingIconColor) == true) goto L50;
        return false;
    L50:
        if (Color.m4367equalsimpl0(this.errorTrailingIconColor, ((DefaultTextFieldColors) other).errorTrailingIconColor) == true) goto L53;
        return false;
    L53:
        if (Color.m4367equalsimpl0(this.backgroundColor, ((DefaultTextFieldColors) other).backgroundColor) == true) goto L56;
        return false;
    L56:
        if (Color.m4367equalsimpl0(this.focusedLabelColor, ((DefaultTextFieldColors) other).focusedLabelColor) == true) goto L59;
        return false;
    L59:
        if (Color.m4367equalsimpl0(this.unfocusedLabelColor, ((DefaultTextFieldColors) other).unfocusedLabelColor) == true) goto L62;
        return false;
    L62:
        if (Color.m4367equalsimpl0(this.disabledLabelColor, ((DefaultTextFieldColors) other).disabledLabelColor) == true) goto L65;
        return false;
    L65:
        if (Color.m4367equalsimpl0(this.errorLabelColor, ((DefaultTextFieldColors) other).errorLabelColor) == true) goto L68;
        return false;
    L68:
        if (Color.m4367equalsimpl0(this.placeholderColor, ((DefaultTextFieldColors) other).placeholderColor) == true) goto L71;
        return false;
    L71:
        if (Color.m4367equalsimpl0(this.disabledPlaceholderColor, ((DefaultTextFieldColors) other).disabledPlaceholderColor) == true) goto L73;
        return false;
    L73:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.textColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.disabledTextColor);
        return (((((((((((((((((((((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.cursorColor)) * 31) + Color.m4373hashCodeimpl(this.errorCursorColor)) * 31) + Color.m4373hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.leadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.trailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.backgroundColor)) * 31) + Color.m4373hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4373hashCodeimpl(this.errorLabelColor)) * 31) + Color.m4373hashCodeimpl(this.placeholderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledPlaceholderColor);
    }
}
