package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)JN\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010 Jl\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final ChipDefaults INSTANCE = null;
    public static final float LeadingIconOpacity = 0.54f;
    private static final float LeadingIconSize = 0.0f;
    private static final float MinHeight = 0.0f;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize = 0.0f;
    private static final float SelectedIconSize = 0.0f;

    private ChipDefaults() {
    }

    static {
        INSTANCE = new ChipDefaults();
        MinHeight = Dp.m6973constructorimpl(32);
        OutlinedBorderSize = Dp.m6973constructorimpl(1);
        LeadingIconSize = Dp.m6973constructorimpl(20);
        SelectedIconSize = Dp.m6973constructorimpl(18);
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1584getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1581chipColors5tl4gsc(long backgroundColor, long contentColor, long leadingIconContentColor, long disabledBackgroundColor, long disabledContentColor, long disabledLeadingIconContentColor, Composer $composer, int $changed, int r36) {
        ComposerKt.sourceInformationMarkerStart($composer, 1838505436, "C(chipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)377@17047L6,379@17162L6,380@17223L6,383@17425L6,384@17485L8,385@17564L6,387@17670L8,389@17809L8:Chip.kt#jmzs0o");
        if ((r36 & 1) == 0) goto L5;
        long backgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L7:
        if ((r36 & 2) == 0) goto L9;
        long contentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r36 & 4) == 0) goto L13;
        long leadingIconContentColor2 = Color.m4365copywmQWz5c$default(contentColor2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r36 & 8) == 0) goto L17;
        long disabledBackgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L19:
        if ((r36 & 16) == 0) goto L21;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L23:
        if ((r36 & 32) == 0) goto L25;
        long leadingIconContentColor3 = leadingIconContentColor2;
        long disabledLeadingIconContentColor2 = Color.m4365copywmQWz5c$default(leadingIconContentColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1838505436, $changed, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:391)");
    L30:
        DefaultChipColors r6 = new DefaultChipColors(backgroundColor2, contentColor2, leadingIconContentColor2, disabledBackgroundColor2, disabledContentColor2, disabledLeadingIconContentColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L25:
        disabledLeadingIconContentColor2 = disabledLeadingIconContentColor;
        goto L27
    L21:
        disabledContentColor2 = disabledContentColor;
        goto L23
    L17:
        disabledBackgroundColor2 = disabledBackgroundColor;
        goto L19
    L13:
        leadingIconContentColor2 = leadingIconContentColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    /* JADX INFO: renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1587outlinedChipColors5tl4gsc(long backgroundColor, long contentColor, long leadingIconContentColor, long disabledBackgroundColor, long disabledContentColor, long disabledLeadingIconContentColor, Composer $composer, int $changed, int r38) {
        ComposerKt.sourceInformationMarkerStart($composer, -1763922662, "C(outlinedChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)415@19138L6,416@19198L6,420@19480L8,422@19619L8,424@19679L370:Chip.kt#jmzs0o");
        if ((r38 & 1) == 0) goto L5;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L7:
        if ((r38 & 2) == 0) goto L9;
        long contentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r38 & 4) == 0) goto L13;
        long leadingIconContentColor2 = Color.m4365copywmQWz5c$default(contentColor2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r38 & 8) == 0) goto L17;
        long disabledBackgroundColor2 = backgroundColor2;
    L19:
        if ((r38 & 16) == 0) goto L21;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L23:
        if ((r38 & 32) == 0) goto L25;
        long leadingIconContentColor3 = leadingIconContentColor2;
        long disabledLeadingIconContentColor2 = Color.m4365copywmQWz5c$default(leadingIconContentColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(-1763922662, $changed, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:424)");
    L29:
        int r1 = (((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed);
        long backgroundColor3 = backgroundColor2;
        long backgroundColor4 = contentColor2;
        ChipColors r15 = m1581chipColors5tl4gsc(backgroundColor3, backgroundColor4, leadingIconContentColor2, disabledBackgroundColor2, disabledContentColor2, disabledLeadingIconContentColor2, $composer, r1, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L25:
        disabledLeadingIconContentColor2 = disabledLeadingIconContentColor;
        goto L27
    L21:
        disabledContentColor2 = disabledContentColor;
        goto L23
    L17:
        disabledBackgroundColor2 = disabledBackgroundColor;
        goto L19
    L13:
        leadingIconContentColor2 = leadingIconContentColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    /* JADX INFO: renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1582filterChipColorsJ08w3E(long backgroundColor, long contentColor, long leadingIconColor, long disabledBackgroundColor, long disabledContentColor, long disabledLeadingIconColor, long selectedBackgroundColor, long selectedContentColor, long selectedLeadingIconColor, Composer $composer, int $changed, int r48) {
        ComposerKt.sourceInformationMarkerStart($composer, 830140629, "C(filterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)450@21058L6,452@21173L6,453@21234L6,456@21421L6,457@21481L8,458@21560L6,460@21666L8,462@21791L8,464@21890L6,468@22073L6,472@22258L6:Chip.kt#jmzs0o");
        if ((r48 & 1) == 0) goto L5;
        long backgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L7:
        if ((r48 & 2) == 0) goto L9;
        long contentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r48 & 4) == 0) goto L13;
        long leadingIconColor2 = Color.m4365copywmQWz5c$default(contentColor2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r48 & 8) == 0) goto L17;
        long disabledBackgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L19:
        if ((r48 & 16) == 0) goto L21;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L23:
        if ((r48 & 32) == 0) goto L25;
        long leadingIconColor3 = leadingIconColor2;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(leadingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r48 & 64) == 0) goto L29;
        long selectedBackgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), backgroundColor2);
    L31:
        if ((r48 & 128) == 0) goto L33;
        long selectedContentColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), contentColor2);
    L35:
        if ((r48 & 256) == 0) goto L37;
        long selectedLeadingIconColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), leadingIconColor2);
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(830140629, $changed, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:476)");
    L42:
        DefaultSelectableChipColors r7 = new DefaultSelectableChipColors(backgroundColor2, contentColor2, leadingIconColor2, disabledBackgroundColor2, disabledContentColor2, disabledLeadingIconColor2, selectedBackgroundColor2, selectedContentColor2, selectedLeadingIconColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L37:
        selectedLeadingIconColor2 = selectedLeadingIconColor;
        goto L39
    L33:
        selectedContentColor2 = selectedContentColor;
        goto L35
    L29:
        selectedBackgroundColor2 = selectedBackgroundColor;
        goto L31
    L25:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L27
    L21:
        disabledContentColor2 = disabledContentColor;
        goto L23
    L17:
        disabledBackgroundColor2 = disabledBackgroundColor;
        goto L19
    L13:
        leadingIconColor2 = leadingIconColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    /* JADX INFO: renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1588outlinedFilterChipColorsJ08w3E(long backgroundColor, long contentColor, long leadingIconColor, long disabledBackgroundColor, long disabledContentColor, long disabledLeadingIconColor, long selectedBackgroundColor, long selectedContentColor, long selectedLeadingIconColor, Composer $composer, int $changed, int r48) {
        ComposerKt.sourceInformationMarkerStart($composer, 346878099, "C(outlinedFilterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)504@23968L6,505@24028L6,509@24287L8,511@24412L8,513@24511L6,517@24695L6,521@24880L6:Chip.kt#jmzs0o");
        if ((r48 & 1) == 0) goto L5;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L7:
        if ((r48 & 2) == 0) goto L9;
        long contentColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r48 & 4) == 0) goto L13;
        long leadingIconColor2 = Color.m4365copywmQWz5c$default(contentColor2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r48 & 8) == 0) goto L17;
        long disabledBackgroundColor2 = backgroundColor2;
    L19:
        if ((r48 & 16) == 0) goto L21;
        long contentColor3 = contentColor2;
        long disabledContentColor2 = Color.m4365copywmQWz5c$default(contentColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
    L23:
        if ((r48 & 32) == 0) goto L25;
        long leadingIconColor3 = leadingIconColor2;
        long disabledLeadingIconColor2 = Color.m4365copywmQWz5c$default(leadingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r48 & 64) == 0) goto L29;
        long selectedBackgroundColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), backgroundColor2);
    L31:
        if ((r48 & 128) == 0) goto L33;
        long selectedContentColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), contentColor2);
    L35:
        if ((r48 & 256) == 0) goto L37;
        long selectedLeadingIconColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), leadingIconColor2);
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(346878099, $changed, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:525)");
    L42:
        DefaultSelectableChipColors r7 = new DefaultSelectableChipColors(backgroundColor2, contentColor2, leadingIconColor2, disabledBackgroundColor2, disabledContentColor2, disabledLeadingIconColor2, selectedBackgroundColor2, selectedContentColor2, selectedLeadingIconColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L37:
        selectedLeadingIconColor2 = selectedLeadingIconColor;
        goto L39
    L33:
        selectedContentColor2 = selectedContentColor;
        goto L35
    L29:
        selectedBackgroundColor2 = selectedBackgroundColor;
        goto L31
    L25:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L27
    L21:
        disabledContentColor2 = disabledContentColor;
        goto L23
    L17:
        disabledBackgroundColor2 = disabledBackgroundColor;
        goto L19
    L13:
        leadingIconColor2 = leadingIconColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        backgroundColor2 = backgroundColor;
        goto L7
    }

    public final BorderStroke getOutlinedBorder(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1650225597, "C(<get-outlinedBorder>)543@25807L6:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1650225597, $changed, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:541)");
    L5:
        BorderStroke r0 = BorderStrokeKt.m261BorderStrokecXLIe8U(OutlinedBorderSize, Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1585getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1583getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* JADX INFO: renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1586getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }
}
