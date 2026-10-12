package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\\BX\b\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fB;\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J=\u0010F\u001a\u0002HG\"\u0004\b\u0000\u0010G2'\u0010H\u001a#\b\u0001\u0012\u0004\u0012\u00020I\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0002\u0010JJ\u0018\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020NH\u0002J-\u0010O\u001a\u00020\r2\u0006\u0010M\u001a\u00020N2\u001a\u0010H\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030!R\u00020\u0000\u0012\u0004\u0012\u00020\r0PH\u0082\bJ\b\u0010Q\u001a\u00020\rH\u0016J\b\u0010R\u001a\u00020\rH\u0016J\b\u0010S\u001a\u00020\rH\u0016J*\u0010T\u001a\u00020\r2\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020N2\u0006\u0010U\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020\rH\u0016J\b\u0010Y\u001a\u00020\rH\u0016J?\u0010Z\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0004\b[\u0010\u0012R3\u0010\u0013\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u000b¢\u0006\u0002\b\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u00020\u0017X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030!R\u00020\u00000 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001eR\u001a\u0010(\u001a\u00020)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010.R\u0010\u0010/\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030!R\u00020\u00000 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106Rl\u00107\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u000e2'\u00102\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u000e8V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0014\u0010B\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "key1", "", "key2", "keys", "", "pointerInputEvent", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pointerInputEventHandler", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "_deprecatedPointerInputHandler", "Lkotlin/jvm/functions/Function2;", "_pointerInputEventHandler", "boundsSize", "Landroidx/compose/ui/unit/IntSize;", "J", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "density", "", "getDensity", "()F", "dispatchingPointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "fontScale", "getFontScale", "interceptOutOfBoundsChildEvents", "", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "[Ljava/lang/Object;", "lastPointerEvent", "pointerHandlers", "pointerHandlersLock", "value", "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "pointerInputHandler", "getPointerInputHandler$annotations", "()V", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "setPointerInputHandler", "(Lkotlin/jvm/functions/Function2;)V", "pointerInputJob", "Lkotlinx/coroutines/Job;", "size", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPointerEvent", "pointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "forEachCurrentPointerHandler", "Lkotlin/Function1;", "onCancelPointerInput", "onDensityChange", "onDetach", "onPointerEvent", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onViewConfigurationChange", "resetPointerInputHandler", "update", "update$ui_release", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> _deprecatedPointerInputHandler;
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private Object key1;
    private Object key2;
    private Object[] keys;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private final Object pointerHandlersLock;
    private Job pointerInputJob;

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u0016\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\bJ\u001b\u0010-\u001a\u00020(2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016¢\u0006\u0002\u00100JE\u00101\u001a\u0002H2\"\u0004\b\u0001\u001022\u0006\u00103\u001a\u0002042'\u00105\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u0004\u0012\u0006\u0012\u0004\u0018\u00010706¢\u0006\u0002\b8H\u0096@¢\u0006\u0002\u00109JG\u0010:\u001a\u0004\u0018\u0001H2\"\u0004\b\u0001\u001022\u0006\u00103\u001a\u0002042'\u00105\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u0004\u0012\u0006\u0012\u0004\u0018\u00010706¢\u0006\u0002\b8H\u0096@¢\u0006\u0002\u00109J\u0017\u0010;\u001a\u00020<*\u00020=H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010;\u001a\u00020<*\u00020@H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020=*\u00020@H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001a\u0010C\u001a\u00020=*\u00020\u0012H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001a\u0010C\u001a\u00020=*\u00020<H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010HJ\u0017\u0010I\u001a\u00020J*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u0012*\u00020=H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010GJ\u0017\u0010M\u001a\u00020\u0012*\u00020@H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010EJ\r\u0010P\u001a\u00020Q*\u00020RH\u0097\u0001J\u0017\u0010S\u001a\u00020\u0016*\u00020JH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010LJ\u0017\u0010U\u001a\u00020@*\u00020=H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u001a\u0010U\u001a\u00020@*\u00020\u0012H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010WJ\u001a\u0010U\u001a\u00020@*\u00020<H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00128\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "completion", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;Lkotlin/coroutines/Continuation;)V", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "density", "", "getDensity", "()F", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "fontScale", "getFontScale", "pointerAwaiter", "Lkotlinx/coroutines/CancellableContinuation;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "cause", "", "offerPointerEvent", NotificationCompat.CATEGORY_EVENT, "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "withTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private PointerEventPass awaitPass;
        private final Continuation<R> completion;
        private final CoroutineContext context;
        private CancellableContinuation<? super PointerEvent> pointerAwaiter;
        final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo369roundToPxR2X_6o(long r2) {
            return this.$$delegate_0.mo369roundToPxR2X_6o(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo370roundToPx0680j_4(float r2) {
            return this.$$delegate_0.mo370roundToPx0680j_4(r2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo371toDpGaN1DYA(long r2) {
            return this.$$delegate_0.mo371toDpGaN1DYA(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo372toDpu2uoSUM(float r2) {
            return this.$$delegate_0.mo372toDpu2uoSUM(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo373toDpu2uoSUM(int r2) {
            return this.$$delegate_0.mo373toDpu2uoSUM(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo374toDpSizekrfVVM(long r3) {
            return this.$$delegate_0.mo374toDpSizekrfVVM(r3);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo375toPxR2X_6o(long r2) {
            return this.$$delegate_0.mo375toPxR2X_6o(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo376toPx0680j_4(float r2) {
            return this.$$delegate_0.mo376toPx0680j_4(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect r2) {
            return this.$$delegate_0.toRect(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo377toSizeXkaWNTQ(long r3) {
            return this.$$delegate_0.mo377toSizeXkaWNTQ(r3);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo378toSp0xMU5do(float r3) {
            return this.$$delegate_0.mo378toSp0xMU5do(r3);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo379toSpkPz2Gy4(float r3) {
            return this.$$delegate_0.mo379toSpkPz2Gy4(r3);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo380toSpkPz2Gy4(int r3) {
            return this.$$delegate_0.mo380toSpkPz2Gy4(r3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(SuspendingPointerInputModifierNodeImpl this$0, Continuation<? super R> r3) {
            this.this$0 = this$0;
            this.completion = r3;
            this.$$delegate_0 = this.this$0;
            this.awaitPass = PointerEventPass.Main;
            this.context = EmptyCoroutineContext.INSTANCE;
        }

        public static final /* synthetic */ CancellableContinuation access$getPointerAwaiter$p(PointerEventHandlerCoroutine $this) {
            return $this.pointerAwaiter;
        }

        public static final /* synthetic */ void access$setAwaitPass$p(PointerEventHandlerCoroutine $this, PointerEventPass r1) {
            $this.awaitPass = r1;
        }

        public static final /* synthetic */ void access$setPointerAwaiter$p(PointerEventHandlerCoroutine $this, CancellableContinuation r1) {
            $this.pointerAwaiter = r1;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.access$getCurrentEvent$p(this.this$0);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo5498getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.access$getBoundsSize$p(this.this$0);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return this.this$0.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo5497getExtendedTouchPaddingNHjbRc() {
            return this.this$0.mo366getExtendedTouchPaddingNHjbRc();
        }

        public final void offerPointerEvent(PointerEvent event, PointerEventPass pass) {
            if (pass != this.awaitPass) goto L8;
            CancellableContinuation<? super PointerEvent> r0 = this.pointerAwaiter;
            if (r0 == null) goto L9;
            this.pointerAwaiter = null;
            Result.Companion r3 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(event));
            return;
        L9:
            return;
        }

        public final void cancel(Throwable cause) {
            CancellableContinuation<? super PointerEvent> r0 = this.pointerAwaiter;
            if (r0 == null) goto L5;
            r0.cancel(cause);
        L5:
            this.pointerAwaiter = null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            Object lock$iv = SuspendingPointerInputModifierNodeImpl.access$getPointerHandlersLock$p(this.this$0);
            SuspendingPointerInputModifierNodeImpl r1 = this.this$0;
            monitor-enter(lock$iv);
            MutableVector this_$iv = SuspendingPointerInputModifierNodeImpl.access$getPointerHandlers$p(r1);     // Catch: Throwable -> L9
            this_$iv.remove(this);     // Catch: Throwable -> L9
            Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L9
            monitor-exit(lock$iv);
            this.completion.resumeWith(result);
            return;
        L9:
            th = move-exception;
            throw th;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pass, Continuation<? super PointerEvent> r8) {
            CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r8), 1);
            cancellable$iv.initCancellability();
            CancellableContinuationImpl continuation = cancellable$iv;
            access$setAwaitPass$p(this, pass);
            access$setPointerAwaiter$p(this, continuation);
            Object r1 = cancellable$iv.getResult();
            if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
            DebugProbesKt.probeCoroutineSuspended(r8);
        L6:
            return r1;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public <T> Object withTimeoutOrNull(long timeMillis, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r8, Continuation<? super T> r9) {
            if ((r9 instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) == false) goto L7;
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r9;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            Object $result = r0.result;
            Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L16;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            ResultKt.throwOnFailure($result);     // Catch: PointerEventTimeoutCancellationException -> L14
            Object r4 = $result;
        L23:
            return r4;
        L16:
            ResultKt.throwOnFailure($result);
            r0.label = 1;     // Catch: PointerEventTimeoutCancellationException -> L14
            r4 = withTimeout(timeMillis, r8, r0);     // Catch: PointerEventTimeoutCancellationException -> L14
            if (r4 != r2) goto L23;
            return r2;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L21:
            return null;
        L7:
            r0 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, r9);
            goto L8
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public <T> Object withTimeout(long r12, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r14, Continuation<? super T> r15) {
            if ((r15 instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) == false) goto L7;
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r15;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r1 = r0;
            Object r2 = r1.result;
            Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r1.label) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            Job r13 = (Job) r1.L$0;
            ResultKt.throwOnFailure(r2);     // Catch: Throwable -> L15
            Object r16 = r2;
            r12 = r13;
        L26:
            r12.cancel(CancelTimeoutCancellationException.INSTANCE);
            return r16;
        L17:
            ResultKt.throwOnFailure(r2);
            if (r12 > 0) goto L22;
            CancellableContinuation<? super PointerEvent> r4 = this.pointerAwaiter;
            if (r4 == null) goto L22;
            Result.Companion r5 = Result.Companion;
            r4.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(r12))));
        L22:
            Job r17 = BuildersKt.launch$default(this.this$0.getCoroutineScope(), null, null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(r12, this, null), 3, null);
            r1.L$0 = r17;     // Catch: Throwable -> L15
            r1.label = 1;     // Catch: Throwable -> L15
            r16 = r14.invoke(this, r1);     // Catch: Throwable -> L15
            r12 = r17;
            if (r16 != r3) goto L26;
            return r3;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L15:
            th = move-exception;
            r12.cancel(CancelTimeoutCancellationException.INSTANCE);
            throw th;
        L7:
            r0 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, r15);
            goto L8
        }
    }

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PointerEventPass.values().length];
            r0[PointerEventPass.Initial.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[PointerEventPass.Final.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[PointerEventPass.Main.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
    }

    @Deprecated(message = "Super property deprecated")
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object r2, Object r3, Object[] r4, PointerInputEventHandler r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4, r5);
    }

    public static final /* synthetic */ long access$getBoundsSize$p(SuspendingPointerInputModifierNodeImpl $this) {
        return $this.boundsSize;
    }

    public static final /* synthetic */ PointerEvent access$getCurrentEvent$p(SuspendingPointerInputModifierNodeImpl $this) {
        return $this.currentEvent;
    }

    public static final /* synthetic */ MutableVector access$getPointerHandlers$p(SuspendingPointerInputModifierNodeImpl $this) {
        return $this.pointerHandlers;
    }

    public static final /* synthetic */ Object access$getPointerHandlersLock$p(SuspendingPointerInputModifierNodeImpl $this) {
        return $this.pointerHandlersLock;
    }

    public static final /* synthetic */ Function2 access$get_deprecatedPointerInputHandler$p(SuspendingPointerInputModifierNodeImpl $this) {
        return $this._deprecatedPointerInputHandler;
    }

    public SuspendingPointerInputModifierNodeImpl(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = key1;
        this.key2 = key2;
        this.keys = keys;
        this._pointerInputEventHandler = pointerInputEventHandler;
        this.currentEvent = SuspendingPointerInputFilterKt.access$getEmptyPointerEvent$p();
        this.pointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        Object ref$iv = this.pointerHandlers;
        if (ref$iv != null) goto L5;
        ref$iv = new Object();
    L5:
        this.pointerHandlersLock = ref$iv;
        this.dispatchingPointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m7149getZeroYbymL2g();
    }

    @Deprecated(message = "Exists to maintain compatibility with previous API shape")
    public SuspendingPointerInputModifierNodeImpl(Object key1, Object key2, Object[] keys, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> r5) {
        this(key1, key2, keys, AnonymousClass1.INSTANCE);
        this._deprecatedPointerInputHandler = r5;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public Function2<PointerInputScope, Continuation<? super Unit>, Object> getPointerInputHandler() {
        Function2 r0 = this._deprecatedPointerInputHandler;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null);
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> r1) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = r1;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(PointerInputEventHandler value) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = value;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public PointerInputEventHandler getPointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo367getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo366getExtendedTouchPaddingNHjbRc() {
        long minimumTouchTargetSize = mo377toSizeXkaWNTQ(getViewConfiguration().mo5898getMinimumTouchTargetSizeMYxV2XQ());
        long size = mo367getSizeYbymL2g();
        int bits$iv$iv$iv = (int) (minimumTouchTargetSize >> 32);
        float horizontal = Math.max(0.0f, Float.intBitsToFloat(bits$iv$iv$iv) - ((int) (size >> 32))) / 2.0f;
        int bits$iv$iv$iv2 = (int) (minimumTouchTargetSize & 4294967295L);
        float vertical = Math.max(0.0f, Float.intBitsToFloat(bits$iv$iv$iv2) - ((int) (size & 4294967295L))) / 2.0f;
        long v1$iv$iv = Float.floatToRawIntBits(horizontal);
        long v2$iv$iv = Float.floatToRawIntBits(vertical);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean r1) {
        this.interceptOutOfBoundsChildEvents = r1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        Job localJob = this.pointerInputJob;
        if (localJob == null) goto L6;
        localJob.cancel(new PointerInputResetException());
        this.pointerInputJob = null;
        return;
    }

    public final void update$ui_release(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        boolean needsReset = false;
        if (Intrinsics.areEqual(this.key1, key1) == true) goto L5;
        needsReset = true;
    L5:
        this.key1 = key1;
        if (Intrinsics.areEqual(this.key2, key2) == true) goto L8;
        needsReset = true;
    L8:
        this.key2 = key2;
        if (this.keys == null) goto L13;
        if (keys != null) goto L13;
        needsReset = true;
    L13:
        if (this.keys != null) goto L17;
        if (keys == null) goto L17;
        needsReset = true;
    L17:
        if (this.keys == null) goto L22;
        if (keys == null) goto L22;
        if (Arrays.equals(keys, this.keys) == true) goto L22;
        needsReset = true;
    L22:
        this.keys = keys;
        if (getPointerInputEventHandler().getClass() == pointerInputEventHandler.getClass()) goto L25;
        needsReset = true;
    L25:
        if (needsReset == false) goto L27;
        resetPointerInputHandler();
    L27:
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pass, Function1<? super PointerEventHandlerCoroutine<?>, Unit> r10) {
        Object lock$iv = this.pointerHandlersLock;
        monitor-enter(lock$iv);
        MutableVector<PointerEventHandlerCoroutine<?>> r4 = this.dispatchingPointerHandlers;     // Catch: Throwable -> L25
        r4.addAll(r4.getSize(), this.pointerHandlers);     // Catch: Throwable -> L25
        monitor-exit(lock$iv);
    L22:
        th = move-exception;
        this.dispatchingPointerHandlers.clear();
        throw th;
    L8:
        switch(WhenMappings.$EnumSwitchMapping$0[pass.ordinal()]) {
            case 1: goto L15;
            case 2: goto L15;
            case 3: goto L10;
            default: goto L20;
        };     // Catch: Throwable -> L22
    L10:
        MutableVector<PointerEventHandlerCoroutine<?>> r1 = this.dispatchingPointerHandlers;     // Catch: Throwable -> L22
        int i$iv = r1.getSize() - 1;     // Catch: Throwable -> L22
        Object[] content$iv = r1.content;     // Catch: Throwable -> L22
        if (i$iv >= content$iv.length) goto L20;
    L12:
        if (i$iv < 0) goto L20;
        r10.invoke(content$iv[i$iv]);     // Catch: Throwable -> L22
        i$iv = i$iv - 1;     // Catch: Throwable -> L22
        goto L12
    L15:
        MutableVector<PointerEventHandlerCoroutine<?>> r2 = this.dispatchingPointerHandlers;     // Catch: Throwable -> L22
        int i$iv2 = 0;
        Object[] content$iv2 = r2.content;     // Catch: Throwable -> L22
        int size$iv = r2.getSize();     // Catch: Throwable -> L22
    L16:
        if (i$iv2 >= size$iv) goto L20;
        r10.invoke(content$iv2[i$iv2]);     // Catch: Throwable -> L22
        i$iv2 = i$iv2 + 1;
    L20:
        this.dispatchingPointerHandlers.clear();
        return;
    L25:
        th = move-exception;
        throw th;
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pass) {
        Object lock$iv$iv = this.pointerHandlersLock;
        monitor-enter(lock$iv$iv);
        MutableVector<PointerEventHandlerCoroutine<?>> r5 = this.dispatchingPointerHandlers;     // Catch: Throwable -> L25
        r5.addAll(r5.getSize(), this.pointerHandlers);     // Catch: Throwable -> L25
        monitor-exit(lock$iv$iv);
    L22:
        th = move-exception;
        this.dispatchingPointerHandlers.clear();
        throw th;
    L8:
        switch(WhenMappings.$EnumSwitchMapping$0[pass.ordinal()]) {
            case 1: goto L15;
            case 2: goto L15;
            case 3: goto L10;
            default: goto L20;
        };     // Catch: Throwable -> L22
    L10:
        MutableVector<PointerEventHandlerCoroutine<?>> r2 = this.dispatchingPointerHandlers;     // Catch: Throwable -> L22
        int i$iv$iv = r2.getSize() - 1;     // Catch: Throwable -> L22
        Object[] content$iv$iv = r2.content;     // Catch: Throwable -> L22
        if (i$iv$iv >= content$iv$iv.length) goto L20;
    L12:
        if (i$iv$iv < 0) goto L20;
        ((PointerEventHandlerCoroutine) content$iv$iv[i$iv$iv]).offerPointerEvent(pointerEvent, pass);     // Catch: Throwable -> L22
        i$iv$iv = i$iv$iv - 1;     // Catch: Throwable -> L22
        goto L12
    L15:
        MutableVector<PointerEventHandlerCoroutine<?>> r3 = this.dispatchingPointerHandlers;     // Catch: Throwable -> L22
        int i$iv$iv2 = 0;
        Object[] content$iv$iv2 = r3.content;     // Catch: Throwable -> L22
        int size$iv$iv = r3.getSize();     // Catch: Throwable -> L22
    L16:
        if (i$iv$iv2 >= size$iv$iv) goto L20;
        ((PointerEventHandlerCoroutine) content$iv$iv2[i$iv$iv2]).offerPointerEvent(pointerEvent, pass);     // Catch: Throwable -> L22
        i$iv$iv2 = i$iv$iv2 + 1;
    L20:
        this.dispatchingPointerHandlers.clear();
        return;
    L25:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.boundsSize = bounds;
        if (pass != PointerEventPass.Initial) goto L5;
        PointerEvent r3 = pointerEvent;
        this.currentEvent = r3;
    L6:
        PointerEvent r6 = null;
        if (this.pointerInputJob != null) goto L9;
        this.pointerInputJob = BuildersKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
    L9:
        dispatchPointerEvent(pointerEvent, pass);
        List<PointerInputChange> r8 = pointerEvent.getChanges();
        int index$iv$iv = 0;
        int r13 = r8.size();
    L10:
        if (index$iv$iv >= r13) goto L15;
        Object item$iv$iv = r8.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (PointerEventKt.changedToUpIgnoreConsumed(it) == false) goto L13;
        index$iv$iv = index$iv$iv + 1;
        goto L10
    L13:
        boolean r14 = false;
    L17:
        if (r14 == true) goto L19;
        r6 = r3;
    L19:
        this.lastPointerEvent = r6;
        return;
    L15:
        r14 = true;
        goto L17
    L5:
        r3 = pointerEvent;
        goto L6
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent lastEvent = this.lastPointerEvent;
        if (lastEvent != null) goto L5;
        return;
    L5:
        List<PointerInputChange> r2 = lastEvent.getChanges();
        int index$iv$iv = 0;
        int r7 = r2.size();
    L6:
        if (index$iv$iv >= r7) goto L11;
        Object item$iv$iv = r2.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (it.getPressed() == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L9:
        boolean r8 = false;
    L12:
        if (r8 == false) goto L14;
        return;
    L14:
        List<PointerInputChange> r3 = lastEvent.getChanges();
        List target$iv = new ArrayList(r3.size());
        int index$iv$iv2 = 0;
        int r9 = r3.size();
    L15:
        if (index$iv$iv2 >= r9) goto L17;
        Object item$iv$iv2 = r3.get(index$iv$iv2);
        PointerInputChange old = (PointerInputChange) item$iv$iv2;
        long r15 = old.m5587getIdJ3iCeTQ();
        long r19 = old.m5589getPositionF1C5BW0();
        long r17 = old.getUptimeMillis();
        float r22 = old.getPressure();
        long r25 = old.m5589getPositionF1C5BW0();
        List r13 = target$iv;
        r13.add(new PointerInputChange(r15, r17, r19, false, r22, old.getUptimeMillis(), r25, old.getPressed(), old.getPressed(), old.m5592getTypeT8wyACA(), 0, 1024, null));
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L15
    L17:
        List newChanges = target$iv;
        PointerEvent cancelEvent = new PointerEvent(newChanges);
        this.currentEvent = cancelEvent;
        dispatchPointerEvent(cancelEvent, PointerEventPass.Initial);
        dispatchPointerEvent(cancelEvent, PointerEventPass.Main);
        dispatchPointerEvent(cancelEvent, PointerEventPass.Final);
        this.lastPointerEvent = null;
        return;
    L11:
        r8 = true;
        goto L12
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> r13, Continuation<? super R> r14) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r14), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        final PointerEventHandlerCoroutine handlerCoroutine = new PointerEventHandlerCoroutine(this, continuation);
        Object lock$iv = access$getPointerHandlersLock$p(this);
        monitor-enter(lock$iv);
        MutableVector this_$iv = access$getPointerHandlers$p(this);     // Catch: Throwable -> L12
        this_$iv.add(handlerCoroutine);     // Catch: Throwable -> L12
        Continuation<Unit> r10 = ContinuationKt.createCoroutine(r13, handlerCoroutine, handlerCoroutine);     // Catch: Throwable -> L12
        Result.Companion r11 = Result.Companion;     // Catch: Throwable -> L12
        r10.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L12
        Unit r9 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        continuation.invokeOnCancellation(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(handlerCoroutine));
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L11;
        DebugProbesKt.probeCoroutineSuspended(r14);
    L11:
        return r1;
    L12:
        th = move-exception;
        throw th;
    }
}
