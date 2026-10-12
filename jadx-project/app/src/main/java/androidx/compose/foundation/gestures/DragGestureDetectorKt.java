package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.InputDeviceCompat;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0080@¢\u0006\u0002\u0010\r\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0015H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0018\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012\u001aa\u0010\u001a\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001eH\u0080@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aY\u0010&\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001026\u0010'\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0012\u001aW\u0010,\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010\t\u001a\u00020/2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020#0\u001eH\u0080Hø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aY\u00102\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001026\u0010'\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110/¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u0010)\u001a!\u00104\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u0012\u001aa\u00106\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c26\u0010'\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001eH\u0080@ø\u0001\u0000¢\u0006\u0004\b7\u0010%\u001aY\u00108\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001026\u0010'\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b9\u0010)\u001a\u0080\u0001\u0010:\u001a\u00020#*\u00020;2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020#0\u00152\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020#0>2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020#0>26\u0010@\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110/¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(A\u0012\u0004\u0012\u00020#0\u001eH\u0086@¢\u0006\u0002\u0010B\u001aà\u0001\u0010:\u001a\u00020#*\u00020;2K\u0010<\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(E\u0012\u0013\u0012\u00110/¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(F\u0012\u0004\u0012\u00020#0C2!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020#0\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00020#0>2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070>2\b\u0010H\u001a\u0004\u0018\u00010.26\u0010@\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110/¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(A\u0012\u0004\u0012\u00020#0\u001eH\u0080@¢\u0006\u0002\u0010I\u001a\u0080\u0001\u0010J\u001a\u00020#*\u00020;2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020#0\u00152\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020#0>2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020#0>26\u0010@\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110/¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(A\u0012\u0004\u0012\u00020#0\u001eH\u0086@¢\u0006\u0002\u0010B\u001a\u0080\u0001\u0010K\u001a\u00020#*\u00020;2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020#0\u00152\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020#0>2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020#0>26\u0010L\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(A\u0012\u0004\u0012\u00020#0\u001eH\u0086@¢\u0006\u0002\u0010B\u001a\u0080\u0001\u0010M\u001a\u00020#*\u00020;2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020#0\u00152\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020#0>2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020#0>26\u0010N\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(A\u0012\u0004\u0012\u00020#0\u001eH\u0086@¢\u0006\u0002\u0010B\u001a3\u0010O\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0017\u001aS\u0010O\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\u00152\b\u0010-\u001a\u0004\u0018\u00010.2\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0015H\u0080Hø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a3\u0010T\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\bU\u0010\u0017\u001a\u001e\u0010V\u001a\u00020\u0007*\u00020W2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a\u001e\u0010Z\u001a\u00020\u0005*\u00020[2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a3\u0010^\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b_\u0010\u0017\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitAllPointersUpWithSlopDetection", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "initialPositionChange", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "awaitPointerSlopOrCancellation", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-6ksA65w", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "down", "slopTriggerChange", "overSlopOffset", "shouldAwaitTouchSlop", "orientationLock", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop = 0.0f;
    private static final float mouseSlop = 0.0f;
    private static final float mouseToTouchSlopRatio = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1, reason: invalid class name */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {851}, m = "awaitAllPointersUpWithSlopDetection", n = {"$this$awaitAllPointersUpWithSlopDetection", "pass", "pointer", "touchSlopDetector", "pointerSlopReached", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9, reason: invalid class name */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
    static final class AnonymousClass9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
        final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ Ref.LongRef $overSlop;
        final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
        float F$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(Function0<Boolean> r2, Ref.LongRef r3, Orientation r4, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> r5, Function2<? super PointerInputChange, ? super Offset, Unit> r6, Function0<Unit> r7, Function1<? super PointerInputChange, Unit> r8, Continuation<? super AnonymousClass9> r9) {
            this.$shouldAwaitTouchSlop = r2;
            this.$overSlop = r3;
            this.$orientationLock = r4;
            this.$onDragStart = r5;
            this.$onDrag = r6;
            this.$onDragCancel = r7;
            this.$onDragEnd = r8;
            super(2, r9);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r10, Continuation<?> r11) {
            AnonymousClass9 r0 = new AnonymousClass9(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, r11);
            r0.L$0 = r10;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass9) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0413 -> B:99:0x038e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x047f -> B:184:0x05d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0510 -> B:184:0x05d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0520 -> B:184:0x05d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0563 -> B:184:0x05d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0599 -> B:184:0x05d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x05c7 -> B:181:0x05cc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x05dc -> B:87:0x0352). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x0647 -> B:197:0x0650). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01f4 -> B:80:0x033b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0285 -> B:80:0x033b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0293 -> B:80:0x033b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x02d4 -> B:80:0x033b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0301 -> B:80:0x033b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x032e -> B:76:0x0333). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L14;
                case 1: goto L13;
                case 2: goto L12;
                case 3: goto L11;
                case 4: goto L10;
                case 5: goto L9;
                case 6: goto L8;
                case 7: goto L7;
                case 8: goto L6;
                default: goto L5;
            };
        L6:
            Object $result2 = $result;
            Ref.LongRef pointer$iv$iv = (Ref.LongRef) this.L$4;
            AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv$iv = (AwaitPointerEventScope) this.L$3;
            Orientation orientation$iv = (Orientation) this.L$2;
            Function2<PointerInputChange, Offset, Unit> r11 = (Function2) this.L$1;
            AwaitPointerEventScope $this$drag_u2dVnAYq1g$iv = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result2);
            AnonymousClass9 r5 = this;
            AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv$iv2 = $this$awaitDragOrUp_u2djO51t88$iv$iv;
            Ref.LongRef pointer$iv$iv2 = pointer$iv$iv;
            int r7 = 0;
            int r4 = 0;
            Object $result3 = $result2;
        L197:
            PointerEvent event$iv$iv = (PointerEvent) $result2;
            List<PointerInputChange> r13 = event$iv$iv.getChanges();
            int r8 = r13.size();
            int index$iv$iv$iv$iv = 0;
        L198:
            if (index$iv$iv$iv$iv >= r8) goto L203;
            Object item$iv$iv$iv$iv = r13.get(index$iv$iv$iv$iv);
            Object it$iv$iv$iv = item$iv$iv$iv$iv;
            PointerInputChange it$iv$iv = (PointerInputChange) it$iv$iv$iv;
            AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv$iv3 = $this$awaitDragOrUp_u2djO51t88$iv$iv2;
            Object r21 = r1;
            PointerEvent event$iv$iv2 = event$iv$iv;
            Object $result4 = $result3;
            if (PointerId.m5571equalsimpl0(it$iv$iv.m5587getIdJ3iCeTQ(), pointer$iv$iv2.element) == true) goto L204;
            index$iv$iv$iv$iv = index$iv$iv$iv$iv + 1;
            $this$awaitDragOrUp_u2djO51t88$iv$iv2 = $this$awaitDragOrUp_u2djO51t88$iv$iv3;
            r1 = r21;
            $result3 = $result4;
            event$iv$iv = event$iv$iv2;
        L204:
            PointerInputChange dragEvent$iv$iv = (PointerInputChange) it$iv$iv$iv;
            if (dragEvent$iv$iv != null) goto L208;
            dragEvent$iv$iv = null;
        L232:
            if (dragEvent$iv$iv != null) goto L234;
            AnonymousClass9 r6 = r5;
            PointerInputChange upEvent = null;
        L241:
            if (upEvent != null) goto L243;
            r6.$onDragCancel.invoke();
        L247:
            return Unit.INSTANCE;
        L243:
            r6.$onDragEnd.invoke(upEvent);
            goto L247
        L234:
            PointerInputChange it = dragEvent$iv$iv;
            if (it.isConsumed() == false) goto L238;
            r6 = r5;
            upEvent = null;
            goto L241
        L238:
            if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv$iv) == false) goto L244;
            r6 = r5;
            upEvent = dragEvent$iv$iv;
            goto L241
        L244:
            PointerInputChange it2 = dragEvent$iv$iv;
            r11.invoke(it2, Offset.m4114boximpl(PointerEventKt.positionChange(it2)));
            it2.consume();
            long pointer$iv = dragEvent$iv$iv.m5587getIdJ3iCeTQ();
            int r9 = r4;
            r6 = r5;
            Orientation orientation$iv2 = orientation$iv;
            Function2<PointerInputChange, Offset, Unit> r0 = r11;
            AwaitPointerEventScope $this$drag_u2dVnAYq1g$iv2 = $this$drag_u2dVnAYq1g$iv;
            r1 = r21;
            Object $result5 = $result4;
        L192:
            int r10 = 0;
            Ref.LongRef pointer$iv$iv3 = new Ref.LongRef();
            pointer$iv$iv3.element = pointer$iv;
            r11 = r0;
            $this$awaitDragOrUp_u2djO51t88$iv$iv2 = $this$drag_u2dVnAYq1g$iv2;
            Ref.LongRef pointer$iv$iv4 = pointer$iv$iv3;
            $this$drag_u2dVnAYq1g$iv = $this$drag_u2dVnAYq1g$iv2;
            orientation$iv = orientation$iv2;
            Object $result6 = $result5;
            int r3 = r9;
        L193:
            r6.L$0 = $this$drag_u2dVnAYq1g$iv;
            r6.L$1 = r11;
            r6.L$2 = orientation$iv;
            r6.L$3 = $this$awaitDragOrUp_u2djO51t88$iv$iv2;
            r6.L$4 = pointer$iv$iv4;
            r6.L$5 = null;
            r6.L$6 = null;
            r6.label = 8;
            Object r12 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88$iv$iv2, null, r6, 1, null);
            if (r12 != r1) goto L196;
            return r1;
        L196:
            int r29 = r3;
            $result3 = $result6;
            $result2 = r12;
            r7 = r10;
            pointer$iv$iv2 = pointer$iv$iv4;
            r5 = r6;
            r4 = r29;
            goto L197
        L208:
            if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv$iv) == false) goto L220;
            List<PointerInputChange> r2 = event$iv$iv2.getChanges();
            int index$iv$iv$iv$iv2 = 0;
            int r14 = r2.size();
        L210:
            if (index$iv$iv$iv$iv2 >= r14) goto L215;
            Object item$iv$iv$iv$iv2 = r2.get(index$iv$iv$iv$iv2);
            Object it$iv$iv$iv2 = item$iv$iv$iv$iv2;
            PointerInputChange it$iv$iv2 = (PointerInputChange) it$iv$iv$iv2;
            if (it$iv$iv2.getPressed() == true) goto L216;
            index$iv$iv$iv$iv2 = index$iv$iv$iv$iv2 + 1;
        L216:
            PointerInputChange otherDown$iv$iv = (PointerInputChange) it$iv$iv$iv2;
            if (otherDown$iv$iv == null) goto L232;
            pointer$iv$iv2.element = otherDown$iv$iv.m5587getIdJ3iCeTQ();
        L245:
            $this$awaitDragOrUp_u2djO51t88$iv$iv2 = $this$awaitDragOrUp_u2djO51t88$iv$iv3;
            r3 = r4;
            r6 = r5;
            pointer$iv$iv4 = pointer$iv$iv2;
            r10 = r7;
            r1 = r21;
            $result6 = $result4;
            goto L193
        L215:
            it$iv$iv$iv2 = null;
            goto L216
        L220:
            long value$iv$iv$iv = PointerEventKt.positionChangeIgnoreConsumed(dragEvent$iv$iv);
            if (orientation$iv != null) goto L224;
            float motionChange$iv = Offset.m4123getDistanceimpl(value$iv$iv$iv);
        L228:
            if (motionChange$iv != 0.0f) goto L230;
            boolean r15 = true;
        L231:
            if (r15 == true) goto L245;
        L230:
            r15 = false;
            goto L231
        L224:
            if (orientation$iv != Orientation.Vertical) goto L226;
            int bits$iv$iv$iv$iv = (int) (4294967295L & value$iv$iv$iv);
            motionChange$iv = Float.intBitsToFloat(bits$iv$iv$iv$iv);
            goto L228
        L226:
            int bits$iv$iv$iv$iv2 = (int) (value$iv$iv$iv >> 32);
            motionChange$iv = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
            goto L228
        L203:
            $this$awaitDragOrUp_u2djO51t88$iv$iv3 = $this$awaitDragOrUp_u2djO51t88$iv$iv2;
            r21 = r1;
            event$iv$iv2 = event$iv$iv;
            $result4 = $result3;
            it$iv$iv$iv = null;
            goto L204
        L7:
            float touchSlop$iv = this.F$0;
            PointerInputChange dragEvent$iv = (PointerInputChange) this.L$6;
            TouchSlopDetector touchSlopDetector$iv = (TouchSlopDetector) this.L$5;
            Ref.LongRef pointer$iv2 = (Ref.LongRef) this.L$4;
            Ref.LongRef r16 = (Ref.LongRef) this.L$3;
            long r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv = (AwaitPointerEventScope) this.L$2;
            PointerInputChange down = (PointerInputChange) this.L$1;
            long r18 = 9223372034707292159L;
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $result5 = $result;
            AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv;
            AwaitPointerEventScope $this$awaitEachGesture2 = $this$awaitEachGesture;
            TouchSlopDetector touchSlopDetector$iv2 = touchSlopDetector$iv;
            AnonymousClass9 r19 = this;
            PointerInputChange down2 = down;
            float touchSlop$iv2 = touchSlop$iv;
        L182:
            if (dragEvent$iv.isConsumed() == false) goto L185;
            PointerInputChange down3 = down2;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            PointerInputChange dragEvent$iv2 = null;
        L184:
            PointerInputChange down4 = dragEvent$iv2;
        L88:
            if (ComposeFoundationFlags.DragGesturePickUpEnabled == false) goto L187;
            if (down4 != null) goto L187;
            List<PointerInputChange> r20 = $this$drag_u2dVnAYq1g$iv2.getCurrentEvent().getChanges();
            int index$iv$iv = 0;
            int r22 = r20.size();
        L91:
            if (index$iv$iv >= r22) goto L96;
            Object item$iv$iv = r20.get(index$iv$iv);
            PointerInputChange it3 = (PointerInputChange) item$iv$iv;
            if (it3.getPressed() == true) goto L94;
            index$iv$iv = index$iv$iv + 1;
            goto L91
        L94:
            boolean r23 = true;
        L97:
            if (r23 == false) goto L187;
            Object r24 = $result5;
            PointerInputChange drag = down4;
            down2 = down3;
            Object $result7 = r24;
            AwaitPointerEventScope $this$awaitEachGesture3 = $this$drag_u2dVnAYq1g$iv2;
        L99:
            r6.L$0 = $this$awaitEachGesture3;
            r6.L$1 = down2;
            r6.L$2 = drag;
            r6.L$3 = null;
            r6.L$4 = null;
            r6.L$5 = null;
            r6.L$6 = null;
            r6.label = 5;
            Object r25 = $this$awaitEachGesture3.awaitPointerEvent(PointerEventPass.Final, r6);
            if (r25 != r1) goto L102;
            return r1;
        L102:
            PointerInputChange r210 = drag;
            $result5 = $result7;
            Object $result8 = r25;
            $this$awaitEachGesture2 = $this$awaitEachGesture3;
            r19 = r6;
            PointerInputChange drag2 = r210;
        L103:
            PointerEvent event = (PointerEvent) $result8;
            List<PointerInputChange> r26 = event.getChanges();
            int index$iv$iv2 = 0;
            int r110 = r26.size();
        L104:
            if (index$iv$iv2 >= r110) goto L109;
            Object item$iv$iv2 = r26.get(index$iv$iv2);
            PointerInputChange it4 = (PointerInputChange) item$iv$iv2;
            if (it4.isConsumed() == true) goto L107;
            index$iv$iv2 = index$iv$iv2 + 1;
            goto L104
        L107:
            boolean r27 = true;
        L110:
            if (r27 == false) goto L121;
            List<PointerInputChange> r28 = event.getChanges();
            int index$iv$iv3 = 0;
            int r111 = r28.size();
        L112:
            if (index$iv$iv3 >= r111) goto L117;
            Object item$iv$iv3 = r28.get(index$iv$iv3);
            PointerInputChange it5 = (PointerInputChange) item$iv$iv3;
            if (it5.getPressed() == true) goto L115;
            index$iv$iv3 = index$iv$iv3 + 1;
            goto L112
        L115:
            boolean r30 = true;
        L118:
            if (r30 == false) goto L121;
            $result7 = $result5;
            drag = drag2;
            r6 = r19;
            $this$awaitEachGesture3 = $this$awaitEachGesture2;
            goto L99
        L117:
            r30 = false;
        L121:
            List<PointerInputChange> r31 = event.getChanges();
            int index$iv$iv4 = 0;
            int r112 = r31.size();
        L122:
            if (index$iv$iv4 >= r112) goto L127;
            Object item$iv$iv4 = r31.get(index$iv$iv4);
            PointerInputChange it6 = (PointerInputChange) item$iv$iv4;
            if (it6.getPressed() == true) goto L125;
            index$iv$iv4 = index$iv$iv4 + 1;
            goto L122
        L125:
            boolean r32 = true;
        L128:
            if (r32 == false) goto L186;
            PointerInputChange r33 = (PointerInputChange) CollectionsKt.firstOrNull(event.getChanges());
            if (r33 == null) goto L132;
            long r34 = r33.m5589getPositionF1C5BW0();
        L133:
            long initialPositionChange = Offset.m4129minusMKHz9U(r34, down2.m5589getPositionF1C5BW0());
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2 = $this$awaitEachGesture2;
            long pointerId$iv = down2.m5587getIdJ3iCeTQ();
            int pointerType$iv = down2.m5592getTypeT8wyACA();
            Orientation orientation$iv3 = r19.$orientationLock;
            Ref.LongRef r113 = r19.$overSlop;
            if (DragGestureDetectorKt.m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2.getCurrentEvent(), pointerId$iv) == false) goto L136;
            down3 = down2;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            dragEvent$iv2 = null;
            goto L184
        L136:
            touchSlop$iv2 = DragGestureDetectorKt.m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2.getViewConfiguration(), pointerType$iv);
            pointer$iv2 = new Ref.LongRef();
            pointer$iv2.element = pointerId$iv;
            touchSlopDetector$iv2 = new TouchSlopDetector(orientation$iv3, initialPositionChange, null);
        L137:
            r19.L$0 = $this$awaitEachGesture2;
            r19.L$1 = down2;
            r19.L$2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2;
            r19.L$3 = r113;
            r19.L$4 = pointer$iv2;
            r19.L$5 = touchSlopDetector$iv2;
            r19.L$6 = null;
            r19.F$0 = touchSlop$iv2;
            r19.label = 6;
            Object r35 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2, null, r19, 1, null);
            if (r35 != r1) goto L140;
            return r1;
        L140:
            AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2;
            Object $result9 = r35;
        L141:
            PointerEvent event$iv = (PointerEvent) $result9;
            List<PointerInputChange> r36 = event$iv.getChanges();
            int $i$f$fastFirstOrNull = 0;
            int index$iv$iv$iv = 0;
            int r37 = r36.size();
        L142:
            if (index$iv$iv$iv >= r37) goto L147;
            Object item$iv$iv$iv = r36.get(index$iv$iv$iv);
            Object it$iv$iv3 = item$iv$iv$iv;
            PointerInputChange it$iv = (PointerInputChange) it$iv$iv3;
            int r211 = r37;
            Object $result10 = $result5;
            List<PointerInputChange> r212 = r36;
            int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
            if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L148;
            index$iv$iv$iv = index$iv$iv$iv + 1;
            $result5 = $result10;
            r37 = r211;
            $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
            r36 = r212;
        L148:
            PointerInputChange dragEvent$iv3 = (PointerInputChange) it$iv$iv3;
            if (dragEvent$iv3 != null) goto L152;
            down3 = down2;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            $result5 = $result10;
            dragEvent$iv2 = null;
            goto L184
        L152:
            if (dragEvent$iv3.isConsumed() == false) goto L155;
            down3 = down2;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            $result5 = $result10;
            dragEvent$iv2 = null;
            goto L184
        L155:
            if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv3) == false) goto L167;
            List<PointerInputChange> r38 = event$iv.getChanges();
            int index$iv$iv$iv2 = 0;
            int r114 = r38.size();
        L157:
            if (index$iv$iv$iv2 >= r114) goto L162;
            Object item$iv$iv$iv2 = r38.get(index$iv$iv$iv2);
            Object it$iv$iv4 = item$iv$iv$iv2;
            PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv4;
            if (it$iv2.getPressed() == true) goto L163;
            index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
        L163:
            PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv4;
            if (otherDown$iv != null) goto L166;
            down3 = down2;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            $result5 = $result10;
            dragEvent$iv2 = null;
            goto L184
        L166:
            pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3;
            $result5 = $result10;
            goto L137
        L162:
            it$iv$iv4 = null;
            goto L163
        L167:
            long postSlopOffset$iv = touchSlopDetector$iv2.m521addPointerInputChangedBAh8RU(dragEvent$iv3, touchSlop$iv2);
            if ((postSlopOffset$iv & r18) == r17) goto L170;
            int r39 = 1;
        L171:
            if (r39 == 0) goto L177;
            dragEvent$iv3.consume();
            r113.element = PointerEventKt.positionChange(dragEvent$iv3);
            if (dragEvent$iv3.isConsumed() == false) goto L175;
            dragEvent$iv2 = dragEvent$iv3;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            $result5 = $result10;
            down3 = down2;
            goto L184
        L175:
            touchSlopDetector$iv2.reset();
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3;
            $result5 = $result10;
            goto L137
        L177:
            r19.L$0 = $this$awaitEachGesture2;
            r19.L$1 = down2;
            r19.L$2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3;
            r19.L$3 = r113;
            r19.L$4 = pointer$iv2;
            r19.L$5 = touchSlopDetector$iv2;
            r19.L$6 = dragEvent$iv3;
            r19.F$0 = touchSlop$iv2;
            r19.label = 7;
            if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3.awaitPointerEvent(PointerEventPass.Final, r19) != r1) goto L180;
            return r1;
        L180:
            r16 = r113;
            $result5 = $result10;
            dragEvent$iv = dragEvent$iv3;
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3;
            goto L182
        L170:
            r39 = 0;
            goto L171
        L147:
            $result10 = $result5;
            it$iv$iv3 = null;
            goto L148
        L132:
            r34 = Offset.Companion.m4141getZeroF1C5BW0();
            goto L133
        L186:
            down3 = down2;
            down4 = drag2;
            r6 = r19;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture2;
            goto L88
        L127:
            r32 = false;
            goto L128
        L109:
            r27 = false;
            goto L110
        L96:
            r23 = false;
        L187:
            if (down4 == null) goto L247;
            r6.$onDragStart.invoke(down3, down4, Offset.m4114boximpl(r6.$overSlop.element));
            r6.$onDrag.invoke(down4, Offset.m4114boximpl(r6.$overSlop.element));
            long pointerId$iv2 = down4.m5587getIdJ3iCeTQ();
            r0 = r6.$onDrag;
            orientation$iv2 = r6.$orientationLock;
            r9 = 0;
            if (DragGestureDetectorKt.m416access$isPointerUpDmW0f2w($this$drag_u2dVnAYq1g$iv2.getCurrentEvent(), pointerId$iv2) == false) goto L191;
            upEvent = null;
            goto L241
        L191:
            pointer$iv = pointerId$iv2;
            goto L192
        L185:
            r113 = r16;
            goto L137
        L8:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            $result9 = $result;
            touchSlop$iv2 = this.F$0;
            TouchSlopDetector touchSlopDetector$iv3 = (TouchSlopDetector) this.L$5;
            Ref.LongRef pointer$iv3 = (Ref.LongRef) this.L$4;
            Ref.LongRef r115 = (Ref.LongRef) this.L$3;
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv3 = (AwaitPointerEventScope) this.L$2;
            PointerInputChange down5 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result9);
            touchSlopDetector$iv2 = touchSlopDetector$iv3;
            pointer$iv2 = pointer$iv3;
            $this$awaitEachGesture2 = $this$awaitEachGesture4;
            r19 = this;
            down2 = down5;
            $result5 = $result9;
            r113 = r115;
            goto L141
        L9:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            $result8 = $result;
            PointerInputChange drag3 = (PointerInputChange) this.L$2;
            PointerInputChange down6 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture5 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result8);
            $this$awaitEachGesture2 = $this$awaitEachGesture5;
            r19 = this;
            down2 = down6;
            drag2 = drag3;
            $result5 = $result8;
            goto L103
        L10:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            float touchSlop$iv3 = this.F$0;
            PointerInputChange dragEvent$iv4 = (PointerInputChange) this.L$6;
            TouchSlopDetector touchSlopDetector$iv4 = (TouchSlopDetector) this.L$5;
            Ref.LongRef pointer$iv4 = (Ref.LongRef) this.L$4;
            Ref.LongRef r116 = (Ref.LongRef) this.L$3;
            AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = (AwaitPointerEventScope) this.L$2;
            PointerInputChange down7 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture6 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            Ref.LongRef pointer$iv5 = pointer$iv4;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture6;
            $result5 = $result;
            Ref.LongRef r117 = r116;
            down3 = down7;
            TouchSlopDetector touchSlopDetector$iv5 = touchSlopDetector$iv4;
            float touchSlop$iv4 = touchSlop$iv3;
            r6 = this;
        L77:
            if (dragEvent$iv4.isConsumed() == false) goto L85;
            down4 = null;
        L80:
            if (down4 == null) goto L88;
            if (down4.isConsumed() == true) goto L88;
        L28:
            AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$drag_u2dVnAYq1g$iv2;
            long pointerId$iv3 = down3.m5587getIdJ3iCeTQ();
            int pointerType$iv2 = down3.m5592getTypeT8wyACA();
            Orientation orientation$iv4 = r6.$orientationLock;
            r117 = r6.$overSlop;
            long initialPositionChange$iv = Offset.Companion.m4141getZeroF1C5BW0();
            if (DragGestureDetectorKt.m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getCurrentEvent(), pointerId$iv3) == false) goto L31;
            down4 = null;
            goto L80
        L31:
            touchSlop$iv4 = DragGestureDetectorKt.m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getViewConfiguration(), pointerType$iv2);
            pointer$iv5 = new Ref.LongRef();
            pointer$iv5.element = pointerId$iv3;
            touchSlopDetector$iv5 = new TouchSlopDetector(orientation$iv4, initialPositionChange$iv, null);
        L32:
            r6.L$0 = $this$drag_u2dVnAYq1g$iv2;
            r6.L$1 = down3;
            r6.L$2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
            r6.L$3 = r117;
            r6.L$4 = pointer$iv5;
            r6.L$5 = touchSlopDetector$iv5;
            r6.L$6 = null;
            r6.F$0 = touchSlop$iv4;
            r6.label = 3;
            Object r40 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2, null, r6, 1, null);
            if (r40 != r1) goto L35;
            return r1;
        L35:
            PointerInputChange down8 = down3;
            Object $result11 = r40;
        L36:
            PointerEvent event$iv2 = (PointerEvent) $result11;
            List<PointerInputChange> r41 = event$iv2.getChanges();
            int $i$f$fastFirstOrNull3 = 0;
            int r42 = r41.size();
            int index$iv$iv$iv3 = 0;
        L37:
            if (index$iv$iv$iv3 >= r42) goto L42;
            Object item$iv$iv$iv3 = r41.get(index$iv$iv$iv3);
            Object it$iv$iv5 = item$iv$iv$iv3;
            PointerInputChange it$iv3 = (PointerInputChange) it$iv$iv5;
            int index$iv$iv$iv4 = index$iv$iv$iv3;
            Object $result12 = $result5;
            List<PointerInputChange> r213 = r41;
            int $i$f$fastFirstOrNull4 = $i$f$fastFirstOrNull3;
            if (PointerId.m5571equalsimpl0(it$iv3.m5587getIdJ3iCeTQ(), pointer$iv5.element) == true) goto L43;
            index$iv$iv$iv3 = index$iv$iv$iv4 + 1;
            $result5 = $result12;
            $i$f$fastFirstOrNull3 = $i$f$fastFirstOrNull4;
            r41 = r213;
        L43:
            PointerInputChange r214 = (PointerInputChange) it$iv$iv5;
            if (r214 != null) goto L46;
            down3 = down8;
            $result5 = $result12;
            down4 = null;
            goto L80
        L46:
            down4 = r214;
            if (down4.isConsumed() == false) goto L50;
            down3 = down8;
            $result5 = $result12;
            down4 = null;
            goto L80
        L50:
            if (PointerEventKt.changedToUpIgnoreConsumed(down4) == false) goto L62;
            List<PointerInputChange> r43 = event$iv2.getChanges();
            int index$iv$iv$iv5 = 0;
            int r44 = r43.size();
        L52:
            if (index$iv$iv$iv5 >= r44) goto L57;
            Object item$iv$iv$iv4 = r43.get(index$iv$iv$iv5);
            Object it$iv$iv6 = item$iv$iv$iv4;
            PointerInputChange it$iv4 = (PointerInputChange) it$iv$iv6;
            if (it$iv4.getPressed() == true) goto L58;
            index$iv$iv$iv5 = index$iv$iv$iv5 + 1;
        L58:
            PointerInputChange otherDown$iv2 = (PointerInputChange) it$iv$iv6;
            if (otherDown$iv2 != null) goto L61;
            down3 = down8;
            $result5 = $result12;
            down4 = null;
            goto L80
        L61:
            pointer$iv5.element = otherDown$iv2.m5587getIdJ3iCeTQ();
            down3 = down8;
            $result5 = $result12;
            goto L32
        L57:
            it$iv$iv6 = null;
            goto L58
        L62:
            long over = touchSlopDetector$iv5.m521addPointerInputChangedBAh8RU(down4, touchSlop$iv4);
            if ((over & r18) == r17) goto L65;
            boolean r45 = true;
        L66:
            if (r45 == false) goto L72;
            down4.consume();
            r117.element = over;
            if (down4.isConsumed() == false) goto L70;
            down3 = down8;
            $result5 = $result12;
            goto L80
        L70:
            touchSlopDetector$iv5.reset();
            down3 = down8;
            $result5 = $result12;
            goto L32
        L72:
            r6.L$0 = $this$drag_u2dVnAYq1g$iv2;
            r6.L$1 = down8;
            r6.L$2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
            r6.L$3 = r117;
            r6.L$4 = pointer$iv5;
            r6.L$5 = touchSlopDetector$iv5;
            r6.L$6 = down4;
            r6.F$0 = touchSlop$iv4;
            r6.label = 4;
            if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.awaitPointerEvent(PointerEventPass.Final, r6) != r1) goto L75;
            return r1;
        L75:
            down3 = down8;
            $result5 = $result12;
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
            dragEvent$iv4 = down4;
            goto L77
        L65:
            r45 = false;
            goto L66
        L42:
            $result12 = $result5;
            it$iv$iv5 = null;
            goto L43
        L85:
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv;
            goto L32
        L11:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            $result11 = $result;
            float touchSlop$iv5 = this.F$0;
            TouchSlopDetector touchSlopDetector$iv6 = (TouchSlopDetector) this.L$5;
            Ref.LongRef pointer$iv6 = (Ref.LongRef) this.L$4;
            Ref.LongRef r118 = (Ref.LongRef) this.L$3;
            AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = (AwaitPointerEventScope) this.L$2;
            down8 = (PointerInputChange) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture7 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result11);
            touchSlopDetector$iv5 = touchSlopDetector$iv6;
            $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
            pointer$iv5 = pointer$iv6;
            r117 = r118;
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture7;
            $result5 = $result11;
            touchSlop$iv4 = touchSlop$iv5;
            r6 = this;
            goto L36
        L12:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            Object $result13 = $result;
            boolean awaitTouchSlop = this.Z$0;
            PointerInputChange initialDown = (PointerInputChange) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture8 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result13);
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture8;
            PointerInputChange initialDown2 = initialDown;
            boolean awaitTouchSlop2 = awaitTouchSlop;
            $result5 = $result13;
        L25:
            down3 = (PointerInputChange) $result13;
            this.$overSlop.element = Offset.Companion.m4141getZeroF1C5BW0();
            if (awaitTouchSlop2 == false) goto L86;
            r6 = this;
            goto L28
        L86:
            down4 = initialDown2;
            r6 = this;
            goto L88
        L13:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            Object $result14 = $result;
            AwaitPointerEventScope $this$awaitEachGesture9 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result14);
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture9;
            $result5 = $result14;
        L18:
            PointerInputChange initialDown3 = (PointerInputChange) $result14;
            boolean awaitTouchSlop3 = this.$shouldAwaitTouchSlop.invoke().booleanValue();
            if (awaitTouchSlop3 == true) goto L21;
            initialDown3.consume();
        L21:
            this.L$0 = $this$drag_u2dVnAYq1g$iv2;
            this.L$1 = initialDown3;
            this.Z$0 = awaitTouchSlop3;
            this.label = 2;
            Object r46 = TapGestureDetectorKt.awaitFirstDown$default($this$drag_u2dVnAYq1g$iv2, false, null, this, 2, null);
            if (r46 != r1) goto L24;
            return r1;
        L24:
            awaitTouchSlop2 = awaitTouchSlop3;
            $result13 = r46;
            initialDown2 = initialDown3;
            goto L25
        L14:
            r17 = InlineClassHelperKt.UnspecifiedPackedFloats;
            r18 = 9223372034707292159L;
            ResultKt.throwOnFailure($result);
            AwaitPointerEventScope $this$awaitEachGesture10 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture10;
            this.label = 1;
            Object r47 = TapGestureDetectorKt.awaitFirstDown($this$awaitEachGesture10, false, PointerEventPass.Initial, this);
            if (r47 != r1) goto L17;
            return r1;
        L17:
            $this$drag_u2dVnAYq1g$iv2 = $this$awaitEachGesture10;
            $result5 = $result;
            $result14 = r47;
            goto L18
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {354, 355, 360}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
    static final class C02375 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02375(Function1<? super Offset, Unit> r2, Function0<Unit> r3, Function0<Unit> r4, Function2<? super PointerInputChange, ? super Offset, Unit> r5, Continuation<? super C02375> r6) {
            this.$onDragStart = r2;
            this.$onDragEnd = r3;
            this.$onDragCancel = r4;
            this.$onDrag = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            C02375 r0 = new C02375(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, r8);
            r0.L$0 = r7;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C02375) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L15;
                case 1: goto L12;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L44
        L31:
            if (((Boolean) $result).booleanValue() == false) goto L39;
            List<PointerInputChange> r10 = $this$awaitEachGesture.getCurrentEvent().getChanges();     // Catch: CancellationException -> L42
            int index$iv = 0;
            int r3 = r10.size();     // Catch: CancellationException -> L42
        L33:
            if (index$iv >= r3) goto L38;
            Object item$iv = r10.get(index$iv);     // Catch: CancellationException -> L42
            PointerInputChange it = (PointerInputChange) item$iv;     // Catch: CancellationException -> L42
            if (PointerEventKt.changedToUp(it) == false) goto L37;
            it.consume();     // Catch: CancellationException -> L42
        L37:
            index$iv = index$iv + 1;     // Catch: CancellationException -> L42
            goto L33
        L38:
            this.$onDragEnd.invoke();     // Catch: CancellationException -> L42
        L41:
            return Unit.INSTANCE;
        L39:
            this.$onDragCancel.invoke();     // Catch: CancellationException -> L42
            goto L41
        L9:
            AwaitPointerEventScope $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L44
            AwaitPointerEventScope $this$awaitEachGesture3 = $this$awaitEachGesture2;
        L24:
            PointerInputChange drag = (PointerInputChange) $result;     // Catch: CancellationException -> L42
            if (drag == null) goto L41;
            this.$onDragStart.invoke(Offset.m4114boximpl(drag.m5589getPositionF1C5BW0()));     // Catch: CancellationException -> L42
            long r4 = drag.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L42
            final Function2<PointerInputChange, Offset, Unit> r6 = this.$onDrag;     // Catch: CancellationException -> L42
            this.L$0 = $this$awaitEachGesture3;     // Catch: CancellationException -> L42
            this.label = 3;     // Catch: CancellationException -> L42
            Object r5 = DragGestureDetectorKt.m432dragjO51t88($this$awaitEachGesture3, r4, new AnonymousClass1(r6), this);     // Catch: CancellationException -> L42
            if (r5 != r0) goto L29;
            return r0;
        L29:
            $this$awaitEachGesture = $this$awaitEachGesture3;
            $result = r5;
            goto L31
        L12:
            AwaitPointerEventScope $this$awaitEachGesture4 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L44
            $this$awaitEachGesture3 = $this$awaitEachGesture4;
        L48:
            PointerInputChange down = (PointerInputChange) $result;     // Catch: CancellationException -> L42
            this.L$0 = $this$awaitEachGesture3;     // Catch: CancellationException -> L42
            this.label = 2;     // Catch: CancellationException -> L42
            Object r7 = DragGestureDetectorKt.m422awaitLongPressOrCancellationrnUCldI($this$awaitEachGesture3, down.m5587getIdJ3iCeTQ(), this);     // Catch: CancellationException -> L42
            if (r7 != r0) goto L23;
            return r0;
        L23:
            $result = r7;
        L42:
            c = e;
        L45:
            this.$onDragCancel.invoke();
            throw c;
        L15:
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture3;     // Catch: CancellationException -> L44
            this.label = 1;     // Catch: CancellationException -> L44
            Object r1 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture3, false, null, this, 2, null);     // Catch: CancellationException -> L44
            if (r1 != r0) goto L19;
            return r0;
        L19:
            $result = r1;
            goto L48
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L44:
            c = e;
            goto L45
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {661, 664, 672}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    static final class C02415 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02415(Function1<? super Offset, Unit> r2, Function2<? super PointerInputChange, ? super Float, Unit> r3, Function0<Unit> r4, Function0<Unit> r5, Continuation<? super C02415> r6) {
            this.$onDragStart = r2;
            this.$onHorizontalDrag = r3;
            this.$onDragEnd = r4;
            this.$onDragCancel = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            C02415 r0 = new C02415(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, r8);
            r0.L$0 = r7;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C02415) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L22:
            if (((Boolean) $result).booleanValue() == false) goto L24;
            this.$onDragEnd.invoke();
        L26:
            return Unit.INSTANCE;
        L24:
            this.$onDragCancel.invoke();
            goto L26
        L7:
            Ref.FloatRef overSlop = (Ref.FloatRef) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            final Ref.FloatRef overSlop2 = overSlop;
        L16:
            PointerInputChange drag = (PointerInputChange) $result;
            if (drag == null) goto L26;
            this.$onDragStart.invoke(Offset.m4114boximpl(drag.m5589getPositionF1C5BW0()));
            this.$onHorizontalDrag.invoke(drag, Boxing.boxFloat(overSlop2.element));
            long r3 = drag.m5587getIdJ3iCeTQ();
            final Function2<PointerInputChange, Float, Unit> r6 = this.$onHorizontalDrag;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            $result = DragGestureDetectorKt.m433horizontalDragjO51t88($this$awaitEachGesture, r3, new AnonymousClass1(r6), this);
            if ($result != r0) goto L22;
            return r0;
        L8:
            AwaitPointerEventScope $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture = $this$awaitEachGesture2;
        L13:
            PointerInputChange down = (PointerInputChange) $result;
            overSlop2 = new Ref.FloatRef();
            this.L$0 = $this$awaitEachGesture;
            this.L$1 = overSlop2;
            this.label = 2;
            $result = DragGestureDetectorKt.m420awaitHorizontalPointerSlopOrCancellationgDDlDlE($this$awaitEachGesture, down.m5587getIdJ3iCeTQ(), down.m5592getTypeT8wyACA(), new DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1(overSlop2), this);
            if ($result != r0) goto L16;
            return r0;
        L9:
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture;
            this.label = 1;
            Object r1 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture, false, null, this, 2, null);
            if (r1 != r0) goto L12;
            return r0;
        L12:
            $result = r1;
            goto L13
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {510, InputDeviceCompat.SOURCE_DPAD, 521}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    static final class C02455 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02455(Function1<? super Offset, Unit> r2, Function2<? super PointerInputChange, ? super Float, Unit> r3, Function0<Unit> r4, Function0<Unit> r5, Continuation<? super C02455> r6) {
            this.$onDragStart = r2;
            this.$onVerticalDrag = r3;
            this.$onDragEnd = r4;
            this.$onDragCancel = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            C02455 r0 = new C02455(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, r8);
            r0.L$0 = r7;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C02455) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L22:
            if (((Boolean) $result).booleanValue() == false) goto L24;
            this.$onDragEnd.invoke();
        L26:
            return Unit.INSTANCE;
        L24:
            this.$onDragCancel.invoke();
            goto L26
        L7:
            Ref.FloatRef overSlop = (Ref.FloatRef) this.L$1;
            AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            final Ref.FloatRef overSlop2 = overSlop;
        L16:
            PointerInputChange drag = (PointerInputChange) $result;
            if (drag == null) goto L26;
            this.$onDragStart.invoke(Offset.m4114boximpl(drag.m5589getPositionF1C5BW0()));
            this.$onVerticalDrag.invoke(drag, Boxing.boxFloat(overSlop2.element));
            long r3 = drag.m5587getIdJ3iCeTQ();
            final Function2<PointerInputChange, Float, Unit> r6 = this.$onVerticalDrag;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            $result = DragGestureDetectorKt.m436verticalDragjO51t88($this$awaitEachGesture, r3, new AnonymousClass1(r6), this);
            if ($result != r0) goto L22;
            return r0;
        L8:
            AwaitPointerEventScope $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture = $this$awaitEachGesture2;
        L13:
            PointerInputChange down = (PointerInputChange) $result;
            overSlop2 = new Ref.FloatRef();
            this.L$0 = $this$awaitEachGesture;
            this.L$1 = overSlop2;
            this.label = 2;
            $result = DragGestureDetectorKt.m428awaitVerticalPointerSlopOrCancellationgDDlDlE($this$awaitEachGesture, down.m5587getIdJ3iCeTQ(), down.m5592getTypeT8wyACA(), new DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1(overSlop2), this);
            if ($result != r0) goto L16;
            return r0;
        L9:
            ResultKt.throwOnFailure($result);
            $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
            this.L$0 = $this$awaitEachGesture;
            this.label = 1;
            Object r1 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture, false, null, this, 2, null);
            if (r1 != r0) goto L12;
            return r0;
        L12:
            $result = r1;
            goto L13
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: access$isPointerUp-DmW0f2w, reason: not valid java name */
    public static final /* synthetic */ boolean m416access$isPointerUpDmW0f2w(PointerEvent $receiver, long pointerId) {
        return m434isPointerUpDmW0f2w($receiver, pointerId);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01c2 -> B:62:0x01c8). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final Object m426awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope r23, long pointerId, Function2<? super PointerInputChange, ? super Offset, Unit> r26, Continuation<? super PointerInputChange> r27) {
        if ((r27 instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 r1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop$iv = r1.F$0;
        PointerInputChange dragEvent$iv = (PointerInputChange) r1.L$4;
        TouchSlopDetector touchSlopDetector$iv = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Offset, Unit> r12 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv;
        float touchSlop$iv2 = touchSlop$iv;
        TouchSlopDetector touchSlopDetector$iv2 = touchSlopDetector$iv;
        Function2<? super PointerInputChange, ? super Offset, Unit> r9 = r12;
    L63:
        if (dragEvent$iv.isConsumed() == false) goto L66;
        return null;
    L66:
        r5 = 1;
        r6 = null;
    L18:
        r1.L$0 = r9;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = r6;
        r1.F$0 = touchSlop$iv2;
        r1.label = r5;
        Object r8 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2, r6, r1, r5, r6);
        if (r8 != r3) goto L21;
        return r3;
    L21:
        Object r22 = r3;
        Object $result2 = $result;
        $result = r8;
        float touchSlop$iv3 = touchSlop$iv2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        Object r4 = r22;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r11 = event$iv.getChanges();
        int r7 = r11.size();
        int index$iv$iv$iv = 0;
    L23:
        if (index$iv$iv$iv >= r7) goto L28;
        Object item$iv$iv$iv = r11.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        int r25 = r7;
        int index$iv$iv$iv2 = index$iv$iv$iv;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv2 + 1;
        $result2 = $result3;
        event$iv = event$iv2;
        r7 = r25;
    L29:
        PointerInputChange dragEvent$iv2 = (PointerInputChange) it$iv$iv;
        if (dragEvent$iv2 != null) goto L33;
        return null;
    L33:
        if (dragEvent$iv2.isConsumed() == false) goto L36;
        return null;
    L36:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv2) == false) goto L48;
        List<PointerInputChange> r2 = event$iv2.getChanges();
        int index$iv$iv$iv3 = 0;
        int r13 = r2.size();
    L38:
        if (index$iv$iv$iv3 >= r13) goto L43;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv3);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L44;
        index$iv$iv$iv3 = index$iv$iv$iv3 + 1;
    L44:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L74;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L74:
        return null;
    L43:
        it$iv$iv2 = null;
        goto L44
    L48:
        long postSlopOffset$iv = touchSlopDetector$iv2.m521addPointerInputChangedBAh8RU(dragEvent$iv2, touchSlop$iv3);
        if ((postSlopOffset$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L51;
        boolean r14 = true;
    L52:
        if (r14 == false) goto L58;
        r9.invoke(dragEvent$iv2, Offset.m4114boximpl(postSlopOffset$iv));
        if (dragEvent$iv2.isConsumed() == true) goto L75;
        touchSlopDetector$iv2.reset();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L75:
        return dragEvent$iv2;
    L58:
        PointerEventPass r10 = PointerEventPass.Final;
        r1.L$0 = r9;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = dragEvent$iv2;
        r1.F$0 = touchSlop$iv3;
        r1.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3.awaitPointerEvent(r10, r1) != r4) goto L61;
        return r4;
    L61:
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        touchSlop$iv2 = touchSlop$iv3;
        dragEvent$iv = dragEvent$iv2;
        $result = $result3;
        goto L63
    L51:
        r14 = false;
        goto L52
    L28:
        event$iv2 = event$iv;
        $result3 = $result2;
        it$iv$iv = null;
        goto L29
    L13:
        float touchSlop$iv4 = r1.F$0;
        TouchSlopDetector touchSlopDetector$iv3 = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv3 = (Ref.LongRef) r1.L$2;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Offset, Unit> r15 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        touchSlop$iv3 = touchSlop$iv4;
        touchSlopDetector$iv2 = touchSlopDetector$iv3;
        pointer$iv2 = pointer$iv3;
        r9 = r15;
        r4 = r3;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = r23;
        r9 = r26;
        int r16 = PointerType.Companion.m5667getTouchT8wyACA();
        long initialPositionChange$iv = Offset.Companion.m4141getZeroF1C5BW0();
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getCurrentEvent(), pointerId) == true) goto L76;
        touchSlop$iv2 = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getViewConfiguration(), r16);
        pointer$iv2 = new Ref.LongRef();
        pointer$iv2.element = pointerId;
        touchSlopDetector$iv2 = new TouchSlopDetector(null, initialPositionChange$iv, null);
        goto L18
    L76:
        return null;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(r27);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: drag-jO51t88, reason: not valid java name */
    public static final Object m432dragjO51t88(AwaitPointerEventScope $this$drag_u2djO51t88, long pointerId, Function1<? super PointerInputChange, Unit> r11, Continuation<? super Boolean> r12) {
        if ((r12 instanceof DragGestureDetectorKt$drag$1) == false) goto L7;
        DragGestureDetectorKt$drag$1 r0 = (DragGestureDetectorKt$drag$1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Function1<? super PointerInputChange, Unit> r8 = (Function1) r0.L$1;
        AwaitPointerEventScope $this$drag_u2djO51t89 = (AwaitPointerEventScope) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object $result2 = $result;
    L18:
        PointerInputChange change = (PointerInputChange) $result;
        if (change != null) goto L23;
        return Boxing.boxBoolean(false);
    L23:
        if (PointerEventKt.changedToUpIgnoreConsumed(change) == true) goto L25;
        r8.invoke(change);
        long pointer = change.m5587getIdJ3iCeTQ();
        $result = $result2;
    L14:
        r0.L$0 = $this$drag_u2djO51t89;
        r0.L$1 = r8;
        r0.label = 1;
        Object r10 = m417awaitDragOrCancellationrnUCldI($this$drag_u2djO51t89, pointer, r0);
        if (r10 != r2) goto L17;
        return r2;
    L17:
        Object r7 = $result;
        $result = r10;
        $result2 = r7;
        goto L18
    L25:
        return Boxing.boxBoolean(true);
    L13:
        ResultKt.throwOnFailure($result);
        pointer = pointerId;
        $this$drag_u2djO51t89 = $this$drag_u2djO51t88;
        r8 = r11;
        goto L14
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new DragGestureDetectorKt$drag$1(r12);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:21:0x0077). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final Object m417awaitDragOrCancellationrnUCldI(AwaitPointerEventScope $this$awaitDragOrCancellation_u2drnUCldI, long pointerId, Continuation<? super PointerInputChange> r24) {
        Continuation<? super PointerInputChange> r0 = r24;
        if ((r0 instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitDragOrCancellation$1 r1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$1;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv;
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope r7 = null;
        Object r4 = $result2;
        Object $result3 = $result;
    L21:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r10 = event$iv.getChanges();
        int index$iv$iv$iv = 0;
        int r14 = r10.size();
    L22:
        if (index$iv$iv$iv >= r14) goto L27;
        Object item$iv$iv$iv = r10.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        Continuation<? super PointerInputChange> r21 = r0;
        DragGestureDetectorKt$awaitDragOrCancellation$1 r22 = r1;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L28;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        r0 = r21;
        r1 = r22;
    L28:
        PointerInputChange change = (PointerInputChange) it$iv$iv;
        if (change != null) goto L32;
        change = null;
    L48:
        if (change != null) goto L50;
    L52:
        boolean r8 = false;
    L53:
        if (r8 == true) goto L62;
        return null;
    L62:
        return change;
    L50:
        if (change.isConsumed() == true) goto L52;
        r8 = true;
        goto L53
    L32:
        if (PointerEventKt.changedToUpIgnoreConsumed(change) == false) goto L45;
        List<PointerInputChange> r2 = event$iv.getChanges();
        int index$iv$iv$iv2 = 0;
        int r9 = r2.size();
    L34:
        if (index$iv$iv$iv2 >= r9) goto L39;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv2);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L40;
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
    L40:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L48;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
    L57:
        r0 = r21;
        r1 = r22;
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv3 = r7;
        Ref.LongRef pointer$iv3 = pointer$iv2;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitDragOrUp_u2djO51t88$iv2;
        r5 = 1;
        r6 = null;
    L17:
        r1.L$0 = $this$awaitDragOrUp_u2djO51t88$iv4;
        r1.L$1 = pointer$iv3;
        r1.label = r5;
        Object r11 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88$iv4, r6, r1, r5, r6);
        if (r11 != $result2) goto L20;
        return $result2;
    L20:
        Object r20 = $result2;
        $result3 = $result;
        $result = r11;
        $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv4;
        pointer$iv2 = pointer$iv3;
        r7 = $this$awaitDragOrUp_u2djO51t88$iv3;
        r4 = r20;
        goto L21
    L39:
        it$iv$iv2 = null;
        goto L40
    L45:
        if (PointerEventKt.positionChangedIgnoreConsumed(change) == false) goto L57;
    L27:
        r21 = r0;
        r22 = r1;
        it$iv$iv = null;
        goto L28
    L13:
        ResultKt.throwOnFailure($result);
        if (m434isPointerUpDmW0f2w($this$awaitDragOrCancellation_u2drnUCldI.getCurrentEvent(), pointerId) == false) goto L16;
        return null;
    L16:
        Ref.LongRef pointer$iv4 = new Ref.LongRef();
        pointer$iv4.element = pointerId;
        $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitDragOrCancellation_u2drnUCldI;
        $this$awaitDragOrUp_u2djO51t88$iv3 = null;
        pointer$iv3 = pointer$iv4;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(r0);
        goto L8
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope r0, AnonymousClass2 r1, AnonymousClass3 r2, AnonymousClass4 r3, Function2 r4, Continuation r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = AnonymousClass2.INSTANCE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = AnonymousClass3.INSTANCE;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r3 = AnonymousClass4.INSTANCE;
    L11:
        Function0 r8 = r3;
        Function1 r9 = r1;
        return detectDragGestures(r0, r9, r2, r8, r4, r5);
    }

    public static final Object detectDragGestures(PointerInputScope $this$detectDragGestures, final Function1<? super Offset, Unit> r10, final Function0<Unit> r11, Function0<Unit> r12, Function2<? super PointerInputChange, ? super Offset, Unit> r13, Continuation<? super Unit> r14) {
        Object r9 = detectDragGestures($this$detectDragGestures, new AnonymousClass5(r10), new AnonymousClass6(r11), r12, AnonymousClass7.INSTANCE, null, r13, r14);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope $this$detectDragGestures, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> r11, Function1<? super PointerInputChange, Unit> r12, Function0<Unit> r13, Function0<Boolean> r14, Orientation orientationLock, Function2<? super PointerInputChange, ? super Offset, Unit> r16, Continuation<? super Unit> r17) {
        Ref.LongRef overSlop = new Ref.LongRef();
        Object r1 = ForEachGestureKt.awaitEachGesture($this$detectDragGestures, new AnonymousClass9(r14, overSlop, orientationLock, r11, r16, r13, r12, null), r17);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r1;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope r0, C02342 r1, C02353 r2, C02364 r3, Function2 r4, Continuation r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = C02342.INSTANCE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = C02353.INSTANCE;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r3 = C02364.INSTANCE;
    L11:
        Function0 r8 = r3;
        Function1 r9 = r1;
        return detectDragGesturesAfterLongPress(r0, r9, r2, r8, r4, r5);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope $this$detectDragGesturesAfterLongPress, Function1<? super Offset, Unit> r7, Function0<Unit> r8, Function0<Unit> r9, Function2<? super PointerInputChange, ? super Offset, Unit> r10, Continuation<? super Unit> r11) {
        Object r12 = ForEachGestureKt.awaitEachGesture($this$detectDragGesturesAfterLongPress, new C02375(r7, r8, r9, r10, null), r11);
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r12;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01da -> B:62:0x01e0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final Object m429awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope r23, long pointerId, Function2<? super PointerInputChange, ? super Float, Unit> r26, Continuation<? super PointerInputChange> r27) {
        if ((r27 instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 r1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop$iv = r1.F$0;
        PointerInputChange dragEvent$iv = (PointerInputChange) r1.L$4;
        TouchSlopDetector touchSlopDetector$iv = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r12 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv;
        float touchSlop$iv2 = touchSlop$iv;
        TouchSlopDetector touchSlopDetector$iv2 = touchSlopDetector$iv;
        Function2<? super PointerInputChange, ? super Float, Unit> r9 = r12;
    L63:
        if (dragEvent$iv.isConsumed() == false) goto L66;
        return null;
    L66:
        r5 = 1;
        r6 = null;
    L18:
        r1.L$0 = r9;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = r6;
        r1.F$0 = touchSlop$iv2;
        r1.label = r5;
        Object r8 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2, r6, r1, r5, r6);
        if (r8 != r3) goto L21;
        return r3;
    L21:
        Object r22 = r3;
        Object $result2 = $result;
        $result = r8;
        float touchSlop$iv3 = touchSlop$iv2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        Object r4 = r22;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r11 = event$iv.getChanges();
        int r7 = r11.size();
        int index$iv$iv$iv = 0;
    L23:
        if (index$iv$iv$iv >= r7) goto L28;
        Object item$iv$iv$iv = r11.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        int r25 = r7;
        int index$iv$iv$iv2 = index$iv$iv$iv;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv2 + 1;
        $result2 = $result3;
        event$iv = event$iv2;
        r7 = r25;
    L29:
        PointerInputChange dragEvent$iv2 = (PointerInputChange) it$iv$iv;
        if (dragEvent$iv2 != null) goto L33;
        return null;
    L33:
        if (dragEvent$iv2.isConsumed() == false) goto L36;
        return null;
    L36:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv2) == false) goto L48;
        List<PointerInputChange> r2 = event$iv2.getChanges();
        int index$iv$iv$iv3 = 0;
        int r13 = r2.size();
    L38:
        if (index$iv$iv$iv3 >= r13) goto L43;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv3);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L44;
        index$iv$iv$iv3 = index$iv$iv$iv3 + 1;
    L44:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L74;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L74:
        return null;
    L43:
        it$iv$iv2 = null;
        goto L44
    L48:
        long postSlopOffset$iv = touchSlopDetector$iv2.m521addPointerInputChangedBAh8RU(dragEvent$iv2, touchSlop$iv3);
        if ((postSlopOffset$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L51;
        boolean r14 = true;
    L52:
        if (r14 == false) goto L58;
        long overSlop = postSlopOffset$iv & 4294967295L;
        int bits$iv$iv$iv = (int) overSlop;
        r9.invoke(dragEvent$iv2, Boxing.boxFloat(Float.intBitsToFloat(bits$iv$iv$iv)));
        if (dragEvent$iv2.isConsumed() == true) goto L75;
        touchSlopDetector$iv2.reset();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L75:
        return dragEvent$iv2;
    L58:
        PointerEventPass r10 = PointerEventPass.Final;
        r1.L$0 = r9;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = dragEvent$iv2;
        r1.F$0 = touchSlop$iv3;
        r1.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3.awaitPointerEvent(r10, r1) != r4) goto L61;
        return r4;
    L61:
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        touchSlop$iv2 = touchSlop$iv3;
        dragEvent$iv = dragEvent$iv2;
        $result = $result3;
        goto L63
    L51:
        r14 = false;
        goto L52
    L28:
        event$iv2 = event$iv;
        $result3 = $result2;
        it$iv$iv = null;
        goto L29
    L13:
        float touchSlop$iv4 = r1.F$0;
        TouchSlopDetector touchSlopDetector$iv3 = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv3 = (Ref.LongRef) r1.L$2;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r15 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        touchSlop$iv3 = touchSlop$iv4;
        touchSlopDetector$iv2 = touchSlopDetector$iv3;
        pointer$iv2 = pointer$iv3;
        r9 = r15;
        r4 = r3;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = r23;
        r9 = r26;
        int r16 = PointerType.Companion.m5667getTouchT8wyACA();
        Orientation r17 = Orientation.Vertical;
        long initialPositionChange$iv = Offset.Companion.m4141getZeroF1C5BW0();
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getCurrentEvent(), pointerId) == true) goto L76;
        touchSlop$iv2 = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getViewConfiguration(), r16);
        pointer$iv2 = new Ref.LongRef();
        pointer$iv2.element = pointerId;
        touchSlopDetector$iv2 = new TouchSlopDetector(r17, initialPositionChange$iv, null);
        goto L18
    L76:
        return null;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(r27);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01d3 -> B:62:0x01da). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final Object m428awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope r23, long pointerId, int pointerType, Function2<? super PointerInputChange, ? super Float, Unit> r27, Continuation<? super PointerInputChange> r28) {
        if ((r28 instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) r28;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop$iv = r1.F$0;
        PointerInputChange dragEvent$iv = (PointerInputChange) r1.L$4;
        TouchSlopDetector touchSlopDetector$iv = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r12 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv;
        float touchSlop$iv2 = touchSlop$iv;
        Function2<? super PointerInputChange, ? super Float, Unit> r7 = r12;
    L63:
        if (dragEvent$iv.isConsumed() == false) goto L66;
        return null;
    L66:
        TouchSlopDetector touchSlopDetector$iv2 = touchSlopDetector$iv;
        r5 = 1;
        r6 = null;
    L18:
        r1.L$0 = r7;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = r6;
        r1.F$0 = touchSlop$iv2;
        r1.label = r5;
        Object r9 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2, r6, r1, r5, r6);
        if (r9 != r3) goto L21;
        return r3;
    L21:
        Object r22 = r3;
        Object $result2 = $result;
        $result = r9;
        float touchSlop$iv3 = touchSlop$iv2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        Object r4 = r22;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r11 = event$iv.getChanges();
        int r8 = r11.size();
        int index$iv$iv$iv = 0;
    L23:
        if (index$iv$iv$iv >= r8) goto L28;
        Object item$iv$iv$iv = r11.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        int r25 = r8;
        int index$iv$iv$iv2 = index$iv$iv$iv;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv2 + 1;
        $result2 = $result3;
        event$iv = event$iv2;
        r8 = r25;
    L29:
        PointerInputChange dragEvent$iv2 = (PointerInputChange) it$iv$iv;
        if (dragEvent$iv2 != null) goto L33;
        return null;
    L33:
        if (dragEvent$iv2.isConsumed() == false) goto L36;
        return null;
    L36:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv2) == false) goto L48;
        List<PointerInputChange> r2 = event$iv2.getChanges();
        int index$iv$iv$iv3 = 0;
        int r13 = r2.size();
    L38:
        if (index$iv$iv$iv3 >= r13) goto L43;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv3);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L44;
        index$iv$iv$iv3 = index$iv$iv$iv3 + 1;
    L44:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L74;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L74:
        return null;
    L43:
        it$iv$iv2 = null;
        goto L44
    L48:
        long postSlopOffset$iv = touchSlopDetector$iv2.m521addPointerInputChangedBAh8RU(dragEvent$iv2, touchSlop$iv3);
        if ((postSlopOffset$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L51;
        boolean r14 = true;
    L52:
        if (r14 == false) goto L58;
        long overSlop = postSlopOffset$iv & 4294967295L;
        int bits$iv$iv$iv = (int) overSlop;
        r7.invoke(dragEvent$iv2, Boxing.boxFloat(Float.intBitsToFloat(bits$iv$iv$iv)));
        if (dragEvent$iv2.isConsumed() == true) goto L75;
        touchSlopDetector$iv2.reset();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L75:
        return dragEvent$iv2;
    L58:
        PointerEventPass r10 = PointerEventPass.Final;
        r1.L$0 = r7;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = dragEvent$iv2;
        r1.F$0 = touchSlop$iv3;
        r1.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3.awaitPointerEvent(r10, r1) != r4) goto L61;
        return r4;
    L61:
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        touchSlop$iv2 = touchSlop$iv3;
        touchSlopDetector$iv = touchSlopDetector$iv2;
        dragEvent$iv = dragEvent$iv2;
        $result = $result3;
        goto L63
    L51:
        r14 = false;
        goto L52
    L28:
        event$iv2 = event$iv;
        $result3 = $result2;
        it$iv$iv = null;
        goto L29
    L13:
        float touchSlop$iv4 = r1.F$0;
        touchSlopDetector$iv2 = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv3 = (Ref.LongRef) r1.L$2;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r15 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        pointer$iv2 = pointer$iv3;
        r4 = r3;
        touchSlop$iv3 = touchSlop$iv4;
        r7 = r15;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = r23;
        r7 = r27;
        Orientation r16 = Orientation.Vertical;
        long initialPositionChange$iv = Offset.Companion.m4141getZeroF1C5BW0();
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getCurrentEvent(), pointerId) == true) goto L76;
        touchSlop$iv2 = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getViewConfiguration(), pointerType);
        pointer$iv2 = new Ref.LongRef();
        pointer$iv2.element = pointerId;
        touchSlopDetector$iv2 = new TouchSlopDetector(r16, initialPositionChange$iv, null);
        goto L18
    L76:
        return null;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(r28);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0092 -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: verticalDrag-jO51t88, reason: not valid java name */
    public static final Object m436verticalDragjO51t88(AwaitPointerEventScope r25, long r26, Function1<? super PointerInputChange, Unit> r28, Continuation<? super Boolean> r29) {
        Continuation<? super Boolean> r0 = r29;
        if ((r0 instanceof DragGestureDetectorKt$verticalDrag$1) == false) goto L7;
        DragGestureDetectorKt$verticalDrag$1 r1 = (DragGestureDetectorKt$verticalDrag$1) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object r2 = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r6 = 1;
        PointerInputChange r7 = null;
        PointerEventPass r8 = null;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef r9 = (Ref.LongRef) r1.L$4;
        AwaitPointerEventScope r10 = (AwaitPointerEventScope) r1.L$3;
        Orientation r11 = (Orientation) r1.L$2;
        AwaitPointerEventScope r12 = (AwaitPointerEventScope) r1.L$1;
        Function1<? super PointerInputChange, Unit> r13 = (Function1) r1.L$0;
        ResultKt.throwOnFailure(r2);
        Function1<? super PointerInputChange, Unit> r14 = r13;
        AwaitPointerEventScope r15 = r12;
        Orientation r16 = r11;
        AwaitPointerEventScope r17 = r10;
        Ref.LongRef r18 = r9;
        Object[] r19 = 0;
        int r20 = 0;
        Object r4 = r3;
        Object r5 = r2;
    L22:
        PointerEvent r21 = (PointerEvent) r2;
        List<PointerInputChange> r110 = r21.getChanges();
        int r22 = r110.size();
        int r23 = 0;
    L23:
        if (r23 >= r22) goto L28;
        Object r24 = r110.get(r23);
        int r27 = r20;
        Continuation<? super Boolean> r210 = r0;
        DragGestureDetectorKt$verticalDrag$1 r211 = r1;
        if (PointerId.m5571equalsimpl0(((PointerInputChange) r24).m5587getIdJ3iCeTQ(), r18.element) == true) goto L29;
        r23 = r23 + 1;
        r20 = r27;
        r0 = r210;
        r1 = r211;
    L29:
        PointerInputChange r212 = (PointerInputChange) r24;
        if (r212 != null) goto L33;
        r212 = null;
    L57:
        if (r212 != null) goto L59;
        r7 = null;
    L65:
        if (r7 == null) goto L67;
        boolean r30 = true;
    L69:
        return Boxing.boxBoolean(r30);
    L67:
        r30 = false;
        goto L69
    L59:
        PointerInputChange r31 = r212;
        if (r31.isConsumed() == false) goto L63;
        r7 = null;
        goto L65
    L63:
        if (PointerEventKt.changedToUpIgnoreConsumed(r31) == false) goto L70;
        r7 = r31;
        goto L65
    L70:
        r14.invoke(r31);
        r2 = r5;
        r3 = r4;
        Orientation r111 = r16;
        AwaitPointerEventScope r32 = r15;
        Function1<? super PointerInputChange, Unit> r112 = r14;
        r6 = 1;
        r8 = null;
        int r113 = r27;
        long r114 = r31.m5587getIdJ3iCeTQ();
        r0 = r210;
        r1 = r211;
    L17:
        AwaitPointerEventScope r33 = r32;
        Ref.LongRef r115 = new Ref.LongRef();
        r115.element = r114;
        int r116 = r113;
        AwaitPointerEventScope r117 = r32;
        int r34 = r116;
        Function1<? super PointerInputChange, Unit> r118 = r112;
        AwaitPointerEventScope r119 = r33;
        Object[] r35 = 0;
        Ref.LongRef r36 = r115;
    L18:
        r1.L$0 = r118;
        r1.L$1 = r117;
        r1.L$2 = r111;
        r1.L$3 = r119;
        r1.L$4 = r36;
        r1.label = r6;
        Object r120 = AwaitPointerEventScope.awaitPointerEvent$default(r119, r8, r1, r6, r8);
        if (r120 != r3) goto L21;
        return r3;
    L21:
        Object r213 = r3;
        r5 = r2;
        r2 = r120;
        r14 = r118;
        r15 = r117;
        r16 = r111;
        r17 = r119;
        r18 = r36;
        r19 = r35;
        r20 = r34;
        r4 = r213;
        goto L22
    L33:
        if (PointerEventKt.changedToUpIgnoreConsumed(r212) == false) goto L45;
        List<PointerInputChange> r37 = r21.getChanges();
        int r38 = 0;
        int r39 = r37.size();
    L35:
        if (r38 >= r39) goto L40;
        Object r40 = r37.get(r38);
        if (((PointerInputChange) r40).getPressed() == true) goto L41;
        r38 = r38 + 1;
    L41:
        PointerInputChange r41 = (PointerInputChange) r40;
        if (r41 == null) goto L57;
        r18.element = r41.m5587getIdJ3iCeTQ();
    L71:
        r0 = r210;
        r1 = r211;
        r2 = r5;
        r3 = r4;
        r35 = r19;
        r36 = r18;
        r119 = r17;
        r111 = r16;
        r117 = r15;
        r118 = r14;
        r6 = 1;
        r8 = null;
        r34 = r27;
        goto L18
    L40:
        r40 = null;
        goto L41
    L45:
        long r42 = PointerEventKt.positionChangeIgnoreConsumed(r212);
        if (r16 != null) goto L49;
        float r43 = Offset.m4123getDistanceimpl(r42);
    L53:
        if (r43 != 0.0f) goto L55;
        boolean r44 = true;
    L56:
        if (r44 == true) goto L71;
    L55:
        r44 = false;
        goto L56
    L49:
        if (r16 != Orientation.Vertical) goto L51;
        r43 = Float.intBitsToFloat((int) (4294967295L & r42));
        goto L53
    L51:
        r43 = Float.intBitsToFloat((int) (r42 >> 32));
        goto L53
    L28:
        r210 = r0;
        r211 = r1;
        r27 = r20;
        r24 = null;
        goto L29
    L13:
        ResultKt.throwOnFailure(r2);
        r32 = r25;
        r112 = r28;
        r111 = Orientation.Vertical;
        r113 = 0;
        if (m416access$isPointerUpDmW0f2w(r32.getCurrentEvent(), r26) == true) goto L65;
        r114 = r26;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$verticalDrag$1(r0);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:21:0x0077). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final Object m427awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope $this$awaitVerticalDragOrCancellation_u2drnUCldI, long pointerId, Continuation<? super PointerInputChange> r24) {
        Continuation<? super PointerInputChange> r0 = r24;
        if ((r0 instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 r1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$1;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv;
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope r7 = null;
        Object r4 = $result2;
        Object $result3 = $result;
    L21:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r10 = event$iv.getChanges();
        int index$iv$iv$iv = 0;
        int r14 = r10.size();
    L22:
        if (index$iv$iv$iv >= r14) goto L27;
        Object item$iv$iv$iv = r10.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        Continuation<? super PointerInputChange> r21 = r0;
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 r22 = r1;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L28;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        r0 = r21;
        r1 = r22;
    L28:
        PointerInputChange change = (PointerInputChange) it$iv$iv;
        if (change != null) goto L32;
        change = null;
    L50:
        if (change != null) goto L52;
    L54:
        boolean r8 = false;
    L55:
        if (r8 == true) goto L64;
        return null;
    L64:
        return change;
    L52:
        if (change.isConsumed() == true) goto L54;
        r8 = true;
        goto L55
    L32:
        if (PointerEventKt.changedToUpIgnoreConsumed(change) == false) goto L44;
        List<PointerInputChange> r2 = event$iv.getChanges();
        int index$iv$iv$iv2 = 0;
        int r11 = r2.size();
    L34:
        if (index$iv$iv$iv2 >= r11) goto L39;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv2);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L40;
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
    L40:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L50;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
    L59:
        r0 = r21;
        r1 = r22;
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv3 = r7;
        Ref.LongRef pointer$iv3 = pointer$iv2;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitDragOrUp_u2djO51t88$iv2;
        r5 = 1;
        r6 = null;
    L17:
        r1.L$0 = $this$awaitDragOrUp_u2djO51t88$iv4;
        r1.L$1 = pointer$iv3;
        r1.label = r5;
        Object r9 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88$iv4, r6, r1, r5, r6);
        if (r9 != $result2) goto L20;
        return $result2;
    L20:
        Object r20 = $result2;
        $result3 = $result;
        $result = r9;
        $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv4;
        pointer$iv2 = pointer$iv3;
        r7 = $this$awaitDragOrUp_u2djO51t88$iv3;
        r4 = r20;
        goto L21
    L39:
        it$iv$iv2 = null;
        goto L40
    L44:
        long arg0$iv = PointerEventKt.positionChangeIgnoreConsumed(change);
        int bits$iv$iv$iv = (int) (4294967295L & arg0$iv);
        if (Float.intBitsToFloat(bits$iv$iv$iv) != 0.0f) goto L47;
        boolean r3 = true;
    L48:
        if (r3 == true) goto L59;
    L47:
        r3 = false;
        goto L48
    L27:
        r21 = r0;
        r22 = r1;
        it$iv$iv = null;
        goto L28
    L13:
        ResultKt.throwOnFailure($result);
        if (m434isPointerUpDmW0f2w($this$awaitVerticalDragOrCancellation_u2drnUCldI.getCurrentEvent(), pointerId) == false) goto L16;
        return null;
    L16:
        Ref.LongRef pointer$iv4 = new Ref.LongRef();
        pointer$iv4.element = pointerId;
        $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitVerticalDragOrCancellation_u2drnUCldI;
        $this$awaitDragOrUp_u2djO51t88$iv3 = null;
        pointer$iv3 = pointer$iv4;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(r0);
        goto L8
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope r0, C02422 r1, C02433 r2, C02444 r3, Function2 r4, Continuation r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = C02422.INSTANCE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = C02433.INSTANCE;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r3 = C02444.INSTANCE;
    L11:
        Function0 r8 = r3;
        Function1 r9 = r1;
        return detectVerticalDragGestures(r0, r9, r2, r8, r4, r5);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope $this$detectVerticalDragGestures, Function1<? super Offset, Unit> r7, Function0<Unit> r8, Function0<Unit> r9, Function2<? super PointerInputChange, ? super Float, Unit> r10, Continuation<? super Unit> r11) {
        Object r12 = ForEachGestureKt.awaitEachGesture($this$detectVerticalDragGestures, new C02455(r7, r10, r8, r9, null), r11);
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r12;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01d7 -> B:62:0x01dd). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final Object m421awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope r23, long pointerId, Function2<? super PointerInputChange, ? super Float, Unit> r26, Continuation<? super PointerInputChange> r27) {
        if ((r27 instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 r1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop$iv = r1.F$0;
        PointerInputChange dragEvent$iv = (PointerInputChange) r1.L$4;
        TouchSlopDetector touchSlopDetector$iv = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r12 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv;
        float touchSlop$iv2 = touchSlop$iv;
        TouchSlopDetector touchSlopDetector$iv2 = touchSlopDetector$iv;
        Function2<? super PointerInputChange, ? super Float, Unit> r9 = r12;
    L63:
        if (dragEvent$iv.isConsumed() == false) goto L66;
        return null;
    L66:
        r5 = 1;
        r6 = null;
    L18:
        r1.L$0 = r9;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = r6;
        r1.F$0 = touchSlop$iv2;
        r1.label = r5;
        Object r8 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2, r6, r1, r5, r6);
        if (r8 != r3) goto L21;
        return r3;
    L21:
        Object r22 = r3;
        Object $result2 = $result;
        $result = r8;
        float touchSlop$iv3 = touchSlop$iv2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        Object r4 = r22;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r11 = event$iv.getChanges();
        int r7 = r11.size();
        int index$iv$iv$iv = 0;
    L23:
        if (index$iv$iv$iv >= r7) goto L28;
        Object item$iv$iv$iv = r11.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        int r25 = r7;
        int index$iv$iv$iv2 = index$iv$iv$iv;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv2 + 1;
        $result2 = $result3;
        event$iv = event$iv2;
        r7 = r25;
    L29:
        PointerInputChange dragEvent$iv2 = (PointerInputChange) it$iv$iv;
        if (dragEvent$iv2 != null) goto L33;
        return null;
    L33:
        if (dragEvent$iv2.isConsumed() == false) goto L36;
        return null;
    L36:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv2) == false) goto L48;
        List<PointerInputChange> r2 = event$iv2.getChanges();
        int index$iv$iv$iv3 = 0;
        int r13 = r2.size();
    L38:
        if (index$iv$iv$iv3 >= r13) goto L43;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv3);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L44;
        index$iv$iv$iv3 = index$iv$iv$iv3 + 1;
    L44:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L74;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L74:
        return null;
    L43:
        it$iv$iv2 = null;
        goto L44
    L48:
        long postSlopOffset$iv = touchSlopDetector$iv2.m521addPointerInputChangedBAh8RU(dragEvent$iv2, touchSlop$iv3);
        if ((postSlopOffset$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L51;
        boolean r14 = true;
    L52:
        if (r14 == false) goto L58;
        long overSlop = postSlopOffset$iv >> 32;
        int bits$iv$iv$iv = (int) overSlop;
        r9.invoke(dragEvent$iv2, Boxing.boxFloat(Float.intBitsToFloat(bits$iv$iv$iv)));
        if (dragEvent$iv2.isConsumed() == true) goto L75;
        touchSlopDetector$iv2.reset();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L75:
        return dragEvent$iv2;
    L58:
        PointerEventPass r10 = PointerEventPass.Final;
        r1.L$0 = r9;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = dragEvent$iv2;
        r1.F$0 = touchSlop$iv3;
        r1.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3.awaitPointerEvent(r10, r1) != r4) goto L61;
        return r4;
    L61:
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        touchSlop$iv2 = touchSlop$iv3;
        dragEvent$iv = dragEvent$iv2;
        $result = $result3;
        goto L63
    L51:
        r14 = false;
        goto L52
    L28:
        event$iv2 = event$iv;
        $result3 = $result2;
        it$iv$iv = null;
        goto L29
    L13:
        float touchSlop$iv4 = r1.F$0;
        TouchSlopDetector touchSlopDetector$iv3 = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv3 = (Ref.LongRef) r1.L$2;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r15 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        touchSlop$iv3 = touchSlop$iv4;
        touchSlopDetector$iv2 = touchSlopDetector$iv3;
        pointer$iv2 = pointer$iv3;
        r9 = r15;
        r4 = r3;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = r23;
        r9 = r26;
        int r16 = PointerType.Companion.m5667getTouchT8wyACA();
        Orientation r17 = Orientation.Horizontal;
        long initialPositionChange$iv = Offset.Companion.m4141getZeroF1C5BW0();
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getCurrentEvent(), pointerId) == true) goto L76;
        touchSlop$iv2 = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getViewConfiguration(), r16);
        pointer$iv2 = new Ref.LongRef();
        pointer$iv2.element = pointerId;
        touchSlopDetector$iv2 = new TouchSlopDetector(r17, initialPositionChange$iv, null);
        goto L18
    L76:
        return null;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(r27);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01d0 -> B:62:0x01d7). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final Object m420awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope r23, long pointerId, int pointerType, Function2<? super PointerInputChange, ? super Float, Unit> r27, Continuation<? super PointerInputChange> r28) {
        if ((r28 instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) r28;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop$iv = r1.F$0;
        PointerInputChange dragEvent$iv = (PointerInputChange) r1.L$4;
        TouchSlopDetector touchSlopDetector$iv = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r12 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv;
        float touchSlop$iv2 = touchSlop$iv;
        Function2<? super PointerInputChange, ? super Float, Unit> r7 = r12;
    L63:
        if (dragEvent$iv.isConsumed() == false) goto L66;
        return null;
    L66:
        TouchSlopDetector touchSlopDetector$iv2 = touchSlopDetector$iv;
        r5 = 1;
        r6 = null;
    L18:
        r1.L$0 = r7;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = r6;
        r1.F$0 = touchSlop$iv2;
        r1.label = r5;
        Object r9 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2, r6, r1, r5, r6);
        if (r9 != r3) goto L21;
        return r3;
    L21:
        Object r22 = r3;
        Object $result2 = $result;
        $result = r9;
        float touchSlop$iv3 = touchSlop$iv2;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2;
        Object r4 = r22;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r11 = event$iv.getChanges();
        int r8 = r11.size();
        int index$iv$iv$iv = 0;
    L23:
        if (index$iv$iv$iv >= r8) goto L28;
        Object item$iv$iv$iv = r11.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        int r25 = r8;
        int index$iv$iv$iv2 = index$iv$iv$iv;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv2 + 1;
        $result2 = $result3;
        event$iv = event$iv2;
        r8 = r25;
    L29:
        PointerInputChange dragEvent$iv2 = (PointerInputChange) it$iv$iv;
        if (dragEvent$iv2 != null) goto L33;
        return null;
    L33:
        if (dragEvent$iv2.isConsumed() == false) goto L36;
        return null;
    L36:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent$iv2) == false) goto L48;
        List<PointerInputChange> r2 = event$iv2.getChanges();
        int index$iv$iv$iv3 = 0;
        int r13 = r2.size();
    L38:
        if (index$iv$iv$iv3 >= r13) goto L43;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv3);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L44;
        index$iv$iv$iv3 = index$iv$iv$iv3 + 1;
    L44:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L74;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L74:
        return null;
    L43:
        it$iv$iv2 = null;
        goto L44
    L48:
        long postSlopOffset$iv = touchSlopDetector$iv2.m521addPointerInputChangedBAh8RU(dragEvent$iv2, touchSlop$iv3);
        if ((postSlopOffset$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L51;
        boolean r14 = true;
    L52:
        if (r14 == false) goto L58;
        long overSlop = postSlopOffset$iv >> 32;
        int bits$iv$iv$iv = (int) overSlop;
        r7.invoke(dragEvent$iv2, Boxing.boxFloat(Float.intBitsToFloat(bits$iv$iv$iv)));
        if (dragEvent$iv2.isConsumed() == true) goto L75;
        touchSlopDetector$iv2.reset();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r5 = 1;
        r6 = null;
        touchSlop$iv2 = touchSlop$iv3;
        goto L18
    L75:
        return dragEvent$iv2;
    L58:
        PointerEventPass r10 = PointerEventPass.Final;
        r1.L$0 = r7;
        r1.L$1 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        r1.L$2 = pointer$iv2;
        r1.L$3 = touchSlopDetector$iv2;
        r1.L$4 = dragEvent$iv2;
        r1.F$0 = touchSlop$iv3;
        r1.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3.awaitPointerEvent(r10, r1) != r4) goto L61;
        return r4;
    L61:
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3;
        touchSlop$iv2 = touchSlop$iv3;
        touchSlopDetector$iv = touchSlopDetector$iv2;
        dragEvent$iv = dragEvent$iv2;
        $result = $result3;
        goto L63
    L51:
        r14 = false;
        goto L52
    L28:
        event$iv2 = event$iv;
        $result3 = $result2;
        it$iv$iv = null;
        goto L29
    L13:
        float touchSlop$iv4 = r1.F$0;
        touchSlopDetector$iv2 = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer$iv3 = (Ref.LongRef) r1.L$2;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv3 = (AwaitPointerEventScope) r1.L$1;
        Function2<? super PointerInputChange, ? super Float, Unit> r15 = (Function2) r1.L$0;
        ResultKt.throwOnFailure($result);
        pointer$iv2 = pointer$iv3;
        r4 = r3;
        touchSlop$iv3 = touchSlop$iv4;
        r7 = r15;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2 = r23;
        r7 = r27;
        Orientation r16 = Orientation.Horizontal;
        long initialPositionChange$iv = Offset.Companion.m4141getZeroF1C5BW0();
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getCurrentEvent(), pointerId) == true) goto L76;
        touchSlop$iv2 = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv2.getViewConfiguration(), pointerType);
        pointer$iv2 = new Ref.LongRef();
        pointer$iv2.element = pointerId;
        touchSlopDetector$iv2 = new TouchSlopDetector(r16, initialPositionChange$iv, null);
        goto L18
    L76:
        return null;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(r28);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0092 -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    public static final Object m433horizontalDragjO51t88(AwaitPointerEventScope r25, long r26, Function1<? super PointerInputChange, Unit> r28, Continuation<? super Boolean> r29) {
        Continuation<? super Boolean> r0 = r29;
        if ((r0 instanceof DragGestureDetectorKt$horizontalDrag$1) == false) goto L7;
        DragGestureDetectorKt$horizontalDrag$1 r1 = (DragGestureDetectorKt$horizontalDrag$1) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object r2 = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r6 = 1;
        PointerInputChange r7 = null;
        PointerEventPass r8 = null;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef r9 = (Ref.LongRef) r1.L$4;
        AwaitPointerEventScope r10 = (AwaitPointerEventScope) r1.L$3;
        Orientation r11 = (Orientation) r1.L$2;
        AwaitPointerEventScope r12 = (AwaitPointerEventScope) r1.L$1;
        Function1<? super PointerInputChange, Unit> r13 = (Function1) r1.L$0;
        ResultKt.throwOnFailure(r2);
        Function1<? super PointerInputChange, Unit> r14 = r13;
        AwaitPointerEventScope r15 = r12;
        Orientation r16 = r11;
        AwaitPointerEventScope r17 = r10;
        Ref.LongRef r18 = r9;
        Object[] r19 = 0;
        int r20 = 0;
        Object r4 = r3;
        Object r5 = r2;
    L22:
        PointerEvent r21 = (PointerEvent) r2;
        List<PointerInputChange> r110 = r21.getChanges();
        int r22 = r110.size();
        int r23 = 0;
    L23:
        if (r23 >= r22) goto L28;
        Object r24 = r110.get(r23);
        int r27 = r20;
        Continuation<? super Boolean> r210 = r0;
        DragGestureDetectorKt$horizontalDrag$1 r211 = r1;
        if (PointerId.m5571equalsimpl0(((PointerInputChange) r24).m5587getIdJ3iCeTQ(), r18.element) == true) goto L29;
        r23 = r23 + 1;
        r20 = r27;
        r0 = r210;
        r1 = r211;
    L29:
        PointerInputChange r212 = (PointerInputChange) r24;
        if (r212 != null) goto L33;
        r212 = null;
    L57:
        if (r212 != null) goto L59;
        r7 = null;
    L65:
        if (r7 == null) goto L67;
        boolean r30 = true;
    L69:
        return Boxing.boxBoolean(r30);
    L67:
        r30 = false;
        goto L69
    L59:
        PointerInputChange r31 = r212;
        if (r31.isConsumed() == false) goto L63;
        r7 = null;
        goto L65
    L63:
        if (PointerEventKt.changedToUpIgnoreConsumed(r31) == false) goto L70;
        r7 = r31;
        goto L65
    L70:
        r14.invoke(r31);
        r2 = r5;
        r3 = r4;
        Orientation r111 = r16;
        AwaitPointerEventScope r32 = r15;
        Function1<? super PointerInputChange, Unit> r112 = r14;
        r6 = 1;
        r8 = null;
        int r113 = r27;
        long r114 = r31.m5587getIdJ3iCeTQ();
        r0 = r210;
        r1 = r211;
    L17:
        AwaitPointerEventScope r33 = r32;
        Ref.LongRef r115 = new Ref.LongRef();
        r115.element = r114;
        int r116 = r113;
        AwaitPointerEventScope r117 = r32;
        int r34 = r116;
        Function1<? super PointerInputChange, Unit> r118 = r112;
        AwaitPointerEventScope r119 = r33;
        Object[] r35 = 0;
        Ref.LongRef r36 = r115;
    L18:
        r1.L$0 = r118;
        r1.L$1 = r117;
        r1.L$2 = r111;
        r1.L$3 = r119;
        r1.L$4 = r36;
        r1.label = r6;
        Object r120 = AwaitPointerEventScope.awaitPointerEvent$default(r119, r8, r1, r6, r8);
        if (r120 != r3) goto L21;
        return r3;
    L21:
        Object r213 = r3;
        r5 = r2;
        r2 = r120;
        r14 = r118;
        r15 = r117;
        r16 = r111;
        r17 = r119;
        r18 = r36;
        r19 = r35;
        r20 = r34;
        r4 = r213;
        goto L22
    L33:
        if (PointerEventKt.changedToUpIgnoreConsumed(r212) == false) goto L45;
        List<PointerInputChange> r37 = r21.getChanges();
        int r38 = 0;
        int r39 = r37.size();
    L35:
        if (r38 >= r39) goto L40;
        Object r40 = r37.get(r38);
        if (((PointerInputChange) r40).getPressed() == true) goto L41;
        r38 = r38 + 1;
    L41:
        PointerInputChange r41 = (PointerInputChange) r40;
        if (r41 == null) goto L57;
        r18.element = r41.m5587getIdJ3iCeTQ();
    L71:
        r0 = r210;
        r1 = r211;
        r2 = r5;
        r3 = r4;
        r35 = r19;
        r36 = r18;
        r119 = r17;
        r111 = r16;
        r117 = r15;
        r118 = r14;
        r6 = 1;
        r8 = null;
        r34 = r27;
        goto L18
    L40:
        r40 = null;
        goto L41
    L45:
        long r42 = PointerEventKt.positionChangeIgnoreConsumed(r212);
        if (r16 != null) goto L49;
        float r43 = Offset.m4123getDistanceimpl(r42);
    L53:
        if (r43 != 0.0f) goto L55;
        boolean r44 = true;
    L56:
        if (r44 == true) goto L71;
    L55:
        r44 = false;
        goto L56
    L49:
        if (r16 != Orientation.Vertical) goto L51;
        r43 = Float.intBitsToFloat((int) (4294967295L & r42));
        goto L53
    L51:
        r43 = Float.intBitsToFloat((int) (r42 >> 32));
        goto L53
    L28:
        r210 = r0;
        r211 = r1;
        r27 = r20;
        r24 = null;
        goto L29
    L13:
        ResultKt.throwOnFailure(r2);
        r32 = r25;
        r112 = r28;
        r111 = Orientation.Horizontal;
        r113 = 0;
        if (m416access$isPointerUpDmW0f2w(r32.getCurrentEvent(), r26) == true) goto L65;
        r114 = r26;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$horizontalDrag$1(r0);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:21:0x0077). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final Object m419awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope $this$awaitHorizontalDragOrCancellation_u2drnUCldI, long pointerId, Continuation<? super PointerInputChange> r24) {
        Continuation<? super PointerInputChange> r0 = r24;
        if ((r0 instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$1;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv;
        Ref.LongRef pointer$iv2 = pointer$iv;
        AwaitPointerEventScope r7 = null;
        Object r4 = $result2;
        Object $result3 = $result;
    L21:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r10 = event$iv.getChanges();
        int index$iv$iv$iv = 0;
        int r14 = r10.size();
    L22:
        if (index$iv$iv$iv >= r14) goto L27;
        Object item$iv$iv$iv = r10.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        Continuation<? super PointerInputChange> r21 = r0;
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r22 = r1;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L28;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        r0 = r21;
        r1 = r22;
    L28:
        PointerInputChange change = (PointerInputChange) it$iv$iv;
        if (change != null) goto L32;
        change = null;
    L50:
        if (change != null) goto L52;
    L54:
        boolean r8 = false;
    L55:
        if (r8 == true) goto L64;
        return null;
    L64:
        return change;
    L52:
        if (change.isConsumed() == true) goto L54;
        r8 = true;
        goto L55
    L32:
        if (PointerEventKt.changedToUpIgnoreConsumed(change) == false) goto L44;
        List<PointerInputChange> r2 = event$iv.getChanges();
        int index$iv$iv$iv2 = 0;
        int r11 = r2.size();
    L34:
        if (index$iv$iv$iv2 >= r11) goto L39;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv2);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L40;
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
    L40:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L50;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
    L59:
        r0 = r21;
        r1 = r22;
        $result = $result3;
        $result2 = r4;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv3 = r7;
        Ref.LongRef pointer$iv3 = pointer$iv2;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitDragOrUp_u2djO51t88$iv2;
        r5 = 1;
        r6 = null;
    L17:
        r1.L$0 = $this$awaitDragOrUp_u2djO51t88$iv4;
        r1.L$1 = pointer$iv3;
        r1.label = r5;
        Object r9 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88$iv4, r6, r1, r5, r6);
        if (r9 != $result2) goto L20;
        return $result2;
    L20:
        Object r20 = $result2;
        $result3 = $result;
        $result = r9;
        $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv4;
        pointer$iv2 = pointer$iv3;
        r7 = $this$awaitDragOrUp_u2djO51t88$iv3;
        r4 = r20;
        goto L21
    L39:
        it$iv$iv2 = null;
        goto L40
    L44:
        long arg0$iv = PointerEventKt.positionChangeIgnoreConsumed(change);
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) != 0.0f) goto L47;
        boolean r3 = true;
    L48:
        if (r3 == true) goto L59;
    L47:
        r3 = false;
        goto L48
    L27:
        r21 = r0;
        r22 = r1;
        it$iv$iv = null;
        goto L28
    L13:
        ResultKt.throwOnFailure($result);
        if (m434isPointerUpDmW0f2w($this$awaitHorizontalDragOrCancellation_u2drnUCldI.getCurrentEvent(), pointerId) == false) goto L16;
        return null;
    L16:
        Ref.LongRef pointer$iv4 = new Ref.LongRef();
        pointer$iv4.element = pointerId;
        $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitHorizontalDragOrCancellation_u2drnUCldI;
        $this$awaitDragOrUp_u2djO51t88$iv3 = null;
        pointer$iv3 = pointer$iv4;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(r0);
        goto L8
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope r0, C02382 r1, C02393 r2, C02404 r3, Function2 r4, Continuation r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = C02382.INSTANCE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = C02393.INSTANCE;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r3 = C02404.INSTANCE;
    L11:
        Function0 r8 = r3;
        Function1 r9 = r1;
        return detectHorizontalDragGestures(r0, r9, r2, r8, r4, r5);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope $this$detectHorizontalDragGestures, Function1<? super Offset, Unit> r7, Function0<Unit> r8, Function0<Unit> r9, Function2<? super PointerInputChange, ? super Float, Unit> r10, Continuation<? super Unit> r11) {
        Object r12 = ForEachGestureKt.awaitEachGesture($this$detectHorizontalDragGestures, new C02415(r7, r10, r8, r9, null), r11);
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r12;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v2, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009b -> B:22:0x00a9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: drag-VnAYq1g, reason: not valid java name */
    public static final Object m430dragVnAYq1g(AwaitPointerEventScope r25, long pointerId, Function1<? super PointerInputChange, Unit> r28, Orientation r29, Function1<? super PointerInputChange, Boolean> r30, Continuation<? super PointerInputChange> r31) {
        Continuation<? super PointerInputChange> r0 = r31;
        if ((r0 instanceof DragGestureDetectorKt$drag$2) == false) goto L7;
        DragGestureDetectorKt$drag$2 r1 = (DragGestureDetectorKt$drag$2) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef pointer$iv = (Ref.LongRef) r1.L$5;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv = (AwaitPointerEventScope) r1.L$4;
        Function1<? super PointerInputChange, Boolean> r10 = (Function1) r1.L$3;
        Orientation orientation = (Orientation) r1.L$2;
        Function1<? super PointerInputChange, Unit> r12 = (Function1) r1.L$1;
        AwaitPointerEventScope $this$drag_u2dVnAYq1g = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$drag_u2dVnAYq1g2 = $this$drag_u2dVnAYq1g;
        Function1<? super PointerInputChange, Unit> r13 = r12;
        Orientation orientation2 = orientation;
        Function1<? super PointerInputChange, Boolean> r11 = r10;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv;
        Ref.LongRef pointer$iv2 = pointer$iv;
        int r8 = 0;
        int r7 = 0;
        Object r4 = r3;
        Object $result2 = $result;
    L22:
        PointerEvent event$iv = (PointerEvent) $result;
        List<PointerInputChange> r15 = event$iv.getChanges();
        int r9 = r15.size();
        PointerEventPass r19 = r6;
        int index$iv$iv$iv = 0;
    L23:
        if (index$iv$iv$iv >= r9) goto L28;
        Object item$iv$iv$iv = r15.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        Continuation<? super PointerInputChange> r26 = r0;
        DragGestureDetectorKt$drag$2 r27 = r1;
        PointerEvent event$iv2 = event$iv;
        Object $result3 = $result2;
        if (PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv2.element) == true) goto L29;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        r0 = r26;
        r1 = r27;
        $result2 = $result3;
        event$iv = event$iv2;
    L29:
        ?? r20 = (PointerInputChange) it$iv$iv;
        if (r20 != 0) goto L33;
        r20 = r19;
    L57:
        if (r20 != 0) goto L59;
        return r19;
    L59:
        ?? r2 = r20;
        if (r11.invoke(r2).booleanValue() == false) goto L63;
        return r19;
    L63:
        if (PointerEventKt.changedToUpIgnoreConsumed(r2) == false) goto L65;
        return r2;
    L65:
        r13.invoke(r2);
        Orientation r14 = orientation2;
        int r16 = r7;
        Orientation orientation3 = r14;
        $result = $result3;
        r3 = r4;
        Function1<? super PointerInputChange, Unit> r17 = r13;
        AwaitPointerEventScope $this$drag_u2dVnAYq1g3 = $this$drag_u2dVnAYq1g2;
        r6 = r19;
        r5 = 1;
        long pointer = r2.m5587getIdJ3iCeTQ();
        r0 = r26;
        r1 = r27;
    L17:
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv3 = $this$drag_u2dVnAYq1g3;
        Ref.LongRef pointer$iv3 = new Ref.LongRef();
        pointer$iv3.element = pointer;
        AwaitPointerEventScope $this$drag_u2dVnAYq1g4 = $this$drag_u2dVnAYq1g3;
        int r18 = r16;
        Function1<? super PointerInputChange, Unit> r110 = r17;
        Function1<? super PointerInputChange, Boolean> r111 = r11;
        Orientation orientation4 = orientation3;
        int r21 = 0;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitDragOrUp_u2djO51t88$iv3;
        Ref.LongRef pointer$iv4 = pointer$iv3;
    L18:
        r1.L$0 = $this$drag_u2dVnAYq1g4;
        r1.L$1 = r110;
        r1.L$2 = orientation4;
        r1.L$3 = r111;
        r1.L$4 = $this$awaitDragOrUp_u2djO51t88$iv4;
        r1.L$5 = pointer$iv4;
        r1.label = r5;
        Object r112 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88$iv4, r6, r1, r5, r6);
        if (r112 != r3) goto L21;
        return r3;
    L21:
        Object r24 = r3;
        $result2 = $result;
        $result = r112;
        $this$drag_u2dVnAYq1g2 = $this$drag_u2dVnAYq1g4;
        r13 = r110;
        orientation2 = orientation4;
        r11 = r111;
        $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv4;
        pointer$iv2 = pointer$iv4;
        r8 = r21;
        r7 = r18;
        r4 = r24;
        goto L22
    L33:
        if (PointerEventKt.changedToUpIgnoreConsumed(r20) == false) goto L45;
        List<PointerInputChange> r22 = event$iv2.getChanges();
        int index$iv$iv$iv2 = 0;
        int r23 = r22.size();
    L35:
        if (index$iv$iv$iv2 >= r23) goto L40;
        Object item$iv$iv$iv2 = r22.get(index$iv$iv$iv2);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (it$iv2.getPressed() == true) goto L41;
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
    L41:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L57;
        pointer$iv2.element = otherDown$iv.m5587getIdJ3iCeTQ();
    L66:
        r0 = r26;
        r1 = r27;
        $result = $result3;
        r3 = r4;
        r18 = r7;
        r21 = r8;
        pointer$iv4 = pointer$iv2;
        $this$awaitDragOrUp_u2djO51t88$iv4 = $this$awaitDragOrUp_u2djO51t88$iv2;
        r111 = r11;
        orientation4 = orientation2;
        r110 = r13;
        $this$drag_u2dVnAYq1g4 = $this$drag_u2dVnAYq1g2;
        r6 = r19;
        r5 = 1;
        goto L18
    L40:
        it$iv$iv2 = r19;
        goto L41
    L45:
        long value$iv$iv = PointerEventKt.positionChangeIgnoreConsumed(r20);
        if (orientation2 != null) goto L49;
        float motionChange = Offset.m4123getDistanceimpl(value$iv$iv);
    L53:
        if (motionChange != 0.0f) goto L55;
        boolean r32 = true;
    L56:
        if (r32 == true) goto L66;
    L55:
        r32 = false;
        goto L56
    L49:
        if (orientation2 != Orientation.Vertical) goto L51;
        int bits$iv$iv$iv = (int) (value$iv$iv & 4294967295L);
        motionChange = Float.intBitsToFloat(bits$iv$iv$iv);
        goto L53
    L51:
        int bits$iv$iv$iv2 = (int) (value$iv$iv >> 32);
        motionChange = Float.intBitsToFloat(bits$iv$iv$iv2);
        goto L53
    L28:
        r26 = r0;
        r27 = r1;
        event$iv2 = event$iv;
        $result3 = $result2;
        it$iv$iv = r19;
        goto L29
    L13:
        ResultKt.throwOnFailure($result);
        $this$drag_u2dVnAYq1g3 = r25;
        orientation3 = r29;
        r17 = r28;
        r11 = r30;
        r16 = 0;
        if (m416access$isPointerUpDmW0f2w($this$drag_u2dVnAYq1g3.getCurrentEvent(), pointerId) == false) goto L16;
        return null;
    L16:
        pointer = pointerId;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$drag$2(r0);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v2, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX INFO: renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m431dragVnAYq1g$$forInline(AwaitPointerEventScope $this$drag_u2dVnAYq1g, long pointerId, Function1<? super PointerInputChange, Unit> r29, Orientation orientation, Function1<? super PointerInputChange, Boolean> r31, Continuation<? super PointerInputChange> r32) {
        int r1 = 0;
        PointerEventPass r5 = null;
        if (m416access$isPointerUpDmW0f2w($this$drag_u2dVnAYq1g.getCurrentEvent(), pointerId) == false) goto L5;
        return null;
    L5:
        long pointer = pointerId;
    L6:
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv = $this$drag_u2dVnAYq1g;
        Ref.LongRef pointer$iv = new Ref.LongRef();
        pointer$iv.element = pointer;
    L7:
        PointerEvent event$iv = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88$iv, r5, r32, 1, r5);
        List<PointerInputChange> r13 = event$iv.getChanges();
        PointerEventPass r19 = r5;
        int r6 = r13.size();
        int index$iv$iv$iv = 0;
    L8:
        if (index$iv$iv$iv >= r6) goto L13;
        Object item$iv$iv$iv = r13.get(index$iv$iv$iv);
        Object it$iv$iv = item$iv$iv$iv;
        PointerInputChange it$iv = (PointerInputChange) it$iv$iv;
        int r24 = r1;
        AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv;
        if (Boolean.valueOf(PointerId.m5571equalsimpl0(it$iv.m5587getIdJ3iCeTQ(), pointer$iv.element)).booleanValue() == true) goto L14;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        r1 = r24;
        $this$awaitDragOrUp_u2djO51t88$iv = $this$awaitDragOrUp_u2djO51t88$iv2;
    L14:
        ?? r20 = (PointerInputChange) it$iv$iv;
        if (r20 == 0) goto L44;
        if (PointerEventKt.changedToUpIgnoreConsumed(r20) == false) goto L29;
        List<PointerInputChange> r2 = event$iv.getChanges();
        int index$iv$iv$iv2 = 0;
        int r10 = r2.size();
    L19:
        if (index$iv$iv$iv2 >= r10) goto L24;
        Object item$iv$iv$iv2 = r2.get(index$iv$iv$iv2);
        Object it$iv$iv2 = item$iv$iv$iv2;
        PointerInputChange it$iv2 = (PointerInputChange) it$iv$iv2;
        if (Boolean.valueOf(it$iv2.getPressed()).booleanValue() == true) goto L25;
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
    L25:
        PointerInputChange otherDown$iv = (PointerInputChange) it$iv$iv2;
        if (otherDown$iv == null) goto L45;
        pointer$iv.element = otherDown$iv.m5587getIdJ3iCeTQ();
    L43:
        orientation = orientation;
        r5 = r19;
        r1 = r24;
        $this$awaitDragOrUp_u2djO51t88$iv = $this$awaitDragOrUp_u2djO51t88$iv2;
    L45:
        PointerInputChange r0 = (PointerInputChange) r20;
        if (r20 == 0) goto L55;
        ?? r3 = r20;
        if (r31.invoke(r3).booleanValue() == true) goto L49;
        if (PointerEventKt.changedToUpIgnoreConsumed(r3) == true) goto L52;
        r29.invoke(r3);
        pointer = r3.m5587getIdJ3iCeTQ();
        r5 = r19;
        r1 = r24;
        goto L6
    L52:
        return r3;
    L49:
        return r19;
    L55:
        return r19;
    L24:
        it$iv$iv2 = r19;
        goto L25
    L29:
        PointerInputChange it = (PointerInputChange) r20;
        long positionChange = PointerEventKt.positionChangeIgnoreConsumed(it);
        if (orientation != null) goto L33;
        float motionChange = Offset.m4123getDistanceimpl(positionChange);
    L37:
        if (motionChange != 0.0f) goto L39;
        boolean r4 = true;
    L41:
        if (Boolean.valueOf(!r4).booleanValue() == false) goto L43;
    L39:
        r4 = false;
        goto L41
    L33:
        if (orientation != Orientation.Vertical) goto L35;
        int bits$iv$iv$iv = (int) (positionChange & 4294967295L);
        motionChange = Float.intBitsToFloat(bits$iv$iv$iv);
        goto L37
    L35:
        int bits$iv$iv$iv2 = (int) (positionChange >> 32);
        motionChange = Float.intBitsToFloat(bits$iv$iv$iv2);
        goto L37
    L44:
        r20 = r19;
        goto L45
    L13:
        r24 = r1;
        $this$awaitDragOrUp_u2djO51t88$iv2 = $this$awaitDragOrUp_u2djO51t88$iv;
        it$iv$iv = r19;
        goto L14
    }

    /* JADX INFO: renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m418awaitDragOrUpjO51t88(AwaitPointerEventScope $this$awaitDragOrUp_u2djO51t88, long pointerId, Function1<? super PointerInputChange, Boolean> r24, Continuation<? super PointerInputChange> r25) {
        Ref.LongRef pointer = new Ref.LongRef();
        pointer.element = pointerId;
    L3:
        Object r4 = null;
        PointerEvent event = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default($this$awaitDragOrUp_u2djO51t88, null, r25, 1, null);
        List<PointerInputChange> r8 = event.getChanges();
        int index$iv$iv = 0;
        int r13 = r8.size();
    L4:
        if (index$iv$iv >= r13) goto L9;
        Object it$iv = r8.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) it$iv;
        Object r19 = r4;
        PointerEvent event2 = event;
        if (Boolean.valueOf(PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointer.element)).booleanValue() == true) goto L10;
        index$iv$iv = index$iv$iv + 1;
        r4 = r19;
        event = event2;
    L10:
        PointerInputChange dragEvent = (PointerInputChange) it$iv;
        if (dragEvent == null) goto L30;
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent) == false) goto L26;
        List<PointerInputChange> r2 = event2.getChanges();
        int index$iv$iv2 = 0;
        int r9 = r2.size();
    L15:
        if (index$iv$iv2 >= r9) goto L20;
        Object item$iv$iv = r2.get(index$iv$iv2);
        PointerInputChange it2 = (PointerInputChange) item$iv$iv;
        if (Boolean.valueOf(it2.getPressed()).booleanValue() == true) goto L18;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L15
    L18:
        Object r5 = item$iv$iv;
    L21:
        PointerInputChange otherDown = (PointerInputChange) r5;
        if (otherDown == null) goto L23;
        pointer.element = otherDown.m5587getIdJ3iCeTQ();
        goto L3
    L23:
        return dragEvent;
    L20:
        r5 = r19;
        goto L21
    L26:
        if (r24.invoke(dragEvent).booleanValue() == false) goto L3;
        return dragEvent;
    L30:
        return r19;
    L9:
        r19 = r4;
        event2 = event;
        it$iv = r19;
        goto L10
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01ab -> B:62:0x01b2). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    public static final Object m423awaitPointerSlopOrCancellation6ksA65w(AwaitPointerEventScope r23, long pointerId, int pointerType, Orientation orientation, long initialPositionChange, Function2<? super PointerInputChange, ? super Offset, Unit> r30, Continuation<? super PointerInputChange> r31) {
        if ((r31 instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) r31;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r5 = 1;
        PointerEventPass r6 = null;
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop = r1.F$0;
        PointerInputChange dragEvent = (PointerInputChange) r1.L$4;
        TouchSlopDetector touchSlopDetector = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer = (Ref.LongRef) r1.L$2;
        Function2<? super PointerInputChange, ? super Offset, Unit> r11 = (Function2) r1.L$1;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        PointerEventPass r17 = null;
        Ref.LongRef pointer2 = pointer;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w;
        float touchSlop2 = touchSlop;
    L63:
        if (dragEvent.isConsumed() == false) goto L65;
        return r17;
    L65:
        TouchSlopDetector touchSlopDetector2 = touchSlopDetector;
        r6 = r17;
        r5 = 1;
    L18:
        r1.L$0 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w2;
        r1.L$1 = r11;
        r1.L$2 = pointer2;
        r1.L$3 = touchSlopDetector2;
        r1.L$4 = r6;
        r1.F$0 = touchSlop2;
        r1.label = r5;
        Object r7 = AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w2, r6, r1, r5, r6);
        if (r7 != r3) goto L21;
        return r3;
    L21:
        Object r22 = r3;
        Object $result2 = $result;
        $result = r7;
        Function2<? super PointerInputChange, ? super Offset, Unit> r8 = r11;
        AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w3 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w2;
        Object r4 = r22;
    L22:
        PointerEvent event = (PointerEvent) $result;
        List<PointerInputChange> r9 = event.getChanges();
        int r10 = r9.size();
        r17 = r6;
        int index$iv$iv = 0;
    L23:
        if (index$iv$iv >= r10) goto L28;
        Object item$iv$iv = r9.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        PointerInputChange it = (PointerInputChange) it$iv;
        PointerEvent event2 = event;
        Object $result3 = $result2;
        int r25 = r10;
        int index$iv$iv2 = index$iv$iv;
        if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointer2.element) == true) goto L29;
        index$iv$iv = index$iv$iv2 + 1;
        $result2 = $result3;
        event = event2;
        r10 = r25;
    L29:
        PointerInputChange dragEvent2 = (PointerInputChange) it$iv;
        if (dragEvent2 != null) goto L33;
        return r17;
    L33:
        if (dragEvent2.isConsumed() == false) goto L36;
        return r17;
    L36:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent2) == false) goto L48;
        List<PointerInputChange> r2 = event2.getChanges();
        int index$iv$iv3 = 0;
        int r12 = r2.size();
    L38:
        if (index$iv$iv3 >= r12) goto L43;
        Object item$iv$iv2 = r2.get(index$iv$iv3);
        Object it$iv2 = item$iv$iv2;
        PointerInputChange it2 = (PointerInputChange) it$iv2;
        if (it2.getPressed() == true) goto L44;
        index$iv$iv3 = index$iv$iv3 + 1;
    L44:
        PointerInputChange otherDown = (PointerInputChange) it$iv2;
        if (otherDown != null) goto L47;
        return r17;
    L47:
        pointer2.element = otherDown.m5587getIdJ3iCeTQ();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w3;
        r6 = r17;
        r5 = 1;
        r11 = r8;
        goto L18
    L43:
        it$iv2 = r17;
        goto L44
    L48:
        long postSlopOffset = touchSlopDetector2.m521addPointerInputChangedBAh8RU(dragEvent2, touchSlop2);
        if ((postSlopOffset & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L51;
        boolean r13 = true;
    L52:
        if (r13 == false) goto L58;
        r8.invoke(dragEvent2, Offset.m4114boximpl(postSlopOffset));
        if (dragEvent2.isConsumed() == false) goto L56;
        return dragEvent2;
    L56:
        touchSlopDetector2.reset();
        $result = $result3;
        r3 = r4;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w3;
        r6 = r17;
        r5 = 1;
        r11 = r8;
        goto L18
    L58:
        PointerEventPass r14 = PointerEventPass.Final;
        r1.L$0 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w3;
        r1.L$1 = r8;
        r1.L$2 = pointer2;
        r1.L$3 = touchSlopDetector2;
        r1.L$4 = dragEvent2;
        r1.F$0 = touchSlop2;
        r1.label = 2;
        if ($this$awaitPointerSlopOrCancellation_u2d6ksA65w3.awaitPointerEvent(r14, r1) != r4) goto L61;
        return r4;
    L61:
        r3 = r4;
        touchSlopDetector = touchSlopDetector2;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w2 = $this$awaitPointerSlopOrCancellation_u2d6ksA65w3;
        dragEvent = dragEvent2;
        r11 = r8;
        $result = $result3;
        goto L63
    L51:
        r13 = false;
        goto L52
    L28:
        event2 = event;
        $result3 = $result2;
        it$iv = r17;
        goto L29
    L13:
        float touchSlop3 = r1.F$0;
        touchSlopDetector2 = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer3 = (Ref.LongRef) r1.L$2;
        Function2<? super PointerInputChange, ? super Offset, Unit> r15 = (Function2) r1.L$1;
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w3 = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        touchSlop2 = touchSlop3;
        r8 = r15;
        pointer2 = pointer3;
        r4 = r3;
        $result2 = $result;
        goto L22
    L14:
        ResultKt.throwOnFailure($result);
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w2 = r23;
        r11 = r30;
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w2.getCurrentEvent(), pointerId) == false) goto L17;
        return null;
    L17:
        touchSlop2 = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w2.getViewConfiguration(), pointerType);
        pointer2 = new Ref.LongRef();
        pointer2.element = pointerId;
        touchSlopDetector2 = new TouchSlopDetector(orientation, initialPositionChange, null);
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(r31);
        goto L8
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m425awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default, long pointerId, int pointerType, Orientation orientation, long initialPositionChange, Function2 onPointerSlopReached, Continuation $completion, int r34, Object r35) {
        if ((r34 & 8) == 0) goto L5;
        long initialPositionChange2 = Offset.Companion.m4141getZeroF1C5BW0();
    L6:
        int r4 = 0;
        PointerEventPass r8 = null;
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default.getCurrentEvent(), pointerId) == false) goto L9;
        return null;
    L9:
        float touchSlop = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default.getViewConfiguration(), pointerType);
        long pointer = pointerId;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, initialPositionChange2, null);
    L10:
        PointerEvent event = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default, r8, $completion, 1, r8);
        List<PointerInputChange> r16 = event.getChanges();
        r8 = r8;
        int r9 = r16.size();
        int index$iv$iv = 0;
    L11:
        if (index$iv$iv >= r9) goto L16;
        initialPositionChange2 = initialPositionChange2;
        Object item$iv$iv = r16.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        PointerInputChange it = (PointerInputChange) it$iv;
        if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointer) == true) goto L17;
        index$iv$iv = index$iv$iv + 1;
        initialPositionChange2 = initialPositionChange2;
    L17:
        PointerInputChange dragEvent = (PointerInputChange) it$iv;
        if (dragEvent == null) goto L48;
        if (dragEvent.isConsumed() == true) goto L21;
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent) == true) goto L24;
        int r36 = r4;
        long postSlopOffset = touchSlopDetector.m521addPointerInputChangedBAh8RU(dragEvent, touchSlop);
        if ((postSlopOffset & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L38;
        boolean r14 = true;
    L39:
        if (r14 == false) goto L44;
        onPointerSlopReached.invoke(dragEvent, Offset.m4114boximpl(postSlopOffset));
        if (dragEvent.isConsumed() == true) goto L42;
        touchSlopDetector.reset();
    L47:
        r4 = r36;
        goto L10
    L42:
        return dragEvent;
    L44:
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default.awaitPointerEvent(PointerEventPass.Final, $completion);
        if (dragEvent.isConsumed() == false) goto L47;
        return r8;
    L38:
        r14 = false;
        goto L39
    L24:
        List<PointerInputChange> r3 = event.getChanges();
        int r5 = r3.size();
        int r37 = r4;
        int index$iv$iv2 = 0;
    L25:
        if (index$iv$iv2 >= r5) goto L30;
        Object item$iv$iv2 = r3.get(index$iv$iv2);
        Object it$iv2 = item$iv$iv2;
        PointerInputChange it2 = (PointerInputChange) it$iv2;
        if (it2.getPressed() == true) goto L31;
        index$iv$iv2 = index$iv$iv2 + 1;
    L31:
        PointerInputChange otherDown = (PointerInputChange) it$iv2;
        if (otherDown == null) goto L33;
        pointer = otherDown.m5587getIdJ3iCeTQ();
        r4 = r37;
        goto L10
    L33:
        return r8;
    L30:
        it$iv2 = r8;
        goto L31
    L21:
        return r8;
    L48:
        return r8;
    L16:
        initialPositionChange2 = initialPositionChange2;
        it$iv = r8;
        goto L17
    L5:
        initialPositionChange2 = initialPositionChange;
        goto L6
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m424awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope $this$awaitPointerSlopOrCancellation_u2d6ksA65w, long pointerId, int pointerType, Orientation orientation, long initialPositionChange, Function2<? super PointerInputChange, ? super Offset, Unit> r34, Continuation<? super PointerInputChange> r35) {
        PointerEventPass r6 = null;
        if (m416access$isPointerUpDmW0f2w($this$awaitPointerSlopOrCancellation_u2d6ksA65w.getCurrentEvent(), pointerId) == false) goto L5;
        return null;
    L5:
        float touchSlop = m435pointerSlopE8SPZFQ($this$awaitPointerSlopOrCancellation_u2d6ksA65w.getViewConfiguration(), pointerType);
        Ref.LongRef pointer = new Ref.LongRef();
        pointer.element = pointerId;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, initialPositionChange, null);
    L6:
        PointerEvent event = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default($this$awaitPointerSlopOrCancellation_u2d6ksA65w, r6, r35, 1, r6);
        List<PointerInputChange> r17 = event.getChanges();
        PointerEventPass r21 = r6;
        int r7 = r17.size();
        int index$iv$iv = 0;
    L7:
        if (index$iv$iv >= r7) goto L12;
        List<PointerInputChange> r1 = r17;
        Object item$iv$iv = r1.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        PointerInputChange it = (PointerInputChange) it$iv;
        int r26 = r7;
        if (Boolean.valueOf(PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointer.element)).booleanValue() == true) goto L13;
        index$iv$iv = index$iv$iv + 1;
        r17 = r1;
        r7 = r26;
    L13:
        PointerInputChange dragEvent = (PointerInputChange) it$iv;
        if (dragEvent == null) goto L45;
        if (dragEvent.isConsumed() == true) goto L17;
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent) == false) goto L31;
        List<PointerInputChange> r2 = event.getChanges();
        int index$iv$iv2 = 0;
        int r3 = r2.size();
    L21:
        if (index$iv$iv2 >= r3) goto L26;
        Object item$iv$iv2 = r2.get(index$iv$iv2);
        Object it$iv2 = item$iv$iv2;
        PointerInputChange it2 = (PointerInputChange) it$iv2;
        if (Boolean.valueOf(it2.getPressed()).booleanValue() == true) goto L27;
        index$iv$iv2 = index$iv$iv2 + 1;
    L27:
        PointerInputChange otherDown = (PointerInputChange) it$iv2;
        if (otherDown == null) goto L29;
        pointer.element = otherDown.m5587getIdJ3iCeTQ();
    L43:
        r6 = r21;
        goto L6
    L29:
        return r21;
    L26:
        it$iv2 = r21;
        goto L27
    L31:
        long postSlopOffset = touchSlopDetector.m521addPointerInputChangedBAh8RU(dragEvent, touchSlop);
        if ((postSlopOffset & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L34;
        boolean r13 = true;
    L35:
        if (r13 == false) goto L40;
        r34.invoke(dragEvent, Offset.m4114boximpl(postSlopOffset));
        if (dragEvent.isConsumed() == true) goto L38;
        touchSlopDetector.reset();
        goto L43
    L38:
        return dragEvent;
    L40:
        $this$awaitPointerSlopOrCancellation_u2d6ksA65w.awaitPointerEvent(PointerEventPass.Final, r35);
        if (dragEvent.isConsumed() == false) goto L43;
        return r21;
    L34:
        r13 = false;
        goto L35
    L17:
        return r21;
    L45:
        return r21;
    L12:
        it$iv = r21;
        goto L13
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a8 -> B:22:0x00b4). Please report as a decompilation issue!!! */
    public static final Object awaitAllPointersUpWithSlopDetection(AwaitPointerEventScope $this$awaitAllPointersUpWithSlopDetection, PointerInputChange initialPositionChange, PointerEventPass pass, Continuation<? super Boolean> r27) {
        Continuation<? super Boolean> r0 = r27;
        if ((r0 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r0;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r6 = 1;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        float touchSlop = r1.F$0;
        int r7 = r1.I$0;
        TouchSlopDetector touchSlopDetector = (TouchSlopDetector) r1.L$3;
        Ref.LongRef pointer = (Ref.LongRef) r1.L$2;
        PointerEventPass pass2 = (PointerEventPass) r1.L$1;
        AwaitPointerEventScope $this$awaitAllPointersUpWithSlopDetection2 = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitAllPointersUpWithSlopDetection3 = $this$awaitAllPointersUpWithSlopDetection2;
        PointerEventPass pass3 = pass2;
        Ref.LongRef pointer2 = pointer;
        TouchSlopDetector touchSlopDetector2 = touchSlopDetector;
        int r8 = r7;
        float touchSlop2 = touchSlop;
        Object r4 = r3;
        Object $result2 = $result;
    L22:
        PointerEvent event = (PointerEvent) $result;
        List<PointerInputChange> r13 = event.getChanges();
        int r5 = r13.size();
        int index$iv$iv = 0;
    L23:
        Object r16 = null;
        if (index$iv$iv >= r5) goto L29;
        Object it$iv = r13.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) it$iv;
        Continuation<? super Boolean> r24 = r0;
        AnonymousClass1 r25 = r1;
        PointerEvent event2 = event;
        Object $result3 = $result2;
        if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointer2.element) == true) goto L30;
        index$iv$iv = index$iv$iv + 1;
        r0 = r24;
        r1 = r25;
        $result2 = $result3;
        event = event2;
    L30:
        PointerInputChange dragEvent = (PointerInputChange) it$iv;
        if (dragEvent != null) goto L33;
    L41:
        List<PointerInputChange> r2 = event2.getChanges();
        int index$iv$iv2 = 0;
        int r9 = r2.size();
    L42:
        if (index$iv$iv2 >= r9) goto L48;
        Object item$iv$iv = r2.get(index$iv$iv2);
        PointerInputChange it2 = (PointerInputChange) item$iv$iv;
        if (it2.getPressed() == true) goto L45;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L42
    L45:
        r16 = item$iv$iv;
    L48:
        PointerInputChange otherDown = (PointerInputChange) r16;
        if (otherDown != null) goto L55;
        if (r8 == 0) goto L52;
        boolean r10 = true;
    L54:
        return Boxing.boxBoolean(r10);
    L52:
        r10 = false;
        goto L54
    L55:
        pointer2.element = otherDown.m5587getIdJ3iCeTQ();
    L56:
        int r11 = r8;
    L57:
        List<PointerInputChange> r12 = event2.getChanges();
        int index$iv$iv3 = 0;
        int r14 = r12.size();
    L58:
        if (index$iv$iv3 >= r14) goto L63;
        PointerInputChange it3 = (PointerInputChange) r12.get(index$iv$iv3);
        if (it3.getPressed() == true) goto L61;
        index$iv$iv3 = index$iv$iv3 + 1;
        goto L58
    L61:
        boolean r15 = true;
    L64:
        if (r15 == true) goto L70;
        if (r11 == 0) goto L67;
        boolean r17 = true;
    L69:
        return Boxing.boxBoolean(r17);
    L67:
        r17 = false;
        goto L69
    L70:
        r1 = r25;
        $result = $result3;
        r3 = r4;
        float touchSlop3 = touchSlop2;
        TouchSlopDetector touchSlopDetector3 = touchSlopDetector2;
        Ref.LongRef pointer3 = pointer2;
        PointerEventPass pass4 = pass3;
        AwaitPointerEventScope $this$awaitAllPointersUpWithSlopDetection4 = $this$awaitAllPointersUpWithSlopDetection3;
        r6 = 1;
        int r18 = r11;
        r0 = r24;
    L18:
        r1.L$0 = $this$awaitAllPointersUpWithSlopDetection4;
        r1.L$1 = pass4;
        r1.L$2 = pointer3;
        r1.L$3 = touchSlopDetector3;
        r1.I$0 = r18;
        r1.F$0 = touchSlop3;
        r1.label = r6;
        Object r19 = $this$awaitAllPointersUpWithSlopDetection4.awaitPointerEvent(pass4, r1);
        if (r19 != r3) goto L21;
        return r3;
    L21:
        Object r23 = r3;
        $result2 = $result;
        $result = r19;
        $this$awaitAllPointersUpWithSlopDetection3 = $this$awaitAllPointersUpWithSlopDetection4;
        pass3 = pass4;
        pointer2 = pointer3;
        touchSlopDetector2 = touchSlopDetector3;
        r8 = r18;
        touchSlop2 = touchSlop3;
        r4 = r23;
        goto L22
    L63:
        r15 = false;
        goto L64
    L33:
        if (PointerEventKt.changedToUpIgnoreConsumed(dragEvent) == true) goto L41;
        long $this$isSpecified$iv = touchSlopDetector2.m521addPointerInputChangedBAh8RU(dragEvent, touchSlop2);
        if ((9223372034707292159L & $this$isSpecified$iv) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L38;
        boolean r20 = true;
    L39:
        if (r20 == false) goto L56;
        r11 = 1;
        goto L57
    L38:
        r20 = false;
        goto L39
    L29:
        r24 = r0;
        r25 = r1;
        event2 = event;
        $result3 = $result2;
        it$iv = null;
        goto L30
    L13:
        ResultKt.throwOnFailure($result);
        if (ForEachGestureKt.allPointersUp($this$awaitAllPointersUpWithSlopDetection) == true) goto L16;
        pointer3 = new Ref.LongRef();
        pointer3.element = initialPositionChange.m5587getIdJ3iCeTQ();
        float touchSlop4 = m435pointerSlopE8SPZFQ($this$awaitAllPointersUpWithSlopDetection.getViewConfiguration(), initialPositionChange.m5592getTypeT8wyACA());
        $this$awaitAllPointersUpWithSlopDetection4 = $this$awaitAllPointersUpWithSlopDetection;
        touchSlop3 = touchSlop4;
        touchSlopDetector3 = new TouchSlopDetector(null, 0, 3, null);
        pass4 = pass;
        r18 = 0;
        goto L18
    L16:
        return Boxing.boxBoolean(false);
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(r0);
        goto L8
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope r0, PointerInputChange r1, PointerEventPass r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = PointerEventPass.Main;
    L6:
        return awaitAllPointersUpWithSlopDetection(r0, r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    public static final Object m422awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope r18, long r19, Continuation<? super PointerInputChange> r21) {
        if ((r21 instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) == false) goto L7;
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) r21;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 r2 = r0;
        Object r3 = r2.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r2.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.BooleanRef r4 = (Ref.BooleanRef) r2.L$2;
        Ref.ObjectRef r5 = (Ref.ObjectRef) r2.L$1;
        ?? r6 = (PointerInputChange) r2.L$0;
        ResultKt.throwOnFailure(r3);     // Catch: PointerEventTimeoutCancellationException -> L15
        r6 = r6;
    L36:
        if (r4.element == false) goto L58;
        PointerInputChange r7 = (PointerInputChange) r5.element;     // Catch: PointerEventTimeoutCancellationException -> L15
        if (r7 == null) goto L57;
        return r7;
    L57:
        return r6;
    L58:
        return null;
    L44:
        PointerInputChange r8 = (PointerInputChange) r5.element;
        if (r8 != null) goto L48;
        return r6;
    L48:
        return r8;
    L17:
        ResultKt.throwOnFailure(r3);
        if (m434isPointerUpDmW0f2w(r18.getCurrentEvent(), r19) == false) goto L20;
        return null;
    L20:
        List<PointerInputChange> r9 = r18.getCurrentEvent().getChanges();
        int r10 = 0;
        int r11 = 0;
        int r12 = r9.size();
    L21:
        if (r11 >= r12) goto L26;
        PointerInputChange r14 = r9.get(r11);
        List<PointerInputChange> r110 = r9;
        int r111 = r10;
        if (PointerId.m5571equalsimpl0(r14.m5587getIdJ3iCeTQ(), r19) == true) goto L27;
        r11 = r11 + 1;
        r10 = r111;
        r9 = r110;
    L27:
        PointerInputChange r15 = r14;
        if (r15 != null) goto L30;
        return null;
    L30:
        r6 = r15;
        Ref.ObjectRef r13 = new Ref.ObjectRef();
        Ref.ObjectRef r16 = new Ref.ObjectRef();
        r16.element = r6;
        long r17 = r18.getViewConfiguration().getLongPressTimeoutMillis();
        Ref.BooleanRef r112 = new Ref.BooleanRef();     // Catch: PointerEventTimeoutCancellationException -> L42
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 r113 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(r112, r16, r13, null);     // Catch: PointerEventTimeoutCancellationException -> L42
        r2.L$0 = r6;     // Catch: PointerEventTimeoutCancellationException -> L42
        r2.L$1 = r13;     // Catch: PointerEventTimeoutCancellationException -> L42
        r2.L$2 = r112;     // Catch: PointerEventTimeoutCancellationException -> L42
        r2.label = 1;     // Catch: PointerEventTimeoutCancellationException -> L42
        if (r18.withTimeout(r17, r113, r2) != r1) goto L34;
        return r1;
    L34:
        r5 = r13;
        r4 = r112;
        r6 = r6;
    L43:
        r5 = r13;
        goto L44
    L26:
        r14 = null;
        goto L27
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(r21);
        goto L8
    }

    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m434isPointerUpDmW0f2w(PointerEvent $this$isPointerUp_u2dDmW0f2w, long pointerId) {
        List<PointerInputChange> r0 = $this$isPointerUp_u2dDmW0f2w.getChanges();
        int index$iv$iv = 0;
        int r5 = r0.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = r0.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        PointerInputChange it = (PointerInputChange) it$iv;
        if (PointerId.m5571equalsimpl0(it.m5587getIdJ3iCeTQ(), pointerId) == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
    L9:
        PointerInputChange r7 = (PointerInputChange) it$iv;
        boolean r1 = false;
        if (r7 == null) goto L15;
        if (r7.getPressed() != true) goto L15;
        r1 = true;
    L15:
        return !r1;
    L8:
        it$iv = null;
        goto L9
    }

    static {
        mouseSlop = Dp.m6973constructorimpl((float) 0.125d);
        defaultTouchSlop = Dp.m6973constructorimpl(18);
        float arg0$iv = mouseSlop;
        float other$iv = defaultTouchSlop;
        mouseToTouchSlopRatio = arg0$iv / other$iv;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m435pointerSlopE8SPZFQ(ViewConfiguration $this$pointerSlop_u2dE8SPZFQ, int pointerType) {
        if (PointerType.m5660equalsimpl0(pointerType, PointerType.Companion.m5665getMouseT8wyACA()) == false) goto L6;
        return $this$pointerSlop_u2dE8SPZFQ.getTouchSlop() * mouseToTouchSlopRatio;
    L6:
        return $this$pointerSlop_u2dE8SPZFQ.getTouchSlop();
    }
}
