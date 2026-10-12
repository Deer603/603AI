package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"animateBorderStrokeAsState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release", "focused"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldDefaultsKt {
    /* JADX INFO: renamed from: access$animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final /* synthetic */ State m1831access$animateBorderStrokeAsStateNuRrP5Q(boolean enabled, boolean isError, InteractionSource interactionSource, TextFieldColors colors, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, int $changed) {
        return m1832animateBorderStrokeAsStateNuRrP5Q(enabled, isError, interactionSource, colors, focusedBorderThickness, unfocusedBorderThickness, $composer, $changed);
    }

    /* JADX INFO: renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    private static final State<BorderStroke> m1832animateBorderStrokeAsStateNuRrP5Q(boolean enabled, boolean isError, InteractionSource interactionSource, TextFieldColors colors, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1097899920, "C(animateBorderStrokeAsState)P(1,4,3!1,2:c#ui.unit.Dp,5:c#ui.unit.Dp)971@43402L25,972@43460L51,980@43841L107:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1097899920, $changed, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:970)");
    L5:
        State<Boolean> r8 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer, ($changed >> 6) & 14);
        State<Color> r9 = colors.indicatorColor(enabled, isError, interactionSource, $composer, ((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168));
        if (animateBorderStrokeAsState_NuRrP5Q$lambda$0(r8) == false) goto L8;
        float targetThickness = focusedBorderThickness;
    L10:
        if (enabled == false) goto L12;
        $composer.startReplaceGroup(773088894);
        ComposerKt.sourceInformation($composer, "976@43667L76");
        State<Dp> r1 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(targetThickness, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer, 48, 12);
        $composer.endReplaceGroup();
    L13:
        State<BorderStroke> r2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(r1.getValue().m6987unboximpl(), new SolidColor(r9.getValue().m4376unboximpl(), null), null), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L12:
        $composer.startReplaceGroup(773193116);
        ComposerKt.sourceInformation($composer, "978@43773L46");
        r1 = SnapshotStateKt.rememberUpdatedState(Dp.m6971boximpl(unfocusedBorderThickness), $composer, ($changed >> 15) & 14);
        $composer.endReplaceGroup();
        goto L13
    L8:
        targetThickness = unfocusedBorderThickness;
        goto L10
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }
}
