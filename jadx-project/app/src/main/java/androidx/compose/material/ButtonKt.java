package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerBasedShape;
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
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ButtonKt {
    public static final /* synthetic */ long access$Button$lambda$1(State $contentColor$delegate) {
        return Button$lambda$1($contentColor$delegate);
    }

    public static final void Button(final Function0<Unit> r30, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonElevation elevation, Shape shape, BorderStroke border, ButtonColors colors, PaddingValues contentPadding, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r39, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(-2116133464);
        ComposerKt.sourceInformation($composer2, "C(Button)P(8,7,5,6,4,9!2,3)109@5204L21,115@5401L24,120@5649L644,110@5230L1063:Button.kt#jmzs0o");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r2 = r42 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r4 = r42 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r5 = enabled;
    L35:
        int r6 = r42 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
        MutableInteractionSource r8 = interactionSource;
    L47:
        if (($changed & 24576) != 0) goto L58;
        if ((r42 & 16) != 0) goto L54;
        if ($composer2.changed(elevation) == false) goto L54;
        int r9 = 16384;
    L55:
        $dirty = $dirty | r9;
    L54:
        r9 = 8192;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Shape r15 = shape;
    L68:
        int r16 = r42 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
        BorderStroke r10 = border;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r42 & 128) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
    L87:
        r17 = 4194304;
    L90:
        int r14 = r42 & 256;
        if (r14 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r42 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L111:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty2) == 306783378) goto L114;
        boolean r0 = true;
    L116:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L181;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "100@4784L11,101@4830L6,103@4920L14");
        if (($changed & 1) != 0) goto L120;
    L133:
        if (r2 == 0) goto L135;
        Modifier.Companion modifier3 = Modifier.Companion;
    L136:
        if (r4 == 0) goto L138;
        boolean enabled2 = true;
    L139:
        if (r6 == 0) goto L141;
        MutableInteractionSource interactionSource2 = null;
    L143:
        if ((r42 & 16) == 0) goto L145;
        ButtonElevation elevation2 = ButtonDefaults.INSTANCE.m1565elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
        int $dirty3 = $dirty2 & (-57345);
    L147:
        if ((r42 & 32) == 0) goto L149;
        CornerBasedShape shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall();
        $dirty3 = $dirty3 & (-458753);
    L150:
        if (r16 == 0) goto L152;
        BorderStroke border2 = null;
    L154:
        if ((r42 & 128) == 0) goto L156;
        boolean r11 = false;
        ButtonColors colors2 = ButtonDefaults.INSTANCE.m1564buttonColorsro_MJ88(0, 0, 0, 0, $composer2, 24576, 15);
        Composer $composer3 = $composer2;
        $dirty3 = $dirty3 & (-29360129);
    L157:
        if (r14 == 0) goto L159;
        final PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getContentPadding();
        Shape shape3 = shape2;
        BorderStroke border3 = border2;
        boolean enabled3 = enabled2;
        modifier2 = modifier3;
        int $dirty4 = $dirty3;
    L160:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L163;
        ComposerKt.traceEventStart(-2116133464, $dirty4, -1, "androidx.compose.material.Button (Button.kt:106)");
    L163:
        if (interactionSource2 != null) goto L169;
        $composer3.startReplaceGroup(1050689923);
        ComposerKt.sourceInformation($composer3, "108@5133L39");
        ComposerKt.sourceInformationMarkerStart($composer3, -243201441, "CC(remember):Button.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L168;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L168:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
    L170:
        final State<Color> r3 = colors2.contentColor(enabled3, $composer3, (($dirty4 >> 6) & 14) | (($dirty4 >> 18) & 112));
        Modifier r18 = SemanticsModifierKt.semantics$default(modifier2, r11, AnonymousClass1.INSTANCE, 1, null);
        long r19 = colors2.backgroundColor(enabled3, $composer3, (($dirty4 >> 6) & 14) | (($dirty4 >> 18) & 112)).getValue().m4376unboximpl();
        long r7 = Color.m4365copywmQWz5c$default(Button$lambda$1(r3), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (elevation2 != null) goto L173;
        $composer3.startReplaceGroup(1051096580);
        $composer3.endReplaceGroup();
        State<Dp> r12 = null;
    L174:
        if (r12 == null) goto L176;
        float r22 = r12.getValue().m6987unboximpl();
    L177:
        ButtonElevation elevation3 = elevation2;
        Composer $composer4 = $composer3;
        SurfaceKt.m1783SurfaceLPr_se0(r30, r18, enabled3, shape3, r19, r7, border3, r22, interactionSource3, ComposableLambdaKt.rememberComposableLambda(7524271, true, new AnonymousClass2(r3, contentPadding2, r39), $composer3, 54), $composer4, (((($dirty4 & 14) | 805306368) | ($dirty4 & 896)) | (($dirty4 >> 6) & 7168)) | (3670016 & $dirty4), 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L180;
        ComposerKt.traceEventEnd();
    L180:
        final ButtonElevation elevation4 = elevation3;
        final PaddingValues contentPadding3 = contentPadding2;
        final ButtonColors colors3 = colors2;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final BorderStroke border4 = border3;
        final Modifier modifier4 = modifier2;
        final MutableInteractionSource interactionSource4 = interactionSource2;
    L182:
        ScopeUpdateScope r110 = $composer5.endRestartGroup();
        if (r110 == null) goto L186;
        r110.updateScope(new AnonymousClass3(r30, modifier4, enabled4, interactionSource4, elevation4, shape4, border4, colors3, contentPadding3, r39, $changed, r42));
        return;
    L186:
        return;
    L176:
        r22 = Dp.m6973constructorimpl(0);
        goto L177
    L173:
        $composer3.startReplaceGroup(-243188323);
        ComposerKt.sourceInformation($composer3, "118@5543L37");
        r12 = elevation2.elevation(enabled3, interactionSource3, $composer3, (($dirty4 >> 6) & 896) | (($dirty4 >> 6) & 14));
        $composer3.endReplaceGroup();
        goto L174
    L169:
        $composer3.startReplaceGroup(-243202092);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L170
    L159:
        contentPadding2 = contentPadding;
        shape3 = shape2;
        border3 = border2;
        enabled3 = enabled2;
        modifier2 = modifier3;
        $dirty4 = $dirty3;
        goto L160
    L156:
        $composer3 = $composer2;
        r11 = false;
        colors2 = colors;
        goto L157
    L152:
        border2 = border;
        goto L154
    L149:
        shape2 = r15;
        goto L150
    L145:
        elevation2 = elevation;
        $dirty3 = $dirty2;
        goto L147
    L141:
        interactionSource2 = r8;
        goto L143
    L138:
        enabled2 = r5;
        goto L139
    L135:
        modifier3 = modifier2;
        goto L136
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r42 & 16) == 0) goto L125;
        $dirty4 = $dirty2 & (-57345);
    L127:
        if ((r42 & 32) == 0) goto L130;
        $dirty4 = $dirty4 & (-458753);
    L130:
        if ((r42 & 128) == 0) goto L132;
        $dirty4 = $dirty4 & (-29360129);
    L132:
        elevation2 = elevation;
        contentPadding2 = contentPadding;
        interactionSource2 = r8;
        border3 = r10;
        shape3 = r15;
        r11 = false;
        enabled3 = r5;
        $composer3 = $composer2;
        colors2 = colors;
        goto L160
    L125:
        $dirty4 = $dirty2;
        goto L127
    L181:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        border4 = border;
        contentPadding3 = contentPadding;
        modifier4 = modifier2;
        enabled4 = r5;
        interactionSource4 = r8;
        shape4 = r15;
        elevation4 = elevation;
        colors3 = colors;
        goto L182
    L114:
        r0 = false;
        goto L116
    L105:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r39) == false) goto L109;
        int r1 = 536870912;
    L110:
        $dirty = $dirty | r1;
        goto L111
    L109:
        r1 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(contentPadding) == false) goto L98;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r111;
        goto L102
    L98:
        r111 = 33554432;
        goto L99
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r10 = border;
        if ($composer2.changed(r10) == false) goto L76;
        int r112 = 1048576;
    L77:
        $dirty = $dirty | r112;
        goto L80
    L76:
        r112 = 524288;
        goto L77
    L78:
        r10 = border;
        goto L80
    L60:
        if ((r42 & 32) != 0) goto L64;
        r15 = shape;
        if ($composer2.changed(r15) == false) goto L65;
        int r13 = 131072;
    L66:
        $dirty = $dirty | r13;
    L65:
        r13 = 65536;
        goto L66
    L64:
        r15 = shape;
        goto L65
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = interactionSource;
        if ($composer2.changed(r8) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L47
    L43:
        r20 = 1024;
        goto L44
    L45:
        r8 = interactionSource;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        r5 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r23 = 32;
    L22:
        $dirty = $dirty | r23;
        goto L24
    L21:
        r23 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r30) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    }

    private static final long Button$lambda$1(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    public static final void OutlinedButton(Function0<Unit> r19, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonElevation elevation, Shape shape, BorderStroke border, ButtonColors colors, PaddingValues contentPadding, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, int $changed, int r31) {
        ComposerKt.sourceInformationMarkerStart($composer, -1776134358, "C(OutlinedButton)P(8,7,5,6,4,9!2,3)177@8396L6,178@8453L14,179@8511L22,183@8655L314:Button.kt#jmzs0o");
        if ((r31 & 2) == 0) goto L5;
        Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r31 & 4) == 0) goto L9;
        boolean enabled2 = true;
    L11:
        if ((r31 & 8) == 0) goto L13;
        MutableInteractionSource interactionSource2 = null;
    L15:
        if ((r31 & 16) == 0) goto L17;
        ButtonElevation elevation2 = null;
    L19:
        if ((r31 & 32) == 0) goto L21;
        Shape shape2 = MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall();
    L23:
        if ((r31 & 64) == 0) goto L25;
        BorderStroke border2 = ButtonDefaults.INSTANCE.getOutlinedBorder($composer, 6);
    L27:
        if ((r31 & 128) == 0) goto L29;
        ButtonColors colors2 = ButtonDefaults.INSTANCE.m1572outlinedButtonColorsRGew2ao(0, 0, 0, $composer, 3072, 7);
    L31:
        if ((r31 & 256) == 0) goto L33;
        PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getContentPadding();
    L35:
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventStart(-1776134358, $changed, -1, "androidx.compose.material.OutlinedButton (Button.kt:183)");
    L37:
        Button(r19, modifier2, enabled2, interactionSource2, elevation2, shape2, border2, colors2, contentPadding2, r28, $composer, ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed)) | (29360128 & $changed)) | (234881024 & $changed)) | (1879048192 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventEnd();
    L40:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L33:
        contentPadding2 = contentPadding;
        goto L35
    L29:
        colors2 = colors;
        goto L31
    L25:
        border2 = border;
        goto L27
    L21:
        shape2 = shape;
        goto L23
    L17:
        elevation2 = elevation;
        goto L19
    L13:
        interactionSource2 = interactionSource;
        goto L15
    L9:
        enabled2 = enabled;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    public static final void TextButton(Function0<Unit> r19, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, ButtonElevation elevation, Shape shape, BorderStroke border, ButtonColors colors, PaddingValues contentPadding, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, int $changed, int r31) {
        ComposerKt.sourceInformationMarkerStart($composer, 288797557, "C(TextButton)P(8,7,5,6,4,9!2,3)235@11067L6,237@11157L18,241@11307L314:Button.kt#jmzs0o");
        if ((r31 & 2) == 0) goto L5;
        Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r31 & 4) == 0) goto L9;
        boolean enabled2 = true;
    L11:
        if ((r31 & 8) == 0) goto L13;
        MutableInteractionSource interactionSource2 = null;
    L15:
        if ((r31 & 16) == 0) goto L17;
        ButtonElevation elevation2 = null;
    L19:
        if ((r31 & 32) == 0) goto L21;
        Shape shape2 = MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall();
    L23:
        if ((r31 & 64) == 0) goto L25;
        BorderStroke border2 = null;
    L27:
        if ((r31 & 128) == 0) goto L29;
        ButtonColors colors2 = ButtonDefaults.INSTANCE.m1573textButtonColorsRGew2ao(0, 0, 0, $composer, 3072, 7);
    L31:
        if ((r31 & 256) == 0) goto L33;
        PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
    L35:
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventStart(288797557, $changed, -1, "androidx.compose.material.TextButton (Button.kt:241)");
    L37:
        Button(r19, modifier2, enabled2, interactionSource2, elevation2, shape2, border2, colors2, contentPadding2, r28, $composer, ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed)) | (29360128 & $changed)) | (234881024 & $changed)) | (1879048192 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventEnd();
    L40:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L33:
        contentPadding2 = contentPadding;
        goto L35
    L29:
        colors2 = colors;
        goto L31
    L25:
        border2 = border;
        goto L27
    L21:
        shape2 = shape;
        goto L23
    L17:
        elevation2 = elevation;
        goto L19
    L13:
        interactionSource2 = interactionSource;
        goto L15
    L9:
        enabled2 = enabled;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }
}
