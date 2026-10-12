package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010 R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonDefaults;", "", "()V", "LargeIconSize", "Landroidx/compose/ui/unit/Dp;", "getLargeIconSize-D9Ej5fM", "()F", "F", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "extendedFabShape", "Landroidx/compose/ui/graphics/Shape;", "getExtendedFabShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "largeShape", "getLargeShape", "shape", "getShape", "smallShape", "getSmallShape", "bottomAppBarFabElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "bottomAppBarFabElevation-a9UjIt4", "(FFFF)Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "loweredElevation", "loweredElevation-xZ9-QkE", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = null;
    private static final float LargeIconSize = 0.0f;

    private FloatingActionButtonDefaults() {
    }

    static {
        INSTANCE = new FloatingActionButtonDefaults();
        LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m3320getIconSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2245getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -53247565, "C410@19302L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-53247565, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:410)");
    L5:
        Shape r0 = ShapesKt.getValue(FabPrimaryTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getSmallShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 394933381, "C414@19461L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(394933381, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:414)");
    L5:
        Shape r0 = ShapesKt.getValue(FabPrimarySmallTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getLargeShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1835912187, "C418@19620L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1835912187, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:418)");
    L5:
        Shape r0 = ShapesKt.getValue(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getExtendedFabShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -536021915, "C422@19792L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-536021915, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:422)");
    L5:
        Shape r0 = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1855656391, "C426@19954L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1855656391, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:426)");
    L5:
        long r0 = ColorSchemeKt.getValue(FabPrimaryTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m2244elevationxZ9QkE(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -241106249, "C(elevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp,2:c#ui.unit.Dp):FloatingActionButton.kt#uh7d8r");
        if ((r14 & 1) == 0) goto L5;
        float defaultElevation2 = FabPrimaryTokens.INSTANCE.m3337getContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r14 & 2) == 0) goto L9;
        float pressedElevation2 = FabPrimaryTokens.INSTANCE.m3347getPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r14 & 4) == 0) goto L13;
        float focusedElevation2 = FabPrimaryTokens.INSTANCE.m3340getFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r14 & 8) == 0) goto L17;
        float hoveredElevation2 = FabPrimaryTokens.INSTANCE.m3341getHoverContainerElevationD9Ej5fM();
        float hoveredElevation3 = hoveredElevation2;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-241106249, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:446)");
    L21:
        FloatingActionButtonElevation r1 = new FloatingActionButtonElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation3, null);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        hoveredElevation3 = hoveredElevation;
        goto L19
    L13:
        focusedElevation3 = focusedElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m2246loweredElevationxZ9QkE(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -285065125, "C(loweredElevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp,2:c#ui.unit.Dp):FloatingActionButton.kt#uh7d8r");
        if ((r14 & 1) == 0) goto L5;
        float defaultElevation2 = FabPrimaryTokens.INSTANCE.m3343getLoweredContainerElevationD9Ej5fM();
        float defaultElevation3 = defaultElevation2;
    L7:
        if ((r14 & 2) == 0) goto L9;
        float pressedElevation2 = FabPrimaryTokens.INSTANCE.m3346getLoweredPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r14 & 4) == 0) goto L13;
        float focusedElevation2 = FabPrimaryTokens.INSTANCE.m3344getLoweredFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r14 & 8) == 0) goto L17;
        float hoveredElevation2 = FabPrimaryTokens.INSTANCE.m3345getLoweredHoverContainerElevationD9Ej5fM();
        float hoveredElevation3 = hoveredElevation2;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-285065125, $changed, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:470)");
    L21:
        FloatingActionButtonElevation r1 = new FloatingActionButtonElevation(defaultElevation3, pressedElevation3, focusedElevation3, hoveredElevation3, null);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        hoveredElevation3 = hoveredElevation;
        goto L19
    L13:
        focusedElevation3 = focusedElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        defaultElevation3 = defaultElevation;
        goto L7
    }

    /* JADX INFO: renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m2242bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults r1, float r2, float r3, float r4, float r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L5;
        r2 = Dp.m6973constructorimpl(0);
    L5:
        int $i$f$getDp = r6 & 2;
        if ($i$f$getDp == 0) goto L8;
        r3 = Dp.m6973constructorimpl(0);
    L8:
        int $i$f$getDp2 = r6 & 4;
        if ($i$f$getDp2 == 0) goto L12;
        r4 = Dp.m6973constructorimpl(0);
    L12:
        if ((r6 & 8) == 0) goto L15;
        r5 = Dp.m6973constructorimpl(0);
    L15:
        return r1.m2243bottomAppBarFabElevationa9UjIt4(r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m2243bottomAppBarFabElevationa9UjIt4(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation) {
        return new FloatingActionButtonElevation(defaultElevation, pressedElevation, focusedElevation, hoveredElevation, null);
    }
}
