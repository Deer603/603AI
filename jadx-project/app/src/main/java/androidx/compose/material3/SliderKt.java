package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0098\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0007¢\u0006\u0002\u0010'\u001aä\u0001\u0010\u0016\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\b\b\u0003\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101\u001a\u007f\u0010\u0016\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0003\u0010/\u001a\u0002002\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u00102\u001a\u0080\u0001\u00103\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0003¢\u0006\u0002\u00104\u001as\u00105\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020 2\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0007¢\u0006\u0002\u00109\u001a³\u0001\u00105\u001a\u00020\u00172\u0006\u0010(\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020 2\b\b\u0003\u0010/\u001a\u0002002\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)H\u0007¢\u0006\u0002\u0010:\u001a}\u00105\u001a\u00020\u00172\u0006\u0010(\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0003\u0010/\u001a\u0002002\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020 H\u0007¢\u0006\u0002\u0010;\u001a_\u0010<\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u00107\u001a\u00020 2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0003¢\u0006\u0002\u0010=\u001a\u001d\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020*H\u0001¢\u0006\u0002\u0010A\u001a\u001b\u0010>\u001a\u00020\u00112\f\u0010B\u001a\b\u0012\u0004\u0012\u00020*0)H\u0001¢\u0006\u0002\u0010C\u001a \u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020*H\u0002\u001a:\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a0\u0010H\u001a\u00020*2\u0006\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020*2\u0006\u0010P\u001a\u00020*2\u0006\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020*H\u0002\u001a(\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020*2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020*H\u0002\u001a\u0010\u0010W\u001a\u00020T2\u0006\u0010/\u001a\u000200H\u0002\u001a5\u0010X\u001a\u0010\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020*\u0018\u00010Y*\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0082@ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u001c\u0010b\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a,\u0010c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0010H\u0003\u001a\u001c\u0010d\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a\u001c\u0010e\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a$\u0010f\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u0002062\u0006\u00107\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0010H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\r\u0010\u000b\"\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u001e\u0010\u000f\u001a\u00020\u0010*\u00020\u00118@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"SliderRangeTolerance", "", "ThumbHeight", "Landroidx/compose/ui/unit/Dp;", "F", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbTrackGapSize", "ThumbWidth", "getThumbWidth", "()F", "TrackHeight", "getTrackHeight", "TrackInsideCornerSize", "isSpecified", "", "Landroidx/compose/material3/SliderRange;", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified-If1S1O4", "(J)Z", "RangeSlider", "", "state", "Landroidx/compose/material3/RangeSliderState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/SliderColors;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumb", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "endThumb", "track", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "onValueChange", "valueRange", "onValueChangeFinished", "Lkotlin/Function0;", "steps", "", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Slider", "Landroidx/compose/material3/SliderState;", "interactionSource", "thumb", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "SliderRange", "start", "endInclusive", "(FF)J", "range", "(Lkotlin/ranges/ClosedFloatingPointRange;)J", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x", "a2", "b2", "scale-ziovWd0", "(FFJFF)J", "x1", "snapValueToTick", "current", "tickFractions", "", "minPx", "maxPx", "stepsToTickFractions", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderEndThumbSemantics", "rangeSliderPressDragModifier", "rangeSliderStartThumbSemantics", "sliderSemantics", "sliderTapModifier", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SliderKt {
    private static final double SliderRangeTolerance = 1.0E-4d;
    private static final float ThumbHeight = 0.0f;
    private static final long ThumbSize = 0;
    private static final float ThumbTrackGapSize = 0.0f;
    private static final float ThumbWidth = 0.0f;
    private static final float TrackHeight = 0.0f;
    private static final float TrackInsideCornerSize = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1651}, m = "invokeSuspend", n = {}, s = {})
    static final class C05641 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ RangeSliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1652}, m = "invokeSuspend", n = {}, s = {})
        static final class C01141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ RangeSliderState $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1653, 1665, 1687}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            static final class C01151 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ RangeSliderState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1705}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    AnonymousClass2(RangeSliderLogic r2, Ref.BooleanRef r3, DragInteraction r4, Continuation<? super AnonymousClass2> r5) {
                        this.$rangeSliderLogic = r2;
                        this.$draggingStart = r3;
                        this.$finishInteraction = r4;
                        super(2, r5);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, r6);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                        return invoke2(r2, r3);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                        return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object $result) {
                        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch(this.label) {
                            case 0: goto L7;
                            case 1: goto L6;
                            default: goto L5;
                        };
                    L6:
                        ResultKt.throwOnFailure($result);
                    L12:
                        return Unit.INSTANCE;
                    L7:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) != r0) goto L12;
                        return r0;
                    L5:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                C01151(RangeSliderState r2, RangeSliderLogic r3, CoroutineScope r4, Continuation<? super C01151> r5) {
                    this.$state = r2;
                    this.$rangeSliderLogic = r3;
                    this.$$this$coroutineScope = r4;
                    super(2, r5);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                    C01151 r0 = new C01151(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, r6);
                    r0.L$0 = r5;
                    return r0;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                    return ((C01151) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L13;
                        case 1: goto L12;
                        case 2: goto L11;
                        case 3: goto L6;
                        default: goto L5;
                    };
                L6:
                    C01151 r2 = this;
                    Object $result2 = $result;
                    Ref.BooleanRef draggingStart = (Ref.BooleanRef) r2.L$1;
                    DragInteraction.Start interaction = (DragInteraction.Start) r2.L$0;
                    ResultKt.throwOnFailure($result2);     // Catch: CancellationException -> L9
                    final Ref.BooleanRef draggingStart2 = draggingStart;
                    Object $result3 = $result2;
                L73:
                    boolean success = ((Boolean) $result2).booleanValue();     // Catch: CancellationException -> L65
                    if (success == false) goto L63;
                    DragInteraction.Cancel finishInteraction = new DragInteraction.Stop(interaction);     // Catch: CancellationException -> L65
                L72:
                L70:
                    r2.$state.getGestureEndAction$material3_release().invoke(Boxing.boxBoolean(draggingStart2.element));
                    BuildersKt.launch$default(r2.$$this$coroutineScope, null, null, new AnonymousClass2(r2.$rangeSliderLogic, draggingStart2, finishInteraction, null), 3, null);
                    return Unit.INSTANCE;
                L63:
                    finishInteraction = new DragInteraction.Cancel(interaction);     // Catch: CancellationException -> L65
                L66:
                    $result2 = $result3;
                    draggingStart = draggingStart2;
                L69:
                    finishInteraction = new DragInteraction.Cancel(interaction);
                    draggingStart2 = draggingStart;
                    goto L70
                L11:
                    r2 = this;
                    Object $result4 = $result;
                    draggingStart2 = (Ref.BooleanRef) r2.L$4;
                    Ref.FloatRef posX = (Ref.FloatRef) r2.L$3;
                    DragInteraction.Start interaction2 = (DragInteraction.Start) r2.L$2;
                    PointerInputChange event = (PointerInputChange) r2.L$1;
                    AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) r2.L$0;
                    ResultKt.throwOnFailure($result4);
                    $result2 = $result4;
                L34:
                    Pair it = (Pair) $result4;
                    if (it == null) goto L55;
                    RangeSliderState r12 = r2.$state;
                    float slop = DragGestureDetectorCopyKt.m3022pointerSlopE8SPZFQ($this$awaitEachGesture.getViewConfiguration(), event.m5592getTypeT8wyACA());
                    if (Math.abs(r12.getRawOffsetEnd$material3_release() - posX.element) < slop) goto L39;
                L41:
                    boolean shouldUpdateCapturedThumb = false;
                L43:
                    if (shouldUpdateCapturedThumb == false) goto L55;
                    float dir = ((Number) it.getSecond()).floatValue();
                    if (r12.isRtl$material3_release() == false) goto L50;
                    if (dir >= 0.0f) goto L51;
                L52:
                    boolean r5 = false;
                L53:
                    draggingStart2.element = r5;
                    posX.element += Offset.m4125getXimpl(PointerEventKt.positionChange((PointerInputChange) it.getFirst()));
                L51:
                    r5 = true;
                    goto L53
                L50:
                    if (dir >= 0.0f) goto L52;
                L39:
                    if (Math.abs(r12.getRawOffsetStart$material3_release() - posX.element) >= slop) goto L41;
                    shouldUpdateCapturedThumb = true;
                L55:
                    r2.$rangeSliderLogic.captureThumb(draggingStart2.element, posX.element, interaction2, r2.$$this$coroutineScope);
                    long r6 = event.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L67
                    final RangeSliderState r13 = r2.$state;     // Catch: CancellationException -> L67
                    r2.L$0 = interaction2;     // Catch: CancellationException -> L67
                    r2.L$1 = draggingStart2;     // Catch: CancellationException -> L67
                    r2.L$2 = null;     // Catch: CancellationException -> L67
                    r2.L$3 = null;     // Catch: CancellationException -> L67
                    r2.L$4 = null;     // Catch: CancellationException -> L67
                    r2.label = 3;     // Catch: CancellationException -> L67
                    Object r7 = DragGestureDetectorKt.m433horizontalDragjO51t88($this$awaitEachGesture, r6, new SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(r13, draggingStart2), r2);     // Catch: CancellationException -> L67
                    if (r7 != r0) goto L59;
                    return r0;
                L59:
                    $result3 = $result2;
                    $result2 = r7;
                    interaction = interaction2;
                L68:
                    draggingStart = draggingStart2;
                    interaction = interaction2;
                    goto L69
                L12:
                    r2 = this;
                    Object $result5 = $result;
                    AwaitPointerEventScope $this$awaitEachGesture2 = (AwaitPointerEventScope) r2.L$0;
                    ResultKt.throwOnFailure($result5);
                    $this$awaitEachGesture = $this$awaitEachGesture2;
                    Object $result6 = $result5;
                L17:
                    event = (PointerInputChange) $result5;
                    DragInteraction.Start interaction3 = new DragInteraction.Start();
                    posX = new Ref.FloatRef();
                    if (r2.$state.isRtl$material3_release() == false) goto L20;
                    float r9 = r2.$state.getTotalWidth$material3_release() - Offset.m4125getXimpl(event.m5589getPositionF1C5BW0());
                L21:
                    posX.element = r9;
                    int compare = r2.$rangeSliderLogic.compareOffsets(posX.element);
                    Ref.BooleanRef draggingStart3 = new Ref.BooleanRef();
                    if (compare == 0) goto L27;
                    if (compare >= 0) goto L25;
                    boolean r10 = true;
                L30:
                    draggingStart3.element = r10;
                    r2.L$0 = $this$awaitEachGesture;
                    r2.L$1 = event;
                    r2.L$2 = interaction3;
                    r2.L$3 = posX;
                    r2.L$4 = draggingStart3;
                    r2.label = 2;
                    Object r4 = SliderKt.m2629access$awaitSlop8vUncbI($this$awaitEachGesture, event.m5587getIdJ3iCeTQ(), event.m5592getTypeT8wyACA(), r2);
                    if (r4 != r0) goto L33;
                    return r0;
                L33:
                    interaction2 = interaction3;
                    $result4 = r4;
                    $result2 = $result6;
                    draggingStart2 = draggingStart3;
                    goto L34
                L25:
                    r10 = false;
                    goto L30
                L27:
                    if (r2.$state.getRawOffsetStart$material3_release() <= posX.element) goto L29;
                    r10 = true;
                    goto L30
                L29:
                    r10 = false;
                    goto L30
                L20:
                    r9 = Offset.m4125getXimpl(event.m5589getPositionF1C5BW0());
                    goto L21
                L13:
                    ResultKt.throwOnFailure($result);
                    r2 = this;
                    AwaitPointerEventScope $this$awaitEachGesture3 = (AwaitPointerEventScope) r2.L$0;
                    r2.L$0 = $this$awaitEachGesture3;
                    r2.label = 1;
                    Object r8 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture3, false, null, r2, 2, null);
                    if (r8 != r0) goto L16;
                    return r0;
                L16:
                    $result6 = $result;
                    $result5 = r8;
                    $this$awaitEachGesture = $this$awaitEachGesture3;
                    goto L17
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            C01141(PointerInputScope r2, RangeSliderState r3, RangeSliderLogic r4, Continuation<? super C01141> r5) {
                this.$$this$pointerInput = r2;
                this.$state = r3;
                this.$rangeSliderLogic = r4;
                super(2, r5);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                C01141 r0 = new C01141(this.$$this$pointerInput, this.$state, this.$rangeSliderLogic, r6);
                r0.L$0 = r5;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C01141) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L7;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                ResultKt.throwOnFailure($result);
            L12:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C01151(this.$state, this.$rangeSliderLogic, $this$coroutineScope, null), this) != r0) goto L12;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C05641(RangeSliderState r2, MutableInteractionSource r3, MutableInteractionSource r4, Continuation<? super C05641> r5) {
            this.$state = r2;
            this.$startInteractionSource = r3;
            this.$endInteractionSource = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            C05641 r0 = new C05641(this.$state, this.$startInteractionSource, this.$endInteractionSource, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
            return ((C05641) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
            RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$state, this.$startInteractionSource, this.$endInteractionSource);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new C01141($this$pointerInput, this.$state, rangeSliderLogic, null), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", f = "Slider.kt", i = {}, l = {1627}, m = "invokeSuspend", n = {}, s = {})
    static final class C05671 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01181 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ SliderState $state;
            /* synthetic */ long J$0;
            int label;

            C01181(SliderState r2, Continuation<? super C01181> r3) {
                this.$state = r2;
                super(3, r3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope r5, Offset r6, Continuation<? super Unit> r7) {
                return m2639invoked4ec7I(r5, r6.m4135unboximpl(), r7);
            }

            /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m2639invoked4ec7I(PressGestureScope r3, long r4, Continuation<? super Unit> r6) {
                C01181 r0 = new C01181(this.$state, r6);
                r0.J$0 = r4;
                return r0.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r5) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L6;
                    default: goto L5;
                };
            L6:
                ResultKt.throwOnFailure(r5);
                long it = this.J$0;
                this.$state.m2652onPressk4lQ0M$material3_release(it);
                return Unit.INSTANCE;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C05671(SliderState r2, Continuation<? super C05671> r3) {
            this.$state = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C05671 r0 = new C05671(this.$state, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
            return ((C05671) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
            C01181 r6 = new C01181(this.$state, null);
            final SliderState r4 = this.$state;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default($this$pointerInput, null, null, r6, new AnonymousClass2(r4), this, 3, null) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ void access$RangeSliderImpl(Modifier modifier, RangeSliderState state, boolean enabled, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, Function3 startThumb, Function3 endThumb, Function3 track, Composer $composer, int $changed) {
        RangeSliderImpl(modifier, state, enabled, startInteractionSource, endInteractionSource, startThumb, endThumb, track, $composer, $changed);
    }

    public static final /* synthetic */ void access$SliderImpl(Modifier modifier, SliderState state, boolean enabled, MutableInteractionSource interactionSource, Function3 thumb, Function3 track, Composer $composer, int $changed) {
        SliderImpl(modifier, state, enabled, interactionSource, thumb, track, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$awaitSlop-8vUncbI, reason: not valid java name */
    public static final /* synthetic */ Object m2629access$awaitSlop8vUncbI(AwaitPointerEventScope $receiver, long id, int type, Continuation $completion) {
        return m2631awaitSlop8vUncbI($receiver, id, type, $completion);
    }

    public static final /* synthetic */ float access$calcFraction(float a, float b, float pos) {
        return calcFraction(a, b, pos);
    }

    public static final /* synthetic */ long access$getThumbSize$p() {
        return ThumbSize;
    }

    public static final /* synthetic */ float access$getThumbTrackGapSize$p() {
        return ThumbTrackGapSize;
    }

    public static final /* synthetic */ float access$getTrackInsideCornerSize$p() {
        return TrackInsideCornerSize;
    }

    public static final /* synthetic */ float access$scale(float a1, float b1, float x1, float a2, float b2) {
        return scale(a1, b1, x1, a2, b2);
    }

    /* JADX INFO: renamed from: access$scale-ziovWd0, reason: not valid java name */
    public static final /* synthetic */ long m2630access$scaleziovWd0(float a1, float b1, long x, float a2, float b2) {
        return m2634scaleziovWd0(a1, b1, x, a2, b2);
    }

    public static final /* synthetic */ float access$snapValueToTick(float current, float[] tickFractions, float minPx, float maxPx) {
        return snapValueToTick(current, tickFractions, minPx, maxPx);
    }

    public static final /* synthetic */ float[] access$stepsToTickFractions(int steps) {
        return stepsToTickFractions(steps);
    }

    /* JADX INFO: renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2633isSpecifiedIf1S1O4$annotations(long r0) {
    }

    public static final void Slider(final float value, final Function1<? super Float, Unit> r28, Modifier modifier, boolean enabled, ClosedFloatingPointRange<Float> r31, int steps, Function0<Unit> r33, SliderColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-202044027);
        ComposerKt.sourceInformation($composer2, "C(Slider)P(7,4,3,1,8,6,5)167@8058L8,168@8118L39,179@8458L181,186@8657L122,170@8166L652:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r12 = value;
    L14:
        if ((r38 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super Float, Unit> r13 = r28;
    L24:
        int r3 = r38 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r5 = r38 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ClosedFloatingPointRange<Float> r7 = r31;
    L57:
        int r8 = r38 & 32;
        if (r8 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int steps2 = steps;
    L68:
        int r14 = r38 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function0<Unit> r15 = r33;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r38 & 128) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
    L87:
        r17 = 4194304;
    L90:
        int r0 = r38 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty2 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L120:
        if (r3 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if (r5 == 0) goto L125;
        enabled2 = true;
    L125:
        if ((r38 & 16) == 0) goto L127;
        int $dirty3 = $dirty2 & (-57345);
        r7 = RangesKt.rangeTo(0.0f, 1.0f);
    L128:
        if (r8 == 0) goto L130;
        steps2 = 0;
    L130:
        if (r14 == 0) goto L133;
        r15 = null;
    L133:
        if ((r38 & 128) == 0) goto L135;
        final SliderColors colors2 = SliderDefaults.INSTANCE.colors($composer2, 6);
        $dirty3 = $dirty3 & (-29360129);
    L136:
        if (r0 == 0) goto L142;
        ComposerKt.sourceInformationMarkerStart($composer2, -403669397, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        SliderColors colors3 = colors2;
        if (it$iv != Composer.Companion.getEmpty()) goto L140;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L141:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableInteractionSource interactionSource2 = (MutableInteractionSource) value$iv;
        Modifier modifier3 = modifier2;
        ClosedFloatingPointRange<Float> r22 = r7;
        int steps3 = steps2;
        Function0<Unit> r16 = r15;
        int r4 = -202044027;
        colors2 = colors3;
        final boolean enabled3 = enabled2;
    L143:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventStart(r4, $dirty3, -1, "androidx.compose.material3.Slider (Slider.kt:169)");
    L146:
        SliderColors colors4 = colors2;
        Composer $composer3 = $composer2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Slider(r12, r13, modifier3, enabled3, r16, colors4, interactionSource3, steps3, ComposableLambdaKt.rememberComposableLambda(308249025, true, new C05572(interactionSource2, colors2, enabled3), $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new C05583(enabled3, colors2), $composer2, 54), r22, $composer3, (((((((($dirty3 & 14) | 905969664) | ($dirty3 & 112)) | ($dirty3 & 896)) | ($dirty3 & 7168)) | (($dirty3 >> 6) & 57344)) | (($dirty3 >> 6) & 458752)) | (($dirty3 >> 6) & 3670016)) | (($dirty3 << 6) & 29360128), ($dirty3 >> 12) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventEnd();
    L149:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Function0<Unit> r9 = r16;
        final SliderColors colors5 = colors4;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final int steps4 = steps3;
        final ClosedFloatingPointRange<Float> r6 = r22;
    L150:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L154;
        r18.updateScope(new C05594(value, r28, modifier4, enabled4, r6, steps4, r9, colors5, interactionSource4, $changed, r38));
        return;
    L154:
        return;
    L140:
        value$iv = it$iv;
        goto L141
    L142:
        interactionSource2 = interactionSource;
        modifier3 = modifier2;
        r22 = r7;
        steps3 = steps2;
        r16 = r15;
        r4 = -202044027;
        enabled3 = enabled2;
        goto L143
    L135:
        colors2 = colors;
        goto L136
    L127:
        $dirty3 = $dirty2;
        goto L128
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L120;
        $composer2.skipToGroupEnd();
        if ((r38 & 16) == 0) goto L115;
        int $dirty4 = $dirty2 & (-57345);
    L117:
        if ((r38 & 128) == 0) goto L119;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty4 & (-29360129);
        modifier3 = modifier2;
        r22 = r7;
        steps3 = steps2;
        r16 = r15;
        r4 = -202044027;
        colors2 = colors;
        enabled3 = enabled2;
        goto L143
    L119:
        interactionSource2 = interactionSource;
        $dirty3 = $dirty4;
        modifier3 = modifier2;
        r22 = r7;
        steps3 = steps2;
        r16 = r15;
        r4 = -202044027;
        colors2 = colors;
        enabled3 = enabled2;
        goto L143
    L115:
        $dirty4 = $dirty2;
        goto L117
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        colors5 = colors;
        $composer3 = $composer2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        r6 = r7;
        steps4 = steps2;
        r9 = r15;
        interactionSource4 = interactionSource;
        goto L150
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L101
    L98:
        r19 = 33554432;
        goto L99
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r15 = r33;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L78:
        r15 = r33;
        goto L80
    L61:
        if ((196608 & $changed) != 0) goto L67;
        steps2 = steps;
        if ($composer2.changed(steps2) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
        goto L68
    L65:
        r111 = 65536;
        goto L66
    L67:
        steps2 = steps;
        goto L68
    L49:
        if ((r38 & 16) != 0) goto L53;
        r7 = r31;
        if ($composer2.changed(r7) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
    L54:
        r10 = 8192;
        goto L55
    L53:
        r7 = r31;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
        goto L47
    L43:
        r11 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r13 = r28;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = value;
        if ($composer2.changed(r12) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r12 = value;
        goto L14
    }

    public static final void Slider(final float value, final Function1<? super Float, Unit> r26, Modifier modifier, boolean enabled, Function0<Unit> r29, SliderColors colors, MutableInteractionSource interactionSource, int steps, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r33, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r34, ClosedFloatingPointRange<Float> r35, Composer $composer, final int $changed, final int $changed1, final int r39) {
        Composer $composer2 = $composer.startRestartGroup(1191170377);
        ComposerKt.sourceInformation($composer2, "C(Slider)P(9,4,3,1,5)256@12184L8,257@12244L39,259@12372L157,266@12578L114,272@12779L92,278@12998L184:Slider.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r39 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r39 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r6 = r39 & 4;
        if (r6 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L33:
        int r10 = r39 & 8;
        if (r10 == 0) goto L37;
        $dirty = $dirty | 3072;
        final boolean enabled2 = enabled;
    L44:
        int r13 = r39 & 16;
        if (r13 == 0) goto L48;
        $dirty = $dirty | 24576;
        Function0<Unit> r15 = r29;
    L56:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L58;
        final SliderColors colors2 = colors;
    L66:
        int r16 = r39 & 64;
        if (r16 == 0) goto L70;
        $dirty = $dirty | 1572864;
    L77:
        int r7 = r39 & 128;
        if (r7 == 0) goto L81;
        $dirty = $dirty | 12582912;
    L88:
        int r0 = r39 & 256;
        if (r0 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        int r1 = r39 & 512;
        if (r1 == 0) goto L103;
        $dirty = $dirty | 805306368;
    L111:
        if (($changed1 & 6) != 0) goto L121;
        if ((r39 & 1024) != 0) goto L118;
        if ($composer2.changed(r35) == false) goto L118;
        int r22 = 4;
    L119:
        $dirty1 = $dirty1 | r22;
    L118:
        r22 = 2;
    L121:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L124;
    L129:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L132;
    L141:
        if (r6 == 0) goto L143;
        modifier2 = Modifier.Companion;
    L143:
        if (r10 == 0) goto L145;
        enabled2 = true;
    L145:
        if (r13 == 0) goto L148;
        r15 = null;
    L148:
        if ((r39 & 32) == 0) goto L150;
        colors2 = SliderDefaults.INSTANCE.colors($composer2, 6);
        $dirty2 = $dirty2 & (-458753);
    L150:
        if (r16 == 0) goto L156;
        ComposerKt.sourceInformationMarkerStart($composer2, -403537365, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L154;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L155:
        final MutableInteractionSource interactionSource2 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L157:
        if (r7 == 0) goto L159;
        int steps2 = 0;
    L160:
        if (r0 == 0) goto L162;
        ComposableLambda r8 = ComposableLambdaKt.rememberComposableLambda(-1756326375, true, new AnonymousClass6(interactionSource2, colors2, enabled2), $composer2, 54);
    L163:
        if (r1 == 0) goto L165;
        ComposableLambda r9 = ComposableLambdaKt.rememberComposableLambda(2083675534, true, new C05607(enabled2, colors2), $composer2, 54);
    L167:
        if ((r39 & 1024) == 0) goto L169;
        ClosedFloatingPointRange<Float> r11 = RangesKt.rangeTo(0.0f, 1.0f);
        int $dirty3 = $dirty1 & (-15);
        int $dirty4 = $dirty2;
    L170:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L174;
        ComposerKt.traceEventStart(1191170377, $dirty4, $dirty3, "androidx.compose.material3.Slider (Slider.kt:270)");
    L174:
        ComposerKt.sourceInformationMarkerStart($composer2, -403520192, "CC(remember):Slider.kt#9igjgp");
        if ((29360128 & $dirty4) != 8388608) goto L177;
        boolean r2 = true;
    L178:
        boolean r27 = r2;
        if ((($dirty3 & 14) ^ 6) <= 4) goto L183;
        if ($composer2.changed(r11) == false) goto L183;
    L184:
        boolean r24 = true;
    L186:
        boolean invalid$iv = r27 | r24;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L192;
        Composer $composer3 = $composer2;
        if (value$iv2 != Composer.Companion.getEmpty()) goto L194;
    L193:
        value$iv2 = new SliderState(value, steps2, r15, r11);
        $composer2.updateRememberedValue(value$iv2);
    L194:
        SliderState state = (SliderState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        state.setOnValueChangeFinished(r15);
        state.setOnValueChange$material3_release(r26);
        state.setValue(value);
        Composer $composer4 = $composer3;
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Slider(state, modifier3, enabled3, null, interactionSource3, r8, r9, $composer4, ((((($dirty4 >> 3) & 112) | (($dirty4 >> 3) & 896)) | (($dirty4 >> 6) & 57344)) | (($dirty4 >> 9) & 458752)) | (($dirty4 >> 9) & 3670016), 8);
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r12 = r8;
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L197;
        ComposerKt.traceEventEnd();
    L197:
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r23 = r9;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Modifier modifier4 = modifier2;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r14 = r12;
        final SliderColors colors3 = colors2;
        final int steps3 = steps2;
        final boolean enabled4 = enabled2;
        final ClosedFloatingPointRange<Float> r17 = r11;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r18 = r23;
        final Function0<Unit> r5 = r15;
        int $dirty5 = $dirty3;
    L198:
        ScopeUpdateScope r3 = $composer5.endRestartGroup();
        if (r3 == null) goto L202;
        r3.updateScope(new C05618(value, r26, modifier4, enabled4, r5, colors3, interactionSource4, steps3, r14, r18, r17, $changed, $changed1, r39));
        return;
    L202:
        return;
    L192:
        $composer3 = $composer2;
    L183:
        if (($dirty3 & 6) == 4) goto L184;
        r24 = false;
        goto L186
    L177:
        r2 = false;
        goto L178
    L169:
        r11 = r35;
        $dirty3 = $dirty1;
        $dirty4 = $dirty2;
        goto L170
    L165:
        r9 = r34;
        goto L167
    L162:
        r8 = r33;
        goto L163
    L159:
        steps2 = steps;
        goto L160
    L154:
        value$iv = it$iv;
        goto L155
    L156:
        interactionSource2 = interactionSource;
        goto L157
    L132:
        if ($composer2.getDefaultsInvalid() == true) goto L141;
        $composer2.skipToGroupEnd();
        if ((r39 & 32) == 0) goto L138;
        $dirty2 = $dirty2 & (-458753);
    L138:
        if ((r39 & 1024) == 0) goto L140;
        $dirty1 = $dirty1 & (-15);
    L140:
        interactionSource2 = interactionSource;
        steps2 = steps;
        r8 = r33;
        r9 = r34;
        r11 = r35;
        $dirty3 = $dirty1;
        $dirty4 = $dirty2;
        goto L170
    L124:
        if (($dirty1 & 3) != 2) goto L129;
        if ($composer2.getSkipping() == false) goto L129;
        $composer2.skipToGroupEnd();
        Function0<Unit> r4 = r15;
        $dirty5 = $dirty1;
        r5 = r4;
        interactionSource4 = interactionSource;
        r18 = r34;
        $composer5 = $composer2;
        colors3 = colors2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        steps3 = steps;
        r14 = r33;
        r17 = r35;
        goto L198
    L103:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r34) == false) goto L107;
        int r25 = 536870912;
    L108:
        $dirty = $dirty | r25;
        goto L111
    L107:
        r25 = 268435456;
        goto L108
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changedInstance(r33) == false) goto L96;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r21;
        goto L99
    L96:
        r21 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L88;
        if ($composer2.changed(steps) == false) goto L85;
        int r20 = 8388608;
    L86:
        $dirty = $dirty | r20;
        goto L88
    L85:
        r20 = 4194304;
        goto L86
    L70:
        if (($changed & 1572864) != 0) goto L77;
        if ($composer2.changed(interactionSource) == false) goto L74;
        int r19 = 1048576;
    L75:
        $dirty = $dirty | r19;
        goto L77
    L74:
        r19 = 524288;
        goto L75
    L58:
        if ((r39 & 32) != 0) goto L62;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L63;
        int r110 = 131072;
    L64:
        $dirty = $dirty | r110;
    L63:
        r110 = 65536;
        goto L64
    L62:
        colors2 = colors;
        goto L63
    L48:
        if (($changed & 24576) != 0) goto L54;
        r15 = r29;
        if ($composer2.changedInstance(r15) == false) goto L52;
        int r111 = 16384;
    L53:
        $dirty = $dirty | r111;
        goto L56
    L52:
        r111 = 8192;
        goto L53
    L54:
        r15 = r29;
        goto L56
    L37:
        if (($changed & 3072) != 0) goto L43;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L41;
        int r112 = 2048;
    L42:
        $dirty = $dirty | r112;
        goto L44
    L41:
        r112 = 1024;
        goto L42
    L43:
        enabled2 = enabled;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L30;
        int r113 = 256;
    L31:
        $dirty = $dirty | r113;
        goto L33
    L30:
        r113 = 128;
        goto L31
    L32:
        modifier2 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r26) == false) goto L20;
        int r28 = 32;
    L21:
        $dirty = $dirty | r28;
        goto L22
    L20:
        r28 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(value) == false) goto L10;
        int r30 = 4;
    L11:
        $dirty = $dirty | r30;
        goto L13
    L10:
        r30 = 2;
        goto L11
    }

    public static final void Slider(final SliderState state, Modifier modifier, boolean enabled, SliderColors colors, MutableInteractionSource interactionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r23, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r24, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(-1303883986);
        ComposerKt.sourceInformation($composer2, "C(Slider)P(4,3,1)339@15682L8,340@15742L39,341@15830L157,348@16036L114,354@16217L188:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r27 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        SliderState r10 = state;
    L13:
        int r2 = r27 & 2;
        if (r2 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r3 = modifier;
    L24:
        int r4 = r27 & 4;
        if (r4 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean r5 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        final SliderColors colors2 = colors;
    L46:
        int r7 = r27 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        final MutableInteractionSource interactionSource2 = interactionSource;
    L57:
        int r11 = r27 & 32;
        if (r11 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r12 = r23;
    L68:
        int r13 = r27 & 64;
        if (r13 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r14 = r24;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L94:
        if (r2 == 0) goto L96;
        Modifier.Companion modifier2 = Modifier.Companion;
    L97:
        if (r4 == 0) goto L99;
        final boolean enabled2 = true;
    L101:
        if ((r27 & 8) == 0) goto L103;
        $dirty = $dirty & (-7169);
        colors2 = SliderDefaults.INSTANCE.colors($composer2, 6);
    L103:
        if (r7 == 0) goto L111;
        ComposerKt.sourceInformationMarkerStart($composer2, -403425429, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L107;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L108:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        interactionSource2 = (MutableInteractionSource) value$iv;
        goto L111
    L107:
        value$iv = it$iv;
    L111:
        if (r11 == 0) goto L113;
        boolean r6 = true;
        r12 = ComposableLambdaKt.rememberComposableLambda(1426271326, true, new AnonymousClass10(interactionSource2, colors2, enabled2), $composer2, 54);
    L114:
        if (r13 == 0) goto L116;
        r14 = ComposableLambdaKt.rememberComposableLambda(577038345, r6, new C055611(enabled2, colors2), $composer2, 54);
        boolean enabled3 = enabled2;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r15 = r12;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Modifier modifier3 = modifier2;
    L117:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L121;
        ComposerKt.traceEventStart(-1303883986, $dirty, -1, "androidx.compose.material3.Slider (Slider.kt:351)");
    L121:
        if (r10.getSteps() < 0) goto L123;
        boolean r8 = r6;
    L124:
        if (r8 == false) goto L134;
        SliderImpl(modifier3, r10, enabled3, interactionSource3, r15, r14, $composer2, (((((($dirty >> 3) & 14) | (($dirty << 3) & 112)) | ($dirty & 896)) | (($dirty >> 3) & 7168)) | (($dirty >> 3) & 57344)) | (458752 & ($dirty >> 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventEnd();
    L128:
        final SliderColors colors3 = colors2;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r9 = r15;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r16 = r14;
    L129:
        ScopeUpdateScope r17 = $composer2.endRestartGroup();
        if (r17 == null) goto L135;
        r17.updateScope(new AnonymousClass13(state, modifier4, enabled4, colors3, interactionSource4, r9, r16, $changed, r27));
        return;
    L135:
        return;
    L134:
        throw new IllegalArgumentException("steps should be >= 0".toString());
    L123:
        r8 = false;
        goto L124
    L116:
        enabled3 = enabled2;
        r15 = r12;
        interactionSource3 = interactionSource2;
        modifier3 = modifier2;
        goto L117
    L113:
        r6 = true;
        goto L114
    L99:
        enabled2 = r5;
        goto L101
    L96:
        modifier2 = r3;
        goto L97
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L94;
        $composer2.skipToGroupEnd();
        if ((r27 & 8) == 0) goto L93;
        $dirty = $dirty & (-7169);
    L93:
        enabled3 = r5;
        r15 = r12;
        r6 = true;
        interactionSource3 = interactionSource2;
        modifier3 = r3;
        goto L117
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        enabled4 = r5;
        colors3 = colors2;
        interactionSource4 = interactionSource2;
        r9 = r12;
        r16 = r14;
        goto L129
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r14 = r24;
        if ($composer2.changedInstance(r14) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L80
    L76:
        r18 = 524288;
        goto L77
    L78:
        r14 = r24;
        goto L80
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r12 = r23;
        if ($composer2.changedInstance(r12) == false) goto L65;
        int r19 = 131072;
    L66:
        $dirty = $dirty | r19;
        goto L68
    L65:
        r19 = 65536;
        goto L66
    L67:
        r12 = r23;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
        goto L57
    L54:
        r110 = 8192;
        goto L55
    L56:
        interactionSource2 = interactionSource;
        goto L57
    L38:
        if ((r27 & 8) != 0) goto L42;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
    L43:
        r20 = 1024;
        goto L44
    L42:
        colors2 = colors;
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
        r10 = state;
        if ($composer2.changedInstance(r10) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L13
    L10:
        r25 = 2;
        goto L11
    L12:
        r10 = state;
        goto L13
    }

    public static final void RangeSlider(final ClosedFloatingPointRange<Float> r28, final Function1<? super ClosedFloatingPointRange<Float>, Unit> r29, Modifier modifier, boolean enabled, ClosedFloatingPointRange<Float> r32, int steps, Function0<Unit> r34, SliderColors colors, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-743091416);
        ComposerKt.sourceInformation($composer2, "C(RangeSlider)P(6,3,2,1,7,5,4)408@18812L8,410@18884L39,411@18981L39,423@19399L186,430@19606L184,437@19808L199,413@19026L987:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        ClosedFloatingPointRange<Float> r11 = r28;
    L14:
        if ((r38 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super ClosedFloatingPointRange<Float>, Unit> r12 = r29;
    L24:
        int r3 = r38 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        int r5 = r38 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L47:
        if (($changed & 24576) == 0) goto L49;
        ClosedFloatingPointRange<Float> r7 = r32;
    L57:
        int r8 = r38 & 32;
        if (r8 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int steps2 = steps;
    L68:
        int r14 = r38 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function0<Unit> r15 = r34;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r38 & 128) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
    L87:
        r17 = 4194304;
    L90:
        int $dirty2 = $dirty;
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L109:
        if (r3 == 0) goto L111;
        Modifier.Companion modifier2 = Modifier.Companion;
    L112:
        if (r5 == 0) goto L115;
        enabled2 = true;
    L115:
        if ((r38 & 16) == 0) goto L117;
        int $dirty3 = $dirty2 & (-57345);
        r7 = RangesKt.rangeTo(0.0f, 1.0f);
    L118:
        if (r8 == 0) goto L120;
        steps2 = 0;
    L120:
        if (r14 == 0) goto L123;
        r15 = null;
    L123:
        if ((r38 & 128) == 0) goto L125;
        final SliderColors colors2 = SliderDefaults.INSTANCE.colors($composer2, 6);
        int $dirty4 = (-29360129) & $dirty3;
        final boolean enabled3 = enabled2;
        int steps3 = steps2;
        Function0<Unit> r16 = r15;
        Modifier modifier3 = modifier2;
        ClosedFloatingPointRange<Float> r18 = r7;
        int $dirty5 = -743091416;
    L126:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventStart($dirty5, $dirty4, -1, "androidx.compose.material3.RangeSlider (Slider.kt:409)");
    L129:
        ComposerKt.sourceInformationMarkerStart($composer2, 1661051042, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L132;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L133:
        final MutableInteractionSource startInteractionSource = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1661054146, "CC(remember):Slider.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L136;
        Object value$iv2 = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv2);
    L137:
        final MutableInteractionSource endInteractionSource = (MutableInteractionSource) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        RangeSlider(r11, r12, modifier3, enabled3, r18, r16, null, startInteractionSource, endInteractionSource, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new AnonymousClass1(startInteractionSource, colors2, enabled3), $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new AnonymousClass2(endInteractionSource, colors2, enabled3), $composer2, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new AnonymousClass3(enabled3, colors2), $composer2, 54), steps3, $composer3, (((((($dirty4 & 14) | 918552576) | ($dirty4 & 112)) | ($dirty4 & 896)) | ($dirty4 & 7168)) | (57344 & $dirty4)) | (($dirty4 >> 3) & 458752), (($dirty4 >> 9) & 896) | 54, 64);
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventEnd();
    L140:
        final SliderColors colors3 = colors2;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final ClosedFloatingPointRange<Float> r6 = r18;
        final Function0<Unit> r9 = r16;
        final int steps4 = steps3;
    L141:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L145;
        r13.updateScope(new AnonymousClass4(r28, r29, modifier4, enabled4, r6, steps4, r9, colors3, $changed, r38));
        return;
    L145:
        return;
    L136:
        value$iv2 = it$iv2;
        goto L137
    L132:
        value$iv = it$iv;
        goto L133
    L125:
        colors2 = colors;
        $dirty4 = $dirty3;
        enabled3 = enabled2;
        steps3 = steps2;
        r16 = r15;
        modifier3 = modifier2;
        r18 = r7;
        $dirty5 = -743091416;
        goto L126
    L117:
        $dirty3 = $dirty2;
        goto L118
    L111:
        modifier2 = r4;
        goto L112
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L109;
        $composer2.skipToGroupEnd();
        if ((r38 & 16) == 0) goto L104;
        int $dirty6 = $dirty2 & (-57345);
    L106:
        if ((r38 & 128) == 0) goto L108;
        $dirty6 = $dirty6 & (-29360129);
    L108:
        colors2 = colors;
        $dirty4 = $dirty6;
        enabled3 = enabled2;
        steps3 = steps2;
        r16 = r15;
        $dirty5 = -743091416;
        modifier3 = r4;
        r18 = r7;
        goto L126
    L104:
        $dirty6 = $dirty2;
        goto L106
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        colors3 = colors;
        $composer3 = $composer2;
        modifier4 = r4;
        enabled4 = enabled2;
        r6 = r7;
        steps4 = steps2;
        r9 = r15;
        goto L141
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r15 = r34;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
        goto L80
    L76:
        r19 = 524288;
        goto L77
    L78:
        r15 = r34;
        goto L80
    L61:
        if ((196608 & $changed) != 0) goto L67;
        steps2 = steps;
        if ($composer2.changed(steps2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L67:
        steps2 = steps;
        goto L68
    L49:
        if ((r38 & 16) != 0) goto L53;
        r7 = r32;
        if ($composer2.changed(r7) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
    L54:
        r10 = 8192;
        goto L55
    L53:
        r7 = r32;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L47
    L43:
        r20 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        r4 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r12 = r29;
        if ($composer2.changedInstance(r12) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r12 = r29;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = r28;
        if ($composer2.changed(r11) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r11 = r28;
        goto L14
    }

    public static final void RangeSlider(final ClosedFloatingPointRange<Float> r30, final Function1<? super ClosedFloatingPointRange<Float>, Unit> r31, Modifier modifier, boolean enabled, ClosedFloatingPointRange<Float> r34, Function0<Unit> r35, SliderColors colors, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r39, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r40, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r41, int steps, Composer $composer, final int $changed, final int $changed1, final int $dirty1) {
        Composer $composer2 = $composer.startRestartGroup(-1048796133);
        ComposerKt.sourceInformation($composer2, "C(RangeSlider)P(11,5,4,1,12,6!1,7!1,8!1,10)511@23750L8,512@23815L39,513@23909L39,514@24007L162,521@24226L160,528@24440L175,538@24684L237,549@25005L44,553@25142L291:Slider.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty2 = $changed1;
        if (($dirty1 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if (($dirty1 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r9 = $dirty1 & 4;
        if (r9 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier.Companion modifier2 = modifier;
    L34:
        int r16 = $dirty1 & 8;
        if (r16 == 0) goto L38;
        $dirty = $dirty | 3072;
        final boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        ClosedFloatingPointRange<Float> r11 = r34;
    L56:
        int r20 = $dirty1 & 32;
        if (r20 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function0<Unit> r10 = r35;
    L68:
        if (($changed & 1572864) == 0) goto L70;
        SliderColors r12 = colors;
    L78:
        int r13 = $dirty1 & 128;
        if (r13 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int r1 = $dirty1 & 256;
        if (r1 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r2 = $dirty1 & 512;
        if (r2 == 0) goto L104;
        $dirty = $dirty | 805306368;
    L111:
        int r3 = $dirty1 & 1024;
        if (r3 == 0) goto L115;
        $dirty2 = $dirty2 | 6;
    L122:
        int r4 = $dirty1 & 2048;
        if (r4 == 0) goto L126;
        $dirty2 = $dirty2 | 48;
    L133:
        int r5 = $dirty1 & 4096;
        if (r5 == 0) goto L137;
        $dirty2 = $dirty2 | 384;
    L145:
        if (($dirty & 306783379) == 306783378) goto L147;
    L152:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L155;
    L164:
        if (r9 == 0) goto L166;
        modifier2 = Modifier.Companion;
    L166:
        if (r16 == 0) goto L169;
        enabled2 = true;
    L169:
        if (($dirty1 & 16) == 0) goto L171;
        ClosedFloatingPointRange<Float> r0 = RangesKt.rangeTo(0.0f, 1.0f);
        $dirty = $dirty & (-57345);
    L172:
        if (r20 == 0) goto L174;
        Function0<Unit> r14 = null;
    L176:
        if (($dirty1 & 64) == 0) goto L178;
        final SliderColors colors2 = SliderDefaults.INSTANCE.colors($composer2, 6);
        $dirty = $dirty & (-3670017);
    L179:
        if (r13 == 0) goto L185;
        ComposerKt.sourceInformationMarkerStart($composer2, 1661208834, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L183;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L184:
        final MutableInteractionSource startInteractionSource2 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L186:
        if (r1 == 0) goto L192;
        ComposerKt.sourceInformationMarkerStart($composer2, 1661211842, "CC(remember):Slider.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L190;
        Object value$iv2 = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv2);
    L191:
        final MutableInteractionSource endInteractionSource2 = (MutableInteractionSource) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L194:
        if (r2 == 0) goto L196;
        Function3<RangeSliderState, Composer, Integer, Unit> r15 = new AnonymousClass7(startInteractionSource2, colors2, enabled2);
        boolean r6 = true;
        ComposableLambda r17 = ComposableLambdaKt.rememberComposableLambda(-1963073082, true, r15, $composer2, 54);
    L197:
        if (r3 == 0) goto L199;
        ComposableLambda r7 = ComposableLambdaKt.rememberComposableLambda(1908709951, r6, new AnonymousClass8(endInteractionSource2, colors2, enabled2), $composer2, 54);
    L200:
        if (r4 == 0) goto L202;
        ComposableLambda r8 = ComposableLambdaKt.rememberComposableLambda(-429193201, r6, new AnonymousClass9(enabled2, colors2), $composer2, 54);
    L203:
        if (r5 == 0) goto L205;
        int $dirty3 = $dirty;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r18 = r8;
        int steps2 = 0;
        r11 = r0;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r19 = r7;
    L206:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L210;
        ComposerKt.traceEventStart(-1048796133, $dirty3, $dirty2, "androidx.compose.material3.RangeSlider (Slider.kt:536)");
    L210:
        ComposerKt.sourceInformationMarkerStart($composer2, 1661236840, "CC(remember):Slider.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L213;
        boolean r21 = true;
    L214:
        boolean r32 = r21;
        if (((57344 & $dirty3) ^ 24576) <= 16384) goto L219;
        if ($composer2.changed(r11) == false) goto L219;
    L220:
        boolean r22 = true;
    L222:
        boolean invalid$iv = r32 | r22;
        int $dirty4 = $dirty3;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L229;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L229;
        Object value$iv3 = it$iv3;
    L230:
        RangeSliderState state = (RangeSliderState) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        state.setOnValueChangeFinished(r14);
        ComposerKt.sourceInformationMarkerStart($composer2, 1661246919, "CC(remember):Slider.kt#9igjgp");
        if (($dirty4 & 112) != 32) goto L233;
        boolean invalid$iv2 = true;
    L234:
        boolean invalid$iv3 = invalid$iv2;
        Object value$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L240;
        Composer $composer3 = $composer2;
        if (value$iv4 != Composer.Companion.getEmpty()) goto L242;
    L241:
        value$iv4 = (Function1) new SliderKt$RangeSlider$10$1(r31);
        $composer2.updateRememberedValue(value$iv4);
    L242:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        state.setOnValueChange$material3_release((Function1) value$iv4);
        state.setActiveRangeStart(r30.getStart().floatValue());
        state.setActiveRangeEnd(r30.getEndInclusive().floatValue());
        Composer $composer4 = $composer3;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r42 = r18;
        MutableInteractionSource startInteractionSource3 = startInteractionSource2;
        MutableInteractionSource endInteractionSource3 = endInteractionSource2;
        RangeSlider(state, modifier2, enabled2, null, startInteractionSource3, endInteractionSource3, r17, r19, r42, $composer4, ((((((($dirty4 >> 3) & 112) | (($dirty4 >> 3) & 896)) | (($dirty4 >> 9) & 57344)) | (($dirty4 >> 9) & 458752)) | (3670016 & ($dirty4 >> 9))) | (($dirty2 << 21) & 29360128)) | (($dirty2 << 21) & 234881024), 8);
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r23 = r19;
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L245;
        ComposerKt.traceEventEnd();
    L245:
        ClosedFloatingPointRange<Float> r24 = r11;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r110 = r23;
        final ClosedFloatingPointRange<Float> r25 = r24;
        final Modifier modifier3 = modifier2;
        final boolean enabled3 = enabled2;
        final Function0<Unit> r26 = r14;
        final SliderColors colors3 = colors2;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r111 = r17;
        final MutableInteractionSource startInteractionSource4 = startInteractionSource2;
        final int steps3 = steps2;
        final MutableInteractionSource endInteractionSource4 = endInteractionSource2;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r112 = r42;
    L246:
        ScopeUpdateScope r27 = $composer5.endRestartGroup();
        if (r27 == null) goto L250;
        r27.updateScope(new AnonymousClass11(r30, r31, modifier3, enabled3, r25, r26, colors3, startInteractionSource4, endInteractionSource4, r111, r110, r112, steps3, $changed, $changed1, $dirty1));
        return;
    L250:
        return;
    L240:
        $composer3 = $composer2;
        goto L241
    L233:
        invalid$iv2 = false;
    L229:
        value$iv3 = new RangeSliderState(r30.getStart().floatValue(), r30.getEndInclusive().floatValue(), steps2, r14, r11);
        $composer2.updateRememberedValue(value$iv3);
    L219:
        if (($dirty3 & 24576) == 16384) goto L220;
        r22 = false;
        goto L222
    L213:
        r21 = false;
        goto L214
    L205:
        r11 = r0;
        $dirty3 = $dirty;
        steps2 = steps;
        r18 = r8;
        r19 = r7;
        goto L206
    L202:
        r8 = r41;
        goto L203
    L199:
        r7 = r40;
        goto L200
    L196:
        r6 = true;
        r17 = r39;
        goto L197
    L190:
        value$iv2 = it$iv2;
        goto L191
    L192:
        endInteractionSource2 = endInteractionSource;
        goto L194
    L183:
        value$iv = it$iv;
        goto L184
    L185:
        startInteractionSource2 = startInteractionSource;
        goto L186
    L178:
        colors2 = r12;
        goto L179
    L174:
        r14 = r10;
        goto L176
    L171:
        r0 = r11;
        goto L172
    L155:
        if ($composer2.getDefaultsInvalid() == true) goto L164;
        $composer2.skipToGroupEnd();
        if (($dirty1 & 16) == 0) goto L161;
        $dirty = $dirty & (-57345);
    L161:
        if (($dirty1 & 64) == 0) goto L163;
        $dirty = $dirty & (-3670017);
    L163:
        startInteractionSource2 = startInteractionSource;
        endInteractionSource2 = endInteractionSource;
        r18 = r41;
        steps2 = steps;
        $dirty3 = $dirty;
        r14 = r10;
        colors2 = r12;
        r17 = r39;
        r19 = r40;
        goto L206
    L147:
        if (($dirty2 & 147) != 146) goto L152;
        if ($composer2.getSkipping() == false) goto L152;
        $composer2.skipToGroupEnd();
        endInteractionSource4 = endInteractionSource;
        steps3 = steps;
        $composer5 = $composer2;
        modifier3 = modifier2;
        enabled3 = enabled2;
        r26 = r10;
        r25 = r11;
        colors3 = r12;
        startInteractionSource4 = startInteractionSource;
        r111 = r39;
        r110 = r40;
        r112 = r41;
        goto L246
    L137:
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(steps) == false) goto L141;
        int r113 = 256;
    L142:
        $dirty2 = $dirty2 | r113;
        goto L145
    L141:
        r113 = 128;
        goto L142
    L126:
        if (($changed1 & 48) != 0) goto L133;
        if ($composer2.changedInstance(r41) == false) goto L130;
        int r114 = 32;
    L131:
        $dirty2 = $dirty2 | r114;
        goto L133
    L130:
        r114 = 16;
        goto L131
    L115:
        if (($changed1 & 6) != 0) goto L122;
        if ($composer2.changedInstance(r40) == false) goto L119;
        int r115 = 4;
    L120:
        $dirty2 = $dirty2 | r115;
        goto L122
    L119:
        r115 = 2;
        goto L120
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r39) == false) goto L108;
        int r28 = 536870912;
    L109:
        $dirty = $dirty | r28;
        goto L111
    L108:
        r28 = 268435456;
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(endInteractionSource) == false) goto L97;
        int r29 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r29;
        goto L100
    L97:
        r29 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(startInteractionSource) == false) goto L86;
        int r210 = 8388608;
    L87:
        $dirty = $dirty | r210;
        goto L89
    L86:
        r210 = 4194304;
        goto L87
    L70:
        if (($dirty1 & 64) != 0) goto L74;
        r12 = colors;
        if ($composer2.changed(r12) == false) goto L75;
        int r211 = 1048576;
    L76:
        $dirty = $dirty | r211;
    L75:
        r211 = 524288;
        goto L76
    L74:
        r12 = colors;
        goto L75
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r10 = r35;
        if ($composer2.changedInstance(r10) == false) goto L64;
        int r212 = 131072;
    L65:
        $dirty = $dirty | r212;
        goto L68
    L64:
        r212 = 65536;
        goto L65
    L66:
        r10 = r35;
        goto L68
    L48:
        if (($dirty1 & 16) != 0) goto L52;
        r11 = r34;
        if ($composer2.changed(r11) == false) goto L53;
        int r213 = 16384;
    L54:
        $dirty = $dirty | r213;
    L53:
        r213 = 8192;
        goto L54
    L52:
        r11 = r34;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r116 = 2048;
    L43:
        $dirty = $dirty | r116;
        goto L46
    L42:
        r116 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r117 = 256;
    L32:
        $dirty = $dirty | r117;
        goto L34
    L31:
        r117 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r31) == false) goto L21;
        int r33 = 32;
    L22:
        $dirty = $dirty | r33;
        goto L23
    L21:
        r33 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(r30) == false) goto L10;
        int r36 = 4;
    L11:
        $dirty = $dirty | r36;
        goto L14
    L10:
        r36 = 2;
        goto L11
    }

    public static final void RangeSlider(final RangeSliderState state, Modifier modifier, boolean enabled, SliderColors colors, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r28, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r29, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(511405654);
        ComposerKt.sourceInformation($composer2, "C(RangeSlider)P(7,4,1!1,5!1,6)616@28157L8,617@28222L39,618@28316L39,619@28414L162,626@28633L160,633@28847L175,643@29089L295:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if ((r33 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        RangeSliderState r13 = state;
    L13:
        int r3 = r33 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r33 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        final boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        final SliderColors colors2 = colors;
    L46:
        int r8 = r33 & 16;
        if (r8 == 0) goto L50;
        $dirty = $dirty | 24576;
        final MutableInteractionSource startInteractionSource2 = startInteractionSource;
    L57:
        int r12 = r33 & 32;
        if (r12 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final MutableInteractionSource endInteractionSource2 = endInteractionSource;
    L68:
        int r15 = r33 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r33 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r33 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L116:
        if (r3 == 0) goto L118;
        modifier2 = Modifier.Companion;
    L118:
        if (r5 == 0) goto L121;
        enabled2 = true;
    L121:
        if ((r33 & 8) == 0) goto L124;
        $dirty = $dirty & (-7169);
        colors2 = SliderDefaults.INSTANCE.colors($composer2, 6);
    L124:
        if (r8 == 0) goto L131;
        ComposerKt.sourceInformationMarkerStart($composer2, 1661349858, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L128;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L129:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        startInteractionSource2 = (MutableInteractionSource) value$iv;
        goto L131
    L128:
        value$iv = it$iv;
    L131:
        if (r12 == 0) goto L138;
        ComposerKt.sourceInformationMarkerStart($composer2, 1661352866, "CC(remember):Slider.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L135;
        Object value$iv2 = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv2);
    L136:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        endInteractionSource2 = (MutableInteractionSource) value$iv2;
        goto L138
    L135:
        value$iv2 = it$iv2;
    L138:
        if (r15 == 0) goto L140;
        boolean r6 = true;
        ComposableLambda r2 = ComposableLambdaKt.rememberComposableLambda(1884205643, true, new AnonymousClass14(startInteractionSource2, colors2, enabled2), $composer2, 54);
    L141:
        if (r0 == 0) goto L143;
        ComposableLambda r4 = ComposableLambdaKt.rememberComposableLambda(1016457138, r6, new AnonymousClass15(endInteractionSource2, colors2, enabled2), $composer2, 54);
    L144:
        if (r1 == 0) goto L146;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r19 = ComposableLambdaKt.rememberComposableLambda(-1617375262, r6, new AnonymousClass16(enabled2, colors2), $composer2, 54);
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r17 = r2;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r18 = r4;
        Modifier modifier3 = modifier2;
        MutableInteractionSource startInteractionSource3 = startInteractionSource2;
        MutableInteractionSource endInteractionSource3 = endInteractionSource2;
        int r7 = 511405654;
        $dirty = $dirty;
        boolean enabled3 = enabled2;
    L147:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L151;
        ComposerKt.traceEventStart(r7, $dirty, -1, "androidx.compose.material3.RangeSlider (Slider.kt:640)");
    L151:
        if (r13.getSteps() < 0) goto L153;
        boolean r9 = r6;
    L154:
        if (r9 == false) goto L164;
        Composer $composer3 = $composer2;
        RangeSliderImpl(modifier3, r13, enabled3, startInteractionSource3, endInteractionSource3, r17, r18, r19, $composer3, (((((((($dirty >> 3) & 14) | (($dirty << 3) & 112)) | ($dirty & 896)) | (($dirty >> 3) & 7168)) | (($dirty >> 3) & 57344)) | (($dirty >> 3) & 458752)) | (($dirty >> 3) & 3670016)) | (29360128 & ($dirty >> 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L158;
        ComposerKt.traceEventEnd();
    L158:
        final Modifier modifier4 = modifier3;
        final SliderColors colors3 = colors2;
        final boolean enabled4 = enabled3;
        final MutableInteractionSource startInteractionSource4 = startInteractionSource3;
        final MutableInteractionSource endInteractionSource4 = endInteractionSource3;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r10 = r17;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r11 = r18;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r14 = r19;
    L159:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L165;
        r16.updateScope(new AnonymousClass18(state, modifier4, enabled4, colors3, startInteractionSource4, endInteractionSource4, r10, r11, r14, $changed, r33));
        return;
    L165:
        return;
    L164:
        throw new IllegalArgumentException("steps should be >= 0".toString());
    L153:
        r9 = false;
        goto L154
    L146:
        r19 = r30;
        r17 = r2;
        r18 = r4;
        modifier3 = modifier2;
        startInteractionSource3 = startInteractionSource2;
        endInteractionSource3 = endInteractionSource2;
        r7 = 511405654;
        $dirty = $dirty;
        enabled3 = enabled2;
        goto L147
    L143:
        r4 = r29;
        goto L144
    L140:
        r6 = true;
        r2 = r28;
        goto L141
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L116;
        $composer2.skipToGroupEnd();
        if ((r33 & 8) == 0) goto L115;
        r17 = r28;
        r18 = r29;
        r19 = r30;
        $dirty = $dirty & (-7169);
        modifier3 = modifier2;
        startInteractionSource3 = startInteractionSource2;
        endInteractionSource3 = endInteractionSource2;
        r7 = 511405654;
        r6 = true;
        enabled3 = enabled2;
        goto L147
    L115:
        r17 = r28;
        r18 = r29;
        r19 = r30;
        modifier3 = modifier2;
        startInteractionSource3 = startInteractionSource2;
        endInteractionSource3 = endInteractionSource2;
        r7 = 511405654;
        r6 = true;
        enabled3 = enabled2;
        goto L147
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        r11 = r29;
        $composer3 = $composer2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        colors3 = colors2;
        startInteractionSource4 = startInteractionSource2;
        endInteractionSource4 = endInteractionSource2;
        r10 = r28;
        r14 = r30;
        goto L159
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changedInstance(r30) == false) goto L98;
        int r110 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r110;
        goto L102
    L98:
        r110 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r29) == false) goto L87;
        int r111 = 8388608;
    L88:
        $dirty = $dirty | r111;
        goto L90
    L87:
        r111 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r28) == false) goto L76;
        int r112 = 1048576;
    L77:
        $dirty = $dirty | r112;
        goto L79
    L76:
        r112 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        endInteractionSource2 = endInteractionSource;
        if ($composer2.changed(endInteractionSource2) == false) goto L65;
        int r113 = 131072;
    L66:
        $dirty = $dirty | r113;
        goto L68
    L65:
        r113 = 65536;
        goto L66
    L67:
        endInteractionSource2 = endInteractionSource;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        startInteractionSource2 = startInteractionSource;
        if ($composer2.changed(startInteractionSource2) == false) goto L54;
        int r114 = 16384;
    L55:
        $dirty = $dirty | r114;
        goto L57
    L54:
        r114 = 8192;
        goto L55
    L56:
        startInteractionSource2 = startInteractionSource;
        goto L57
    L38:
        if ((r33 & 8) != 0) goto L42;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
    L43:
        r20 = 1024;
        goto L44
    L42:
        colors2 = colors;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L36
    L32:
        r21 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = state;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L13
    L10:
        r23 = 2;
        goto L11
    L12:
        r13 = state;
        goto L13
    }

    private static final void SliderImpl(final Modifier modifier, final SliderState state, final boolean enabled, final MutableInteractionSource interactionSource, final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r54, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r55, Composer $composer, final int $changed) {
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r1 = r55;
        Composer $composer2 = $composer.startRestartGroup(1390990089);
        ComposerKt.sourceInformation($composer2, "C(SliderImpl)P(2,3)665@29717L7,673@30073L28,698@30935L1093,678@30197L1831:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(modifier) == false) goto L7;
        int r8 = 4;
    L8:
        $dirty = $dirty | r8;
        goto L11
    L7:
        r8 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(state) == false) goto L15;
        int r9 = 32;
    L16:
        $dirty = $dirty | r9;
        goto L18
    L15:
        r9 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(enabled) == false) goto L22;
        int r10 = 256;
    L23:
        $dirty = $dirty | r10;
        goto L25
    L22:
        r10 = 128;
    L25:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changed(interactionSource) == false) goto L29;
        int r11 = 2048;
    L30:
        $dirty = $dirty | r11;
        goto L32
    L29:
        r11 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changedInstance(r54) == false) goto L36;
        int r12 = 16384;
    L37:
        $dirty = $dirty | r12;
        goto L39
    L36:
        r12 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changedInstance(r1) == false) goto L43;
        int r13 = 131072;
    L44:
        $dirty = $dirty | r13;
        goto L46
    L43:
        r13 = 65536;
    L46:
        if ((74899 & $dirty) != 74898) goto L52;
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
    L128:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L132;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> r6 = r1;
        r14.updateScope(new C05623(modifier, state, enabled, interactionSource, r54, r6, $changed));
        return;
    L132:
        return;
    L52:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(1390990089, $dirty, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
    L54:
        ProvidableCompositionLocal<LayoutDirection> r5 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r15 != LayoutDirection.Rtl) goto L57;
        boolean r7 = true;
    L58:
        state.setRtl$material3_release(r7);
        Modifier press = sliderTapModifier(Modifier.Companion, state, interactionSource, enabled);
        Modifier.Companion r16 = Modifier.Companion;
        Orientation r17 = Orientation.Horizontal;
        boolean r18 = state.isRtl$material3_release();
        boolean r19 = state.isDragging$material3_release();
        Modifier.Companion r20 = r16;
        SliderState r4 = state;
        ComposerKt.sourceInformationMarkerStart($composer2, 174725888, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(state);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L61;
    L64:
        SliderKt$SliderImpl$drag$1$1 value$iv = new SliderKt$SliderImpl$drag$1$1(state, null);
        $composer2.updateRememberedValue(value$iv);
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $dirty2 = $dirty;
        Modifier drag = DraggableKt.draggable$default(r20, r4, r17, enabled, interactionSource, r19, null, (Function3) value$iv, r18, 32, null);
        Modifier modifier$iv = FocusableKt.focusable(sliderSemantics(SizeKt.m768requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null), state, enabled), enabled, interactionSource).then(press).then(drag);
        ComposerKt.sourceInformationMarkerStart($composer2, 174754537, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(state);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L68;
    L71:
        MeasurePolicy value$iv2 = new SliderKt$SliderImpl$2$1(state);
        $composer2.updateRememberedValue(value$iv2);
    L72:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L75;
        ComposablesKt.invalidApplier();
    L75:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L78;
        Function0<ComposeUiNode> r3 = r110;
        $composer2.createNode(r3);
    L79:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L86;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L86;
    L87:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -610171494, "C682@30354L85,680@30227L271,688@30511L74:Slider.kt#uh7d8r");
        Modifier r23 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.THUMB), null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 534510168, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(state);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L94;
        if (it$iv3 == Composer.Companion.getEmpty()) goto L94;
        Object value$iv3 = it$iv3;
    L95:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv2 = OnRemeasuredModifierKt.onSizeChanged(r23, (Function1) value$iv3);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r36 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L98;
        ComposablesKt.invalidApplier();
    L98:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L101;
        Function0<ComposeUiNode> r2 = r36;
        $composer2.createNode(r2);
    L102:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L109;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L109;
    L110:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r25 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r41 = BoxScopeInstance.INSTANCE;
        int r43 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -469300363, "C686@30472L12:Slider.kt#uh7d8r");
        r54.invoke(state, $composer2, Integer.valueOf((($dirty2 >> 3) & 14) | (($dirty2 >> 9) & 112)));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.TRACK);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L113;
        ComposablesKt.invalidApplier();
    L113:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L116;
        Function0<ComposeUiNode> r26 = r111;
        $composer2.createNode(r26);
    L117:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r27 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L123;
        Composer $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L125;
    L124:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r27);
    L125:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r28 = BoxScopeInstance.INSTANCE;
        int r29 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -469202155, "C688@30571L12:Slider.kt#uh7d8r");
        r1 = r55;
        r1.invoke(state, $composer$iv, Integer.valueOf((($dirty2 >> 3) & 14) | (($dirty2 >> 12) & 112)));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventEnd();
        goto L128
    L123:
        $composer3 = $composer2;
        goto L124
    L116:
        r26 = r111;
        $composer2.useNode();
    L109:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r24);
        goto L110
    L101:
        r2 = r36;
        $composer2.useNode();
    L94:
        value$iv3 = (Function1) new SliderKt$SliderImpl$1$1$1(state);
        $composer2.updateRememberedValue(value$iv3);
    L86:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r21);
        goto L87
    L78:
        r3 = r110;
        $composer2.useNode();
        goto L79
    L68:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L71;
        value$iv2 = it$iv2;
        goto L72
    L61:
        if (it$iv == Composer.Companion.getEmpty()) goto L64;
        value$iv = it$iv;
        goto L65
    L57:
        r7 = false;
        goto L58
    }

    private static final void RangeSliderImpl(final Modifier modifier, final RangeSliderState state, final boolean enabled, final MutableInteractionSource startInteractionSource, final MutableInteractionSource endInteractionSource, final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r62, final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r63, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r64, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1411725677);
        ComposerKt.sourceInformation($composer2, "C(RangeSliderImpl)P(3,6!1,4!1,5)736@32503L7,746@32756L35,747@32824L33,784@34404L2230,749@32863L3771:Slider.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Modifier r11 = modifier;
        if ($composer2.changed(r11) == false) goto L7;
        int r12 = 4;
    L8:
        $dirty = $dirty | r12;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(state) == false) goto L15;
        int r13 = 32;
    L16:
        $dirty = $dirty | r13;
        goto L18
    L15:
        r13 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(enabled) == false) goto L22;
        int r14 = 256;
    L23:
        $dirty = $dirty | r14;
        goto L25
    L22:
        r14 = 128;
    L25:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changed(startInteractionSource) == false) goto L29;
        int r15 = 2048;
    L30:
        $dirty = $dirty | r15;
        goto L32
    L29:
        r15 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changed(endInteractionSource) == false) goto L36;
        int r16 = 16384;
    L37:
        $dirty = $dirty | r16;
        goto L39
    L36:
        r16 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changedInstance(r62) == false) goto L43;
        int r17 = 131072;
    L44:
        $dirty = $dirty | r17;
        goto L46
    L43:
        r17 = 65536;
    L46:
        if ((1572864 & $changed) != 0) goto L53;
        if ($composer2.changedInstance(r63) == false) goto L50;
        int r18 = 1048576;
    L51:
        $dirty = $dirty | r18;
        goto L53
    L50:
        r18 = 524288;
    L53:
        if ((12582912 & $changed) == 0) goto L55;
    L59:
        int $dirty2 = $dirty;
        if ((4793491 & $dirty2) != 4793490) goto L66;
        if ($composer2.getSkipping() == false) goto L66;
        $composer2.skipToGroupEnd();
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r1 = r64;
        Composer $composer3 = $composer2;
    L172:
        ScopeUpdateScope r10 = $composer3.endRestartGroup();
        if (r10 == null) goto L176;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> r8 = r1;
        r10.updateScope(new C05553(modifier, state, enabled, startInteractionSource, endInteractionSource, r62, r63, r8, $changed));
        return;
    L176:
        return;
    L66:
        if (ComposerKt.isTraceInProgress() == false) goto L68;
        ComposerKt.traceEventStart(-1411725677, $dirty2, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
    L68:
        ProvidableCompositionLocal<LayoutDirection> r0 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r19 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r19 != LayoutDirection.Rtl) goto L71;
        boolean r2 = true;
    L72:
        state.setRtl$material3_release(r2);
        Modifier pressDrag = rangeSliderPressDragModifier(Modifier.Companion, state, startInteractionSource, endInteractionSource, enabled);
        Strings.Companion r110 = Strings.Companion;
        final String startContentDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.range_start), $composer2, 0);
        Strings.Companion r111 = Strings.Companion;
        final String endContentDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(androidx.compose.ui.R.string.range_end), $composer2, 0);
        Modifier modifier$iv = SizeKt.m768requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(r11), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(pressDrag);
        ComposerKt.sourceInformationMarkerStart($composer2, 1662324209, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(state);
        MeasurePolicy value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L75;
    L78:
        value$iv = new SliderKt$RangeSliderImpl$2$1(state);
        $composer2.updateRememberedValue(value$iv);
    L79:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L82;
        ComposablesKt.invalidApplier();
    L82:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L85;
        Function0<ComposeUiNode> r9 = r23;
        $composer2.createNode(r9);
    L86:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L93;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L93;
    L94:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r3 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 2110426496, "C755@33080L46,757@33259L100,751@32893L598,768@33689L44,770@33864L98,764@33504L586,777@34103L79:Slider.kt#uh7d8r");
        Modifier r4 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1176461672, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(state);
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L97;
    L100:
        value$iv2 = (Function1) new SliderKt$RangeSliderImpl$1$1$1(state);
        $composer2.updateRememberedValue(value$iv2);
    L101:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r5 = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(r4, (Function1) value$iv2), state, enabled);
        ComposerKt.sourceInformationMarkerStart($composer2, 1176467454, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changed(startContentDescription);
        Object value$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L108;
        if (value$iv3 == Composer.Companion.getEmpty()) goto L108;
    L109:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv2 = FocusableKt.focusable(SemanticsModifierKt.semantics(r5, true, (Function1) value$iv3), enabled, startInteractionSource);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r43 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L112;
        ComposablesKt.invalidApplier();
    L112:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L115;
        Function0<ComposeUiNode> r6 = r43;
        $composer2.createNode(r6);
    L116:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r112 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L123;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L123;
    L124:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r20 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r48 = BoxScopeInstance.INSTANCE;
        int r50 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 259534201, "C762@33460L17:Slider.kt#uh7d8r");
        r62.invoke(state, $composer2, Integer.valueOf((($dirty2 >> 3) & 14) | (($dirty2 >> 12) & 112)));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r21 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1176481158, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv4 = $composer2.changedInstance(state);
        Object value$iv4 = $composer2.rememberedValue();
        if (invalid$iv4 == true) goto L130;
        $composer3 = $composer2;
        if (value$iv4 != Composer.Companion.getEmpty()) goto L132;
    L131:
        value$iv4 = (Function1) new SliderKt$RangeSliderImpl$1$4$1(state);
        $composer2.updateRememberedValue(value$iv4);
    L132:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r22 = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(r21, (Function1) value$iv4), state, enabled);
        ComposerKt.sourceInformationMarkerStart($composer2, 1176486812, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv5 = $composer2.changed(endContentDescription);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv5 == false) goto L135;
    L138:
        Object value$iv5 = (Function1) new SliderKt$RangeSliderImpl$1$5$1(endContentDescription);
        $composer2.updateRememberedValue(value$iv5);
    L139:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv3 = FocusableKt.focusable(SemanticsModifierKt.semantics(r22, true, (Function1) value$iv5), enabled, endInteractionSource);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
        Function0<ComposeUiNode> r37 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L142;
        ComposablesKt.invalidApplier();
    L142:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L145;
        Function0<ComposeUiNode> r24 = r37;
        $composer2.createNode(r24);
    L146:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r25 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L153;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L153;
    L154:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r26 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r27 = BoxScopeInstance.INSTANCE;
        int r40 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 260130331, "C775@34061L15:Slider.kt#uh7d8r");
        r63.invoke(state, $composer2, Integer.valueOf((($dirty2 >> 3) & 14) | (($dirty2 >> 15) & 112)));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv4 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer2, modifier$iv4);
        Function0<ComposeUiNode> r113 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L157;
        ComposablesKt.invalidApplier();
    L157:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L160;
        Function0<ComposeUiNode> r28 = r113;
        $composer2.createNode(r28);
    L161:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r29 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L167;
        int $changed$iv = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L169;
    L168:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r29);
    L169:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r30 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r31 = BoxScopeInstance.INSTANCE;
        int r32 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 260236382, "C777@34168L12:Slider.kt#uh7d8r");
        r1 = r64;
        r1.invoke(state, $composer2, Integer.valueOf((($dirty2 >> 3) & 14) | (($dirty2 >> 18) & 112)));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L172;
        ComposerKt.traceEventEnd();
        goto L172
    L167:
        $changed$iv = 6;
        goto L168
    L160:
        r28 = r113;
        $composer2.useNode();
    L153:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r25);
        goto L154
    L145:
        r24 = r37;
        $composer2.useNode();
        goto L146
    L135:
        if (it$iv == Composer.Companion.getEmpty()) goto L138;
        value$iv5 = it$iv;
        goto L139
    L130:
        $composer3 = $composer2;
    L123:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r112);
        goto L124
    L115:
        r6 = r43;
        $composer2.useNode();
    L108:
        value$iv3 = (Function1) new SliderKt$RangeSliderImpl$1$2$1(startContentDescription);
        $composer2.updateRememberedValue(value$iv3);
        goto L109
    L97:
        if (value$iv2 != Composer.Companion.getEmpty()) goto L101;
    L93:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r7);
        goto L94
    L85:
        r9 = r23;
        $composer2.useNode();
        goto L86
    L75:
        if (value$iv != Composer.Companion.getEmpty()) goto L79;
    L71:
        r2 = false;
        goto L72
    L55:
        if ($composer2.changedInstance(r64) == false) goto L57;
        int r114 = 8388608;
    L58:
        $dirty = $dirty | r114;
        goto L59
    L57:
        r114 = 4194304;
        goto L58
    L7:
        r12 = 2;
        goto L8
    L9:
        r11 = modifier;
        goto L11
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.IntIterator] */
    private static final float snapValueToTick(float current, float[] tickFractions, float minPx, float maxPx) {
        if (tickFractions.length != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        Float r3 = null;
    L19:
        if (r3 == null) goto L22;
        float $this$snapValueToTick_u24lambda_u2430 = r3.floatValue();
        return MathHelpersKt.lerp(minPx, maxPx, $this$snapValueToTick_u24lambda_u2430);
    L22:
        return current;
    L8:
        float minElem$iv = tickFractions[0];
        int lastIndex$iv = ArraysKt.getLastIndex(tickFractions);
        if (lastIndex$iv != 0) goto L11;
        r3 = Float.valueOf(minElem$iv);
        goto L19
    L11:
        float minValue$iv = Math.abs(MathHelpersKt.lerp(minPx, maxPx, minElem$iv) - current);
        ?? r4 = new IntRange(1, lastIndex$iv).iterator();
    L13:
        if (r4.hasNext() == false) goto L17;
        int i$iv = r4.nextInt();
        float e$iv = tickFractions[i$iv];
        float v$iv = Math.abs(MathHelpersKt.lerp(minPx, maxPx, e$iv) - current);
        if (Float.compare(minValue$iv, v$iv) <= 0) goto L13;
        minElem$iv = e$iv;
        minValue$iv = v$iv;
        goto L13
    L17:
        r3 = Float.valueOf(minElem$iv);
        goto L19
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    private static final Object m2631awaitSlop8vUncbI(AwaitPointerEventScope $this$awaitSlop_u2d8vUncbI, long id, int type, Continuation<? super Pair<PointerInputChange, Float>> r11) {
        if ((r11 instanceof SliderKt$awaitSlop$1) == false) goto L7;
        SliderKt$awaitSlop$1 r0 = (SliderKt$awaitSlop$1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        SliderKt$awaitSlop$1 r6 = r0;
        Object $result = r6.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        final Ref.FloatRef initialDelta = (Ref.FloatRef) r6.L$0;
        ResultKt.throwOnFailure($result);
        Object r8 = $result;
    L16:
        PointerInputChange afterSlopResult = (PointerInputChange) r8;
        if (afterSlopResult != null) goto L21;
        return null;
    L21:
        return TuplesKt.to(afterSlopResult, Boxing.boxFloat(initialDelta.element));
    L13:
        ResultKt.throwOnFailure($result);
        initialDelta = new Ref.FloatRef();
        Function2<PointerInputChange, Float, Unit> r5 = new SliderKt$awaitSlop$postPointerSlop$1(initialDelta);
        r6.L$0 = initialDelta;
        r6.label = 1;
        r8 = DragGestureDetectorCopyKt.m3019awaitHorizontalPointerSlopOrCancellationgDDlDlE($this$awaitSlop_u2d8vUncbI, id, type, r5, r6);
        if (r8 != r1) goto L16;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new SliderKt$awaitSlop$1(r11);
        goto L8
    }

    private static final float[] stepsToTickFractions(int steps) {
        int r0 = 0;
        if (steps == 0) goto L11;
        int r1 = steps + 2;
        float[] r2 = new float[r1];
    L6:
        if (r0 >= r1) goto L9;
        r2[r0] = r0 / (steps + 1);
        r0 = r0 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return new float[0];
    }

    private static final float scale(float a1, float b1, float x1, float a2, float b2) {
        return MathHelpersKt.lerp(a2, b2, calcFraction(a1, b1, x1));
    }

    /* JADX INFO: renamed from: scale-ziovWd0, reason: not valid java name */
    private static final long m2634scaleziovWd0(float a1, float b1, long x, float a2, float b2) {
        return SliderRange(scale(a1, b1, SliderRange.m2646getStartimpl(x), a2, b2), scale(a1, b1, SliderRange.m2645getEndInclusiveimpl(x), a2, b2));
    }

    private static final float calcFraction(float a, float b, float pos) {
        if ((b - a) != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        float r1 = 0.0f;
    L10:
        return RangesKt.coerceIn(r1, 0.0f, 1.0f);
    L8:
        r1 = (pos - a) / (b - a);
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    private static final Modifier sliderSemantics(Modifier $this$sliderSemantics, final SliderState state, final boolean enabled) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default($this$sliderSemantics, false, new C05661(enabled, state), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), state.getValue(), RangesKt.rangeTo(state.getValueRange().getStart().floatValue(), state.getValueRange().getEndInclusive().floatValue()), state.getSteps());
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier $this$rangeSliderStartThumbSemantics, final RangeSliderState state, final boolean enabled) {
        final ClosedFloatingPointRange<Float> r0 = RangesKt.rangeTo(state.getValueRange().getStart().floatValue(), state.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default($this$rangeSliderStartThumbSemantics, false, new C05651(enabled, r0, state), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), state.getActiveRangeStart(), r0, state.getStartSteps$material3_release());
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier $this$rangeSliderEndThumbSemantics, final RangeSliderState state, final boolean enabled) {
        final ClosedFloatingPointRange<Float> r0 = RangesKt.rangeTo(state.getActiveRangeStart(), state.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default($this$rangeSliderEndThumbSemantics, false, new C05631(enabled, r0, state), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), state.getActiveRangeEnd(), r0, state.getEndSteps$material3_release());
    }

    private static final Modifier sliderTapModifier(Modifier $this$sliderTapModifier, SliderState state, MutableInteractionSource interactionSource, boolean enabled) {
        if (enabled == false) goto L5;
        return SuspendingPointerInputFilterKt.pointerInput($this$sliderTapModifier, state, interactionSource, new C05671(state, null));
    L5:
        return $this$sliderTapModifier;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier $this$rangeSliderPressDragModifier, RangeSliderState state, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, boolean enabled) {
        if (enabled == false) goto L5;
        return SuspendingPointerInputFilterKt.pointerInput($this$rangeSliderPressDragModifier, new Object[]{startInteractionSource, endInteractionSource, state}, new C05641(state, startInteractionSource, endInteractionSource, null));
    L5:
        return $this$rangeSliderPressDragModifier;
    }

    static {
        TrackHeight = SliderTokens.INSTANCE.m3623getInactiveTrackHeightD9Ej5fM();
        ThumbWidth = SliderTokens.INSTANCE.m3621getHandleWidthD9Ej5fM();
        ThumbHeight = SliderTokens.INSTANCE.m3620getHandleHeightD9Ej5fM();
        ThumbSize = DpKt.m6995DpSizeYgX7TsA(ThumbWidth, ThumbHeight);
        ThumbTrackGapSize = SliderTokens.INSTANCE.m3613getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = Dp.m6973constructorimpl(2);
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final long SliderRange(float start, float endInclusive) {
        boolean r1 = true;
        if (Float.isNaN(start) == true) goto L5;
    L7:
        boolean isUnspecified = false;
    L8:
        if (isUnspecified == false) goto L10;
    L13:
        if (r1 == false) goto L17;
        long v1$iv = Float.floatToRawIntBits(start);
        long v2$iv = Float.floatToRawIntBits(endInclusive);
        return SliderRange.m2642constructorimpl((v1$iv << 32) | (4294967295L & v2$iv));
    L17:
        throw new IllegalArgumentException(("start(" + start + ") must be <= endInclusive(" + endInclusive + ')').toString());
    L10:
        if (start <= (((double) endInclusive) + SliderRangeTolerance)) goto L13;
        r1 = false;
        goto L13
    L5:
        if (Float.isNaN(endInclusive) == false) goto L7;
        isUnspecified = true;
        goto L8
    }

    public static final long SliderRange(ClosedFloatingPointRange<Float> r12) {
        float start = r12.getStart().floatValue();
        float endInclusive = r12.getEndInclusive().floatValue();
        boolean r3 = true;
        if (Float.isNaN(start) == true) goto L5;
    L7:
        boolean isUnspecified = false;
    L8:
        if (isUnspecified == false) goto L10;
    L13:
        if (r3 == false) goto L17;
        long v1$iv = Float.floatToRawIntBits(start);
        long v2$iv = Float.floatToRawIntBits(endInclusive);
        return SliderRange.m2642constructorimpl((v1$iv << 32) | (4294967295L & v2$iv));
    L17:
        throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + start + ") must be <= ClosedFloatingPoint.endInclusive(" + endInclusive + ')').toString());
    L10:
        if (start <= (((double) endInclusive) + SliderRangeTolerance)) goto L13;
        r3 = false;
        goto L13
    L5:
        if (Float.isNaN(endInclusive) == false) goto L7;
        isUnspecified = true;
        goto L8
    }

    /* JADX INFO: renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m2632isSpecifiedIf1S1O4(long $this$isSpecified) {
        if ($this$isSpecified == SliderRange.Companion.m2651getUnspecifiedFYbKRX4()) goto L5;
        return true;
    L5:
        return false;
    }
}
