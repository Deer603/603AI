package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0091\u0001\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u0089\u0002\u0010,\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u009b\u0001\u0010O\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u0093\u0002\u0010O\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a»\u0001\u0010V\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\b\b\u0002\u00105\u001a\u0002062\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u0094\u0001\u0010b\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u0006\u00105\u001a\u0002062\u0006\u0010P\u001a\u00020Q2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b0H\u0003¢\u0006\u0002\u0010d\u001a\"\u0010e\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0007H\u0002\u001aD\u0010g\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010k\u001a\u00020l2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010o\u001aN\u0010p\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010\\\u001a\u0004\u0018\u00010^2\u0006\u0010q\u001a\u00020\u00012\u0006\u0010r\u001a\u00020\u00012\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\n\n\u0002\u0010\u0018\u0012\u0004\b\u001e\u0010\u001f\"\u0010\u0010 \u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010!\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0016\u0010\"\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017\"\u000e\u0010$\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010&\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010(\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0017\"\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006u²\u0006\n\u0010v\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u0010w\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "AnimationPredictiveBackExitFloatSpec", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "DockedExpandedTableMaxHeightScreenRatio", "DockedExpandedTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedExpandedTableMinHeight", "()F", "F", "LayoutIdInputField", "", "LayoutIdSearchContent", "LayoutIdSurface", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarPredictiveBackMaxOffsetXRatio", "SearchBarPredictiveBackMaxOffsetY", "SearchBarPredictiveBackMinMargin", "SearchBarPredictiveBackMinScale", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "UnspecifiedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "DockedSearchBar", "", "inputField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "shadowElevation", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-EQC0FA8", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "query", "onQueryChange", "onSearch", "active", "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-Y92LkZI", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarImpl", "animationProgress", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "finalBackProgress", "Landroidx/compose/runtime/MutableFloatState;", "firstBackEvent", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarLayout", "surface", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculatePredictiveBackMultiplier", NotificationCompat.CATEGORY_PROGRESS, "calculatePredictiveBackOffsetX", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minMargin", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "predictiveBackMultiplier", "calculatePredictiveBackOffsetX-rOvwMX4", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "calculatePredictiveBackOffsetY", "height", "maxOffsetY", "calculatePredictiveBackOffsetY-dzo92Q0", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "material3_release", "useFullScreenShape", "showContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing = null;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec = null;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec = null;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing = null;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec = null;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec = null;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec = null;
    private static final EnterTransition DockedEnterTransition = null;
    private static final ExitTransition DockedExitTransition = null;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedExpandedTableMinHeight = 0.0f;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarCornerRadius = 0.0f;
    private static final float SearchBarIconOffsetX = 0.0f;
    private static final float SearchBarMaxWidth = 0.0f;
    private static final float SearchBarMinWidth = 0.0f;
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMaxOffsetY = 0.0f;
    private static final float SearchBarPredictiveBackMinMargin = 0.0f;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding = 0.0f;
    private static final TextFieldColors UnspecifiedTextFieldColors = null;

    public static final /* synthetic */ void access$SearchBarLayout(Animatable animationProgress, MutableFloatState finalBackProgress, MutableState firstBackEvent, MutableState currentBackEvent, Modifier modifier, WindowInsets windowInsets, Function2 inputField, Function2 surface, Function2 content, Composer $composer, int $changed) {
        SearchBarLayout(animationProgress, finalBackProgress, firstBackEvent, currentBackEvent, modifier, windowInsets, inputField, surface, content, $composer, $changed);
    }

    public static final /* synthetic */ float access$calculatePredictiveBackMultiplier(BackEventCompat currentBackEvent, float progress, float finalBackProgress) {
        return calculatePredictiveBackMultiplier(currentBackEvent, progress, finalBackProgress);
    }

    /* JADX INFO: renamed from: access$calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final /* synthetic */ int m2555access$calculatePredictiveBackOffsetXrOvwMX4(long constraints, int minMargin, BackEventCompat currentBackEvent, LayoutDirection layoutDirection, float progress, float predictiveBackMultiplier) {
        return m2557calculatePredictiveBackOffsetXrOvwMX4(constraints, minMargin, currentBackEvent, layoutDirection, progress, predictiveBackMultiplier);
    }

    /* JADX INFO: renamed from: access$calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final /* synthetic */ int m2556access$calculatePredictiveBackOffsetYdzo92Q0(long constraints, int minMargin, BackEventCompat currentBackEvent, BackEventCompat firstBackEvent, int height, int maxOffsetY, float predictiveBackMultiplier) {
        return m2558calculatePredictiveBackOffsetYdzo92Q0(constraints, minMargin, currentBackEvent, firstBackEvent, height, maxOffsetY, predictiveBackMultiplier);
    }

    public static final /* synthetic */ FiniteAnimationSpec access$getAnimationEnterFloatSpec$p() {
        return AnimationEnterFloatSpec;
    }

    public static final /* synthetic */ FiniteAnimationSpec access$getAnimationExitFloatSpec$p() {
        return AnimationExitFloatSpec;
    }

    public static final /* synthetic */ FiniteAnimationSpec access$getAnimationPredictiveBackExitFloatSpec$p() {
        return AnimationPredictiveBackExitFloatSpec;
    }

    public static final /* synthetic */ EnterTransition access$getDockedEnterTransition$p() {
        return DockedEnterTransition;
    }

    public static final /* synthetic */ ExitTransition access$getDockedExitTransition$p() {
        return DockedExitTransition;
    }

    public static final /* synthetic */ float access$getSearchBarCornerRadius$p() {
        return SearchBarCornerRadius;
    }

    public static final /* synthetic */ float access$getSearchBarIconOffsetX$p() {
        return SearchBarIconOffsetX;
    }

    public static final /* synthetic */ float access$getSearchBarMaxWidth$p() {
        return SearchBarMaxWidth;
    }

    public static final /* synthetic */ float access$getSearchBarPredictiveBackMaxOffsetY$p() {
        return SearchBarPredictiveBackMaxOffsetY;
    }

    public static final /* synthetic */ float access$getSearchBarPredictiveBackMinMargin$p() {
        return SearchBarPredictiveBackMinMargin;
    }

    public static final /* synthetic */ TextFieldColors access$getUnspecifiedTextFieldColors$p() {
        return UnspecifiedTextFieldColors;
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
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
    /* JADX INFO: renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    public static final void m2553SearchBarY92LkZI(final Function2<? super Composer, ? super Integer, Unit> r30, boolean expanded, final Function1<? super Boolean, Unit> r32, Modifier modifier, Shape shape, SearchBarColors colors, float tonalElevation, float shadowElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r39, Composer $composer, final int $changed, final int r42) {
        final boolean r2 = expanded;
        Composer $composer2 = $composer.startRestartGroup(1444649673);
        ComposerKt.sourceInformation($composer2, "C(SearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp,9)171@8255L15,172@8320L8,175@8501L12,178@8596L64,179@8689L43,180@8758L51,181@8837L51,183@8919L638,183@8894L663,199@9582L27,200@9656L1062,200@9614L1104,226@10724L458:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r14 = r30;
    L14:
        if ((r42 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r42 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L34:
        int r5 = r42 & 8;
        if (r5 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier r6 = modifier;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape r7 = shape;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        SearchBarColors r9 = colors;
    L67:
        int r16 = r42 & 64;
        if (r16 == 0) goto L71;
        $dirty = $dirty | 1572864;
        float r10 = tonalElevation;
    L78:
        int r15 = r42 & 128;
        if (r15 == 0) goto L82;
        $dirty = $dirty | 12582912;
        float r13 = shadowElevation;
    L90:
        if (($changed & 100663296) == 0) goto L92;
        WindowInsets r4 = windowInsets;
    L101:
        if ((r42 & 512) == 0) goto L104;
        $dirty = $dirty | 805306368;
    L111:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L114;
    L117:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L120;
    L132:
        if (r5 == 0) goto L134;
        Modifier.Companion modifier2 = Modifier.Companion;
    L136:
        if ((r42 & 16) == 0) goto L138;
        int r8 = $dirty2 & (-57345);
        Shape shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape($composer2, 6);
        int $dirty3 = r8;
    L140:
        if ((r42 & 32) == 0) goto L142;
        int r1 = 6;
        SearchBarColors colors2 = SearchBarDefaults.INSTANCE.m2543colorsdgg9oW8(0, 0, $composer2, 384, 3);
        $dirty3 = $dirty3 & (-458753);
    L143:
        if (r16 == 0) goto L145;
        float tonalElevation2 = SearchBarDefaults.INSTANCE.m2547getTonalElevationD9Ej5fM();
    L146:
        if (r15 == 0) goto L148;
        float shadowElevation2 = SearchBarDefaults.INSTANCE.m2546getShadowElevationD9Ej5fM();
    L150:
        if ((r42 & 256) == 0) goto L152;
        Modifier modifier3 = modifier2;
        WindowInsets windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets($composer2, r1);
        SearchBarColors colors3 = colors2;
        float tonalElevation3 = tonalElevation2;
        float shadowElevation3 = shadowElevation2;
        int $dirty4 = $dirty3 & (-234881025);
        Shape shape3 = shape2;
    L153:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L156;
        ComposerKt.traceEventStart(1444649673, $dirty4, -1, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
    L156:
        ComposerKt.sourceInformationMarkerStart($composer2, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        int $dirty5 = $dirty4;
        if (it$iv == Composer.Companion.getEmpty()) goto L159;
        Object value$iv = it$iv;
    L164:
        Animatable animationProgress = (Animatable) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L167;
        Object value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        $composer2.updateRememberedValue(value$iv2);
    L168:
        MutableFloatState finalBackProgress = (MutableFloatState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L171;
        Object value$iv3 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv3);
    L172:
        MutableState firstBackEvent = (MutableState) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L175;
        Object value$iv4 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv4);
    L176:
        MutableState currentBackEvent = (MutableState) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Boolean r11 = Boolean.valueOf(expanded);
        ComposerKt.sourceInformationMarkerStart($composer2, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
        boolean r0 = $composer2.changedInstance(animationProgress);
        if (($dirty5 & 112) != 32) goto L179;
        boolean r3 = true;
    L180:
        boolean invalid$iv = r0 | r3;
        SearchBar_androidKt$SearchBar$1$1 value$iv5 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L183;
    L186:
        MutableFloatState finalBackProgress2 = finalBackProgress;
        r2 = expanded;
        value$iv5 = new SearchBar_androidKt$SearchBar$1$1(animationProgress, r2, finalBackProgress2, firstBackEvent, currentBackEvent, null);
        $composer2.updateRememberedValue(value$iv5);
    L187:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r11, (Function2) value$iv5, $composer2, ($dirty5 >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 626037411, r3);
        Object it$iv5 = $composer2.rememberedValue();
        if (it$iv5 != Composer.Companion.getEmpty()) goto L190;
        Object value$iv6 = new MutatorMutex();
        $composer2.updateRememberedValue(value$iv6);
    L191:
        MutatorMutex mutatorMutex = (MutatorMutex) value$iv6;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 626040814, "CC(remember):SearchBar.android.kt#9igjgp");
        boolean r12 = $composer2.changedInstance(animationProgress);
        if (($dirty5 & 896) != 256) goto L194;
        boolean r17 = true;
    L195:
        boolean invalid$iv2 = r12 | r17;
        Object it$iv6 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L198;
    L201:
        Object value$iv7 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, finalBackProgress2, animationProgress, r32, firstBackEvent, currentBackEvent, null);
        $composer2.updateRememberedValue(value$iv7);
    L202:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        PredictiveBackHandlerKt.PredictiveBackHandler(r2, (Function2) value$iv7, $composer2, ($dirty5 >> 3) & 14, 0);
        int r26 = ((((((Animatable.$stable | 3504) | (57344 & ($dirty5 << 3))) | (($dirty5 << 15) & 458752)) | (($dirty5 << 6) & 3670016)) | (($dirty5 << 6) & 29360128)) | (($dirty5 << 6) & 234881024)) | (($dirty5 << 6) & 1879048192);
        int r27 = (($dirty5 >> 24) & 14) | (($dirty5 >> 24) & 112);
        Modifier modifier4 = modifier3;
        Shape shape4 = shape3;
        SearchBarColors colors4 = colors3;
        Composer $composer3 = $composer2;
        float shadowElevation4 = shadowElevation3;
        WindowInsets windowInsets3 = windowInsets2;
        float tonalElevation4 = tonalElevation3;
        m2554SearchBarImplj1jLAyQ(animationProgress, finalBackProgress2, firstBackEvent, currentBackEvent, modifier4, r14, shape4, colors4, tonalElevation4, shadowElevation4, windowInsets3, r39, $composer3, r26, r27, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L205;
        ComposerKt.traceEventEnd();
    L205:
        final Shape shape5 = shape4;
        final SearchBarColors colors5 = colors4;
        final float shadowElevation5 = shadowElevation4;
        final WindowInsets windowInsets4 = windowInsets3;
        final float tonalElevation5 = tonalElevation4;
        final Modifier modifier5 = modifier4;
    L206:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L210;
        r18.updateScope(new SearchBar_androidKt$SearchBar$3(r30, r2, r32, modifier5, shape5, colors5, tonalElevation5, shadowElevation5, windowInsets4, r39, $changed, r42));
        return;
    L210:
        return;
    L198:
        if (it$iv6 == Composer.Companion.getEmpty()) goto L201;
        value$iv7 = it$iv6;
        goto L202
    L194:
        r17 = false;
        goto L195
    L190:
        value$iv6 = it$iv5;
        goto L191
    L183:
        if (value$iv5 == Composer.Companion.getEmpty()) goto L186;
        finalBackProgress2 = finalBackProgress;
        r2 = expanded;
        goto L187
    L179:
        r3 = false;
        goto L180
    L175:
        value$iv4 = it$iv4;
        goto L176
    L171:
        value$iv3 = it$iv3;
        goto L172
    L167:
        value$iv2 = it$iv2;
        goto L168
    L159:
        if (r2 == false) goto L161;
        float r20 = 1.0f;
    L162:
        value$iv = AnimatableKt.Animatable$default(r20, 0.0f, 2, null);
        $composer2.updateRememberedValue(value$iv);
        goto L164
    L161:
        r20 = 0.0f;
        goto L162
    L152:
        windowInsets2 = windowInsets;
        modifier3 = modifier2;
        colors3 = colors2;
        tonalElevation3 = tonalElevation2;
        shadowElevation3 = shadowElevation2;
        shape3 = shape2;
        $dirty4 = $dirty3;
        goto L153
    L148:
        shadowElevation2 = r13;
        goto L150
    L145:
        tonalElevation2 = tonalElevation;
        goto L146
    L142:
        r1 = 6;
        colors2 = colors;
        goto L143
    L138:
        $dirty3 = $dirty2;
        shape2 = r7;
        goto L140
    L134:
        modifier2 = r6;
        goto L136
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L132;
        $composer2.skipToGroupEnd();
        if ((r42 & 16) == 0) goto L126;
        $dirty2 = $dirty2 & (-57345);
    L126:
        if ((r42 & 32) == 0) goto L129;
        $dirty2 = $dirty2 & (-458753);
    L129:
        if ((r42 & 256) == 0) goto L131;
        $dirty4 = $dirty2 & (-234881025);
        windowInsets2 = r4;
        shadowElevation3 = r13;
        tonalElevation3 = r10;
        colors3 = r9;
        shape3 = r7;
        modifier3 = r6;
        goto L153
    L131:
        windowInsets2 = r4;
        shadowElevation3 = r13;
        $dirty4 = $dirty2;
        tonalElevation3 = r10;
        colors3 = r9;
        shape3 = r7;
        modifier3 = r6;
        goto L153
    L114:
        if ($composer2.getSkipping() == false) goto L117;
        $composer2.skipToGroupEnd();
        SearchBarColors r19 = r9;
        windowInsets4 = r4;
        modifier5 = r6;
        colors5 = r19;
        shape5 = r7;
        $composer3 = $composer2;
        tonalElevation5 = r10;
        shadowElevation5 = r13;
        goto L206
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r39) == false) goto L108;
        int r21 = 536870912;
    L109:
        $dirty = $dirty | r21;
        goto L111
    L108:
        r21 = 268435456;
        goto L109
    L92:
        if ((r42 & 256) != 0) goto L96;
        r4 = windowInsets;
        if ($composer2.changed(r4) == false) goto L97;
        int r110 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r110;
    L97:
        r110 = 33554432;
        goto L98
    L96:
        r4 = windowInsets;
        goto L97
    L82:
        if (($changed & 12582912) != 0) goto L88;
        r13 = shadowElevation;
        if ($composer2.changed(r13) == false) goto L86;
        int r111 = 8388608;
    L87:
        $dirty = $dirty | r111;
        goto L90
    L86:
        r111 = 4194304;
        goto L87
    L88:
        r13 = shadowElevation;
        goto L90
    L71:
        if ((1572864 & $changed) != 0) goto L77;
        r10 = tonalElevation;
        if ($composer2.changed(r10) == false) goto L75;
        int r112 = 1048576;
    L76:
        $dirty = $dirty | r112;
        goto L78
    L75:
        r112 = 524288;
        goto L76
    L77:
        r10 = tonalElevation;
        goto L78
    L59:
        if ((r42 & 32) != 0) goto L63;
        r9 = colors;
        if ($composer2.changed(r9) == false) goto L64;
        int r113 = 131072;
    L65:
        $dirty = $dirty | r113;
    L64:
        r113 = 65536;
        goto L65
    L63:
        r9 = colors;
        goto L64
    L48:
        if ((r42 & 16) != 0) goto L52;
        r7 = shape;
        if ($composer2.changed(r7) == false) goto L53;
        int r22 = 16384;
    L54:
        $dirty = $dirty | r22;
    L53:
        r22 = 8192;
        goto L54
    L52:
        r7 = shape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L42;
        int r23 = 2048;
    L43:
        $dirty = $dirty | r23;
        goto L46
    L42:
        r23 = 1024;
        goto L43
    L44:
        r6 = modifier;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r32) == false) goto L31;
        int r24 = 256;
    L32:
        $dirty = $dirty | r24;
        goto L34
    L31:
        r24 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(r2) == false) goto L21;
        int r25 = 32;
    L22:
        $dirty = $dirty | r25;
        goto L24
    L21:
        r25 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = r30;
        if ($composer2.changedInstance(r14) == false) goto L10;
        int r28 = 4;
    L11:
        $dirty = $dirty | r28;
        goto L14
    L10:
        r28 = 2;
        goto L11
    L12:
        r14 = r30;
        goto L14
    }

    /* JADX INFO: renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    public static final void m2550DockedSearchBarEQC0FA8(final Function2<? super Composer, ? super Integer, Unit> r26, final boolean expanded, final Function1<? super Boolean, Unit> r28, Modifier modifier, Shape shape, SearchBarColors colors, float tonalElevation, float shadowElevation, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(1209217899);
        ComposerKt.sourceInformation($composer2, "C(DockedSearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp)287@13410L11,288@13471L8,296@13752L38,300@13946L831,293@13658L1119,325@14815L27,325@14783L59:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r37 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r37 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L32:
        int r6 = r37 & 8;
        if (r6 == 0) goto L36;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L44:
        if (($changed & 24576) == 0) goto L46;
        Shape shape2 = shape;
    L55:
        if ((196608 & $changed) == 0) goto L57;
        SearchBarColors r13 = colors;
    L65:
        int r20 = r37 & 64;
        if (r20 == 0) goto L69;
        $dirty = $dirty | 1572864;
        float r14 = tonalElevation;
    L76:
        int r15 = r37 & 128;
        if (r15 == 0) goto L80;
        $dirty = $dirty | 12582912;
        float r7 = shadowElevation;
    L88:
        if ((r37 & 256) == 0) goto L91;
        $dirty = $dirty | 100663296;
    L97:
        int $dirty2 = $dirty;
        if ((38347923 & $dirty) == 38347922) goto L100;
    L103:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L106;
    L115:
        if (r6 == 0) goto L118;
        modifier2 = Modifier.Companion;
    L118:
        if ((r37 & 16) == 0) goto L120;
        Shape shape3 = SearchBarDefaults.INSTANCE.getDockedShape($composer2, 6);
        int $dirty3 = $dirty2 & (-57345);
    L122:
        if ((r37 & 32) == 0) goto L124;
        int r4 = r15;
        SearchBarColors colors2 = SearchBarDefaults.INSTANCE.m2543colorsdgg9oW8(0, 0, $composer2, 384, 3);
        Composer $composer3 = $composer2;
        $dirty3 = $dirty3 & (-458753);
    L125:
        if (r20 == 0) goto L127;
        float tonalElevation2 = SearchBarDefaults.INSTANCE.m2547getTonalElevationD9Ej5fM();
    L128:
        if (r4 == 0) goto L130;
        SearchBarColors r18 = colors2;
        shape2 = shape3;
        final SearchBarColors colors3 = r18;
        float shadowElevation2 = SearchBarDefaults.INSTANCE.m2546getShadowElevationD9Ej5fM();
        float tonalElevation3 = tonalElevation2;
        int $dirty4 = $dirty3;
    L131:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L134;
        ComposerKt.traceEventStart(1209217899, $dirty4, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)");
    L134:
        long r16 = colors3.m2539getContainerColor0d7_KjU();
        long r17 = ColorSchemeKt.m2057contentColorForek8zF_U(colors3.m2539getContainerColor0d7_KjU(), $composer3, 0);
        SearchBarColors colors4 = colors3;
        boolean invalid$iv = true;
        Composer $composer4 = $composer3;
        Shape shape4 = shape2;
        SurfaceKt.m2670SurfaceT9BRK9s(SizeKt.m777width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape4, r16, r17, tonalElevation3, shadowElevation2, null, ComposableLambdaKt.rememberComposableLambda(878471280, true, new SearchBar_androidKt$DockedSearchBar$1(r26, expanded, colors3, r34), $composer3, 54), $composer4, (((($dirty4 >> 9) & 112) | 12582912) | (($dirty4 >> 6) & 57344)) | (($dirty4 >> 6) & 458752), 64);
        Composer $composer5 = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer5, -994322031, "CC(remember):SearchBar.android.kt#9igjgp");
        if (($dirty4 & 896) == 256) goto L138;
        invalid$iv = false;
    L138:
        Object it$iv = $composer5.rememberedValue();
        if (invalid$iv == false) goto L141;
    L144:
        Object value$iv = (Function0) new SearchBar_androidKt$DockedSearchBar$2$1(r28);
        $composer5.updateRememberedValue(value$iv);
    L145:
        ComposerKt.sourceInformationMarkerEnd($composer5);
        BackHandlerKt.BackHandler(expanded, (Function0) value$iv, $composer5, ($dirty4 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L148;
        ComposerKt.traceEventEnd();
    L148:
        final SearchBarColors colors5 = colors4;
        final Modifier modifier3 = modifier2;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation3 = shadowElevation2;
        final Shape shape5 = shape4;
    L149:
        ScopeUpdateScope r12 = $composer5.endRestartGroup();
        if (r12 == null) goto L153;
        r12.updateScope(new SearchBar_androidKt$DockedSearchBar$3(r26, expanded, r28, modifier3, shape5, colors5, tonalElevation4, shadowElevation3, r34, $changed, r37));
        return;
    L153:
        return;
    L141:
        if (it$iv == Composer.Companion.getEmpty()) goto L144;
        value$iv = it$iv;
        goto L145
    L130:
        SearchBarColors r19 = colors2;
        shape2 = shape3;
        colors3 = r19;
        tonalElevation3 = tonalElevation2;
        $dirty4 = $dirty3;
        shadowElevation2 = r7;
        goto L131
    L127:
        tonalElevation2 = tonalElevation;
        goto L128
    L124:
        $composer3 = $composer2;
        r4 = r15;
        colors2 = colors;
        goto L125
    L120:
        shape3 = shape2;
        $dirty3 = $dirty2;
        goto L122
    L106:
        if ($composer2.getDefaultsInvalid() == true) goto L115;
        $composer2.skipToGroupEnd();
        if ((r37 & 16) == 0) goto L112;
        $dirty2 = $dirty2 & (-57345);
    L112:
        if ((r37 & 32) == 0) goto L114;
        $dirty4 = $dirty2 & (-458753);
        shadowElevation2 = r7;
        colors3 = r13;
        tonalElevation3 = r14;
        $composer3 = $composer2;
        goto L131
    L114:
        shadowElevation2 = r7;
        colors3 = r13;
        tonalElevation3 = r14;
        $dirty4 = $dirty2;
        $composer3 = $composer2;
        goto L131
    L100:
        if ($composer2.getSkipping() == false) goto L103;
        $composer2.skipToGroupEnd();
        colors5 = r13;
        $composer5 = $composer2;
        modifier3 = modifier2;
        shadowElevation3 = r7;
        tonalElevation4 = r14;
        shape5 = shape2;
        goto L149
    L91:
        if (($changed & 100663296) != 0) goto L97;
        if ($composer2.changedInstance(r34) == false) goto L95;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L96:
        $dirty = $dirty | r0;
        goto L97
    L95:
        r0 = 33554432;
        goto L96
    L80:
        if (($changed & 12582912) != 0) goto L86;
        r7 = shadowElevation;
        if ($composer2.changed(r7) == false) goto L84;
        int r110 = 8388608;
    L85:
        $dirty = $dirty | r110;
        goto L88
    L84:
        r110 = 4194304;
        goto L85
    L86:
        r7 = shadowElevation;
        goto L88
    L69:
        if ((1572864 & $changed) != 0) goto L75;
        r14 = tonalElevation;
        if ($composer2.changed(r14) == false) goto L73;
        int r111 = 1048576;
    L74:
        $dirty = $dirty | r111;
        goto L76
    L73:
        r111 = 524288;
        goto L74
    L75:
        r14 = tonalElevation;
        goto L76
    L57:
        if ((r37 & 32) != 0) goto L61;
        r13 = colors;
        if ($composer2.changed(r13) == false) goto L62;
        int r112 = 131072;
    L63:
        $dirty = $dirty | r112;
    L62:
        r112 = 65536;
        goto L63
    L61:
        r13 = colors;
        goto L62
    L46:
        if ((r37 & 16) != 0) goto L50;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L51;
        int r113 = 16384;
    L52:
        $dirty = $dirty | r113;
    L51:
        r113 = 8192;
        goto L52
    L50:
        shape2 = shape;
        goto L51
    L36:
        if (($changed & 3072) != 0) goto L42;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L40;
        int r114 = 2048;
    L41:
        $dirty = $dirty | r114;
        goto L44
    L40:
        r114 = 1024;
        goto L41
    L42:
        modifier2 = modifier;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changedInstance(r28) == false) goto L30;
        int r8 = 256;
    L31:
        $dirty = $dirty | r8;
        goto L32
    L30:
        r8 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(expanded) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L23
    L20:
        r9 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r26) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    }

    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    /* JADX INFO: renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    public static final void m2552SearchBarWuY5d9Q(final String query, final Function1<? super String, Unit> r37, final Function1<? super String, Unit> r38, final boolean active, final Function1<? super Boolean, Unit> r40, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r43, Function2<? super Composer, ? super Integer, Unit> r44, Function2<? super Composer, ? super Integer, Unit> r45, Shape shape, SearchBarColors colors, float tonalElevation, float shadowElevation, WindowInsets windowInsets, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r52, Composer $composer, final int $changed, final int $changed1, final int r56) {
        Composer $composer2 = $composer.startRestartGroup(1001512593);
        ComposerKt.sourceInformation($composer2, "C(SearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,16,4)737@34012L15,738@34077L8,741@34258L12,746@34418L591,745@34386L925:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r56 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r56 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super String, Unit> r13 = r37;
    L25:
        if ((r56 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r17 = 2048;
        if ((r56 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r19 = 8192;
        if ((r56 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r21 = r56 & 32;
        int r22 = 131072;
        if (r21 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Modifier r9 = modifier;
    L68:
        int r26 = r56 & 64;
        if (r26 == 0) goto L72;
        $dirty = $dirty | 1572864;
        boolean r10 = enabled;
    L79:
        int r11 = r56 & 128;
        if (r11 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r15 = r43;
    L90:
        int r3 = r56 & 256;
        if (r3 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r0 = r56 & 512;
        if (r0 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($changed1 & 6) != 0) goto L124;
        if ((r56 & 1024) != 0) goto L120;
        if ($composer2.changed(shape) == false) goto L120;
        int r16 = 4;
    L121:
        $dirty1 = $dirty1 | r16;
    L120:
        r16 = 2;
    L124:
        if (($changed1 & 48) != 0) goto L134;
        if ((r56 & 2048) != 0) goto L131;
        if ($composer2.changed(colors) == false) goto L131;
        int r28 = 32;
    L132:
        $dirty1 = $dirty1 | r28;
    L131:
        r28 = 16;
    L134:
        int r6 = r56 & 4096;
        if (r6 == 0) goto L138;
        $dirty1 = $dirty1 | 384;
    L145:
        int r7 = r56 & 8192;
        if (r7 == 0) goto L149;
        $dirty1 = $dirty1 | 3072;
    L157:
        if (($changed1 & 24576) != 0) goto L166;
        if ((r56 & 16384) != 0) goto L164;
        if ($composer2.changed(windowInsets) == false) goto L164;
        r19 = 16384;
    L164:
        $dirty1 = $dirty1 | r19;
    L166:
        int r18 = r56 & 32768;
        if (r18 == 0) goto L170;
        int $dirty2 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L178:
        if ((r56 & 65536) == 0) goto L181;
        $dirty2 = $dirty2 | 1572864;
    L189:
        if (($dirty & 306783379) == 306783378) goto L191;
    L196:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L199;
    L211:
        if (r21 == 0) goto L213;
        Modifier.Companion modifier2 = Modifier.Companion;
    L214:
        if (r26 == 0) goto L216;
        boolean enabled2 = true;
    L217:
        if (r11 == 0) goto L219;
        r15 = null;
    L219:
        if (r3 == 0) goto L221;
        Function2<? super Composer, ? super Integer, Unit> r4 = null;
    L222:
        if (r0 == 0) goto L224;
        Function2<? super Composer, ? super Integer, Unit> r20 = null;
    L226:
        if ((r56 & 1024) == 0) goto L228;
        int $dirty3 = $dirty2 & (-15);
        Shape shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape($composer2, 6);
    L230:
        if ((r56 & 2048) == 0) goto L232;
        int $dirty4 = $dirty;
        Composer $composer3 = $composer2;
        SearchBarColors colors2 = SearchBarDefaults.INSTANCE.m2543colorsdgg9oW8(0, 0, $composer3, 384, 3);
        $dirty3 = $dirty3 & (-113);
    L233:
        if (r6 == 0) goto L235;
        float tonalElevation2 = SearchBarDefaults.INSTANCE.m2547getTonalElevationD9Ej5fM();
    L236:
        if (r7 == 0) goto L238;
        float shadowElevation2 = SearchBarDefaults.INSTANCE.m2546getShadowElevationD9Ej5fM();
    L240:
        if ((r56 & 16384) == 0) goto L242;
        WindowInsets windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets($composer3, 6);
        $dirty3 = $dirty3 & (-57345);
    L243:
        if (r18 == 0) goto L245;
        final Function2<? super Composer, ? super Integer, Unit> r24 = r4;
        final SearchBarColors colors3 = colors2;
        float tonalElevation3 = tonalElevation2;
        float shadowElevation3 = shadowElevation2;
        WindowInsets windowInsets3 = windowInsets2;
        final MutableInteractionSource interactionSource2 = null;
        final Function2<? super Composer, ? super Integer, Unit> r23 = r15;
        Shape shape3 = shape2;
        final boolean enabled3 = enabled2;
        final Function2<? super Composer, ? super Integer, Unit> r25 = r20;
        Modifier modifier3 = modifier2;
        int $dirty5 = $dirty3;
    L246:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L249;
        ComposerKt.traceEventStart(1001512593, $dirty4, $dirty5, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)");
    L249:
        final Function1<? super String, Unit> r110 = r13;
        ComposableLambda r5 = ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new SearchBar_androidKt$SearchBar$4(colors3, query, r110, r38, active, r40, enabled3, r23, r24, r25, interactionSource2), $composer3, 54);
        int r111 = ((((((((6 | (($dirty4 >> 6) & 112)) | (($dirty4 >> 6) & 896)) | (($dirty4 >> 6) & 7168)) | (($dirty5 << 12) & 57344)) | (($dirty5 << 12) & 458752)) | (($dirty5 << 12) & 3670016)) | (($dirty5 << 12) & 29360128)) | (234881024 & ($dirty5 << 12))) | (($dirty5 << 9) & 1879048192);
        Composer $composer4 = $composer3;
        SearchBarColors colors4 = colors3;
        m2553SearchBarY92LkZI(r5, active, r40, modifier3, shape3, colors4, tonalElevation3, shadowElevation3, windowInsets3, r52, $composer4, r111, 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L252;
        ComposerKt.traceEventEnd();
    L252:
        final Modifier modifier4 = modifier3;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation4 = shadowElevation3;
        final WindowInsets windowInsets4 = windowInsets3;
        final SearchBarColors colors5 = colors4;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r24;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r25;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Shape shape4 = shape3;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r23;
    L253:
        ScopeUpdateScope r1 = $composer5.endRestartGroup();
        if (r1 == null) goto L257;
        r1.updateScope(new SearchBar_androidKt$SearchBar$5(query, r37, r38, active, r40, modifier4, enabled4, r8, r12, r14, shape4, colors5, tonalElevation4, shadowElevation4, windowInsets4, interactionSource3, r52, $changed, $changed1, r56));
        return;
    L257:
        return;
    L245:
        interactionSource2 = interactionSource;
        r24 = r4;
        colors3 = colors2;
        tonalElevation3 = tonalElevation2;
        shadowElevation3 = shadowElevation2;
        windowInsets3 = windowInsets2;
        r23 = r15;
        shape3 = shape2;
        enabled3 = enabled2;
        r25 = r20;
        modifier3 = modifier2;
        $dirty5 = $dirty3;
        goto L246
    L242:
        windowInsets2 = windowInsets;
        goto L243
    L238:
        shadowElevation2 = shadowElevation;
        goto L240
    L235:
        tonalElevation2 = tonalElevation;
        goto L236
    L232:
        $composer3 = $composer2;
        $dirty4 = $dirty;
        colors2 = colors;
        goto L233
    L228:
        $dirty3 = $dirty2;
        shape2 = shape;
        goto L230
    L224:
        r20 = r45;
        goto L226
    L221:
        r4 = r44;
        goto L222
    L216:
        enabled2 = r10;
        goto L217
    L213:
        modifier2 = r9;
        goto L214
    L199:
        if ($composer2.getDefaultsInvalid() == true) goto L211;
        $composer2.skipToGroupEnd();
        if ((r56 & 1024) == 0) goto L205;
        $dirty2 = $dirty2 & (-15);
    L205:
        if ((r56 & 2048) == 0) goto L208;
        $dirty2 = $dirty2 & (-113);
    L208:
        if ((r56 & 16384) == 0) goto L210;
        $dirty5 = $dirty2 & (-57345);
        r24 = r44;
        r25 = r45;
        shape3 = shape;
        colors3 = colors;
        shadowElevation3 = shadowElevation;
        windowInsets3 = windowInsets;
        interactionSource2 = interactionSource;
        modifier3 = r9;
        enabled3 = r10;
        $composer3 = $composer2;
        r23 = r15;
        tonalElevation3 = tonalElevation;
        $dirty4 = $dirty;
        goto L246
    L210:
        r24 = r44;
        r25 = r45;
        shape3 = shape;
        colors3 = colors;
        shadowElevation3 = shadowElevation;
        windowInsets3 = windowInsets;
        interactionSource2 = interactionSource;
        modifier3 = r9;
        enabled3 = r10;
        $composer3 = $composer2;
        r23 = r15;
        $dirty5 = $dirty2;
        tonalElevation3 = tonalElevation;
        $dirty4 = $dirty;
        goto L246
    L191:
        if (($dirty2 & 599187) != 599186) goto L196;
        if ($composer2.getSkipping() == false) goto L196;
        $composer2.skipToGroupEnd();
        shape4 = shape;
        colors5 = colors;
        tonalElevation4 = tonalElevation;
        interactionSource3 = interactionSource;
        modifier4 = r9;
        enabled4 = r10;
        $composer5 = $composer2;
        r8 = r15;
        r12 = r44;
        r14 = r45;
        shadowElevation4 = shadowElevation;
        windowInsets4 = windowInsets;
        goto L253
    L181:
        if (($changed1 & 1572864) != 0) goto L189;
        if ($composer2.changedInstance(r52) == false) goto L185;
        int r112 = 1048576;
    L186:
        $dirty2 = $dirty2 | r112;
        goto L189
    L185:
        r112 = 524288;
        goto L186
    L170:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L176;
        int $dirty6 = $dirty1;
        if ($composer2.changed(interactionSource) == true) goto L175;
        r22 = 65536;
    L175:
        $dirty2 = $dirty6 | r22;
        goto L178
    L176:
        $dirty2 = $dirty1;
        goto L178
    L149:
        if (($changed1 & 3072) != 0) goto L157;
        if ($composer2.changed(shadowElevation) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L157
    L138:
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(tonalElevation) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty1 = $dirty1 | r29;
        goto L145
    L142:
        r29 = 128;
        goto L143
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r45) == false) goto L109;
        int r33 = 536870912;
    L110:
        $dirty = $dirty | r33;
        goto L113
    L109:
        r33 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r44) == false) goto L98;
        int r32 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r32;
        goto L101
    L98:
        r32 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r15 = r43;
        if ($composer2.changedInstance(r15) == false) goto L87;
        int r31 = 8388608;
    L88:
        $dirty = $dirty | r31;
        goto L90
    L87:
        r31 = 4194304;
        goto L88
    L89:
        r15 = r43;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r10 = enabled;
        if ($composer2.changed(r10) == false) goto L76;
        int r210 = 1048576;
    L77:
        $dirty = $dirty | r210;
        goto L79
    L76:
        r210 = 524288;
        goto L77
    L78:
        r10 = enabled;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r9 = modifier;
        if ($composer2.changed(r9) == false) goto L65;
        int r27 = 131072;
    L66:
        $dirty = $dirty | r27;
        goto L68
    L65:
        r27 = 65536;
        goto L66
    L67:
        r9 = modifier;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changedInstance(r40) == false) goto L54;
        int r211 = 16384;
    L55:
        $dirty = $dirty | r211;
        goto L57
    L54:
        r211 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(active) == false) goto L43;
        int r113 = 2048;
    L44:
        $dirty = $dirty | r113;
        goto L46
    L43:
        r113 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changedInstance(r38) == false) goto L32;
        int r114 = 256;
    L33:
        $dirty = $dirty | r114;
        goto L35
    L32:
        r114 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r37;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r30 = 32;
    L22:
        $dirty = $dirty | r30;
        goto L25
    L21:
        r30 = 16;
        goto L22
    L23:
        r13 = r37;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(query) == false) goto L10;
        int r34 = 4;
    L11:
        $dirty = $dirty | r34;
        goto L14
    L10:
        r34 = 2;
        goto L11
    }

    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    /* JADX INFO: renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    public static final void m2551DockedSearchBareWTbjVg(final String query, final Function1<? super String, Unit> r36, final Function1<? super String, Unit> r37, final boolean active, final Function1<? super Boolean, Unit> r39, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r42, Function2<? super Composer, ? super Integer, Unit> r43, Function2<? super Composer, ? super Integer, Unit> r44, Shape shape, SearchBarColors colors, float tonalElevation, float shadowElevation, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r50, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(1299054533);
        ComposerKt.sourceInformation($composer2, "C(DockedSearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,4)818@37222L11,819@37283L8,826@37565L591,825@37527L894:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r12 = query;
    L14:
        if ((r54 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if ((r54 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r17 = 2048;
        if ((r54 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r19 = 16384;
        if ((r54 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r21 = r54 & 32;
        int r22 = 131072;
        if (r21 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Modifier r9 = modifier;
    L68:
        int r26 = r54 & 64;
        if (r26 == 0) goto L72;
        $dirty = $dirty | 1572864;
        boolean r10 = enabled;
    L79:
        int r11 = r54 & 128;
        if (r11 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r15 = r42;
    L90:
        int r3 = r54 & 256;
        if (r3 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r0 = r54 & 512;
        if (r0 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($changed1 & 6) != 0) goto L124;
        if ((r54 & 1024) != 0) goto L120;
        if ($composer2.changed(shape) == false) goto L120;
        int r16 = 4;
    L121:
        $dirty1 = $dirty1 | r16;
    L120:
        r16 = 2;
    L124:
        if (($changed1 & 48) != 0) goto L134;
        if ((r54 & 2048) != 0) goto L131;
        if ($composer2.changed(colors) == false) goto L131;
        int r25 = 32;
    L132:
        $dirty1 = $dirty1 | r25;
    L131:
        r25 = 16;
    L134:
        int r6 = r54 & 4096;
        if (r6 == 0) goto L138;
        $dirty1 = $dirty1 | 384;
    L145:
        int r7 = r54 & 8192;
        if (r7 == 0) goto L149;
        $dirty1 = $dirty1 | 3072;
    L156:
        int r8 = r54 & 16384;
        if (r8 == 0) goto L160;
        $dirty1 = $dirty1 | 24576;
    L168:
        if ((r54 & 32768) == 0) goto L171;
        int $dirty2 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L179:
        if (($dirty & 306783379) == 306783378) goto L181;
    L186:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L189;
    L198:
        if (r21 == 0) goto L200;
        Modifier.Companion modifier2 = Modifier.Companion;
    L201:
        if (r26 == 0) goto L203;
        boolean enabled2 = true;
    L204:
        if (r11 == 0) goto L206;
        r15 = null;
    L206:
        if (r3 == 0) goto L208;
        Function2<? super Composer, ? super Integer, Unit> r4 = null;
    L209:
        if (r0 == 0) goto L211;
        Function2<? super Composer, ? super Integer, Unit> r20 = null;
    L213:
        if ((r54 & 1024) == 0) goto L215;
        int $dirty3 = $dirty2 & (-15);
        Shape shape2 = SearchBarDefaults.INSTANCE.getDockedShape($composer2, 6);
    L217:
        if ((r54 & 2048) == 0) goto L219;
        int $dirty4 = $dirty;
        Composer $composer3 = $composer2;
        SearchBarColors colors2 = SearchBarDefaults.INSTANCE.m2543colorsdgg9oW8(0, 0, $composer3, 384, 3);
        $dirty3 = $dirty3 & (-113);
    L220:
        if (r6 == 0) goto L222;
        float tonalElevation2 = SearchBarDefaults.INSTANCE.m2547getTonalElevationD9Ej5fM();
    L223:
        if (r7 == 0) goto L225;
        float shadowElevation2 = SearchBarDefaults.INSTANCE.m2546getShadowElevationD9Ej5fM();
    L226:
        if (r8 == 0) goto L228;
        final Function2<? super Composer, ? super Integer, Unit> r23 = r4;
        float tonalElevation3 = tonalElevation2;
        float shadowElevation3 = shadowElevation2;
        final MutableInteractionSource interactionSource2 = null;
        final Function2<? super Composer, ? super Integer, Unit> r24 = r15;
        Shape shape3 = shape2;
        final Function2<? super Composer, ? super Integer, Unit> r27 = r20;
        Modifier modifier3 = modifier2;
        final SearchBarColors colors3 = colors2;
        int $dirty5 = $dirty3;
        final boolean enabled3 = enabled2;
    L229:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L232;
        ComposerKt.traceEventStart(1299054533, $dirty4, $dirty5, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)");
    L232:
        final String r18 = r12;
        ComposableLambda r5 = ComposableLambdaKt.rememberComposableLambda(-303118761, true, new SearchBar_androidKt$DockedSearchBar$4(colors3, r18, r36, r37, active, r39, enabled3, r24, r23, r27, interactionSource2), $composer3, 54);
        int r14 = (((((((6 | (($dirty4 >> 6) & 112)) | (($dirty4 >> 6) & 896)) | (($dirty4 >> 6) & 7168)) | (($dirty5 << 12) & 57344)) | (($dirty5 << 12) & 458752)) | (($dirty5 << 12) & 3670016)) | (29360128 & ($dirty5 << 12))) | (($dirty5 << 9) & 234881024);
        Composer $composer4 = $composer3;
        SearchBarColors colors4 = colors3;
        m2550DockedSearchBarEQC0FA8(r5, active, r39, modifier3, shape3, colors4, tonalElevation3, shadowElevation3, r50, $composer4, r14, 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L235;
        ComposerKt.traceEventEnd();
    L235:
        final Modifier modifier4 = modifier3;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation4 = shadowElevation3;
        final SearchBarColors colors5 = colors4;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r23;
        final Function2<? super Composer, ? super Integer, Unit> r110 = r27;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Shape shape4 = shape3;
        final Function2<? super Composer, ? super Integer, Unit> r28 = r24;
    L236:
        ScopeUpdateScope r1 = $composer5.endRestartGroup();
        if (r1 == null) goto L240;
        r1.updateScope(new SearchBar_androidKt$DockedSearchBar$5(query, r36, r37, active, r39, modifier4, enabled4, r28, r13, r110, shape4, colors5, tonalElevation4, shadowElevation4, interactionSource3, r50, $changed, $changed1, r54));
        return;
    L240:
        return;
    L228:
        interactionSource2 = interactionSource;
        modifier3 = modifier2;
        r23 = r4;
        tonalElevation3 = tonalElevation2;
        shadowElevation3 = shadowElevation2;
        r24 = r15;
        shape3 = shape2;
        r27 = r20;
        $dirty5 = $dirty3;
        colors3 = colors2;
        enabled3 = enabled2;
        goto L229
    L225:
        shadowElevation2 = shadowElevation;
        goto L226
    L222:
        tonalElevation2 = tonalElevation;
        goto L223
    L219:
        $composer3 = $composer2;
        $dirty4 = $dirty;
        colors2 = colors;
        goto L220
    L215:
        $dirty3 = $dirty2;
        shape2 = shape;
        goto L217
    L211:
        r20 = r44;
        goto L213
    L208:
        r4 = r43;
        goto L209
    L203:
        enabled2 = r10;
        goto L204
    L200:
        modifier2 = r9;
        goto L201
    L189:
        if ($composer2.getDefaultsInvalid() == true) goto L198;
        $composer2.skipToGroupEnd();
        if ((r54 & 1024) == 0) goto L195;
        $dirty2 = $dirty2 & (-15);
    L195:
        if ((r54 & 2048) == 0) goto L197;
        $dirty5 = $dirty2 & (-113);
        r23 = r43;
        r27 = r44;
        shape3 = shape;
        shadowElevation3 = shadowElevation;
        interactionSource2 = interactionSource;
        modifier3 = r9;
        enabled3 = r10;
        $composer3 = $composer2;
        r24 = r15;
        colors3 = colors;
        tonalElevation3 = tonalElevation;
        $dirty4 = $dirty;
        goto L229
    L197:
        r23 = r43;
        r27 = r44;
        shape3 = shape;
        shadowElevation3 = shadowElevation;
        interactionSource2 = interactionSource;
        modifier3 = r9;
        enabled3 = r10;
        $composer3 = $composer2;
        r24 = r15;
        $dirty5 = $dirty2;
        colors3 = colors;
        tonalElevation3 = tonalElevation;
        $dirty4 = $dirty;
        goto L229
    L181:
        if (($dirty2 & 74899) != 74898) goto L186;
        if ($composer2.getSkipping() == false) goto L186;
        $composer2.skipToGroupEnd();
        shape4 = shape;
        colors5 = colors;
        shadowElevation4 = shadowElevation;
        modifier4 = r9;
        enabled4 = r10;
        $composer5 = $composer2;
        r28 = r15;
        r13 = r43;
        r110 = r44;
        tonalElevation4 = tonalElevation;
        interactionSource3 = interactionSource;
        goto L236
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L177;
        int $dirty6 = $dirty1;
        if ($composer2.changedInstance(r50) == true) goto L176;
        r22 = 65536;
    L176:
        $dirty2 = $dirty6 | r22;
        goto L179
    L177:
        $dirty2 = $dirty1;
        goto L179
    L160:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changed(interactionSource) == true) goto L165;
        r19 = 8192;
    L165:
        $dirty1 = $dirty1 | r19;
        goto L168
    L149:
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changed(shadowElevation) == true) goto L154;
        r17 = 1024;
    L154:
        $dirty1 = $dirty1 | r17;
        goto L156
    L138:
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(tonalElevation) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty1 = $dirty1 | r29;
        goto L145
    L142:
        r29 = 128;
        goto L143
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r44) == false) goto L109;
        int r32 = 536870912;
    L110:
        $dirty = $dirty | r32;
        goto L113
    L109:
        r32 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r43) == false) goto L98;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r31;
        goto L101
    L98:
        r31 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r15 = r42;
        if ($composer2.changedInstance(r15) == false) goto L87;
        int r30 = 8388608;
    L88:
        $dirty = $dirty | r30;
        goto L90
    L87:
        r30 = 4194304;
        goto L88
    L89:
        r15 = r42;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r10 = enabled;
        if ($composer2.changed(r10) == false) goto L76;
        int r210 = 1048576;
    L77:
        $dirty = $dirty | r210;
        goto L79
    L76:
        r210 = 524288;
        goto L77
    L78:
        r10 = enabled;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r9 = modifier;
        if ($composer2.changed(r9) == false) goto L65;
        int r211 = 131072;
    L66:
        $dirty = $dirty | r211;
        goto L68
    L65:
        r211 = 65536;
        goto L66
    L67:
        r9 = modifier;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changedInstance(r39) == false) goto L54;
        int r212 = 16384;
    L55:
        $dirty = $dirty | r212;
        goto L57
    L54:
        r212 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(active) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changedInstance(r37) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changedInstance(r36) == false) goto L21;
        int r33 = 32;
    L22:
        $dirty = $dirty | r33;
        goto L25
    L21:
        r33 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = query;
        if ($composer2.changed(r12) == false) goto L10;
        int r34 = 4;
    L11:
        $dirty = $dirty | r34;
        goto L14
    L10:
        r34 = 2;
        goto L11
    L12:
        r12 = query;
        goto L14
    }

    /* JADX INFO: renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    public static final void m2554SearchBarImplj1jLAyQ(final Animatable<Float, AnimationVector1D> r27, final MutableFloatState finalBackProgress, final MutableState<BackEventCompat> r29, final MutableState<BackEventCompat> r30, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r32, Shape shape, SearchBarColors colors, float tonalElevation, float shadowElevation, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r38, Composer $composer, final int $changed, final int $changed1, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(-440333505);
        ComposerKt.sourceInformation($composer2, "C(SearchBarImpl)P(!1,4,5,3,7,6,9!1,10:c#ui.unit.Dp,8:c#ui.unit.Dp,11)861@38824L15,862@38889L8,865@39070L12,868@39168L7,870@39228L15,871@39295L15,872@39341L101,876@39475L666,892@40180L333,903@40538L99,916@40970L362:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L16:
        if ((r42 & 2) == 0) goto L19;
        $dirty = $dirty | 48;
    L27:
        if ((r42 & 4) == 0) goto L30;
        $dirty = $dirty | 384;
    L38:
        if ((r42 & 8) == 0) goto L41;
        $dirty = $dirty | 3072;
        MutableState<BackEventCompat> r14 = r30;
    L48:
        int r4 = r42 & 16;
        if (r4 == 0) goto L52;
        $dirty = $dirty | 24576;
        final Modifier modifier2 = modifier;
    L60:
        if ((r42 & 32) == 0) goto L63;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L70:
        int $dirty1 = $changed1;
        if (($changed & 1572864) != 0) goto L82;
        if ((r42 & 64) != 0) goto L78;
        if ($composer2.changed(shape) == false) goto L78;
        int r20 = 1048576;
    L79:
        $dirty = $dirty | r20;
    L78:
        r20 = 524288;
    L82:
        if (($changed & 12582912) == 0) goto L84;
        SearchBarColors r6 = colors;
    L92:
        int r3 = r42 & 256;
        if (r3 == 0) goto L96;
        $dirty = $dirty | 100663296;
    L103:
        int r5 = r42 & 512;
        if (r5 == 0) goto L107;
        $dirty = $dirty | 805306368;
        float r7 = shadowElevation;
    L115:
        if (($changed1 & 6) == 0) goto L117;
        WindowInsets windowInsets2 = windowInsets;
    L126:
        if ((r42 & 2048) == 0) goto L129;
        $dirty1 = $dirty1 | 48;
    L136:
        if ((306783379 & $dirty) == 306783378) goto L138;
    L143:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L146;
    L158:
        if (r4 == 0) goto L160;
        Modifier.Companion modifier3 = Modifier.Companion;
    L162:
        if ((r42 & 64) == 0) goto L164;
        Shape shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape($composer2, 6);
        int $dirty2 = $dirty & (-3670017);
    L166:
        if ((r42 & 128) == 0) goto L168;
        int r1 = 6;
        SearchBarColors colors2 = SearchBarDefaults.INSTANCE.m2543colorsdgg9oW8(0, 0, $composer2, 384, 3);
        $dirty2 = $dirty2 & (-29360129);
    L169:
        if (r3 == 0) goto L171;
        float tonalElevation2 = SearchBarDefaults.INSTANCE.m2547getTonalElevationD9Ej5fM();
    L172:
        if (r5 == 0) goto L174;
        float shadowElevation2 = SearchBarDefaults.INSTANCE.m2546getShadowElevationD9Ej5fM();
    L176:
        if ((r42 & 1024) == 0) goto L178;
        final float shadowElevation3 = shadowElevation2;
        windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets($composer2, r1);
        int $dirty3 = $dirty1 & (-15);
        int $dirty4 = $dirty2;
        Modifier r8 = modifier3;
        final float tonalElevation3 = tonalElevation2;
        final SearchBarColors colors3 = colors2;
        Shape shape3 = shape2;
    L179:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L183;
        ComposerKt.traceEventStart(-440333505, $dirty4, $dirty3, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)");
    L183:
        ProvidableCompositionLocal<Density> r9 = CompositionLocalsKt.getLocalDensity();
        int $dirty5 = $dirty3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r2;
        Shape defaultInputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape($composer2, 6);
        Shape defaultFullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape($composer2, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
        Object value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L187;
        value$iv = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1(r27));
        $composer2.updateRememberedValue(value$iv);
    L187:
        State useFullScreenShape$delegate = (State) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean r10 = SearchBarImpl_j1jLAyQ$lambda$9(useFullScreenShape$delegate);
        ComposerKt.sourceInformationMarkerStart($composer2, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
        boolean r11 = $composer2.changed(r10);
        if (((3670016 & $dirty4) ^ 1572864) <= 1048576) goto L192;
        if ($composer2.changed(shape3) == false) goto L192;
    L193:
        boolean r12 = true;
    L195:
        boolean invalid$iv = r11 | r12;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L202;
        if (it$iv == Composer.Companion.getEmpty()) goto L202;
        Shape shape4 = shape3;
        Shape defaultInputFieldShape2 = defaultInputFieldShape;
        GenericShape value$iv2 = it$iv;
    L209:
        final Shape animatedShape = (Shape) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2 surface = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new SearchBar_androidKt$SearchBarImpl$surface$1(animatedShape, colors3, tonalElevation3, shadowElevation3), $composer2, 54);
        ComposerKt.sourceInformationMarkerStart($composer2, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L212;
        Object value$iv3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new SearchBar_androidKt$SearchBarImpl$showContent$2$1(r27));
        $composer2.updateRememberedValue(value$iv3);
    L213:
        State showContent$delegate = (State) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(-1567201454);
        ComposerKt.sourceInformation($composer2, "908@40729L215");
        if (SearchBarImpl_j1jLAyQ$lambda$12(showContent$delegate) == false) goto L216;
        Function2 wrappedContent = ComposableLambdaKt.rememberComposableLambda(147843820, true, new SearchBar_androidKt$SearchBarImpl$wrappedContent$1(r27, colors3, r38), $composer2, 54);
    L217:
        $composer2.endReplaceGroup();
        Modifier modifier4 = r8;
        float tonalElevation4 = tonalElevation3;
        float shadowElevation4 = shadowElevation3;
        WindowInsets windowInsets3 = windowInsets2;
        SearchBarColors colors4 = colors3;
        SearchBarLayout(r27, finalBackProgress, r29, r14, modifier4, windowInsets3, r32, surface, wrappedContent, $composer2, (((((((Animatable.$stable | 12582912) | ($dirty4 & 14)) | ($dirty4 & 112)) | ($dirty4 & 896)) | ($dirty4 & 7168)) | (57344 & $dirty4)) | (($dirty5 << 15) & 458752)) | (($dirty4 << 3) & 3670016));
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L220;
        ComposerKt.traceEventEnd();
    L220:
        final WindowInsets windowInsets4 = windowInsets3;
        final SearchBarColors colors5 = colors4;
        final float tonalElevation5 = tonalElevation4;
        final Shape shape5 = shape4;
        final float shadowElevation5 = shadowElevation4;
        modifier2 = modifier4;
    L221:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L225;
        r0.updateScope(new SearchBar_androidKt$SearchBarImpl$1(r27, finalBackProgress, r29, r30, modifier2, r32, shape5, colors5, tonalElevation5, shadowElevation5, windowInsets4, r38, $changed, $changed1, r42));
        return;
    L225:
        return;
    L216:
        wrappedContent = null;
        goto L217
    L212:
        value$iv3 = it$iv2;
    L202:
        if (Intrinsics.areEqual(shape3, defaultInputFieldShape) == false) goto L204;
        shape4 = shape3;
        defaultInputFieldShape2 = defaultInputFieldShape;
        value$iv2 = new GenericShape(new SearchBar_androidKt$SearchBarImpl$animatedShape$1$1(density, r27));
    L208:
        $composer2.updateRememberedValue(value$iv2);
        goto L209
    L204:
        shape4 = shape3;
        defaultInputFieldShape2 = defaultInputFieldShape;
        if (SearchBarImpl_j1jLAyQ$lambda$9(useFullScreenShape$delegate) == false) goto L207;
        value$iv2 = defaultFullScreenShape;
        goto L208
    L207:
        value$iv2 = shape4;
    L192:
        if (($dirty4 & 1572864) == 1048576) goto L193;
        r12 = false;
        goto L195
    L178:
        windowInsets2 = windowInsets;
        tonalElevation3 = tonalElevation2;
        shadowElevation3 = shadowElevation2;
        $dirty3 = $dirty1;
        $dirty4 = $dirty2;
        r8 = modifier3;
        colors3 = colors2;
        shape3 = shape2;
        goto L179
    L174:
        shadowElevation2 = shadowElevation;
        goto L176
    L171:
        tonalElevation2 = tonalElevation;
        goto L172
    L168:
        r1 = 6;
        colors2 = colors;
        goto L169
    L164:
        shape2 = shape;
        $dirty2 = $dirty;
        goto L166
    L160:
        modifier3 = modifier2;
        goto L162
    L146:
        if ($composer2.getDefaultsInvalid() == true) goto L158;
        $composer2.skipToGroupEnd();
        if ((r42 & 64) == 0) goto L152;
        $dirty = $dirty & (-3670017);
    L152:
        if ((r42 & 128) == 0) goto L155;
        $dirty = $dirty & (-29360129);
    L155:
        if ((r42 & 1024) == 0) goto L157;
        $dirty1 = $dirty1 & (-15);
    L157:
        SearchBarColors r13 = r6;
        shadowElevation3 = r7;
        colors3 = r13;
        $dirty4 = $dirty;
        r8 = modifier2;
        $dirty3 = $dirty1;
        shape3 = shape;
        tonalElevation3 = tonalElevation;
        goto L179
    L138:
        if (($dirty1 & 19) != 18) goto L143;
        if ($composer2.getSkipping() == false) goto L143;
        $composer2.skipToGroupEnd();
        tonalElevation5 = tonalElevation;
        shadowElevation5 = r7;
        $composer3 = $composer2;
        windowInsets4 = windowInsets2;
        shape5 = shape;
        colors5 = r6;
        goto L221
    L129:
        if (($changed1 & 48) != 0) goto L136;
        if ($composer2.changedInstance(r38) == false) goto L133;
        int r24 = 32;
    L134:
        $dirty1 = $dirty1 | r24;
        goto L136
    L133:
        r24 = 16;
        goto L134
    L117:
        if ((r42 & 1024) != 0) goto L121;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L122;
        int r21 = 4;
    L123:
        $dirty1 = $dirty1 | r21;
    L122:
        r21 = 2;
        goto L123
    L121:
        windowInsets2 = windowInsets;
        goto L122
    L107:
        if (($changed & 805306368) != 0) goto L113;
        r7 = shadowElevation;
        if ($composer2.changed(r7) == false) goto L111;
        int r25 = 536870912;
    L112:
        $dirty = $dirty | r25;
        goto L115
    L111:
        r25 = 268435456;
        goto L112
    L113:
        r7 = shadowElevation;
        goto L115
    L96:
        if (($changed & 100663296) != 0) goto L103;
        if ($composer2.changed(tonalElevation) == false) goto L100;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L101:
        $dirty = $dirty | r23;
        goto L103
    L100:
        r23 = 33554432;
        goto L101
    L84:
        if ((r42 & 128) != 0) goto L88;
        r6 = colors;
        if ($composer2.changed(r6) == false) goto L89;
        int r22 = 8388608;
    L90:
        $dirty = $dirty | r22;
    L89:
        r22 = 4194304;
        goto L90
    L88:
        r6 = colors;
        goto L89
    L63:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L70;
        if ($composer2.changedInstance(r32) == false) goto L67;
        int r17 = 131072;
    L68:
        $dirty = $dirty | r17;
        goto L70
    L67:
        r17 = 65536;
        goto L68
    L52:
        if (($changed & 24576) != 0) goto L58;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L56;
        int r16 = 16384;
    L57:
        $dirty = $dirty | r16;
        goto L60
    L56:
        r16 = 8192;
        goto L57
    L58:
        modifier2 = modifier;
        goto L60
    L41:
        if (($changed & 3072) != 0) goto L47;
        r14 = r30;
        if ($composer2.changed(r14) == false) goto L45;
        int r15 = 2048;
    L46:
        $dirty = $dirty | r15;
        goto L48
    L45:
        r15 = 1024;
        goto L46
    L47:
        r14 = r30;
        goto L48
    L30:
        if (($changed & 384) != 0) goto L38;
        if ($composer2.changed(r29) == false) goto L34;
        int r18 = 256;
    L35:
        $dirty = $dirty | r18;
        goto L38
    L34:
        r18 = 128;
        goto L35
    L19:
        if (($changed & 48) != 0) goto L27;
        if ($composer2.changed(finalBackProgress) == false) goto L23;
        int r19 = 32;
    L24:
        $dirty = $dirty | r19;
        goto L27
    L23:
        r19 = 16;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L16;
        if (($changed & 8) != 0) goto L10;
        boolean r26 = $composer2.changed(r27);
    L11:
        if (r26 == false) goto L13;
        int r28 = 4;
    L14:
        $dirty = $dirty | r28;
        goto L16
    L13:
        r28 = 2;
        goto L14
    L10:
        r26 = $composer2.changedInstance(r27);
        goto L11
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    private static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> r48, final MutableFloatState finalBackProgress, final MutableState<BackEventCompat> r50, final MutableState<BackEventCompat> r51, final Modifier modifier, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> r54, final Function2<? super Composer, ? super Integer, Unit> r55, final Function2<? super Composer, ? super Integer, Unit> r56, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(70029564);
        ComposerKt.sourceInformation($composer2, "C(SearchBarLayout)P(!1,3,4,2,6,8,5,7)945@42029L34,950@42191L120,965@42827L5009,946@42068L5768:SearchBar.android.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r3 = $composer2.changed(r48);
    L8:
        if (r3 == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    L7:
        r3 = $composer2.changedInstance(r48);
    L13:
        if (($changed & 48) != 0) goto L21;
        if ($composer2.changed(finalBackProgress) == false) goto L17;
        int r13 = 32;
    L18:
        $dirty = $dirty | r13;
        goto L21
    L17:
        r13 = 16;
    L21:
        if (($changed & 384) != 0) goto L27;
        MutableState<BackEventCompat> r14 = r50;
        if ($composer2.changed(r14) == false) goto L25;
        int r15 = 256;
    L26:
        $dirty = $dirty | r15;
    L29:
        if (($changed & 3072) != 0) goto L35;
        MutableState<BackEventCompat> r16 = r51;
        if ($composer2.changed(r16) == false) goto L33;
        int r17 = 2048;
    L34:
        $dirty = $dirty | r17;
    L37:
        if (($changed & 24576) != 0) goto L44;
        if ($composer2.changed(modifier) == false) goto L41;
        int r5 = 16384;
    L42:
        $dirty = $dirty | r5;
        goto L44
    L41:
        r5 = 8192;
    L44:
        if ((196608 & $changed) != 0) goto L51;
        if ($composer2.changed(windowInsets) == false) goto L48;
        int r6 = 131072;
    L49:
        $dirty = $dirty | r6;
        goto L51
    L48:
        r6 = 65536;
    L51:
        if ((1572864 & $changed) != 0) goto L58;
        if ($composer2.changedInstance(r54) == false) goto L55;
        int r7 = 1048576;
    L56:
        $dirty = $dirty | r7;
        goto L58
    L55:
        r7 = 524288;
    L58:
        if ((12582912 & $changed) != 0) goto L65;
        if ($composer2.changedInstance(r55) == false) goto L62;
        int r8 = 8388608;
    L63:
        $dirty = $dirty | r8;
        goto L65
    L62:
        r8 = 4194304;
    L65:
        if ((100663296 & $changed) != 0) goto L72;
        if ($composer2.changedInstance(r56) == false) goto L69;
        int r9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L70:
        $dirty = $dirty | r9;
        goto L72
    L69:
        r9 = 33554432;
    L72:
        if ((38347923 & $dirty) != 38347922) goto L78;
        if ($composer2.getSkipping() == false) goto L78;
        $composer2.skipToGroupEnd();
    L191:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L195;
        r18.updateScope(new AnonymousClass4(r48, finalBackProgress, r50, r51, modifier, windowInsets, r54, r55, r56, $changed));
        return;
    L195:
        return;
    L78:
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        ComposerKt.traceEventStart(70029564, $dirty, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
    L80:
        ComposerKt.sourceInformationMarkerStart($composer2, -660147884, "CC(remember):SearchBar.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L83;
        Object value$iv = new MutableWindowInsets(null, 1, null);
        $composer2.updateRememberedValue(value$iv);
    L84:
        final MutableWindowInsets unconsumedInsets = (MutableWindowInsets) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r10 = ZIndexModifierKt.zIndex(modifier, 1.0f);
        ComposerKt.sourceInformationMarkerStart($composer2, -660142614, "CC(remember):SearchBar.android.kt#9igjgp");
        if ((458752 & $dirty) != 131072) goto L87;
        boolean invalid$iv = true;
    L88:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L95;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L95;
        Object value$iv2 = it$iv2;
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r11 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(r10, (Function1) value$iv2), windowInsets);
        ComposerKt.sourceInformationMarkerStart($composer2, -660117373, "CC(remember):SearchBar.android.kt#9igjgp");
        if (($dirty & 14) != 4) goto L99;
    L104:
        boolean r12 = true;
    L106:
        if (($dirty & 7168) != 2048) goto L108;
        boolean r19 = true;
    L109:
        boolean r20 = r12 | r19;
        if (($dirty & 112) != 32) goto L112;
        boolean r21 = true;
    L113:
        boolean r22 = r20 | r21;
        if (($dirty & 896) != 256) goto L116;
        boolean r23 = true;
    L117:
        boolean invalid$iv2 = r22 | r23;
        Object value$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L120;
    L123:
        int $dirty2 = $dirty;
        final MutableWindowInsets unconsumedInsets2 = unconsumedInsets;
        final MutableState<BackEventCompat> r24 = r16;
        final MutableState<BackEventCompat> r25 = r14;
        int $dirty3 = $dirty2;
        value$iv3 = new SearchBar_androidKt$SearchBarLayout$2$1(r48, unconsumedInsets2, r24, finalBackProgress, r25);
        $composer2.updateRememberedValue(value$iv3);
    L124:
        MeasurePolicy r26 = (MeasurePolicy) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, r11);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L127;
        ComposablesKt.invalidApplier();
    L127:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L130;
        Function0<ComposeUiNode> r0 = r110;
        $composer2.createNode(r0);
    L131:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, r26, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L137;
        int $changed$iv$iv2 = $changed$iv$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L139;
    L138:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r2);
    L139:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 36789781, "C955@42396L85,956@42494L119:SearchBar.android.kt#uh7d8r");
        Modifier modifier$iv = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSurface);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r34 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = ((((390 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L142;
        ComposablesKt.invalidApplier();
    L142:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L145;
        Function0<ComposeUiNode> r27 = r34;
        $composer2.createNode(r27);
    L146:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r111 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L153;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L153;
    L154:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r28 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r39 = BoxScopeInstance.INSTANCE;
        int r41 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1442016074, "C955@42470L9:SearchBar.android.kt#uh7d8r");
        r55.invoke($composer2, Integer.valueOf(($dirty3 >> 21) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdInputField);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, true);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r33 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = ((((390 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L157;
        ComposablesKt.invalidApplier();
    L157:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L160;
        Function0<ComposeUiNode> r29 = r33;
        $composer2.createNode(r29);
    L161:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r112 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L168;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L168;
    L169:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r30 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r113 = BoxScopeInstance.INSTANCE;
        int r37 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1442132231, "C957@42587L12:SearchBar.android.kt#uh7d8r");
        r54.invoke($composer2, Integer.valueOf(($dirty3 >> 18) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(-1107184481);
        ComposerKt.sourceInformation($composer2, "*960@42668L127");
        if (r56 != null) goto L172;
        Composer $composer3 = $composer2;
    L188:
        $composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L191;
        ComposerKt.traceEventEnd();
        goto L191
    L172:
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSearchContent);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, true);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
        Function0<ComposeUiNode> r31 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = ((((390 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L175;
        ComposablesKt.invalidApplier();
    L175:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L178;
        Function0<ComposeUiNode> r32 = r31;
        $composer2.createNode(r32);
    L179:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r35 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L185;
        $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L187;
    L186:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r35);
    L187:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r36 = ($changed$iv$iv$iv3 >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r38 = BoxScopeInstance.INSTANCE;
        int r40 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 1302856683, "C961@42768L9:SearchBar.android.kt#uh7d8r");
        r56.invoke($composer$iv, 0);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Unit r42 = Unit.INSTANCE;
        Unit r43 = Unit.INSTANCE;
        goto L188
    L185:
        $composer3 = $composer2;
        goto L186
    L178:
        r32 = r31;
        $composer2.useNode();
    L168:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r112);
        goto L169
    L160:
        r29 = r33;
        $composer2.useNode();
    L153:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r111);
        goto L154
    L145:
        r27 = r34;
        $composer2.useNode();
        goto L146
    L137:
        $changed$iv$iv2 = $changed$iv$iv;
        goto L138
    L130:
        r0 = r110;
        $composer2.useNode();
        goto L131
    L120:
        if (value$iv3 == Composer.Companion.getEmpty()) goto L123;
        $dirty3 = $dirty;
        unconsumedInsets2 = unconsumedInsets;
        goto L124
    L116:
        r23 = false;
        goto L117
    L112:
        r21 = false;
        goto L113
    L108:
        r19 = false;
        goto L109
    L99:
        if (($dirty & 8) != 0) goto L101;
    L103:
        r12 = false;
        goto L106
    L101:
        if ($composer2.changedInstance(r48) == false) goto L103;
    L95:
        value$iv2 = (Function1) new SearchBar_androidKt$SearchBarLayout$1$1(unconsumedInsets, windowInsets);
        $composer2.updateRememberedValue(value$iv2);
        goto L96
    L87:
        invalid$iv = false;
        goto L88
    L83:
        value$iv = it$iv;
        goto L84
    L33:
        r17 = 1024;
        goto L34
    L35:
        r16 = r51;
        goto L37
    L25:
        r15 = 128;
        goto L26
    L27:
        r14 = r50;
        goto L29
    }

    private static final float calculatePredictiveBackMultiplier(BackEventCompat currentBackEvent, float progress, float finalBackProgress) {
        if (currentBackEvent != null) goto L6;
        return 0.0f;
    L6:
        if (Float.isNaN(finalBackProgress) == false) goto L9;
        return 1.0f;
    L9:
        if (finalBackProgress > 0.0f) goto L12;
        return 0.0f;
    L12:
        return progress / finalBackProgress;
    }

    /* JADX INFO: renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    private static final int m2557calculatePredictiveBackOffsetXrOvwMX4(long constraints, int minMargin, BackEventCompat currentBackEvent, LayoutDirection layoutDirection, float progress, float predictiveBackMultiplier) {
        if (currentBackEvent == null) goto L20;
        int rtlMultiplier = 1;
        if (predictiveBackMultiplier != 0.0f) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L20;
        if (currentBackEvent.getSwipeEdge() != 0) goto L13;
        int directionMultiplier = 1;
    L15:
        if (layoutDirection == LayoutDirection.Ltr) goto L18;
        rtlMultiplier = -1;
    L18:
        float maxOffsetX = (Constraints.m6926getMaxWidthimpl(constraints) * SearchBarPredictiveBackMaxOffsetXRatio) - minMargin;
        float interpolatedOffsetX = (1.0f - progress) * maxOffsetX;
        return MathKt.roundToInt(((interpolatedOffsetX * predictiveBackMultiplier) * directionMultiplier) * rtlMultiplier);
    L13:
        directionMultiplier = -1;
        goto L15
    L7:
        r1 = false;
    L20:
        return 0;
    }

    /* JADX INFO: renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    private static final int m2558calculatePredictiveBackOffsetYdzo92Q0(long constraints, int minMargin, BackEventCompat currentBackEvent, BackEventCompat firstBackEvent, int height, int maxOffsetY, float predictiveBackMultiplier) {
        if (firstBackEvent == null) goto L13;
        if (currentBackEvent == null) goto L13;
        if (predictiveBackMultiplier != 0.0f) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L13;
        int availableVerticalSpace = Math.max(0, ((Constraints.m6925getMaxHeightimpl(constraints) - height) / 2) - minMargin);
        int adjustedMaxOffsetY = Math.min(availableVerticalSpace, maxOffsetY);
        float yDelta = currentBackEvent.getTouchY() - firstBackEvent.getTouchY();
        float yProgress = Math.abs(yDelta) / Constraints.m6925getMaxHeightimpl(constraints);
        float directionMultiplier = Math.signum(yDelta);
        int interpolatedOffsetY = MathHelpersKt.lerp(0, adjustedMaxOffsetY, yProgress);
        return MathKt.roundToInt((interpolatedOffsetY * predictiveBackMultiplier) * directionMultiplier);
    L8:
        r1 = false;
    L13:
        return 0;
    }

    static {
        UnspecifiedTextFieldColors = new TextFieldColors(Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), new TextSelectionColors(Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), null), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), null);
        float arg0$iv = SearchBarDefaults.INSTANCE.m2545getInputFieldHeightD9Ej5fM();
        SearchBarCornerRadius = Dp.m6973constructorimpl(arg0$iv / 2);
        DockedExpandedTableMinHeight = Dp.m6973constructorimpl(240);
        SearchBarMinWidth = Dp.m6973constructorimpl(360);
        SearchBarMaxWidth = Dp.m6973constructorimpl(720);
        SearchBarVerticalPadding = Dp.m6973constructorimpl(8);
        SearchBarIconOffsetX = Dp.m6973constructorimpl(4);
        SearchBarPredictiveBackMinMargin = Dp.m6973constructorimpl(8);
        SearchBarPredictiveBackMaxOffsetY = Dp.m6973constructorimpl(24);
        AnimationEnterEasing = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationExitEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationEnterFloatSpec = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, AnimationEnterEasing);
        AnimationExitFloatSpec = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, AnimationExitEasing);
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, AnimationExitEasing, 2, null);
        AnimationEnterSizeSpec = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, AnimationEnterEasing);
        AnimationExitSizeSpec = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, AnimationExitEasing);
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(AnimationEnterFloatSpec, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(AnimationEnterSizeSpec, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(AnimationExitFloatSpec, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(AnimationExitSizeSpec, null, false, null, 14, null));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }
}
