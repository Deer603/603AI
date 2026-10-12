package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ButtonKt {
    public static final void Button(final Function0<Unit> r30, Modifier modifier, boolean enabled, Shape shape, ButtonColors colors, ButtonElevation elevation, BorderStroke border, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r39, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(650121315);
        ComposerKt.sourceInformation($composer2, "C(Button)P(8,7,5,9,1,4!1,3,6)111@5461L5,112@5510L14,113@5575L17,134@6467L587,124@6130L924:Button.kt#uh7d8r");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r30;
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
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape r6 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ButtonColors colors2 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        ButtonElevation elevation2 = elevation;
    L68:
        int r15 = r42 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
        BorderStroke r9 = border;
    L79:
        int r0 = r42 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r3 = r42 & 256;
        if (r3 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r42 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        if ((306783379 & $dirty) == 306783378) goto L114;
    L117:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L120;
    L132:
        if (r2 == 0) goto L134;
        Modifier.Companion modifier3 = Modifier.Companion;
    L135:
        if (r4 == 0) goto L137;
        boolean enabled2 = true;
    L139:
        if ((r42 & 8) == 0) goto L141;
        $dirty = $dirty & (-7169);
        Shape shape2 = ButtonDefaults.INSTANCE.getShape($composer2, 6);
    L143:
        if ((r42 & 16) == 0) goto L145;
        ButtonColors colors3 = ButtonDefaults.INSTANCE.buttonColors($composer2, 6);
        int $dirty2 = $dirty & (-57345);
    L147:
        if ((r42 & 32) == 0) goto L149;
        $dirty2 = $dirty2 & (-458753);
        elevation2 = ButtonDefaults.INSTANCE.m1937buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
    L149:
        if (r15 == 0) goto L151;
        BorderStroke border2 = null;
    L152:
        if (r0 == 0) goto L154;
        final PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getContentPadding();
    L155:
        if (r3 == 0) goto L157;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        colors2 = colors3;
        int $dirty3 = $dirty2;
        int r7 = 650121315;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        modifier2 = modifier3;
        ButtonElevation elevation3 = elevation2;
    L158:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L161;
        ComposerKt.traceEventStart(r7, $dirty3, -1, "androidx.compose.material3.Button (Button.kt:118)");
    L161:
        $composer2.startReplaceGroup(-239156623);
        ComposerKt.sourceInformation($composer2, "120@5882L39");
        if (interactionSource2 != null) goto L168;
        ComposerKt.sourceInformationMarkerStart($composer2, -239155972, "CC(remember):Button.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        MutableInteractionSource interactionSource3 = interactionSource2;
        if (it$iv != Composer.Companion.getEmpty()) goto L166;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L167:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource4 = (MutableInteractionSource) value$iv;
    L169:
        $composer2.endReplaceGroup();
        long containerColor = colors2.m1929containerColorvNxB06k$material3_release(enabled3);
        final long contentColor = colors2.m1930contentColorvNxB06k$material3_release(enabled3);
        $composer2.startReplaceGroup(-239150048);
        ComposerKt.sourceInformation($composer2, "123@6067L43");
        if (elevation3 != null) goto L172;
        State<Dp> r1 = null;
    L173:
        $composer2.endReplaceGroup();
        if (r1 == null) goto L176;
        float shadowElevation = r1.getValue().m6987unboximpl();
    L177:
        ButtonElevation elevation4 = elevation3;
        Composer $composer3 = $composer2;
        SurfaceKt.m2673Surfaceo_FOJdg(r13, SemanticsModifierKt.semantics$default(modifier2, false, AnonymousClass1.INSTANCE, 1, null), enabled3, shape3, containerColor, contentColor, 0.0f, shadowElevation, border3, interactionSource4, ComposableLambdaKt.rememberComposableLambda(956488494, true, new AnonymousClass2(contentColor, contentPadding2, r39), $composer2, 54), $composer3, ((($dirty3 & 14) | ($dirty3 & 896)) | ($dirty3 & 7168)) | (($dirty3 << 6) & 234881024), 6, 64);
        if (ComposerKt.isTraceInProgress() == false) goto L180;
        ComposerKt.traceEventEnd();
    L180:
        final MutableInteractionSource interactionSource5 = interactionSource3;
        final ButtonElevation elevation5 = elevation4;
        final ButtonColors colors4 = colors2;
        final Shape shape4 = shape3;
        final BorderStroke border4 = border3;
        final PaddingValues contentPadding3 = contentPadding2;
        final Modifier modifier4 = modifier2;
        final boolean enabled4 = enabled3;
    L181:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L185;
        r14.updateScope(new AnonymousClass3(r30, modifier4, enabled4, shape4, colors4, elevation5, border4, contentPadding3, interactionSource5, r39, $changed, r42));
        return;
    L185:
        return;
    L176:
        shadowElevation = Dp.m6973constructorimpl(0);
        goto L177
    L172:
        r1 = elevation3.shadowElevation$material3_release(enabled3, interactionSource4, $composer2, (($dirty3 >> 9) & 896) | (($dirty3 >> 6) & 14));
        goto L173
    L166:
        value$iv = it$iv;
        goto L167
    L168:
        interactionSource3 = interactionSource2;
        interactionSource4 = interactionSource3;
        goto L169
    L157:
        modifier2 = modifier3;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors2 = colors3;
        $dirty3 = $dirty2;
        r7 = 650121315;
        border3 = border2;
        interactionSource2 = interactionSource;
        goto L158
    L154:
        contentPadding2 = contentPadding;
        goto L155
    L151:
        border2 = border;
        goto L152
    L145:
        colors3 = colors2;
        $dirty2 = $dirty;
        goto L147
    L141:
        shape2 = r6;
        goto L143
    L137:
        enabled2 = r5;
        goto L139
    L134:
        modifier3 = modifier2;
        goto L135
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L132;
        $composer2.skipToGroupEnd();
        if ((r42 & 8) == 0) goto L126;
        $dirty = $dirty & (-7169);
    L126:
        if ((r42 & 16) == 0) goto L129;
        $dirty = $dirty & (-57345);
    L129:
        if ((r42 & 32) == 0) goto L131;
        int r8 = $dirty & (-458753);
        contentPadding2 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty3 = r8;
        enabled3 = r5;
        shape3 = r6;
        border3 = r9;
        elevation3 = elevation2;
        r7 = 650121315;
        goto L158
    L131:
        contentPadding2 = contentPadding;
        $dirty3 = $dirty;
        enabled3 = r5;
        shape3 = r6;
        border3 = r9;
        elevation3 = elevation2;
        r7 = 650121315;
        interactionSource2 = interactionSource;
        goto L158
    L114:
        if ($composer2.getSkipping() == false) goto L117;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        enabled4 = r5;
        shape4 = r6;
        $composer3 = $composer2;
        colors4 = colors2;
        border4 = r9;
        elevation5 = elevation2;
        contentPadding3 = contentPadding;
        interactionSource5 = interactionSource;
        goto L181
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r39) == false) goto L109;
        int r10 = 536870912;
    L110:
        $dirty = $dirty | r10;
        goto L112
    L109:
        r10 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
        goto L102
    L98:
        r18 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(contentPadding) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
        goto L90
    L87:
        r17 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r9 = border;
        if ($composer2.changed(r9) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L79
    L76:
        r16 = 524288;
        goto L77
    L78:
        r9 = border;
        goto L79
    L60:
        if ((r42 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
    L65:
        r11 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r42 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r42 & 8) != 0) goto L42;
        r6 = shape;
        if ($composer2.changed(r6) == false) goto L43;
        int r19 = 2048;
    L44:
        $dirty = $dirty | r19;
    L43:
        r19 = 1024;
        goto L44
    L42:
        r6 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L36
    L32:
        r20 = 128;
        goto L33
    L34:
        r5 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r30;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r13 = r30;
        goto L13
    }

    public static final void ElevatedButton(final Function0<Unit> r26, Modifier modifier, boolean enabled, Shape shape, ButtonColors colors, ButtonElevation elevation, BorderStroke border, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(1466887385);
        ComposerKt.sourceInformation($composer2, "C(ElevatedButton)P(8,7,5,9,1,4!1,3,6)204@9975L13,205@10032L22,206@10105L25,212@10343L314:Button.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r26;
    L13:
        int r2 = r38 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r4 = r38 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r5 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape r6 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ButtonColors r8 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        ButtonElevation elevation2 = elevation;
    L68:
        int r14 = r38 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        BorderStroke border2 = border;
    L79:
        int r9 = r38 & 128;
        if (r9 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r7 = r38 & 256;
        if (r7 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r38 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r2 == 0) goto L135;
        Modifier.Companion modifier2 = Modifier.Companion;
    L136:
        if (r4 == 0) goto L138;
        boolean enabled2 = true;
    L140:
        if ((r38 & 8) == 0) goto L142;
        $dirty = $dirty & (-7169);
        Shape shape2 = ButtonDefaults.INSTANCE.getElevatedShape($composer2, 6);
    L144:
        if ((r38 & 16) == 0) goto L146;
        ButtonColors colors2 = ButtonDefaults.INSTANCE.elevatedButtonColors($composer2, 6);
        int $dirty2 = $dirty & (-57345);
    L148:
        if ((r38 & 32) == 0) goto L150;
        int r23 = r9;
        $dirty2 = $dirty2 & (-458753);
        elevation2 = ButtonDefaults.INSTANCE.m1939elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
    L151:
        if (r14 == 0) goto L153;
        border2 = null;
    L153:
        if (r23 == 0) goto L155;
        PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getContentPadding();
    L156:
        if (r7 == 0) goto L158;
        boolean r15 = enabled2;
        BorderStroke border3 = border2;
        boolean enabled3 = r15;
        Modifier modifier3 = modifier2;
        ButtonElevation elevation3 = elevation2;
        Shape shape3 = shape2;
        ButtonColors colors3 = colors2;
        int r0 = 1466887385;
        PaddingValues contentPadding3 = contentPadding2;
        MutableInteractionSource interactionSource2 = null;
        $dirty = $dirty2;
    L159:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L162;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.ElevatedButton (Button.kt:212)");
    L162:
        Composer $composer3 = $composer2;
        Button(r13, modifier3, enabled3, shape3, colors3, elevation3, border3, contentPadding3, interactionSource2, r35, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L165;
        ComposerKt.traceEventEnd();
    L165:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final ButtonColors colors4 = colors3;
        final ButtonElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final PaddingValues contentPadding4 = contentPadding3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L166:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L170;
        r16.updateScope(new C04791(r26, modifier4, enabled4, shape4, colors4, elevation4, border4, contentPadding4, interactionSource3, r35, $changed, r38));
        return;
    L170:
        return;
    L158:
        boolean r17 = enabled2;
        border3 = border2;
        enabled3 = r17;
        modifier3 = modifier2;
        elevation3 = elevation2;
        shape3 = shape2;
        colors3 = colors2;
        r0 = 1466887385;
        interactionSource2 = interactionSource;
        contentPadding3 = contentPadding2;
        $dirty = $dirty2;
        goto L159
    L155:
        contentPadding2 = contentPadding;
        goto L156
    L150:
        r23 = r9;
        goto L151
    L146:
        colors2 = r8;
        $dirty2 = $dirty;
        goto L148
    L142:
        shape2 = r6;
        goto L144
    L138:
        enabled2 = r5;
        goto L140
    L135:
        modifier2 = r3;
        goto L136
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L127;
        $dirty = $dirty & (-7169);
    L127:
        if ((r38 & 16) == 0) goto L130;
        $dirty = $dirty & (-57345);
    L130:
        if ((r38 & 32) == 0) goto L132;
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty = $dirty & (-458753);
        modifier3 = r3;
        shape3 = r6;
        colors3 = r8;
        elevation3 = elevation2;
        border3 = border2;
        r0 = 1466887385;
        enabled3 = r5;
        goto L159
    L132:
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        modifier3 = r3;
        shape3 = r6;
        colors3 = r8;
        elevation3 = elevation2;
        border3 = border2;
        r0 = 1466887385;
        enabled3 = r5;
        goto L159
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        interactionSource3 = interactionSource;
        modifier4 = r3;
        enabled4 = r5;
        shape4 = r6;
        $composer3 = $composer2;
        colors4 = r8;
        elevation4 = elevation2;
        border4 = border2;
        contentPadding4 = contentPadding;
        goto L166
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r35) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty = $dirty | r18;
        goto L113
    L109:
        r18 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L102
    L98:
        r19 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(contentPadding) == false) goto L87;
        int r110 = 8388608;
    L88:
        $dirty = $dirty | r110;
        goto L90
    L87:
        r110 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L76;
        int r10 = 1048576;
    L77:
        $dirty = $dirty | r10;
        goto L79
    L76:
        r10 = 524288;
        goto L77
    L78:
        border2 = border;
        goto L79
    L60:
        if ((r38 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
    L65:
        r11 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r38 & 16) != 0) goto L53;
        r8 = colors;
        if ($composer2.changed(r8) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        r8 = colors;
        goto L54
    L38:
        if ((r38 & 8) != 0) goto L42;
        r6 = shape;
        if ($composer2.changed(r6) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
    L43:
        r20 = 1024;
        goto L44
    L42:
        r6 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L36
    L32:
        r21 = 128;
        goto L33
    L34:
        r5 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r26;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    L12:
        r13 = r26;
        goto L13
    }

    public static final void FilledTonalButton(final Function0<Unit> r26, Modifier modifier, boolean enabled, Shape shape, ButtonColors colors, ButtonElevation elevation, BorderStroke border, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-1717924381);
        ComposerKt.sourceInformation($composer2, "C(FilledTonalButton)P(8,7,5,9,1,4!1,3,6)277@13636L16,278@13696L25,279@13772L28,285@14013L314:Button.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r26;
    L13:
        int r2 = r38 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r4 = r38 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r5 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape r6 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ButtonColors r8 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        ButtonElevation elevation2 = elevation;
    L68:
        int r14 = r38 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        BorderStroke border2 = border;
    L79:
        int r9 = r38 & 128;
        if (r9 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r7 = r38 & 256;
        if (r7 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r38 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r2 == 0) goto L135;
        Modifier.Companion modifier2 = Modifier.Companion;
    L136:
        if (r4 == 0) goto L138;
        boolean enabled2 = true;
    L140:
        if ((r38 & 8) == 0) goto L142;
        $dirty = $dirty & (-7169);
        Shape shape2 = ButtonDefaults.INSTANCE.getFilledTonalShape($composer2, 6);
    L144:
        if ((r38 & 16) == 0) goto L146;
        ButtonColors colors2 = ButtonDefaults.INSTANCE.filledTonalButtonColors($composer2, 6);
        int $dirty2 = $dirty & (-57345);
    L148:
        if ((r38 & 32) == 0) goto L150;
        int r23 = r9;
        $dirty2 = $dirty2 & (-458753);
        elevation2 = ButtonDefaults.INSTANCE.m1941filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
    L151:
        if (r14 == 0) goto L153;
        border2 = null;
    L153:
        if (r23 == 0) goto L155;
        PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getContentPadding();
    L156:
        if (r7 == 0) goto L158;
        boolean r15 = enabled2;
        BorderStroke border3 = border2;
        boolean enabled3 = r15;
        Modifier modifier3 = modifier2;
        ButtonElevation elevation3 = elevation2;
        Shape shape3 = shape2;
        ButtonColors colors3 = colors2;
        int r0 = -1717924381;
        PaddingValues contentPadding3 = contentPadding2;
        MutableInteractionSource interactionSource2 = null;
        $dirty = $dirty2;
    L159:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L162;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:285)");
    L162:
        Composer $composer3 = $composer2;
        Button(r13, modifier3, enabled3, shape3, colors3, elevation3, border3, contentPadding3, interactionSource2, r35, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L165;
        ComposerKt.traceEventEnd();
    L165:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final ButtonColors colors4 = colors3;
        final ButtonElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final PaddingValues contentPadding4 = contentPadding3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L166:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L170;
        r16.updateScope(new C04801(r26, modifier4, enabled4, shape4, colors4, elevation4, border4, contentPadding4, interactionSource3, r35, $changed, r38));
        return;
    L170:
        return;
    L158:
        boolean r17 = enabled2;
        border3 = border2;
        enabled3 = r17;
        modifier3 = modifier2;
        elevation3 = elevation2;
        shape3 = shape2;
        colors3 = colors2;
        r0 = -1717924381;
        interactionSource2 = interactionSource;
        contentPadding3 = contentPadding2;
        $dirty = $dirty2;
        goto L159
    L155:
        contentPadding2 = contentPadding;
        goto L156
    L150:
        r23 = r9;
        goto L151
    L146:
        colors2 = r8;
        $dirty2 = $dirty;
        goto L148
    L142:
        shape2 = r6;
        goto L144
    L138:
        enabled2 = r5;
        goto L140
    L135:
        modifier2 = r3;
        goto L136
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L127;
        $dirty = $dirty & (-7169);
    L127:
        if ((r38 & 16) == 0) goto L130;
        $dirty = $dirty & (-57345);
    L130:
        if ((r38 & 32) == 0) goto L132;
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty = $dirty & (-458753);
        modifier3 = r3;
        shape3 = r6;
        colors3 = r8;
        elevation3 = elevation2;
        border3 = border2;
        r0 = -1717924381;
        enabled3 = r5;
        goto L159
    L132:
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        modifier3 = r3;
        shape3 = r6;
        colors3 = r8;
        elevation3 = elevation2;
        border3 = border2;
        r0 = -1717924381;
        enabled3 = r5;
        goto L159
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        interactionSource3 = interactionSource;
        modifier4 = r3;
        enabled4 = r5;
        shape4 = r6;
        $composer3 = $composer2;
        colors4 = r8;
        elevation4 = elevation2;
        border4 = border2;
        contentPadding4 = contentPadding;
        goto L166
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r35) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty = $dirty | r18;
        goto L113
    L109:
        r18 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L102
    L98:
        r19 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(contentPadding) == false) goto L87;
        int r110 = 8388608;
    L88:
        $dirty = $dirty | r110;
        goto L90
    L87:
        r110 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L76;
        int r10 = 1048576;
    L77:
        $dirty = $dirty | r10;
        goto L79
    L76:
        r10 = 524288;
        goto L77
    L78:
        border2 = border;
        goto L79
    L60:
        if ((r38 & 32) != 0) goto L64;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
    L65:
        r11 = 65536;
        goto L66
    L64:
        elevation2 = elevation;
        goto L65
    L49:
        if ((r38 & 16) != 0) goto L53;
        r8 = colors;
        if ($composer2.changed(r8) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        r8 = colors;
        goto L54
    L38:
        if ((r38 & 8) != 0) goto L42;
        r6 = shape;
        if ($composer2.changed(r6) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
    L43:
        r20 = 1024;
        goto L44
    L42:
        r6 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L36
    L32:
        r21 = 128;
        goto L33
    L34:
        r5 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r3 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r26;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    L12:
        r13 = r26;
        goto L13
    }

    public static final void OutlinedButton(final Function0<Unit> r26, Modifier modifier, boolean enabled, Shape shape, ButtonColors colors, ButtonElevation elevation, BorderStroke border, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-1694808287);
        ComposerKt.sourceInformation($composer2, "C(OutlinedButton)P(8,7,5,9,1,4!1,3,6)349@17203L13,350@17260L22,352@17367L29,357@17575L314:Button.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r26;
    L13:
        int r3 = r38 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r38 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ButtonColors colors2 = colors;
    L57:
        int r9 = r38 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        ButtonElevation elevation2 = elevation;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        BorderStroke border2 = border;
    L79:
        int r15 = r38 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r0 = r38 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r38 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r3 == 0) goto L135;
        modifier2 = Modifier.Companion;
    L135:
        if (r5 == 0) goto L138;
        enabled2 = true;
    L138:
        if ((r38 & 8) == 0) goto L141;
        $dirty = $dirty & (-7169);
        shape2 = ButtonDefaults.INSTANCE.getOutlinedShape($composer2, 6);
    L141:
        if ((r38 & 16) == 0) goto L143;
        $dirty = $dirty & (-57345);
        colors2 = ButtonDefaults.INSTANCE.outlinedButtonColors($composer2, 6);
    L143:
        if (r9 == 0) goto L146;
        elevation2 = null;
    L146:
        if ((r38 & 64) == 0) goto L148;
        BorderStroke border3 = ButtonDefaults.INSTANCE.outlinedButtonBorder(enabled2, $composer2, (($dirty >> 6) & 14) | 48, 0);
        $dirty = $dirty & (-3670017);
        border2 = border3;
    L148:
        if (r15 == 0) goto L150;
        PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getContentPadding();
    L151:
        if (r0 == 0) goto L153;
        PaddingValues contentPadding3 = contentPadding2;
        MutableInteractionSource interactionSource2 = null;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        ButtonColors colors3 = colors2;
        ButtonElevation elevation3 = elevation2;
        BorderStroke border4 = border2;
        int r1 = -1694808287;
        Modifier modifier3 = modifier2;
    L154:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventStart(r1, $dirty, -1, "androidx.compose.material3.OutlinedButton (Button.kt:357)");
    L157:
        Composer $composer3 = $composer2;
        Button(r13, modifier3, enabled3, shape3, colors3, elevation3, border4, contentPadding3, interactionSource2, r35, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L160;
        ComposerKt.traceEventEnd();
    L160:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final ButtonColors colors4 = colors3;
        final ButtonElevation elevation4 = elevation3;
        final BorderStroke border5 = border4;
        final PaddingValues contentPadding4 = contentPadding3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L161:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L165;
        r14.updateScope(new C04811(r26, modifier4, enabled4, shape4, colors4, elevation4, border5, contentPadding4, interactionSource3, r35, $changed, r38));
        return;
    L165:
        return;
    L153:
        interactionSource2 = interactionSource;
        contentPadding3 = contentPadding2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        border4 = border2;
        r1 = -1694808287;
        modifier3 = modifier2;
        goto L154
    L150:
        contentPadding2 = contentPadding;
        goto L151
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L127;
        $dirty = $dirty & (-7169);
    L127:
        if ((r38 & 16) == 0) goto L130;
        $dirty = $dirty & (-57345);
    L130:
        if ((r38 & 64) == 0) goto L132;
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty = $dirty & (-3670017);
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        border4 = border2;
        r1 = -1694808287;
        modifier3 = modifier2;
        goto L154
    L132:
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        border4 = border2;
        r1 = -1694808287;
        modifier3 = modifier2;
        goto L154
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        interactionSource3 = interactionSource;
        $composer3 = $composer2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        shape4 = shape2;
        colors4 = colors2;
        elevation4 = elevation2;
        border5 = border2;
        contentPadding4 = contentPadding;
        goto L161
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r35) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty = $dirty | r18;
        goto L113
    L109:
        r18 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L102
    L98:
        r19 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(contentPadding) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
        goto L90
    L87:
        r17 = 4194304;
        goto L88
    L71:
        if ((r38 & 64) != 0) goto L75;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        border2 = border;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L69
    L65:
        r110 = 65536;
        goto L66
    L67:
        elevation2 = elevation;
        goto L69
    L49:
        if ((r38 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
    L54:
        r10 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r38 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
    L43:
        r8 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
        goto L36
    L32:
        r7 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r26;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    L12:
        r13 = r26;
        goto L13
    }

    public static final void TextButton(final Function0<Unit> r26, Modifier modifier, boolean enabled, Shape shape, ButtonColors colors, ButtonElevation elevation, BorderStroke border, PaddingValues contentPadding, MutableInteractionSource interactionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-2106428362);
        ComposerKt.sourceInformation($composer2, "C(TextButton)P(8,7,5,9,1,4!1,3,6)422@20900L9,423@20953L18,430@21234L314:Button.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r13 = r26;
    L13:
        int r3 = r38 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r38 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ButtonColors colors2 = colors;
    L57:
        int r9 = r38 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        ButtonElevation elevation2 = elevation;
    L68:
        int r14 = r38 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        BorderStroke border2 = border;
    L79:
        int r0 = r38 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r38 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r38 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L130:
        if (r3 == 0) goto L132;
        modifier2 = Modifier.Companion;
    L132:
        if (r5 == 0) goto L135;
        enabled2 = true;
    L135:
        if ((r38 & 8) == 0) goto L138;
        $dirty = $dirty & (-7169);
        shape2 = ButtonDefaults.INSTANCE.getTextShape($composer2, 6);
    L138:
        if ((r38 & 16) == 0) goto L140;
        $dirty = $dirty & (-57345);
        colors2 = ButtonDefaults.INSTANCE.textButtonColors($composer2, 6);
    L140:
        if (r9 == 0) goto L142;
        elevation2 = null;
    L142:
        if (r14 == 0) goto L144;
        border2 = null;
    L144:
        if (r0 == 0) goto L146;
        PaddingValues contentPadding2 = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
    L147:
        if (r1 == 0) goto L149;
        PaddingValues contentPadding3 = contentPadding2;
        MutableInteractionSource interactionSource2 = null;
        Modifier modifier3 = modifier2;
        Shape shape3 = shape2;
        ButtonColors colors3 = colors2;
        ButtonElevation elevation3 = elevation2;
        BorderStroke border3 = border2;
        int r2 = -2106428362;
        boolean enabled3 = enabled2;
    L150:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventStart(r2, $dirty, -1, "androidx.compose.material3.TextButton (Button.kt:430)");
    L153:
        Composer $composer3 = $composer2;
        Button(r13, modifier3, enabled3, shape3, colors3, elevation3, border3, contentPadding3, interactionSource2, r35, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L156;
        ComposerKt.traceEventEnd();
    L156:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final ButtonColors colors4 = colors3;
        final ButtonElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final PaddingValues contentPadding4 = contentPadding3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L157:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L161;
        r15.updateScope(new C04821(r26, modifier4, enabled4, shape4, colors4, elevation4, border4, contentPadding4, interactionSource3, r35, $changed, r38));
        return;
    L161:
        return;
    L149:
        interactionSource2 = interactionSource;
        contentPadding3 = contentPadding2;
        modifier3 = modifier2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        border3 = border2;
        r2 = -2106428362;
        enabled3 = enabled2;
        goto L150
    L146:
        contentPadding2 = contentPadding;
        goto L147
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L130;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L127;
        $dirty = $dirty & (-7169);
    L127:
        if ((r38 & 16) == 0) goto L129;
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        $dirty = $dirty & (-57345);
        modifier3 = modifier2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        border3 = border2;
        r2 = -2106428362;
        enabled3 = enabled2;
        goto L150
    L129:
        contentPadding3 = contentPadding;
        interactionSource2 = interactionSource;
        modifier3 = modifier2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        border3 = border2;
        r2 = -2106428362;
        enabled3 = enabled2;
        goto L150
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        interactionSource3 = interactionSource;
        $composer3 = $composer2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        shape4 = shape2;
        colors4 = colors2;
        elevation4 = elevation2;
        border4 = border2;
        contentPadding4 = contentPadding;
        goto L157
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r35) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L113
    L109:
        r19 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r110 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r110;
        goto L102
    L98:
        r110 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(contentPadding) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L90
    L87:
        r18 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L79
    L76:
        r16 = 524288;
        goto L77
    L78:
        border2 = border;
        goto L79
    L61:
        if ((196608 & $changed) != 0) goto L67;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L67:
        elevation2 = elevation;
        goto L68
    L49:
        if ((r38 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
    L54:
        r10 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r38 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
    L43:
        r8 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
        goto L36
    L32:
        r7 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r26;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    L12:
        r13 = r26;
        goto L13
    }
}
