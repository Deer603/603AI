package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0085\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0002\u0010.\u001a\u0087\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010:\u001a\u0093\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010<\u001a\u0087\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010=\u001a\u0093\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010>\u001aÁ\u0001\u0010?\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u000102¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010A\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010B\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u00107\u001a\u00020\u00112\u0006\u0010C\u001a\u00020D2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u000b022\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\u00172\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\u0010J\u001aZ\u0010K\u001a\u0002092\u0006\u0010L\u001a\u0002092\u0006\u0010M\u001a\u0002092\u0006\u0010N\u001a\u0002092\u0006\u0010O\u001a\u0002092\u0006\u0010P\u001a\u0002092\u0006\u0010C\u001a\u00020D2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001aZ\u0010V\u001a\u0002092\u0006\u0010W\u001a\u0002092\u0006\u0010X\u001a\u0002092\u0006\u0010Y\u001a\u0002092\u0006\u0010Z\u001a\u0002092\u0006\u0010[\u001a\u0002092\u0006\u0010C\u001a\u00020D2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0002ø\u0001\u0000¢\u0006\u0004\b\\\u0010U\u001a&\u0010]\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010^\u001a\u00020F2\u0006\u0010H\u001a\u00020IH\u0000ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a|\u0010a\u001a\u00020\u000b*\u00020b2\u0006\u0010c\u001a\u0002092\u0006\u0010d\u001a\u0002092\b\u0010e\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010h\u001a\u00020f2\b\u0010i\u001a\u0004\u0018\u00010f2\b\u0010j\u001a\u0004\u0018\u00010f2\u0006\u0010k\u001a\u00020f2\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u00112\u0006\u0010S\u001a\u00020D2\u0006\u0010l\u001a\u00020m2\u0006\u0010H\u001a\u00020IH\u0002\u001a\u0014\u0010n\u001a\u000209*\u0002092\u0006\u0010o\u001a\u000209H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "OutlinedTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-O3s9Psw", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "substractConstraintSafely", "from", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = 0.0f;
    private static final long OutlinedTextFieldTopPadding = 0;

    /* JADX INFO: renamed from: access$calculateHeight-O3s9Psw, reason: not valid java name */
    public static final /* synthetic */ int m1715access$calculateHeightO3s9Psw(int leadingPlaceableHeight, int trailingPlaceableHeight, int textFieldPlaceableHeight, int labelPlaceableHeight, int placeholderPlaceableHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        return m1717calculateHeightO3s9Psw(leadingPlaceableHeight, trailingPlaceableHeight, textFieldPlaceableHeight, labelPlaceableHeight, placeholderPlaceableHeight, animationProgress, constraints, density, paddingValues);
    }

    /* JADX INFO: renamed from: access$calculateWidth-O3s9Psw, reason: not valid java name */
    public static final /* synthetic */ int m1716access$calculateWidthO3s9Psw(int leadingPlaceableWidth, int trailingPlaceableWidth, int textFieldPlaceableWidth, int labelPlaceableWidth, int placeholderPlaceableWidth, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        return m1718calculateWidthO3s9Psw(leadingPlaceableWidth, trailingPlaceableWidth, textFieldPlaceableWidth, labelPlaceableWidth, placeholderPlaceableWidth, animationProgress, constraints, density, paddingValues);
    }

    public static final /* synthetic */ float access$getOutlinedTextFieldInnerPadding$p() {
        return OutlinedTextFieldInnerPadding;
    }

    public static final /* synthetic */ void access$place(Placeable.PlacementScope $receiver, int height, int width, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable textFieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable borderPlaceable, float animationProgress, boolean singleLine, float density, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        place($receiver, height, width, leadingPlaceable, trailingPlaceable, textFieldPlaceable, labelPlaceable, placeholderPlaceable, borderPlaceable, animationProgress, singleLine, density, layoutDirection, paddingValues);
    }

    public static final /* synthetic */ int access$substractConstraintSafely(int $receiver, int from) {
        return substractConstraintSafely($receiver, from);
    }

    public static final void OutlinedTextField(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r77, Function2<? super Composer, ? super Integer, Unit> r78, Function2<? super Composer, ? super Integer, Unit> r79, Function2<? super Composer, ? super Integer, Unit> r80, boolean isError, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, TextFieldLineLimits lineLimits, ScrollState scrollState, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r94) {
        Composer $composer2 = $composer.startRestartGroup(-1115632458);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(16,9,1,13,17,6,12,7,18,4,2,11,5,10,8,14,15)184@10481L7,202@11200L38,210@11544L20,187@10537L2814:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r94 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r9 = r94 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r94 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L35:
        int r16 = r94 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r8 = readOnly;
    L46:
        int r21 = 8192;
        if (($changed & 24576) == 0) goto L49;
        TextStyle textStyle2 = textStyle;
    L57:
        int r23 = r94 & 32;
        if (r23 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r11 = r77;
    L68:
        int r28 = r94 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r78;
    L79:
        int r15 = r94 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r0 = r94 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r94 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r94 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r3 = r94 & 2048;
        if (r3 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r4 = r94 & 4096;
        if (r4 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r20 = r4;
    L145:
        int r5 = r94 & 8192;
        if (r5 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r27 = r5;
    L157:
        if (($changed1 & 24576) != 0) goto L167;
        if ((r94 & 16384) != 0) goto L164;
        if ($composer2.changed(lineLimits) == false) goto L164;
        r21 = 16384;
    L164:
        $dirty1 = $dirty1 | r21;
    L167:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ((r94 & 32768) != 0) goto L174;
        if ($composer2.changed(scrollState) == false) goto L174;
        int r18 = 131072;
    L175:
        $dirty1 = $dirty1 | r18;
    L174:
        r18 = 65536;
    L178:
        if (($changed1 & 1572864) != 0) goto L189;
        if ((r94 & 65536) != 0) goto L185;
        if ($composer2.changed(shape) == false) goto L185;
        int r19 = 1048576;
    L186:
        $dirty1 = $dirty1 | r19;
    L185:
        r19 = 524288;
    L189:
        if (($changed1 & 12582912) == 0) goto L191;
        int $dirty2 = $dirty1;
    L199:
        int r52 = r94 & 262144;
        if (r52 == 0) goto L203;
        $dirty2 = $dirty2 | 100663296;
    L211:
        if (($dirty & 306783379) == 306783378) goto L213;
    L216:
        boolean r6 = true;
    L218:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L324;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "162@9307L7,173@9870L21,174@9930L22,175@10002L25");
        if (($changed & 1) != 0) goto L222;
    L240:
        if (r9 == 0) goto L242;
        Modifier.Companion modifier3 = Modifier.Companion;
    L243:
        if (r13 == 0) goto L245;
        boolean enabled3 = true;
    L246:
        if (r16 == 0) goto L248;
        boolean readOnly2 = false;
    L250:
        if ((r94 & 16) == 0) goto L252;
        ProvidableCompositionLocal<TextStyle> r7 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle3 = (TextStyle) r12;
        int $dirty3 = $dirty & (-57345);
    L253:
        if (r23 == 0) goto L255;
        Function2<? super Composer, ? super Integer, Unit> r57 = null;
    L256:
        if (r28 == 0) goto L258;
        Function2<? super Composer, ? super Integer, Unit> r58 = null;
    L259:
        if (r15 == 0) goto L261;
        Function2<? super Composer, ? super Integer, Unit> r59 = null;
    L262:
        if (r0 == 0) goto L264;
        Function2<? super Composer, ? super Integer, Unit> r60 = null;
    L265:
        if (r1 == 0) goto L267;
        boolean isError2 = false;
    L268:
        if (r2 == 0) goto L270;
        InputTransformation inputTransformation2 = null;
    L271:
        if (r3 == 0) goto L273;
        OutputTransformation outputTransformation2 = null;
    L274:
        if (r20 == 0) goto L276;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L277:
        if (r27 == 0) goto L279;
        KeyboardActionHandler onKeyboardAction2 = null;
    L281:
        if ((r94 & 16384) == 0) goto L283;
        $dirty2 = $dirty2 & (-57345);
        TextFieldLineLimits lineLimits2 = TextFieldLineLimits.Companion.getDefault();
    L285:
        if ((32768 & r94) == 0) goto L287;
        $dirty2 = $dirty2 & (-458753);
        ScrollState scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L289:
        if ((r94 & 65536) == 0) goto L291;
        Shape shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer2, 6);
        int $dirty4 = $dirty2 & (-3670017);
    L293:
        if ((r94 & 131072) == 0) goto L295;
        int r10 = 1;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        $dirty4 = $dirty4 & (-29360129);
    L296:
        if (r52 == 0) goto L298;
        MutableInteractionSource interactionSource2 = null;
        modifier2 = modifier3;
        enabled2 = enabled3;
        textStyle2 = textStyle3;
        int $dirty5 = $dirty3;
        boolean isError3 = isError2;
        int $dirty6 = $dirty4;
    L299:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L302;
        ComposerKt.traceEventStart(-1115632458, $dirty5, $dirty6, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:177)");
    L302:
        if (interactionSource2 != null) goto L308;
        $composer3.startReplaceGroup(-588072746);
        ComposerKt.sourceInformation($composer3, "179@10171L39");
        ComposerKt.sourceInformationMarkerStart($composer3, 673766572, "CC(remember):OutlinedTextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L307;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L307:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L309:
        $composer3.startReplaceGroup(673771667);
        ComposerKt.sourceInformation($composer3, "*181@10350L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L312;
        int r110 = r10;
    L313:
        if (r110 != 0) goto L316;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty5 >> 6) & 14) | (($dirty6 >> 18) & 112)).getValue().m4376unboximpl();
    L316:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle2.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        ProvidableCompositionLocal<Density> r22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r24 = $composer3.consume(r22);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Density density = (Density) r24;
        if (r57 == null) goto L319;
        Modifier.Companion r25 = PaddingKt.m729paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, AnonymousClass1.INSTANCE), 0.0f, density.mo371toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
    L320:
        final boolean isError4 = isError3;
        final TextFieldColors colors3 = colors2;
        final boolean enabled4 = enabled2;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Function2<? super Composer, ? super Integer, Unit> r81 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r82 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r83 = r59;
        final Function2<? super Composer, ? super Integer, Unit> r84 = r60;
        final OutputTransformation outputTransformation3 = outputTransformation2;
        final TextFieldLineLimits lineLimits3 = lineLimits2;
        final Shape shape3 = shape2;
        Composer $composer4 = $composer3;
        MutableInteractionSource interactionSource5 = interactionSource3;
        boolean readOnly3 = readOnly2;
        InputTransformation inputTransformation3 = inputTransformation2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        KeyboardActionHandler onKeyboardAction3 = onKeyboardAction2;
        TextFieldLineLimits lineLimits4 = lineLimits2;
        BasicTextFieldKt.BasicTextField(state, SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(r25), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM()), enabled4, readOnly3, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, lineLimits4, null, interactionSource5, new SolidColor(colors2.cursorColor(isError3, $composer3, (($dirty5 >> 27) & 14) | (($dirty6 >> 18) & 112)).getValue().m4376unboximpl(), null), outputTransformation2, new AnonymousClass3(outputTransformation3, state, lineLimits3, enabled4, interactionSource4, isError4, r81, r82, r83, r84, shape3, colors3), scrollState2, $composer4, (((((($dirty5 & 14) | ($dirty5 & 896)) | ($dirty5 & 7168)) | (($dirty6 << 12) & 57344)) | (($dirty6 << 12) & 3670016)) | (($dirty6 << 12) & 29360128)) | (234881024 & ($dirty6 << 12)), (($dirty6 << 3) & 896) | (($dirty6 >> 3) & 57344), 512);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L323;
        ComposerKt.traceEventEnd();
    L323:
        final TextFieldColors colors4 = colors2;
        final MutableInteractionSource interactionSource6 = interactionSource2;
        final TextStyle textStyle4 = textStyle2;
        final Modifier modifier4 = modifier2;
        final boolean enabled5 = enabled4;
        final boolean readOnly4 = readOnly2;
        final Function2<? super Composer, ? super Integer, Unit> r26 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r29 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r30 = r59;
        final Function2<? super Composer, ? super Integer, Unit> r31 = r60;
        final boolean isError5 = isError4;
        final InputTransformation inputTransformation4 = inputTransformation2;
        final OutputTransformation outputTransformation4 = outputTransformation2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
        final KeyboardActionHandler onKeyboardAction4 = onKeyboardAction2;
        final TextFieldLineLimits lineLimits5 = lineLimits2;
        final ScrollState scrollState3 = scrollState2;
        final Shape shape4 = shape2;
    L325:
        ScopeUpdateScope r32 = $composer5.endRestartGroup();
        if (r32 == null) goto L329;
        r32.updateScope(new AnonymousClass4(state, modifier4, enabled5, readOnly4, textStyle4, r26, r29, r30, r31, isError5, inputTransformation4, outputTransformation4, keyboardOptions4, onKeyboardAction4, lineLimits5, scrollState3, shape4, colors4, interactionSource6, $changed, $changed1, r94));
        return;
    L329:
        return;
    L319:
        r25 = Modifier.Companion;
        goto L320
    L312:
        r110 = 0;
        goto L313
    L308:
        $composer3.startReplaceGroup(673765921);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L309
    L298:
        interactionSource2 = interactionSource;
        modifier2 = modifier3;
        enabled2 = enabled3;
        textStyle2 = textStyle3;
        $dirty5 = $dirty3;
        isError3 = isError2;
        $dirty6 = $dirty4;
        goto L299
    L295:
        $composer3 = $composer2;
        r10 = 1;
        colors2 = colors;
        goto L296
    L291:
        shape2 = shape;
        $dirty4 = $dirty2;
        goto L293
    L287:
        scrollState2 = scrollState;
        goto L289
    L283:
        lineLimits2 = lineLimits;
        goto L285
    L279:
        onKeyboardAction2 = onKeyboardAction;
        goto L281
    L276:
        keyboardOptions2 = keyboardOptions;
        goto L277
    L273:
        outputTransformation2 = outputTransformation;
        goto L274
    L270:
        inputTransformation2 = inputTransformation;
        goto L271
    L267:
        isError2 = isError;
        goto L268
    L264:
        r60 = r80;
        goto L265
    L261:
        r59 = r79;
        goto L262
    L258:
        r58 = r14;
        goto L259
    L255:
        r57 = r11;
        goto L256
    L252:
        textStyle3 = textStyle2;
        $dirty3 = $dirty;
        goto L253
    L248:
        readOnly2 = r8;
        goto L250
    L245:
        enabled3 = enabled2;
        goto L246
    L242:
        modifier3 = modifier2;
        goto L243
    L222:
        if ($composer2.getDefaultsInvalid() == true) goto L240;
        $composer2.skipToGroupEnd();
        if ((r94 & 16) == 0) goto L228;
        $dirty = $dirty & (-57345);
    L228:
        if ((r94 & 16384) == 0) goto L231;
        $dirty2 = $dirty2 & (-57345);
    L231:
        if ((32768 & r94) == 0) goto L234;
        $dirty2 = $dirty2 & (-458753);
    L234:
        if ((r94 & 65536) == 0) goto L237;
        $dirty2 = $dirty2 & (-3670017);
    L237:
        if ((r94 & 131072) == 0) goto L239;
        r59 = r79;
        r60 = r80;
        inputTransformation2 = inputTransformation;
        outputTransformation2 = outputTransformation;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        lineLimits2 = lineLimits;
        scrollState2 = scrollState;
        shape2 = shape;
        $dirty6 = $dirty2 & (-29360129);
        $composer3 = $composer2;
        r10 = 1;
        readOnly2 = r8;
        r57 = r11;
        r58 = r14;
        isError3 = isError;
        interactionSource2 = interactionSource;
        $dirty5 = $dirty;
        colors2 = colors;
        goto L299
    L239:
        r59 = r79;
        r60 = r80;
        isError3 = isError;
        inputTransformation2 = inputTransformation;
        outputTransformation2 = outputTransformation;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        lineLimits2 = lineLimits;
        scrollState2 = scrollState;
        shape2 = shape;
        $composer3 = $composer2;
        r10 = 1;
        readOnly2 = r8;
        r57 = r11;
        r58 = r14;
        $dirty6 = $dirty2;
        interactionSource2 = interactionSource;
        $dirty5 = $dirty;
        colors2 = colors;
        goto L299
    L324:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r31 = r80;
        keyboardOptions4 = keyboardOptions;
        lineLimits5 = lineLimits;
        scrollState3 = scrollState;
        colors4 = colors;
        interactionSource6 = interactionSource;
        enabled5 = enabled2;
        readOnly4 = r8;
        textStyle4 = textStyle2;
        r26 = r11;
        modifier4 = modifier2;
        r29 = r14;
        r30 = r79;
        isError5 = isError;
        inputTransformation4 = inputTransformation;
        outputTransformation4 = outputTransformation;
        onKeyboardAction4 = onKeyboardAction;
        shape4 = shape;
        goto L325
    L213:
        if (($dirty2 & 38347923) != 38347922) goto L216;
        r6 = false;
        goto L218
    L203:
        if (($changed1 & 100663296) != 0) goto L211;
        if ($composer2.changed(interactionSource) == false) goto L207;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L208:
        $dirty2 = $dirty2 | r111;
        goto L211
    L207:
        r111 = 33554432;
        goto L208
    L191:
        if ((r94 & 131072) != 0) goto L195;
        int $dirty7 = $dirty1;
        if ($composer2.changed(colors) == false) goto L196;
        int r112 = 8388608;
    L197:
        $dirty2 = $dirty7 | r112;
    L196:
        r112 = 4194304;
        goto L197
    L195:
        $dirty7 = $dirty1;
        goto L196
    L148:
        r27 = r5;
        if (($changed1 & 3072) != 0) goto L157;
        if ($composer2.changed(onKeyboardAction) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L157
    L137:
        r20 = r4;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r210 = 256;
    L143:
        $dirty1 = $dirty1 | r210;
        goto L145
    L142:
        r210 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(outputTransformation) == false) goto L131;
        int r211 = 32;
    L132:
        $dirty1 = $dirty1 | r211;
        goto L134
    L131:
        r211 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(inputTransformation) == false) goto L120;
        int r113 = 4;
    L121:
        $dirty1 = $dirty1 | r113;
        goto L123
    L120:
        r113 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(isError) == false) goto L109;
        int r34 = 536870912;
    L110:
        $dirty = $dirty | r34;
        goto L112
    L109:
        r34 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r80) == false) goto L98;
        int r33 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r33;
        goto L101
    L98:
        r33 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r79) == false) goto L87;
        int r35 = 8388608;
    L88:
        $dirty = $dirty | r35;
        goto L90
    L87:
        r35 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r78;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r36 = 1048576;
    L77:
        $dirty = $dirty | r36;
        goto L79
    L76:
        r36 = 524288;
        goto L77
    L78:
        r14 = r78;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r11 = r77;
        if ($composer2.changedInstance(r11) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
        goto L68
    L65:
        r212 = 65536;
        goto L66
    L67:
        r11 = r77;
        goto L68
    L49:
        if ((r94 & 16) != 0) goto L53;
        textStyle2 = textStyle;
        if ($composer2.changed(textStyle2) == false) goto L54;
        int r213 = 16384;
    L55:
        $dirty = $dirty | r213;
    L54:
        r213 = 8192;
        goto L55
    L53:
        textStyle2 = textStyle;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = readOnly;
        if ($composer2.changed(r8) == false) goto L43;
        int r214 = 2048;
    L44:
        $dirty = $dirty | r214;
        goto L46
    L43:
        r214 = 1024;
        goto L44
    L45:
        r8 = readOnly;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r114 = 256;
    L33:
        $dirty = $dirty | r114;
        goto L35
    L32:
        r114 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r115 = 32;
    L22:
        $dirty = $dirty | r115;
        goto L24
    L21:
        r115 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r37 = 4;
    L11:
        $dirty = $dirty | r37;
        goto L13
    L10:
        r37 = 2;
        goto L11
    }

    public static final void OutlinedTextField(final String value, final Function1<? super String, Unit> r105, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r110, Function2<? super Composer, ? super Integer, Unit> r111, Function2<? super Composer, ? super Integer, Unit> r112, Function2<? super Composer, ? super Integer, Unit> r113, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r127) {
        Composer $composer2 = $composer.startRestartGroup(-621914704);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)346@19268L7,364@19987L38,373@20370L20,382@20724L1025,349@19324L2431:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r127 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r127 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r12 = r127 & 4;
        if (r12 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r15 = modifier;
    L35:
        int r16 = r127 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r19 = r127 & 16;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle r10 = textStyle;
    L68:
        int r22 = r127 & 64;
        if (r22 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r11 = r110;
    L79:
        int r13 = r127 & 128;
        if (r13 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r14 = r111;
    L90:
        int r0 = r127 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r127 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r127 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r3 = r127 & 2048;
        if (r3 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r4 = r127 & 4096;
        if (r4 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r21 = r4;
    L145:
        int r5 = r127 & 8192;
        if (r5 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r25 = r5;
    L156:
        int r6 = r127 & 16384;
        if (r6 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r18 = r6;
    L168:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ((r127 & 32768) != 0) goto L175;
        if ($composer2.changed(maxLines) == false) goto L175;
        int r114 = 131072;
    L176:
        $dirty1 = $dirty1 | r114;
    L175:
        r114 = 65536;
    L178:
        int r115 = r127 & 65536;
        if (r115 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L189:
        int r23 = r127 & 131072;
        if (r23 == 0) goto L193;
        $dirty1 = $dirty1 | 12582912;
    L201:
        if (($changed1 & 100663296) != 0) goto L212;
        if ((r127 & 262144) != 0) goto L208;
        if ($composer2.changed(shape) == false) goto L208;
        int r26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty1 = $dirty1 | r26;
    L208:
        r26 = 33554432;
    L212:
        if (($changed1 & 805306368) == 0) goto L214;
        int $dirty2 = $dirty1;
    L223:
        if (($dirty & 306783379) == 306783378) goto L225;
    L228:
        boolean r7 = true;
    L230:
        if ($composer2.shouldExecute(r7, $dirty & 1) == false) goto L336;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "324@18125L7,337@18775L22,338@18847L25");
        if (($changed & 1) != 0) goto L234;
    L249:
        if (r12 == 0) goto L251;
        Modifier.Companion modifier2 = Modifier.Companion;
    L252:
        if (r16 == 0) goto L254;
        boolean enabled3 = true;
    L255:
        if (r19 == 0) goto L257;
        boolean readOnly3 = false;
    L259:
        if ((r127 & 32) == 0) goto L261;
        ProvidableCompositionLocal<TextStyle> r8 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle2 = (TextStyle) r9;
        int $dirty3 = $dirty & (-458753);
    L262:
        if (r22 == 0) goto L264;
        Function2<? super Composer, ? super Integer, Unit> r57 = null;
    L265:
        if (r13 == 0) goto L267;
        Function2<? super Composer, ? super Integer, Unit> r58 = null;
    L268:
        if (r0 == 0) goto L270;
        Function2<? super Composer, ? super Integer, Unit> r59 = null;
    L271:
        if (r1 == 0) goto L273;
        Function2<? super Composer, ? super Integer, Unit> r60 = null;
    L274:
        if (r2 == 0) goto L276;
        boolean isError2 = false;
    L277:
        if (r3 == 0) goto L279;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L280:
        if (r21 == 0) goto L282;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L283:
        if (r25 == 0) goto L285;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L286:
        if (r18 == 0) goto L288;
        boolean singleLine2 = false;
    L290:
        if ((32768 & r127) == 0) goto L295;
        if (singleLine2 == false) goto L293;
        int maxLines2 = 1;
    L294:
        $dirty2 = $dirty2 & (-458753);
        int maxLines3 = maxLines2;
    L296:
        if (r115 == 0) goto L298;
        int minLines2 = 1;
    L299:
        if (r23 == 0) goto L301;
        MutableInteractionSource interactionSource2 = null;
    L303:
        if ((262144 & r127) == 0) goto L305;
        Shape shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer2, 6);
        int $dirty4 = $dirty2 & (-234881025);
    L307:
        if ((r127 & 524288) == 0) goto L309;
        Composer $composer3 = $composer2;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        int $dirty5 = $dirty4 & (-1879048193);
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        TextStyle textStyle3 = textStyle2;
        int $dirty6 = $dirty3;
        boolean isError3 = isError2;
        VisualTransformation visualTransformation3 = visualTransformation2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        boolean singleLine3 = singleLine2;
        int maxLines4 = maxLines3;
        int minLines3 = minLines2;
    L310:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L314;
        ComposerKt.traceEventStart(-621914704, $dirty6, $dirty5, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:339)");
    L314:
        if (interactionSource2 != null) goto L320;
        $composer3.startReplaceGroup(-579356042);
        ComposerKt.sourceInformation($composer3, "341@18958L39");
        ComposerKt.sourceInformationMarkerStart($composer3, 674047756, "CC(remember):OutlinedTextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L319;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L319:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
    L321:
        $composer3.startReplaceGroup(674052851);
        ComposerKt.sourceInformation($composer3, "*343@19137L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L324;
        boolean r24 = true;
    L325:
        if (r24 == true) goto L328;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty6 >> 9) & 14) | (($dirty5 >> 24) & 112)).getValue().m4376unboximpl();
    L328:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        ProvidableCompositionLocal<Density> r20 = CompositionLocalsKt.getLocalDensity();
        TextStyle textStyle4 = textStyle3;
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r27 = $composer3.consume(r20);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Density density = (Density) r27;
        if (r57 == null) goto L331;
        Modifier.Companion r28 = PaddingKt.m729paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, AnonymousClass5.INSTANCE), 0.0f, density.mo371toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
    L332:
        final boolean isError4 = isError3;
        final boolean enabled4 = enabled2;
        final TextFieldColors colors3 = colors2;
        final boolean singleLine4 = singleLine3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r117 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r59;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r60;
        final Shape shape3 = shape2;
        boolean readOnly4 = readOnly2;
        Composer $composer4 = $composer3;
        BasicTextFieldKt.BasicTextField(value, r105, SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(r28), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM()), enabled4, readOnly4, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines4, minLines3, visualTransformation3, null, interactionSource3, new SolidColor(colors2.cursorColor(isError3, $composer3, ($dirty5 & 14) | (($dirty5 >> 24) & 112)).getValue().m4376unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(1710364390, true, new AnonymousClass7(value, enabled4, singleLine4, visualTransformation4, interactionSource4, isError4, r116, r117, r118, r119, shape3, colors3), $composer3, 54), $composer4, ((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (($dirty5 << 12) & 3670016)) | (($dirty5 << 12) & 29360128)) | (($dirty5 << 12) & 234881024)) | (1879048192 & ($dirty5 << 12)), ((($dirty5 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty5 & 112), 4096);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L335;
        ComposerKt.traceEventEnd();
    L335:
        VisualTransformation r29 = visualTransformation3;
        final boolean singleLine5 = singleLine3;
        final VisualTransformation visualTransformation5 = r29;
        final TextFieldColors colors4 = colors3;
        final boolean enabled5 = enabled4;
        final boolean readOnly5 = readOnly4;
        final int maxLines5 = maxLines4;
        final int minLines4 = minLines3;
        final TextStyle textStyle5 = textStyle4;
        final Function2<? super Composer, ? super Integer, Unit> r30 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r31 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r32 = r59;
        final MutableInteractionSource interactionSource5 = interactionSource2;
        final Shape shape4 = shape2;
        final Modifier modifier3 = modifier2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final Function2<? super Composer, ? super Integer, Unit> r120 = r60;
        final boolean isError5 = isError4;
    L337:
        ScopeUpdateScope r33 = $composer5.endRestartGroup();
        if (r33 == null) goto L341;
        r33.updateScope(new AnonymousClass8(value, r105, modifier3, enabled5, readOnly5, textStyle5, r30, r31, r32, r120, isError5, visualTransformation5, keyboardOptions4, keyboardActions4, singleLine5, maxLines5, minLines4, interactionSource5, shape4, colors4, $changed, $changed1, r127));
        return;
    L341:
        return;
    L331:
        r28 = Modifier.Companion;
        goto L332
    L324:
        r24 = false;
        goto L325
    L320:
        $composer3.startReplaceGroup(674047105);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L321
    L309:
        $composer3 = $composer2;
        colors2 = colors;
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        textStyle3 = textStyle2;
        $dirty6 = $dirty3;
        isError3 = isError2;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        singleLine3 = singleLine2;
        maxLines4 = maxLines3;
        minLines3 = minLines2;
        $dirty5 = $dirty4;
        goto L310
    L305:
        shape2 = shape;
        $dirty4 = $dirty2;
        goto L307
    L301:
        interactionSource2 = interactionSource;
        goto L303
    L298:
        minLines2 = minLines;
        goto L299
    L293:
        maxLines2 = Integer.MAX_VALUE;
        goto L294
    L295:
        maxLines3 = maxLines;
        goto L296
    L288:
        singleLine2 = singleLine;
        goto L290
    L285:
        keyboardActions2 = keyboardActions;
        goto L286
    L282:
        keyboardOptions2 = keyboardOptions;
        goto L283
    L279:
        visualTransformation2 = visualTransformation;
        goto L280
    L276:
        isError2 = isError;
        goto L277
    L273:
        r60 = r113;
        goto L274
    L270:
        r59 = r112;
        goto L271
    L267:
        r58 = r14;
        goto L268
    L264:
        r57 = r11;
        goto L265
    L261:
        textStyle2 = r10;
        $dirty3 = $dirty;
        goto L262
    L257:
        readOnly3 = readOnly2;
        goto L259
    L254:
        enabled3 = enabled2;
        goto L255
    L251:
        modifier2 = r15;
        goto L252
    L234:
        if ($composer2.getDefaultsInvalid() == true) goto L249;
        $composer2.skipToGroupEnd();
        if ((r127 & 32) == 0) goto L240;
        $dirty = $dirty & (-458753);
    L240:
        if ((32768 & r127) == 0) goto L243;
        $dirty2 = $dirty2 & (-458753);
    L243:
        if ((262144 & r127) == 0) goto L246;
        $dirty2 = $dirty2 & (-234881025);
    L246:
        if ((r127 & 524288) == 0) goto L248;
        r59 = r112;
        r60 = r113;
        isError3 = isError;
        singleLine3 = singleLine;
        maxLines4 = maxLines;
        interactionSource2 = interactionSource;
        shape2 = shape;
        colors2 = colors;
        $composer3 = $composer2;
        $dirty6 = $dirty;
        textStyle3 = r10;
        r57 = r11;
        r58 = r14;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        minLines3 = minLines;
        $dirty5 = $dirty2 & (-1879048193);
        modifier2 = r15;
        visualTransformation3 = visualTransformation;
        goto L310
    L248:
        r59 = r112;
        r60 = r113;
        isError3 = isError;
        singleLine3 = singleLine;
        maxLines4 = maxLines;
        interactionSource2 = interactionSource;
        shape2 = shape;
        colors2 = colors;
        $composer3 = $composer2;
        $dirty6 = $dirty;
        textStyle3 = r10;
        r57 = r11;
        r58 = r14;
        modifier2 = r15;
        $dirty5 = $dirty2;
        visualTransformation3 = visualTransformation;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        minLines3 = minLines;
        goto L310
    L336:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r32 = r112;
        visualTransformation5 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        maxLines5 = maxLines;
        minLines4 = minLines;
        interactionSource5 = interactionSource;
        shape4 = shape;
        colors4 = colors;
        enabled5 = enabled2;
        readOnly5 = readOnly2;
        textStyle5 = r10;
        r30 = r11;
        r31 = r14;
        modifier3 = r15;
        r120 = r113;
        isError5 = isError;
        keyboardActions4 = keyboardActions;
        singleLine5 = singleLine;
        goto L337
    L225:
        if (($dirty2 & 306783379) != 306783378) goto L228;
        r7 = false;
        goto L230
    L214:
        if ((r127 & 524288) != 0) goto L218;
        int $dirty7 = $dirty1;
        if ($composer2.changed(colors) == false) goto L219;
        int r210 = 536870912;
    L220:
        $dirty2 = $dirty7 | r210;
    L219:
        r210 = 268435456;
        goto L220
    L218:
        $dirty7 = $dirty1;
        goto L219
    L193:
        if (($changed1 & 12582912) != 0) goto L201;
        if ($composer2.changed(interactionSource) == false) goto L197;
        int r211 = 8388608;
    L198:
        $dirty1 = $dirty1 | r211;
        goto L201
    L197:
        r211 = 4194304;
        goto L198
    L182:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changed(minLines) == false) goto L186;
        int r212 = 1048576;
    L187:
        $dirty1 = $dirty1 | r212;
        goto L189
    L186:
        r212 = 524288;
        goto L187
    L159:
        r18 = r6;
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changed(singleLine) == false) goto L164;
        int r121 = 16384;
    L165:
        $dirty1 = $dirty1 | r121;
        goto L168
    L164:
        r121 = 8192;
        goto L165
    L148:
        r25 = r5;
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(keyboardActions) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L156
    L137:
        r21 = r4;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r213 = 256;
    L143:
        $dirty1 = $dirty1 | r213;
        goto L145
    L142:
        r213 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(visualTransformation) == false) goto L131;
        int r214 = 32;
    L132:
        $dirty1 = $dirty1 | r214;
        goto L134
    L131:
        r214 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(isError) == false) goto L120;
        int r215 = 4;
    L121:
        $dirty1 = $dirty1 | r215;
        goto L123
    L120:
        r215 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r113) == false) goto L109;
        int r34 = 536870912;
    L110:
        $dirty = $dirty | r34;
        goto L112
    L109:
        r34 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r112) == false) goto L98;
        int r35 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r35;
        goto L101
    L98:
        r35 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r14 = r111;
        if ($composer2.changedInstance(r14) == false) goto L87;
        int r216 = 8388608;
    L88:
        $dirty = $dirty | r216;
        goto L90
    L87:
        r216 = 4194304;
        goto L88
    L89:
        r14 = r111;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r11 = r110;
        if ($composer2.changedInstance(r11) == false) goto L76;
        int r217 = 1048576;
    L77:
        $dirty = $dirty | r217;
        goto L79
    L76:
        r217 = 524288;
        goto L77
    L78:
        r11 = r110;
        goto L79
    L60:
        if ((r127 & 32) != 0) goto L64;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L65;
        int r218 = 131072;
    L66:
        $dirty = $dirty | r218;
    L65:
        r218 = 65536;
        goto L66
    L64:
        r10 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r219 = 16384;
    L55:
        $dirty = $dirty | r219;
        goto L58
    L54:
        r219 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r122 = 2048;
    L44:
        $dirty = $dirty | r122;
        goto L46
    L43:
        r122 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r15 = modifier;
        if ($composer2.changed(r15) == false) goto L32;
        int r123 = 256;
    L33:
        $dirty = $dirty | r123;
        goto L35
    L32:
        r123 = 128;
        goto L33
    L34:
        r15 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r105) == false) goto L21;
        int r124 = 32;
    L22:
        $dirty = $dirty | r124;
        goto L24
    L21:
        r124 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r36 = 4;
    L11:
        $dirty = $dirty | r36;
        goto L14
    L10:
        r36 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final /* synthetic */ void OutlinedTextField(final String value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r91) {
        Composer $composer2 = $composer.startRestartGroup(-2099955827);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)437@22860L416:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r91 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r91 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r12 = r91 & 4;
        if (r12 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r15 = modifier;
    L35:
        int r16 = r91 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r19 = r91 & 16;
        int r20 = 16384;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle r10 = textStyle;
    L68:
        int r27 = r91 & 64;
        if (r27 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2 r11 = label;
    L79:
        int r13 = r91 & 128;
        if (r13 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2 r14 = placeholder;
    L90:
        int r0 = r91 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r91 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r91 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r3 = r91 & 2048;
        if (r3 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r4 = r91 & 4096;
        if (r4 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r24 = r4;
    L145:
        int r5 = r91 & 8192;
        if (r5 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r28 = r5;
    L156:
        int r6 = r91 & 16384;
        if (r6 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r18 = r6;
    L167:
        int r110 = r91 & 32768;
        if (r110 == 0) goto L171;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        int r21 = r91 & 65536;
        if (r21 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L190:
        if (($changed1 & 12582912) != 0) goto L201;
        if ((r91 & 131072) != 0) goto L197;
        if ($composer2.changed(shape) == false) goto L197;
        int r22 = 8388608;
    L198:
        $dirty1 = $dirty1 | r22;
    L197:
        r22 = 4194304;
    L201:
        if (($changed1 & 100663296) == 0) goto L203;
        int $dirty2 = $dirty1;
        TextFieldColors r7 = colors;
        int $dirty3 = $dirty2;
    L212:
        if (($dirty & 306783379) == 306783378) goto L214;
    L217:
        boolean r8 = true;
    L219:
        if ($composer2.shouldExecute(r8, $dirty & 1) == false) goto L300;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "422@22116L7,433@22676L39,434@22754L22,435@22826L25");
        if (($changed & 1) != 0) goto L223;
    L235:
        if (r12 == 0) goto L237;
        Modifier.Companion modifier2 = Modifier.Companion;
    L238:
        if (r16 == 0) goto L240;
        boolean enabled3 = true;
    L241:
        if (r19 == 0) goto L243;
        boolean readOnly3 = false;
    L245:
        if ((r91 & 32) == 0) goto L247;
        ProvidableCompositionLocal<TextStyle> r9 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r23 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle2 = (TextStyle) r23;
        int $dirty4 = $dirty & (-458753);
    L248:
        if (r27 == 0) goto L250;
        Function2 label2 = null;
    L251:
        if (r13 == 0) goto L253;
        Function2 placeholder2 = null;
    L254:
        if (r0 == 0) goto L256;
        Function2 leadingIcon2 = null;
    L257:
        if (r1 == 0) goto L259;
        Function2 trailingIcon2 = null;
    L260:
        if (r2 == 0) goto L262;
        boolean isError2 = false;
    L263:
        if (r3 == 0) goto L265;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L266:
        if (r24 == 0) goto L268;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L269:
        if (r28 == 0) goto L271;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L272:
        if (r18 == 0) goto L274;
        boolean singleLine2 = false;
    L275:
        if (r110 == 0) goto L277;
        int maxLines2 = Integer.MAX_VALUE;
    L278:
        if (r21 == 0) goto L284;
        ComposerKt.sourceInformationMarkerStart($composer2, 674166732, "CC(remember):OutlinedTextField.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L283;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L283:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) it$iv;
    L286:
        if ((r91 & 131072) == 0) goto L288;
        Shape shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer2, 6);
        int $dirty5 = $dirty3 & (-29360129);
    L290:
        if ((262144 & r91) == 0) goto L292;
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        TextStyle textStyle3 = textStyle2;
        enabled2 = enabled3;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer3, 0, 0, 48, 2097151);
        int $dirty6 = $dirty5 & (-234881025);
        readOnly2 = readOnly3;
        int $dirty7 = $dirty4;
        Function2 label3 = label2;
        Function2 placeholder3 = placeholder2;
        Function2 leadingIcon3 = leadingIcon2;
        Function2 trailingIcon3 = trailingIcon2;
        boolean isError3 = isError2;
        VisualTransformation visualTransformation3 = visualTransformation2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        boolean singleLine3 = singleLine2;
        int maxLines3 = maxLines2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Shape shape3 = shape2;
    L293:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L296;
        ComposerKt.traceEventStart(-2099955827, $dirty7, $dirty6, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:436)");
    L296:
        OutlinedTextField(value, onValueChange, modifier3, enabled2, readOnly2, textStyle3, label3, placeholder3, leadingIcon3, trailingIcon3, isError3, visualTransformation3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, 1, interactionSource3, shape3, colors2, $composer3, ((((((((($dirty7 & 14) | ($dirty7 & 112)) | ($dirty7 & 896)) | ($dirty7 & 7168)) | (57344 & $dirty7)) | (458752 & $dirty7)) | (3670016 & $dirty7)) | (29360128 & $dirty7)) | (234881024 & $dirty7)) | (1879048192 & $dirty7), ((((((((($dirty6 & 14) | 1572864) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (($dirty6 << 3) & 29360128)) | (($dirty6 << 3) & 234881024)) | (($dirty6 << 3) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L299;
        ComposerKt.traceEventEnd();
    L299:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled2;
        final boolean readOnly4 = readOnly2;
        final TextStyle textStyle4 = textStyle3;
        final Function2 label4 = label3;
        final Function2 placeholder4 = placeholder3;
        final Function2 leadingIcon4 = leadingIcon3;
        final Function2 label5 = trailingIcon3;
        final boolean isError4 = isError3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final boolean singleLine4 = singleLine3;
        final int maxLines4 = maxLines3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Shape shape4 = shape3;
        final TextFieldColors colors3 = colors2;
    L301:
        ScopeUpdateScope r25 = $composer3.endRestartGroup();
        if (r25 == null) goto L305;
        r25.updateScope(new AnonymousClass10(value, onValueChange, modifier4, enabled4, readOnly4, textStyle4, label4, placeholder4, leadingIcon4, label5, isError4, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines4, interactionSource4, shape4, colors3, $changed, $changed1, r91));
        return;
    L305:
        return;
    L292:
        $composer3 = $composer2;
        modifier3 = modifier2;
        colors2 = colors;
        textStyle3 = textStyle2;
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        $dirty7 = $dirty4;
        label3 = label2;
        placeholder3 = placeholder2;
        leadingIcon3 = leadingIcon2;
        trailingIcon3 = trailingIcon2;
        isError3 = isError2;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        singleLine3 = singleLine2;
        maxLines3 = maxLines2;
        interactionSource3 = interactionSource2;
        shape3 = shape2;
        $dirty6 = $dirty5;
        goto L293
    L288:
        shape2 = shape;
        $dirty5 = $dirty3;
        goto L290
    L284:
        interactionSource2 = interactionSource;
        goto L286
    L277:
        maxLines2 = maxLines;
        goto L278
    L274:
        singleLine2 = singleLine;
        goto L275
    L271:
        keyboardActions2 = keyboardActions;
        goto L272
    L268:
        keyboardOptions2 = keyboardOptions;
        goto L269
    L265:
        visualTransformation2 = visualTransformation;
        goto L266
    L262:
        isError2 = isError;
        goto L263
    L259:
        trailingIcon2 = trailingIcon;
        goto L260
    L256:
        leadingIcon2 = leadingIcon;
        goto L257
    L253:
        placeholder2 = r14;
        goto L254
    L250:
        label2 = r11;
        goto L251
    L247:
        textStyle2 = r10;
        $dirty4 = $dirty;
        goto L248
    L243:
        readOnly3 = readOnly2;
        goto L245
    L240:
        enabled3 = enabled2;
        goto L241
    L237:
        modifier2 = r15;
        goto L238
    L223:
        if ($composer2.getDefaultsInvalid() == true) goto L235;
        $composer2.skipToGroupEnd();
        if ((r91 & 32) == 0) goto L229;
        $dirty = $dirty & (-458753);
    L229:
        if ((r91 & 131072) == 0) goto L232;
        $dirty3 = $dirty3 & (-29360129);
    L232:
        if ((262144 & r91) == 0) goto L234;
        int r26 = $dirty3 & (-234881025);
        leadingIcon3 = leadingIcon;
        trailingIcon3 = trailingIcon;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        $dirty6 = r26;
        $composer3 = $composer2;
        $dirty7 = $dirty;
        colors2 = r7;
        textStyle3 = r10;
        label3 = r11;
        placeholder3 = r14;
        modifier3 = r15;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        goto L293
    L234:
        leadingIcon3 = leadingIcon;
        trailingIcon3 = trailingIcon;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        shape3 = shape;
        $composer3 = $composer2;
        $dirty7 = $dirty;
        colors2 = r7;
        textStyle3 = r10;
        label3 = r11;
        placeholder3 = r14;
        modifier3 = r15;
        $dirty6 = $dirty3;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        interactionSource3 = interactionSource;
        goto L293
    L300:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        leadingIcon4 = leadingIcon;
        visualTransformation4 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        maxLines4 = maxLines;
        interactionSource4 = interactionSource;
        shape4 = shape;
        colors3 = colors;
        enabled4 = enabled2;
        readOnly4 = readOnly2;
        textStyle4 = r10;
        label4 = r11;
        placeholder4 = r14;
        modifier4 = r15;
        label5 = trailingIcon;
        isError4 = isError;
        keyboardActions4 = keyboardActions;
        singleLine4 = singleLine;
        goto L301
    L214:
        if (($dirty3 & 38347923) != 38347922) goto L217;
        r8 = false;
        goto L219
    L203:
        if ((r91 & 262144) != 0) goto L207;
        int $dirty8 = $dirty1;
        r7 = colors;
        if ($composer2.changed(r7) == false) goto L208;
        int r29 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty3 = $dirty8 | r29;
    L208:
        r29 = 33554432;
        goto L209
    L207:
        $dirty8 = $dirty1;
        r7 = colors;
        goto L208
    L182:
        if (($changed1 & 1572864) != 0) goto L190;
        if ($composer2.changed(interactionSource) == false) goto L186;
        int r210 = 1048576;
    L187:
        $dirty1 = $dirty1 | r210;
        goto L190
    L186:
        r210 = 524288;
        goto L187
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ($composer2.changed(maxLines) == false) goto L175;
        int r211 = 131072;
    L176:
        $dirty1 = $dirty1 | r211;
        goto L178
    L175:
        r211 = 65536;
        goto L176
    L159:
        r18 = r6;
        if (($changed1 & 24576) != 0) goto L167;
        if ($composer2.changed(singleLine) == true) goto L165;
        r20 = 8192;
    L165:
        $dirty1 = $dirty1 | r20;
        goto L167
    L148:
        r28 = r5;
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(keyboardActions) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L156
    L137:
        r24 = r4;
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r212 = 256;
    L143:
        $dirty1 = $dirty1 | r212;
        goto L145
    L142:
        r212 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(visualTransformation) == false) goto L131;
        int r213 = 32;
    L132:
        $dirty1 = $dirty1 | r213;
        goto L134
    L131:
        r213 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(isError) == false) goto L120;
        int r214 = 4;
    L121:
        $dirty1 = $dirty1 | r214;
        goto L123
    L120:
        r214 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(trailingIcon) == false) goto L109;
        int r35 = 536870912;
    L110:
        $dirty = $dirty | r35;
        goto L112
    L109:
        r35 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(leadingIcon) == false) goto L98;
        int r34 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r34;
        goto L101
    L98:
        r34 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r14 = placeholder;
        if ($composer2.changedInstance(r14) == false) goto L87;
        int r32 = 8388608;
    L88:
        $dirty = $dirty | r32;
        goto L90
    L87:
        r32 = 4194304;
        goto L88
    L89:
        r14 = placeholder;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r11 = label;
        if ($composer2.changedInstance(r11) == false) goto L76;
        int r215 = 1048576;
    L77:
        $dirty = $dirty | r215;
        goto L79
    L76:
        r215 = 524288;
        goto L77
    L78:
        r11 = label;
        goto L79
    L60:
        if ((r91 & 32) != 0) goto L64;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L65;
        int r216 = 131072;
    L66:
        $dirty = $dirty | r216;
    L65:
        r216 = 65536;
        goto L66
    L64:
        r10 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r217 = 16384;
    L55:
        $dirty = $dirty | r217;
        goto L58
    L54:
        r217 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r15 = modifier;
        if ($composer2.changed(r15) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L34:
        r15 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(onValueChange) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r30 = 4;
    L11:
        $dirty = $dirty | r30;
        goto L14
    L10:
        r30 = 2;
        goto L11
    }

    public static final void OutlinedTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> r105, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r110, Function2<? super Composer, ? super Integer, Unit> r111, Function2<? super Composer, ? super Integer, Unit> r112, Function2<? super Composer, ? super Integer, Unit> r113, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r127) {
        Composer $composer2 = $composer.startRestartGroup(237745923);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)554@29288L7,572@30007L38,581@30390L20,590@30744L1030,557@29344L2436:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r127 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r127 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r12 = r127 & 4;
        if (r12 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r15 = modifier;
    L35:
        int r16 = r127 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r19 = r127 & 16;
        int r20 = 8192;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle r10 = textStyle;
    L68:
        int r23 = r127 & 64;
        if (r23 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r11 = r110;
    L79:
        int r13 = r127 & 128;
        if (r13 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r14 = r111;
    L90:
        int $dirty2 = r127 & 256;
        if ($dirty2 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty3 = r127 & 512;
        if ($dirty3 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty4 = r127 & 1024;
        if ($dirty4 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty5 = r127 & 2048;
        if ($dirty5 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r0 = r127 & 4096;
        if (r0 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r22 = r0;
    L146:
        if (($changed1 & 3072) != 0) goto L156;
        if ((r127 & 8192) != 0) goto L153;
        if ($composer2.changed(keyboardActions) == false) goto L153;
    L154:
        $dirty1 = $dirty1 | r17;
    L153:
        r17 = 1024;
    L156:
        int r1 = r127 & 16384;
        if (r1 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r18 = r1;
    L167:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L177;
        if ((r127 & 32768) != 0) goto L174;
        if ($composer2.changed(maxLines) == false) goto L174;
        int r114 = 131072;
    L175:
        $dirty1 = $dirty1 | r114;
    L174:
        r114 = 65536;
    L177:
        int r115 = r127 & 65536;
        if (r115 == 0) goto L181;
        $dirty1 = $dirty1 | 1572864;
    L188:
        int r21 = r127 & 131072;
        if (r21 == 0) goto L192;
        $dirty1 = $dirty1 | 12582912;
    L200:
        if (($changed1 & 100663296) != 0) goto L211;
        if ((r127 & 262144) != 0) goto L207;
        if ($composer2.changed(shape) == false) goto L207;
        int r24 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L208:
        $dirty1 = $dirty1 | r24;
    L207:
        r24 = 33554432;
    L211:
        if (($changed1 & 805306368) == 0) goto L213;
        int $dirty6 = $dirty1;
    L221:
        int $dirty7 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L224;
    L227:
        boolean r2 = true;
    L229:
        if ($composer2.shouldExecute(r2, $dirty7 & 1) == false) goto L340;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "532@28151L7,545@28795L22,546@28867L25");
        if (($changed & 1) != 0) goto L233;
    L252:
        if (r12 == 0) goto L254;
        Modifier.Companion modifier2 = Modifier.Companion;
    L255:
        if (r16 == 0) goto L257;
        boolean enabled3 = true;
    L258:
        if (r19 == 0) goto L260;
        boolean readOnly3 = false;
    L262:
        if ((r127 & 32) == 0) goto L264;
        ProvidableCompositionLocal<TextStyle> r7 = TextKt.getLocalTextStyle();
        int r116 = -458753;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle2 = (TextStyle) r4;
        int $dirty8 = $dirty7 & (-458753);
    L265:
        if (r23 == 0) goto L267;
        Function2<? super Composer, ? super Integer, Unit> r56 = null;
    L268:
        if (r13 == 0) goto L270;
        Function2<? super Composer, ? super Integer, Unit> r57 = null;
    L271:
        if ($dirty2 == 0) goto L273;
        Function2<? super Composer, ? super Integer, Unit> r58 = null;
    L274:
        if ($dirty3 == 0) goto L276;
        Function2<? super Composer, ? super Integer, Unit> r59 = null;
    L277:
        if ($dirty4 == 0) goto L279;
        boolean isError2 = false;
    L280:
        if ($dirty5 == 0) goto L282;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L283:
        if (r22 == 0) goto L285;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L287:
        if ((r127 & 8192) == 0) goto L289;
        int $dirty9 = $dirty6 & (-7169);
        KeyboardActions keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
    L290:
        if (r18 == 0) goto L292;
        boolean singleLine2 = false;
    L294:
        if ((32768 & r127) == 0) goto L299;
        if (singleLine2 == false) goto L297;
        int maxLines2 = 1;
    L298:
        $dirty9 = $dirty9 & r116;
        int maxLines3 = maxLines2;
    L300:
        if (r115 == 0) goto L302;
        int minLines2 = 1;
    L303:
        if (r21 == 0) goto L305;
        MutableInteractionSource interactionSource2 = null;
    L307:
        if ((262144 & r127) == 0) goto L309;
        Shape shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer2, 6);
        int $dirty10 = $dirty9 & (-234881025);
    L311:
        if ((r127 & 524288) == 0) goto L313;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        int $dirty11 = $dirty10 & (-1879048193);
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        TextStyle textStyle3 = textStyle2;
        int $dirty12 = $dirty8;
        VisualTransformation visualTransformation3 = visualTransformation2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        boolean singleLine3 = singleLine2;
        int maxLines4 = maxLines3;
        int minLines3 = minLines2;
        TextFieldColors colors3 = colors2;
        boolean isError3 = isError2;
    L314:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L318;
        ComposerKt.traceEventStart(237745923, $dirty12, $dirty11, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:547)");
    L318:
        if (interactionSource2 != null) goto L324;
        $composer3.startReplaceGroup(-569416202);
        ComposerKt.sourceInformation($composer3, "549@28978L39");
        ComposerKt.sourceInformationMarkerStart($composer3, 674368396, "CC(remember):OutlinedTextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L323;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L323:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
    L325:
        $composer3.startReplaceGroup(674373491);
        ComposerKt.sourceInformation($composer3, "*551@29157L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L328;
        boolean r117 = true;
    L329:
        if (r117 == true) goto L332;
        $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty12 >> 9) & 14) | (($dirty11 >> 24) & 112)).getValue().m4376unboximpl();
    L332:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        TextStyle textStyle4 = textStyle3;
        final boolean enabled4 = enabled2;
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer3.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Density density = (Density) r5;
        if (r56 == null) goto L335;
        Modifier.Companion r6 = PaddingKt.m729paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, AnonymousClass11.INSTANCE), 0.0f, density.mo371toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
    L336:
        final boolean isError4 = isError3;
        final TextFieldColors colors4 = colors3;
        final boolean singleLine4 = singleLine3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r1110 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r1111 = r59;
        final Shape shape3 = shape2;
        boolean readOnly4 = readOnly2;
        Composer $composer4 = $composer3;
        BasicTextFieldKt.BasicTextField(value, r105, SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(r6), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM()), enabled4, readOnly4, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines4, minLines3, visualTransformation3, null, interactionSource3, new SolidColor(colors3.cursorColor(isError3, $composer3, ($dirty11 & 14) | (($dirty11 >> 24) & 112)).getValue().m4376unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-1001528775, true, new AnonymousClass13(value, enabled4, singleLine4, visualTransformation4, interactionSource4, isError4, r118, r119, r1110, r1111, shape3, colors4), $composer3, 54), $composer4, ((((((($dirty12 & 14) | ($dirty12 & 112)) | ($dirty12 & 7168)) | (57344 & $dirty12)) | (($dirty11 << 12) & 3670016)) | (($dirty11 << 12) & 29360128)) | (($dirty11 << 12) & 234881024)) | (1879048192 & ($dirty11 << 12)), ((($dirty11 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty11 & 112), 4096);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L339;
        ComposerKt.traceEventEnd();
    L339:
        VisualTransformation r8 = visualTransformation3;
        final boolean singleLine5 = singleLine3;
        final VisualTransformation visualTransformation5 = r8;
        final TextStyle textStyle5 = textStyle4;
        final TextFieldColors colors5 = colors4;
        final boolean enabled5 = enabled4;
        final boolean readOnly5 = readOnly4;
        final int maxLines5 = maxLines4;
        final int minLines4 = minLines3;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r25 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r26 = r58;
        final MutableInteractionSource interactionSource5 = interactionSource2;
        final Shape shape4 = shape2;
        final Modifier modifier3 = modifier2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final Function2<? super Composer, ? super Integer, Unit> r120 = r59;
        final boolean isError5 = isError4;
    L341:
        ScopeUpdateScope r27 = $composer5.endRestartGroup();
        if (r27 == null) goto L345;
        r27.updateScope(new AnonymousClass14(value, r105, modifier3, enabled5, readOnly5, textStyle5, r9, r25, r26, r120, isError5, visualTransformation5, keyboardOptions4, keyboardActions4, singleLine5, maxLines5, minLines4, interactionSource5, shape4, colors5, $changed, $changed1, r127));
        return;
    L345:
        return;
    L335:
        r6 = Modifier.Companion;
        goto L336
    L328:
        r117 = false;
        goto L329
    L324:
        $composer3.startReplaceGroup(674367745);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L325
    L313:
        $composer3 = $composer2;
        colors3 = colors;
        keyboardActions3 = keyboardActions2;
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        textStyle3 = textStyle2;
        $dirty12 = $dirty8;
        isError3 = isError2;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        singleLine3 = singleLine2;
        maxLines4 = maxLines3;
        minLines3 = minLines2;
        $dirty11 = $dirty10;
        goto L314
    L309:
        shape2 = shape;
        $dirty10 = $dirty9;
        goto L311
    L305:
        interactionSource2 = interactionSource;
        goto L307
    L302:
        minLines2 = minLines;
        goto L303
    L297:
        maxLines2 = Integer.MAX_VALUE;
        goto L298
    L299:
        maxLines3 = maxLines;
        goto L300
    L292:
        singleLine2 = singleLine;
        goto L294
    L289:
        $dirty9 = $dirty6;
        keyboardActions2 = keyboardActions;
        goto L290
    L285:
        keyboardOptions2 = keyboardOptions;
        goto L287
    L282:
        visualTransformation2 = visualTransformation;
        goto L283
    L279:
        isError2 = isError;
        goto L280
    L276:
        r59 = r113;
        goto L277
    L273:
        r58 = r112;
        goto L274
    L270:
        r57 = r14;
        goto L271
    L267:
        r56 = r11;
        goto L268
    L264:
        r116 = -458753;
        $dirty8 = $dirty7;
        textStyle2 = r10;
        goto L265
    L260:
        readOnly3 = readOnly2;
        goto L262
    L257:
        enabled3 = enabled2;
        goto L258
    L254:
        modifier2 = r15;
        goto L255
    L233:
        if ($composer2.getDefaultsInvalid() == true) goto L252;
        $composer2.skipToGroupEnd();
        if ((r127 & 32) == 0) goto L238;
        int $dirty13 = $dirty7 & (-458753);
    L240:
        if ((r127 & 8192) == 0) goto L243;
        $dirty6 = $dirty6 & (-7169);
    L243:
        if ((32768 & r127) == 0) goto L246;
        $dirty6 = $dirty6 & (-458753);
    L246:
        if ((262144 & r127) == 0) goto L249;
        $dirty6 = $dirty6 & (-234881025);
    L249:
        if ((r127 & 524288) == 0) goto L251;
        $dirty6 = $dirty6 & (-1879048193);
    L251:
        r58 = r112;
        r59 = r113;
        isError3 = isError;
        singleLine3 = singleLine;
        maxLines4 = maxLines;
        interactionSource2 = interactionSource;
        shape2 = shape;
        colors3 = colors;
        $dirty11 = $dirty6;
        $composer3 = $composer2;
        textStyle3 = r10;
        r56 = r11;
        r57 = r14;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        minLines3 = minLines;
        $dirty12 = $dirty13;
        modifier2 = r15;
        visualTransformation3 = visualTransformation;
        goto L314
    L238:
        $dirty13 = $dirty7;
        goto L240
    L340:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r26 = r112;
        visualTransformation5 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        maxLines5 = maxLines;
        minLines4 = minLines;
        interactionSource5 = interactionSource;
        shape4 = shape;
        colors5 = colors;
        enabled5 = enabled2;
        readOnly5 = readOnly2;
        textStyle5 = r10;
        r9 = r11;
        r25 = r14;
        modifier3 = r15;
        r120 = r113;
        isError5 = isError;
        keyboardActions4 = keyboardActions;
        singleLine5 = singleLine;
        goto L341
    L224:
        if ((306783379 & $dirty6) != 306783378) goto L227;
        r2 = false;
        goto L229
    L213:
        if ((r127 & 524288) != 0) goto L217;
        int $dirty14 = $dirty1;
        if ($composer2.changed(colors) == false) goto L218;
        int r28 = 536870912;
    L219:
        $dirty6 = $dirty14 | r28;
    L218:
        r28 = 268435456;
        goto L219
    L217:
        $dirty14 = $dirty1;
        goto L218
    L192:
        if (($changed1 & 12582912) != 0) goto L200;
        if ($composer2.changed(interactionSource) == false) goto L196;
        int r29 = 8388608;
    L197:
        $dirty1 = $dirty1 | r29;
        goto L200
    L196:
        r29 = 4194304;
        goto L197
    L181:
        if (($changed1 & 1572864) != 0) goto L188;
        if ($composer2.changed(minLines) == false) goto L185;
        int r210 = 1048576;
    L186:
        $dirty1 = $dirty1 | r210;
        goto L188
    L185:
        r210 = 524288;
        goto L186
    L159:
        r18 = r1;
        if (($changed1 & 24576) != 0) goto L167;
        if ($composer2.changed(singleLine) == false) goto L164;
        r20 = 16384;
    L164:
        $dirty1 = $dirty1 | r20;
        goto L167
    L137:
        r22 = r0;
        if (($changed1 & 384) != 0) goto L146;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r211 = 256;
    L143:
        $dirty1 = $dirty1 | r211;
        goto L146
    L142:
        r211 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(visualTransformation) == false) goto L131;
        int r212 = 32;
    L132:
        $dirty1 = $dirty1 | r212;
        goto L134
    L131:
        r212 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(isError) == false) goto L120;
        int r213 = 4;
    L121:
        $dirty1 = $dirty1 | r213;
        goto L123
    L120:
        r213 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r113) == false) goto L109;
        int r32 = 536870912;
    L110:
        $dirty = $dirty | r32;
        goto L112
    L109:
        r32 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r112) == false) goto L98;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r31;
        goto L101
    L98:
        r31 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r14 = r111;
        if ($composer2.changedInstance(r14) == false) goto L87;
        int r30 = 8388608;
    L88:
        $dirty = $dirty | r30;
        goto L90
    L87:
        r30 = 4194304;
        goto L88
    L89:
        r14 = r111;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r11 = r110;
        if ($composer2.changedInstance(r11) == false) goto L76;
        int r214 = 1048576;
    L77:
        $dirty = $dirty | r214;
        goto L79
    L76:
        r214 = 524288;
        goto L77
    L78:
        r11 = r110;
        goto L79
    L60:
        if ((r127 & 32) != 0) goto L64;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L65;
        int r215 = 131072;
    L66:
        $dirty = $dirty | r215;
    L65:
        r215 = 65536;
        goto L66
    L64:
        r10 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r216 = 16384;
    L55:
        $dirty = $dirty | r216;
        goto L58
    L54:
        r216 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r121 = 2048;
    L44:
        $dirty = $dirty | r121;
        goto L46
    L43:
        r121 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r15 = modifier;
        if ($composer2.changed(r15) == false) goto L32;
        int r122 = 256;
    L33:
        $dirty = $dirty | r122;
        goto L35
    L32:
        r122 = 128;
        goto L33
    L34:
        r15 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r105) == false) goto L21;
        int r123 = 32;
    L22:
        $dirty = $dirty | r123;
        goto L24
    L21:
        r123 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r33 = 4;
    L11:
        $dirty = $dirty | r33;
        goto L14
    L10:
        r33 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final /* synthetic */ void OutlinedTextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r93) {
        Composer $composer2 = $composer.startRestartGroup(-288998816);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)645@32895L416:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r93 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r93 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r12 = r93 & 4;
        if (r12 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r15 = modifier;
    L35:
        int r16 = r93 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r19 = r93 & 16;
        int r20 = 16384;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean readOnly2 = readOnly;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        TextStyle r10 = textStyle;
    L68:
        int r27 = r93 & 64;
        if (r27 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2 r11 = label;
    L79:
        int r13 = r93 & 128;
        if (r13 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2 r14 = placeholder;
    L90:
        int $dirty2 = r93 & 256;
        if ($dirty2 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty3 = r93 & 512;
        if ($dirty3 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty4 = r93 & 1024;
        if ($dirty4 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty5 = r93 & 2048;
        if ($dirty5 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r0 = r93 & 4096;
        if (r0 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r24 = r0;
    L146:
        if (($changed1 & 3072) != 0) goto L156;
        if ((r93 & 8192) != 0) goto L153;
        if ($composer2.changed(keyboardActions) == false) goto L153;
    L154:
        $dirty1 = $dirty1 | r17;
    L153:
        r17 = 1024;
    L156:
        int r1 = r93 & 16384;
        if (r1 == 0) goto L159;
        $dirty1 = $dirty1 | 24576;
        int r18 = r1;
    L167:
        int r110 = r93 & 32768;
        if (r110 == 0) goto L171;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        int r21 = r93 & 65536;
        if (r21 == 0) goto L182;
        $dirty1 = $dirty1 | 1572864;
    L190:
        if (($changed1 & 12582912) != 0) goto L201;
        if ((r93 & 131072) != 0) goto L197;
        if ($composer2.changed(shape) == false) goto L197;
        int r22 = 8388608;
    L198:
        $dirty1 = $dirty1 | r22;
    L197:
        r22 = 4194304;
    L201:
        if (($changed1 & 100663296) == 0) goto L203;
        int $dirty6 = $dirty1;
        TextFieldColors r5 = colors;
        int $dirty7 = $dirty6;
    L211:
        int $dirty8 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L214;
    L217:
        boolean r2 = true;
    L219:
        if ($composer2.shouldExecute(r2, $dirty8 & 1) == false) goto L305;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "630@32157L7,641@32711L39,642@32789L22,643@32861L25");
        if (($changed & 1) != 0) goto L223;
    L239:
        if (r12 == 0) goto L241;
        Modifier.Companion modifier2 = Modifier.Companion;
    L242:
        if (r16 == 0) goto L244;
        boolean enabled3 = true;
    L245:
        if (r19 == 0) goto L247;
        boolean readOnly3 = false;
    L249:
        if ((r93 & 32) == 0) goto L251;
        ProvidableCompositionLocal<TextStyle> r4 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r111 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle textStyle2 = (TextStyle) r111;
        int $dirty9 = $dirty8 & (-458753);
    L252:
        if (r27 == 0) goto L254;
        Function2 label2 = null;
    L255:
        if (r13 == 0) goto L257;
        Function2 placeholder2 = null;
    L258:
        if ($dirty2 == 0) goto L260;
        Function2 leadingIcon2 = null;
    L261:
        if ($dirty3 == 0) goto L263;
        Function2 trailingIcon2 = null;
    L264:
        if ($dirty4 == 0) goto L266;
        boolean isError2 = false;
    L267:
        if ($dirty5 == 0) goto L269;
        VisualTransformation visualTransformation2 = VisualTransformation.Companion.getNone();
    L270:
        if (r24 == 0) goto L272;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L274:
        if ((r93 & 8192) == 0) goto L276;
        int $dirty10 = $dirty7 & (-7169);
        KeyboardActions keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
    L277:
        if (r18 == 0) goto L279;
        boolean singleLine2 = false;
    L280:
        if (r110 == 0) goto L282;
        int maxLines2 = Integer.MAX_VALUE;
    L283:
        if (r21 == 0) goto L289;
        ComposerKt.sourceInformationMarkerStart($composer2, 674487852, "CC(remember):OutlinedTextField.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L288;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L288:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) it$iv;
    L291:
        if ((r93 & 131072) == 0) goto L293;
        Shape shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer2, 6);
        int $dirty11 = $dirty10 & (-29360129);
    L295:
        if ((262144 & r93) == 0) goto L297;
        Composer $composer3 = $composer2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        Modifier modifier3 = modifier2;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1826outlinedTextFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer3, 0, 0, 48, 2097151);
        $dirty7 = $dirty11 & (-234881025);
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        TextStyle textStyle3 = textStyle2;
        int $dirty12 = $dirty9;
        Function2 label3 = label2;
        Function2 placeholder3 = placeholder2;
        Function2 leadingIcon3 = leadingIcon2;
        Function2 trailingIcon3 = trailingIcon2;
        boolean isError3 = isError2;
        VisualTransformation visualTransformation3 = visualTransformation2;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        boolean singleLine3 = singleLine2;
        int maxLines3 = maxLines2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Shape shape3 = shape2;
    L298:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L301;
        ComposerKt.traceEventStart(-288998816, $dirty12, $dirty7, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:644)");
    L301:
        OutlinedTextField(value, onValueChange, modifier3, enabled2, readOnly2, textStyle3, label3, placeholder3, leadingIcon3, trailingIcon3, isError3, visualTransformation3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, 1, interactionSource3, shape3, colors2, $composer3, ((((((((($dirty12 & 14) | ($dirty12 & 112)) | ($dirty12 & 896)) | ($dirty12 & 7168)) | (57344 & $dirty12)) | (458752 & $dirty12)) | (3670016 & $dirty12)) | (29360128 & $dirty12)) | (234881024 & $dirty12)) | (1879048192 & $dirty12), ((((((((($dirty7 & 14) | 1572864) | ($dirty7 & 112)) | ($dirty7 & 896)) | ($dirty7 & 7168)) | (57344 & $dirty7)) | (458752 & $dirty7)) | (($dirty7 << 3) & 29360128)) | (($dirty7 << 3) & 234881024)) | (($dirty7 << 3) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L304;
        ComposerKt.traceEventEnd();
    L304:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled2;
        final boolean readOnly4 = readOnly2;
        final TextStyle textStyle4 = textStyle3;
        final Function2 label4 = label3;
        final Function2 placeholder4 = placeholder3;
        final Function2 leadingIcon4 = leadingIcon3;
        final Function2 label5 = trailingIcon3;
        final boolean isError4 = isError3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final boolean singleLine4 = singleLine3;
        final int maxLines4 = maxLines3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Shape shape4 = shape3;
        final TextFieldColors colors3 = colors2;
    L306:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L310;
        r3.updateScope(new AnonymousClass16(value, onValueChange, modifier4, enabled4, readOnly4, textStyle4, label4, placeholder4, leadingIcon4, label5, isError4, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines4, interactionSource4, shape4, colors3, $changed, $changed1, r93));
        return;
    L310:
        return;
    L297:
        $composer3 = $composer2;
        colors2 = colors;
        keyboardActions3 = keyboardActions2;
        modifier3 = modifier2;
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        textStyle3 = textStyle2;
        $dirty12 = $dirty9;
        label3 = label2;
        placeholder3 = placeholder2;
        leadingIcon3 = leadingIcon2;
        trailingIcon3 = trailingIcon2;
        isError3 = isError2;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        singleLine3 = singleLine2;
        maxLines3 = maxLines2;
        interactionSource3 = interactionSource2;
        shape3 = shape2;
        $dirty7 = $dirty11;
        goto L298
    L293:
        shape2 = shape;
        $dirty11 = $dirty10;
        goto L295
    L289:
        interactionSource2 = interactionSource;
        goto L291
    L282:
        maxLines2 = maxLines;
        goto L283
    L279:
        singleLine2 = singleLine;
        goto L280
    L276:
        $dirty10 = $dirty7;
        keyboardActions2 = keyboardActions;
        goto L277
    L272:
        keyboardOptions2 = keyboardOptions;
        goto L274
    L269:
        visualTransformation2 = visualTransformation;
        goto L270
    L266:
        isError2 = isError;
        goto L267
    L263:
        trailingIcon2 = trailingIcon;
        goto L264
    L260:
        leadingIcon2 = leadingIcon;
        goto L261
    L257:
        placeholder2 = r14;
        goto L258
    L254:
        label2 = r11;
        goto L255
    L251:
        $dirty9 = $dirty8;
        textStyle2 = r10;
        goto L252
    L247:
        readOnly3 = readOnly2;
        goto L249
    L244:
        enabled3 = enabled2;
        goto L245
    L241:
        modifier2 = r15;
        goto L242
    L223:
        if ($composer2.getDefaultsInvalid() == true) goto L239;
        $composer2.skipToGroupEnd();
        if ((r93 & 32) == 0) goto L228;
        int $dirty13 = $dirty8 & (-458753);
    L230:
        if ((r93 & 8192) == 0) goto L233;
        $dirty7 = $dirty7 & (-7169);
    L233:
        if ((r93 & 131072) == 0) goto L236;
        $dirty7 = $dirty7 & (-29360129);
    L236:
        if ((262144 & r93) == 0) goto L238;
        $dirty7 = $dirty7 & (-234881025);
    L238:
        leadingIcon3 = leadingIcon;
        trailingIcon3 = trailingIcon;
        keyboardOptions3 = keyboardOptions;
        keyboardActions3 = keyboardActions;
        singleLine3 = singleLine;
        maxLines3 = maxLines;
        interactionSource3 = interactionSource;
        shape3 = shape;
        $composer3 = $composer2;
        $dirty12 = $dirty13;
        colors2 = r5;
        textStyle3 = r10;
        label3 = r11;
        placeholder3 = r14;
        modifier3 = r15;
        isError3 = isError;
        visualTransformation3 = visualTransformation;
        goto L298
    L228:
        $dirty13 = $dirty8;
        goto L230
    L305:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        leadingIcon4 = leadingIcon;
        visualTransformation4 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        maxLines4 = maxLines;
        interactionSource4 = interactionSource;
        shape4 = shape;
        colors3 = colors;
        enabled4 = enabled2;
        readOnly4 = readOnly2;
        textStyle4 = r10;
        label4 = r11;
        placeholder4 = r14;
        modifier4 = r15;
        label5 = trailingIcon;
        isError4 = isError;
        keyboardActions4 = keyboardActions;
        singleLine4 = singleLine;
        goto L306
    L214:
        if ((38347923 & $dirty7) != 38347922) goto L217;
        r2 = false;
        goto L219
    L203:
        if ((r93 & 262144) != 0) goto L207;
        int $dirty14 = $dirty1;
        r5 = colors;
        if ($composer2.changed(r5) == false) goto L208;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L209:
        $dirty7 = $dirty14 | r23;
    L208:
        r23 = 33554432;
        goto L209
    L207:
        $dirty14 = $dirty1;
        r5 = colors;
        goto L208
    L182:
        if (($changed1 & 1572864) != 0) goto L190;
        if ($composer2.changed(interactionSource) == false) goto L186;
        int r25 = 1048576;
    L187:
        $dirty1 = $dirty1 | r25;
        goto L190
    L186:
        r25 = 524288;
        goto L187
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ($composer2.changed(maxLines) == false) goto L175;
        int r26 = 131072;
    L176:
        $dirty1 = $dirty1 | r26;
        goto L178
    L175:
        r26 = 65536;
        goto L176
    L159:
        r18 = r1;
        if (($changed1 & 24576) != 0) goto L167;
        if ($composer2.changed(singleLine) == true) goto L165;
        r20 = 8192;
    L165:
        $dirty1 = $dirty1 | r20;
        goto L167
    L137:
        r24 = r0;
        if (($changed1 & 384) != 0) goto L146;
        if ($composer2.changed(keyboardOptions) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty1 = $dirty1 | r29;
        goto L146
    L142:
        r29 = 128;
        goto L143
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(visualTransformation) == false) goto L131;
        int r28 = 32;
    L132:
        $dirty1 = $dirty1 | r28;
        goto L134
    L131:
        r28 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(isError) == false) goto L120;
        int r210 = 4;
    L121:
        $dirty1 = $dirty1 | r210;
        goto L123
    L120:
        r210 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(trailingIcon) == false) goto L109;
        int r35 = 536870912;
    L110:
        $dirty = $dirty | r35;
        goto L112
    L109:
        r35 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(leadingIcon) == false) goto L98;
        int r34 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r34;
        goto L101
    L98:
        r34 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r14 = placeholder;
        if ($composer2.changedInstance(r14) == false) goto L87;
        int r32 = 8388608;
    L88:
        $dirty = $dirty | r32;
        goto L90
    L87:
        r32 = 4194304;
        goto L88
    L89:
        r14 = placeholder;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r11 = label;
        if ($composer2.changedInstance(r11) == false) goto L76;
        int r211 = 1048576;
    L77:
        $dirty = $dirty | r211;
        goto L79
    L76:
        r211 = 524288;
        goto L77
    L78:
        r11 = label;
        goto L79
    L60:
        if ((r93 & 32) != 0) goto L64;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
    L65:
        r212 = 65536;
        goto L66
    L64:
        r10 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r213 = 16384;
    L55:
        $dirty = $dirty | r213;
        goto L58
    L54:
        r213 = 8192;
        goto L55
    L56:
        readOnly2 = readOnly;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
        goto L46
    L43:
        r112 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r15 = modifier;
        if ($composer2.changed(r15) == false) goto L32;
        int r113 = 256;
    L33:
        $dirty = $dirty | r113;
        goto L35
    L32:
        r113 = 128;
        goto L33
    L34:
        r15 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(onValueChange) == false) goto L21;
        int r114 = 32;
    L22:
        $dirty = $dirty | r114;
        goto L24
    L21:
        r114 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(value) == false) goto L10;
        int r9 = 4;
    L11:
        $dirty = $dirty | r9;
        goto L14
    L10:
        r9 = 2;
        goto L11
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r56, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> r57, Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, final Function2<? super Composer, ? super Integer, Unit> r60, final boolean singleLine, final float animationProgress, final Function1<? super Size, Unit> r63, final Function2<? super Composer, ? super Integer, Unit> r64, final PaddingValues paddingValues, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(-2049536174);
        ComposerKt.sourceInformation($composer2, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)689@34038L267,697@34353L7,698@34365L2410:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r16 = 4;
    L8:
        $dirty = $dirty | r16;
        goto L10
    L7:
        r16 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r56) == false) goto L14;
        int r17 = 32;
    L15:
        $dirty = $dirty | r17;
        goto L17
    L14:
        r17 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r57) == false) goto L21;
        int r0 = 256;
    L22:
        $dirty = $dirty | r0;
        goto L24
    L21:
        r0 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r58) == false) goto L28;
        int r1 = 2048;
    L29:
        $dirty = $dirty | r1;
        goto L31
    L28:
        r1 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r59) == false) goto L35;
        int r2 = 16384;
    L36:
        $dirty = $dirty | r2;
        goto L38
    L35:
        r2 = 8192;
    L38:
        if ((196608 & $changed) != 0) goto L45;
        if ($composer2.changedInstance(r60) == false) goto L42;
        int r3 = 131072;
    L43:
        $dirty = $dirty | r3;
        goto L45
    L42:
        r3 = 65536;
    L45:
        if ((1572864 & $changed) != 0) goto L52;
        if ($composer2.changed(singleLine) == false) goto L49;
        int r18 = 1048576;
    L50:
        $dirty = $dirty | r18;
        goto L52
    L49:
        r18 = 524288;
    L52:
        if (($changed & 12582912) != 0) goto L59;
        if ($composer2.changed(animationProgress) == false) goto L56;
        int r19 = 8388608;
    L57:
        $dirty = $dirty | r19;
        goto L59
    L56:
        r19 = 4194304;
    L59:
        if (($changed & 100663296) != 0) goto L66;
        if ($composer2.changedInstance(r63) == false) goto L63;
        int r110 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L64:
        $dirty = $dirty | r110;
        goto L66
    L63:
        r110 = 33554432;
    L66:
        if (($changed & 805306368) != 0) goto L73;
        if ($composer2.changedInstance(r64) == false) goto L70;
        int r111 = 536870912;
    L71:
        $dirty = $dirty | r111;
        goto L73
    L70:
        r111 = 268435456;
    L73:
        if (($changed1 & 6) != 0) goto L80;
        if ($composer2.changed(paddingValues) == false) goto L77;
        int r112 = 4;
    L78:
        $dirty1 = $dirty1 | r112;
        goto L80
    L77:
        r112 = 2;
    L80:
        if (($dirty & 306783379) == 306783378) goto L82;
    L85:
        boolean r4 = true;
    L87:
        if ($composer2.shouldExecute(r4, $dirty & 1) == true) goto L89;
        Function2<? super Composer, ? super Integer, Unit> r5 = r58;
        $composer2 = $composer2;
        $composer2.skipToGroupEnd();
    L217:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L221;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r5;
        r14.updateScope(new AnonymousClass2(modifier, r56, r57, r6, r59, r60, singleLine, animationProgress, r63, r64, paddingValues, $changed, $changed1));
        return;
    L221:
        return;
    L89:
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventStart(-2049536174, $dirty, $dirty1, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:687)");
    L91:
        ComposerKt.sourceInformationMarkerStart($composer2, -1860267526, "CC(remember):OutlinedTextField.kt#9igjgp");
        if ((234881024 & $dirty) != 67108864) goto L94;
        boolean r7 = true;
    L96:
        if ((3670016 & $dirty) != 1048576) goto L98;
        boolean r8 = true;
    L99:
        boolean r9 = r7 | r8;
        if ((29360128 & $dirty) != 8388608) goto L102;
        boolean r10 = true;
    L103:
        boolean r11 = r9 | r10;
        if (($dirty1 & 14) != 4) goto L106;
        boolean r12 = true;
    L107:
        boolean invalid$iv = r11 | r12;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L114;
        if (value$iv == Composer.Companion.getEmpty()) goto L114;
    L115:
        OutlinedTextFieldMeasurePolicy measurePolicy = (OutlinedTextFieldMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<LayoutDirection> r13 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r13);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r15;
        int $changed$iv = ($dirty << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L118;
        ComposablesKt.invalidApplier();
    L118:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L121;
        Function0<ComposeUiNode> r20 = r22;
        $composer2.createNode(r20);
    L122:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        int $dirty2 = $dirty;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L129;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L129;
    L130:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r23 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -978125414, "C706@34869L8,746@36419L182:OutlinedTextField.kt#jmzs0o");
        r64.invoke($composer2, Integer.valueOf(($dirty2 >> 27) & 14));
        if (r59 == null) goto L148;
        $composer2.startReplaceGroup(-978132235);
        ComposerKt.sourceInformation($composer2, "709@34930L223");
        Modifier modifier$iv = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Leading"));
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r42 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L135;
        ComposablesKt.invalidApplier();
    L135:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L138;
        Function0<ComposeUiNode> r24 = r42;
        $composer2.createNode(r24);
    L139:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r113 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L146;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L146;
    L147:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r114 = BoxScopeInstance.INSTANCE;
        int r46 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1899197773, "C713@35126L9:OutlinedTextField.kt#jmzs0o");
        r59.invoke($composer2, Integer.valueOf(($dirty2 >> 12) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
    L149:
        if (r60 == null) goto L166;
        $composer2.startReplaceGroup(-977844493);
        ComposerKt.sourceInformation($composer2, "717@35220L225");
        Modifier modifier$iv2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Trailing"));
        Alignment contentAlignment$iv2 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r39 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L153;
        ComposablesKt.invalidApplier();
    L153:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L156;
        Function0<ComposeUiNode> r26 = r39;
        $composer2.createNode(r26);
    L157:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r115 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L164;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L164;
    L165:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r27 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r116 = BoxScopeInstance.INSTANCE;
        int r43 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1899486476, "C721@35417L10:OutlinedTextField.kt#jmzs0o");
        r60.invoke($composer2, Integer.valueOf(($dirty2 >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
    L167:
        float startTextFieldPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        float endTextFieldPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        Modifier.Companion r37 = Modifier.Companion;
        if (r59 == null) goto L170;
        float other$iv = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv2 = Dp.m6973constructorimpl(startTextFieldPadding - other$iv);
        float minimumValue$iv = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv2, minimumValue$iv));
        float r38 = $this$coerceAtLeast_u2dYgX7TsA$iv;
    L172:
        if (r60 == null) goto L174;
        float other$iv3 = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv4 = Dp.m6973constructorimpl(endTextFieldPadding - other$iv3);
        float minimumValue$iv2 = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv2 = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv4, minimumValue$iv2));
        float r40 = $this$coerceAtLeast_u2dYgX7TsA$iv2;
    L175:
        Modifier padding = PaddingKt.m729paddingqDBjuR0$default(r37, r38, 0.0f, r40, 0.0f, 10, null);
        if (r57 == null) goto L178;
        $composer2.startReplaceGroup(-976746535);
        ComposerKt.sourceInformation($composer2, "743@36332L59");
        r57.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(padding), $composer2, Integer.valueOf(($dirty2 >> 3) & 112));
        $composer2.endReplaceGroup();
    L179:
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(padding);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, true);
        int $changed$iv$iv4 = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L182;
        ComposablesKt.invalidApplier();
    L182:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L185;
        Function0<ComposeUiNode> r28 = r41;
        $composer2.createNode(r28);
    L186:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r29 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L193;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == false) goto L193;
    L194:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r30 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r31 = BoxScopeInstance.INSTANCE;
        int r44 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1900636235, "C750@36576L11:OutlinedTextField.kt#jmzs0o");
        r56.invoke($composer2, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r58 == null) goto L212;
        $composer2.startReplaceGroup(-976429250);
        ComposerKt.sourceInformation($composer2, "754@36652L54");
        Modifier modifier$iv4 = LayoutIdKt.layoutId(Modifier.Companion, "Label");
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv4 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv4, false);
        int $changed$iv$iv5 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer2, modifier$iv4);
        Function0<ComposeUiNode> r117 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv4 = (($changed$iv$iv5 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L199;
        ComposablesKt.invalidApplier();
    L199:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L202;
        Function0<ComposeUiNode> r32 = r117;
        $composer2.createNode(r32);
    L203:
        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r33 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv4.getInserting() == true) goto L209;
        int $changed$iv2 = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4)) == true) goto L211;
    L210:
        $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
        $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), r33);
    L211:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
        int r34 = ($changed$iv$iv$iv4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r35 = BoxScopeInstance.INSTANCE;
        int r118 = (($changed$iv2 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1900756143, "C754@36697L7:OutlinedTextField.kt#jmzs0o");
        r5 = r58;
        r5.invoke($composer2, Integer.valueOf(($dirty2 >> 9) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
    L213:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L217;
        ComposerKt.traceEventEnd();
        goto L217
    L209:
        $changed$iv2 = 6;
        goto L210
    L202:
        r32 = r117;
        $composer2.useNode();
        goto L203
    L212:
        r5 = r58;
        $composer2.startReplaceGroup(-976346604);
        $composer2.endReplaceGroup();
    L193:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r29);
        goto L194
    L185:
        r28 = r41;
        $composer2.useNode();
        goto L186
    L178:
        $composer2.startReplaceGroup(-976659084);
        $composer2.endReplaceGroup();
        goto L179
    L174:
        r40 = endTextFieldPadding;
        goto L175
    L170:
        r38 = startTextFieldPadding;
    L164:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r115);
        goto L165
    L156:
        r26 = r39;
        $composer2.useNode();
        goto L157
    L166:
        $composer2.startReplaceGroup(-977597516);
        $composer2.endReplaceGroup();
    L146:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r113);
        goto L147
    L138:
        r24 = r42;
        $composer2.useNode();
        goto L139
    L148:
        $composer2.startReplaceGroup(-977887180);
        $composer2.endReplaceGroup();
    L129:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r21);
        goto L130
    L121:
        r20 = r22;
        $composer2.useNode();
    L114:
        value$iv = new OutlinedTextFieldMeasurePolicy(r63, singleLine, animationProgress, paddingValues);
        $composer2.updateRememberedValue(value$iv);
        goto L115
    L106:
        r12 = false;
        goto L107
    L102:
        r10 = false;
        goto L103
    L98:
        r8 = false;
        goto L99
    L94:
        r7 = false;
        goto L96
    L82:
        if (($dirty1 & 3) != 2) goto L85;
        r4 = false;
        goto L87
    }

    private static final int substractConstraintSafely(int $this$substractConstraintSafely, int from) {
        if ($this$substractConstraintSafely != Integer.MAX_VALUE) goto L6;
        return $this$substractConstraintSafely;
    L6:
        return $this$substractConstraintSafely - from;
    }

    /* JADX INFO: renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    private static final int m1718calculateWidthO3s9Psw(int leadingPlaceableWidth, int trailingPlaceableWidth, int textFieldPlaceableWidth, int labelPlaceableWidth, int placeholderPlaceableWidth, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        int middleSection = Math.max(textFieldPlaceableWidth, Math.max(MathHelpersKt.lerp(labelPlaceableWidth, 0, animationProgress), placeholderPlaceableWidth));
        int wrappedWidth = (leadingPlaceableWidth + middleSection) + trailingPlaceableWidth;
        float arg0$iv = paddingValues.mo675calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr);
        float other$iv = paddingValues.mo676calculateRightPaddingu2uoSUM(LayoutDirection.Ltr);
        float labelHorizontalPadding = Dp.m6973constructorimpl(arg0$iv + other$iv) * density;
        int focusedLabelWidth = MathKt.roundToInt((labelPlaceableWidth + labelHorizontalPadding) * animationProgress);
        return ConstraintsKt.m6943constrainWidthK40F9xA(constraints, Math.max(wrappedWidth, focusedLabelWidth));
    }

    /* JADX INFO: renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    private static final int m1717calculateHeightO3s9Psw(int leadingPlaceableHeight, int trailingPlaceableHeight, int textFieldPlaceableHeight, int labelPlaceableHeight, int placeholderPlaceableHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        int inputFieldHeight = Math.max(textFieldPlaceableHeight, Math.max(placeholderPlaceableHeight, MathHelpersKt.lerp(labelPlaceableHeight, 0, animationProgress)));
        float topPadding = paddingValues.mo677calculateTopPaddingD9Ej5fM() * density;
        float actualTopPadding = MathHelpersKt.lerp(topPadding, Math.max(topPadding, labelPlaceableHeight / 2.0f), animationProgress);
        float bottomPadding = paddingValues.mo674calculateBottomPaddingD9Ej5fM() * density;
        float middleSectionHeight = (inputFieldHeight + actualTopPadding) + bottomPadding;
        return ConstraintsKt.m6942constrainHeightK40F9xA(constraints, Math.max(leadingPlaceableHeight, Math.max(trailingPlaceableHeight, MathKt.roundToInt(middleSectionHeight))));
    }

    private static final void place(Placeable.PlacementScope $this$place, int height, int width, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable textFieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable borderPlaceable, float animationProgress, boolean singleLine, float density, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int topPadding = MathKt.roundToInt(paddingValues.mo677calculateTopPaddingD9Ej5fM() * density);
        int startPadding = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * density);
        float iconPadding = TextFieldImplKt.getHorizontalIconPadding() * density;
        if (leadingPlaceable == null) goto L5;
        Placeable.PlacementScope.placeRelative$default($this$place, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
    L5:
        if (trailingPlaceable == null) goto L7;
        Placeable.PlacementScope.placeRelative$default($this$place, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
    L7:
        if (labelPlaceable != null) goto L9;
    L18:
        if (singleLine == false) goto L20;
        int r7 = Alignment.Companion.getCenterVertically().align(textFieldPlaceable.getHeight(), height);
    L21:
        int textVerticalPosition = Math.max(r7, TextFieldImplKt.heightOrZero(labelPlaceable) / 2);
        Placeable.PlacementScope.placeRelative$default($this$place, textFieldPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textVerticalPosition, 0.0f, 4, null);
        if (placeholderPlaceable != null) goto L24;
    L28:
        Placeable.PlacementScope.m5778place70tqf50$default($this$place, borderPlaceable, IntOffset.Companion.m7112getZeronOccac(), 0.0f, 2, null);
        return;
    L24:
        if (singleLine == false) goto L26;
        int r9 = Alignment.Companion.getCenterVertically().align(placeholderPlaceable.getHeight(), height);
    L27:
        int placeholderVerticalPosition = Math.max(r9, TextFieldImplKt.heightOrZero(labelPlaceable) / 2);
        Placeable.PlacementScope.placeRelative$default($this$place, placeholderPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), placeholderVerticalPosition, 0.0f, 4, null);
        goto L28
    L26:
        r9 = topPadding;
        goto L27
    L20:
        r7 = topPadding;
        goto L21
    L9:
        if (singleLine == false) goto L11;
        int startPositionY = Alignment.Companion.getCenterVertically().align(labelPlaceable.getHeight(), height);
    L12:
        int positionY = MathHelpersKt.lerp(startPositionY, -(labelPlaceable.getHeight() / 2), animationProgress);
        if (leadingPlaceable != null) goto L15;
        float r10 = 0.0f;
    L16:
        int positionX = MathKt.roundToInt(r10) + startPadding;
        Placeable.PlacementScope.placeRelative$default($this$place, labelPlaceable, positionX, positionY, 0.0f, 4, null);
        goto L18
    L15:
        r10 = (TextFieldImplKt.widthOrZero(leadingPlaceable) - iconPadding) * (1.0f - animationProgress);
        goto L16
    L11:
        startPositionY = topPadding;
        goto L12
    }

    /* JADX INFO: renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1719outlineCutout12SF9DM(Modifier $this$outlineCutout_u2d12SF9DM, final long labelSize, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent($this$outlineCutout_u2d12SF9DM, new OutlinedTextFieldKt$outlineCutout$1(labelSize, paddingValues));
    }

    static {
        OutlinedTextFieldInnerPadding = Dp.m6973constructorimpl(4);
        OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
