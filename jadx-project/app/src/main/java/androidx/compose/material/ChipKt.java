package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0090\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÆ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", "Chip", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconContentColor"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ChipKt {
    private static final float HorizontalPadding = 0.0f;
    private static final float LeadingIconEndSpacing = 0.0f;
    private static final float LeadingIconStartSpacing = 0.0f;
    private static final float SelectedIconContainerSize = 0.0f;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing = 0.0f;

    public static final /* synthetic */ long access$Chip$lambda$0(State $contentColor$delegate) {
        return Chip$lambda$0($contentColor$delegate);
    }

    public static final /* synthetic */ float access$getHorizontalPadding$p() {
        return HorizontalPadding;
    }

    public static final /* synthetic */ float access$getLeadingIconEndSpacing$p() {
        return LeadingIconEndSpacing;
    }

    public static final /* synthetic */ float access$getLeadingIconStartSpacing$p() {
        return LeadingIconStartSpacing;
    }

    public static final /* synthetic */ float access$getSelectedIconContainerSize$p() {
        return SelectedIconContainerSize;
    }

    public static final /* synthetic */ float access$getTrailingIconSpacing$p() {
        return TrailingIconSpacing;
    }

    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    public static final void Chip(final Function0<Unit> r32, Modifier r33, boolean r34, MutableInteractionSource r35, Shape r36, BorderStroke r37, ChipColors r38, Function2<? super Composer, ? super Integer, Unit> r39, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r40, Composer r41, final int r42, final int r43) {
        Composer r1 = r41.startRestartGroup(-368396408);
        ComposerKt.sourceInformation(r1, "C(Chip)P(7,6,3,4,8!2,5)101@4584L21,107@4781L24,111@4939L1389,102@4610L1718:Chip.kt#jmzs0o");
        int r2 = r42;
        if ((r43 & 1) == 0) goto L6;
        r2 = r2 | 6;
        Function0<Unit> r3 = r32;
    L13:
        int r4 = r43 & 2;
        if (r4 == 0) goto L17;
        r2 = r2 | 48;
        Modifier r5 = r33;
    L24:
        int r6 = r43 & 4;
        if (r6 == 0) goto L28;
        r2 = r2 | 384;
        boolean r7 = r34;
    L35:
        int r8 = r43 & 8;
        if (r8 == 0) goto L39;
        r2 = r2 | 3072;
        MutableInteractionSource r9 = r35;
    L47:
        if ((r42 & 24576) == 0) goto L49;
        Shape r12 = r36;
    L57:
        int r13 = r43 & 32;
        if (r13 == 0) goto L61;
        r2 = r2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        BorderStroke r14 = r37;
    L69:
        if ((1572864 & r42) == 0) goto L71;
        ChipColors r15 = r38;
    L79:
        int r0 = r43 & 128;
        if (r0 == 0) goto L83;
        r2 = r2 | 12582912;
    L91:
        if ((r43 & 256) == 0) goto L94;
        r2 = r2 | 100663296;
    L101:
        int r16 = r2;
        char r10 = 1;
        r10 = 1;
        if ((r2 & 38347923) == 38347922) goto L104;
        boolean r11 = true;
    L106:
        if (r1.shouldExecute(r11, r16 & 1) == false) goto L146;
        r1.startDefaults();
        ComposerKt.sourceInformation(r1, "95@4322L6,97@4439L12");
        if ((r42 & 1) != 0) goto L110;
    L119:
        if (r4 == 0) goto L121;
        r5 = Modifier.Companion;
    L121:
        if (r6 == 0) goto L123;
        r7 = true;
    L123:
        if (r8 == 0) goto L126;
        r9 = null;
    L126:
        if ((r43 & 16) == 0) goto L128;
        CornerBasedShape r17 = MaterialTheme.INSTANCE.getShapes(r1, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
        int r18 = r16 & (-57345);
    L129:
        if (r13 == 0) goto L131;
        BorderStroke r19 = null;
    L133:
        if ((r43 & 64) == 0) goto L135;
        boolean r20 = false;
        ChipColors r110 = ChipDefaults.INSTANCE.m1581chipColors5tl4gsc(0, 0, 0, 0, 0, 0, r1, 1572864, 63);
        Composer r111 = r1;
        r18 = r18 & (-3670017);
    L136:
        if (r0 == 0) goto L138;
        Function2<? super Composer, ? super Integer, Unit> r21 = null;
        Shape r112 = r17;
        BorderStroke r22 = r19;
        boolean r113 = r7;
        MutableInteractionSource r23 = r9;
    L139:
        r111.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventStart(-368396408, r18, -1, "androidx.compose.material.Chip (Chip.kt:100)");
    L142:
        final State<Color> r24 = r110.contentColor(r113, r111, ((r18 >> 6) & 14) | ((r18 >> 15) & 112));
        final Function2<? super Composer, ? super Integer, Unit> r310 = r21;
        final ChipColors r311 = r110;
        final boolean r312 = r113;
        Composer r25 = r111;
        SurfaceKt.m1783SurfaceLPr_se0(r3, SemanticsModifierKt.semantics$default(r5, r20, AnonymousClass1.INSTANCE, r10, null), r113, r112, r110.backgroundColor(r113, r111, ((r18 >> 6) & 14) | ((r18 >> 15) & 112)).getValue().m4376unboximpl(), Color.m4365copywmQWz5c$default(Chip$lambda$0(r24), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), r22, 0.0f, r23, ComposableLambdaKt.rememberComposableLambda(139076687, r10, new AnonymousClass2(r24, r310, r311, r312, r40), r111, 54), r25, (((((r18 & 14) | 805306368) | (r18 & 896)) | ((r18 >> 3) & 7168)) | ((r18 << 3) & 3670016)) | (234881024 & (r18 << 15)), 128);
        if (ComposerKt.isTraceInProgress() == false) goto L145;
        ComposerKt.traceEventEnd();
    L145:
        final Modifier r26 = r5;
        final Function2<? super Composer, ? super Integer, Unit> r27 = r310;
        final boolean r28 = r113;
        final Shape r29 = r112;
        final MutableInteractionSource r30 = r23;
        final ChipColors r31 = r311;
        final BorderStroke r44 = r22;
    L147:
        ScopeUpdateScope r114 = r25.endRestartGroup();
        if (r114 == null) goto L151;
        r114.updateScope(new AnonymousClass3(r32, r26, r28, r30, r29, r44, r31, r27, r40, r42, r43));
        return;
    L151:
        return;
    L138:
        r21 = r39;
        r112 = r17;
        r22 = r19;
        r113 = r7;
        r23 = r9;
        goto L139
    L135:
        r111 = r1;
        r20 = false;
        r110 = r38;
        goto L136
    L131:
        r19 = r14;
        goto L133
    L128:
        r17 = r12;
        r18 = r16;
        goto L129
    L110:
        if (r1.getDefaultsInvalid() == true) goto L119;
        r1.skipToGroupEnd();
        if ((r43 & 16) == 0) goto L116;
        r16 = r16 & (-57345);
    L116:
        if ((r43 & 64) == 0) goto L118;
        ChipColors r45 = r15;
        r112 = r12;
        r110 = r45;
        r21 = r39;
        r18 = r16 & (-3670017);
        r23 = r9;
        r10 = 1;
        r22 = r14;
        r111 = r1;
        r113 = r7;
        r20 = false;
        goto L139
    L118:
        ChipColors r46 = r15;
        r112 = r12;
        r110 = r46;
        r21 = r39;
        r23 = r9;
        r10 = 1;
        r22 = r14;
        r18 = r16;
        r111 = r1;
        r113 = r7;
        r20 = false;
        goto L139
    L146:
        r25 = r1;
        r25.skipToGroupEnd();
        r27 = r39;
        r26 = r5;
        r28 = r7;
        r30 = r9;
        r29 = r12;
        r44 = r14;
        r31 = r38;
        goto L147
    L104:
        r11 = false;
        goto L106
    L94:
        if ((r42 & 100663296) != 0) goto L101;
        if (r1.changedInstance(r40) == false) goto L98;
        int r115 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        r2 = r2 | r115;
        goto L101
    L98:
        r115 = 33554432;
        goto L99
    L83:
        if ((r42 & 12582912) != 0) goto L91;
        if (r1.changedInstance(r39) == false) goto L87;
        int r116 = 8388608;
    L88:
        r2 = r2 | r116;
        goto L91
    L87:
        r116 = 4194304;
        goto L88
    L71:
        if ((r43 & 64) != 0) goto L75;
        r15 = r38;
        if (r1.changed(r15) == false) goto L76;
        int r117 = 1048576;
    L77:
        r2 = r2 | r117;
    L76:
        r117 = 524288;
        goto L77
    L75:
        r15 = r38;
        goto L76
    L61:
        if ((196608 & r42) != 0) goto L67;
        r14 = r37;
        if (r1.changed(r14) == false) goto L65;
        int r118 = 131072;
    L66:
        r2 = r2 | r118;
        goto L69
    L65:
        r118 = 65536;
        goto L66
    L67:
        r14 = r37;
        goto L69
    L49:
        if ((r43 & 16) != 0) goto L53;
        r12 = r36;
        if (r1.changed(r12) == false) goto L54;
        int r119 = 16384;
    L55:
        r2 = r2 | r119;
    L54:
        r119 = 8192;
        goto L55
    L53:
        r12 = r36;
        goto L54
    L39:
        if ((r42 & 3072) != 0) goto L45;
        r9 = r35;
        if (r1.changed(r9) == false) goto L43;
        int r120 = 2048;
    L44:
        r2 = r2 | r120;
        goto L47
    L43:
        r120 = 1024;
        goto L44
    L45:
        r9 = r35;
        goto L47
    L28:
        if ((r42 & 384) != 0) goto L34;
        r7 = r34;
        if (r1.changed(r7) == false) goto L32;
        int r47 = 256;
    L33:
        r2 = r2 | r47;
        goto L35
    L32:
        r47 = 128;
        goto L33
    L34:
        r7 = r34;
        goto L35
    L17:
        if ((r42 & 48) != 0) goto L23;
        r5 = r33;
        if (r1.changed(r5) == false) goto L21;
        int r48 = 32;
    L22:
        r2 = r2 | r48;
        goto L24
    L21:
        r48 = 16;
        goto L22
    L23:
        r5 = r33;
        goto L24
    L6:
        if ((r42 & 6) != 0) goto L12;
        r3 = r32;
        if (r1.changedInstance(r3) == false) goto L10;
        int r49 = 4;
    L11:
        r2 = r2 | r49;
        goto L13
    L10:
        r49 = 2;
        goto L11
    L12:
        r3 = r32;
        goto L13
    }

    private static final long Chip$lambda$0(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    public static final void FilterChip(final boolean selected, final Function0<Unit> r36, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, Shape shape, BorderStroke border, SelectableChipColors colors, Function2<? super Composer, ? super Integer, Unit> r43, Function2<? super Composer, ? super Integer, Unit> r44, Function2<? super Composer, ? super Integer, Unit> r45, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r46, Composer $composer, final int $changed, final int $changed1, final int r50) {
        Composer $composer2 = $composer.startRestartGroup(-1259208246);
        ComposerKt.sourceInformation($composer2, "C(FilterChip)P(8,7,6,3,4,10!2,5,9,11)198@9258L31,205@9496L34,209@9670L3851,199@9294L4227:Chip.kt#jmzs0o");
        int $dirty = $changed;
        if ((r50 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r50 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        int r12 = r50 & 4;
        if (r12 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r14 = modifier;
    L34:
        int r15 = r50 & 8;
        if (r15 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L45:
        int r16 = r50 & 16;
        if (r16 == 0) goto L49;
        $dirty = $dirty | 24576;
        MutableInteractionSource r9 = interactionSource;
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L59;
        Shape shape2 = shape;
    L67:
        int r19 = r50 & 64;
        if (r19 == 0) goto L71;
        $dirty = $dirty | 1572864;
        BorderStroke r11 = border;
    L79:
        if (($changed & 12582912) == 0) goto L81;
    L90:
        int r4 = r50 & 256;
        if (r4 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty1 = r50 & 512;
        if ($dirty1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r6 = r50 & 1024;
        if (r6 == 0) goto L117;
        int $dirty2 = $changed1 | 6;
    L125:
        if ((r50 & 2048) == 0) goto L128;
        $dirty2 = $dirty2 | 48;
    L135:
        int $dirty3 = $dirty2;
        if (($dirty & 306783379) == 306783378) goto L138;
    L141:
        boolean r1 = true;
    L143:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L192;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "189@8800L6,191@8927L18");
        if (($changed & 1) != 0) goto L147;
    L156:
        if (r12 == 0) goto L158;
        Modifier.Companion modifier2 = Modifier.Companion;
    L159:
        if (r15 == 0) goto L161;
        boolean enabled3 = true;
    L162:
        if (r16 == 0) goto L164;
        MutableInteractionSource interactionSource2 = null;
    L166:
        if ((r50 & 32) == 0) goto L168;
        Shape shape3 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
        int $dirty4 = $dirty & (-458753);
    L169:
        if (r19 == 0) goto L171;
        BorderStroke border2 = null;
    L173:
        if ((r50 & 128) == 0) goto L175;
        SelectableChipColors colors2 = ChipDefaults.INSTANCE.m1582filterChipColorsJ08w3E(0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 805306368, 511);
        $composer2 = $composer2;
        $dirty4 = $dirty4 & (-29360129);
    L176:
        if (r4 == 0) goto L178;
        Function2<? super Composer, ? super Integer, Unit> r5 = null;
    L179:
        if ($dirty1 == 0) goto L181;
        Function2<? super Composer, ? super Integer, Unit> r7 = null;
    L182:
        if (r6 == 0) goto L184;
        enabled2 = enabled3;
        Function2<? super Composer, ? super Integer, Unit> r13 = null;
        MutableInteractionSource interactionSource3 = interactionSource2;
        shape2 = shape3;
        int $dirty5 = $dirty4;
        BorderStroke border3 = border2;
        Function2<? super Composer, ? super Integer, Unit> r8 = r7;
        Function2<? super Composer, ? super Integer, Unit> r10 = r5;
        Modifier modifier3 = modifier2;
    L185:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L188;
        ComposerKt.traceEventStart(-1259208246, $dirty5, $dirty3, "androidx.compose.material.FilterChip (Chip.kt:196)");
    L188:
        final State<Color> r2 = colors2.contentColor(enabled2, selected, $composer2, ((($dirty5 >> 9) & 14) | (($dirty5 << 3) & 112)) | (($dirty5 >> 15) & 896));
        final SelectableChipColors colors3 = colors2;
        final Function2<? super Composer, ? super Integer, Unit> r39 = r10;
        final Function2<? super Composer, ? super Integer, Unit> r41 = r8;
        final boolean enabled4 = enabled2;
        final Function2<? super Composer, ? super Integer, Unit> r42 = r13;
        Modifier modifier4 = modifier3;
        Shape shape4 = shape2;
        SurfaceKt.m1784SurfaceNy5ogXk(selected, r36, SemanticsModifierKt.semantics$default(modifier3, false, C04241.INSTANCE, 1, null), enabled4, shape4, colors2.backgroundColor(enabled2, selected, $composer2, ((($dirty5 >> 9) & 14) | (($dirty5 << 3) & 112)) | (($dirty5 >> 15) & 896)).getValue().m4376unboximpl(), Color.m4365copywmQWz5c$default(r2.getValue().m4376unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), border3, 0.0f, interactionSource3, ComposableLambdaKt.rememberComposableLambda(722126431, true, new C04252(r2, r39, selected, r41, r42, r46, colors3, enabled4), $composer2, 54), $composer2, ((((($dirty5 & 14) | ($dirty5 & 112)) | ($dirty5 & 7168)) | (($dirty5 >> 3) & 57344)) | (29360128 & ($dirty5 << 3))) | (1879048192 & ($dirty5 << 15)), 6, 256);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L191;
        ComposerKt.traceEventEnd();
    L191:
        final Shape shape5 = shape4;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final SelectableChipColors colors4 = colors3;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r39;
        final Function2<? super Composer, ? super Integer, Unit> r18 = r41;
        final Function2<? super Composer, ? super Integer, Unit> r110 = r42;
        final boolean enabled5 = enabled4;
        final Modifier modifier5 = modifier4;
    L193:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L197;
        r0.updateScope(new C04263(selected, r36, modifier5, enabled5, interactionSource4, shape5, border4, colors4, r17, r18, r110, r46, $changed, $changed1, r50));
        return;
    L197:
        return;
    L184:
        enabled2 = enabled3;
        r13 = r45;
        r8 = r7;
        interactionSource3 = interactionSource2;
        shape2 = shape3;
        $dirty5 = $dirty4;
        border3 = border2;
        r10 = r5;
        modifier3 = modifier2;
        goto L185
    L181:
        r7 = r44;
        goto L182
    L178:
        r5 = r43;
        goto L179
    L175:
        colors2 = colors;
        goto L176
    L171:
        border2 = r11;
        goto L173
    L168:
        shape3 = shape2;
        $dirty4 = $dirty;
        goto L169
    L164:
        interactionSource2 = r9;
        goto L166
    L161:
        enabled3 = enabled2;
        goto L162
    L158:
        modifier2 = r14;
        goto L159
    L147:
        if ($composer2.getDefaultsInvalid() == true) goto L156;
        $composer2.skipToGroupEnd();
        if ((r50 & 32) == 0) goto L153;
        $dirty = $dirty & (-458753);
    L153:
        if ((r50 & 128) == 0) goto L155;
        int r3 = (-29360129) & $dirty;
        BorderStroke r20 = r11;
        interactionSource3 = r9;
        border3 = r20;
        colors2 = colors;
        r8 = r44;
        r13 = r45;
        modifier3 = r14;
        r10 = r43;
        $dirty5 = r3;
        $dirty3 = $dirty3;
        goto L185
    L155:
        BorderStroke r21 = r11;
        interactionSource3 = r9;
        border3 = r21;
        r8 = r44;
        r13 = r45;
        $dirty3 = $dirty3;
        modifier3 = r14;
        r10 = r43;
        $dirty5 = $dirty;
        colors2 = colors;
        goto L185
    L192:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        enabled5 = enabled2;
        interactionSource4 = r9;
        shape5 = shape2;
        border4 = r11;
        modifier5 = r14;
        colors4 = colors;
        r17 = r43;
        r18 = r44;
        r110 = r45;
        goto L193
    L138:
        if (($dirty3 & 19) != 18) goto L141;
        r1 = false;
        goto L143
    L128:
        if (($changed1 & 48) != 0) goto L135;
        if ($composer2.changedInstance(r46) == false) goto L132;
        int r111 = 32;
    L133:
        $dirty2 = $dirty2 | r111;
        goto L135
    L132:
        r111 = 16;
        goto L133
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty2 = r6;
        goto L125
    L119:
        if ($composer2.changedInstance(r45) == false) goto L121;
        int r112 = 4;
    L122:
        $dirty2 = r6 | r112;
        goto L125
    L121:
        r112 = 2;
        goto L122
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r44) == false) goto L109;
        int r23 = 536870912;
    L110:
        $dirty = $dirty | r23;
        goto L112
    L109:
        r23 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r43) == false) goto L98;
        int r22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r22;
        goto L101
    L98:
        r22 = 33554432;
        goto L99
    L81:
        if ((r50 & 128) == 0) goto L83;
    L88:
        int r24 = 4194304;
    L89:
        $dirty = $dirty | r24;
        goto L90
    L83:
        if ((16777216 & $changed) != 0) goto L85;
        boolean r25 = $composer2.changed(colors);
    L86:
        if (r25 == false) goto L88;
        r24 = 8388608;
        goto L89
    L85:
        r25 = $composer2.changedInstance(colors);
        goto L86
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r11 = border;
        if ($composer2.changed(r11) == false) goto L75;
        int r26 = 1048576;
    L76:
        $dirty = $dirty | r26;
        goto L79
    L75:
        r26 = 524288;
        goto L76
    L77:
        r11 = border;
        goto L79
    L59:
        if ((r50 & 32) != 0) goto L63;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L64;
        int r113 = 131072;
    L65:
        $dirty = $dirty | r113;
    L64:
        r113 = 65536;
        goto L65
    L63:
        shape2 = shape;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        r9 = interactionSource;
        if ($composer2.changed(r9) == false) goto L53;
        int r114 = 16384;
    L54:
        $dirty = $dirty | r114;
        goto L57
    L53:
        r114 = 8192;
        goto L54
    L55:
        r9 = interactionSource;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r115 = 2048;
    L43:
        $dirty = $dirty | r115;
        goto L45
    L42:
        r115 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r14 = modifier;
        if ($composer2.changed(r14) == false) goto L31;
        int r116 = 256;
    L32:
        $dirty = $dirty | r116;
        goto L34
    L31:
        r116 = 128;
        goto L32
    L33:
        r14 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r36) == false) goto L20;
        int r117 = 32;
    L21:
        $dirty = $dirty | r117;
        goto L23
    L20:
        r117 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(selected) == false) goto L10;
        int r27 = 4;
    L11:
        $dirty = $dirty | r27;
        goto L13
    L10:
        r27 = 2;
        goto L11
    }

    static {
        HorizontalPadding = Dp.m6973constructorimpl(12);
        LeadingIconStartSpacing = Dp.m6973constructorimpl(4);
        LeadingIconEndSpacing = Dp.m6973constructorimpl(8);
        TrailingIconSpacing = Dp.m6973constructorimpl(8);
        SelectedIconContainerSize = Dp.m6973constructorimpl(24);
    }
}
