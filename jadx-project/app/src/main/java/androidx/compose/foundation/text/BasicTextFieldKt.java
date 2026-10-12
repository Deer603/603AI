package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÛ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001añ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\fH\u0001¢\u0006\u0002\u0010.\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010=\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010?\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010A\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010B\u001a\u0015\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u000200X\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020@X\u008a\u008e\u0002"}, d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "MinTouchTargetSizeForHandles", "Landroidx/compose/ui/unit/DpSize;", "J", "BasicTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "isPassword", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "decorationBox", "Landroidx/compose/runtime/Composable;", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "cursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = null;
    private static final long MinTouchTargetSizeForHandles = 0;

    public static final /* synthetic */ TextFieldValue access$BasicTextField$lambda$24(MutableState $textFieldValueState$delegate) {
        return BasicTextField$lambda$24($textFieldValueState$delegate);
    }

    public static final /* synthetic */ void access$BasicTextField$lambda$25(MutableState $textFieldValueState$delegate, TextFieldValue value) {
        BasicTextField$lambda$25($textFieldValueState$delegate, value);
    }

    public static final /* synthetic */ String access$BasicTextField$lambda$28(MutableState $lastTextValue$delegate) {
        return BasicTextField$lambda$28($lastTextValue$delegate);
    }

    public static final /* synthetic */ void access$BasicTextField$lambda$29(MutableState $lastTextValue$delegate, String value) {
        BasicTextField$lambda$29($lastTextValue$delegate, value);
    }

    public static final /* synthetic */ TextFieldDecorator access$getDefaultTextFieldDecorator$p() {
        return DefaultTextFieldDecorator;
    }

    public static final void BasicTextField(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, TextFieldLineLimits lineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r45, MutableInteractionSource interactionSource, Brush cursorBrush, OutputTransformation outputTransformation, TextFieldDecorator decorator, ScrollState scrollState, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(469439921);
        ComposerKt.sourceInformation($composer2, "C(BasicTextField)P(13,7,2,11,3,14,5,8,6,9,4!1,10)195@11756L610:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r11 = r54 & 2;
        if (r11 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r15 = r54 & 4;
        int r16 = 256;
        if (r15 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r9 = enabled;
    L35:
        int r18 = r54 & 8;
        int r19 = 2048;
        if (r18 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r10 = readOnly;
    L46:
        int r22 = r54 & 16;
        int r23 = 8192;
        if (r22 == 0) goto L50;
        $dirty = $dirty | 24576;
        InputTransformation r12 = inputTransformation;
    L57:
        int r26 = r54 & 32;
        if (r26 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle textStyle2 = textStyle;
    L68:
        int r28 = r54 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
    L79:
        int r1 = r54 & 128;
        if (r1 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r2 = r54 & 256;
        if (r2 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r3 = r54 & 512;
        if (r3 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r4 = r54 & 1024;
        if (r4 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r5 = r54 & 2048;
        if (r5 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r6 = r54 & 4096;
        if (r6 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r25 = r6;
    L145:
        int r7 = r54 & 8192;
        if (r7 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r17 = r7;
    L159:
        if (($changed1 & 24576) != 0) goto L169;
        if ((r54 & 16384) != 0) goto L166;
        if ($composer2.changed(scrollState) == false) goto L166;
        r23 = 16384;
    L166:
        $dirty1 = $dirty1 | r23;
    L169:
        if (($dirty & 306783379) == 306783378) goto L171;
    L174:
        boolean r0 = true;
    L176:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L233;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "191@11610L21");
        if (($changed & 1) != 0) goto L180;
    L186:
        if (r11 == 0) goto L188;
        modifier2 = Modifier.Companion;
    L188:
        if (r15 == 0) goto L190;
        boolean enabled2 = true;
    L191:
        if (r18 == 0) goto L193;
        boolean readOnly2 = false;
    L194:
        if (r22 == 0) goto L196;
        InputTransformation inputTransformation2 = null;
    L197:
        if (r26 == 0) goto L199;
        textStyle2 = TextStyle.Companion.getDefault();
    L199:
        if (r28 == 0) goto L201;
        keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L201:
        if (r1 == 0) goto L203;
        KeyboardActionHandler onKeyboardAction2 = null;
    L204:
        if (r2 == 0) goto L206;
        TextFieldLineLimits lineLimits2 = TextFieldLineLimits.Companion.getDefault();
    L207:
        if (r3 == 0) goto L209;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r13 = null;
    L210:
        if (r4 == 0) goto L212;
        MutableInteractionSource interactionSource2 = null;
    L213:
        if (r5 == 0) goto L215;
        SolidColor cursorBrush2 = BasicTextFieldDefaults.INSTANCE.getCursorBrush();
    L216:
        if (r25 == 0) goto L218;
        OutputTransformation outputTransformation2 = null;
    L219:
        if (r17 == 0) goto L221;
        TextFieldDecorator decorator2 = null;
    L223:
        if ((r54 & 16384) == 0) goto L225;
        int $dirty2 = (-57345) & $dirty1;
        boolean enabled3 = enabled2;
        ScrollState scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
        boolean readOnly3 = readOnly2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r8 = r13;
        TextFieldDecorator decorator3 = decorator2;
        Brush cursorBrush3 = cursorBrush2;
        KeyboardActionHandler onKeyboardAction3 = onKeyboardAction2;
        TextStyle textStyle3 = textStyle2;
        TextFieldLineLimits lineLimits3 = lineLimits2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
    L226:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L229;
        ComposerKt.traceEventStart(469439921, $dirty, $dirty2, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:194)");
    L229:
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r14 = r8;
        BasicTextField(state, modifier3, enabled3, readOnly3, inputTransformation2, textStyle3, keyboardOptions3, onKeyboardAction3, lineLimits3, r14, interactionSource2, cursorBrush3, null, outputTransformation2, decorator3, scrollState2, false, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), ((((($dirty2 & 14) | 384) | ($dirty2 & 112)) | (($dirty2 << 3) & 7168)) | (($dirty2 << 3) & 57344)) | (($dirty2 << 3) & 458752), 65536);
        if (ComposerKt.isTraceInProgress() == false) goto L232;
        ComposerKt.traceEventEnd();
    L232:
        final Modifier modifier4 = modifier3;
        final TextStyle textStyle4 = textStyle3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> r110 = r14;
        final TextFieldDecorator decorator4 = decorator3;
        final boolean enabled4 = enabled3;
        final boolean readOnly4 = readOnly3;
        final InputTransformation inputTransformation3 = inputTransformation2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActionHandler onKeyboardAction4 = onKeyboardAction3;
        final TextFieldLineLimits lineLimits4 = lineLimits3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Brush cursorBrush4 = cursorBrush3;
        final OutputTransformation outputTransformation3 = outputTransformation2;
        final ScrollState scrollState3 = scrollState2;
    L234:
        ScopeUpdateScope r20 = $composer3.endRestartGroup();
        if (r20 == null) goto L238;
        r20.updateScope(new AnonymousClass1(state, modifier4, enabled4, readOnly4, inputTransformation3, textStyle4, keyboardOptions4, onKeyboardAction4, lineLimits4, r110, interactionSource3, cursorBrush4, outputTransformation3, decorator4, scrollState3, $changed, $changed1, r54));
        return;
    L238:
        return;
    L225:
        boolean enabled5 = enabled2;
        scrollState2 = scrollState;
        readOnly3 = readOnly2;
        $dirty2 = $dirty1;
        r8 = r13;
        decorator3 = decorator2;
        cursorBrush3 = cursorBrush2;
        enabled3 = enabled5;
        onKeyboardAction3 = onKeyboardAction2;
        textStyle3 = textStyle2;
        lineLimits3 = lineLimits2;
        keyboardOptions3 = keyboardOptions2;
        goto L226
    L221:
        decorator2 = decorator;
        goto L223
    L218:
        outputTransformation2 = outputTransformation;
        goto L219
    L215:
        cursorBrush2 = cursorBrush;
        goto L216
    L212:
        interactionSource2 = interactionSource;
        goto L213
    L209:
        r13 = r45;
        goto L210
    L206:
        lineLimits2 = lineLimits;
        goto L207
    L203:
        onKeyboardAction2 = onKeyboardAction;
        goto L204
    L196:
        inputTransformation2 = r12;
        goto L197
    L193:
        readOnly2 = r10;
        goto L194
    L190:
        enabled2 = r9;
        goto L191
    L180:
        if ($composer2.getDefaultsInvalid() == true) goto L186;
        $composer2.skipToGroupEnd();
        if ((r54 & 16384) == 0) goto L185;
        interactionSource2 = interactionSource;
        cursorBrush3 = cursorBrush;
        outputTransformation2 = outputTransformation;
        decorator3 = decorator;
        scrollState2 = scrollState;
        $dirty2 = (-57345) & $dirty1;
        keyboardOptions3 = keyboardOptions2;
        enabled3 = r9;
        readOnly3 = r10;
        inputTransformation2 = r12;
        textStyle3 = textStyle2;
        onKeyboardAction3 = onKeyboardAction;
        lineLimits3 = lineLimits;
        r8 = r45;
        goto L226
    L185:
        r8 = r45;
        interactionSource2 = interactionSource;
        cursorBrush3 = cursorBrush;
        outputTransformation2 = outputTransformation;
        decorator3 = decorator;
        scrollState2 = scrollState;
        keyboardOptions3 = keyboardOptions2;
        $dirty2 = $dirty1;
        enabled3 = r9;
        readOnly3 = r10;
        inputTransformation2 = r12;
        textStyle3 = textStyle2;
        onKeyboardAction3 = onKeyboardAction;
        lineLimits3 = lineLimits;
        goto L226
    L233:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        onKeyboardAction4 = onKeyboardAction;
        interactionSource3 = interactionSource;
        scrollState3 = scrollState;
        enabled4 = r9;
        inputTransformation3 = r12;
        textStyle4 = textStyle2;
        modifier4 = modifier2;
        lineLimits4 = lineLimits;
        cursorBrush4 = cursorBrush;
        outputTransformation3 = outputTransformation;
        decorator4 = decorator;
        keyboardOptions4 = keyboardOptions2;
        readOnly4 = r10;
        r110 = r45;
        goto L234
    L171:
        if (($dirty1 & 9363) != 9362) goto L174;
        r0 = false;
        goto L176
    L148:
        r17 = r7;
        if (($changed1 & 3072) != 0) goto L159;
        if (($changed1 & 4096) != 0) goto L153;
        boolean r21 = $composer2.changed(decorator);
    L154:
        if (r21 == true) goto L157;
        r19 = 1024;
    L157:
        $dirty1 = $dirty1 | r19;
        goto L159
    L153:
        r21 = $composer2.changedInstance(decorator);
        goto L154
    L137:
        r25 = r6;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(outputTransformation) == true) goto L143;
        r16 = 128;
    L143:
        $dirty1 = $dirty1 | r16;
        goto L145
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(cursorBrush) == false) goto L131;
        int r27 = 32;
    L132:
        $dirty1 = $dirty1 | r27;
        goto L134
    L131:
        r27 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(interactionSource) == false) goto L120;
        int r24 = 4;
    L121:
        $dirty1 = $dirty1 | r24;
        goto L123
    L120:
        r24 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r45) == false) goto L109;
        int r33 = 536870912;
    L110:
        $dirty = $dirty | r33;
        goto L112
    L109:
        r33 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(lineLimits) == false) goto L98;
        int r32 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r32;
        goto L101
    L98:
        r32 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(onKeyboardAction) == false) goto L87;
        int r31 = 8388608;
    L88:
        $dirty = $dirty | r31;
        goto L90
    L87:
        r31 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        keyboardOptions2 = keyboardOptions;
        if ($composer2.changed(keyboardOptions2) == false) goto L76;
        int r30 = 1048576;
    L77:
        $dirty = $dirty | r30;
        goto L79
    L76:
        r30 = 524288;
        goto L77
    L78:
        keyboardOptions2 = keyboardOptions;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L65;
        int r29 = 131072;
    L66:
        $dirty = $dirty | r29;
        goto L68
    L65:
        r29 = 65536;
        goto L66
    L67:
        textStyle2 = textStyle;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r12 = inputTransformation;
        if ($composer2.changed(r12) == false) goto L54;
        int r210 = 16384;
    L55:
        $dirty = $dirty | r210;
        goto L57
    L54:
        r210 = 8192;
        goto L55
    L56:
        r12 = inputTransformation;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r10 = readOnly;
        if ($composer2.changed(r10) == false) goto L43;
        int r211 = 2048;
    L44:
        $dirty = $dirty | r211;
        goto L46
    L43:
        r211 = 1024;
        goto L44
    L45:
        r10 = readOnly;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r9 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L24
    L21:
        r112 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r113 = 4;
    L11:
        $dirty = $dirty | r113;
        goto L13
    L10:
        r113 = 2;
        goto L11
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r60v1 java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r56, androidx.compose.ui.Modifier r57, boolean r58, boolean r59, androidx.compose.foundation.text.input.InputTransformation r60, androidx.compose.ui.text.TextStyle r61, androidx.compose.foundation.text.KeyboardOptions r62, androidx.compose.foundation.text.input.KeyboardActionHandler r63, androidx.compose.foundation.text.input.TextFieldLineLimits r64, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r65, androidx.compose.foundation.interaction.MutableInteractionSource r66, androidx.compose.ui.graphics.Brush r67, androidx.compose.foundation.text.input.internal.CodepointTransformation r68, androidx.compose.foundation.text.input.OutputTransformation r69, androidx.compose.foundation.text.input.TextFieldDecorator r70, androidx.compose.foundation.ScrollState r71, boolean r72, androidx.compose.runtime.Composer r73, final int r74, final int r75, final int r76) {
        androidx.compose.runtime.Composer r5 = r73.startRestartGroup(965149429);
        androidx.compose.runtime.ComposerKt.sourceInformation(r5, "C(BasicTextField)P(15,9,3,13,4,16,7,10,8,11,5,1!1,12!1,14)245@13732L7,246@13787L7,247@13832L7,253@14202L25,254@14276L25,256@14396L107,261@14540L845,279@15583L48,287@15976L397,298@16399L24,299@16476L7,300@16526L7,301@16580L7,304@16626L2068,348@18711L509,348@18700L520,364@19268L51,364@19226L93,389@20448L1339,429@22642L3263:BasicTextField.kt#423gt5");
        int r6 = r74;
        int r7 = r75;
        int r8 = r76 & 1;
        if (r8 == 0) goto L5;
        r6 = r6 | 6;
    L12:
        int r8 = r76 & 2;
        if (r8 == 0) goto L15;
        r6 = r6 | 48;
        androidx.compose.ui.Modifier r13 = r57;
    L23:
        int r14 = r76 & 4;
        if (r14 == 0) goto L26;
        r6 = r6 | 384;
        boolean r12 = r58;
    L34:
        int r17 = r76 & 8;
        int r18 = 1024;
        if (r17 == 0) goto L37;
        r6 = r6 | 3072;
        boolean r15 = r59;
    L45:
        int r21 = r76 & 16;
        if (r21 == 0) goto L48;
        r6 = r6 | 24576;
        androidx.compose.foundation.text.input.InputTransformation r11 = r60;
    L56:
        int r24 = r76 & 32;
        if (r24 == 0) goto L59;
        r6 = r6 | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        androidx.compose.ui.text.TextStyle r9 = r61;
    L67:
        int r26 = r76 & 64;
        if (r26 == 0) goto L70;
        r6 = r6 | 1572864;
        androidx.compose.foundation.text.KeyboardOptions r10 = r62;
    L78:
        int r2 = r76 & 128;
        if (r2 == 0) goto L81;
        r6 = r6 | 12582912;
    L89:
        int r2 = r76 & 256;
        if (r2 == 0) goto L92;
        r6 = r6 | 100663296;
    L100:
        int r2 = r76 & 512;
        if (r2 == 0) goto L103;
        r6 = r6 | 805306368;
    L111:
        int r2 = r76 & 1024;
        if (r2 == 0) goto L114;
        r7 = r7 | 6;
    L122:
        int r2 = r76 & 2048;
        if (r2 == 0) goto L125;
        r7 = r7 | 48;
    L133:
        int r2 = r76 & 4096;
        if (r2 == 0) goto L136;
        r7 = r7 | 384;
        int r16 = r2;
    L144:
        int r2 = r76 & 8192;
        if (r2 == 0) goto L147;
        r7 = r7 | 3072;
        int r19 = r2;
    L154:
        int r2 = r76 & 16384;
        if (r2 == 0) goto L157;
        r7 = r7 | 24576;
        int r34 = r2;
    L167:
        int r2 = 196608 & r75;
        if (r2 != 0) goto L178;
        int r2 = r76 & 32768;
        if (r2 != 0) goto L175;
        boolean r35 = r5.changed(r71);
        if (r35 == false) goto L175;
        int r35 = 131072;
    L176:
        r7 = r7 | r35;
    L175:
        r35 = 65536;
    L178:
        int r35 = r76 & 65536;
        if (r35 == 0) goto L181;
        r7 = r7 | 1572864;
    L189:
        int r0 = r6 & 306783379;
        if (r0 != 306783378) goto L195;
        int r0 = 599187 & r7;
        if (r0 != 599186) goto L195;
        boolean r0 = false;
    L196:
        int r2 = r6 & 1;
        boolean r0 = r5.shouldExecute(r0, r2);
        if (r0 == false) goto L407;
        r5.startDefaults();
        androidx.compose.runtime.ComposerKt.sourceInformation(r5, "240@13526L21");
        int r0 = r74 & 1;
        if (r0 == 0) goto L207;
        boolean r0 = r5.getDefaultsInvalid();
        if (r0 == true) goto L207;
        r5.skipToGroupEnd();
        int r0 = r76 & 32768;
        if (r0 == 0) goto L206;
        r7 = r7 & (-458753);
    L206:
        androidx.compose.foundation.text.input.KeyboardActionHandler r8 = r63;
        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r45 = r65;
        androidx.compose.foundation.interaction.MutableInteractionSource r14 = r66;
        final androidx.compose.ui.graphics.Brush r39 = r67;
        androidx.compose.foundation.text.input.internal.CodepointTransformation r16 = r68;
        androidx.compose.foundation.text.input.OutputTransformation r0 = r69;
        final androidx.compose.foundation.text.input.TextFieldDecorator r30 = r70;
        final androidx.compose.foundation.ScrollState r42 = r71;
        final androidx.compose.ui.text.TextStyle r33 = r9;
        androidx.compose.foundation.text.KeyboardOptions r2 = r10;
        boolean r40 = r12;
        final boolean r41 = r15;
        androidx.compose.foundation.text.input.TextFieldLineLimits r9 = r64;
        int r10 = r7;
        boolean r7 = r72;
    L252:
        r5.endDefaults();
        boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress();
        if (r12 == false) goto L255;
        androidx.compose.runtime.ComposerKt.traceEventStart(965149429, r6, r10, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:244)");
    L255:
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> r12 = r12;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r19 = r5.consume(r12);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r19;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> r15 = r15;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r21 = r5.consume(r15);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r21;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> r3 = r17;
        boolean r64 = r7;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r7 = r5.consume(r3);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.ui.platform.WindowInfo r3 = (androidx.compose.ui.platform.WindowInfo) r7;
        androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine r7 = androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.INSTANCE;
        final boolean r44 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r7);
        if (r14 != null) goto L262;
        r5.startReplaceGroup(97517141);
        androidx.compose.runtime.ComposerKt.sourceInformation(r5, "251@14037L39");
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243780275, "CC(remember):BasicTextField.kt#9igjgp");
        java.lang.Object r3 = r5.rememberedValue();
        androidx.compose.runtime.Composer.Companion r21 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r8 = r21.getEmpty();
        if (r3 != r8) goto L260;
        java.lang.Object r8 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
        r5.updateRememberedValue(r8);
    L261:
        androidx.compose.foundation.interaction.MutableInteractionSource r8 = (androidx.compose.foundation.interaction.MutableInteractionSource) r8;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        r5.endReplaceGroup();
    L263:
        androidx.compose.foundation.interaction.MutableInteractionSource r52 = r8;
        if (r44 == false) goto L266;
        androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Horizontal;
    L267:
        final androidx.compose.foundation.gestures.Orientation r43 = r3;
        androidx.compose.foundation.interaction.MutableInteractionSource r8 = r52;
        final androidx.compose.foundation.text.input.TextFieldLineLimits r31 = r9;
        androidx.compose.runtime.State<java.lang.Boolean> r8 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(r8, r5, 0);
        java.lang.Boolean r8 = r8.getValue();
        java.lang.Boolean r8 = r8;
        final boolean r34 = r8.booleanValue();
        androidx.compose.foundation.interaction.MutableInteractionSource r8 = r52;
        androidx.compose.runtime.State<java.lang.Boolean> r8 = androidx.compose.foundation.interaction.HoverInteractionKt.collectIsHoveredAsState(r8, r5, 0);
        java.lang.Boolean r8 = r8.getValue();
        java.lang.Boolean r8 = r8;
        final boolean r36 = r8.booleanValue();
        final boolean r35 = r3.isWindowFocused();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243768719, "CC(remember):BasicTextField.kt#9igjgp");
        java.lang.Object r8 = r5.rememberedValue();
        androidx.compose.runtime.Composer.Companion r21 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r12 = r21.getEmpty();
        androidx.compose.foundation.interaction.MutableInteractionSource r71 = r14;
        if (r8 != r12) goto L271;
        kotlinx.coroutines.channels.BufferOverflow r8 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST;
        r8 = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, r8, 2, null);
        r5.updateRememberedValue(r8);
    L271:
        java.lang.Object r3 = r8;
        final kotlinx.coroutines.flow.MutableSharedFlow r3 = (kotlinx.coroutines.flow.MutableSharedFlow) r3;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243763373, "CC(remember):BasicTextField.kt#9igjgp");
        int r8 = r6 & 14;
        if (r8 != 4) goto L274;
        boolean r8 = true;
    L275:
        int r9 = r10 & 896;
        if (r9 != 256) goto L278;
        boolean r9 = true;
    L279:
        boolean r8 = r8 | r9;
        int r9 = r10 & 7168;
        if (r9 != 2048) goto L282;
        boolean r9 = true;
    L283:
        boolean r8 = r8 | r9;
        java.lang.Object r15 = r5.rememberedValue();
        if (r8 == true) goto L290;
        androidx.compose.runtime.Composer.Companion r19 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r14 = r19.getEmpty();
        if (r15 == r14) goto L290;
    L298:
        java.lang.Object r37 = r15;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState r37 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r37;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243730794, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r8 = r5.changed(r37);
        java.lang.Object r14 = r5.rememberedValue();
        if (r8 == true) goto L304;
        androidx.compose.runtime.Composer.Companion r17 = androidx.compose.runtime.Composer.Companion;
        androidx.compose.foundation.text.input.OutputTransformation r19 = r0;
        java.lang.Object r0 = r17.getEmpty();
        if (r14 != r0) goto L306;
    L305:
        java.lang.Object r17 = new androidx.compose.foundation.text.input.internal.TextLayoutState();
        r5.updateRememberedValue(r17);
        r14 = r17;
    L306:
        java.lang.Object r32 = r14;
        final androidx.compose.foundation.text.input.internal.TextLayoutState r32 = (androidx.compose.foundation.text.input.internal.TextLayoutState) r32;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        if (r11 == null) goto L309;
        androidx.compose.foundation.text.KeyboardOptions r0 = r11.getKeyboardOptions();
    L310:
        final androidx.compose.foundation.text.KeyboardOptions r46 = r2.fillUnspecifiedValuesWith$foundation_release(r0);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243717869, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r0 = r5.changed(r37);
        java.lang.Object r12 = r5.rememberedValue();
        if (r0 == true) goto L316;
        androidx.compose.runtime.Composer.Companion r15 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r15 = r15.getEmpty();
        if (r12 == r15) goto L316;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r37;
    L322:
        java.lang.Object r38 = r12;
        final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r38 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r38;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -954203484, "CC(remember):Effects.kt#9igjgp");
        java.lang.Object r1 = r5.rememberedValue();
        androidx.compose.runtime.Composer.Companion r26 = androidx.compose.runtime.Composer.Companion;
        androidx.compose.foundation.text.KeyboardOptions r27 = r2;
        java.lang.Object r2 = r26.getEmpty();
        if (r1 != r2) goto L326;
        kotlin.coroutines.EmptyCoroutineContext r26 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        kotlin.coroutines.EmptyCoroutineContext r1 = r26;
        r1 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r1, r5);
        r5.updateRememberedValue(r1);
    L326:
        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> r2 = r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r14 = r5.consume(r2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        final androidx.compose.ui.hapticfeedback.HapticFeedback r2 = (androidx.compose.ui.hapticfeedback.HapticFeedback) r14;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.Clipboard> r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboard();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.Clipboard> r9 = r9;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r15 = r5.consume(r9);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        final androidx.compose.ui.platform.Clipboard r9 = (androidx.compose.ui.platform.Clipboard) r15;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> r12 = r12;
        int r17 = r10;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r4 = r5.consume(r12);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.ui.platform.TextToolbar r4 = (androidx.compose.ui.platform.TextToolbar) r4;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243695398, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r10 = r5.changed(r1);
        boolean r12 = r5.changed(r4);
        boolean r10 = r10 | r12;
        java.lang.Object r15 = r5.rememberedValue();
        if (r10 == true) goto L333;
        androidx.compose.runtime.Composer.Companion r26 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r10 = r26.getEmpty();
        if (r15 == r10) goto L333;
    L334:
        final androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 r15 = (androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1) r15;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243630237, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r10 = r5.changed(r0);
        int r12 = 57344 & r6;
        if (r12 != 16384) goto L337;
        boolean r12 = true;
    L338:
        boolean r10 = r10 | r12;
        boolean r12 = r5.changedInstance(r38);
        boolean r10 = r10 | r12;
        boolean r12 = r5.changedInstance(r2);
        boolean r10 = r10 | r12;
        boolean r12 = r5.changedInstance(r9);
        boolean r10 = r10 | r12;
        boolean r12 = r5.changed(r15);
        boolean r10 = r10 | r12;
        boolean r12 = r5.changed(r60);
        boolean r10 = r10 | r12;
        int r12 = r6 & 896;
        if (r12 != 256) goto L341;
        boolean r12 = true;
    L342:
        boolean r10 = r10 | r12;
        int r12 = r6 & 7168;
        if (r12 != 2048) goto L345;
        boolean r12 = true;
    L346:
        boolean r10 = r10 | r12;
        int r12 = r17 & 3670016;
        if (r12 != 1048576) goto L349;
        boolean r12 = true;
    L350:
        boolean r10 = r10 | r12;
        final androidx.compose.foundation.text.input.internal.TransformedTextFieldState r58 = r0;
        java.lang.Object r0 = r5.rememberedValue();
        if (r10 == true) goto L357;
        androidx.compose.runtime.Composer.Companion r22 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r1 = r22.getEmpty();
        if (r0 == r1) goto L357;
        final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = r38;
    L358:
        kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.EffectsKt.SideEffect(r0, r5, 0);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243612871, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r0 = r5.changedInstance(r2);
        java.lang.Object r12 = r5.rememberedValue();
        if (r0 == true) goto L365;
        androidx.compose.runtime.Composer.Companion r20 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r0 = r20.getEmpty();
        if (r12 == r0) goto L365;
    L366:
        kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.EffectsKt.DisposableEffect(r2, r12, r5, 0);
        if (r64 != 0) goto L373;
        int r0 = r27.m1067getKeyboardTypePjHm6EE();
        androidx.compose.ui.text.input.KeyboardType.Companion r1 = androidx.compose.ui.text.input.KeyboardType.Companion;
        int r1 = r1.m6655getPasswordPjHm6EE();
        boolean r0 = androidx.compose.ui.text.input.KeyboardType.m6636equalsimpl0(r0, r1);
        if (r0 == true) goto L373;
        int r0 = r27.m1067getKeyboardTypePjHm6EE();
        androidx.compose.ui.text.input.KeyboardType.Companion r1 = androidx.compose.ui.text.input.KeyboardType.Companion;
        int r1 = r1.m6654getNumberPasswordPjHm6EE();
        boolean r0 = androidx.compose.ui.text.input.KeyboardType.m6636equalsimpl0(r0, r1);
        if (r0 == true) goto L373;
        final boolean r0 = true;
    L374:
        androidx.compose.foundation.text.input.KeyboardActionHandler r65 = r8;
        final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r60 = r2;
        androidx.compose.foundation.text.input.InputTransformation r61 = r11;
        final boolean r62 = r40;
        boolean r63 = r41;
        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier(r58, r32, r60, r61, r62, r63, r46, r65, r44, r52, r64, r3);
        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier r14 = r1;
        androidx.compose.ui.Modifier r14 = r13.then(r14);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1243573823, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r3 = r5.changed(r0);
        boolean r7 = r5.changedInstance(r3);
        boolean r3 = r3 | r7;
        java.lang.Object r3 = r5.rememberedValue();
        if (r3 == true) goto L381;
        androidx.compose.runtime.Composer.Companion r26 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r4 = r26.getEmpty();
        if (r3 == r4) goto L381;
    L382:
        kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.ui.Modifier r3 = androidx.compose.foundation.text.handwriting.StylusHandwritingKt.stylusHandwriting(r14, r62, r0, r3);
        androidx.compose.ui.Modifier r46 = androidx.compose.foundation.FocusableKt.focusable(r3, r62, r52);
        androidx.compose.foundation.ScrollState r47 = r42;
        androidx.compose.foundation.ScrollState r47 = r47;
        if (r62 == false) goto L387;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType r3 = r60.getDirectDragGestureInitiator();
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType r4 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None;
        if (r3 != r4) goto L387;
        boolean r49 = true;
    L388:
        androidx.compose.foundation.gestures.ScrollableDefaults r3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
        boolean r50 = r3.reverseDirection(r15, r3, false);
        androidx.compose.ui.Modifier r1 = androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(r46, r47, r3, r49, r50, null, r52, 16, null);
        androidx.compose.ui.input.pointer.PointerIcon r3 = androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon();
        boolean r57 = r0;
        androidx.compose.ui.Modifier r0 = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(r1, r3, false, 2, null);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        androidx.compose.ui.Alignment.Companion r0 = androidx.compose.ui.Alignment.Companion;
        androidx.compose.ui.Alignment r0 = r0.getTopStart();
        androidx.compose.ui.layout.MeasurePolicy r14 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(r0, true);
        int r21 = 384 << 3;
        int r21 = r21 & 112;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(r5, 0);
        androidx.compose.runtime.CompositionLocalMap r1 = r5.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(r5, r0);
        androidx.compose.ui.node.ComposeUiNode.Companion r25 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> r25 = r25.getConstructor();
        int r0 = r21 << 6;
        int r0 = r0 & 896;
        int r0 = r0 | 6;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        androidx.compose.runtime.Applier<?> r0 = r5.getApplier();
        boolean r0 = r0 instanceof androidx.compose.runtime.Applier;
        if (r0 == true) goto L391;
        androidx.compose.runtime.ComposablesKt.invalidApplier();
    L391:
        r5.startReusableNode();
        boolean r0 = r5.getInserting();
        if (r0 == false) goto L394;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> r0 = r25;
        r5.createNode(r0);
    L395:
        androidx.compose.runtime.Composer r3 = androidx.compose.runtime.Updater.m3808constructorimpl(r5);
        androidx.compose.ui.node.ComposeUiNode.Companion r29 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> r47 = r0;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit> r0 = r29.getSetMeasurePolicy();
        androidx.compose.runtime.Updater.m3815setimpl(r3, r14, r0);
        androidx.compose.ui.node.ComposeUiNode.Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit> r0 = r0.getSetResolvedCompositionLocals();
        androidx.compose.runtime.Updater.m3815setimpl(r3, r1, r0);
        androidx.compose.ui.node.ComposeUiNode.Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> r0 = r0.getSetCompositeKeyHash();
        boolean r43 = r3.getInserting();
        if (r43 == true) goto L402;
        java.lang.Object r1 = r3.rememberedValue();
        java.lang.Integer r4 = java.lang.Integer.valueOf(r0);
        boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4);
        if (r1 == false) goto L402;
    L403:
        androidx.compose.ui.node.ComposeUiNode.Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit> r0 = r0.getSetModifier();
        androidx.compose.runtime.Updater.m3815setimpl(r3, r2, r0);
        int r0 = r0 >> 6;
        int r0 = r0 & 14;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        int r4 = 384 >> 6;
        int r4 = r4 & 112;
        int r4 = r4 | 6;
        androidx.compose.foundation.layout.BoxScopeInstance r0 = r0;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, 1241724616, "C430@22759L3140,430@22709L3190:BasicTextField.kt#423gt5");
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r29 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1(r30, r31, r32, r33, r34, r35, r36, r58, r60, r39, r62, r41, r42, r43, r44, r45, r46);
        androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-673241599, true, r29, r5, 54);
        androidx.compose.runtime.internal.ComposableLambda r1 = r1;
        int r3 = r6 >> 3;
        int r3 = r3 & 112;
        int r3 = r3 | 384;
        androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea(r60, r62, r1, r5, r3);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        r5.endNode();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5);
        boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress();
        if (r1 == false) goto L406;
        androidx.compose.runtime.ComposerKt.traceEventEnd();
    L406:
        final androidx.compose.foundation.text.input.InputTransformation r5 = r11;
        final boolean r3 = r62;
        final androidx.compose.ui.Modifier r2 = r13;
        final androidx.compose.foundation.text.input.internal.CodepointTransformation r13 = r16;
        final androidx.compose.foundation.text.input.OutputTransformation r14 = r19;
        final androidx.compose.foundation.text.input.KeyboardActionHandler r8 = r65;
        final boolean r17 = r64;
        final androidx.compose.foundation.text.KeyboardOptions r7 = r27;
        final androidx.compose.foundation.text.input.TextFieldDecorator r15 = r30;
        final androidx.compose.foundation.text.input.TextFieldLineLimits r9 = r31;
        final androidx.compose.ui.text.TextStyle r6 = r33;
        final androidx.compose.ui.graphics.Brush r12 = r39;
        final boolean r4 = r41;
        final androidx.compose.foundation.ScrollState r16 = r42;
        final kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r10 = r45;
        final androidx.compose.foundation.interaction.MutableInteractionSource r11 = r71;
    L408:
        androidx.compose.runtime.ScopeUpdateScope r1 = r5.endRestartGroup();
        if (r1 == null) goto L411;
        int r18 = r6;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r0 = new androidx.compose.foundation.text.BasicTextFieldKt.AnonymousClass5(r56, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r74, r75, r76);
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r0 = r0;
        r1.updateScope(r0);
        return;
    L411:
        int r22 = r6;
        return;
    L402:
        java.lang.Integer r1 = java.lang.Integer.valueOf(r0);
        r3.updateRememberedValue(r1);
        java.lang.Integer r1 = java.lang.Integer.valueOf(r0);
        r3.apply(r1, r0);
        goto L403
    L394:
        r0 = r25;
        r5.useNode();
    L387:
        r49 = false;
    L381:
        java.lang.Object r3 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$decorationModifiers$1$1(r0, r3);
        r3 = (kotlin.jvm.functions.Function0) r3;
        r5.updateRememberedValue(r3);
    L373:
        r0 = false;
    L365:
        java.lang.Object r0 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1(r2);
        java.lang.Object r0 = (kotlin.jvm.functions.Function1) r0;
        r5.updateRememberedValue(r0);
        r12 = r0;
    L357:
        final androidx.compose.foundation.text.input.InputTransformation r59 = r11;
        boolean r65 = r40;
        boolean r66 = r41;
        java.lang.Object r22 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1(r58, r59, r38, r2, r9, r15, r60, r65, r66, r64);
        r2 = r38;
        java.lang.Object r22 = (kotlin.jvm.functions.Function0) r22;
        r5.updateRememberedValue(r22);
        r0 = r22;
        goto L358
    L349:
        r12 = false;
        goto L350
    L345:
        r12 = false;
        goto L346
    L341:
        r12 = false;
        goto L342
    L337:
        r12 = false;
    L333:
        java.lang.Object r10 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(r4, r1);
        r5.updateRememberedValue(r10);
        r15 = r10;
    L316:
        if (r34 == false) goto L320;
        if (r35 == false) goto L320;
        boolean r24 = true;
    L321:
        boolean r63 = r24;
        boolean r61 = r40;
        boolean r62 = r41;
        java.lang.Object r17 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState(r37, r32, r12, r61, r62, r63, r64);
        r0 = r37;
        r5.updateRememberedValue(r17);
        r12 = r17;
    L320:
        r24 = false;
        goto L321
    L309:
        r0 = null;
        goto L310
    L304:
        r19 = r0;
    L290:
        if (r16 != null) goto L296;
        androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation r19 = androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation.INSTANCE;
        if (r44 == true) goto L295;
        r19 = null;
    L295:
        androidx.compose.foundation.text.input.internal.CodepointTransformation r19 = (androidx.compose.foundation.text.input.internal.CodepointTransformation) r19;
    L297:
        androidx.compose.foundation.text.input.internal.CodepointTransformation r57 = r19;
        java.lang.Object r3 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState(r56, r11, r57, r0);
        r5.updateRememberedValue(r3);
        r15 = r3;
        goto L298
    L296:
        r19 = r16;
        goto L297
    L282:
        r9 = false;
        goto L283
    L278:
        r9 = false;
        goto L279
    L274:
        r8 = false;
        goto L275
    L266:
        r3 = androidx.compose.foundation.gestures.Orientation.Vertical;
        goto L267
    L260:
        r8 = r3;
        goto L261
    L262:
        r5.startReplaceGroup(-1243780926);
        r5.endReplaceGroup();
        r8 = r14;
    L207:
        if (r8 == 0) goto L209;
        androidx.compose.ui.Modifier.Companion r0 = androidx.compose.ui.Modifier.Companion;
        androidx.compose.ui.Modifier.Companion r0 = (androidx.compose.ui.Modifier) r0;
        r13 = r0;
    L209:
        if (r14 == 0) goto L211;
        r12 = true;
    L211:
        if (r17 == 0) goto L213;
        r15 = false;
    L213:
        if (r21 == 0) goto L215;
        r11 = null;
    L215:
        if (r24 == 0) goto L217;
        androidx.compose.ui.text.TextStyle.Companion r0 = androidx.compose.ui.text.TextStyle.Companion;
        androidx.compose.ui.text.TextStyle r0 = r0.getDefault();
    L218:
        if (r26 == 0) goto L220;
        androidx.compose.foundation.text.KeyboardOptions.Companion r2 = androidx.compose.foundation.text.KeyboardOptions.Companion;
        r2 = r2.getDefault();
    L221:
        if (r2 == 0) goto L223;
        r8 = null;
    L224:
        if (r2 == 0) goto L226;
        androidx.compose.foundation.text.input.TextFieldLineLimits.Companion r9 = androidx.compose.foundation.text.input.TextFieldLineLimits.Companion;
        r9 = r9.getDefault();
    L227:
        if (r2 == 0) goto L229;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r10 = null;
    L230:
        if (r2 == 0) goto L232;
        r14 = null;
    L233:
        if (r2 == 0) goto L235;
        androidx.compose.foundation.text.BasicTextFieldDefaults r17 = androidx.compose.foundation.text.BasicTextFieldDefaults.INSTANCE;
        androidx.compose.ui.graphics.SolidColor r17 = r17.getCursorBrush();
        androidx.compose.ui.graphics.Brush r17 = (androidx.compose.ui.graphics.Brush) r17;
    L236:
        if (r16 == 0) goto L238;
        r16 = null;
    L239:
        if (r19 == 0) goto L241;
        androidx.compose.foundation.text.input.OutputTransformation r19 = null;
    L242:
        if (r34 == 0) goto L244;
        androidx.compose.foundation.text.input.TextFieldDecorator r21 = null;
    L245:
        int r18 = r76 & 32768;
        if (r18 == 0) goto L248;
        androidx.compose.foundation.ScrollState r18 = androidx.compose.foundation.ScrollKt.rememberScrollState(0, r5, 0, 1);
        r7 = r7 & (-458753);
    L249:
        if (r35 == 0) goto L251;
        r33 = r0;
        r45 = r10;
        r40 = r12;
        r41 = r15;
        r39 = r17;
        r42 = r18;
        r30 = r21;
        r10 = r7;
        r7 = false;
        r0 = r19;
        goto L252
    L251:
        r33 = r0;
        r45 = r10;
        r40 = r12;
        r41 = r15;
        r39 = r17;
        r42 = r18;
        r0 = r19;
        r30 = r21;
        r10 = r7;
        r7 = r72;
        goto L252
    L248:
        r18 = r71;
        goto L249
    L244:
        r21 = r70;
        goto L245
    L241:
        r19 = r69;
        goto L242
    L238:
        r16 = r68;
        goto L239
    L235:
        r17 = r67;
        goto L236
    L232:
        r14 = r66;
        goto L233
    L229:
        r10 = r65;
        goto L230
    L226:
        r9 = r64;
        goto L227
    L223:
        r8 = r63;
        goto L224
    L220:
        r2 = r10;
        goto L221
    L217:
        r0 = r9;
        goto L218
    L407:
        r5.skipToGroupEnd();
        r8 = r63;
        r14 = r69;
        r16 = r71;
        r17 = r72;
        int r21 = r7;
        r6 = r9;
        r7 = r10;
        r5 = r11;
        r3 = r12;
        r2 = r13;
        r4 = r15;
        r9 = r64;
        r10 = r65;
        r11 = r66;
        r12 = r67;
        r13 = r68;
        r15 = r70;
    L195:
        r0 = true;
        goto L196
    L181:
        int r27 = r75 & 1572864;
        if (r27 != 0) goto L189;
        boolean r27 = r5.changed(r72);
        if (r27 == false) goto L186;
        int r27 = 1048576;
    L187:
        r7 = r7 | r27;
        goto L189
    L186:
        r27 = 524288;
        goto L187
    L157:
        r34 = r2;
        int r2 = r75 & 24576;
        if (r2 != 0) goto L167;
        int r2 = r75 & 32768;
        if (r2 != 0) goto L162;
        boolean r2 = r5.changed(r70);
    L163:
        if (r2 == false) goto L165;
        int r2 = 16384;
    L166:
        r7 = r7 | r2;
        goto L167
    L165:
        r2 = 8192;
        goto L166
    L162:
        r2 = r5.changedInstance(r70);
        goto L163
    L147:
        r19 = r2;
        int r2 = r75 & 3072;
        if (r2 != 0) goto L154;
        boolean r34 = r5.changed(r69);
        if (r34 == false) goto L152;
        r18 = 2048;
    L152:
        r7 = r7 | r18;
        goto L154
    L136:
        r16 = r2;
        int r2 = r75 & 384;
        if (r2 != 0) goto L144;
        boolean r34 = r5.changed(r68);
        if (r34 == false) goto L141;
        int r19 = 256;
    L142:
        r7 = r7 | r19;
        goto L144
    L141:
        r19 = 128;
        goto L142
    L125:
        int r33 = r75 & 48;
        if (r33 != 0) goto L133;
        boolean r34 = r5.changed(r67);
        if (r34 == false) goto L130;
        int r16 = 32;
    L131:
        r7 = r7 | r16;
        goto L133
    L130:
        r16 = 16;
        goto L131
    L114:
        int r32 = r75 & 6;
        if (r32 != 0) goto L122;
        boolean r33 = r5.changed(r66);
        if (r33 == false) goto L119;
        int r33 = 4;
    L120:
        r7 = r7 | r33;
        goto L122
    L119:
        r33 = 2;
        goto L120
    L103:
        int r31 = r74 & 805306368;
        if (r31 != 0) goto L111;
        boolean r32 = r5.changedInstance(r65);
        if (r32 == false) goto L108;
        int r32 = 536870912;
    L109:
        r6 = r6 | r32;
        goto L111
    L108:
        r32 = 268435456;
        goto L109
    L92:
        int r30 = r74 & 100663296;
        if (r30 != 0) goto L100;
        boolean r31 = r5.changed(r64);
        if (r31 == false) goto L97;
        int r31 = 67108864;
    L98:
        r6 = r6 | r31;
        goto L100
    L97:
        r31 = 33554432;
        goto L98
    L81:
        int r29 = r74 & 12582912;
        if (r29 != 0) goto L89;
        boolean r30 = r5.changed(r63);
        if (r30 == false) goto L86;
        int r30 = 8388608;
    L87:
        r6 = r6 | r30;
        goto L89
    L86:
        r30 = 4194304;
        goto L87
    L70:
        int r28 = r74 & 1572864;
        if (r28 != 0) goto L77;
        r10 = r62;
        boolean r29 = r5.changed(r10);
        if (r29 == false) goto L75;
        int r29 = 1048576;
    L76:
        r6 = r6 | r29;
        goto L78
    L75:
        r29 = 524288;
        goto L76
    L77:
        r10 = r62;
        goto L78
    L59:
        int r25 = r74 & 196608;
        if (r25 != 0) goto L66;
        r9 = r61;
        boolean r26 = r5.changed(r9);
        if (r26 == false) goto L64;
        int r26 = 131072;
    L65:
        r6 = r6 | r26;
        goto L67
    L64:
        r26 = 65536;
        goto L65
    L66:
        r9 = r61;
        goto L67
    L48:
        int r11 = r74 & 24576;
        if (r11 != 0) goto L55;
        r11 = r60;
        boolean r24 = r5.changed(r11);
        if (r24 == false) goto L53;
        int r24 = 16384;
    L54:
        r6 = r6 | r24;
        goto L56
    L53:
        r24 = 8192;
        goto L54
    L55:
        r11 = r60;
        goto L56
    L37:
        int r15 = r74 & 3072;
        if (r15 != 0) goto L44;
        r15 = r59;
        boolean r21 = r5.changed(r15);
        if (r21 == false) goto L42;
        int r21 = 2048;
    L43:
        r6 = r6 | r21;
        goto L45
    L42:
        r21 = 1024;
        goto L43
    L44:
        r15 = r59;
        goto L45
    L26:
        int r12 = r74 & 384;
        if (r12 != 0) goto L33;
        r12 = r58;
        boolean r17 = r5.changed(r12);
        if (r17 == false) goto L31;
        int r17 = 256;
    L32:
        r6 = r6 | r17;
        goto L34
    L31:
        r17 = 128;
        goto L32
    L33:
        r12 = r58;
        goto L34
    L15:
        int r13 = r74 & 48;
        if (r13 != 0) goto L22;
        r13 = r57;
        boolean r14 = r5.changed(r13);
        if (r14 == false) goto L20;
        int r14 = 32;
    L21:
        r6 = r6 | r14;
        goto L23
    L20:
        r14 = 16;
        goto L21
    L22:
        r13 = r57;
        goto L23
    L5:
        int r8 = r74 & 6;
        if (r8 != 0) goto L12;
        boolean r8 = r5.changed(r56);
        if (r8 == false) goto L10;
        int r8 = 4;
    L11:
        r6 = r6 | r8;
        goto L12
    L10:
        r8 = 2;
        goto L11
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState selectionState, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1991581797);
        ComposerKt.sourceInformation($composer2, "C(TextFieldCursorHandle)504@26102L128:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(selectionState) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r2 = true;
    L14:
        if ($composer2.shouldExecute(r2, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L47:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L51;
        r0.updateScope(new AnonymousClass3(selectionState, $changed));
        return;
    L51:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(1991581797, $dirty, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:501)");
    L18:
        ComposerKt.sourceInformationMarkerStart($composer2, -425706716, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(selectionState);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L21;
    L24:
        Object value$iv = SnapshotStateKt.derivedStateOf(new BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1(selectionState));
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L25:
        State cursorHandleState$delegate = (State) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (TextFieldCursorHandle$lambda$12(cursorHandleState$delegate).getVisible() == false) goto L42;
        $composer2.startReplaceGroup(-311835217);
        ComposerKt.sourceInformation($composer2, "509@26319L100,513@26498L87,508@26276L383");
        ComposerKt.sourceInformationMarkerStart($composer2, -425699800, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(selectionState);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L30;
    L33:
        Object value$iv2 = (OffsetProvider) new BasicTextFieldKt$TextFieldCursorHandle$1$1(selectionState);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L34:
        OffsetProvider r6 = (OffsetProvider) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r3 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -425694085, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(selectionState);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L37;
    L40:
        Object value$iv3 = (PointerInputEventHandler) new BasicTextFieldKt$TextFieldCursorHandle$2$1(selectionState);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidCursorHandle_androidKt.m1021CursorHandleUSBMPiE(r6, SuspendingPointerInputFilterKt.pointerInput(r3, selectionState, (PointerInputEventHandler) it$iv3), MinTouchTargetSizeForHandles, $composer2, 384, 0);
        $composer2.endReplaceGroup();
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
        goto L47
    L37:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L41;
    L30:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L34;
    L42:
        $composer2.startReplaceGroup(-311451778);
        $composer2.endReplaceGroup();
        goto L44
    L21:
        if (it$iv != Composer.Companion.getEmpty()) goto L25;
    L12:
        r2 = false;
        goto L14
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$12(State<TextFieldHandleState> r4) {
        return r4.getValue();
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState selectionState, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2025287684);
        ComposerKt.sourceInformation($composer2, "C(TextFieldSelectionHandles)525@26865L239,554@27919L240:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
    L9:
        int $dirty2 = $dirty;
        if (($dirty2 & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L72:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L76;
        r2.updateScope(new C03465(selectionState, $changed));
        return;
    L76:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(2025287684, $dirty2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:522)");
    L18:
        ComposerKt.sourceInformationMarkerStart($composer2, -1983177036, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(selectionState);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L21;
    L24:
        Object value$iv = SnapshotStateKt.derivedStateOf(new BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1(selectionState));
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L25:
        State startHandleState$delegate = (State) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (TextFieldSelectionHandles$lambda$16(startHandleState$delegate).getVisible() == false) goto L42;
        $composer2.startReplaceGroup(-1348660553);
        ComposerKt.sourceInformation($composer2, "535@27195L167,544@27589L94,534@27149L662");
        ComposerKt.sourceInformationMarkerStart($composer2, -1983166548, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(selectionState);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L30;
    L33:
        Object value$iv2 = (OffsetProvider) new BasicTextFieldKt$TextFieldSelectionHandles$1$1(selectionState);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L34:
        OffsetProvider r4 = (OffsetProvider) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ResolvedTextDirection r5 = TextFieldSelectionHandles$lambda$16(startHandleState$delegate).getDirection();
        boolean r6 = TextFieldSelectionHandles$lambda$16(startHandleState$delegate).getHandlesCrossed();
        Modifier.Companion r7 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -1983154013, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(selectionState);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L37;
    L40:
        Object value$iv3 = (PointerInputEventHandler) new BasicTextFieldKt$TextFieldSelectionHandles$2$1(selectionState);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r10 = SuspendingPointerInputFilterKt.pointerInput(r7, selectionState, (PointerInputEventHandler) it$iv3);
        AndroidSelectionHandles_androidKt.m1428SelectionHandlewLIcFTc(r4, true, r5, r6, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$16(startHandleState$delegate).getLineHeight(), r10, $composer2, 24624, 0);
        $composer2.endReplaceGroup();
    L43:
        ComposerKt.sourceInformationMarkerStart($composer2, -1983143307, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv4 = $composer2.changed(selectionState);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L46;
    L49:
        Object value$iv4 = SnapshotStateKt.derivedStateOf(new BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1(selectionState));
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L50:
        State endHandleState$delegate = (State) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (TextFieldSelectionHandles$lambda$20(endHandleState$delegate).getVisible() == false) goto L67;
        $composer2.startReplaceGroup(-1347616070);
        ComposerKt.sourceInformation($composer2, "564@28248L168,573@28640L95,563@28202L659");
        ComposerKt.sourceInformationMarkerStart($composer2, -1983132851, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv5 = $composer2.changedInstance(selectionState);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv5 == false) goto L55;
    L58:
        Object value$iv5 = (OffsetProvider) new BasicTextFieldKt$TextFieldSelectionHandles$3$1(selectionState);
        $composer2.updateRememberedValue(value$iv5);
        it$iv5 = value$iv5;
    L59:
        OffsetProvider r8 = (OffsetProvider) it$iv5;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ResolvedTextDirection r9 = TextFieldSelectionHandles$lambda$20(endHandleState$delegate).getDirection();
        boolean r11 = TextFieldSelectionHandles$lambda$20(endHandleState$delegate).getHandlesCrossed();
        Modifier.Companion r12 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -1983120380, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv6 = $composer2.changedInstance(selectionState);
        Object it$iv6 = $composer2.rememberedValue();
        if (invalid$iv6 == false) goto L62;
    L65:
        Object value$iv6 = (PointerInputEventHandler) new BasicTextFieldKt$TextFieldSelectionHandles$4$1(selectionState);
        $composer2.updateRememberedValue(value$iv6);
        it$iv6 = value$iv6;
    L66:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r13 = SuspendingPointerInputFilterKt.pointerInput(r12, selectionState, (PointerInputEventHandler) it$iv6);
        AndroidSelectionHandles_androidKt.m1428SelectionHandlewLIcFTc(r8, false, r9, r11, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$20(endHandleState$delegate).getLineHeight(), r13, $composer2, 24624, 0);
        $composer2.endReplaceGroup();
    L69:
        if (ComposerKt.isTraceInProgress() == false) goto L72;
        ComposerKt.traceEventEnd();
        goto L72
    L62:
        if (it$iv6 != Composer.Companion.getEmpty()) goto L66;
    L55:
        if (it$iv5 != Composer.Companion.getEmpty()) goto L59;
    L67:
        $composer2.startReplaceGroup(-1346967395);
        $composer2.endReplaceGroup();
        goto L69
    L46:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L50;
    L37:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L41;
    L30:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L34;
    L42:
        $composer2.startReplaceGroup(-1348008995);
        $composer2.endReplaceGroup();
        goto L43
    L21:
        if (it$iv != Composer.Companion.getEmpty()) goto L25;
    L12:
        r3 = false;
        goto L14
    L5:
        if ($composer2.changedInstance(selectionState) == false) goto L7;
        int r14 = 4;
    L8:
        $dirty = $dirty | r14;
        goto L9
    L7:
        r14 = 2;
        goto L8
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$16(State<TextFieldHandleState> r4) {
        return r4.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$20(State<TextFieldHandleState> r4) {
        return r4.getValue();
    }

    static {
        DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
        MinTouchTargetSizeForHandles = DpKt.m6995DpSizeYgX7TsA(Dp.m6973constructorimpl(40), Dp.m6973constructorimpl(40));
    }

    public static final void BasicTextField(final String value, final Function1<? super String, Unit> r37, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> r48, MutableInteractionSource interactionSource, Brush cursorBrush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed, final int $changed1, final int r55) {
        Composer $composer2 = $composer.startRestartGroup(945255183);
        ComposerKt.sourceInformation($composer2, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)712@36847L57,718@37200L242,718@37189L253,729@37763L41,733@37881L373,731@37810L1032:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r55 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r55 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r8 = r55 & 4;
        if (r8 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L33:
        int r16 = r55 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L37;
        $dirty = $dirty | 3072;
        boolean r11 = enabled;
    L44:
        int r19 = r55 & 16;
        int r20 = 16384;
        if (r19 == 0) goto L48;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L55:
        int r23 = r55 & 32;
        if (r23 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle textStyle2 = textStyle;
    L66:
        int r26 = r55 & 64;
        if (r26 == 0) goto L70;
        $dirty = $dirty | 1572864;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
    L77:
        int r9 = r55 & 128;
        if (r9 == 0) goto L81;
        $dirty = $dirty | 12582912;
        KeyboardActions r10 = keyboardActions;
    L88:
        int r0 = r55 & 256;
        if (r0 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L100:
        if (($changed & 805306368) != 0) goto L110;
        if ((r55 & 512) != 0) goto L107;
        if ($composer2.changed(maxLines) == false) goto L107;
        int r31 = 536870912;
    L108:
        $dirty = $dirty | r31;
    L107:
        r31 = 268435456;
    L110:
        int r1 = r55 & 1024;
        if (r1 == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L121:
        int r2 = r55 & 2048;
        if (r2 == 0) goto L125;
        $dirty1 = $dirty1 | 48;
    L132:
        int r3 = r55 & 4096;
        if (r3 == 0) goto L135;
        $dirty1 = $dirty1 | 384;
        int r33 = r3;
    L143:
        int r4 = r55 & 8192;
        if (r4 == 0) goto L146;
        $dirty1 = $dirty1 | 3072;
        int r22 = r4;
    L154:
        int r5 = r55 & 16384;
        if (r5 == 0) goto L157;
        $dirty1 = $dirty1 | 24576;
        int r18 = r5;
    L165:
        int r110 = r55 & 32768;
        if (r110 == 0) goto L169;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L177:
        if (($dirty & 306783379) == 306783378) goto L179;
    L182:
        boolean r6 = true;
    L184:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L286;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "");
        if (($changed & 1) != 0) goto L188;
    L194:
        if (r8 == 0) goto L196;
        modifier2 = Modifier.Companion;
    L196:
        if (r16 == 0) goto L198;
        boolean enabled2 = true;
    L199:
        if (r19 == 0) goto L201;
        readOnly2 = false;
    L201:
        if (r23 == 0) goto L203;
        textStyle2 = TextStyle.Companion.getDefault();
    L203:
        if (r26 == 0) goto L205;
        keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L205:
        if (r9 == 0) goto L207;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L208:
        if (r0 == 0) goto L210;
        boolean singleLine2 = false;
    L212:
        if ((r55 & 512) == 0) goto L217;
        if (singleLine2 == false) goto L215;
        int maxLines2 = 1;
    L216:
        $dirty = $dirty & (-1879048193);
    L218:
        if (r1 == 0) goto L220;
        int minLines2 = 1;
    L221:
        if (r2 == 0) goto L223;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L224:
        if (r33 == 0) goto L226;
        AnonymousClass6 r111 = AnonymousClass6.INSTANCE;
    L227:
        if (r22 == 0) goto L229;
        MutableInteractionSource interactionSource2 = null;
    L230:
        if (r18 == 0) goto L232;
        SolidColor cursorBrush2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    L233:
        if (r110 == 0) goto L235;
        KeyboardActions keyboardActions3 = keyboardActions2;
        int maxLines3 = maxLines2;
        int minLines3 = minLines2;
        TextStyle textStyle3 = textStyle2;
        VisualTransformation visualTransformation3 = visualTransformation2;
        Function1<? super TextLayoutResult, Unit> r12 = r111;
        boolean enabled3 = enabled2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        boolean readOnly3 = readOnly2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Brush cursorBrush3 = cursorBrush2;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r21 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1041getLambda1$foundation_release();
        Modifier modifier3 = modifier2;
        boolean singleLine3 = singleLine2;
    L236:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L239;
        ComposerKt.traceEventStart(945255183, $dirty, $dirty1, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:709)");
    L239:
        ComposerKt.sourceInformationMarkerStart($composer2, -1243050337, "CC(remember):BasicTextField.kt#9igjgp");
        Object value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L243;
        value$iv = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(value, 0, null, 6, null), null, 2, null);
        $composer2.updateRememberedValue(value$iv);
    L243:
        final MutableState textFieldValueState$delegate = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final TextFieldValue textFieldValue = TextFieldValue.m6661copy3r_uNRQ$default(BasicTextField$lambda$24(textFieldValueState$delegate), value, 0, null, 6, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -1243038856, "CC(remember):BasicTextField.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(textFieldValue);
        Modifier modifier4 = modifier3;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L249;
        TextStyle textStyle4 = textStyle3;
        if (value$iv2 != Composer.Companion.getEmpty()) goto L251;
    L250:
        value$iv2 = (Function0) new BasicTextFieldKt$BasicTextField$7$1(textFieldValue, textFieldValueState$delegate);
        $composer2.updateRememberedValue(value$iv2);
    L251:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv2, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -1243021041, "CC(remember):BasicTextField.kt#9igjgp");
        if (($dirty & 14) != 4) goto L254;
        boolean invalid$iv2 = true;
    L255:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L261;
        TextFieldValue textFieldValue2 = textFieldValue;
        if (it$iv != Composer.Companion.getEmpty()) goto L263;
    L262:
        Object value$iv3 = SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
        $composer2.updateRememberedValue(value$iv3);
        it$iv = value$iv3;
    L263:
        final MutableState lastTextValue$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ImeOptions r112 = keyboardOptions3.toImeOptions$foundation_release(singleLine3);
        boolean r14 = !singleLine3;
        if (singleLine3 == false) goto L266;
        int r113 = 1;
    L267:
        if (singleLine3 == false) goto L269;
        int r13 = 1;
    L270:
        ComposerKt.sourceInformationMarkerStart($composer2, -1243016933, "CC(remember):BasicTextField.kt#9igjgp");
        boolean r15 = $composer2.changed(lastTextValue$delegate);
        KeyboardOptions keyboardOptions4 = keyboardOptions3;
        if (($dirty & 112) != 32) goto L273;
        boolean r7 = true;
    L274:
        boolean invalid$iv3 = r7 | r15;
        Object value$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L280;
        boolean singleLine4 = singleLine3;
        if (value$iv4 != Composer.Companion.getEmpty()) goto L282;
    L281:
        value$iv4 = (Function1) new BasicTextFieldKt$BasicTextField$8$1(r37, textFieldValueState$delegate, lastTextValue$delegate);
        $composer2.updateRememberedValue(value$iv4);
    L282:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int r24 = ((((($dirty & 896) | (($dirty >> 6) & 7168)) | (($dirty1 << 9) & 57344)) | (($dirty1 << 9) & 458752)) | (($dirty1 << 9) & 3670016)) | (29360128 & ($dirty1 << 9));
        int r25 = (((($dirty >> 15) & 896) | ($dirty & 7168)) | (57344 & $dirty)) | ($dirty1 & 458752);
        TextStyle textStyle5 = textStyle4;
        Composer $composer3 = $composer2;
        CoreTextFieldKt.CoreTextField(textFieldValue2, (Function1) value$iv4, modifier4, textStyle5, visualTransformation3, r12, interactionSource3, cursorBrush3, r14, r13, r113, r112, keyboardActions3, enabled3, readOnly3, r21, null, $composer3, r24, r25, 65536);
        if (ComposerKt.isTraceInProgress() == false) goto L285;
        ComposerKt.traceEventEnd();
    L285:
        final Modifier modifier5 = modifier4;
        final TextStyle textStyle6 = textStyle5;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Brush cursorBrush4 = cursorBrush3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final boolean enabled4 = enabled3;
        final boolean readOnly4 = readOnly3;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r114 = r21;
        final boolean singleLine5 = singleLine4;
        final KeyboardOptions keyboardOptions5 = keyboardOptions4;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final Function1<? super TextLayoutResult, Unit> r115 = r12;
        final int maxLines4 = maxLines3;
        final int minLines4 = minLines3;
    L287:
        ScopeUpdateScope r27 = $composer3.endRestartGroup();
        if (r27 == null) goto L291;
        r27.updateScope(new AnonymousClass9(value, r37, modifier5, enabled4, readOnly4, textStyle6, keyboardOptions5, keyboardActions4, singleLine5, maxLines4, minLines4, visualTransformation4, r115, interactionSource4, cursorBrush4, r114, $changed, $changed1, r55));
        return;
    L291:
        return;
    L280:
        singleLine4 = singleLine3;
        goto L281
    L273:
        r7 = false;
        goto L274
    L269:
        r13 = maxLines3;
        goto L270
    L266:
        r113 = minLines3;
        goto L267
    L261:
        textFieldValue2 = textFieldValue;
        goto L262
    L254:
        invalid$iv2 = false;
        goto L255
    L249:
        textStyle4 = textStyle3;
        goto L250
    L235:
        keyboardActions3 = keyboardActions2;
        maxLines3 = maxLines2;
        minLines3 = minLines2;
        textStyle3 = textStyle2;
        modifier3 = modifier2;
        visualTransformation3 = visualTransformation2;
        r12 = r111;
        enabled3 = enabled2;
        keyboardOptions3 = keyboardOptions2;
        readOnly3 = readOnly2;
        interactionSource3 = interactionSource2;
        r21 = r51;
        cursorBrush3 = cursorBrush2;
        singleLine3 = singleLine2;
        goto L236
    L232:
        cursorBrush2 = cursorBrush;
        goto L233
    L229:
        interactionSource2 = interactionSource;
        goto L230
    L226:
        r111 = r48;
        goto L227
    L223:
        visualTransformation2 = visualTransformation;
        goto L224
    L220:
        minLines2 = minLines;
        goto L221
    L215:
        maxLines2 = Integer.MAX_VALUE;
        goto L216
    L217:
        maxLines2 = maxLines;
        goto L218
    L210:
        singleLine2 = singleLine;
        goto L212
    L207:
        keyboardActions2 = r10;
        goto L208
    L198:
        enabled2 = r11;
        goto L199
    L188:
        if ($composer2.getDefaultsInvalid() == true) goto L194;
        $composer2.skipToGroupEnd();
        if ((r55 & 512) == 0) goto L193;
        $dirty = $dirty & (-1879048193);
    L193:
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        minLines3 = minLines;
        r21 = r51;
        keyboardActions3 = r10;
        enabled3 = r11;
        keyboardOptions3 = keyboardOptions2;
        textStyle3 = textStyle2;
        modifier3 = modifier2;
        visualTransformation3 = visualTransformation;
        r12 = r48;
        interactionSource3 = interactionSource;
        readOnly3 = readOnly2;
        cursorBrush3 = cursorBrush;
        goto L236
    L286:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        singleLine5 = singleLine;
        r114 = r51;
        keyboardActions4 = r10;
        enabled4 = r11;
        keyboardOptions5 = keyboardOptions2;
        readOnly4 = readOnly2;
        textStyle6 = textStyle2;
        modifier5 = modifier2;
        maxLines4 = maxLines;
        minLines4 = minLines;
        visualTransformation4 = visualTransformation;
        r115 = r48;
        interactionSource4 = interactionSource;
        cursorBrush4 = cursorBrush;
        goto L287
    L179:
        if ((74899 & $dirty1) != 74898) goto L182;
        r6 = false;
        goto L184
    L169:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L177;
        if ($composer2.changedInstance(r51) == false) goto L173;
        int r28 = 131072;
    L174:
        $dirty1 = $dirty1 | r28;
        goto L177
    L173:
        r28 = 65536;
        goto L174
    L157:
        r18 = r5;
        if (($changed1 & 24576) != 0) goto L165;
        if ($composer2.changed(cursorBrush) == true) goto L163;
        r20 = 8192;
    L163:
        $dirty1 = $dirty1 | r20;
        goto L165
    L146:
        r22 = r4;
        if (($changed1 & 3072) != 0) goto L154;
        if ($composer2.changed(interactionSource) == true) goto L152;
        r17 = 1024;
    L152:
        $dirty1 = $dirty1 | r17;
        goto L154
    L135:
        r33 = r3;
        if (($changed1 & 384) != 0) goto L143;
        if ($composer2.changedInstance(r48) == false) goto L140;
        int r29 = 256;
    L141:
        $dirty1 = $dirty1 | r29;
        goto L143
    L140:
        r29 = 128;
        goto L141
    L125:
        if (($changed1 & 48) != 0) goto L132;
        if ($composer2.changed(visualTransformation) == false) goto L129;
        int r34 = 32;
    L130:
        $dirty1 = $dirty1 | r34;
        goto L132
    L129:
        r34 = 16;
        goto L130
    L114:
        if (($changed1 & 6) != 0) goto L121;
        if ($composer2.changed(minLines) == false) goto L118;
        int r32 = 4;
    L119:
        $dirty1 = $dirty1 | r32;
        goto L121
    L118:
        r32 = 2;
        goto L119
    L92:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(singleLine) == false) goto L96;
        int r35 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r35;
        goto L100
    L96:
        r35 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L87;
        r10 = keyboardActions;
        if ($composer2.changed(r10) == false) goto L85;
        int r30 = 8388608;
    L86:
        $dirty = $dirty | r30;
        goto L88
    L85:
        r30 = 4194304;
        goto L86
    L87:
        r10 = keyboardActions;
        goto L88
    L70:
        if (($changed & 1572864) != 0) goto L76;
        keyboardOptions2 = keyboardOptions;
        if ($composer2.changed(keyboardOptions2) == false) goto L74;
        int r210 = 1048576;
    L75:
        $dirty = $dirty | r210;
        goto L77
    L74:
        r210 = 524288;
        goto L75
    L76:
        keyboardOptions2 = keyboardOptions;
        goto L77
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L63;
        int r211 = 131072;
    L64:
        $dirty = $dirty | r211;
        goto L66
    L63:
        r211 = 65536;
        goto L64
    L65:
        textStyle2 = textStyle;
        goto L66
    L48:
        if (($changed & 24576) != 0) goto L54;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L52;
        int r212 = 16384;
    L53:
        $dirty = $dirty | r212;
        goto L55
    L52:
        r212 = 8192;
        goto L53
    L54:
        readOnly2 = readOnly;
        goto L55
    L37:
        if (($changed & 3072) != 0) goto L43;
        r11 = enabled;
        if ($composer2.changed(r11) == false) goto L41;
        int r116 = 2048;
    L42:
        $dirty = $dirty | r116;
        goto L44
    L41:
        r116 = 1024;
        goto L42
    L43:
        r11 = enabled;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L30;
        int r117 = 256;
    L31:
        $dirty = $dirty | r117;
        goto L33
    L30:
        r117 = 128;
        goto L31
    L32:
        modifier2 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r37) == false) goto L20;
        int r36 = 32;
    L21:
        $dirty = $dirty | r36;
        goto L22
    L20:
        r36 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(value) == false) goto L10;
        int r38 = 4;
    L11:
        $dirty = $dirty | r38;
        goto L13
    L10:
        r38 = 2;
        goto L11
    }

    private static final TextFieldValue BasicTextField$lambda$24(MutableState<TextFieldValue> r4) {
        MutableState<TextFieldValue> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void BasicTextField$lambda$25(MutableState<TextFieldValue> r4, TextFieldValue value) {
        r4.setValue(value);
    }

    private static final String BasicTextField$lambda$28(MutableState<String> r4) {
        MutableState<String> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void BasicTextField$lambda$29(MutableState<String> r4, String value) {
        r4.setValue(value);
    }

    public static final void BasicTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> r37, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> r48, MutableInteractionSource interactionSource, Brush cursorBrush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed, final int $changed1, final int r55) {
        Composer $composer2 = $composer.startRestartGroup(1804514146);
        ComposerKt.sourceInformation($composer2, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)869@45734L90,867@45672L740:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r55 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r55 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r9 = r55 & 4;
        if (r9 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r10 = modifier;
    L33:
        int r16 = r55 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L37;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L44:
        int r20 = r55 & 16;
        int r21 = 16384;
        if (r20 == 0) goto L48;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L55:
        int r24 = r55 & 32;
        if (r24 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle textStyle2 = textStyle;
    L66:
        int r27 = r55 & 64;
        if (r27 == 0) goto L70;
        $dirty = $dirty | 1572864;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
    L77:
        int r11 = r55 & 128;
        if (r11 == 0) goto L81;
        $dirty = $dirty | 12582912;
        KeyboardActions r5 = keyboardActions;
    L88:
        int r2 = r55 & 256;
        if (r2 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L100:
        if (($changed & 805306368) != 0) goto L110;
        if ((r55 & 512) != 0) goto L107;
        if ($composer2.changed(maxLines) == false) goto L107;
        int r32 = 536870912;
    L108:
        $dirty = $dirty | r32;
    L107:
        r32 = 268435456;
    L110:
        int r3 = r55 & 1024;
        if (r3 == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L121:
        int r4 = r55 & 2048;
        if (r4 == 0) goto L125;
        $dirty1 = $dirty1 | 48;
    L132:
        int r6 = r55 & 4096;
        if (r6 == 0) goto L135;
        $dirty1 = $dirty1 | 384;
        int r19 = r6;
    L143:
        int r7 = r55 & 8192;
        if (r7 == 0) goto L146;
        $dirty1 = $dirty1 | 3072;
        int r23 = r7;
    L154:
        int r8 = r55 & 16384;
        if (r8 == 0) goto L157;
        $dirty1 = $dirty1 | 24576;
        int r18 = r8;
    L165:
        int r110 = r55 & 32768;
        if (r110 == 0) goto L169;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L176:
        boolean r22 = false;
        if (($dirty & 306783379) == 306783378) goto L179;
    L182:
        boolean r12 = true;
    L184:
        if ($composer2.shouldExecute(r12, $dirty & 1) == false) goto L266;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "");
        if (($changed & 1) != 0) goto L188;
    L194:
        if (r9 == 0) goto L196;
        Modifier.Companion modifier2 = Modifier.Companion;
    L197:
        if (r16 == 0) goto L199;
        enabled2 = true;
    L199:
        if (r20 == 0) goto L201;
        readOnly2 = false;
    L201:
        if (r24 == 0) goto L203;
        textStyle2 = TextStyle.Companion.getDefault();
    L203:
        if (r27 == 0) goto L205;
        keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L205:
        if (r11 == 0) goto L207;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L208:
        if (r2 == 0) goto L210;
        boolean singleLine2 = false;
    L212:
        if ((r55 & 512) == 0) goto L217;
        if (singleLine2 == false) goto L215;
        int maxLines2 = 1;
    L216:
        $dirty = $dirty & (-1879048193);
    L218:
        if (r3 == 0) goto L220;
        int minLines2 = 1;
    L221:
        if (r4 == 0) goto L223;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L224:
        if (r19 == 0) goto L226;
        AnonymousClass10 r111 = AnonymousClass10.INSTANCE;
    L227:
        if (r23 == 0) goto L229;
        MutableInteractionSource interactionSource2 = null;
    L230:
        if (r18 == 0) goto L232;
        SolidColor cursorBrush2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    L233:
        if (r110 == 0) goto L235;
        TextStyle r13 = textStyle2;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r15 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1042getLambda2$foundation_release();
        TextStyle textStyle3 = r13;
        boolean singleLine3 = singleLine2;
        int maxLines3 = maxLines2;
        int minLines3 = minLines2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        int maxLines4 = $dirty;
        boolean enabled3 = enabled2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        Brush cursorBrush3 = cursorBrush2;
        Modifier r14 = modifier2;
    L236:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L240;
        ComposerKt.traceEventStart(1804514146, maxLines4, $dirty1, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:866)");
    L240:
        VisualTransformation visualTransformation3 = visualTransformation2;
        ImeOptions r112 = keyboardOptions3.toImeOptions$foundation_release(singleLine3);
        int $dirty2 = $dirty1;
        boolean r25 = !singleLine3;
        if (singleLine3 == false) goto L243;
        int $dirty3 = 1;
    L244:
        if (singleLine3 == false) goto L246;
        int $dirty4 = 1;
    L247:
        TextStyle textStyle4 = textStyle3;
        ComposerKt.sourceInformationMarkerStart($composer2, -1242765920, "CC(remember):BasicTextField.kt#9igjgp");
        if ((maxLines4 & 14) != 4) goto L250;
        boolean r26 = true;
    L251:
        boolean r41 = r26;
        if ((maxLines4 & 112) != 32) goto L254;
        r22 = true;
    L254:
        boolean invalid$iv = r41 | r22;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L260;
        KeyboardOptions keyboardOptions4 = keyboardOptions3;
        if (value$iv != Composer.Companion.getEmpty()) goto L262;
    L261:
        value$iv = (Function1) new BasicTextFieldKt$BasicTextField$11$1(value, r37);
        $composer2.updateRememberedValue(value$iv);
    L262:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean singleLine4 = singleLine3;
        Function1<? super TextLayoutResult, Unit> r28 = r111;
        Modifier modifier3 = r14;
        MutableInteractionSource interactionSource3 = interactionSource2;
        CoreTextFieldKt.CoreTextField(value, (Function1) value$iv, modifier3, textStyle4, visualTransformation3, r28, interactionSource3, cursorBrush3, r25, $dirty4, $dirty3, r112, keyboardActions3, enabled3, readOnly2, r15, null, $composer2, ((((((maxLines4 & 14) | (maxLines4 & 896)) | ((maxLines4 >> 6) & 7168)) | (($dirty2 << 9) & 57344)) | (($dirty2 << 9) & 458752)) | (($dirty2 << 9) & 3670016)) | (($dirty2 << 9) & 29360128), (((maxLines4 & 7168) | ((maxLines4 >> 15) & 896)) | (57344 & maxLines4)) | ($dirty2 & 458752), 65536);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L265;
        ComposerKt.traceEventEnd();
    L265:
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> r113 = r15;
        final int maxLines5 = maxLines3;
        final int minLines4 = minLines3;
        final boolean singleLine5 = singleLine4;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final Brush cursorBrush4 = cursorBrush3;
        final boolean enabled4 = enabled3;
        final KeyboardOptions keyboardOptions5 = keyboardOptions4;
        final Function1<? super TextLayoutResult, Unit> r114 = r28;
        final boolean readOnly3 = readOnly2;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final TextStyle textStyle5 = textStyle4;
        final Modifier modifier4 = modifier3;
    L267:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L271;
        r0.updateScope(new AnonymousClass12(value, r37, modifier4, enabled4, readOnly3, textStyle5, keyboardOptions5, keyboardActions4, singleLine5, maxLines5, minLines4, visualTransformation4, r114, interactionSource4, cursorBrush4, r113, $changed, $changed1, r55));
        return;
    L271:
        return;
    L260:
        keyboardOptions4 = keyboardOptions3;
        goto L261
    L250:
        r26 = false;
        goto L251
    L246:
        $dirty4 = maxLines3;
        goto L247
    L243:
        $dirty3 = minLines3;
        goto L244
    L235:
        singleLine3 = singleLine2;
        maxLines3 = maxLines2;
        minLines3 = minLines2;
        keyboardOptions3 = keyboardOptions2;
        textStyle3 = textStyle2;
        r15 = r51;
        maxLines4 = $dirty;
        enabled3 = enabled2;
        keyboardActions3 = keyboardActions2;
        cursorBrush3 = cursorBrush2;
        r14 = modifier2;
        goto L236
    L232:
        cursorBrush2 = cursorBrush;
        goto L233
    L229:
        interactionSource2 = interactionSource;
        goto L230
    L226:
        r111 = r48;
        goto L227
    L223:
        visualTransformation2 = visualTransformation;
        goto L224
    L220:
        minLines2 = minLines;
        goto L221
    L215:
        maxLines2 = Integer.MAX_VALUE;
        goto L216
    L217:
        maxLines2 = maxLines;
        goto L218
    L210:
        singleLine2 = singleLine;
        goto L212
    L207:
        keyboardActions2 = r5;
        goto L208
    L196:
        modifier2 = r10;
        goto L197
    L188:
        if ($composer2.getDefaultsInvalid() == true) goto L194;
        $composer2.skipToGroupEnd();
        if ((r55 & 512) == 0) goto L193;
        $dirty = $dirty & (-1879048193);
    L193:
        maxLines3 = maxLines;
        minLines3 = minLines;
        visualTransformation2 = visualTransformation;
        r111 = r48;
        interactionSource2 = interactionSource;
        maxLines4 = $dirty;
        r14 = r10;
        keyboardOptions3 = keyboardOptions2;
        textStyle3 = textStyle2;
        cursorBrush3 = cursorBrush;
        r15 = r51;
        enabled3 = enabled2;
        keyboardActions3 = r5;
        singleLine3 = singleLine;
        goto L236
    L266:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        singleLine5 = singleLine;
        minLines4 = minLines;
        r113 = r51;
        keyboardActions4 = r5;
        modifier4 = r10;
        enabled4 = enabled2;
        keyboardOptions5 = keyboardOptions2;
        readOnly3 = readOnly2;
        textStyle5 = textStyle2;
        maxLines5 = maxLines;
        visualTransformation4 = visualTransformation;
        r114 = r48;
        interactionSource4 = interactionSource;
        cursorBrush4 = cursorBrush;
        goto L267
    L179:
        if ((74899 & $dirty1) != 74898) goto L182;
        r12 = false;
        goto L184
    L169:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L176;
        if ($composer2.changedInstance(r51) == false) goto L173;
        int r29 = 131072;
    L174:
        $dirty1 = $dirty1 | r29;
        goto L176
    L173:
        r29 = 65536;
        goto L174
    L157:
        r18 = r8;
        if (($changed1 & 24576) != 0) goto L165;
        if ($composer2.changed(cursorBrush) == true) goto L163;
        r21 = 8192;
    L163:
        $dirty1 = $dirty1 | r21;
        goto L165
    L146:
        r23 = r7;
        if (($changed1 & 3072) != 0) goto L154;
        if ($composer2.changed(interactionSource) == true) goto L152;
        r17 = 1024;
    L152:
        $dirty1 = $dirty1 | r17;
        goto L154
    L135:
        r19 = r6;
        if (($changed1 & 384) != 0) goto L143;
        if ($composer2.changedInstance(r48) == false) goto L140;
        int r210 = 256;
    L141:
        $dirty1 = $dirty1 | r210;
        goto L143
    L140:
        r210 = 128;
        goto L141
    L125:
        if (($changed1 & 48) != 0) goto L132;
        if ($composer2.changed(visualTransformation) == false) goto L129;
        int r115 = 32;
    L130:
        $dirty1 = $dirty1 | r115;
        goto L132
    L129:
        r115 = 16;
        goto L130
    L114:
        if (($changed1 & 6) != 0) goto L121;
        if ($composer2.changed(minLines) == false) goto L118;
        int r33 = 4;
    L119:
        $dirty1 = $dirty1 | r33;
        goto L121
    L118:
        r33 = 2;
        goto L119
    L92:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(singleLine) == false) goto L96;
        int r34 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r34;
        goto L100
    L96:
        r34 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L87;
        r5 = keyboardActions;
        if ($composer2.changed(r5) == false) goto L85;
        int r31 = 8388608;
    L86:
        $dirty = $dirty | r31;
        goto L88
    L85:
        r31 = 4194304;
        goto L86
    L87:
        r5 = keyboardActions;
        goto L88
    L70:
        if (($changed & 1572864) != 0) goto L76;
        keyboardOptions2 = keyboardOptions;
        if ($composer2.changed(keyboardOptions2) == false) goto L74;
        int r211 = 1048576;
    L75:
        $dirty = $dirty | r211;
        goto L77
    L74:
        r211 = 524288;
        goto L75
    L76:
        keyboardOptions2 = keyboardOptions;
        goto L77
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L63;
        int r212 = 131072;
    L64:
        $dirty = $dirty | r212;
        goto L66
    L63:
        r212 = 65536;
        goto L64
    L65:
        textStyle2 = textStyle;
        goto L66
    L48:
        if (($changed & 24576) != 0) goto L54;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L52;
        int r213 = 16384;
    L53:
        $dirty = $dirty | r213;
        goto L55
    L52:
        r213 = 8192;
        goto L53
    L54:
        readOnly2 = readOnly;
        goto L55
    L37:
        if (($changed & 3072) != 0) goto L43;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L41;
        int r214 = 2048;
    L42:
        $dirty = $dirty | r214;
        goto L44
    L41:
        r214 = 1024;
        goto L42
    L43:
        enabled2 = enabled;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        r10 = modifier;
        if ($composer2.changed(r10) == false) goto L30;
        int r116 = 256;
    L31:
        $dirty = $dirty | r116;
        goto L33
    L30:
        r116 = 128;
        goto L31
    L32:
        r10 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r37) == false) goto L20;
        int r30 = 32;
    L21:
        $dirty = $dirty | r30;
        goto L22
    L20:
        r30 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(value) == false) goto L10;
        int r35 = 4;
    L11:
        $dirty = $dirty | r35;
        goto L13
    L10:
        r35 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final /* synthetic */ void BasicTextField(final String value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, VisualTransformation visualTransformation, Function1 onTextLayout, MutableInteractionSource interactionSource, Brush cursorBrush, Function3 decorationBox, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(-454732590);
        ComposerKt.sourceInformation($composer2, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)906@47102L39,911@47342L579:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r54 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r13 = r54 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r8 = modifier;
    L35:
        int r16 = r54 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r9 = enabled;
    L46:
        int r20 = r54 & 16;
        int r21 = 16384;
        if (r20 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r11 = readOnly;
    L57:
        int r24 = r54 & 32;
        if (r24 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle r12 = textStyle;
    L68:
        int r26 = r54 & 64;
        if (r26 == 0) goto L72;
        $dirty = $dirty | 1572864;
        KeyboardOptions r14 = keyboardOptions;
    L79:
        int r15 = r54 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
        KeyboardActions r3 = keyboardActions;
    L90:
        int r0 = r54 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r54 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r54 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r4 = r54 & 2048;
        if (r4 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r5 = r54 & 4096;
        if (r5 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r23 = r5;
    L145:
        int r6 = r54 & 8192;
        if (r6 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r25 = r6;
    L156:
        int r7 = r54 & 16384;
        if (r7 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r18 = r7;
    L168:
        if (($dirty & 306783379) == 306783378) goto L170;
    L173:
        boolean r10 = true;
    L175:
        if ($composer2.shouldExecute(r10, $dirty & 1) == false) goto L226;
        if (r13 == 0) goto L178;
        Modifier.Companion modifier2 = Modifier.Companion;
    L179:
        if (r16 == 0) goto L181;
        boolean enabled2 = true;
    L182:
        if (r20 == 0) goto L184;
        boolean readOnly2 = false;
    L185:
        if (r24 == 0) goto L187;
        TextStyle textStyle2 = TextStyle.Companion.getDefault();
    L188:
        if (r26 == 0) goto L190;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L191:
        if (r15 == 0) goto L193;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L194:
        if (r0 == 0) goto L196;
        boolean singleLine2 = false;
    L197:
        if (r1 == 0) goto L199;
        int maxLines2 = Integer.MAX_VALUE;
    L200:
        if (r2 == 0) goto L202;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L203:
        if (r4 == 0) goto L205;
        Function1 onTextLayout2 = AnonymousClass13.INSTANCE;
    L206:
        if (r23 == 0) goto L212;
        ComposerKt.sourceInformationMarkerStart($composer2, -1242722195, "CC(remember):BasicTextField.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L211;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L211:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int r35 = r18;
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) it$iv;
        int r19 = r35;
    L213:
        if (r25 == 0) goto L215;
        Brush cursorBrush2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    L216:
        if (r19 == 0) goto L218;
        Function3 decorationBox2 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1043getLambda3$foundation_release();
    L220:
        if (ComposerKt.isTraceInProgress() == false) goto L222;
        ComposerKt.traceEventStart(-454732590, $dirty, $dirty1, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:910)");
    L222:
        int r22 = (((((($dirty1 << 3) & 112) | 6) | (($dirty1 << 3) & 896)) | (($dirty1 << 3) & 7168)) | (($dirty1 << 3) & 57344)) | (458752 & ($dirty1 << 3));
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        BasicTextField(value, onValueChange, modifier3, enabled2, readOnly2, textStyle2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, 1, visualTransformation2, onTextLayout2, interactionSource2, cursorBrush2, decorationBox2, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), r22, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L225;
        ComposerKt.traceEventEnd();
    L225:
        final Modifier modifier4 = modifier3;
        final boolean enabled3 = enabled2;
        final boolean readOnly3 = readOnly2;
        final TextStyle textStyle3 = textStyle2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final boolean singleLine3 = singleLine2;
        final int maxLines3 = maxLines2;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final Function1 onTextLayout3 = onTextLayout2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Brush cursorBrush3 = cursorBrush2;
        final Function3 decorationBox3 = decorationBox2;
    L227:
        ScopeUpdateScope r27 = $composer3.endRestartGroup();
        if (r27 == null) goto L231;
        r27.updateScope(new AnonymousClass15(value, onValueChange, modifier4, enabled3, readOnly3, textStyle3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, visualTransformation3, onTextLayout3, interactionSource3, cursorBrush3, decorationBox3, $changed, $changed1, r54));
        return;
    L231:
        return;
    L218:
        decorationBox2 = decorationBox;
        goto L220
    L215:
        cursorBrush2 = cursorBrush;
        goto L216
    L212:
        r19 = r18;
        interactionSource2 = interactionSource;
        goto L213
    L205:
        onTextLayout2 = onTextLayout;
        goto L206
    L202:
        visualTransformation2 = visualTransformation;
        goto L203
    L199:
        maxLines2 = maxLines;
        goto L200
    L196:
        singleLine2 = singleLine;
        goto L197
    L193:
        keyboardActions2 = r3;
        goto L194
    L190:
        keyboardOptions2 = r14;
        goto L191
    L187:
        textStyle2 = r12;
        goto L188
    L184:
        readOnly2 = r11;
        goto L185
    L181:
        enabled2 = r9;
        goto L182
    L178:
        modifier2 = r8;
        goto L179
    L226:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        Modifier r28 = r8;
        keyboardActions3 = r3;
        modifier4 = r28;
        maxLines3 = maxLines;
        interactionSource3 = interactionSource;
        decorationBox3 = decorationBox;
        enabled3 = r9;
        readOnly3 = r11;
        textStyle3 = r12;
        keyboardOptions3 = r14;
        singleLine3 = singleLine;
        visualTransformation3 = visualTransformation;
        onTextLayout3 = onTextLayout;
        cursorBrush3 = cursorBrush;
        goto L227
    L170:
        if (($dirty1 & 9363) != 9362) goto L173;
        r10 = false;
        goto L175
    L159:
        r18 = r7;
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changedInstance(decorationBox) == true) goto L165;
        r21 = 8192;
    L165:
        $dirty1 = $dirty1 | r21;
        goto L168
    L148:
        r25 = r6;
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(cursorBrush) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L156
    L137:
        r23 = r5;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(interactionSource) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty1 = $dirty1 | r29;
        goto L145
    L142:
        r29 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(onTextLayout) == false) goto L131;
        int r210 = 32;
    L132:
        $dirty1 = $dirty1 | r210;
        goto L134
    L131:
        r210 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(visualTransformation) == false) goto L120;
        int r110 = 4;
    L121:
        $dirty1 = $dirty1 | r110;
        goto L123
    L120:
        r110 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(maxLines) == false) goto L109;
        int r32 = 536870912;
    L110:
        $dirty = $dirty | r32;
        goto L112
    L109:
        r32 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(singleLine) == false) goto L98;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r31;
        goto L101
    L98:
        r31 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r3 = keyboardActions;
        if ($composer2.changed(r3) == false) goto L87;
        int r30 = 8388608;
    L88:
        $dirty = $dirty | r30;
        goto L90
    L87:
        r30 = 4194304;
        goto L88
    L89:
        r3 = keyboardActions;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = keyboardOptions;
        if ($composer2.changed(r14) == false) goto L76;
        int r211 = 1048576;
    L77:
        $dirty = $dirty | r211;
        goto L79
    L76:
        r211 = 524288;
        goto L77
    L78:
        r14 = keyboardOptions;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r12 = textStyle;
        if ($composer2.changed(r12) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
        goto L68
    L65:
        r212 = 65536;
        goto L66
    L67:
        r12 = textStyle;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = readOnly;
        if ($composer2.changed(r11) == false) goto L54;
        int r213 = 16384;
    L55:
        $dirty = $dirty | r213;
        goto L57
    L54:
        r213 = 8192;
        goto L55
    L56:
        r11 = readOnly;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L43;
        int r214 = 2048;
    L44:
        $dirty = $dirty | r214;
        goto L46
    L43:
        r214 = 1024;
        goto L44
    L45:
        r9 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r8 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(onValueChange) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L24
    L21:
        r112 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r113 = 4;
    L11:
        $dirty = $dirty | r113;
        goto L14
    L10:
        r113 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final /* synthetic */ void BasicTextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, VisualTransformation visualTransformation, Function1 onTextLayout, MutableInteractionSource interactionSource, Brush cursorBrush, Function3 decorationBox, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(-560482651);
        ComposerKt.sourceInformation($composer2, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)946@48627L39,951@48867L579:BasicTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r54 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r13 = r54 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r8 = modifier;
    L35:
        int r16 = r54 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r9 = enabled;
    L46:
        int r20 = r54 & 16;
        int r21 = 16384;
        if (r20 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r11 = readOnly;
    L57:
        int r24 = r54 & 32;
        if (r24 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle r12 = textStyle;
    L68:
        int r26 = r54 & 64;
        if (r26 == 0) goto L72;
        $dirty = $dirty | 1572864;
        KeyboardOptions r14 = keyboardOptions;
    L79:
        int r15 = r54 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
        KeyboardActions r3 = keyboardActions;
    L90:
        int r0 = r54 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r54 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r54 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r4 = r54 & 2048;
        if (r4 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r5 = r54 & 4096;
        if (r5 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r23 = r5;
    L145:
        int r6 = r54 & 8192;
        if (r6 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r25 = r6;
    L156:
        int r7 = r54 & 16384;
        if (r7 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r18 = r7;
    L168:
        if (($dirty & 306783379) == 306783378) goto L170;
    L173:
        boolean r10 = true;
    L175:
        if ($composer2.shouldExecute(r10, $dirty & 1) == false) goto L226;
        if (r13 == 0) goto L178;
        Modifier.Companion modifier2 = Modifier.Companion;
    L179:
        if (r16 == 0) goto L181;
        boolean enabled2 = true;
    L182:
        if (r20 == 0) goto L184;
        boolean readOnly2 = false;
    L185:
        if (r24 == 0) goto L187;
        TextStyle textStyle2 = TextStyle.Companion.getDefault();
    L188:
        if (r26 == 0) goto L190;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L191:
        if (r15 == 0) goto L193;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L194:
        if (r0 == 0) goto L196;
        boolean singleLine2 = false;
    L197:
        if (r1 == 0) goto L199;
        int maxLines2 = Integer.MAX_VALUE;
    L200:
        if (r2 == 0) goto L202;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L203:
        if (r4 == 0) goto L205;
        Function1 onTextLayout2 = AnonymousClass16.INSTANCE;
    L206:
        if (r23 == 0) goto L212;
        ComposerKt.sourceInformationMarkerStart($composer2, -1242673395, "CC(remember):BasicTextField.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L211;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L211:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int r35 = r18;
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) it$iv;
        int r19 = r35;
    L213:
        if (r25 == 0) goto L215;
        Brush cursorBrush2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
    L216:
        if (r19 == 0) goto L218;
        Function3 decorationBox2 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1044getLambda4$foundation_release();
    L220:
        if (ComposerKt.isTraceInProgress() == false) goto L222;
        ComposerKt.traceEventStart(-560482651, $dirty, $dirty1, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:950)");
    L222:
        int r22 = (((((($dirty1 << 3) & 112) | 6) | (($dirty1 << 3) & 896)) | (($dirty1 << 3) & 7168)) | (($dirty1 << 3) & 57344)) | (458752 & ($dirty1 << 3));
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        BasicTextField(value, onValueChange, modifier3, enabled2, readOnly2, textStyle2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, 1, visualTransformation2, onTextLayout2, interactionSource2, cursorBrush2, decorationBox2, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), r22, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L225;
        ComposerKt.traceEventEnd();
    L225:
        final Modifier modifier4 = modifier3;
        final boolean enabled3 = enabled2;
        final boolean readOnly3 = readOnly2;
        final TextStyle textStyle3 = textStyle2;
        final KeyboardOptions keyboardOptions3 = keyboardOptions2;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final boolean singleLine3 = singleLine2;
        final int maxLines3 = maxLines2;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final Function1 onTextLayout3 = onTextLayout2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Brush cursorBrush3 = cursorBrush2;
        final Function3 decorationBox3 = decorationBox2;
    L227:
        ScopeUpdateScope r27 = $composer3.endRestartGroup();
        if (r27 == null) goto L231;
        r27.updateScope(new AnonymousClass18(value, onValueChange, modifier4, enabled3, readOnly3, textStyle3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, visualTransformation3, onTextLayout3, interactionSource3, cursorBrush3, decorationBox3, $changed, $changed1, r54));
        return;
    L231:
        return;
    L218:
        decorationBox2 = decorationBox;
        goto L220
    L215:
        cursorBrush2 = cursorBrush;
        goto L216
    L212:
        r19 = r18;
        interactionSource2 = interactionSource;
        goto L213
    L205:
        onTextLayout2 = onTextLayout;
        goto L206
    L202:
        visualTransformation2 = visualTransformation;
        goto L203
    L199:
        maxLines2 = maxLines;
        goto L200
    L196:
        singleLine2 = singleLine;
        goto L197
    L193:
        keyboardActions2 = r3;
        goto L194
    L190:
        keyboardOptions2 = r14;
        goto L191
    L187:
        textStyle2 = r12;
        goto L188
    L184:
        readOnly2 = r11;
        goto L185
    L181:
        enabled2 = r9;
        goto L182
    L178:
        modifier2 = r8;
        goto L179
    L226:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        Modifier r28 = r8;
        keyboardActions3 = r3;
        modifier4 = r28;
        maxLines3 = maxLines;
        interactionSource3 = interactionSource;
        decorationBox3 = decorationBox;
        enabled3 = r9;
        readOnly3 = r11;
        textStyle3 = r12;
        keyboardOptions3 = r14;
        singleLine3 = singleLine;
        visualTransformation3 = visualTransformation;
        onTextLayout3 = onTextLayout;
        cursorBrush3 = cursorBrush;
        goto L227
    L170:
        if (($dirty1 & 9363) != 9362) goto L173;
        r10 = false;
        goto L175
    L159:
        r18 = r7;
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changedInstance(decorationBox) == true) goto L165;
        r21 = 8192;
    L165:
        $dirty1 = $dirty1 | r21;
        goto L168
    L148:
        r25 = r6;
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(cursorBrush) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L156
    L137:
        r23 = r5;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(interactionSource) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty1 = $dirty1 | r29;
        goto L145
    L142:
        r29 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changedInstance(onTextLayout) == false) goto L131;
        int r210 = 32;
    L132:
        $dirty1 = $dirty1 | r210;
        goto L134
    L131:
        r210 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(visualTransformation) == false) goto L120;
        int r110 = 4;
    L121:
        $dirty1 = $dirty1 | r110;
        goto L123
    L120:
        r110 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(maxLines) == false) goto L109;
        int r32 = 536870912;
    L110:
        $dirty = $dirty | r32;
        goto L112
    L109:
        r32 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(singleLine) == false) goto L98;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r31;
        goto L101
    L98:
        r31 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r3 = keyboardActions;
        if ($composer2.changed(r3) == false) goto L87;
        int r30 = 8388608;
    L88:
        $dirty = $dirty | r30;
        goto L90
    L87:
        r30 = 4194304;
        goto L88
    L89:
        r3 = keyboardActions;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = keyboardOptions;
        if ($composer2.changed(r14) == false) goto L76;
        int r211 = 1048576;
    L77:
        $dirty = $dirty | r211;
        goto L79
    L76:
        r211 = 524288;
        goto L77
    L78:
        r14 = keyboardOptions;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r12 = textStyle;
        if ($composer2.changed(r12) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
        goto L68
    L65:
        r212 = 65536;
        goto L66
    L67:
        r12 = textStyle;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = readOnly;
        if ($composer2.changed(r11) == false) goto L54;
        int r213 = 16384;
    L55:
        $dirty = $dirty | r213;
        goto L57
    L54:
        r213 = 8192;
        goto L55
    L56:
        r11 = readOnly;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L43;
        int r214 = 2048;
    L44:
        $dirty = $dirty | r214;
        goto L46
    L43:
        r214 = 1024;
        goto L44
    L45:
        r9 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r8 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(onValueChange) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L24
    L21:
        r112 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r113 = 4;
    L11:
        $dirty = $dirty | r113;
        goto L14
    L10:
        r113 = 2;
        goto L11
    }
}
