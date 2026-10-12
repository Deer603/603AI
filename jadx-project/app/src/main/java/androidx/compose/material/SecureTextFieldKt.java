package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SecureTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aô\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aô\u0001\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"DefaultObfuscationCharacter", "", "SecureTextFieldKeyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "OutlinedSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "keyboardOptions", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "OutlinedSecureTextField-0vce7ms", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;ICLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SecureTextField", "SecureTextField-0vce7ms", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final KeyboardOptions SecureTextFieldKeyboardOptions = null;

    /* JADX INFO: renamed from: SecureTextField-0vce7ms, reason: not valid java name */
    public static final void m1755SecureTextField0vce7ms(final TextFieldState state, Modifier modifier, boolean enabled, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r73, Function2<? super Composer, ? super Integer, Unit> r74, Function2<? super Composer, ? super Integer, Unit> r75, Function2<? super Composer, ? super Integer, Unit> r76, boolean isError, InputTransformation inputTransformation, int textObfuscationMode, char textObfuscationCharacter, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r89) {
        Composer $composer2 = $composer.startRestartGroup(-454549898);
        ComposerKt.sourceInformation($composer2, "C(SecureTextField)P(12,8,1,15,6,10,7,16,4,2,14:c#foundation.text.input.TextObfuscationMode,13,5,9,11)134@7753L38,141@8068L20,129@7544L1522:SecureTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r89 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r9 = r89 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r89 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L35:
        int r17 = 2048;
        if (($changed & 3072) == 0) goto L38;
        TextStyle r8 = textStyle;
    L46:
        int r19 = r89 & 16;
        int r20 = 8192;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r10 = r73;
    L57:
        int r23 = r89 & 32;
        if (r23 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r11 = r74;
    L68:
        int r27 = r89 & 64;
        if (r27 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r75;
    L79:
        int r15 = r89 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r0 = r89 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r89 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($changed1 & 6) != 0) goto L123;
        if ((r89 & 1024) != 0) goto L120;
        if ($composer2.changed(textObfuscationMode) == false) goto L120;
        int r16 = 4;
    L121:
        $dirty1 = $dirty1 | r16;
    L120:
        r16 = 2;
    L123:
        int r2 = r89 & 2048;
        if (r2 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r3 = r89 & 4096;
        if (r3 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r22 = r3;
    L145:
        int r4 = r89 & 8192;
        if (r4 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r26 = r4;
    L157:
        if (($changed1 & 24576) != 0) goto L167;
        if ((r89 & 16384) != 0) goto L164;
        if ($composer2.changed(shape) == false) goto L164;
        r20 = 16384;
    L164:
        $dirty1 = $dirty1 | r20;
    L167:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L169;
        int $dirty2 = $dirty1;
    L177:
        int r52 = r89 & 65536;
        if (r52 == 0) goto L181;
        $dirty2 = $dirty2 | 1572864;
        MutableInteractionSource interactionSource2 = interactionSource;
    L188:
        boolean r53 = true;
        if (($dirty & 306783379) == 306783378) goto L191;
    L194:
        boolean r5 = true;
    L196:
        if ($composer2.shouldExecute(r5, $dirty & 1) == false) goto L288;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "107@6390L7,118@6993L14,119@7057L17");
        if (($changed & 1) != 0) goto L200;
    L215:
        if (r9 == 0) goto L217;
        Modifier.Companion modifier3 = Modifier.Companion;
    L218:
        if (r13 == 0) goto L220;
        boolean enabled3 = true;
    L222:
        if ((r89 & 8) == 0) goto L224;
        ProvidableCompositionLocal<TextStyle> r7 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle2 = (TextStyle) r6;
        int $dirty3 = $dirty & (-7169);
    L225:
        if (r19 == 0) goto L227;
        Function2<? super Composer, ? super Integer, Unit> r56 = null;
    L228:
        if (r23 == 0) goto L230;
        Function2<? super Composer, ? super Integer, Unit> r57 = null;
    L231:
        if (r27 == 0) goto L233;
        Function2<? super Composer, ? super Integer, Unit> r58 = null;
    L234:
        if (r15 == 0) goto L236;
        Function2<? super Composer, ? super Integer, Unit> r59 = null;
    L237:
        if (r0 == 0) goto L239;
        boolean isError2 = false;
    L240:
        if (r1 == 0) goto L242;
        InputTransformation inputTransformation2 = null;
    L244:
        if ((r89 & 1024) == 0) goto L246;
        $dirty2 = $dirty2 & (-15);
        int textObfuscationMode2 = TextObfuscationMode.Companion.m1211getRevealLastTypedvTwcZD0();
    L247:
        if (r2 == 0) goto L249;
        char textObfuscationCharacter2 = 8226;
    L250:
        if (r22 == 0) goto L252;
        KeyboardOptions keyboardOptions2 = SecureTextFieldKeyboardOptions;
    L253:
        if (r26 == 0) goto L255;
        KeyboardActionHandler onKeyboardAction2 = null;
    L257:
        if ((r89 & 16384) == 0) goto L259;
        Shape shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer2, 6);
        int $dirty4 = $dirty2 & (-57345);
    L261:
        if ((r89 & 32768) == 0) goto L263;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        $dirty4 = $dirty4 & (-458753);
    L264:
        if (r52 == 0) goto L266;
        interactionSource2 = null;
        modifier2 = modifier3;
        enabled2 = enabled3;
        int $dirty5 = $dirty3;
        r11 = r57;
        r14 = r58;
        int $dirty6 = $dirty4;
    L267:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L270;
        ComposerKt.traceEventStart(-454549898, $dirty5, $dirty6, "androidx.compose.material.SecureTextField (SecureTextField.kt:121)");
    L270:
        if (interactionSource2 != null) goto L276;
        $composer3.startReplaceGroup(-86676725);
        ComposerKt.sourceInformation($composer3, "123@7218L39");
        ComposerKt.sourceInformationMarkerStart($composer3, -1665364009, "CC(remember):SecureTextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L275;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L275:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L277:
        $composer3.startReplaceGroup(-1665358914);
        ComposerKt.sourceInformation($composer3, "*125@7397L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv != 16) goto L281;
        r53 = false;
    L281:
        if (r53 == true) goto L284;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty5 >> 6) & 14) | (($dirty6 >> 12) & 112)).getValue().m4376unboximpl();
    L284:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle2.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        final TextFieldColors colors3 = colors2;
        final boolean enabled4 = enabled2;
        final boolean isError3 = isError2;
        Modifier r12 = SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1816indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier2, enabled4, isError3, interactionSource3, colors3, 0.0f, 0.0f, 48, null), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM());
        TextStyle textStyle3 = textStyle2;
        SolidColor r18 = new SolidColor(colors3.cursorColor(isError3, $composer3, (($dirty5 >> 24) & 14) | (($dirty6 >> 12) & 112)).getValue().m4376unboximpl(), null);
        final Function2<? super Composer, ? super Integer, Unit> r77 = r11;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Function2<? super Composer, ? super Integer, Unit> r78 = r14;
        final Function2<? super Composer, ? super Integer, Unit> r79 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r710 = r59;
        final Shape shape3 = shape2;
        Composer $composer4 = $composer3;
        MutableInteractionSource interactionSource5 = interactionSource3;
        InputTransformation inputTransformation3 = inputTransformation2;
        int textObfuscationMode3 = textObfuscationMode2;
        char textObfuscationCharacter3 = textObfuscationCharacter2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        KeyboardActionHandler onKeyboardAction3 = onKeyboardAction2;
        BasicSecureTextFieldKt.m1024BasicSecureTextFieldJb9bMDk(state, r12, enabled4, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, null, interactionSource5, r18, new SecureTextFieldKt$SecureTextField$1(state, enabled4, interactionSource4, isError3, r79, r77, r78, r710, shape3, colors3), textObfuscationMode3, textObfuscationCharacter3, $composer4, (((($dirty5 & 14) | ($dirty5 & 896)) | (($dirty5 >> 18) & 7168)) | (($dirty6 << 9) & 458752)) | (($dirty6 << 9) & 3670016), (($dirty6 << 3) & 896) | (($dirty6 << 3) & 112), 128);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L287;
        ComposerKt.traceEventEnd();
    L287:
        final MutableInteractionSource interactionSource6 = interactionSource2;
        final TextFieldColors colors4 = colors3;
        final boolean isError4 = isError3;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r11;
        final Modifier modifier4 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r24 = r14;
        final TextStyle textStyle4 = textStyle3;
        final boolean enabled5 = enabled4;
        final Function2<? super Composer, ? super Integer, Unit> r25 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r28 = r59;
        final InputTransformation inputTransformation4 = inputTransformation2;
        final int textObfuscationMode4 = textObfuscationMode2;
        final char textObfuscationCharacter4 = textObfuscationCharacter2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
        final KeyboardActionHandler onKeyboardAction4 = onKeyboardAction2;
        final Shape shape4 = shape2;
    L289:
        ScopeUpdateScope r29 = $composer5.endRestartGroup();
        if (r29 == null) goto L293;
        r29.updateScope(new SecureTextFieldKt$SecureTextField$2(state, modifier4, enabled5, textStyle4, r25, r21, r24, r28, isError4, inputTransformation4, textObfuscationMode4, textObfuscationCharacter4, keyboardOptions4, onKeyboardAction4, shape4, colors4, interactionSource6, $changed, $changed1, r89));
        return;
    L293:
        return;
    L276:
        $composer3.startReplaceGroup(-1665364660);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L277
    L266:
        interactionSource2 = interactionSource;
        modifier2 = modifier3;
        enabled2 = enabled3;
        $dirty5 = $dirty3;
        r11 = r57;
        r14 = r58;
        $dirty6 = $dirty4;
        goto L267
    L263:
        $composer3 = $composer2;
        colors2 = colors;
        goto L264
    L259:
        shape2 = shape;
        $dirty4 = $dirty2;
        goto L261
    L255:
        onKeyboardAction2 = onKeyboardAction;
        goto L257
    L252:
        keyboardOptions2 = keyboardOptions;
        goto L253
    L249:
        textObfuscationCharacter2 = textObfuscationCharacter;
        goto L250
    L246:
        textObfuscationMode2 = textObfuscationMode;
        goto L247
    L242:
        inputTransformation2 = inputTransformation;
        goto L244
    L239:
        isError2 = isError;
        goto L240
    L236:
        r59 = r76;
        goto L237
    L233:
        r58 = r14;
        goto L234
    L230:
        r57 = r11;
        goto L231
    L227:
        r56 = r10;
        goto L228
    L224:
        textStyle2 = r8;
        $dirty3 = $dirty;
        goto L225
    L220:
        enabled3 = enabled2;
        goto L222
    L217:
        modifier3 = modifier2;
        goto L218
    L200:
        if ($composer2.getDefaultsInvalid() == true) goto L215;
        $composer2.skipToGroupEnd();
        if ((r89 & 8) == 0) goto L206;
        $dirty = $dirty & (-7169);
    L206:
        if ((r89 & 1024) == 0) goto L209;
        $dirty2 = $dirty2 & (-15);
    L209:
        if ((r89 & 16384) == 0) goto L212;
        $dirty2 = $dirty2 & (-57345);
    L212:
        if ((r89 & 32768) == 0) goto L214;
        r59 = r76;
        isError2 = isError;
        inputTransformation2 = inputTransformation;
        textObfuscationMode2 = textObfuscationMode;
        textObfuscationCharacter2 = textObfuscationCharacter;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        shape2 = shape;
        $dirty6 = $dirty2 & (-458753);
        $dirty5 = $dirty;
        textStyle2 = r8;
        r56 = r10;
        $composer3 = $composer2;
        colors2 = colors;
        goto L267
    L214:
        r59 = r76;
        isError2 = isError;
        inputTransformation2 = inputTransformation;
        textObfuscationMode2 = textObfuscationMode;
        textObfuscationCharacter2 = textObfuscationCharacter;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        shape2 = shape;
        $dirty5 = $dirty;
        textStyle2 = r8;
        r56 = r10;
        $dirty6 = $dirty2;
        $composer3 = $composer2;
        colors2 = colors;
        goto L267
    L288:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        isError4 = isError;
        keyboardOptions4 = keyboardOptions;
        shape4 = shape;
        colors4 = colors;
        enabled5 = enabled2;
        textStyle4 = r8;
        r25 = r10;
        r21 = r11;
        modifier4 = modifier2;
        r24 = r14;
        r28 = r76;
        inputTransformation4 = inputTransformation;
        textObfuscationMode4 = textObfuscationMode;
        textObfuscationCharacter4 = textObfuscationCharacter;
        onKeyboardAction4 = onKeyboardAction;
        interactionSource6 = interactionSource;
        goto L289
    L191:
        if (($dirty2 & 599187) != 599186) goto L194;
        r5 = false;
        goto L196
    L181:
        if (($changed1 & 1572864) != 0) goto L187;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L185;
        int r210 = 1048576;
    L186:
        $dirty2 = $dirty2 | r210;
        goto L188
    L185:
        r210 = 524288;
        goto L186
    L187:
        interactionSource2 = interactionSource;
        goto L188
    L169:
        if ((r89 & 32768) != 0) goto L173;
        int $dirty7 = $dirty1;
        if ($composer2.changed(colors) == false) goto L174;
        int r110 = 131072;
    L175:
        $dirty2 = $dirty7 | r110;
    L174:
        r110 = 65536;
        goto L175
    L173:
        $dirty7 = $dirty1;
        goto L174
    L148:
        r26 = r4;
        if (($changed1 & 3072) != 0) goto L157;
        if ($composer2.changed(onKeyboardAction) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L157
    L137:
        r22 = r3;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r211 = 256;
    L143:
        $dirty1 = $dirty1 | r211;
        goto L145
    L142:
        r211 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(textObfuscationCharacter) == false) goto L131;
        int r212 = 32;
    L132:
        $dirty1 = $dirty1 | r212;
        goto L134
    L131:
        r212 = 16;
        goto L132
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changed(inputTransformation) == false) goto L109;
        int r33 = 536870912;
    L110:
        $dirty = $dirty | r33;
        goto L113
    L109:
        r33 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(isError) == false) goto L98;
        int r32 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r32;
        goto L101
    L98:
        r32 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r76) == false) goto L87;
        int r31 = 8388608;
    L88:
        $dirty = $dirty | r31;
        goto L90
    L87:
        r31 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r75;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r30 = 1048576;
    L77:
        $dirty = $dirty | r30;
        goto L79
    L76:
        r30 = 524288;
        goto L77
    L78:
        r14 = r75;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r11 = r74;
        if ($composer2.changedInstance(r11) == false) goto L65;
        int r213 = 131072;
    L66:
        $dirty = $dirty | r213;
        goto L68
    L65:
        r213 = 65536;
        goto L66
    L67:
        r11 = r74;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r10 = r73;
        if ($composer2.changedInstance(r10) == false) goto L54;
        int r214 = 16384;
    L55:
        $dirty = $dirty | r214;
        goto L57
    L54:
        r214 = 8192;
        goto L55
    L56:
        r10 = r73;
        goto L57
    L38:
        if ((r89 & 8) != 0) goto L42;
        r8 = textStyle;
        if ($composer2.changed(r8) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
    L43:
        r111 = 1024;
        goto L44
    L42:
        r8 = textStyle;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r34 = 4;
    L11:
        $dirty = $dirty | r34;
        goto L13
    L10:
        r34 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: OutlinedSecureTextField-0vce7ms, reason: not valid java name */
    public static final void m1754OutlinedSecureTextField0vce7ms(final TextFieldState state, Modifier modifier, boolean enabled, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r73, Function2<? super Composer, ? super Integer, Unit> r74, Function2<? super Composer, ? super Integer, Unit> r75, Function2<? super Composer, ? super Integer, Unit> r76, boolean isError, InputTransformation inputTransformation, int textObfuscationMode, char textObfuscationCharacter, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r89) {
        Composer $composer2 = $composer.startRestartGroup(-1990728840);
        ComposerKt.sourceInformation($composer2, "C(OutlinedSecureTextField)P(12,8,1,15,6,10,7,16,4,2,14:c#foundation.text.input.TextObfuscationMode,13,5,9,11)251@14680L7,269@15405L38,276@15720L20,254@14736L2135:SecureTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r89 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r9 = r89 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r89 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L35:
        int r17 = 2048;
        if (($changed & 3072) == 0) goto L38;
        TextStyle textStyle2 = textStyle;
    L46:
        int r19 = r89 & 16;
        int r20 = 8192;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r10 = r73;
    L57:
        int r23 = r89 & 32;
        if (r23 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r11 = r74;
    L68:
        int r27 = r89 & 64;
        if (r27 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r75;
    L79:
        int r15 = r89 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r0 = r89 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r89 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($changed1 & 6) != 0) goto L123;
        if ((r89 & 1024) != 0) goto L120;
        if ($composer2.changed(textObfuscationMode) == false) goto L120;
        int r16 = 4;
    L121:
        $dirty1 = $dirty1 | r16;
    L120:
        r16 = 2;
    L123:
        int r2 = r89 & 2048;
        if (r2 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r3 = r89 & 4096;
        if (r3 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r22 = r3;
    L145:
        int r4 = r89 & 8192;
        if (r4 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r26 = r4;
    L157:
        if (($changed1 & 24576) != 0) goto L167;
        if ((r89 & 16384) != 0) goto L164;
        if ($composer2.changed(shape) == false) goto L164;
        r20 = 16384;
    L164:
        $dirty1 = $dirty1 | r20;
    L167:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L169;
        int $dirty2 = $dirty1;
    L177:
        int r52 = r89 & 65536;
        if (r52 == 0) goto L181;
        $dirty2 = $dirty2 | 1572864;
    L189:
        if (($dirty & 306783379) == 306783378) goto L191;
    L194:
        boolean r5 = true;
    L196:
        if ($composer2.shouldExecute(r5, $dirty & 1) == false) goto L292;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "230@13526L7,241@14129L22,242@14201L25");
        if (($changed & 1) != 0) goto L200;
    L215:
        if (r9 == 0) goto L217;
        Modifier.Companion modifier3 = Modifier.Companion;
    L218:
        if (r13 == 0) goto L220;
        boolean enabled3 = true;
    L222:
        if ((r89 & 8) == 0) goto L224;
        ProvidableCompositionLocal<TextStyle> r7 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle3 = (TextStyle) r6;
        int $dirty3 = $dirty & (-7169);
    L225:
        if (r19 == 0) goto L227;
        Function2<? super Composer, ? super Integer, Unit> r56 = null;
    L228:
        if (r23 == 0) goto L230;
        Function2<? super Composer, ? super Integer, Unit> r57 = null;
    L231:
        if (r27 == 0) goto L233;
        Function2<? super Composer, ? super Integer, Unit> r58 = null;
    L234:
        if (r15 == 0) goto L236;
        Function2<? super Composer, ? super Integer, Unit> r59 = null;
    L237:
        if (r0 == 0) goto L239;
        boolean isError2 = false;
    L240:
        if (r1 == 0) goto L242;
        InputTransformation inputTransformation2 = null;
    L244:
        if ((r89 & 1024) == 0) goto L246;
        $dirty2 = $dirty2 & (-15);
        int textObfuscationMode2 = TextObfuscationMode.Companion.m1211getRevealLastTypedvTwcZD0();
    L247:
        if (r2 == 0) goto L249;
        char textObfuscationCharacter2 = 8226;
    L250:
        if (r22 == 0) goto L252;
        KeyboardOptions keyboardOptions2 = SecureTextFieldKeyboardOptions;
    L253:
        if (r26 == 0) goto L255;
        KeyboardActionHandler onKeyboardAction2 = null;
    L257:
        if ((r89 & 16384) == 0) goto L259;
        Shape shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer2, 6);
        int $dirty4 = $dirty2 & (-57345);
    L261:
        if ((r89 & 32768) == 0) goto L263;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        $dirty4 = $dirty4 & (-458753);
    L264:
        if (r52 == 0) goto L266;
        MutableInteractionSource interactionSource2 = null;
        modifier2 = modifier3;
        enabled2 = enabled3;
        textStyle2 = textStyle3;
        int $dirty5 = $dirty3;
        r11 = r57;
        r14 = r58;
        boolean isError3 = isError2;
        int $dirty6 = $dirty4;
    L267:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L270;
        ComposerKt.traceEventStart(-1990728840, $dirty5, $dirty6, "androidx.compose.material.OutlinedSecureTextField (SecureTextField.kt:244)");
    L270:
        if (interactionSource2 != null) goto L276;
        $composer3.startReplaceGroup(345378573);
        ComposerKt.sourceInformation($composer3, "246@14370L39");
        ComposerKt.sourceInformationMarkerStart($composer3, 842425237, "CC(remember):SecureTextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L275;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L275:
        final MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L277:
        $composer3.startReplaceGroup(842430332);
        ComposerKt.sourceInformation($composer3, "*248@14549L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L280;
        boolean r21 = true;
    L281:
        if (r21 == true) goto L284;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty5 >> 6) & 14) | (($dirty6 >> 12) & 112)).getValue().m4376unboximpl();
    L284:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle2.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        ProvidableCompositionLocal<Density> r8 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r12 = $composer3.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Density density = (Density) r12;
        if (r56 == null) goto L287;
        Modifier.Companion r18 = PaddingKt.m729paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, SecureTextFieldKt$OutlinedSecureTextField$1.INSTANCE), 0.0f, density.mo371toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
    L288:
        Modifier r24 = SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(r18), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM());
        final boolean isError4 = isError3;
        SolidColor r25 = new SolidColor(colors2.cursorColor(isError3, $composer3, (($dirty5 >> 24) & 14) | (($dirty6 >> 12) & 112)).getValue().m4376unboximpl(), null);
        final TextFieldColors colors3 = colors2;
        final boolean enabled4 = enabled2;
        final Function2<? super Composer, ? super Integer, Unit> r77 = r11;
        final Function2<? super Composer, ? super Integer, Unit> r78 = r14;
        final Function2<? super Composer, ? super Integer, Unit> r79 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r710 = r59;
        final Shape shape3 = shape2;
        SolidColor r28 = r25;
        Composer $composer4 = $composer3;
        InputTransformation inputTransformation3 = inputTransformation2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        KeyboardActionHandler onKeyboardAction3 = onKeyboardAction2;
        BasicSecureTextFieldKt.m1024BasicSecureTextFieldJb9bMDk(state, r24, enabled4, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, null, interactionSource3, r28, new SecureTextFieldKt$OutlinedSecureTextField$3(state, enabled4, interactionSource3, isError4, r79, r77, r78, r710, shape3, colors3), textObfuscationMode2, textObfuscationCharacter2, $composer4, (((($dirty5 & 14) | ($dirty5 & 896)) | (($dirty5 >> 18) & 7168)) | (($dirty6 << 9) & 458752)) | (($dirty6 << 9) & 3670016), (($dirty6 << 3) & 112) | (($dirty6 << 3) & 896), 128);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L291;
        ComposerKt.traceEventEnd();
    L291:
        final TextFieldColors colors4 = colors2;
        final MutableInteractionSource interactionSource4 = interactionSource2;
        final TextStyle textStyle4 = textStyle2;
        final Function2<? super Composer, ? super Integer, Unit> r29 = r11;
        final Modifier modifier4 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r30 = r14;
        final boolean enabled5 = enabled4;
        final Function2<? super Composer, ? super Integer, Unit> r31 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r32 = r59;
        final boolean isError5 = isError4;
        final InputTransformation inputTransformation4 = inputTransformation2;
        final int textObfuscationMode3 = textObfuscationMode2;
        final char textObfuscationCharacter3 = textObfuscationCharacter2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
        final KeyboardActionHandler onKeyboardAction4 = onKeyboardAction2;
        final Shape shape4 = shape2;
    L293:
        ScopeUpdateScope r33 = $composer5.endRestartGroup();
        if (r33 == null) goto L297;
        r33.updateScope(new SecureTextFieldKt$OutlinedSecureTextField$4(state, modifier4, enabled5, textStyle4, r31, r29, r30, r32, isError5, inputTransformation4, textObfuscationMode3, textObfuscationCharacter3, keyboardOptions4, onKeyboardAction4, shape4, colors4, interactionSource4, $changed, $changed1, r89));
        return;
    L297:
        return;
    L287:
        r18 = Modifier.Companion;
        goto L288
    L280:
        r21 = false;
        goto L281
    L276:
        $composer3.startReplaceGroup(842424586);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L277
    L266:
        interactionSource2 = interactionSource;
        modifier2 = modifier3;
        enabled2 = enabled3;
        textStyle2 = textStyle3;
        $dirty5 = $dirty3;
        r11 = r57;
        r14 = r58;
        isError3 = isError2;
        $dirty6 = $dirty4;
        goto L267
    L263:
        $composer3 = $composer2;
        colors2 = colors;
        goto L264
    L259:
        shape2 = shape;
        $dirty4 = $dirty2;
        goto L261
    L255:
        onKeyboardAction2 = onKeyboardAction;
        goto L257
    L252:
        keyboardOptions2 = keyboardOptions;
        goto L253
    L249:
        textObfuscationCharacter2 = textObfuscationCharacter;
        goto L250
    L246:
        textObfuscationMode2 = textObfuscationMode;
        goto L247
    L242:
        inputTransformation2 = inputTransformation;
        goto L244
    L239:
        isError2 = isError;
        goto L240
    L236:
        r59 = r76;
        goto L237
    L233:
        r58 = r14;
        goto L234
    L230:
        r57 = r11;
        goto L231
    L227:
        r56 = r10;
        goto L228
    L224:
        textStyle3 = textStyle2;
        $dirty3 = $dirty;
        goto L225
    L220:
        enabled3 = enabled2;
        goto L222
    L217:
        modifier3 = modifier2;
        goto L218
    L200:
        if ($composer2.getDefaultsInvalid() == true) goto L215;
        $composer2.skipToGroupEnd();
        if ((r89 & 8) == 0) goto L206;
        $dirty = $dirty & (-7169);
    L206:
        if ((r89 & 1024) == 0) goto L209;
        $dirty2 = $dirty2 & (-15);
    L209:
        if ((r89 & 16384) == 0) goto L212;
        $dirty2 = $dirty2 & (-57345);
    L212:
        if ((r89 & 32768) == 0) goto L214;
        r59 = r76;
        inputTransformation2 = inputTransformation;
        textObfuscationMode2 = textObfuscationMode;
        textObfuscationCharacter2 = textObfuscationCharacter;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        shape2 = shape;
        interactionSource2 = interactionSource;
        $composer3 = $composer2;
        $dirty5 = $dirty;
        r56 = r10;
        colors2 = colors;
        $dirty6 = $dirty2 & (-458753);
        isError3 = isError;
        goto L267
    L214:
        r59 = r76;
        isError3 = isError;
        inputTransformation2 = inputTransformation;
        textObfuscationMode2 = textObfuscationMode;
        textObfuscationCharacter2 = textObfuscationCharacter;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        shape2 = shape;
        interactionSource2 = interactionSource;
        $composer3 = $composer2;
        $dirty5 = $dirty;
        r56 = r10;
        $dirty6 = $dirty2;
        colors2 = colors;
        goto L267
    L292:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        isError5 = isError;
        keyboardOptions4 = keyboardOptions;
        shape4 = shape;
        colors4 = colors;
        enabled5 = enabled2;
        textStyle4 = textStyle2;
        r31 = r10;
        r29 = r11;
        modifier4 = modifier2;
        r30 = r14;
        r32 = r76;
        inputTransformation4 = inputTransformation;
        textObfuscationMode3 = textObfuscationMode;
        textObfuscationCharacter3 = textObfuscationCharacter;
        onKeyboardAction4 = onKeyboardAction;
        interactionSource4 = interactionSource;
        goto L293
    L191:
        if (($dirty2 & 599187) != 599186) goto L194;
        r5 = false;
        goto L196
    L181:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changed(interactionSource) == false) goto L185;
        int r210 = 1048576;
    L186:
        $dirty2 = $dirty2 | r210;
        goto L189
    L185:
        r210 = 524288;
        goto L186
    L169:
        if ((r89 & 32768) != 0) goto L173;
        int $dirty7 = $dirty1;
        if ($composer2.changed(colors) == false) goto L174;
        int r110 = 131072;
    L175:
        $dirty2 = $dirty7 | r110;
    L174:
        r110 = 65536;
        goto L175
    L173:
        $dirty7 = $dirty1;
        goto L174
    L148:
        r26 = r4;
        if (($changed1 & 3072) != 0) goto L157;
        if ($composer2.changed(onKeyboardAction) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L157
    L137:
        r22 = r3;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r211 = 256;
    L143:
        $dirty1 = $dirty1 | r211;
        goto L145
    L142:
        r211 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(textObfuscationCharacter) == false) goto L131;
        int r212 = 32;
    L132:
        $dirty1 = $dirty1 | r212;
        goto L134
    L131:
        r212 = 16;
        goto L132
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changed(inputTransformation) == false) goto L109;
        int r34 = 536870912;
    L110:
        $dirty = $dirty | r34;
        goto L113
    L109:
        r34 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(isError) == false) goto L98;
        int r35 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r35;
        goto L101
    L98:
        r35 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r76) == false) goto L87;
        int r36 = 8388608;
    L88:
        $dirty = $dirty | r36;
        goto L90
    L87:
        r36 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r75;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r37 = 1048576;
    L77:
        $dirty = $dirty | r37;
        goto L79
    L76:
        r37 = 524288;
        goto L77
    L78:
        r14 = r75;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r11 = r74;
        if ($composer2.changedInstance(r11) == false) goto L65;
        int r213 = 131072;
    L66:
        $dirty = $dirty | r213;
        goto L68
    L65:
        r213 = 65536;
        goto L66
    L67:
        r11 = r74;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r10 = r73;
        if ($composer2.changedInstance(r10) == false) goto L54;
        int r214 = 16384;
    L55:
        $dirty = $dirty | r214;
        goto L57
    L54:
        r214 = 8192;
        goto L55
    L56:
        r10 = r73;
        goto L57
    L38:
        if ((r89 & 8) != 0) goto L42;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
    L43:
        r111 = 1024;
        goto L44
    L42:
        textStyle2 = textStyle;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r38 = 4;
    L11:
        $dirty = $dirty | r38;
        goto L13
    L10:
        r38 = 2;
        goto L11
    }

    static {
        SecureTextFieldKeyboardOptions = new KeyboardOptions(0, false, KeyboardType.Companion.m6655getPasswordPjHm6EE(), 0, null, null, null, 121, null);
    }
}
