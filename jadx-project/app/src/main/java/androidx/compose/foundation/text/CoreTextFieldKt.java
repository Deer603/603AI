package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aú\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0002\u0010%\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010*\u001a\u001d\u0010+\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010-\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\u0010/\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u000202H\u0002\u001a \u00103\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00104\u001a\u000205H\u0002\u001a0\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u0002082\u0006\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00104\u001a\u000205H\u0002\u001a \u00109\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0013H\u0000\u001a2\u0010=\u001a\u00020\u0001*\u00020>2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\r2\u0006\u00104\u001a\u000205H\u0080@¢\u0006\u0002\u0010B\u001a\u001c\u0010C\u001a\u00020\u0007*\u00020\u00072\u0006\u00101\u001a\u0002022\u0006\u0010'\u001a\u00020(H\u0002¨\u0006D²\u0006\n\u0010E\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "innerTextField", "textScrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoreTextFieldKt {
    public static final /* synthetic */ boolean access$CoreTextField$lambda$11(State $writeable$delegate) {
        return CoreTextField$lambda$11($writeable$delegate);
    }

    public static final /* synthetic */ void access$CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager manager, Function2 content, Composer $composer, int $changed) {
        CoreTextFieldRootBox(modifier, manager, content, $composer, $changed);
    }

    public static final /* synthetic */ void access$SelectionToolbarAndHandles(TextFieldSelectionManager manager, boolean show, Composer $composer, int $changed) {
        SelectionToolbarAndHandles(manager, show, $composer, $changed);
    }

    public static final /* synthetic */ void access$endInputSession(LegacyTextFieldState state) {
        endInputSession(state);
    }

    public static final /* synthetic */ void access$notifyFocusedRect(LegacyTextFieldState state, TextFieldValue value, OffsetMapping offsetMapping) {
        notifyFocusedRect(state, value, offsetMapping);
    }

    public static final /* synthetic */ void access$startInputSession(TextInputService textInputService, LegacyTextFieldState state, TextFieldValue value, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        startInputSession(textInputService, state, value, imeOptions, offsetMapping);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void CoreTextField(final TextFieldValue r61, final Function1<? super TextFieldValue, Unit> r62, Modifier r63, TextStyle r64, VisualTransformation r65, Function1<? super TextLayoutResult, Unit> r66, MutableInteractionSource r67, Brush r68, boolean r69, int r70, int r71, ImeOptions r72, KeyboardActions r73, boolean r74, boolean r75, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r76, TextFieldScrollerPosition r77, Composer r78, final int r79, final int r80, final int r81) {
        Composer r4 = r78.startRestartGroup(-244533042);
        ComposerKt.sourceInformation(r4, "C(CoreTextField)P(15,10,8,14,16,9,4!1,12,6,7,3,5,2,11)205@11555L29,206@11625L58,207@11729L72,212@11859L7,213@11920L7,214@11988L7,215@12053L7,216@12098L7,217@12167L7,238@13009L277,250@13591L21,252@13637L451,281@14487L26,284@14580L24,285@14638L37,287@14695L51,293@14984L7,295@15079L7,296@15136L7,307@15466L1513,342@17086L42,343@17154L970,343@17133L991,369@18194L28,370@18290L991,399@19571L576,417@20218L1605,470@22434L48,470@22408L74,472@22517L502,472@22488L531,504@23693L987,521@24743L7,523@24812L151,554@26109L5402,554@26056L5455:CoreTextField.kt#423gt5");
        int r5 = r79;
        int r6 = r80;
        if ((r81 & 1) == 0) goto L6;
        r5 = r5 | 6;
    L13:
        if ((r81 & 2) == 0) goto L16;
        r5 = r5 | 48;
    L23:
        int r12 = r81 & 4;
        if (r12 == 0) goto L27;
        r5 = r5 | 384;
        Modifier r15 = r63;
    L34:
        int r16 = r81 & 8;
        int r17 = 1024;
        if (r16 == 0) goto L38;
        r5 = r5 | 3072;
        TextStyle r13 = r64;
    L45:
        int r19 = r81 & 16;
        if (r19 == 0) goto L49;
        r5 = r5 | 24576;
        VisualTransformation r8 = r65;
    L56:
        int r22 = r81 & 32;
        if (r22 == 0) goto L60;
        r5 = r5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function1<? super TextLayoutResult, Unit> r11 = r66;
    L67:
        int r25 = r81 & 64;
        if (r25 == 0) goto L71;
        r5 = r5 | 1572864;
        MutableInteractionSource r10 = r67;
    L78:
        int r14 = r81 & 128;
        if (r14 == 0) goto L82;
        r5 = r5 | 12582912;
        Brush r9 = r68;
    L89:
        int r0 = r81 & 256;
        if (r0 == 0) goto L93;
        r5 = r5 | 100663296;
    L100:
        int r1 = r81 & 512;
        if (r1 == 0) goto L104;
        r5 = r5 | 805306368;
    L111:
        int r2 = r81 & 1024;
        if (r2 == 0) goto L115;
        r6 = r6 | 6;
    L123:
        if ((r80 & 48) != 0) goto L133;
        if ((r81 & 2048) != 0) goto L130;
        if (r4.changed(r72) == false) goto L130;
        int r33 = 32;
    L131:
        r6 = r6 | r33;
    L130:
        r33 = 16;
    L133:
        int r3 = r81 & 4096;
        if (r3 == 0) goto L136;
        r6 = r6 | 384;
        int r34 = r3;
    L144:
        int r7 = r81 & 8192;
        if (r7 == 0) goto L147;
        r6 = r6 | 3072;
        int r18 = r7;
    L154:
        int r20 = r81 & 16384;
        if (r20 == 0) goto L157;
        r6 = r6 | 24576;
        int r110 = r20;
    L165:
        int r21 = r81 & 32768;
        if (r21 == 0) goto L169;
        r6 = r6 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L176:
        int r23 = r81 & 65536;
        if (r23 == 0) goto L180;
        r6 = r6 | 1572864;
    L187:
        int r710 = r6;
        if ((r5 & 306783379) == 306783378) goto L190;
    L193:
        boolean r24 = true;
    L195:
        if (r4.shouldExecute(r24, r5 & 1) == false) goto L529;
        r4.startDefaults();
        ComposerKt.sourceInformation(r4, "");
        if ((r79 & 1) != 0) goto L199;
    L205:
        if (r12 == 0) goto L207;
        r15 = Modifier.Companion;
    L207:
        if (r16 == 0) goto L209;
        r13 = TextStyle.Companion.getDefault();
    L209:
        if (r19 == 0) goto L211;
        VisualTransformation r26 = VisualTransformation.Companion.getNone();
    L212:
        if (r22 == 0) goto L214;
        r11 = AnonymousClass1.INSTANCE;
    L214:
        if (r25 == 0) goto L216;
        MutableInteractionSource r27 = null;
    L217:
        if (r14 == 0) goto L219;
        SolidColor r28 = new SolidColor(Color.Companion.m4402getUnspecified0d7_KjU(), null);
    L220:
        if (r0 == 0) goto L222;
        boolean r29 = true;
    L223:
        if (r1 == 0) goto L225;
        int r30 = Integer.MAX_VALUE;
    L226:
        if (r2 == 0) goto L228;
        int r31 = 1;
    L230:
        if ((r81 & 2048) == 0) goto L232;
        ImeOptions r111 = ImeOptions.Companion.getDefault();
        int r112 = r710 & (-113);
    L233:
        if (r34 == 0) goto L235;
        KeyboardActions r113 = KeyboardActions.Companion.getDefault();
    L236:
        if (r18 == 0) goto L238;
        boolean r114 = true;
    L239:
        if (r110 == 0) goto L241;
        boolean r115 = false;
    L242:
        if (r21 == 0) goto L244;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r116 = ComposableSingletons$CoreTextFieldKt.INSTANCE.m1045getLambda1$foundation_release();
    L245:
        if (r23 == 0) goto L247;
        TextFieldScrollerPosition r210 = null;
        int r32 = r30;
        r8 = r26;
        Modifier r35 = r15;
        boolean r117 = r115;
        final Function1<? super TextLayoutResult, Unit> r118 = r11;
        ImeOptions r119 = r111;
        int r120 = r31;
        int r36 = r32;
        int r37 = r112;
        boolean r121 = r114;
    L248:
        r4.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L252;
        ComposerKt.traceEventStart(-244533042, r5, r37, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:204)");
    L252:
        ComposerKt.sourceInformationMarkerStart(r4, -1705381372, "CC(remember):CoreTextField.kt#9igjgp");
        int r211 = r5;
        Object r38 = r4.rememberedValue();
        if (r38 != Composer.Companion.getEmpty()) goto L255;
        Object r39 = new FocusRequester();
        r4.updateRememberedValue(r39);
    L256:
        FocusRequester r40 = (FocusRequester) r39;
        ComposerKt.sourceInformationMarkerEnd(r4);
        ComposerKt.sourceInformationMarkerStart(r4, -1705379103, "CC(remember):CoreTextField.kt#9igjgp");
        Object r41 = r4.rememberedValue();
        boolean r711 = r29;
        if (r41 != Composer.Companion.getEmpty()) goto L259;
        Object r42 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
        r4.updateRememberedValue(r42);
    L260:
        LegacyPlatformTextInputServiceAdapter r43 = (LegacyPlatformTextInputServiceAdapter) r42;
        ComposerKt.sourceInformationMarkerEnd(r4);
        ComposerKt.sourceInformationMarkerStart(r4, -1705375761, "CC(remember):CoreTextField.kt#9igjgp");
        Object r44 = r4.rememberedValue();
        final int r712 = r120;
        if (r44 != Composer.Companion.getEmpty()) goto L264;
        r44 = new TextInputService(r43);
        r4.updateRememberedValue(r44);
    L264:
        final TextInputService r45 = (TextInputService) r44;
        ComposerKt.sourceInformationMarkerEnd(r4);
        ProvidableCompositionLocal<Density> r122 = CompositionLocalsKt.getLocalDensity();
        TextStyle r713 = r13;
        ComposerKt.sourceInformationMarkerStart(r4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r212 = r4.consume(r122);
        ComposerKt.sourceInformationMarkerEnd(r4);
        Density r123 = (Density) r212;
        ProvidableCompositionLocal<FontFamily.Resolver> r124 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(r4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r125 = r4.consume(r124);
        ComposerKt.sourceInformationMarkerEnd(r4);
        FontFamily.Resolver r126 = (FontFamily.Resolver) r125;
        ProvidableCompositionLocal<TextSelectionColors> r127 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart(r4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r128 = r4.consume(r127);
        ComposerKt.sourceInformationMarkerEnd(r4);
        long r310 = ((TextSelectionColors) r128).m1512getBackgroundColor0d7_KjU();
        ProvidableCompositionLocal<FocusManager> r129 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(r4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r130 = r4.consume(r129);
        ComposerKt.sourceInformationMarkerEnd(r4);
        FocusManager r131 = (FocusManager) r130;
        ProvidableCompositionLocal<WindowInfo> r132 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart(r4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r133 = r4.consume(r132);
        ComposerKt.sourceInformationMarkerEnd(r4);
        WindowInfo r134 = (WindowInfo) r133;
        ProvidableCompositionLocal<SoftwareKeyboardController> r135 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        final boolean r213 = r117;
        ComposerKt.sourceInformationMarkerStart(r4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r136 = r4.consume(r135);
        ComposerKt.sourceInformationMarkerEnd(r4);
        SoftwareKeyboardController r137 = (SoftwareKeyboardController) r136;
        if (r36 != 1) goto L271;
        String r138 = "CC(remember):CoreTextField.kt#9igjgp";
        if (r711 == false) goto L269;
    L272:
        boolean r214 = false;
    L273:
        if (r214 == false) goto L275;
        Orientation r311 = Orientation.Horizontal;
    L276:
        Orientation r312 = r311;
        if (r210 != null) goto L287;
        r4.startReplaceGroup(-1705353356);
        ComposerKt.sourceInformation(r4, "224@12498L70,224@12427L141");
        Object[] r46 = {r312};
        Saver<TextFieldScrollerPosition, Object> r313 = TextFieldScrollerPosition.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart(r4, -1705351155, r138);
        final Orientation r47 = r312;
        boolean r314 = r4.changed(r47);
        Object r48 = r4.rememberedValue();
        if (r314 == true) goto L284;
        LegacyPlatformTextInputServiceAdapter r315 = r43;
        if (r48 != Composer.Companion.getEmpty()) goto L286;
    L285:
        r48 = (Function0) new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(r47);
        r4.updateRememberedValue(r48);
    L286:
        ComposerKt.sourceInformationMarkerEnd(r4);
        Composer r49 = r4;
        TextFieldScrollerPosition r50 = (TextFieldScrollerPosition) RememberSaveableKt.m3923rememberSaveable(r46, r313, null, (Function0) r48, r4, 0, 4);
        r49.endReplaceGroup();
    L288:
        final TextFieldScrollerPosition r316 = r50;
        if (r316.getOrientation() == r47) goto L296;
        StringBuilder r139 = new StringBuilder().append("Mismatching scroller orientation; ");
        if (r47 != Orientation.Vertical) goto L293;
        String r140 = "only single-line, non-wrap text fields can scroll horizontally";
    L295:
        throw new IllegalArgumentException(r139.append(r140).toString());
    L293:
        r140 = "single-line, non-wrap text fields can only scroll horizontally";
        goto L295
    L296:
        ComposerKt.sourceInformationMarkerStart(r49, -1705334596, r138);
        if ((r211 & 14) != 4) goto L299;
        boolean r51 = true;
    L300:
        boolean r610 = r51;
        if ((r211 & 57344) != 16384) goto L303;
        boolean r52 = true;
    L304:
        boolean r53 = r610 | r52;
        Composer r54 = r49;
        Object r55 = r54.rememberedValue();
        if (r53 == true) goto L310;
        int r317 = r36;
        if (r55 == Composer.Companion.getEmpty()) goto L311;
        MutableInteractionSource r410 = r27;
        WindowInfo r411 = r134;
        Object r56 = r55;
    L320:
        TransformedText r57 = (TransformedText) r56;
        ComposerKt.sourceInformationMarkerEnd(r49);
        AnnotatedString r58 = r57.getText();
        final OffsetMapping r59 = r57.getOffsetMapping();
        RecomposeScope r141 = ComposablesKt.getCurrentRecomposeScope(r49, 0);
        ComposerKt.sourceInformationMarkerStart(r49, -1705314326, r138);
        boolean r60 = r49.changed(r137);
        Composer r318 = r49;
        Object r82 = r318.rememberedValue();
        if (r60 == true) goto L326;
        AnnotatedString r611 = r58;
        if (r82 == Composer.Companion.getEmpty()) goto L327;
        AnnotatedString r412 = r611;
        boolean r413 = r711;
        TextStyle r414 = r713;
        Density r415 = r123;
        FontFamily.Resolver r416 = r126;
    L328:
        LegacyTextFieldState r83 = (LegacyTextFieldState) r82;
        ComposerKt.sourceInformationMarkerEnd(r49);
        KeyboardActions r714 = r113;
        TextStyle r612 = r414;
        AnnotatedString r613 = r412;
        r83.m1076updatefnh65Uc(r61.getAnnotatedString(), r613, r612, r413, r415, r416, r62, r714, r131, r310);
        r83.getProcessor().reset(r61, r83.getInputSession());
        ComposerKt.sourceInformationMarkerStart(r49, -1705287551, r138);
        Composer r142 = r49;
        Object r84 = r142.rememberedValue();
        if (r84 != Composer.Companion.getEmpty()) goto L332;
        r84 = new UndoManager(0, 1, null);
        r142.updateRememberedValue(r84);
    L332:
        UndoManager r85 = (UndoManager) r84;
        ComposerKt.sourceInformationMarkerEnd(r49);
        UndoManager.snapshotIfNeeded$default(r85, r61, 0, 2, null);
        ComposerKt.sourceInformationMarkerStart(r49, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        Composer r86 = r49;
        ComposerKt.sourceInformationMarkerStart(r49, -954203484, "CC(remember):Effects.kt#9igjgp");
        Composer r143 = r49;
        Object r144 = r143.rememberedValue();
        ImeOptions r614 = r119;
        if (r144 != Composer.Companion.getEmpty()) goto L336;
        r144 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r86);
        r143.updateRememberedValue(r144);
    L336:
        final CoroutineScope r145 = (CoroutineScope) r144;
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerStart(r49, -1705282708, r138);
        Composer r146 = r49;
        Object r87 = r146.rememberedValue();
        if (r87 != Composer.Companion.getEmpty()) goto L340;
        BringIntoViewRequester r147 = BringIntoViewRequesterKt.BringIntoViewRequester();
        r146.updateRememberedValue(r147);
        r87 = r147;
    L340:
        final BringIntoViewRequester r88 = (BringIntoViewRequester) r87;
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerStart(r49, -1705280870, r138);
        Composer r148 = r49;
        Object r149 = r148.rememberedValue();
        if (r149 != Composer.Companion.getEmpty()) goto L344;
        TextFieldSelectionManager r89 = new TextFieldSelectionManager(r85);
        r148.updateRememberedValue(r89);
        r149 = r89;
    L344:
        final TextFieldSelectionManager r90 = (TextFieldSelectionManager) r149;
        ComposerKt.sourceInformationMarkerEnd(r49);
        r90.setOffsetMapping$foundation_release(r59);
        r90.setVisualTransformation$foundation_release(r8);
        r90.setOnValueChange$foundation_release(r83.getOnValueChange());
        r90.setState$foundation_release(r83);
        r90.setValue$foundation_release(r61);
        ProvidableCompositionLocal<Clipboard> r150 = CompositionLocalsKt.getLocalClipboard();
        ComposerKt.sourceInformationMarkerStart(r49, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r91 = r49.consume(r150);
        ComposerKt.sourceInformationMarkerEnd(r49);
        r90.setClipboard$foundation_release((Clipboard) r91);
        r90.setCoroutineScope$foundation_release(r145);
        ProvidableCompositionLocal<TextToolbar> r92 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(r49, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r93 = r49.consume(r92);
        ComposerKt.sourceInformationMarkerEnd(r49);
        r90.setTextToolbar((TextToolbar) r93);
        ProvidableCompositionLocal<HapticFeedback> r94 = CompositionLocalsKt.getLocalHapticFeedback();
        ComposerKt.sourceInformationMarkerStart(r49, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r151 = r49.consume(r94);
        ComposerKt.sourceInformationMarkerEnd(r49);
        r90.setHapticFeedBack((HapticFeedback) r151);
        r90.setFocusRequester(r40);
        r90.setEditable(!r213);
        r90.setEnabled(r121);
        Modifier.Companion r95 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r49, -1705254736, r138);
        boolean r96 = r49.changedInstance(r83);
        if ((r37 & 7168) != 2048) goto L347;
        boolean r152 = true;
    L348:
        boolean r97 = r96 | r152;
        if ((57344 & r37) != 16384) goto L351;
        boolean r153 = true;
    L352:
        boolean r98 = (r97 | r153) | r49.changedInstance(r45);
        if ((r211 & 14) != 4) goto L355;
        boolean r154 = true;
    L356:
        boolean r99 = r98 | r154;
        if (((r37 & 112) ^ 48) <= 32) goto L362;
        ImeOptions r155 = r614;
        if (r49.changed(r155) == false) goto L363;
        boolean r615 = r99;
    L365:
        boolean r100 = true;
    L367:
        boolean r101 = ((((r615 | r100) | r49.changedInstance(r59)) | r49.changedInstance(r145)) | r49.changedInstance(r88)) | r49.changedInstance(r90);
        Composer r319 = r49;
        Object r102 = r319.rememberedValue();
        if (r101 == true) goto L373;
        LegacyTextFieldState r616 = r83;
        if (r102 == Composer.Companion.getEmpty()) goto L374;
        Object r103 = r102;
        TextFieldSelectionManager r104 = r90;
        BringIntoViewRequester r510 = r88;
        boolean r105 = r121;
        LegacyTextFieldState r156 = r616;
        OffsetMapping r157 = r59;
        TextInputService r106 = r45;
        final TextFieldValue r107 = r61;
    L375:
        ComposerKt.sourceInformationMarkerEnd(r49);
        MutableInteractionSource r158 = r410;
        Modifier r108 = TextFieldGestureModifiersKt.textFieldFocusModifier(r95, r105, r40, r158, (Function1) r103);
        if (r105 == false) goto L379;
        if (r213 == true) goto L379;
        boolean r109 = true;
    L380:
        final FocusRequester r715 = r40;
        State r159 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(r109), r49, 0);
        Unit r160 = Unit.INSTANCE;
        final boolean r320 = r105;
        ComposerKt.sourceInformationMarkerStart(r49, -1705201263, r138);
        boolean r161 = ((r49.changed(r159) | r49.changedInstance(r156)) | r49.changedInstance(r106)) | r49.changedInstance(r104);
        TextFieldSelectionManager r716 = r104;
        if (((r37 & 112) ^ 48) <= 32) goto L385;
        if (r49.changed(r155) == false) goto L385;
    L386:
        boolean r162 = true;
    L388:
        boolean r163 = r162 | r161;
        Composer r164 = r49;
        Object r165 = r164.rememberedValue();
        if (r163 == true) goto L394;
        TextInputService r617 = r106;
        if (r165 == Composer.Companion.getEmpty()) goto L395;
        TextFieldSelectionManager r166 = r716;
        Object r167 = r165;
        final LegacyTextFieldState r168 = r156;
        ImeOptions r169 = r155;
        final TextInputService r170 = r617;
    L396:
        ComposerKt.sourceInformationMarkerEnd(r49);
        EffectsKt.LaunchedEffect(r160, (Function2) r167, r49, 6);
        Modifier.Companion r171 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r49, -1705168925, r138);
        boolean r172 = r49.changedInstance(r168);
        Composer r173 = r49;
        Object r174 = r173.rememberedValue();
        if (r172 == true) goto L402;
        ImeOptions r717 = r169;
        if (r174 != Composer.Companion.getEmpty()) goto L404;
    L403:
        r174 = (Function1) new CoreTextFieldKt$CoreTextField$pointerModifier$1$1(r168);
        r173.updateRememberedValue(r174);
    L404:
        ComposerKt.sourceInformationMarkerEnd(r49);
        Modifier r175 = SelectionGesturesKt.updateSelectionTouchMode(r171, (Function1) r174);
        ComposerKt.sourceInformationMarkerStart(r49, -1705164890, r138);
        boolean r176 = r49.changedInstance(r168);
        if ((57344 & r37) != 16384) goto L407;
        boolean r177 = true;
    L408:
        boolean r178 = r176 | r177;
        if ((r37 & 7168) != 2048) goto L411;
        boolean r179 = true;
    L412:
        boolean r180 = ((r178 | r179) | r49.changedInstance(r157)) | r49.changedInstance(r166);
        Composer r181 = r49;
        final LegacyTextFieldState r618 = r168;
        Object r182 = r181.rememberedValue();
        if (r180 == true) goto L418;
        TextFieldSelectionManager r718 = r166;
        if (r182 == Composer.Companion.getEmpty()) goto L419;
        final OffsetMapping r183 = r157;
        final LegacyTextFieldState r184 = r618;
        Object r185 = r182;
        boolean r186 = r320;
    L420:
        ComposerKt.sourceInformationMarkerEnd(r49);
        final boolean r619 = r186;
        Modifier r187 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(r175, r158, r186, (Function1) r185), r718.getMouseSelectionObserver$foundation_release(), r718.getTouchSelectionObserver$foundation_release()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        Modifier.Companion r188 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r49, -1705124313, r138);
        boolean r189 = r49.changedInstance(r184);
        if ((r211 & 14) != 4) goto L423;
        boolean r190 = true;
    L424:
        boolean r191 = (r189 | r190) | r49.changedInstance(r183);
        Composer r192 = r49;
        Object r193 = r192.rememberedValue();
        if (r191 == true) goto L431;
        if (r193 == Composer.Companion.getEmpty()) goto L431;
    L432:
        ComposerKt.sourceInformationMarkerEnd(r49);
        final Modifier r194 = DrawModifierKt.drawBehind(r188, (Function1) r193);
        Modifier.Companion r195 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r49, -1705102580, r138);
        boolean r196 = r49.changedInstance(r184);
        int r215 = r37;
        if ((r37 & 7168) != 2048) goto L435;
        boolean r197 = true;
    L436:
        boolean r198 = r197 | r196;
        final WindowInfo r199 = r411;
        final TextFieldSelectionManager r1100 = r718;
        boolean r200 = (r198 | r49.changed(r199)) | r49.changedInstance(r1100);
        final LegacyTextFieldState r620 = r184;
        if ((r211 & 14) != 4) goto L439;
        boolean r201 = true;
    L440:
        boolean r202 = (r200 | r201) | r49.changedInstance(r183);
        Composer r203 = r49;
        Object r204 = r203.rememberedValue();
        if (r202 == true) goto L446;
        final OffsetMapping r621 = r183;
        if (r204 == Composer.Companion.getEmpty()) goto L447;
        OffsetMapping r205 = r621;
        WindowInfo r417 = r199;
        final TextFieldSelectionManager r206 = r1100;
    L448:
        ComposerKt.sourceInformationMarkerEnd(r49);
        final Modifier r207 = OnGloballyPositionedModifierKt.onGloballyPositioned(r195, (Function1) r204);
        CoreTextFieldSemanticsModifier r208 = new CoreTextFieldSemanticsModifier(r57, r61, r620, r213, r619, r8 instanceof PasswordVisualTransformation, r205, r206, r717, r715);
        final ImeOptions r209 = r717;
        if (r619 == false) goto L456;
        if (r213 == true) goto L456;
        if (r417.isWindowFocused() == false) goto L456;
        if (r620.hasHighlight() == true) goto L456;
        boolean r216 = true;
    L457:
        Brush r622 = r28;
        OffsetMapping r623 = r205;
        final Modifier r217 = TextFieldCursorKt.cursor(Modifier.Companion, r620, r61, r623, r622, r216);
        ComposerKt.sourceInformationMarkerStart(r49, -1705033225, r138);
        boolean r218 = r49.changedInstance(r206);
        Composer r624 = r49;
        Object r219 = r624.rememberedValue();
        if (r218 == true) goto L463;
        VisualTransformation r511 = r8;
        if (r219 != Composer.Companion.getEmpty()) goto L465;
    L464:
        r219 = (Function1) new CoreTextFieldKt$CoreTextField$3$1(r206);
        r624.updateRememberedValue(r219);
    L465:
        ComposerKt.sourceInformationMarkerEnd(r49);
        EffectsKt.DisposableEffect(r206, (Function1) r219, r49, 0);
        ComposerKt.sourceInformationMarkerStart(r49, -1705030115, r138);
        boolean r220 = r49.changedInstance(r620) | r49.changedInstance(r170);
        if ((r211 & 14) != 4) goto L468;
        boolean r221 = true;
    L469:
        boolean r222 = r220 | r221;
        if (((r215 & 112) ^ 48) <= 32) goto L474;
        if (r49.changed(r209) == false) goto L474;
    L475:
        boolean r223 = true;
    L477:
        boolean r224 = r222 | r223;
        Composer r225 = r49;
        Object r226 = r225.rememberedValue();
        if (r224 == true) goto L483;
        TextFieldSelectionManager r719 = r206;
        if (r226 != Composer.Companion.getEmpty()) goto L485;
    L484:
        r226 = (Function1) new CoreTextFieldKt$CoreTextField$4$1(r620, r170, r61, r209);
        r225.updateRememberedValue(r226);
    L485:
        ComposerKt.sourceInformationMarkerEnd(r49);
        EffectsKt.DisposableEffect(r209, (Function1) r226, r49, (r215 >> 3) & 14);
        Modifier.Companion r227 = Modifier.Companion;
        Function1<TextFieldValue, Unit> r228 = r620.getOnValueChange();
        boolean r229 = !r213;
        final int r230 = r317;
        if (r230 != 1) goto L488;
        boolean r231 = true;
    L489:
        final TextFieldSelectionManager r625 = r719;
        Modifier r232 = TextFieldKeyInputKt.m1149textFieldKeyInput2WJ9YEU(r227, r620, r625, r61, r228, r229, r231, r623, r85, r209.m6612getImeActioneUduSuo());
        if (KeyboardType.m6636equalsimpl0(r209.m6613getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6655getPasswordPjHm6EE()) == false) goto L492;
    L494:
        final boolean r233 = false;
    L495:
        Modifier.Companion r234 = Modifier.Companion;
        boolean r235 = CoreTextField$lambda$11(r159);
        ComposerKt.sourceInformationMarkerStart(r49, -1704991998, r138);
        final LegacyPlatformTextInputServiceAdapter r1101 = r315;
        boolean r236 = r49.changed(r233) | r49.changedInstance(r1101);
        Composer r626 = r49;
        Object r1102 = r626.rememberedValue();
        if (r236 == true) goto L501;
        OffsetMapping r720 = r623;
        if (r1102 != Composer.Companion.getEmpty()) goto L503;
    L502:
        r1102 = (Function0) new CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1(r233, r1101);
        r626.updateRememberedValue(r1102);
    L503:
        ComposerKt.sourceInformationMarkerEnd(r49);
        Modifier r237 = StylusHandwritingKt.stylusHandwriting(r234, r235, r233, (Function0) r1102);
        ProvidableCompositionLocal<Color> r238 = AutofillHighlightKt.getLocalAutofillHighlightColor();
        ComposerKt.sourceInformationMarkerStart(r49, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r239 = r49.consume(r238);
        ComposerKt.sourceInformationMarkerEnd(r49);
        final long r1103 = ((Color) r239).m4376unboximpl();
        Modifier.Companion r240 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart(r49, -1704957026, r138);
        boolean r241 = r49.changedInstance(r620) | r49.changed(r1103);
        Composer r1104 = r49;
        Composer r627 = r49;
        Object r242 = r1104.rememberedValue();
        if (r241 == true) goto L510;
        if (r242 == Composer.Companion.getEmpty()) goto L510;
    L511:
        ComposerKt.sourceInformationMarkerEnd(r627);
        Modifier r1105 = r35;
        Modifier r243 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(r1105.then(DrawModifierKt.drawBehind(r240, (Function1) r242)), r1101, r620, r625).then(r237).then(r108), r620, r131), r620, r625).then(r232), r316, r158, r619).then(r187).then(r208), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(r620));
        if (r619 == true) goto L514;
    L520:
        boolean r244 = false;
    L522:
        if (r244 == false) goto L524;
        Modifier.Companion r245 = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.Companion, r625);
    L525:
        final Modifier r1106 = r245;
        final OffsetMapping r1107 = r720;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r246 = r116;
        final Density r1108 = r415;
        final VisualTransformation r247 = r511;
        final TextStyle r248 = r414;
        final boolean r1109 = r244;
        final BringIntoViewRequester r1110 = r510;
        Function2<Composer, Integer, Unit> r249 = new AnonymousClass5(r246, r620, r248, r712, r230, r316, r61, r247, r217, r194, r207, r1106, r1110, r625, r1109, r213, r118, r1107, r1108);
        Composer r250 = r627;
        CoreTextFieldRootBox(r243, r625, ComposableLambdaKt.rememberComposableLambda(-492537660, true, r249, r250, 54), r250, 384);
        if (ComposerKt.isTraceInProgress() == false) goto L528;
        ComposerKt.traceEventEnd();
    L528:
        final int r1111 = r712;
        final int r1112 = r230;
        final VisualTransformation r251 = r247;
        final boolean r1113 = r213;
        final Function1<? super TextLayoutResult, Unit> r252 = r118;
        final TextFieldScrollerPosition r1114 = r210;
        final ImeOptions r1115 = r209;
        final boolean r1116 = r619;
        final Modifier r253 = r1105;
        final KeyboardActions r1117 = r714;
        final MutableInteractionSource r254 = r158;
        final Brush r255 = r622;
        final boolean r256 = r413;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r1118 = r246;
        final TextStyle r257 = r248;
    L530:
        ScopeUpdateScope r258 = r250.endRestartGroup();
        if (r258 == null) goto L534;
        r258.updateScope(new AnonymousClass6(r61, r62, r253, r257, r251, r252, r254, r255, r256, r1112, r1111, r1115, r1117, r1116, r1113, r1118, r1114, r79, r80, r81));
        return;
    L534:
        return;
    L524:
        r245 = Modifier.Companion;
        goto L525
    L514:
        if (r620.getHasFocus() == false) goto L520;
        if (r620.isInTouchMode() == false) goto L520;
        if (r417.isWindowFocused() == false) goto L520;
        r244 = true;
    L510:
        r242 = (Function1) new CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1(r620, r1103);
        r1104.updateRememberedValue(r242);
        goto L511
    L501:
        r720 = r623;
        goto L502
    L492:
        if (KeyboardType.m6636equalsimpl0(r209.m6613getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6654getNumberPasswordPjHm6EE()) == true) goto L494;
        r233 = true;
        goto L495
    L488:
        r231 = false;
        goto L489
    L483:
        r719 = r206;
    L474:
        if ((r215 & 48) == 32) goto L475;
        r223 = false;
        goto L477
    L468:
        r221 = false;
        goto L469
    L463:
        r511 = r8;
    L456:
        r216 = false;
    L447:
        final TextFieldValue r628 = r107;
        Function1<LayoutCoordinates, Unit> r321 = new CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1(r620, r619, r199, r1100, r628, r621);
        r417 = r199;
        r206 = r1100;
        r205 = r621;
        Function1<LayoutCoordinates, Unit> r259 = r321;
        r203.updateRememberedValue(r259);
        r204 = r259;
        goto L448
    L446:
        r621 = r183;
        goto L447
    L439:
        r201 = false;
        goto L440
    L435:
        r197 = false;
    L431:
        r193 = (Function1) new CoreTextFieldKt$CoreTextField$drawModifier$1$1(r184, r107, r183);
        r192.updateRememberedValue(r193);
        goto L432
    L423:
        r190 = false;
    L419:
        final TextFieldSelectionManager r629 = r718;
        final OffsetMapping r630 = r157;
        r184 = r618;
        r186 = r320;
        r183 = r630;
        Function1<Offset, Unit> r418 = new CoreTextFieldKt$CoreTextField$pointerModifier$2$1(r618, r715, r213, r320, r629, r630);
        r715 = r715;
        r185 = r418;
        r181.updateRememberedValue(r185);
        goto L420
    L418:
        r718 = r166;
        goto L419
    L411:
        r179 = false;
        goto L412
    L407:
        r177 = false;
        goto L408
    L402:
        r717 = r169;
    L395:
        TextInputService r631 = r617;
        ImeOptions r632 = r155;
        LegacyTextFieldState r633 = r156;
        r170 = r631;
        r169 = r632;
        r168 = r633;
        r166 = r716;
        r167 = new CoreTextFieldKt$CoreTextField$2$1(r633, r159, r631, r716, r632, null);
        r164.updateRememberedValue(r167);
        goto L396
    L394:
        r617 = r106;
    L385:
        if ((r37 & 48) == 32) goto L386;
        r162 = false;
    L379:
        r109 = false;
    L374:
        final LegacyTextFieldState r634 = r616;
        final ImeOptions r635 = r155;
        final boolean r636 = r121;
        Object r512 = new CoreTextFieldKt$CoreTextField$focusModifier$1$1(r634, r636, r213, r45, r61, r635, r59, r90, r145, r88);
        r156 = r634;
        r105 = r636;
        r106 = r45;
        r107 = r61;
        r157 = r59;
        r104 = r90;
        r103 = (Function1) r512;
        r510 = r88;
        r319.updateRememberedValue(r103);
        goto L375
    L373:
        r616 = r83;
    L363:
        r615 = r99;
        if ((r37 & 48) == 32) goto L365;
        r100 = false;
        goto L367
    L362:
        r155 = r614;
        goto L363
    L355:
        r154 = false;
        goto L356
    L351:
        r153 = false;
        goto L352
    L347:
        r152 = false;
    L327:
        TextDelegate r419 = new TextDelegate(r611, r713, 0, 0, r711, 0, r123, r126, null, AnimationConstants.DefaultDurationMillis, null);
        r412 = r611;
        r414 = r713;
        r413 = r711;
        r415 = r123;
        r416 = r126;
        r82 = new LegacyTextFieldState(r419, r141, r137);
        r318.updateRememberedValue(r82);
        goto L328
    L326:
        r611 = r58;
    L311:
        TransformedText r260 = ValidatingOffsetMappingKt.filterWithValidation(r8, r61.getAnnotatedString());
        TextRange r322 = r61.m6664getCompositionMzsxiRA();
        if (r322 == null) goto L317;
        r411 = r134;
        r410 = r27;
        TransformedText r261 = TextFieldDelegate.Companion.m1139applyCompositionDecoration72CqOWE(r322.m6421unboximpl(), r260);
        TransformedText r262 = r260;
        if (r261 == null) goto L319;
        r262 = r261;
    L319:
        r54.updateRememberedValue(r262);
        r56 = r262;
        goto L320
    L317:
        r410 = r27;
        r411 = r134;
        r262 = r260;
        goto L319
    L310:
        r317 = r36;
        goto L311
    L303:
        r52 = false;
        goto L304
    L299:
        r51 = false;
        goto L300
    L284:
        r315 = r43;
        goto L285
    L287:
        r315 = r43;
        r47 = r312;
        r49 = r4;
        r49.startReplaceGroup(-1705354472);
        r49.endReplaceGroup();
        r50 = r210;
        goto L288
    L275:
        r311 = Orientation.Vertical;
        goto L276
    L269:
        if (r119.getSingleLine() == false) goto L272;
        r214 = true;
        goto L273
    L271:
        r138 = "CC(remember):CoreTextField.kt#9igjgp";
        goto L272
    L259:
        r42 = r41;
        goto L260
    L255:
        r39 = r38;
        goto L256
    L247:
        int r263 = r30;
        r8 = r26;
        r35 = r15;
        r117 = r115;
        r118 = r11;
        r119 = r111;
        r120 = r31;
        r36 = r263;
        r210 = r77;
        r37 = r112;
        r121 = r114;
        goto L248
    L244:
        r116 = r76;
        goto L245
    L241:
        r115 = r75;
        goto L242
    L238:
        r114 = r74;
        goto L239
    L235:
        r113 = r73;
        goto L236
    L232:
        r111 = r72;
        r112 = r710;
        goto L233
    L228:
        r31 = r71;
        goto L230
    L225:
        r30 = r70;
        goto L226
    L222:
        r29 = r69;
        goto L223
    L219:
        r28 = r9;
        goto L220
    L216:
        r27 = r10;
        goto L217
    L211:
        r26 = r8;
        goto L212
    L199:
        if (r4.getDefaultsInvalid() == true) goto L205;
        r4.skipToGroupEnd();
        if ((r81 & 2048) == 0) goto L204;
        r29 = r69;
        r113 = r73;
        r121 = r74;
        r116 = r76;
        r210 = r77;
        r37 = r710 & (-113);
        r28 = r9;
        r27 = r10;
        r118 = r11;
        r35 = r15;
        r36 = r70;
        r120 = r71;
        r119 = r72;
        r117 = r75;
        goto L248
    L204:
        r29 = r69;
        r113 = r73;
        r121 = r74;
        r116 = r76;
        r210 = r77;
        r37 = r710;
        r28 = r9;
        r27 = r10;
        r118 = r11;
        r35 = r15;
        r36 = r70;
        r120 = r71;
        r119 = r72;
        r117 = r75;
        goto L248
    L529:
        r250 = r4;
        r250.skipToGroupEnd();
        r1115 = r72;
        r1116 = r74;
        r1118 = r76;
        r1114 = r77;
        r251 = r8;
        r255 = r9;
        r254 = r10;
        r252 = r11;
        r257 = r13;
        r253 = r15;
        r256 = r69;
        r1112 = r70;
        r1111 = r71;
        r1117 = r73;
        r1113 = r75;
        goto L530
    L190:
        if ((r710 & 599187) != 599186) goto L193;
        r24 = false;
        goto L195
    L180:
        if ((r80 & 1572864) != 0) goto L187;
        if (r4.changed(r77) == false) goto L184;
        int r264 = 1048576;
    L185:
        r6 = r6 | r264;
        goto L187
    L184:
        r264 = 524288;
        goto L185
    L169:
        if ((r80 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L176;
        if (r4.changedInstance(r76) == false) goto L173;
        int r265 = 131072;
    L174:
        r6 = r6 | r265;
        goto L176
    L173:
        r265 = 65536;
        goto L174
    L157:
        r110 = r20;
        if ((r80 & 24576) != 0) goto L165;
        if (r4.changed(r75) == false) goto L162;
        int r266 = 16384;
    L163:
        r6 = r6 | r266;
        goto L165
    L162:
        r266 = 8192;
        goto L163
    L147:
        r18 = r7;
        if ((r80 & 3072) != 0) goto L154;
        if (r4.changed(r74) == false) goto L152;
        r17 = 2048;
    L152:
        r6 = r6 | r17;
        goto L154
    L136:
        r34 = r3;
        if ((r80 & 384) != 0) goto L144;
        if (r4.changed(r73) == false) goto L141;
        int r1119 = 256;
    L142:
        r6 = r6 | r1119;
        goto L144
    L141:
        r1119 = 128;
        goto L142
    L115:
        if ((r80 & 6) != 0) goto L123;
        if (r4.changed(r71) == false) goto L119;
        int r323 = 4;
    L120:
        r6 = r6 | r323;
        goto L123
    L119:
        r323 = 2;
        goto L120
    L104:
        if ((r79 & 805306368) != 0) goto L111;
        if (r4.changed(r70) == false) goto L108;
        int r324 = 536870912;
    L109:
        r5 = r5 | r324;
        goto L111
    L108:
        r324 = 268435456;
        goto L109
    L93:
        if ((r79 & 100663296) != 0) goto L100;
        if (r4.changed(r69) == false) goto L97;
        int r325 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        r5 = r5 | r325;
        goto L100
    L97:
        r325 = 33554432;
        goto L98
    L82:
        if ((r79 & 12582912) != 0) goto L88;
        r9 = r68;
        if (r4.changed(r9) == false) goto L86;
        int r326 = 8388608;
    L87:
        r5 = r5 | r326;
        goto L89
    L86:
        r326 = 4194304;
        goto L87
    L88:
        r9 = r68;
        goto L89
    L71:
        if ((r79 & 1572864) != 0) goto L77;
        r10 = r67;
        if (r4.changed(r10) == false) goto L75;
        int r267 = 1048576;
    L76:
        r5 = r5 | r267;
        goto L78
    L75:
        r267 = 524288;
        goto L76
    L77:
        r10 = r67;
        goto L78
    L60:
        if ((r79 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r11 = r66;
        if (r4.changedInstance(r11) == false) goto L64;
        int r268 = 131072;
    L65:
        r5 = r5 | r268;
        goto L67
    L64:
        r268 = 65536;
        goto L65
    L66:
        r11 = r66;
        goto L67
    L49:
        if ((r79 & 24576) != 0) goto L55;
        r8 = r65;
        if (r4.changed(r8) == false) goto L53;
        int r269 = 16384;
    L54:
        r5 = r5 | r269;
        goto L56
    L53:
        r269 = 8192;
        goto L54
    L55:
        r8 = r65;
        goto L56
    L38:
        if ((r79 & 3072) != 0) goto L44;
        r13 = r64;
        if (r4.changed(r13) == false) goto L42;
        int r1120 = 2048;
    L43:
        r5 = r5 | r1120;
        goto L45
    L42:
        r1120 = 1024;
        goto L43
    L44:
        r13 = r64;
        goto L45
    L27:
        if ((r79 & 384) != 0) goto L33;
        r15 = r63;
        if (r4.changed(r15) == false) goto L31;
        int r1121 = 256;
    L32:
        r5 = r5 | r1121;
        goto L34
    L31:
        r1121 = 128;
        goto L32
    L33:
        r15 = r63;
        goto L34
    L16:
        if ((r79 & 48) != 0) goto L23;
        if (r4.changedInstance(r62) == false) goto L20;
        int r1122 = 32;
    L21:
        r5 = r5 | r1122;
        goto L23
    L20:
        r1122 = 16;
        goto L21
    L6:
        if ((r79 & 6) != 0) goto L13;
        if (r4.changed(r61) == false) goto L10;
        int r270 = 4;
    L11:
        r5 = r5 | r270;
        goto L13
    L10:
        r270 = 2;
        goto L11
    }

    private static final boolean CoreTextField$lambda$11(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    private static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager manager, final Function2<? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation($composer2, "C(CoreTextFieldRootBox)P(2,1)669@31669L83:CoreTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(manager) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r31) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($dirty & 147) == 146) goto L26;
        boolean r10 = true;
    L28:
        if ($composer2.shouldExecute(r10, $dirty & 1) == true) goto L30;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L51:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L55;
        r4.updateScope(new AnonymousClass2(modifier, manager, r31, $changed));
        return;
    L55:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-20551815, $dirty, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
    L32:
        int $changed$iv = ($dirty & 14) | 384;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $dirty2 = $dirty;
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L35;
        ComposablesKt.invalidApplier();
    L35:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L38;
        Function0<ComposeUiNode> r6 = r16;
        $composer2.createNode(r6);
    L39:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L46;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L46;
    L47:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r11 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r12 = BoxScopeInstance.INSTANCE;
        int r13 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1189059391, "C669@31717L33:CoreTextField.kt#423gt5");
        ContextMenu_androidKt.ContextMenuArea(manager, r31, $composer3, (($dirty2 >> 3) & 14) | (($dirty2 >> 3) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventEnd();
    L46:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r5);
        goto L47
    L38:
        r6 = r16;
        $composer2.useNode();
        goto L39
    L26:
        r10 = false;
        goto L28
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier $this$previewKeyEventToDeselectOnBack, final LegacyTextFieldState state, final TextFieldSelectionManager manager) {
        return KeyInputModifierKt.onPreviewKeyEvent($this$previewKeyEventToDeselectOnBack, new C03501(state, manager));
    }

    public static final void tapToFocus(LegacyTextFieldState state, FocusRequester focusRequester, boolean allowKeyboard) {
        if (state.getHasFocus() == true) goto L5;
        FocusRequester.m4036requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return;
    L5:
        if (allowKeyboard == false) goto L11;
        SoftwareKeyboardController r0 = state.getKeyboardController();
        if (r0 == null) goto L12;
        r0.show();
        return;
    L12:
        return;
    }

    private static final void startInputSession(TextInputService textInputService, LegacyTextFieldState state, TextFieldValue value, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        state.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, value, state.getProcessor(), imeOptions, state.getOnValueChange(), state.getOnImeActionPerformed()));
        notifyFocusedRect(state, value, offsetMapping);
    }

    private static final void endInputSession(LegacyTextFieldState state) {
        TextInputSession session = state.getInputSession();
        if (session == null) goto L5;
        TextFieldDelegate.Companion.onBlur$foundation_release(session, state.getProcessor(), state.getOnValueChange());
    L5:
        state.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester $this$bringSelectionEndIntoView, TextFieldValue value, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> r15) {
        int selectionEndInTransformed = offsetMapping.originalToTransformed(TextRange.m6414getMaximpl(value.m6665getSelectiond9O1mEE()));
        if (selectionEndInTransformed >= textLayoutResult.getLayoutInput().getText().length()) goto L5;
        Rect selectionEndBounds = textLayoutResult.getBoundingBox(selectionEndInTransformed);
    L8:
        Object r2 = $this$bringSelectionEndIntoView.bringIntoView(selectionEndBounds, r15);
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L12;
        return r2;
    L12:
        return Unit.INSTANCE;
    L5:
        if (selectionEndInTransformed == 0) goto L7;
        selectionEndBounds = textLayoutResult.getBoundingBox(selectionEndInTransformed - 1);
        goto L8
    L7:
        long defaultSize = TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null);
        selectionEndBounds = new Rect(0.0f, 0.0f, 1.0f, (int) (4294967295L & defaultSize));
        goto L8
    }

    private static final void SelectionToolbarAndHandles(final TextFieldSelectionManager manager, final boolean show, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation($composer2, "C(SelectionToolbarAndHandles):CoreTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(manager) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        boolean r5 = true;
        if (($dirty & 19) == 18) goto L19;
        boolean r3 = true;
    L21:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L85:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L89;
        r0.updateScope(new C03492(manager, show, $changed));
        return;
    L89:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(626339208, $dirty, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
    L26:
        if (show == false) goto L80;
        $composer2.startReplaceGroup(-1290924834);
        ComposerKt.sourceInformation($composer2, "");
        LegacyTextFieldState r6 = manager.getState$foundation_release();
        TextLayoutResult it = null;
        if (r6 == null) goto L41;
        TextLayoutResultProxy r7 = r6.getLayoutResult();
        if (r7 == null) goto L41;
        TextLayoutResult r8 = r7.getValue();
        if (r8 == null) goto L41;
        LegacyTextFieldState r10 = manager.getState$foundation_release();
        if (r10 == null) goto L36;
        boolean r11 = r10.isLayoutResultStale();
    L37:
        if (r11 == true) goto L41;
        it = r8;
        goto L41
    L36:
        r11 = true;
    L41:
        if (it != null) goto L44;
        $composer2.startReplaceGroup(-1290601288);
    L43:
        $composer2.endReplaceGroup();
        $composer2.endReplaceGroup();
    L82:
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventEnd();
        goto L85
    L44:
        $composer2.startReplaceGroup(-1290601287);
        ComposerKt.sourceInformation($composer2, "");
        if (TextRange.m6411getCollapsedimpl(manager.getValue$foundation_release().m6665getSelectiond9O1mEE()) == true) goto L65;
        $composer2.startReplaceGroup(-1685230508);
        ComposerKt.sourceInformation($composer2, "");
        int startOffset = manager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m6417getStartimpl(manager.getValue$foundation_release().m6665getSelectiond9O1mEE()));
        int endOffset = manager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m6412getEndimpl(manager.getValue$foundation_release().m6665getSelectiond9O1mEE()));
        ResolvedTextDirection startDirection = it.getBidiRunDirection(startOffset);
        ResolvedTextDirection endDirection = it.getBidiRunDirection(Math.max(endOffset - 1, 0));
        LegacyTextFieldState r12 = manager.getState$foundation_release();
        if (r12 != null) goto L49;
    L51:
        boolean r13 = false;
    L52:
        if (r13 == false) goto L54;
        $composer2.startReplaceGroup(-1684812473);
        ComposerKt.sourceInformation($composer2, "1034@46819L219");
        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, startDirection, manager, $composer2, (($dirty << 6) & 896) | 6);
        $composer2.endReplaceGroup();
    L55:
        LegacyTextFieldState r14 = manager.getState$foundation_release();
        if (r14 != null) goto L58;
    L60:
        r5 = false;
    L61:
        if (r5 == false) goto L63;
        $composer2.startReplaceGroup(-1684464312);
        ComposerKt.sourceInformation($composer2, "1041@47170L218");
        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, endDirection, manager, $composer2, (($dirty << 6) & 896) | 6);
        $composer2.endReplaceGroup();
    L64:
        $composer2.endReplaceGroup();
    L66:
        LegacyTextFieldState textFieldState = manager.getState$foundation_release();
        if (textFieldState == null) goto L43;
        if (manager.isTextChanged$foundation_release() == false) goto L72;
        textFieldState.setShowFloatingToolbar(false);
    L72:
        if (textFieldState.getHasFocus() == true) goto L74;
    L77:
        Unit r4 = Unit.INSTANCE;
        goto L43
    L74:
        if (textFieldState.getShowFloatingToolbar() == false) goto L76;
        manager.showSelectionToolbar$foundation_release();
        goto L77
    L76:
        manager.hideSelectionToolbar$foundation_release();
        goto L77
    L63:
        $composer2.startReplaceGroup(-1684200998);
        $composer2.endReplaceGroup();
        goto L64
    L58:
        if (r14.getShowSelectionHandleEnd() != true) goto L60;
    L54:
        $composer2.startReplaceGroup(-1684548198);
        $composer2.endReplaceGroup();
        goto L55
    L49:
        if (r12.getShowSelectionHandleStart() != true) goto L51;
        r13 = true;
        goto L52
    L65:
        $composer2.startReplaceGroup(-1684179174);
        $composer2.endReplaceGroup();
        goto L66
    L80:
        $composer2.startReplaceGroup(651160447);
        $composer2.endReplaceGroup();
        manager.hideSelectionToolbar$foundation_release();
        goto L82
    L19:
        r3 = false;
        goto L21
    L12:
        if ($composer2.changed(show) == false) goto L14;
        int r9 = 32;
    L15:
        $dirty = $dirty | r9;
        goto L16
    L14:
        r9 = 16;
        goto L15
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager manager, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation($composer2, "C(TextFieldCursorHandle):CoreTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
    L9:
        int $dirty2 = $dirty;
        if (($dirty2 & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L69:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L73;
        r2.updateScope(new AnonymousClass4(manager, $changed));
        return;
    L73:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1436003720, $dirty2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)");
    L18:
        LegacyTextFieldState r4 = manager.getState$foundation_release();
        if (r4 != null) goto L21;
    L23:
        boolean r5 = false;
    L24:
        if (r5 == false) goto L64;
        AnnotatedString r6 = manager.getTransformedText$foundation_release();
        if (r6 != null) goto L28;
    L33:
        boolean r7 = false;
    L34:
        if (r7 == false) goto L64;
        $composer2.startReplaceGroup(-289940723);
        ComposerKt.sourceInformation($composer2, "1067@48332L50,1068@48445L7,1070@48505L12,1072@48590L645,1084@49267L385,1069@48462L1200");
        ComposerKt.sourceInformationMarkerStart($composer2, -424995434, "CC(remember):CoreTextField.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(manager);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L38;
    L41:
        Object value$iv = manager.cursorDragObserver$foundation_release();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L42:
        final TextDragObserver observer = (TextDragObserver) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Density> r8 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final long position = manager.m1503getCursorPositiontuRUvjQ$foundation_release((Density) r11);
        ComposerKt.sourceInformationMarkerStart($composer2, -424989936, "CC(remember):CoreTextField.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(position);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L45;
    L48:
        Object value$iv2 = (OffsetProvider) new CoreTextFieldKt$TextFieldCursorHandle$1$1(position);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L49:
        OffsetProvider r13 = (OffsetProvider) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r9 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -424986583, "CC(remember):CoreTextField.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(observer) | $composer2.changedInstance(manager);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L52;
    L55:
        Object value$iv3 = (PointerInputEventHandler) new CoreTextFieldKt$TextFieldCursorHandle$2$1(observer, manager);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r10 = SuspendingPointerInputFilterKt.pointerInput(r9, observer, (PointerInputEventHandler) it$iv3);
        ComposerKt.sourceInformationMarkerStart($composer2, -424965179, "CC(remember):CoreTextField.kt#9igjgp");
        boolean invalid$iv4 = $composer2.changed(position);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L59;
    L62:
        Object value$iv4 = (Function1) new CoreTextFieldKt$TextFieldCursorHandle$3$1(position);
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L63:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidCursorHandle_androidKt.m1021CursorHandleUSBMPiE(r13, SemanticsModifierKt.semantics$default(r10, false, (Function1) it$iv4, 1, null), 0, $composer2, 0, 4);
        $composer2.endReplaceGroup();
    L66:
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventEnd();
        goto L69
    L59:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L63;
    L52:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L56;
    L45:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L49;
    L38:
        if (it$iv != Composer.Companion.getEmpty()) goto L42;
    L28:
        if (r6.length() <= 0) goto L30;
        boolean r12 = true;
    L31:
        if (r12 != true) goto L33;
        r7 = true;
        goto L34
    L30:
        r12 = false;
    L64:
        $composer2.startReplaceGroup(-288632802);
        $composer2.endReplaceGroup();
        goto L66
    L21:
        if (r4.getShowCursorHandle() != true) goto L23;
        r5 = true;
        goto L24
    L12:
        r3 = false;
        goto L14
    L5:
        if ($composer2.changedInstance(manager) == false) goto L7;
        int r14 = 4;
    L8:
        $dirty = $dirty | r14;
        goto L9
    L7:
        r14 = 2;
        goto L8
    }

    private static final void notifyFocusedRect(LegacyTextFieldState state, TextFieldValue value, OffsetMapping offsetMapping) {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r0 = previousSnapshot$iv.getReadObserver();
    L6:
        Function1<Object, Unit> r4 = r0;
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        TextLayoutResultProxy layoutResult = state.getLayoutResult();     // Catch: Throwable -> L21
        if (layoutResult != null) goto L12;
    L9:
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        return;
    L12:
        TextInputSession inputSession = state.getInputSession();     // Catch: Throwable -> L21
        if (inputSession == null) goto L9;
        LayoutCoordinates layoutCoordinates = state.getLayoutCoordinates();     // Catch: Throwable -> L21
        if (layoutCoordinates == null) goto L9;
        TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(value, state.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, state.getHasFocus(), offsetMapping);     // Catch: Throwable -> L21
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L21
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        return;
    L21:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        throw th;
    L5:
        r0 = null;
        goto L6
    }
}
