package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0085\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0002\u0010-\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u00109\u001a\u0093\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010;\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020<2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010=\u001a\u0093\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020<2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010>\u001a\u009a\u0001\u0010?\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u000101¢\u0006\u0002\b\u00162\u0013\u0010A\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0013\u0010B\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0006\u00106\u001a\u00020\u00102\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\u0010G\u001aZ\u0010H\u001a\u0002082\u0006\u0010I\u001a\u0002082\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u0002082\u0006\u0010L\u001a\u0002082\u0006\u0010M\u001a\u0002082\u0006\u0010N\u001a\u0002082\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001aB\u0010T\u001a\u0002082\u0006\u0010U\u001a\u0002082\u0006\u0010V\u001a\u0002082\u0006\u0010W\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010Y\u001a\u0002082\u0006\u0010O\u001a\u00020PH\u0002ø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001a\u0014\u0010\\\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010]\u001a\u00020^H\u0000\u001at\u0010_\u001a\u00020\n*\u00020`2\u0006\u0010a\u001a\u0002082\u0006\u0010b\u001a\u0002082\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010d2\b\u0010f\u001a\u0004\u0018\u00010d2\b\u0010g\u001a\u0004\u0018\u00010d2\b\u0010h\u001a\u0004\u0018\u00010d2\u0006\u00106\u001a\u00020\u00102\u0006\u0010i\u001a\u0002082\u0006\u0010j\u001a\u0002082\u0006\u0010C\u001a\u00020D2\u0006\u0010Q\u001a\u00020DH\u0002\u001aZ\u0010k\u001a\u00020\n*\u00020`2\u0006\u0010a\u001a\u0002082\u0006\u0010b\u001a\u0002082\u0006\u0010l\u001a\u00020d2\b\u0010f\u001a\u0004\u0018\u00010d2\b\u0010g\u001a\u0004\u0018\u00010d2\b\u0010h\u001a\u0004\u0018\u00010d2\u0006\u00106\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002\u001a\u0014\u0010m\u001a\u000208*\u0002082\u0006\u0010n\u001a\u000208H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "TextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldKt {
    private static final float FirstBaselineOffset = 0.0f;
    private static final float TextFieldBottomPadding = 0.0f;
    private static final float TextFieldTopPadding = 0.0f;

    /* JADX INFO: renamed from: access$calculateHeight-O3s9Psw, reason: not valid java name */
    public static final /* synthetic */ int m1837access$calculateHeightO3s9Psw(int textFieldHeight, boolean hasLabel, int labelBaseline, int leadingHeight, int trailingHeight, int placeholderHeight, long constraints, float density, PaddingValues paddingValues) {
        return m1839calculateHeightO3s9Psw(textFieldHeight, hasLabel, labelBaseline, leadingHeight, trailingHeight, placeholderHeight, constraints, density, paddingValues);
    }

    /* JADX INFO: renamed from: access$calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final /* synthetic */ int m1838access$calculateWidthVsPV1Ek(int leadingWidth, int trailingWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        return m1840calculateWidthVsPV1Ek(leadingWidth, trailingWidth, textFieldWidth, labelWidth, placeholderWidth, constraints);
    }

    public static final /* synthetic */ void access$placeWithLabel(Placeable.PlacementScope $receiver, int width, int height, Placeable textfieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, boolean singleLine, int labelEndPosition, int textPosition, float animationProgress, float density) {
        placeWithLabel($receiver, width, height, textfieldPlaceable, labelPlaceable, placeholderPlaceable, leadingPlaceable, trailingPlaceable, singleLine, labelEndPosition, textPosition, animationProgress, density);
    }

    public static final /* synthetic */ void access$placeWithoutLabel(Placeable.PlacementScope $receiver, int width, int height, Placeable textPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, boolean singleLine, float density, PaddingValues paddingValues) {
        placeWithoutLabel($receiver, width, height, textPlaceable, placeholderPlaceable, leadingPlaceable, trailingPlaceable, singleLine, density, paddingValues);
    }

    public static final /* synthetic */ int access$substractConstraintSafely(int $receiver, int from) {
        return substractConstraintSafely($receiver, from);
    }

    public static final void TextField(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r78, Function2<? super Composer, ? super Integer, Unit> r79, Function2<? super Composer, ? super Integer, Unit> r80, Function2<? super Composer, ? super Integer, Unit> r81, boolean isError, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, TextFieldLineLimits lineLimits, ScrollState scrollState, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r95) {
        Composer $composer2 = $composer.startRestartGroup(-1967634894);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(16,9,1,13,17,6,12,7,18,4,2,11,5,10,8,14,15)209@11167L38,217@11511L20,204@10964L2201:TextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r95 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r9 = r95 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r95 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L35:
        int r16 = r95 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r8 = readOnly;
    L46:
        int r21 = 8192;
        if (($changed & 24576) == 0) goto L49;
        TextStyle textStyle2 = textStyle;
    L57:
        int r23 = r95 & 32;
        if (r23 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r11 = r78;
    L68:
        int r28 = r95 & 64;
        if (r28 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r14 = r79;
    L79:
        int r15 = r95 & 128;
        if (r15 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r0 = r95 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r1 = r95 & 512;
        if (r1 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r95 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int r3 = r95 & 2048;
        if (r3 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int r4 = r95 & 4096;
        if (r4 == 0) goto L137;
        $dirty1 = $dirty1 | 384;
        int r20 = r4;
    L145:
        int r5 = r95 & 8192;
        if (r5 == 0) goto L148;
        $dirty1 = $dirty1 | 3072;
        int r27 = r5;
    L157:
        if (($changed1 & 24576) != 0) goto L167;
        if ((r95 & 16384) != 0) goto L164;
        if ($composer2.changed(lineLimits) == false) goto L164;
        r21 = 16384;
    L164:
        $dirty1 = $dirty1 | r21;
    L167:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L178;
        if ((r95 & 32768) != 0) goto L174;
        if ($composer2.changed(scrollState) == false) goto L174;
        int r18 = 131072;
    L175:
        $dirty1 = $dirty1 | r18;
    L174:
        r18 = 65536;
    L178:
        if (($changed1 & 1572864) != 0) goto L189;
        if ((r95 & 65536) != 0) goto L185;
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
        int r52 = r95 & 262144;
        if (r52 == 0) goto L203;
        $dirty2 = $dirty2 | 100663296;
    L211:
        if (($dirty & 306783379) == 306783378) goto L213;
    L216:
        boolean r6 = true;
    L218:
        if ($composer2.shouldExecute(r6, $dirty & 1) == false) goto L320;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "181@9790L7,192@10353L21,193@10413L14,194@10477L17");
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
        if ((r95 & 16) == 0) goto L252;
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
        if ((r95 & 16384) == 0) goto L283;
        $dirty2 = $dirty2 & (-57345);
        TextFieldLineLimits lineLimits2 = TextFieldLineLimits.Companion.getDefault();
    L285:
        if ((32768 & r95) == 0) goto L287;
        $dirty2 = $dirty2 & (-458753);
        ScrollState scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L289:
        if ((r95 & 65536) == 0) goto L291;
        Shape shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer2, 6);
        int $dirty4 = $dirty2 & (-3670017);
    L293:
        if ((r95 & 131072) == 0) goto L295;
        boolean r70 = true;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        $dirty4 = $dirty4 & (-29360129);
    L296:
        if (r52 == 0) goto L298;
        MutableInteractionSource interactionSource2 = null;
        modifier2 = modifier3;
        enabled2 = enabled3;
        textStyle2 = textStyle3;
        int $dirty5 = $dirty3;
        int $dirty6 = $dirty4;
    L299:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L302;
        ComposerKt.traceEventStart(-1967634894, $dirty5, $dirty6, "androidx.compose.material.TextField (TextField.kt:196)");
    L302:
        if (interactionSource2 != null) goto L308;
        $composer3.startReplaceGroup(-1673838860);
        ComposerKt.sourceInformation($composer3, "198@10638L39");
        ComposerKt.sourceInformationMarkerStart($composer3, -53994802, "CC(remember):TextField.kt#9igjgp");
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
        $composer3.startReplaceGroup(-53989707);
        ComposerKt.sourceInformation($composer3, "*200@10817L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L312;
        boolean r110 = r70;
    L313:
        if (r110 == true) goto L316;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty5 >> 6) & 14) | (($dirty6 >> 18) & 112)).getValue().m4376unboximpl();
    L316:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle2.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        final TextFieldColors colors3 = colors2;
        final boolean enabled4 = enabled2;
        final boolean isError3 = isError2;
        Modifier r10 = SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1816indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier2, enabled4, isError3, interactionSource3, colors3, 0.0f, 0.0f, 48, null), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM());
        SolidColor r22 = new SolidColor(colors3.cursorColor(isError3, $composer3, (($dirty5 >> 27) & 14) | (($dirty6 >> 18) & 112)).getValue().m4376unboximpl(), null);
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Function2<? super Composer, ? super Integer, Unit> r82 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r83 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r84 = r59;
        final Function2<? super Composer, ? super Integer, Unit> r85 = r60;
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
        BasicTextFieldKt.BasicTextField(state, r10, enabled4, readOnly3, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, lineLimits4, null, interactionSource5, r22, outputTransformation2, new AnonymousClass1(outputTransformation3, state, lineLimits3, enabled4, interactionSource4, isError3, r82, r83, r84, r85, shape3, colors3), scrollState2, $composer4, (((((($dirty5 & 14) | ($dirty5 & 896)) | ($dirty5 & 7168)) | (($dirty6 << 12) & 57344)) | (($dirty6 << 12) & 3670016)) | (($dirty6 << 12) & 29360128)) | (234881024 & ($dirty6 << 12)), (($dirty6 << 3) & 896) | (($dirty6 >> 3) & 57344), 512);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L319;
        ComposerKt.traceEventEnd();
    L319:
        final MutableInteractionSource interactionSource6 = interactionSource2;
        final TextFieldColors colors4 = colors3;
        final TextStyle textStyle4 = textStyle2;
        final Modifier modifier4 = modifier2;
        final boolean enabled5 = enabled4;
        final boolean readOnly4 = readOnly2;
        final Function2<? super Composer, ? super Integer, Unit> r24 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r25 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r26 = r59;
        final InputTransformation inputTransformation4 = inputTransformation2;
        final OutputTransformation outputTransformation4 = outputTransformation2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
        final KeyboardActionHandler onKeyboardAction4 = onKeyboardAction2;
        final TextFieldLineLimits lineLimits5 = lineLimits2;
        final ScrollState scrollState3 = scrollState2;
        final Shape shape4 = shape2;
        final boolean isError4 = isError3;
        final Function2<? super Composer, ? super Integer, Unit> r29 = r60;
    L321:
        ScopeUpdateScope r30 = $composer5.endRestartGroup();
        if (r30 == null) goto L325;
        r30.updateScope(new AnonymousClass2(state, modifier4, enabled5, readOnly4, textStyle4, r24, r25, r26, r29, isError4, inputTransformation4, outputTransformation4, keyboardOptions4, onKeyboardAction4, lineLimits5, scrollState3, shape4, colors4, interactionSource6, $changed, $changed1, r95));
        return;
    L325:
        return;
    L312:
        r110 = false;
        goto L313
    L308:
        $composer3.startReplaceGroup(-53995453);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L309
    L298:
        interactionSource2 = interactionSource;
        modifier2 = modifier3;
        enabled2 = enabled3;
        textStyle2 = textStyle3;
        $dirty5 = $dirty3;
        $dirty6 = $dirty4;
        goto L299
    L295:
        $composer3 = $composer2;
        r70 = true;
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
        r60 = r81;
        goto L265
    L261:
        r59 = r80;
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
        if ((r95 & 16) == 0) goto L228;
        $dirty = $dirty & (-57345);
    L228:
        if ((r95 & 16384) == 0) goto L231;
        $dirty2 = $dirty2 & (-57345);
    L231:
        if ((32768 & r95) == 0) goto L234;
        $dirty2 = $dirty2 & (-458753);
    L234:
        if ((r95 & 65536) == 0) goto L237;
        $dirty2 = $dirty2 & (-3670017);
    L237:
        if ((r95 & 131072) == 0) goto L239;
        $composer3 = $composer2;
        r59 = r80;
        r60 = r81;
        isError2 = isError;
        inputTransformation2 = inputTransformation;
        outputTransformation2 = outputTransformation;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        lineLimits2 = lineLimits;
        scrollState2 = scrollState;
        shape2 = shape;
        r70 = true;
        readOnly2 = r8;
        r57 = r11;
        r58 = r14;
        interactionSource2 = interactionSource;
        $dirty6 = $dirty2 & (-29360129);
        $dirty5 = $dirty;
        colors2 = colors;
        goto L299
    L239:
        $composer3 = $composer2;
        r59 = r80;
        r60 = r81;
        isError2 = isError;
        inputTransformation2 = inputTransformation;
        outputTransformation2 = outputTransformation;
        keyboardOptions2 = keyboardOptions;
        onKeyboardAction2 = onKeyboardAction;
        lineLimits2 = lineLimits;
        scrollState2 = scrollState;
        shape2 = shape;
        $dirty5 = $dirty;
        r70 = true;
        readOnly2 = r8;
        r57 = r11;
        r58 = r14;
        $dirty6 = $dirty2;
        colors2 = colors;
        interactionSource2 = interactionSource;
        goto L299
    L320:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r29 = r81;
        keyboardOptions4 = keyboardOptions;
        lineLimits5 = lineLimits;
        scrollState3 = scrollState;
        colors4 = colors;
        interactionSource6 = interactionSource;
        enabled5 = enabled2;
        readOnly4 = r8;
        textStyle4 = textStyle2;
        r24 = r11;
        modifier4 = modifier2;
        r25 = r14;
        r26 = r80;
        isError4 = isError;
        inputTransformation4 = inputTransformation;
        outputTransformation4 = outputTransformation;
        onKeyboardAction4 = onKeyboardAction;
        shape4 = shape;
        goto L321
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
        if ((r95 & 131072) != 0) goto L195;
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
        if ($composer2.changedInstance(r81) == false) goto L98;
        int r33 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r33;
        goto L101
    L98:
        r33 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r80) == false) goto L87;
        int r31 = 8388608;
    L88:
        $dirty = $dirty | r31;
        goto L90
    L87:
        r31 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r14 = r79;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r32 = 1048576;
    L77:
        $dirty = $dirty | r32;
        goto L79
    L76:
        r32 = 524288;
        goto L77
    L78:
        r14 = r79;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r11 = r78;
        if ($composer2.changedInstance(r11) == false) goto L65;
        int r212 = 131072;
    L66:
        $dirty = $dirty | r212;
        goto L68
    L65:
        r212 = 65536;
        goto L66
    L67:
        r11 = r78;
        goto L68
    L49:
        if ((r95 & 16) != 0) goto L53;
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
        int r35 = 4;
    L11:
        $dirty = $dirty | r35;
        goto L13
    L10:
        r35 = 2;
        goto L11
    }

    public static final void TextField(final String value, final Function1<? super String, Unit> r105, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r110, Function2<? super Composer, ? super Integer, Unit> r111, Function2<? super Composer, ? super Integer, Unit> r112, Function2<? super Composer, ? super Integer, Unit> r113, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r127) {
        Composer $composer2 = $composer.startRestartGroup(-1504264404);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)357@19267L38,366@19650L20,375@20004L787,352@19064L1733:TextField.kt#jmzs0o");
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
        Modifier modifier2 = modifier;
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
        if ($composer2.shouldExecute(r2, $dirty7 & 1) == false) goto L335;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "329@17927L7,342@18571L14,343@18635L17");
        if (($changed & 1) != 0) goto L233;
    L252:
        if (r12 == 0) goto L254;
        Modifier.Companion modifier3 = Modifier.Companion;
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
        Shape shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer2, 6);
        int $dirty10 = $dirty9 & (-234881025);
    L311:
        if ((r127 & 524288) == 0) goto L313;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        modifier2 = modifier3;
        int $dirty11 = $dirty10 & (-1879048193);
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        TextStyle textStyle3 = textStyle2;
        int $dirty12 = $dirty8;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        boolean singleLine3 = singleLine2;
        int maxLines4 = maxLines3;
        int minLines3 = minLines2;
    L314:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L317;
        ComposerKt.traceEventStart(-1504264404, $dirty12, $dirty11, "androidx.compose.material.TextField (TextField.kt:344)");
    L317:
        if (interactionSource2 != null) goto L323;
        $composer3.startReplaceGroup(-1665803660);
        ComposerKt.sourceInformation($composer3, "346@18738L39");
        ComposerKt.sourceInformationMarkerStart($composer3, -53735602, "CC(remember):TextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L322;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L322:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L324:
        $composer3.startReplaceGroup(-53730507);
        ComposerKt.sourceInformation($composer3, "*348@18917L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L327;
        boolean r25 = true;
    L328:
        if (r25 == true) goto L331;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty12 >> 9) & 14) | (($dirty11 >> 24) & 112)).getValue().m4376unboximpl();
    L331:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        final boolean enabled4 = enabled2;
        Modifier modifier4 = modifier2;
        final boolean isError3 = isError2;
        TextStyle textStyle4 = textStyle3;
        Modifier r3 = SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1816indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, enabled4, isError3, interactionSource3, colors2, 0.0f, 0.0f, 48, null), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM());
        SolidColor r117 = new SolidColor(colors2.cursorColor(isError3, $composer3, ($dirty11 & 14) | (($dirty11 >> 24) & 112)).getValue().m4376unboximpl(), null);
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final TextFieldColors colors3 = colors2;
        final boolean isError4 = singleLine3;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r1110 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r1111 = r59;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final Shape shape3 = shape2;
        Composer $composer4 = $composer3;
        BasicTextFieldKt.BasicTextField(value, r105, r3, enabled2, readOnly2, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines4, minLines3, visualTransformation3, null, interactionSource4, r117, ComposableLambdaKt.rememberComposableLambda(989834338, true, new AnonymousClass3(value, enabled4, isError4, visualTransformation3, interactionSource4, isError3, r118, r119, r1110, r1111, shape3, colors3), $composer3, 54), $composer4, ((((((($dirty12 & 14) | ($dirty12 & 112)) | ($dirty12 & 7168)) | (57344 & $dirty12)) | (($dirty11 << 12) & 3670016)) | (($dirty11 << 12) & 29360128)) | (($dirty11 << 12) & 234881024)) | (1879048192 & ($dirty11 << 12)), ((($dirty11 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty11 & 112), 4096);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L334;
        ComposerKt.traceEventEnd();
    L334:
        final boolean singleLine4 = singleLine3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final TextFieldColors colors4 = colors3;
        final TextStyle textStyle5 = textStyle4;
        final boolean enabled5 = enabled2;
        final boolean readOnly4 = readOnly2;
        final int maxLines5 = maxLines4;
        final int minLines4 = minLines3;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r58;
        final MutableInteractionSource interactionSource5 = interactionSource2;
        final Shape shape4 = shape2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final Function2<? super Composer, ? super Integer, Unit> r120 = r59;
        final boolean isError5 = isError3;
        final Modifier modifier5 = modifier4;
    L336:
        ScopeUpdateScope r5 = $composer5.endRestartGroup();
        if (r5 == null) goto L340;
        r5.updateScope(new AnonymousClass4(value, r105, modifier5, enabled5, readOnly4, textStyle5, r8, r9, r15, r120, isError5, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines5, minLines4, interactionSource5, shape4, colors4, $changed, $changed1, r127));
        return;
    L340:
        return;
    L327:
        r25 = false;
        goto L328
    L323:
        $composer3.startReplaceGroup(-53736253);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L324
    L313:
        $composer3 = $composer2;
        colors2 = colors;
        keyboardActions3 = keyboardActions2;
        modifier2 = modifier3;
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        textStyle3 = textStyle2;
        $dirty12 = $dirty8;
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
        modifier3 = modifier2;
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
        $composer3 = $composer2;
        r58 = r112;
        r59 = r113;
        isError2 = isError;
        visualTransformation2 = visualTransformation;
        singleLine3 = singleLine;
        maxLines4 = maxLines;
        interactionSource2 = interactionSource;
        shape2 = shape;
        colors2 = colors;
        $dirty12 = $dirty13;
        r56 = r11;
        r57 = r14;
        keyboardActions3 = keyboardActions;
        minLines3 = minLines;
        $dirty11 = $dirty6;
        textStyle3 = r10;
        keyboardOptions3 = keyboardOptions;
        goto L314
    L238:
        $dirty13 = $dirty7;
        goto L240
    L335:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r15 = r112;
        visualTransformation4 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        maxLines5 = maxLines;
        minLines4 = minLines;
        interactionSource5 = interactionSource;
        shape4 = shape;
        colors4 = colors;
        enabled5 = enabled2;
        readOnly4 = readOnly2;
        textStyle5 = r10;
        r8 = r11;
        r9 = r14;
        modifier5 = modifier2;
        r120 = r113;
        isError5 = isError;
        keyboardActions4 = keyboardActions;
        singleLine4 = singleLine;
        goto L336
    L224:
        if ((306783379 & $dirty6) != 306783378) goto L227;
        r2 = false;
        goto L229
    L213:
        if ((r127 & 524288) != 0) goto L217;
        int $dirty14 = $dirty1;
        if ($composer2.changed(colors) == false) goto L218;
        int r26 = 536870912;
    L219:
        $dirty6 = $dirty14 | r26;
    L218:
        r26 = 268435456;
        goto L219
    L217:
        $dirty14 = $dirty1;
        goto L218
    L192:
        if (($changed1 & 12582912) != 0) goto L200;
        if ($composer2.changed(interactionSource) == false) goto L196;
        int r27 = 8388608;
    L197:
        $dirty1 = $dirty1 | r27;
        goto L200
    L196:
        r27 = 4194304;
        goto L197
    L181:
        if (($changed1 & 1572864) != 0) goto L188;
        if ($composer2.changed(minLines) == false) goto L185;
        int r28 = 1048576;
    L186:
        $dirty1 = $dirty1 | r28;
        goto L188
    L185:
        r28 = 524288;
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
        int r210 = 32;
    L132:
        $dirty1 = $dirty1 | r210;
        goto L134
    L131:
        r210 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(isError) == false) goto L120;
        int r211 = 4;
    L121:
        $dirty1 = $dirty1 | r211;
        goto L123
    L120:
        r211 = 2;
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
        int r212 = 1048576;
    L77:
        $dirty = $dirty | r212;
        goto L79
    L76:
        r212 = 524288;
        goto L77
    L78:
        r11 = r110;
        goto L79
    L60:
        if ((r127 & 32) != 0) goto L64;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L65;
        int r213 = 131072;
    L66:
        $dirty = $dirty | r213;
    L65:
        r213 = 65536;
        goto L66
    L64:
        r10 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r214 = 16384;
    L55:
        $dirty = $dirty | r214;
        goto L58
    L54:
        r214 = 8192;
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
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r122 = 256;
    L33:
        $dirty = $dirty | r122;
        goto L35
    L32:
        r122 = 128;
        goto L33
    L34:
        modifier2 = modifier;
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
    public static final /* synthetic */ void TextField(final String value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r93) {
        Composer $composer2 = $composer.startRestartGroup(-1690895095);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)423@21937L408:TextField.kt#jmzs0o");
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
        ComposerKt.sourceInformation($composer2, "407@21150L7,418@21704L39,420@21786L6,421@21911L17");
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
        ComposerKt.sourceInformationMarkerStart($composer2, -53640690, "CC(remember):TextField.kt#9igjgp");
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
        Shape shape2 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes($composer2, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        int $dirty11 = $dirty10 & (-29360129);
    L295:
        if ((262144 & r93) == 0) goto L297;
        Composer $composer3 = $composer2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        Modifier modifier3 = modifier2;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer3, 0, 0, 48, 2097151);
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
        ComposerKt.traceEventStart(-1690895095, $dirty12, $dirty7, "androidx.compose.material.TextField (TextField.kt:422)");
    L301:
        TextField(value, onValueChange, modifier3, enabled2, readOnly2, textStyle3, label3, placeholder3, leadingIcon3, trailingIcon3, isError3, visualTransformation3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, 1, interactionSource3, shape3, colors2, $composer3, ((((((((($dirty12 & 14) | ($dirty12 & 112)) | ($dirty12 & 896)) | ($dirty12 & 7168)) | (57344 & $dirty12)) | (458752 & $dirty12)) | (3670016 & $dirty12)) | (29360128 & $dirty12)) | (234881024 & $dirty12)) | (1879048192 & $dirty12), ((((((((($dirty7 & 14) | 1572864) | ($dirty7 & 112)) | ($dirty7 & 896)) | ($dirty7 & 7168)) | (57344 & $dirty7)) | (458752 & $dirty7)) | (($dirty7 << 3) & 29360128)) | (($dirty7 << 3) & 234881024)) | (($dirty7 << 3) & 1879048192), 0);
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
        r3.updateScope(new AnonymousClass6(value, onValueChange, modifier4, enabled4, readOnly4, textStyle4, label4, placeholder4, leadingIcon4, label5, isError4, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines4, interactionSource4, shape4, colors3, $changed, $changed1, r93));
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

    public static final void TextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> r105, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> r110, Function2<? super Composer, ? super Integer, Unit> r111, Function2<? super Composer, ? super Integer, Unit> r112, Function2<? super Composer, ? super Integer, Unit> r113, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r127) {
        Composer $composer2 = $composer.startRestartGroup(-359119489);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)548@28650L38,557@29033L20,566@29387L792,543@28447L1738:TextField.kt#jmzs0o");
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
        Modifier modifier2 = modifier;
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
        if ($composer2.shouldExecute(r2, $dirty7 & 1) == false) goto L335;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "520@27310L7,533@27954L14,534@28018L17");
        if (($changed & 1) != 0) goto L233;
    L252:
        if (r12 == 0) goto L254;
        Modifier.Companion modifier3 = Modifier.Companion;
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
        Shape shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer2, 6);
        int $dirty10 = $dirty9 & (-234881025);
    L311:
        if ((r127 & 524288) == 0) goto L313;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 48, 2097151);
        Composer $composer3 = $composer2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        modifier2 = modifier3;
        int $dirty11 = $dirty10 & (-1879048193);
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        TextStyle textStyle3 = textStyle2;
        int $dirty12 = $dirty8;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        boolean singleLine3 = singleLine2;
        int maxLines4 = maxLines3;
        int minLines3 = minLines2;
    L314:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L317;
        ComposerKt.traceEventStart(-359119489, $dirty12, $dirty11, "androidx.compose.material.TextField (TextField.kt:535)");
    L317:
        if (interactionSource2 != null) goto L323;
        $composer3.startReplaceGroup(-1656495724);
        ComposerKt.sourceInformation($composer3, "537@28121L39");
        ComposerKt.sourceInformationMarkerStart($composer3, -53435346, "CC(remember):TextField.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L322;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L322:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L324:
        $composer3.startReplaceGroup(-53430251);
        ComposerKt.sourceInformation($composer3, "*539@28300L18");
        long $this$takeOrElse_u2dDxMtmZc$iv = textStyle3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L327;
        boolean r25 = true;
    L328:
        if (r25 == true) goto L331;
        $this$takeOrElse_u2dDxMtmZc$iv = colors2.textColor(enabled2, $composer3, (($dirty12 >> 9) & 14) | (($dirty11 >> 24) & 112)).getValue().m4376unboximpl();
    L331:
        $composer3.endReplaceGroup();
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        TextStyle mergedTextStyle = textStyle3.merge(new TextStyle(textColor, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777214, null));
        final boolean enabled4 = enabled2;
        Modifier modifier4 = modifier2;
        final boolean isError3 = isError2;
        TextStyle textStyle4 = textStyle3;
        Modifier r3 = SizeKt.m756defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1816indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, enabled4, isError3, interactionSource3, colors2, 0.0f, 0.0f, 48, null), isError3, Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1775getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1823getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1822getMinHeightD9Ej5fM());
        SolidColor r117 = new SolidColor(colors2.cursorColor(isError3, $composer3, ($dirty11 & 14) | (($dirty11 >> 24) & 112)).getValue().m4376unboximpl(), null);
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final TextFieldColors colors3 = colors2;
        final boolean isError4 = singleLine3;
        final Function2<? super Composer, ? super Integer, Unit> r118 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r119 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r1110 = r58;
        final Function2<? super Composer, ? super Integer, Unit> r1111 = r59;
        final VisualTransformation visualTransformation3 = visualTransformation2;
        final Shape shape3 = shape2;
        Composer $composer4 = $composer3;
        BasicTextFieldKt.BasicTextField(value, r105, r3, enabled2, readOnly2, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines4, minLines3, visualTransformation3, null, interactionSource4, r117, ComposableLambdaKt.rememberComposableLambda(-126640971, true, new AnonymousClass7(value, enabled4, isError4, visualTransformation3, interactionSource4, isError3, r118, r119, r1110, r1111, shape3, colors3), $composer3, 54), $composer4, ((((((($dirty12 & 14) | ($dirty12 & 112)) | ($dirty12 & 7168)) | (57344 & $dirty12)) | (($dirty11 << 12) & 3670016)) | (($dirty11 << 12) & 29360128)) | (($dirty11 << 12) & 234881024)) | (1879048192 & ($dirty11 << 12)), ((($dirty11 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ($dirty11 & 112), 4096);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L334;
        ComposerKt.traceEventEnd();
    L334:
        final boolean singleLine4 = singleLine3;
        final VisualTransformation visualTransformation4 = visualTransformation3;
        final TextFieldColors colors4 = colors3;
        final TextStyle textStyle5 = textStyle4;
        final boolean enabled5 = enabled2;
        final boolean readOnly4 = readOnly2;
        final int maxLines5 = maxLines4;
        final int minLines4 = minLines3;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r56;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r57;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r58;
        final MutableInteractionSource interactionSource5 = interactionSource2;
        final Shape shape4 = shape2;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        final KeyboardActions keyboardActions4 = keyboardActions3;
        final Function2<? super Composer, ? super Integer, Unit> r120 = r59;
        final boolean isError5 = isError3;
        final Modifier modifier5 = modifier4;
    L336:
        ScopeUpdateScope r5 = $composer5.endRestartGroup();
        if (r5 == null) goto L340;
        r5.updateScope(new AnonymousClass8(value, r105, modifier5, enabled5, readOnly4, textStyle5, r8, r9, r15, r120, isError5, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines5, minLines4, interactionSource5, shape4, colors4, $changed, $changed1, r127));
        return;
    L340:
        return;
    L327:
        r25 = false;
        goto L328
    L323:
        $composer3.startReplaceGroup(-53435997);
        $composer3.endReplaceGroup();
        interactionSource3 = interactionSource2;
        goto L324
    L313:
        $composer3 = $composer2;
        colors2 = colors;
        keyboardActions3 = keyboardActions2;
        modifier2 = modifier3;
        enabled2 = enabled3;
        readOnly2 = readOnly3;
        textStyle3 = textStyle2;
        $dirty12 = $dirty8;
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
        modifier3 = modifier2;
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
        $composer3 = $composer2;
        r58 = r112;
        r59 = r113;
        isError2 = isError;
        visualTransformation2 = visualTransformation;
        singleLine3 = singleLine;
        maxLines4 = maxLines;
        interactionSource2 = interactionSource;
        shape2 = shape;
        colors2 = colors;
        $dirty12 = $dirty13;
        r56 = r11;
        r57 = r14;
        keyboardActions3 = keyboardActions;
        minLines3 = minLines;
        $dirty11 = $dirty6;
        textStyle3 = r10;
        keyboardOptions3 = keyboardOptions;
        goto L314
    L238:
        $dirty13 = $dirty7;
        goto L240
    L335:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r15 = r112;
        visualTransformation4 = visualTransformation;
        keyboardOptions4 = keyboardOptions;
        maxLines5 = maxLines;
        minLines4 = minLines;
        interactionSource5 = interactionSource;
        shape4 = shape;
        colors4 = colors;
        enabled5 = enabled2;
        readOnly4 = readOnly2;
        textStyle5 = r10;
        r8 = r11;
        r9 = r14;
        modifier5 = modifier2;
        r120 = r113;
        isError5 = isError;
        keyboardActions4 = keyboardActions;
        singleLine4 = singleLine;
        goto L336
    L224:
        if ((306783379 & $dirty6) != 306783378) goto L227;
        r2 = false;
        goto L229
    L213:
        if ((r127 & 524288) != 0) goto L217;
        int $dirty14 = $dirty1;
        if ($composer2.changed(colors) == false) goto L218;
        int r26 = 536870912;
    L219:
        $dirty6 = $dirty14 | r26;
    L218:
        r26 = 268435456;
        goto L219
    L217:
        $dirty14 = $dirty1;
        goto L218
    L192:
        if (($changed1 & 12582912) != 0) goto L200;
        if ($composer2.changed(interactionSource) == false) goto L196;
        int r27 = 8388608;
    L197:
        $dirty1 = $dirty1 | r27;
        goto L200
    L196:
        r27 = 4194304;
        goto L197
    L181:
        if (($changed1 & 1572864) != 0) goto L188;
        if ($composer2.changed(minLines) == false) goto L185;
        int r28 = 1048576;
    L186:
        $dirty1 = $dirty1 | r28;
        goto L188
    L185:
        r28 = 524288;
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
        int r210 = 32;
    L132:
        $dirty1 = $dirty1 | r210;
        goto L134
    L131:
        r210 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(isError) == false) goto L120;
        int r211 = 4;
    L121:
        $dirty1 = $dirty1 | r211;
        goto L123
    L120:
        r211 = 2;
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
        int r212 = 1048576;
    L77:
        $dirty = $dirty | r212;
        goto L79
    L76:
        r212 = 524288;
        goto L77
    L78:
        r11 = r110;
        goto L79
    L60:
        if ((r127 & 32) != 0) goto L64;
        r10 = textStyle;
        if ($composer2.changed(r10) == false) goto L65;
        int r213 = 131072;
    L66:
        $dirty = $dirty | r213;
    L65:
        r213 = 65536;
        goto L66
    L64:
        r10 = textStyle;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        readOnly2 = readOnly;
        if ($composer2.changed(readOnly2) == false) goto L54;
        int r214 = 16384;
    L55:
        $dirty = $dirty | r214;
        goto L58
    L54:
        r214 = 8192;
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
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r122 = 256;
    L33:
        $dirty = $dirty | r122;
        goto L35
    L32:
        r122 = 128;
        goto L33
    L34:
        modifier2 = modifier;
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
    public static final /* synthetic */ void TextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int r93) {
        Composer $composer2 = $composer.startRestartGroup(-1576622884);
        ComposerKt.sourceInformation($composer2, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)613@31276L408:TextField.kt#jmzs0o");
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
        ComposerKt.sourceInformation($composer2, "598@30554L7,609@31108L39,610@31186L14,611@31250L17");
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
        ComposerKt.sourceInformationMarkerStart($composer2, -53339762, "CC(remember):TextField.kt#9igjgp");
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
        Shape shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer2, 6);
        int $dirty11 = $dirty10 & (-29360129);
    L295:
        if ((262144 & r93) == 0) goto L297;
        Composer $composer3 = $composer2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        Modifier modifier3 = modifier2;
        TextFieldColors colors2 = TextFieldDefaults.INSTANCE.m1828textFieldColorsdx8h9Zs(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer3, 0, 0, 48, 2097151);
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
        ComposerKt.traceEventStart(-1576622884, $dirty12, $dirty7, "androidx.compose.material.TextField (TextField.kt:612)");
    L301:
        TextField(value, onValueChange, modifier3, enabled2, readOnly2, textStyle3, label3, placeholder3, leadingIcon3, trailingIcon3, isError3, visualTransformation3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, 1, interactionSource3, shape3, colors2, $composer3, ((((((((($dirty12 & 14) | ($dirty12 & 112)) | ($dirty12 & 896)) | ($dirty12 & 7168)) | (57344 & $dirty12)) | (458752 & $dirty12)) | (3670016 & $dirty12)) | (29360128 & $dirty12)) | (234881024 & $dirty12)) | (1879048192 & $dirty12), ((((((((($dirty7 & 14) | 1572864) | ($dirty7 & 112)) | ($dirty7 & 896)) | ($dirty7 & 7168)) | (57344 & $dirty7)) | (458752 & $dirty7)) | (($dirty7 << 3) & 29360128)) | (($dirty7 << 3) & 234881024)) | (($dirty7 << 3) & 1879048192), 0);
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
        r3.updateScope(new AnonymousClass10(value, onValueChange, modifier4, enabled4, readOnly4, textStyle4, label4, placeholder4, leadingIcon4, label5, isError4, visualTransformation4, keyboardOptions4, keyboardActions4, singleLine4, maxLines4, interactionSource4, shape4, colors3, $changed, $changed1, r93));
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

    public static final void TextFieldLayout(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r55, final Function2<? super Composer, ? super Integer, Unit> r56, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> r57, final Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, final boolean singleLine, final float animationProgress, final PaddingValues paddingValues, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2112507061);
        ComposerKt.sourceInformation($composer2, "C(TextFieldLayout)P(3,7,1,5,2,8,6)654@32222L147,657@32417L7,658@32429L1955:TextField.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r13 = 4;
    L8:
        $dirty = $dirty | r13;
        goto L10
    L7:
        r13 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r55) == false) goto L14;
        int r14 = 32;
    L15:
        $dirty = $dirty | r14;
        goto L17
    L14:
        r14 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r56) == false) goto L21;
        int r15 = 256;
    L22:
        $dirty = $dirty | r15;
        goto L24
    L21:
        r15 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r57) == false) goto L28;
        int r16 = 2048;
    L29:
        $dirty = $dirty | r16;
        goto L31
    L28:
        r16 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r58) == false) goto L35;
        int r17 = 16384;
    L36:
        $dirty = $dirty | r17;
        goto L38
    L35:
        r17 = 8192;
    L38:
        if ((196608 & $changed) != 0) goto L45;
        if ($composer2.changedInstance(r59) == false) goto L42;
        int r18 = 131072;
    L43:
        $dirty = $dirty | r18;
        goto L45
    L42:
        r18 = 65536;
    L45:
        if ((1572864 & $changed) != 0) goto L52;
        if ($composer2.changed(singleLine) == false) goto L49;
        int r19 = 1048576;
    L50:
        $dirty = $dirty | r19;
        goto L52
    L49:
        r19 = 524288;
    L52:
        if ((12582912 & $changed) != 0) goto L59;
        if ($composer2.changed(animationProgress) == false) goto L56;
        int r110 = 8388608;
    L57:
        $dirty = $dirty | r110;
        goto L59
    L56:
        r110 = 4194304;
    L59:
        if ((100663296 & $changed) != 0) goto L66;
        if ($composer2.changed(paddingValues) == false) goto L63;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L64:
        $dirty = $dirty | r111;
        goto L66
    L63:
        r111 = 33554432;
    L66:
        if ((38347923 & $dirty) == 38347922) goto L68;
        boolean r112 = true;
    L70:
        if ($composer2.shouldExecute(r112, $dirty & 1) == true) goto L72;
        Function2<? super Composer, ? super Integer, Unit> r1 = r55;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L195:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L199;
        final Function2<? super Composer, ? super Integer, Unit> r2 = r1;
        r11.updateScope(new C04592(modifier, r2, r56, r57, r58, r59, singleLine, animationProgress, paddingValues, $changed));
        return;
    L199:
        return;
    L72:
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventStart(-2112507061, $dirty, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:652)");
    L74:
        ComposerKt.sourceInformationMarkerStart($composer2, -72918844, "CC(remember):TextField.kt#9igjgp");
        if ((3670016 & $dirty) != 1048576) goto L77;
        boolean r0 = true;
    L79:
        if ((29360128 & $dirty) != 8388608) goto L81;
        boolean r113 = true;
    L82:
        boolean r3 = r0 | r113;
        if ((234881024 & $dirty) != 67108864) goto L85;
        boolean r114 = true;
    L86:
        boolean invalid$iv = r3 | r114;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L93;
        if (it$iv == Composer.Companion.getEmpty()) goto L93;
    L94:
        TextFieldMeasurePolicy measurePolicy = (TextFieldMeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<LayoutDirection> r4 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r7;
        int $changed$iv = ($dirty << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L97;
        ComposablesKt.invalidApplier();
    L97:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L100;
        Function0<ComposeUiNode> r5 = r20;
        $composer2.createNode(r5);
    L101:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L107;
        int $dirty2 = $dirty;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L109;
    L108:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r10);
    L109:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 79145100, "C701@34146L183:TextField.kt#jmzs0o");
        if (r58 == null) goto L127;
        $composer3.startReplaceGroup(79117075);
        ComposerKt.sourceInformation($composer3, "662@32537L223");
        Modifier modifier$iv = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Leading"));
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
        Function0<ComposeUiNode> r42 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L114;
        ComposablesKt.invalidApplier();
    L114:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L117;
        Function0<ComposeUiNode> r8 = r42;
        $composer3.createNode(r8);
    L118:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L125;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L125;
    L126:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r12 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r115 = BoxScopeInstance.INSTANCE;
        int r46 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1914683285, "C666@32733L9:TextField.kt#jmzs0o");
        r58.invoke($composer3, Integer.valueOf(($dirty2 >> 12) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L128:
        if (r59 == null) goto L145;
        $composer3.startReplaceGroup(79404817);
        ComposerKt.sourceInformation($composer3, "670@32827L225");
        Modifier modifier$iv2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Trailing"));
        Alignment contentAlignment$iv2 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r39 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L132;
        ComposablesKt.invalidApplier();
    L132:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L135;
        Function0<ComposeUiNode> r21 = r39;
        $composer3.createNode(r21);
    L136:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r116 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L143;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L143;
    L144:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r117 = BoxScopeInstance.INSTANCE;
        int r43 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1914394582, "C674@33024L10:TextField.kt#jmzs0o");
        r59.invoke($composer3, Integer.valueOf(($dirty2 >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L146:
        float startTextFieldPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        float endTextFieldPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        Modifier.Companion r37 = Modifier.Companion;
        if (r58 == null) goto L149;
        float other$iv = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv2 = Dp.m6973constructorimpl(startTextFieldPadding - other$iv);
        float minimumValue$iv = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv2, minimumValue$iv));
        float r38 = $this$coerceAtLeast_u2dYgX7TsA$iv;
    L151:
        if (r59 == null) goto L153;
        float other$iv3 = TextFieldImplKt.getHorizontalIconPadding();
        float other$iv4 = Dp.m6973constructorimpl(endTextFieldPadding - other$iv3);
        float minimumValue$iv2 = Dp.m6973constructorimpl(0);
        float $this$coerceAtLeast_u2dYgX7TsA$iv2 = Dp.m6973constructorimpl(RangesKt.coerceAtLeast(other$iv4, minimumValue$iv2));
        float r40 = $this$coerceAtLeast_u2dYgX7TsA$iv2;
    L154:
        Modifier padding = PaddingKt.m729paddingqDBjuR0$default(r37, r38, 0.0f, r40, 0.0f, 10, null);
        if (r57 == null) goto L157;
        $composer3.startReplaceGroup(80502775);
        ComposerKt.sourceInformation($composer3, "696@33939L59");
        r57.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(padding), $composer3, Integer.valueOf(($dirty2 >> 6) & 112));
        $composer3.endReplaceGroup();
    L158:
        if (r56 == null) goto L175;
        $composer3.startReplaceGroup(80624729);
        ComposerKt.sourceInformation($composer3, "699@34062L57");
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "Label").then(padding);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L162;
        ComposablesKt.invalidApplier();
    L162:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L165;
        Function0<ComposeUiNode> r23 = r41;
        $composer3.createNode(r23);
    L166:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L173;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == false) goto L173;
    L174:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r26 = BoxScopeInstance.INSTANCE;
        int r45 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1913317363, "C699@34110L7:TextField.kt#jmzs0o");
        r56.invoke($composer3, Integer.valueOf(($dirty2 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L176:
        Modifier modifier$iv4 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(padding);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv4 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv4, true);
        int $changed$iv$iv5 = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
        Function0<ComposeUiNode> r118 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv4 = (($changed$iv$iv5 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L179;
        ComposablesKt.invalidApplier();
    L179:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L182;
        Function0<ComposeUiNode> r27 = r118;
        $composer3.createNode(r27);
    L183:
        Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r28 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv4.getInserting() == true) goto L189;
        int $changed$iv2 = 384;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4)) == true) goto L191;
    L190:
        $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
        $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), r28);
    L191:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
        int r29 = ($changed$iv$iv$iv4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r30 = BoxScopeInstance.INSTANCE;
        int r119 = (($changed$iv2 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1913124791, "C705@34304L11:TextField.kt#jmzs0o");
        r1 = r55;
        r1.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventEnd();
        goto L195
    L189:
        $changed$iv2 = 384;
        goto L190
    L182:
        r27 = r118;
        $composer3.useNode();
    L173:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r24);
        goto L174
    L165:
        r23 = r41;
        $composer3.useNode();
        goto L166
    L175:
        $composer3.startReplaceGroup(80710258);
        $composer3.endReplaceGroup();
        goto L176
    L157:
        $composer3.startReplaceGroup(80590226);
        $composer3.endReplaceGroup();
        goto L158
    L153:
        r40 = endTextFieldPadding;
        goto L154
    L149:
        r38 = startTextFieldPadding;
    L143:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r116);
        goto L144
    L135:
        r21 = r39;
        $composer3.useNode();
        goto L136
    L145:
        $composer3.startReplaceGroup(79651794);
        $composer3.endReplaceGroup();
    L125:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L126
    L117:
        r8 = r42;
        $composer3.useNode();
        goto L118
    L127:
        $composer3.startReplaceGroup(79362130);
        $composer3.endReplaceGroup();
        goto L128
    L107:
        $dirty2 = $dirty;
        goto L108
    L100:
        r5 = r20;
        $composer2.useNode();
    L93:
        Object value$iv = new TextFieldMeasurePolicy(singleLine, animationProgress, paddingValues);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
        goto L94
    L85:
        r114 = false;
        goto L86
    L81:
        r113 = false;
        goto L82
    L77:
        r0 = false;
        goto L79
    L68:
        r112 = false;
        goto L70
    }

    private static final int substractConstraintSafely(int $this$substractConstraintSafely, int from) {
        if ($this$substractConstraintSafely != Integer.MAX_VALUE) goto L6;
        return $this$substractConstraintSafely;
    L6:
        return $this$substractConstraintSafely - from;
    }

    /* JADX INFO: renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    private static final int m1840calculateWidthVsPV1Ek(int leadingWidth, int trailingWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int middleSection = Math.max(textFieldWidth, Math.max(labelWidth, placeholderWidth));
        int wrappedWidth = (leadingWidth + middleSection) + trailingWidth;
        return ConstraintsKt.m6943constrainWidthK40F9xA(constraints, wrappedWidth);
    }

    /* JADX INFO: renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    private static final int m1839calculateHeightO3s9Psw(int textFieldHeight, boolean hasLabel, int labelBaseline, int leadingHeight, int trailingHeight, int placeholderHeight, long constraints, float density, PaddingValues paddingValues) {
        float paddingToLabel = TextFieldTopPadding * density;
        float topPaddingValue = paddingValues.mo677calculateTopPaddingD9Ej5fM() * density;
        float bottomPaddingValue = paddingValues.mo674calculateBottomPaddingD9Ej5fM() * density;
        int inputFieldHeight = Math.max(textFieldHeight, placeholderHeight);
        if (hasLabel == false) goto L5;
        float middleSectionHeight = ((labelBaseline + paddingToLabel) + inputFieldHeight) + bottomPaddingValue;
    L7:
        return ConstraintsKt.m6942constrainHeightK40F9xA(constraints, Math.max(MathKt.roundToInt(middleSectionHeight), Math.max(leadingHeight, trailingHeight)));
    L5:
        middleSectionHeight = (inputFieldHeight + topPaddingValue) + bottomPaddingValue;
        goto L7
    }

    private static final void placeWithLabel(Placeable.PlacementScope $this$placeWithLabel, int width, int height, Placeable textfieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, boolean singleLine, int labelEndPosition, int textPosition, float animationProgress, float density) {
        if (leadingPlaceable == null) goto L5;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
    L5:
        if (trailingPlaceable == null) goto L7;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
    L7:
        if (labelPlaceable != null) goto L9;
    L13:
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, textfieldPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textPosition, 0.0f, 4, null);
        if (placeholderPlaceable == null) goto L17;
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, placeholderPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textPosition, 0.0f, 4, null);
        return;
    L17:
        return;
    L9:
        if (singleLine == false) goto L11;
        int startPosition = Alignment.Companion.getCenterVertically().align(labelPlaceable.getHeight(), height);
    L12:
        int distance = startPosition - labelEndPosition;
        int positionY = startPosition - MathKt.roundToInt(distance * animationProgress);
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, labelPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), positionY, 0.0f, 4, null);
        goto L13
    L11:
        startPosition = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * density);
        goto L12
    }

    private static final void placeWithoutLabel(Placeable.PlacementScope $this$placeWithoutLabel, int width, int height, Placeable textPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, boolean singleLine, float density, PaddingValues paddingValues) {
        int topPadding = MathKt.roundToInt(paddingValues.mo677calculateTopPaddingD9Ej5fM() * density);
        if (leadingPlaceable == null) goto L5;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
    L5:
        if (trailingPlaceable == null) goto L7;
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
    L7:
        if (singleLine == false) goto L9;
        int textVerticalPosition = Alignment.Companion.getCenterVertically().align(textPlaceable.getHeight(), height);
    L10:
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, textPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textVerticalPosition, 0.0f, 4, null);
        if (placeholderPlaceable != null) goto L13;
        return;
    L13:
        if (singleLine == false) goto L15;
        int placeholderVerticalPosition = Alignment.Companion.getCenterVertically().align(placeholderPlaceable.getHeight(), height);
    L16:
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, placeholderPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), placeholderVerticalPosition, 0.0f, 4, null);
        return;
    L15:
        placeholderVerticalPosition = topPadding;
        goto L16
    L9:
        textVerticalPosition = topPadding;
        goto L10
    }

    public static final Modifier drawIndicatorLine(Modifier $this$drawIndicatorLine, final BorderStroke indicatorBorder) {
        final float strokeWidthDp = indicatorBorder.m260getWidthD9Ej5fM();
        return DrawModifierKt.drawWithContent($this$drawIndicatorLine, new C04601(strokeWidthDp, indicatorBorder));
    }

    static {
        FirstBaselineOffset = Dp.m6973constructorimpl(20);
        TextFieldBottomPadding = Dp.m6973constructorimpl(10);
        TextFieldTopPadding = Dp.m6973constructorimpl(2);
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
