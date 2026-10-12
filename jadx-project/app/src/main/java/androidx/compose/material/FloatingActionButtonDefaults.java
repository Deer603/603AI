package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = null;

    static {
        INSTANCE = new FloatingActionButtonDefaults();
    }

    private FloatingActionButtonDefaults() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* JADX INFO: renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1682elevationixp7dh8(float defaultElevation, float pressedElevation, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -654132828, "C(elevation)P(0:c#ui.unit.Dp,1:c#ui.unit.Dp)215@9624L154:FloatingActionButton.kt#jmzs0o");
        if ((r14 & 1) == 0) goto L5;
        float defaultElevation2 = Dp.m6973constructorimpl(6);
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r14 & 2) == 0) goto L9;
        float pressedElevation2 = Dp.m6973constructorimpl(12);
        float pressedElevation3 = pressedElevation2;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-654132828, $changed, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:215)");
    L13:
        int $this$dp$iv = $changed & 14;
        FloatingActionButtonElevation r10 = m1683elevationxZ9QkE(defaultElevation3, pressedElevation3, Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(8), $composer, (($this$dp$iv | 3456) | ($changed & 112)) | (($changed << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1683elevationxZ9QkE(float defaultElevation, float pressedElevation, float hoveredElevation, float focusedElevation, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, 380403812, "C(elevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)239@10587L367:FloatingActionButton.kt#jmzs0o");
        if ((r14 & 1) == 0) goto L5;
        float defaultElevation2 = Dp.m6973constructorimpl(6);
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r14 & 2) == 0) goto L9;
        float pressedElevation2 = Dp.m6973constructorimpl(12);
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r14 & 4) == 0) goto L13;
        float hoveredElevation2 = Dp.m6973constructorimpl(8);
        float hoveredElevation3 = hoveredElevation2;
    L15:
        if ((r14 & 8) == 0) goto L17;
        float focusedElevation2 = Dp.m6973constructorimpl(8);
        float focusedElevation3 = focusedElevation2;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(380403812, $changed, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
    L21:
        ComposerKt.sourceInformationMarkerStart($composer, -1100371580, "CC(remember):FloatingActionButton.kt#9igjgp");
        boolean r10 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L26;
        if ($composer.changed(defaultElevation3) == false) goto L26;
    L27:
        boolean r8 = true;
    L30:
        if ((($changed & 112) ^ 48) <= 32) goto L34;
        if ($composer.changed(pressedElevation3) == false) goto L34;
    L35:
        boolean r9 = true;
    L37:
        boolean r11 = r8 | r9;
        if ((($changed & 896) ^ 384) <= 256) goto L42;
        if ($composer.changed(hoveredElevation3) == false) goto L42;
    L43:
        boolean r12 = true;
    L45:
        boolean r13 = r11 | r12;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L50;
        if ($composer.changed(focusedElevation3) == false) goto L50;
    L51:
        r10 = true;
    L52:
        boolean invalid$iv = r13 | r10;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L55;
    L58:
        Object value$iv = new DefaultFloatingActionButtonElevation(defaultElevation3, pressedElevation3, hoveredElevation3, focusedElevation3, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L59:
        DefaultFloatingActionButtonElevation r15 = (DefaultFloatingActionButtonElevation) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
    L62:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L55:
        if (it$iv != Composer.Companion.getEmpty()) goto L59;
    L50:
        if (($changed & 3072) != 2048) goto L52;
    L42:
        if (($changed & 384) == 256) goto L43;
        r12 = false;
    L34:
        if (($changed & 48) == 32) goto L35;
        r9 = false;
    L26:
        if (($changed & 6) == 4) goto L27;
        r8 = false;
        goto L30
    L17:
        focusedElevation3 = focusedElevation;
        goto L19
    L13:
        hoveredElevation3 = hoveredElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }
}
