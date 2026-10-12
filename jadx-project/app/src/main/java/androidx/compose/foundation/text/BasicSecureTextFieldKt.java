package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BasicSecureTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÊ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aÔ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u00052\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b-H\u0003¢\u0006\u0002\u0010.\u001a\u001a\u0010/\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"DefaultObfuscationCharacter", "", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "BasicSecureTextField-Jb9bMDk", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "readOnly", "BasicSecureTextField-egD4TGM", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "then", "next", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    public static final /* synthetic */ void access$DisableCutCopy(Function2 content, Composer $composer, int $changed) {
        DisableCutCopy(content, $composer, $changed);
    }

    public static final /* synthetic */ InputTransformation access$then(InputTransformation $receiver, InputTransformation next) {
        return then($receiver, next);
    }

    /* JADX INFO: renamed from: BasicSecureTextField-egD4TGM, reason: not valid java name */
    public static final void m1025BasicSecureTextFieldegD4TGM(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r43, MutableInteractionSource interactionSource, Brush cursorBrush, TextFieldDecorator decorator, int textObfuscationMode, char textObfuscationCharacter, Composer $composer, final int $changed, final int $changed1, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(-817513499);
        ComposerKt.sourceInformation($composer2, "C(BasicSecureTextField)P(10,6,2,9,3,13,5,7,8,4!2,12:c#foundation.text.input.TextObfuscationMode)134@7973L46,135@8056L60,136@8163L130,136@8121L172,147@8671L129,147@8632L168,154@8844L424,183@9940L852,183@9925L867:BasicSecureTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r10 = r52 & 2;
        if (r10 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r13 = modifier;
    L24:
        int r14 = r52 & 4;
        int r16 = 128;
        if (r14 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r9 = enabled;
    L35:
        int r18 = r52 & 8;
        int r19 = 2048;
        if (r18 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r11 = readOnly;
    L46:
        int r22 = r52 & 16;
        if (r22 == 0) goto L50;
        $dirty = $dirty | 24576;
        InputTransformation r12 = inputTransformation;
    L57:
        int r24 = r52 & 32;
        if (r24 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle r8 = textStyle;
    L68:
        int r26 = r52 & 64;
        if (r26 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r3 = r52 & 128;
        if (r3 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r4 = r52 & 256;
        if (r4 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r5 = r52 & 512;
        if (r5 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r6 = r52 & 1024;
        if (r6 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r7 = r52 & 2048;
        if (r7 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L136:
        int r0 = r52 & 4096;
        if (r0 == 0) goto L139;
        $dirty1 = $dirty1 | 384;
        int r17 = r0;
    L146:
        int r1 = r52 & 8192;
        if (r1 == 0) goto L149;
        $dirty1 = $dirty1 | 3072;
        int r110 = r1;
    L158:
        if (($dirty & 306783379) == 306783378) goto L160;
    L163:
        boolean r2 = true;
    L165:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L254;
        if (r10 == 0) goto L168;
        Modifier.Companion modifier2 = Modifier.Companion;
    L169:
        if (r14 == 0) goto L171;
        final boolean enabled2 = true;
    L172:
        if (r18 == 0) goto L174;
        final boolean readOnly2 = false;
    L175:
        if (r22 == 0) goto L177;
        final InputTransformation inputTransformation2 = null;
    L178:
        if (r24 == 0) goto L180;
        final TextStyle textStyle2 = TextStyle.Companion.getDefault();
    L181:
        if (r26 == 0) goto L183;
        final KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getSecureTextField$foundation_release();
    L184:
        if (r3 == 0) goto L186;
        final KeyboardActionHandler onKeyboardAction2 = null;
    L187:
        if (r4 == 0) goto L189;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r27 = null;
        int r15 = -817513499;
    L190:
        if (r5 == 0) goto L192;
        final MutableInteractionSource interactionSource2 = null;
    L194:
        if (r6 == 0) goto L196;
        final Brush cursorBrush2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    L197:
        if (r7 == 0) goto L199;
        final TextFieldDecorator decorator2 = null;
    L200:
        if (r17 == 0) goto L202;
        int textObfuscationMode2 = TextObfuscationMode.Companion.m1211getRevealLastTypedvTwcZD0();
    L203:
        if (r110 == 0) goto L205;
        char textObfuscationCharacter2 = 8226;
    L207:
        if (ComposerKt.isTraceInProgress() == false) goto L209;
        ComposerKt.traceEventStart(r15, $dirty, $dirty1, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:133)");
    L209:
        final State obfuscationMaskState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(textObfuscationCharacter2), $composer2, ($dirty1 >> 9) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 120990987, "CC(remember):BasicSecureTextField.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L213;
        Object value$iv = new SecureTextFieldController(obfuscationMaskState);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L213:
        final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 120994481, "CC(remember):BasicSecureTextField.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(secureTextFieldController);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L220;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L220;
    L221:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(secureTextFieldController, (Function2) it$iv2, $composer2, 0);
        final boolean revealLastTypedEnabled = TextObfuscationMode.m1206equalsimpl0(textObfuscationMode2, TextObfuscationMode.Companion.m1211getRevealLastTypedvTwcZD0());
        Boolean r20 = Boolean.valueOf(revealLastTypedEnabled);
        ComposerKt.sourceInformationMarkerStart($composer2, 121010736, "CC(remember):BasicSecureTextField.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(revealLastTypedEnabled) | $composer2.changedInstance(secureTextFieldController);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L224;
    L227:
        Object value$iv2 = (Function2) new BasicSecureTextFieldKt$BasicSecureTextField$2$1(revealLastTypedEnabled, secureTextFieldController, null);
        $composer2.updateRememberedValue(value$iv2);
        it$iv3 = value$iv2;
    L228:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r20, (Function2) it$iv3, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 121016567, "CC(remember):BasicSecureTextField.kt#9igjgp");
        if (($dirty1 & 896) != 256) goto L231;
        boolean invalid$iv3 = true;
    L232:
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L239;
        if (it$iv4 == Composer.Companion.getEmpty()) goto L239;
    L246:
        final CodepointTransformation codepointTransformation = (CodepointTransformation) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r21 = KeyInputModifierKt.onPreviewKeyEvent(SemanticsModifierKt.semantics$default(modifier2, false, BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.INSTANCE, 1, null), BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2.INSTANCE);
        if (revealLastTypedEnabled == false) goto L249;
        Modifier.Companion r23 = secureTextFieldController.getFocusChangeModifier();
    L250:
        final Modifier secureTextFieldModifier = r21.then(r23);
        DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(252521481, true, new BasicSecureTextFieldKt$BasicSecureTextField$3(state, secureTextFieldModifier, enabled2, readOnly2, revealLastTypedEnabled, inputTransformation2, secureTextFieldController, textStyle2, keyboardOptions2, onKeyboardAction2, r27, interactionSource2, cursorBrush2, codepointTransformation, decorator2), $composer2, 54), $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L253;
        ComposerKt.traceEventEnd();
    L253:
        final Modifier modifier3 = modifier2;
        final int textObfuscationMode3 = textObfuscationMode2;
        final char textObfuscationCharacter3 = textObfuscationCharacter2;
        final boolean enabled3 = enabled2;
        final boolean readOnly3 = readOnly2;
        final InputTransformation inputTransformation3 = inputTransformation2;
        final TextStyle textStyle3 = textStyle2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final KeyboardActionHandler onKeyboardAction3 = onKeyboardAction2;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r25 = r27;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Brush cursorBrush3 = cursorBrush2;
        final TextFieldDecorator decorator3 = decorator2;
    L255:
        ScopeUpdateScope r28 = $composer2.endRestartGroup();
        if (r28 == null) goto L259;
        r28.updateScope(new BasicSecureTextFieldKt$BasicSecureTextField$4(state, modifier3, enabled3, readOnly3, inputTransformation3, textStyle3, keyboardOptions3, onKeyboardAction3, r25, interactionSource3, cursorBrush3, decorator3, textObfuscationMode3, textObfuscationCharacter3, $changed, $changed1, r52));
        return;
    L259:
        return;
    L249:
        r23 = Modifier.Companion;
    L239:
        if (TextObfuscationMode.m1206equalsimpl0(textObfuscationMode2, TextObfuscationMode.Companion.m1211getRevealLastTypedvTwcZD0()) == false) goto L242;
        Object value$iv3 = secureTextFieldController.getCodepointTransformation();
    L245:
        $composer2.updateRememberedValue(value$iv3);
        it$iv4 = value$iv3;
        goto L246
    L242:
        if (TextObfuscationMode.m1206equalsimpl0(textObfuscationMode2, TextObfuscationMode.Companion.m1210getHiddenvTwcZD0()) == false) goto L244;
        value$iv3 = new BasicSecureTextFieldKt$$ExternalSyntheticLambda0(obfuscationMaskState);
        goto L245
    L244:
        value$iv3 = null;
        goto L245
    L231:
        invalid$iv3 = false;
        goto L232
    L224:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L228;
    L220:
        Object value$iv4 = (Function2) new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
        $composer2.updateRememberedValue(value$iv4);
        it$iv2 = value$iv4;
        goto L221
    L205:
        textObfuscationCharacter2 = textObfuscationCharacter;
        goto L207
    L202:
        textObfuscationMode2 = textObfuscationMode;
        goto L203
    L199:
        decorator2 = decorator;
        goto L200
    L196:
        cursorBrush2 = cursorBrush;
        goto L197
    L192:
        interactionSource2 = interactionSource;
        goto L194
    L189:
        r27 = r43;
        r15 = -817513499;
        goto L190
    L186:
        onKeyboardAction2 = onKeyboardAction;
        goto L187
    L183:
        keyboardOptions2 = keyboardOptions;
        goto L184
    L180:
        textStyle2 = r8;
        goto L181
    L177:
        inputTransformation2 = r12;
        goto L178
    L174:
        readOnly2 = r11;
        goto L175
    L171:
        enabled2 = r9;
        goto L172
    L168:
        modifier2 = r13;
        goto L169
    L254:
        $composer2.skipToGroupEnd();
        keyboardOptions3 = keyboardOptions;
        interactionSource3 = interactionSource;
        textObfuscationCharacter3 = textObfuscationCharacter;
        textStyle3 = r8;
        enabled3 = r9;
        readOnly3 = r11;
        inputTransformation3 = r12;
        modifier3 = r13;
        onKeyboardAction3 = onKeyboardAction;
        r25 = r43;
        cursorBrush3 = cursorBrush;
        decorator3 = decorator;
        textObfuscationMode3 = textObfuscationMode;
        goto L255
    L160:
        if (($dirty1 & 1171) != 1170) goto L163;
        r2 = false;
        goto L165
    L149:
        r110 = r1;
        if (($changed1 & 3072) != 0) goto L158;
        if ($composer2.changed(textObfuscationCharacter) == true) goto L155;
        r19 = 1024;
    L155:
        $dirty1 = $dirty1 | r19;
        goto L158
    L139:
        r17 = r0;
        if (($changed1 & 384) != 0) goto L146;
        if ($composer2.changed(textObfuscationMode) == false) goto L144;
        r16 = 256;
    L144:
        $dirty1 = $dirty1 | r16;
        goto L146
    L127:
        if (($changed1 & 48) != 0) goto L136;
        if (($changed1 & 64) != 0) goto L131;
        boolean r111 = $composer2.changed(decorator);
    L132:
        if (r111 == false) goto L134;
        int r29 = 32;
    L135:
        $dirty1 = $dirty1 | r29;
        goto L136
    L134:
        r29 = 16;
        goto L135
    L131:
        r111 = $composer2.changedInstance(decorator);
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(cursorBrush) == false) goto L120;
        int r112 = 4;
    L121:
        $dirty1 = $dirty1 | r112;
        goto L123
    L120:
        r112 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(interactionSource) == false) goto L109;
        int r31 = 536870912;
    L110:
        $dirty = $dirty | r31;
        goto L112
    L109:
        r31 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r43) == false) goto L98;
        int r30 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r30;
        goto L101
    L98:
        r30 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(onKeyboardAction) == false) goto L87;
        int r210 = 8388608;
    L88:
        $dirty = $dirty | r210;
        goto L90
    L87:
        r210 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(keyboardOptions) == false) goto L76;
        int r211 = 1048576;
    L77:
        $dirty = $dirty | r211;
        goto L79
    L76:
        r211 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r8 = textStyle;
        if ($composer2.changed(r8) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
        goto L68
    L65:
        r212 = 65536;
        goto L66
    L67:
        r8 = textStyle;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r12 = inputTransformation;
        if ($composer2.changed(r12) == false) goto L54;
        int r213 = 16384;
    L55:
        $dirty = $dirty | r213;
        goto L57
    L54:
        r213 = 8192;
        goto L55
    L56:
        r12 = inputTransformation;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r11 = readOnly;
        if ($composer2.changed(r11) == false) goto L43;
        int r214 = 2048;
    L44:
        $dirty = $dirty | r214;
        goto L46
    L43:
        r214 = 1024;
        goto L44
    L45:
        r11 = readOnly;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L32;
        int r113 = 256;
    L33:
        $dirty = $dirty | r113;
        goto L35
    L32:
        r113 = 128;
        goto L33
    L34:
        r9 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = modifier;
        if ($composer2.changed(r13) == false) goto L21;
        int r114 = 32;
    L22:
        $dirty = $dirty | r114;
        goto L24
    L21:
        r114 = 16;
        goto L22
    L23:
        r13 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r115 = 4;
    L11:
        $dirty = $dirty | r115;
        goto L13
    L10:
        r115 = 2;
        goto L11
    }

    static final int BasicSecureTextField_egD4TGM$lambda$4$lambda$3(State $obfuscationMaskState, int r1, int r2) {
        return ((Character) $obfuscationMaskState.getValue()).charValue();
    }

    private static final InputTransformation then(InputTransformation $this$then, InputTransformation next) {
        if ($this$then == null) goto L8;
        if (next != null) goto L7;
        return $this$then;
    L7:
        return InputTransformationKt.then($this$then, next);
    L8:
        return next;
    }

    private static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> r9, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1085555050);
        ComposerKt.sourceInformation($composer2, "C(DisableCutCopy)306@14490L7,308@14536L875,329@15416L80:BasicSecureTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r9) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new AnonymousClass1(r9, $changed));
        return;
    L33:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1085555050, $dirty, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:305)");
    L18:
        ProvidableCompositionLocal<TextToolbar> r1 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final TextToolbar currentToolbar = (TextToolbar) r4;
        ComposerKt.sourceInformationMarkerStart($composer2, -1202758015, "CC(remember):BasicSecureTextField.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(currentToolbar);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L21;
    L24:
        Object value$iv = new BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1(currentToolbar);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L25:
        BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1 copyDisabledToolbar = (BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides(copyDisabledToolbar), r9, $composer2, ProvidedValue.$stable | (($dirty << 3) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L21:
        if (it$iv != Composer.Companion.getEmpty()) goto L25;
    L12:
        r3 = false;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the overload that takes in readOnly parameter.")
    /* JADX INFO: renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    public static final /* synthetic */ void m1024BasicSecureTextFieldJb9bMDk(final TextFieldState state, Modifier modifier, boolean enabled, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Function2 onTextLayout, MutableInteractionSource interactionSource, Brush cursorBrush, TextFieldDecorator decorator, int textObfuscationMode, char textObfuscationCharacter, Composer $composer, final int $changed, final int $changed1, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(1399310985);
        ComposerKt.sourceInformation($composer2, "C(BasicSecureTextField)P(9,6,2,3,12,5,7,8,4!2,11:c#foundation.text.input.TextObfuscationMode)355@16532L563:BasicSecureTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        TextFieldState r6 = state;
    L13:
        int r9 = r52 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r12 = modifier;
    L24:
        int r13 = r52 & 4;
        int r16 = 256;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r7 = enabled;
    L35:
        int r18 = r52 & 8;
        if (r18 == 0) goto L39;
        $dirty = $dirty | 3072;
        InputTransformation r8 = inputTransformation;
    L46:
        int r20 = r52 & 16;
        if (r20 == 0) goto L50;
        $dirty = $dirty | 24576;
        TextStyle r10 = textStyle;
    L57:
        int r22 = r52 & 32;
        if (r22 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        KeyboardOptions r11 = keyboardOptions;
    L68:
        int r24 = r52 & 64;
        if (r24 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r2 = r52 & 128;
        if (r2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r3 = r52 & 256;
        if (r3 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r4 = r52 & 512;
        if (r4 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r5 = r52 & 1024;
        if (r5 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L125:
        int r0 = r52 & 2048;
        if (r0 == 0) goto L129;
        $dirty1 = $dirty1 | 48;
    L136:
        int r1 = r52 & 4096;
        if (r1 == 0) goto L139;
        $dirty1 = $dirty1 | 384;
        int r21 = r1;
    L148:
        if (($dirty & 306783379) == 306783378) goto L150;
    L153:
        boolean r14 = true;
    L155:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L199;
        if (r9 == 0) goto L158;
        Modifier modifier2 = Modifier.Companion;
    L159:
        if (r13 == 0) goto L161;
        boolean enabled2 = true;
        int r15 = r18;
    L162:
        if (r15 == 0) goto L164;
        InputTransformation inputTransformation2 = null;
        int r17 = r20;
    L165:
        if (r17 == 0) goto L167;
        int r35 = r21;
        TextStyle textStyle2 = TextStyle.Companion.getDefault();
        int r19 = r35;
    L168:
        if (r22 == 0) goto L170;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getSecureTextField$foundation_release();
    L171:
        if (r24 == 0) goto L173;
        KeyboardActionHandler onKeyboardAction2 = null;
    L174:
        if (r2 == 0) goto L176;
        Function2 onTextLayout2 = null;
    L177:
        if (r3 == 0) goto L179;
        MutableInteractionSource interactionSource2 = null;
        int r23 = 1399310985;
    L180:
        if (r4 == 0) goto L182;
        Brush cursorBrush2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    L183:
        if (r5 == 0) goto L185;
        TextFieldDecorator decorator2 = null;
    L186:
        if (r0 == 0) goto L188;
        int textObfuscationMode2 = TextObfuscationMode.Companion.m1211getRevealLastTypedvTwcZD0();
    L189:
        if (r19 == 0) goto L191;
        char textObfuscationCharacter2 = 8226;
    L193:
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventStart(r23, $dirty, $dirty1, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:354)");
    L195:
        Composer $composer3 = $composer2;
        m1025BasicSecureTextFieldegD4TGM(r6, modifier2, enabled2, false, inputTransformation2, textStyle2, keyboardOptions2, onKeyboardAction2, onTextLayout2, interactionSource2, cursorBrush2, decorator2, textObfuscationMode2, textObfuscationCharacter2, $composer3, ((((((((($dirty & 14) | 3072) | ($dirty & 112)) | ($dirty & 896)) | (($dirty << 3) & 57344)) | (($dirty << 3) & 458752)) | (($dirty << 3) & 3670016)) | (($dirty << 3) & 29360128)) | (($dirty << 3) & 234881024)) | (($dirty << 3) & 1879048192), (((($dirty >> 27) & 14) | (($dirty1 << 3) & 112)) | (($dirty1 << 3) & 896)) | (($dirty1 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L198;
        ComposerKt.traceEventEnd();
    L198:
        final Modifier modifier3 = modifier2;
        final boolean enabled3 = enabled2;
        final InputTransformation inputTransformation3 = inputTransformation2;
        final TextStyle textStyle3 = textStyle2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final KeyboardActionHandler onKeyboardAction3 = onKeyboardAction2;
        final Function2 onTextLayout3 = onTextLayout2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Brush cursorBrush3 = cursorBrush2;
        final TextFieldDecorator decorator3 = decorator2;
        final int textObfuscationMode3 = textObfuscationMode2;
        final char textObfuscationCharacter3 = textObfuscationCharacter2;
    L200:
        ScopeUpdateScope r25 = $composer3.endRestartGroup();
        if (r25 == null) goto L204;
        r25.updateScope(new BasicSecureTextFieldKt$BasicSecureTextField$5(state, modifier3, enabled3, inputTransformation3, textStyle3, keyboardOptions3, onKeyboardAction3, onTextLayout3, interactionSource3, cursorBrush3, decorator3, textObfuscationMode3, textObfuscationCharacter3, $changed, $changed1, r52));
        return;
    L204:
        return;
    L191:
        textObfuscationCharacter2 = textObfuscationCharacter;
        goto L193
    L188:
        textObfuscationMode2 = textObfuscationMode;
        goto L189
    L185:
        decorator2 = decorator;
        goto L186
    L182:
        cursorBrush2 = cursorBrush;
        goto L183
    L179:
        interactionSource2 = interactionSource;
        r23 = 1399310985;
        goto L180
    L176:
        onTextLayout2 = onTextLayout;
        goto L177
    L173:
        onKeyboardAction2 = onKeyboardAction;
        goto L174
    L170:
        keyboardOptions2 = r11;
        goto L171
    L167:
        r19 = r21;
        textStyle2 = r10;
        goto L168
    L164:
        r17 = r20;
        inputTransformation2 = r8;
        goto L165
    L161:
        r15 = r18;
        enabled2 = r7;
        goto L162
    L158:
        modifier2 = r12;
        goto L159
    L199:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        interactionSource3 = interactionSource;
        textObfuscationCharacter3 = textObfuscationCharacter;
        enabled3 = r7;
        inputTransformation3 = r8;
        textStyle3 = r10;
        keyboardOptions3 = r11;
        modifier3 = r12;
        onKeyboardAction3 = onKeyboardAction;
        onTextLayout3 = onTextLayout;
        cursorBrush3 = cursorBrush;
        decorator3 = decorator;
        textObfuscationMode3 = textObfuscationMode;
        goto L200
    L150:
        if (($dirty1 & 147) != 146) goto L153;
        r14 = false;
        goto L155
    L139:
        r21 = r1;
        if (($changed1 & 384) != 0) goto L148;
        if ($composer2.changed(textObfuscationCharacter) == true) goto L145;
        r16 = 128;
    L145:
        $dirty1 = $dirty1 | r16;
        goto L148
    L129:
        if (($changed1 & 48) != 0) goto L136;
        if ($composer2.changed(textObfuscationMode) == false) goto L133;
        int r26 = 32;
    L134:
        $dirty1 = $dirty1 | r26;
        goto L136
    L133:
        r26 = 16;
        goto L134
    L116:
        if (($changed1 & 6) != 0) goto L125;
        if (($changed1 & 8) != 0) goto L120;
        boolean r29 = $composer2.changed(decorator);
    L121:
        if (r29 == false) goto L123;
        int r110 = 4;
    L124:
        $dirty1 = $dirty1 | r110;
        goto L125
    L123:
        r110 = 2;
        goto L124
    L120:
        r29 = $composer2.changedInstance(decorator);
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(cursorBrush) == false) goto L109;
        int r210 = 536870912;
    L110:
        $dirty = $dirty | r210;
        goto L112
    L109:
        r210 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r28;
        goto L101
    L98:
        r28 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(onTextLayout) == false) goto L87;
        int r27 = 8388608;
    L88:
        $dirty = $dirty | r27;
        goto L90
    L87:
        r27 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(onKeyboardAction) == false) goto L76;
        int r211 = 1048576;
    L77:
        $dirty = $dirty | r211;
        goto L79
    L76:
        r211 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r11 = keyboardOptions;
        if ($composer2.changed(r11) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
        goto L68
    L65:
        r212 = 65536;
        goto L66
    L67:
        r11 = keyboardOptions;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L54;
        int r213 = 16384;
    L55:
        $dirty = $dirty | r213;
        goto L57
    L54:
        r213 = 8192;
        goto L55
    L56:
        r10 = textStyle;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = inputTransformation;
        if ($composer2.changed(r8) == false) goto L43;
        int r214 = 2048;
    L44:
        $dirty = $dirty | r214;
        goto L46
    L43:
        r214 = 1024;
        goto L44
    L45:
        r8 = inputTransformation;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = enabled;
        if ($composer2.changed(r7) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r7 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r12 = modifier;
        if ($composer2.changed(r12) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L24
    L21:
        r112 = 16;
        goto L22
    L23:
        r12 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = state;
        if ($composer2.changed(r6) == false) goto L10;
        int r30 = 4;
    L11:
        $dirty = $dirty | r30;
        goto L13
    L10:
        r30 = 2;
        goto L11
    L12:
        r6 = state;
        goto L13
    }
}
