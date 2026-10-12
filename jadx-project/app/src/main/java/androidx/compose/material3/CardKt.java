package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001aw\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardKt {
    public static final void Card(Modifier modifier, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r26, Composer $composer, final int $changed, final int r29) {
        Composer $composer2 = $composer.startRestartGroup(1179621553);
        ComposerKt.sourceInformation($composer2, "C(Card)P(4,5,1,3)82@3741L5,83@3786L12,84@3844L15,93@4163L57,95@4259L41,88@3951L349:Card.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r29 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        Shape r4 = shape;
    L25:
        if (($changed & 384) == 0) goto L27;
        CardColors r5 = colors;
    L36:
        if (($changed & 3072) == 0) goto L38;
        CardElevation r8 = elevation;
    L46:
        int r18 = r29 & 16;
        if (r18 == 0) goto L50;
        $dirty = $dirty | 24576;
        BorderStroke r9 = border;
    L58:
        if ((r29 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
    L73:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L88:
        if (r2 == 0) goto L90;
        Modifier.Companion modifier2 = Modifier.Companion;
    L92:
        if ((r29 & 2) == 0) goto L94;
        Shape shape2 = CardDefaults.INSTANCE.getShape($composer2, 6);
        $dirty = $dirty & (-113);
    L96:
        if ((r29 & 4) == 0) goto L98;
        CardColors colors2 = CardDefaults.INSTANCE.cardColors($composer2, 6);
        $dirty = $dirty & (-897);
    L100:
        if ((r29 & 8) == 0) goto L102;
        CardElevation elevation2 = CardDefaults.INSTANCE.m1957cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        $dirty = $dirty & (-7169);
    L103:
        if (r18 == 0) goto L105;
        Shape shape3 = shape2;
        BorderStroke border2 = null;
        Modifier modifier3 = modifier2;
    L106:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L109;
        ComposerKt.traceEventStart(1179621553, $dirty, -1, "androidx.compose.material3.Card (Card.kt:87)");
    L109:
        int $dirty2 = $dirty;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier3, shape3, colors2.m1949containerColorvNxB06k$material3_release(true), colors2.m1950contentColorvNxB06k$material3_release(true), 0.0f, elevation2.shadowElevation$material3_release(true, null, $composer2, (($dirty >> 3) & 896) | 54).getValue().m6987unboximpl(), border2, ComposableLambdaKt.rememberComposableLambda(664103990, true, new AnonymousClass1(r26), $composer2, 54), $composer2, ((($dirty2 & 14) | 12582912) | ($dirty2 & 112)) | (($dirty2 << 6) & 3670016), 16);
        $composer2 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventEnd();
    L112:
        final CardColors colors3 = colors2;
        final CardElevation elevation3 = elevation2;
        final Modifier modifier4 = modifier3;
        final Shape shape4 = shape3;
        final BorderStroke border3 = border2;
    L113:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L117;
        r10.updateScope(new AnonymousClass2(modifier4, shape4, colors3, elevation3, border3, r26, $changed, r29));
        return;
    L117:
        return;
    L105:
        border2 = border;
        modifier3 = modifier2;
        shape3 = shape2;
        goto L106
    L102:
        elevation2 = elevation;
        goto L103
    L98:
        colors2 = r5;
        goto L100
    L94:
        shape2 = r4;
        goto L96
    L90:
        modifier2 = r3;
        goto L92
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L88;
        $composer2.skipToGroupEnd();
        if ((r29 & 2) == 0) goto L82;
        $dirty = $dirty & (-113);
    L82:
        if ((r29 & 4) == 0) goto L85;
        $dirty = $dirty & (-897);
    L85:
        if ((r29 & 8) == 0) goto L87;
        $dirty = $dirty & (-7169);
    L87:
        border2 = r9;
        shape3 = r4;
        colors2 = r5;
        elevation2 = r8;
        modifier3 = r3;
        goto L106
    L70:
        if ($composer2.getSkipping() == false) goto L73;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        colors3 = r5;
        border3 = r9;
        shape4 = r4;
        elevation3 = r8;
        goto L113
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r26) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
        goto L68
    L65:
        r11 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r9 = border;
        if ($composer2.changed(r9) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r9 = border;
        goto L58
    L38:
        if ((r29 & 8) != 0) goto L42;
        r8 = elevation;
        if ($composer2.changed(r8) == false) goto L43;
        int r13 = 2048;
    L44:
        $dirty = $dirty | r13;
    L43:
        r13 = 1024;
        goto L44
    L42:
        r8 = elevation;
        goto L43
    L27:
        if ((r29 & 4) != 0) goto L31;
        r5 = colors;
        if ($composer2.changed(r5) == false) goto L32;
        int r14 = 256;
    L33:
        $dirty = $dirty | r14;
    L32:
        r14 = 128;
        goto L33
    L31:
        r5 = colors;
        goto L32
    L16:
        if ((r29 & 2) != 0) goto L20;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
    L21:
        r6 = 16;
        goto L22
    L20:
        r4 = shape;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L14
    L10:
        r7 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    public static final void Card(final Function0<Unit> r29, Modifier modifier, boolean enabled, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-2024281376);
        ComposerKt.sourceInformation($composer2, "C(Card)P(7,6,4,8,1,3!1,5)141@6394L5,142@6439L12,143@6497L15,157@7034L43,160@7163L41,150@6782L422:Card.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r40 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r40 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        CardColors r12 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        CardElevation r13 = elevation;
    L68:
        int r22 = r40 & 64;
        if (r22 == 0) goto L72;
        $dirty = $dirty | 1572864;
        BorderStroke r14 = border;
    L79:
        int r15 = r40 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r40 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        if ((38347923 & $dirty) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L121:
        if (r4 == 0) goto L123;
        modifier2 = Modifier.Companion;
    L123:
        if (r6 == 0) goto L126;
        enabled2 = true;
    L126:
        if ((r40 & 8) == 0) goto L129;
        $dirty = $dirty & (-7169);
        shape2 = CardDefaults.INSTANCE.getShape($composer2, 6);
    L129:
        if ((r40 & 16) == 0) goto L131;
        CardColors colors2 = CardDefaults.INSTANCE.cardColors($composer2, 6);
        $dirty = $dirty & (-57345);
    L133:
        if ((r40 & 32) == 0) goto L135;
        CardElevation elevation2 = CardDefaults.INSTANCE.m1957cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        Composer $composer3 = $composer2;
        $dirty = $dirty & (-458753);
    L136:
        if (r22 == 0) goto L138;
        BorderStroke border2 = null;
    L139:
        if (r15 == 0) goto L141;
        MutableInteractionSource interactionSource2 = null;
        BorderStroke border3 = border2;
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
    L142:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L145;
        ComposerKt.traceEventStart(-2024281376, $dirty, -1, "androidx.compose.material3.Card (Card.kt:147)");
    L145:
        $composer3.startReplaceGroup(1976524431);
        ComposerKt.sourceInformation($composer3, "149@6738L39");
        if (interactionSource2 != null) goto L152;
        ComposerKt.sourceInformationMarkerStart($composer3, 1976525082, "CC(remember):Card.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L150;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
    L151:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
    L153:
        $composer3.endReplaceGroup();
        Composer $composer4 = $composer3;
        SurfaceKt.m2673Surfaceo_FOJdg(r29, modifier3, enabled3, shape3, colors2.m1949containerColorvNxB06k$material3_release(enabled3), colors2.m1950contentColorvNxB06k$material3_release(enabled3), 0.0f, elevation2.shadowElevation$material3_release(enabled3, interactionSource3, $composer3, (($dirty >> 6) & 14) | (($dirty >> 9) & 896)).getValue().m6987unboximpl(), border3, interactionSource3, ComposableLambdaKt.rememberComposableLambda(776921067, true, new AnonymousClass3(r37), $composer3, 54), $composer4, (((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 6) & 234881024), 6, 64);
        if (ComposerKt.isTraceInProgress() == false) goto L156;
        ComposerKt.traceEventEnd();
    L156:
        final CardColors colors3 = colors2;
        final CardElevation elevation3 = elevation2;
        final MutableInteractionSource interactionSource4 = interactionSource2;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final BorderStroke border4 = border3;
    L157:
        ScopeUpdateScope r16 = $composer4.endRestartGroup();
        if (r16 == null) goto L161;
        r16.updateScope(new AnonymousClass4(r29, modifier4, enabled4, shape4, colors3, elevation3, border4, interactionSource4, r37, $changed, r40));
        return;
    L161:
        return;
    L150:
        value$iv = it$iv;
        goto L151
    L152:
        interactionSource3 = interactionSource2;
        goto L153
    L141:
        interactionSource2 = interactionSource;
        border3 = border2;
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        goto L142
    L138:
        border2 = border;
        goto L139
    L135:
        $composer3 = $composer2;
        elevation2 = elevation;
        goto L136
    L131:
        colors2 = r12;
        goto L133
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L121;
        $composer2.skipToGroupEnd();
        if ((r40 & 8) == 0) goto L115;
        $dirty = $dirty & (-7169);
    L115:
        if ((r40 & 16) == 0) goto L118;
        $dirty = $dirty & (-57345);
    L118:
        if ((r40 & 32) == 0) goto L120;
        interactionSource2 = interactionSource;
        $dirty = $dirty & (-458753);
        $composer3 = $composer2;
        shape3 = shape2;
        colors2 = r12;
        elevation2 = r13;
        border3 = r14;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L142
    L120:
        interactionSource2 = interactionSource;
        $composer3 = $composer2;
        shape3 = shape2;
        colors2 = r12;
        elevation2 = r13;
        border3 = r14;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L142
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        colors3 = r12;
        $composer4 = $composer2;
        enabled4 = enabled2;
        shape4 = shape2;
        elevation3 = r13;
        border4 = r14;
        interactionSource4 = interactionSource;
        goto L157
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r37) == false) goto L98;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r0;
        goto L101
    L98:
        r0 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(interactionSource) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
        goto L91
    L87:
        r17 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r14 = border;
        if ($composer2.changed(r14) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L78:
        r14 = border;
        goto L79
    L60:
        if ((r40 & 32) != 0) goto L64;
        r13 = elevation;
        if ($composer2.changed(r13) == false) goto L65;
        int r19 = 131072;
    L66:
        $dirty = $dirty | r19;
    L65:
        r19 = 65536;
        goto L66
    L64:
        r13 = elevation;
        goto L65
    L49:
        if ((r40 & 16) != 0) goto L53;
        r12 = colors;
        if ($composer2.changed(r12) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
    L54:
        r110 = 8192;
        goto L55
    L53:
        r12 = colors;
        goto L54
    L38:
        if ((r40 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
    L43:
        r111 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L36
    L32:
        r8 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r29) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    }

    public static final void ElevatedCard(Modifier modifier, Shape shape, CardColors colors, CardElevation elevation, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r21, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(895940201);
        ComposerKt.sourceInformation($composer2, "C(ElevatedCard)P(3,4!1,2)195@8668L13,196@8721L20,197@8787L23,200@8868L168:Card.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r24 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        Shape r4 = shape;
    L25:
        if (($changed & 384) == 0) goto L27;
        CardColors r5 = colors;
    L36:
        if (($changed & 3072) == 0) goto L38;
        CardElevation r7 = elevation;
    L47:
        if ((r24 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
    L63:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L66;
    L78:
        if (r2 == 0) goto L80;
        Modifier.Companion modifier2 = Modifier.Companion;
    L82:
        if ((r24 & 2) == 0) goto L84;
        Shape shape2 = CardDefaults.INSTANCE.getElevatedShape($composer2, 6);
        $dirty = $dirty & (-113);
    L86:
        if ((r24 & 4) == 0) goto L88;
        CardColors colors2 = CardDefaults.INSTANCE.elevatedCardColors($composer2, 6);
        $dirty = $dirty & (-897);
    L90:
        if ((r24 & 8) == 0) goto L92;
        Composer $composer3 = $composer2;
        CardElevation elevation2 = CardDefaults.INSTANCE.m1959elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
        $dirty = $dirty & (-7169);
        Modifier modifier3 = modifier2;
        Shape shape3 = shape2;
        CardColors colors3 = colors2;
        CardElevation elevation3 = elevation2;
    L93:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventStart(895940201, $dirty, -1, "androidx.compose.material3.ElevatedCard (Card.kt:200)");
    L96:
        Composer $composer4 = $composer3;
        Card(modifier3, shape3, colors3, elevation3, null, r21, $composer4, ((((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 3) & 458752), 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L99;
        ComposerKt.traceEventEnd();
    L99:
        final Shape shape4 = shape3;
        final CardColors colors4 = colors3;
        final CardElevation elevation4 = elevation3;
        final Modifier modifier4 = modifier3;
    L100:
        ScopeUpdateScope r9 = $composer5.endRestartGroup();
        if (r9 == null) goto L104;
        r9.updateScope(new C04831(modifier4, shape4, colors4, elevation4, r21, $changed, r24));
        return;
    L104:
        return;
    L92:
        $composer3 = $composer2;
        elevation3 = elevation;
        modifier3 = modifier2;
        shape3 = shape2;
        colors3 = colors2;
        goto L93
    L88:
        colors2 = r5;
        goto L90
    L84:
        shape2 = r4;
        goto L86
    L80:
        modifier2 = r3;
        goto L82
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L78;
        $composer2.skipToGroupEnd();
        if ((r24 & 2) == 0) goto L72;
        $dirty = $dirty & (-113);
    L72:
        if ((r24 & 4) == 0) goto L75;
        $dirty = $dirty & (-897);
    L75:
        if ((r24 & 8) == 0) goto L77;
        $dirty = $dirty & (-7169);
    L77:
        shape3 = r4;
        colors3 = r5;
        elevation3 = r7;
        $composer3 = $composer2;
        modifier3 = r3;
        goto L93
    L60:
        if ($composer2.getSkipping() == false) goto L63;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        shape4 = r4;
        colors4 = r5;
        elevation4 = r7;
        $composer5 = $composer2;
        goto L100
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changedInstance(r21) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
        goto L58
    L54:
        r10 = 8192;
        goto L55
    L38:
        if ((r24 & 8) != 0) goto L42;
        r7 = elevation;
        if ($composer2.changed(r7) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
    L43:
        r8 = 1024;
        goto L44
    L42:
        r7 = elevation;
        goto L43
    L27:
        if ((r24 & 4) != 0) goto L31;
        r5 = colors;
        if ($composer2.changed(r5) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        r5 = colors;
        goto L32
    L16:
        if ((r24 & 2) != 0) goto L20;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
    L21:
        r6 = 16;
        goto L22
    L20:
        r4 = shape;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L14
    L10:
        r12 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    public static final void ElevatedCard(final Function0<Unit> r24, Modifier modifier, boolean enabled, Shape shape, CardColors colors, CardElevation elevation, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-1850977784);
        ComposerKt.sourceInformation($composer2, "C(ElevatedCard)P(6,5,3,7!1,2,4)248@11071L13,249@11124L20,250@11190L23,254@11328L269:Card.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r3 = r24;
    L13:
        int r4 = r34 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r34 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        CardColors r11 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        CardElevation r12 = elevation;
    L68:
        int r21 = r34 & 64;
        if (r21 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r13 = interactionSource;
    L80:
        if ((r34 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((4793491 & $dirty) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L111:
        if (r4 == 0) goto L113;
        modifier2 = Modifier.Companion;
    L113:
        if (r6 == 0) goto L116;
        enabled2 = true;
    L116:
        if ((r34 & 8) == 0) goto L119;
        $dirty = $dirty & (-7169);
        shape2 = CardDefaults.INSTANCE.getElevatedShape($composer2, 6);
    L119:
        if ((r34 & 16) == 0) goto L121;
        CardColors colors2 = CardDefaults.INSTANCE.elevatedCardColors($composer2, 6);
        $dirty = $dirty & (-57345);
    L123:
        if ((r34 & 32) == 0) goto L125;
        Composer $composer3 = $composer2;
        CardElevation elevation2 = CardDefaults.INSTANCE.m1959elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
        $dirty = $dirty & (-458753);
    L126:
        if (r21 == 0) goto L128;
        CardColors colors3 = colors2;
        CardElevation elevation3 = elevation2;
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        Composer $composer4 = $composer3;
        MutableInteractionSource interactionSource2 = null;
    L129:
        $composer4.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L132;
        ComposerKt.traceEventStart(-1850977784, $dirty, -1, "androidx.compose.material3.ElevatedCard (Card.kt:254)");
    L132:
        Card(r3, modifier3, enabled3, shape3, colors3, elevation3, null, interactionSource2, r31, $composer4, (((((((($dirty & 14) | 1572864) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (($dirty << 3) & 29360128)) | (234881024 & ($dirty << 3)), 0);
        MutableInteractionSource interactionSource3 = interactionSource2;
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventEnd();
    L135:
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final CardColors colors4 = colors3;
        final CardElevation elevation4 = elevation3;
    L136:
        ScopeUpdateScope r14 = $composer5.endRestartGroup();
        if (r14 == null) goto L140;
        r14.updateScope(new C04842(r24, modifier4, enabled4, shape4, colors4, elevation4, interactionSource4, r31, $changed, r34));
        return;
    L140:
        return;
    L128:
        colors3 = colors2;
        elevation3 = elevation2;
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        $composer4 = $composer3;
        interactionSource2 = interactionSource;
        goto L129
    L125:
        $composer3 = $composer2;
        elevation2 = elevation;
        goto L126
    L121:
        colors2 = r11;
        goto L123
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L111;
        $composer2.skipToGroupEnd();
        if ((r34 & 8) == 0) goto L105;
        $dirty = $dirty & (-7169);
    L105:
        if ((r34 & 16) == 0) goto L108;
        $dirty = $dirty & (-57345);
    L108:
        if ((r34 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
        $composer4 = $composer2;
        shape3 = shape2;
        colors3 = r11;
        elevation3 = r12;
        interactionSource2 = r13;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L129
    L110:
        $composer4 = $composer2;
        shape3 = shape2;
        colors3 = r11;
        elevation3 = r12;
        interactionSource2 = r13;
        modifier3 = modifier2;
        enabled3 = enabled2;
        goto L129
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        colors4 = r11;
        $composer5 = $composer2;
        enabled4 = enabled2;
        shape4 = shape2;
        elevation4 = r12;
        interactionSource4 = r13;
        goto L136
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changedInstance(r31) == false) goto L87;
        int r15 = 8388608;
    L88:
        $dirty = $dirty | r15;
        goto L91
    L87:
        r15 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r13 = interactionSource;
        if ($composer2.changed(r13) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L78:
        r13 = interactionSource;
        goto L80
    L60:
        if ((r34 & 32) != 0) goto L64;
        r12 = elevation;
        if ($composer2.changed(r12) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
    L65:
        r17 = 65536;
        goto L66
    L64:
        r12 = elevation;
        goto L65
    L49:
        if ((r34 & 16) != 0) goto L53;
        r11 = colors;
        if ($composer2.changed(r11) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
    L54:
        r18 = 8192;
        goto L55
    L53:
        r11 = colors;
        goto L54
    L38:
        if ((r34 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r19 = 2048;
    L44:
        $dirty = $dirty | r19;
    L43:
        r19 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L36
    L32:
        r8 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = r24;
        if ($composer2.changedInstance(r3) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    L12:
        r3 = r24;
        goto L13
    }

    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r24, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(740336179);
        ComposerKt.sourceInformation($composer2, "C(OutlinedCard)P(4,5,1,3)297@13151L13,298@13204L20,299@13270L23,300@13335L20,303@13413L170:Card.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r27 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        Shape r4 = shape;
    L25:
        if (($changed & 384) == 0) goto L27;
        CardColors r5 = colors;
    L36:
        if (($changed & 3072) == 0) goto L38;
        CardElevation r6 = elevation;
    L47:
        if (($changed & 24576) == 0) goto L49;
        BorderStroke r8 = border;
    L58:
        if ((r27 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
    L74:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L77;
    L92:
        if (r2 == 0) goto L94;
        Modifier.Companion modifier2 = Modifier.Companion;
    L96:
        if ((r27 & 2) == 0) goto L98;
        Shape shape2 = CardDefaults.INSTANCE.getOutlinedShape($composer2, 6);
        $dirty = $dirty & (-113);
    L100:
        if ((r27 & 4) == 0) goto L102;
        CardColors colors2 = CardDefaults.INSTANCE.outlinedCardColors($composer2, 6);
        $dirty = $dirty & (-897);
    L104:
        if ((r27 & 8) == 0) goto L106;
        Composer $composer3 = $composer2;
        CardElevation elevation2 = CardDefaults.INSTANCE.m1961outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
        $dirty = $dirty & (-7169);
    L108:
        if ((r27 & 16) == 0) goto L110;
        $dirty = $dirty & (-57345);
        Modifier modifier3 = modifier2;
        Shape shape3 = shape2;
        CardColors colors3 = colors2;
        CardElevation elevation3 = elevation2;
        BorderStroke border2 = CardDefaults.INSTANCE.outlinedCardBorder(false, $composer3, 48, 1);
    L111:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L114;
        ComposerKt.traceEventStart(740336179, $dirty, -1, "androidx.compose.material3.OutlinedCard (Card.kt:303)");
    L114:
        Composer $composer4 = $composer3;
        Card(modifier3, shape3, colors3, elevation3, border2, r24, $composer4, ((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventEnd();
    L117:
        final Shape shape4 = shape3;
        final CardColors colors4 = colors3;
        final CardElevation elevation4 = elevation3;
        final BorderStroke border3 = border2;
        final Modifier modifier4 = modifier3;
    L118:
        ScopeUpdateScope r10 = $composer5.endRestartGroup();
        if (r10 == null) goto L122;
        r10.updateScope(new C04851(modifier4, shape4, colors4, elevation4, border3, r24, $changed, r27));
        return;
    L122:
        return;
    L110:
        border2 = border;
        modifier3 = modifier2;
        shape3 = shape2;
        colors3 = colors2;
        elevation3 = elevation2;
        goto L111
    L106:
        $composer3 = $composer2;
        elevation2 = r6;
        goto L108
    L102:
        colors2 = r5;
        goto L104
    L98:
        shape2 = r4;
        goto L100
    L94:
        modifier2 = r3;
        goto L96
    L77:
        if ($composer2.getDefaultsInvalid() == true) goto L92;
        $composer2.skipToGroupEnd();
        if ((r27 & 2) == 0) goto L83;
        $dirty = $dirty & (-113);
    L83:
        if ((r27 & 4) == 0) goto L86;
        $dirty = $dirty & (-897);
    L86:
        if ((r27 & 8) == 0) goto L89;
        $dirty = $dirty & (-7169);
    L89:
        if ((r27 & 16) == 0) goto L91;
        $dirty = $dirty & (-57345);
    L91:
        shape3 = r4;
        colors3 = r5;
        elevation3 = r6;
        border2 = r8;
        $composer3 = $composer2;
        modifier3 = r3;
        goto L111
    L71:
        if ($composer2.getSkipping() == false) goto L74;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        shape4 = r4;
        colors4 = r5;
        elevation4 = r6;
        border3 = r8;
        $composer5 = $composer2;
        goto L118
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changedInstance(r24) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
        goto L69
    L65:
        r11 = 65536;
        goto L66
    L49:
        if ((r27 & 16) != 0) goto L53;
        r8 = border;
        if ($composer2.changed(r8) == false) goto L54;
        int r9 = 16384;
    L55:
        $dirty = $dirty | r9;
    L54:
        r9 = 8192;
        goto L55
    L53:
        r8 = border;
        goto L54
    L38:
        if ((r27 & 8) != 0) goto L42;
        r6 = elevation;
        if ($composer2.changed(r6) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
    L43:
        r12 = 1024;
        goto L44
    L42:
        r6 = elevation;
        goto L43
    L27:
        if ((r27 & 4) != 0) goto L31;
        r5 = colors;
        if ($composer2.changed(r5) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        r5 = colors;
        goto L32
    L16:
        if ((r27 & 2) != 0) goto L20;
        r4 = shape;
        if ($composer2.changed(r4) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
    L21:
        r13 = 16;
        goto L22
    L20:
        r4 = shape;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L14
    L10:
        r14 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    public static final void OutlinedCard(final Function0<Unit> r24, Modifier modifier, boolean enabled, Shape shape, CardColors colors, CardElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-727137250);
        ComposerKt.sourceInformation($composer2, "C(OutlinedCard)P(7,6,4,8,1,3!1,5)352@15710L13,353@15763L20,354@15829L23,355@15894L27,359@16036L271:Card.kt#uh7d8r");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r35 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r35 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        CardColors colors2 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        CardElevation r12 = elevation;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        BorderStroke r13 = border;
    L79:
        int r14 = r35 & 128;
        if (r14 == 0) goto L83;
        $dirty = $dirty | 12582912;
        MutableInteractionSource r15 = interactionSource;
    L91:
        if ((r35 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L125:
        if (r4 == 0) goto L127;
        modifier2 = Modifier.Companion;
    L127:
        if (r6 == 0) goto L130;
        enabled2 = true;
    L130:
        if ((r35 & 8) == 0) goto L133;
        $dirty = $dirty & (-7169);
        shape2 = CardDefaults.INSTANCE.getOutlinedShape($composer2, 6);
    L133:
        if ((r35 & 16) == 0) goto L136;
        $dirty = $dirty & (-57345);
        colors2 = CardDefaults.INSTANCE.outlinedCardColors($composer2, 6);
    L136:
        if ((r35 & 32) == 0) goto L138;
        CardElevation elevation2 = CardDefaults.INSTANCE.m1961outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        Composer $composer3 = $composer2;
        $dirty = $dirty & (-458753);
    L140:
        if ((r35 & 64) == 0) goto L142;
        BorderStroke border2 = CardDefaults.INSTANCE.outlinedCardBorder(enabled2, $composer3, (($dirty >> 6) & 14) | 48, 0);
        $dirty = $dirty & (-3670017);
    L143:
        if (r14 == 0) goto L145;
        MutableInteractionSource interactionSource2 = null;
        CardElevation elevation3 = elevation2;
        Modifier modifier3 = modifier2;
        BorderStroke border3 = border2;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        CardColors colors3 = colors2;
    L146:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventStart(-727137250, $dirty, -1, "androidx.compose.material3.OutlinedCard (Card.kt:359)");
    L149:
        Composer $composer4 = $composer3;
        Card(r24, modifier3, enabled3, shape3, colors3, elevation3, border3, interactionSource2, r32, $composer4, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L152;
        ComposerKt.traceEventEnd();
    L152:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final CardColors colors4 = colors3;
        final CardElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L153:
        ScopeUpdateScope r16 = $composer4.endRestartGroup();
        if (r16 == null) goto L157;
        r16.updateScope(new C04862(r24, modifier4, enabled4, shape4, colors4, elevation4, border4, interactionSource3, r32, $changed, r35));
        return;
    L157:
        return;
    L145:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        modifier3 = modifier2;
        border3 = border2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        goto L146
    L142:
        border2 = border;
        goto L143
    L138:
        $composer3 = $composer2;
        elevation2 = elevation;
        goto L140
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L125;
        $composer2.skipToGroupEnd();
        if ((r35 & 8) == 0) goto L116;
        $dirty = $dirty & (-7169);
    L116:
        if ((r35 & 16) == 0) goto L119;
        $dirty = $dirty & (-57345);
    L119:
        if ((r35 & 32) == 0) goto L122;
        $dirty = $dirty & (-458753);
    L122:
        if ((r35 & 64) == 0) goto L124;
        $dirty = $dirty & (-3670017);
        $composer3 = $composer2;
        enabled3 = enabled2;
        colors3 = colors2;
        elevation3 = r12;
        border3 = r13;
        interactionSource2 = r15;
        modifier3 = modifier2;
        shape3 = shape2;
        goto L146
    L124:
        $composer3 = $composer2;
        enabled3 = enabled2;
        colors3 = colors2;
        elevation3 = r12;
        border3 = r13;
        interactionSource2 = r15;
        modifier3 = modifier2;
        shape3 = shape2;
        goto L146
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        $composer4 = $composer2;
        enabled4 = enabled2;
        shape4 = shape2;
        elevation4 = r12;
        border4 = r13;
        interactionSource3 = r15;
        modifier4 = modifier2;
        colors4 = colors2;
        goto L153
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changedInstance(r32) == false) goto L98;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r17;
        goto L102
    L98:
        r17 = 33554432;
        goto L99
    L83:
        if ((12582912 & $changed) != 0) goto L89;
        r15 = interactionSource;
        if ($composer2.changed(r15) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L91
    L87:
        r18 = 4194304;
        goto L88
    L89:
        r15 = interactionSource;
        goto L91
    L71:
        if ((r35 & 64) != 0) goto L75;
        r13 = border;
        if ($composer2.changed(r13) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
    L76:
        r19 = 524288;
        goto L77
    L75:
        r13 = border;
        goto L76
    L60:
        if ((r35 & 32) != 0) goto L64;
        r12 = elevation;
        if ($composer2.changed(r12) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
    L65:
        r110 = 65536;
        goto L66
    L64:
        r12 = elevation;
        goto L65
    L49:
        if ((r35 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
    L54:
        r111 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r35 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
    L43:
        r9 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L36
    L32:
        r8 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r24) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    }
}
