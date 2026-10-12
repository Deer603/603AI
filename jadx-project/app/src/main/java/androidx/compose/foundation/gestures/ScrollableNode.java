package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.autofill.HintConstants;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BM\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\b\u00102\u001a\u000203H\u0002JM\u00104\u001a\u0002032=\u00105\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u001107¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020306\u0012\n\u0012\b\u0012\u0004\u0012\u0002030(\u0012\u0006\u0012\u0004\u0018\u00010)0 H\u0096@¢\u0006\u0002\u00109J\b\u0010:\u001a\u000203H\u0002J\b\u0010;\u001a\u000203H\u0016J\b\u0010<\u001a\u000203H\u0016J\u001a\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001a\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010@J\u001a\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020GH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ*\u0010J\u001a\u0002032\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0016ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\u001a\u0010S\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020GH\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010IJ\u001a\u0010U\u001a\u0002032\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010@J\b\u0010W\u001a\u000203H\u0002J\b\u0010X\u001a\u00020\u000eH\u0016JN\u0010Y\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010Z\u001a\u000203H\u0002J\f\u0010[\u001a\u000203*\u00020\\H\u0016R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R@\u0010\u001f\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000e\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010&\u001a \b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0(\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "contentInViewNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "mouseWheelScrollingLogic", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollByAction", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "x", "y", "scrollByOffsetAction", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "scrollableContainerNode", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "clearScrollSemanticsActions", "", "drag", "forEachDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureMouseWheelScrollNodeInitialized", "onAttach", "onDensityChange", "onDragStarted", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "onKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0", "setScrollSemanticsActions", "startDragImmediately", "update", "updateDefaultFlingBehavior", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final ContentInViewNode contentInViewNode;
    private final DefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private Function2<? super Float, ? super Float, Boolean> scrollByAction;
    private Function2<? super Offset, ? super Continuation<? super Offset>, ? extends Object> scrollByOffsetAction;
    private final ScrollableContainerNode scrollableContainerNode;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$ensureMouseWheelScrollNodeInitialized$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C02621 extends AdaptedFunctionReference implements Function2<Velocity, Continuation<? super Unit>, Object>, SuspendFunction {
        C02621(Object r8) {
            super(2, r8, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity r4, Continuation<? super Unit> r5) {
            return m499invokesFctU(r4.m7220unboximpl(), r5);
        }

        /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m499invokesFctU(long p0, Continuation<? super Unit> r4) {
            return ScrollableNode.access$ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, p0, r4);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "offset"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Offset, Continuation<? super Offset>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ScrollableNode this$0;

        AnonymousClass2(ScrollableNode r2, Continuation<? super AnonymousClass2> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, r5);
            r0.J$0 = ((Offset) r4).m4135unboximpl();
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Offset r4, Continuation<? super Offset> r5) {
            return m500invoke3MmeM6k(r4.m4135unboximpl(), r5);
        }

        /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
        public final Object m500invoke3MmeM6k(long r3, Continuation<? super Offset> r5) {
            return ((AnonymousClass2) create(Offset.m4114boximpl(r3), r5)).invokeSuspend(Unit.INSTANCE);
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
            return $result;
        L7:
            ResultKt.throwOnFailure($result);
            long offset = this.J$0;
            this.label = 1;
            Object r1 = ScrollableKt.m494access$semanticsScrollByd4ec7I(ScrollableNode.access$getScrollingLogic$p(this.this$0), offset, this);
            if (r1 != r0) goto L11;
            return r0;
        L11:
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ Object access$ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode $receiver, long p0, Continuation $completion) {
        return ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped($receiver, p0, $completion);
    }

    public static final /* synthetic */ ContentInViewNode access$getContentInViewNode$p(ScrollableNode $this) {
        return $this.contentInViewNode;
    }

    public static final /* synthetic */ ScrollingLogic access$getScrollingLogic$p(ScrollableNode $this) {
        return $this.scrollingLogic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableNode(ScrollableState r15, OverscrollEffect r16, FlingBehavior r17, Orientation r18, boolean r19, boolean r20, MutableInteractionSource r21, BringIntoViewSpec r22) {
        super(ScrollableKt.access$getCanDragCalculation$p(), r19, r21, r18);
        this.overscrollEffect = r16;
        this.flingBehavior = r17;
        this.nestedScrollDispatcher = new NestedScrollDispatcher();
        this.scrollableContainerNode = (ScrollableContainerNode) delegate(new ScrollableContainerNode(r19));
        this.defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.access$getUnityDensity$p()), null, 2, 0 == true ? 1 : 0);
        OverscrollEffect r2 = this.overscrollEffect;
        DefaultFlingBehavior r0 = this.flingBehavior;
        if (r0 != null) goto L5;
        r0 = this.defaultFlingBehavior;
    L5:
        this.scrollingLogic = new ScrollingLogic(r15, r2, r0, r18, r20, this.nestedScrollDispatcher, new ScrollableNode$scrollingLogic$1(this));
        this.nestedScrollConnection = new ScrollableNestedScrollConnection(this.scrollingLogic, r19);
        this.contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(r18, this.scrollingLogic, r20, r22));
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(this.nestedScrollConnection, this.nestedScrollDispatcher));
        delegate(FocusTargetModifierNodeKt.m4043FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m4062getNeverLCbbffg(), null, 2, null));
        delegate(new BringIntoViewResponderNode(this.contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new AnonymousClass1(this)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> r6, Continuation<? super Unit> r7) {
        ScrollingLogic $this$drag_u24lambda_u240 = this.scrollingLogic;
        Object r2 = $this$drag_u24lambda_u240.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(r6, $this$drag_u24lambda_u240, null), r7);
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r2;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M */
    public void mo394onDragStartedk4lQ0M(long startedPosition) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStopped-TH1AsA0 */
    public void mo395onDragStoppedTH1AsA0(long velocity) {
        BuildersKt.launch$default(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(this, velocity, null), 3, null);
    }

    /* JADX INFO: renamed from: onWheelScrollStopped-TH1AsA0, reason: not valid java name */
    private final void m498onWheelScrollStoppedTH1AsA0(long velocity) {
        BuildersKt.launch$default(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    private final void ensureMouseWheelScrollNodeInitialized() {
        if (this.mouseWheelScrollingLogic != null) goto L5;
        this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.platformScrollConfig(this), new C02621(this), DelegatableNodeKt.requireDensity(this));
    L5:
        MouseWheelScrollingLogic r0 = this.mouseWheelScrollingLogic;
        if (r0 == null) goto L9;
        r0.startReceivingMouseWheelEvents(getCoroutineScope());
        return;
    }

    private static final /* synthetic */ Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped(ScrollableNode $this$ensureMouseWheelScrollNodeInitialized_u24onWheelScrollStopped, long p0, Continuation $completion) {
        $this$ensureMouseWheelScrollNodeInitialized_u24onWheelScrollStopped.m498onWheelScrollStoppedTH1AsA0(p0);
        return Unit.INSTANCE;
    }

    public final void update(ScrollableState state, Orientation orientation, OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec) {
        if (getEnabled() == enabled) goto L5;
        this.nestedScrollConnection.setEnabled(enabled);
        this.scrollableContainerNode.update(enabled);
        boolean shouldInvalidateSemantics = true;
    L6:
        if (flingBehavior != null) goto L8;
        DefaultFlingBehavior r0 = this.defaultFlingBehavior;
    L9:
        FlingBehavior resolvedFlingBehavior = r0;
        boolean resetPointerInputHandling = this.scrollingLogic.update(state, orientation, overscrollEffect, reverseDirection, resolvedFlingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        Function1<? super PointerInputChange, Boolean> r1 = ScrollableKt.access$getCanDragCalculation$p();
        if (this.scrollingLogic.isVertical() == false) goto L12;
        Orientation r2 = Orientation.Vertical;
    L13:
        update(r1, enabled, interactionSource, r2, resetPointerInputHandling);
        if (shouldInvalidateSemantics == false) goto L17;
        clearScrollSemanticsActions();
        SemanticsModifierNodeKt.invalidateSemantics(this);
        return;
    L17:
        return;
    L12:
        r2 = Orientation.Horizontal;
        goto L13
    L8:
        r0 = flingBehavior;
        goto L9
    L5:
        shouldInvalidateSemantics = false;
        goto L6
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic r0 = this.mouseWheelScrollingLogic;
        if (r0 == null) goto L6;
        r0.updateDensity(DelegatableNodeKt.requireDensity(this));
        return;
    }

    private final void updateDefaultFlingBehavior() {
        if (isAttached() == true) goto L5;
        return;
    L5:
        Density density = DelegatableNodeKt.requireDensity(this);
        this.defaultFlingBehavior.updateDensity(density);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        updateDefaultFlingBehavior();
        MouseWheelScrollingLogic r0 = this.mouseWheelScrollingLogic;
        if (r0 == null) goto L6;
        r0.updateDensity(DelegatableNodeKt.requireDensity(this));
        return;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public boolean mo203onKeyEventZmokQxo(KeyEvent event) {
        if (getEnabled() == true) goto L5;
    L25:
        return false;
    L5:
        if (Key.m5137equalsimpl0(KeyEvent_androidKt.m5445getKeyZmokQxo(event), Key.Companion.m5325getPageDownEK5gGoQ()) == true) goto L9;
        if (Key.m5137equalsimpl0(KeyEvent_androidKt.m5445getKeyZmokQxo(event), Key.Companion.m5326getPageUpEK5gGoQ()) == false) goto L25;
    L9:
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo(event), KeyEventType.Companion.m5442getKeyDownCS__XNY()) == false) goto L25;
        if (KeyEvent_androidKt.m5449isCtrlPressedZmokQxo(event) == true) goto L25;
        boolean r0 = this.scrollingLogic.isVertical();
        ContentInViewNode r1 = this.contentInViewNode;
        if (r0 == false) goto L19;
        long arg0$iv = r1.m409getViewportSizeYbymL2g$foundation_release();
        int viewportHeight = (int) (arg0$iv & 4294967295L);
        if (Key.m5137equalsimpl0(KeyEvent_androidKt.m5445getKeyZmokQxo(event), Key.Companion.m5326getPageUpEK5gGoQ()) == false) goto L17;
        float yAmount = viewportHeight;
    L18:
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(yAmount);
        long scrollAmount = Offset.m4117constructorimpl((4294967295L & v2$iv$iv) | (v1$iv$iv << 32));
    L24:
        BuildersKt.launch$default(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, scrollAmount, null), 3, null);
        return true;
    L17:
        yAmount = -viewportHeight;
        goto L18
    L19:
        long arg0$iv2 = r1.m409getViewportSizeYbymL2g$foundation_release();
        int viewportWidth = (int) (arg0$iv2 >> 32);
        if (Key.m5137equalsimpl0(KeyEvent_androidKt.m5445getKeyZmokQxo(event), Key.Companion.m5326getPageUpEK5gGoQ()) == false) goto L22;
        float xAmount = viewportWidth;
    L23:
        long v1$iv$iv2 = Float.floatToRawIntBits(xAmount);
        long v2$iv$iv2 = Float.floatToRawIntBits(0.0f);
        scrollAmount = Offset.m4117constructorimpl((4294967295L & v2$iv$iv2) | (v1$iv$iv2 << 32));
        goto L24
    L22:
        xAmount = -viewportWidth;
        goto L23
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo205onPreKeyEventZmokQxo(KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        List<PointerInputChange> r0 = pointerEvent.getChanges();
        int index$iv$iv = 0;
        int r5 = r0.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = r0.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (getCanDrag().invoke(it).booleanValue() == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        boolean r6 = true;
    L9:
        if (r6 == false) goto L12;
        super.mo204onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    L12:
        if (getEnabled() == false) goto L23;
        if (pass == PointerEventPass.Initial) goto L16;
    L18:
        MouseWheelScrollingLogic r1 = this.mouseWheelScrollingLogic;
        if (r1 == null) goto L27;
        r1.m461onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        return;
    L27:
        return;
    L16:
        if (PointerEventType.m5538equalsimpl0(pointerEvent.m5531getType7fucELk(), PointerEventType.Companion.m5547getScroll7fucELk()) == false) goto L18;
        ensureMouseWheelScrollNodeInitialized();
        goto L18
    L23:
        return;
    L8:
        r6 = false;
        goto L9
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        if (getEnabled() == true) goto L5;
    L9:
        Function2<? super Float, ? super Float, Boolean> r0 = this.scrollByAction;
        if (r0 == null) goto L12;
        SemanticsPropertiesKt.scrollBy$default($this$applySemantics, null, r0, 1, null);
    L12:
        Function2<? super Offset, ? super Continuation<? super Offset>, ? extends Object> r1 = this.scrollByOffsetAction;
        if (r1 == null) goto L16;
        SemanticsPropertiesKt.scrollByOffset($this$applySemantics, r1);
        return;
    L16:
        return;
    L5:
        if (this.scrollByAction != null) goto L7;
    L8:
        setScrollSemanticsActions();
        goto L9
    L7:
        if (this.scrollByOffsetAction != null) goto L9;
        goto L8
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new C02631(this);
        this.scrollByOffsetAction = new AnonymousClass2(this, null);
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }
}
