package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0088\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0088\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = null;

    /* JADX INFO: renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1620lightColors2qZNXz8$default(long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, int r43, Object r44) {
        if ((r43 & 1) == 0) goto L5;
        long r1 = ColorKt.Color(4284612846L);
    L7:
        if ((r43 & 2) == 0) goto L9;
        long r3 = ColorKt.Color(4281794739L);
    L11:
        if ((r43 & 4) == 0) goto L13;
        long r5 = ColorKt.Color(4278442694L);
    L15:
        if ((r43 & 8) == 0) goto L17;
        long r7 = ColorKt.Color(4278290310L);
    L19:
        if ((r43 & 16) == 0) goto L21;
        long r9 = Color.Companion.m4403getWhite0d7_KjU();
    L23:
        if ((r43 & 32) == 0) goto L25;
        long r11 = Color.Companion.m4403getWhite0d7_KjU();
    L27:
        if ((r43 & 64) == 0) goto L29;
        long r13 = ColorKt.Color(4289724448L);
    L31:
        if ((r43 & 128) == 0) goto L33;
        long r15 = Color.Companion.m4403getWhite0d7_KjU();
    L34:
        long r110 = r1;
        if ((r43 & 256) == 0) goto L37;
        long r2 = Color.Companion.m4392getBlack0d7_KjU();
    L38:
        long r36 = r2;
        if ((r43 & 512) == 0) goto L41;
        long r4 = Color.Companion.m4392getBlack0d7_KjU();
    L42:
        long r38 = r4;
        if ((r43 & 1024) == 0) goto L45;
        long r6 = Color.Companion.m4392getBlack0d7_KjU();
    L47:
        if ((r43 & 2048) == 0) goto L49;
        long r17 = Color.Companion.m4403getWhite0d7_KjU();
    L50:
        long r22 = r3;
        long r24 = r5;
        long r26 = r7;
        long r28 = r9;
        long r210 = r11;
        long r32 = r13;
        long r34 = r15;
        return m1619lightColors2qZNXz8(r110, r22, r24, r26, r28, r210, r32, r34, r36, r38, r6, r17);
    L49:
        r17 = r41;
        goto L50
    L45:
        r6 = r39;
        goto L47
    L41:
        r4 = r37;
        goto L42
    L37:
        r2 = r35;
        goto L38
    L33:
        r15 = r33;
        goto L34
    L29:
        r13 = r31;
        goto L31
    L25:
        r11 = r29;
        goto L27
    L21:
        r9 = r27;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r5 = r23;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1619lightColors2qZNXz8(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, true, null);
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1618darkColors2qZNXz8$default(long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, long r44, long r46, long r48, int r50, Object r51) {
        if ((r50 & 1) == 0) goto L5;
        long r1 = ColorKt.Color(4290479868L);
    L7:
        if ((r50 & 2) == 0) goto L9;
        long r3 = ColorKt.Color(4281794739L);
    L11:
        if ((r50 & 4) == 0) goto L13;
        long r5 = ColorKt.Color(4278442694L);
    L15:
        if ((r50 & 8) == 0) goto L17;
        long r7 = r5;
    L19:
        if ((r50 & 16) == 0) goto L21;
        long r12 = ColorKt.Color(4279374354L);
    L23:
        if ((r50 & 32) == 0) goto L25;
        long r9 = ColorKt.Color(4279374354L);
    L27:
        if ((r50 & 64) == 0) goto L29;
        long r14 = ColorKt.Color(4291782265L);
    L31:
        if ((r50 & 128) == 0) goto L33;
        long r16 = Color.Companion.m4392getBlack0d7_KjU();
    L35:
        if ((r50 & 256) == 0) goto L37;
        long r18 = Color.Companion.m4392getBlack0d7_KjU();
    L39:
        if ((r50 & 512) == 0) goto L41;
        long r20 = Color.Companion.m4403getWhite0d7_KjU();
    L43:
        if ((r50 & 1024) == 0) goto L45;
        long r22 = Color.Companion.m4403getWhite0d7_KjU();
    L47:
        if ((r50 & 2048) == 0) goto L49;
        long r24 = Color.Companion.m4392getBlack0d7_KjU();
    L50:
        long r35 = r12;
        return m1617darkColors2qZNXz8(r1, r3, r5, r7, r35, r9, r14, r16, r18, r20, r22, r24);
    L49:
        r24 = r48;
        goto L50
    L45:
        r22 = r46;
        goto L47
    L41:
        r20 = r44;
        goto L43
    L37:
        r18 = r42;
        goto L39
    L33:
        r16 = r40;
        goto L35
    L29:
        r14 = r38;
        goto L31
    L25:
        r9 = r36;
        goto L27
    L21:
        r12 = r34;
        goto L23
    L17:
        r7 = r32;
        goto L19
    L13:
        r5 = r30;
        goto L15
    L9:
        r3 = r28;
        goto L11
    L5:
        r1 = r26;
        goto L7
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1617darkColors2qZNXz8(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, false, null);
    }

    public static final long getPrimarySurface(Colors $this$primarySurface) {
        if ($this$primarySurface.isLight() == false) goto L6;
        return $this$primarySurface.m1598getPrimary0d7_KjU();
    L6:
        return $this$primarySurface.m1602getSurface0d7_KjU();
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1615contentColorFor4WTKRHQ(Colors $this$contentColorFor_u2d4WTKRHQ, long backgroundColor) {
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1598getPrimary0d7_KjU()) == false) goto L6;
        return $this$contentColorFor_u2d4WTKRHQ.m1595getOnPrimary0d7_KjU();
    L6:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1599getPrimaryVariant0d7_KjU()) == false) goto L9;
        return $this$contentColorFor_u2d4WTKRHQ.m1595getOnPrimary0d7_KjU();
    L9:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1600getSecondary0d7_KjU()) == false) goto L12;
        return $this$contentColorFor_u2d4WTKRHQ.m1596getOnSecondary0d7_KjU();
    L12:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1601getSecondaryVariant0d7_KjU()) == false) goto L15;
        return $this$contentColorFor_u2d4WTKRHQ.m1596getOnSecondary0d7_KjU();
    L15:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1591getBackground0d7_KjU()) == false) goto L18;
        return $this$contentColorFor_u2d4WTKRHQ.m1593getOnBackground0d7_KjU();
    L18:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1602getSurface0d7_KjU()) == false) goto L21;
        return $this$contentColorFor_u2d4WTKRHQ.m1597getOnSurface0d7_KjU();
    L21:
        if (Color.m4367equalsimpl0(backgroundColor, $this$contentColorFor_u2d4WTKRHQ.m1592getError0d7_KjU()) == false) goto L24;
        return $this$contentColorFor_u2d4WTKRHQ.m1594getOnError0d7_KjU();
    L24:
        return Color.Companion.m4402getUnspecified0d7_KjU();
    }

    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1616contentColorForek8zF_U(long backgroundColor, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 441849991, "C(contentColorFor)P(0:c#ui.graphics.Color):Colors.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(441849991, $changed, -1, "androidx.compose.material.contentColorFor (Colors.kt:311)");
    L5:
        $composer.startReplaceGroup(-702388415);
        ComposerKt.sourceInformation($composer, "*311@11671L6,311@11742L7");
        long $this$takeOrElse_u2dDxMtmZc$iv = m1615contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors($composer, 6), backgroundColor);
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L8;
        boolean r6 = true;
    L9:
        if (r6 == true) goto L12;
        ProvidableCompositionLocal<Color> r4 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $this$takeOrElse_u2dDxMtmZc$iv = ((Color) r7).m4376unboximpl();
    L12:
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return $this$takeOrElse_u2dDxMtmZc$iv;
    L8:
        r6 = false;
        goto L9
    }

    public static final void updateColorsFrom(Colors $this$updateColorsFrom, Colors other) {
        $this$updateColorsFrom.m1610setPrimary8_81llA$material_release(other.m1598getPrimary0d7_KjU());
        $this$updateColorsFrom.m1611setPrimaryVariant8_81llA$material_release(other.m1599getPrimaryVariant0d7_KjU());
        $this$updateColorsFrom.m1612setSecondary8_81llA$material_release(other.m1600getSecondary0d7_KjU());
        $this$updateColorsFrom.m1613setSecondaryVariant8_81llA$material_release(other.m1601getSecondaryVariant0d7_KjU());
        $this$updateColorsFrom.m1603setBackground8_81llA$material_release(other.m1591getBackground0d7_KjU());
        $this$updateColorsFrom.m1614setSurface8_81llA$material_release(other.m1602getSurface0d7_KjU());
        $this$updateColorsFrom.m1604setError8_81llA$material_release(other.m1592getError0d7_KjU());
        $this$updateColorsFrom.m1607setOnPrimary8_81llA$material_release(other.m1595getOnPrimary0d7_KjU());
        $this$updateColorsFrom.m1608setOnSecondary8_81llA$material_release(other.m1596getOnSecondary0d7_KjU());
        $this$updateColorsFrom.m1605setOnBackground8_81llA$material_release(other.m1593getOnBackground0d7_KjU());
        $this$updateColorsFrom.m1609setOnSurface8_81llA$material_release(other.m1597getOnSurface0d7_KjU());
        $this$updateColorsFrom.m1606setOnError8_81llA$material_release(other.m1594getOnError0d7_KjU());
        $this$updateColorsFrom.setLight$material_release(other.isLight());
    }

    static {
        LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }
}
